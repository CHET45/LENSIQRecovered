package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.C3146R;
import p000.brg;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class p4h extends b3a implements brg.InterfaceC2025b {

    /* JADX INFO: renamed from: B2 */
    @dbg
    public static final int f69646B2 = C3146R.style.Widget_MaterialComponents_Tooltip;

    /* JADX INFO: renamed from: C2 */
    @gc0
    public static final int f69647C2 = C3146R.attr.tooltipStyle;

    /* JADX INFO: renamed from: A2 */
    public float f69648A2;

    /* JADX INFO: renamed from: k2 */
    @hib
    public CharSequence f69649k2;

    /* JADX INFO: renamed from: l2 */
    @efb
    public final Context f69650l2;

    /* JADX INFO: renamed from: m2 */
    @hib
    public final Paint.FontMetrics f69651m2;

    /* JADX INFO: renamed from: n2 */
    @efb
    public final brg f69652n2;

    /* JADX INFO: renamed from: o2 */
    @efb
    public final View.OnLayoutChangeListener f69653o2;

    /* JADX INFO: renamed from: p2 */
    @efb
    public final Rect f69654p2;

    /* JADX INFO: renamed from: q2 */
    public int f69655q2;

    /* JADX INFO: renamed from: r2 */
    public int f69656r2;

    /* JADX INFO: renamed from: s2 */
    public int f69657s2;

    /* JADX INFO: renamed from: t2 */
    public int f69658t2;

    /* JADX INFO: renamed from: u2 */
    public int f69659u2;

    /* JADX INFO: renamed from: v2 */
    public int f69660v2;

    /* JADX INFO: renamed from: w2 */
    public float f69661w2;

    /* JADX INFO: renamed from: x2 */
    public float f69662x2;

    /* JADX INFO: renamed from: y2 */
    public final float f69663y2;

    /* JADX INFO: renamed from: z2 */
    public float f69664z2;

    /* JADX INFO: renamed from: p4h$a */
    public class ViewOnLayoutChangeListenerC10795a implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC10795a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            p4h.this.updateLocationOnScreen(view);
        }
    }

    private p4h(@efb Context context, AttributeSet attributeSet, @gc0 int i, @dbg int i2) {
        super(context, attributeSet, i, i2);
        this.f69651m2 = new Paint.FontMetrics();
        brg brgVar = new brg(this);
        this.f69652n2 = brgVar;
        this.f69653o2 = new ViewOnLayoutChangeListenerC10795a();
        this.f69654p2 = new Rect();
        this.f69661w2 = 1.0f;
        this.f69662x2 = 1.0f;
        this.f69663y2 = 0.5f;
        this.f69664z2 = 0.5f;
        this.f69648A2 = 1.0f;
        this.f69650l2 = context;
        brgVar.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        brgVar.getTextPaint().setTextAlign(Paint.Align.CENTER);
    }

    private float calculatePointerOffset() {
        int i;
        if (((this.f69654p2.right - getBounds().right) - this.f69660v2) - this.f69658t2 < 0) {
            i = ((this.f69654p2.right - getBounds().right) - this.f69660v2) - this.f69658t2;
        } else {
            if (((this.f69654p2.left - getBounds().left) - this.f69660v2) + this.f69658t2 <= 0) {
                return 0.0f;
            }
            i = ((this.f69654p2.left - getBounds().left) - this.f69660v2) + this.f69658t2;
        }
        return i;
    }

    private float calculateTextCenterFromBaseline() {
        this.f69652n2.getTextPaint().getFontMetrics(this.f69651m2);
        Paint.FontMetrics fontMetrics = this.f69651m2;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float calculateTextOriginAndAlignment(@efb Rect rect) {
        return rect.centerY() - calculateTextCenterFromBaseline();
    }

    @efb
    public static p4h create(@efb Context context) {
        return createFromAttributes(context, null, f69647C2, f69646B2);
    }

    @efb
    public static p4h createFromAttributes(@efb Context context, @hib AttributeSet attributeSet, @gc0 int i, @dbg int i2) {
        p4h p4hVar = new p4h(context, attributeSet, i, i2);
        p4hVar.loadFromAttributes(attributeSet, i, i2);
        return p4hVar;
    }

    private jw4 createMarkerEdge() {
        float f = -calculatePointerOffset();
        float fWidth = ((float) (((double) getBounds().width()) - (((double) this.f69659u2) * Math.sqrt(2.0d)))) / 2.0f;
        return new kzb(new fu9(this.f69659u2), Math.min(Math.max(f, -fWidth), fWidth));
    }

    private void drawText(@efb Canvas canvas) {
        if (this.f69649k2 == null) {
            return;
        }
        int iCalculateTextOriginAndAlignment = (int) calculateTextOriginAndAlignment(getBounds());
        if (this.f69652n2.getTextAppearance() != null) {
            this.f69652n2.getTextPaint().drawableState = getState();
            this.f69652n2.updateTextPaintDrawState(this.f69650l2);
            this.f69652n2.getTextPaint().setAlpha((int) (this.f69648A2 * 255.0f));
        }
        CharSequence charSequence = this.f69649k2;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), iCalculateTextOriginAndAlignment, this.f69652n2.getTextPaint());
    }

    private float getTextWidth() {
        CharSequence charSequence = this.f69649k2;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f69652n2.getTextWidth(charSequence.toString());
    }

    private void loadFromAttributes(@hib AttributeSet attributeSet, @gc0 int i, @dbg int i2) {
        TypedArray typedArrayObtainStyledAttributes = zwg.obtainStyledAttributes(this.f69650l2, attributeSet, C3146R.styleable.Tooltip, i, i2, new int[0]);
        this.f69659u2 = this.f69650l2.getResources().getDimensionPixelSize(C3146R.dimen.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
        setText(typedArrayObtainStyledAttributes.getText(C3146R.styleable.Tooltip_android_text));
        iqg textAppearance = a3a.getTextAppearance(this.f69650l2, typedArrayObtainStyledAttributes, C3146R.styleable.Tooltip_android_textAppearance);
        if (textAppearance != null && typedArrayObtainStyledAttributes.hasValue(C3146R.styleable.Tooltip_android_textColor)) {
            textAppearance.setTextColor(a3a.getColorStateList(this.f69650l2, typedArrayObtainStyledAttributes, C3146R.styleable.Tooltip_android_textColor));
        }
        setTextAppearance(textAppearance);
        setFillColor(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(C3146R.styleable.Tooltip_backgroundTint, ow9.layer(ua2.setAlphaComponent(ow9.getColor(this.f69650l2, R.attr.colorBackground, p4h.class.getCanonicalName()), nb2.f63863k), ua2.setAlphaComponent(ow9.getColor(this.f69650l2, C3146R.attr.colorOnBackground, p4h.class.getCanonicalName()), 153)))));
        setStrokeColor(ColorStateList.valueOf(ow9.getColor(this.f69650l2, C3146R.attr.colorSurface, p4h.class.getCanonicalName())));
        this.f69655q2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3146R.styleable.Tooltip_android_padding, 0);
        this.f69656r2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3146R.styleable.Tooltip_android_minWidth, 0);
        this.f69657s2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3146R.styleable.Tooltip_android_minHeight, 0);
        this.f69658t2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3146R.styleable.Tooltip_android_layout_margin, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLocationOnScreen(@efb View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f69660v2 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f69654p2);
    }

    public void detachView(@hib View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.f69653o2);
    }

    @Override // p000.b3a, android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        canvas.save();
        float fCalculatePointerOffset = calculatePointerOffset();
        float f = (float) (-((((double) this.f69659u2) * Math.sqrt(2.0d)) - ((double) this.f69659u2)));
        canvas.scale(this.f69661w2, this.f69662x2, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.f69664z2));
        canvas.translate(fCalculatePointerOffset, f);
        super.draw(canvas);
        drawText(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f69652n2.getTextPaint().getTextSize(), this.f69657s2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f69655q2 * 2) + getTextWidth(), this.f69656r2);
    }

    public int getLayoutMargin() {
        return this.f69658t2;
    }

    public int getMinHeight() {
        return this.f69657s2;
    }

    public int getMinWidth() {
        return this.f69656r2;
    }

    @hib
    public CharSequence getText() {
        return this.f69649k2;
    }

    @hib
    public iqg getTextAppearance() {
        return this.f69652n2.getTextAppearance();
    }

    public int getTextPadding() {
        return this.f69655q2;
    }

    @Override // p000.b3a, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
    }

    @Override // p000.b3a, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // p000.brg.InterfaceC2025b
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setLayoutMargin(@fkd int i) {
        this.f69658t2 = i;
        invalidateSelf();
    }

    public void setMinHeight(@fkd int i) {
        this.f69657s2 = i;
        invalidateSelf();
    }

    public void setMinWidth(@fkd int i) {
        this.f69656r2 = i;
        invalidateSelf();
    }

    public void setRelativeToView(@hib View view) {
        if (view == null) {
            return;
        }
        updateLocationOnScreen(view);
        view.addOnLayoutChangeListener(this.f69653o2);
    }

    public void setRevealFraction(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        this.f69664z2 = 1.2f;
        this.f69661w2 = f;
        this.f69662x2 = f;
        this.f69648A2 = C13280ty.lerp(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    public void setText(@hib CharSequence charSequence) {
        if (TextUtils.equals(this.f69649k2, charSequence)) {
            return;
        }
        this.f69649k2 = charSequence;
        this.f69652n2.setTextWidthDirty(true);
        invalidateSelf();
    }

    public void setTextAppearance(@hib iqg iqgVar) {
        this.f69652n2.setTextAppearance(iqgVar, this.f69650l2);
    }

    public void setTextAppearanceResource(@dbg int i) {
        setTextAppearance(new iqg(this.f69650l2, i));
    }

    public void setTextPadding(@fkd int i) {
        this.f69655q2 = i;
        invalidateSelf();
    }

    public void setTextResource(@g8g int i) {
        setText(this.f69650l2.getResources().getString(i));
    }

    @efb
    public static p4h createFromAttributes(@efb Context context, @hib AttributeSet attributeSet) {
        return createFromAttributes(context, attributeSet, f69647C2, f69646B2);
    }
}
