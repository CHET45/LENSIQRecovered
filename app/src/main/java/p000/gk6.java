package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class gk6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: C */
    public final boolean f39999C;

    /* JADX INFO: renamed from: c */
    public final long f40000c;

    /* JADX INFO: renamed from: d */
    public final long f40001d;

    /* JADX INFO: renamed from: e */
    public final TimeUnit f40002e;

    /* JADX INFO: renamed from: f */
    public final woe f40003f;

    /* JADX INFO: renamed from: m */
    public final int f40004m;

    /* JADX INFO: renamed from: gk6$a */
    public static final class C6357a<T> extends AtomicInteger implements kj6<T>, fdg {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: C */
        public fdg f40005C;

        /* JADX INFO: renamed from: F */
        public final AtomicLong f40006F = new AtomicLong();

        /* JADX INFO: renamed from: H */
        public volatile boolean f40007H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f40008L;

        /* JADX INFO: renamed from: M */
        public Throwable f40009M;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f40010a;

        /* JADX INFO: renamed from: b */
        public final long f40011b;

        /* JADX INFO: renamed from: c */
        public final long f40012c;

        /* JADX INFO: renamed from: d */
        public final TimeUnit f40013d;

        /* JADX INFO: renamed from: e */
        public final woe f40014e;

        /* JADX INFO: renamed from: f */
        public final qzf<Object> f40015f;

        /* JADX INFO: renamed from: m */
        public final boolean f40016m;

        public C6357a(ycg<? super T> actual, long count, long time, TimeUnit unit, woe scheduler, int bufferSize, boolean delayError) {
            this.f40010a = actual;
            this.f40011b = count;
            this.f40012c = time;
            this.f40013d = unit;
            this.f40014e = scheduler;
            this.f40015f = new qzf<>(bufferSize);
            this.f40016m = delayError;
        }

        /* JADX INFO: renamed from: a */
        public boolean m11720a(boolean empty, ycg<? super T> a, boolean delayError) {
            if (this.f40007H) {
                this.f40015f.clear();
                return true;
            }
            if (delayError) {
                if (!empty) {
                    return false;
                }
                Throwable th = this.f40009M;
                if (th != null) {
                    a.onError(th);
                } else {
                    a.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f40009M;
            if (th2 != null) {
                this.f40015f.clear();
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
        public void m11721b() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super T> ycgVar = this.f40010a;
            qzf<Object> qzfVar = this.f40015f;
            boolean z = this.f40016m;
            int iAddAndGet = 1;
            do {
                if (this.f40008L) {
                    if (m11720a(qzfVar.isEmpty(), ycgVar, z)) {
                        return;
                    }
                    long j = this.f40006F.get();
                    long j2 = 0;
                    while (true) {
                        if (m11720a(qzfVar.peek() == null, ycgVar, z)) {
                            return;
                        }
                        if (j != j2) {
                            qzfVar.poll();
                            ycgVar.onNext(qzfVar.poll());
                            j2++;
                        } else if (j2 != 0) {
                            ro0.produced(this.f40006F, j2);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        /* JADX INFO: renamed from: c */
        public void m11722c(long now, qzf<Object> q) {
            long j = this.f40012c;
            long j2 = this.f40011b;
            boolean z = j2 == Long.MAX_VALUE;
            while (!q.isEmpty()) {
                if (((Long) q.peek()).longValue() >= now - j && (z || (q.size() >> 1) <= j2)) {
                    return;
                }
                q.poll();
                q.poll();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f40007H) {
                return;
            }
            this.f40007H = true;
            this.f40005C.cancel();
            if (getAndIncrement() == 0) {
                this.f40015f.clear();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            m11722c(this.f40014e.now(this.f40013d), this.f40015f);
            this.f40008L = true;
            m11721b();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f40016m) {
                m11722c(this.f40014e.now(this.f40013d), this.f40015f);
            }
            this.f40009M = t;
            this.f40008L = true;
            m11721b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            qzf<Object> qzfVar = this.f40015f;
            long jNow = this.f40014e.now(this.f40013d);
            qzfVar.offer(Long.valueOf(jNow), t);
            m11722c(jNow, qzfVar);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f40005C, s)) {
                this.f40005C = s;
                this.f40010a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f40006F, n);
                m11721b();
            }
        }
    }

    public gk6(l86<T> source, long count, long time, TimeUnit unit, woe scheduler, int bufferSize, boolean delayError) {
        super(source);
        this.f40000c = count;
        this.f40001d = time;
        this.f40002e = unit;
        this.f40003f = scheduler;
        this.f40004m = bufferSize;
        this.f39999C = delayError;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C6357a(s, this.f40000c, this.f40001d, this.f40002e, this.f40003f, this.f40004m, this.f39999C));
    }
}
