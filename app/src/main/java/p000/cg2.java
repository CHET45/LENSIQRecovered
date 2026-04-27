package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class cg2<T> extends xd2 {

    /* JADX INFO: renamed from: a */
    public final oof<T> f16459a;

    /* JADX INFO: renamed from: cg2$a */
    public static final class C2301a<T> implements hnf<T> {

        /* JADX INFO: renamed from: a */
        public final ch2 f16460a;

        public C2301a(ch2 co) {
            this.f16460a = co;
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f16460a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            this.f16460a.onSubscribe(d);
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f16460a.onComplete();
        }
    }

    public cg2(oof<T> single) {
        this.f16459a = single;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        this.f16459a.subscribe(new C2301a(observer));
    }
}
