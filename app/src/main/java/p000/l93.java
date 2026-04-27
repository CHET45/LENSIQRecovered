package p000;

import android.graphics.PointF;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class l93 {

    /* JADX INFO: renamed from: a */
    public final PointF f56881a;

    /* JADX INFO: renamed from: b */
    public final PointF f56882b;

    /* JADX INFO: renamed from: c */
    public final PointF f56883c;

    public l93() {
        this.f56881a = new PointF();
        this.f56882b = new PointF();
        this.f56883c = new PointF();
    }

    public PointF getControlPoint1() {
        return this.f56881a;
    }

    public PointF getControlPoint2() {
        return this.f56882b;
    }

    public PointF getVertex() {
        return this.f56883c;
    }

    public void setControlPoint1(float f, float f2) {
        this.f56881a.set(f, f2);
    }

    public void setControlPoint2(float f, float f2) {
        this.f56882b.set(f, f2);
    }

    public void setFrom(l93 l93Var) {
        PointF pointF = l93Var.f56883c;
        setVertex(pointF.x, pointF.y);
        PointF pointF2 = l93Var.f56881a;
        setControlPoint1(pointF2.x, pointF2.y);
        PointF pointF3 = l93Var.f56882b;
        setControlPoint2(pointF3.x, pointF3.y);
    }

    public void setVertex(float f, float f2) {
        this.f56883c.set(f, f2);
    }

    @efb
    @igg({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f56883c.x), Float.valueOf(this.f56883c.y), Float.valueOf(this.f56881a.x), Float.valueOf(this.f56881a.y), Float.valueOf(this.f56882b.x), Float.valueOf(this.f56882b.y));
    }

    public l93(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f56881a = pointF;
        this.f56882b = pointF2;
        this.f56883c = pointF3;
    }
}
