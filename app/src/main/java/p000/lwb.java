package p000;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class lwb<T, U extends Collection<? super T>> extends AbstractC10162o3<T, U> {

    /* JADX INFO: renamed from: b */
    public final Callable<U> f59069b;

    /* JADX INFO: renamed from: lwb$a */
    public static final class C9011a<T, U extends Collection<? super T>> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super U> f59070a;

        /* JADX INFO: renamed from: b */
        public mf4 f59071b;

        /* JADX INFO: renamed from: c */
        public U f59072c;

        public C9011a(oxb<? super U> oxbVar, U u) {
            this.f59070a = oxbVar;
            this.f59072c = u;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f59071b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f59071b.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            U u = this.f59072c;
            this.f59072c = null;
            this.f59070a.onNext(u);
            this.f59070a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f59072c = null;
            this.f59070a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f59072c.add(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f59071b, mf4Var)) {
                this.f59071b = mf4Var;
                this.f59070a.onSubscribe(this);
            }
        }
    }

    public lwb(xub<T> xubVar, int i) {
        super(xubVar);
        this.f59069b = q07.createArrayList(i);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super U> oxbVar) {
        try {
            this.f66354a.subscribe(new C9011a(oxbVar, (Collection) xjb.requireNonNull(this.f59069b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, oxbVar);
        }
    }

    public lwb(xub<T> xubVar, Callable<U> callable) {
        super(xubVar);
        this.f59069b = callable;
    }
}
