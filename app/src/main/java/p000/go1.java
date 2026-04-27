package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.blankj.utilcode.util.C2473f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.cn4;

/* JADX INFO: loaded from: classes6.dex */
public class go1 {

    /* JADX INFO: renamed from: c */
    public static final String f40375c = "CallbackDispatcher";

    /* JADX INFO: renamed from: a */
    public final cm4 f40376a;

    /* JADX INFO: renamed from: b */
    public final Handler f40377b;

    /* JADX INFO: renamed from: go1$a */
    public class RunnableC6437a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection f40378a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Exception f40379b;

        public RunnableC6437a(Collection collection, Exception exc) {
            this.f40378a = collection;
            this.f40379b = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (cn4 cn4Var : this.f40378a) {
                cn4Var.getListener().taskEnd(cn4Var, x15.ERROR, this.f40379b);
            }
        }
    }

    /* JADX INFO: renamed from: go1$b */
    public class RunnableC6438b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection f40381a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Collection f40382b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Collection f40383c;

        public RunnableC6438b(Collection collection, Collection collection2, Collection collection3) {
            this.f40381a = collection;
            this.f40382b = collection2;
            this.f40383c = collection3;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (cn4 cn4Var : this.f40381a) {
                cn4Var.getListener().taskEnd(cn4Var, x15.COMPLETED, null);
            }
            for (cn4 cn4Var2 : this.f40382b) {
                cn4Var2.getListener().taskEnd(cn4Var2, x15.SAME_TASK_BUSY, null);
            }
            for (cn4 cn4Var3 : this.f40383c) {
                cn4Var3.getListener().taskEnd(cn4Var3, x15.FILE_BUSY, null);
            }
        }
    }

    /* JADX INFO: renamed from: go1$c */
    public class RunnableC6439c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection f40385a;

        public RunnableC6439c(Collection collection) {
            this.f40385a = collection;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (cn4 cn4Var : this.f40385a) {
                cn4Var.getListener().taskEnd(cn4Var, x15.CANCELED, null);
            }
        }
    }

    /* JADX INFO: renamed from: go1$d */
    public static class C6440d implements cm4 {

        /* JADX INFO: renamed from: a */
        @efb
        public final Handler f40387a;

        /* JADX INFO: renamed from: go1$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ cn4 f40388a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f40389b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f40390c;

            public a(cn4 cn4Var, int i, long j) {
                this.f40388a = cn4Var;
                this.f40389b = i;
                this.f40390c = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f40388a.getListener().fetchEnd(this.f40388a, this.f40389b, this.f40390c);
            }
        }

        /* JADX INFO: renamed from: go1$d$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ cn4 f40392a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ x15 f40393b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Exception f40394c;

            public b(cn4 cn4Var, x15 x15Var, Exception exc) {
                this.f40392a = cn4Var;
                this.f40393b = x15Var;
                this.f40394c = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f40392a.getListener().taskEnd(this.f40392a, this.f40393b, this.f40394c);
            }
        }

        /* JADX INFO: renamed from: go1$d$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ cn4 f40396a;

            public c(cn4 cn4Var) {
                this.f40396a = cn4Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f40396a.getListener().taskStart(this.f40396a);
            }
        }

        /* JADX INFO: renamed from: go1$d$d */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ cn4 f40398a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Map f40399b;

            public d(cn4 cn4Var, Map map) {
                this.f40398a = cn4Var;
                this.f40399b = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f40398a.getListener().connectTrialStart(this.f40398a, this.f40399b);
            }
        }

        /* JADX INFO: renamed from: go1$d$e */
        public class e implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ cn4 f40401a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f40402b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Map f40403c;

            public e(cn4 cn4Var, int i, Map map) {
                this.f40401a = cn4Var;
                this.f40402b = i;
                this.f40403c = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f40401a.getListener().connectTrialEnd(this.f40401a, this.f40402b, this.f40403c);
            }
        }

        /* JADX INFO: renamed from: go1$d$f */
        public class f implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ cn4 f40405a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ bd1 f40406b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ c8e f40407c;

            public f(cn4 cn4Var, bd1 bd1Var, c8e c8eVar) {
                this.f40405a = cn4Var;
                this.f40406b = bd1Var;
                this.f40407c = c8eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f40405a.getListener().downloadFromBeginning(this.f40405a, this.f40406b, this.f40407c);
            }
        }

        /* JADX INFO: renamed from: go1$d$g */
        public class g implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ cn4 f40409a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ bd1 f40410b;

            public g(cn4 cn4Var, bd1 bd1Var) {
                this.f40409a = cn4Var;
                this.f40410b = bd1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f40409a.getListener().downloadFromBreakpoint(this.f40409a, this.f40410b);
            }
        }

        /* JADX INFO: renamed from: go1$d$h */
        public class h implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ cn4 f40412a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f40413b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Map f40414c;

            public h(cn4 cn4Var, int i, Map map) {
                this.f40412a = cn4Var;
                this.f40413b = i;
                this.f40414c = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f40412a.getListener().connectStart(this.f40412a, this.f40413b, this.f40414c);
            }
        }

        /* JADX INFO: renamed from: go1$d$i */
        public class i implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ cn4 f40416a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f40417b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f40418c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Map f40419d;

            public i(cn4 cn4Var, int i, int i2, Map map) {
                this.f40416a = cn4Var;
                this.f40417b = i;
                this.f40418c = i2;
                this.f40419d = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f40416a.getListener().connectEnd(this.f40416a, this.f40417b, this.f40418c, this.f40419d);
            }
        }

        /* JADX INFO: renamed from: go1$d$j */
        public class j implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ cn4 f40421a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f40422b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f40423c;

            public j(cn4 cn4Var, int i, long j) {
                this.f40421a = cn4Var;
                this.f40422b = i;
                this.f40423c = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f40421a.getListener().fetchStart(this.f40421a, this.f40422b, this.f40423c);
            }
        }

        /* JADX INFO: renamed from: go1$d$k */
        public class k implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ cn4 f40425a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f40426b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f40427c;

            public k(cn4 cn4Var, int i, long j) {
                this.f40425a = cn4Var;
                this.f40426b = i;
                this.f40427c = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f40425a.getListener().fetchProgress(this.f40425a, this.f40426b, this.f40427c);
            }
        }

        public C6440d(@efb Handler handler) {
            this.f40387a = handler;
        }

        /* JADX INFO: renamed from: a */
        public void m11793a(@efb cn4 cn4Var, @efb bd1 bd1Var, @efb c8e c8eVar) {
            lm4 monitor = e0c.with().getMonitor();
            if (monitor != null) {
                monitor.taskDownloadFromBeginning(cn4Var, bd1Var, c8eVar);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m11794b(@efb cn4 cn4Var, @efb bd1 bd1Var) {
            lm4 monitor = e0c.with().getMonitor();
            if (monitor != null) {
                monitor.taskDownloadFromBreakpoint(cn4Var, bd1Var);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m11795c(cn4 cn4Var, x15 x15Var, @hib Exception exc) {
            lm4 monitor = e0c.with().getMonitor();
            if (monitor != null) {
                monitor.taskEnd(cn4Var, x15Var, exc);
            }
        }

        @Override // p000.cm4
        public void connectEnd(@efb cn4 cn4Var, int i2, int i3, @efb Map<String, List<String>> map) {
            q0i.m19913d(go1.f40375c, "<----- finish connection task(" + cn4Var.getId() + ") block(" + i2 + ") code[" + i3 + "]" + map);
            if (cn4Var.isAutoCallbackToUIThread()) {
                this.f40387a.post(new i(cn4Var, i2, i3, map));
            } else {
                cn4Var.getListener().connectEnd(cn4Var, i2, i3, map);
            }
        }

        @Override // p000.cm4
        public void connectStart(@efb cn4 cn4Var, int i2, @efb Map<String, List<String>> map) {
            q0i.m19913d(go1.f40375c, "-----> start connection task(" + cn4Var.getId() + ") block(" + i2 + ") " + map);
            if (cn4Var.isAutoCallbackToUIThread()) {
                this.f40387a.post(new h(cn4Var, i2, map));
            } else {
                cn4Var.getListener().connectStart(cn4Var, i2, map);
            }
        }

        @Override // p000.cm4
        public void connectTrialEnd(@efb cn4 cn4Var, int i2, @efb Map<String, List<String>> map) {
            q0i.m19913d(go1.f40375c, "<----- finish trial task(" + cn4Var.getId() + ") code[" + i2 + "]" + map);
            if (cn4Var.isAutoCallbackToUIThread()) {
                this.f40387a.post(new e(cn4Var, i2, map));
            } else {
                cn4Var.getListener().connectTrialEnd(cn4Var, i2, map);
            }
        }

        @Override // p000.cm4
        public void connectTrialStart(@efb cn4 cn4Var, @efb Map<String, List<String>> map) {
            q0i.m19913d(go1.f40375c, "-----> start trial task(" + cn4Var.getId() + ") " + map);
            if (cn4Var.isAutoCallbackToUIThread()) {
                this.f40387a.post(new d(cn4Var, map));
            } else {
                cn4Var.getListener().connectTrialStart(cn4Var, map);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m11796d(cn4 cn4Var) {
            lm4 monitor = e0c.with().getMonitor();
            if (monitor != null) {
                monitor.taskStart(cn4Var);
            }
        }

        @Override // p000.cm4
        public void downloadFromBeginning(@efb cn4 cn4Var, @efb bd1 bd1Var, @efb c8e c8eVar) {
            q0i.m19913d(go1.f40375c, "downloadFromBeginning: " + cn4Var.getId());
            m11793a(cn4Var, bd1Var, c8eVar);
            if (cn4Var.isAutoCallbackToUIThread()) {
                this.f40387a.post(new f(cn4Var, bd1Var, c8eVar));
            } else {
                cn4Var.getListener().downloadFromBeginning(cn4Var, bd1Var, c8eVar);
            }
        }

        @Override // p000.cm4
        public void downloadFromBreakpoint(@efb cn4 cn4Var, @efb bd1 bd1Var) {
            q0i.m19913d(go1.f40375c, "downloadFromBreakpoint: " + cn4Var.getId());
            m11794b(cn4Var, bd1Var);
            if (cn4Var.isAutoCallbackToUIThread()) {
                this.f40387a.post(new g(cn4Var, bd1Var));
            } else {
                cn4Var.getListener().downloadFromBreakpoint(cn4Var, bd1Var);
            }
        }

        @Override // p000.cm4
        public void fetchEnd(@efb cn4 cn4Var, int i2, long j2) {
            q0i.m19913d(go1.f40375c, "fetchEnd: " + cn4Var.getId());
            if (cn4Var.isAutoCallbackToUIThread()) {
                this.f40387a.post(new a(cn4Var, i2, j2));
            } else {
                cn4Var.getListener().fetchEnd(cn4Var, i2, j2);
            }
        }

        @Override // p000.cm4
        public void fetchProgress(@efb cn4 cn4Var, int i2, long j2) {
            if (cn4Var.getMinIntervalMillisCallbackProcess() > 0) {
                cn4.C2403c.setLastCallbackProcessTs(cn4Var, SystemClock.uptimeMillis());
            }
            if (cn4Var.isAutoCallbackToUIThread()) {
                this.f40387a.post(new k(cn4Var, i2, j2));
            } else {
                cn4Var.getListener().fetchProgress(cn4Var, i2, j2);
            }
        }

        @Override // p000.cm4
        public void fetchStart(@efb cn4 cn4Var, int i2, long j2) {
            q0i.m19913d(go1.f40375c, "fetchStart: " + cn4Var.getId());
            if (cn4Var.isAutoCallbackToUIThread()) {
                this.f40387a.post(new j(cn4Var, i2, j2));
            } else {
                cn4Var.getListener().fetchStart(cn4Var, i2, j2);
            }
        }

        @Override // p000.cm4
        public void taskEnd(@efb cn4 cn4Var, @efb x15 x15Var, @hib Exception exc) {
            if (x15Var == x15.ERROR) {
                q0i.m19913d(go1.f40375c, "taskEnd: " + cn4Var.getId() + C2473f.f17566z + x15Var + C2473f.f17566z + exc);
            }
            m11795c(cn4Var, x15Var, exc);
            if (cn4Var.isAutoCallbackToUIThread()) {
                this.f40387a.post(new b(cn4Var, x15Var, exc));
            } else {
                cn4Var.getListener().taskEnd(cn4Var, x15Var, exc);
            }
        }

        @Override // p000.cm4
        public void taskStart(@efb cn4 cn4Var) {
            q0i.m19913d(go1.f40375c, "taskStart: " + cn4Var.getId());
            m11796d(cn4Var);
            if (cn4Var.isAutoCallbackToUIThread()) {
                this.f40387a.post(new c(cn4Var));
            } else {
                cn4Var.getListener().taskStart(cn4Var);
            }
        }
    }

    public go1(@efb Handler handler, @efb cm4 cm4Var) {
        this.f40377b = handler;
        this.f40376a = cm4Var;
    }

    public cm4 dispatch() {
        return this.f40376a;
    }

    public void endTasks(@efb Collection<cn4> collection, @efb Collection<cn4> collection2, @efb Collection<cn4> collection3) {
        if (collection.size() == 0 && collection2.size() == 0 && collection3.size() == 0) {
            return;
        }
        q0i.m19913d(f40375c, "endTasks completed[" + collection.size() + "] sameTask[" + collection2.size() + "] fileBusy[" + collection3.size() + "]");
        if (collection.size() > 0) {
            Iterator<cn4> it = collection.iterator();
            while (it.hasNext()) {
                cn4 next = it.next();
                if (!next.isAutoCallbackToUIThread()) {
                    next.getListener().taskEnd(next, x15.COMPLETED, null);
                    it.remove();
                }
            }
        }
        if (collection2.size() > 0) {
            Iterator<cn4> it2 = collection2.iterator();
            while (it2.hasNext()) {
                cn4 next2 = it2.next();
                if (!next2.isAutoCallbackToUIThread()) {
                    next2.getListener().taskEnd(next2, x15.SAME_TASK_BUSY, null);
                    it2.remove();
                }
            }
        }
        if (collection3.size() > 0) {
            Iterator<cn4> it3 = collection3.iterator();
            while (it3.hasNext()) {
                cn4 next3 = it3.next();
                if (!next3.isAutoCallbackToUIThread()) {
                    next3.getListener().taskEnd(next3, x15.FILE_BUSY, null);
                    it3.remove();
                }
            }
        }
        if (collection.size() == 0 && collection2.size() == 0 && collection3.size() == 0) {
            return;
        }
        this.f40377b.post(new RunnableC6438b(collection, collection2, collection3));
    }

    public void endTasksWithCanceled(@efb Collection<cn4> collection) {
        if (collection.size() <= 0) {
            return;
        }
        q0i.m19913d(f40375c, "endTasksWithCanceled canceled[" + collection.size() + "]");
        Iterator<cn4> it = collection.iterator();
        while (it.hasNext()) {
            cn4 next = it.next();
            if (!next.isAutoCallbackToUIThread()) {
                next.getListener().taskEnd(next, x15.CANCELED, null);
                it.remove();
            }
        }
        this.f40377b.post(new RunnableC6439c(collection));
    }

    public void endTasksWithError(@efb Collection<cn4> collection, @efb Exception exc) {
        if (collection.size() <= 0) {
            return;
        }
        q0i.m19913d(f40375c, "endTasksWithError error[" + collection.size() + "] realCause: " + exc);
        Iterator<cn4> it = collection.iterator();
        while (it.hasNext()) {
            cn4 next = it.next();
            if (!next.isAutoCallbackToUIThread()) {
                next.getListener().taskEnd(next, x15.ERROR, exc);
                it.remove();
            }
        }
        this.f40377b.post(new RunnableC6437a(collection, exc));
    }

    public boolean isFetchProcessMoment(cn4 cn4Var) {
        long minIntervalMillisCallbackProcess = cn4Var.getMinIntervalMillisCallbackProcess();
        return minIntervalMillisCallbackProcess <= 0 || SystemClock.uptimeMillis() - cn4.C2403c.getLastCallbackProcessTs(cn4Var) >= minIntervalMillisCallbackProcess;
    }

    public go1() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f40377b = handler;
        this.f40376a = new C6440d(handler);
    }
}
