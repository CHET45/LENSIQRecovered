package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class jnb<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final nfg<? extends wub<? extends T>> f51296a;

    public jnb(nfg<? extends wub<? extends T>> supplier) {
        this.f51296a = supplier;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        try {
            wub<? extends T> wubVar = this.f51296a.get();
            Objects.requireNonNull(wubVar, "The supplier returned a null ObservableSource");
            wubVar.subscribe(observer);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
