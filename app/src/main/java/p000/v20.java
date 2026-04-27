package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.C0392R;

/* JADX INFO: loaded from: classes.dex */
public class v20 extends s20 {

    /* JADX INFO: renamed from: d */
    public final SeekBar f89710d;

    /* JADX INFO: renamed from: e */
    public Drawable f89711e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f89712f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f89713g;

    /* JADX INFO: renamed from: h */
    public boolean f89714h;

    /* JADX INFO: renamed from: i */
    public boolean f89715i;

    public v20(SeekBar seekBar) {
        super(seekBar);
        this.f89712f = null;
        this.f89713g = null;
        this.f89714h = false;
        this.f89715i = false;
        this.f89710d = seekBar;
    }

    private void applyTickMarkTint() {
        Drawable drawable = this.f89711e;
        if (drawable != null) {
            if (this.f89714h || this.f89715i) {
                Drawable drawableWrap = yp4.wrap(drawable.mutate());
                this.f89711e = drawableWrap;
                if (this.f89714h) {
                    yp4.setTintList(drawableWrap, this.f89712f);
                }
                if (this.f89715i) {
                    yp4.setTintMode(this.f89711e, this.f89713g);
                }
                if (this.f89711e.isStateful()) {
                    this.f89711e.setState(this.f89710d.getDrawableState());
                }
            }
        }
    }

    @Override // p000.s20
    /* JADX INFO: renamed from: b */
    public void mo21657b(AttributeSet attributeSet, int i) {
        super.mo21657b(attributeSet, i);
        t2h t2hVarObtainStyledAttributes = t2h.obtainStyledAttributes(this.f89710d.getContext(), attributeSet, C0392R.styleable.AppCompatSeekBar, i, 0);
        SeekBar seekBar = this.f89710d;
        o8i.saveAttributeDataForStyleable(seekBar, seekBar.getContext(), C0392R.styleable.AppCompatSeekBar, attributeSet, t2hVarObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        Drawable drawableIfKnown = t2hVarObtainStyledAttributes.getDrawableIfKnown(C0392R.styleable.AppCompatSeekBar_android_thumb);
        if (drawableIfKnown != null) {
            this.f89710d.setThumb(drawableIfKnown);
        }
        m23684j(t2hVarObtainStyledAttributes.getDrawable(C0392R.styleable.AppCompatSeekBar_tickMark));
        if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.f89713g = qq4.parseTintMode(t2hVarObtainStyledAttributes.getInt(C0392R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.f89713g);
            this.f89715i = true;
        }
        if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatSeekBar_tickMarkTint)) {
            this.f89712f = t2hVarObtainStyledAttributes.getColorStateList(C0392R.styleable.AppCompatSeekBar_tickMarkTint);
            this.f89714h = true;
        }
        t2hVarObtainStyledAttributes.recycle();
        applyTickMarkTint();
    }

    /* JADX INFO: renamed from: d */
    public void m23678d(Canvas canvas) {
        if (this.f89711e != null) {
            int max = this.f89710d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f89711e.getIntrinsicWidth();
                int intrinsicHeight = this.f89711e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f89711e.setBounds(-i, -i2, i, i2);
                float width = ((this.f89710d.getWidth() - this.f89710d.getPaddingLeft()) - this.f89710d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f89710d.getPaddingLeft(), this.f89710d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f89711e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m23679e() {
        Drawable drawable = this.f89711e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f89710d.getDrawableState())) {
            this.f89710d.invalidateDrawable(drawable);
        }
    }

    @hib
    /* JADX INFO: renamed from: f */
    public Drawable m23680f() {
        return this.f89711e;
    }

    @hib
    /* JADX INFO: renamed from: g */
    public ColorStateList m23681g() {
        return this.f89712f;
    }

    @hib
    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode m23682h() {
        return this.f89713g;
    }

    /* JADX INFO: renamed from: i */
    public void m23683i() {
        Drawable drawable = this.f89711e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m23684j(@hib Drawable drawable) {
        Drawable drawable2 = this.f89711e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f89711e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f89710d);
            yp4.setLayoutDirection(drawable, o8i.getLayoutDirection(this.f89710d));
            if (drawable.isStateful()) {
                drawable.setState(this.f89710d.getDrawableState());
            }
            applyTickMarkTint();
        }
        this.f89710d.invalidate();
    }

    /* JADX INFO: renamed from: k */
    public void m23685k(@hib ColorStateList colorStateList) {
        this.f89712f = colorStateList;
        this.f89714h = true;
        applyTickMarkTint();
    }

    /* JADX INFO: renamed from: l */
    public void m23686l(@hib PorterDuff.Mode mode) {
        this.f89713g = mode;
        this.f89715i = true;
        applyTickMarkTint();
    }
}
