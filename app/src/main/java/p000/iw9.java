package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.C3146R;
import com.google.android.material.button.MaterialButton;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class iw9 {

    /* JADX INFO: renamed from: u */
    @sy1(api = 21)
    public static final boolean f48652u = true;

    /* JADX INFO: renamed from: v */
    public static final boolean f48653v = false;

    /* JADX INFO: renamed from: a */
    public final MaterialButton f48654a;

    /* JADX INFO: renamed from: b */
    @efb
    public n8f f48655b;

    /* JADX INFO: renamed from: c */
    public int f48656c;

    /* JADX INFO: renamed from: d */
    public int f48657d;

    /* JADX INFO: renamed from: e */
    public int f48658e;

    /* JADX INFO: renamed from: f */
    public int f48659f;

    /* JADX INFO: renamed from: g */
    public int f48660g;

    /* JADX INFO: renamed from: h */
    public int f48661h;

    /* JADX INFO: renamed from: i */
    @hib
    public PorterDuff.Mode f48662i;

    /* JADX INFO: renamed from: j */
    @hib
    public ColorStateList f48663j;

    /* JADX INFO: renamed from: k */
    @hib
    public ColorStateList f48664k;

    /* JADX INFO: renamed from: l */
    @hib
    public ColorStateList f48665l;

    /* JADX INFO: renamed from: m */
    @hib
    public Drawable f48666m;

    /* JADX INFO: renamed from: q */
    public boolean f48670q;

    /* JADX INFO: renamed from: s */
    public LayerDrawable f48672s;

    /* JADX INFO: renamed from: t */
    public int f48673t;

    /* JADX INFO: renamed from: n */
    public boolean f48667n = false;

    /* JADX INFO: renamed from: o */
    public boolean f48668o = false;

    /* JADX INFO: renamed from: p */
    public boolean f48669p = false;

    /* JADX INFO: renamed from: r */
    public boolean f48671r = true;

    public iw9(MaterialButton materialButton, @efb n8f n8fVar) {
        this.f48654a = materialButton;
        this.f48655b = n8fVar;
    }

    private Drawable createBackground() {
        b3a b3aVar = new b3a(this.f48655b);
        b3aVar.initializeElevationOverlay(this.f48654a.getContext());
        yp4.setTintList(b3aVar, this.f48663j);
        PorterDuff.Mode mode = this.f48662i;
        if (mode != null) {
            yp4.setTintMode(b3aVar, mode);
        }
        b3aVar.setStroke(this.f48661h, this.f48664k);
        b3a b3aVar2 = new b3a(this.f48655b);
        b3aVar2.setTint(0);
        b3aVar2.setStroke(this.f48661h, this.f48667n ? ow9.getColor(this.f48654a, C3146R.attr.colorSurface) : 0);
        if (f48652u) {
            b3a b3aVar3 = new b3a(this.f48655b);
            this.f48666m = b3aVar3;
            yp4.setTint(b3aVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(iae.sanitizeRippleDrawableColor(this.f48665l), wrapDrawableWithInset(new LayerDrawable(new Drawable[]{b3aVar2, b3aVar})), this.f48666m);
            this.f48672s = rippleDrawable;
            return rippleDrawable;
        }
        hae haeVar = new hae(this.f48655b);
        this.f48666m = haeVar;
        yp4.setTintList(haeVar, iae.sanitizeRippleDrawableColor(this.f48665l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{b3aVar2, b3aVar, this.f48666m});
        this.f48672s = layerDrawable;
        return wrapDrawableWithInset(layerDrawable);
    }

    @hib
    private b3a getMaterialShapeDrawable(boolean z) {
        LayerDrawable layerDrawable = this.f48672s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f48652u ? (b3a) ((LayerDrawable) ((InsetDrawable) this.f48672s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (b3a) this.f48672s.getDrawable(!z ? 1 : 0);
    }

    @hib
    private b3a getSurfaceColorStrokeDrawable() {
        return getMaterialShapeDrawable(true);
    }

    private void setVerticalInsets(@yc4 int i, @yc4 int i2) {
        int paddingStart = o8i.getPaddingStart(this.f48654a);
        int paddingTop = this.f48654a.getPaddingTop();
        int paddingEnd = o8i.getPaddingEnd(this.f48654a);
        int paddingBottom = this.f48654a.getPaddingBottom();
        int i3 = this.f48658e;
        int i4 = this.f48659f;
        this.f48659f = i2;
        this.f48658e = i;
        if (!this.f48668o) {
            updateBackground();
        }
        o8i.setPaddingRelative(this.f48654a, paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    private void updateBackground() {
        this.f48654a.setInternalBackground(createBackground());
        b3a b3aVarM13465b = m13465b();
        if (b3aVarM13465b != null) {
            b3aVarM13465b.setElevation(this.f48673t);
            b3aVarM13465b.setState(this.f48654a.getDrawableState());
        }
    }

    private void updateButtonShape(@efb n8f n8fVar) {
        if (f48653v && !this.f48668o) {
            int paddingStart = o8i.getPaddingStart(this.f48654a);
            int paddingTop = this.f48654a.getPaddingTop();
            int paddingEnd = o8i.getPaddingEnd(this.f48654a);
            int paddingBottom = this.f48654a.getPaddingBottom();
            updateBackground();
            o8i.setPaddingRelative(this.f48654a, paddingStart, paddingTop, paddingEnd, paddingBottom);
            return;
        }
        if (m13465b() != null) {
            m13465b().setShapeAppearanceModel(n8fVar);
        }
        if (getSurfaceColorStrokeDrawable() != null) {
            getSurfaceColorStrokeDrawable().setShapeAppearanceModel(n8fVar);
        }
        if (getMaskDrawable() != null) {
            getMaskDrawable().setShapeAppearanceModel(n8fVar);
        }
    }

    private void updateStroke() {
        b3a b3aVarM13465b = m13465b();
        b3a surfaceColorStrokeDrawable = getSurfaceColorStrokeDrawable();
        if (b3aVarM13465b != null) {
            b3aVarM13465b.setStroke(this.f48661h, this.f48664k);
            if (surfaceColorStrokeDrawable != null) {
                surfaceColorStrokeDrawable.setStroke(this.f48661h, this.f48667n ? ow9.getColor(this.f48654a, C3146R.attr.colorSurface) : 0);
            }
        }
    }

    @efb
    private InsetDrawable wrapDrawableWithInset(Drawable drawable) {
        return new InsetDrawable(drawable, this.f48656c, this.f48658e, this.f48657d, this.f48659f);
    }

    /* JADX INFO: renamed from: a */
    public int m13464a() {
        return this.f48660g;
    }

    @hib
    /* JADX INFO: renamed from: b */
    public b3a m13465b() {
        return getMaterialShapeDrawable(false);
    }

    @hib
    /* JADX INFO: renamed from: c */
    public ColorStateList m13466c() {
        return this.f48665l;
    }

    @efb
    /* JADX INFO: renamed from: d */
    public n8f m13467d() {
        return this.f48655b;
    }

    @hib
    /* JADX INFO: renamed from: e */
    public ColorStateList m13468e() {
        return this.f48664k;
    }

    /* JADX INFO: renamed from: f */
    public int m13469f() {
        return this.f48661h;
    }

    /* JADX INFO: renamed from: g */
    public ColorStateList m13470g() {
        return this.f48663j;
    }

    public int getInsetBottom() {
        return this.f48659f;
    }

    public int getInsetTop() {
        return this.f48658e;
    }

    @hib
    public i9f getMaskDrawable() {
        LayerDrawable layerDrawable = this.f48672s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f48672s.getNumberOfLayers() > 2 ? (i9f) this.f48672s.getDrawable(2) : (i9f) this.f48672s.getDrawable(1);
    }

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode m13471h() {
        return this.f48662i;
    }

    /* JADX INFO: renamed from: i */
    public boolean m13472i() {
        return this.f48668o;
    }

    /* JADX INFO: renamed from: j */
    public boolean m13473j() {
        return this.f48670q;
    }

    /* JADX INFO: renamed from: k */
    public boolean m13474k() {
        return this.f48671r;
    }

    /* JADX INFO: renamed from: l */
    public void m13475l(@efb TypedArray typedArray) {
        this.f48656c = typedArray.getDimensionPixelOffset(C3146R.styleable.MaterialButton_android_insetLeft, 0);
        this.f48657d = typedArray.getDimensionPixelOffset(C3146R.styleable.MaterialButton_android_insetRight, 0);
        this.f48658e = typedArray.getDimensionPixelOffset(C3146R.styleable.MaterialButton_android_insetTop, 0);
        this.f48659f = typedArray.getDimensionPixelOffset(C3146R.styleable.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(C3146R.styleable.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(C3146R.styleable.MaterialButton_cornerRadius, -1);
            this.f48660g = dimensionPixelSize;
            m13481r(this.f48655b.withCornerSize(dimensionPixelSize));
            this.f48669p = true;
        }
        this.f48661h = typedArray.getDimensionPixelSize(C3146R.styleable.MaterialButton_strokeWidth, 0);
        this.f48662i = cci.parseTintMode(typedArray.getInt(C3146R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f48663j = a3a.getColorStateList(this.f48654a.getContext(), typedArray, C3146R.styleable.MaterialButton_backgroundTint);
        this.f48664k = a3a.getColorStateList(this.f48654a.getContext(), typedArray, C3146R.styleable.MaterialButton_strokeColor);
        this.f48665l = a3a.getColorStateList(this.f48654a.getContext(), typedArray, C3146R.styleable.MaterialButton_rippleColor);
        this.f48670q = typedArray.getBoolean(C3146R.styleable.MaterialButton_android_checkable, false);
        this.f48673t = typedArray.getDimensionPixelSize(C3146R.styleable.MaterialButton_elevation, 0);
        this.f48671r = typedArray.getBoolean(C3146R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = o8i.getPaddingStart(this.f48654a);
        int paddingTop = this.f48654a.getPaddingTop();
        int paddingEnd = o8i.getPaddingEnd(this.f48654a);
        int paddingBottom = this.f48654a.getPaddingBottom();
        if (typedArray.hasValue(C3146R.styleable.MaterialButton_android_background)) {
            m13477n();
        } else {
            updateBackground();
        }
        o8i.setPaddingRelative(this.f48654a, paddingStart + this.f48656c, paddingTop + this.f48658e, paddingEnd + this.f48657d, paddingBottom + this.f48659f);
    }

    /* JADX INFO: renamed from: m */
    public void m13476m(int i) {
        if (m13465b() != null) {
            m13465b().setTint(i);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m13477n() {
        this.f48668o = true;
        this.f48654a.setSupportBackgroundTintList(this.f48663j);
        this.f48654a.setSupportBackgroundTintMode(this.f48662i);
    }

    /* JADX INFO: renamed from: o */
    public void m13478o(boolean z) {
        this.f48670q = z;
    }

    /* JADX INFO: renamed from: p */
    public void m13479p(int i) {
        if (this.f48669p && this.f48660g == i) {
            return;
        }
        this.f48660g = i;
        this.f48669p = true;
        m13481r(this.f48655b.withCornerSize(i));
    }

    /* JADX INFO: renamed from: q */
    public void m13480q(@hib ColorStateList colorStateList) {
        if (this.f48665l != colorStateList) {
            this.f48665l = colorStateList;
            boolean z = f48652u;
            if (z && (this.f48654a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f48654a.getBackground()).setColor(iae.sanitizeRippleDrawableColor(colorStateList));
            } else {
                if (z || !(this.f48654a.getBackground() instanceof hae)) {
                    return;
                }
                ((hae) this.f48654a.getBackground()).setTintList(iae.sanitizeRippleDrawableColor(colorStateList));
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m13481r(@efb n8f n8fVar) {
        this.f48655b = n8fVar;
        updateButtonShape(n8fVar);
    }

    /* JADX INFO: renamed from: s */
    public void m13482s(boolean z) {
        this.f48667n = z;
        updateStroke();
    }

    public void setInsetBottom(@yc4 int i) {
        setVerticalInsets(this.f48658e, i);
    }

    public void setInsetTop(@yc4 int i) {
        setVerticalInsets(i, this.f48659f);
    }

    /* JADX INFO: renamed from: t */
    public void m13483t(@hib ColorStateList colorStateList) {
        if (this.f48664k != colorStateList) {
            this.f48664k = colorStateList;
            updateStroke();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m13484u(int i) {
        if (this.f48661h != i) {
            this.f48661h = i;
            updateStroke();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m13485v(@hib ColorStateList colorStateList) {
        if (this.f48663j != colorStateList) {
            this.f48663j = colorStateList;
            if (m13465b() != null) {
                yp4.setTintList(m13465b(), this.f48663j);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m13486w(@hib PorterDuff.Mode mode) {
        if (this.f48662i != mode) {
            this.f48662i = mode;
            if (m13465b() == null || this.f48662i == null) {
                return;
            }
            yp4.setTintMode(m13465b(), this.f48662i);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m13487x(boolean z) {
        this.f48671r = z;
    }

    /* JADX INFO: renamed from: y */
    public void m13488y(int i, int i2) {
        Drawable drawable = this.f48666m;
        if (drawable != null) {
            drawable.setBounds(this.f48656c, this.f48658e, i2 - this.f48657d, i - this.f48659f);
        }
    }
}
