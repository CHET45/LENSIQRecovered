package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.C3146R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class z08 {

    /* JADX INFO: renamed from: C */
    public static final int f103590C = 217;

    /* JADX INFO: renamed from: D */
    public static final int f103591D = 167;

    /* JADX INFO: renamed from: E */
    public static final int f103592E = 0;

    /* JADX INFO: renamed from: F */
    public static final int f103593F = 1;

    /* JADX INFO: renamed from: G */
    public static final int f103594G = 2;

    /* JADX INFO: renamed from: H */
    public static final int f103595H = 0;

    /* JADX INFO: renamed from: I */
    public static final int f103596I = 1;

    /* JADX INFO: renamed from: J */
    public static final int f103597J = 2;

    /* JADX INFO: renamed from: A */
    @hib
    public ColorStateList f103598A;

    /* JADX INFO: renamed from: B */
    public Typeface f103599B;

    /* JADX INFO: renamed from: a */
    public final int f103600a;

    /* JADX INFO: renamed from: b */
    public final int f103601b;

    /* JADX INFO: renamed from: c */
    public final int f103602c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TimeInterpolator f103603d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TimeInterpolator f103604e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TimeInterpolator f103605f;

    /* JADX INFO: renamed from: g */
    public final Context f103606g;

    /* JADX INFO: renamed from: h */
    @efb
    public final TextInputLayout f103607h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f103608i;

    /* JADX INFO: renamed from: j */
    public int f103609j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f103610k;

    /* JADX INFO: renamed from: l */
    @hib
    public Animator f103611l;

    /* JADX INFO: renamed from: m */
    public final float f103612m;

    /* JADX INFO: renamed from: n */
    public int f103613n;

    /* JADX INFO: renamed from: o */
    public int f103614o;

    /* JADX INFO: renamed from: p */
    @hib
    public CharSequence f103615p;

    /* JADX INFO: renamed from: q */
    public boolean f103616q;

    /* JADX INFO: renamed from: r */
    @hib
    public TextView f103617r;

    /* JADX INFO: renamed from: s */
    @hib
    public CharSequence f103618s;

    /* JADX INFO: renamed from: t */
    public int f103619t;

    /* JADX INFO: renamed from: u */
    public int f103620u;

    /* JADX INFO: renamed from: v */
    @hib
    public ColorStateList f103621v;

    /* JADX INFO: renamed from: w */
    public CharSequence f103622w;

    /* JADX INFO: renamed from: x */
    public boolean f103623x;

    /* JADX INFO: renamed from: y */
    @hib
    public TextView f103624y;

    /* JADX INFO: renamed from: z */
    public int f103625z;

    /* JADX INFO: renamed from: z08$a */
    public class C15908a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f103626a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f103627b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f103628c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TextView f103629d;

        public C15908a(int i, TextView textView, int i2, TextView textView2) {
            this.f103626a = i;
            this.f103627b = textView;
            this.f103628c = i2;
            this.f103629d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z08.this.f103613n = this.f103626a;
            z08.this.f103611l = null;
            TextView textView = this.f103627b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f103628c == 1 && z08.this.f103617r != null) {
                    z08.this.f103617r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f103629d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f103629d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f103629d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f103629d.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: z08$b */
    public class C15909b extends View.AccessibilityDelegate {
        public C15909b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = z08.this.f103607h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public z08(@efb TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f103606g = context;
        this.f103607h = textInputLayout;
        this.f103612m = context.getResources().getDimensionPixelSize(C3146R.dimen.design_textinput_caption_translate_y);
        this.f103600a = c0b.resolveThemeDuration(context, C3146R.attr.motionDurationShort4, 217);
        this.f103601b = c0b.resolveThemeDuration(context, C3146R.attr.motionDurationMedium4, 167);
        this.f103602c = c0b.resolveThemeDuration(context, C3146R.attr.motionDurationShort4, 167);
        this.f103603d = c0b.resolveThemeInterpolator(context, C3146R.attr.motionEasingEmphasizedDecelerateInterpolator, C13280ty.f86292d);
        int i = C3146R.attr.motionEasingEmphasizedDecelerateInterpolator;
        TimeInterpolator timeInterpolator = C13280ty.f86289a;
        this.f103604e = c0b.resolveThemeInterpolator(context, i, timeInterpolator);
        this.f103605f = c0b.resolveThemeInterpolator(context, C3146R.attr.motionEasingLinearInterpolator, timeInterpolator);
    }

    private boolean canAdjustIndicatorPadding() {
        return (this.f103608i == null || this.f103607h.getEditText() == null) ? false : true;
    }

    private void createCaptionAnimators(@efb List<Animator> list, boolean z, @hib TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator objectAnimatorCreateCaptionOpacityAnimator = createCaptionOpacityAnimator(textView, i3 == i);
            if (i == i3 && i2 != 0) {
                objectAnimatorCreateCaptionOpacityAnimator.setStartDelay(this.f103602c);
            }
            list.add(objectAnimatorCreateCaptionOpacityAnimator);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorCreateCaptionTranslationYAnimator = createCaptionTranslationYAnimator(textView);
            objectAnimatorCreateCaptionTranslationYAnimator.setStartDelay(this.f103602c);
            list.add(objectAnimatorCreateCaptionTranslationYAnimator);
        }
    }

    private ObjectAnimator createCaptionOpacityAnimator(TextView textView, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z ? this.f103601b : this.f103602c);
        objectAnimatorOfFloat.setInterpolator(z ? this.f103604e : this.f103605f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator createCaptionTranslationYAnimator(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f103612m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f103600a);
        objectAnimatorOfFloat.setInterpolator(this.f103603d);
        return objectAnimatorOfFloat;
    }

    @hib
    private TextView getCaptionViewFromDisplayState(int i) {
        if (i == 1) {
            return this.f103617r;
        }
        if (i != 2) {
            return null;
        }
        return this.f103624y;
    }

    private int getIndicatorPadding(boolean z, @xc4 int i, int i2) {
        return z ? this.f103606g.getResources().getDimensionPixelSize(i) : i2;
    }

    private boolean isCaptionStateError(int i) {
        return (i != 1 || this.f103617r == null || TextUtils.isEmpty(this.f103615p)) ? false : true;
    }

    private boolean isCaptionStateHelperText(int i) {
        return (i != 2 || this.f103624y == null || TextUtils.isEmpty(this.f103622w)) ? false : true;
    }

    private void setCaptionViewVisibilities(int i, int i2) {
        TextView captionViewFromDisplayState;
        TextView captionViewFromDisplayState2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (captionViewFromDisplayState2 = getCaptionViewFromDisplayState(i2)) != null) {
            captionViewFromDisplayState2.setVisibility(0);
            captionViewFromDisplayState2.setAlpha(1.0f);
        }
        if (i != 0 && (captionViewFromDisplayState = getCaptionViewFromDisplayState(i)) != null) {
            captionViewFromDisplayState.setVisibility(4);
            if (i == 1) {
                captionViewFromDisplayState.setText((CharSequence) null);
            }
        }
        this.f103613n = i2;
    }

    private void setTextViewTypeface(@hib TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void setViewGroupGoneIfEmpty(@efb ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean shouldAnimateCaptionView(@hib TextView textView, @efb CharSequence charSequence) {
        return o8i.isLaidOut(this.f103607h) && this.f103607h.isEnabled() && !(this.f103614o == this.f103613n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void updateCaptionViewsVisibility(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f103611l = animatorSet;
            ArrayList arrayList = new ArrayList();
            createCaptionAnimators(arrayList, this.f103623x, this.f103624y, 2, i, i2);
            createCaptionAnimators(arrayList, this.f103616q, this.f103617r, 1, i, i2);
            C6661gz.playTogether(animatorSet, arrayList);
            animatorSet.addListener(new C15908a(i2, getCaptionViewFromDisplayState(i), i, getCaptionViewFromDisplayState(i2)));
            animatorSet.start();
        } else {
            setCaptionViewVisibilities(i, i2);
        }
        this.f103607h.m6509p();
        this.f103607h.m6511r(z);
        this.f103607h.m6512s();
    }

    /* JADX INFO: renamed from: A */
    public void m26436A(int i) {
        this.f103619t = i;
        TextView textView = this.f103617r;
        if (textView != null) {
            o8i.setAccessibilityLiveRegion(textView, i);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m26437B(@hib CharSequence charSequence) {
        this.f103618s = charSequence;
        TextView textView = this.f103617r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m26438C(boolean z) {
        if (this.f103616q == z) {
            return;
        }
        m26449g();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f103606g);
            this.f103617r = appCompatTextView;
            appCompatTextView.setId(C3146R.id.textinput_error);
            this.f103617r.setTextAlignment(5);
            Typeface typeface = this.f103599B;
            if (typeface != null) {
                this.f103617r.setTypeface(typeface);
            }
            m26439D(this.f103620u);
            m26440E(this.f103621v);
            m26437B(this.f103618s);
            m26436A(this.f103619t);
            this.f103617r.setVisibility(4);
            m26447e(this.f103617r, 0);
        } else {
            m26463u();
            m26468z(this.f103617r, 0);
            this.f103617r = null;
            this.f103607h.m6509p();
            this.f103607h.m6512s();
        }
        this.f103616q = z;
    }

    /* JADX INFO: renamed from: D */
    public void m26439D(@dbg int i) {
        this.f103620u = i;
        TextView textView = this.f103617r;
        if (textView != null) {
            this.f103607h.m6505l(textView, i);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m26440E(@hib ColorStateList colorStateList) {
        this.f103621v = colorStateList;
        TextView textView = this.f103617r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: F */
    public void m26441F(@dbg int i) {
        this.f103625z = i;
        TextView textView = this.f103624y;
        if (textView != null) {
            pwg.setTextAppearance(textView, i);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m26442G(boolean z) {
        if (this.f103623x == z) {
            return;
        }
        m26449g();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f103606g);
            this.f103624y = appCompatTextView;
            appCompatTextView.setId(C3146R.id.textinput_helper_text);
            this.f103624y.setTextAlignment(5);
            Typeface typeface = this.f103599B;
            if (typeface != null) {
                this.f103624y.setTypeface(typeface);
            }
            this.f103624y.setVisibility(4);
            o8i.setAccessibilityLiveRegion(this.f103624y, 1);
            m26441F(this.f103625z);
            m26443H(this.f103598A);
            m26447e(this.f103624y, 1);
            this.f103624y.setAccessibilityDelegate(new C15909b());
        } else {
            m26464v();
            m26468z(this.f103624y, 1);
            this.f103624y = null;
            this.f103607h.m6509p();
            this.f103607h.m6512s();
        }
        this.f103623x = z;
    }

    /* JADX INFO: renamed from: H */
    public void m26443H(@hib ColorStateList colorStateList) {
        this.f103598A = colorStateList;
        TextView textView = this.f103624y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: I */
    public void m26444I(Typeface typeface) {
        if (typeface != this.f103599B) {
            this.f103599B = typeface;
            setTextViewTypeface(this.f103617r, typeface);
            setTextViewTypeface(this.f103624y, typeface);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m26445J(CharSequence charSequence) {
        m26449g();
        this.f103615p = charSequence;
        this.f103617r.setText(charSequence);
        int i = this.f103613n;
        if (i != 1) {
            this.f103614o = 1;
        }
        updateCaptionViewsVisibility(i, this.f103614o, shouldAnimateCaptionView(this.f103617r, charSequence));
    }

    /* JADX INFO: renamed from: K */
    public void m26446K(CharSequence charSequence) {
        m26449g();
        this.f103622w = charSequence;
        this.f103624y.setText(charSequence);
        int i = this.f103613n;
        if (i != 2) {
            this.f103614o = 2;
        }
        updateCaptionViewsVisibility(i, this.f103614o, shouldAnimateCaptionView(this.f103624y, charSequence));
    }

    /* JADX INFO: renamed from: e */
    public void m26447e(TextView textView, int i) {
        if (this.f103608i == null && this.f103610k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f103606g);
            this.f103608i = linearLayout;
            linearLayout.setOrientation(0);
            this.f103607h.addView(this.f103608i, -1, -2);
            this.f103610k = new FrameLayout(this.f103606g);
            this.f103608i.addView(this.f103610k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f103607h.getEditText() != null) {
                m26448f();
            }
        }
        if (m26465w(i)) {
            this.f103610k.setVisibility(0);
            this.f103610k.addView(textView);
        } else {
            this.f103608i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f103608i.setVisibility(0);
        this.f103609j++;
    }

    /* JADX INFO: renamed from: f */
    public void m26448f() {
        if (canAdjustIndicatorPadding()) {
            EditText editText = this.f103607h.getEditText();
            boolean zIsFontScaleAtLeast1_3 = a3a.isFontScaleAtLeast1_3(this.f103606g);
            o8i.setPaddingRelative(this.f103608i, getIndicatorPadding(zIsFontScaleAtLeast1_3, C3146R.dimen.material_helper_text_font_1_3_padding_horizontal, o8i.getPaddingStart(editText)), getIndicatorPadding(zIsFontScaleAtLeast1_3, C3146R.dimen.material_helper_text_font_1_3_padding_top, this.f103606g.getResources().getDimensionPixelSize(C3146R.dimen.material_helper_text_default_padding_top)), getIndicatorPadding(zIsFontScaleAtLeast1_3, C3146R.dimen.material_helper_text_font_1_3_padding_horizontal, o8i.getPaddingEnd(editText)), 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m26449g() {
        Animator animator = this.f103611l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m26450h() {
        return isCaptionStateError(this.f103613n);
    }

    /* JADX INFO: renamed from: i */
    public boolean m26451i() {
        return isCaptionStateError(this.f103614o);
    }

    /* JADX INFO: renamed from: j */
    public int m26452j() {
        return this.f103619t;
    }

    @hib
    /* JADX INFO: renamed from: k */
    public CharSequence m26453k() {
        return this.f103618s;
    }

    @hib
    /* JADX INFO: renamed from: l */
    public CharSequence m26454l() {
        return this.f103615p;
    }

    @g92
    /* JADX INFO: renamed from: m */
    public int m26455m() {
        TextView textView = this.f103617r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @hib
    /* JADX INFO: renamed from: n */
    public ColorStateList m26456n() {
        TextView textView = this.f103617r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public CharSequence m26457o() {
        return this.f103622w;
    }

    @hib
    /* JADX INFO: renamed from: p */
    public View m26458p() {
        return this.f103624y;
    }

    @hib
    /* JADX INFO: renamed from: q */
    public ColorStateList m26459q() {
        TextView textView = this.f103624y;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @g92
    /* JADX INFO: renamed from: r */
    public int m26460r() {
        TextView textView = this.f103624y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public boolean m26461s() {
        return isCaptionStateHelperText(this.f103613n);
    }

    /* JADX INFO: renamed from: t */
    public boolean m26462t() {
        return isCaptionStateHelperText(this.f103614o);
    }

    /* JADX INFO: renamed from: u */
    public void m26463u() {
        this.f103615p = null;
        m26449g();
        if (this.f103613n == 1) {
            if (!this.f103623x || TextUtils.isEmpty(this.f103622w)) {
                this.f103614o = 0;
            } else {
                this.f103614o = 2;
            }
        }
        updateCaptionViewsVisibility(this.f103613n, this.f103614o, shouldAnimateCaptionView(this.f103617r, ""));
    }

    /* JADX INFO: renamed from: v */
    public void m26464v() {
        m26449g();
        int i = this.f103613n;
        if (i == 2) {
            this.f103614o = 0;
        }
        updateCaptionViewsVisibility(i, this.f103614o, shouldAnimateCaptionView(this.f103624y, ""));
    }

    /* JADX INFO: renamed from: w */
    public boolean m26465w(int i) {
        return i == 0 || i == 1;
    }

    /* JADX INFO: renamed from: x */
    public boolean m26466x() {
        return this.f103616q;
    }

    /* JADX INFO: renamed from: y */
    public boolean m26467y() {
        return this.f103623x;
    }

    /* JADX INFO: renamed from: z */
    public void m26468z(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f103608i == null) {
            return;
        }
        if (!m26465w(i) || (frameLayout = this.f103610k) == null) {
            this.f103608i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.f103609j - 1;
        this.f103609j = i2;
        setViewGroupGoneIfEmpty(this.f103608i, i2);
    }
}
