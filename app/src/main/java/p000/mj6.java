package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mj6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final zjd<? extends T> f61128c;

    /* JADX INFO: renamed from: mj6$a */
    public static final class C9367a<T> implements lj6<T> {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f61129a;

        /* JADX INFO: renamed from: b */
        public final zjd<? extends T> f61130b;

        /* JADX INFO: renamed from: d */
        public boolean f61132d = true;

        /* JADX INFO: renamed from: c */
        public final hdg f61131c = new hdg(false);

        public C9367a(ycg<? super T> ycgVar, zjd<? extends T> zjdVar) {
            this.f61129a = ycgVar;
            this.f61130b = zjdVar;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (!this.f61132d) {
                this.f61129a.onComplete();
            } else {
                this.f61132d = false;
                this.f61130b.subscribe(this);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f61129a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f61132d) {
                this.f61132d = false;
            }
            this.f61129a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            this.f61131c.setSubscription(fdgVar);
        }
    }

    public mj6(m86<T> m86Var, zjd<? extends T> zjdVar) {
        super(m86Var);
        this.f61128c = zjdVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C9367a c9367a = new C9367a(ycgVar, this.f61128c);
        ycgVar.onSubscribe(c9367a.f61131c);
        this.f52360b.subscribe((lj6) c9367a);
    }
}
