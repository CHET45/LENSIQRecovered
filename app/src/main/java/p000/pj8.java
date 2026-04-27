package p000;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class pj8 {
    @q64(level = u64.f86865a, message = "This function does not do what its name implies: it will not cancel the future if just cancel() was called.", replaceWith = @i2e(expression = "this.invokeOnCancellation { future.cancel(false) }", imports = {}))
    public static final void cancelFutureOnCancellation(@yfb dq1<?> dq1Var, @yfb Future<?> future) {
        hq1.invokeOnCancellation(dq1Var, new hjd(future));
    }
}
