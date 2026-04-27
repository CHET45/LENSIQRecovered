package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class haa<T> extends ljf<T> implements ah7<T> {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f43005a;

    /* JADX INFO: renamed from: b */
    public final pof<? extends T> f43006b;

    /* JADX INFO: renamed from: haa$a */
    public static final class C6764a<T> extends AtomicReference<mf4> implements l9a<T>, mf4 {
        private static final long serialVersionUID = 4603919676453758899L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f43007a;

        /* JADX INFO: renamed from: b */
        public final pof<? extends T> f43008b;

        /* JADX INFO: renamed from: haa$a$a */
        public static final class a<T> implements inf<T> {

            /* JADX INFO: renamed from: a */
            public final inf<? super T> f43009a;

            /* JADX INFO: renamed from: b */
            public final AtomicReference<mf4> f43010b;

            public a(inf<? super T> infVar, AtomicReference<mf4> atomicReference) {
                this.f43009a = infVar;
                this.f43010b = atomicReference;
            }

            @Override // p000.inf
            public void onError(Throwable th) {
                this.f43009a.onError(th);
            }

            @Override // p000.inf
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this.f43010b, mf4Var);
            }

            @Override // p000.inf
            public void onSuccess(T t) {
                this.f43009a.onSuccess(t);
            }
        }

        public C6764a(inf<? super T> infVar, pof<? extends T> pofVar) {
            this.f43007a = infVar;
            this.f43008b = pofVar;
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
            this.f43008b.subscribe(new a(this.f43007a, this));
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f43007a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f43007a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f43007a.onSuccess(t);
        }
    }

    public haa(aaa<T> aaaVar, pof<? extends T> pofVar) {
        this.f43005a = aaaVar;
        this.f43006b = pofVar;
    }

    @Override // p000.ah7
    public aaa<T> source() {
        return this.f43005a;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f43005a.subscribe(new C6764a(infVar, this.f43006b));
    }
}
