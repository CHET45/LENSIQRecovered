package com.eyevue.glassapp.utils.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import java.security.MessageDigest;
import p000.ceb;
import p000.ceh;
import p000.e0g;
import p000.e41;
import p000.gib;
import p000.i41;
import p000.md8;
import p000.t5e;
import p000.xw1;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 0)
public final class MultiRadiusRoundTransform implements ceh<Bitmap> {
    public static final int $stable = 8;

    @yfb
    private final CornerType cornerType;

    @yfb
    private final Paint paint;
    private final float radius;
    private final int viewHeight;
    private final int viewWidth;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CornerType.values().length];
            try {
                iArr[CornerType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CornerType.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CornerType.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CornerType.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CornerType.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CornerType.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CornerType.BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CornerType.LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CornerType.RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CornerType.NONE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiRadiusRoundTransform(float f, @yfb CornerType cornerType, int i, int i2) {
        md8.checkNotNullParameter(cornerType, "cornerType");
        this.radius = f;
        this.cornerType = cornerType;
        this.viewWidth = i;
        this.viewHeight = i2;
        this.paint = new Paint(1);
    }

    private final void drawBottomCorners(Canvas canvas, RectF rectF, float f) {
        Path path = new Path();
        path.moveTo(rectF.right, rectF.bottom - f);
        float f2 = rectF.right;
        float f3 = f * 2;
        float f4 = rectF.bottom;
        path.arcTo(f2 - f3, f4 - f3, f2, f4, 0.0f, 90.0f, false);
        path.lineTo(rectF.left + f, rectF.bottom);
        float f5 = rectF.left;
        float f6 = rectF.bottom;
        path.arcTo(f5, f6 - f3, f5 + f3, f6, 90.0f, 90.0f, false);
        path.lineTo(rectF.left, rectF.top);
        path.lineTo(rectF.right, rectF.top);
        path.close();
        canvas.drawPath(path, this.paint);
    }

    private final void drawBottomLeftCorner(Canvas canvas, RectF rectF, float f) {
        Path path = new Path();
        path.moveTo(rectF.left, rectF.bottom - f);
        float f2 = rectF.left;
        float f3 = rectF.bottom;
        float f4 = f * 2;
        path.arcTo(f2, f3 - f4, f2 + f4, f3, 90.0f, 90.0f, false);
        path.lineTo(rectF.left, rectF.top);
        path.lineTo(rectF.right, rectF.top);
        path.lineTo(rectF.right, rectF.bottom);
        path.close();
        canvas.drawPath(path, this.paint);
    }

    private final void drawBottomRightCorner(Canvas canvas, RectF rectF, float f) {
        Path path = new Path();
        path.moveTo(rectF.right, rectF.bottom - f);
        float f2 = rectF.right;
        float f3 = f * 2;
        float f4 = rectF.bottom;
        path.arcTo(f2 - f3, f4 - f3, f2, f4, 0.0f, 90.0f, false);
        path.lineTo(rectF.right, rectF.top);
        path.lineTo(rectF.left, rectF.top);
        path.lineTo(rectF.left, rectF.bottom);
        path.close();
        canvas.drawPath(path, this.paint);
    }

    private final void drawLeftCorners(Canvas canvas, RectF rectF, float f) {
        Path path = new Path();
        path.moveTo(rectF.left, rectF.top + f);
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = f * 2;
        path.arcTo(f2, f3, f2 + f4, f3 + f4, 180.0f, 90.0f, false);
        path.lineTo(rectF.right, rectF.top);
        path.lineTo(rectF.right, rectF.bottom);
        path.lineTo(rectF.left + f, rectF.bottom);
        float f5 = rectF.left;
        float f6 = rectF.bottom;
        path.arcTo(f5, f6 - f4, f5 + f4, f6, 90.0f, 90.0f, false);
        path.close();
        canvas.drawPath(path, this.paint);
    }

    private final void drawRightCorners(Canvas canvas, RectF rectF, float f) {
        Path path = new Path();
        path.moveTo(rectF.right - f, rectF.top);
        float f2 = rectF.right;
        float f3 = f * 2;
        float f4 = rectF.top;
        path.arcTo(f2 - f3, f4, f2, f4 + f3, 270.0f, 90.0f, false);
        path.lineTo(rectF.right, rectF.bottom - f);
        float f5 = rectF.right;
        float f6 = rectF.bottom;
        path.arcTo(f5 - f3, f6 - f3, f5, f6, 0.0f, 90.0f, false);
        path.lineTo(rectF.left, rectF.bottom);
        path.lineTo(rectF.left, rectF.top);
        path.close();
        canvas.drawPath(path, this.paint);
    }

    private final void drawRoundCorners(Canvas canvas, RectF rectF, CornerType cornerType, float f) {
        switch (WhenMappings.$EnumSwitchMapping$0[cornerType.ordinal()]) {
            case 1:
                canvas.drawRoundRect(rectF, f, f, this.paint);
                return;
            case 2:
                drawTopLeftCorner(canvas, rectF, f);
                return;
            case 3:
                drawTopRightCorner(canvas, rectF, f);
                return;
            case 4:
                drawBottomLeftCorner(canvas, rectF, f);
                return;
            case 5:
                drawBottomRightCorner(canvas, rectF, f);
                return;
            case 6:
                drawTopCorners(canvas, rectF, f);
                return;
            case 7:
                drawBottomCorners(canvas, rectF, f);
                return;
            case 8:
                drawLeftCorners(canvas, rectF, f);
                return;
            case 9:
                drawRightCorners(canvas, rectF, f);
                return;
            case 10:
                canvas.drawRect(rectF, this.paint);
                return;
            default:
                throw new ceb();
        }
    }

    private final void drawTopCorners(Canvas canvas, RectF rectF, float f) {
        Path path = new Path();
        path.moveTo(rectF.left, rectF.top + f);
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = f * 2;
        path.arcTo(f2, f3, f2 + f4, f3 + f4, 180.0f, 90.0f, false);
        path.lineTo(rectF.right - f, rectF.top);
        float f5 = rectF.right;
        float f6 = rectF.top;
        path.arcTo(f5 - f4, f6, f5, f6 + f4, 270.0f, 90.0f, false);
        path.lineTo(rectF.right, rectF.bottom);
        path.lineTo(rectF.left, rectF.bottom);
        path.close();
        canvas.drawPath(path, this.paint);
    }

    private final void drawTopLeftCorner(Canvas canvas, RectF rectF, float f) {
        Path path = new Path();
        path.moveTo(rectF.left, rectF.top + f);
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = f * 2;
        path.arcTo(f2, f3, f2 + f4, f3 + f4, 180.0f, 90.0f, false);
        path.lineTo(rectF.right, rectF.top);
        path.lineTo(rectF.right, rectF.bottom);
        path.lineTo(rectF.left, rectF.bottom);
        path.close();
        canvas.drawPath(path, this.paint);
    }

    private final void drawTopRightCorner(Canvas canvas, RectF rectF, float f) {
        Path path = new Path();
        path.moveTo(rectF.right - f, rectF.top);
        float f2 = rectF.right;
        float f3 = f * 2;
        float f4 = rectF.top;
        path.arcTo(f2 - f3, f4, f2, f4 + f3, 270.0f, 90.0f, false);
        path.lineTo(rectF.right, rectF.bottom);
        path.lineTo(rectF.left, rectF.bottom);
        path.lineTo(rectF.left, rectF.top);
        path.close();
        canvas.drawPath(path, this.paint);
    }

    @Override // p000.eq8
    public boolean equals(@gib Object obj) {
        if (obj instanceof MultiRadiusRoundTransform) {
            MultiRadiusRoundTransform multiRadiusRoundTransform = (MultiRadiusRoundTransform) obj;
            if (multiRadiusRoundTransform.radius == this.radius && multiRadiusRoundTransform.cornerType == this.cornerType) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.eq8
    public int hashCode() {
        return ("MultiRadiusRoundTransform" + this.radius + this.cornerType).hashCode();
    }

    @Override // p000.ceh
    @yfb
    public t5e<Bitmap> transform(@yfb Context context, @yfb t5e<Bitmap> t5eVar, int i, int i2) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(t5eVar, "resource");
        e41 bitmapPool = ComponentCallbacks2C2485a.get(context).getBitmapPool();
        md8.checkNotNullExpressionValue(bitmapPool, "getBitmapPool(...)");
        Bitmap bitmap = t5eVar.get();
        md8.checkNotNullExpressionValue(bitmap, "get(...)");
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.viewWidth, this.viewHeight, true);
        md8.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        int i3 = this.viewWidth;
        int i4 = this.viewHeight;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = bitmapPool.get(i3, i4, config);
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(this.viewWidth, this.viewHeight, config);
            md8.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = this.paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapCreateScaledBitmap, tileMode, tileMode));
        drawRoundCorners(canvas, new RectF(0.0f, 0.0f, this.viewWidth, this.viewHeight), this.cornerType, this.radius);
        i41 i41VarObtain = i41.obtain(bitmapCreateBitmap, bitmapPool);
        md8.checkNotNull(i41VarObtain);
        return i41VarObtain;
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@yfb MessageDigest messageDigest) {
        md8.checkNotNullParameter(messageDigest, "messageDigest");
        byte[] bytes = ("MultiRadiusRoundTransform" + this.radius + this.cornerType).getBytes(xw1.f99524b);
        md8.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
    }
}
