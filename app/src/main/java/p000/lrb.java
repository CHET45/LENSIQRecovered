package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lrb<T> extends AbstractC10162o3<T, kgb<T>> {

    /* JADX INFO: renamed from: lrb$a */
    public static final class C8946a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super kgb<T>> f58542a;

        /* JADX INFO: renamed from: b */
        public mf4 f58543b;

        public C8946a(oxb<? super kgb<T>> oxbVar) {
            this.f58542a = oxbVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f58543b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f58543b.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f58542a.onNext(kgb.createOnComplete());
            this.f58542a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f58542a.onNext(kgb.createOnError(th));
            this.f58542a.onComplete();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f58542a.onNext(kgb.createOnNext(t));
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f58543b, mf4Var)) {
                this.f58543b = mf4Var;
                this.f58542a.onSubscribe(this);
            }
        }
    }

    public lrb(xub<T> xubVar) {
        super(xubVar);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super kgb<T>> oxbVar) {
        this.f66354a.subscribe(new C8946a(oxbVar));
    }
}
