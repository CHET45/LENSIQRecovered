package p000;

import java.util.Objects;
import p000.wsb;

/* JADX INFO: loaded from: classes7.dex */
public final class xsb<T, R> extends kjf<R> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f99142a;

    /* JADX INFO: renamed from: b */
    public final nfg<R> f99143b;

    /* JADX INFO: renamed from: c */
    public final i11<R, ? super T, R> f99144c;

    public xsb(wub<T> source, nfg<R> seedSupplier, i11<R, ? super T, R> reducer) {
        this.f99142a = source;
        this.f99143b = seedSupplier;
        this.f99144c = reducer;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super R> observer) {
        try {
            R r = this.f99143b.get();
            Objects.requireNonNull(r, "The seedSupplier returned a null value");
            this.f99142a.subscribe(new wsb.C14772a(observer, this.f99144c, r));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
