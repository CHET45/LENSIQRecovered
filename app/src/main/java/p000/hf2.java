package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class hf2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f43358a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super Throwable> f43359b;

    /* JADX INFO: renamed from: hf2$a */
    public final class C6834a implements ch2 {

        /* JADX INFO: renamed from: a */
        public final ch2 f43360a;

        public C6834a(ch2 observer) {
            this.f43360a = observer;
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            try {
                hf2.this.f43359b.accept(null);
                this.f43360a.onComplete();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f43360a.onError(th);
            }
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            try {
                hf2.this.f43359b.accept(e);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                e = new qm2(e, th);
            }
            this.f43360a.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(final lf4 d) {
            this.f43360a.onSubscribe(d);
        }
    }

    public hf2(final ph2 source, final uu2<? super Throwable> onEvent) {
        this.f43358a = source;
        this.f43359b = onEvent;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        this.f43358a.subscribe(new C6834a(observer));
    }
}
