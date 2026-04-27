package p000;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public class ko9 extends no9<Float> {
    public ko9(Float f, Float f2) {
        super(f, f2);
    }

    @Override // p000.no9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float mo14871a(Float f, Float f2, float f3) {
        return Float.valueOf(awa.lerp(f.floatValue(), f2.floatValue(), f3));
    }

    @Override // p000.no9, p000.bp9
    public /* bridge */ /* synthetic */ Object getValue(io9 io9Var) {
        return super.getValue(io9Var);
    }

    public ko9(Float f, Float f2, Interpolator interpolator) {
        super(f, f2, interpolator);
    }
}
