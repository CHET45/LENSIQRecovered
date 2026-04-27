package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class i8f {

    /* JADX INFO: renamed from: i */
    public static final int f46058i = 68;

    /* JADX INFO: renamed from: j */
    public static final int f46059j = 20;

    /* JADX INFO: renamed from: k */
    public static final int f46060k = 0;

    /* JADX INFO: renamed from: l */
    public static final int[] f46061l = new int[3];

    /* JADX INFO: renamed from: m */
    public static final float[] f46062m = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: n */
    public static final int[] f46063n = new int[4];

    /* JADX INFO: renamed from: o */
    public static final float[] f46064o = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    @efb
    public final Paint f46065a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Paint f46066b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Paint f46067c;

    /* JADX INFO: renamed from: d */
    public int f46068d;

    /* JADX INFO: renamed from: e */
    public int f46069e;

    /* JADX INFO: renamed from: f */
    public int f46070f;

    /* JADX INFO: renamed from: g */
    public final Path f46071g;

    /* JADX INFO: renamed from: h */
    public final Paint f46072h;

    public i8f() {
        this(-16777216);
    }

    public void drawCornerShadow(@efb Canvas canvas, @hib Matrix matrix, @efb RectF rectF, int i, float f, float f2) {
        boolean z = f2 < 0.0f;
        Path path = this.f46071g;
        if (z) {
            int[] iArr = f46063n;
            iArr[0] = 0;
            iArr[1] = this.f46070f;
            iArr[2] = this.f46069e;
            iArr[3] = this.f46068d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = f46063n;
            iArr2[0] = 0;
            iArr2[1] = this.f46068d;
            iArr2[2] = this.f46069e;
            iArr2[3] = this.f46070f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = f46064o;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.f46066b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f46063n, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f46072h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f46066b);
        canvas.restore();
    }

    public void drawEdgeShadow(@efb Canvas canvas, @hib Matrix matrix, @efb RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f46061l;
        iArr[0] = this.f46070f;
        iArr[1] = this.f46069e;
        iArr[2] = this.f46068d;
        Paint paint = this.f46067c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f46062m, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f46067c);
        canvas.restore();
    }

    public void drawInnerCornerShadow(@efb Canvas canvas, @hib Matrix matrix, @efb RectF rectF, int i, float f, float f2, @efb float[] fArr) {
        if (f2 > 0.0f) {
            f += f2;
            f2 = -f2;
        }
        drawCornerShadow(canvas, matrix, rectF, i, f, f2);
        Path path = this.f46071g;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f, f2);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.f46072h);
        canvas.drawPath(path, this.f46065a);
        canvas.restore();
    }

    @efb
    public Paint getShadowPaint() {
        return this.f46065a;
    }

    public void setShadowColor(int i) {
        this.f46068d = ua2.setAlphaComponent(i, 68);
        this.f46069e = ua2.setAlphaComponent(i, 20);
        this.f46070f = ua2.setAlphaComponent(i, 0);
        this.f46065a.setColor(this.f46068d);
    }

    public i8f(int i) {
        this.f46071g = new Path();
        Paint paint = new Paint();
        this.f46072h = paint;
        this.f46065a = new Paint();
        setShadowColor(i);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f46066b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f46067c = new Paint(paint2);
    }
}
