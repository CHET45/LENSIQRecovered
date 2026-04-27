package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.g4f;

/* JADX INFO: renamed from: h1 */
/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public abstract class AbstractC6671h1 implements g4f {

    /* JADX INFO: renamed from: b */
    public static final Logger f41936b = Logger.getLogger(AbstractC6671h1.class.getName());

    /* JADX INFO: renamed from: a */
    public final g4f f41937a = new a();

    /* JADX INFO: renamed from: h1$a */
    public class a extends AbstractC6698h4 {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String lambda$doStart$0() {
            return AbstractC6671h1.this.m12069e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doStart$1() {
            try {
                AbstractC6671h1.this.m12071g();
                m12129f();
                if (isRunning()) {
                    try {
                        AbstractC6671h1.this.m12068d();
                    } catch (Throwable th) {
                        uwc.m23618b(th);
                        try {
                            AbstractC6671h1.this.m12070f();
                        } catch (Exception e) {
                            uwc.m23618b(e);
                            AbstractC6671h1.f41936b.log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e);
                        }
                        m12128e(th);
                        return;
                    }
                }
                AbstractC6671h1.this.m12070f();
                m12130g();
            } catch (Throwable th2) {
                uwc.m23618b(th2);
                m12128e(th2);
            }
        }

        @Override // p000.AbstractC6698h4
        /* JADX INFO: renamed from: c */
        public final void mo2911c() {
            xya.m25561e(AbstractC6671h1.this.m12067c(), new lfg() { // from class: f1
                @Override // p000.lfg
                public final Object get() {
                    return this.f34652a.lambda$doStart$0();
                }
            }).execute(new Runnable() { // from class: g1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38196a.lambda$doStart$1();
                }
            });
        }

        @Override // p000.AbstractC6698h4
        /* JADX INFO: renamed from: d */
        public void mo2912d() {
            AbstractC6671h1.this.m12072h();
        }

        @Override // p000.AbstractC6698h4
        public String toString() {
            return AbstractC6671h1.this.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executor$0(Runnable runnable) {
        xya.m25559c(m12069e(), runnable).start();
    }

    @Override // p000.g4f
    public final void addListener(g4f.AbstractC6129a listener, Executor executor) {
        this.f41937a.addListener(listener, executor);
    }

    @Override // p000.g4f
    public final void awaitRunning() {
        this.f41937a.awaitRunning();
    }

    @Override // p000.g4f
    public final void awaitTerminated() {
        this.f41937a.awaitTerminated();
    }

    /* JADX INFO: renamed from: c */
    public Executor m12067c() {
        return new Executor() { // from class: e1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f31484a.lambda$executor$0(runnable);
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public abstract void m12068d() throws Exception;

    /* JADX INFO: renamed from: e */
    public String m12069e() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: f */
    public void m12070f() throws Exception {
    }

    @Override // p000.g4f
    public final Throwable failureCause() {
        return this.f41937a.failureCause();
    }

    /* JADX INFO: renamed from: g */
    public void m12071g() throws Exception {
    }

    /* JADX INFO: renamed from: h */
    public void m12072h() {
    }

    @Override // p000.g4f
    public final boolean isRunning() {
        return this.f41937a.isRunning();
    }

    @Override // p000.g4f
    @op1
    public final g4f startAsync() {
        this.f41937a.startAsync();
        return this;
    }

    @Override // p000.g4f
    public final g4f.EnumC6130b state() {
        return this.f41937a.state();
    }

    @Override // p000.g4f
    @op1
    public final g4f stopAsync() {
        this.f41937a.stopAsync();
        return this;
    }

    public String toString() {
        return m12069e() + " [" + state() + "]";
    }

    @Override // p000.g4f
    public final void awaitRunning(long timeout, TimeUnit unit) throws TimeoutException {
        this.f41937a.awaitRunning(timeout, unit);
    }

    @Override // p000.g4f
    public final void awaitTerminated(long timeout, TimeUnit unit) throws TimeoutException {
        this.f41937a.awaitTerminated(timeout, unit);
    }
}
