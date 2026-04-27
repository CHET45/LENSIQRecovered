package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class faa<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final aaa<? extends T> f35932b;

    /* JADX INFO: renamed from: faa$a */
    public static final class C5707a<T> extends AtomicReference<mf4> implements l9a<T>, mf4 {
        private static final long serialVersionUID = -2223459372976438024L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f35933a;

        /* JADX INFO: renamed from: b */
        public final aaa<? extends T> f35934b;

        /* JADX INFO: renamed from: faa$a$a */
        public static final class a<T> implements l9a<T> {

            /* JADX INFO: renamed from: a */
            public final l9a<? super T> f35935a;

            /* JADX INFO: renamed from: b */
            public final AtomicReference<mf4> f35936b;

            public a(l9a<? super T> l9aVar, AtomicReference<mf4> atomicReference) {
                this.f35935a = l9aVar;
                this.f35936b = atomicReference;
            }

            @Override // p000.l9a
            public void onComplete() {
                this.f35935a.onComplete();
            }

            @Override // p000.l9a
            public void onError(Throwable th) {
                this.f35935a.onError(th);
            }

            @Override // p000.l9a
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this.f35936b, mf4Var);
            }

            @Override // p000.l9a
            public void onSuccess(T t) {
                this.f35935a.onSuccess(t);
            }
        }

        public C5707a(l9a<? super T> l9aVar, aaa<? extends T> aaaVar) {
            this.f35933a = l9aVar;
            this.f35934b = aaaVar;
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
            mf4 mf4Var = get();
            if (mf4Var == ag4.DISPOSED || !compareAndSet(mf4Var, null)) {
                return;
            }
            this.f35934b.subscribe(new a(this.f35933a, this));
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f35933a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f35933a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f35933a.onSuccess(t);
        }
    }

    public faa(aaa<T> aaaVar, aaa<? extends T> aaaVar2) {
        super(aaaVar);
        this.f35932b = aaaVar2;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new C5707a(l9aVar, this.f35932b));
    }
}
