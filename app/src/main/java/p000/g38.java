package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class g38<T> extends AtomicReference<fdg> implements kj6<T>, fdg {
    private static final long serialVersionUID = 22876611072430776L;

    /* JADX INFO: renamed from: a */
    public final i38<T> f38318a;

    /* JADX INFO: renamed from: b */
    public final int f38319b;

    /* JADX INFO: renamed from: c */
    public final int f38320c;

    /* JADX INFO: renamed from: d */
    public volatile zif<T> f38321d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f38322e;

    /* JADX INFO: renamed from: f */
    public long f38323f;

    /* JADX INFO: renamed from: m */
    public int f38324m;

    public g38(i38<T> parent, int prefetch) {
        this.f38318a = parent;
        this.f38319b = prefetch;
        this.f38320c = prefetch - (prefetch >> 2);
    }

    @Override // p000.fdg
    public void cancel() {
        ldg.cancel(this);
    }

    public boolean isDone() {
        return this.f38322e;
    }

    @Override // p000.ycg
    public void onComplete() {
        this.f38318a.innerComplete(this);
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        this.f38318a.innerError(this, t);
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f38324m == 0) {
            this.f38318a.innerNext(this, t);
        } else {
            this.f38318a.drain();
        }
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        if (ldg.setOnce(this, s)) {
            if (s instanceof bod) {
                bod bodVar = (bod) s;
                int iRequestFusion = bodVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f38324m = iRequestFusion;
                    this.f38321d = bodVar;
                    this.f38322e = true;
                    this.f38318a.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f38324m = iRequestFusion;
                    this.f38321d = bodVar;
                    xmd.request(s, this.f38319b);
                    return;
                }
            }
            this.f38321d = xmd.createQueue(this.f38319b);
            xmd.request(s, this.f38319b);
        }
    }

    public zif<T> queue() {
        return this.f38321d;
    }

    @Override // p000.fdg
    public void request(long n) {
        if (this.f38324m != 1) {
            long j = this.f38323f + n;
            if (j < this.f38320c) {
                this.f38323f = j;
            } else {
                this.f38323f = 0L;
                get().request(j);
            }
        }
    }

    public void setDone() {
        this.f38322e = true;
    }
}
