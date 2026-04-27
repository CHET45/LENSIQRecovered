package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class cwb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f27933b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f27934c;

    /* JADX INFO: renamed from: d */
    public final woe f27935d;

    /* JADX INFO: renamed from: e */
    public final boolean f27936e;

    /* JADX INFO: renamed from: cwb$a */
    public static final class RunnableC4543a<T> extends AtomicInteger implements pxb<T>, lf4, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f27937C;

        /* JADX INFO: renamed from: F */
        public Throwable f27938F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f27939H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f27940L;

        /* JADX INFO: renamed from: M */
        public boolean f27941M;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f27942a;

        /* JADX INFO: renamed from: b */
        public final long f27943b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f27944c;

        /* JADX INFO: renamed from: d */
        public final woe.AbstractC14729c f27945d;

        /* JADX INFO: renamed from: e */
        public final boolean f27946e;

        /* JADX INFO: renamed from: f */
        public final AtomicReference<T> f27947f = new AtomicReference<>();

        /* JADX INFO: renamed from: m */
        public lf4 f27948m;

        public RunnableC4543a(pxb<? super T> downstream, long timeout, TimeUnit unit, woe.AbstractC14729c worker, boolean emitLast) {
            this.f27942a = downstream;
            this.f27943b = timeout;
            this.f27944c = unit;
            this.f27945d = worker;
            this.f27946e = emitLast;
        }

        /* JADX INFO: renamed from: a */
        public void m8765a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f27947f;
            pxb<? super T> pxbVar = this.f27942a;
            int iAddAndGet = 1;
            while (!this.f27939H) {
                boolean z = this.f27937C;
                if (z && this.f27938F != null) {
                    atomicReference.lazySet(null);
                    pxbVar.onError(this.f27938F);
                    this.f27945d.dispose();
                    return;
                }
                boolean z2 = atomicReference.get() == null;
                if (z) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z2 && this.f27946e) {
                        pxbVar.onNext(andSet);
                    }
                    pxbVar.onComplete();
                    this.f27945d.dispose();
                    return;
                }
                if (z2) {
                    if (this.f27940L) {
                        this.f27941M = false;
                        this.f27940L = false;
                    }
                } else if (!this.f27941M || this.f27940L) {
                    pxbVar.onNext(atomicReference.getAndSet(null));
                    this.f27940L = false;
                    this.f27941M = true;
                    this.f27945d.schedule(this, this.f27943b, this.f27944c);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // p000.lf4
        public void dispose() {
            this.f27939H = true;
            this.f27948m.dispose();
            this.f27945d.dispose();
            if (getAndIncrement() == 0) {
                this.f27947f.lazySet(null);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f27939H;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f27937C = true;
            m8765a();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f27938F = t;
            this.f27937C = true;
            m8765a();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f27947f.set(t);
            m8765a();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f27948m, d)) {
                this.f27948m = d;
                this.f27942a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27940L = true;
            m8765a();
        }
    }

    public cwb(vkb<T> source, long timeout, TimeUnit unit, woe scheduler, boolean emitLast) {
        super(source);
        this.f27933b = timeout;
        this.f27934c = unit;
        this.f27935d = scheduler;
        this.f27936e = emitLast;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new RunnableC4543a(observer, this.f27933b, this.f27934c, this.f27935d.createWorker(), this.f27936e));
    }
}
