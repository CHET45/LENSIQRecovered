package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class zu4 {

    /* JADX INFO: renamed from: a */
    public final int f106101a;

    /* JADX INFO: renamed from: b */
    public final bi7 f106102b;

    /* JADX INFO: renamed from: c */
    public final w2i f106103c;

    /* JADX INFO: renamed from: d */
    public final boolean f106104d;

    /* JADX INFO: renamed from: e */
    public final double f106105e;

    /* JADX INFO: renamed from: f */
    public final z3h f106106f;

    /* JADX INFO: renamed from: g */
    public final z3h f106107g;

    /* JADX INFO: renamed from: h */
    public final z3h f106108h;

    /* JADX INFO: renamed from: i */
    public final z3h f106109i;

    /* JADX INFO: renamed from: j */
    public final z3h f106110j;

    /* JADX INFO: renamed from: k */
    public final z3h f106111k = z3h.fromHueAndChroma(25.0d, 84.0d);

    public zu4(bi7 bi7Var, w2i w2iVar, boolean z, double d, z3h z3hVar, z3h z3hVar2, z3h z3hVar3, z3h z3hVar4, z3h z3hVar5) {
        this.f106101a = bi7Var.toInt();
        this.f106102b = bi7Var;
        this.f106103c = w2iVar;
        this.f106104d = z;
        this.f106105e = d;
        this.f106106f = z3hVar;
        this.f106107g = z3hVar2;
        this.f106108h = z3hVar3;
        this.f106109i = z3hVar4;
        this.f106110j = z3hVar5;
    }

    public static double getRotatedHue(bi7 bi7Var, double[] dArr, double[] dArr2) {
        double hue = bi7Var.getHue();
        int i = 0;
        if (dArr2.length == 1) {
            return s3a.sanitizeDegreesDouble(hue + dArr2[0]);
        }
        int length = dArr.length;
        while (i <= length - 2) {
            double d = dArr[i];
            int i2 = i + 1;
            double d2 = dArr[i2];
            if (d < hue && hue < d2) {
                return s3a.sanitizeDegreesDouble(hue + dArr2[i]);
            }
            i = i2;
        }
        return hue;
    }
}
