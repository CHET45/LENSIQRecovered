package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class bob<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final tu2<? super T> f14253b;

    /* JADX INFO: renamed from: c */
    public final tu2<? super Throwable> f14254c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7178i8 f14255d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7178i8 f14256e;

    /* JADX INFO: renamed from: bob$a */
    public static final class C1963a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f14257a;

        /* JADX INFO: renamed from: b */
        public final tu2<? super T> f14258b;

        /* JADX INFO: renamed from: c */
        public final tu2<? super Throwable> f14259c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC7178i8 f14260d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC7178i8 f14261e;

        /* JADX INFO: renamed from: f */
        public mf4 f14262f;

        /* JADX INFO: renamed from: m */
        public boolean f14263m;

        public C1963a(oxb<? super T> oxbVar, tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, InterfaceC7178i8 interfaceC7178i82) {
            this.f14257a = oxbVar;
            this.f14258b = tu2Var;
            this.f14259c = tu2Var2;
            this.f14260d = interfaceC7178i8;
            this.f14261e = interfaceC7178i82;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f14262f.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f14262f.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f14263m) {
                return;
            }
            try {
                this.f14260d.run();
                this.f14263m = true;
                this.f14257a.onComplete();
                try {
                    this.f14261e.run();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                onError(th2);
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f14263m) {
                pfe.onError(th);
                return;
            }
            this.f14263m = true;
            try {
                this.f14259c.accept(th);
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                th = new pm2(th, th2);
            }
            this.f14257a.onError(th);
            try {
                this.f14261e.run();
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                pfe.onError(th3);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f14263m) {
                return;
            }
            try {
                this.f14258b.accept(t);
                this.f14257a.onNext(t);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f14262f.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f14262f, mf4Var)) {
                this.f14262f = mf4Var;
                this.f14257a.onSubscribe(this);
            }
        }
    }

    public bob(xub<T> xubVar, tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, InterfaceC7178i8 interfaceC7178i82) {
        super(xubVar);
        this.f14253b = tu2Var;
        this.f14254c = tu2Var2;
        this.f14255d = interfaceC7178i8;
        this.f14256e = interfaceC7178i82;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C1963a(oxbVar, this.f14253b, this.f14254c, this.f14255d, this.f14256e));
    }
}
