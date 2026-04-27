package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class yrb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final py6<? super Throwable, ? extends xub<? extends T>> f102777b;

    /* JADX INFO: renamed from: c */
    public final boolean f102778c;

    /* JADX INFO: renamed from: yrb$a */
    public static final class C15785a<T> implements oxb<T> {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f102779a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Throwable, ? extends xub<? extends T>> f102780b;

        /* JADX INFO: renamed from: c */
        public final boolean f102781c;

        /* JADX INFO: renamed from: d */
        public final b0f f102782d = new b0f();

        /* JADX INFO: renamed from: e */
        public boolean f102783e;

        /* JADX INFO: renamed from: f */
        public boolean f102784f;

        public C15785a(oxb<? super T> oxbVar, py6<? super Throwable, ? extends xub<? extends T>> py6Var, boolean z) {
            this.f102779a = oxbVar;
            this.f102780b = py6Var;
            this.f102781c = z;
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f102784f) {
                return;
            }
            this.f102784f = true;
            this.f102783e = true;
            this.f102779a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f102783e) {
                if (this.f102784f) {
                    pfe.onError(th);
                    return;
                } else {
                    this.f102779a.onError(th);
                    return;
                }
            }
            this.f102783e = true;
            if (this.f102781c && !(th instanceof Exception)) {
                this.f102779a.onError(th);
                return;
            }
            try {
                xub<? extends T> xubVarApply = this.f102780b.apply(th);
                if (xubVarApply != null) {
                    xubVarApply.subscribe(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th);
                this.f102779a.onError(nullPointerException);
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f102779a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f102784f) {
                return;
            }
            this.f102779a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f102782d.replace(mf4Var);
        }
    }

    public yrb(xub<T> xubVar, py6<? super Throwable, ? extends xub<? extends T>> py6Var, boolean z) {
        super(xubVar);
        this.f102777b = py6Var;
        this.f102778c = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C15785a c15785a = new C15785a(oxbVar, this.f102777b, this.f102778c);
        oxbVar.onSubscribe(c15785a.f102782d);
        this.f66354a.subscribe(c15785a);
    }
}
