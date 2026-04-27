package p000;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class wo9 extends bp9<PointF> {

    /* JADX INFO: renamed from: d */
    public final PointF f94936d;

    public wo9() {
        this.f94936d = new PointF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PointF getOffset(io9<PointF> io9Var) {
        T t = this.f14387c;
        if (t != 0) {
            return (PointF) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.bp9
    public final PointF getValue(io9<PointF> io9Var) {
        this.f94936d.set(awa.lerp(io9Var.getStartValue().x, io9Var.getEndValue().x, io9Var.getInterpolatedKeyframeProgress()), awa.lerp(io9Var.getStartValue().y, io9Var.getEndValue().y, io9Var.getInterpolatedKeyframeProgress()));
        PointF offset = getOffset(io9Var);
        this.f94936d.offset(offset.x, offset.y);
        return this.f94936d;
    }

    public wo9(@efb PointF pointF) {
        super(pointF);
        this.f94936d = new PointF();
    }
}
