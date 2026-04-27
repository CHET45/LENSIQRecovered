package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class o8a<T> extends yd2 implements x07<T> {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f66659a;

    /* JADX INFO: renamed from: o8a$a */
    public static final class C10224a<T> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final dh2 f66660a;

        /* JADX INFO: renamed from: b */
        public mf4 f66661b;

        public C10224a(dh2 dh2Var) {
            this.f66660a = dh2Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f66661b.dispose();
            this.f66661b = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f66661b.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f66661b = ag4.DISPOSED;
            this.f66660a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f66661b = ag4.DISPOSED;
            this.f66660a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f66661b, mf4Var)) {
                this.f66661b = mf4Var;
                this.f66660a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f66661b = ag4.DISPOSED;
            this.f66660a.onComplete();
        }
    }

    public o8a(aaa<T> aaaVar) {
        this.f66659a = aaaVar;
    }

    @Override // p000.x07
    public s4a<T> fuseToMaybe() {
        return pfe.onAssembly(new m8a(this.f66659a));
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f66659a.subscribe(new C10224a(dh2Var));
    }
}
