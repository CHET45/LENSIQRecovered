package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n+ 4 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n1#1,723:1\n641#1:1110\n641#1:1111\n641#1:1112\n696#1:1136\n71#2,16:724\n71#2,16:740\n71#2,16:756\n71#2,16:772\n71#2,16:802\n71#2,16:856\n71#2,16:910\n71#2,16:964\n71#2,16:1094\n71#2,16:1120\n33#3,7:788\n33#3,7:795\n33#3,7:1113\n604#4,38:818\n604#4,38:872\n604#4,38:926\n604#4,38:980\n604#4,38:1018\n604#4,38:1056\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n621#1:1110\n622#1:1111\n623#1:1112\n708#1:1136\n432#1:724,16\n433#1:740,16\n434#1:756,16\n435#1:772,16\n449#1:802,16\n450#1:856,16\n451#1:910,16\n452#1:964,16\n591#1:1094,16\n676#1:1120,16\n440#1:788,7\n445#1:795,7\n666#1:1113,7\n449#1:818,38\n450#1:872,38\n451#1:926,38\n489#1:980,38\n490#1:1018,38\n491#1:1056,38\n*E\n"})
public final class j92 {

    /* JADX INFO: renamed from: a */
    public static final long f49964a = 16;

    /* JADX WARN: Removed duplicated region for block: B:112:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0126  */
    @p000.f0g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long Color(float r20, float r21, float r22, float r23, @p000.yfb p000.ia2 r24) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.j92.Color(float, float, float, float, ia2):long");
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ia2 ia2Var, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            ia2Var = ra2.f77522a.getSrgb();
        }
        return Color(f, f2, f3, f4, ia2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    @p000.f0g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long UncheckedColor(float r17, float r18, float r19, float r20, @p000.yfb p000.ia2 r21) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.j92.UncheckedColor(float, float, float, float, ia2):long");
    }

    public static /* synthetic */ long UncheckedColor$default(float f, float f2, float f3, float f4, ia2 ia2Var, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            ia2Var = ra2.f77522a.getSrgb();
        }
        return UncheckedColor(f, f2, f3, f4, ia2Var);
    }

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return ((f * f3) + ((f2 * f4) * (1.0f - f3))) / f5;
    }

    @f0g
    /* JADX INFO: renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m30481compositeOverOWjLjI(long j, long j2) {
        long jM32948convertvNxB06k = w82.m32948convertvNxB06k(j, w82.m32955getColorSpaceimpl(j2));
        float fM32953getAlphaimpl = w82.m32953getAlphaimpl(j2);
        float fM32953getAlphaimpl2 = w82.m32953getAlphaimpl(jM32948convertvNxB06k);
        float f = 1.0f - fM32953getAlphaimpl2;
        float f2 = (fM32953getAlphaimpl * f) + fM32953getAlphaimpl2;
        return UncheckedColor(f2 == 0.0f ? 0.0f : ((w82.m32957getRedimpl(jM32948convertvNxB06k) * fM32953getAlphaimpl2) + ((w82.m32957getRedimpl(j2) * fM32953getAlphaimpl) * f)) / f2, f2 == 0.0f ? 0.0f : ((w82.m32956getGreenimpl(jM32948convertvNxB06k) * fM32953getAlphaimpl2) + ((w82.m32956getGreenimpl(j2) * fM32953getAlphaimpl) * f)) / f2, f2 != 0.0f ? ((w82.m32954getBlueimpl(jM32948convertvNxB06k) * fM32953getAlphaimpl2) + ((w82.m32954getBlueimpl(j2) * fM32953getAlphaimpl) * f)) / f2 : 0.0f, f2, w82.m32955getColorSpaceimpl(j2));
    }

    @zpf(4)
    /* JADX INFO: renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m30482getComponents8_81llA(long j) {
        return new float[]{w82.m32957getRedimpl(j), w82.m32956getGreenimpl(j), w82.m32954getBlueimpl(j), w82.m32953getAlphaimpl(j)};
    }

    @yjd
    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m30483isSpecified8_81llA(long j) {
        return j != 16;
    }

    @f0g
    /* JADX INFO: renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m30484isSpecified8_81llA$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m30485isUnspecified8_81llA(long j) {
        return j == 16;
    }

    @f0g
    /* JADX INFO: renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m30486isUnspecified8_81llA$annotations(long j) {
    }

    @f0g
    /* JADX INFO: renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m30487lerpjxsXWHM(long j, long j2, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        ia2 oklab = ra2.f77522a.getOklab();
        long jM32948convertvNxB06k = w82.m32948convertvNxB06k(j, oklab);
        long jM32948convertvNxB06k2 = w82.m32948convertvNxB06k(j2, oklab);
        float fM32953getAlphaimpl = w82.m32953getAlphaimpl(jM32948convertvNxB06k);
        float fM32957getRedimpl = w82.m32957getRedimpl(jM32948convertvNxB06k);
        float fM32956getGreenimpl = w82.m32956getGreenimpl(jM32948convertvNxB06k);
        float fM32954getBlueimpl = w82.m32954getBlueimpl(jM32948convertvNxB06k);
        float fM32953getAlphaimpl2 = w82.m32953getAlphaimpl(jM32948convertvNxB06k2);
        float fM32957getRedimpl2 = w82.m32957getRedimpl(jM32948convertvNxB06k2);
        float fM32956getGreenimpl2 = w82.m32956getGreenimpl(jM32948convertvNxB06k2);
        float fM32954getBlueimpl2 = w82.m32954getBlueimpl(jM32948convertvNxB06k2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return w82.m32948convertvNxB06k(UncheckedColor(m3a.lerp(fM32957getRedimpl, fM32957getRedimpl2, f), m3a.lerp(fM32956getGreenimpl, fM32956getGreenimpl2, f), m3a.lerp(fM32954getBlueimpl, fM32954getBlueimpl2, f), m3a.lerp(fM32953getAlphaimpl, fM32953getAlphaimpl2, f), oklab), w82.m32955getColorSpaceimpl(j2));
    }

    @f0g
    /* JADX INFO: renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m30488luminance8_81llA(long j) {
        ia2 ia2VarM32955getColorSpaceimpl = w82.m32955getColorSpaceimpl(j);
        if (!o92.m31296equalsimpl0(ia2VarM32955getColorSpaceimpl.m30176getModelxdoWZVw(), o92.f66827b.m31303getRgbxdoWZVw())) {
            f28.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) o92.m31299toStringimpl(ia2VarM32955getColorSpaceimpl.m30176getModelxdoWZVw())));
        }
        md8.checkNotNull(ia2VarM32955getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        bk4 eotfFunc$ui_graphics_release = ((eae) ia2VarM32955getColorSpaceimpl).getEotfFunc$ui_graphics_release();
        float fInvoke = (float) ((eotfFunc$ui_graphics_release.invoke(w82.m32957getRedimpl(j)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(w82.m32956getGreenimpl(j)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(w82.m32954getBlueimpl(j)) * 0.0722d));
        if (fInvoke < 0.0f) {
            fInvoke = 0.0f;
        }
        if (fInvoke > 1.0f) {
            return 1.0f;
        }
        return fInvoke;
    }

    /* JADX INFO: renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m30489takeOrElseDxMtmZc(long j, @yfb ny6<w82> ny6Var) {
        return j != 16 ? j : ny6Var.invoke().m32961unboximpl();
    }

    @f0g
    @g92
    /* JADX INFO: renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m30490toArgb8_81llA(long j) {
        return (int) oph.m31533constructorimpl(w82.m32948convertvNxB06k(j, ra2.f77522a.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    @f0g
    public static final long Color(@g92 int i) {
        return w82.m32947constructorimpl(oph.m31533constructorimpl(oph.m31533constructorimpl(i) << 32));
    }

    @f0g
    public static final long Color(long j) {
        return w82.m32947constructorimpl(oph.m31533constructorimpl(j << 32));
    }

    @f0g
    public static final long Color(@h78(from = 0, m12174to = coe.f17274d) int i, @h78(from = 0, m12174to = coe.f17274d) int i2, @h78(from = 0, m12174to = coe.f17274d) int i3, @h78(from = 0, m12174to = coe.f17274d) int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
