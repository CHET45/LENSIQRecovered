package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class of2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final nfg<? extends Throwable> f67483a;

    public of2(nfg<? extends Throwable> errorSupplier) {
        this.f67483a = errorSupplier;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        try {
            Throwable th = this.f67483a.get();
            Objects.requireNonNull(th, "The error returned is null");
            th = th;
        } catch (Throwable th2) {
            th = th2;
            o75.throwIfFatal(th);
        }
        b05.error(th, observer);
    }
}
