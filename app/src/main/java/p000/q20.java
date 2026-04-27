package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.C0392R;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class q20 {

    /* JADX INFO: renamed from: a */
    @efb
    public final ImageView f72994a;

    /* JADX INFO: renamed from: b */
    public r2h f72995b;

    /* JADX INFO: renamed from: c */
    public r2h f72996c;

    /* JADX INFO: renamed from: d */
    public r2h f72997d;

    /* JADX INFO: renamed from: e */
    public int f72998e = 0;

    public q20(@efb ImageView imageView) {
        this.f72994a = imageView;
    }

    private boolean applyFrameworkTintUsingColorFilter(@efb Drawable drawable) {
        if (this.f72997d == null) {
            this.f72997d = new r2h();
        }
        r2h r2hVar = this.f72997d;
        r2hVar.m20951a();
        ColorStateList imageTintList = hw7.getImageTintList(this.f72994a);
        if (imageTintList != null) {
            r2hVar.f76913d = true;
            r2hVar.f76910a = imageTintList;
        }
        PorterDuff.Mode imageTintMode = hw7.getImageTintMode(this.f72994a);
        if (imageTintMode != null) {
            r2hVar.f76912c = true;
            r2hVar.f76911b = imageTintMode;
        }
        if (!r2hVar.f76913d && !r2hVar.f76912c) {
            return false;
        }
        m20.m16551e(drawable, r2hVar, this.f72994a.getDrawableState());
        return true;
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
        return this.f72995b != null;
    }

    /* JADX INFO: renamed from: a */
    public void m19989a() {
        if (this.f72994a.getDrawable() != null) {
            this.f72994a.getDrawable().setLevel(this.f72998e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m19990b() {
        Drawable drawable = this.f72994a.getDrawable();
        if (drawable != null) {
            qq4.m20499a(drawable);
        }
        if (drawable != null) {
            if (shouldApplyFrameworkTintUsingColorFilter() && applyFrameworkTintUsingColorFilter(drawable)) {
                return;
            }
            r2h r2hVar = this.f72996c;
            if (r2hVar != null) {
                m20.m16551e(drawable, r2hVar, this.f72994a.getDrawableState());
                return;
            }
            r2h r2hVar2 = this.f72995b;
            if (r2hVar2 != null) {
                m20.m16551e(drawable, r2hVar2, this.f72994a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m19991c() {
        r2h r2hVar = this.f72996c;
        if (r2hVar != null) {
            return r2hVar.f76910a;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode m19992d() {
        r2h r2hVar = this.f72996c;
        if (r2hVar != null) {
            return r2hVar.f76911b;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m19993e() {
        return !(this.f72994a.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: f */
    public void m19994f(@efb Drawable drawable) {
        this.f72998e = drawable.getLevel();
    }

    /* JADX INFO: renamed from: g */
    public void m19995g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f72995b == null) {
                this.f72995b = new r2h();
            }
            r2h r2hVar = this.f72995b;
            r2hVar.f76910a = colorStateList;
            r2hVar.f76913d = true;
        } else {
            this.f72995b = null;
        }
        m19990b();
    }

    /* JADX INFO: renamed from: h */
    public void m19996h(ColorStateList colorStateList) {
        if (this.f72996c == null) {
            this.f72996c = new r2h();
        }
        r2h r2hVar = this.f72996c;
        r2hVar.f76910a = colorStateList;
        r2hVar.f76913d = true;
        m19990b();
    }

    /* JADX INFO: renamed from: i */
    public void m19997i(PorterDuff.Mode mode) {
        if (this.f72996c == null) {
            this.f72996c = new r2h();
        }
        r2h r2hVar = this.f72996c;
        r2hVar.f76911b = mode;
        r2hVar.f76912c = true;
        m19990b();
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        int resourceId;
        t2h t2hVarObtainStyledAttributes = t2h.obtainStyledAttributes(this.f72994a.getContext(), attributeSet, C0392R.styleable.AppCompatImageView, i, 0);
        ImageView imageView = this.f72994a;
        o8i.saveAttributeDataForStyleable(imageView, imageView.getContext(), C0392R.styleable.AppCompatImageView, attributeSet, t2hVarObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            Drawable drawable = this.f72994a.getDrawable();
            if (drawable == null && (resourceId = t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = u20.getDrawable(this.f72994a.getContext(), resourceId)) != null) {
                this.f72994a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                qq4.m20499a(drawable);
            }
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatImageView_tint)) {
                hw7.setImageTintList(this.f72994a, t2hVarObtainStyledAttributes.getColorStateList(C0392R.styleable.AppCompatImageView_tint));
            }
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatImageView_tintMode)) {
                hw7.setImageTintMode(this.f72994a, qq4.parseTintMode(t2hVarObtainStyledAttributes.getInt(C0392R.styleable.AppCompatImageView_tintMode, -1), null));
            }
            t2hVarObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            t2hVarObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setImageResource(int i) {
        if (i != 0) {
            Drawable drawable = u20.getDrawable(this.f72994a.getContext(), i);
            if (drawable != null) {
                qq4.m20499a(drawable);
            }
            this.f72994a.setImageDrawable(drawable);
        } else {
            this.f72994a.setImageDrawable(null);
        }
        m19990b();
    }
}
