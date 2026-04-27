package p000;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes4.dex */
public class g80 extends kcc {

    /* JADX INFO: renamed from: b */
    public int f38980b = 0;

    /* JADX INFO: renamed from: c */
    public int f38981c = 0;

    /* JADX INFO: renamed from: d */
    public final Path f38982d = new Path();

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (this.f38980b != iWidth || this.f38981c != iHeight) {
            this.f38982d.reset();
            float f = (iWidth * 30) / 225;
            float f2 = f * 0.70710677f;
            float f3 = f / 0.70710677f;
            float f4 = iWidth;
            float f5 = f4 / 2.0f;
            float f6 = iHeight;
            this.f38982d.moveTo(f5, f6);
            float f7 = f6 / 2.0f;
            this.f38982d.lineTo(0.0f, f7);
            float f8 = f7 - f2;
            this.f38982d.lineTo(f2, f8);
            float f9 = f / 2.0f;
            float f10 = f5 - f9;
            float f11 = (f6 - f3) - f9;
            this.f38982d.lineTo(f10, f11);
            this.f38982d.lineTo(f10, 0.0f);
            float f12 = f5 + f9;
            this.f38982d.lineTo(f12, 0.0f);
            this.f38982d.lineTo(f12, f11);
            this.f38982d.lineTo(f4 - f2, f8);
            this.f38982d.lineTo(f4, f7);
            this.f38982d.close();
            this.f38980b = iWidth;
            this.f38981c = iHeight;
        }
        canvas.drawPath(this.f38982d, this.f53606a);
    }
}
