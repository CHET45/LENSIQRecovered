package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class asb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final py6<? super Throwable, ? extends T> f11767b;

    /* JADX INFO: renamed from: asb$a */
    public static final class C1590a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f11768a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Throwable, ? extends T> f11769b;

        /* JADX INFO: renamed from: c */
        public mf4 f11770c;

        public C1590a(oxb<? super T> oxbVar, py6<? super Throwable, ? extends T> py6Var) {
            this.f11768a = oxbVar;
            this.f11769b = py6Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f11770c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f11770c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f11768a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            try {
                T tApply = this.f11769b.apply(th);
                if (tApply != null) {
                    this.f11768a.onNext(tApply);
                    this.f11768a.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f11768a.onError(nullPointerException);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f11768a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f11768a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f11770c, mf4Var)) {
                this.f11770c = mf4Var;
                this.f11768a.onSubscribe(this);
            }
        }
    }

    public asb(xub<T> xubVar, py6<? super Throwable, ? extends T> py6Var) {
        super(xubVar);
        this.f11767b = py6Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C1590a(oxbVar, this.f11767b));
    }
}
