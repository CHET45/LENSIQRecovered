package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.appcompat.C0392R;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class a20 {

    /* JADX INFO: renamed from: a */
    @efb
    public final CheckedTextView f155a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f156b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f157c = null;

    /* JADX INFO: renamed from: d */
    public boolean f158d = false;

    /* JADX INFO: renamed from: e */
    public boolean f159e = false;

    /* JADX INFO: renamed from: f */
    public boolean f160f;

    public a20(@efb CheckedTextView checkedTextView) {
        this.f155a = checkedTextView;
    }

    /* JADX INFO: renamed from: a */
    public void m26a() {
        Drawable checkMarkDrawable = iy1.getCheckMarkDrawable(this.f155a);
        if (checkMarkDrawable != null) {
            if (this.f158d || this.f159e) {
                Drawable drawableMutate = yp4.wrap(checkMarkDrawable).mutate();
                if (this.f158d) {
                    yp4.setTintList(drawableMutate, this.f156b);
                }
                if (this.f159e) {
                    yp4.setTintMode(drawableMutate, this.f157c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f155a.getDrawableState());
                }
                this.f155a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public ColorStateList m27b() {
        return this.f156b;
    }

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode m28c() {
        return this.f157c;
    }

    /* JADX INFO: renamed from: d */
    public void m29d(@hib AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        t2h t2hVarObtainStyledAttributes = t2h.obtainStyledAttributes(this.f155a.getContext(), attributeSet, C0392R.styleable.CheckedTextView, i, 0);
        CheckedTextView checkedTextView = this.f155a;
        o8i.saveAttributeDataForStyleable(checkedTextView, checkedTextView.getContext(), C0392R.styleable.CheckedTextView, attributeSet, t2hVarObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.CheckedTextView_checkMarkCompat) && (resourceId2 = t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f155a;
                    checkedTextView2.setCheckMarkDrawable(u20.getDrawable(checkedTextView2.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.CheckedTextView_android_checkMark)) {
                        CheckedTextView checkedTextView3 = this.f155a;
                        checkedTextView3.setCheckMarkDrawable(u20.getDrawable(checkedTextView3.getContext(), resourceId));
                    }
                }
            } else if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.CheckedTextView_android_checkMark) && (resourceId = t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.CheckedTextView_android_checkMark, 0)) != 0) {
                CheckedTextView checkedTextView32 = this.f155a;
                checkedTextView32.setCheckMarkDrawable(u20.getDrawable(checkedTextView32.getContext(), resourceId));
            }
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.CheckedTextView_checkMarkTint)) {
                iy1.setCheckMarkTintList(this.f155a, t2hVarObtainStyledAttributes.getColorStateList(C0392R.styleable.CheckedTextView_checkMarkTint));
            }
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.CheckedTextView_checkMarkTintMode)) {
                iy1.setCheckMarkTintMode(this.f155a, qq4.parseTintMode(t2hVarObtainStyledAttributes.getInt(C0392R.styleable.CheckedTextView_checkMarkTintMode, -1), null));
            }
        } finally {
            t2hVarObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m30e() {
        if (this.f160f) {
            this.f160f = false;
        } else {
            this.f160f = true;
            m26a();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m31f(ColorStateList colorStateList) {
        this.f156b = colorStateList;
        this.f158d = true;
        m26a();
    }

    /* JADX INFO: renamed from: g */
    public void m32g(@hib PorterDuff.Mode mode) {
        this.f157c = mode;
        this.f159e = true;
        m26a();
    }
}
