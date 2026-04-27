package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class ue2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends qh2> f87769a;

    public ue2(Callable<? extends qh2> callable) {
        this.f87769a = callable;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        try {
            ((qh2) xjb.requireNonNull(this.f87769a.call(), "The completableSupplier returned a null CompletableSource")).subscribe(dh2Var);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, dh2Var);
        }
    }
}
