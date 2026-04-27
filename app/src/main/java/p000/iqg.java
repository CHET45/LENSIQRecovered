package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.material.C3146R;
import p000.f7e;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class iqg {

    /* JADX INFO: renamed from: r */
    public static final String f47978r = "TextAppearance";

    /* JADX INFO: renamed from: s */
    public static final int f47979s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f47980t = 2;

    /* JADX INFO: renamed from: u */
    public static final int f47981u = 3;

    /* JADX INFO: renamed from: a */
    @hib
    public final ColorStateList f47982a;

    /* JADX INFO: renamed from: b */
    @hib
    public final ColorStateList f47983b;

    /* JADX INFO: renamed from: c */
    @hib
    public final ColorStateList f47984c;

    /* JADX INFO: renamed from: d */
    @hib
    public final String f47985d;

    /* JADX INFO: renamed from: e */
    public final int f47986e;

    /* JADX INFO: renamed from: f */
    public final int f47987f;

    /* JADX INFO: renamed from: g */
    public final boolean f47988g;

    /* JADX INFO: renamed from: h */
    public final float f47989h;

    /* JADX INFO: renamed from: i */
    public final float f47990i;

    /* JADX INFO: renamed from: j */
    public final float f47991j;

    /* JADX INFO: renamed from: k */
    public final boolean f47992k;

    /* JADX INFO: renamed from: l */
    public final float f47993l;

    /* JADX INFO: renamed from: m */
    @hib
    public ColorStateList f47994m;

    /* JADX INFO: renamed from: n */
    public float f47995n;

    /* JADX INFO: renamed from: o */
    @xo6
    public final int f47996o;

    /* JADX INFO: renamed from: p */
    public boolean f47997p = false;

    /* JADX INFO: renamed from: q */
    public Typeface f47998q;

    /* JADX INFO: renamed from: iqg$a */
    public class C7566a extends f7e.AbstractC5672f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kqg f47999a;

        public C7566a(kqg kqgVar) {
            this.f47999a = kqgVar;
        }

        @Override // p000.f7e.AbstractC5672f
        /* JADX INFO: renamed from: onFontRetrievalFailed */
        public void lambda$callbackFailAsync$1(int i) {
            iqg.this.f47997p = true;
            this.f47999a.onFontRetrievalFailed(i);
        }

        @Override // p000.f7e.AbstractC5672f
        /* JADX INFO: renamed from: onFontRetrieved */
        public void lambda$callbackSuccessAsync$0(@efb Typeface typeface) {
            iqg iqgVar = iqg.this;
            iqgVar.f47998q = Typeface.create(typeface, iqgVar.f47986e);
            iqg.this.f47997p = true;
            this.f47999a.onFontRetrieved(iqg.this.f47998q, false);
        }
    }

    /* JADX INFO: renamed from: iqg$b */
    public class C7567b extends kqg {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f48001a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextPaint f48002b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ kqg f48003c;

        public C7567b(Context context, TextPaint textPaint, kqg kqgVar) {
            this.f48001a = context;
            this.f48002b = textPaint;
            this.f48003c = kqgVar;
        }

        @Override // p000.kqg
        public void onFontRetrievalFailed(int i) {
            this.f48003c.onFontRetrievalFailed(i);
        }

        @Override // p000.kqg
        public void onFontRetrieved(@efb Typeface typeface, boolean z) {
            iqg.this.updateTextPaintMeasureState(this.f48001a, this.f48002b, typeface);
            this.f48003c.onFontRetrieved(typeface, z);
        }
    }

    public iqg(@efb Context context, @dbg int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C3146R.styleable.TextAppearance);
        setTextSize(typedArrayObtainStyledAttributes.getDimension(C3146R.styleable.TextAppearance_android_textSize, 0.0f));
        setTextColor(a3a.getColorStateList(context, typedArrayObtainStyledAttributes, C3146R.styleable.TextAppearance_android_textColor));
        this.f47982a = a3a.getColorStateList(context, typedArrayObtainStyledAttributes, C3146R.styleable.TextAppearance_android_textColorHint);
        this.f47983b = a3a.getColorStateList(context, typedArrayObtainStyledAttributes, C3146R.styleable.TextAppearance_android_textColorLink);
        this.f47986e = typedArrayObtainStyledAttributes.getInt(C3146R.styleable.TextAppearance_android_textStyle, 0);
        this.f47987f = typedArrayObtainStyledAttributes.getInt(C3146R.styleable.TextAppearance_android_typeface, 1);
        int iM124a = a3a.m124a(typedArrayObtainStyledAttributes, C3146R.styleable.TextAppearance_fontFamily, C3146R.styleable.TextAppearance_android_fontFamily);
        this.f47996o = typedArrayObtainStyledAttributes.getResourceId(iM124a, 0);
        this.f47985d = typedArrayObtainStyledAttributes.getString(iM124a);
        this.f47988g = typedArrayObtainStyledAttributes.getBoolean(C3146R.styleable.TextAppearance_textAllCaps, false);
        this.f47984c = a3a.getColorStateList(context, typedArrayObtainStyledAttributes, C3146R.styleable.TextAppearance_android_shadowColor);
        this.f47989h = typedArrayObtainStyledAttributes.getFloat(C3146R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f47990i = typedArrayObtainStyledAttributes.getFloat(C3146R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f47991j = typedArrayObtainStyledAttributes.getFloat(C3146R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, C3146R.styleable.MaterialTextAppearance);
        this.f47992k = typedArrayObtainStyledAttributes2.hasValue(C3146R.styleable.MaterialTextAppearance_android_letterSpacing);
        this.f47993l = typedArrayObtainStyledAttributes2.getFloat(C3146R.styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void createFallbackFont() {
        String str;
        if (this.f47998q == null && (str = this.f47985d) != null) {
            this.f47998q = Typeface.create(str, this.f47986e);
        }
        if (this.f47998q == null) {
            int i = this.f47987f;
            if (i == 1) {
                this.f47998q = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f47998q = Typeface.SERIF;
            } else if (i != 3) {
                this.f47998q = Typeface.DEFAULT;
            } else {
                this.f47998q = Typeface.MONOSPACE;
            }
            this.f47998q = Typeface.create(this.f47998q, this.f47986e);
        }
    }

    private boolean shouldLoadFontSynchronously(Context context) {
        if (jqg.shouldLoadFontSynchronously()) {
            return true;
        }
        int i = this.f47996o;
        return (i != 0 ? f7e.getCachedFont(context, i) : null) != null;
    }

    public Typeface getFallbackFont() {
        createFallbackFont();
        return this.f47998q;
    }

    @efb
    @fdi
    public Typeface getFont(@efb Context context) {
        if (this.f47997p) {
            return this.f47998q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font = f7e.getFont(context, this.f47996o);
                this.f47998q = font;
                if (font != null) {
                    this.f47998q = Typeface.create(font, this.f47986e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.f47985d);
            }
        }
        createFallbackFont();
        this.f47997p = true;
        return this.f47998q;
    }

    public void getFontAsync(@efb Context context, @efb kqg kqgVar) {
        if (shouldLoadFontSynchronously(context)) {
            getFont(context);
        } else {
            createFallbackFont();
        }
        int i = this.f47996o;
        if (i == 0) {
            this.f47997p = true;
        }
        if (this.f47997p) {
            kqgVar.onFontRetrieved(this.f47998q, true);
            return;
        }
        try {
            f7e.getFont(context, i, new C7566a(kqgVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f47997p = true;
            kqgVar.onFontRetrievalFailed(1);
        } catch (Exception unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.f47985d);
            this.f47997p = true;
            kqgVar.onFontRetrievalFailed(-3);
        }
    }

    @hib
    public ColorStateList getTextColor() {
        return this.f47994m;
    }

    public float getTextSize() {
        return this.f47995n;
    }

    public void setTextColor(@hib ColorStateList colorStateList) {
        this.f47994m = colorStateList;
    }

    public void setTextSize(float f) {
        this.f47995n = f;
    }

    public void updateDrawState(@efb Context context, @efb TextPaint textPaint, @efb kqg kqgVar) {
        updateMeasureState(context, textPaint, kqgVar);
        ColorStateList colorStateList = this.f47994m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f47991j;
        float f2 = this.f47989h;
        float f3 = this.f47990i;
        ColorStateList colorStateList2 = this.f47984c;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void updateMeasureState(@efb Context context, @efb TextPaint textPaint, @efb kqg kqgVar) {
        if (shouldLoadFontSynchronously(context)) {
            updateTextPaintMeasureState(context, textPaint, getFont(context));
        } else {
            getFontAsync(context, textPaint, kqgVar);
        }
    }

    public void updateTextPaintMeasureState(@efb Context context, @efb TextPaint textPaint, @efb Typeface typeface) {
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = tnh.maybeCopyWithFontWeightAdjustment(context, typeface);
        if (typefaceMaybeCopyWithFontWeightAdjustment != null) {
            typeface = typefaceMaybeCopyWithFontWeightAdjustment;
        }
        textPaint.setTypeface(typeface);
        int i = this.f47986e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f47995n);
        if (this.f47992k) {
            textPaint.setLetterSpacing(this.f47993l);
        }
    }

    public void getFontAsync(@efb Context context, @efb TextPaint textPaint, @efb kqg kqgVar) {
        updateTextPaintMeasureState(context, textPaint, getFallbackFont());
        getFontAsync(context, new C7567b(context, textPaint, kqgVar));
    }
}
