package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.C3146R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes5.dex */
@igg({"ViewConstructor"})
public class p1g extends LinearLayout {

    /* JADX INFO: renamed from: C */
    @efb
    public ImageView.ScaleType f69456C;

    /* JADX INFO: renamed from: F */
    public View.OnLongClickListener f69457F;

    /* JADX INFO: renamed from: H */
    public boolean f69458H;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f69459a;

    /* JADX INFO: renamed from: b */
    public final TextView f69460b;

    /* JADX INFO: renamed from: c */
    @hib
    public CharSequence f69461c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f69462d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f69463e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f69464f;

    /* JADX INFO: renamed from: m */
    public int f69465m;

    public p1g(TextInputLayout textInputLayout, t2h t2hVar) {
        super(textInputLayout.getContext());
        this.f69459a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C3146R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f69462d = checkableImageButton;
        qq7.m20505d(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f69460b = appCompatTextView;
        initStartIconView(t2hVar);
        initPrefixTextView(t2hVar);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void initPrefixTextView(t2h t2hVar) {
        this.f69460b.setVisibility(8);
        this.f69460b.setId(C3146R.id.textinput_prefix_text);
        this.f69460b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        o8i.setAccessibilityLiveRegion(this.f69460b, 1);
        m19166m(t2hVar.getResourceId(C3146R.styleable.TextInputLayout_prefixTextAppearance, 0));
        if (t2hVar.hasValue(C3146R.styleable.TextInputLayout_prefixTextColor)) {
            m19167n(t2hVar.getColorStateList(C3146R.styleable.TextInputLayout_prefixTextColor));
        }
        m19165l(t2hVar.getText(C3146R.styleable.TextInputLayout_prefixText));
    }

    private void initStartIconView(t2h t2hVar) {
        if (a3a.isFontScaleAtLeast1_3(getContext())) {
            au9.setMarginEnd((ViewGroup.MarginLayoutParams) this.f69462d.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (t2hVar.hasValue(C3146R.styleable.TextInputLayout_startIconTint)) {
            this.f69463e = a3a.getColorStateList(getContext(), t2hVar, C3146R.styleable.TextInputLayout_startIconTint);
        }
        if (t2hVar.hasValue(C3146R.styleable.TextInputLayout_startIconTintMode)) {
            this.f69464f = cci.parseTintMode(t2hVar.getInt(C3146R.styleable.TextInputLayout_startIconTintMode, -1), null);
        }
        if (t2hVar.hasValue(C3146R.styleable.TextInputLayout_startIconDrawable)) {
            m19170q(t2hVar.getDrawable(C3146R.styleable.TextInputLayout_startIconDrawable));
            if (t2hVar.hasValue(C3146R.styleable.TextInputLayout_startIconContentDescription)) {
                m19169p(t2hVar.getText(C3146R.styleable.TextInputLayout_startIconContentDescription));
            }
            m19168o(t2hVar.getBoolean(C3146R.styleable.TextInputLayout_startIconCheckable, true));
        }
        m19171r(t2hVar.getDimensionPixelSize(C3146R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(C3146R.dimen.mtrl_min_touch_target_size)));
        if (t2hVar.hasValue(C3146R.styleable.TextInputLayout_startIconScaleType)) {
            m19172s(qq7.m20503b(t2hVar.getInt(C3146R.styleable.TextInputLayout_startIconScaleType, -1)));
        }
    }

    private void updateVisibility() {
        int i = (this.f69461c == null || this.f69458H) ? 8 : 0;
        setVisibility((this.f69462d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f69460b.setVisibility(i);
        this.f69459a.m6508o();
    }

    @hib
    /* JADX INFO: renamed from: a */
    public CharSequence m19154a() {
        return this.f69461c;
    }

    @hib
    /* JADX INFO: renamed from: b */
    public ColorStateList m19155b() {
        return this.f69460b.getTextColors();
    }

    @efb
    /* JADX INFO: renamed from: c */
    public TextView m19156c() {
        return this.f69460b;
    }

    @hib
    /* JADX INFO: renamed from: d */
    public CharSequence m19157d() {
        return this.f69462d.getContentDescription();
    }

    @hib
    /* JADX INFO: renamed from: e */
    public Drawable m19158e() {
        return this.f69462d.getDrawable();
    }

    /* JADX INFO: renamed from: f */
    public int m19159f() {
        return this.f69465m;
    }

    @efb
    /* JADX INFO: renamed from: g */
    public ImageView.ScaleType m19160g() {
        return this.f69456C;
    }

    /* JADX INFO: renamed from: h */
    public boolean m19161h() {
        return this.f69462d.isCheckable();
    }

    /* JADX INFO: renamed from: i */
    public boolean m19162i() {
        return this.f69462d.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: j */
    public void m19163j(boolean z) {
        this.f69458H = z;
        updateVisibility();
    }

    /* JADX INFO: renamed from: k */
    public void m19164k() {
        qq7.m20504c(this.f69459a, this.f69462d, this.f69463e);
    }

    /* JADX INFO: renamed from: l */
    public void m19165l(@hib CharSequence charSequence) {
        this.f69461c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f69460b.setText(charSequence);
        updateVisibility();
    }

    /* JADX INFO: renamed from: m */
    public void m19166m(@dbg int i) {
        pwg.setTextAppearance(this.f69460b, i);
    }

    /* JADX INFO: renamed from: n */
    public void m19167n(@efb ColorStateList colorStateList) {
        this.f69460b.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: o */
    public void m19168o(boolean z) {
        this.f69462d.setCheckable(z);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m19177x();
    }

    /* JADX INFO: renamed from: p */
    public void m19169p(@hib CharSequence charSequence) {
        if (m19157d() != charSequence) {
            this.f69462d.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m19170q(@hib Drawable drawable) {
        this.f69462d.setImageDrawable(drawable);
        if (drawable != null) {
            qq7.m20502a(this.f69459a, this.f69462d, this.f69463e, this.f69464f);
            m19175v(true);
            m19164k();
        } else {
            m19175v(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            m19169p(null);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m19171r(@fkd int i) {
        if (i < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != this.f69465m) {
            this.f69465m = i;
            qq7.m20506e(this.f69462d, i);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m19172s(@efb ImageView.ScaleType scaleType) {
        this.f69456C = scaleType;
        qq7.m20509h(this.f69462d, scaleType);
    }

    public void setStartIconOnClickListener(@hib View.OnClickListener onClickListener) {
        qq7.m20507f(this.f69462d, onClickListener, this.f69457F);
    }

    public void setStartIconOnLongClickListener(@hib View.OnLongClickListener onLongClickListener) {
        this.f69457F = onLongClickListener;
        qq7.m20508g(this.f69462d, onLongClickListener);
    }

    /* JADX INFO: renamed from: t */
    public void m19173t(@hib ColorStateList colorStateList) {
        if (this.f69463e != colorStateList) {
            this.f69463e = colorStateList;
            qq7.m20502a(this.f69459a, this.f69462d, colorStateList, this.f69464f);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m19174u(@hib PorterDuff.Mode mode) {
        if (this.f69464f != mode) {
            this.f69464f = mode;
            qq7.m20502a(this.f69459a, this.f69462d, this.f69463e, mode);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m19175v(boolean z) {
        if (m19162i() != z) {
            this.f69462d.setVisibility(z ? 0 : 8);
            m19177x();
            updateVisibility();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m19176w(@efb C6730h7 c6730h7) {
        if (this.f69460b.getVisibility() != 0) {
            c6730h7.setTraversalAfter(this.f69462d);
        } else {
            c6730h7.setLabelFor(this.f69460b);
            c6730h7.setTraversalAfter(this.f69460b);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m19177x() {
        EditText editText = this.f69459a.f22700d;
        if (editText == null) {
            return;
        }
        o8i.setPaddingRelative(this.f69460b, m19162i() ? 0 : o8i.getPaddingStart(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C3146R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }
}
