package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.C0392R;

/* JADX INFO: loaded from: classes.dex */
public class y10 {

    /* JADX INFO: renamed from: a */
    @efb
    public final View f99996a;

    /* JADX INFO: renamed from: d */
    public r2h f99999d;

    /* JADX INFO: renamed from: e */
    public r2h f100000e;

    /* JADX INFO: renamed from: f */
    public r2h f100001f;

    /* JADX INFO: renamed from: c */
    public int f99998c = -1;

    /* JADX INFO: renamed from: b */
    public final m20 f99997b = m20.get();

    public y10(@efb View view) {
        this.f99996a = view;
    }

    private boolean applyFrameworkTintUsingColorFilter(@efb Drawable drawable) {
        if (this.f100001f == null) {
            this.f100001f = new r2h();
        }
        r2h r2hVar = this.f100001f;
        r2hVar.m20951a();
        ColorStateList backgroundTintList = o8i.getBackgroundTintList(this.f99996a);
        if (backgroundTintList != null) {
            r2hVar.f76913d = true;
            r2hVar.f76910a = backgroundTintList;
        }
        PorterDuff.Mode backgroundTintMode = o8i.getBackgroundTintMode(this.f99996a);
        if (backgroundTintMode != null) {
            r2hVar.f76912c = true;
            r2hVar.f76911b = backgroundTintMode;
        }
        if (!r2hVar.f76913d && !r2hVar.f76912c) {
            return false;
        }
        m20.m16551e(drawable, r2hVar, this.f99996a.getDrawableState());
        return true;
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
        return this.f99999d != null;
    }

    /* JADX INFO: renamed from: a */
    public void m25584a() {
        Drawable background = this.f99996a.getBackground();
        if (background != null) {
            if (shouldApplyFrameworkTintUsingColorFilter() && applyFrameworkTintUsingColorFilter(background)) {
                return;
            }
            r2h r2hVar = this.f100000e;
            if (r2hVar != null) {
                m20.m16551e(background, r2hVar, this.f99996a.getDrawableState());
                return;
            }
            r2h r2hVar2 = this.f99999d;
            if (r2hVar2 != null) {
                m20.m16551e(background, r2hVar2, this.f99996a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public ColorStateList m25585b() {
        r2h r2hVar = this.f100000e;
        if (r2hVar != null) {
            return r2hVar.f76910a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode m25586c() {
        r2h r2hVar = this.f100000e;
        if (r2hVar != null) {
            return r2hVar.f76911b;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m25587d(@hib AttributeSet attributeSet, int i) {
        t2h t2hVarObtainStyledAttributes = t2h.obtainStyledAttributes(this.f99996a.getContext(), attributeSet, C0392R.styleable.ViewBackgroundHelper, i, 0);
        View view = this.f99996a;
        o8i.saveAttributeDataForStyleable(view, view.getContext(), C0392R.styleable.ViewBackgroundHelper, attributeSet, t2hVarObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.ViewBackgroundHelper_android_background)) {
                this.f99998c = t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.ViewBackgroundHelper_android_background, -1);
                ColorStateList colorStateListM16553c = this.f99997b.m16553c(this.f99996a.getContext(), this.f99998c);
                if (colorStateListM16553c != null) {
                    m25590g(colorStateListM16553c);
                }
            }
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.ViewBackgroundHelper_backgroundTint)) {
                o8i.setBackgroundTintList(this.f99996a, t2hVarObtainStyledAttributes.getColorStateList(C0392R.styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.ViewBackgroundHelper_backgroundTintMode)) {
                o8i.setBackgroundTintMode(this.f99996a, qq4.parseTintMode(t2hVarObtainStyledAttributes.getInt(C0392R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            t2hVarObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            t2hVarObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m25588e(Drawable drawable) {
        this.f99998c = -1;
        m25590g(null);
        m25584a();
    }

    /* JADX INFO: renamed from: f */
    public void m25589f(int i) {
        this.f99998c = i;
        m20 m20Var = this.f99997b;
        m25590g(m20Var != null ? m20Var.m16553c(this.f99996a.getContext(), i) : null);
        m25584a();
    }

    /* JADX INFO: renamed from: g */
    public void m25590g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f99999d == null) {
                this.f99999d = new r2h();
            }
            r2h r2hVar = this.f99999d;
            r2hVar.f76910a = colorStateList;
            r2hVar.f76913d = true;
        } else {
            this.f99999d = null;
        }
        m25584a();
    }

    /* JADX INFO: renamed from: h */
    public void m25591h(ColorStateList colorStateList) {
        if (this.f100000e == null) {
            this.f100000e = new r2h();
        }
        r2h r2hVar = this.f100000e;
        r2hVar.f76910a = colorStateList;
        r2hVar.f76913d = true;
        m25584a();
    }

    /* JADX INFO: renamed from: i */
    public void m25592i(PorterDuff.Mode mode) {
        if (this.f100000e == null) {
            this.f100000e = new r2h();
        }
        r2h r2hVar = this.f100000e;
        r2hVar.f76911b = mode;
        r2hVar.f76912c = true;
        m25584a();
    }
}
