package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class sd6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final wub<T> f81315b;

    /* JADX INFO: renamed from: sd6$a */
    public static final class C12529a<T> implements pxb<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f81316a;

        /* JADX INFO: renamed from: b */
        public lf4 f81317b;

        public C12529a(ycg<? super T> s) {
            this.f81316a = s;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f81317b.dispose();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f81316a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            this.f81316a.onError(e);
        }

        @Override // p000.pxb
        public void onNext(T value) {
            this.f81316a.onNext(value);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f81317b = d;
            this.f81316a.onSubscribe(this);
        }

        @Override // p000.fdg
        public void request(long n) {
        }
    }

    public sd6(wub<T> upstream) {
        this.f81315b = upstream;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f81315b.subscribe(new C12529a(s));
    }
}
