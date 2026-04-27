package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vnf<T, R> extends AtomicLong implements lj6<T>, fdg {

    /* JADX INFO: renamed from: e */
    public static final long f91808e = Long.MIN_VALUE;

    /* JADX INFO: renamed from: f */
    public static final long f91809f = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;

    /* JADX INFO: renamed from: a */
    public final ycg<? super R> f91810a;

    /* JADX INFO: renamed from: b */
    public fdg f91811b;

    /* JADX INFO: renamed from: c */
    public R f91812c;

    /* JADX INFO: renamed from: d */
    public long f91813d;

    public vnf(ycg<? super R> ycgVar) {
        this.f91810a = ycgVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m24079a(R r) {
        long j = this.f91813d;
        if (j != 0) {
            so0.produced(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                mo14073b(r);
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.f91810a.onNext(r);
                this.f91810a.onComplete();
                return;
            } else {
                this.f91812c = r;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.f91812c = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo14073b(R r) {
    }

    public void cancel() {
        this.f91811b.cancel();
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (mdg.validate(this.f91811b, fdgVar)) {
            this.f91811b = fdgVar;
            this.f91810a.onSubscribe(this);
        }
    }

    @Override // p000.fdg
    public final void request(long j) {
        long j2;
        if (mdg.validate(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.f91810a.onNext(this.f91812c);
                        this.f91810a.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, so0.addCap(j2, j)));
            this.f91811b.request(j);
        }
    }
}
