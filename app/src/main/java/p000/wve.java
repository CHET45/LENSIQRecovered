package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
public final class wve {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void resumeUndispatched(dq1<? super T> dq1Var, T t) {
        m13 m13Var = (m13) dq1Var.getContext().get(m13.f59565b);
        if (m13Var != null) {
            dq1Var.resumeUndispatched(m13Var, t);
        } else {
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(t));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resumeUndispatchedWithException(dq1<?> dq1Var, Throwable th) {
        m13 m13Var = (m13) dq1Var.getContext().get(m13.f59565b);
        if (m13Var != null) {
            dq1Var.resumeUndispatchedWithException(m13Var, th);
        } else {
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(th)));
        }
    }

    @gib
    @yjd
    public static final <R> Object selectOld(@yfb qy6<? super fve<? super R>, bth> qy6Var, @yfb zy2<? super R> zy2Var) {
        gve gveVar = new gve(zy2Var);
        try {
            qy6Var.invoke(gveVar);
        } catch (Throwable th) {
            gveVar.handleBuilderException(th);
        }
        Object result = gveVar.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    @yjd
    private static final <R> Object selectOld$$forInline(qy6<? super fve<? super R>, bth> qy6Var, zy2<? super R> zy2Var) {
        o28.mark(0);
        gve gveVar = new gve(zy2Var);
        try {
            qy6Var.invoke(gveVar);
        } catch (Throwable th) {
            gveVar.handleBuilderException(th);
        }
        Object result = gveVar.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        o28.mark(1);
        return result;
    }

    @gib
    @yjd
    public static final <R> Object selectUnbiasedOld(@yfb qy6<? super fve<? super R>, bth> qy6Var, @yfb zy2<? super R> zy2Var) {
        hrh hrhVar = new hrh(zy2Var);
        try {
            qy6Var.invoke(hrhVar);
        } catch (Throwable th) {
            hrhVar.handleBuilderException(th);
        }
        Object objInitSelectResult = hrhVar.initSelectResult();
        if (objInitSelectResult == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return objInitSelectResult;
    }

    @yjd
    private static final <R> Object selectUnbiasedOld$$forInline(qy6<? super fve<? super R>, bth> qy6Var, zy2<? super R> zy2Var) {
        o28.mark(0);
        hrh hrhVar = new hrh(zy2Var);
        try {
            qy6Var.invoke(hrhVar);
        } catch (Throwable th) {
            hrhVar.handleBuilderException(th);
        }
        Object objInitSelectResult = hrhVar.initSelectResult();
        if (objInitSelectResult == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        o28.mark(1);
        return objInitSelectResult;
    }
}
