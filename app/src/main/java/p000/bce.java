package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class bce extends k41 {

    /* JADX INFO: renamed from: g */
    public static final int f13338g = 1;

    /* JADX INFO: renamed from: h */
    public static final String f13339h = "jp.wasabeef.glide.transformations.RoundedCornersTransformation.1";

    /* JADX INFO: renamed from: c */
    public final int f13340c;

    /* JADX INFO: renamed from: d */
    public final int f13341d;

    /* JADX INFO: renamed from: e */
    public final int f13342e;

    /* JADX INFO: renamed from: f */
    public final EnumC1832b f13343f;

    /* JADX INFO: renamed from: bce$a */
    public static /* synthetic */ class C1831a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13344a;

        static {
            int[] iArr = new int[EnumC1832b.values().length];
            f13344a = iArr;
            try {
                iArr[EnumC1832b.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13344a[EnumC1832b.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13344a[EnumC1832b.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13344a[EnumC1832b.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13344a[EnumC1832b.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13344a[EnumC1832b.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13344a[EnumC1832b.BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13344a[EnumC1832b.LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13344a[EnumC1832b.RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13344a[EnumC1832b.OTHER_TOP_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13344a[EnumC1832b.OTHER_TOP_RIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13344a[EnumC1832b.OTHER_BOTTOM_LEFT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13344a[EnumC1832b.OTHER_BOTTOM_RIGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13344a[EnumC1832b.DIAGONAL_FROM_TOP_LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13344a[EnumC1832b.DIAGONAL_FROM_TOP_RIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: renamed from: bce$b */
    public enum EnumC1832b {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    public bce(int radius, int margin) {
        this(radius, margin, EnumC1832b.ALL);
    }

    private void drawBottomLeftRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        RectF rectF = new RectF(this.f13342e, bottom - this.f13341d, r1 + r3, bottom);
        int i = this.f13340c;
        canvas.drawRoundRect(rectF, i, i, paint);
        int i2 = this.f13342e;
        canvas.drawRect(new RectF(i2, i2, i2 + this.f13341d, bottom - this.f13340c), paint);
        canvas.drawRect(new RectF(this.f13340c + r1, this.f13342e, right, bottom), paint);
    }

    private void drawBottomRightRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.f13341d;
        RectF rectF = new RectF(right - i, bottom - i, right, bottom);
        int i2 = this.f13340c;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.f13342e;
        canvas.drawRect(new RectF(i3, i3, right - this.f13340c, bottom), paint);
        int i4 = this.f13340c;
        canvas.drawRect(new RectF(right - i4, this.f13342e, right, bottom - i4), paint);
    }

    private void drawBottomRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        RectF rectF = new RectF(this.f13342e, bottom - this.f13341d, right, bottom);
        int i = this.f13340c;
        canvas.drawRoundRect(rectF, i, i, paint);
        int i2 = this.f13342e;
        canvas.drawRect(new RectF(i2, i2, right, bottom - this.f13340c), paint);
    }

    private void drawDiagonalFromTopLeftRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.f13342e;
        int i2 = this.f13341d;
        RectF rectF = new RectF(i, i, i + i2, i + i2);
        int i3 = this.f13340c;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.f13341d;
        RectF rectF2 = new RectF(right - i4, bottom - i4, right, bottom);
        int i5 = this.f13340c;
        canvas.drawRoundRect(rectF2, i5, i5, paint);
        canvas.drawRect(new RectF(this.f13342e, r1 + r3, right - this.f13340c, bottom), paint);
        canvas.drawRect(new RectF(r1 + r2, this.f13342e, right, bottom - this.f13340c), paint);
    }

    private void drawDiagonalFromTopRightRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.f13341d;
        RectF rectF = new RectF(right - i, this.f13342e, right, r3 + i);
        int i2 = this.f13340c;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        RectF rectF2 = new RectF(this.f13342e, bottom - this.f13341d, r1 + r3, bottom);
        int i3 = this.f13340c;
        canvas.drawRoundRect(rectF2, i3, i3, paint);
        int i4 = this.f13342e;
        int i5 = this.f13340c;
        canvas.drawRect(new RectF(i4, i4, right - i5, bottom - i5), paint);
        int i6 = this.f13342e;
        int i7 = this.f13340c;
        canvas.drawRect(new RectF(i6 + i7, i6 + i7, right, bottom), paint);
    }

    private void drawLeftRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.f13342e;
        RectF rectF = new RectF(i, i, i + this.f13341d, bottom);
        int i2 = this.f13340c;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        canvas.drawRect(new RectF(this.f13340c + r1, this.f13342e, right, bottom), paint);
    }

    private void drawOtherBottomLeftRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.f13342e;
        RectF rectF = new RectF(i, i, right, i + this.f13341d);
        int i2 = this.f13340c;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        RectF rectF2 = new RectF(right - this.f13341d, this.f13342e, right, bottom);
        int i3 = this.f13340c;
        canvas.drawRoundRect(rectF2, i3, i3, paint);
        canvas.drawRect(new RectF(this.f13342e, r1 + r3, right - this.f13340c, bottom), paint);
    }

    private void drawOtherBottomRightRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.f13342e;
        RectF rectF = new RectF(i, i, right, i + this.f13341d);
        int i2 = this.f13340c;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.f13342e;
        RectF rectF2 = new RectF(i3, i3, i3 + this.f13341d, bottom);
        int i4 = this.f13340c;
        canvas.drawRoundRect(rectF2, i4, i4, paint);
        int i5 = this.f13342e;
        int i6 = this.f13340c;
        canvas.drawRect(new RectF(i5 + i6, i5 + i6, right, bottom), paint);
    }

    private void drawOtherTopLeftRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        RectF rectF = new RectF(this.f13342e, bottom - this.f13341d, right, bottom);
        int i = this.f13340c;
        canvas.drawRoundRect(rectF, i, i, paint);
        RectF rectF2 = new RectF(right - this.f13341d, this.f13342e, right, bottom);
        int i2 = this.f13340c;
        canvas.drawRoundRect(rectF2, i2, i2, paint);
        int i3 = this.f13342e;
        int i4 = this.f13340c;
        canvas.drawRect(new RectF(i3, i3, right - i4, bottom - i4), paint);
    }

    private void drawOtherTopRightRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.f13342e;
        RectF rectF = new RectF(i, i, i + this.f13341d, bottom);
        int i2 = this.f13340c;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        RectF rectF2 = new RectF(this.f13342e, bottom - this.f13341d, right, bottom);
        int i3 = this.f13340c;
        canvas.drawRoundRect(rectF2, i3, i3, paint);
        canvas.drawRect(new RectF(r1 + r2, this.f13342e, right, bottom - this.f13340c), paint);
    }

    private void drawRightRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        RectF rectF = new RectF(right - this.f13341d, this.f13342e, right, bottom);
        int i = this.f13340c;
        canvas.drawRoundRect(rectF, i, i, paint);
        int i2 = this.f13342e;
        canvas.drawRect(new RectF(i2, i2, right - this.f13340c, bottom), paint);
    }

    private void drawRoundRect(Canvas canvas, Paint paint, float width, float height) {
        int i = this.f13342e;
        float f = width - i;
        float f2 = height - i;
        switch (C1831a.f13344a[this.f13343f.ordinal()]) {
            case 1:
                int i2 = this.f13342e;
                RectF rectF = new RectF(i2, i2, f, f2);
                int i3 = this.f13340c;
                canvas.drawRoundRect(rectF, i3, i3, paint);
                break;
            case 2:
                drawTopLeftRoundRect(canvas, paint, f, f2);
                break;
            case 3:
                drawTopRightRoundRect(canvas, paint, f, f2);
                break;
            case 4:
                drawBottomLeftRoundRect(canvas, paint, f, f2);
                break;
            case 5:
                drawBottomRightRoundRect(canvas, paint, f, f2);
                break;
            case 6:
                drawTopRoundRect(canvas, paint, f, f2);
                break;
            case 7:
                drawBottomRoundRect(canvas, paint, f, f2);
                break;
            case 8:
                drawLeftRoundRect(canvas, paint, f, f2);
                break;
            case 9:
                drawRightRoundRect(canvas, paint, f, f2);
                break;
            case 10:
                drawOtherTopLeftRoundRect(canvas, paint, f, f2);
                break;
            case 11:
                drawOtherTopRightRoundRect(canvas, paint, f, f2);
                break;
            case 12:
                drawOtherBottomLeftRoundRect(canvas, paint, f, f2);
                break;
            case 13:
                drawOtherBottomRightRoundRect(canvas, paint, f, f2);
                break;
            case 14:
                drawDiagonalFromTopLeftRoundRect(canvas, paint, f, f2);
                break;
            case 15:
                drawDiagonalFromTopRightRoundRect(canvas, paint, f, f2);
                break;
            default:
                int i4 = this.f13342e;
                RectF rectF2 = new RectF(i4, i4, f, f2);
                int i5 = this.f13340c;
                canvas.drawRoundRect(rectF2, i5, i5, paint);
                break;
        }
    }

    private void drawTopLeftRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.f13342e;
        int i2 = this.f13341d;
        RectF rectF = new RectF(i, i, i + i2, i + i2);
        int i3 = this.f13340c;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.f13342e;
        int i5 = this.f13340c;
        canvas.drawRect(new RectF(i4, i4 + i5, i4 + i5, bottom), paint);
        canvas.drawRect(new RectF(this.f13340c + r1, this.f13342e, right, bottom), paint);
    }

    private void drawTopRightRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.f13341d;
        RectF rectF = new RectF(right - i, this.f13342e, right, r3 + i);
        int i2 = this.f13340c;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.f13342e;
        canvas.drawRect(new RectF(i3, i3, right - this.f13340c, bottom), paint);
        canvas.drawRect(new RectF(right - this.f13340c, this.f13342e + r1, right, bottom), paint);
    }

    private void drawTopRoundRect(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.f13342e;
        RectF rectF = new RectF(i, i, right, i + this.f13341d);
        int i2 = this.f13340c;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        canvas.drawRect(new RectF(this.f13342e, r1 + this.f13340c, right, bottom), paint);
    }

    @Override // p000.k41
    /* JADX INFO: renamed from: b */
    public Bitmap mo255b(@efb Context context, @efb e41 pool, @efb Bitmap toTransform, int outWidth, int outHeight) {
        int width = toTransform.getWidth();
        int height = toTransform.getHeight();
        Bitmap bitmap = pool.get(width, height, Bitmap.Config.ARGB_8888);
        bitmap.setHasAlpha(true);
        m14491a(toTransform, bitmap);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(toTransform, tileMode, tileMode));
        drawRoundRect(canvas, paint, width, height);
        return bitmap;
    }

    @Override // p000.k41, p000.eq8
    public boolean equals(Object o) {
        if (o instanceof bce) {
            bce bceVar = (bce) o;
            if (bceVar.f13340c == this.f13340c && bceVar.f13341d == this.f13341d && bceVar.f13342e == this.f13342e && bceVar.f13343f == this.f13343f) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.k41, p000.eq8
    public int hashCode() {
        return 425235636 + (this.f13340c * 10000) + (this.f13341d * 1000) + (this.f13342e * 100) + (this.f13343f.ordinal() * 10);
    }

    public String toString() {
        return "RoundedTransformation(radius=" + this.f13340c + ", margin=" + this.f13342e + ", diameter=" + this.f13341d + ", cornerType=" + this.f13343f.name() + c0b.f15434d;
    }

    @Override // p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f13339h + this.f13340c + this.f13341d + this.f13342e + this.f13343f).getBytes(eq8.f33838b));
    }

    public bce(int radius, int margin, EnumC1832b cornerType) {
        this.f13340c = radius;
        this.f13341d = radius * 2;
        this.f13342e = margin;
        this.f13343f = cornerType;
    }
}
