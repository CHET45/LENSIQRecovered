package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class qg2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2[] f74331a;

    /* JADX INFO: renamed from: qg2$a */
    public static final class C11473a extends AtomicInteger implements dh2 {
        private static final long serialVersionUID = -8360547806504310570L;

        /* JADX INFO: renamed from: a */
        public final dh2 f74332a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f74333b;

        /* JADX INFO: renamed from: c */
        public final nm2 f74334c;

        public C11473a(dh2 dh2Var, AtomicBoolean atomicBoolean, nm2 nm2Var, int i) {
            this.f74332a = dh2Var;
            this.f74333b = atomicBoolean;
            this.f74334c = nm2Var;
            lazySet(i);
        }

        @Override // p000.dh2
        public void onComplete() {
            if (decrementAndGet() == 0 && this.f74333b.compareAndSet(false, true)) {
                this.f74332a.onComplete();
            }
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f74334c.dispose();
            if (this.f74333b.compareAndSet(false, true)) {
                this.f74332a.onError(th);
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            this.f74334c.add(mf4Var);
        }
    }

    public qg2(qh2[] qh2VarArr) {
        this.f74331a = qh2VarArr;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        nm2 nm2Var = new nm2();
        C11473a c11473a = new C11473a(dh2Var, new AtomicBoolean(), nm2Var, this.f74331a.length + 1);
        dh2Var.onSubscribe(nm2Var);
        for (qh2 qh2Var : this.f74331a) {
            if (nm2Var.isDisposed()) {
                return;
            }
            if (qh2Var == null) {
                nm2Var.dispose();
                c11473a.onError(new NullPointerException("A completable source is null"));
                return;
            }
            qh2Var.subscribe(c11473a);
        }
        c11473a.onComplete();
    }
}
