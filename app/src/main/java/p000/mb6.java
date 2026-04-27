package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mb6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: mb6$a */
    public static final class C9251a<T> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public ycg<? super T> f60441a;

        /* JADX INFO: renamed from: b */
        public fdg f60442b;

        public C9251a(ycg<? super T> ycgVar) {
            this.f60441a = ycgVar;
        }

        @Override // p000.fdg
        public void cancel() {
            fdg fdgVar = this.f60442b;
            this.f60442b = yz4.INSTANCE;
            this.f60441a = yz4.asSubscriber();
            fdgVar.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            ycg<? super T> ycgVar = this.f60441a;
            this.f60442b = yz4.INSTANCE;
            this.f60441a = yz4.asSubscriber();
            ycgVar.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            ycg<? super T> ycgVar = this.f60441a;
            this.f60442b = yz4.INSTANCE;
            this.f60441a = yz4.asSubscriber();
            ycgVar.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f60441a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f60442b, fdgVar)) {
                this.f60442b = fdgVar;
                this.f60441a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f60442b.request(j);
        }
    }

    public mb6(m86<T> m86Var) {
        super(m86Var);
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C9251a(ycgVar));
    }
}
