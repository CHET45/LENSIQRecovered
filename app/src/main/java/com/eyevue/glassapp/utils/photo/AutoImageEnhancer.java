package com.eyevue.glassapp.utils.photo;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import p000.d78;
import p000.dwf;
import p000.e0g;
import p000.gib;
import p000.jt3;
import p000.kpd;
import p000.m82;
import p000.md8;
import p000.v82;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
@dwf({"SMAP\nAutoImageEnhancer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoImageEnhancer.kt\ncom/eyevue/glassapp/utils/photo/AutoImageEnhancer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1557#2:245\n1628#2,3:246\n*S KotlinDebug\n*F\n+ 1 AutoImageEnhancer.kt\ncom/eyevue/glassapp/utils/photo/AutoImageEnhancer\n*L\n113#1:245\n113#1:246,3\n*E\n"})
@e0g(parameters = 1)
public final class AutoImageEnhancer {
    public static final int $stable = 0;

    @yfb
    public static final Companion Companion = new Companion(null);
    private static final float SATURATION_BOOST = 0.2f;
    private static final float TARGET_BRIGHTNESS = 0.5f;
    private static final float TARGET_CONTRAST = 0.3f;

    public static final class Companion {
        public /* synthetic */ Companion(jt3 jt3Var) {
            this();
        }

        private Companion() {
        }
    }

    @e0g(parameters = 1)
    public static final class EnhancementParams {
        public static final int $stable = 0;
        private final int brightness;
        private final int contrast;
        private final int exposure;
        private final int saturation;
        private final int sharpness;

        public EnhancementParams(int i, int i2, int i3, int i4, int i5) {
            this.brightness = i;
            this.contrast = i2;
            this.saturation = i3;
            this.exposure = i4;
            this.sharpness = i5;
        }

        public static /* synthetic */ EnhancementParams copy$default(EnhancementParams enhancementParams, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = enhancementParams.brightness;
            }
            if ((i6 & 2) != 0) {
                i2 = enhancementParams.contrast;
            }
            int i7 = i2;
            if ((i6 & 4) != 0) {
                i3 = enhancementParams.saturation;
            }
            int i8 = i3;
            if ((i6 & 8) != 0) {
                i4 = enhancementParams.exposure;
            }
            int i9 = i4;
            if ((i6 & 16) != 0) {
                i5 = enhancementParams.sharpness;
            }
            return enhancementParams.copy(i, i7, i8, i9, i5);
        }

        public final int component1() {
            return this.brightness;
        }

        public final int component2() {
            return this.contrast;
        }

        public final int component3() {
            return this.saturation;
        }

        public final int component4() {
            return this.exposure;
        }

        public final int component5() {
            return this.sharpness;
        }

