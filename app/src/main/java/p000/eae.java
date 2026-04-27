package p000;

import android.support.v4.media.MediaDescriptionCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1382:1\n716#2:1383\n735#2:1384\n754#2:1388\n716#2:1389\n735#2:1390\n754#2:1391\n63#3,3:1385\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n897#1:1383\n898#1:1384\n908#1:1388\n920#1:1389\n921#1:1390\n922#1:1391\n900#1:1385,3\n*E\n"})
public final class eae extends ia2 {

    /* JADX INFO: renamed from: v */
    @yfb
    public static final C5216a f32359v = new C5216a(null);

    /* JADX INFO: renamed from: w */
    @yfb
    public static final bk4 f32360w = new bk4() { // from class: w9e
        @Override // p000.bk4
        public final double invoke(double d) {
            return eae.DoubleIdentity$lambda$12(d);
        }
    };

    /* JADX INFO: renamed from: g */
    @yfb
    public final qki f32361g;

    /* JADX INFO: renamed from: h */
    public final float f32362h;

    /* JADX INFO: renamed from: i */
    public final float f32363i;

    /* JADX INFO: renamed from: j */
    @gib
    public final rdh f32364j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final float[] f32365k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final float[] f32366l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final float[] f32367m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final bk4 f32368n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final qy6<Double, Double> f32369o;

    /* JADX INFO: renamed from: p */
    @yfb
    public final bk4 f32370p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final bk4 f32371q;

    /* JADX INFO: renamed from: r */
    @yfb
    public final qy6<Double, Double> f32372r;

    /* JADX INFO: renamed from: s */
    @yfb
    public final bk4 f32373s;

    /* JADX INFO: renamed from: t */
    public final boolean f32374t;

    /* JADX INFO: renamed from: u */
    public final boolean f32375u;

    /* JADX INFO: renamed from: eae$a */
    public static final class C5216a {
        public /* synthetic */ C5216a(jt3 jt3Var) {
            this();
        }

