package p000;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public final class l85 {

    /* JADX INFO: renamed from: c */
    public static final Logger f56747c = Logger.getLogger(l85.class.getName());

    /* JADX INFO: renamed from: a */
    @wx1
    @uc7("this")
    public C8711a f56748a;

    /* JADX INFO: renamed from: b */
    @uc7("this")
    public boolean f56749b;

    /* JADX INFO: renamed from: l85$a */
    public static final class C8711a {

        /* JADX INFO: renamed from: a */
        public final Runnable f56750a;

        /* JADX INFO: renamed from: b */
        public final Executor f56751b;

        /* JADX INFO: renamed from: c */
        @wx1
        public C8711a f56752c;

        public C8711a(Runnable runnable, Executor executor, @wx1 C8711a next) {
            this.f56750a = runnable;
            this.f56751b = executor;
            this.f56752c = next;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f56747c.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public void add(Runnable runnable, Executor executor) {
        v7d.checkNotNull(runnable, "Runnable was null.");
        v7d.checkNotNull(executor, "Executor was null.");
        synchronized (this) {
            try {
                if (this.f56749b) {
                    executeListener(runnable, executor);
                } else {
                    this.f56748a = new C8711a(runnable, executor, this.f56748a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void execute() {
        synchronized (this) {
            try {
                if (this.f56749b) {
                    return;
                }
                this.f56749b = true;
                C8711a c8711a = this.f56748a;
                C8711a c8711a2 = null;
                this.f56748a = null;
                while (c8711a != null) {
                    C8711a c8711a3 = c8711a.f56752c;
                    c8711a.f56752c = c8711a2;
                    c8711a2 = c8711a;
                    c8711a = c8711a3;
                }
                while (c8711a2 != null) {
                    executeListener(c8711a2.f56750a, c8711a2.f56751b);
                    c8711a2 = c8711a2.f56752c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
