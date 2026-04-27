package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y60 {
    @yfb
    public static final <K, V> x60<K, V> arrayMapOf() {
        return new x60<>();
    }

    @yfb
    public static final <K, V> x60<K, V> arrayMapOf(@yfb scc<? extends K, ? extends V>... sccVarArr) {
        md8.checkNotNullParameter(sccVarArr, "pairs");
        x60<K, V> x60Var = new x60<>(sccVarArr.length);
        for (scc<? extends K, ? extends V> sccVar : sccVarArr) {
            x60Var.put(sccVar.getFirst(), sccVar.getSecond());
        }
        return x60Var;
    }
}
