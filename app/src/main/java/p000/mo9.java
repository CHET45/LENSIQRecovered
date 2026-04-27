package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public class mo9 extends no9<PointF> {

    /* JADX INFO: renamed from: g */
    public final PointF f61633g;

    public mo9(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
        this.f61633g = new PointF();
    }

    @Override // p000.no9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF mo14871a(PointF pointF, PointF pointF2, float f) {
        this.f61633g.set(awa.lerp(pointF.x, pointF2.x, f), awa.lerp(pointF.y, pointF2.y, f));
        return this.f61633g;
    }

    @Override // p000.no9, p000.bp9
    public /* bridge */ /* synthetic */ Object getValue(io9 io9Var) {
        return super.getValue(io9Var);
    }

    public mo9(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
        this.f61633g = new PointF();
    }
}
