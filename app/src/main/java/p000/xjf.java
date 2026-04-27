package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class xjf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final nfg<? extends oof<? extends T>> f98244a;

    public xjf(nfg<? extends oof<? extends T>> singleSupplier) {
        this.f98244a = singleSupplier;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        try {
            oof<? extends T> oofVar = this.f98244a.get();
            Objects.requireNonNull(oofVar, "The singleSupplier returned a null SingleSource");
            oofVar.subscribe(observer);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
