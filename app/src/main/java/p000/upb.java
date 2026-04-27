package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class upb<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends T> f88726a;

    /* JADX INFO: renamed from: upb$a */
    public static final class C13643a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f88727a;

        /* JADX INFO: renamed from: b */
        public fdg f88728b;

        public C13643a(pxb<? super T> o) {
            this.f88727a = o;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f88728b.cancel();
            this.f88728b = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f88728b == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f88727a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f88727a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f88727a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f88728b, s)) {
                this.f88728b = s;
                this.f88727a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public upb(zjd<? extends T> publisher) {
        this.f88726a = publisher;
    }

    @Override // p000.vkb
    public void subscribeActual(final pxb<? super T> o) {
        this.f88726a.subscribe(new C13643a(o));
    }
}
