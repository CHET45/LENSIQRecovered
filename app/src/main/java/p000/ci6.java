package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ci6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f16611c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f16612d;

    /* JADX INFO: renamed from: e */
    public final voe f16613e;

    /* JADX INFO: renamed from: f */
    public final boolean f16614f;

    /* JADX INFO: renamed from: ci6$a */
    public static final class C2320a<T> extends AbstractRunnableC2322c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* JADX INFO: renamed from: C */
        public final AtomicInteger f16615C;

        public C2320a(ycg<? super T> ycgVar, long j, TimeUnit timeUnit, voe voeVar) {
            super(ycgVar, j, timeUnit, voeVar);
            this.f16615C = new AtomicInteger(1);
        }

        @Override // p000.ci6.AbstractRunnableC2322c
        /* JADX INFO: renamed from: b */
        public void mo3964b() {
            m3966c();
            if (this.f16615C.decrementAndGet() == 0) {
                this.f16616a.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f16615C.incrementAndGet() == 2) {
                m3966c();
                if (this.f16615C.decrementAndGet() == 0) {
                    this.f16616a.onComplete();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ci6$b */
    public static final class C2321b<T> extends AbstractRunnableC2322c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public C2321b(ycg<? super T> ycgVar, long j, TimeUnit timeUnit, voe voeVar) {
            super(ycgVar, j, timeUnit, voeVar);
        }

        @Override // p000.ci6.AbstractRunnableC2322c
        /* JADX INFO: renamed from: b */
        public void mo3964b() {
            this.f16616a.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            m3966c();
        }
    }

    /* JADX INFO: renamed from: ci6$c */
    public static abstract class AbstractRunnableC2322c<T> extends AtomicReference<T> implements lj6<T>, fdg, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f16616a;

        /* JADX INFO: renamed from: b */
        public final long f16617b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f16618c;

        /* JADX INFO: renamed from: d */
        public final voe f16619d;

        /* JADX INFO: renamed from: e */
        public final AtomicLong f16620e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final b0f f16621f = new b0f();

        /* JADX INFO: renamed from: m */
        public fdg f16622m;

        public AbstractRunnableC2322c(ycg<? super T> ycgVar, long j, TimeUnit timeUnit, voe voeVar) {
            this.f16616a = ycgVar;
            this.f16617b = j;
            this.f16618c = timeUnit;
            this.f16619d = voeVar;
        }

        /* JADX INFO: renamed from: a */
        public void m3965a() {
            ag4.dispose(this.f16621f);
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo3964b();

        /* JADX INFO: renamed from: c */
        public void m3966c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.f16620e.get() != 0) {
                    this.f16616a.onNext(andSet);
                    so0.produced(this.f16620e, 1L);
                } else {
                    cancel();
                    this.f16616a.onError(new cwa("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            m3965a();
            this.f16622m.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            m3965a();
            mo3964b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            m3965a();
            this.f16616a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f16622m, fdgVar)) {
                this.f16622m = fdgVar;
                this.f16616a.onSubscribe(this);
                b0f b0fVar = this.f16621f;
                voe voeVar = this.f16619d;
                long j = this.f16617b;
                b0fVar.replace(voeVar.schedulePeriodicallyDirect(this, j, j, this.f16618c));
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f16620e, j);
            }
        }
    }

    public ci6(m86<T> m86Var, long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        super(m86Var);
        this.f16611c = j;
        this.f16612d = timeUnit;
        this.f16613e = voeVar;
        this.f16614f = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        t1f t1fVar = new t1f(ycgVar);
        if (this.f16614f) {
            this.f52360b.subscribe((lj6) new C2320a(t1fVar, this.f16611c, this.f16612d, this.f16613e));
        } else {
            this.f52360b.subscribe((lj6) new C2321b(t1fVar, this.f16611c, this.f16612d, this.f16613e));
        }
    }
}
