package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class g5a<T> extends ljf<Boolean> implements ah7<T> {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f38815a;

    /* JADX INFO: renamed from: b */
    public final Object f38816b;

    /* JADX INFO: renamed from: g5a$a */
    public static final class C6134a implements l9a<Object>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super Boolean> f38817a;

        /* JADX INFO: renamed from: b */
        public final Object f38818b;

        /* JADX INFO: renamed from: c */
        public mf4 f38819c;

        public C6134a(inf<? super Boolean> infVar, Object obj) {
            this.f38817a = infVar;
            this.f38818b = obj;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f38819c.dispose();
            this.f38819c = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f38819c.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f38819c = ag4.DISPOSED;
            this.f38817a.onSuccess(Boolean.FALSE);
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f38819c = ag4.DISPOSED;
            this.f38817a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f38819c, mf4Var)) {
                this.f38819c = mf4Var;
                this.f38817a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(Object obj) {
            this.f38819c = ag4.DISPOSED;
            this.f38817a.onSuccess(Boolean.valueOf(xjb.equals(obj, this.f38818b)));
        }
    }

    public g5a(aaa<T> aaaVar, Object obj) {
        this.f38815a = aaaVar;
        this.f38816b = obj;
    }

    @Override // p000.ah7
    public aaa<T> source() {
        return this.f38815a;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Boolean> infVar) {
        this.f38815a.subscribe(new C6134a(infVar, this.f38816b));
    }
}
