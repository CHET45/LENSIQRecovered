package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.C0392R;

/* JADX INFO: loaded from: classes.dex */
public class b20 {

    /* JADX INFO: renamed from: a */
    @efb
    public final CompoundButton f12435a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f12436b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f12437c = null;

    /* JADX INFO: renamed from: d */
    public boolean f12438d = false;

    /* JADX INFO: renamed from: e */
    public boolean f12439e = false;

    /* JADX INFO: renamed from: f */
    public boolean f12440f;

    public b20(@efb CompoundButton compoundButton) {
        this.f12435a = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    public void m2806a() {
        Drawable buttonDrawable = co2.getButtonDrawable(this.f12435a);
        if (buttonDrawable != null) {
            if (this.f12438d || this.f12439e) {
                Drawable drawableMutate = yp4.wrap(buttonDrawable).mutate();
                if (this.f12438d) {
                    yp4.setTintList(drawableMutate, this.f12436b);
                }
                if (this.f12439e) {
                    yp4.setTintMode(drawableMutate, this.f12437c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f12435a.getDrawableState());
                }
                this.f12435a.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m2807b(int i) {
        return i;
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m2808c() {
        return this.f12436b;
    }

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode m2809d() {
        return this.f12437c;
    }

    /* JADX INFO: renamed from: e */
    public void m2810e(@hib AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        t2h t2hVarObtainStyledAttributes = t2h.obtainStyledAttributes(this.f12435a.getContext(), attributeSet, C0392R.styleable.CompoundButton, i, 0);
        CompoundButton compoundButton = this.f12435a;
        o8i.saveAttributeDataForStyleable(compoundButton, compoundButton.getContext(), C0392R.styleable.CompoundButton, attributeSet, t2hVarObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.CompoundButton_buttonCompat) && (resourceId2 = t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f12435a;
                    compoundButton2.setButtonDrawable(u20.getDrawable(compoundButton2.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.CompoundButton_android_button)) {
                        CompoundButton compoundButton3 = this.f12435a;
                        compoundButton3.setButtonDrawable(u20.getDrawable(compoundButton3.getContext(), resourceId));
                    }
                }
            } else if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.CompoundButton_android_button) && (resourceId = t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.CompoundButton_android_button, 0)) != 0) {
                CompoundButton compoundButton32 = this.f12435a;
                compoundButton32.setButtonDrawable(u20.getDrawable(compoundButton32.getContext(), resourceId));
            }
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.CompoundButton_buttonTint)) {
                co2.setButtonTintList(this.f12435a, t2hVarObtainStyledAttributes.getColorStateList(C0392R.styleable.CompoundButton_buttonTint));
            }
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.CompoundButton_buttonTintMode)) {
                co2.setButtonTintMode(this.f12435a, qq4.parseTintMode(t2hVarObtainStyledAttributes.getInt(C0392R.styleable.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            t2hVarObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2811f() {
        if (this.f12440f) {
            this.f12440f = false;
        } else {
            this.f12440f = true;
            m2806a();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2812g(ColorStateList colorStateList) {
        this.f12436b = colorStateList;
        this.f12438d = true;
        m2806a();
    }

    /* JADX INFO: renamed from: h */
    public void m2813h(@hib PorterDuff.Mode mode) {
        this.f12437c = mode;
        this.f12439e = true;
        m2806a();
    }
}
