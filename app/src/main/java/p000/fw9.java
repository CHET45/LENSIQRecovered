package p000;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public final class fw9 extends PathMotion {
    private static PointF getControlPoint(float f, float f2, float f3, float f4) {
        return f2 > f4 ? new PointF(f3, f2) : new PointF(f, f4);
    }

    @Override // android.transition.PathMotion
    @efb
    public Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF controlPoint = getControlPoint(f, f2, f3, f4);
        path.quadTo(controlPoint.x, controlPoint.y, f3, f4);
        return path;
    }
}
