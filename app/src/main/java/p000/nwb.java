package p000;

import io.reactivex.Observable;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class nwb<T, U extends Collection<? super T>> extends ljf<U> implements z07<U> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f65898a;

    /* JADX INFO: renamed from: b */
    public final Callable<U> f65899b;

    /* JADX INFO: renamed from: nwb$a */
    public static final class C10092a<T, U extends Collection<? super T>> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super U> f65900a;

        /* JADX INFO: renamed from: b */
        public U f65901b;

        /* JADX INFO: renamed from: c */
        public mf4 f65902c;

        public C10092a(inf<? super U> infVar, U u) {
            this.f65900a = infVar;
            this.f65901b = u;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f65902c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f65902c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            U u = this.f65901b;
            this.f65901b = null;
            this.f65900a.onSuccess(u);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f65901b = null;
            this.f65900a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f65901b.add(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f65902c, mf4Var)) {
                this.f65902c = mf4Var;
                this.f65900a.onSubscribe(this);
            }
        }
    }

    public nwb(xub<T> xubVar, int i) {
        this.f65898a = xubVar;
        this.f65899b = q07.createArrayList(i);
    }

    @Override // p000.z07
    public Observable<U> fuseToObservable() {
        return pfe.onAssembly(new lwb(this.f65898a, this.f65899b));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super U> infVar) {
        try {
            this.f65898a.subscribe(new C10092a(infVar, (Collection) xjb.requireNonNull(this.f65899b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, infVar);
        }
    }

    public nwb(xub<T> xubVar, Callable<U> callable) {
        this.f65898a = xubVar;
        this.f65899b = callable;
    }
}
