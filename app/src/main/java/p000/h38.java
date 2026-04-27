package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class h38<T> extends AtomicReference<fdg> implements lj6<T>, fdg {
    private static final long serialVersionUID = 22876611072430776L;

    /* JADX INFO: renamed from: a */
    public final j38<T> f42167a;

    /* JADX INFO: renamed from: b */
    public final int f42168b;

    /* JADX INFO: renamed from: c */
    public final int f42169c;

    /* JADX INFO: renamed from: d */
    public volatile ajf<T> f42170d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f42171e;

    /* JADX INFO: renamed from: f */
    public long f42172f;

    /* JADX INFO: renamed from: m */
    public int f42173m;

    public h38(j38<T> j38Var, int i) {
        this.f42167a = j38Var;
        this.f42168b = i;
        this.f42169c = i - (i >> 2);
    }

    @Override // p000.fdg
    public void cancel() {
        mdg.cancel(this);
    }

    public boolean isDone() {
        return this.f42171e;
    }

    @Override // p000.ycg
    public void onComplete() {
        this.f42167a.innerComplete(this);
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        this.f42167a.innerError(this, th);
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f42173m == 0) {
            this.f42167a.innerNext(this, t);
        } else {
            this.f42167a.drain();
        }
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (mdg.setOnce(this, fdgVar)) {
            if (fdgVar instanceof cod) {
                cod codVar = (cod) fdgVar;
                int iRequestFusion = codVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f42173m = iRequestFusion;
                    this.f42170d = codVar;
                    this.f42171e = true;
                    this.f42167a.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f42173m = iRequestFusion;
                    this.f42170d = codVar;
                    ymd.request(fdgVar, this.f42168b);
                    return;
                }
            }
            this.f42170d = ymd.createQueue(this.f42168b);
            ymd.request(fdgVar, this.f42168b);
        }
    }

    public ajf<T> queue() {
        return this.f42170d;
    }

    @Override // p000.fdg
    public void request(long j) {
        if (this.f42173m != 1) {
            long j2 = this.f42172f + j;
            if (j2 < this.f42169c) {
                this.f42172f = j2;
            } else {
                this.f42172f = 0L;
                get().request(j2);
            }
        }
    }

    public void requestOne() {
        if (this.f42173m != 1) {
            long j = this.f42172f + 1;
            if (j != this.f42169c) {
                this.f42172f = j;
            } else {
                this.f42172f = 0L;
                get().request(j);
            }
        }
    }

    public void setDone() {
        this.f42171e = true;
    }
}
