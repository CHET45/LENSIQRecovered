package p000;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public final class rp1 implements tp1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Future<?> f78952a;

    public rp1(@yfb Future<?> future) {
        this.f78952a = future;
    }

    @Override // p000.tp1
    public void invoke(@gib Throwable th) {
        this.f78952a.cancel(false);
    }

    @yfb
    public String toString() {
        return "CancelFutureOnCancel[" + this.f78952a + C4584d2.f28243l;
    }
}
