package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xkb<T> extends AbstractC9666n3<T, Boolean> {

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f98293b;

    /* JADX INFO: renamed from: xkb$a */
    public static final class C15171a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super Boolean> f98294a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f98295b;

        /* JADX INFO: renamed from: c */
        public lf4 f98296c;

        /* JADX INFO: renamed from: d */
        public boolean f98297d;

        public C15171a(pxb<? super Boolean> actual, n8d<? super T> predicate) {
            this.f98294a = actual;
            this.f98295b = predicate;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f98296c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f98296c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f98297d) {
                return;
            }
            this.f98297d = true;
            this.f98294a.onNext(Boolean.TRUE);
            this.f98294a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f98297d) {
                ofe.onError(t);
            } else {
                this.f98297d = true;
                this.f98294a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f98297d) {
                return;
            }
            try {
                if (this.f98295b.test(t)) {
                    return;
                }
                this.f98297d = true;
                this.f98296c.dispose();
                this.f98294a.onNext(Boolean.FALSE);
                this.f98294a.onComplete();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f98296c.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f98296c, d)) {
                this.f98296c = d;
                this.f98294a.onSubscribe(this);
            }
        }
    }

    public xkb(wub<T> source, n8d<? super T> predicate) {
        super(source);
        this.f98293b = predicate;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super Boolean> t) {
        this.f63101a.subscribe(new C15171a(t, this.f98293b));
    }
}
