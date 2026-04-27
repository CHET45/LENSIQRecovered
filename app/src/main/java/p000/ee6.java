package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ee6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: ee6$a */
    public static final class C5271a<T> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f32740a;

        /* JADX INFO: renamed from: b */
        public fdg f32741b;

        public C5271a(ycg<? super T> ycgVar) {
            this.f32740a = ycgVar;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f32741b.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f32740a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f32740a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f32740a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f32741b, fdgVar)) {
                this.f32741b = fdgVar;
                this.f32740a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f32741b.request(j);
        }
    }

    public ee6(m86<T> m86Var) {
        super(m86Var);
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C5271a(ycgVar));
    }
}
