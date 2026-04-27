package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lti {
    @gib
    public static final Object yield(@yfb zy2<? super bth> zy2Var) {
        Object coroutine_suspended;
        e13 context = zy2Var.getContext();
        oj8.ensureActive(context);
        zy2 zy2VarIntercepted = od8.intercepted(zy2Var);
        ve4 ve4Var = zy2VarIntercepted instanceof ve4 ? (ve4) zy2VarIntercepted : null;
        if (ve4Var == null) {
            coroutine_suspended = bth.f14751a;
        } else {
            if (ve4Var.f90781d.isDispatchNeeded(context)) {
                ve4Var.dispatchYield$kotlinx_coroutines_core(context, bth.f14751a);
            } else {
                kti ktiVar = new kti();
                e13 e13VarPlus = context.plus(ktiVar);
                bth bthVar = bth.f14751a;
                ve4Var.dispatchYield$kotlinx_coroutines_core(e13VarPlus, bthVar);
                coroutine_suspended = (!ktiVar.f55316b || we4.yieldUndispatched(ve4Var)) ? pd8.getCOROUTINE_SUSPENDED() : bthVar;
            }
            coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
        }
        if (coroutine_suspended == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return coroutine_suspended == pd8.getCOROUTINE_SUSPENDED() ? coroutine_suspended : bth.f14751a;
    }
}
