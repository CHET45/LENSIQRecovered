package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class qqe extends zu4 {

    /* JADX INFO: renamed from: l */
    public static final double[] f75135l = {0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d};

    /* JADX INFO: renamed from: m */
    public static final double[] f75136m = {18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d};

    /* JADX INFO: renamed from: n */
    public static final double[] f75137n = {35.0d, 30.0d, 20.0d, 25.0d, 30.0d, 35.0d, 30.0d, 25.0d, 25.0d};

    /* JADX WARN: Illegal instructions before constructor call */
    public qqe(bi7 bi7Var, boolean z, double d) {
        w2i w2iVar = w2i.VIBRANT;
        z3h z3hVarFromHueAndChroma = z3h.fromHueAndChroma(bi7Var.getHue(), 200.0d);
        double[] dArr = f75135l;
        super(bi7Var, w2iVar, z, d, z3hVarFromHueAndChroma, z3h.fromHueAndChroma(zu4.getRotatedHue(bi7Var, dArr, f75136m), 24.0d), z3h.fromHueAndChroma(zu4.getRotatedHue(bi7Var, dArr, f75137n), 32.0d), z3h.fromHueAndChroma(bi7Var.getHue(), 8.0d), z3h.fromHueAndChroma(bi7Var.getHue(), 12.0d));
    }
}
