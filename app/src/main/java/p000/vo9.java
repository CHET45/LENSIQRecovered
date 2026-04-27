package p000;

/* JADX INFO: loaded from: classes3.dex */
public class vo9 extends bp9<Integer> {
    /* JADX WARN: Multi-variable type inference failed */
    public Integer getOffset(io9<Integer> io9Var) {
        T t = this.f14387c;
        if (t != 0) {
            return (Integer) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.bp9
    public Integer getValue(io9<Integer> io9Var) {
        return Integer.valueOf(awa.lerp(io9Var.getStartValue().intValue(), io9Var.getEndValue().intValue(), io9Var.getInterpolatedKeyframeProgress()) + getOffset(io9Var).intValue());
    }
}
