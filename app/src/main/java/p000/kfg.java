package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class kfg {
    @yfb
    public static final jg2 SupervisorJob(@gib jj8 jj8Var) {
        return new jfg(jj8Var);
    }

    public static /* synthetic */ jg2 SupervisorJob$default(jj8 jj8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            jj8Var = null;
        }
        return SupervisorJob(jj8Var);
    }

    @gib
    public static final <R> Object supervisorScope(@yfb gz6<? super x13, ? super zy2<? super R>, ? extends Object> gz6Var, @yfb zy2<? super R> zy2Var) {
        ifg ifgVar = new ifg(zy2Var.getContext(), zy2Var);
        Object objStartUndispatchedOrReturn = fsh.startUndispatchedOrReturn(ifgVar, ifgVar, gz6Var);
        if (objStartUndispatchedOrReturn == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return objStartUndispatchedOrReturn;
    }

    /* JADX INFO: renamed from: SupervisorJob$default, reason: collision with other method in class */
    public static /* synthetic */ jj8 m30701SupervisorJob$default(jj8 jj8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            jj8Var = null;
        }
        return SupervisorJob(jj8Var);
    }
}
