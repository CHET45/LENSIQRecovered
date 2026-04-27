package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes6.dex */
public class kih extends Drawable {

    /* JADX INFO: renamed from: a */
    public final int f54236a;

    /* JADX INFO: renamed from: b */
    public final int f54237b;

    public kih(int i, int i2) {
        this.f54236a = i;
        this.f54237b = i2;
    }

    private Path createPath() {
        Rect bounds = getBounds();
        Path path = new Path();
        int i = this.f54236a;
        if (i == 3) {
            path.moveTo(bounds.right / 2, bounds.bottom / 2);
            path.lineTo(bounds.right, 0.0f);
            path.lineTo(bounds.right, bounds.bottom);
        } else if (i == 5) {
            path.moveTo(bounds.right / 2, bounds.bottom / 2);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(0.0f, bounds.bottom);
        } else if (i == 48) {
            path.moveTo(bounds.right / 2, bounds.bottom / 2);
            path.lineTo(0.0f, bounds.bottom);
            path.lineTo(bounds.right, bounds.bottom);
        } else if (i == 80) {
            path.moveTo(bounds.right / 2, bounds.bottom / 2);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(bounds.right, 0.0f);
        }
        path.close();
        return path;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.f54237b);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(createPath(), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@hib ColorFilter colorFilter) {
    }
}
