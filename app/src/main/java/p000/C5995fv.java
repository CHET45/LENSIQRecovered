package p000;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.List;

/* JADX INFO: renamed from: fv */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,206:1\n69#2,6:207\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n141#1:207,6\n*E\n"})
public final class C5995fv {
    @yfb
    /* JADX INFO: renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m29667ActualImageShaderF49vj9s(@yfb rs7 rs7Var, int i, int i2) {
        return new BitmapShader(C5460et.asAndroidBitmap(rs7Var), C12798sv.m32336toAndroidTileMode0vamqd0(i), C12798sv.m32336toAndroidTileMode0vamqd0(i2));
    }

    @yfb
    /* JADX INFO: renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m29668ActualLinearGradientShaderVjE6UOU(long j, long j2, @yfb List<w82> list, @gib List<Float> list2, int i) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new LinearGradient(izb.m30429getXimpl(j), izb.m30430getYimpl(j), izb.m30429getXimpl(j2), izb.m30430getYimpl(j2), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), C12798sv.m32336toAndroidTileMode0vamqd0(i));
    }

    @yfb
    /* JADX INFO: renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m29669ActualRadialGradientShader8uybcMk(long j, float f, @yfb List<w82> list, @gib List<Float> list2, int i) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new RadialGradient(izb.m30429getXimpl(j), izb.m30430getYimpl(j), f, makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), C12798sv.m32336toAndroidTileMode0vamqd0(i));
    }

    @yfb
    /* JADX INFO: renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m29670ActualSweepGradientShader9KIMszo(long j, @yfb List<w82> list, @gib List<Float> list2) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new SweepGradient(izb.m30429getXimpl(j), izb.m30430getYimpl(j), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors));
    }

    @fdi
    public static final int countTransparentColors(@yfb List<w82> list) {
        return 0;
    }

    @yfb
    @fdi
    public static final int[] makeTransparentColors(@yfb List<w82> list, int i) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = j92.m30490toArgb8_81llA(list.get(i2).m32961unboximpl());
        }
        return iArr;
    }

    @gib
    @fdi
    public static final float[] makeTransparentStops(@gib List<Float> list, @yfb List<w82> list2, int i) {
        if (i == 0) {
            if (list != null) {
                return v82.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int lastIndex = l82.getLastIndex(list2);
        int i2 = 1;
        for (int i3 = 1; i3 < lastIndex; i3++) {
            long jM32961unboximpl = list2.get(i3).m32961unboximpl();
            float fFloatValue = list != null ? list.get(i3).floatValue() : i3 / l82.getLastIndex(list2);
            int i4 = i2 + 1;
            fArr[i2] = fFloatValue;
            if (w82.m32953getAlphaimpl(jM32961unboximpl) == 0.0f) {
                i2 += 2;
                fArr[i4] = fFloatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? list.get(l82.getLastIndex(list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void validateColorStops(List<w82> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
