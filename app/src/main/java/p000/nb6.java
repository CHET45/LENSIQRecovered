package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class nb6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: nb6$a */
    public static final class C9771a<T> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public ycg<? super T> f63897a;

        /* JADX INFO: renamed from: b */
        public fdg f63898b;

        public C9771a(ycg<? super T> downstream) {
            this.f63897a = downstream;
        }

        @Override // p000.fdg
        public void cancel() {
            fdg fdgVar = this.f63898b;
            this.f63898b = xz4.INSTANCE;
            this.f63897a = xz4.asSubscriber();
            fdgVar.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            ycg<? super T> ycgVar = this.f63897a;
            this.f63898b = xz4.INSTANCE;
            this.f63897a = xz4.asSubscriber();
            ycgVar.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            ycg<? super T> ycgVar = this.f63897a;
            this.f63898b = xz4.INSTANCE;
            this.f63897a = xz4.asSubscriber();
            ycgVar.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f63897a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f63898b, s)) {
                this.f63898b = s;
                this.f63897a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f63898b.request(n);
        }
    }

    public nb6(l86<T> source) {
        super(source);
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C9771a(s));
    }
}
