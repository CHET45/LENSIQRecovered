package p000;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class p7a<T, R> extends ljf<R> {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f69924a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends pof<? extends R>> f69925b;

    /* JADX INFO: renamed from: p7a$a */
    public static final class C10820a<T, R> extends AtomicReference<mf4> implements l9a<T>, mf4 {
        private static final long serialVersionUID = 4827726964688405508L;

        /* JADX INFO: renamed from: a */
        public final inf<? super R> f69926a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends pof<? extends R>> f69927b;

        public C10820a(inf<? super R> infVar, py6<? super T, ? extends pof<? extends R>> py6Var) {
            this.f69926a = infVar;
            this.f69927b = py6Var;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f69926a.onError(new NoSuchElementException());
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f69926a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f69926a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            try {
                pof pofVar = (pof) xjb.requireNonNull(this.f69927b.apply(t), "The mapper returned a null SingleSource");
                if (isDisposed()) {
                    return;
                }
                pofVar.subscribe(new C10821b(this, this.f69926a));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: p7a$b */
    public static final class C10821b<R> implements inf<R> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<mf4> f69928a;

        /* JADX INFO: renamed from: b */
        public final inf<? super R> f69929b;

        public C10821b(AtomicReference<mf4> atomicReference, inf<? super R> infVar) {
            this.f69928a = atomicReference;
            this.f69929b = infVar;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f69929b.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            ag4.replace(this.f69928a, mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(R r) {
            this.f69929b.onSuccess(r);
        }
    }

    public p7a(aaa<T> aaaVar, py6<? super T, ? extends pof<? extends R>> py6Var) {
        this.f69924a = aaaVar;
        this.f69925b = py6Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super R> infVar) {
        this.f69924a.subscribe(new C10820a(infVar, this.f69925b));
    }
}
