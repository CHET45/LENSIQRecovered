package p000;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kcc extends Drawable {

    /* JADX INFO: renamed from: a */
    public Paint f53606a;

    public kcc() {
        Paint paint = new Paint();
        this.f53606a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f53606a.setAntiAlias(true);
        this.f53606a.setColor(-5592406);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f53606a.setAlpha(alpha);
    }

    public void setColor(int color) {
        this.f53606a.setColor(color);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
        this.f53606a.setColorFilter(cf);
    }
}
