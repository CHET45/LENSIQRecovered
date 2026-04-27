package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class xk6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f98268c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f98269d;

    /* JADX INFO: renamed from: e */
    public final voe f98270e;

    /* JADX INFO: renamed from: f */
    public final zjd<? extends T> f98271f;

    /* JADX INFO: renamed from: xk6$a */
    public static final class C15166a<T> implements lj6<T> {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f98272a;

        /* JADX INFO: renamed from: b */
        public final hdg f98273b;

        public C15166a(ycg<? super T> ycgVar, hdg hdgVar) {
            this.f98272a = ycgVar;
            this.f98273b = hdgVar;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f98272a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f98272a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f98272a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            this.f98273b.setSubscription(fdgVar);
        }
    }

    /* JADX INFO: renamed from: xk6$b */
    public static final class C15167b<T> extends hdg implements lj6<T>, InterfaceC15169d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: F */
        public final ycg<? super T> f98274F;

        /* JADX INFO: renamed from: H */
        public final long f98275H;

        /* JADX INFO: renamed from: L */
        public final TimeUnit f98276L;

        /* JADX INFO: renamed from: M */
        public final voe.AbstractC14185c f98277M;

        /* JADX INFO: renamed from: N */
        public final b0f f98278N;

        /* JADX INFO: renamed from: Q */
        public final AtomicReference<fdg> f98279Q;

        /* JADX INFO: renamed from: X */
        public final AtomicLong f98280X;

        /* JADX INFO: renamed from: Y */
        public long f98281Y;

        /* JADX INFO: renamed from: Z */
        public zjd<? extends T> f98282Z;

        public C15167b(ycg<? super T> ycgVar, long j, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c, zjd<? extends T> zjdVar) {
            super(true);
            this.f98274F = ycgVar;
            this.f98275H = j;
            this.f98276L = timeUnit;
            this.f98277M = abstractC14185c;
            this.f98282Z = zjdVar;
            this.f98278N = new b0f();
            this.f98279Q = new AtomicReference<>();
            this.f98280X = new AtomicLong();
        }

        /* JADX INFO: renamed from: c */
        public void m25252c(long j) {
            this.f98278N.replace(this.f98277M.schedule(new RunnableC15170e(j, this), this.f98275H, this.f98276L));
        }

        @Override // p000.hdg, p000.fdg
        public void cancel() {
            super.cancel();
            this.f98277M.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f98280X.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f98278N.dispose();
                this.f98274F.onComplete();
                this.f98277M.dispose();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f98280X.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                pfe.onError(th);
                return;
            }
            this.f98278N.dispose();
            this.f98274F.onError(th);
            this.f98277M.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = this.f98280X.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.f98280X.compareAndSet(j, j2)) {
                    this.f98278N.get().dispose();
                    this.f98281Y++;
                    this.f98274F.onNext(t);
                    m25252c(j2);
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.setOnce(this.f98279Q, fdgVar)) {
                setSubscription(fdgVar);
            }
        }

        @Override // p000.xk6.InterfaceC15169d
        public void onTimeout(long j) {
            if (this.f98280X.compareAndSet(j, Long.MAX_VALUE)) {
                mdg.cancel(this.f98279Q);
                long j2 = this.f98281Y;
                if (j2 != 0) {
                    produced(j2);
                }
                zjd<? extends T> zjdVar = this.f98282Z;
                this.f98282Z = null;
                zjdVar.subscribe(new C15166a(this.f98274F, this));
                this.f98277M.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: xk6$c */
    public static final class C15168c<T> extends AtomicLong implements lj6<T>, fdg, InterfaceC15169d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f98283a;

        /* JADX INFO: renamed from: b */
        public final long f98284b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f98285c;

        /* JADX INFO: renamed from: d */
        public final voe.AbstractC14185c f98286d;

        /* JADX INFO: renamed from: e */
        public final b0f f98287e = new b0f();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<fdg> f98288f = new AtomicReference<>();

        /* JADX INFO: renamed from: m */
        public final AtomicLong f98289m = new AtomicLong();

        public C15168c(ycg<? super T> ycgVar, long j, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c) {
            this.f98283a = ycgVar;
            this.f98284b = j;
            this.f98285c = timeUnit;
            this.f98286d = abstractC14185c;
        }

        /* JADX INFO: renamed from: a */
        public void m25253a(long j) {
            this.f98287e.replace(this.f98286d.schedule(new RunnableC15170e(j, this), this.f98284b, this.f98285c));
        }

        @Override // p000.fdg
        public void cancel() {
            mdg.cancel(this.f98288f);
            this.f98286d.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f98287e.dispose();
                this.f98283a.onComplete();
                this.f98286d.dispose();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                pfe.onError(th);
                return;
            }
            this.f98287e.dispose();
            this.f98283a.onError(th);
            this.f98286d.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.f98287e.get().dispose();
                    this.f98283a.onNext(t);
                    m25253a(j2);
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.deferredSetOnce(this.f98288f, this.f98289m, fdgVar);
        }

        @Override // p000.xk6.InterfaceC15169d
        public void onTimeout(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                mdg.cancel(this.f98288f);
                this.f98283a.onError(new TimeoutException(j75.timeoutMessage(this.f98284b, this.f98285c)));
                this.f98286d.dispose();
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            mdg.deferredRequest(this.f98288f, this.f98289m, j);
        }
    }

    /* JADX INFO: renamed from: xk6$d */
    public interface InterfaceC15169d {
        void onTimeout(long j);
    }

    /* JADX INFO: renamed from: xk6$e */
    public static final class RunnableC15170e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC15169d f98290a;

        /* JADX INFO: renamed from: b */
        public final long f98291b;

        public RunnableC15170e(long j, InterfaceC15169d interfaceC15169d) {
            this.f98291b = j;
            this.f98290a = interfaceC15169d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f98290a.onTimeout(this.f98291b);
        }
    }

    public xk6(m86<T> m86Var, long j, TimeUnit timeUnit, voe voeVar, zjd<? extends T> zjdVar) {
        super(m86Var);
        this.f98268c = j;
        this.f98269d = timeUnit;
        this.f98270e = voeVar;
        this.f98271f = zjdVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        if (this.f98271f == null) {
            C15168c c15168c = new C15168c(ycgVar, this.f98268c, this.f98269d, this.f98270e.createWorker());
            ycgVar.onSubscribe(c15168c);
            c15168c.m25253a(0L);
            this.f52360b.subscribe((lj6) c15168c);
            return;
        }
        C15167b c15167b = new C15167b(ycgVar, this.f98268c, this.f98269d, this.f98270e.createWorker(), this.f98271f);
        ycgVar.onSubscribe(c15167b);
        c15167b.m25252c(0L);
        this.f52360b.subscribe((lj6) c15167b);
    }
}
