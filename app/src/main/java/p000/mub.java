package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mub<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f62239b;

    /* JADX INFO: renamed from: mub$a */
    public static final class C9529a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f62240a;

        /* JADX INFO: renamed from: b */
        public long f62241b;

        /* JADX INFO: renamed from: c */
        public mf4 f62242c;

        public C9529a(oxb<? super T> oxbVar, long j) {
            this.f62240a = oxbVar;
            this.f62241b = j;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f62242c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f62242c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f62240a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f62240a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            long j = this.f62241b;
            if (j != 0) {
                this.f62241b = j - 1;
            } else {
                this.f62240a.onNext(t);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f62242c, mf4Var)) {
                this.f62242c = mf4Var;
                this.f62240a.onSubscribe(this);
            }
        }
    }

    public mub(xub<T> xubVar, long j) {
        super(xubVar);
        this.f62239b = j;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C9529a(oxbVar, this.f62239b));
    }
}
