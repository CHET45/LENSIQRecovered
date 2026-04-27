package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class vub<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f92283b;

    /* JADX INFO: renamed from: vub$a */
    public static final class C14265a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f92284a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f92285b;

        /* JADX INFO: renamed from: c */
        public lf4 f92286c;

        /* JADX INFO: renamed from: d */
        public boolean f92287d;

        public C14265a(pxb<? super T> actual, n8d<? super T> predicate) {
            this.f92284a = actual;
            this.f92285b = predicate;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f92286c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f92286c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f92284a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f92284a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f92287d) {
                this.f92284a.onNext(t);
                return;
            }
            try {
                if (this.f92285b.test(t)) {
                    return;
                }
                this.f92287d = true;
                this.f92284a.onNext(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f92286c.dispose();
                this.f92284a.onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f92286c, d)) {
                this.f92286c = d;
                this.f92284a.onSubscribe(this);
            }
        }
    }

    public vub(wub<T> source, n8d<? super T> predicate) {
        super(source);
        this.f92283b = predicate;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C14265a(observer, this.f92283b));
    }
}
