package p000;

import java.util.Objects;
import p000.hh6;

/* JADX INFO: loaded from: classes7.dex */
public final class ih6<T, R> extends kjf<R> {

    /* JADX INFO: renamed from: a */
    public final zjd<T> f46998a;

    /* JADX INFO: renamed from: b */
    public final nfg<R> f46999b;

    /* JADX INFO: renamed from: c */
    public final i11<R, ? super T, R> f47000c;

    public ih6(zjd<T> source, nfg<R> seedSupplier, i11<R, ? super T, R> reducer) {
        this.f46998a = source;
        this.f46999b = seedSupplier;
        this.f47000c = reducer;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super R> observer) {
        try {
            R r = this.f46999b.get();
            Objects.requireNonNull(r, "The seedSupplier returned a null value");
            this.f46998a.subscribe(new hh6.C6853a(observer, this.f47000c, r));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
