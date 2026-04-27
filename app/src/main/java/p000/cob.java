package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class cob<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final uu2<? super T> f17239b;

    /* JADX INFO: renamed from: c */
    public final uu2<? super Throwable> f17240c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7776j8 f17241d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7776j8 f17242e;

    /* JADX INFO: renamed from: cob$a */
    public static final class C2413a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f17243a;

        /* JADX INFO: renamed from: b */
        public final uu2<? super T> f17244b;

        /* JADX INFO: renamed from: c */
        public final uu2<? super Throwable> f17245c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC7776j8 f17246d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC7776j8 f17247e;

        /* JADX INFO: renamed from: f */
        public lf4 f17248f;

        /* JADX INFO: renamed from: m */
        public boolean f17249m;

        public C2413a(pxb<? super T> actual, uu2<? super T> onNext, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete, InterfaceC7776j8 onAfterTerminate) {
            this.f17243a = actual;
            this.f17244b = onNext;
            this.f17245c = onError;
            this.f17246d = onComplete;
            this.f17247e = onAfterTerminate;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f17248f.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f17248f.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f17249m) {
                return;
            }
            try {
                this.f17246d.run();
                this.f17249m = true;
                this.f17243a.onComplete();
                try {
                    this.f17247e.run();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                onError(th2);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f17249m) {
                ofe.onError(t);
                return;
            }
            this.f17249m = true;
            try {
                this.f17245c.accept(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                t = new qm2(t, th);
            }
            this.f17243a.onError(t);
            try {
                this.f17247e.run();
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                ofe.onError(th2);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f17249m) {
                return;
            }
            try {
                this.f17244b.accept(t);
                this.f17243a.onNext(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f17248f.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f17248f, d)) {
                this.f17248f = d;
                this.f17243a.onSubscribe(this);
            }
        }
    }

    public cob(wub<T> source, uu2<? super T> onNext, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete, InterfaceC7776j8 onAfterTerminate) {
        super(source);
        this.f17239b = onNext;
        this.f17240c = onError;
        this.f17241d = onComplete;
        this.f17242e = onAfterTerminate;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        this.f63101a.subscribe(new C2413a(t, this.f17239b, this.f17240c, this.f17241d, this.f17242e));
    }
}
