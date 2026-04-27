package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class zrb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super Throwable, ? extends wub<? extends T>> f105851b;

    /* JADX INFO: renamed from: zrb$a */
    public static final class C16233a<T> implements pxb<T> {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f105852a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Throwable, ? extends wub<? extends T>> f105853b;

        /* JADX INFO: renamed from: c */
        public final a0f f105854c = new a0f();

        /* JADX INFO: renamed from: d */
        public boolean f105855d;

        /* JADX INFO: renamed from: e */
        public boolean f105856e;

        public C16233a(pxb<? super T> actual, sy6<? super Throwable, ? extends wub<? extends T>> nextSupplier) {
            this.f105852a = actual;
            this.f105853b = nextSupplier;
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f105856e) {
                return;
            }
            this.f105856e = true;
            this.f105855d = true;
            this.f105852a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f105855d) {
                if (this.f105856e) {
                    ofe.onError(t);
                    return;
                } else {
                    this.f105852a.onError(t);
                    return;
                }
            }
            this.f105855d = true;
            try {
                wub<? extends T> wubVarApply = this.f105853b.apply(t);
                if (wubVarApply != null) {
                    wubVarApply.subscribe(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(t);
                this.f105852a.onError(nullPointerException);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f105852a.onError(new qm2(t, th));
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f105856e) {
                return;
            }
            this.f105852a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f105854c.replace(d);
        }
    }

    public zrb(wub<T> source, sy6<? super Throwable, ? extends wub<? extends T>> nextSupplier) {
        super(source);
        this.f105851b = nextSupplier;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        C16233a c16233a = new C16233a(t, this.f105851b);
        t.onSubscribe(c16233a.f105854c);
        this.f63101a.subscribe(c16233a);
    }
}
