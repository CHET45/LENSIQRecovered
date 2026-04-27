package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.C3146R;
import com.google.android.material.textfield.C3428a;
import p000.C7156i6;

/* JADX INFO: loaded from: classes5.dex */
public class js4 extends a25 {

    /* JADX INFO: renamed from: s */
    @sy1(api = 21)
    public static final boolean f51657s = true;

    /* JADX INFO: renamed from: t */
    public static final int f51658t = 50;

    /* JADX INFO: renamed from: u */
    public static final int f51659u = 67;

    /* JADX INFO: renamed from: e */
    public final int f51660e;

    /* JADX INFO: renamed from: f */
    public final int f51661f;

    /* JADX INFO: renamed from: g */
    @efb
    public final TimeInterpolator f51662g;

    /* JADX INFO: renamed from: h */
    @hib
    public AutoCompleteTextView f51663h;

    /* JADX INFO: renamed from: i */
    public final View.OnClickListener f51664i;

    /* JADX INFO: renamed from: j */
    public final View.OnFocusChangeListener f51665j;

    /* JADX INFO: renamed from: k */
    public final C7156i6.e f51666k;

    /* JADX INFO: renamed from: l */
    public boolean f51667l;

    /* JADX INFO: renamed from: m */
    public boolean f51668m;

    /* JADX INFO: renamed from: n */
    public boolean f51669n;

    /* JADX INFO: renamed from: o */
    public long f51670o;

    /* JADX INFO: renamed from: p */
    @hib
    public AccessibilityManager f51671p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f51672q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f51673r;

