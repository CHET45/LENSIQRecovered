package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class df2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f29550a;

    /* JADX INFO: renamed from: b */
    public final woe f29551b;

    /* JADX INFO: renamed from: df2$a */
    public static final class RunnableC4776a implements ch2, lf4, Runnable {

        /* JADX INFO: renamed from: a */
        public final ch2 f29552a;

        /* JADX INFO: renamed from: b */
        public final woe f29553b;

        /* JADX INFO: renamed from: c */
        public lf4 f29554c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f29555d;

        public RunnableC4776a(ch2 observer, woe scheduler) {
            this.f29552a = observer;
            this.f29553b = scheduler;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f29555d = true;
            this.f29553b.scheduleDirect(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f29555d;
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            if (this.f29555d) {
                return;
            }
            this.f29552a.onComplete();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            if (this.f29555d) {
                ofe.onError(e);
            } else {
                this.f29552a.onError(e);
            }
        }

        @Override // p000.ch2
        public void onSubscribe(final lf4 d) {
            if (zf4.validate(this.f29554c, d)) {
                this.f29554c = d;
                this.f29552a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29554c.dispose();
            this.f29554c = zf4.DISPOSED;
        }
    }

    public df2(ph2 source, woe scheduler) {
        this.f29550a = source;
        this.f29551b = scheduler;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        this.f29550a.subscribe(new RunnableC4776a(observer, this.f29551b));
    }
}
