package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class pf2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends Throwable> f70585a;

    public pf2(Callable<? extends Throwable> callable) {
        this.f70585a = callable;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        try {
            th = (Throwable) xjb.requireNonNull(this.f70585a.call(), "The error returned is null");
        } catch (Throwable th) {
            th = th;
            n75.throwIfFatal(th);
        }
        c05.error(th, dh2Var);
    }
}
