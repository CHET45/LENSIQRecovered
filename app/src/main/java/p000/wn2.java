package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wn2 {
    @gib
    @tg5
    public static final un2 observe(@yfb cn2 cn2Var, @yfb tn2 tn2Var) {
        hn2 hn2Var = (hn2) in2.getCompositionService(cn2Var, in2.getCompositionImplServiceKey());
        if (hn2Var != null) {
            return hn2Var.observe$runtime_release(tn2Var);
        }
        return null;
    }

    @tg5
    @yfb
    public static final un2 observe(@yfb rsd rsdVar, @yfb usd usdVar) {
        md8.checkNotNull(rsdVar, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        return ((ssd) rsdVar).observe$runtime_release(usdVar);
    }
}
