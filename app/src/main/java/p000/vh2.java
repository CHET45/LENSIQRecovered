package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class vh2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final yd2 f91171a;

    /* JADX INFO: renamed from: b */
    public final qh2 f91172b;

    /* JADX INFO: renamed from: vh2$a */
    public static final class C14072a extends AtomicReference<mf4> implements dh2, mf4 {
        private static final long serialVersionUID = 3533011714830024923L;

        /* JADX INFO: renamed from: a */
        public final dh2 f91173a;

        /* JADX INFO: renamed from: b */
        public final a f91174b = new a(this);

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f91175c = new AtomicBoolean();

        /* JADX INFO: renamed from: vh2$a$a */
        public static final class a extends AtomicReference<mf4> implements dh2 {
            private static final long serialVersionUID = 5176264485428790318L;

            /* JADX INFO: renamed from: a */
            public final C14072a f91176a;

            public a(C14072a c14072a) {
                this.f91176a = c14072a;
            }

            @Override // p000.dh2
            public void onComplete() {
                this.f91176a.m23962a();
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                this.f91176a.m23963b(th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C14072a(dh2 dh2Var) {
            this.f91173a = dh2Var;
        }

        /* JADX INFO: renamed from: a */
        public void m23962a() {
            if (this.f91175c.compareAndSet(false, true)) {
                ag4.dispose(this);
                this.f91173a.onComplete();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m23963b(Throwable th) {
            if (!this.f91175c.compareAndSet(false, true)) {
                pfe.onError(th);
            } else {
                ag4.dispose(this);
                this.f91173a.onError(th);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f91175c.compareAndSet(false, true)) {
                ag4.dispose(this);
                ag4.dispose(this.f91174b);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f91175c.get();
        }

        @Override // p000.dh2
        public void onComplete() {
            if (this.f91175c.compareAndSet(false, true)) {
                ag4.dispose(this.f91174b);
                this.f91173a.onComplete();
            }
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            if (!this.f91175c.compareAndSet(false, true)) {
                pfe.onError(th);
            } else {
                ag4.dispose(this.f91174b);
                this.f91173a.onError(th);
            }
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }
    }

    public vh2(yd2 yd2Var, qh2 qh2Var) {
        this.f91171a = yd2Var;
        this.f91172b = qh2Var;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        C14072a c14072a = new C14072a(dh2Var);
        dh2Var.onSubscribe(c14072a);
        this.f91172b.subscribe(c14072a.f91174b);
        this.f91171a.subscribe(c14072a);
    }
}
