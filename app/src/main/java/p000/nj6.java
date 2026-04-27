package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class nj6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final zjd<? extends T> f64751c;

    /* JADX INFO: renamed from: nj6$a */
    public static final class C9905a<T> implements kj6<T> {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f64752a;

        /* JADX INFO: renamed from: b */
        public final zjd<? extends T> f64753b;

        /* JADX INFO: renamed from: d */
        public boolean f64755d = true;

        /* JADX INFO: renamed from: c */
        public final gdg f64754c = new gdg(false);

        public C9905a(ycg<? super T> actual, zjd<? extends T> other) {
            this.f64752a = actual;
            this.f64753b = other;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (!this.f64755d) {
                this.f64752a.onComplete();
            } else {
                this.f64755d = false;
                this.f64753b.subscribe(this);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f64752a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f64755d) {
                this.f64755d = false;
            }
            this.f64752a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            this.f64754c.setSubscription(s);
        }
    }

    public nj6(l86<T> source, zjd<? extends T> other) {
        super(source);
        this.f64751c = other;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        C9905a c9905a = new C9905a(s, this.f64751c);
        s.onSubscribe(c9905a.f64754c);
        this.f49321b.subscribe((kj6) c9905a);
    }
}
