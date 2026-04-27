package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class be2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f13497a;

    /* JADX INFO: renamed from: b */
    public final qh2 f13498b;

    /* JADX INFO: renamed from: be2$a */
    public static final class C1856a implements dh2 {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<mf4> f13499a;

        /* JADX INFO: renamed from: b */
        public final dh2 f13500b;

        public C1856a(AtomicReference<mf4> atomicReference, dh2 dh2Var) {
            this.f13499a = atomicReference;
            this.f13500b = dh2Var;
        }

        @Override // p000.dh2
        public void onComplete() {
            this.f13500b.onComplete();
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f13500b.onError(th);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            ag4.replace(this.f13499a, mf4Var);
        }
    }

    /* JADX INFO: renamed from: be2$b */
    public static final class C1857b extends AtomicReference<mf4> implements dh2, mf4 {
        private static final long serialVersionUID = -4101678820158072998L;

        /* JADX INFO: renamed from: a */
        public final dh2 f13501a;

        /* JADX INFO: renamed from: b */
        public final qh2 f13502b;

        public C1857b(dh2 dh2Var, qh2 qh2Var) {
            this.f13501a = dh2Var;
            this.f13502b = qh2Var;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.dh2
        public void onComplete() {
            this.f13502b.subscribe(new C1856a(this, this.f13501a));
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f13501a.onError(th);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f13501a.onSubscribe(this);
            }
        }
    }

    public be2(qh2 qh2Var, qh2 qh2Var2) {
        this.f13497a = qh2Var;
        this.f13498b = qh2Var2;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f13497a.subscribe(new C1857b(dh2Var, this.f13498b));
    }
}
