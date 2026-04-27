package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class nnb<T, U> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final xub<? extends T> f65076a;

    /* JADX INFO: renamed from: b */
    public final xub<U> f65077b;

    /* JADX INFO: renamed from: nnb$a */
    public final class C9957a implements oxb<U> {

        /* JADX INFO: renamed from: a */
        public final b0f f65078a;

        /* JADX INFO: renamed from: b */
        public final oxb<? super T> f65079b;

        /* JADX INFO: renamed from: c */
        public boolean f65080c;

        /* JADX INFO: renamed from: nnb$a$a */
        public final class a implements oxb<T> {
            public a() {
            }

            @Override // p000.oxb
            public void onComplete() {
                C9957a.this.f65079b.onComplete();
            }

            @Override // p000.oxb
            public void onError(Throwable th) {
                C9957a.this.f65079b.onError(th);
            }

            @Override // p000.oxb
            public void onNext(T t) {
                C9957a.this.f65079b.onNext(t);
            }

            @Override // p000.oxb
            public void onSubscribe(mf4 mf4Var) {
                C9957a.this.f65078a.update(mf4Var);
            }
        }

        public C9957a(b0f b0fVar, oxb<? super T> oxbVar) {
            this.f65078a = b0fVar;
            this.f65079b = oxbVar;
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f65080c) {
                return;
            }
            this.f65080c = true;
            nnb.this.f65076a.subscribe(new a());
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f65080c) {
                pfe.onError(th);
            } else {
                this.f65080c = true;
                this.f65079b.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(U u) {
            onComplete();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f65078a.update(mf4Var);
        }
    }

    public nnb(xub<? extends T> xubVar, xub<U> xubVar2) {
        this.f65076a = xubVar;
        this.f65077b = xubVar2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        b0f b0fVar = new b0f();
        oxbVar.onSubscribe(b0fVar);
        this.f65077b.subscribe(new C9957a(b0fVar, oxbVar));
    }
}
