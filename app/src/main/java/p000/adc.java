package p000;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class adc {

    /* JADX INFO: renamed from: f */
    public static final int f1134f = 12544;

    /* JADX INFO: renamed from: g */
    public static final int f1135g = 16;

    /* JADX INFO: renamed from: h */
    public static final float f1136h = 3.0f;

    /* JADX INFO: renamed from: i */
    public static final float f1137i = 4.5f;

    /* JADX INFO: renamed from: j */
    public static final String f1138j = "Palette";

    /* JADX INFO: renamed from: k */
    public static final boolean f1139k = false;

    /* JADX INFO: renamed from: l */
    public static final InterfaceC0183c f1140l = new C0181a();

    /* JADX INFO: renamed from: a */
    public final List<C0185e> f1141a;

    /* JADX INFO: renamed from: b */
    public final List<img> f1142b;

    /* JADX INFO: renamed from: d */
    public final SparseBooleanArray f1144d = new SparseBooleanArray();

    /* JADX INFO: renamed from: c */
    public final Map<img, C0185e> f1143c = new x60();

    /* JADX INFO: renamed from: e */
    @hib
    public final C0185e f1145e = findDominantSwatch();

    /* JADX INFO: renamed from: adc$a */
    public static class C0181a implements InterfaceC0183c {

        /* JADX INFO: renamed from: a */
        public static final float f1146a = 0.05f;

        /* JADX INFO: renamed from: b */
        public static final float f1147b = 0.95f;

        private boolean isBlack(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        private boolean isNearRedILine(float[] fArr) {
            float f = fArr[0];
            return f >= 10.0f && f <= 37.0f && fArr[1] <= 0.82f;
        }

        private boolean isWhite(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        @Override // p000.adc.InterfaceC0183c
        public boolean isAllowed(int i, float[] fArr) {
            return (isWhite(fArr) || isBlack(fArr) || isNearRedILine(fArr)) ? false : true;
        }
    }

    /* JADX INFO: renamed from: adc$c */
    public interface InterfaceC0183c {
        boolean isAllowed(@g92 int i, @efb float[] fArr);
    }

    /* JADX INFO: renamed from: adc$d */
    public interface InterfaceC0184d {
        void onGenerated(@hib adc adcVar);
    }

    public adc(List<C0185e> list, List<img> list2) {
        this.f1141a = list;
        this.f1142b = list2;
    }

    @hib
    private C0185e findDominantSwatch() {
        int size = this.f1141a.size();
        int population = Integer.MIN_VALUE;
        C0185e c0185e = null;
        for (int i = 0; i < size; i++) {
            C0185e c0185e2 = this.f1141a.get(i);
            if (c0185e2.getPopulation() > population) {
                population = c0185e2.getPopulation();
                c0185e = c0185e2;
            }
        }
        return c0185e;
    }

    @efb
    public static C0182b from(@efb Bitmap bitmap) {
        return new C0182b(bitmap);
    }

    @Deprecated
    public static adc generate(Bitmap bitmap) {
        return from(bitmap).generate();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, adc> generateAsync(Bitmap bitmap, InterfaceC0184d interfaceC0184d) {
        return from(bitmap).generate(interfaceC0184d);
    }

    private float generateScore(C0185e c0185e, img imgVar) {
        float[] hsl = c0185e.getHsl();
        C0185e c0185e2 = this.f1145e;
        return (imgVar.getSaturationWeight() > 0.0f ? imgVar.getSaturationWeight() * (1.0f - Math.abs(hsl[1] - imgVar.getTargetSaturation())) : 0.0f) + (imgVar.getLightnessWeight() > 0.0f ? imgVar.getLightnessWeight() * (1.0f - Math.abs(hsl[2] - imgVar.getTargetLightness())) : 0.0f) + (imgVar.getPopulationWeight() > 0.0f ? imgVar.getPopulationWeight() * (c0185e.getPopulation() / (c0185e2 != null ? c0185e2.getPopulation() : 1)) : 0.0f);
    }

    @hib
    private C0185e generateScoredTarget(img imgVar) {
        C0185e maxScoredSwatchForTarget = getMaxScoredSwatchForTarget(imgVar);
        if (maxScoredSwatchForTarget != null && imgVar.isExclusive()) {
            this.f1144d.append(maxScoredSwatchForTarget.getRgb(), true);
        }
        return maxScoredSwatchForTarget;
    }

    @hib
    private C0185e getMaxScoredSwatchForTarget(img imgVar) {
        int size = this.f1141a.size();
        float f = 0.0f;
        C0185e c0185e = null;
        for (int i = 0; i < size; i++) {
            C0185e c0185e2 = this.f1141a.get(i);
            if (shouldBeScoredForTarget(c0185e2, imgVar)) {
                float fGenerateScore = generateScore(c0185e2, imgVar);
                if (c0185e == null || fGenerateScore > f) {
                    c0185e = c0185e2;
                    f = fGenerateScore;
                }
            }
        }
        return c0185e;
    }

    private boolean shouldBeScoredForTarget(C0185e c0185e, img imgVar) {
        float[] hsl = c0185e.getHsl();
        return hsl[1] >= imgVar.getMinimumSaturation() && hsl[1] <= imgVar.getMaximumSaturation() && hsl[2] >= imgVar.getMinimumLightness() && hsl[2] <= imgVar.getMaximumLightness() && !this.f1144d.get(c0185e.getRgb());
    }

    /* JADX INFO: renamed from: a */
    public void m429a() {
        int size = this.f1142b.size();
        for (int i = 0; i < size; i++) {
            img imgVar = this.f1142b.get(i);
            imgVar.m13192a();
            this.f1143c.put(imgVar, generateScoredTarget(imgVar));
        }
        this.f1144d.clear();
    }

    @g92
    public int getColorForTarget(@efb img imgVar, @g92 int i) {
        C0185e swatchForTarget = getSwatchForTarget(imgVar);
        return swatchForTarget != null ? swatchForTarget.getRgb() : i;
    }

    @g92
    public int getDarkMutedColor(@g92 int i) {
        return getColorForTarget(img.f47511D, i);
    }

    @hib
    public C0185e getDarkMutedSwatch() {
        return getSwatchForTarget(img.f47511D);
    }

    @g92
    public int getDarkVibrantColor(@g92 int i) {
        return getColorForTarget(img.f47508A, i);
    }

    @hib
    public C0185e getDarkVibrantSwatch() {
        return getSwatchForTarget(img.f47508A);
    }

    @g92
    public int getDominantColor(@g92 int i) {
        C0185e c0185e = this.f1145e;
        return c0185e != null ? c0185e.getRgb() : i;
    }

    @hib
    public C0185e getDominantSwatch() {
        return this.f1145e;
    }

    @g92
    public int getLightMutedColor(@g92 int i) {
        return getColorForTarget(img.f47509B, i);
    }

    @hib
    public C0185e getLightMutedSwatch() {
        return getSwatchForTarget(img.f47509B);
    }

    @g92
    public int getLightVibrantColor(@g92 int i) {
        return getColorForTarget(img.f47532y, i);
    }

    @hib
    public C0185e getLightVibrantSwatch() {
        return getSwatchForTarget(img.f47532y);
    }

    @g92
    public int getMutedColor(@g92 int i) {
        return getColorForTarget(img.f47510C, i);
    }

    @hib
    public C0185e getMutedSwatch() {
        return getSwatchForTarget(img.f47510C);
    }

    @hib
    public C0185e getSwatchForTarget(@efb img imgVar) {
        return this.f1143c.get(imgVar);
    }

    @efb
    public List<C0185e> getSwatches() {
        return Collections.unmodifiableList(this.f1141a);
    }

    @efb
    public List<img> getTargets() {
        return Collections.unmodifiableList(this.f1142b);
    }

    @g92
    public int getVibrantColor(@g92 int i) {
        return getColorForTarget(img.f47533z, i);
    }

    @hib
    public C0185e getVibrantSwatch() {
        return getSwatchForTarget(img.f47533z);
    }

    @efb
    public static adc from(@efb List<C0185e> list) {
        return new C0182b(list).generate();
    }

    @Deprecated
    public static adc generate(Bitmap bitmap, int i) {
        return from(bitmap).maximumColorCount(i).generate();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, adc> generateAsync(Bitmap bitmap, int i, InterfaceC0184d interfaceC0184d) {
        return from(bitmap).maximumColorCount(i).generate(interfaceC0184d);
    }

    /* JADX INFO: renamed from: adc$e */
    public static final class C0185e {

        /* JADX INFO: renamed from: a */
        public final int f1158a;

        /* JADX INFO: renamed from: b */
        public final int f1159b;

        /* JADX INFO: renamed from: c */
        public final int f1160c;

        /* JADX INFO: renamed from: d */
        public final int f1161d;

        /* JADX INFO: renamed from: e */
        public final int f1162e;

        /* JADX INFO: renamed from: f */
        public boolean f1163f;

        /* JADX INFO: renamed from: g */
        public int f1164g;

        /* JADX INFO: renamed from: h */
        public int f1165h;

        /* JADX INFO: renamed from: i */
        @hib
        public float[] f1166i;

        public C0185e(@g92 int i, int i2) {
            this.f1158a = Color.red(i);
            this.f1159b = Color.green(i);
            this.f1160c = Color.blue(i);
            this.f1161d = i;
            this.f1162e = i2;
        }

        private void ensureTextColorsGenerated() {
            if (this.f1163f) {
                return;
            }
            int iCalculateMinimumAlpha = ua2.calculateMinimumAlpha(-1, this.f1161d, 4.5f);
            int iCalculateMinimumAlpha2 = ua2.calculateMinimumAlpha(-1, this.f1161d, 3.0f);
            if (iCalculateMinimumAlpha != -1 && iCalculateMinimumAlpha2 != -1) {
                this.f1165h = ua2.setAlphaComponent(-1, iCalculateMinimumAlpha);
                this.f1164g = ua2.setAlphaComponent(-1, iCalculateMinimumAlpha2);
                this.f1163f = true;
                return;
            }
            int iCalculateMinimumAlpha3 = ua2.calculateMinimumAlpha(-16777216, this.f1161d, 4.5f);
            int iCalculateMinimumAlpha4 = ua2.calculateMinimumAlpha(-16777216, this.f1161d, 3.0f);
            if (iCalculateMinimumAlpha3 == -1 || iCalculateMinimumAlpha4 == -1) {
                this.f1165h = iCalculateMinimumAlpha != -1 ? ua2.setAlphaComponent(-1, iCalculateMinimumAlpha) : ua2.setAlphaComponent(-16777216, iCalculateMinimumAlpha3);
                this.f1164g = iCalculateMinimumAlpha2 != -1 ? ua2.setAlphaComponent(-1, iCalculateMinimumAlpha2) : ua2.setAlphaComponent(-16777216, iCalculateMinimumAlpha4);
                this.f1163f = true;
            } else {
                this.f1165h = ua2.setAlphaComponent(-16777216, iCalculateMinimumAlpha3);
                this.f1164g = ua2.setAlphaComponent(-16777216, iCalculateMinimumAlpha4);
                this.f1163f = true;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0185e.class != obj.getClass()) {
                return false;
            }
            C0185e c0185e = (C0185e) obj;
            return this.f1162e == c0185e.f1162e && this.f1161d == c0185e.f1161d;
        }

        @g92
        public int getBodyTextColor() {
            ensureTextColorsGenerated();
            return this.f1165h;
        }

        @efb
        public float[] getHsl() {
            if (this.f1166i == null) {
                this.f1166i = new float[3];
            }
            ua2.RGBToHSL(this.f1158a, this.f1159b, this.f1160c, this.f1166i);
            return this.f1166i;
        }

        public int getPopulation() {
            return this.f1162e;
        }

        @g92
        public int getRgb() {
            return this.f1161d;
        }

        @g92
        public int getTitleTextColor() {
            ensureTextColorsGenerated();
            return this.f1164g;
        }

        public int hashCode() {
            return (this.f1161d * 31) + this.f1162e;
        }

        public String toString() {
            return C0185e.class.getSimpleName() + " [RGB: #" + Integer.toHexString(getRgb()) + C4584d2.f28243l + " [HSL: " + Arrays.toString(getHsl()) + C4584d2.f28243l + " [Population: " + this.f1162e + C4584d2.f28243l + " [Title Text: #" + Integer.toHexString(getTitleTextColor()) + C4584d2.f28243l + " [Body Text: #" + Integer.toHexString(getBodyTextColor()) + C4584d2.f28243l;
        }

        public C0185e(int i, int i2, int i3, int i4) {
            this.f1158a = i;
            this.f1159b = i2;
            this.f1160c = i3;
            this.f1161d = Color.rgb(i, i2, i3);
            this.f1162e = i4;
        }

        public C0185e(float[] fArr, int i) {
            this(ua2.HSLToColor(fArr), i);
            this.f1166i = fArr;
        }
    }

    /* JADX INFO: renamed from: adc$b */
    public static final class C0182b {

        /* JADX INFO: renamed from: a */
        @hib
        public final List<C0185e> f1148a;

        /* JADX INFO: renamed from: b */
        @hib
        public final Bitmap f1149b;

        /* JADX INFO: renamed from: c */
        public final List<img> f1150c;

        /* JADX INFO: renamed from: d */
        public int f1151d;

        /* JADX INFO: renamed from: e */
        public int f1152e;

        /* JADX INFO: renamed from: f */
        public int f1153f;

        /* JADX INFO: renamed from: g */
        public final List<InterfaceC0183c> f1154g;

        /* JADX INFO: renamed from: h */
        @hib
        public Rect f1155h;

        /* JADX INFO: renamed from: adc$b$a */
        public class a extends AsyncTask<Bitmap, Void, adc> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0184d f1156a;

            public a(InterfaceC0184d interfaceC0184d) {
                this.f1156a = interfaceC0184d;
            }

            @Override // android.os.AsyncTask
            @hib
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public adc doInBackground(Bitmap... bitmapArr) {
                try {
                    return C0182b.this.generate();
                } catch (Exception e) {
                    Log.e(adc.f1138j, "Exception thrown during async generate", e);
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(@hib adc adcVar) {
                this.f1156a.onGenerated(adcVar);
            }
        }

        public C0182b(@efb Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f1150c = arrayList;
            this.f1151d = 16;
            this.f1152e = adc.f1134f;
            this.f1153f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f1154g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(adc.f1140l);
            this.f1149b = bitmap;
            this.f1148a = null;
            arrayList.add(img.f47532y);
            arrayList.add(img.f47533z);
            arrayList.add(img.f47508A);
            arrayList.add(img.f47509B);
            arrayList.add(img.f47510C);
            arrayList.add(img.f47511D);
        }

        private int[] getPixelsFromBitmap(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f1155h;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.f1155h.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i = 0; i < iHeight; i++) {
                Rect rect2 = this.f1155h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * iWidth, iWidth);
            }
            return iArr2;
        }

        private Bitmap scaleBitmapDown(Bitmap bitmap) {
            int iMax;
            int i;
            double dSqrt = -1.0d;
            if (this.f1152e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f1152e;
                if (width > i2) {
                    dSqrt = Math.sqrt(((double) i2) / ((double) width));
                }
            } else if (this.f1153f > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f1153f)) {
                dSqrt = ((double) i) / ((double) iMax);
            }
            return dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        }

        @efb
        public C0182b addFilter(InterfaceC0183c interfaceC0183c) {
            if (interfaceC0183c != null) {
                this.f1154g.add(interfaceC0183c);
            }
            return this;
        }

        @efb
        public C0182b addTarget(@efb img imgVar) {
            if (!this.f1150c.contains(imgVar)) {
                this.f1150c.add(imgVar);
            }
            return this;
        }

        @efb
        public C0182b clearFilters() {
            this.f1154g.clear();
            return this;
        }

        @efb
        public C0182b clearRegion() {
            this.f1155h = null;
            return this;
        }

        @efb
        public C0182b clearTargets() {
            List<img> list = this.f1150c;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        @efb
        public adc generate() {
            List<C0185e> listM25686b;
            InterfaceC0183c[] interfaceC0183cArr;
            Bitmap bitmap = this.f1149b;
            if (bitmap != null) {
                Bitmap bitmapScaleBitmapDown = scaleBitmapDown(bitmap);
                Rect rect = this.f1155h;
                if (bitmapScaleBitmapDown != this.f1149b && rect != null) {
                    double width = ((double) bitmapScaleBitmapDown.getWidth()) / ((double) this.f1149b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), bitmapScaleBitmapDown.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), bitmapScaleBitmapDown.getHeight());
                }
                int[] pixelsFromBitmap = getPixelsFromBitmap(bitmapScaleBitmapDown);
                int i = this.f1151d;
                if (this.f1154g.isEmpty()) {
                    interfaceC0183cArr = null;
                } else {
                    List<InterfaceC0183c> list = this.f1154g;
                    interfaceC0183cArr = (InterfaceC0183c[]) list.toArray(new InterfaceC0183c[list.size()]);
                }
                y82 y82Var = new y82(pixelsFromBitmap, i, interfaceC0183cArr);
                if (bitmapScaleBitmapDown != this.f1149b) {
                    bitmapScaleBitmapDown.recycle();
                }
                listM25686b = y82Var.m25686b();
            } else {
                listM25686b = this.f1148a;
                if (listM25686b == null) {
                    throw new AssertionError();
                }
            }
            adc adcVar = new adc(listM25686b, this.f1150c);
            adcVar.m429a();
            return adcVar;
        }

        @efb
        public C0182b maximumColorCount(int i) {
            this.f1151d = i;
            return this;
        }

        @efb
        public C0182b resizeBitmapArea(int i) {
            this.f1152e = i;
            this.f1153f = -1;
            return this;
        }

        @efb
        @Deprecated
        public C0182b resizeBitmapSize(int i) {
            this.f1153f = i;
            this.f1152e = -1;
            return this;
        }

        @efb
        public C0182b setRegion(@fkd int i, @fkd int i2, @fkd int i3, @fkd int i4) {
            if (this.f1149b != null) {
                if (this.f1155h == null) {
                    this.f1155h = new Rect();
                }
                this.f1155h.set(0, 0, this.f1149b.getWidth(), this.f1149b.getHeight());
                if (!this.f1155h.intersect(i, i2, i3, i4)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }

        public C0182b(@efb List<C0185e> list) {
            this.f1150c = new ArrayList();
            this.f1151d = 16;
            this.f1152e = adc.f1134f;
            this.f1153f = -1;
            ArrayList arrayList = new ArrayList();
            this.f1154g = arrayList;
            if (list != null && !list.isEmpty()) {
                arrayList.add(adc.f1140l);
                this.f1148a = list;
                this.f1149b = null;
                return;
            }
            throw new IllegalArgumentException("List of Swatches is not valid");
        }

        @efb
        public AsyncTask<Bitmap, Void, adc> generate(@efb InterfaceC0184d interfaceC0184d) {
            if (interfaceC0184d != null) {
                return new a(interfaceC0184d).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f1149b);
            }
            throw new IllegalArgumentException("listener can not be null");
        }
    }
}
