package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class db6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f29186c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f29187d;

    /* JADX INFO: renamed from: e */
    public final woe f29188e;

    /* JADX INFO: renamed from: db6$a */
    public static final class RunnableC4723a<T> extends AtomicReference<lf4> implements Runnable, lf4 {
        private static final long serialVersionUID = 6812032969491025141L;

        /* JADX INFO: renamed from: a */
        public final T f29189a;

        /* JADX INFO: renamed from: b */
        public final long f29190b;

        /* JADX INFO: renamed from: c */
        public final C4724b<T> f29191c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f29192d = new AtomicBoolean();

        public RunnableC4723a(T value, long idx, C4724b<T> parent) {
            this.f29189a = value;
            this.f29190b = idx;
            this.f29191c = parent;
        }

        /* JADX INFO: renamed from: a */
        public void m9043a() {
            if (this.f29192d.compareAndSet(false, true)) {
                this.f29191c.m9044a(this.f29190b, this.f29189a, this);
            }
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
            m9043a();
        }

        public void setResource(lf4 d) {
            zf4.replace(this, d);
        }
    }

    /* JADX INFO: renamed from: db6$b */
    public static final class C4724b<T> extends AtomicLong implements kj6<T>, fdg {
        private static final long serialVersionUID = -9102637559663639004L;

        /* JADX INFO: renamed from: C */
        public boolean f29193C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f29194a;

        /* JADX INFO: renamed from: b */
        public final long f29195b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f29196c;

        /* JADX INFO: renamed from: d */
        public final woe.AbstractC14729c f29197d;

        /* JADX INFO: renamed from: e */
        public fdg f29198e;

        /* JADX INFO: renamed from: f */
        public lf4 f29199f;

        /* JADX INFO: renamed from: m */
        public volatile long f29200m;

        public C4724b(ycg<? super T> actual, long timeout, TimeUnit unit, woe.AbstractC14729c worker) {
            this.f29194a = actual;
            this.f29195b = timeout;
            this.f29196c = unit;
            this.f29197d = worker;
        }

        /* JADX INFO: renamed from: a */
        public void m9044a(long idx, T t, RunnableC4723a<T> emitter) {
            if (idx == this.f29200m) {
                if (get() == 0) {
                    cancel();
                    this.f29194a.onError(new bwa("Could not deliver value due to lack of requests"));
                } else {
                    this.f29194a.onNext(t);
                    ro0.produced(this, 1L);
                    emitter.dispose();
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f29198e.cancel();
            this.f29197d.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f29193C) {
                return;
            }
            this.f29193C = true;
            lf4 lf4Var = this.f29199f;
            if (lf4Var != null) {
                lf4Var.dispose();
            }
            RunnableC4723a runnableC4723a = (RunnableC4723a) lf4Var;
            if (runnableC4723a != null) {
                runnableC4723a.m9043a();
            }
            this.f29194a.onComplete();
            this.f29197d.dispose();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f29193C) {
                ofe.onError(t);
                return;
            }
            this.f29193C = true;
            lf4 lf4Var = this.f29199f;
            if (lf4Var != null) {
                lf4Var.dispose();
            }
            this.f29194a.onError(t);
            this.f29197d.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f29193C) {
                return;
            }
            long j = this.f29200m + 1;
            this.f29200m = j;
            lf4 lf4Var = this.f29199f;
            if (lf4Var != null) {
                lf4Var.dispose();
            }
            RunnableC4723a runnableC4723a = new RunnableC4723a(t, j, this);
            this.f29199f = runnableC4723a;
            runnableC4723a.setResource(this.f29197d.schedule(runnableC4723a, this.f29195b, this.f29196c));
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f29198e, s)) {
                this.f29198e = s;
                this.f29194a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this, n);
            }
        }
    }

    public db6(l86<T> source, long timeout, TimeUnit unit, woe scheduler) {
        super(source);
        this.f29186c = timeout;
        this.f29187d = unit;
        this.f29188e = scheduler;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C4724b(new u1f(s), this.f29186c, this.f29187d, this.f29188e.createWorker()));
    }
}
