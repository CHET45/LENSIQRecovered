package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.r42;

/* JADX INFO: loaded from: classes7.dex */
public class wm7 {

    /* JADX INFO: renamed from: g */
    public static final Logger f94735g = Logger.getLogger(wm7.class.getName());

    /* JADX INFO: renamed from: a */
    public final long f94736a;

    /* JADX INFO: renamed from: b */
    public final d5g f94737b;

    /* JADX INFO: renamed from: c */
    @vc7("this")
    public Map<r42.InterfaceC11878a, Executor> f94738c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    @vc7("this")
    public boolean f94739d;

    /* JADX INFO: renamed from: e */
    @vc7("this")
    public Throwable f94740e;

    /* JADX INFO: renamed from: f */
    @vc7("this")
    public long f94741f;

    /* JADX INFO: renamed from: wm7$a */
    public class RunnableC14689a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r42.InterfaceC11878a f94742a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f94743b;

        public RunnableC14689a(r42.InterfaceC11878a interfaceC11878a, long j) {
            this.f94742a = interfaceC11878a;
            this.f94743b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f94742a.onSuccess(this.f94743b);
        }
    }

    /* JADX INFO: renamed from: wm7$b */
    public class RunnableC14690b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r42.InterfaceC11878a f94744a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Throwable f94745b;

        public RunnableC14690b(r42.InterfaceC11878a interfaceC11878a, Throwable th) {
            this.f94744a = interfaceC11878a;
            this.f94745b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f94744a.onFailure(this.f94745b);
        }
    }

    public wm7(long j, d5g d5gVar) {
        this.f94736a = j;
        this.f94737b = d5gVar;
    }

    private static Runnable asRunnable(r42.InterfaceC11878a interfaceC11878a, long j) {
        return new RunnableC14689a(interfaceC11878a, j);
    }

    private static void doExecute(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f94735g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    public static void notifyFailed(r42.InterfaceC11878a interfaceC11878a, Executor executor, Throwable th) {
        doExecute(executor, asRunnable(interfaceC11878a, th));
    }

    public void addCallback(r42.InterfaceC11878a interfaceC11878a, Executor executor) {
        synchronized (this) {
            try {
                if (!this.f94739d) {
                    this.f94738c.put(interfaceC11878a, executor);
                } else {
                    Throwable th = this.f94740e;
                    doExecute(executor, th != null ? asRunnable(interfaceC11878a, th) : asRunnable(interfaceC11878a, this.f94741f));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean complete() {
        synchronized (this) {
            try {
                if (this.f94739d) {
                    return false;
                }
                this.f94739d = true;
                long jElapsed = this.f94737b.elapsed(TimeUnit.NANOSECONDS);
                this.f94741f = jElapsed;
                Map<r42.InterfaceC11878a, Executor> map = this.f94738c;
                this.f94738c = null;
                for (Map.Entry<r42.InterfaceC11878a, Executor> entry : map.entrySet()) {
                    doExecute(entry.getValue(), asRunnable(entry.getKey(), jElapsed));
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void failed(Throwable th) {
        synchronized (this) {
            try {
                if (this.f94739d) {
                    return;
                }
                this.f94739d = true;
                this.f94740e = th;
                Map<r42.InterfaceC11878a, Executor> map = this.f94738c;
                this.f94738c = null;
                for (Map.Entry<r42.InterfaceC11878a, Executor> entry : map.entrySet()) {
                    notifyFailed(entry.getKey(), entry.getValue(), th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long payload() {
        return this.f94736a;
    }

    private static Runnable asRunnable(r42.InterfaceC11878a interfaceC11878a, Throwable th) {
        return new RunnableC14690b(interfaceC11878a, th);
    }
}
