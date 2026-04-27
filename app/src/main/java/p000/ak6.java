package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class ak6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f1799c;

    /* JADX INFO: renamed from: ak6$a */
    public static final class C0297a<T> extends AtomicLong implements kj6<T>, fdg {
        private static final long serialVersionUID = 2288246011222124525L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f1800a;

        /* JADX INFO: renamed from: b */
        public long f1801b;

        /* JADX INFO: renamed from: c */
        public fdg f1802c;

        public C0297a(ycg<? super T> actual, long remaining) {
            this.f1800a = actual;
            this.f1801b = remaining;
            lazySet(remaining);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f1802c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f1801b > 0) {
                this.f1801b = 0L;
                this.f1800a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f1801b <= 0) {
                ofe.onError(t);
            } else {
                this.f1801b = 0L;
                this.f1800a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = this.f1801b;
            if (j > 0) {
                long j2 = j - 1;
                this.f1801b = j2;
                this.f1800a.onNext(t);
                if (j2 == 0) {
                    this.f1802c.cancel();
                    this.f1800a.onComplete();
                }
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f1802c, s)) {
                if (this.f1801b == 0) {
                    s.cancel();
                    w05.complete(this.f1800a);
                } else {
                    this.f1802c = s;
                    this.f1800a.onSubscribe(this);
                }
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            long j;
            long jMin;
            if (ldg.validate(n)) {
                do {
                    j = get();
                    if (j == 0) {
                        return;
                    } else {
                        jMin = Math.min(j, n);
                    }
                } while (!compareAndSet(j, j - jMin));
                this.f1802c.request(jMin);
            }
        }
    }

    public ak6(l86<T> source, long n) {
        super(source);
        this.f1799c = n;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C0297a(s, this.f1799c));
    }
}
