package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class ytb<T, R> extends AbstractC10162o3<T, R> {

    /* JADX INFO: renamed from: b */
    public final j11<R, ? super T, R> f102951b;

    /* JADX INFO: renamed from: c */
    public final Callable<R> f102952c;

    /* JADX INFO: renamed from: ytb$a */
    public static final class C15804a<T, R> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f102953a;

        /* JADX INFO: renamed from: b */
        public final j11<R, ? super T, R> f102954b;

        /* JADX INFO: renamed from: c */
        public R f102955c;

        /* JADX INFO: renamed from: d */
        public mf4 f102956d;

        /* JADX INFO: renamed from: e */
        public boolean f102957e;

        public C15804a(oxb<? super R> oxbVar, j11<R, ? super T, R> j11Var, R r) {
            this.f102953a = oxbVar;
            this.f102954b = j11Var;
            this.f102955c = r;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f102956d.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f102956d.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f102957e) {
                return;
            }
            this.f102957e = true;
            this.f102953a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f102957e) {
                pfe.onError(th);
            } else {
                this.f102957e = true;
                this.f102953a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f102957e) {
                return;
            }
            try {
                R r = (R) xjb.requireNonNull(this.f102954b.apply(this.f102955c, t), "The accumulator returned a null value");
                this.f102955c = r;
                this.f102953a.onNext(r);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f102956d.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f102956d, mf4Var)) {
                this.f102956d = mf4Var;
                this.f102953a.onSubscribe(this);
                this.f102953a.onNext(this.f102955c);
            }
        }
    }

    public ytb(xub<T> xubVar, Callable<R> callable, j11<R, ? super T, R> j11Var) {
        super(xubVar);
        this.f102951b = j11Var;
        this.f102952c = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        try {
            this.f66354a.subscribe(new C15804a(oxbVar, this.f102951b, xjb.requireNonNull(this.f102952c.call(), "The seed supplied is null")));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, oxbVar);
        }
    }
}
