package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,142:1\n71#2,16:143\n71#2,16:159\n71#2,16:175\n71#2,16:191\n71#2,16:207\n71#2,16:226\n71#2,16:242\n71#2,16:258\n71#2,16:274\n71#2,16:290\n71#2,16:306\n71#2,16:322\n71#2,16:338\n63#3,3:223\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n48#1:143,16\n49#1:159,16\n50#1:175,16\n67#1:191,16\n68#1:207,16\n79#1:226,16\n80#1:242,16\n107#1:258,16\n108#1:274,16\n109#1:290,16\n128#1:306,16\n129#1:322,16\n130#1:338,16\n75#1:223,3\n*E\n"})
public final class mt8 extends ia2 {

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C9517a f62089g = new C9517a(null);

    /* JADX INFO: renamed from: h */
    public static final float f62090h = 0.008856452f;

    /* JADX INFO: renamed from: i */
    public static final float f62091i = 7.787037f;

    /* JADX INFO: renamed from: j */
    public static final float f62092j = 0.13793103f;

    /* JADX INFO: renamed from: k */
    public static final float f62093k = 0.20689656f;

    /* JADX INFO: renamed from: mt8$a */
    public static final class C9517a {
        public /* synthetic */ C9517a(jt3 jt3Var) {
            this();
        }

        private C9517a() {
        }
    }

    public mt8(@yfb String str, int i) {
        super(str, o92.f66827b.m31302getLabxdoWZVw(), i, null);
    }

    @Override // p000.ia2
    @yfb
    public float[] fromXyz(@yfb float[] fArr) {
        float f = fArr[0];
        ns7 ns7Var = ns7.f65485a;
        float f2 = f / ns7Var.getD50Xyz$ui_graphics_release()[0];
        float f3 = fArr[1] / ns7Var.getD50Xyz$ui_graphics_release()[1];
        float f4 = fArr[2] / ns7Var.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f2 > 0.008856452f ? (float) Math.cbrt(f2) : (f2 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f3 > 0.008856452f ? (float) Math.cbrt(f3) : (f3 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f4 > 0.008856452f ? (float) Math.cbrt(f4) : (f4 * 7.787037f) + 0.13793103f;
        float f5 = (116.0f * fCbrt2) - 16.0f;
        float f6 = (fCbrt - fCbrt2) * 500.0f;
        float f7 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 100.0f) {
            f5 = 100.0f;
        }
        fArr[0] = f5;
        if (f6 < -128.0f) {
            f6 = -128.0f;
        }
        if (f6 > 128.0f) {
            f6 = 128.0f;
        }
        fArr[1] = f6;
        if (f7 < -128.0f) {
            f7 = -128.0f;
        }
        fArr[2] = f7 <= 128.0f ? f7 : 128.0f;
        return fArr;
    }

    @Override // p000.ia2
    public float getMaxValue(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // p000.ia2
    public float getMinValue(int i) {
        return i == 0 ? 0.0f : -128.0f;
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
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        float f4 = (f + 16.0f) / 116.0f;
        float f5 = (f2 * 0.002f) + f4;
        float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
        float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
        ns7 ns7Var = ns7.f65485a;
        return (((long) Float.floatToRawIntBits(f7 * ns7Var.getD50Xyz$ui_graphics_release()[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f6 * ns7Var.getD50Xyz$ui_graphics_release()[0])) << 32);
    }

    @Override // p000.ia2
    @yfb
    public float[] toXyz(@yfb float[] fArr) {
        float f = fArr[0];
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        fArr[0] = f;
        float f2 = fArr[1];
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        fArr[1] = f2;
        float f3 = fArr[2];
        float f4 = f3 >= -128.0f ? f3 : -128.0f;
        float f5 = f4 <= 128.0f ? f4 : 128.0f;
        fArr[2] = f5;
        float f6 = (f + 16.0f) / 116.0f;
        float f7 = (f2 * 0.002f) + f6;
        float f8 = f6 - (f5 * 0.005f);
        float f9 = f7 > 0.20689656f ? f7 * f7 * f7 : (f7 - 0.13793103f) * 0.12841855f;
        float f10 = f6 > 0.20689656f ? f6 * f6 * f6 : (f6 - 0.13793103f) * 0.12841855f;
        float f11 = f8 > 0.20689656f ? f8 * f8 * f8 : (f8 - 0.13793103f) * 0.12841855f;
        ns7 ns7Var = ns7.f65485a;
        fArr[0] = f9 * ns7Var.getD50Xyz$ui_graphics_release()[0];
        fArr[1] = f10 * ns7Var.getD50Xyz$ui_graphics_release()[1];
        fArr[2] = f11 * ns7Var.getD50Xyz$ui_graphics_release()[2];
        return fArr;
    }

    @Override // p000.ia2
    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
        return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * ns7.f65485a.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // p000.ia2
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo28819xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, @yfb ia2 ia2Var) {
        ns7 ns7Var = ns7.f65485a;
        float f5 = f / ns7Var.getD50Xyz$ui_graphics_release()[0];
        float f6 = f2 / ns7Var.getD50Xyz$ui_graphics_release()[1];
        float f7 = f3 / ns7Var.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
        float f8 = (116.0f * fCbrt2) - 16.0f;
        float f9 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 > 100.0f) {
            f8 = 100.0f;
        }
        if (f9 < -128.0f) {
            f9 = -128.0f;
        }
        if (f9 > 128.0f) {
            f9 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return j92.Color(f8, f9, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f4, ia2Var);
    }
}
