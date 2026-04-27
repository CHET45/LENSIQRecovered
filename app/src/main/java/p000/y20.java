package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.C0392R;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p000.f7e;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class y20 {

    /* JADX INFO: renamed from: n */
    public static final int f100100n = -1;

    /* JADX INFO: renamed from: o */
    public static final int f100101o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f100102p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f100103q = 3;

    /* JADX INFO: renamed from: a */
    @efb
    public final TextView f100104a;

    /* JADX INFO: renamed from: b */
    public r2h f100105b;

    /* JADX INFO: renamed from: c */
    public r2h f100106c;

    /* JADX INFO: renamed from: d */
    public r2h f100107d;

    /* JADX INFO: renamed from: e */
    public r2h f100108e;

    /* JADX INFO: renamed from: f */
    public r2h f100109f;

    /* JADX INFO: renamed from: g */
    public r2h f100110g;

    /* JADX INFO: renamed from: h */
    public r2h f100111h;

    /* JADX INFO: renamed from: i */
    @efb
    public final z20 f100112i;

    /* JADX INFO: renamed from: j */
    public int f100113j = 0;

    /* JADX INFO: renamed from: k */
    public int f100114k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f100115l;

    /* JADX INFO: renamed from: m */
    public boolean f100116m;

    /* JADX INFO: renamed from: y20$a */
    public class C15398a extends f7e.AbstractC5672f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f100117a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f100118b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ WeakReference f100119c;

        public C15398a(int i, int i2, WeakReference weakReference) {
            this.f100117a = i;
            this.f100118b = i2;
            this.f100119c = weakReference;
        }

        @Override // p000.f7e.AbstractC5672f
        /* JADX INFO: renamed from: onFontRetrievalFailed */
        public void lambda$callbackFailAsync$1(int i) {
        }

        @Override // p000.f7e.AbstractC5672f
        /* JADX INFO: renamed from: onFontRetrieved */
        public void lambda$callbackSuccessAsync$0(@efb Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f100117a) != -1) {
                typeface = C15404g.m25627a(typeface, i, (this.f100118b & 2) != 0);
            }
            y20.this.m25605l(this.f100119c, typeface);
        }
    }

    /* JADX INFO: renamed from: y20$b */
    public class RunnableC15399b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f100121a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Typeface f100122b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f100123c;

        public RunnableC15399b(TextView textView, Typeface typeface, int i) {
            this.f100121a = textView;
            this.f100122b = typeface;
            this.f100123c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f100121a.setTypeface(this.f100122b, this.f100123c);
        }
    }

    /* JADX INFO: renamed from: y20$c */
    @c5e(17)
    public static class C15400c {
        private C15400c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Drawable[] m25617a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m25618b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m25619c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* JADX INFO: renamed from: y20$d */
    @c5e(21)
    public static class C15401d {
        private C15401d() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Locale m25620a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: renamed from: y20$e */
    @c5e(24)
    public static class C15402e {
        private C15402e() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static LocaleList m25621a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m25622b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: y20$f */
    @c5e(26)
    public static class C15403f {
        private C15403f() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m25623a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m25624b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m25625c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static boolean m25626d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: renamed from: y20$g */
    @c5e(28)
    public static class C15404g {
        private C15404g() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Typeface m25627a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public y20(@efb TextView textView) {
        this.f100104a = textView;
        this.f100112i = new z20(textView);
    }

    private void applyCompoundDrawableTint(Drawable drawable, r2h r2hVar) {
        if (drawable == null || r2hVar == null) {
            return;
        }
        m20.m16551e(drawable, r2hVar, this.f100104a.getDrawableState());
    }

    private static r2h createTintInfo(Context context, m20 m20Var, int i) {
        ColorStateList colorStateListM16553c = m20Var.m16553c(context, i);
        if (colorStateListM16553c == null) {
            return null;
        }
        r2h r2hVar = new r2h();
        r2hVar.f76913d = true;
        r2hVar.f76910a = colorStateListM16553c;
        return r2hVar;
    }

    private void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] drawableArrM25617a = C15400c.m25617a(this.f100104a);
            TextView textView = this.f100104a;
            if (drawable5 == null) {
                drawable5 = drawableArrM25617a[0];
            }
            if (drawable2 == null) {
                drawable2 = drawableArrM25617a[1];
            }
            if (drawable6 == null) {
                drawable6 = drawableArrM25617a[2];
            }
            if (drawable4 == null) {
                drawable4 = drawableArrM25617a[3];
            }
            C15400c.m25618b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] drawableArrM25617a2 = C15400c.m25617a(this.f100104a);
        Drawable drawable7 = drawableArrM25617a2[0];
        if (drawable7 != null || drawableArrM25617a2[2] != null) {
            TextView textView2 = this.f100104a;
            if (drawable2 == null) {
                drawable2 = drawableArrM25617a2[1];
            }
            Drawable drawable8 = drawableArrM25617a2[2];
            if (drawable4 == null) {
                drawable4 = drawableArrM25617a2[3];
            }
            C15400c.m25618b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f100104a.getCompoundDrawables();
        TextView textView3 = this.f100104a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void setCompoundTints() {
        r2h r2hVar = this.f100111h;
        this.f100105b = r2hVar;
        this.f100106c = r2hVar;
        this.f100107d = r2hVar;
        this.f100108e = r2hVar;
        this.f100109f = r2hVar;
        this.f100110g = r2hVar;
    }

    private void setTextSizeInternal(int i, float f) {
        this.f100112i.m26486o(i, f);
    }

    private void updateTypefaceAndStyle(Context context, t2h t2hVar) {
        String string;
        this.f100113j = t2hVar.getInt(C0392R.styleable.TextAppearance_android_textStyle, this.f100113j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int i2 = t2hVar.getInt(C0392R.styleable.TextAppearance_android_textFontWeight, -1);
            this.f100114k = i2;
            if (i2 != -1) {
                this.f100113j &= 2;
            }
        }
        if (!t2hVar.hasValue(C0392R.styleable.TextAppearance_android_fontFamily) && !t2hVar.hasValue(C0392R.styleable.TextAppearance_fontFamily)) {
            if (t2hVar.hasValue(C0392R.styleable.TextAppearance_android_typeface)) {
                this.f100116m = false;
                int i3 = t2hVar.getInt(C0392R.styleable.TextAppearance_android_typeface, 1);
                if (i3 == 1) {
                    this.f100115l = Typeface.SANS_SERIF;
                    return;
                } else if (i3 == 2) {
                    this.f100115l = Typeface.SERIF;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f100115l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f100115l = null;
        int i4 = t2hVar.hasValue(C0392R.styleable.TextAppearance_fontFamily) ? C0392R.styleable.TextAppearance_fontFamily : C0392R.styleable.TextAppearance_android_fontFamily;
        int i5 = this.f100114k;
        int i6 = this.f100113j;
        if (!context.isRestricted()) {
            try {
                Typeface font = t2hVar.getFont(i4, this.f100113j, new C15398a(i5, i6, new WeakReference(this.f100104a)));
                if (font != null) {
                    if (i < 28 || this.f100114k == -1) {
                        this.f100115l = font;
                    } else {
                        this.f100115l = C15404g.m25627a(Typeface.create(font, 0), this.f100114k, (this.f100113j & 2) != 0);
                    }
                }
                this.f100116m = this.f100115l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f100115l != null || (string = t2hVar.getString(i4)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f100114k == -1) {
            this.f100115l = Typeface.create(string, this.f100113j);
        } else {
            this.f100115l = C15404g.m25627a(Typeface.create(string, 0), this.f100114k, (this.f100113j & 2) != 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25594a() {
        if (this.f100105b != null || this.f100106c != null || this.f100107d != null || this.f100108e != null) {
            Drawable[] compoundDrawables = this.f100104a.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.f100105b);
            applyCompoundDrawableTint(compoundDrawables[1], this.f100106c);
            applyCompoundDrawableTint(compoundDrawables[2], this.f100107d);
            applyCompoundDrawableTint(compoundDrawables[3], this.f100108e);
        }
        if (this.f100109f == null && this.f100110g == null) {
            return;
        }
        Drawable[] drawableArrM25617a = C15400c.m25617a(this.f100104a);
        applyCompoundDrawableTint(drawableArrM25617a[0], this.f100109f);
        applyCompoundDrawableTint(drawableArrM25617a[2], this.f100110g);
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: b */
    public void m25595b() {
        this.f100112i.m26473a();
    }

    /* JADX INFO: renamed from: c */
    public int m25596c() {
        return this.f100112i.m26475c();
    }

    /* JADX INFO: renamed from: d */
    public int m25597d() {
        return this.f100112i.m26476d();
    }

    /* JADX INFO: renamed from: e */
    public int m25598e() {
        return this.f100112i.m26477e();
    }

    /* JADX INFO: renamed from: f */
    public int[] m25599f() {
        return this.f100112i.m26478f();
    }

    /* JADX INFO: renamed from: g */
    public int m25600g() {
        return this.f100112i.m26479g();
    }

    @hib
    /* JADX INFO: renamed from: h */
    public ColorStateList m25601h() {
        r2h r2hVar = this.f100111h;
        if (r2hVar != null) {
            return r2hVar.f76910a;
        }
        return null;
    }

    @hib
    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode m25602i() {
        r2h r2hVar = this.f100111h;
        if (r2hVar != null) {
            return r2hVar.f76911b;
        }
        return null;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: j */
    public boolean m25603j() {
        return this.f100112i.m26481j();
    }

    @igg({"NewApi"})
    /* JADX INFO: renamed from: k */
    public void m25604k(@hib AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        boolean z3;
        Context context = this.f100104a.getContext();
        m20 m20Var = m20.get();
        t2h t2hVarObtainStyledAttributes = t2h.obtainStyledAttributes(context, attributeSet, C0392R.styleable.AppCompatTextHelper, i, 0);
        TextView textView = this.f100104a;
        o8i.saveAttributeDataForStyleable(textView, textView.getContext(), C0392R.styleable.AppCompatTextHelper, attributeSet, t2hVarObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        int resourceId = t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.f100105b = createTintInfo(context, m20Var, t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTextHelper_android_drawableTop)) {
            this.f100106c = createTintInfo(context, m20Var, t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTextHelper_android_drawableRight)) {
            this.f100107d = createTintInfo(context, m20Var, t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.f100108e = createTintInfo(context, m20Var, t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTextHelper_android_drawableStart)) {
            this.f100109f = createTintInfo(context, m20Var, t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTextHelper_android_drawableEnd)) {
            this.f100110g = createTintInfo(context, m20Var, t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.AppCompatTextHelper_android_drawableEnd, 0));
        }
        t2hVarObtainStyledAttributes.recycle();
        boolean z4 = this.f100104a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId != -1) {
            t2h t2hVarObtainStyledAttributes2 = t2h.obtainStyledAttributes(context, resourceId, C0392R.styleable.TextAppearance);
            if (z4 || !t2hVarObtainStyledAttributes2.hasValue(C0392R.styleable.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = t2hVarObtainStyledAttributes2.getBoolean(C0392R.styleable.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            updateTypefaceAndStyle(context, t2hVarObtainStyledAttributes2);
            string = t2hVarObtainStyledAttributes2.hasValue(C0392R.styleable.TextAppearance_textLocale) ? t2hVarObtainStyledAttributes2.getString(C0392R.styleable.TextAppearance_textLocale) : null;
            string2 = t2hVarObtainStyledAttributes2.hasValue(C0392R.styleable.TextAppearance_fontVariationSettings) ? t2hVarObtainStyledAttributes2.getString(C0392R.styleable.TextAppearance_fontVariationSettings) : null;
            t2hVarObtainStyledAttributes2.recycle();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        t2h t2hVarObtainStyledAttributes3 = t2h.obtainStyledAttributes(context, attributeSet, C0392R.styleable.TextAppearance, i, 0);
        if (z4 || !t2hVarObtainStyledAttributes3.hasValue(C0392R.styleable.TextAppearance_textAllCaps)) {
            z3 = z2;
        } else {
            z = t2hVarObtainStyledAttributes3.getBoolean(C0392R.styleable.TextAppearance_textAllCaps, false);
            z3 = true;
        }
        if (t2hVarObtainStyledAttributes3.hasValue(C0392R.styleable.TextAppearance_textLocale)) {
            string = t2hVarObtainStyledAttributes3.getString(C0392R.styleable.TextAppearance_textLocale);
        }
        if (t2hVarObtainStyledAttributes3.hasValue(C0392R.styleable.TextAppearance_fontVariationSettings)) {
            string2 = t2hVarObtainStyledAttributes3.getString(C0392R.styleable.TextAppearance_fontVariationSettings);
        }
        if (i2 >= 28 && t2hVarObtainStyledAttributes3.hasValue(C0392R.styleable.TextAppearance_android_textSize) && t2hVarObtainStyledAttributes3.getDimensionPixelSize(C0392R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.f100104a.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, t2hVarObtainStyledAttributes3);
        t2hVarObtainStyledAttributes3.recycle();
        if (!z4 && z3) {
            m25610q(z);
        }
        Typeface typeface = this.f100115l;
        if (typeface != null) {
            if (this.f100114k == -1) {
                this.f100104a.setTypeface(typeface, this.f100113j);
            } else {
                this.f100104a.setTypeface(typeface);
            }
        }
        if (string2 != null) {
            C15403f.m25626d(this.f100104a, string2);
        }
        if (string != null) {
            C15402e.m25622b(this.f100104a, C15402e.m25621a(string));
        }
        this.f100112i.m26482k(attributeSet, i);
        if (fci.f36151c && this.f100112i.m26479g() != 0) {
            int[] iArrM26478f = this.f100112i.m26478f();
            if (iArrM26478f.length > 0) {
                if (C15403f.m25623a(this.f100104a) != -1.0f) {
                    C15403f.m25624b(this.f100104a, this.f100112i.m26476d(), this.f100112i.m26475c(), this.f100112i.m26477e(), 0);
                } else {
                    C15403f.m25625c(this.f100104a, iArrM26478f, 0);
                }
            }
        }
        t2h t2hVarObtainStyledAttributes4 = t2h.obtainStyledAttributes(context, attributeSet, C0392R.styleable.AppCompatTextView);
        int resourceId2 = t2hVarObtainStyledAttributes4.getResourceId(C0392R.styleable.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawable = resourceId2 != -1 ? m20Var.getDrawable(context, resourceId2) : null;
        int resourceId3 = t2hVarObtainStyledAttributes4.getResourceId(C0392R.styleable.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawable2 = resourceId3 != -1 ? m20Var.getDrawable(context, resourceId3) : null;
        int resourceId4 = t2hVarObtainStyledAttributes4.getResourceId(C0392R.styleable.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawable3 = resourceId4 != -1 ? m20Var.getDrawable(context, resourceId4) : null;
        int resourceId5 = t2hVarObtainStyledAttributes4.getResourceId(C0392R.styleable.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawable4 = resourceId5 != -1 ? m20Var.getDrawable(context, resourceId5) : null;
        int resourceId6 = t2hVarObtainStyledAttributes4.getResourceId(C0392R.styleable.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawable5 = resourceId6 != -1 ? m20Var.getDrawable(context, resourceId6) : null;
        int resourceId7 = t2hVarObtainStyledAttributes4.getResourceId(C0392R.styleable.AppCompatTextView_drawableEndCompat, -1);
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId7 != -1 ? m20Var.getDrawable(context, resourceId7) : null);
        if (t2hVarObtainStyledAttributes4.hasValue(C0392R.styleable.AppCompatTextView_drawableTint)) {
            pwg.setCompoundDrawableTintList(this.f100104a, t2hVarObtainStyledAttributes4.getColorStateList(C0392R.styleable.AppCompatTextView_drawableTint));
        }
        if (t2hVarObtainStyledAttributes4.hasValue(C0392R.styleable.AppCompatTextView_drawableTintMode)) {
            pwg.setCompoundDrawableTintMode(this.f100104a, qq4.parseTintMode(t2hVarObtainStyledAttributes4.getInt(C0392R.styleable.AppCompatTextView_drawableTintMode, -1), null));
        }
        int dimensionPixelSize = t2hVarObtainStyledAttributes4.getDimensionPixelSize(C0392R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize2 = t2hVarObtainStyledAttributes4.getDimensionPixelSize(C0392R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int dimensionPixelSize3 = t2hVarObtainStyledAttributes4.getDimensionPixelSize(C0392R.styleable.AppCompatTextView_lineHeight, -1);
        t2hVarObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            pwg.setFirstBaselineToTopHeight(this.f100104a, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            pwg.setLastBaselineToBottomHeight(this.f100104a, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            pwg.setLineHeight(this.f100104a, dimensionPixelSize3);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m25605l(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f100116m) {
            this.f100115l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (o8i.isAttachedToWindow(textView)) {
                    textView.post(new RunnableC15399b(textView, typeface, this.f100113j));
                } else {
                    textView.setTypeface(typeface, this.f100113j);
                }
            }
        }
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: m */
    public void m25606m(boolean z, int i, int i2, int i3, int i4) {
        if (fci.f36151c) {
            return;
        }
        m25595b();
    }

    /* JADX INFO: renamed from: n */
    public void m25607n() {
        m25594a();
    }

    /* JADX INFO: renamed from: o */
    public void m25608o(Context context, int i) {
        String string;
        t2h t2hVarObtainStyledAttributes = t2h.obtainStyledAttributes(context, i, C0392R.styleable.TextAppearance);
        if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.TextAppearance_textAllCaps)) {
            m25610q(t2hVarObtainStyledAttributes.getBoolean(C0392R.styleable.TextAppearance_textAllCaps, false));
        }
        if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.TextAppearance_android_textSize) && t2hVarObtainStyledAttributes.getDimensionPixelSize(C0392R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.f100104a.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, t2hVarObtainStyledAttributes);
        if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.TextAppearance_fontVariationSettings) && (string = t2hVarObtainStyledAttributes.getString(C0392R.styleable.TextAppearance_fontVariationSettings)) != null) {
            C15403f.m25626d(this.f100104a, string);
        }
        t2hVarObtainStyledAttributes.recycle();
        Typeface typeface = this.f100115l;
        if (typeface != null) {
            this.f100104a.setTypeface(typeface, this.f100113j);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m25609p(@efb TextView textView, @hib InputConnection inputConnection, @efb EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        ex4.setInitialSurroundingText(editorInfo, textView.getText());
    }

    /* JADX INFO: renamed from: q */
    public void m25610q(boolean z) {
        this.f100104a.setAllCaps(z);
    }

    /* JADX INFO: renamed from: r */
    public void m25611r(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f100112i.m26483l(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: s */
    public void m25612s(@efb int[] iArr, int i) throws IllegalArgumentException {
        this.f100112i.m26484m(iArr, i);
    }

    /* JADX INFO: renamed from: t */
    public void m25613t(int i) {
        this.f100112i.m26485n(i);
    }

    /* JADX INFO: renamed from: u */
    public void m25614u(@hib ColorStateList colorStateList) {
        if (this.f100111h == null) {
            this.f100111h = new r2h();
        }
        r2h r2hVar = this.f100111h;
        r2hVar.f76910a = colorStateList;
        r2hVar.f76913d = colorStateList != null;
        setCompoundTints();
    }

    /* JADX INFO: renamed from: v */
    public void m25615v(@hib PorterDuff.Mode mode) {
        if (this.f100111h == null) {
            this.f100111h = new r2h();
        }
        r2h r2hVar = this.f100111h;
        r2hVar.f76911b = mode;
        r2hVar.f76912c = mode != null;
        setCompoundTints();
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: w */
    public void m25616w(int i, float f) {
        if (fci.f36151c || m25603j()) {
            return;
        }
        setTextSizeInternal(i, f);
    }
}
