package p000;

import android.graphics.Point;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class o1d {
    public static final int component1(@yfb Point point) {
        return point.x;
    }

    public static final int component2(@yfb Point point) {
        return point.y;
    }

    @yfb
    public static final Point div(@yfb Point point, float f) {
        return new Point(Math.round(point.x / f), Math.round(point.y / f));
    }

    @yfb
    public static final Point minus(@yfb Point point, @yfb Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    @yfb
    public static final Point plus(@yfb Point point, @yfb Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    @yfb
    public static final Point times(@yfb Point point, float f) {
        return new Point(Math.round(point.x * f), Math.round(point.y * f));
    }

    @yfb
    public static final Point toPoint(@yfb PointF pointF) {
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @yfb
    public static final PointF toPointF(@yfb Point point) {
        return new PointF(point);
    }

    @yfb
    public static final Point unaryMinus(@yfb Point point) {
        return new Point(-point.x, -point.y);
    }

    public static final float component1(@yfb PointF pointF) {
        return pointF.x;
    }

    public static final float component2(@yfb PointF pointF) {
        return pointF.y;
    }

    @yfb
    public static final PointF div(@yfb PointF pointF, float f) {
        return new PointF(pointF.x / f, pointF.y / f);
    }

    @yfb
    public static final PointF times(@yfb PointF pointF, float f) {
        return new PointF(pointF.x * f, pointF.y * f);
    }

    @yfb
    public static final PointF unaryMinus(@yfb PointF pointF) {
        return new PointF(-pointF.x, -pointF.y);
    }

    @yfb
    public static final PointF minus(@yfb PointF pointF, @yfb PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    @yfb
    public static final PointF plus(@yfb PointF pointF, @yfb PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    @yfb
    public static final Point minus(@yfb Point point, int i) {
        Point point2 = new Point(point.x, point.y);
        int i2 = -i;
        point2.offset(i2, i2);
        return point2;
    }

    @yfb
    public static final Point plus(@yfb Point point, int i) {
        Point point2 = new Point(point.x, point.y);
        point2.offset(i, i);
        return point2;
    }

    @yfb
    public static final PointF minus(@yfb PointF pointF, float f) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f2 = -f;
        pointF2.offset(f2, f2);
        return pointF2;
    }

    @yfb
    public static final PointF plus(@yfb PointF pointF, float f) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f, f);
        return pointF2;
    }
}
