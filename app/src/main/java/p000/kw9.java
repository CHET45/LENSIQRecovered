package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.material.C3146R;
import com.google.android.material.card.MaterialCardView;
import p000.n8f;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class kw9 {

    /* JADX INFO: renamed from: A */
    public static final double f55483A = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: B */
    public static final float f55484B = 1.5f;

    /* JADX INFO: renamed from: C */
    public static final int f55485C = 2;

    /* JADX INFO: renamed from: D */
    public static final Drawable f55486D;

    /* JADX INFO: renamed from: E */
    public static final int f55487E = 300;

    /* JADX INFO: renamed from: z */
    public static final int f55488z = -1;

    /* JADX INFO: renamed from: a */
    @efb
    public final MaterialCardView f55489a;

    /* JADX INFO: renamed from: c */
    @efb
    public final b3a f55491c;

    /* JADX INFO: renamed from: d */
    @efb
    public final b3a f55492d;

    /* JADX INFO: renamed from: e */
    @yc4
    public int f55493e;

    /* JADX INFO: renamed from: f */
    @yc4
    public int f55494f;

    /* JADX INFO: renamed from: g */
    public int f55495g;

    /* JADX INFO: renamed from: h */
    @yc4
    public int f55496h;

    /* JADX INFO: renamed from: i */
    @hib
    public Drawable f55497i;

    /* JADX INFO: renamed from: j */
    @hib
    public Drawable f55498j;

    /* JADX INFO: renamed from: k */
    @hib
    public ColorStateList f55499k;

    /* JADX INFO: renamed from: l */
    @hib
    public ColorStateList f55500l;

    /* JADX INFO: renamed from: m */
    @hib
    public n8f f55501m;

    /* JADX INFO: renamed from: n */
    @hib
    public ColorStateList f55502n;

    /* JADX INFO: renamed from: o */
    @hib
    public Drawable f55503o;

    /* JADX INFO: renamed from: p */
    @hib
    public LayerDrawable f55504p;

    /* JADX INFO: renamed from: q */
    @hib
    public b3a f55505q;

    /* JADX INFO: renamed from: r */
    @hib
    public b3a f55506r;

    /* JADX INFO: renamed from: t */
    public boolean f55508t;

    /* JADX INFO: renamed from: u */
    @hib
    public ValueAnimator f55509u;

    /* JADX INFO: renamed from: v */
    public final TimeInterpolator f55510v;

    /* JADX INFO: renamed from: w */
    public final int f55511w;

    /* JADX INFO: renamed from: x */
    public final int f55512x;

    /* JADX INFO: renamed from: b */
    @efb
    public final Rect f55490b = new Rect();

    /* JADX INFO: renamed from: s */
    public boolean f55507s = false;

    /* JADX INFO: renamed from: y */
    public float f55513y = 0.0f;

    /* JADX INFO: renamed from: kw9$a */
    public class C8535a extends InsetDrawable {
        public C8535a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f55486D = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public kw9(@efb MaterialCardView materialCardView, AttributeSet attributeSet, int i, @dbg int i2) {
        this.f55489a = materialCardView;
        b3a b3aVar = new b3a(materialCardView.getContext(), attributeSet, i, i2);
        this.f55491c = b3aVar;
        b3aVar.initializeElevationOverlay(materialCardView.getContext());
        b3aVar.setShadowColor(-12303292);
        n8f.C9745b builder = b3aVar.getShapeAppearanceModel().toBuilder();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C3146R.styleable.CardView, i, C3146R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(C3146R.styleable.CardView_cardCornerRadius)) {
            builder.setAllCornerSizes(typedArrayObtainStyledAttributes.getDimension(C3146R.styleable.CardView_cardCornerRadius, 0.0f));
        }
        this.f55492d = new b3a();
        m15063I(builder.build());
        this.f55510v = c0b.resolveThemeInterpolator(materialCardView.getContext(), C3146R.attr.motionEasingLinearInterpolator, C13280ty.f86289a);
        this.f55511w = c0b.resolveThemeDuration(materialCardView.getContext(), C3146R.attr.motionDurationShort2, 300);
        this.f55512x = c0b.resolveThemeDuration(materialCardView.getContext(), C3146R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    private float calculateActualCornerPadding() {
        return Math.max(Math.max(calculateCornerPaddingForCornerTreatment(this.f55501m.getTopLeftCorner(), this.f55491c.getTopLeftCornerResolvedSize()), calculateCornerPaddingForCornerTreatment(this.f55501m.getTopRightCorner(), this.f55491c.getTopRightCornerResolvedSize())), Math.max(calculateCornerPaddingForCornerTreatment(this.f55501m.getBottomRightCorner(), this.f55491c.getBottomRightCornerResolvedSize()), calculateCornerPaddingForCornerTreatment(this.f55501m.getBottomLeftCorner(), this.f55491c.getBottomLeftCornerResolvedSize())));
    }

    private float calculateCornerPaddingForCornerTreatment(a13 a13Var, float f) {
        if (a13Var instanceof wbe) {
            return (float) ((1.0d - f55483A) * ((double) f));
        }
        if (a13Var instanceof le3) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    private float calculateHorizontalBackgroundPadding() {
        return this.f55489a.getMaxCardElevation() + (shouldAddCornerPaddingOutsideCardBackground() ? calculateActualCornerPadding() : 0.0f);
    }

    private float calculateVerticalBackgroundPadding() {
        return (this.f55489a.getMaxCardElevation() * 1.5f) + (shouldAddCornerPaddingOutsideCardBackground() ? calculateActualCornerPadding() : 0.0f);
    }

    private boolean canClipToOutline() {
        return this.f55491c.isRoundRect();
    }

    @efb
    private Drawable createCompatRippleDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        b3a b3aVarCreateForegroundShapeDrawable = createForegroundShapeDrawable();
        this.f55505q = b3aVarCreateForegroundShapeDrawable;
        b3aVarCreateForegroundShapeDrawable.setFillColor(this.f55499k);
        stateListDrawable.addState(new int[]{16842919}, this.f55505q);
        return stateListDrawable;
    }

    @efb
    private Drawable createForegroundRippleDrawable() {
        if (!iae.f46253a) {
            return createCompatRippleDrawable();
        }
        this.f55506r = createForegroundShapeDrawable();
        return new RippleDrawable(this.f55499k, null, this.f55506r);
    }

    @efb
    private b3a createForegroundShapeDrawable() {
        return new b3a(this.f55501m);
    }

    @efb
    private Drawable getClickableForeground() {
        if (this.f55503o == null) {
            this.f55503o = createForegroundRippleDrawable();
        }
        if (this.f55504p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f55503o, this.f55492d, this.f55498j});
            this.f55504p = layerDrawable;
            layerDrawable.setId(2, C3146R.id.mtrl_card_checked_layer_id);
        }
        return this.f55504p;
    }

    private float getParentCardViewCalculatedCornerPadding() {
        if (this.f55489a.getPreventCornerOverlap() && this.f55489a.getUseCompatPadding()) {
            return (float) ((1.0d - f55483A) * ((double) this.f55489a.getCardViewRadius()));
        }
        return 0.0f;
    }

    @efb
    private Drawable insetDrawable(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f55489a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(calculateVerticalBackgroundPadding());
            iCeil = (int) Math.ceil(calculateHorizontalBackgroundPadding());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new C8535a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    private boolean isCheckedIconBottom() {
        return (this.f55495g & 80) == 80;
    }

    private boolean isCheckedIconEnd() {
        return (this.f55495g & cb7.f16190c) == 8388613;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateCheckedIcon$0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f55498j.setAlpha((int) (255.0f * fFloatValue));
        this.f55513y = fFloatValue;
    }

    private boolean shouldAddCornerPaddingInsideCardBackground() {
        return this.f55489a.getPreventCornerOverlap() && !canClipToOutline();
    }

    private boolean shouldAddCornerPaddingOutsideCardBackground() {
        return this.f55489a.getPreventCornerOverlap() && canClipToOutline() && this.f55489a.getUseCompatPadding();
    }

    private void updateInsetForeground(Drawable drawable) {
        if (this.f55489a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f55489a.getForeground()).setDrawable(drawable);
        } else {
            this.f55489a.setForeground(insetDrawable(drawable));
        }
    }

    private void updateRippleColor() {
        Drawable drawable;
        if (iae.f46253a && (drawable = this.f55503o) != null) {
            ((RippleDrawable) drawable).setColor(this.f55499k);
            return;
        }
        b3a b3aVar = this.f55505q;
        if (b3aVar != null) {
            b3aVar.setFillColor(this.f55499k);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m15055A(@hib Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = yp4.wrap(drawable).mutate();
            this.f55498j = drawableMutate;
            yp4.setTintList(drawableMutate, this.f55500l);
            setChecked(this.f55489a.isChecked());
        } else {
            this.f55498j = f55486D;
        }
        LayerDrawable layerDrawable = this.f55504p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C3146R.id.mtrl_card_checked_layer_id, this.f55498j);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m15056B(int i) {
        this.f55495g = i;
        m15092v(this.f55489a.getMeasuredWidth(), this.f55489a.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: C */
    public void m15057C(@yc4 int i) {
        this.f55493e = i;
    }

    /* JADX INFO: renamed from: D */
    public void m15058D(@yc4 int i) {
        this.f55494f = i;
    }

    /* JADX INFO: renamed from: E */
    public void m15059E(@hib ColorStateList colorStateList) {
        this.f55500l = colorStateList;
        Drawable drawable = this.f55498j;
        if (drawable != null) {
            yp4.setTintList(drawable, colorStateList);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m15060F(float f) {
        m15063I(this.f55501m.withCornerSize(f));
        this.f55497i.invalidateSelf();
        if (shouldAddCornerPaddingOutsideCardBackground() || shouldAddCornerPaddingInsideCardBackground()) {
            m15068N();
        }
        if (shouldAddCornerPaddingOutsideCardBackground()) {
            m15070P();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m15061G(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        this.f55491c.setInterpolation(f);
        b3a b3aVar = this.f55492d;
        if (b3aVar != null) {
            b3aVar.setInterpolation(f);
        }
        b3a b3aVar2 = this.f55506r;
        if (b3aVar2 != null) {
            b3aVar2.setInterpolation(f);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m15062H(@hib ColorStateList colorStateList) {
        this.f55499k = colorStateList;
        updateRippleColor();
    }

    /* JADX INFO: renamed from: I */
    public void m15063I(@efb n8f n8fVar) {
        this.f55501m = n8fVar;
        this.f55491c.setShapeAppearanceModel(n8fVar);
        this.f55491c.setShadowBitmapDrawingEnable(!r0.isRoundRect());
        b3a b3aVar = this.f55492d;
        if (b3aVar != null) {
            b3aVar.setShapeAppearanceModel(n8fVar);
        }
        b3a b3aVar2 = this.f55506r;
        if (b3aVar2 != null) {
            b3aVar2.setShapeAppearanceModel(n8fVar);
        }
        b3a b3aVar3 = this.f55505q;
        if (b3aVar3 != null) {
            b3aVar3.setShapeAppearanceModel(n8fVar);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m15064J(ColorStateList colorStateList) {
        if (this.f55502n == colorStateList) {
            return;
        }
        this.f55502n = colorStateList;
        m15071Q();
    }

    /* JADX INFO: renamed from: K */
    public void m15065K(@yc4 int i) {
        if (i == this.f55496h) {
            return;
        }
        this.f55496h = i;
        m15071Q();
    }

    /* JADX INFO: renamed from: L */
    public void m15066L(int i, int i2, int i3, int i4) {
        this.f55490b.set(i, i2, i3, i4);
        m15068N();
    }

    /* JADX INFO: renamed from: M */
    public void m15067M() {
        Drawable drawable = this.f55497i;
        Drawable clickableForeground = this.f55489a.isClickable() ? getClickableForeground() : this.f55492d;
        this.f55497i = clickableForeground;
        if (drawable != clickableForeground) {
            updateInsetForeground(clickableForeground);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m15068N() {
        int iCalculateActualCornerPadding = (int) (((shouldAddCornerPaddingInsideCardBackground() || shouldAddCornerPaddingOutsideCardBackground()) ? calculateActualCornerPadding() : 0.0f) - getParentCardViewCalculatedCornerPadding());
        MaterialCardView materialCardView = this.f55489a;
        Rect rect = this.f55490b;
        materialCardView.m6041e(rect.left + iCalculateActualCornerPadding, rect.top + iCalculateActualCornerPadding, rect.right + iCalculateActualCornerPadding, rect.bottom + iCalculateActualCornerPadding);
    }

    /* JADX INFO: renamed from: O */
    public void m15069O() {
        this.f55491c.setElevation(this.f55489a.getCardElevation());
    }

    /* JADX INFO: renamed from: P */
    public void m15070P() {
        if (!m15089s()) {
            this.f55489a.setBackgroundInternal(insetDrawable(this.f55491c));
        }
        this.f55489a.setForeground(insetDrawable(this.f55497i));
    }

    /* JADX INFO: renamed from: Q */
    public void m15071Q() {
        this.f55492d.setStroke(this.f55496h, this.f55502n);
    }

    public void animateCheckedIcon(boolean z) {
        float f = z ? 1.0f : 0.0f;
        float f2 = z ? 1.0f - this.f55513y : this.f55513y;
        ValueAnimator valueAnimator = this.f55509u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f55509u = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f55513y, f);
        this.f55509u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jw9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f52132a.lambda$animateCheckedIcon$0(valueAnimator2);
            }
        });
        this.f55509u.setInterpolator(this.f55510v);
        this.f55509u.setDuration((long) ((z ? this.f55511w : this.f55512x) * f2));
        this.f55509u.start();
    }

    @c5e(api = 23)
    /* JADX INFO: renamed from: b */
    public void m15072b() {
        Drawable drawable = this.f55503o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f55503o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f55503o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @efb
    /* JADX INFO: renamed from: c */
    public b3a m15073c() {
        return this.f55491c;
    }

    /* JADX INFO: renamed from: d */
    public ColorStateList m15074d() {
        return this.f55491c.getFillColor();
    }

    /* JADX INFO: renamed from: e */
    public ColorStateList m15075e() {
        return this.f55492d.getFillColor();
    }

    @hib
    /* JADX INFO: renamed from: f */
    public Drawable m15076f() {
        return this.f55498j;
    }

    /* JADX INFO: renamed from: g */
    public int m15077g() {
        return this.f55495g;
    }

    @yc4
    /* JADX INFO: renamed from: h */
    public int m15078h() {
        return this.f55493e;
    }

    @yc4
    /* JADX INFO: renamed from: i */
    public int m15079i() {
        return this.f55494f;
    }

    @hib
    /* JADX INFO: renamed from: j */
    public ColorStateList m15080j() {
        return this.f55500l;
    }

    /* JADX INFO: renamed from: k */
    public float m15081k() {
        return this.f55491c.getTopLeftCornerResolvedSize();
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    /* JADX INFO: renamed from: l */
    public float m15082l() {
        return this.f55491c.getInterpolation();
    }

    @hib
    /* JADX INFO: renamed from: m */
    public ColorStateList m15083m() {
        return this.f55499k;
    }

    /* JADX INFO: renamed from: n */
    public n8f m15084n() {
        return this.f55501m;
    }

    @g92
    /* JADX INFO: renamed from: o */
    public int m15085o() {
        ColorStateList colorStateList = this.f55502n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @hib
    /* JADX INFO: renamed from: p */
    public ColorStateList m15086p() {
        return this.f55502n;
    }

    @yc4
    /* JADX INFO: renamed from: q */
    public int m15087q() {
        return this.f55496h;
    }

    @efb
    /* JADX INFO: renamed from: r */
    public Rect m15088r() {
        return this.f55490b;
    }

    /* JADX INFO: renamed from: s */
    public boolean m15089s() {
        return this.f55507s;
    }

    public void setChecked(boolean z) {
        setChecked(z, false);
    }

    /* JADX INFO: renamed from: t */
    public boolean m15090t() {
        return this.f55508t;
    }

    /* JADX INFO: renamed from: u */
    public void m15091u(@efb TypedArray typedArray) {
        ColorStateList colorStateList = a3a.getColorStateList(this.f55489a.getContext(), typedArray, C3146R.styleable.MaterialCardView_strokeColor);
        this.f55502n = colorStateList;
        if (colorStateList == null) {
            this.f55502n = ColorStateList.valueOf(-1);
        }
        this.f55496h = typedArray.getDimensionPixelSize(C3146R.styleable.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(C3146R.styleable.MaterialCardView_android_checkable, false);
        this.f55508t = z;
        this.f55489a.setLongClickable(z);
        this.f55500l = a3a.getColorStateList(this.f55489a.getContext(), typedArray, C3146R.styleable.MaterialCardView_checkedIconTint);
        m15055A(a3a.getDrawable(this.f55489a.getContext(), typedArray, C3146R.styleable.MaterialCardView_checkedIcon));
        m15058D(typedArray.getDimensionPixelSize(C3146R.styleable.MaterialCardView_checkedIconSize, 0));
        m15057C(typedArray.getDimensionPixelSize(C3146R.styleable.MaterialCardView_checkedIconMargin, 0));
        this.f55495g = typedArray.getInteger(C3146R.styleable.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateList2 = a3a.getColorStateList(this.f55489a.getContext(), typedArray, C3146R.styleable.MaterialCardView_rippleColor);
        this.f55499k = colorStateList2;
        if (colorStateList2 == null) {
            this.f55499k = ColorStateList.valueOf(ow9.getColor(this.f55489a, C3146R.attr.colorControlHighlight));
        }
        m15095y(a3a.getColorStateList(this.f55489a.getContext(), typedArray, C3146R.styleable.MaterialCardView_cardForegroundColor));
        updateRippleColor();
        m15069O();
        m15071Q();
        this.f55489a.setBackgroundInternal(insetDrawable(this.f55491c));
        Drawable clickableForeground = this.f55489a.isClickable() ? getClickableForeground() : this.f55492d;
        this.f55497i = clickableForeground;
        this.f55489a.setForeground(insetDrawable(clickableForeground));
    }

    /* JADX INFO: renamed from: v */
    public void m15092v(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.f55504p != null) {
            if (this.f55489a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(calculateVerticalBackgroundPadding() * 2.0f);
                iCeil2 = (int) Math.ceil(calculateHorizontalBackgroundPadding() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = isCheckedIconEnd() ? ((i - this.f55493e) - this.f55494f) - iCeil2 : this.f55493e;
            int i6 = isCheckedIconBottom() ? this.f55493e : ((i2 - this.f55493e) - this.f55494f) - iCeil;
            int i7 = isCheckedIconEnd() ? this.f55493e : ((i - this.f55493e) - this.f55494f) - iCeil2;
            int i8 = isCheckedIconBottom() ? ((i2 - this.f55493e) - this.f55494f) - iCeil : this.f55493e;
            if (o8i.getLayoutDirection(this.f55489a) == 1) {
                i4 = i7;
                i3 = i5;
            } else {
                i3 = i7;
                i4 = i5;
            }
            this.f55504p.setLayerInset(2, i4, i8, i3, i6);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m15093w(boolean z) {
        this.f55507s = z;
    }

    /* JADX INFO: renamed from: x */
    public void m15094x(ColorStateList colorStateList) {
        this.f55491c.setFillColor(colorStateList);
    }

    /* JADX INFO: renamed from: y */
    public void m15095y(@hib ColorStateList colorStateList) {
        b3a b3aVar = this.f55492d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        b3aVar.setFillColor(colorStateList);
    }

    /* JADX INFO: renamed from: z */
    public void m15096z(boolean z) {
        this.f55508t = z;
    }

    public void setChecked(boolean z, boolean z2) {
        Drawable drawable = this.f55498j;
        if (drawable != null) {
            if (z2) {
                animateCheckedIcon(z);
            } else {
                drawable.setAlpha(z ? 255 : 0);
                this.f55513y = z ? 1.0f : 0.0f;
            }
        }
    }
}
