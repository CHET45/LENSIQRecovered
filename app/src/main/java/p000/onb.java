package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class onb<T, U> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final wub<? extends T> f68181a;

    /* JADX INFO: renamed from: b */
    public final wub<U> f68182b;

    /* JADX INFO: renamed from: onb$a */
    public final class C10476a implements pxb<U> {

        /* JADX INFO: renamed from: a */
        public final a0f f68183a;

        /* JADX INFO: renamed from: b */
        public final pxb<? super T> f68184b;

        /* JADX INFO: renamed from: c */
        public boolean f68185c;

        /* JADX INFO: renamed from: onb$a$a */
        public final class a implements pxb<T> {
            public a() {
            }

            @Override // p000.pxb
            public void onComplete() {
                C10476a.this.f68184b.onComplete();
            }

            @Override // p000.pxb
            public void onError(Throwable e) {
                C10476a.this.f68184b.onError(e);
            }

            @Override // p000.pxb
            public void onNext(T value) {
                C10476a.this.f68184b.onNext(value);
            }

            @Override // p000.pxb
            public void onSubscribe(lf4 d) {
                C10476a.this.f68183a.update(d);
            }
        }

        public C10476a(a0f serial, pxb<? super T> child) {
            this.f68183a = serial;
            this.f68184b = child;
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f68185c) {
                return;
            }
            this.f68185c = true;
            onb.this.f68181a.subscribe(new a());
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            if (this.f68185c) {
                ofe.onError(e);
            } else {
                this.f68185c = true;
                this.f68184b.onError(e);
            }
        }

        @Override // p000.pxb
        public void onNext(U t) {
            onComplete();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f68183a.update(d);
        }
    }

    public onb(wub<? extends T> main, wub<U> other) {
        this.f68181a = main;
        this.f68182b = other;
    }

    @Override // p000.vkb
    public void subscribeActual(final pxb<? super T> child) {
        a0f a0fVar = new a0f();
        child.onSubscribe(a0fVar);
        this.f68182b.subscribe(new C10476a(a0fVar, child));
    }
}
