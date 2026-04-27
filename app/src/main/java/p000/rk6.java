package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class rk6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f78538c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f78539d;

    /* JADX INFO: renamed from: e */
    public final voe f78540e;

    /* JADX INFO: renamed from: f */
    public final boolean f78541f;

    /* JADX INFO: renamed from: rk6$a */
    public static final class RunnableC12127a<T> extends AtomicInteger implements lj6<T>, fdg, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;

        /* JADX INFO: renamed from: C */
        public fdg f78542C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f78543F;

        /* JADX INFO: renamed from: H */
        public Throwable f78544H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f78545L;

        /* JADX INFO: renamed from: M */
        public volatile boolean f78546M;

        /* JADX INFO: renamed from: N */
        public long f78547N;

        /* JADX INFO: renamed from: Q */
        public boolean f78548Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f78549a;

        /* JADX INFO: renamed from: b */
        public final long f78550b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f78551c;

        /* JADX INFO: renamed from: d */
        public final voe.AbstractC14185c f78552d;

        /* JADX INFO: renamed from: e */
        public final boolean f78553e;

        /* JADX INFO: renamed from: f */
        public final AtomicReference<T> f78554f = new AtomicReference<>();

        /* JADX INFO: renamed from: m */
        public final AtomicLong f78555m = new AtomicLong();

        public RunnableC12127a(ycg<? super T> ycgVar, long j, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c, boolean z) {
            this.f78549a = ycgVar;
            this.f78550b = j;
            this.f78551c = timeUnit;
            this.f78552d = abstractC14185c;
            this.f78553e = z;
        }

        /* JADX INFO: renamed from: a */
        public void m21401a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f78554f;
            AtomicLong atomicLong = this.f78555m;
            ycg<? super T> ycgVar = this.f78549a;
            int iAddAndGet = 1;
            while (!this.f78545L) {
                boolean z = this.f78543F;
                if (z && this.f78544H != null) {
                    atomicReference.lazySet(null);
                    ycgVar.onError(this.f78544H);
                    this.f78552d.dispose();
                    return;
                }
                boolean z2 = atomicReference.get() == null;
                if (z) {
                    if (z2 || !this.f78553e) {
                        atomicReference.lazySet(null);
                        ycgVar.onComplete();
                    } else {
                        T andSet = atomicReference.getAndSet(null);
                        long j = this.f78547N;
                        if (j != atomicLong.get()) {
                            this.f78547N = j + 1;
                            ycgVar.onNext(andSet);
                            ycgVar.onComplete();
                        } else {
                            ycgVar.onError(new cwa("Could not emit final value due to lack of requests"));
                        }
                    }
                    this.f78552d.dispose();
                    return;
                }
                if (z2) {
                    if (this.f78546M) {
                        this.f78548Q = false;
                        this.f78546M = false;
                    }
                } else if (!this.f78548Q || this.f78546M) {
                    T andSet2 = atomicReference.getAndSet(null);
                    long j2 = this.f78547N;
                    if (j2 == atomicLong.get()) {
                        this.f78542C.cancel();
                        ycgVar.onError(new cwa("Could not emit value due to lack of requests"));
                        this.f78552d.dispose();
                        return;
                    } else {
                        ycgVar.onNext(andSet2);
                        this.f78547N = j2 + 1;
                        this.f78546M = false;
                        this.f78548Q = true;
                        this.f78552d.schedule(this, this.f78550b, this.f78551c);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f78545L = true;
            this.f78542C.cancel();
            this.f78552d.dispose();
            if (getAndIncrement() == 0) {
                this.f78554f.lazySet(null);
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f78543F = true;
            m21401a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f78544H = th;
            this.f78543F = true;
            m21401a();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f78554f.set(t);
            m21401a();
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f78542C, fdgVar)) {
                this.f78542C = fdgVar;
                this.f78549a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f78555m, j);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f78546M = true;
            m21401a();
        }
    }

    public rk6(m86<T> m86Var, long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        super(m86Var);
        this.f78538c = j;
        this.f78539d = timeUnit;
        this.f78540e = voeVar;
        this.f78541f = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new RunnableC12127a(ycgVar, this.f78538c, this.f78539d, this.f78540e.createWorker(), this.f78541f));
    }
}
