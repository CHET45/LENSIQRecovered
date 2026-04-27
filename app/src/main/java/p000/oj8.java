package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public final class oj8 {
    @yfb
    public static final jg2 Job(@gib jj8 jj8Var) {
        return qj8.Job(jj8Var);
    }

    @gib
    public static final Object cancelAndJoin(@yfb jj8 jj8Var, @yfb zy2<? super bth> zy2Var) {
        return qj8.cancelAndJoin(jj8Var, zy2Var);
    }

    @q64(level = u64.f86865a, message = "This function does not do what its name implies: it will not cancel the future if just cancel() was called.", replaceWith = @i2e(expression = "this.invokeOnCancellation { future.cancel(false) }", imports = {}))
    public static final void cancelFutureOnCancellation(@yfb dq1<?> dq1Var, @yfb Future<?> future) {
        pj8.cancelFutureOnCancellation(dq1Var, future);
    }

    @yfb
    public static final yf4 disposeOnCompletion(@yfb jj8 jj8Var, @yfb yf4 yf4Var) {
        return qj8.disposeOnCompletion(jj8Var, yf4Var);
    }

    public static final void ensureActive(@yfb e13 e13Var) {
        qj8.ensureActive(e13Var);
    }

    @yfb
    public static final jj8 getJob(@yfb e13 e13Var) {
        return qj8.getJob(e13Var);
    }

    @yfb
    public static final yf4 invokeOnCompletion(@yfb jj8 jj8Var, boolean z, @yfb rj8 rj8Var) {
        return qj8.invokeOnCompletion(jj8Var, z, rj8Var);
    }

    public static final boolean isActive(@yfb e13 e13Var) {
        return qj8.isActive(e13Var);
    }

    public static final void cancel(@yfb e13 e13Var, @gib CancellationException cancellationException) {
        qj8.cancel(e13Var, cancellationException);
    }

    public static final void ensureActive(@yfb jj8 jj8Var) {
        qj8.ensureActive(jj8Var);
    }

    public static final void cancel(@yfb jj8 jj8Var, @yfb String str, @gib Throwable th) {
        qj8.cancel(jj8Var, str, th);
    }

    public static final void cancelChildren(@yfb e13 e13Var, @gib CancellationException cancellationException) {
        qj8.cancelChildren(e13Var, cancellationException);
    }

    public static final void cancelChildren(@yfb jj8 jj8Var, @gib CancellationException cancellationException) {
        qj8.cancelChildren(jj8Var, cancellationException);
    }
}
