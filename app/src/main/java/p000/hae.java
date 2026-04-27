package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class hae extends Drawable implements i9f, p2h {

    /* JADX INFO: renamed from: a */
    public C6777b f43011a;

    /* JADX INFO: renamed from: hae$b */
    public static final class C6777b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        @efb
        public b3a f43012a;

        /* JADX INFO: renamed from: b */
        public boolean f43013b;

        public C6777b(b3a b3aVar) {
            this.f43012a = b3aVar;
            this.f43013b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @efb
        public hae newDrawable() {
            return new hae(new C6777b(this));
        }

        public C6777b(@efb C6777b c6777b) {
            this.f43012a = (b3a) c6777b.f43012a.getConstantState().newDrawable();
            this.f43013b = c6777b.f43013b;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C6777b c6777b = this.f43011a;
        if (c6777b.f43013b) {
            c6777b.f43012a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @hib
    public Drawable.ConstantState getConstantState() {
        return this.f43011a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f43011a.f43012a.getOpacity();
    }

    @Override // p000.i9f
    @efb
    public n8f getShapeAppearanceModel() {
        return this.f43011a.f43012a.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@efb Rect rect) {
        super.onBoundsChange(rect);
        this.f43011a.f43012a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@efb int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f43011a.f43012a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zShouldDrawRippleCompat = iae.shouldDrawRippleCompat(iArr);
        C6777b c6777b = this.f43011a;
        if (c6777b.f43013b == zShouldDrawRippleCompat) {
            return zOnStateChange;
        }
        c6777b.f43013b = zShouldDrawRippleCompat;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f43011a.f43012a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@hib ColorFilter colorFilter) {
        this.f43011a.f43012a.setColorFilter(colorFilter);
    }

    @Override // p000.i9f
    public void setShapeAppearanceModel(@efb n8f n8fVar) {
        this.f43011a.f43012a.setShapeAppearanceModel(n8fVar);
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTint(@g92 int i) {
        this.f43011a.f43012a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTintList(@hib ColorStateList colorStateList) {
        this.f43011a.f43012a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTintMode(@hib PorterDuff.Mode mode) {
        this.f43011a.f43012a.setTintMode(mode);
    }

    public hae(n8f n8fVar) {
        this(new C6777b(new b3a(n8fVar)));
    }

    @Override // android.graphics.drawable.Drawable
    @efb
    public hae mutate() {
        this.f43011a = new C6777b(this.f43011a);
        return this;
    }

    private hae(C6777b c6777b) {
        this.f43011a = c6777b;
    }
}
