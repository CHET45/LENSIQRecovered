package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.material.C3146R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import p000.a9f;
import p000.n8f;
import p000.o8f;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public class b3a extends Drawable implements p2h, i9f {

    /* JADX INFO: renamed from: d2 */
    public static final String f12533d2 = "b3a";

    /* JADX INFO: renamed from: e2 */
    public static final float f12534e2 = 0.75f;

    /* JADX INFO: renamed from: f2 */
    public static final float f12535f2 = 0.25f;

    /* JADX INFO: renamed from: g2 */
    public static final int f12536g2 = 0;

    /* JADX INFO: renamed from: h2 */
    public static final int f12537h2 = 1;

    /* JADX INFO: renamed from: i2 */
    public static final int f12538i2 = 2;

    /* JADX INFO: renamed from: j2 */
    public static final Paint f12539j2;

    /* JADX INFO: renamed from: C */
    public final Path f12540C;

    /* JADX INFO: renamed from: F */
    public final RectF f12541F;

    /* JADX INFO: renamed from: H */
    public final RectF f12542H;

    /* JADX INFO: renamed from: L */
    public final Region f12543L;

    /* JADX INFO: renamed from: M */
    public final Region f12544M;

    /* JADX INFO: renamed from: M1 */
    public final o8f f12545M1;

    /* JADX INFO: renamed from: N */
    public n8f f12546N;

    /* JADX INFO: renamed from: Q */
    public final Paint f12547Q;

    /* JADX INFO: renamed from: V1 */
    @hib
    public PorterDuffColorFilter f12548V1;

    /* JADX INFO: renamed from: X */
    public final Paint f12549X;

    /* JADX INFO: renamed from: Y */
    public final i8f f12550Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final o8f.InterfaceC10229b f12551Z;

    /* JADX INFO: renamed from: Z1 */
    @hib
    public PorterDuffColorFilter f12552Z1;

    /* JADX INFO: renamed from: a */
    public C1723d f12553a;

    /* JADX INFO: renamed from: a2 */
    public int f12554a2;

    /* JADX INFO: renamed from: b */
    public final a9f.AbstractC0116j[] f12555b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final RectF f12556b2;

    /* JADX INFO: renamed from: c */
    public final a9f.AbstractC0116j[] f12557c;

    /* JADX INFO: renamed from: c2 */
    public boolean f12558c2;

    /* JADX INFO: renamed from: d */
    public final BitSet f12559d;

    /* JADX INFO: renamed from: e */
    public boolean f12560e;

    /* JADX INFO: renamed from: f */
    public final Matrix f12561f;

    /* JADX INFO: renamed from: m */
    public final Path f12562m;

    /* JADX INFO: renamed from: b3a$a */
    public class C1720a implements o8f.InterfaceC10229b {
        public C1720a() {
        }

        @Override // p000.o8f.InterfaceC10229b
        public void onCornerPathCreated(@efb a9f a9fVar, Matrix matrix, int i) {
            b3a.this.f12559d.set(i, a9fVar.m226a());
            b3a.this.f12555b[i] = a9fVar.m227b(matrix);
        }

        @Override // p000.o8f.InterfaceC10229b
        public void onEdgePathCreated(@efb a9f a9fVar, Matrix matrix, int i) {
            b3a.this.f12559d.set(i + 4, a9fVar.m226a());
            b3a.this.f12557c[i] = a9fVar.m227b(matrix);
        }
    }

    /* JADX INFO: renamed from: b3a$b */
    public class C1721b implements n8f.InterfaceC9746c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f12564a;

        public C1721b(float f) {
            this.f12564a = f;
        }

        @Override // p000.n8f.InterfaceC9746c
        @efb
        public x03 apply(@efb x03 x03Var) {
            return x03Var instanceof uxd ? x03Var : new C12572sh(this.f12564a, x03Var);
        }
    }

    /* JADX INFO: renamed from: b3a$c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1722c {
    }

    static {
        Paint paint = new Paint(1);
        f12539j2 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public b3a() {
        this(new n8f());
    }

    @hib
    private PorterDuffColorFilter calculatePaintColorTintFilter(@efb Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int iM2879f = m2879f(color);
        this.f12554a2 = iM2879f;
        if (iM2879f != color) {
            return new PorterDuffColorFilter(iM2879f, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void calculatePath(@efb RectF rectF, @efb Path path) {
        m2878e(rectF, path);
        if (this.f12553a.f12575j != 1.0f) {
            this.f12561f.reset();
            Matrix matrix = this.f12561f;
            float f = this.f12553a.f12575j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f12561f);
        }
        path.computeBounds(this.f12556b2, true);
    }

    private void calculateStrokePath() {
        n8f n8fVarWithTransformedCornerSizes = getShapeAppearanceModel().withTransformedCornerSizes(new C1721b(-getStrokeInsetLength()));
        this.f12546N = n8fVarWithTransformedCornerSizes;
        this.f12545M1.calculatePath(n8fVarWithTransformedCornerSizes, this.f12553a.f12576k, getBoundsInsetByStroke(), this.f12540C);
    }

    @efb
    private PorterDuffColorFilter calculateTintColorTintFilter(@efb ColorStateList colorStateList, @efb PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m2879f(colorForState);
        }
        this.f12554a2 = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @efb
    private PorterDuffColorFilter calculateTintFilter(@hib ColorStateList colorStateList, @hib PorterDuff.Mode mode, @efb Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? calculatePaintColorTintFilter(paint, z) : calculateTintColorTintFilter(colorStateList, mode, z);
    }

    @efb
    public static b3a createWithElevationOverlay(Context context) {
        return createWithElevationOverlay(context, 0.0f);
    }

    private void drawCompatShadow(@efb Canvas canvas) {
        if (this.f12559d.cardinality() > 0) {
            Log.w(f12533d2, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f12553a.f12584s != 0) {
            canvas.drawPath(this.f12562m, this.f12550Y.getShadowPaint());
        }
        for (int i = 0; i < 4; i++) {
            this.f12555b[i].draw(this.f12550Y, this.f12553a.f12583r, canvas);
            this.f12557c[i].draw(this.f12550Y, this.f12553a.f12583r, canvas);
        }
        if (this.f12558c2) {
            int shadowOffsetX = getShadowOffsetX();
            int shadowOffsetY = getShadowOffsetY();
            canvas.translate(-shadowOffsetX, -shadowOffsetY);
            canvas.drawPath(this.f12562m, f12539j2);
            canvas.translate(shadowOffsetX, shadowOffsetY);
        }
    }

    private void drawFillShape(@efb Canvas canvas) {
        drawShape(canvas, this.f12547Q, this.f12562m, this.f12553a.f12566a, m2882i());
    }

    private void drawShape(@efb Canvas canvas, @efb Paint paint, @efb Path path, @efb n8f n8fVar, @efb RectF rectF) {
        if (!n8fVar.isRoundRect(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float cornerSize = n8fVar.getTopRightCornerSize().getCornerSize(rectF) * this.f12553a.f12576k;
            canvas.drawRoundRect(rectF, cornerSize, cornerSize, paint);
        }
    }

    @efb
    private RectF getBoundsInsetByStroke() {
        this.f12542H.set(m2882i());
        float strokeInsetLength = getStrokeInsetLength();
        this.f12542H.inset(strokeInsetLength, strokeInsetLength);
        return this.f12542H;
    }

    private float getStrokeInsetLength() {
        if (hasStroke()) {
            return this.f12549X.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean hasCompatShadow() {
        C1723d c1723d = this.f12553a;
        int i = c1723d.f12582q;
        return i != 1 && c1723d.f12583r > 0 && (i == 2 || requiresCompatShadow());
    }

    private boolean hasFill() {
        Paint.Style style = this.f12553a.f12587v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean hasStroke() {
        Paint.Style style = this.f12553a.f12587v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f12549X.getStrokeWidth() > 0.0f;
    }

    private void invalidateSelfIgnoreShape() {
        super.invalidateSelf();
    }

    private void maybeDrawCompatShadow(@efb Canvas canvas) {
        if (hasCompatShadow()) {
            canvas.save();
            prepareCanvasForShadow(canvas);
            if (!this.f12558c2) {
                drawCompatShadow(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f12556b2.width() - getBounds().width());
            int iHeight = (int) (this.f12556b2.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f12556b2.width()) + (this.f12553a.f12583r * 2) + iWidth, ((int) this.f12556b2.height()) + (this.f12553a.f12583r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f = (getBounds().left - this.f12553a.f12583r) - iWidth;
            float f2 = (getBounds().top - this.f12553a.f12583r) - iHeight;
            canvas2.translate(-f, -f2);
            drawCompatShadow(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int modulateAlpha(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private void prepareCanvasForShadow(@efb Canvas canvas) {
        canvas.translate(getShadowOffsetX(), getShadowOffsetY());
    }

    private boolean updateColorsForState(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f12553a.f12569d == null || color2 == (colorForState2 = this.f12553a.f12569d.getColorForState(iArr, (color2 = this.f12547Q.getColor())))) {
            z = false;
        } else {
            this.f12547Q.setColor(colorForState2);
            z = true;
        }
        if (this.f12553a.f12570e == null || color == (colorForState = this.f12553a.f12570e.getColorForState(iArr, (color = this.f12549X.getColor())))) {
            return z;
        }
        this.f12549X.setColor(colorForState);
        return true;
    }

    private boolean updateTintFilter() {
        PorterDuffColorFilter porterDuffColorFilter = this.f12548V1;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f12552Z1;
        C1723d c1723d = this.f12553a;
        this.f12548V1 = calculateTintFilter(c1723d.f12572g, c1723d.f12573h, this.f12547Q, true);
        C1723d c1723d2 = this.f12553a;
        this.f12552Z1 = calculateTintFilter(c1723d2.f12571f, c1723d2.f12573h, this.f12549X, false);
        C1723d c1723d3 = this.f12553a;
        if (c1723d3.f12586u) {
            this.f12550Y.setShadowColor(c1723d3.f12572g.getColorForState(getState(), 0));
        }
        return (pkb.equals(porterDuffColorFilter, this.f12548V1) && pkb.equals(porterDuffColorFilter2, this.f12552Z1)) ? false : true;
    }

    private void updateZ() {
        float z = getZ();
        this.f12553a.f12583r = (int) Math.ceil(0.75f * z);
        this.f12553a.f12584s = (int) Math.ceil(z * 0.25f);
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        this.f12547Q.setColorFilter(this.f12548V1);
        int alpha = this.f12547Q.getAlpha();
        this.f12547Q.setAlpha(modulateAlpha(alpha, this.f12553a.f12578m));
        this.f12549X.setColorFilter(this.f12552Z1);
        this.f12549X.setStrokeWidth(this.f12553a.f12577l);
        int alpha2 = this.f12549X.getAlpha();
        this.f12549X.setAlpha(modulateAlpha(alpha2, this.f12553a.f12578m));
        if (this.f12560e) {
            calculateStrokePath();
            calculatePath(m2882i(), this.f12562m);
            this.f12560e = false;
        }
        maybeDrawCompatShadow(canvas);
        if (hasFill()) {
            drawFillShape(canvas);
        }
        if (hasStroke()) {
            mo2881h(canvas);
        }
        this.f12547Q.setAlpha(alpha);
        this.f12549X.setAlpha(alpha2);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    /* JADX INFO: renamed from: e */
    public final void m2878e(@efb RectF rectF, @efb Path path) {
        o8f o8fVar = this.f12545M1;
        C1723d c1723d = this.f12553a;
        o8fVar.calculatePath(c1723d.f12566a, c1723d.f12576k, rectF, this.f12551Z, path);
    }

    @g92
    @p7e({p7e.EnumC10826a.f69935b})
    /* JADX INFO: renamed from: f */
    public int m2879f(@g92 int i) {
        float z = getZ() + getParentAbsoluteElevation();
        fy4 fy4Var = this.f12553a.f12567b;
        return fy4Var != null ? fy4Var.compositeOverlayIfNeeded(i, z) : i;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    /* JADX INFO: renamed from: g */
    public void m2880g(@efb Canvas canvas, @efb Paint paint, @efb Path path, @efb RectF rectF) {
        drawShape(canvas, paint, path, this.f12553a.f12566a, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f12553a.f12578m;
    }

    public float getBottomLeftCornerResolvedSize() {
        return this.f12553a.f12566a.getBottomLeftCornerSize().getCornerSize(m2882i());
    }

    public float getBottomRightCornerResolvedSize() {
        return this.f12553a.f12566a.getBottomRightCornerSize().getCornerSize(m2882i());
    }

    @Override // android.graphics.drawable.Drawable
    @hib
    public Drawable.ConstantState getConstantState() {
        return this.f12553a;
    }

    public float getElevation() {
        return this.f12553a.f12580o;
    }

    @hib
    public ColorStateList getFillColor() {
        return this.f12553a.f12569d;
    }

    public float getInterpolation() {
        return this.f12553a.f12576k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @omg(21)
    public void getOutline(@efb Outline outline) {
        if (this.f12553a.f12582q == 2) {
            return;
        }
        if (isRoundRect()) {
            outline.setRoundRect(getBounds(), getTopLeftCornerResolvedSize() * this.f12553a.f12576k);
        } else {
            calculatePath(m2882i(), this.f12562m);
            rq4.setOutlineToPath(outline, this.f12562m);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@efb Rect rect) {
        Rect rect2 = this.f12553a.f12574i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Paint.Style getPaintStyle() {
        return this.f12553a.f12587v;
    }

    public float getParentAbsoluteElevation() {
        return this.f12553a.f12579n;
    }

    @Deprecated
    public void getPathForSize(int i, int i2, @efb Path path) {
        m2878e(new RectF(0.0f, 0.0f, i, i2), path);
    }

    @g92
    public int getResolvedTintColor() {
        return this.f12554a2;
    }

    public float getScale() {
        return this.f12553a.f12575j;
    }

    public int getShadowCompatRotation() {
        return this.f12553a.f12585t;
    }

    public int getShadowCompatibilityMode() {
        return this.f12553a.f12582q;
    }

    @Deprecated
    public int getShadowElevation() {
        return (int) getElevation();
    }

    public int getShadowOffsetX() {
        return (int) (((double) this.f12553a.f12584s) * Math.sin(Math.toRadians(r0.f12585t)));
    }

    public int getShadowOffsetY() {
        return (int) (((double) this.f12553a.f12584s) * Math.cos(Math.toRadians(r0.f12585t)));
    }

    public int getShadowRadius() {
        return this.f12553a.f12583r;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public int getShadowVerticalOffset() {
        return this.f12553a.f12584s;
    }

    @Override // p000.i9f
    @efb
    public n8f getShapeAppearanceModel() {
        return this.f12553a.f12566a;
    }

    @hib
    @Deprecated
    public c9f getShapedViewModel() {
        n8f shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof c9f) {
            return (c9f) shapeAppearanceModel;
        }
        return null;
    }

    @hib
    public ColorStateList getStrokeColor() {
        return this.f12553a.f12570e;
    }

    @hib
    public ColorStateList getStrokeTintList() {
        return this.f12553a.f12571f;
    }

    public float getStrokeWidth() {
        return this.f12553a.f12577l;
    }

    @hib
    public ColorStateList getTintList() {
        return this.f12553a.f12572g;
    }

    public float getTopLeftCornerResolvedSize() {
        return this.f12553a.f12566a.getTopLeftCornerSize().getCornerSize(m2882i());
    }

    public float getTopRightCornerResolvedSize() {
        return this.f12553a.f12566a.getTopRightCornerSize().getCornerSize(m2882i());
    }

    public float getTranslationZ() {
        return this.f12553a.f12581p;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f12543L.set(getBounds());
        calculatePath(m2882i(), this.f12562m);
        this.f12544M.setPath(this.f12562m, this.f12543L);
        this.f12543L.op(this.f12544M, Region.Op.DIFFERENCE);
        return this.f12543L;
    }

    public float getZ() {
        return getElevation() + getTranslationZ();
    }

    @p7e({p7e.EnumC10826a.f69935b})
    /* JADX INFO: renamed from: h */
    public void mo2881h(@efb Canvas canvas) {
        drawShape(canvas, this.f12549X, this.f12540C, this.f12546N, getBoundsInsetByStroke());
    }

    @efb
    /* JADX INFO: renamed from: i */
    public RectF m2882i() {
        this.f12541F.set(getBounds());
        return this.f12541F;
    }

    public void initializeElevationOverlay(Context context) {
        this.f12553a.f12567b = new fy4(context);
        updateZ();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f12560e = true;
        super.invalidateSelf();
    }

    public boolean isElevationOverlayEnabled() {
        fy4 fy4Var = this.f12553a.f12567b;
        return fy4Var != null && fy4Var.isThemeElevationOverlayEnabled();
    }

    public boolean isElevationOverlayInitialized() {
        return this.f12553a.f12567b != null;
    }

    public boolean isPointInTransparentRegion(int i, int i2) {
        return getTransparentRegion().contains(i, i2);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public boolean isRoundRect() {
        return this.f12553a.f12566a.isRoundRect(m2882i());
    }

    @Deprecated
    public boolean isShadowEnabled() {
        int i = this.f12553a.f12582q;
        return i == 0 || i == 2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f12553a.f12572g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f12553a.f12571f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f12553a.f12570e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f12553a.f12569d) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    @efb
    public Drawable mutate() {
        this.f12553a = new C1723d(this.f12553a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f12560e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = updateColorsForState(iArr) || updateTintFilter();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public boolean requiresCompatShadow() {
        return (isRoundRect() || this.f12562m.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@h78(from = 0, m12174to = coe.f17274d) int i) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12578m != i) {
            c1723d.f12578m = i;
            invalidateSelfIgnoreShape();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@hib ColorFilter colorFilter) {
        this.f12553a.f12568c = colorFilter;
        invalidateSelfIgnoreShape();
    }

    public void setCornerSize(float f) {
        setShapeAppearanceModel(this.f12553a.f12566a.withCornerSize(f));
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setEdgeIntersectionCheckEnable(boolean z) {
        this.f12545M1.m18420a(z);
    }

    public void setElevation(float f) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12580o != f) {
            c1723d.f12580o = f;
            updateZ();
        }
    }

    public void setFillColor(@hib ColorStateList colorStateList) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12569d != colorStateList) {
            c1723d.f12569d = colorStateList;
            onStateChange(getState());
        }
    }

    public void setInterpolation(float f) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12576k != f) {
            c1723d.f12576k = f;
            this.f12560e = true;
            invalidateSelf();
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12574i == null) {
            c1723d.f12574i = new Rect();
        }
        this.f12553a.f12574i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void setPaintStyle(Paint.Style style) {
        this.f12553a.f12587v = style;
        invalidateSelfIgnoreShape();
    }

    public void setParentAbsoluteElevation(float f) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12579n != f) {
            c1723d.f12579n = f;
            updateZ();
        }
    }

    public void setScale(float f) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12575j != f) {
            c1723d.f12575j = f;
            invalidateSelf();
        }
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setShadowBitmapDrawingEnable(boolean z) {
        this.f12558c2 = z;
    }

    public void setShadowColor(int i) {
        this.f12550Y.setShadowColor(i);
        this.f12553a.f12586u = false;
        invalidateSelfIgnoreShape();
    }

    public void setShadowCompatRotation(int i) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12585t != i) {
            c1723d.f12585t = i;
            invalidateSelfIgnoreShape();
        }
    }

    public void setShadowCompatibilityMode(int i) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12582q != i) {
            c1723d.f12582q = i;
            invalidateSelfIgnoreShape();
        }
    }

    @Deprecated
    public void setShadowElevation(int i) {
        setElevation(i);
    }

    @Deprecated
    public void setShadowEnabled(boolean z) {
        setShadowCompatibilityMode(!z ? 1 : 0);
    }

    @Deprecated
    public void setShadowRadius(int i) {
        this.f12553a.f12583r = i;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setShadowVerticalOffset(int i) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12584s != i) {
            c1723d.f12584s = i;
            invalidateSelfIgnoreShape();
        }
    }

    @Override // p000.i9f
    public void setShapeAppearanceModel(@efb n8f n8fVar) {
        this.f12553a.f12566a = n8fVar;
        invalidateSelf();
    }

    @Deprecated
    public void setShapedViewModel(@efb c9f c9fVar) {
        setShapeAppearanceModel(c9fVar);
    }

    public void setStroke(float f, @g92 int i) {
        setStrokeWidth(f);
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(@hib ColorStateList colorStateList) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12570e != colorStateList) {
            c1723d.f12570e = colorStateList;
            onStateChange(getState());
        }
    }

    public void setStrokeTint(ColorStateList colorStateList) {
        this.f12553a.f12571f = colorStateList;
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    public void setStrokeWidth(float f) {
        this.f12553a.f12577l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTint(@g92 int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTintList(@hib ColorStateList colorStateList) {
        this.f12553a.f12572g = colorStateList;
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTintMode(@hib PorterDuff.Mode mode) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12573h != mode) {
            c1723d.f12573h = mode;
            updateTintFilter();
            invalidateSelfIgnoreShape();
        }
    }

    public void setTranslationZ(float f) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12581p != f) {
            c1723d.f12581p = f;
            updateZ();
        }
    }

    public void setUseTintColorForShadow(boolean z) {
        C1723d c1723d = this.f12553a;
        if (c1723d.f12586u != z) {
            c1723d.f12586u = z;
            invalidateSelf();
        }
    }

    public void setZ(float f) {
        setTranslationZ(f - getElevation());
    }

    public b3a(@efb Context context, @hib AttributeSet attributeSet, @gc0 int i, @dbg int i2) {
        this(n8f.builder(context, attributeSet, i, i2).build());
    }

    @efb
    public static b3a createWithElevationOverlay(Context context, float f) {
        int color = ow9.getColor(context, C3146R.attr.colorSurface, b3a.class.getSimpleName());
        b3a b3aVar = new b3a();
        b3aVar.initializeElevationOverlay(context);
        b3aVar.setFillColor(ColorStateList.valueOf(color));
        b3aVar.setElevation(f);
        return b3aVar;
    }

    public void setCornerSize(@efb x03 x03Var) {
        setShapeAppearanceModel(this.f12553a.f12566a.withCornerSize(x03Var));
    }

    @Deprecated
    public b3a(@efb c9f c9fVar) {
        this((n8f) c9fVar);
    }

    public void setStroke(float f, @hib ColorStateList colorStateList) {
        setStrokeWidth(f);
        setStrokeColor(colorStateList);
    }

    public b3a(@efb n8f n8fVar) {
        this(new C1723d(n8fVar, null));
    }

    public void setStrokeTint(@g92 int i) {
        setStrokeTint(ColorStateList.valueOf(i));
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public b3a(@efb C1723d c1723d) {
        o8f o8fVar;
        this.f12555b = new a9f.AbstractC0116j[4];
        this.f12557c = new a9f.AbstractC0116j[4];
        this.f12559d = new BitSet(8);
        this.f12561f = new Matrix();
        this.f12562m = new Path();
        this.f12540C = new Path();
        this.f12541F = new RectF();
        this.f12542H = new RectF();
        this.f12543L = new Region();
        this.f12544M = new Region();
        Paint paint = new Paint(1);
        this.f12547Q = paint;
        Paint paint2 = new Paint(1);
        this.f12549X = paint2;
        this.f12550Y = new i8f();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            o8fVar = o8f.getInstance();
        } else {
            o8fVar = new o8f();
        }
        this.f12545M1 = o8fVar;
        this.f12556b2 = new RectF();
        this.f12558c2 = true;
        this.f12553a = c1723d;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        updateTintFilter();
        updateColorsForState(getState());
        this.f12551Z = new C1720a();
    }

    /* JADX INFO: renamed from: b3a$d */
    @p7e({p7e.EnumC10826a.f69935b})
    public static class C1723d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        @efb
        public n8f f12566a;

        /* JADX INFO: renamed from: b */
        @hib
        public fy4 f12567b;

        /* JADX INFO: renamed from: c */
        @hib
        public ColorFilter f12568c;

        /* JADX INFO: renamed from: d */
        @hib
        public ColorStateList f12569d;

        /* JADX INFO: renamed from: e */
        @hib
        public ColorStateList f12570e;

        /* JADX INFO: renamed from: f */
        @hib
        public ColorStateList f12571f;

        /* JADX INFO: renamed from: g */
        @hib
        public ColorStateList f12572g;

        /* JADX INFO: renamed from: h */
        @hib
        public PorterDuff.Mode f12573h;

        /* JADX INFO: renamed from: i */
        @hib
        public Rect f12574i;

        /* JADX INFO: renamed from: j */
        public float f12575j;

        /* JADX INFO: renamed from: k */
        public float f12576k;

        /* JADX INFO: renamed from: l */
        public float f12577l;

        /* JADX INFO: renamed from: m */
        public int f12578m;

        /* JADX INFO: renamed from: n */
        public float f12579n;

        /* JADX INFO: renamed from: o */
        public float f12580o;

        /* JADX INFO: renamed from: p */
        public float f12581p;

        /* JADX INFO: renamed from: q */
        public int f12582q;

        /* JADX INFO: renamed from: r */
        public int f12583r;

        /* JADX INFO: renamed from: s */
        public int f12584s;

        /* JADX INFO: renamed from: t */
        public int f12585t;

        /* JADX INFO: renamed from: u */
        public boolean f12586u;

        /* JADX INFO: renamed from: v */
        public Paint.Style f12587v;

        public C1723d(@efb n8f n8fVar, @hib fy4 fy4Var) {
            this.f12569d = null;
            this.f12570e = null;
            this.f12571f = null;
            this.f12572g = null;
            this.f12573h = PorterDuff.Mode.SRC_IN;
            this.f12574i = null;
            this.f12575j = 1.0f;
            this.f12576k = 1.0f;
            this.f12578m = 255;
            this.f12579n = 0.0f;
            this.f12580o = 0.0f;
            this.f12581p = 0.0f;
            this.f12582q = 0;
            this.f12583r = 0;
            this.f12584s = 0;
            this.f12585t = 0;
            this.f12586u = false;
            this.f12587v = Paint.Style.FILL_AND_STROKE;
            this.f12566a = n8fVar;
            this.f12567b = fy4Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @efb
        public Drawable newDrawable() {
            b3a b3aVar = new b3a(this);
            b3aVar.f12560e = true;
            return b3aVar;
        }

        public C1723d(@efb C1723d c1723d) {
            this.f12569d = null;
            this.f12570e = null;
            this.f12571f = null;
            this.f12572g = null;
            this.f12573h = PorterDuff.Mode.SRC_IN;
            this.f12574i = null;
            this.f12575j = 1.0f;
            this.f12576k = 1.0f;
            this.f12578m = 255;
            this.f12579n = 0.0f;
            this.f12580o = 0.0f;
            this.f12581p = 0.0f;
            this.f12582q = 0;
            this.f12583r = 0;
            this.f12584s = 0;
            this.f12585t = 0;
            this.f12586u = false;
            this.f12587v = Paint.Style.FILL_AND_STROKE;
            this.f12566a = c1723d.f12566a;
            this.f12567b = c1723d.f12567b;
            this.f12577l = c1723d.f12577l;
            this.f12568c = c1723d.f12568c;
            this.f12569d = c1723d.f12569d;
            this.f12570e = c1723d.f12570e;
            this.f12573h = c1723d.f12573h;
            this.f12572g = c1723d.f12572g;
            this.f12578m = c1723d.f12578m;
            this.f12575j = c1723d.f12575j;
            this.f12584s = c1723d.f12584s;
            this.f12582q = c1723d.f12582q;
            this.f12586u = c1723d.f12586u;
            this.f12576k = c1723d.f12576k;
            this.f12579n = c1723d.f12579n;
            this.f12580o = c1723d.f12580o;
            this.f12581p = c1723d.f12581p;
            this.f12583r = c1723d.f12583r;
            this.f12585t = c1723d.f12585t;
            this.f12571f = c1723d.f12571f;
            this.f12587v = c1723d.f12587v;
            if (c1723d.f12574i != null) {
                this.f12574i = new Rect(c1723d.f12574i);
            }
        }
    }
}
