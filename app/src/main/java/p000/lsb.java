package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class lsb<T, R> extends AbstractC10162o3<T, R> {

    /* JADX INFO: renamed from: b */
    public final py6<? super Observable<T>, ? extends xub<R>> f58614b;

    /* JADX INFO: renamed from: lsb$a */
    public static final class C8952a<T, R> implements oxb<T> {

        /* JADX INFO: renamed from: a */
        public final xjd<T> f58615a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<mf4> f58616b;

        public C8952a(xjd<T> xjdVar, AtomicReference<mf4> atomicReference) {
            this.f58615a = xjdVar;
            this.f58616b = atomicReference;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f58615a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f58615a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f58615a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f58616b, mf4Var);
        }
    }

    /* JADX INFO: renamed from: lsb$b */
    public static final class C8953b<T, R> extends AtomicReference<mf4> implements oxb<R>, mf4 {
        private static final long serialVersionUID = 854110278590336484L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f58617a;

        /* JADX INFO: renamed from: b */
        public mf4 f58618b;

        public C8953b(oxb<? super R> oxbVar) {
            this.f58617a = oxbVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f58618b.dispose();
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f58618b.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            ag4.dispose(this);
            this.f58617a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            ag4.dispose(this);
            this.f58617a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(R r) {
            this.f58617a.onNext(r);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f58618b, mf4Var)) {
                this.f58618b = mf4Var;
                this.f58617a.onSubscribe(this);
            }
        }
    }

    public lsb(xub<T> xubVar, py6<? super Observable<T>, ? extends xub<R>> py6Var) {
        super(xubVar);
        this.f58614b = py6Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        xjd xjdVarCreate = xjd.create();
        try {
            xub xubVar = (xub) xjb.requireNonNull(this.f58614b.apply(xjdVarCreate), "The selector returned a null ObservableSource");
            C8953b c8953b = new C8953b(oxbVar);
            xubVar.subscribe(c8953b);
            this.f66354a.subscribe(new C8952a(xjdVarCreate, c8953b));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, oxbVar);
        }
    }
}
