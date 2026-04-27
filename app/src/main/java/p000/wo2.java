package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class wo2<T> extends AtomicInteger implements pxb<T>, lf4 {
    private static final long serialVersionUID = -3214213361171757852L;

    /* JADX INFO: renamed from: a */
    public final bc0 f94898a = new bc0();

    /* JADX INFO: renamed from: b */
    public final int f94899b;

    /* JADX INFO: renamed from: c */
    public final e55 f94900c;

    /* JADX INFO: renamed from: d */
    public zif<T> f94901d;

    /* JADX INFO: renamed from: e */
    public lf4 f94902e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f94903f;

    /* JADX INFO: renamed from: m */
    public volatile boolean f94904m;

    public wo2(int prefetch, e55 errorMode) {
        this.f94900c = errorMode;
        this.f94899b = prefetch;
    }

    /* JADX INFO: renamed from: a */
    public void mo17393a() {
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo13186b();

    /* JADX INFO: renamed from: c */
    public abstract void mo13187c();

    /* JADX INFO: renamed from: d */
    public abstract void mo13188d();

    @Override // p000.lf4
    public final void dispose() {
        this.f94904m = true;
        this.f94902e.dispose();
        mo13186b();
        this.f94898a.tryTerminateAndReport();
        if (getAndIncrement() == 0) {
            this.f94901d.clear();
            mo17393a();
        }
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return this.f94904m;
    }

    @Override // p000.pxb
    public final void onComplete() {
        this.f94903f = true;
        mo13187c();
    }

    @Override // p000.pxb
    public final void onError(Throwable t) {
        if (this.f94898a.tryAddThrowableOrReport(t)) {
            if (this.f94900c == e55.IMMEDIATE) {
                mo13186b();
            }
            this.f94903f = true;
            mo13187c();
        }
    }

    @Override // p000.pxb
    public final void onNext(T t) {
        if (t != null) {
            this.f94901d.offer(t);
        }
        mo13187c();
    }

    @Override // p000.pxb
    public final void onSubscribe(lf4 d) {
        if (zf4.validate(this.f94902e, d)) {
            this.f94902e = d;
            if (d instanceof tmd) {
                tmd tmdVar = (tmd) d;
                int iRequestFusion = tmdVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f94901d = tmdVar;
                    this.f94903f = true;
                    mo13188d();
                    mo13187c();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f94901d = tmdVar;
                    mo13188d();
                    return;
                }
            }
            this.f94901d = new qzf(this.f94899b);
            mo13188d();
        }
    }
}
