package p000;

import android.os.Looper;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class eyg {

    /* JADX INFO: renamed from: d */
    public static final String f34491d = "ThreadPool";

    /* JADX INFO: renamed from: e */
    public static final int f34492e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f34493f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f34494g = 10;

    /* JADX INFO: renamed from: h */
    public static final int f34495h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f34496i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f34497j = 2;

    /* JADX INFO: renamed from: k */
    public static final InterfaceC5528e f34498k = new C5529f(null);

    /* JADX INFO: renamed from: a */
    public C5530g f34499a;

    /* JADX INFO: renamed from: b */
    public C5530g f34500b;

    /* JADX INFO: renamed from: c */
    public final Executor f34501c;

    /* JADX INFO: renamed from: eyg$a */
    public class C5524a implements InterfaceC5527d<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f34502a;

        public C5524a(Runnable runnable) {
            this.f34502a = runnable;
        }

        @Override // p000.eyg.InterfaceC5527d
        public Object run(InterfaceC5528e interfaceC5528e) {
            this.f34502a.run();
            return null;
        }
    }

    /* JADX INFO: renamed from: eyg$b */
    public interface InterfaceC5525b {
        void onCancel();
    }

    /* JADX INFO: renamed from: eyg$c */
    public static class C5526c {

        /* JADX INFO: renamed from: a */
        public static final eyg f34503a = new eyg();

        private C5526c() {
        }
    }

    /* JADX INFO: renamed from: eyg$d */
    public interface InterfaceC5527d<T> {
        T run(InterfaceC5528e interfaceC5528e);
    }

    /* JADX INFO: renamed from: eyg$e */
    public interface InterfaceC5528e {
        boolean isCancelled();

        void setCancelListener(InterfaceC5525b interfaceC5525b);

        boolean setMode(int i);
    }

    /* JADX INFO: renamed from: eyg$f */
    public static class C5529f implements InterfaceC5528e {
        private C5529f() {
        }

        @Override // p000.eyg.InterfaceC5528e
        public boolean isCancelled() {
            return false;
        }

        @Override // p000.eyg.InterfaceC5528e
        public void setCancelListener(InterfaceC5525b interfaceC5525b) {
        }

        @Override // p000.eyg.InterfaceC5528e
        public boolean setMode(int i) {
            return true;
        }

        public /* synthetic */ C5529f(C5524a c5524a) {
            this();
        }
    }

    /* JADX INFO: renamed from: eyg$g */
    public static class C5530g {

        /* JADX INFO: renamed from: a */
        public int f34504a;

        public C5530g(int i) {
            this.f34504a = i;
        }
    }

    /* JADX INFO: renamed from: eyg$h */
    public class RunnableC5531h<T> implements Runnable, b17<T>, InterfaceC5528e {

        /* JADX INFO: renamed from: H */
        public static final String f34505H = "Worker";

        /* JADX INFO: renamed from: C */
        public int f34506C;

        /* JADX INFO: renamed from: a */
        public final InterfaceC5527d<T> f34508a;

        /* JADX INFO: renamed from: b */
        public final l17<T> f34509b;

        /* JADX INFO: renamed from: c */
        public InterfaceC5525b f34510c;

        /* JADX INFO: renamed from: d */
        public C5530g f34511d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f34512e;

        /* JADX INFO: renamed from: f */
        public boolean f34513f;

        /* JADX INFO: renamed from: m */
        public T f34514m;

        public RunnableC5531h(InterfaceC5527d<T> interfaceC5527d, l17<T> l17Var) {
            this.f34508a = interfaceC5527d;
            this.f34509b = l17Var;
        }

        private boolean acquireResource(C5530g c5530g) {
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f34512e) {
                            this.f34511d = null;
                            return false;
                        }
                        this.f34511d = c5530g;
                        synchronized (c5530g) {
                            int i = c5530g.f34504a;
                            if (i > 0) {
                                c5530g.f34504a = i - 1;
                                synchronized (this) {
                                    this.f34511d = null;
                                }
                                return true;
                            }
                            try {
                                c5530g.wait();
                            } catch (InterruptedException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        private C5530g modeToCounter(int i) {
            if (i == 1) {
                return eyg.this.f34499a;
            }
            if (i == 2) {
                return eyg.this.f34500b;
            }
            return null;
        }

        private void releaseResource(C5530g c5530g) {
            synchronized (c5530g) {
                c5530g.f34504a++;
                c5530g.notifyAll();
            }
        }

        @Override // p000.b17
        public synchronized void cancel() {
            try {
                if (this.f34512e) {
                    return;
                }
                this.f34512e = true;
                C5530g c5530g = this.f34511d;
                if (c5530g != null) {
                    synchronized (c5530g) {
                        this.f34511d.notifyAll();
                    }
                }
                InterfaceC5525b interfaceC5525b = this.f34510c;
                if (interfaceC5525b != null) {
                    interfaceC5525b.onCancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // p000.b17
        public synchronized T get() {
            while (!this.f34513f) {
                try {
                    wait();
                } catch (Exception e) {
                    Log.w(f34505H, "ingore exception", e);
                }
            }
            return this.f34514m;
        }

        @Override // p000.b17, p000.eyg.InterfaceC5528e
        public boolean isCancelled() {
            return this.f34512e;
        }

        @Override // p000.b17
        public synchronized boolean isDone() {
            return this.f34513f;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tRun;
            if (setMode(1)) {
                try {
                    tRun = this.f34508a.run(this);
                } catch (Throwable th) {
                    Log.w(f34505H, "Exception in running a job", th);
                    tRun = null;
                }
            } else {
                tRun = null;
            }
            synchronized (this) {
                setMode(0);
                this.f34514m = tRun;
                this.f34513f = true;
                notifyAll();
            }
            l17<T> l17Var = this.f34509b;
            if (l17Var != null) {
                l17Var.onFutureDone(this);
            }
        }

        @Override // p000.eyg.InterfaceC5528e
        public synchronized void setCancelListener(InterfaceC5525b interfaceC5525b) {
            InterfaceC5525b interfaceC5525b2;
            this.f34510c = interfaceC5525b;
            if (this.f34512e && (interfaceC5525b2 = this.f34510c) != null) {
                interfaceC5525b2.onCancel();
            }
        }

        @Override // p000.eyg.InterfaceC5528e
        public boolean setMode(int i) {
            C5530g c5530gModeToCounter = modeToCounter(this.f34506C);
            if (c5530gModeToCounter != null) {
                releaseResource(c5530gModeToCounter);
            }
            this.f34506C = 0;
            C5530g c5530gModeToCounter2 = modeToCounter(i);
            if (c5530gModeToCounter2 == null) {
                return true;
            }
            if (!acquireResource(c5530gModeToCounter2)) {
                return false;
            }
            this.f34506C = i;
            return true;
        }

        @Override // p000.b17
        public void waitDone() {
            get();
        }
    }

    public eyg() {
        this(2, 4);
    }

    public static eyg getInstance() {
        return C5526c.f34503a;
    }

    public static void runOnNonUIThread(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            getInstance().submit(new C5524a(runnable));
        } else {
            runnable.run();
        }
    }

    public void removeTask(b17 b17Var) {
        if (b17Var instanceof RunnableC5531h) {
            ((ThreadPoolExecutor) this.f34501c).remove((Runnable) b17Var);
        }
    }

    public <T> b17<T> submit(InterfaceC5527d<T> interfaceC5527d, l17<T> l17Var) {
        RunnableC5531h runnableC5531h = new RunnableC5531h(interfaceC5527d, l17Var);
        this.f34501c.execute(runnableC5531h);
        return runnableC5531h;
    }

    public eyg(int i, int i2) {
        this.f34499a = new C5530g(2);
        this.f34500b = new C5530g(2);
        this.f34501c = new ThreadPoolExecutor(i, i2, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new kcd("thread-pool", 10));
    }

    public <T> b17<T> submit(InterfaceC5527d<T> interfaceC5527d) {
        return submit(interfaceC5527d, null);
    }
}
