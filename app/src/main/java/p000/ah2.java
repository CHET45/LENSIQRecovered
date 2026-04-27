package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ah2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f1607a;

    /* JADX INFO: renamed from: b */
    public final voe f1608b;

    /* JADX INFO: renamed from: ah2$a */
    public static final class RunnableC0247a extends AtomicReference<mf4> implements dh2, mf4, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: a */
        public final dh2 f1609a;

        /* JADX INFO: renamed from: b */
        public final voe f1610b;

        /* JADX INFO: renamed from: c */
        public Throwable f1611c;

        public RunnableC0247a(dh2 dh2Var, voe voeVar) {
            this.f1609a = dh2Var;
            this.f1610b = voeVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.dh2
        public void onComplete() {
            ag4.replace(this, this.f1610b.scheduleDirect(this));
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f1611c = th;
            ag4.replace(this, this.f1610b.scheduleDirect(this));
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f1609a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f1611c;
            if (th == null) {
                this.f1609a.onComplete();
            } else {
                this.f1611c = null;
                this.f1609a.onError(th);
            }
        }
    }

    public ah2(qh2 qh2Var, voe voeVar) {
        this.f1607a = qh2Var;
        this.f1608b = voeVar;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f1607a.subscribe(new RunnableC0247a(dh2Var, this.f1608b));
    }
}
