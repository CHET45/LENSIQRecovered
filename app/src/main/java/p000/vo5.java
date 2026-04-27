package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class vo5 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Drawable f91831a;

    /* JADX INFO: renamed from: b */
    public final Drawable f91832b;

    /* JADX INFO: renamed from: c */
    public final float[] f91833c;

    /* JADX INFO: renamed from: d */
    public float f91834d;

    public vo5(@efb Drawable drawable, @efb Drawable drawable2) {
        this.f91831a = drawable.getConstantState().newDrawable().mutate();
        Drawable drawableMutate = drawable2.getConstantState().newDrawable().mutate();
        this.f91832b = drawableMutate;
        drawableMutate.setAlpha(0);
        this.f91833c = new float[2];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        this.f91831a.draw(canvas);
        this.f91832b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f91831a.getIntrinsicHeight(), this.f91832b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f91831a.getIntrinsicWidth(), this.f91832b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f91831a.getMinimumHeight(), this.f91832b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f91831a.getMinimumWidth(), this.f91832b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f91831a.isStateful() || this.f91832b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f91834d <= 0.5f) {
            this.f91831a.setAlpha(i);
            this.f91832b.setAlpha(0);
        } else {
            this.f91831a.setAlpha(0);
            this.f91832b.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f91831a.setBounds(i, i2, i3, i4);
        this.f91832b.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@hib ColorFilter colorFilter) {
        this.f91831a.setColorFilter(colorFilter);
        this.f91832b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        if (this.f91834d != f) {
            this.f91834d = f;
            zo5.m26915a(f, this.f91833c);
            this.f91831a.setAlpha((int) (this.f91833c[0] * 255.0f));
            this.f91832b.setAlpha((int) (this.f91833c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f91831a.setState(iArr) || this.f91832b.setState(iArr);
    }
}
