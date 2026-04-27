package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class k5a<T> extends ljf<Long> implements ah7<T> {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f52602a;

    /* JADX INFO: renamed from: k5a$a */
    public static final class C8201a implements l9a<Object>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super Long> f52603a;

        /* JADX INFO: renamed from: b */
        public mf4 f52604b;

        public C8201a(inf<? super Long> infVar) {
            this.f52603a = infVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f52604b.dispose();
            this.f52604b = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f52604b.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f52604b = ag4.DISPOSED;
            this.f52603a.onSuccess(0L);
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f52604b = ag4.DISPOSED;
            this.f52603a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f52604b, mf4Var)) {
                this.f52604b = mf4Var;
                this.f52603a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(Object obj) {
            this.f52604b = ag4.DISPOSED;
            this.f52603a.onSuccess(1L);
        }
    }

    public k5a(aaa<T> aaaVar) {
        this.f52602a = aaaVar;
    }

    @Override // p000.ah7
    public aaa<T> source() {
        return this.f52602a;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Long> infVar) {
        this.f52602a.subscribe(new C8201a(infVar));
    }
}
