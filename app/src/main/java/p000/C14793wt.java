package p000;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import p000.fag;
import p000.hag;

/* JADX INFO: renamed from: wt */
/* JADX INFO: loaded from: classes.dex */
public final class C14793wt {

    /* JADX INFO: renamed from: wt$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95465a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f95466b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f95467c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f95465a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f95466b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f95467c = iArr3;
        }
    }

    @yfb
    public static final icc Paint() {
        return new C14253vt();
    }

    @yfb
    public static final icc asComposePaint(@yfb Paint paint) {
        return new C14253vt(paint);
    }

    public static final float getNativeAlpha(@yfb Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(@yfb Paint paint) {
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(@yfb Paint paint) {
        return j92.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(@yfb Paint paint) {
        return !paint.isFilterBitmap() ? xu5.f99348b.m33298getNonefv9h1I() : xu5.f99348b.m33296getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(@yfb Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : a.f95466b[strokeCap.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? fag.f35949b.m28904getButtKaPHkGw() : fag.f35949b.m28906getSquareKaPHkGw() : fag.f35949b.m28905getRoundKaPHkGw() : fag.f35949b.m28904getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(@yfb Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : a.f95467c[strokeJoin.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? hag.f43019b.m29985getMiterLxFBmk8() : hag.f43019b.m29986getRoundLxFBmk8() : hag.f43019b.m29984getBevelLxFBmk8() : hag.f43019b.m29985getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(@yfb Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(@yfb Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(@yfb Paint paint) {
        Paint.Style style = paint.getStyle();
        return (style == null ? -1 : a.f95465a[style.ordinal()]) == 1 ? rcc.f77828b.m32115getStrokeTiuSbCo() : rcc.f77828b.m32114getFillTiuSbCo();
    }

    @yfb
    public static final Paint makeNativePaint() {
        return new Paint(7);
    }

    public static final void setNativeAlpha(@yfb Paint paint, float f) {
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void setNativeAntiAlias(@yfb Paint paint, boolean z) {
        paint.setAntiAlias(z);
    }

    /* JADX INFO: renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m33114setNativeBlendModeGB0RdKg(@yfb Paint paint, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            kri.f55189a.m30745setBlendModeGB0RdKg(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(C1995bq.m28033toPorterDuffModes9anfk8(i)));
        }
    }

    /* JADX INFO: renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m33115setNativeColor4WTKRHQ(@yfb Paint paint, long j) {
        paint.setColor(j92.m30490toArgb8_81llA(j));
    }

    public static final void setNativeColorFilter(@yfb Paint paint, @gib b92 b92Var) {
        paint.setColorFilter(b92Var != null ? C8936lq.asAndroidColorFilter(b92Var) : null);
    }

    /* JADX INFO: renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m33116setNativeFilterQuality50PEsBU(@yfb Paint paint, int i) {
        paint.setFilterBitmap(!xu5.m33291equalsimpl0(i, xu5.f99348b.m33298getNonefv9h1I()));
    }

    public static final void setNativePathEffect(@yfb Paint paint, @gib ajc ajcVar) {
        C5468eu c5468eu = (C5468eu) ajcVar;
        paint.setPathEffect(c5468eu != null ? c5468eu.getNativePathEffect() : null);
    }

    public static final void setNativeShader(@yfb Paint paint, @gib Shader shader) {
        paint.setShader(shader);
    }

    /* JADX INFO: renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m33117setNativeStrokeCapCSYIeUk(@yfb Paint paint, int i) {
        fag.C5708a c5708a = fag.f35949b;
        paint.setStrokeCap(fag.m28900equalsimpl0(i, c5708a.m28906getSquareKaPHkGw()) ? Paint.Cap.SQUARE : fag.m28900equalsimpl0(i, c5708a.m28905getRoundKaPHkGw()) ? Paint.Cap.ROUND : fag.m28900equalsimpl0(i, c5708a.m28904getButtKaPHkGw()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX INFO: renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m33118setNativeStrokeJoinkLtJ_vA(@yfb Paint paint, int i) {
        hag.C6778a c6778a = hag.f43019b;
        paint.setStrokeJoin(hag.m29980equalsimpl0(i, c6778a.m29985getMiterLxFBmk8()) ? Paint.Join.MITER : hag.m29980equalsimpl0(i, c6778a.m29984getBevelLxFBmk8()) ? Paint.Join.BEVEL : hag.m29980equalsimpl0(i, c6778a.m29986getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void setNativeStrokeMiterLimit(@yfb Paint paint, float f) {
        paint.setStrokeMiter(f);
    }

    public static final void setNativeStrokeWidth(@yfb Paint paint, float f) {
        paint.setStrokeWidth(f);
    }

    /* JADX INFO: renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m33119setNativeStyle5YerkU(@yfb Paint paint, int i) {
        paint.setStyle(rcc.m32110equalsimpl0(i, rcc.f77828b.m32115getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
