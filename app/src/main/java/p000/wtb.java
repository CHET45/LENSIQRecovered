package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class wtb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final j11<T, T, T> f95490b;

    /* JADX INFO: renamed from: wtb$a */
    public static final class C14796a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f95491a;

        /* JADX INFO: renamed from: b */
        public final j11<T, T, T> f95492b;

        /* JADX INFO: renamed from: c */
        public mf4 f95493c;

        /* JADX INFO: renamed from: d */
        public T f95494d;

        /* JADX INFO: renamed from: e */
        public boolean f95495e;

        public C14796a(oxb<? super T> oxbVar, j11<T, T, T> j11Var) {
            this.f95491a = oxbVar;
            this.f95492b = j11Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f95493c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f95493c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f95495e) {
                return;
            }
            this.f95495e = true;
            this.f95491a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f95495e) {
                pfe.onError(th);
            } else {
                this.f95495e = true;
                this.f95491a.onError(th);
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f95495e) {
                return;
            }
            oxb<? super T> oxbVar = this.f95491a;
            T t2 = this.f95494d;
            if (t2 == null) {
                this.f95494d = t;
                oxbVar.onNext(t);
                return;
            }
            try {
                ?? r4 = (T) xjb.requireNonNull(this.f95492b.apply(t2, t), "The value returned by the accumulator is null");
                this.f95494d = r4;
                oxbVar.onNext(r4);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f95493c.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f95493c, mf4Var)) {
                this.f95493c = mf4Var;
                this.f95491a.onSubscribe(this);
            }
        }
    }

    public wtb(xub<T> xubVar, j11<T, T, T> j11Var) {
        super(xubVar);
        this.f95490b = j11Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C14796a(oxbVar, this.f95490b));
    }
}
