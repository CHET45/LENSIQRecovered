package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class yvb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f103144b;

    /* JADX INFO: renamed from: yvb$a */
    public static final class C15849a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f103145a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f103146b;

        /* JADX INFO: renamed from: c */
        public lf4 f103147c;

        /* JADX INFO: renamed from: d */
        public boolean f103148d;

        public C15849a(pxb<? super T> actual, n8d<? super T> predicate) {
            this.f103145a = actual;
            this.f103146b = predicate;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f103147c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f103147c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f103148d) {
                return;
            }
            this.f103148d = true;
            this.f103145a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f103148d) {
                ofe.onError(t);
            } else {
                this.f103148d = true;
                this.f103145a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f103148d) {
                return;
            }
            try {
                if (this.f103146b.test(t)) {
                    this.f103145a.onNext(t);
                    return;
                }
                this.f103148d = true;
                this.f103147c.dispose();
                this.f103145a.onComplete();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f103147c.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f103147c, d)) {
                this.f103147c = d;
                this.f103145a.onSubscribe(this);
            }
        }
    }

    public yvb(wub<T> source, n8d<? super T> predicate) {
        super(source);
        this.f103144b = predicate;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        this.f63101a.subscribe(new C15849a(t, this.f103144b));
    }
}
