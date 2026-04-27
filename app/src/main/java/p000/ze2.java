package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ze2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f104877a;

    /* JADX INFO: renamed from: b */
    public final long f104878b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f104879c;

    /* JADX INFO: renamed from: d */
    public final woe f104880d;

    /* JADX INFO: renamed from: e */
    public final boolean f104881e;

    /* JADX INFO: renamed from: ze2$a */
    public static final class RunnableC16101a extends AtomicReference<lf4> implements ch2, Runnable, lf4 {
        private static final long serialVersionUID = 465972761105851022L;

        /* JADX INFO: renamed from: a */
        public final ch2 f104882a;

        /* JADX INFO: renamed from: b */
        public final long f104883b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f104884c;

        /* JADX INFO: renamed from: d */
        public final woe f104885d;

        /* JADX INFO: renamed from: e */
        public final boolean f104886e;

        /* JADX INFO: renamed from: f */
        public Throwable f104887f;

        public RunnableC16101a(ch2 downstream, long delay, TimeUnit unit, woe scheduler, boolean delayError) {
            this.f104882a = downstream;
            this.f104883b = delay;
            this.f104884c = unit;
            this.f104885d = scheduler;
            this.f104886e = delayError;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            zf4.replace(this, this.f104885d.scheduleDirect(this, this.f104883b, this.f104884c));
        }

        @Override // p000.ch2
        public void onError(final Throwable e) {
            this.f104887f = e;
            zf4.replace(this, this.f104885d.scheduleDirect(this, this.f104886e ? this.f104883b : 0L, this.f104884c));
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f104882a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f104887f;
            this.f104887f = null;
            if (th != null) {
                this.f104882a.onError(th);
            } else {
                this.f104882a.onComplete();
            }
        }
    }

    public ze2(ph2 source, long delay, TimeUnit unit, woe scheduler, boolean delayError) {
        this.f104877a = source;
        this.f104878b = delay;
        this.f104879c = unit;
        this.f104880d = scheduler;
        this.f104881e = delayError;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        this.f104877a.subscribe(new RunnableC16101a(observer, this.f104878b, this.f104879c, this.f104880d, this.f104881e));
    }
}
