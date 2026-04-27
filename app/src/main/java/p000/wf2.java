package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class wf2<T> extends xd2 {

    /* JADX INFO: renamed from: a */
    public final wub<T> f94063a;

    /* JADX INFO: renamed from: wf2$a */
    public static final class C14569a<T> implements pxb<T> {

        /* JADX INFO: renamed from: a */
        public final ch2 f94064a;

        public C14569a(ch2 co) {
            this.f94064a = co;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f94064a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            this.f94064a.onError(e);
        }

        @Override // p000.pxb
        public void onNext(T value) {
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f94064a.onSubscribe(d);
        }
    }

    public wf2(wub<T> observable) {
        this.f94063a = observable;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        this.f94063a.subscribe(new C14569a(observer));
    }
}
