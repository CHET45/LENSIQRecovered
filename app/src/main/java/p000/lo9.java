package p000;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public class lo9 extends no9<Integer> {
    public lo9(Integer num, Integer num2) {
        super(num, num2);
    }

    @Override // p000.no9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer mo14871a(Integer num, Integer num2, float f) {
        return Integer.valueOf(awa.lerp(num.intValue(), num2.intValue(), f));
    }

    @Override // p000.no9, p000.bp9
    public /* bridge */ /* synthetic */ Object getValue(io9 io9Var) {
        return super.getValue(io9Var);
    }

    public lo9(Integer num, Integer num2, Interpolator interpolator) {
        super(num, num2, interpolator);
    }
}
