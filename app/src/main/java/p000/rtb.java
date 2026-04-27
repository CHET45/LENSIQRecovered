package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class rtb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f79544b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f79545c;

    /* JADX INFO: renamed from: d */
    public final woe f79546d;

    /* JADX INFO: renamed from: e */
    public final boolean f79547e;

    /* JADX INFO: renamed from: rtb$a */
    public static final class C12282a<T> extends AbstractRunnableC12284c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* JADX INFO: renamed from: m */
        public final AtomicInteger f79548m;

        public C12282a(pxb<? super T> actual, long period, TimeUnit unit, woe scheduler) {
            super(actual, period, unit, scheduler);
            this.f79548m = new AtomicInteger(1);
        }

        @Override // p000.rtb.AbstractRunnableC12284c
        /* JADX INFO: renamed from: b */
        public void mo21516b() {
            m21518c();
            if (this.f79548m.decrementAndGet() == 0) {
                this.f79549a.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f79548m.incrementAndGet() == 2) {
                m21518c();
                if (this.f79548m.decrementAndGet() == 0) {
                    this.f79549a.onComplete();
                }
            }
        }
    }

    /* JADX INFO: renamed from: rtb$b */
    public static final class C12283b<T> extends AbstractRunnableC12284c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public C12283b(pxb<? super T> actual, long period, TimeUnit unit, woe scheduler) {
            super(actual, period, unit, scheduler);
        }

        @Override // p000.rtb.AbstractRunnableC12284c
        /* JADX INFO: renamed from: b */
        public void mo21516b() {
            this.f79549a.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            m21518c();
        }
    }

    /* JADX INFO: renamed from: rtb$c */
    public static abstract class AbstractRunnableC12284c<T> extends AtomicReference<T> implements pxb<T>, lf4, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f79549a;

        /* JADX INFO: renamed from: b */
        public final long f79550b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f79551c;

        /* JADX INFO: renamed from: d */
        public final woe f79552d;

        /* JADX INFO: renamed from: e */
        public final AtomicReference<lf4> f79553e = new AtomicReference<>();

        /* JADX INFO: renamed from: f */
        public lf4 f79554f;

        public AbstractRunnableC12284c(pxb<? super T> actual, long period, TimeUnit unit, woe scheduler) {
            this.f79549a = actual;
            this.f79550b = period;
            this.f79551c = unit;
            this.f79552d = scheduler;
        }

        /* JADX INFO: renamed from: a */
        public void m21517a() {
            zf4.dispose(this.f79553e);
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo21516b();

        /* JADX INFO: renamed from: c */
        public void m21518c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f79549a.onNext(andSet);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            m21517a();
            this.f79554f.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f79554f.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            m21517a();
            mo21516b();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            m21517a();
            this.f79549a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f79554f, d)) {
                this.f79554f = d;
                this.f79549a.onSubscribe(this);
                woe woeVar = this.f79552d;
                long j = this.f79550b;
                zf4.replace(this.f79553e, woeVar.schedulePeriodicallyDirect(this, j, j, this.f79551c));
            }
        }
    }

    public rtb(wub<T> source, long period, TimeUnit unit, woe scheduler, boolean emitLast) {
        super(source);
        this.f79544b = period;
        this.f79545c = unit;
        this.f79546d = scheduler;
        this.f79547e = emitLast;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        m1f m1fVar = new m1f(t);
        if (this.f79547e) {
            this.f63101a.subscribe(new C12282a(m1fVar, this.f79544b, this.f79545c, this.f79546d));
        } else {
            this.f63101a.subscribe(new C12283b(m1fVar, this.f79544b, this.f79545c, this.f79546d));
        }
    }
}
