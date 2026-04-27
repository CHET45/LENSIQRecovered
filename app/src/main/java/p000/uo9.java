package p000;

/* JADX INFO: loaded from: classes3.dex */
public class uo9 extends bp9<Float> {
    public uo9() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Float getOffset(io9<Float> io9Var) {
        T t = this.f14387c;
        if (t != 0) {
            return (Float) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    public uo9(@efb Float f) {
        super(f);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.bp9
    public Float getValue(io9<Float> io9Var) {
        return Float.valueOf(awa.lerp(io9Var.getStartValue().floatValue(), io9Var.getEndValue().floatValue(), io9Var.getInterpolatedKeyframeProgress()) + getOffset(io9Var).floatValue());
    }
}
