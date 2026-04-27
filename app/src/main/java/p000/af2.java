package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class af2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f1277a;

    /* JADX INFO: renamed from: af2$a */
    public static final class C0199a implements dh2, mf4 {

        /* JADX INFO: renamed from: a */
        public dh2 f1278a;

        /* JADX INFO: renamed from: b */
        public mf4 f1279b;

        public C0199a(dh2 dh2Var) {
            this.f1278a = dh2Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f1278a = null;
            this.f1279b.dispose();
            this.f1279b = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f1279b.isDisposed();
        }

        @Override // p000.dh2
        public void onComplete() {
            this.f1279b = ag4.DISPOSED;
            dh2 dh2Var = this.f1278a;
            if (dh2Var != null) {
                this.f1278a = null;
                dh2Var.onComplete();
            }
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f1279b = ag4.DISPOSED;
            dh2 dh2Var = this.f1278a;
            if (dh2Var != null) {
                this.f1278a = null;
                dh2Var.onError(th);
            }
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f1279b, mf4Var)) {
                this.f1279b = mf4Var;
                this.f1278a.onSubscribe(this);
            }
        }
    }

    public af2(qh2 qh2Var) {
        this.f1277a = qh2Var;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f1277a.subscribe(new C0199a(dh2Var));
    }
}
