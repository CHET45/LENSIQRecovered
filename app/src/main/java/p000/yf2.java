package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class yf2<T> extends xd2 {

    /* JADX INFO: renamed from: a */
    public final zjd<T> f101379a;

    /* JADX INFO: renamed from: yf2$a */
    public static final class C15643a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final ch2 f101380a;

        /* JADX INFO: renamed from: b */
        public fdg f101381b;

        public C15643a(ch2 downstream) {
            this.f101380a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f101381b.cancel();
            this.f101381b = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f101381b == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f101380a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f101380a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f101381b, s)) {
                this.f101381b = s;
                this.f101380a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public yf2(zjd<T> flowable) {
        this.f101379a = flowable;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 downstream) {
        this.f101379a.subscribe(new C15643a(downstream));
    }
}
