package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public abstract class unf<T, R> extends AtomicLong implements kj6<T>, fdg {

    /* JADX INFO: renamed from: e */
    public static final long f88626e = Long.MIN_VALUE;

    /* JADX INFO: renamed from: f */
    public static final long f88627f = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;

    /* JADX INFO: renamed from: a */
    public final ycg<? super R> f88628a;

    /* JADX INFO: renamed from: b */
    public fdg f88629b;

    /* JADX INFO: renamed from: c */
    public R f88630c;

    /* JADX INFO: renamed from: d */
    public long f88631d;

    public unf(ycg<? super R> downstream) {
        this.f88628a = downstream;
    }

    /* JADX INFO: renamed from: a */
    public final void m23463a(R n) {
        long j = this.f88631d;
        if (j != 0) {
            ro0.produced(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                mo14718b(n);
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.f88628a.onNext(n);
                this.f88628a.onComplete();
                return;
            } else {
                this.f88630c = n;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.f88630c = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo14718b(R n) {
    }

    public void cancel() {
        this.f88629b.cancel();
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        if (ldg.validate(this.f88629b, s)) {
            this.f88629b = s;
            this.f88628a.onSubscribe(this);
        }
    }

    @Override // p000.fdg
    public final void request(long j) {
        long j2;
        if (ldg.validate(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.f88628a.onNext(this.f88630c);
                        this.f88628a.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, ro0.addCap(j2, j)));
            this.f88629b.request(j);
        }
    }
}