        @yfb
        public final EnhancementParams copy(int i, int i2, int i3, int i4, int i5) {
            return new EnhancementParams(i, i2, i3, i4, i5);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnhancementParams)) {
                return false;
            }
            EnhancementParams enhancementParams = (EnhancementParams) obj;
            return this.brightness == enhancementParams.brightness && this.contrast == enhancementParams.contrast && this.saturation == enhancementParams.saturation && this.exposure == enhancementParams.exposure && this.sharpness == enhancementParams.sharpness;
        }

        public final int getBrightness() {
            return this.brightness;
        }

        public final int getContrast() {
            return this.contrast;
        }

        public final int getExposure() {
            return this.exposure;
        }

        public final int getSaturation() {
            return this.saturation;
        }

        public final int getSharpness() {
            return this.sharpness;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.brightness) * 31) + Integer.hashCode(this.contrast)) * 31) + Integer.hashCode(this.saturation)) * 31) + Integer.hashCode(this.exposure)) * 31) + Integer.hashCode(this.sharpness);
        }

        @yfb
        public String toString() {
            return "EnhancementParams(brightness=" + this.brightness + ", contrast=" + this.contrast + ", saturation=" + this.saturation + ", exposure=" + this.exposure + ", sharpness=" + this.sharpness + ')';
        }
    }

    private final float analyzeBrightness(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i = 0;
        d78 d78VarStep = kpd.step(kpd.until(0, height), 5);
        int first = d78VarStep.getFirst();
        int last = d78VarStep.getLast();
        int step = d78VarStep.getStep();
        float fRed = 0.0f;
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            int i2 = 0;
            while (true) {
                d78 d78VarStep2 = kpd.step(kpd.until(0, width), 5);
                int first2 = d78VarStep2.getFirst();
                int last2 = d78VarStep2.getLast();
                int step2 = d78VarStep2.getStep();
                if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                    while (true) {
                        int i3 = iArr[(first * width) + first2];
                        fRed += ((Color.red(i3) / 255.0f) * 0.299f) + ((Color.green(i3) / 255.0f) * 0.587f) + ((Color.blue(i3) / 255.0f) * 0.114f);
                        i2++;
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step2;
                    }
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
            i = i2;
        }
        return fRed / i;
    }

    private final float analyzeContrast(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        ArrayList arrayList = new ArrayList();
        d78 d78VarStep = kpd.step(kpd.until(0, height), 8);
        int first = d78VarStep.getFirst();
        int last = d78VarStep.getLast();
        int step = d78VarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                d78 d78VarStep2 = kpd.step(kpd.until(0, width), 8);
                int first2 = d78VarStep2.getFirst();
                int last2 = d78VarStep2.getLast();
                int step2 = d78VarStep2.getStep();
                if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                    while (true) {
                        int i = iArr[(first * width) + first2];
                        arrayList.add(Float.valueOf(((Color.red(i) / 255.0f) * 0.299f) + ((Color.green(i) / 255.0f) * 0.587f) + ((Color.blue(i) / 255.0f) * 0.114f)));
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step2;
                    }
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        float fAverageOfFloat = (float) v82.averageOfFloat(arrayList);
        ArrayList arrayList2 = new ArrayList(m82.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue() - fAverageOfFloat;
            arrayList2.add(Float.valueOf(fFloatValue * fFloatValue));
        }
        return (float) Math.sqrt((float) v82.averageOfFloat(arrayList2));
    }

    private final float analyzeSaturation(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i2 = 0;
        d78 d78VarStep = kpd.step(kpd.until(0, height), 6);
        int first = d78VarStep.getFirst();
        int last = d78VarStep.getLast();
        int step = d78VarStep.getStep();
        float f = 0.0f;
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            i = 0;
        } else {
            int i3 = 0;
            float fMin = 0.0f;
            while (true) {
                d78 d78VarStep2 = kpd.step(kpd.until(i2, width), 6);
                int first2 = d78VarStep2.getFirst();
                int last2 = d78VarStep2.getLast();
                int step2 = d78VarStep2.getStep();
                if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                    while (true) {
                        int i4 = iArr[(first * width) + first2];
                        float fRed = Color.red(i4) / 255.0f;
                        float fGreen = Color.green(i4) / 255.0f;
                        float fBlue = Color.blue(i4) / 255.0f;
                        float fMax = Math.max(fRed, Math.max(fGreen, fBlue));
                        fMin += fMax == 0.0f ? 0.0f : (fMax - Math.min(fRed, Math.min(fGreen, fBlue))) / fMax;
                        i3++;
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step2;
                    }
                }
                if (first == last) {
                    break;
                }
                first += step;
                i2 = 0;
            }
            f = fMin;
            i = i3;
        }
        return f / i;
    }

    private final float analyzeSharpness(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 3 || height < 3) {
            return 0.5f;
        }
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        float[][] fArr = {new float[]{0.0f, -1.0f, 0.0f}, new float[]{-1.0f, 4.0f, -1.0f}, new float[]{0.0f, -1.0f, 0.0f}};
        int i = height - 1;
        int i2 = 0;
        float fAbs = 0.0f;
        for (int i3 = 1; i3 < i; i3++) {
            int i4 = width - 1;
            for (int i5 = 1; i5 < i4; i5++) {
                if (i3 % 4 == 0 && i5 % 4 == 0) {
                    float fRed = 0.0f;
                    int i6 = -1;
                    while (true) {
                        if (i6 >= 2) {
                            break;
                        }
                        int i7 = -1;
                        for (int i8 = 2; i7 < i8; i8 = 2) {
                            int i9 = iArr[((i3 + i6) * width) + i5 + i7];
                            i7++;
                            fRed += ((Color.red(i9) * 0.299f) + (Color.green(i9) * 0.587f) + (Color.blue(i9) * 0.114f)) * fArr[i6 + 1][i7];
                        }
                        i6++;
                    }
                    fAbs += Math.abs(fRed);
                    i2++;
                }
            }
        }
        return kpd.coerceIn((i2 > 0 ? fAbs / i2 : 0.0f) / 255.0f, 0.0f, 1.0f);
    }

    private final int calculateBrightnessAdjustment(float f) {
        return kpd.coerceIn((int) ((0.5f - f) * 200), -100, 100);
    }

    private final int calculateContrastAdjustment(float f) {
        return kpd.coerceIn((int) ((0.3f - f) * 300), -100, 100);
    }

    private final int calculateExposureAdjustment(float f) {
        return kpd.coerceIn((int) ((0.5f - f) * 150), -100, 100);
    }

    private final int calculateSaturationAdjustment(float f) {
        return kpd.coerceIn((int) ((0.6f - f) * 150), -100, 100);
    }

    private final int calculateSharpnessAdjustment(float f) {
        return kpd.coerceIn((int) ((0.4f - f) * 200), -50, 50);
    }

    @yfb
    public final EnhancementParams analyzeAndGetParams(@yfb Bitmap bitmap) {
        md8.checkNotNullParameter(bitmap, "bitmap");
        float fAnalyzeBrightness = analyzeBrightness(bitmap);
        return new EnhancementParams(calculateBrightnessAdjustment(fAnalyzeBrightness), calculateContrastAdjustment(analyzeContrast(bitmap)), calculateSaturationAdjustment(analyzeSaturation(bitmap)), calculateExposureAdjustment(fAnalyzeBrightness), calculateSharpnessAdjustment(analyzeSharpness(bitmap)));
    }
}
