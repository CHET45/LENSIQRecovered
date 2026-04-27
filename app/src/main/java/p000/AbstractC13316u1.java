package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.g4f;

/* JADX INFO: renamed from: u1 */
/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public abstract class AbstractC13316u1 implements g4f {

    /* JADX INFO: renamed from: a */
    public final lfg<String> f86533a;

    /* JADX INFO: renamed from: b */
    public final g4f f86534b;

    /* JADX INFO: renamed from: u1$b */
    public final class b extends AbstractC6698h4 {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doStart$0() {
            try {
                AbstractC13316u1.this.m22997f();
                m12129f();
            } catch (Throwable th) {
                uwc.m23618b(th);
                m12128e(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doStop$1() {
            try {
                AbstractC13316u1.this.m22996e();
                m12130g();
            } catch (Throwable th) {
                uwc.m23618b(th);
                m12128e(th);
            }
        }

        @Override // p000.AbstractC6698h4
        /* JADX INFO: renamed from: c */
        public final void mo2911c() {
            xya.m25561e(AbstractC13316u1.this.m22994c(), AbstractC13316u1.this.f86533a).execute(new Runnable() { // from class: w1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93055a.lambda$doStart$0();
                }
            });
        }

        @Override // p000.AbstractC6698h4
        /* JADX INFO: renamed from: d */
        public final void mo2912d() {
            xya.m25561e(AbstractC13316u1.this.m22994c(), AbstractC13316u1.this.f86533a).execute(new Runnable() { // from class: v1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89644a.lambda$doStop$1();
                }
            });
        }

        @Override // p000.AbstractC6698h4
        public String toString() {
            return AbstractC13316u1.this.toString();
        }
    }

    /* JADX INFO: renamed from: u1$c */
    public final class c implements lfg<String> {
        private c() {
        }

        @Override // p000.lfg
        public String get() {
            return AbstractC13316u1.this.m22995d() + C2473f.f17566z + AbstractC13316u1.this.state();
        }
    }

    public AbstractC13316u1() {
        this.f86533a = new c();
        this.f86534b = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executor$0(Runnable runnable) {
        xya.m25559c(this.f86533a.get(), runnable).start();
    }

    @Override // p000.g4f
    public final void addListener(g4f.AbstractC6129a listener, Executor executor) {
        this.f86534b.addListener(listener, executor);
    }

    @Override // p000.g4f
    public final void awaitRunning() {
        this.f86534b.awaitRunning();
    }

    @Override // p000.g4f
    public final void awaitTerminated() {
        this.f86534b.awaitTerminated();
    }

    /* JADX INFO: renamed from: c */
    public Executor m22994c() {
        return new Executor() { // from class: t1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f83337a.lambda$executor$0(runnable);
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public String m22995d() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: e */
    public abstract void m22996e() throws Exception;

    /* JADX INFO: renamed from: f */
    public abstract void m22997f() throws Exception;

    @Override // p000.g4f
    public final Throwable failureCause() {
        return this.f86534b.failureCause();
    }

    @Override // p000.g4f
    public final boolean isRunning() {
        return this.f86534b.isRunning();
    }

    @Override // p000.g4f
    @op1
    public final g4f startAsync() {
        this.f86534b.startAsync();
        return this;
    }

    @Override // p000.g4f
    public final g4f.EnumC6130b state() {
        return this.f86534b.state();
    }

    @Override // p000.g4f
    @op1
    public final g4f stopAsync() {
        this.f86534b.stopAsync();
        return this;
    }

    public String toString() {
        return m22995d() + " [" + state() + "]";
    }

    @Override // p000.g4f
    public final void awaitRunning(long timeout, TimeUnit unit) throws TimeoutException {
        this.f86534b.awaitRunning(timeout, unit);
    }

    @Override // p000.g4f
    public final void awaitTerminated(long timeout, TimeUnit unit) throws TimeoutException {
        this.f86534b.awaitTerminated(timeout, unit);
    }
}
