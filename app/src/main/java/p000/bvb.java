package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class bvb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final xub<? extends T> f14941b;

    /* JADX INFO: renamed from: bvb$a */
    public static final class C2068a<T> implements oxb<T> {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f14942a;

        /* JADX INFO: renamed from: b */
        public final xub<? extends T> f14943b;

        /* JADX INFO: renamed from: d */
        public boolean f14945d = true;

        /* JADX INFO: renamed from: c */
        public final b0f f14944c = new b0f();

        public C2068a(oxb<? super T> oxbVar, xub<? extends T> xubVar) {
            this.f14942a = oxbVar;
            this.f14943b = xubVar;
        }

        @Override // p000.oxb
        public void onComplete() {
            if (!this.f14945d) {
                this.f14942a.onComplete();
            } else {
                this.f14945d = false;
                this.f14943b.subscribe(this);
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f14942a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f14945d) {
                this.f14945d = false;
            }
            this.f14942a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f14944c.update(mf4Var);
        }
    }

    public bvb(xub<T> xubVar, xub<? extends T> xubVar2) {
        super(xubVar);
        this.f14941b = xubVar2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C2068a c2068a = new C2068a(oxbVar, this.f14941b);
        oxbVar.onSubscribe(c2068a.f14944c);
        this.f66354a.subscribe(c2068a);
    }
}
