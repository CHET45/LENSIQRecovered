package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class awa {

    /* JADX INFO: renamed from: a */
    public static final PointF f12023a = new PointF();

    /* JADX INFO: renamed from: a */
    public static int m2710a(float f, float f2) {
        return floorMod((int) f, (int) f2);
    }

    public static PointF addPoints(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int clamp(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static boolean contains(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    private static int floorDiv(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    private static int floorMod(int i, int i2) {
        return i - (i2 * floorDiv(i, i2));
    }

    public static void getPathFromData(r8f r8fVar, Path path) {
        path.reset();
        PointF initialPoint = r8fVar.getInitialPoint();
        path.moveTo(initialPoint.x, initialPoint.y);
        f12023a.set(initialPoint.x, initialPoint.y);
        for (int i = 0; i < r8fVar.getCurves().size(); i++) {
            l93 l93Var = r8fVar.getCurves().get(i);
            PointF controlPoint1 = l93Var.getControlPoint1();
            PointF controlPoint2 = l93Var.getControlPoint2();
            PointF vertex = l93Var.getVertex();
            PointF pointF = f12023a;
            if (controlPoint1.equals(pointF) && controlPoint2.equals(vertex)) {
                path.lineTo(vertex.x, vertex.y);
            } else {
                path.cubicTo(controlPoint1.x, controlPoint1.y, controlPoint2.x, controlPoint2.y, vertex.x, vertex.y);
            }
            pointF.set(vertex.x, vertex.y);
        }
        if (r8fVar.isClosed()) {
            path.close();
        }
    }

    public static float lerp(float f, float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3) {
        return f + (f3 * (f2 - f));
    }

    public static void resolveKeyPath(fr8 fr8Var, int i, List<fr8> list, fr8 fr8Var2, hr8 hr8Var) {
        if (fr8Var.fullyResolvesTo(hr8Var.getName(), i)) {
            list.add(fr8Var2.addKey(hr8Var.getName()).resolve(hr8Var));
        }
    }

    public static float clamp(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static double lerp(double d, double d2, @y46(from = 0.0d, m25645to = 1.0d) double d3) {
        return d + (d3 * (d2 - d));
    }

    public static double clamp(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static int lerp(int i, int i2, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return (int) (i + (f * (i2 - i)));
    }
}
