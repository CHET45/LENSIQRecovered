package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,171:1\n71#2,16:172\n71#2,16:188\n71#2,16:204\n71#2,16:220\n71#2,16:236\n71#2,16:252\n71#2,16:276\n71#2,16:292\n71#2,16:308\n716#3:268\n735#3:269\n754#3:270\n716#3:271\n735#3:272\n716#3:324\n735#3:325\n754#3:326\n754#3:327\n716#3:328\n735#3:329\n754#3:330\n716#3:331\n735#3:332\n754#3:333\n63#4,3:273\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n48#1:172,16\n49#1:188,16\n50#1:204,16\n62#1:220,16\n63#1:236,16\n64#1:252,16\n81#1:276,16\n82#1:292,16\n83#1:308,16\n66#1:268\n67#1:269\n68#1:270\n74#1:271\n75#1:272\n85#1:324\n86#1:325\n87#1:326\n93#1:327\n105#1:328\n106#1:329\n107#1:330\n113#1:331\n114#1:332\n115#1:333\n77#1:273,3\n*E\n"})
public final class r1c extends ia2 {

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C11847a f76777g = new C11847a(null);

    /* JADX INFO: renamed from: h */
    @yfb
    public static final float[] f76778h;

    /* JADX INFO: renamed from: i */
    @yfb
    public static final float[] f76779i;

    /* JADX INFO: renamed from: j */
    @yfb
    public static final float[] f76780j;

    /* JADX INFO: renamed from: k */
    @yfb
    public static final float[] f76781k;

    /* JADX INFO: renamed from: r1c$a */
    public static final class C11847a {
        public /* synthetic */ C11847a(jt3 jt3Var) {
            this();
        }

        private C11847a() {
        }
    }

    static {
        float[] transform$ui_graphics_release = AbstractC7898jh.f50507b.getBradford().getTransform$ui_graphics_release();
        ns7 ns7Var = ns7.f65485a;
        float[] fArrMul3x3 = ja2.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ja2.chromaticAdaptation(transform$ui_graphics_release, ns7Var.getD50().toXyz$ui_graphics_release(), ns7Var.getD65().toXyz$ui_graphics_release()));
        f76778h = fArrMul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f76779i = fArr;
        f76780j = ja2.inverse3x3(fArrMul3x3);
        f76781k = ja2.inverse3x3(fArr);
    }

    public r1c(@yfb String str, int i) {
        super(str, o92.f66827b.m31302getLabxdoWZVw(), i, null);
    }

    @Override // p000.ia2
    @yfb
    public float[] fromXyz(@yfb float[] fArr) {
        ja2.mul3x3Float3(f76778h, fArr);
        fArr[0] = m3a.fastCbrt(fArr[0]);
        fArr[1] = m3a.fastCbrt(fArr[1]);
        fArr[2] = m3a.fastCbrt(fArr[2]);
        ja2.mul3x3Float3(f76779i, fArr);
        return fArr;
    }

    @Override // p000.ia2
    public float getMaxValue(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // p000.ia2
    public float getMinValue(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // p000.ia2
    public boolean isWideGamut() {
        return true;
    }

    @Override // p000.ia2
    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f76781k;
        float f5 = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f4);
        float f6 = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f4);
        float f7 = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f4);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f76780j;
        return (((long) Float.floatToRawIntBits(((fArr2[0] * f8) + (fArr2[3] * f9)) + (fArr2[6] * f10))) << 32) | (((long) Float.floatToRawIntBits((fArr2[1] * f8) + (fArr2[4] * f9) + (fArr2[7] * f10))) & 4294967295L);
    }

    @Override // p000.ia2
    @yfb
    public float[] toXyz(@yfb float[] fArr) {
        float f = fArr[0];
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        fArr[0] = f;
        float f2 = fArr[1];
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        fArr[1] = f2;
        float f3 = fArr[2];
        float f4 = f3 >= -0.5f ? f3 : -0.5f;
        fArr[2] = f4 <= 0.5f ? f4 : 0.5f;
        ja2.mul3x3Float3(f76781k, fArr);
        float f5 = fArr[0];
        fArr[0] = f5 * f5 * f5;
        float f6 = fArr[1];
        fArr[1] = f6 * f6 * f6;
        float f7 = fArr[2];
        fArr[2] = f7 * f7 * f7;
        ja2.mul3x3Float3(f76780j, fArr);
        return fArr;
    }

    @Override // p000.ia2
    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f76781k;
        float f5 = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f4);
        float f6 = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f4);
        float f7 = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f4);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float[] fArr2 = f76780j;
        return (fArr2[2] * f8) + (fArr2[5] * f9) + (fArr2[8] * f7 * f7 * f7);
    }

    @Override // p000.ia2
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo28819xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, @yfb ia2 ia2Var) {
        float[] fArr = f76778h;
        float f5 = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        float f6 = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        float f7 = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        float fFastCbrt = m3a.fastCbrt(f5);
        float fFastCbrt2 = m3a.fastCbrt(f6);
        float fFastCbrt3 = m3a.fastCbrt(f7);
        float[] fArr2 = f76779i;
        return j92.Color((fArr2[0] * fFastCbrt) + (fArr2[3] * fFastCbrt2) + (fArr2[6] * fFastCbrt3), (fArr2[1] * fFastCbrt) + (fArr2[4] * fFastCbrt2) + (fArr2[7] * fFastCbrt3), (fArr2[2] * fFastCbrt) + (fArr2[5] * fFastCbrt2) + (fArr2[8] * fFastCbrt3), f4, ia2Var);
    }
}
