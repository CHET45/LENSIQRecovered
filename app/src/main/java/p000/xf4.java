package p000;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public final class xf4 implements yf4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Future<?> f97616a;

    public xf4(@yfb Future<?> future) {
        this.f97616a = future;
    }

    @Override // p000.yf4
    public void dispose() {
        this.f97616a.cancel(false);
    }

    @yfb
    public String toString() {
        return "DisposableFutureHandle[" + this.f97616a + C4584d2.f28243l;
    }
}
