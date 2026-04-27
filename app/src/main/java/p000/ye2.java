package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ye2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f101278a;

    /* JADX INFO: renamed from: b */
    public final long f101279b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f101280c;

    /* JADX INFO: renamed from: d */
    public final voe f101281d;

    /* JADX INFO: renamed from: e */
    public final boolean f101282e;

    /* JADX INFO: renamed from: ye2$a */
    public static final class RunnableC15630a extends AtomicReference<mf4> implements dh2, Runnable, mf4 {
        private static final long serialVersionUID = 465972761105851022L;

        /* JADX INFO: renamed from: a */
        public final dh2 f101283a;

        /* JADX INFO: renamed from: b */
        public final long f101284b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f101285c;

        /* JADX INFO: renamed from: d */
        public final voe f101286d;

        /* JADX INFO: renamed from: e */
        public final boolean f101287e;

        /* JADX INFO: renamed from: f */
        public Throwable f101288f;

        public RunnableC15630a(dh2 dh2Var, long j, TimeUnit timeUnit, voe voeVar, boolean z) {
            this.f101283a = dh2Var;
            this.f101284b = j;
            this.f101285c = timeUnit;
            this.f101286d = voeVar;
            this.f101287e = z;
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
            ag4.replace(this, this.f101286d.scheduleDirect(this, this.f101284b, this.f101285c));
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f101288f = th;
            ag4.replace(this, this.f101286d.scheduleDirect(this, this.f101287e ? this.f101284b : 0L, this.f101285c));
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f101283a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f101288f;
            this.f101288f = null;
            if (th != null) {
                this.f101283a.onError(th);
            } else {
                this.f101283a.onComplete();
            }
        }
    }

    public ye2(qh2 qh2Var, long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        this.f101278a = qh2Var;
        this.f101279b = j;
        this.f101280c = timeUnit;
        this.f101281d = voeVar;
        this.f101282e = z;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f101278a.subscribe(new RunnableC15630a(dh2Var, this.f101279b, this.f101280c, this.f101281d, this.f101282e));
    }
}
