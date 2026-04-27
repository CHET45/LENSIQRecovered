package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class te2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final nfg<? extends ph2> f84377a;

    public te2(nfg<? extends ph2> completableSupplier) {
        this.f84377a = completableSupplier;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        try {
            ph2 ph2Var = this.f84377a.get();
            Objects.requireNonNull(ph2Var, "The completableSupplier returned a null CompletableSource");
            ph2Var.subscribe(observer);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