        private final float area(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        private final boolean compare(double d, bk4 bk4Var, bk4 bk4Var2) {
            return Math.abs(bk4Var.invoke(d) - bk4Var2.invoke(d)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final qki computeWhitePoint(float[] fArr) {
            float[] fArrMul3x3Float3 = ja2.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f = fArrMul3x3Float3[0];
            float f2 = fArrMul3x3Float3[1];
            float f3 = f + f2 + fArrMul3x3Float3[2];
            return new qki(f / f3, f2 / f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] fArr, qki qkiVar) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float x = qkiVar.getX();
            float y = qkiVar.getY();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = (f7 - f3) / f4;
            float f10 = (f7 - f5) / f6;
            float f11 = (f7 - x) / y;
            float f12 = f / f2;
            float f13 = (f3 / f4) - f12;
            float f14 = (x / y) - f12;
            float f15 = f9 - f8;
            float f16 = (f5 / f6) - f12;
            float f17 = (((f11 - f8) * f13) - (f14 * f15)) / (((f10 - f8) * f13) - (f15 * f16));
            float f18 = (f14 - (f16 * f17)) / f13;
            float f19 = (1.0f - f18) - f17;
            float f20 = f19 / f2;
            float f21 = f18 / f4;
            float f22 = f17 / f6;
            return new float[]{f20 * f, f19, f20 * ((1.0f - f) - f2), f21 * f3, f18, f21 * ((1.0f - f3) - f4), f22 * f5, f17, f22 * ((1.0f - f5) - f6)};
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr[1];
            float f4 = fArr2[1];
            float f5 = fArr[2] - fArr2[2];
            float f6 = fArr[3] - fArr2[3];
            float f7 = fArr[4];
            float f8 = fArr2[4];
            float f9 = fArr[5];
            float f10 = fArr2[5];
            float[] fArr3 = {f - f2, f3 - f4, f5, f6, f7 - f8, f9 - f10};
            return cross(fArr3[0], fArr3[1], f2 - f8, f4 - f10) >= 0.0f && cross(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && cross(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && cross(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && cross(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && cross(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        private final float cross(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] fArr, qki qkiVar, bk4 bk4Var, bk4 bk4Var2, float f, float f2, int i) {
            if (i == 0) {
                return true;
            }
            ra2 ra2Var = ra2.f77522a;
            if (!ja2.compare(fArr, ra2Var.getSrgbPrimaries$ui_graphics_release()) || !ja2.compare(qkiVar, ns7.f65485a.getD65()) || f != 0.0f || f2 != 1.0f) {
                return false;
            }
            eae srgb = ra2Var.getSrgb();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!compare(d, bk4Var, srgb.getOetfOrig$ui_graphics_release()) || !compare(d, bk4Var2, srgb.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] fArr, float f, float f2) {
            float fArea = area(fArr);
            ra2 ra2Var = ra2.f77522a;
            return (fArea / area(ra2Var.getNtsc1953Primaries$ui_graphics_release()) > 0.9f && contains(fArr, ra2Var.getSrgbPrimaries$ui_graphics_release())) || (f < 0.0f && f2 > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = f + f2 + fArr[2];
                fArr2[0] = f / f3;
                fArr2[1] = f2 / f3;
                float f4 = fArr[3];
                float f5 = fArr[4];
                float f6 = f4 + f5 + fArr[5];
                fArr2[2] = f4 / f6;
                fArr2[3] = f5 / f6;
                float f7 = fArr[6];
                float f8 = fArr[7];
                float f9 = f7 + f8 + fArr[8];
                fArr2[4] = f7 / f9;
                fArr2[5] = f8 / f9;
            } else {
                u70.copyInto$default(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }

        @yfb
        public final float[] computePrimaries$ui_graphics_release(@yfb float[] fArr) {
            float[] fArrMul3x3Float3 = ja2.mul3x3Float3(fArr, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float32 = ja2.mul3x3Float3(fArr, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float33 = ja2.mul3x3Float3(fArr, new float[]{0.0f, 0.0f, 1.0f});
            float f = fArrMul3x3Float3[0];
            float f2 = fArrMul3x3Float3[1];
            float f3 = f + f2 + fArrMul3x3Float3[2];
            float f4 = fArrMul3x3Float32[0];
            float f5 = fArrMul3x3Float32[1];
            float f6 = f4 + f5 + fArrMul3x3Float32[2];
            float f7 = fArrMul3x3Float33[0];
            float f8 = fArrMul3x3Float33[1];
            float f9 = f7 + f8 + fArrMul3x3Float33[2];
            return new float[]{f / f3, f2 / f3, f4 / f6, f5 / f6, f7 / f9, f8 / f9};
        }

        private C5216a() {
        }
    }

    /* JADX INFO: renamed from: eae$b */
    public static final class C5217b extends tt8 implements qy6<Double, Double> {
        public C5217b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return invoke(d.doubleValue());
        }

        @yfb
        public final Double invoke(double d) {
            return Double.valueOf(eae.this.getEotfOrig$ui_graphics_release().invoke(kpd.coerceIn(d, eae.this.f32362h, eae.this.f32363i)));
        }
    }

    /* JADX INFO: renamed from: eae$c */
    public static final class C5218c extends tt8 implements qy6<Double, Double> {
        public C5218c() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return invoke(d.doubleValue());
        }

        @yfb
        public final Double invoke(double d) {
            return Double.valueOf(kpd.coerceIn(eae.this.getOetfOrig$ui_graphics_release().invoke(d), eae.this.f32362h, eae.this.f32363i));
        }
    }

    public eae(@yfb String str, @yfb float[] fArr, @yfb qki qkiVar, @gib float[] fArr2, @yfb bk4 bk4Var, @yfb bk4 bk4Var2, float f, float f2, @gib rdh rdhVar, int i) {
        super(str, o92.f66827b.m31303getRgbxdoWZVw(), i, null);
        this.f32361g = qkiVar;
        this.f32362h = f;
        this.f32363i = f2;
        this.f32364j = rdhVar;
        this.f32368n = bk4Var;
        this.f32369o = new C5218c();
        this.f32370p = new bk4() { // from class: r9e
            @Override // p000.bk4
            public final double invoke(double d) {
                return eae.oetfFunc$lambda$0(this.f77461a, d);
            }
        };
        this.f32371q = bk4Var2;
        this.f32372r = new C5217b();
        this.f32373s = new bk4() { // from class: v9e
            @Override // p000.bk4
            public final double invoke(double d) {
                return eae.eotfFunc$lambda$1(this.f90403a, d);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        C5216a c5216a = f32359v;
        float[] fArrXyPrimaries = c5216a.xyPrimaries(fArr);
        this.f32365k = fArrXyPrimaries;
        if (fArr2 == null) {
            this.f32366l = c5216a.computeXYZMatrix(fArrXyPrimaries, qkiVar);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f32366l = fArr2;
        }
        this.f32367m = ja2.inverse3x3(this.f32366l);
        this.f32374t = c5216a.isWideGamut(fArrXyPrimaries, f, f2);
        this.f32375u = c5216a.isSrgb(fArrXyPrimaries, qkiVar, bk4Var, bk4Var2, f, f2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$12(double d) {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$10(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$11(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(qy6 qy6Var, double d) {
        return ((Number) qy6Var.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(qy6 qy6Var, double d) {
        return ((Number) qy6Var.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(qy6 qy6Var, double d) {
        return ((Number) qy6Var.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(qy6 qy6Var, double d) {
        return ((Number) qy6Var.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$6(rdh rdhVar, double d) {
        return ja2.rcpResponse(d, rdhVar.getA(), rdhVar.getB(), rdhVar.getC(), rdhVar.getD(), rdhVar.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$7(rdh rdhVar, double d) {
        return ja2.rcpResponse(d, rdhVar.getA(), rdhVar.getB(), rdhVar.getC(), rdhVar.getD(), rdhVar.getE(), rdhVar.getF(), rdhVar.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$8(rdh rdhVar, double d) {
        return ja2.response(d, rdhVar.getA(), rdhVar.getB(), rdhVar.getC(), rdhVar.getD(), rdhVar.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$9(rdh rdhVar, double d) {
        return ja2.response(d, rdhVar.getA(), rdhVar.getB(), rdhVar.getC(), rdhVar.getD(), rdhVar.getE(), rdhVar.getF(), rdhVar.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(eae eaeVar, double d) {
        return eaeVar.f32371q.invoke(kpd.coerceIn(d, eaeVar.f32362h, eaeVar.f32363i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(eae eaeVar, double d) {
        return kpd.coerceIn(eaeVar.f32368n.invoke(d), eaeVar.f32362h, eaeVar.f32363i);
    }

    @Override // p000.ia2
    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eae.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        eae eaeVar = (eae) obj;
        if (Float.compare(eaeVar.f32362h, this.f32362h) != 0 || Float.compare(eaeVar.f32363i, this.f32363i) != 0 || !md8.areEqual(this.f32361g, eaeVar.f32361g) || !Arrays.equals(this.f32365k, eaeVar.f32365k)) {
            return false;
        }
        rdh rdhVar = this.f32364j;
        if (rdhVar != null) {
            return md8.areEqual(rdhVar, eaeVar.f32364j);
        }
        if (eaeVar.f32364j == null) {
            return true;
        }
        if (md8.areEqual(this.f32368n, eaeVar.f32368n)) {
            return md8.areEqual(this.f32371q, eaeVar.f32371q);
        }
        return false;
    }

    @yfb
    @zpf(3)
    public final float[] fromLinear(float f, float f2, float f3) {
        return fromLinear(new float[]{f, f2, f3});
    }

    @Override // p000.ia2
    @yfb
    public float[] fromXyz(@yfb float[] fArr) {
        ja2.mul3x3Float3(this.f32367m, fArr);
        fArr[0] = (float) this.f32370p.invoke(fArr[0]);
        fArr[1] = (float) this.f32370p.invoke(fArr[1]);
        fArr[2] = (float) this.f32370p.invoke(fArr[2]);
        return fArr;
    }

    @yfb
    public final qy6<Double, Double> getEotf() {
        return this.f32372r;
    }

    @yfb
    public final bk4 getEotfFunc$ui_graphics_release() {
        return this.f32373s;
    }

    @yfb
    public final bk4 getEotfOrig$ui_graphics_release() {
        return this.f32371q;
    }

    @yfb
    @zpf(9)
    public final float[] getInverseTransform() {
        float[] fArr = this.f32367m;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @yfb
    public final float[] getInverseTransform$ui_graphics_release() {
        return this.f32367m;
    }

    @Override // p000.ia2
    public float getMaxValue(int i) {
        return this.f32363i;
    }

    @Override // p000.ia2
    public float getMinValue(int i) {
        return this.f32362h;
    }

    @yfb
    public final qy6<Double, Double> getOetf() {
        return this.f32369o;
    }

    @yfb
    public final bk4 getOetfFunc$ui_graphics_release() {
        return this.f32370p;
    }

    @yfb
    public final bk4 getOetfOrig$ui_graphics_release() {
        return this.f32368n;
    }

    @yfb
    @zpf(MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS)
    public final float[] getPrimaries() {
        float[] fArr = this.f32365k;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @yfb
    public final float[] getPrimaries$ui_graphics_release() {
        return this.f32365k;
    }

    @gib
    public final rdh getTransferParameters() {
        return this.f32364j;
    }

    @yfb
    @zpf(9)
    public final float[] getTransform() {
        float[] fArr = this.f32366l;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @yfb
    public final float[] getTransform$ui_graphics_release() {
        return this.f32366l;
    }

    @yfb
    public final qki getWhitePoint() {
        return this.f32361g;
    }

    @Override // p000.ia2
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.f32361g.hashCode()) * 31) + Arrays.hashCode(this.f32365k)) * 31;
        float f = this.f32362h;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f32363i;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        rdh rdhVar = this.f32364j;
        int iHashCode2 = iFloatToIntBits2 + (rdhVar != null ? rdhVar.hashCode() : 0);
        return this.f32364j == null ? (((iHashCode2 * 31) + this.f32368n.hashCode()) * 31) + this.f32371q.hashCode() : iHashCode2;
    }

    @Override // p000.ia2
    public boolean isSrgb() {
        return this.f32375u;
    }

    @Override // p000.ia2
    public boolean isWideGamut() {
        return this.f32374t;
    }

    @yfb
    @zpf(3)
    public final float[] toLinear(float f, float f2, float f3) {
        return toLinear(new float[]{f, f2, f3});
    }

    @Override // p000.ia2
    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float fInvoke = (float) this.f32373s.invoke(f);
        float fInvoke2 = (float) this.f32373s.invoke(f2);
        float fInvoke3 = (float) this.f32373s.invoke(f3);
        float[] fArr = this.f32366l;
        return (((long) Float.floatToRawIntBits(((fArr[0] * fInvoke) + (fArr[3] * fInvoke2)) + (fArr[6] * fInvoke3))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * fInvoke) + (fArr[4] * fInvoke2) + (fArr[7] * fInvoke3))) & 4294967295L);
    }

    @Override // p000.ia2
    @yfb
    public float[] toXyz(@yfb float[] fArr) {
        fArr[0] = (float) this.f32373s.invoke(fArr[0]);
        fArr[1] = (float) this.f32373s.invoke(fArr[1]);
        fArr[2] = (float) this.f32373s.invoke(fArr[2]);
        return ja2.mul3x3Float3(this.f32366l, fArr);
    }

    @Override // p000.ia2
    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        float fInvoke = (float) this.f32373s.invoke(f);
        float fInvoke2 = (float) this.f32373s.invoke(f2);
        float fInvoke3 = (float) this.f32373s.invoke(f3);
        float[] fArr = this.f32366l;
        return (fArr[2] * fInvoke) + (fArr[5] * fInvoke2) + (fArr[8] * fInvoke3);
    }

    @Override // p000.ia2
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release, reason: not valid java name */
    public long mo28819xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, @yfb ia2 ia2Var) {
        float[] fArr = this.f32367m;
        return j92.Color((float) this.f32370p.invoke((fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3)), (float) this.f32370p.invoke((fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3)), (float) this.f32370p.invoke((fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3)), f4, ia2Var);
    }

    @yfb
    @zpf(min = 3)
    public final float[] fromLinear(@yfb @zpf(min = 3) float[] fArr) {
        fArr[0] = (float) this.f32370p.invoke(fArr[0]);
        fArr[1] = (float) this.f32370p.invoke(fArr[1]);
        fArr[2] = (float) this.f32370p.invoke(fArr[2]);
        return fArr;
    }

    @yfb
    @zpf(min = 9)
    public final float[] getInverseTransform(@yfb @zpf(min = 9) float[] fArr) {
        return u70.copyInto$default(this.f32367m, fArr, 0, 0, 0, 14, (Object) null);
    }

    @yfb
    @zpf(min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS)
    public final float[] getPrimaries(@yfb @zpf(min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) float[] fArr) {
        return u70.copyInto$default(this.f32365k, fArr, 0, 0, 0, 14, (Object) null);
    }

    @yfb
    @zpf(min = 9)
    public final float[] getTransform(@yfb @zpf(min = 9) float[] fArr) {
        return u70.copyInto$default(this.f32366l, fArr, 0, 0, 0, 14, (Object) null);
    }

    @yfb
    @zpf(min = 3)
    public final float[] toLinear(@yfb @zpf(min = 3) float[] fArr) {
        fArr[0] = (float) this.f32373s.invoke(fArr[0]);
        fArr[1] = (float) this.f32373s.invoke(fArr[1]);
        fArr[2] = (float) this.f32373s.invoke(fArr[2]);
        return fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eae(@yfb @zpf(min = 1) String str, @yfb @zpf(9) float[] fArr, @yfb final qy6<? super Double, Double> qy6Var, @yfb final qy6<? super Double, Double> qy6Var2) {
        C5216a c5216a = f32359v;
        this(str, c5216a.computePrimaries$ui_graphics_release(fArr), c5216a.computeWhitePoint(fArr), null, new bk4() { // from class: x9e
            @Override // p000.bk4
            public final double invoke(double d) {
                return eae._init_$lambda$2(qy6Var, d);
            }
        }, new bk4() { // from class: y9e
            @Override // p000.bk4
            public final double invoke(double d) {
                return eae._init_$lambda$3(qy6Var2, d);
            }
        }, 0.0f, 1.0f, null, -1);
    }

    public eae(@yfb @zpf(min = 1) String str, @yfb @zpf(max = 9, min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) float[] fArr, @yfb qki qkiVar, @yfb final qy6<? super Double, Double> qy6Var, @yfb final qy6<? super Double, Double> qy6Var2, float f, float f2) {
        this(str, fArr, qkiVar, null, new bk4() { // from class: bae
            @Override // p000.bk4
            public final double invoke(double d) {
                return eae._init_$lambda$4(qy6Var, d);
            }
        }, new bk4() { // from class: cae
            @Override // p000.bk4
            public final double invoke(double d) {
                return eae._init_$lambda$5(qy6Var2, d);
            }
        }, f, f2, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eae(@yfb @zpf(min = 1) String str, @yfb @zpf(9) float[] fArr, @yfb rdh rdhVar) {
        C5216a c5216a = f32359v;
        this(str, c5216a.computePrimaries$ui_graphics_release(fArr), c5216a.computeWhitePoint(fArr), rdhVar, -1);
    }

    public eae(@yfb @zpf(min = 1) String str, @yfb @zpf(max = 9, min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) float[] fArr, @yfb qki qkiVar, @yfb rdh rdhVar) {
        this(str, fArr, qkiVar, rdhVar, -1);
    }

    public eae(@yfb String str, @yfb float[] fArr, @yfb qki qkiVar, @yfb final rdh rdhVar, int i) {
        this(str, fArr, qkiVar, null, (rdhVar.getE() == 0.0d && rdhVar.getF() == 0.0d) ? new bk4() { // from class: dae
            @Override // p000.bk4
            public final double invoke(double d) {
                return eae._init_$lambda$6(rdhVar, d);
            }
        } : new bk4() { // from class: s9e
            @Override // p000.bk4
            public final double invoke(double d) {
                return eae._init_$lambda$7(rdhVar, d);
            }
        }, (rdhVar.getE() == 0.0d && rdhVar.getF() == 0.0d) ? new bk4() { // from class: t9e
            @Override // p000.bk4
            public final double invoke(double d) {
                return eae._init_$lambda$8(rdhVar, d);
            }
        } : new bk4() { // from class: u9e
            @Override // p000.bk4
            public final double invoke(double d) {
                return eae._init_$lambda$9(rdhVar, d);
            }
        }, 0.0f, 1.0f, rdhVar, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eae(@yfb @zpf(min = 1) String str, @yfb @zpf(9) float[] fArr, double d) {
        C5216a c5216a = f32359v;
        this(str, c5216a.computePrimaries$ui_graphics_release(fArr), c5216a.computeWhitePoint(fArr), d, 0.0f, 1.0f, -1);
    }

    public eae(@yfb @zpf(min = 1) String str, @yfb @zpf(max = 9, min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) float[] fArr, @yfb qki qkiVar, double d) {
        this(str, fArr, qkiVar, d, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eae(@yfb String str, @yfb float[] fArr, @yfb qki qkiVar, final double d, float f, float f2, int i) {
        bk4 bk4Var;
        bk4 bk4Var2;
        if (d == 1.0d) {
            bk4Var = f32360w;
        } else {
            bk4Var = new bk4() { // from class: z9e
                @Override // p000.bk4
                public final double invoke(double d2) {
                    return eae._init_$lambda$10(d, d2);
                }
            };
        }
        bk4 bk4Var3 = bk4Var;
        if (d == 1.0d) {
            bk4Var2 = f32360w;
        } else {
            bk4Var2 = new bk4() { // from class: aae
                @Override // p000.bk4
                public final double invoke(double d2) {
                    return eae._init_$lambda$11(d, d2);
                }
            };
        }
        this(str, fArr, qkiVar, null, bk4Var3, bk4Var2, f, f2, new rdh(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i);
    }

    public eae(@yfb eae eaeVar, @yfb float[] fArr, @yfb qki qkiVar) {
        this(eaeVar.getName(), eaeVar.f32365k, qkiVar, fArr, eaeVar.f32368n, eaeVar.f32371q, eaeVar.f32362h, eaeVar.f32363i, eaeVar.f32364j, -1);
    }
}
