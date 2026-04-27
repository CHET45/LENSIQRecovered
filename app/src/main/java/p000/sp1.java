package p000;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public final class sp1 extends rj8 {

    /* JADX INFO: renamed from: e */
    @yfb
    public final Future<?> f82485e;

    public sp1(@yfb Future<?> future) {
        this.f82485e = future;
    }

    @Override // p000.rj8
    public boolean getOnCancelling() {
        return false;
    }

    @Override // p000.rj8
    public void invoke(@gib Throwable th) {
        if (th == null || this.f82485e.isDone()) {
            return;
        }
        this.f82485e.cancel(false);
    }
}
