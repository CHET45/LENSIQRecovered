package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xo2<T> extends AtomicInteger implements kj6<T> {
    private static final long serialVersionUID = -3214213361171757852L;

    /* JADX INFO: renamed from: C */
    public boolean f98769C;

    /* JADX INFO: renamed from: a */
    public final bc0 f98770a = new bc0();

    /* JADX INFO: renamed from: b */
    public final int f98771b;

    /* JADX INFO: renamed from: c */
    public final e55 f98772c;

    /* JADX INFO: renamed from: d */
    public zif<T> f98773d;

    /* JADX INFO: renamed from: e */
    public fdg f98774e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f98775f;

    /* JADX INFO: renamed from: m */
    public volatile boolean f98776m;

    public xo2(int prefetch, e55 errorMode) {
        this.f98772c = errorMode;
        this.f98771b = prefetch;
    }

    /* JADX INFO: renamed from: a */
    public void mo10762a() {
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo10763b();

    /* JADX INFO: renamed from: c */
    public abstract void mo10764c();

    /* JADX INFO: renamed from: d */
    public abstract void mo10765d();

    /* JADX INFO: renamed from: e */
    public final void m25357e() {
        this.f98776m = true;
        this.f98774e.cancel();
        mo10763b();
        this.f98770a.tryTerminateAndReport();
        if (getAndIncrement() == 0) {
            this.f98773d.clear();
            mo10762a();
        }
    }

    @Override // p000.ycg
    public final void onComplete() {
        this.f98775f = true;
        mo10764c();
    }

    @Override // p000.ycg
    public final void onError(Throwable t) {
        if (this.f98770a.tryAddThrowableOrReport(t)) {
            if (this.f98772c == e55.IMMEDIATE) {
                mo10763b();
            }
            this.f98775f = true;
            mo10764c();
        }
    }

    @Override // p000.ycg
    public final void onNext(T t) {
        if (t == null || this.f98773d.offer(t)) {
            mo10764c();
        } else {
            this.f98774e.cancel();
            onError(new bwa("queue full?!"));
        }
    }

    @Override // p000.kj6, p000.ycg
    public final void onSubscribe(fdg s) {
        if (ldg.validate(this.f98774e, s)) {
            this.f98774e = s;
            if (s instanceof bod) {
                bod bodVar = (bod) s;
                int iRequestFusion = bodVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f98773d = bodVar;
                    this.f98769C = true;
                    this.f98775f = true;
                    mo10765d();
                    mo10764c();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f98773d = bodVar;
                    mo10765d();
                    this.f98774e.request(this.f98771b);
                    return;
                }
            }
            this.f98773d = new ozf(this.f98771b);
            mo10765d();
            this.f98774e.request(this.f98771b);
        }
    }
}
