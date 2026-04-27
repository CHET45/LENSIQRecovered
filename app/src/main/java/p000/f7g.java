package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public class f7g<T> extends AtomicInteger implements kj6<T>, fdg {
    private static final long serialVersionUID = -4945028590049415624L;

    /* JADX INFO: renamed from: a */
    public final ycg<? super T> f35659a;

    /* JADX INFO: renamed from: b */
    public final bc0 f35660b = new bc0();

    /* JADX INFO: renamed from: c */
    public final AtomicLong f35661c = new AtomicLong();

    /* JADX INFO: renamed from: d */
    public final AtomicReference<fdg> f35662d = new AtomicReference<>();

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f35663e = new AtomicBoolean();

    /* JADX INFO: renamed from: f */
    public volatile boolean f35664f;

    public f7g(ycg<? super T> downstream) {
        this.f35659a = downstream;
    }

    @Override // p000.fdg
    public void cancel() {
        if (this.f35664f) {
            return;
        }
        ldg.cancel(this.f35662d);
    }

    @Override // p000.ycg
    public void onComplete() {
        this.f35664f = true;
        xd7.onComplete(this.f35659a, this, this.f35660b);
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        this.f35664f = true;
        xd7.onError(this.f35659a, t, this, this.f35660b);
    }

    @Override // p000.ycg
    public void onNext(T t) {
        xd7.onNext(this.f35659a, t, this, this.f35660b);
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        if (this.f35663e.compareAndSet(false, true)) {
            this.f35659a.onSubscribe(this);
            ldg.deferredSetOnce(this.f35662d, this.f35661c, s);
        } else {
            s.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // p000.fdg
    public void request(long n) {
        if (n > 0) {
            ldg.deferredRequest(this.f35662d, this.f35661c, n);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + n));
    }
}
