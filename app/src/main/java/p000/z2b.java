package p000;

import android.net.Uri;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.SparseArray;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes6.dex */
public class z2b {

    /* JADX INFO: renamed from: y */
    public static final String f103844y = "MultiPointOutputStream";

    /* JADX INFO: renamed from: z */
    public static final ExecutorService f103845z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), q0i.threadFactory("OkDownload file io", false));

    /* JADX INFO: renamed from: a */
    public final SparseArray<qm4> f103846a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<AtomicLong> f103847b;

    /* JADX INFO: renamed from: c */
    public final AtomicLong f103848c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f103849d;

    /* JADX INFO: renamed from: e */
    public boolean f103850e;

    /* JADX INFO: renamed from: f */
    public final int f103851f;

    /* JADX INFO: renamed from: g */
    public final int f103852g;

    /* JADX INFO: renamed from: h */
    public final int f103853h;

    /* JADX INFO: renamed from: i */
    public final bd1 f103854i;

    /* JADX INFO: renamed from: j */
    public final cn4 f103855j;

    /* JADX INFO: renamed from: k */
    public final an4 f103856k;

    /* JADX INFO: renamed from: l */
    public final boolean f103857l;

    /* JADX INFO: renamed from: m */
    public final boolean f103858m;

    /* JADX INFO: renamed from: n */
    public volatile Future f103859n;

    /* JADX INFO: renamed from: o */
    public volatile Thread f103860o;

    /* JADX INFO: renamed from: p */
    public final SparseArray<Thread> f103861p;

    /* JADX INFO: renamed from: q */
    @efb
    public final Runnable f103862q;

    /* JADX INFO: renamed from: r */
    public String f103863r;

    /* JADX INFO: renamed from: s */
    public IOException f103864s;

    /* JADX INFO: renamed from: t */
    @efb
    public ArrayList<Integer> f103865t;

    /* JADX INFO: renamed from: u */
    @SuppressFBWarnings({"IS2_INCONSISTENT_SYNC"})
    public List<Integer> f103866u;

    /* JADX INFO: renamed from: v */
    public final C15955c f103867v;

    /* JADX INFO: renamed from: w */
    public C15955c f103868w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f103869x;

    /* JADX INFO: renamed from: z2b$a */
    public class RunnableC15953a implements Runnable {
        public RunnableC15953a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z2b.this.m26523p();
        }
    }

    /* JADX INFO: renamed from: z2b$b */
    public class RunnableC15954b implements Runnable {
        public RunnableC15954b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z2b.this.cancel();
        }
    }

    /* JADX INFO: renamed from: z2b$c */
    public static class C15955c {

        /* JADX INFO: renamed from: a */
        public boolean f103872a;

        /* JADX INFO: renamed from: b */
        public List<Integer> f103873b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public List<Integer> f103874c = new ArrayList();

        /* JADX INFO: renamed from: a */
        public boolean m26525a() {
            return this.f103872a || this.f103874c.size() > 0;
        }
    }

    public z2b(@efb cn4 cn4Var, @efb bd1 bd1Var, @efb an4 an4Var, @hib Runnable runnable) {
        this.f103846a = new SparseArray<>();
        this.f103847b = new SparseArray<>();
        this.f103848c = new AtomicLong();
        this.f103849d = new AtomicLong();
        this.f103850e = false;
        this.f103861p = new SparseArray<>();
        this.f103867v = new C15955c();
        this.f103868w = new C15955c();
        this.f103869x = true;
        this.f103855j = cn4Var;
        this.f103851f = cn4Var.getFlushBufferSize();
        this.f103852g = cn4Var.getSyncBufferSize();
        this.f103853h = cn4Var.getSyncBufferIntervalMills();
        this.f103854i = bd1Var;
        this.f103856k = an4Var;
        this.f103857l = e0c.with().outputStreamFactory().supportSeek();
        this.f103858m = e0c.with().processFileStrategy().isPreAllocateLength(cn4Var);
        this.f103865t = new ArrayList<>();
        if (runnable == null) {
            this.f103862q = new RunnableC15953a();
        } else {
            this.f103862q = runnable;
        }
        File file = cn4Var.getFile();
        if (file != null) {
            this.f103863r = file.getAbsolutePath();
        }
    }

    private void inspectValidPath() {
        if (this.f103863r != null || this.f103855j.getFile() == null) {
            return;
        }
        this.f103863r = this.f103855j.getFile().getAbsolutePath();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m26508a(int i) throws IOException {
        qm4 qm4Var = this.f103846a.get(i);
        if (qm4Var != null) {
            qm4Var.close();
            this.f103846a.remove(i);
            q0i.m19913d(f103844y, "OutputStream close task[" + this.f103855j.getId() + "] block[" + i + "]");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m26509b(boolean z, int i) {
        if (this.f103859n == null || this.f103859n.isDone()) {
            return;
        }
        if (!z) {
            this.f103861p.put(i, Thread.currentThread());
        }
        if (this.f103860o != null) {
            m26524q(this.f103860o);
        } else {
            while (!m26517j()) {
                m26521n(25L);
            }
            m26524q(this.f103860o);
        }
        if (!z) {
            m26520m();
            return;
        }
        m26524q(this.f103860o);
        try {
            this.f103859n.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public Future m26510c() {
        return f103845z.submit(this.f103862q);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #5 {, blocks: (B:3:0x0001, B:7:0x0007, B:12:0x000e, B:17:0x0022, B:18:0x0028, B:20:0x002e, B:21:0x0034, B:26:0x0040, B:27:0x006d, B:43:0x00c7, B:44:0x00cd, B:46:0x00d3, B:47:0x00d9, B:50:0x00e2, B:51:0x010f, B:54:0x011e, B:55:0x0124, B:57:0x012a, B:58:0x0130, B:61:0x0139, B:62:0x0166, B:63:0x0173, B:14:0x0016, B:30:0x007c, B:32:0x0080, B:34:0x0088, B:37:0x00a0, B:41:0x00b5, B:42:0x00c6, B:36:0x009d), top: B:75:0x0001, inners: #0, #1, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void cancel() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z2b.cancel():void");
    }

    public void cancelAsync() {
        f103845z.execute(new RunnableC15954b());
    }

    public void catchBlockConnectException(int i) {
        this.f103865t.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: d */
    public void m26511d() throws IOException {
        int size;
        long j;
        synchronized (this.f103847b) {
            size = this.f103847b.size();
        }
        SparseArray sparseArray = new SparseArray(size);
        int i = 0;
        while (true) {
            j = 0;
            if (i >= size) {
                break;
            }
            try {
                int iKeyAt = this.f103846a.keyAt(i);
                long j2 = this.f103847b.get(iKeyAt).get();
                if (j2 > 0) {
                    sparseArray.put(iKeyAt, Long.valueOf(j2));
                    this.f103846a.get(iKeyAt).flushAndSync();
                }
                i++;
            } catch (IOException e) {
                q0i.m19916w(f103844y, "OutputStream flush and sync data to filesystem failed " + e);
                return;
            }
        }
        int size2 = sparseArray.size();
        for (int i2 = 0; i2 < size2; i2++) {
            int iKeyAt2 = sparseArray.keyAt(i2);
            long jLongValue = ((Long) sparseArray.valueAt(i2)).longValue();
            this.f103856k.onSyncToFilesystemSuccess(this.f103854i, iKeyAt2, jLongValue);
            j += jLongValue;
            this.f103847b.get(iKeyAt2).addAndGet(-jLongValue);
            q0i.m19913d(f103844y, "OutputStream sync success (" + this.f103855j.getId() + ") block(" + iKeyAt2 + ")  syncLength(" + jLongValue + ") currentOffset(" + this.f103854i.getBlock(iKeyAt2).getCurrentOffset() + c0b.f15434d);
        }
        this.f103848c.addAndGet(-j);
        this.f103849d.set(SystemClock.uptimeMillis());
    }

    public void done(int i) throws IOException {
        this.f103865t.add(Integer.valueOf(i));
        try {
            IOException iOException = this.f103864s;
            if (iOException != null) {
                throw iOException;
            }
            if (this.f103859n != null && !this.f103859n.isDone()) {
                AtomicLong atomicLong = this.f103847b.get(i);
                if (atomicLong != null && atomicLong.get() > 0) {
                    m26515h(this.f103867v);
                    m26509b(this.f103867v.f103872a, i);
                }
            } else if (this.f103859n == null) {
                q0i.m19913d(f103844y, "OutputStream done but no need to ensure sync, because the sync job not run yet. task[" + this.f103855j.getId() + "] block[" + i + "]");
            } else {
                q0i.m19913d(f103844y, "OutputStream done but no need to ensure sync, because the syncFuture.isDone[" + this.f103859n.isDone() + "] task[" + this.f103855j.getId() + "] block[" + i + "]");
            }
            m26508a(i);
        } catch (Throwable th) {
            m26508a(i);
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public long m26512e() {
        return ((long) this.f103853h) - (m26518k() - this.f103849d.get());
    }

    /* JADX INFO: renamed from: f */
    public void m26513f() throws IOException {
        IOException iOException = this.f103864s;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f103859n == null) {
            synchronized (this.f103862q) {
                try {
                    if (this.f103859n == null) {
                        this.f103859n = m26510c();
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m26514g(StatFs statFs, long j) throws a6d {
        long freeSpaceBytes = q0i.getFreeSpaceBytes(statFs);
        if (freeSpaceBytes < j) {
            throw new a6d(j, freeSpaceBytes);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m26515h(C15955c c15955c) {
        c15955c.f103874c.clear();
        int size = new HashSet((List) this.f103865t.clone()).size();
        if (size != this.f103866u.size()) {
            q0i.m19913d(f103844y, "task[" + this.f103855j.getId() + "] current need fetching block count " + this.f103866u.size() + " is not equal to no more stream block count " + size);
            c15955c.f103872a = false;
        } else {
            q0i.m19913d(f103844y, "task[" + this.f103855j.getId() + "] current need fetching block count " + this.f103866u.size() + " is equal to no more stream block count " + size);
            c15955c.f103872a = true;
        }
        SparseArray<qm4> sparseArrayClone = this.f103846a.clone();
        int size2 = sparseArrayClone.size();
        for (int i = 0; i < size2; i++) {
            int iKeyAt = sparseArrayClone.keyAt(i);
            if (this.f103865t.contains(Integer.valueOf(iKeyAt)) && !c15955c.f103873b.contains(Integer.valueOf(iKeyAt))) {
                c15955c.f103873b.add(Integer.valueOf(iKeyAt));
                c15955c.f103874c.add(Integer.valueOf(iKeyAt));
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m26516i() {
        return this.f103848c.get() < ((long) this.f103852g);
    }

    public void inspectComplete(int i) throws IOException {
        h61 block = this.f103854i.getBlock(i);
        if (q0i.isCorrectFull(block.getCurrentOffset(), block.getContentLength())) {
            return;
        }
        throw new IOException("The current offset on block-info isn't update correct, " + block.getCurrentOffset() + " != " + block.getContentLength() + " on " + i);
    }

    /* JADX INFO: renamed from: j */
    public boolean m26517j() {
        return this.f103860o != null;
    }

    /* JADX INFO: renamed from: k */
    public long m26518k() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: l */
    public synchronized qm4 m26519l(int i) throws IOException {
        qm4 qm4Var;
        Uri uri;
        try {
            qm4Var = this.f103846a.get(i);
            if (qm4Var == null) {
                boolean zIsUriFileScheme = q0i.isUriFileScheme(this.f103855j.getUri());
                if (zIsUriFileScheme) {
                    File file = this.f103855j.getFile();
                    if (file == null) {
                        throw new FileNotFoundException("Filename is not ready!");
                    }
                    File parentFile = this.f103855j.getParentFile();
                    if (!parentFile.exists() && !parentFile.mkdirs()) {
                        throw new IOException("Create parent folder failed!");
                    }
                    if (file.createNewFile()) {
                        q0i.m19913d(f103844y, "Create new file: " + file.getName());
                    }
                    uri = Uri.fromFile(file);
                } else {
                    uri = this.f103855j.getUri();
                }
                qm4 qm4VarCreate = e0c.with().outputStreamFactory().create(e0c.with().context(), uri, this.f103851f);
                if (this.f103857l) {
                    long rangeLeft = this.f103854i.getBlock(i).getRangeLeft();
                    if (rangeLeft > 0) {
                        qm4VarCreate.seek(rangeLeft);
                        q0i.m19913d(f103844y, "Create output stream write from (" + this.f103855j.getId() + ") block(" + i + ") " + rangeLeft);
                    }
                }
                if (this.f103869x) {
                    this.f103856k.markFileDirty(this.f103855j.getId());
                }
                if (!this.f103854i.isChunked() && this.f103869x && this.f103858m) {
                    long totalLength = this.f103854i.getTotalLength();
                    if (zIsUriFileScheme) {
                        File file2 = this.f103855j.getFile();
                        long length = totalLength - file2.length();
                        if (length > 0) {
                            m26514g(new StatFs(file2.getAbsolutePath()), length);
                            qm4VarCreate.setLength(totalLength);
                        }
                    } else {
                        qm4VarCreate.setLength(totalLength);
                    }
                }
                synchronized (this.f103847b) {
                    this.f103846a.put(i, qm4VarCreate);
                    this.f103847b.put(i, new AtomicLong());
                }
                this.f103869x = false;
                qm4Var = qm4VarCreate;
            }
        } catch (Throwable th) {
            throw th;
        }
        return qm4Var;
    }

    /* JADX INFO: renamed from: m */
    public void m26520m() {
        LockSupport.park();
    }

    /* JADX INFO: renamed from: n */
    public void m26521n(long j) {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(j));
    }

    /* JADX INFO: renamed from: o */
    public void m26522o() throws IOException {
        int i;
        q0i.m19913d(f103844y, "OutputStream start flush looper task[" + this.f103855j.getId() + "] with syncBufferIntervalMills[" + this.f103853h + "] syncBufferSize[" + this.f103852g + "]");
        this.f103860o = Thread.currentThread();
        long jM26512e = (long) this.f103853h;
        m26511d();
        while (true) {
            m26521n(jM26512e);
            m26515h(this.f103868w);
            if (this.f103868w.m26525a()) {
                q0i.m19913d(f103844y, "runSync state change isNoMoreStream[" + this.f103868w.f103872a + "] newNoMoreStreamBlockList[" + this.f103868w.f103874c + "]");
                if (this.f103848c.get() > 0) {
                    m26511d();
                }
                for (Integer num : this.f103868w.f103874c) {
                    Thread thread = this.f103861p.get(num.intValue());
                    this.f103861p.remove(num.intValue());
                    if (thread != null) {
                        m26524q(thread);
                    }
                }
                if (this.f103868w.f103872a) {
                    break;
                }
            } else {
                if (m26516i()) {
                    i = this.f103853h;
                } else {
                    jM26512e = m26512e();
                    if (jM26512e <= 0) {
                        m26511d();
                        i = this.f103853h;
                    }
                }
                jM26512e = i;
            }
        }
        int size = this.f103861p.size();
        for (int i2 = 0; i2 < size; i2++) {
            Thread threadValueAt = this.f103861p.valueAt(i2);
            if (threadValueAt != null) {
                m26524q(threadValueAt);
            }
        }
        this.f103861p.clear();
        q0i.m19913d(f103844y, "OutputStream stop flush looper task[" + this.f103855j.getId() + "]");
    }

    /* JADX INFO: renamed from: p */
    public void m26523p() {
        try {
            m26522o();
        } catch (IOException e) {
            this.f103864s = e;
            q0i.m19916w(f103844y, "Sync to breakpoint-store for task[" + this.f103855j.getId() + "] failed with cause: " + e);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m26524q(Thread thread) {
        LockSupport.unpark(thread);
    }

    public void setRequireStreamBlocks(List<Integer> list) {
        this.f103866u = list;
    }

    public synchronized void write(int i, byte[] bArr, int i2) throws IOException {
        if (this.f103850e) {
            return;
        }
        m26519l(i).write(bArr, 0, i2);
        long j = i2;
        this.f103848c.addAndGet(j);
        this.f103847b.get(i).addAndGet(j);
        m26513f();
    }

    public z2b(@efb cn4 cn4Var, @efb bd1 bd1Var, @efb an4 an4Var) {
        this(cn4Var, bd1Var, an4Var, null);
    }
}
