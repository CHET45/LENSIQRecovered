package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class ks8 {

    /* JADX INFO: renamed from: a */
    public static final float f55228a = 100.0f;

    /* JADX INFO: renamed from: c */
    public static mxf<WeakReference<Interpolator>> f55230c;

    /* JADX INFO: renamed from: b */
    public static final Interpolator f55229b = new LinearInterpolator();

    /* JADX INFO: renamed from: d */
    public static jm8.C7981a f55231d = jm8.C7981a.m14177of("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: e */
    public static jm8.C7981a f55232e = jm8.C7981a.m14177of("x", "y");

    /* JADX INFO: renamed from: a */
    public static <T> hs8<T> m14977a(jm8 jm8Var, bn9 bn9Var, float f, r2i<T> r2iVar, boolean z, boolean z2) throws IOException {
        return (z && z2) ? parseMultiDimensionalKeyframe(bn9Var, jm8Var, f, r2iVar) : z ? parseKeyframe(bn9Var, jm8Var, f, r2iVar) : parseStaticValue(jm8Var, f, r2iVar);
    }

    @hib
    private static WeakReference<Interpolator> getInterpolator(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (ks8.class) {
            weakReference = pathInterpolatorCache().get(i);
        }
        return weakReference;
    }

    private static Interpolator interpolatorFor(PointF pointF, PointF pointF2) {
        Interpolator interpolatorCreate;
        pointF.x = awa.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = awa.clamp(pointF.y, -100.0f, 100.0f);
        pointF2.x = awa.clamp(pointF2.x, -1.0f, 1.0f);
        float fClamp = awa.clamp(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fClamp;
        int iHashFor = e1i.hashFor(pointF.x, pointF.y, pointF2.x, fClamp);
        WeakReference<Interpolator> interpolator = getInterpolator(iHashFor);
        Interpolator interpolator2 = interpolator != null ? interpolator.get() : null;
        if (interpolator == null || interpolator2 == null) {
            try {
                interpolatorCreate = gjc.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                interpolatorCreate = "The Path cannot loop back on itself.".equals(e.getMessage()) ? gjc.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator2 = interpolatorCreate;
            try {
                putInterpolator(iHashFor, new WeakReference(interpolator2));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator2;
    }

    private static <T> hs8<T> parseKeyframe(bn9 bn9Var, jm8 jm8Var, float f, r2i<T> r2iVar) throws IOException {
        Interpolator interpolatorInterpolatorFor;
        T t;
        jm8Var.beginObject();
        PointF pointFM26895b = null;
        T t2 = null;
        T t3 = null;
        PointF pointFM26895b2 = null;
        PointF pointFM26895b3 = null;
        float fNextDouble = 0.0f;
        boolean z = false;
        PointF pointFM26895b4 = null;
        while (jm8Var.hasNext()) {
            switch (jm8Var.selectName(f55231d)) {
                case 0:
                    fNextDouble = (float) jm8Var.nextDouble();
                    break;
                case 1:
                    t3 = r2iVar.parse(jm8Var, f);
                    break;
                case 2:
                    t2 = r2iVar.parse(jm8Var, f);
                    break;
                case 3:
                    pointFM26895b = zm8.m26895b(jm8Var, 1.0f);
                    break;
                case 4:
                    pointFM26895b4 = zm8.m26895b(jm8Var, 1.0f);
                    break;
                case 5:
                    z = jm8Var.nextInt() == 1;
                    break;
                case 6:
                    pointFM26895b2 = zm8.m26895b(jm8Var, f);
                    break;
                case 7:
                    pointFM26895b3 = zm8.m26895b(jm8Var, f);
                    break;
                default:
                    jm8Var.skipValue();
                    break;
            }
        }
        jm8Var.endObject();
        if (z) {
            interpolatorInterpolatorFor = f55229b;
            t = t3;
        } else {
            interpolatorInterpolatorFor = (pointFM26895b == null || pointFM26895b4 == null) ? f55229b : interpolatorFor(pointFM26895b, pointFM26895b4);
            t = t2;
        }
        hs8<T> hs8Var = new hs8<>(bn9Var, t3, t, interpolatorInterpolatorFor, fNextDouble, null);
        hs8Var.f44704o = pointFM26895b2;
        hs8Var.f44705p = pointFM26895b3;
        return hs8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> p000.hs8<T> parseMultiDimensionalKeyframe(p000.bn9 r21, p000.jm8 r22, float r23, p000.r2i<T> r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ks8.parseMultiDimensionalKeyframe(bn9, jm8, float, r2i):hs8");
    }

    private static <T> hs8<T> parseStaticValue(jm8 jm8Var, float f, r2i<T> r2iVar) throws IOException {
        return new hs8<>(r2iVar.parse(jm8Var, f));
    }

    private static mxf<WeakReference<Interpolator>> pathInterpolatorCache() {
        if (f55230c == null) {
            f55230c = new mxf<>();
        }
        return f55230c;
    }

    private static void putInterpolator(int i, WeakReference<Interpolator> weakReference) {
        synchronized (ks8.class) {
            f55230c.put(i, weakReference);
        }
    }
}
