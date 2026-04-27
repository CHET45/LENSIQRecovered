package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class s8a<T> extends ljf<Boolean> implements ah7<T>, x07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f80947a;

    /* JADX INFO: renamed from: s8a$a */
    public static final class C12488a<T> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super Boolean> f80948a;

        /* JADX INFO: renamed from: b */
        public mf4 f80949b;

        public C12488a(inf<? super Boolean> infVar) {
            this.f80948a = infVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f80949b.dispose();
            this.f80949b = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f80949b.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f80949b = ag4.DISPOSED;
            this.f80948a.onSuccess(Boolean.TRUE);
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f80949b = ag4.DISPOSED;
            this.f80948a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f80949b, mf4Var)) {
                this.f80949b = mf4Var;
                this.f80948a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f80949b = ag4.DISPOSED;
            this.f80948a.onSuccess(Boolean.FALSE);
        }
    }

    public s8a(aaa<T> aaaVar) {
        this.f80947a = aaaVar;
    }

    @Override // p000.x07
    public s4a<Boolean> fuseToMaybe() {
        return pfe.onAssembly(new q8a(this.f80947a));
    }

    @Override // p000.ah7
    public aaa<T> source() {
        return this.f80947a;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Boolean> infVar) {
        this.f80947a.subscribe(new C12488a(infVar));
    }
}
