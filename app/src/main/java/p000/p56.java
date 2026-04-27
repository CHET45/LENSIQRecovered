package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import com.google.android.material.C3146R;
import com.google.android.material.floatingactionbutton.C3313a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public class p56 extends C3313a {

    /* JADX INFO: renamed from: c0 */
    @hib
    public StateListAnimator f69724c0;

    /* JADX INFO: renamed from: p56$a */
    public static class C10799a extends b3a {
        public C10799a(n8f n8fVar) {
            super(n8fVar);
        }

        @Override // p000.b3a, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public p56(FloatingActionButton floatingActionButton, l8f l8fVar) {
        super(floatingActionButton, l8fVar);
    }

    @efb
    private StateListAnimator createDefaultStateListAnimator(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(C3313a.f21808W, createElevationAnimator(f, f3));
        stateListAnimator.addState(C3313a.f21809X, createElevationAnimator(f, f2));
        stateListAnimator.addState(C3313a.f21810Y, createElevationAnimator(f, f2));
        stateListAnimator.addState(C3313a.f21811Z, createElevationAnimator(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f21839w, "elevation", f).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.f21839w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C3313a.f21789D);
        stateListAnimator.addState(C3313a.f21812a0, animatorSet);
        stateListAnimator.addState(C3313a.f21813b0, createElevationAnimator(0.0f, 0.0f));
        return stateListAnimator;
    }

    @efb
    private Animator createElevationAnimator(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f21839w, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f21839w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C3313a.f21789D);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.C3313a
    /* JADX INFO: renamed from: F */
    public boolean mo6221F() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.C3313a
    /* JADX INFO: renamed from: Q */
    public void mo6232Q(@hib ColorStateList colorStateList) {
        Drawable drawable = this.f21819c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(iae.sanitizeRippleDrawableColor(colorStateList));
        } else {
            super.mo6232Q(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C3313a
    /* JADX INFO: renamed from: U */
    public boolean mo6236U() {
        return this.f21840x.isCompatPaddingEnabled() || !m6237V();
    }

    @Override // com.google.android.material.floatingactionbutton.C3313a
    /* JADX INFO: renamed from: X */
    public void mo6239X() {
    }

    @efb
    /* JADX INFO: renamed from: b0 */
    public jb1 m19273b0(int i, ColorStateList colorStateList) {
        Context context = this.f21839w.getContext();
        jb1 jb1Var = new jb1((n8f) z7d.checkNotNull(this.f21817a));
        jb1Var.m13929c(lx2.getColor(context, C3146R.color.design_fab_stroke_top_outer_color), lx2.getColor(context, C3146R.color.design_fab_stroke_top_inner_color), lx2.getColor(context, C3146R.color.design_fab_stroke_end_inner_color), lx2.getColor(context, C3146R.color.design_fab_stroke_end_outer_color));
        jb1Var.setBorderWidth(i);
        jb1Var.m13928b(colorStateList);
        return jb1Var;
    }

    @Override // com.google.android.material.floatingactionbutton.C3313a
    @efb
    /* JADX INFO: renamed from: g */
    public b3a mo6245g() {
        return new C10799a((n8f) z7d.checkNotNull(this.f21817a));
    }

    @Override // com.google.android.material.floatingactionbutton.C3313a
    public float getElevation() {
        return this.f21839w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.C3313a
    /* JADX INFO: renamed from: l */
    public void mo6250l(@efb Rect rect) {
        if (this.f21840x.isCompatPaddingEnabled()) {
            super.mo6250l(rect);
        } else if (m6237V()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f21827k - this.f21839w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C3313a
    /* JADX INFO: renamed from: q */
    public void mo6255q(ColorStateList colorStateList, @hib PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        b3a b3aVarMo6245g = mo6245g();
        this.f21818b = b3aVarMo6245g;
        b3aVarMo6245g.setTintList(colorStateList);
        if (mode != null) {
            this.f21818b.setTintMode(mode);
        }
        this.f21818b.initializeElevationOverlay(this.f21839w.getContext());
        if (i > 0) {
            this.f21820d = m19273b0(i, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) z7d.checkNotNull(this.f21820d), (Drawable) z7d.checkNotNull(this.f21818b)});
        } else {
            this.f21820d = null;
            layerDrawable = this.f21818b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(iae.sanitizeRippleDrawableColor(colorStateList2), layerDrawable, null);
        this.f21819c = rippleDrawable;
        this.f21821e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.C3313a
    /* JADX INFO: renamed from: t */
    public void mo6258t() {
    }

    @Override // com.google.android.material.floatingactionbutton.C3313a
    /* JADX INFO: renamed from: v */
    public void mo6260v() {
        m6241Z();
    }

    @Override // com.google.android.material.floatingactionbutton.C3313a
    /* JADX INFO: renamed from: x */
    public void mo6262x(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.C3313a
    /* JADX INFO: renamed from: y */
    public void mo6263y(float f, float f2, float f3) {
        if (this.f21839w.getStateListAnimator() == this.f69724c0) {
            StateListAnimator stateListAnimatorCreateDefaultStateListAnimator = createDefaultStateListAnimator(f, f2, f3);
            this.f69724c0 = stateListAnimatorCreateDefaultStateListAnimator;
            this.f21839w.setStateListAnimator(stateListAnimatorCreateDefaultStateListAnimator);
        }
        if (mo6236U()) {
            m6241Z();
        }
    }
}
