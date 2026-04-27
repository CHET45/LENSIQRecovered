package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.C3146R;
import com.google.android.material.textfield.C3428a;

/* JADX INFO: loaded from: classes5.dex */
public class n22 extends a25 {

    /* JADX INFO: renamed from: n */
    public static final int f63031n = 100;

    /* JADX INFO: renamed from: o */
    public static final int f63032o = 150;

    /* JADX INFO: renamed from: p */
    public static final float f63033p = 0.8f;

    /* JADX INFO: renamed from: e */
    public final int f63034e;

    /* JADX INFO: renamed from: f */
    public final int f63035f;

    /* JADX INFO: renamed from: g */
    @efb
    public final TimeInterpolator f63036g;

    /* JADX INFO: renamed from: h */
    @efb
    public final TimeInterpolator f63037h;

    /* JADX INFO: renamed from: i */
    @hib
    public EditText f63038i;

    /* JADX INFO: renamed from: j */
    public final View.OnClickListener f63039j;

    /* JADX INFO: renamed from: k */
    public final View.OnFocusChangeListener f63040k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f63041l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f63042m;

    /* JADX INFO: renamed from: n22$a */
    public class C9655a extends AnimatorListenerAdapter {
        public C9655a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            n22.this.f164b.m6537S(true);
        }
    }

    /* JADX INFO: renamed from: n22$b */
    public class C9656b extends AnimatorListenerAdapter {
        public C9656b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            n22.this.f164b.m6537S(false);
        }
    }

    public n22(@efb C3428a c3428a) {
        super(c3428a);
        this.f63039j = new View.OnClickListener() { // from class: i22
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45506a.lambda$new$0(view);
            }
        };
        this.f63040k = new View.OnFocusChangeListener() { // from class: j22
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f49407a.lambda$new$1(view, z);
            }
        };
        this.f63034e = c0b.resolveThemeDuration(c3428a.getContext(), C3146R.attr.motionDurationShort3, 100);
        this.f63035f = c0b.resolveThemeDuration(c3428a.getContext(), C3146R.attr.motionDurationShort3, 150);
        this.f63036g = c0b.resolveThemeInterpolator(c3428a.getContext(), C3146R.attr.motionEasingLinearInterpolator, C13280ty.f86289a);
        this.f63037h = c0b.resolveThemeInterpolator(c3428a.getContext(), C3146R.attr.motionEasingEmphasizedInterpolator, C13280ty.f86292d);
    }

    private void animateIcon(boolean z) {
        boolean z2 = this.f164b.m6573z() == z;
        if (z && !this.f63041l.isRunning()) {
            this.f63042m.cancel();
            this.f63041l.start();
            if (z2) {
                this.f63041l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f63041l.cancel();
        this.f63042m.start();
        if (z2) {
            this.f63042m.end();
        }
    }

    private ValueAnimator getAlphaAnimator(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f63036g);
        valueAnimatorOfFloat.setDuration(this.f63034e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k22
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f52427a.lambda$getAlphaAnimator$3(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator getScaleAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f63037h);
        valueAnimatorOfFloat.setDuration(this.f63035f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m22
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f59711a.lambda$getScaleAnimator$4(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void initAnimators() {
        ValueAnimator scaleAnimator = getScaleAnimator();
        ValueAnimator alphaAnimator = getAlphaAnimator(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f63041l = animatorSet;
        animatorSet.playTogether(scaleAnimator, alphaAnimator);
        this.f63041l.addListener(new C9655a());
        ValueAnimator alphaAnimator2 = getAlphaAnimator(1.0f, 0.0f);
        this.f63042m = alphaAnimator2;
        alphaAnimator2.addListener(new C9656b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAlphaAnimator$3(ValueAnimator valueAnimator) {
        this.f166d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getScaleAnimator$4(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f166d.setScaleX(fFloatValue);
        this.f166d.setScaleY(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        EditText editText = this.f63038i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        m46m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view, boolean z) {
        animateIcon(shouldBeVisible());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tearDown$2() {
        animateIcon(true);
    }

    private boolean shouldBeVisible() {
        EditText editText = this.f63038i;
        return editText != null && (editText.hasFocus() || this.f166d.hasFocus()) && this.f63038i.getText().length() > 0;
    }

    @Override // p000.a25
    public void afterEditTextChanged(@efb Editable editable) {
        if (this.f164b.m6567t() != null) {
            return;
        }
        animateIcon(shouldBeVisible());
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: b */
    public int mo35b() {
        return C3146R.string.clear_text_end_icon_content_description;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: c */
    public int mo36c() {
        return C3146R.drawable.mtrl_ic_cancel;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: d */
    public View.OnFocusChangeListener mo37d() {
        return this.f63040k;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: e */
    public View.OnClickListener mo38e() {
        return this.f63039j;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: f */
    public View.OnFocusChangeListener mo39f() {
        return this.f63040k;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: l */
    public void mo45l(boolean z) {
        if (this.f164b.m6567t() == null) {
            return;
        }
        animateIcon(z);
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: n */
    public void mo47n() {
        initAnimators();
    }

    @Override // p000.a25
    public void onEditTextAttached(@hib EditText editText) {
        this.f63038i = editText;
        this.f163a.setEndIconVisible(shouldBeVisible());
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: p */
    public void mo49p() {
        EditText editText = this.f63038i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: l22
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55980a.lambda$tearDown$2();
                }
            });
        }
    }
}
