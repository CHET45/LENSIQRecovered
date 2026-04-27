package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nXyz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,82:1\n79#1:83\n79#1:100\n79#1:117\n79#1:134\n79#1:154\n79#1:171\n79#1:188\n79#1:205\n79#1:222\n71#2,16:84\n71#2,16:101\n71#2,16:118\n71#2,16:135\n71#2,16:155\n71#2,16:172\n71#2,16:189\n71#2,16:206\n71#2,16:223\n71#2,16:239\n63#3,3:151\n*S KotlinDebug\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n*L\n46#1:83\n47#1:100\n48#1:117\n53#1:134\n57#1:154\n67#1:171\n71#1:188\n72#1:205\n73#1:222\n46#1:84,16\n47#1:101,16\n48#1:118,16\n53#1:135,16\n57#1:155,16\n67#1:172,16\n71#1:189,16\n72#1:206,16\n73#1:223,16\n79#1:239,16\n53#1:151,3\n*E\n"})
public final class iti extends ia2 {
    public iti(@yfb String str, int i) {
        super(str, o92.f66827b.m31304getXyzxdoWZVw(), i, null);
    }

    private final float clamp(float f) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            return 2.0f;
        }
        return f;
    }

    @Override // p000.ia2
    @yfb
    public float[] fromXyz(@yfb float[] fArr) {
        float f = fArr[0];
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        fArr[0] = f;
        float f2 = fArr[1];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        fArr[1] = f2;
        float f3 = fArr[2];
        float f4 = f3 >= -2.0f ? f3 : -2.0f;
        fArr[2] = f4 <= 2.0f ? f4 : 2.0f;
        return fArr;
    }

    @Override // p000.ia2
    public float getMaxValue(int i) {
        return 2.0f;
    }

    @Override // p000.ia2
    public float getMinValue(int i) {
        return -2.0f;
    }

    @Override // p000.ia2
    public boolean isWideGamut() {
        return true;
    }

    @Override // p000.ia2
    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2 <= 2.0f ? f2 : 2.0f)) & 4294967295L);
    }

    @Override // p000.ia2
    @yfb
    public float[] toXyz(@yfb float[] fArr) {
        float f = fArr[0];
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        fArr[0] = f;
        float f2 = fArr[1];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        fArr[1] = f2;
        float f3 = fArr[2];
        float f4 = f3 >= -2.0f ? f3 : -2.0f;
        fArr[2] = f4 <= 2.0f ? f4 : 2.0f;
        return fArr;
    }

    @Override // p000.ia2
    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            return 2.0f;
        }
        return f3;
    }

    @Override // p000.ia2
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo28819xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, @yfb ia2 ia2Var) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        return j92.Color(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, ia2Var);
    }
}
