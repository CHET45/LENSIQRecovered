package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class lqe extends zu4 {

    /* JADX INFO: renamed from: l */
    public static final double[] f58474l = {0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d};

    /* JADX INFO: renamed from: m */
    public static final double[] f58475m = {45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d};

    /* JADX INFO: renamed from: n */
    public static final double[] f58476n = {120.0d, 120.0d, 20.0d, 45.0d, 20.0d, 15.0d, 20.0d, 120.0d, 120.0d};

    /* JADX WARN: Illegal instructions before constructor call */
    public lqe(bi7 bi7Var, boolean z, double d) {
        w2i w2iVar = w2i.EXPRESSIVE;
        z3h z3hVarFromHueAndChroma = z3h.fromHueAndChroma(s3a.sanitizeDegreesDouble(bi7Var.getHue() + 120.0d), 40.0d);
        double[] dArr = f58474l;
        super(bi7Var, w2iVar, z, d, z3hVarFromHueAndChroma, z3h.fromHueAndChroma(zu4.getRotatedHue(bi7Var, dArr, f58475m), 24.0d), z3h.fromHueAndChroma(zu4.getRotatedHue(bi7Var, dArr, f58476n), 32.0d), z3h.fromHueAndChroma(bi7Var.getHue(), 8.0d), z3h.fromHueAndChroma(bi7Var.getHue(), 12.0d));
    }
}
