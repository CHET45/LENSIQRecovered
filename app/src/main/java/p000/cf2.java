package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class cf2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f16400a;

    /* JADX INFO: renamed from: b */
    public final voe f16401b;

    /* JADX INFO: renamed from: cf2$a */
    public static final class RunnableC2296a implements dh2, mf4, Runnable {

        /* JADX INFO: renamed from: a */
        public final dh2 f16402a;

        /* JADX INFO: renamed from: b */
        public final voe f16403b;

        /* JADX INFO: renamed from: c */
        public mf4 f16404c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f16405d;

        public RunnableC2296a(dh2 dh2Var, voe voeVar) {
            this.f16402a = dh2Var;
            this.f16403b = voeVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f16405d = true;
            this.f16403b.scheduleDirect(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f16405d;
        }

        @Override // p000.dh2
        public void onComplete() {
            if (this.f16405d) {
                return;
            }
            this.f16402a.onComplete();
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            if (this.f16405d) {
                pfe.onError(th);
            } else {
                this.f16402a.onError(th);
            }
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f16404c, mf4Var)) {
                this.f16404c = mf4Var;
                this.f16402a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16404c.dispose();
            this.f16404c = ag4.DISPOSED;
        }
    }

    public cf2(qh2 qh2Var, voe voeVar) {
        this.f16400a = qh2Var;
        this.f16401b = voeVar;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f16400a.subscribe(new RunnableC2296a(dh2Var, this.f16401b));
    }
}
