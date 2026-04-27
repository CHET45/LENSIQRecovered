package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class o5a<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final nfg<? extends z9a<? extends T>> f66496a;

    public o5a(nfg<? extends z9a<? extends T>> maybeSupplier) {
        this.f66496a = maybeSupplier;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        try {
            z9a<? extends T> z9aVar = this.f66496a.get();
            Objects.requireNonNull(z9aVar, "The maybeSupplier returned a null MaybeSource");
            z9aVar.subscribe(observer);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
