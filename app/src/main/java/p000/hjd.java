package p000;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public final class hjd implements tp1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Future<?> f43821a;

    public hjd(@yfb Future<?> future) {
        this.f43821a = future;
    }

    @Override // p000.tp1
    public void invoke(@gib Throwable th) {
        if (th != null) {
            this.f43821a.cancel(false);
        }
    }

    @yfb
    public String toString() {
        return "CancelFutureOnCancel[" + this.f43821a + C4584d2.f28243l;
    }
}
