package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class tg2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2[] f84612a;

    /* JADX INFO: renamed from: tg2$a */
    public static final class C13020a implements dh2 {

        /* JADX INFO: renamed from: a */
        public final dh2 f84613a;

        /* JADX INFO: renamed from: b */
        public final nm2 f84614b;

        /* JADX INFO: renamed from: c */
        public final cc0 f84615c;

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f84616d;

        public C13020a(dh2 dh2Var, nm2 nm2Var, cc0 cc0Var, AtomicInteger atomicInteger) {
            this.f84613a = dh2Var;
            this.f84614b = nm2Var;
            this.f84615c = cc0Var;
            this.f84616d = atomicInteger;
        }

        /* JADX INFO: renamed from: a */
        public void m22495a() {
            if (this.f84616d.decrementAndGet() == 0) {
                Throwable thTerminate = this.f84615c.terminate();
                if (thTerminate == null) {
                    this.f84613a.onComplete();
                } else {
                    this.f84613a.onError(thTerminate);
                }
            }
        }

        @Override // p000.dh2
        public void onComplete() {
            m22495a();
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            if (this.f84615c.addThrowable(th)) {
                m22495a();
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            this.f84614b.add(mf4Var);
        }
    }

    public tg2(qh2[] qh2VarArr) {
        this.f84612a = qh2VarArr;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        nm2 nm2Var = new nm2();
        AtomicInteger atomicInteger = new AtomicInteger(this.f84612a.length + 1);
        cc0 cc0Var = new cc0();
        dh2Var.onSubscribe(nm2Var);
        for (qh2 qh2Var : this.f84612a) {
            if (nm2Var.isDisposed()) {
                return;
            }
            if (qh2Var == null) {
                cc0Var.addThrowable(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                qh2Var.subscribe(new C13020a(dh2Var, nm2Var, cc0Var, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            Throwable thTerminate = cc0Var.terminate();
            if (thTerminate == null) {
                dh2Var.onComplete();
            } else {
                dh2Var.onError(thTerminate);
            }
        }
    }
}
