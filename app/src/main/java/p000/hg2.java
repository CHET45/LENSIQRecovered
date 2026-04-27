package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class hg2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f43404a;

    /* JADX INFO: renamed from: hg2$a */
    public static final class C6840a implements dh2, mf4 {

        /* JADX INFO: renamed from: a */
        public final dh2 f43405a;

        /* JADX INFO: renamed from: b */
        public mf4 f43406b;

        public C6840a(dh2 dh2Var) {
            this.f43405a = dh2Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f43406b.dispose();
            this.f43406b = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f43406b.isDisposed();
        }

        @Override // p000.dh2
        public void onComplete() {
            this.f43405a.onComplete();
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f43405a.onError(th);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f43406b, mf4Var)) {
                this.f43406b = mf4Var;
                this.f43405a.onSubscribe(this);
            }
        }
    }

    public hg2(qh2 qh2Var) {
        this.f43404a = qh2Var;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f43404a.subscribe(new C6840a(dh2Var));
    }
}
