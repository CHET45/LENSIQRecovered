package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class inb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f47599b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f47600c;

    /* JADX INFO: renamed from: d */
    public final woe f47601d;

    /* JADX INFO: renamed from: inb$a */
    public static final class RunnableC7519a<T> extends AtomicReference<lf4> implements Runnable, lf4 {
        private static final long serialVersionUID = 6812032969491025141L;

        /* JADX INFO: renamed from: a */
        public final T f47602a;

        /* JADX INFO: renamed from: b */
        public final long f47603b;

        /* JADX INFO: renamed from: c */
        public final C7520b<T> f47604c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f47605d = new AtomicBoolean();

        public RunnableC7519a(T value, long idx, C7520b<T> parent) {
            this.f47602a = value;
            this.f47603b = idx;
            this.f47604c = parent;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == zf4.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f47605d.compareAndSet(false, true)) {
                this.f47604c.m13217a(this.f47603b, this.f47602a, this);
            }
        }

        public void setResource(lf4 d) {
            zf4.replace(this, d);
        }
    }

    /* JADX INFO: renamed from: inb$b */
    public static final class C7520b<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: C */
        public boolean f47606C;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f47607a;

        /* JADX INFO: renamed from: b */
        public final long f47608b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f47609c;

        /* JADX INFO: renamed from: d */
        public final woe.AbstractC14729c f47610d;

        /* JADX INFO: renamed from: e */
        public lf4 f47611e;

        /* JADX INFO: renamed from: f */
        public lf4 f47612f;

        /* JADX INFO: renamed from: m */
        public volatile long f47613m;

        public C7520b(pxb<? super T> actual, long timeout, TimeUnit unit, woe.AbstractC14729c worker) {
            this.f47607a = actual;
            this.f47608b = timeout;
            this.f47609c = unit;
            this.f47610d = worker;
        }

        /* JADX INFO: renamed from: a */
        public void m13217a(long idx, T t, RunnableC7519a<T> emitter) {
            if (idx == this.f47613m) {
                this.f47607a.onNext(t);
                emitter.dispose();
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f47611e.dispose();
            this.f47610d.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f47610d.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f47606C) {
                return;
            }
            this.f47606C = true;
            lf4 lf4Var = this.f47612f;
            if (lf4Var != null) {
                lf4Var.dispose();
            }
            RunnableC7519a runnableC7519a = (RunnableC7519a) lf4Var;
            if (runnableC7519a != null) {
                runnableC7519a.run();
            }
            this.f47607a.onComplete();
            this.f47610d.dispose();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f47606C) {
                ofe.onError(t);
                return;
            }
            lf4 lf4Var = this.f47612f;
            if (lf4Var != null) {
                lf4Var.dispose();
            }
            this.f47606C = true;
            this.f47607a.onError(t);
            this.f47610d.dispose();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f47606C) {
                return;
            }
            long j = this.f47613m + 1;
            this.f47613m = j;
            lf4 lf4Var = this.f47612f;
            if (lf4Var != null) {
                lf4Var.dispose();
            }
            RunnableC7519a runnableC7519a = new RunnableC7519a(t, j, this);
            this.f47612f = runnableC7519a;
            runnableC7519a.setResource(this.f47610d.schedule(runnableC7519a, this.f47608b, this.f47609c));
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f47611e, d)) {
                this.f47611e = d;
                this.f47607a.onSubscribe(this);
            }
        }
    }

    public inb(wub<T> source, long timeout, TimeUnit unit, woe scheduler) {
        super(source);
        this.f47599b = timeout;
        this.f47600c = unit;
        this.f47601d = scheduler;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        this.f63101a.subscribe(new C7520b(new m1f(t), this.f47599b, this.f47600c, this.f47601d.createWorker()));
    }
}
