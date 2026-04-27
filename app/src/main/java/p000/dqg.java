package p000;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class dqg extends Canvas {

    /* JADX INFO: renamed from: b */
    public static final int f30421b = 8;

    /* JADX INFO: renamed from: a */
    public Canvas f30422a;

    @Override // android.graphics.Canvas
    @c5e(26)
    public boolean clipOutPath(@yfb Path path) {
        yq1 yq1Var = yq1.f102629a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return yq1Var.clipOutPath(canvas, path);
    }

    @Override // android.graphics.Canvas
    @c5e(26)
    public boolean clipOutRect(@yfb RectF rectF) {
        yq1 yq1Var = yq1.f102629a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return yq1Var.clipOutRect(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public boolean clipPath(@yfb Path path, @yfb Region.Op op) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public boolean clipRect(@yfb RectF rectF, @yfb Region.Op op) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public void concat(@gib Matrix matrix) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    @c5e(29)
    public void disableZ() {
        er1 er1Var = er1.f33876a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        er1Var.disableZ(canvas);
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i, int i2, int i3, int i4) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public void drawArc(@yfb RectF rectF, float f, float f2, boolean z, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@yfb Bitmap bitmap, float f, float f2, @gib Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(@yfb Bitmap bitmap, int i, int i2, @yfb float[] fArr, int i3, @gib int[] iArr, int i4, @gib Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f, float f2, float f3, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i);
    }

    @Override // android.graphics.Canvas
    @c5e(29)
    public void drawDoubleRoundRect(@yfb RectF rectF, float f, float f2, @yfb RectF rectF2, float f3, float f4, @yfb Paint paint) {
        er1 er1Var = er1.f33876a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        er1Var.drawDoubleRoundRect(canvas, rectF, f, f2, rectF2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    @c5e(31)
    public void drawGlyphs(@yfb int[] iArr, int i, @yfb float[] fArr, int i2, int i3, @yfb Font font, @yfb Paint paint) {
        mr1 mr1Var = mr1.f61779a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        mr1Var.drawGlyphs(canvas, iArr, i, fArr, i2, i3, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f, float f2, float f3, float f4, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@yfb float[] fArr, int i, int i2, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(@yfb RectF rectF, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(@yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    @c5e(31)
    public void drawPatch(@yfb NinePatch ninePatch, @yfb Rect rect, @gib Paint paint) {
        mr1 mr1Var = mr1.f61779a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        mr1Var.drawPatch(canvas, ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(@yfb Path path, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@yfb Picture picture) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f, float f2, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@gib float[] fArr, int i, int i2, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public void drawPosText(@yfb char[] cArr, int i, int i2, @yfb float[] fArr, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i, i2, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i, int i2, int i3) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i, i2, i3);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@yfb RectF rectF, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    @c5e(29)
    public void drawRenderNode(@yfb RenderNode renderNode) {
        er1 er1Var = er1.f33876a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        er1Var.drawRenderNode(canvas, renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(@yfb RectF rectF, float f, float f2, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@yfb char[] cArr, int i, int i2, float f, float f2, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@yfb char[] cArr, int i, int i2, @yfb Path path, float f, float f2, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    @c5e(23)
    public void drawTextRun(@yfb char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, @yfb Paint paint) {
        xq1 xq1Var = xq1.f98894a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        xq1Var.drawTextRun(canvas, cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(@yfb Canvas.VertexMode vertexMode, int i, @yfb float[] fArr, int i2, @gib float[] fArr2, int i3, @gib int[] iArr, int i4, @gib short[] sArr, int i5, int i6, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    @Override // android.graphics.Canvas
    @c5e(29)
    public void enableZ() {
        er1 er1Var = er1.f33876a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        er1Var.enableZ(canvas);
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(@yfb Rect rect) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    @gib
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public void getMatrix(@yfb Matrix matrix) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public boolean quickReject(@yfb RectF rectF, @yfb Canvas.EdgeType edgeType) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f);
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public int saveLayer(@gib RectF rectF, @gib Paint paint, int i) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i);
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public int saveLayerAlpha(@gib RectF rectF, int i, int i2) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i, i2);
    }

    @Override // android.graphics.Canvas
    public void scale(float f, float f2) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f, f2);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(@gib Bitmap bitmap) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    public final void setCanvas(@yfb Canvas canvas) {
        this.f30422a = canvas;
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(@gib DrawFilter drawFilter) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(@gib Matrix matrix) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float f, float f2) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f, f2);
    }

    @Override // android.graphics.Canvas
    public void translate(float f, float f2) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f, f2);
    }

    @Override // android.graphics.Canvas
    @c5e(26)
    public boolean clipOutRect(@yfb Rect rect) {
        yq1 yq1Var = yq1.f102629a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return yq1Var.clipOutRect(canvas, rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(@yfb Path path) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public boolean clipRect(@yfb Rect rect, @yfb Region.Op op) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@yfb Bitmap bitmap, @gib Rect rect, @yfb RectF rectF, @gib Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    @c5e(29)
    public void drawColor(long j) {
        er1 er1Var = er1.f33876a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        er1Var.drawColor(canvas, j);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@yfb float[] fArr, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f, float f2, float f3, float f4, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    @c5e(31)
    public void drawPatch(@yfb NinePatch ninePatch, @yfb RectF rectF, @gib Paint paint) {
        mr1 mr1Var = mr1.f61779a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        mr1Var.drawPatch(canvas, ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@yfb Picture picture, @yfb RectF rectF) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@yfb float[] fArr, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public void drawPosText(@yfb String str, @yfb float[] fArr, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@yfb Rect rect, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@yfb String str, float f, float f2, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@yfb String str, @yfb Path path, float f, float f2, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    @c5e(30)
    public boolean quickReject(@yfb RectF rectF) {
        ir1 ir1Var = ir1.f48020a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return ir1Var.quickReject(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(@gib RectF rectF, @gib Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(@gib RectF rectF, int i) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    @c5e(26)
    public boolean clipOutRect(float f, float f2, float f3, float f4) {
        yq1 yq1Var = yq1.f102629a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return yq1Var.clipOutRect(canvas, f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@yfb RectF rectF) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@yfb Bitmap bitmap, @gib Rect rect, @yfb Rect rect2, @gib Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i, @yfb PorterDuff.Mode mode) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@yfb Picture picture, @yfb Rect rect) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f, float f2, float f3, float f4, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@yfb String str, int i, int i2, float f, float f2, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public boolean quickReject(@yfb Path path, @yfb Canvas.EdgeType edgeType) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public int saveLayer(float f, float f2, float f3, float f4, @gib Paint paint, int i) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f, f2, f3, f4, paint, i);
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @Override // android.graphics.Canvas
    @c5e(26)
    public boolean clipOutRect(int i, int i2, int i3, int i4) {
        yq1 yq1Var = yq1.f102629a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return yq1Var.clipOutRect(canvas, i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@yfb Rect rect) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public void drawBitmap(@yfb int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, @gib Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    @Override // android.graphics.Canvas
    @c5e(29)
    public void drawColor(int i, @yfb BlendMode blendMode) {
        er1 er1Var = er1.f33876a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        er1Var.drawColor(canvas, i, blendMode);
    }

    @Override // android.graphics.Canvas
    @c5e(29)
    public void drawDoubleRoundRect(@yfb RectF rectF, @yfb float[] fArr, @yfb RectF rectF2, @yfb float[] fArr2, @yfb Paint paint) {
        er1 er1Var = er1.f33876a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        er1Var.drawDoubleRoundRect(canvas, rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@yfb CharSequence charSequence, int i, int i2, float f, float f2, @yfb Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    @c5e(23)
    public void drawTextRun(@yfb CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, @yfb Paint paint) {
        xq1 xq1Var = xq1.f98894a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        xq1Var.drawTextRun(canvas, charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    @c5e(30)
    public boolean quickReject(@yfb Path path) {
        ir1 ir1Var = ir1.f48020a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return ir1Var.quickReject(canvas, path);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f, float f2, float f3, float f4, @gib Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public boolean clipRect(float f, float f2, float f3, float f4, @yfb Region.Op op) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f, f2, f3, f4, op);
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public void drawBitmap(@yfb int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, @gib Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    @Override // android.graphics.Canvas
    @c5e(29)
    public void drawColor(long j, @yfb BlendMode blendMode) {
        er1 er1Var = er1.f33876a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        er1Var.drawColor(canvas, j, blendMode);
    }

    @Override // android.graphics.Canvas
    @q64(message = "Deprecated in Java")
    public boolean quickReject(float f, float f2, float f3, float f4, @yfb Canvas.EdgeType edgeType) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f, f2, f3, f4, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@yfb Bitmap bitmap, @yfb Matrix matrix, @gib Paint paint) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    @c5e(30)
    public boolean quickReject(float f, float f2, float f3, float f4) {
        ir1 ir1Var = ir1.f48020a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return ir1Var.quickReject(canvas, f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    @c5e(29)
    public void drawTextRun(@yfb MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, @yfb Paint paint) {
        er1 er1Var = er1.f33876a;
        Canvas canvas = this.f30422a;
        if (canvas == null) {
            md8.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        er1Var.drawTextRun(canvas, measuredText, i, i2, i3, i4, f, f2, z, paint);
    }
}
