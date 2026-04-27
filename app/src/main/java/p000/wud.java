package p000;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,365:1\n344#1,3:366\n344#1,3:369\n257#1,6:372\n122#1,3:378\n132#1,3:381\n344#1,3:384\n344#1,3:387\n344#1,3:390\n1#2:393\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n191#1:366,3\n192#1:369,3\n251#1:372,6\n268#1:378,3\n273#1:381,3\n313#1:384,3\n314#1:387,3\n358#1:390,3\n*E\n"})
public final class wud {
    @yfb
    @igg({"CheckResult"})
    public static final Rect and(@yfb Rect rect, @yfb Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    public static final int component1(@yfb Rect rect) {
        return rect.left;
    }

    public static final int component2(@yfb Rect rect) {
        return rect.top;
    }

    public static final int component3(@yfb Rect rect) {
        return rect.right;
    }

    public static final int component4(@yfb Rect rect) {
        return rect.bottom;
    }

    public static final boolean contains(@yfb Rect rect, @yfb Point point) {
        return rect.contains(point.x, point.y);
    }

    @yfb
    public static final Region minus(@yfb Rect rect, @yfb Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @yfb
    /* JADX INFO: renamed from: or */
    public static final Rect m24828or(@yfb Rect rect, @yfb Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @yfb
    public static final Rect plus(@yfb Rect rect, @yfb Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @yfb
    public static final Rect times(@yfb Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        rect2.top *= i;
        rect2.left *= i;
        rect2.right *= i;
        rect2.bottom *= i;
        return rect2;
    }

    @yfb
    public static final Rect toRect(@yfb RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @yfb
    public static final RectF toRectF(@yfb Rect rect) {
        return new RectF(rect);
    }

    @yfb
    public static final Region toRegion(@yfb Rect rect) {
        return new Region(rect);
    }

    @yfb
    public static final RectF transform(@yfb RectF rectF, @yfb Matrix matrix) {
        matrix.mapRect(rectF);
        return rectF;
    }

    @yfb
    public static final Region xor(@yfb Rect rect, @yfb Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final float component1(@yfb RectF rectF) {
        return rectF.left;
    }

    public static final float component2(@yfb RectF rectF) {
        return rectF.top;
    }

    public static final float component3(@yfb RectF rectF) {
        return rectF.right;
    }

    public static final float component4(@yfb RectF rectF) {
        return rectF.bottom;
    }

    public static final boolean contains(@yfb RectF rectF, @yfb PointF pointF) {
        return rectF.contains(pointF.x, pointF.y);
    }

    @yfb
    public static final Region toRegion(@yfb RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @yfb
    @igg({"CheckResult"})
    public static final RectF and(@yfb RectF rectF, @yfb RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    @yfb
    public static final Region minus(@yfb RectF rectF, @yfb RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @yfb
    /* JADX INFO: renamed from: or */
    public static final RectF m24829or(@yfb RectF rectF, @yfb RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @yfb
    public static final RectF plus(@yfb RectF rectF, @yfb RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @yfb
    public static final Region xor(@yfb RectF rectF, @yfb RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @yfb
    public static final Rect plus(@yfb Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        rect2.offset(i, i);
        return rect2;
    }

    @yfb
    public static final RectF times(@yfb RectF rectF, float f) {
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @yfb
    public static final RectF plus(@yfb RectF rectF, float f) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f, f);
        return rectF2;
    }

    @yfb
    public static final Rect plus(@yfb Rect rect, @yfb Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    @yfb
    public static final Rect minus(@yfb Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        int i2 = -i;
        rect2.offset(i2, i2);
        return rect2;
    }

    @yfb
    public static final RectF plus(@yfb RectF rectF, @yfb PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    @yfb
    public static final RectF times(@yfb RectF rectF, int i) {
        float f = i;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @yfb
    public static final RectF minus(@yfb RectF rectF, float f) {
        RectF rectF2 = new RectF(rectF);
        float f2 = -f;
        rectF2.offset(f2, f2);
        return rectF2;
    }

    @yfb
    public static final Rect minus(@yfb Rect rect, @yfb Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    @yfb
    public static final RectF minus(@yfb RectF rectF, @yfb PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }
}
