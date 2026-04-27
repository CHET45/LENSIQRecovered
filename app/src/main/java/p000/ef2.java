package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ef2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f32790a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7178i8 f32791b;

    /* JADX INFO: renamed from: ef2$a */
    public static final class C5280a extends AtomicInteger implements dh2, mf4 {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a */
        public final dh2 f32792a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7178i8 f32793b;

        /* JADX INFO: renamed from: c */
        public mf4 f32794c;

        public C5280a(dh2 dh2Var, InterfaceC7178i8 interfaceC7178i8) {
            this.f32792a = dh2Var;
            this.f32793b = interfaceC7178i8;
        }

        /* JADX INFO: renamed from: a */
        public void m9910a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f32793b.run();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f32794c.dispose();
            m9910a();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f32794c.isDisposed();
        }

        @Override // p000.dh2
        public void onComplete() {
            this.f32792a.onComplete();
            m9910a();
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f32792a.onError(th);
            m9910a();
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f32794c, mf4Var)) {
                this.f32794c = mf4Var;
                this.f32792a.onSubscribe(this);
            }
        }
    }

    public ef2(qh2 qh2Var, InterfaceC7178i8 interfaceC7178i8) {
        this.f32790a = qh2Var;
        this.f32791b = interfaceC7178i8;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f32790a.subscribe(new C5280a(dh2Var, this.f32791b));
    }
}
