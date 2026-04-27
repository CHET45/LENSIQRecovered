package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public class g7g<T> extends AtomicInteger implements lj6<T>, fdg {
    private static final long serialVersionUID = -4945028590049415624L;

    /* JADX INFO: renamed from: a */
    public final ycg<? super T> f38969a;

    /* JADX INFO: renamed from: b */
    public final cc0 f38970b = new cc0();

    /* JADX INFO: renamed from: c */
    public final AtomicLong f38971c = new AtomicLong();

    /* JADX INFO: renamed from: d */
    public final AtomicReference<fdg> f38972d = new AtomicReference<>();

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f38973e = new AtomicBoolean();

    /* JADX INFO: renamed from: f */
    public volatile boolean f38974f;

    public g7g(ycg<? super T> ycgVar) {
        this.f38969a = ycgVar;
    }

    @Override // p000.fdg
    public void cancel() {
        if (this.f38974f) {
            return;
        }
        mdg.cancel(this.f38972d);
    }

    @Override // p000.ycg
    public void onComplete() {
        this.f38974f = true;
        yd7.onComplete(this.f38969a, this, this.f38970b);
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        this.f38974f = true;
        yd7.onError(this.f38969a, th, this, this.f38970b);
    }

    @Override // p000.ycg
    public void onNext(T t) {
        yd7.onNext(this.f38969a, t, this, this.f38970b);
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (this.f38973e.compareAndSet(false, true)) {
            this.f38969a.onSubscribe(this);
            mdg.deferredSetOnce(this.f38972d, this.f38971c, fdgVar);
        } else {
            fdgVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // p000.fdg
    public void request(long j) {
        if (j > 0) {
            mdg.deferredRequest(this.f38972d, this.f38971c, j);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
    }
}
