package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class bj6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f13858c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f13859d;

    /* JADX INFO: renamed from: e */
    public final voe f13860e;

    /* JADX INFO: renamed from: f */
    public final int f13861f;

    /* JADX INFO: renamed from: m */
    public final boolean f13862m;

    /* JADX INFO: renamed from: bj6$a */
    public static final class C1920a<T> extends AtomicInteger implements lj6<T>, fdg {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: C */
        public final AtomicLong f13863C = new AtomicLong();

        /* JADX INFO: renamed from: F */
        public volatile boolean f13864F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f13865H;

        /* JADX INFO: renamed from: L */
        public Throwable f13866L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f13867a;

        /* JADX INFO: renamed from: b */
        public final long f13868b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f13869c;

        /* JADX INFO: renamed from: d */
        public final voe f13870d;

        /* JADX INFO: renamed from: e */
        public final rzf<Object> f13871e;

        /* JADX INFO: renamed from: f */
        public final boolean f13872f;

        /* JADX INFO: renamed from: m */
        public fdg f13873m;

        public C1920a(ycg<? super T> ycgVar, long j, TimeUnit timeUnit, voe voeVar, int i, boolean z) {
            this.f13867a = ycgVar;
            this.f13868b = j;
            this.f13869c = timeUnit;
            this.f13870d = voeVar;
            this.f13871e = new rzf<>(i);
            this.f13872f = z;
        }

        /* JADX INFO: renamed from: a */
        public boolean m3210a(boolean z, boolean z2, ycg<? super T> ycgVar, boolean z3) {
            if (this.f13864F) {
                this.f13871e.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f13866L;
                if (th != null) {
                    ycgVar.onError(th);
                } else {
                    ycgVar.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f13866L;
            if (th2 != null) {
                this.f13871e.clear();
                ycgVar.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            ycgVar.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m3211b() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super T> ycgVar = this.f13867a;
            rzf<Object> rzfVar = this.f13871e;
            boolean z = this.f13872f;
            TimeUnit timeUnit = this.f13869c;
            voe voeVar = this.f13870d;
            long j = this.f13868b;
            int iAddAndGet = 1;
            do {
                long j2 = this.f13863C.get();
                long j3 = 0;
                while (j3 != j2) {
                    boolean z2 = this.f13865H;
                    Long l = (Long) rzfVar.peek();
                    boolean z3 = l == null;
                    boolean z4 = (z3 || l.longValue() <= voeVar.now(timeUnit) - j) ? z3 : true;
                    if (m3210a(z2, z4, ycgVar, z)) {
                        return;
                    }
                    if (z4) {
                        break;
                    }
                    rzfVar.poll();
                    ycgVar.onNext(rzfVar.poll());
                    j3++;
                }
                if (j3 != 0) {
                    so0.produced(this.f13863C, j3);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f13864F) {
                return;
            }
            this.f13864F = true;
            this.f13873m.cancel();
            if (getAndIncrement() == 0) {
                this.f13871e.clear();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f13865H = true;
            m3211b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f13866L = th;
            this.f13865H = true;
            m3211b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f13871e.offer(Long.valueOf(this.f13870d.now(this.f13869c)), t);
            m3211b();
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f13873m, fdgVar)) {
                this.f13873m = fdgVar;
                this.f13867a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f13863C, j);
                m3211b();
            }
        }
    }

    public bj6(m86<T> m86Var, long j, TimeUnit timeUnit, voe voeVar, int i, boolean z) {
        super(m86Var);
        this.f13858c = j;
        this.f13859d = timeUnit;
        this.f13860e = voeVar;
        this.f13861f = i;
        this.f13862m = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C1920a(ycgVar, this.f13858c, this.f13859d, this.f13860e, this.f13861f, this.f13862m));
    }
}
