package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r8f {

    /* JADX INFO: renamed from: a */
    public final List<l93> f77398a;

    /* JADX INFO: renamed from: b */
    public PointF f77399b;

    /* JADX INFO: renamed from: c */
    public boolean f77400c;

    public r8f(PointF pointF, boolean z, List<l93> list) {
        this.f77399b = pointF;
        this.f77400c = z;
        this.f77398a = new ArrayList(list);
    }

    public List<l93> getCurves() {
        return this.f77398a;
    }

    public PointF getInitialPoint() {
        return this.f77399b;
    }

    public void interpolateBetween(r8f r8fVar, r8f r8fVar2, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        if (this.f77399b == null) {
            this.f77399b = new PointF();
        }
        this.f77400c = r8fVar.isClosed() || r8fVar2.isClosed();
        if (r8fVar.getCurves().size() != r8fVar2.getCurves().size()) {
            dj9.warning("Curves must have the same number of control points. Shape 1: " + r8fVar.getCurves().size() + "\tShape 2: " + r8fVar2.getCurves().size());
        }
        int iMin = Math.min(r8fVar.getCurves().size(), r8fVar2.getCurves().size());
        if (this.f77398a.size() < iMin) {
            for (int size = this.f77398a.size(); size < iMin; size++) {
                this.f77398a.add(new l93());
            }
        } else if (this.f77398a.size() > iMin) {
            for (int size2 = this.f77398a.size() - 1; size2 >= iMin; size2--) {
                List<l93> list = this.f77398a;
                list.remove(list.size() - 1);
            }
        }
        PointF initialPoint = r8fVar.getInitialPoint();
        PointF initialPoint2 = r8fVar2.getInitialPoint();
        setInitialPoint(awa.lerp(initialPoint.x, initialPoint2.x, f), awa.lerp(initialPoint.y, initialPoint2.y, f));
        for (int size3 = this.f77398a.size() - 1; size3 >= 0; size3--) {
            l93 l93Var = r8fVar.getCurves().get(size3);
            l93 l93Var2 = r8fVar2.getCurves().get(size3);
            PointF controlPoint1 = l93Var.getControlPoint1();
            PointF controlPoint2 = l93Var.getControlPoint2();
            PointF vertex = l93Var.getVertex();
            PointF controlPoint12 = l93Var2.getControlPoint1();
            PointF controlPoint22 = l93Var2.getControlPoint2();
            PointF vertex2 = l93Var2.getVertex();
            this.f77398a.get(size3).setControlPoint1(awa.lerp(controlPoint1.x, controlPoint12.x, f), awa.lerp(controlPoint1.y, controlPoint12.y, f));
            this.f77398a.get(size3).setControlPoint2(awa.lerp(controlPoint2.x, controlPoint22.x, f), awa.lerp(controlPoint2.y, controlPoint22.y, f));
            this.f77398a.get(size3).setVertex(awa.lerp(vertex.x, vertex2.x, f), awa.lerp(vertex.y, vertex2.y, f));
        }
    }

    public boolean isClosed() {
        return this.f77400c;
    }

    public void setClosed(boolean z) {
        this.f77400c = z;
    }

    public void setInitialPoint(float f, float f2) {
        if (this.f77399b == null) {
            this.f77399b = new PointF();
        }
        this.f77399b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f77398a.size() + "closed=" + this.f77400c + '}';
    }

    public r8f() {
        this.f77398a = new ArrayList();
    }
}
