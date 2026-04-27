package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class yk6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f101898c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f101899d;

    /* JADX INFO: renamed from: e */
    public final woe f101900e;

    /* JADX INFO: renamed from: f */
    public final zjd<? extends T> f101901f;

    /* JADX INFO: renamed from: yk6$a */
    public static final class C15702a<T> implements kj6<T> {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f101902a;

        /* JADX INFO: renamed from: b */
        public final gdg f101903b;

        public C15702a(ycg<? super T> actual, gdg arbiter) {
            this.f101902a = actual;
            this.f101903b = arbiter;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f101902a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f101902a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f101902a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            this.f101903b.setSubscription(s);
        }
    }

    /* JADX INFO: renamed from: yk6$b */
    public static final class C15703b<T> extends gdg implements kj6<T>, InterfaceC15705d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: F */
        public final ycg<? super T> f101904F;

        /* JADX INFO: renamed from: H */
        public final long f101905H;

        /* JADX INFO: renamed from: L */
        public final TimeUnit f101906L;

        /* JADX INFO: renamed from: M */
        public final woe.AbstractC14729c f101907M;

        /* JADX INFO: renamed from: N */
        public final a0f f101908N;

        /* JADX INFO: renamed from: Q */
        public final AtomicReference<fdg> f101909Q;

        /* JADX INFO: renamed from: X */
        public final AtomicLong f101910X;

        /* JADX INFO: renamed from: Y */
        public long f101911Y;

        /* JADX INFO: renamed from: Z */
        public zjd<? extends T> f101912Z;

        public C15703b(ycg<? super T> actual, long timeout, TimeUnit unit, woe.AbstractC14729c worker, zjd<? extends T> fallback) {
            super(true);
            this.f101904F = actual;
            this.f101905H = timeout;
            this.f101906L = unit;
            this.f101907M = worker;
            this.f101912Z = fallback;
            this.f101908N = new a0f();
            this.f101909Q = new AtomicReference<>();
            this.f101910X = new AtomicLong();
        }

        /* JADX INFO: renamed from: c */
        public void m26161c(long nextIndex) {
            this.f101908N.replace(this.f101907M.schedule(new RunnableC15706e(nextIndex, this), this.f101905H, this.f101906L));
        }

        @Override // p000.gdg, p000.fdg
        public void cancel() {
            super.cancel();
            this.f101907M.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f101910X.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f101908N.dispose();
                this.f101904F.onComplete();
                this.f101907M.dispose();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f101910X.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                ofe.onError(t);
                return;
            }
            this.f101908N.dispose();
            this.f101904F.onError(t);
            this.f101907M.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = this.f101910X.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.f101910X.compareAndSet(j, j2)) {
                    this.f101908N.get().dispose();
                    this.f101911Y++;
                    this.f101904F.onNext(t);
                    m26161c(j2);
                }
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.setOnce(this.f101909Q, s)) {
                setSubscription(s);
            }
        }

        @Override // p000.yk6.InterfaceC15705d
        public void onTimeout(long idx) {
            if (this.f101910X.compareAndSet(idx, Long.MAX_VALUE)) {
                ldg.cancel(this.f101909Q);
                long j = this.f101911Y;
                if (j != 0) {
                    produced(j);
                }
                zjd<? extends T> zjdVar = this.f101912Z;
                this.f101912Z = null;
                zjdVar.subscribe(new C15702a(this.f101904F, this));
                this.f101907M.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: yk6$c */
    public static final class C15704c<T> extends AtomicLong implements kj6<T>, fdg, InterfaceC15705d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f101913a;

        /* JADX INFO: renamed from: b */
        public final long f101914b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f101915c;

        /* JADX INFO: renamed from: d */
        public final woe.AbstractC14729c f101916d;

        /* JADX INFO: renamed from: e */
        public final a0f f101917e = new a0f();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<fdg> f101918f = new AtomicReference<>();

        /* JADX INFO: renamed from: m */
        public final AtomicLong f101919m = new AtomicLong();

        public C15704c(ycg<? super T> actual, long timeout, TimeUnit unit, woe.AbstractC14729c worker) {
            this.f101913a = actual;
            this.f101914b = timeout;
            this.f101915c = unit;
            this.f101916d = worker;
        }

        /* JADX INFO: renamed from: a */
        public void m26162a(long nextIndex) {
            this.f101917e.replace(this.f101916d.schedule(new RunnableC15706e(nextIndex, this), this.f101914b, this.f101915c));
        }

        @Override // p000.fdg
        public void cancel() {
            ldg.cancel(this.f101918f);
            this.f101916d.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f101917e.dispose();
                this.f101913a.onComplete();
                this.f101916d.dispose();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                ofe.onError(t);
                return;
            }
            this.f101917e.dispose();
            this.f101913a.onError(t);
            this.f101916d.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.f101917e.get().dispose();
                    this.f101913a.onNext(t);
                    m26162a(j2);
                }
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.deferredSetOnce(this.f101918f, this.f101919m, s);
        }

        @Override // p000.yk6.InterfaceC15705d
        public void onTimeout(long idx) {
            if (compareAndSet(idx, Long.MAX_VALUE)) {
                ldg.cancel(this.f101918f);
                this.f101913a.onError(new TimeoutException(k75.timeoutMessage(this.f101914b, this.f101915c)));
                this.f101916d.dispose();
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            ldg.deferredRequest(this.f101918f, this.f101919m, n);
        }
    }

    /* JADX INFO: renamed from: yk6$d */
    public interface InterfaceC15705d {
        void onTimeout(long idx);
    }

    /* JADX INFO: renamed from: yk6$e */
    public static final class RunnableC15706e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC15705d f101920a;

        /* JADX INFO: renamed from: b */
        public final long f101921b;

        public RunnableC15706e(long idx, InterfaceC15705d parent) {
            this.f101921b = idx;
            this.f101920a = parent;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f101920a.onTimeout(this.f101921b);
        }
    }

    public yk6(l86<T> source, long timeout, TimeUnit unit, woe scheduler, zjd<? extends T> other) {
        super(source);
        this.f101898c = timeout;
        this.f101899d = unit;
        this.f101900e = scheduler;
        this.f101901f = other;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        if (this.f101901f == null) {
            C15704c c15704c = new C15704c(s, this.f101898c, this.f101899d, this.f101900e.createWorker());
            s.onSubscribe(c15704c);
            c15704c.m26162a(0L);
            this.f49321b.subscribe((kj6) c15704c);
            return;
        }
        C15703b c15703b = new C15703b(s, this.f101898c, this.f101899d, this.f101900e.createWorker(), this.f101901f);
        s.onSubscribe(c15703b);
        c15703b.m26161c(0L);
        this.f49321b.subscribe((kj6) c15703b);
    }
}