    /* JADX INFO: renamed from: js4$a */
    public class C8046a extends AnimatorListenerAdapter {
        public C8046a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            js4.this.m46m();
            js4.this.f51673r.start();
        }
    }

    public js4(@efb C3428a c3428a) {
        super(c3428a);
        this.f51664i = new View.OnClickListener() { // from class: fs4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37602a.lambda$new$0(view);
            }
        };
        this.f51665j = new View.OnFocusChangeListener() { // from class: gs4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f40884a.lambda$new$1(view, z);
            }
        };
        this.f51666k = new C7156i6.e() { // from class: hs4
            @Override // p000.C7156i6.e
            public final void onTouchExplorationStateChanged(boolean z) {
                this.f44686a.lambda$new$2(z);
            }
        };
        this.f51670o = Long.MAX_VALUE;
        this.f51661f = c0b.resolveThemeDuration(c3428a.getContext(), C3146R.attr.motionDurationShort3, 67);
        this.f51660e = c0b.resolveThemeDuration(c3428a.getContext(), C3146R.attr.motionDurationShort3, 50);
        this.f51662g = c0b.resolveThemeInterpolator(c3428a.getContext(), C3146R.attr.motionEasingLinearInterpolator, C13280ty.f86289a);
    }

    @efb
    private static AutoCompleteTextView castAutoCompleteTextViewOrThrow(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator getAlphaAnimator(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f51662g);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cs4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f27201a.lambda$getAlphaAnimator$6(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void initAnimators() {
        this.f51673r = getAlphaAnimator(this.f51661f, 0.0f, 1.0f);
        ValueAnimator alphaAnimator = getAlphaAnimator(this.f51660e, 1.0f, 0.0f);
        this.f51672q = alphaAnimator;
        alphaAnimator.addListener(new C8046a());
    }

    private boolean isDropdownPopupActive() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f51670o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$afterEditTextChanged$3() {
        boolean zIsPopupShowing = this.f51663h.isPopupShowing();
        setEndIconChecked(zIsPopupShowing);
        this.f51668m = zIsPopupShowing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAlphaAnimator$6(ValueAnimator valueAnimator) {
        this.f166d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        showHideDropdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view, boolean z) {
        this.f51667l = z;
        m46m();
        if (z) {
            return;
        }
        setEndIconChecked(false);
        this.f51668m = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(boolean z) {
        AutoCompleteTextView autoCompleteTextView = this.f51663h;
        if (autoCompleteTextView == null || pw4.m19796a(autoCompleteTextView)) {
            return;
        }
        o8i.setImportantForAccessibility(this.f166d, z ? 2 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setUpDropdownShowHideBehavior$4(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (isDropdownPopupActive()) {
                this.f51668m = false;
            }
            showHideDropdown();
            updateDropdownPopupDirty();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpDropdownShowHideBehavior$5() {
        updateDropdownPopupDirty();
        setEndIconChecked(false);
    }

    private void setEndIconChecked(boolean z) {
        if (this.f51669n != z) {
            this.f51669n = z;
            this.f51673r.cancel();
            this.f51672q.start();
        }
    }

    @igg({"ClickableViewAccessibility"})
    private void setUpDropdownShowHideBehavior() {
        this.f51663h.setOnTouchListener(new View.OnTouchListener() { // from class: ds4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f30528a.lambda$setUpDropdownShowHideBehavior$4(view, motionEvent);
            }
        });
        if (f51657s) {
            this.f51663h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: es4
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    this.f33953a.lambda$setUpDropdownShowHideBehavior$5();
                }
            });
        }
        this.f51663h.setThreshold(0);
    }

    private void showHideDropdown() {
        if (this.f51663h == null) {
            return;
        }
        if (isDropdownPopupActive()) {
            this.f51668m = false;
        }
        if (this.f51668m) {
            this.f51668m = false;
            return;
        }
        if (f51657s) {
            setEndIconChecked(!this.f51669n);
        } else {
            this.f51669n = !this.f51669n;
            m46m();
        }
        if (!this.f51669n) {
            this.f51663h.dismissDropDown();
        } else {
            this.f51663h.requestFocus();
            this.f51663h.showDropDown();
        }
    }

    private void updateDropdownPopupDirty() {
        this.f51668m = true;
        this.f51670o = System.currentTimeMillis();
    }

    @Override // p000.a25
    public void afterEditTextChanged(Editable editable) {
        if (this.f51671p.isTouchExplorationEnabled() && pw4.m19796a(this.f51663h) && !this.f166d.hasFocus()) {
            this.f51663h.dismissDropDown();
        }
        this.f51663h.post(new Runnable() { // from class: is4
            @Override // java.lang.Runnable
            public final void run() {
                this.f48117a.lambda$afterEditTextChanged$3();
            }
        });
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: b */
    public int mo35b() {
        return C3146R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: c */
    public int mo36c() {
        return f51657s ? C3146R.drawable.mtrl_dropdown_arrow : C3146R.drawable.mtrl_ic_arrow_drop_down;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: d */
    public View.OnFocusChangeListener mo37d() {
        return this.f51665j;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: e */
    public View.OnClickListener mo38e() {
        return this.f51664i;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: g */
    public boolean mo40g(int i) {
        return i != 0;
    }

    @Override // p000.a25
    public C7156i6.e getTouchExplorationStateChangeListener() {
        return this.f51666k;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: h */
    public boolean mo41h() {
        return true;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: i */
    public boolean mo42i() {
        return this.f51667l;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: j */
    public boolean mo43j() {
        return true;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: k */
    public boolean mo44k() {
        return this.f51669n;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: n */
    public void mo47n() {
        initAnimators();
        this.f51671p = (AccessibilityManager) this.f165c.getSystemService("accessibility");
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: o */
    public boolean mo48o() {
        return true;
    }

    @Override // p000.a25
    public void onEditTextAttached(@hib EditText editText) {
        this.f51663h = castAutoCompleteTextViewOrThrow(editText);
        setUpDropdownShowHideBehavior();
        this.f163a.setErrorIconDrawable((Drawable) null);
        if (!pw4.m19796a(editText) && this.f51671p.isTouchExplorationEnabled()) {
            o8i.setImportantForAccessibility(this.f166d, 2);
        }
        this.f163a.setEndIconVisible(true);
    }

    @Override // p000.a25
    public void onInitializeAccessibilityNodeInfo(View view, @efb C6730h7 c6730h7) {
        if (!pw4.m19796a(this.f51663h)) {
            c6730h7.setClassName(Spinner.class.getName());
        }
        if (c6730h7.isShowingHintText()) {
            c6730h7.setHintText(null);
        }
    }

    @Override // p000.a25
    @igg({"WrongConstant"})
    public void onPopulateAccessibilityEvent(View view, @efb AccessibilityEvent accessibilityEvent) {
        if (!this.f51671p.isEnabled() || pw4.m19796a(this.f51663h)) {
            return;
        }
        boolean z = accessibilityEvent.getEventType() == 32768 && this.f51669n && !this.f51663h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            showHideDropdown();
            updateDropdownPopupDirty();
        }
    }

    @Override // p000.a25
    @igg({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: p */
    public void mo49p() {
        AutoCompleteTextView autoCompleteTextView = this.f51663h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f51657s) {
                this.f51663h.setOnDismissListener(null);
            }
        }
    }
}
