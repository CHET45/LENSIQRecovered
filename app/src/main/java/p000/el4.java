package p000;

import android.os.SystemClock;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class el4 {

    /* JADX INFO: renamed from: j */
    public static final String f33322j = "DownloadDispatcher";

    /* JADX INFO: renamed from: a */
    @SuppressFBWarnings(justification = "Not so urgency", value = {"IS"})
    public int f33323a;

    /* JADX INFO: renamed from: b */
    public final List<xk4> f33324b;

    /* JADX INFO: renamed from: c */
    public final List<xk4> f33325c;

    /* JADX INFO: renamed from: d */
    public final List<xk4> f33326d;

    /* JADX INFO: renamed from: e */
    public final List<xk4> f33327e;

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f33328f;

    /* JADX INFO: renamed from: g */
    @hib
    public volatile ExecutorService f33329g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f33330h;

    /* JADX INFO: renamed from: i */
    @SuppressFBWarnings(justification = "Not so urgency", value = {"IS"})
    public an4 f33331i;

    public el4() {
        this(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
    }

    private synchronized void cancelLocked(mr7[] mr7VarArr) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        q0i.m19913d(f33322j, "start cancel bunch task manually: " + mr7VarArr.length);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            for (mr7 mr7Var : mr7VarArr) {
                filterCanceledCalls(mr7Var, arrayList, arrayList2);
            }
        } finally {
            handleCanceledCalls(arrayList, arrayList2);
            q0i.m19913d(f33322j, "finish cancel bunch task manually: " + mr7VarArr.length + " consume " + (SystemClock.uptimeMillis() - jUptimeMillis) + "ms");
        }
    }

    private synchronized void enqueueIgnorePriority(cn4 cn4Var) {
        try {
            xk4 xk4VarCreate = xk4.create(cn4Var, true, this.f33331i);
            if (runningAsyncSize() < this.f33323a) {
                this.f33325c.add(xk4VarCreate);
                m10101b().execute(xk4VarCreate);
            } else {
                this.f33324b.add(xk4VarCreate);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void enqueueLocked(cn4[] cn4VarArr) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            q0i.m19913d(f33322j, "start enqueueLocked for bunch task: " + cn4VarArr.length);
            ArrayList<cn4> arrayList = new ArrayList();
            Collections.addAll(arrayList, cn4VarArr);
            if (arrayList.size() > 1) {
                Collections.sort(arrayList);
            }
            int size = this.f33324b.size();
            try {
                e0c.with().downloadStrategy().inspectNetworkAvailable();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (cn4 cn4Var : arrayList) {
                    if (!m10103d(cn4Var, arrayList2) && !inspectForConflict(cn4Var, arrayList3, arrayList4)) {
                        enqueueIgnorePriority(cn4Var);
                    }
                }
                e0c.with().callbackDispatcher().endTasks(arrayList2, arrayList3, arrayList4);
            } catch (UnknownHostException e) {
                e0c.with().callbackDispatcher().endTasksWithError(new ArrayList(arrayList), e);
            }
            if (size != this.f33324b.size()) {
                Collections.sort(this.f33324b);
            }
            q0i.m19913d(f33322j, "end enqueueLocked for bunch task: " + cn4VarArr.length + " consume " + (SystemClock.uptimeMillis() - jUptimeMillis) + "ms");
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void filterCanceledCalls(@efb mr7 mr7Var, @efb List<xk4> list, @efb List<xk4> list2) {
        try {
            Iterator<xk4> it = this.f33324b.iterator();
            while (it.hasNext()) {
                xk4 next = it.next();
                cn4 cn4Var = next.f98261b;
                if (cn4Var != mr7Var && cn4Var.getId() != mr7Var.getId()) {
                }
                if (!next.isCanceled() && !next.isFinishing()) {
                    it.remove();
                    list.add(next);
                    return;
                }
                return;
            }
            for (xk4 xk4Var : this.f33325c) {
                cn4 cn4Var2 = xk4Var.f98261b;
                if (cn4Var2 == mr7Var || cn4Var2.getId() == mr7Var.getId()) {
                    list.add(xk4Var);
                    list2.add(xk4Var);
                    return;
                }
            }
            for (xk4 xk4Var2 : this.f33326d) {
                cn4 cn4Var3 = xk4Var2.f98261b;
                if (cn4Var3 == mr7Var || cn4Var3.getId() == mr7Var.getId()) {
                    list.add(xk4Var2);
                    list2.add(xk4Var2);
                    return;
                }
            }
        } finally {
        }
    }

    private synchronized void handleCanceledCalls(@efb List<xk4> list, @efb List<xk4> list2) {
        try {
            q0i.m19913d(f33322j, "handle cancel calls, cancel calls: " + list2.size());
            if (!list2.isEmpty()) {
                for (xk4 xk4Var : list2) {
                    if (!xk4Var.cancel()) {
                        list.remove(xk4Var);
                    }
                }
            }
            q0i.m19913d(f33322j, "handle cancel calls, callback cancel event: " + list.size());
            if (!list.isEmpty()) {
                if (list.size() <= 1) {
                    e0c.with().callbackDispatcher().dispatch().taskEnd(list.get(0).f98261b, x15.CANCELED, null);
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator<xk4> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().f98261b);
                    }
                    e0c.with().callbackDispatcher().endTasksWithCanceled(arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean inspectForConflict(@efb cn4 cn4Var) {
        return inspectForConflict(cn4Var, null, null);
    }

    private synchronized void processCalls() {
        try {
            if (this.f33330h.get() > 0) {
                return;
            }
            if (runningAsyncSize() >= this.f33323a) {
                return;
            }
            if (this.f33324b.isEmpty()) {
                return;
            }
            Iterator<xk4> it = this.f33324b.iterator();
            while (it.hasNext()) {
                xk4 next = it.next();
                it.remove();
                cn4 cn4Var = next.f98261b;
                if (isFileConflictAfterRun(cn4Var)) {
                    e0c.with().callbackDispatcher().dispatch().taskEnd(cn4Var, x15.FILE_BUSY, null);
                } else {
                    this.f33325c.add(next);
                    m10101b().execute(next);
                    if (runningAsyncSize() >= this.f33323a) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private int runningAsyncSize() {
        return this.f33325c.size() - this.f33328f.get();
    }

    public static void setMaxParallelRunningCount(int i) {
        el4 el4VarDownloadDispatcher = e0c.with().downloadDispatcher();
        if (el4VarDownloadDispatcher.getClass() == el4.class) {
            el4VarDownloadDispatcher.f33323a = Math.max(1, i);
            return;
        }
        throw new IllegalStateException("The current dispatcher is " + el4VarDownloadDispatcher + " not DownloadDispatcher exactly!");
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m10100a(mr7 mr7Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        q0i.m19913d(f33322j, "cancel manually: " + mr7Var.getId());
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        try {
            filterCanceledCalls(mr7Var, arrayList, arrayList2);
            handleCanceledCalls(arrayList, arrayList2);
        } catch (Throwable th) {
            handleCanceledCalls(arrayList, arrayList2);
            throw th;
        }
        return arrayList.size() > 0 || arrayList2.size() > 0;
    }

    /* JADX INFO: renamed from: b */
    public synchronized ExecutorService m10101b() {
        try {
            if (this.f33329g == null) {
                this.f33329g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), q0i.threadFactory("OkDownload Download", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f33329g;
    }

    /* JADX INFO: renamed from: c */
    public boolean m10102c(@efb cn4 cn4Var) {
        return m10103d(cn4Var, null);
    }

    public void cancel(mr7[] mr7VarArr) {
        this.f33330h.incrementAndGet();
        cancelLocked(mr7VarArr);
        this.f33330h.decrementAndGet();
        processCalls();
    }

    public void cancelAll() {
        this.f33330h.incrementAndGet();
        ArrayList arrayList = new ArrayList();
        Iterator<xk4> it = this.f33324b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f98261b);
        }
        Iterator<xk4> it2 = this.f33325c.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().f98261b);
        }
        Iterator<xk4> it3 = this.f33326d.iterator();
        while (it3.hasNext()) {
            arrayList.add(it3.next().f98261b);
        }
        if (!arrayList.isEmpty()) {
            cancelLocked((mr7[]) arrayList.toArray(new cn4[arrayList.size()]));
        }
        this.f33330h.decrementAndGet();
    }

    /* JADX INFO: renamed from: d */
    public boolean m10103d(@efb cn4 cn4Var, @hib Collection<cn4> collection) {
        if (!cn4Var.isPassIfAlreadyCompleted() || !w4g.isCompleted(cn4Var)) {
            return false;
        }
        if (cn4Var.getFilename() == null && !e0c.with().downloadStrategy().validFilenameFromStore(cn4Var)) {
            return false;
        }
        e0c.with().downloadStrategy().validInfoOnCompleted(cn4Var, this.f33331i);
        if (collection != null) {
            collection.add(cn4Var);
            return true;
        }
        e0c.with().callbackDispatcher().dispatch().taskEnd(cn4Var, x15.COMPLETED, null);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m10104e(@efb cn4 cn4Var, @efb Collection<xk4> collection, @hib Collection<cn4> collection2, @hib Collection<cn4> collection3) {
        go1 go1VarCallbackDispatcher = e0c.with().callbackDispatcher();
        Iterator<xk4> it = collection.iterator();
        while (it.hasNext()) {
            xk4 next = it.next();
            if (!next.isCanceled()) {
                if (next.equalsTask(cn4Var)) {
                    if (!next.isFinishing()) {
                        if (collection2 != null) {
                            collection2.add(cn4Var);
                        } else {
                            go1VarCallbackDispatcher.dispatch().taskEnd(cn4Var, x15.SAME_TASK_BUSY, null);
                        }
                        return true;
                    }
                    q0i.m19913d(f33322j, "task: " + cn4Var.getId() + " is finishing, move it to finishing list");
                    this.f33327e.add(next);
                    it.remove();
                    return false;
                }
                File file = next.getFile();
                File file2 = cn4Var.getFile();
                if (file != null && file2 != null && file.equals(file2)) {
                    if (collection3 != null) {
                        collection3.add(cn4Var);
                    } else {
                        go1VarCallbackDispatcher.dispatch().taskEnd(cn4Var, x15.FILE_BUSY, null);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void enqueue(cn4[] cn4VarArr) {
        this.f33330h.incrementAndGet();
        enqueueLocked(cn4VarArr);
        this.f33330h.decrementAndGet();
    }

    public void execute(cn4 cn4Var) {
        q0i.m19913d(f33322j, "execute: " + cn4Var);
        synchronized (this) {
            try {
                if (m10102c(cn4Var)) {
                    return;
                }
                if (inspectForConflict(cn4Var)) {
                    return;
                }
                xk4 xk4VarCreate = xk4.create(cn4Var, false, this.f33331i);
                this.f33326d.add(xk4VarCreate);
                m10105f(xk4VarCreate);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m10105f(xk4 xk4Var) {
        xk4Var.run();
    }

    @hib
    public synchronized cn4 findSameTask(cn4 cn4Var) {
        q0i.m19913d(f33322j, "findSameTask: " + cn4Var.getId());
        for (xk4 xk4Var : this.f33324b) {
            if (!xk4Var.isCanceled() && xk4Var.equalsTask(cn4Var)) {
                return xk4Var.f98261b;
            }
        }
        for (xk4 xk4Var2 : this.f33325c) {
            if (!xk4Var2.isCanceled() && xk4Var2.equalsTask(cn4Var)) {
                return xk4Var2.f98261b;
            }
        }
        for (xk4 xk4Var3 : this.f33326d) {
            if (!xk4Var3.isCanceled() && xk4Var3.equalsTask(cn4Var)) {
                return xk4Var3.f98261b;
            }
        }
        return null;
    }

    public synchronized void finish(xk4 xk4Var) {
        try {
            boolean z = xk4Var.f98262c;
            if (!(this.f33327e.contains(xk4Var) ? this.f33327e : z ? this.f33325c : this.f33326d).remove(xk4Var)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            if (z && xk4Var.isCanceled()) {
                this.f33328f.decrementAndGet();
            }
            if (z) {
                processCalls();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void flyingCanceled(xk4 xk4Var) {
        q0i.m19913d(f33322j, "flying canceled: " + xk4Var.f98261b.getId());
        if (xk4Var.f98262c) {
            this.f33328f.incrementAndGet();
        }
    }

    public synchronized boolean isFileConflictAfterRun(@efb cn4 cn4Var) {
        cn4 cn4Var2;
        File file;
        cn4 cn4Var3;
        File file2;
        q0i.m19913d(f33322j, "is file conflict after run: " + cn4Var.getId());
        File file3 = cn4Var.getFile();
        if (file3 == null) {
            return false;
        }
        for (xk4 xk4Var : this.f33326d) {
            if (!xk4Var.isCanceled() && (cn4Var3 = xk4Var.f98261b) != cn4Var && (file2 = cn4Var3.getFile()) != null && file3.equals(file2)) {
                return true;
            }
        }
        for (xk4 xk4Var2 : this.f33325c) {
            if (!xk4Var2.isCanceled() && (cn4Var2 = xk4Var2.f98261b) != cn4Var && (file = cn4Var2.getFile()) != null && file3.equals(file)) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean isPending(cn4 cn4Var) {
        q0i.m19913d(f33322j, "isPending: " + cn4Var.getId());
        for (xk4 xk4Var : this.f33324b) {
            if (!xk4Var.isCanceled() && xk4Var.equalsTask(cn4Var)) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean isRunning(cn4 cn4Var) {
        q0i.m19913d(f33322j, "isRunning: " + cn4Var.getId());
        for (xk4 xk4Var : this.f33326d) {
            if (!xk4Var.isCanceled() && xk4Var.equalsTask(cn4Var)) {
                return true;
            }
        }
        for (xk4 xk4Var2 : this.f33325c) {
            if (!xk4Var2.isCanceled() && xk4Var2.equalsTask(cn4Var)) {
                return true;
            }
        }
        return false;
    }

    public void setDownloadStore(@efb an4 an4Var) {
        this.f33331i = an4Var;
    }

    public el4(List<xk4> list, List<xk4> list2, List<xk4> list3, List<xk4> list4) {
        this.f33323a = 5;
        this.f33328f = new AtomicInteger();
        this.f33330h = new AtomicInteger();
        this.f33324b = list;
        this.f33325c = list2;
        this.f33326d = list3;
        this.f33327e = list4;
    }

    private boolean inspectForConflict(@efb cn4 cn4Var, @hib Collection<cn4> collection, @hib Collection<cn4> collection2) {
        return m10104e(cn4Var, this.f33324b, collection, collection2) || m10104e(cn4Var, this.f33325c, collection, collection2) || m10104e(cn4Var, this.f33326d, collection, collection2);
    }

    public void enqueue(cn4 cn4Var) {
        this.f33330h.incrementAndGet();
        enqueueLocked(cn4Var);
        this.f33330h.decrementAndGet();
    }

    public boolean cancel(mr7 mr7Var) {
        this.f33330h.incrementAndGet();
        boolean zM10100a = m10100a(mr7Var);
        this.f33330h.decrementAndGet();
        processCalls();
        return zM10100a;
    }

    public boolean cancel(int i) {
        this.f33330h.incrementAndGet();
        boolean zM10100a = m10100a(cn4.mockTaskForCompare(i));
        this.f33330h.decrementAndGet();
        processCalls();
        return zM10100a;
    }

    private synchronized void enqueueLocked(cn4 cn4Var) {
        q0i.m19913d(f33322j, "enqueueLocked for single task: " + cn4Var);
        if (m10102c(cn4Var)) {
            return;
        }
        if (inspectForConflict(cn4Var)) {
            return;
        }
        int size = this.f33324b.size();
        enqueueIgnorePriority(cn4Var);
        if (size != this.f33324b.size()) {
            Collections.sort(this.f33324b);
        }
    }
}
