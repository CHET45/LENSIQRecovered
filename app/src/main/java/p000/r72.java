package p000;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import p000.g3g;
import p000.p7e;
import p000.yp1;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class r72 {

    /* JADX INFO: renamed from: v0 */
    public static final String f77172v0 = "CollapsingTextHelper";

    /* JADX INFO: renamed from: w0 */
    public static final String f77173w0 = "…";

    /* JADX INFO: renamed from: x0 */
    public static final float f77174x0 = 0.5f;

    /* JADX INFO: renamed from: y0 */
    public static final boolean f77175y0 = false;

    /* JADX INFO: renamed from: A */
    public Typeface f77177A;

    /* JADX INFO: renamed from: B */
    public Typeface f77178B;

    /* JADX INFO: renamed from: C */
    public Typeface f77179C;

    /* JADX INFO: renamed from: D */
    public yp1 f77180D;

    /* JADX INFO: renamed from: E */
    public yp1 f77181E;

    /* JADX INFO: renamed from: G */
    @hib
    public CharSequence f77183G;

    /* JADX INFO: renamed from: H */
    @hib
    public CharSequence f77184H;

    /* JADX INFO: renamed from: I */
    public boolean f77185I;

    /* JADX INFO: renamed from: K */
    public boolean f77187K;

    /* JADX INFO: renamed from: L */
    @hib
    public Bitmap f77188L;

    /* JADX INFO: renamed from: M */
    public Paint f77189M;

    /* JADX INFO: renamed from: N */
    public float f77190N;

    /* JADX INFO: renamed from: O */
    public float f77191O;

    /* JADX INFO: renamed from: P */
    public float f77192P;

    /* JADX INFO: renamed from: Q */
    public float f77193Q;

    /* JADX INFO: renamed from: R */
    public float f77194R;

    /* JADX INFO: renamed from: S */
    public int f77195S;

    /* JADX INFO: renamed from: T */
    public int[] f77196T;

    /* JADX INFO: renamed from: U */
    public boolean f77197U;

    /* JADX INFO: renamed from: V */
    @efb
    public final TextPaint f77198V;

    /* JADX INFO: renamed from: W */
    @efb
    public final TextPaint f77199W;

    /* JADX INFO: renamed from: X */
    public TimeInterpolator f77200X;

    /* JADX INFO: renamed from: Y */
    public TimeInterpolator f77201Y;

    /* JADX INFO: renamed from: Z */
    public float f77202Z;

    /* JADX INFO: renamed from: a */
    public final View f77203a;

    /* JADX INFO: renamed from: a0 */
    public float f77204a0;

    /* JADX INFO: renamed from: b */
    public float f77205b;

    /* JADX INFO: renamed from: b0 */
    public float f77206b0;

    /* JADX INFO: renamed from: c */
    public boolean f77207c;

    /* JADX INFO: renamed from: c0 */
    public ColorStateList f77208c0;

    /* JADX INFO: renamed from: d */
    public float f77209d;

    /* JADX INFO: renamed from: d0 */
    public float f77210d0;

    /* JADX INFO: renamed from: e */
    public float f77211e;

    /* JADX INFO: renamed from: e0 */
    public float f77212e0;

    /* JADX INFO: renamed from: f */
    public int f77213f;

    /* JADX INFO: renamed from: f0 */
    public float f77214f0;

    /* JADX INFO: renamed from: g */
    @efb
    public final Rect f77215g;

    /* JADX INFO: renamed from: g0 */
    public ColorStateList f77216g0;

    /* JADX INFO: renamed from: h */
    @efb
    public final Rect f77217h;

    /* JADX INFO: renamed from: h0 */
    public float f77218h0;

    /* JADX INFO: renamed from: i */
    @efb
    public final RectF f77219i;

    /* JADX INFO: renamed from: i0 */
    public float f77220i0;

    /* JADX INFO: renamed from: j0 */
    public float f77222j0;

    /* JADX INFO: renamed from: k0 */
    public StaticLayout f77224k0;

    /* JADX INFO: renamed from: l0 */
    public float f77226l0;

    /* JADX INFO: renamed from: m0 */
    public float f77228m0;

    /* JADX INFO: renamed from: n */
    public ColorStateList f77229n;

    /* JADX INFO: renamed from: n0 */
    public float f77230n0;

    /* JADX INFO: renamed from: o */
    public ColorStateList f77231o;

    /* JADX INFO: renamed from: o0 */
    public CharSequence f77232o0;

    /* JADX INFO: renamed from: p */
    public int f77233p;

    /* JADX INFO: renamed from: q */
    public float f77235q;

    /* JADX INFO: renamed from: r */
    public float f77237r;

    /* JADX INFO: renamed from: s */
    public float f77239s;

    /* JADX INFO: renamed from: t */
    public float f77241t;

    /* JADX INFO: renamed from: t0 */
    @hib
    public h3g f77242t0;

    /* JADX INFO: renamed from: u */
    public float f77243u;

    /* JADX INFO: renamed from: v */
    public float f77244v;

    /* JADX INFO: renamed from: w */
    public Typeface f77245w;

    /* JADX INFO: renamed from: x */
    public Typeface f77246x;

    /* JADX INFO: renamed from: y */
    public Typeface f77247y;

    /* JADX INFO: renamed from: z */
    public Typeface f77248z;

    /* JADX INFO: renamed from: u0 */
    public static final boolean f77171u0 = false;

    /* JADX INFO: renamed from: z0 */
    @efb
    public static final Paint f77176z0 = null;

    /* JADX INFO: renamed from: j */
    public int f77221j = 16;

    /* JADX INFO: renamed from: k */
    public int f77223k = 16;

    /* JADX INFO: renamed from: l */
    public float f77225l = 15.0f;

    /* JADX INFO: renamed from: m */
    public float f77227m = 15.0f;

    /* JADX INFO: renamed from: F */
    public TextUtils.TruncateAt f77182F = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: J */
    public boolean f77186J = true;

    /* JADX INFO: renamed from: p0 */
    public int f77234p0 = 1;

    /* JADX INFO: renamed from: q0 */
    public float f77236q0 = 0.0f;

    /* JADX INFO: renamed from: r0 */
    public float f77238r0 = 1.0f;

    /* JADX INFO: renamed from: s0 */
    public int f77240s0 = g3g.f38335o;

    /* JADX INFO: renamed from: r72$a */
    public class C11915a implements yp1.InterfaceC15754a {
        public C11915a() {
        }

        @Override // p000.yp1.InterfaceC15754a
        public void apply(Typeface typeface) {
            r72.this.setCollapsedTypeface(typeface);
        }
    }

    /* JADX INFO: renamed from: r72$b */
    public class C11916b implements yp1.InterfaceC15754a {
        public C11916b() {
        }

        @Override // p000.yp1.InterfaceC15754a
        public void apply(Typeface typeface) {
            r72.this.setExpandedTypeface(typeface);
        }
    }

    public r72(View view) {
        this.f77203a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f77198V = textPaint;
        this.f77199W = new TextPaint(textPaint);
        this.f77217h = new Rect();
        this.f77215g = new Rect();
        this.f77219i = new RectF();
        this.f77211e = calculateFadeModeThresholdFraction();
        maybeUpdateFontWeightAdjustment(view.getContext().getResources().getConfiguration());
    }

    @g92
    private static int blendARGB(@g92 int i, @g92 int i2, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private void calculateBaseOffsets(boolean z) {
        StaticLayout staticLayout;
        calculateUsingTextSize(1.0f, z);
        CharSequence charSequence = this.f77184H;
        if (charSequence != null && (staticLayout = this.f77224k0) != null) {
            this.f77232o0 = TextUtils.ellipsize(charSequence, this.f77198V, staticLayout.getWidth(), this.f77182F);
        }
        CharSequence charSequence2 = this.f77232o0;
        float fMeasureTextWidth = 0.0f;
        if (charSequence2 != null) {
            this.f77226l0 = measureTextWidth(this.f77198V, charSequence2);
        } else {
            this.f77226l0 = 0.0f;
        }
        int absoluteGravity = cb7.getAbsoluteGravity(this.f77223k, this.f77185I ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.f77237r = this.f77217h.top;
        } else if (i != 80) {
            this.f77237r = this.f77217h.centerY() - ((this.f77198V.descent() - this.f77198V.ascent()) / 2.0f);
        } else {
            this.f77237r = this.f77217h.bottom + this.f77198V.ascent();
        }
        int i2 = absoluteGravity & cb7.f16191d;
        if (i2 == 1) {
            this.f77241t = this.f77217h.centerX() - (this.f77226l0 / 2.0f);
        } else if (i2 != 5) {
            this.f77241t = this.f77217h.left;
        } else {
            this.f77241t = this.f77217h.right - this.f77226l0;
        }
        calculateUsingTextSize(0.0f, z);
        float height = this.f77224k0 != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f77224k0;
        if (staticLayout2 == null || this.f77234p0 <= 1) {
            CharSequence charSequence3 = this.f77184H;
            if (charSequence3 != null) {
                fMeasureTextWidth = measureTextWidth(this.f77198V, charSequence3);
            }
        } else {
            fMeasureTextWidth = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f77224k0;
        this.f77233p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = cb7.getAbsoluteGravity(this.f77221j, this.f77185I ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.f77235q = this.f77215g.top;
        } else if (i3 != 80) {
            this.f77235q = this.f77215g.centerY() - (height / 2.0f);
        } else {
            this.f77235q = (this.f77215g.bottom - height) + this.f77198V.descent();
        }
        int i4 = absoluteGravity2 & cb7.f16191d;
        if (i4 == 1) {
            this.f77239s = this.f77215g.centerX() - (fMeasureTextWidth / 2.0f);
        } else if (i4 != 5) {
            this.f77239s = this.f77215g.left;
        } else {
            this.f77239s = this.f77215g.right - fMeasureTextWidth;
        }
        clearTexture();
        setInterpolatedTextSize(this.f77205b);
    }

    private void calculateCurrentOffsets() {
        calculateOffsets(this.f77205b);
    }

    private float calculateFadeModeTextAlpha(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        float f2 = this.f77211e;
        return f <= f2 ? C13280ty.lerp(1.0f, 0.0f, this.f77209d, f2, f) : C13280ty.lerp(0.0f, 1.0f, f2, 1.0f, f);
    }

    private float calculateFadeModeThresholdFraction() {
        float f = this.f77209d;
        return f + ((1.0f - f) * 0.5f);
    }

    private boolean calculateIsRtl(@efb CharSequence charSequence) {
        boolean zIsDefaultIsRtl = isDefaultIsRtl();
        return this.f77186J ? isTextDirectionHeuristicsIsRtl(charSequence, zIsDefaultIsRtl) : zIsDefaultIsRtl;
    }

    private void calculateOffsets(float f) {
        float f2;
        interpolateBounds(f);
        if (!this.f77207c) {
            this.f77243u = lerp(this.f77239s, this.f77241t, f, this.f77200X);
            this.f77244v = lerp(this.f77235q, this.f77237r, f, this.f77200X);
            setInterpolatedTextSize(f);
            f2 = f;
        } else if (f < this.f77211e) {
            this.f77243u = this.f77239s;
            this.f77244v = this.f77235q;
            setInterpolatedTextSize(0.0f);
            f2 = 0.0f;
        } else {
            this.f77243u = this.f77241t;
            this.f77244v = this.f77237r - Math.max(0, this.f77213f);
            setInterpolatedTextSize(1.0f);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C13280ty.f86290b;
        setCollapsedTextBlend(1.0f - lerp(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        setExpandedTextBlend(lerp(1.0f, 0.0f, f, timeInterpolator));
        if (this.f77231o != this.f77229n) {
            this.f77198V.setColor(blendARGB(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f2));
        } else {
            this.f77198V.setColor(getCurrentCollapsedTextColor());
        }
        float f3 = this.f77218h0;
        float f4 = this.f77220i0;
        if (f3 != f4) {
            this.f77198V.setLetterSpacing(lerp(f4, f3, f, timeInterpolator));
        } else {
            this.f77198V.setLetterSpacing(f3);
        }
        this.f77192P = lerp(this.f77210d0, this.f77202Z, f, null);
        this.f77193Q = lerp(this.f77212e0, this.f77204a0, f, null);
        this.f77194R = lerp(this.f77214f0, this.f77206b0, f, null);
        int iBlendARGB = blendARGB(getCurrentColor(this.f77216g0), getCurrentColor(this.f77208c0), f);
        this.f77195S = iBlendARGB;
        this.f77198V.setShadowLayer(this.f77192P, this.f77193Q, this.f77194R, iBlendARGB);
        if (this.f77207c) {
            this.f77198V.setAlpha((int) (calculateFadeModeTextAlpha(f) * this.f77198V.getAlpha()));
        }
        o8i.postInvalidateOnAnimation(this.f77203a);
    }

    private void calculateUsingTextSize(float f) {
        calculateUsingTextSize(f, false);
    }

    private void clearTexture() {
        Bitmap bitmap = this.f77188L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f77188L = null;
        }
    }

    private StaticLayout createStaticLayout(int i, float f, boolean z) {
        StaticLayout staticLayoutBuild;
        try {
            staticLayoutBuild = g3g.obtain(this.f77183G, this.f77198V, (int) f).setEllipsize(this.f77182F).setIsRtl(z).setAlignment(i == 1 ? Layout.Alignment.ALIGN_NORMAL : getMultilineTextLayoutAlignment()).setIncludePad(false).setMaxLines(i).setLineSpacing(this.f77236q0, this.f77238r0).setHyphenationFrequency(this.f77240s0).setStaticLayoutBuilderConfigurer(this.f77242t0).build();
        } catch (g3g.C6095a e) {
            Log.e(f77172v0, e.getCause().getMessage(), e);
            staticLayoutBuild = null;
        }
        return (StaticLayout) z7d.checkNotNull(staticLayoutBuild);
    }

    private void drawMultilineTransition(@efb Canvas canvas, float f, float f2) {
        int alpha = this.f77198V.getAlpha();
        canvas.translate(f, f2);
        if (!this.f77207c) {
            this.f77198V.setAlpha((int) (this.f77230n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f77198V;
                textPaint.setShadowLayer(this.f77192P, this.f77193Q, this.f77194R, ow9.compositeARGBWithAlpha(this.f77195S, textPaint.getAlpha()));
            }
            this.f77224k0.draw(canvas);
        }
        if (!this.f77207c) {
            this.f77198V.setAlpha((int) (this.f77228m0 * alpha));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint2 = this.f77198V;
            textPaint2.setShadowLayer(this.f77192P, this.f77193Q, this.f77194R, ow9.compositeARGBWithAlpha(this.f77195S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f77224k0.getLineBaseline(0);
        CharSequence charSequence = this.f77232o0;
        float f3 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f3, this.f77198V);
        if (i >= 31) {
            this.f77198V.setShadowLayer(this.f77192P, this.f77193Q, this.f77194R, this.f77195S);
        }
        if (this.f77207c) {
            return;
        }
        String strTrim = this.f77232o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f77198V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f77224k0.getLineEnd(0), str.length()), 0.0f, f3, (Paint) this.f77198V);
    }

    private void ensureExpandedTexture() {
        if (this.f77188L != null || this.f77215g.isEmpty() || TextUtils.isEmpty(this.f77184H)) {
            return;
        }
        calculateOffsets(0.0f);
        int width = this.f77224k0.getWidth();
        int height = this.f77224k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f77188L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f77224k0.draw(new Canvas(this.f77188L));
        if (this.f77189M == null) {
            this.f77189M = new Paint(3);
        }
    }

    private float getCollapsedTextLeftBound(int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) - (this.f77226l0 / 2.0f) : ((i2 & cb7.f16190c) == 8388613 || (i2 & 5) == 5) ? this.f77185I ? this.f77217h.left : this.f77217h.right - this.f77226l0 : this.f77185I ? this.f77217h.right - this.f77226l0 : this.f77217h.left;
    }

    private float getCollapsedTextRightBound(@efb RectF rectF, int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) + (this.f77226l0 / 2.0f) : ((i2 & cb7.f16190c) == 8388613 || (i2 & 5) == 5) ? this.f77185I ? rectF.left + this.f77226l0 : this.f77217h.right : this.f77185I ? this.f77217h.right : rectF.left + this.f77226l0;
    }

    @g92
    private int getCurrentColor(@hib ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f77196T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    @g92
    private int getCurrentExpandedTextColor() {
        return getCurrentColor(this.f77229n);
    }

    private Layout.Alignment getMultilineTextLayoutAlignment() {
        int absoluteGravity = cb7.getAbsoluteGravity(this.f77221j, this.f77185I ? 1 : 0) & 7;
        return absoluteGravity != 1 ? absoluteGravity != 5 ? this.f77185I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f77185I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void getTextPaintCollapsed(@efb TextPaint textPaint) {
        textPaint.setTextSize(this.f77227m);
        textPaint.setTypeface(this.f77245w);
        textPaint.setLetterSpacing(this.f77218h0);
    }

    private void getTextPaintExpanded(@efb TextPaint textPaint) {
        textPaint.setTextSize(this.f77225l);
        textPaint.setTypeface(this.f77248z);
        textPaint.setLetterSpacing(this.f77220i0);
    }

    private void interpolateBounds(float f) {
        if (this.f77207c) {
            this.f77219i.set(f < this.f77211e ? this.f77215g : this.f77217h);
            return;
        }
        this.f77219i.left = lerp(this.f77215g.left, this.f77217h.left, f, this.f77200X);
        this.f77219i.top = lerp(this.f77235q, this.f77237r, f, this.f77200X);
        this.f77219i.right = lerp(this.f77215g.right, this.f77217h.right, f, this.f77200X);
        this.f77219i.bottom = lerp(this.f77215g.bottom, this.f77217h.bottom, f, this.f77200X);
    }

    private static boolean isClose(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    private boolean isDefaultIsRtl() {
        return o8i.getLayoutDirection(this.f77203a) == 1;
    }

    private boolean isTextDirectionHeuristicsIsRtl(@efb CharSequence charSequence, boolean z) {
        return (z ? yqg.f102670d : yqg.f102669c).isRtl(charSequence, 0, charSequence.length());
    }

    private static float lerp(float f, float f2, float f3, @hib TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C13280ty.lerp(f, f2, f3);
    }

    private float measureTextWidth(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean rectEquals(@efb Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private void setCollapsedTextBlend(float f) {
        this.f77228m0 = f;
        o8i.postInvalidateOnAnimation(this.f77203a);
    }

    private boolean setCollapsedTypefaceInternal(Typeface typeface) {
        yp1 yp1Var = this.f77181E;
        if (yp1Var != null) {
            yp1Var.cancel();
        }
        if (this.f77247y == typeface) {
            return false;
        }
        this.f77247y = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = tnh.maybeCopyWithFontWeightAdjustment(this.f77203a.getContext().getResources().getConfiguration(), typeface);
        this.f77246x = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.f77247y;
        }
        this.f77245w = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    private void setExpandedTextBlend(float f) {
        this.f77230n0 = f;
        o8i.postInvalidateOnAnimation(this.f77203a);
    }

    private boolean setExpandedTypefaceInternal(Typeface typeface) {
        yp1 yp1Var = this.f77180D;
        if (yp1Var != null) {
            yp1Var.cancel();
        }
        if (this.f77178B == typeface) {
            return false;
        }
        this.f77178B = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = tnh.maybeCopyWithFontWeightAdjustment(this.f77203a.getContext().getResources().getConfiguration(), typeface);
        this.f77177A = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.f77178B;
        }
        this.f77248z = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    private void setInterpolatedTextSize(float f) {
        calculateUsingTextSize(f);
        boolean z = f77171u0 && this.f77190N != 1.0f;
        this.f77187K = z;
        if (z) {
            ensureExpandedTexture();
        }
        o8i.postInvalidateOnAnimation(this.f77203a);
    }

    private boolean shouldDrawMultiline() {
        return this.f77234p0 > 1 && (!this.f77185I || this.f77207c) && !this.f77187K;
    }

    public void draw(@efb Canvas canvas) {
        int iSave = canvas.save();
        if (this.f77184H == null || this.f77219i.width() <= 0.0f || this.f77219i.height() <= 0.0f) {
            return;
        }
        this.f77198V.setTextSize(this.f77191O);
        float f = this.f77243u;
        float f2 = this.f77244v;
        boolean z = this.f77187K && this.f77188L != null;
        float f3 = this.f77190N;
        if (f3 != 1.0f && !this.f77207c) {
            canvas.scale(f3, f3, f, f2);
        }
        if (z) {
            canvas.drawBitmap(this.f77188L, f, f2, this.f77189M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!shouldDrawMultiline() || (this.f77207c && this.f77205b <= this.f77211e)) {
            canvas.translate(f, f2);
            this.f77224k0.draw(canvas);
        } else {
            drawMultilineTransition(canvas, this.f77243u - this.f77224k0.getLineStart(0), f2);
        }
        canvas.restoreToCount(iSave);
    }

    public void getCollapsedTextActualBounds(@efb RectF rectF, int i, int i2) {
        this.f77185I = calculateIsRtl(this.f77183G);
        rectF.left = Math.max(getCollapsedTextLeftBound(i, i2), this.f77217h.left);
        rectF.top = this.f77217h.top;
        rectF.right = Math.min(getCollapsedTextRightBound(rectF, i, i2), this.f77217h.right);
        rectF.bottom = this.f77217h.top + getCollapsedTextHeight();
    }

    public ColorStateList getCollapsedTextColor() {
        return this.f77231o;
    }

    public int getCollapsedTextGravity() {
        return this.f77223k;
    }

    public float getCollapsedTextHeight() {
        getTextPaintCollapsed(this.f77199W);
        return -this.f77199W.ascent();
    }

    public float getCollapsedTextSize() {
        return this.f77227m;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.f77245w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @g92
    public int getCurrentCollapsedTextColor() {
        return getCurrentColor(this.f77231o);
    }

    public int getExpandedLineCount() {
        return this.f77233p;
    }

    public ColorStateList getExpandedTextColor() {
        return this.f77229n;
    }

    public float getExpandedTextFullHeight() {
        getTextPaintExpanded(this.f77199W);
        return (-this.f77199W.ascent()) + this.f77199W.descent();
    }

    public int getExpandedTextGravity() {
        return this.f77221j;
    }

    public float getExpandedTextHeight() {
        getTextPaintExpanded(this.f77199W);
        return -this.f77199W.ascent();
    }

    public float getExpandedTextSize() {
        return this.f77225l;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.f77248z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float getExpansionFraction() {
        return this.f77205b;
    }

    public float getFadeModeThresholdFraction() {
        return this.f77211e;
    }

    @c5e(23)
    public int getHyphenationFrequency() {
        return this.f77240s0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f77224k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @c5e(23)
    public float getLineSpacingAdd() {
        return this.f77224k0.getSpacingAdd();
    }

    @c5e(23)
    public float getLineSpacingMultiplier() {
        return this.f77224k0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.f77234p0;
    }

    @hib
    public TimeInterpolator getPositionInterpolator() {
        return this.f77200X;
    }

    @hib
    public CharSequence getText() {
        return this.f77183G;
    }

    @efb
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f77182F;
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.f77186J;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f77231o;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f77229n) != null && colorStateList.isStateful());
    }

    public void maybeUpdateFontWeightAdjustment(@efb Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f77247y;
            if (typeface != null) {
                this.f77246x = tnh.maybeCopyWithFontWeightAdjustment(configuration, typeface);
            }
            Typeface typeface2 = this.f77178B;
            if (typeface2 != null) {
                this.f77177A = tnh.maybeCopyWithFontWeightAdjustment(configuration, typeface2);
            }
            Typeface typeface3 = this.f77246x;
            if (typeface3 == null) {
                typeface3 = this.f77247y;
            }
            this.f77245w = typeface3;
            Typeface typeface4 = this.f77177A;
            if (typeface4 == null) {
                typeface4 = this.f77178B;
            }
            this.f77248z = typeface4;
            recalculate(true);
        }
    }

    public void recalculate() {
        recalculate(false);
    }

    public void setCollapsedAndExpandedTextColor(@hib ColorStateList colorStateList) {
        if (this.f77231o == colorStateList && this.f77229n == colorStateList) {
            return;
        }
        this.f77231o = colorStateList;
        this.f77229n = colorStateList;
        recalculate();
    }

    public void setCollapsedBounds(int i, int i2, int i3, int i4) {
        if (rectEquals(this.f77217h, i, i2, i3, i4)) {
            return;
        }
        this.f77217h.set(i, i2, i3, i4);
        this.f77197U = true;
    }

    public void setCollapsedTextAppearance(int i) {
        iqg iqgVar = new iqg(this.f77203a.getContext(), i);
        if (iqgVar.getTextColor() != null) {
            this.f77231o = iqgVar.getTextColor();
        }
        if (iqgVar.getTextSize() != 0.0f) {
            this.f77227m = iqgVar.getTextSize();
        }
        ColorStateList colorStateList = iqgVar.f47984c;
        if (colorStateList != null) {
            this.f77208c0 = colorStateList;
        }
        this.f77204a0 = iqgVar.f47989h;
        this.f77206b0 = iqgVar.f47990i;
        this.f77202Z = iqgVar.f47991j;
        this.f77218h0 = iqgVar.f47993l;
        yp1 yp1Var = this.f77181E;
        if (yp1Var != null) {
            yp1Var.cancel();
        }
        this.f77181E = new yp1(new C11915a(), iqgVar.getFallbackFont());
        iqgVar.getFontAsync(this.f77203a.getContext(), this.f77181E);
        recalculate();
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.f77231o != colorStateList) {
            this.f77231o = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedTextGravity(int i) {
        if (this.f77223k != i) {
            this.f77223k = i;
            recalculate();
        }
    }

    public void setCollapsedTextSize(float f) {
        if (this.f77227m != f) {
            this.f77227m = f;
            recalculate();
        }
    }

    public void setCollapsedTypeface(Typeface typeface) {
        if (setCollapsedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setCurrentOffsetY(int i) {
        this.f77213f = i;
    }

    public void setExpandedBounds(int i, int i2, int i3, int i4) {
        if (rectEquals(this.f77215g, i, i2, i3, i4)) {
            return;
        }
        this.f77215g.set(i, i2, i3, i4);
        this.f77197U = true;
    }

    public void setExpandedLetterSpacing(float f) {
        if (this.f77220i0 != f) {
            this.f77220i0 = f;
            recalculate();
        }
    }

    public void setExpandedTextAppearance(int i) {
        iqg iqgVar = new iqg(this.f77203a.getContext(), i);
        if (iqgVar.getTextColor() != null) {
            this.f77229n = iqgVar.getTextColor();
        }
        if (iqgVar.getTextSize() != 0.0f) {
            this.f77225l = iqgVar.getTextSize();
        }
        ColorStateList colorStateList = iqgVar.f47984c;
        if (colorStateList != null) {
            this.f77216g0 = colorStateList;
        }
        this.f77212e0 = iqgVar.f47989h;
        this.f77214f0 = iqgVar.f47990i;
        this.f77210d0 = iqgVar.f47991j;
        this.f77220i0 = iqgVar.f47993l;
        yp1 yp1Var = this.f77180D;
        if (yp1Var != null) {
            yp1Var.cancel();
        }
        this.f77180D = new yp1(new C11916b(), iqgVar.getFallbackFont());
        iqgVar.getFontAsync(this.f77203a.getContext(), this.f77180D);
        recalculate();
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.f77229n != colorStateList) {
            this.f77229n = colorStateList;
            recalculate();
        }
    }

    public void setExpandedTextGravity(int i) {
        if (this.f77221j != i) {
            this.f77221j = i;
            recalculate();
        }
    }

    public void setExpandedTextSize(float f) {
        if (this.f77225l != f) {
            this.f77225l = f;
            recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        if (setExpandedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setExpansionFraction(float f) {
        float fClamp = r3a.clamp(f, 0.0f, 1.0f);
        if (fClamp != this.f77205b) {
            this.f77205b = fClamp;
            calculateCurrentOffsets();
        }
    }

    public void setFadeModeEnabled(boolean z) {
        this.f77207c = z;
    }

    public void setFadeModeStartFraction(float f) {
        this.f77209d = f;
        this.f77211e = calculateFadeModeThresholdFraction();
    }

    @c5e(23)
    public void setHyphenationFrequency(int i) {
        this.f77240s0 = i;
    }

    @c5e(23)
    public void setLineSpacingAdd(float f) {
        this.f77236q0 = f;
    }

    @c5e(23)
    public void setLineSpacingMultiplier(@y46(from = 0.0d) float f) {
        this.f77238r0 = f;
    }

    public void setMaxLines(int i) {
        if (i != this.f77234p0) {
            this.f77234p0 = i;
            clearTexture();
            recalculate();
        }
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f77200X = timeInterpolator;
        recalculate();
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f77186J = z;
    }

    public final boolean setState(int[] iArr) {
        this.f77196T = iArr;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    @c5e(23)
    public void setStaticLayoutBuilderConfigurer(@hib h3g h3gVar) {
        if (this.f77242t0 != h3gVar) {
            this.f77242t0 = h3gVar;
            recalculate(true);
        }
    }

    public void setText(@hib CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f77183G, charSequence)) {
            this.f77183G = charSequence;
            this.f77184H = null;
            clearTexture();
            recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.f77201Y = timeInterpolator;
        recalculate();
    }

    public void setTitleTextEllipsize(@efb TextUtils.TruncateAt truncateAt) {
        this.f77182F = truncateAt;
        recalculate();
    }

    public void setTypefaces(Typeface typeface) {
        boolean collapsedTypefaceInternal = setCollapsedTypefaceInternal(typeface);
        boolean expandedTypefaceInternal = setExpandedTypefaceInternal(typeface);
        if (collapsedTypefaceInternal || expandedTypefaceInternal) {
            recalculate();
        }
    }

    private void calculateUsingTextSize(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        if (this.f77183G == null) {
            return;
        }
        float fWidth = this.f77217h.width();
        float fWidth2 = this.f77215g.width();
        if (isClose(f, 1.0f)) {
            f2 = this.f77227m;
            f3 = this.f77218h0;
            this.f77190N = 1.0f;
            typeface = this.f77245w;
        } else {
            float f4 = this.f77225l;
            float f5 = this.f77220i0;
            Typeface typeface2 = this.f77248z;
            if (isClose(f, 0.0f)) {
                this.f77190N = 1.0f;
            } else {
                this.f77190N = lerp(this.f77225l, this.f77227m, f, this.f77201Y) / this.f77225l;
            }
            float f6 = this.f77227m / this.f77225l;
            fWidth = (!z && fWidth2 * f6 > fWidth) ? Math.min(fWidth / f6, fWidth2) : fWidth2;
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        if (fWidth > 0.0f) {
            boolean z2 = this.f77191O != f2;
            boolean z3 = this.f77222j0 != f3;
            boolean z4 = this.f77179C != typeface;
            StaticLayout staticLayout = this.f77224k0;
            boolean z5 = z2 || z3 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || this.f77197U;
            this.f77191O = f2;
            this.f77222j0 = f3;
            this.f77179C = typeface;
            this.f77197U = false;
            this.f77198V.setLinearText(this.f77190N != 1.0f);
            z = z5;
        }
        if (this.f77184H == null || z) {
            this.f77198V.setTextSize(this.f77191O);
            this.f77198V.setTypeface(this.f77179C);
            this.f77198V.setLetterSpacing(this.f77222j0);
            this.f77185I = calculateIsRtl(this.f77183G);
            StaticLayout staticLayoutCreateStaticLayout = createStaticLayout(shouldDrawMultiline() ? this.f77234p0 : 1, fWidth, this.f77185I);
            this.f77224k0 = staticLayoutCreateStaticLayout;
            this.f77184H = staticLayoutCreateStaticLayout.getText();
        }
    }

    public void recalculate(boolean z) {
        if ((this.f77203a.getHeight() <= 0 || this.f77203a.getWidth() <= 0) && !z) {
            return;
        }
        calculateBaseOffsets(z);
        calculateCurrentOffsets();
    }

    public void setCollapsedBounds(@efb Rect rect) {
        setCollapsedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setExpandedBounds(@efb Rect rect) {
        setExpandedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }
}
