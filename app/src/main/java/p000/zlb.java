package p000;

import io.reactivex.Observable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class zlb<T, U> extends ljf<U> implements z07<U> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f105416a;

    /* JADX INFO: renamed from: b */
    public final Callable<? extends U> f105417b;

    /* JADX INFO: renamed from: c */
    public final f11<? super U, ? super T> f105418c;

    /* JADX INFO: renamed from: zlb$a */
    public static final class C16178a<T, U> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super U> f105419a;

        /* JADX INFO: renamed from: b */
        public final f11<? super U, ? super T> f105420b;

        /* JADX INFO: renamed from: c */
        public final U f105421c;

        /* JADX INFO: renamed from: d */
        public mf4 f105422d;

        /* JADX INFO: renamed from: e */
        public boolean f105423e;

        public C16178a(inf<? super U> infVar, U u, f11<? super U, ? super T> f11Var) {
            this.f105419a = infVar;
            this.f105420b = f11Var;
            this.f105421c = u;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f105422d.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f105422d.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f105423e) {
                return;
            }
            this.f105423e = true;
            this.f105419a.onSuccess(this.f105421c);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f105423e) {
                pfe.onError(th);
            } else {
                this.f105423e = true;
                this.f105419a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f105423e) {
                return;
            }
            try {
                this.f105420b.accept(this.f105421c, t);
            } catch (Throwable th) {
                this.f105422d.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f105422d, mf4Var)) {
                this.f105422d = mf4Var;
                this.f105419a.onSubscribe(this);
            }
        }
    }

    public zlb(xub<T> xubVar, Callable<? extends U> callable, f11<? super U, ? super T> f11Var) {
        this.f105416a = xubVar;
        this.f105417b = callable;
        this.f105418c = f11Var;
    }

    @Override // p000.z07
    public Observable<U> fuseToObservable() {
        return pfe.onAssembly(new xlb(this.f105416a, this.f105417b, this.f105418c));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super U> infVar) {
        try {
            this.f105416a.subscribe(new C16178a(infVar, xjb.requireNonNull(this.f105417b.call(), "The initialSupplier returned a null value"), this.f105418c));
        } catch (Throwable th) {
            c05.error(th, infVar);
        }
    }
}
