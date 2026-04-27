package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class iub<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f48504a;

    /* JADX INFO: renamed from: iub$a */
    public static final class C7626a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f48505a;

        /* JADX INFO: renamed from: b */
        public lf4 f48506b;

        /* JADX INFO: renamed from: c */
        public T f48507c;

        /* JADX INFO: renamed from: d */
        public boolean f48508d;

        public C7626a(k9a<? super T> downstream) {
            this.f48505a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f48506b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f48506b.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f48508d) {
                return;
            }
            this.f48508d = true;
            T t = this.f48507c;
            this.f48507c = null;
            if (t == null) {
                this.f48505a.onComplete();
            } else {
                this.f48505a.onSuccess(t);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f48508d) {
                ofe.onError(t);
            } else {
                this.f48508d = true;
                this.f48505a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f48508d) {
                return;
            }
            if (this.f48507c == null) {
                this.f48507c = t;
                return;
            }
            this.f48508d = true;
            this.f48506b.dispose();
            this.f48505a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f48506b, d)) {
                this.f48506b = d;
                this.f48505a.onSubscribe(this);
            }
        }
    }

    public iub(wub<T> source) {
        this.f48504a = source;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> t) {
        this.f48504a.subscribe(new C7626a(t));
    }
}
