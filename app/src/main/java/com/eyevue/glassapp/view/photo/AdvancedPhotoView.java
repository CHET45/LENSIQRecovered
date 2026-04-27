package com.eyevue.glassapp.view.photo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.EmbossMaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.github.chrisbanes.photoview.PhotoView;
import p000.c1i;
import p000.e0g;
import p000.gib;
import p000.jt3;
import p000.kpd;
import p000.md8;
import p000.u3c;
import p000.u77;
import p000.v35;
import p000.vfe;
import p000.x35;
import p000.yfb;
import p000.yn8;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 0)
public final class AdvancedPhotoView extends PhotoView {

    /* JADX INFO: renamed from: l2 */
    public static final int f18682l2 = 8;

    /* JADX INFO: renamed from: C */
    @yfb
    public EnumC2814a f18683C;

    /* JADX INFO: renamed from: F */
    @yfb
    public Matrix f18684F;

    /* JADX INFO: renamed from: H */
    public boolean f18685H;

    /* JADX INFO: renamed from: L */
    public int f18686L;

    /* JADX INFO: renamed from: M */
    public int f18687M;

    /* JADX INFO: renamed from: M1 */
    public int f18688M1;

    /* JADX INFO: renamed from: N */
    public int f18689N;

    /* JADX INFO: renamed from: Q */
    public int f18690Q;

    /* JADX INFO: renamed from: V1 */
    @yfb
    public final ColorMatrix f18691V1;

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public final Paint f18692Z1;

    /* JADX INFO: renamed from: a2 */
    @yfb
    public final Canvas f18693a2;

    /* JADX INFO: renamed from: b2 */
    @gib
    public Bitmap f18694b2;

    /* JADX INFO: renamed from: c */
    @gib
    public Bitmap f18695c;

    /* JADX INFO: renamed from: c2 */
    public int f18696c2;

    /* JADX INFO: renamed from: d */
    public float f18697d;

    /* JADX INFO: renamed from: d2 */
    public int f18698d2;

    /* JADX INFO: renamed from: e */
    public boolean f18699e;

    /* JADX INFO: renamed from: e2 */
    public boolean f18700e2;

    /* JADX INFO: renamed from: f */
    public boolean f18701f;

    /* JADX INFO: renamed from: f2 */
    @gib
    public Bitmap f18702f2;

    /* JADX INFO: renamed from: g2 */
    public final float f18703g2;

    /* JADX INFO: renamed from: h2 */
    public final float f18704h2;

    /* JADX INFO: renamed from: i2 */
    public final int f18705i2;

    /* JADX INFO: renamed from: j2 */
    @yfb
    public final Paint f18706j2;

    /* JADX INFO: renamed from: k2 */
    @gib
    public Bitmap f18707k2;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.AdvancedPhotoView$a */
    public static final class EnumC2814a {

        /* JADX INFO: renamed from: M */
        public static final /* synthetic */ EnumC2814a[] f18712M;

        /* JADX INFO: renamed from: N */
        public static final /* synthetic */ v35 f18713N;

