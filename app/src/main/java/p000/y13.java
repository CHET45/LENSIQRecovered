package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class y13 {
    @yfb
    public static final x13 CoroutineScope(@yfb e13 e13Var) {
        if (e13Var.get(jj8.f50715A) == null) {
            e13Var = e13Var.plus(qj8.Job$default((jj8) null, 1, (Object) null));
        }
        return new gy2(e13Var);
    }

    @yfb
    public static final x13 MainScope() {
        return new gy2(kfg.SupervisorJob$default((jj8) null, 1, (Object) null).plus(df4.getMain()));
    }

    public static final void cancel(@yfb x13 x13Var, @gib CancellationException cancellationException) {
        jj8 jj8Var = (jj8) x13Var.getCoroutineContext().get(jj8.f50715A);
        if (jj8Var != null) {
            jj8Var.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + x13Var).toString());
    }

    public static /* synthetic */ void cancel$default(x13 x13Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        cancel(x13Var, cancellationException);
    }

    @gib
    public static final <R> Object coroutineScope(@yfb gz6<? super x13, ? super zy2<? super R>, ? extends Object> gz6Var, @yfb zy2<? super R> zy2Var) {
        uqe uqeVar = new uqe(zy2Var.getContext(), zy2Var);
        Object objStartUndispatchedOrReturn = fsh.startUndispatchedOrReturn(uqeVar, uqeVar, gz6Var);
        if (objStartUndispatchedOrReturn == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return objStartUndispatchedOrReturn;
    }

    @gib
    public static final Object currentCoroutineContext(@yfb zy2<? super e13> zy2Var) {
        return zy2Var.getContext();
    }

    private static final Object currentCoroutineContext$$forInline(zy2<? super e13> zy2Var) {
        o28.mark(3);
        throw null;
    }

    public static final void ensureActive(@yfb x13 x13Var) {
        oj8.ensureActive(x13Var.getCoroutineContext());
    }

    public static final boolean isActive(@yfb x13 x13Var) {
        jj8 jj8Var = (jj8) x13Var.getCoroutineContext().get(jj8.f50715A);
        if (jj8Var != null) {
            return jj8Var.isActive();
        }
        return true;
    }

    public static /* synthetic */ void isActive$annotations(x13 x13Var) {
    }

    @yfb
    public static final x13 plus(@yfb x13 x13Var, @yfb e13 e13Var) {
        return new gy2(x13Var.getCoroutineContext().plus(e13Var));
    }

    public static /* synthetic */ void cancel$default(x13 x13Var, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        cancel(x13Var, str, th);
    }

    public static final void cancel(@yfb x13 x13Var, @yfb String str, @gib Throwable th) {
        cancel(x13Var, y75.CancellationException(str, th));
    }
}
