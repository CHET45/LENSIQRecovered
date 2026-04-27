package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class di6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f29693c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f29694d;

    /* JADX INFO: renamed from: e */
    public final woe f29695e;

    /* JADX INFO: renamed from: f */
    public final boolean f29696f;

    /* JADX INFO: renamed from: di6$a */
    public static final class C4793a<T> extends AbstractRunnableC4795c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* JADX INFO: renamed from: C */
        public final AtomicInteger f29697C;

        public C4793a(ycg<? super T> actual, long period, TimeUnit unit, woe scheduler) {
            super(actual, period, unit, scheduler);
            this.f29697C = new AtomicInteger(1);
        }

        @Override // p000.di6.AbstractRunnableC4795c
        /* JADX INFO: renamed from: b */
        public void mo9174b() {
            m9176c();
            if (this.f29697C.decrementAndGet() == 0) {
                this.f29698a.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29697C.incrementAndGet() == 2) {
                m9176c();
                if (this.f29697C.decrementAndGet() == 0) {
                    this.f29698a.onComplete();
                }
            }
        }
    }

    /* JADX INFO: renamed from: di6$b */
    public static final class C4794b<T> extends AbstractRunnableC4795c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public C4794b(ycg<? super T> actual, long period, TimeUnit unit, woe scheduler) {
            super(actual, period, unit, scheduler);
        }

        @Override // p000.di6.AbstractRunnableC4795c
        /* JADX INFO: renamed from: b */
        public void mo9174b() {
            this.f29698a.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            m9176c();
        }
    }

    /* JADX INFO: renamed from: di6$c */
    public static abstract class AbstractRunnableC4795c<T> extends AtomicReference<T> implements kj6<T>, fdg, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f29698a;

        /* JADX INFO: renamed from: b */
        public final long f29699b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f29700c;

        /* JADX INFO: renamed from: d */
        public final woe f29701d;

        /* JADX INFO: renamed from: e */
        public final AtomicLong f29702e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final a0f f29703f = new a0f();

        /* JADX INFO: renamed from: m */
        public fdg f29704m;

        public AbstractRunnableC4795c(ycg<? super T> actual, long period, TimeUnit unit, woe scheduler) {
            this.f29698a = actual;
            this.f29699b = period;
            this.f29700c = unit;
            this.f29701d = scheduler;
        }

        /* JADX INFO: renamed from: a */
        public void m9175a() {
            zf4.dispose(this.f29703f);
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo9174b();

        /* JADX INFO: renamed from: c */
        public void m9176c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.f29702e.get() != 0) {
                    this.f29698a.onNext(andSet);
                    ro0.produced(this.f29702e, 1L);
                } else {
                    cancel();
                    this.f29698a.onError(new bwa("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            m9175a();
            this.f29704m.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            m9175a();
            mo9174b();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            m9175a();
            this.f29698a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f29704m, s)) {
                this.f29704m = s;
                this.f29698a.onSubscribe(this);
                a0f a0fVar = this.f29703f;
                woe woeVar = this.f29701d;
                long j = this.f29699b;
                a0fVar.replace(woeVar.schedulePeriodicallyDirect(this, j, j, this.f29700c));
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f29702e, n);
            }
        }
    }

    public di6(l86<T> source, long period, TimeUnit unit, woe scheduler, boolean emitLast) {
        super(source);
        this.f29693c = period;
        this.f29694d = unit;
        this.f29695e = scheduler;
        this.f29696f = emitLast;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        u1f u1fVar = new u1f(s);
        if (this.f29696f) {
            this.f49321b.subscribe((kj6) new C4793a(u1fVar, this.f29693c, this.f29694d, this.f29695e));
        } else {
            this.f49321b.subscribe((kj6) new C4794b(u1fVar, this.f29693c, this.f29694d, this.f29695e));
        }
    }
}
