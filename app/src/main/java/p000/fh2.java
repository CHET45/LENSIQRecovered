package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class fh2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f36569a;

    /* JADX INFO: renamed from: b */
    public final n8d<? super Throwable> f36570b;

    /* JADX INFO: renamed from: fh2$a */
    public final class C5802a implements ch2 {

        /* JADX INFO: renamed from: a */
        public final ch2 f36571a;

        public C5802a(ch2 observer) {
            this.f36571a = observer;
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f36571a.onComplete();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            try {
                if (fh2.this.f36570b.test(e)) {
                    this.f36571a.onComplete();
                } else {
                    this.f36571a.onError(e);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f36571a.onError(new qm2(e, th));
            }
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            this.f36571a.onSubscribe(d);
        }
    }

    public fh2(ph2 source, n8d<? super Throwable> predicate) {
        this.f36569a = source;
        this.f36570b = predicate;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        this.f36569a.subscribe(new C5802a(observer));
    }
}
