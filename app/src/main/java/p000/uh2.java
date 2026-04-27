package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class uh2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f87993a;

    /* JADX INFO: renamed from: b */
    public final woe f87994b;

    /* JADX INFO: renamed from: uh2$a */
    public static final class RunnableC13541a extends AtomicReference<lf4> implements ch2, lf4, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* JADX INFO: renamed from: a */
        public final ch2 f87995a;

        /* JADX INFO: renamed from: b */
        public final a0f f87996b = new a0f();

        /* JADX INFO: renamed from: c */
        public final ph2 f87997c;

        public RunnableC13541a(ch2 actual, ph2 source) {
            this.f87995a = actual;
            this.f87997c = source;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
            this.f87996b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f87995a.onComplete();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f87995a.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f87997c.subscribe(this);
        }
    }

    public uh2(ph2 source, woe scheduler) {
        this.f87993a = source;
        this.f87994b = scheduler;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        RunnableC13541a runnableC13541a = new RunnableC13541a(observer, this.f87993a);
        observer.onSubscribe(runnableC13541a);
        runnableC13541a.f87996b.replace(this.f87994b.scheduleDirect(runnableC13541a));
    }
}