        /* JADX INFO: renamed from: a */
        public static final EnumC2814a f18714a = new EnumC2814a("RATIO_1_1", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC2814a f18715b = new EnumC2814a("RATIO_4_3", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC2814a f18716c = new EnumC2814a("RATIO_3_4", 2);

        /* JADX INFO: renamed from: d */
        public static final EnumC2814a f18717d = new EnumC2814a("RATIO_9_16", 3);

        /* JADX INFO: renamed from: e */
        public static final EnumC2814a f18718e = new EnumC2814a("RATIO_16_9", 4);

        /* JADX INFO: renamed from: f */
        public static final EnumC2814a f18719f = new EnumC2814a("RATIO_2_3", 5);

        /* JADX INFO: renamed from: m */
        public static final EnumC2814a f18720m = new EnumC2814a("RATIO_3_2", 6);

        /* JADX INFO: renamed from: C */
        public static final EnumC2814a f18708C = new EnumC2814a("LANDSCAPE", 7);

        /* JADX INFO: renamed from: F */
        public static final EnumC2814a f18709F = new EnumC2814a("PORTRAIT", 8);

        /* JADX INFO: renamed from: H */
        public static final EnumC2814a f18710H = new EnumC2814a("ORIGINAL", 9);

        /* JADX INFO: renamed from: L */
        public static final EnumC2814a f18711L = new EnumC2814a("FREE", 10);

        private static final /* synthetic */ EnumC2814a[] $values() {
            return new EnumC2814a[]{f18714a, f18715b, f18716c, f18717d, f18718e, f18719f, f18720m, f18708C, f18709F, f18710H, f18711L};
        }

        static {
            EnumC2814a[] enumC2814aArr$values = $values();
            f18712M = enumC2814aArr$values;
            f18713N = x35.enumEntries(enumC2814aArr$values);
        }

        private EnumC2814a(String str, int i) {
        }

        @yfb
        public static v35<EnumC2814a> getEntries() {
            return f18713N;
        }

        public static EnumC2814a valueOf(String str) {
            return (EnumC2814a) Enum.valueOf(EnumC2814a.class, str);
        }

        public static EnumC2814a[] values() {
            return (EnumC2814a[]) f18712M.clone();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.AdvancedPhotoView$b */
    public /* synthetic */ class C2815b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18721a;

        static {
            int[] iArr = new int[EnumC2814a.values().length];
            try {
                iArr[EnumC2814a.f18714a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2814a.f18715b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2814a.f18716c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2814a.f18717d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC2814a.f18709F.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC2814a.f18718e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC2814a.f18708C.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC2814a.f18719f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC2814a.f18720m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f18721a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public AdvancedPhotoView(@yfb Context context) {
        this(context, null, 0, 6, null);
        md8.checkNotNullParameter(context, "context");
    }

    private final void applyBitmapTransforms() {
        boolean z;
        EnumC2814a enumC2814a;
        Bitmap bitmap = this.f18695c;
        if (bitmap == null) {
            return;
        }
        Bitmap bitmapRotateBitmap = rotateBitmap(bitmap, this.f18697d);
        if (!this.f18701f || (enumC2814a = this.f18683C) == EnumC2814a.f18710H || enumC2814a == EnumC2814a.f18711L) {
            z = false;
        } else {
            float ratioValue = getRatioValue(enumC2814a);
            int width = bitmapRotateBitmap.getWidth();
            int height = bitmapRotateBitmap.getHeight();
            Rect rect = new Rect(0, 0, width, height);
            if (ratioValue != 1.0f) {
                int i = (int) (width / ratioValue);
                if (i > height) {
                    int i2 = (width - ((int) (height * ratioValue))) / 2;
                    rect.set(i2, 0, width - i2, height);
                } else {
                    int i3 = (height - i) / 2;
                    rect.set(0, i3, width, height - i3);
                }
            } else if (width > height) {
                int i4 = (width - height) / 2;
                rect.set(i4, 0, width - i4, height);
            } else {
                int i5 = (height - width) / 2;
                rect.set(0, i5, width, height - i5);
            }
            bitmapRotateBitmap = Bitmap.createBitmap(bitmapRotateBitmap, rect.left, rect.top, rect.width(), rect.height());
            z = true;
        }
        Matrix matrix = new Matrix();
        if (this.f18699e) {
            matrix.postScale(-1.0f, 1.0f, bitmapRotateBitmap.getWidth() / 2.0f, bitmapRotateBitmap.getHeight() / 2.0f);
        }
        Bitmap bitmapCreateBitmap = this.f18699e ? Bitmap.createBitmap(bitmapRotateBitmap, 0, 0, bitmapRotateBitmap.getWidth(), bitmapRotateBitmap.getHeight(), matrix, true) : bitmapRotateBitmap;
        md8.checkNotNull(bitmapCreateBitmap);
        if (z && !md8.areEqual(bitmapCreateBitmap, bitmapRotateBitmap)) {
            bitmapRotateBitmap.recycle();
        }
        getAttacher().setZoomable(false);
        if (this.f18683C != EnumC2814a.f18711L || this.f18707k2 == null) {
            super.setImageDrawable(new BitmapDrawable(getResources(), bitmapCreateBitmap));
        } else {
            super.setImageDrawable(new BitmapDrawable(getResources(), this.f18707k2));
        }
        getAttacher().update();
        getAttacher().setZoomable(true);
    }

    private final void applyEffects(Canvas canvas, Bitmap bitmap) {
        int iSaveLayer = canvas.saveLayer(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), null);
        try {
            updateColorMatrix();
            this.f18692Z1.setColorFilter(new ColorMatrixColorFilter(this.f18691V1));
            if (this.f18688M1 != 0) {
                applySharpnessEffect(canvas, bitmap);
            } else {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f18692Z1);
            }
            canvas.restoreToCount(iSaveLayer);
        } catch (Throwable th) {
            canvas.restoreToCount(iSaveLayer);
            throw th;
        }
    }

    private final Bitmap applyMirrorAndRotationToBitmap(Bitmap bitmap) {
        EnumC2814a enumC2814a;
        RectF rectF;
        if (!isRotationMirrorRatio() && !isAnyEffectsTransform()) {
            return bitmap;
        }
        Bitmap bitmap2 = this.f18707k2;
        if (bitmap2 != null) {
            md8.checkNotNull(bitmap2);
            return bitmap2;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
        if (this.f18701f && (enumC2814a = this.f18683C) != EnumC2814a.f18710H && enumC2814a != EnumC2814a.f18711L) {
            float ratioValue = getRatioValue(enumC2814a);
            if (width / height > ratioValue) {
                float f = (width - (ratioValue * height)) / 2.0f;
                rectF = new RectF(f, 0.0f, width - f, height);
            } else {
                float f2 = (height - (width / ratioValue)) / 2.0f;
                rectF = new RectF(0.0f, f2, width, height - f2);
            }
            rectF2 = rectF;
        }
        int iWidth = (int) rectF2.width();
        int iHeight = (int) rectF2.height();
        float f3 = this.f18697d;
        float f4 = 180;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(f3 % f4 == 90.0f ? iHeight : iWidth, f3 % f4 == 90.0f ? iWidth : iHeight, Bitmap.Config.ARGB_8888);
        md8.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-rectF2.left, -rectF2.top);
        if (this.f18699e) {
            matrix.postScale(-1.0f, 1.0f, iWidth / 2.0f, iHeight / 2.0f);
        }
        float f5 = this.f18697d;
        if (f5 != 0.0f) {
            matrix.postRotate(f5, iWidth / 2.0f, iHeight / 2.0f);
        }
        if (this.f18697d % f4 == 90.0f) {
            matrix.postTranslate((r9 - iWidth) / 2.0f, (r6 - iHeight) / 2.0f);
        }
        Paint paint = new Paint(7);
        if (isAnyEffectsTransform()) {
            updateColorMatrix();
            paint.setColorFilter(new ColorMatrixColorFilter(this.f18691V1));
        }
        canvas.drawBitmap(bitmap, matrix, paint);
        if (this.f18688M1 != 0) {
            Paint paint2 = new Paint(paint);
            paint2.setMaskFilter(createEmbossFilter(this.f18688M1));
            if (this.f18688M1 > 0) {
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
                paint2.setAlpha(kpd.coerceIn((int) (this.f18688M1 * 1.5f), 50, 200));
                canvas.drawBitmap(bitmap, matrix, paint2);
            } else {
                canvas.drawBitmap(bitmap, matrix, paint2);
            }
        }
        return bitmapCreateBitmap;
    }

    private final void applySharpnessEffect(Canvas canvas, Bitmap bitmap) {
        EmbossMaskFilter embossMaskFilterCreateEmbossFilter = createEmbossFilter(this.f18688M1);
        if (this.f18688M1 <= 0) {
            Paint paint = new Paint();
            paint.setMaskFilter(embossMaskFilterCreateEmbossFilter);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        } else {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f18692Z1);
            Paint paint2 = new Paint();
            paint2.setMaskFilter(embossMaskFilterCreateEmbossFilter);
            paint2.setAlpha(kpd.coerceIn((int) (this.f18688M1 * 1.5f), 50, 200));
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
    }

    private final EmbossMaskFilter createEmbossFilter(int i) {
        float fAbs = Math.abs(i) / 100.0f;
        return i > 0 ? fAbs < 0.3f ? new EmbossMaskFilter(new float[]{1.0f, 1.0f, 0.5f}, 0.3f, 4.0f, 1.5f) : fAbs < 0.7f ? new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 3.0f, 2.0f) : new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.5f, 2.0f, 3.0f) : fAbs < 0.3f ? new EmbossMaskFilter(new float[]{0.2f, 0.2f, 0.2f}, 0.6f, 5.0f, 0.8f) : fAbs < 0.7f ? new EmbossMaskFilter(new float[]{0.1f, 0.1f, 0.1f}, 0.7f, 8.0f, 0.5f) : new EmbossMaskFilter(new float[]{0.05f, 0.05f, 0.05f}, 0.8f, 12.0f, 0.3f);
    }

    private final void drawWatermark(Canvas canvas) {
        RectF displayRect;
        Bitmap bitmap = this.f18702f2;
        if (bitmap == null || (displayRect = getDisplayRect()) == null) {
            return;
        }
        float fWidth = displayRect.width();
        float fHeight = displayRect.height();
        if (fWidth <= 0.0f || fHeight <= 0.0f) {
            return;
        }
        float f = fWidth / this.f18703g2;
        float f2 = f / this.f18704h2;
        int iDip2Px = c1i.dip2Px(getContext(), this.f18705i2);
        float f3 = displayRect.left + ((fWidth - f) / 2.0f);
        float f4 = (displayRect.bottom - iDip2Px) - f2;
        canvas.drawBitmap(bitmap, (Rect) null, new RectF(f3, f4, f + f3, f2 + f4), this.f18706j2);
    }

    private final Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        md8.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private final void ensureTempBitmap(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        Bitmap bitmap = this.f18694b2;
        if (bitmap != null && this.f18696c2 == i && this.f18698d2 == i2) {
            return;
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.f18694b2 = bitmapCreateBitmap;
        this.f18696c2 = i;
        this.f18698d2 = i2;
        this.f18693a2.setBitmap(bitmapCreateBitmap);
    }

    private final float getRatioValue(EnumC2814a enumC2814a) {
        switch (C2815b.f18721a[enumC2814a.ordinal()]) {
            case 1:
                return 1.0f;
            case 2:
                return 1.3333334f;
            case 3:
                return 0.75f;
            case 4:
            case 5:
                return 0.5625f;
            case 6:
            case 7:
                return 1.7777778f;
            case 8:
                return 0.6666667f;
            case 9:
                return 1.5f;
            default:
                return 0.0f;
        }
    }

    private final void updateColorMatrix() {
        this.f18691V1.reset();
        int i = this.f18689N;
        if (i != 0) {
            this.f18691V1.setSaturation(kpd.coerceAtLeast((i / 100.0f) + 1.0f, 0.0f));
        }
        int i2 = this.f18687M;
        if (i2 != 0) {
            float f = (i2 / 100.0f) + 1.0f;
            float f2 = (1 - f) * 0.5f * 255;
            this.f18691V1.postConcat(new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, f2, 0.0f, f, 0.0f, 0.0f, f2, 0.0f, 0.0f, f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
        int i3 = this.f18686L + this.f18690Q;
        if (i3 != 0) {
            float f3 = (int) (i3 * 2.55f);
            this.f18691V1.postConcat(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f3, 0.0f, 1.0f, 0.0f, 0.0f, f3, 0.0f, 0.0f, 1.0f, 0.0f, f3, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
    }

    @yfb
    public final Matrix calculateCropMatrix(@yfb RectF rectF, @yfb RectF rectF2) {
        md8.checkNotNullParameter(rectF, "cropRect");
        md8.checkNotNullParameter(rectF2, "displayRect");
        Matrix matrix = new Matrix();
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fWidth2 = rectF2.width() / fWidth;
        float fHeight2 = rectF2.height() / fHeight;
        float f = (-rectF.left) * fWidth2;
        float f2 = (-rectF.top) * fHeight2;
        matrix.postScale(fWidth2, fHeight2);
        matrix.postTranslate(f, f2);
        return matrix;
    }

    public final void cropToRatio(@yfb EnumC2814a enumC2814a) {
        md8.checkNotNullParameter(enumC2814a, "ratioType");
        boolean z = (enumC2814a == EnumC2814a.f18710H || enumC2814a == EnumC2814a.f18711L) ? false : true;
        this.f18701f = z;
        this.f18683C = enumC2814a;
        if (!z) {
            this.f18707k2 = null;
        }
        applyBitmapTransforms();
    }

    public final int getBrightness() {
        return this.f18686L;
    }

    public final int getContrast() {
        return this.f18687M;
    }

    @gib
    public final Bitmap getCurrentBitmap() {
        Bitmap bitmap;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return null;
        }
        return bitmap;
    }

    @yfb
    public final EnumC2814a getCurrentRatio() {
        return this.f18683C;
    }

    public final float getCurrentRotation() {
        return this.f18697d;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap getDealBitmap(@p000.yfb android.net.Uri r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "sourceUri"
            p000.md8.checkNotNullParameter(r4, r0)
            r0 = 0
            if (r5 == 0) goto L14
            android.graphics.Bitmap r4 = r3.getCurrentBitmap()
            if (r4 != 0) goto Lf
            return r0
        Lf:
            android.graphics.Bitmap r4 = r3.applyMirrorAndRotationToBitmap(r4)
            return r4
        L14:
            java.lang.String r5 = r4.getScheme()
            if (r5 == 0) goto L67
            int r1 = r5.hashCode()
            r2 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r1 == r2) goto L3f
            r2 = 951530617(0x38b73479, float:8.735894E-5)
            if (r1 == r2) goto L29
            goto L67
        L29:
            java.lang.String r1 = "content"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L67
            android.content.Context r5 = r3.getContext()     // Catch: java.lang.Exception -> L3e
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> L3e
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch: java.lang.Exception -> L3e
            goto L88
        L3e:
            return r0
        L3f:
            java.lang.String r1 = "file"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L48
            goto L67
        L48:
            java.io.File r5 = new java.io.File
            java.lang.String r4 = r4.getPath()
            if (r4 != 0) goto L51
            return r0
        L51:
            r5.<init>(r4)
            boolean r4 = r5.exists()
            if (r4 == 0) goto L66
            boolean r4 = r5.canRead()
            if (r4 == 0) goto L66
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r5)
            goto L88
        L66:
            return r0
        L67:
            java.io.File r5 = new java.io.File
            java.lang.String r1 = r4.toString()
            r5.<init>(r1)
            boolean r1 = r5.exists()
            if (r1 == 0) goto L7c
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r5)
            goto L88
        L7c:
            android.content.Context r5 = r3.getContext()     // Catch: java.lang.Exception -> La3
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> La3
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch: java.lang.Exception -> La3
        L88:
            if (r4 == 0) goto La3
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L97
            android.graphics.Bitmap r5 = r3.applyMirrorAndRotationToBitmap(r5)     // Catch: java.lang.Throwable -> L95
            goto L98
        L95:
            r5 = move-exception
            goto L9d
        L97:
            r5 = r0
        L98:
            p000.u52.closeFinally(r4, r0)
            r0 = r5
            goto La3
        L9d:
            throw r5     // Catch: java.lang.Throwable -> L9e
        L9e:
            r0 = move-exception
            p000.u52.closeFinally(r4, r5)
            throw r0
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.glassapp.view.photo.AdvancedPhotoView.getDealBitmap(android.net.Uri, boolean):android.graphics.Bitmap");
    }

    public final int getExposure() {
        return this.f18690Q;
    }

    @yfb
    public final Matrix getMFreeRatioMatrix() {
        return this.f18684F;
    }

    public final int getSaturation() {
        return this.f18689N;
    }

    public final int getSharpness() {
        return this.f18688M1;
    }

    public final boolean isAnyEffectsTransform() {
        return (this.f18686L == 0 && this.f18687M == 0 && this.f18689N == 0 && this.f18690Q == 0 && this.f18688M1 == 0) ? false : true;
    }

    public final boolean isMirrored() {
        return this.f18699e;
    }

    public final boolean isRatio() {
        return this.f18701f;
    }

    public final boolean isRotationMirrorRatio() {
        return this.f18697d != 0.0f || this.f18699e || this.f18701f || this.f18707k2 != null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f18694b2;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f18694b2 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@yfb Canvas canvas) {
        md8.checkNotNullParameter(canvas, "canvas");
        if (getDrawable() == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f18686L == 0 && this.f18687M == 0 && this.f18689N == 0 && this.f18690Q == 0 && this.f18688M1 == 0) {
            super.onDraw(canvas);
        } else {
            ensureTempBitmap(canvas.getWidth(), canvas.getHeight());
            Bitmap bitmap = this.f18694b2;
            if (bitmap != null) {
                bitmap.eraseColor(0);
                this.f18693a2.setBitmap(bitmap);
                super.onDraw(this.f18693a2);
                applyEffects(canvas, bitmap);
            } else {
                super.onDraw(canvas);
            }
        }
        if (!this.f18700e2 || this.f18702f2 == null) {
            return;
        }
        drawWatermark(canvas);
    }

    public final void resetAllTransform() {
        resetRotationMirrorRatio();
        resetEffects();
    }

    public final void resetEffects() {
        if (isAnyEffectsTransform()) {
            this.f18686L = 0;
            this.f18687M = 0;
            this.f18689N = 0;
            this.f18690Q = 0;
            this.f18688M1 = 0;
            invalidate();
        }
    }

    public final void resetRotationMirrorRatio() {
        this.f18697d = 0.0f;
        this.f18699e = false;
        this.f18701f = false;
        this.f18683C = EnumC2814a.f18710H;
        this.f18684F = new Matrix();
        applyBitmapTransforms();
    }

    @yfb
    public final Bitmap rotateBitmap(@yfb Bitmap bitmap, float f) {
        md8.checkNotNullParameter(bitmap, "bitmap");
        if (f % 360 == 0.0f) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        md8.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public final void setAdvanceDisplayMatrix(@yfb Matrix matrix) {
        md8.checkNotNullParameter(matrix, "finalRectangle");
        this.f18684F = matrix;
        this.f18701f = true;
        applyBitmapTransforms();
    }

    public final void setAdvancedMirror(boolean z) {
        this.f18699e = z;
        applyBitmapTransforms();
    }

    public final void setAdvancedRotation(float f) {
        this.f18697d = f % 360;
        applyBitmapTransforms();
    }

    public final void setAllEffects(int i, int i2, int i3, int i4, int i5) {
        this.f18686L = i;
        this.f18687M = i2;
        this.f18689N = i3;
        this.f18690Q = i4;
        this.f18688M1 = i5;
        invalidate();
    }

    public final void setBrightness(int i) {
        this.f18686L = i;
    }

    public final void setBrightnessValue(int i) {
        this.f18686L = i;
        invalidate();
    }

    public final void setContrast(int i) {
        this.f18687M = i;
    }

    public final void setContrastValue(int i) {
        this.f18687M = i;
        invalidate();
    }

    public final void setCurrentRatio(@yfb EnumC2814a enumC2814a) {
        md8.checkNotNullParameter(enumC2814a, "<set-?>");
        this.f18683C = enumC2814a;
    }

    public final void setCurrentRotation(float f) {
        this.f18697d = f;
    }

    public final void setExposure(int i) {
        this.f18690Q = i;
    }

    public final void setExposureValue(int i) {
        this.f18690Q = i;
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(@gib Bitmap bitmap) {
        this.f18695c = bitmap;
        super.setImageBitmap(bitmap);
    }

    @Override // com.github.chrisbanes.photoview.PhotoView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@gib Drawable drawable) {
        this.f18695c = drawableToBitmap(drawable);
        super.setImageDrawable(drawable);
    }

    @Override // com.github.chrisbanes.photoview.PhotoView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.f18695c = drawableToBitmap(getContext().getDrawable(i));
        super.setImageResource(i);
    }

    @Override // com.github.chrisbanes.photoview.PhotoView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(@gib Uri uri) {
        super.setImageURI(uri);
    }

    public final void setMFreeRatioMatrix(@yfb Matrix matrix) {
        md8.checkNotNullParameter(matrix, "<set-?>");
        this.f18684F = matrix;
    }

    public final void setMirrored(boolean z) {
        this.f18699e = z;
    }

    public final void setRatio(boolean z) {
        this.f18701f = z;
    }

    public final void setRatioFreeBitmap(@yfb Bitmap bitmap) {
        md8.checkNotNullParameter(bitmap, "bitmap");
        this.f18707k2 = bitmap;
        applyBitmapTransforms();
    }

    public final void setSaturation(int i) {
        this.f18689N = i;
    }

    public final void setSaturationValue(int i) {
        this.f18689N = i;
        invalidate();
    }

    public final void setSharpness(int i) {
        this.f18688M1 = i;
    }

    public final void setSharpnessValue(int i) {
        this.f18688M1 = i;
        invalidate();
    }

    public final void setWatermarkBitmap(@gib Bitmap bitmap) {
        this.f18702f2 = bitmap;
        invalidate();
    }

    public final void setWatermarkResource(int i) {
        try {
            this.f18702f2 = BitmapFactory.decodeResource(getResources(), i);
            invalidate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void setWatermarkVisible(boolean z) {
        if (vfe.getInstance().getBoolean(u77.f86969m, false)) {
            this.f18700e2 = z;
            invalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public AdvancedPhotoView(@yfb Context context, @gib AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        md8.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AdvancedPhotoView(Context context, AttributeSet attributeSet, int i, int i2, jt3 jt3Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yn8
    public AdvancedPhotoView(@yfb Context context, @gib AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        md8.checkNotNullParameter(context, "context");
        this.f18683C = EnumC2814a.f18710H;
        this.f18684F = new Matrix();
        this.f18691V1 = new ColorMatrix();
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        paint.setDither(true);
        this.f18692Z1 = paint;
        this.f18693a2 = new Canvas();
        this.f18703g2 = 6.85f;
        this.f18704h2 = 3.44f;
        this.f18705i2 = 4;
        this.f18706j2 = new Paint(3);
        setOnMatrixChangeListener(new u3c() { // from class: qi
            @Override // p000.u3c
            public final void onMatrixChanged(RectF rectF) {
                this.f74480a.f18685H;
            }
        });
    }
}
