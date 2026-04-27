package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class fk6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: C */
    public final boolean f36909C;

    /* JADX INFO: renamed from: c */
    public final long f36910c;

    /* JADX INFO: renamed from: d */
    public final long f36911d;

    /* JADX INFO: renamed from: e */
    public final TimeUnit f36912e;

    /* JADX INFO: renamed from: f */
    public final voe f36913f;

    /* JADX INFO: renamed from: m */
    public final int f36914m;

    /* JADX INFO: renamed from: fk6$a */
    public static final class C5865a<T> extends AtomicInteger implements lj6<T>, fdg {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: C */
        public fdg f36915C;

        /* JADX INFO: renamed from: F */
        public final AtomicLong f36916F = new AtomicLong();

        /* JADX INFO: renamed from: H */
        public volatile boolean f36917H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f36918L;

        /* JADX INFO: renamed from: M */
        public Throwable f36919M;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f36920a;

        /* JADX INFO: renamed from: b */
        public final long f36921b;

        /* JADX INFO: renamed from: c */
        public final long f36922c;

        /* JADX INFO: renamed from: d */
        public final TimeUnit f36923d;

        /* JADX INFO: renamed from: e */
        public final voe f36924e;

        /* JADX INFO: renamed from: f */
        public final rzf<Object> f36925f;

        /* JADX INFO: renamed from: m */
        public final boolean f36926m;

        public C5865a(ycg<? super T> ycgVar, long j, long j2, TimeUnit timeUnit, voe voeVar, int i, boolean z) {
            this.f36920a = ycgVar;
            this.f36921b = j;
            this.f36922c = j2;
            this.f36923d = timeUnit;
            this.f36924e = voeVar;
            this.f36925f = new rzf<>(i);
            this.f36926m = z;
        }

        /* JADX INFO: renamed from: a */
        public boolean m10967a(boolean z, ycg<? super T> ycgVar, boolean z2) {
            if (this.f36917H) {
                this.f36925f.clear();
                return true;
            }
            if (z2) {
                if (!z) {
                    return false;
                }
                Throwable th = this.f36919M;
                if (th != null) {
                    ycgVar.onError(th);
                } else {
                    ycgVar.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f36919M;
            if (th2 != null) {
                this.f36925f.clear();
                ycgVar.onError(th2);
                return true;
            }
            if (!z) {
                return false;
            }
            ycgVar.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m10968b() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super T> ycgVar = this.f36920a;
            rzf<Object> rzfVar = this.f36925f;
            boolean z = this.f36926m;
            int iAddAndGet = 1;
            do {
                if (this.f36918L) {
                    if (m10967a(rzfVar.isEmpty(), ycgVar, z)) {
                        return;
                    }
                    long j = this.f36916F.get();
                    long j2 = 0;
                    while (true) {
                        if (m10967a(rzfVar.peek() == null, ycgVar, z)) {
                            return;
                        }
                        if (j != j2) {
                            rzfVar.poll();
                            ycgVar.onNext(rzfVar.poll());
                            j2++;
                        } else if (j2 != 0) {
                            so0.produced(this.f36916F, j2);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        /* JADX INFO: renamed from: c */
        public void m10969c(long j, rzf<Object> rzfVar) {
            long j2 = this.f36922c;
            long j3 = this.f36921b;
            boolean z = j3 == Long.MAX_VALUE;
            while (!rzfVar.isEmpty()) {
                if (((Long) rzfVar.peek()).longValue() >= j - j2 && (z || (rzfVar.size() >> 1) <= j3)) {
                    return;
                }
                rzfVar.poll();
                rzfVar.poll();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f36917H) {
                return;
            }
            this.f36917H = true;
            this.f36915C.cancel();
            if (getAndIncrement() == 0) {
                this.f36925f.clear();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            m10969c(this.f36924e.now(this.f36923d), this.f36925f);
            this.f36918L = true;
            m10968b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f36926m) {
                m10969c(this.f36924e.now(this.f36923d), this.f36925f);
            }
            this.f36919M = th;
            this.f36918L = true;
            m10968b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            rzf<Object> rzfVar = this.f36925f;
            long jNow = this.f36924e.now(this.f36923d);
            rzfVar.offer(Long.valueOf(jNow), t);
            m10969c(jNow, rzfVar);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f36915C, fdgVar)) {
                this.f36915C = fdgVar;
                this.f36920a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f36916F, j);
                m10968b();
            }
        }
    }

    public fk6(m86<T> m86Var, long j, long j2, TimeUnit timeUnit, voe voeVar, int i, boolean z) {
        super(m86Var);
        this.f36910c = j;
        this.f36911d = j2;
        this.f36912e = timeUnit;
        this.f36913f = voeVar;
        this.f36914m = i;
        this.f36909C = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C5865a(ycgVar, this.f36910c, this.f36911d, this.f36912e, this.f36913f, this.f36914m, this.f36909C));
    }
}
