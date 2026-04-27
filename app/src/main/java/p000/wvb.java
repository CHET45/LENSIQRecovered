package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class wvb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f95559b;

    /* JADX INFO: renamed from: wvb$a */
    public static final class C14809a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f95560a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f95561b;

        /* JADX INFO: renamed from: c */
        public lf4 f95562c;

        /* JADX INFO: renamed from: d */
        public boolean f95563d;

        public C14809a(pxb<? super T> downstream, n8d<? super T> predicate) {
            this.f95560a = downstream;
            this.f95561b = predicate;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f95562c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f95562c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f95563d) {
                return;
            }
            this.f95563d = true;
            this.f95560a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f95563d) {
                ofe.onError(t);
            } else {
                this.f95563d = true;
                this.f95560a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f95563d) {
                return;
            }
            this.f95560a.onNext(t);
            try {
                if (this.f95561b.test(t)) {
                    this.f95563d = true;
                    this.f95562c.dispose();
                    this.f95560a.onComplete();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f95562c.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f95562c, d)) {
                this.f95562c = d;
                this.f95560a.onSubscribe(this);
            }
        }
    }

    public wvb(wub<T> source, n8d<? super T> predicate) {
        super(source);
        this.f95559b = predicate;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C14809a(observer, this.f95559b));
    }
}
