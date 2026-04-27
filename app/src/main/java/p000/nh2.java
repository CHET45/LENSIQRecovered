package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class nh2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f64504a;

    /* JADX INFO: renamed from: b */
    public final py6<? super Throwable, ? extends qh2> f64505b;

    /* JADX INFO: renamed from: nh2$a */
    public static final class C9872a extends AtomicReference<mf4> implements dh2, mf4 {
        private static final long serialVersionUID = 5018523762564524046L;

        /* JADX INFO: renamed from: a */
        public final dh2 f64506a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Throwable, ? extends qh2> f64507b;

        /* JADX INFO: renamed from: c */
        public boolean f64508c;

        public C9872a(dh2 dh2Var, py6<? super Throwable, ? extends qh2> py6Var) {
            this.f64506a = dh2Var;
            this.f64507b = py6Var;
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
            this.f64506a.onComplete();
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            if (this.f64508c) {
                this.f64506a.onError(th);
                return;
            }
            this.f64508c = true;
            try {
                ((qh2) xjb.requireNonNull(this.f64507b.apply(th), "The errorMapper returned a null CompletableSource")).subscribe(this);
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f64506a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            ag4.replace(this, mf4Var);
        }
    }

    public nh2(qh2 qh2Var, py6<? super Throwable, ? extends qh2> py6Var) {
        this.f64504a = qh2Var;
        this.f64505b = py6Var;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        C9872a c9872a = new C9872a(dh2Var, this.f64505b);
        dh2Var.onSubscribe(c9872a);
        this.f64504a.subscribe(c9872a);
    }
}
