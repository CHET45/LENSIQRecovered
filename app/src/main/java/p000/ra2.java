package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ra2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final ra2 f77522a = new ra2();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final float[] f77523b;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final float[] f77524c;

    /* JADX INFO: renamed from: d */
    @yfb
    public static final rdh f77525d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final rdh f77526e;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final eae f77527f;

    /* JADX INFO: renamed from: g */
    @yfb
    public static final eae f77528g;

    /* JADX INFO: renamed from: h */
    @yfb
    public static final eae f77529h;

    /* JADX INFO: renamed from: i */
    @yfb
    public static final eae f77530i;

    /* JADX INFO: renamed from: j */
    @yfb
    public static final eae f77531j;

    /* JADX INFO: renamed from: k */
    @yfb
    public static final eae f77532k;

    /* JADX INFO: renamed from: l */
    @yfb
    public static final eae f77533l;

    /* JADX INFO: renamed from: m */
    @yfb
    public static final eae f77534m;

    /* JADX INFO: renamed from: n */
    @yfb
    public static final eae f77535n;

    /* JADX INFO: renamed from: o */
    @yfb
    public static final eae f77536o;

    /* JADX INFO: renamed from: p */
    @yfb
    public static final eae f77537p;

    /* JADX INFO: renamed from: q */
    @yfb
    public static final eae f77538q;

    /* JADX INFO: renamed from: r */
    @yfb
    public static final eae f77539r;

    /* JADX INFO: renamed from: s */
    @yfb
    public static final eae f77540s;

    /* JADX INFO: renamed from: t */
    @yfb
    public static final ia2 f77541t;

    /* JADX INFO: renamed from: u */
    @yfb
    public static final ia2 f77542u;

    /* JADX INFO: renamed from: v */
    @yfb
    public static final eae f77543v;

    /* JADX INFO: renamed from: w */
    @yfb
    public static final ia2 f77544w;

    /* JADX INFO: renamed from: x */
    @yfb
    public static final ia2[] f77545x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f77523b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f77524c = fArr2;
        rdh rdhVar = new rdh(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f77525d = rdhVar;
        rdh rdhVar2 = new rdh(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f77526e = rdhVar2;
        ns7 ns7Var = ns7.f65485a;
        eae eaeVar = new eae("sRGB IEC61966-2.1", fArr, ns7Var.getD65(), rdhVar, 0);
        f77527f = eaeVar;
        eae eaeVar2 = new eae("sRGB IEC61966-2.1 (Linear)", fArr, ns7Var.getD65(), 1.0d, 0.0f, 1.0f, 1);
        f77528g = eaeVar2;
        eae eaeVar3 = new eae("scRGB-nl IEC 61966-2-2:2003", fArr, ns7Var.getD65(), null, new bk4() { // from class: pa2
            @Override // p000.bk4
            public final double invoke(double d) {
                return ra2.ExtendedSrgb$lambda$0(d);
            }
        }, new bk4() { // from class: qa2
            @Override // p000.bk4
            public final double invoke(double d) {
                return ra2.ExtendedSrgb$lambda$1(d);
            }
        }, -0.799f, 2.399f, rdhVar, 2);
        f77529h = eaeVar3;
        eae eaeVar4 = new eae("scRGB IEC 61966-2-2:2003", fArr, ns7Var.getD65(), 1.0d, -0.5f, 7.499f, 3);
        f77530i = eaeVar4;
        eae eaeVar5 = new eae("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, ns7Var.getD65(), new rdh(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f77531j = eaeVar5;
        eae eaeVar6 = new eae("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, ns7Var.getD65(), new rdh(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f77532k = eaeVar6;
        eae eaeVar7 = new eae("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new qki(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f77533l = eaeVar7;
        eae eaeVar8 = new eae("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, ns7Var.getD65(), rdhVar, 7);
        f77534m = eaeVar8;
        eae eaeVar9 = new eae("NTSC (1953)", fArr2, ns7Var.getC(), new rdh(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f77535n = eaeVar9;
        eae eaeVar10 = new eae("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, ns7Var.getD65(), new rdh(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f77536o = eaeVar10;
        eae eaeVar11 = new eae("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, ns7Var.getD65(), 2.2d, 0.0f, 1.0f, 10);
        f77537p = eaeVar11;
        eae eaeVar12 = new eae("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, ns7Var.getD50(), new rdh(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f77538q = eaeVar12;
        eae eaeVar13 = new eae("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, ns7Var.getD60(), 1.0d, -65504.0f, 65504.0f, 12);
        f77539r = eaeVar13;
        eae eaeVar14 = new eae("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, ns7Var.getD60(), 1.0d, -65504.0f, 65504.0f, 13);
        f77540s = eaeVar14;
        iti itiVar = new iti("Generic XYZ", 14);
        f77541t = itiVar;
        mt8 mt8Var = new mt8("Generic L*a*b*", 15);
        f77542u = mt8Var;
        eae eaeVar15 = new eae("None", fArr, ns7Var.getD65(), rdhVar2, 16);
        f77543v = eaeVar15;
        r1c r1cVar = new r1c("Oklab", 17);
        f77544w = r1cVar;
        f77545x = new ia2[]{eaeVar, eaeVar2, eaeVar3, eaeVar4, eaeVar5, eaeVar6, eaeVar7, eaeVar8, eaeVar9, eaeVar10, eaeVar11, eaeVar12, eaeVar13, eaeVar14, itiVar, mt8Var, eaeVar15, r1cVar};
    }

    private ra2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double ExtendedSrgb$lambda$0(double d) {
        return ja2.absRcpResponse(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double ExtendedSrgb$lambda$1(double d) {
        return ja2.absResponse(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    @yfb
    public final eae getAces() {
        return f77539r;
    }

    @yfb
    public final eae getAcescg() {
        return f77540s;
    }

    @yfb
    public final eae getAdobeRgb() {
        return f77537p;
    }

    @yfb
    public final eae getBt2020() {
        return f77532k;
    }

    @yfb
    public final eae getBt709() {
        return f77531j;
    }

    @yfb
    public final ia2 getCieLab() {
        return f77542u;
    }

    @yfb
    public final ia2 getCieXyz() {
        return f77541t;
    }

    @yfb
    public final ia2 getColorSpace$ui_graphics_release(int i) {
        return getColorSpacesArray$ui_graphics_release()[i];
    }

    @yfb
    public final ia2[] getColorSpacesArray$ui_graphics_release() {
        return f77545x;
    }

    @yfb
    public final eae getDciP3() {
        return f77533l;
    }

    @yfb
    public final eae getDisplayP3() {
        return f77534m;
    }

    @yfb
    public final eae getExtendedSrgb() {
        return f77529h;
    }

    @yfb
    public final eae getLinearExtendedSrgb() {
        return f77530i;
    }

    @yfb
    public final eae getLinearSrgb() {
        return f77528g;
    }

    @yfb
    public final eae getNtsc1953() {
        return f77535n;
    }

    @yfb
    public final float[] getNtsc1953Primaries$ui_graphics_release() {
        return f77524c;
    }

    @yfb
    public final ia2 getOklab() {
        return f77544w;
    }

    @yfb
    public final eae getProPhotoRgb() {
        return f77538q;
    }

    @yfb
    public final eae getSmpteC() {
        return f77536o;
    }

    @yfb
    public final eae getSrgb() {
        return f77527f;
    }

    @yfb
    public final float[] getSrgbPrimaries$ui_graphics_release() {
        return f77523b;
    }

    @yfb
    public final rdh getSrgbTransferParameters$ui_graphics_release() {
        return f77525d;
    }

    @yfb
    public final eae getUnspecified$ui_graphics_release() {
        return f77543v;
    }

    @gib
    public final ia2 match(@yfb @zpf(9) float[] fArr, @yfb rdh rdhVar) {
        for (ia2 ia2Var : f77545x) {
            if (o92.m31296equalsimpl0(ia2Var.m30176getModelxdoWZVw(), o92.f66827b.m31303getRgbxdoWZVw())) {
                ia2 ia2VarAdapt$default = ja2.adapt$default(ia2Var, ns7.f65485a.getD50(), null, 2, null);
                md8.checkNotNull(ia2VarAdapt$default, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                eae eaeVar = (eae) ia2VarAdapt$default;
                if (ja2.compare(fArr, eaeVar.getTransform$ui_graphics_release()) && ja2.compare(rdhVar, eaeVar.getTransferParameters())) {
                    return ia2Var;
                }
            }
        }
        return null;
    }
}
