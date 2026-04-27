package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class cj6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f16691c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f16692d;

    /* JADX INFO: renamed from: e */
    public final woe f16693e;

    /* JADX INFO: renamed from: f */
    public final int f16694f;

    /* JADX INFO: renamed from: m */
    public final boolean f16695m;

    /* JADX INFO: renamed from: cj6$a */
    public static final class C2331a<T> extends AtomicInteger implements kj6<T>, fdg {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: C */
        public final AtomicLong f16696C = new AtomicLong();

        /* JADX INFO: renamed from: F */
        public volatile boolean f16697F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f16698H;

        /* JADX INFO: renamed from: L */
        public Throwable f16699L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f16700a;

        /* JADX INFO: renamed from: b */
        public final long f16701b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f16702c;

        /* JADX INFO: renamed from: d */
        public final woe f16703d;

        /* JADX INFO: renamed from: e */
        public final qzf<Object> f16704e;

        /* JADX INFO: renamed from: f */
        public final boolean f16705f;

        /* JADX INFO: renamed from: m */
        public fdg f16706m;

        public C2331a(ycg<? super T> actual, long time, TimeUnit unit, woe scheduler, int bufferSize, boolean delayError) {
            this.f16700a = actual;
            this.f16701b = time;
            this.f16702c = unit;
            this.f16703d = scheduler;
            this.f16704e = new qzf<>(bufferSize);
            this.f16705f = delayError;
        }

        /* JADX INFO: renamed from: a */
        public boolean m4001a(boolean d, boolean empty, ycg<? super T> a, boolean delayError) {
            if (this.f16697F) {
                this.f16704e.clear();
                return true;
            }
            if (!d) {
                return false;
            }
            if (delayError) {
                if (!empty) {
                    return false;
                }
                Throwable th = this.f16699L;
                if (th != null) {
                    a.onError(th);
                } else {
                    a.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f16699L;
            if (th2 != null) {
                this.f16704e.clear();
                a.onError(th2);
                return true;
            }
            if (!empty) {
                return false;
            }
            a.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m4002b() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super T> ycgVar = this.f16700a;
            qzf<Object> qzfVar = this.f16704e;
            boolean z = this.f16705f;
            TimeUnit timeUnit = this.f16702c;
            woe woeVar = this.f16703d;
            long j = this.f16701b;
            int iAddAndGet = 1;
            do {
                long j2 = this.f16696C.get();
                long j3 = 0;
                while (j3 != j2) {
                    boolean z2 = this.f16698H;
                    Long l = (Long) qzfVar.peek();
                    boolean z3 = l == null;
                    boolean z4 = (z3 || l.longValue() <= woeVar.now(timeUnit) - j) ? z3 : true;
                    if (m4001a(z2, z4, ycgVar, z)) {
                        return;
                    }
                    if (z4) {
                        break;
                    }
                    qzfVar.poll();
                    ycgVar.onNext(qzfVar.poll());
                    j3++;
                }
                if (j3 != 0) {
                    ro0.produced(this.f16696C, j3);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f16697F) {
                return;
            }
            this.f16697F = true;
            this.f16706m.cancel();
            if (getAndIncrement() == 0) {
                this.f16704e.clear();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f16698H = true;
            m4002b();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f16699L = t;
            this.f16698H = true;
            m4002b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f16704e.offer(Long.valueOf(this.f16703d.now(this.f16702c)), t);
            m4002b();
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f16706m, s)) {
                this.f16706m = s;
                this.f16700a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f16696C, n);
                m4002b();
            }
        }
    }

    public cj6(l86<T> source, long time, TimeUnit unit, woe scheduler, int bufferSize, boolean delayError) {
        super(source);
        this.f16691c = time;
        this.f16692d = unit;
        this.f16693e = scheduler;
        this.f16694f = bufferSize;
        this.f16695m = delayError;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C2331a(s, this.f16691c, this.f16692d, this.f16693e, this.f16694f, this.f16695m));
    }
}
