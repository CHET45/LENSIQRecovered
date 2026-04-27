package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class awb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f12024b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f12025c;

    /* JADX INFO: renamed from: d */
    public final woe f12026d;

    /* JADX INFO: renamed from: awb$a */
    public static final class RunnableC1632a<T> extends AtomicReference<lf4> implements pxb<T>, lf4, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f12027a;

        /* JADX INFO: renamed from: b */
        public final long f12028b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f12029c;

        /* JADX INFO: renamed from: d */
        public final woe.AbstractC14729c f12030d;

        /* JADX INFO: renamed from: e */
        public lf4 f12031e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f12032f;

        public RunnableC1632a(pxb<? super T> actual, long timeout, TimeUnit unit, woe.AbstractC14729c worker) {
            this.f12027a = actual;
            this.f12028b = timeout;
            this.f12029c = unit;
            this.f12030d = worker;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f12031e.dispose();
            this.f12030d.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f12030d.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f12027a.onComplete();
            this.f12030d.dispose();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f12027a.onError(t);
            this.f12030d.dispose();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f12032f) {
                return;
            }
            this.f12032f = true;
            this.f12027a.onNext(t);
            lf4 lf4Var = get();
            if (lf4Var != null) {
                lf4Var.dispose();
            }
            zf4.replace(this, this.f12030d.schedule(this, this.f12028b, this.f12029c));
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f12031e, d)) {
                this.f12031e = d;
                this.f12027a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12032f = false;
        }
    }

    public awb(wub<T> source, long timeout, TimeUnit unit, woe scheduler) {
        super(source);
        this.f12024b = timeout;
        this.f12025c = unit;
        this.f12026d = scheduler;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        this.f63101a.subscribe(new RunnableC1632a(new m1f(t), this.f12024b, this.f12025c, this.f12026d.createWorker()));
    }
}
