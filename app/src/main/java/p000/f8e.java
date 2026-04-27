package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class f8e<T> implements hnf<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<lf4> f35689a;

    /* JADX INFO: renamed from: b */
    public final hnf<? super T> f35690b;

    public f8e(AtomicReference<lf4> parent, hnf<? super T> downstream) {
        this.f35689a = parent;
        this.f35690b = downstream;
    }

    @Override // p000.hnf
    public void onError(Throwable e) {
        this.f35690b.onError(e);
    }

    @Override // p000.hnf
    public void onSubscribe(lf4 d) {
        zf4.replace(this.f35689a, d);
    }

    @Override // p000.hnf
    public void onSuccess(T value) {
        this.f35690b.onSuccess(value);
    }
}
