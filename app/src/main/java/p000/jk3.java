package p000;

import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
public final class jk3 {
    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @yfb
    public static final <T> zy2<T> probeCoroutineCreated(@yfb zy2<? super T> zy2Var) {
        md8.checkNotNullParameter(zy2Var, "completion");
        return zy2Var;
    }

    @jjf(version = "1.3")
    public static final void probeCoroutineResumed(@yfb zy2<?> zy2Var) {
        md8.checkNotNullParameter(zy2Var, ymh.InterfaceC15722a.f102093L);
    }

    @jjf(version = "1.3")
    public static final void probeCoroutineSuspended(@yfb zy2<?> zy2Var) {
        md8.checkNotNullParameter(zy2Var, ymh.InterfaceC15722a.f102093L);
    }
}
