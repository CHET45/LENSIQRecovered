package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import com.blankj.utilcode.util.C2473f;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.p7e;
import p000.vjc;

/* JADX INFO: loaded from: classes3.dex */
public class i3i extends h3i {

    /* JADX INFO: renamed from: L */
    public static final String f45625L = "VectorDrawableCompat";

    /* JADX INFO: renamed from: M */
    public static final PorterDuff.Mode f45626M = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: M1 */
    public static final int f45627M1 = 1;

    /* JADX INFO: renamed from: N */
    public static final String f45628N = "clip-path";

    /* JADX INFO: renamed from: Q */
    public static final String f45629Q = "group";

    /* JADX INFO: renamed from: V1 */
    public static final int f45630V1 = 2;

    /* JADX INFO: renamed from: X */
    public static final String f45631X = "path";

    /* JADX INFO: renamed from: Y */
    public static final String f45632Y = "vector";

    /* JADX INFO: renamed from: Z */
    public static final int f45633Z = 0;

    /* JADX INFO: renamed from: Z1 */
    public static final int f45634Z1 = 0;

    /* JADX INFO: renamed from: a2 */
    public static final int f45635a2 = 1;

    /* JADX INFO: renamed from: b2 */
    public static final int f45636b2 = 2;

    /* JADX INFO: renamed from: c2 */
    public static final int f45637c2 = 2048;

    /* JADX INFO: renamed from: d2 */
    public static final boolean f45638d2 = false;

    /* JADX INFO: renamed from: C */
    public final float[] f45639C;

    /* JADX INFO: renamed from: F */
    public final Matrix f45640F;

    /* JADX INFO: renamed from: H */
    public final Rect f45641H;

    /* JADX INFO: renamed from: b */
    public C7139h f45642b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f45643c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f45644d;

    /* JADX INFO: renamed from: e */
    public boolean f45645e;

    /* JADX INFO: renamed from: f */
    public boolean f45646f;

    /* JADX INFO: renamed from: m */
    public Drawable.ConstantState f45647m;

    /* JADX INFO: renamed from: i3i$b */
    public static class C7133b extends AbstractC7137f {
        public C7133b() {
        }

        private void updateStateFromTypedArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f45675b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f45674a = vjc.createNodesFromPathData(string2);
            }
            this.f45676c = vmh.getNamedInt(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (vmh.hasAttribute(xmlPullParser, "pathData")) {
                TypedArray typedArrayObtainAttributes = vmh.obtainAttributes(resources, theme, attributeSet, C15299xu.f99260I);
                updateStateFromTypedArray(typedArrayObtainAttributes, xmlPullParser);
                typedArrayObtainAttributes.recycle();
            }
        }

        @Override // p000.i3i.AbstractC7137f
        public boolean isClipPath() {
            return true;
        }

        public C7133b(C7133b c7133b) {
            super(c7133b);
        }
    }

    /* JADX INFO: renamed from: i3i$e */
    public static abstract class AbstractC7136e {
        private AbstractC7136e() {
        }

        public boolean isStateful() {
            return false;
        }

        public boolean onStateChanged(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i3i$h */
    public static class C7139h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public int f45695a;

        /* JADX INFO: renamed from: b */
        public C7138g f45696b;

        /* JADX INFO: renamed from: c */
        public ColorStateList f45697c;

        /* JADX INFO: renamed from: d */
        public PorterDuff.Mode f45698d;

        /* JADX INFO: renamed from: e */
        public boolean f45699e;

        /* JADX INFO: renamed from: f */
        public Bitmap f45700f;

        /* JADX INFO: renamed from: g */
        public int[] f45701g;

        /* JADX INFO: renamed from: h */
        public ColorStateList f45702h;

        /* JADX INFO: renamed from: i */
        public PorterDuff.Mode f45703i;

        /* JADX INFO: renamed from: j */
        public int f45704j;

        /* JADX INFO: renamed from: k */
        public boolean f45705k;

        /* JADX INFO: renamed from: l */
        public boolean f45706l;

        /* JADX INFO: renamed from: m */
        public Paint f45707m;

        public C7139h(C7139h c7139h) {
            this.f45697c = null;
            this.f45698d = i3i.f45626M;
            if (c7139h != null) {
                this.f45695a = c7139h.f45695a;
                C7138g c7138g = new C7138g(c7139h.f45696b);
                this.f45696b = c7138g;
                if (c7139h.f45696b.f45683e != null) {
                    c7138g.f45683e = new Paint(c7139h.f45696b.f45683e);
                }
                if (c7139h.f45696b.f45682d != null) {
                    this.f45696b.f45682d = new Paint(c7139h.f45696b.f45682d);
                }
                this.f45697c = c7139h.f45697c;
                this.f45698d = c7139h.f45698d;
                this.f45699e = c7139h.f45699e;
            }
        }

        public boolean canReuseBitmap(int i, int i2) {
            return i == this.f45700f.getWidth() && i2 == this.f45700f.getHeight();
        }

        public boolean canReuseCache() {
            return !this.f45706l && this.f45702h == this.f45697c && this.f45703i == this.f45698d && this.f45705k == this.f45699e && this.f45704j == this.f45696b.getRootAlpha();
        }

        public void createCachedBitmapIfNeeded(int i, int i2) {
            if (this.f45700f == null || !canReuseBitmap(i, i2)) {
                this.f45700f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f45706l = true;
            }
        }

        public void drawCachedBitmapWithRootAlpha(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f45700f, (Rect) null, rect, getPaint(colorFilter));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f45695a;
        }

        public Paint getPaint(ColorFilter colorFilter) {
            if (!hasTranslucentRoot() && colorFilter == null) {
                return null;
            }
            if (this.f45707m == null) {
                Paint paint = new Paint();
                this.f45707m = paint;
                paint.setFilterBitmap(true);
            }
            this.f45707m.setAlpha(this.f45696b.getRootAlpha());
            this.f45707m.setColorFilter(colorFilter);
            return this.f45707m;
        }

        public boolean hasTranslucentRoot() {
            return this.f45696b.getRootAlpha() < 255;
        }

        public boolean isStateful() {
            return this.f45696b.isStateful();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @efb
        public Drawable newDrawable() {
            return new i3i(this);
        }

        public boolean onStateChanged(int[] iArr) {
            boolean zOnStateChanged = this.f45696b.onStateChanged(iArr);
            this.f45706l |= zOnStateChanged;
            return zOnStateChanged;
        }

        public void updateCacheStates() {
            this.f45702h = this.f45697c;
            this.f45703i = this.f45698d;
            this.f45704j = this.f45696b.getRootAlpha();
            this.f45705k = this.f45699e;
            this.f45706l = false;
        }

        public void updateCachedBitmap(int i, int i2) {
            this.f45700f.eraseColor(0);
            this.f45696b.draw(new Canvas(this.f45700f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @efb
        public Drawable newDrawable(Resources resources) {
            return new i3i(this);
        }

        public C7139h() {
            this.f45697c = null;
            this.f45698d = i3i.f45626M;
            this.f45696b = new C7138g();
        }
    }

    public i3i() {
        this.f45646f = true;
        this.f45639C = new float[9];
        this.f45640F = new Matrix();
        this.f45641H = new Rect();
        this.f45642b = new C7139h();
    }

    /* JADX INFO: renamed from: a */
    public static int m12762a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    @hib
    public static i3i create(@efb Resources resources, @gq4 int i, @hib Resources.Theme theme) {
        i3i i3iVar = new i3i();
        i3iVar.f42259a = f7e.getDrawable(resources, i, theme);
        i3iVar.f45647m = new C7140i(i3iVar.f42259a.getConstantState());
        return i3iVar;
    }

    public static i3i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i3i i3iVar = new i3i();
        i3iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return i3iVar;
    }

    private void inflateInternal(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C7139h c7139h = this.f45642b;
        C7138g c7138g = c7139h.f45696b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c7138g.f45686h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C7135d c7135d = (C7135d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C7134c c7134c = new C7134c();
                    c7134c.inflate(resources, attributeSet, theme, xmlPullParser);
                    c7135d.f45661b.add(c7134c);
                    if (c7134c.getPathName() != null) {
                        c7138g.f45694p.put(c7134c.getPathName(), c7134c);
                    }
                    c7139h.f45695a = c7134c.f45677d | c7139h.f45695a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    C7133b c7133b = new C7133b();
                    c7133b.inflate(resources, attributeSet, theme, xmlPullParser);
                    c7135d.f45661b.add(c7133b);
                    if (c7133b.getPathName() != null) {
                        c7138g.f45694p.put(c7133b.getPathName(), c7133b);
                    }
                    c7139h.f45695a = c7133b.f45677d | c7139h.f45695a;
                } else if ("group".equals(name)) {
                    C7135d c7135d2 = new C7135d();
                    c7135d2.inflate(resources, attributeSet, theme, xmlPullParser);
                    c7135d.f45661b.add(c7135d2);
                    arrayDeque.push(c7135d2);
                    if (c7135d2.getGroupName() != null) {
                        c7138g.f45694p.put(c7135d2.getGroupName(), c7135d2);
                    }
                    c7139h.f45695a = c7135d2.f45670k | c7139h.f45695a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean needMirroring() {
        return isAutoMirrored() && yp4.getLayoutDirection(this) == 1;
    }

    private static PorterDuff.Mode parseTintModeCompat(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void printGroupTree(C7135d c7135d, int i) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = str + pl8.f71328a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("current group is :");
        sb.append(c7135d.getGroupName());
        sb.append(" rotation is ");
        sb.append(c7135d.f45662c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("matrix is :");
        sb2.append(c7135d.getLocalMatrix().toString());
        for (int i3 = 0; i3 < c7135d.f45661b.size(); i3++) {
            AbstractC7136e abstractC7136e = c7135d.f45661b.get(i3);
            if (abstractC7136e instanceof C7135d) {
                printGroupTree((C7135d) abstractC7136e, i + 1);
            } else {
                ((AbstractC7137f) abstractC7136e).printVPath(i + 1);
            }
        }
    }

    private void updateStateFromTypedArray(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C7139h c7139h = this.f45642b;
        C7138g c7138g = c7139h.f45696b;
        c7139h.f45698d = parseTintModeCompat(vmh.getNamedInt(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList namedColorStateList = vmh.getNamedColorStateList(typedArray, xmlPullParser, theme, "tint", 1);
        if (namedColorStateList != null) {
            c7139h.f45697c = namedColorStateList;
        }
        c7139h.f45699e = vmh.getNamedBoolean(typedArray, xmlPullParser, "autoMirrored", 5, c7139h.f45699e);
        c7138g.f45689k = vmh.getNamedFloat(typedArray, xmlPullParser, "viewportWidth", 7, c7138g.f45689k);
        float namedFloat = vmh.getNamedFloat(typedArray, xmlPullParser, "viewportHeight", 8, c7138g.f45690l);
        c7138g.f45690l = namedFloat;
        if (c7138g.f45689k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (namedFloat <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c7138g.f45687i = typedArray.getDimension(3, c7138g.f45687i);
        float dimension = typedArray.getDimension(2, c7138g.f45688j);
        c7138g.f45688j = dimension;
        if (c7138g.f45687i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c7138g.setAlpha(vmh.getNamedFloat(typedArray, xmlPullParser, "alpha", 4, c7138g.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c7138g.f45692n = string;
            c7138g.f45694p.put(string, c7138g);
        }
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    /* JADX INFO: renamed from: b */
    public Object m12763b(String str) {
        return this.f45642b.f45696b.f45694p.get(str);
    }

    /* JADX INFO: renamed from: c */
    public void m12764c(boolean z) {
        this.f45646f = z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f42259a;
        if (drawable == null) {
            return false;
        }
        yp4.canApplyTheme(drawable);
        return false;
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: renamed from: d */
    public PorterDuffColorFilter m12765d(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f45641H);
        if (this.f45641H.width() <= 0 || this.f45641H.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f45644d;
        if (colorFilter == null) {
            colorFilter = this.f45643c;
        }
        canvas.getMatrix(this.f45640F);
        this.f45640F.getValues(this.f45639C);
        float fAbs = Math.abs(this.f45639C[0]);
        float fAbs2 = Math.abs(this.f45639C[4]);
        float fAbs3 = Math.abs(this.f45639C[1]);
        float fAbs4 = Math.abs(this.f45639C[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f45641H.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f45641H.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f45641H;
        canvas.translate(rect.left, rect.top);
        if (needMirroring()) {
            canvas.translate(this.f45641H.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f45641H.offsetTo(0, 0);
        this.f45642b.createCachedBitmapIfNeeded(iMin, iMin2);
        if (!this.f45646f) {
            this.f45642b.updateCachedBitmap(iMin, iMin2);
        } else if (!this.f45642b.canReuseCache()) {
            this.f45642b.updateCachedBitmap(iMin, iMin2);
            this.f45642b.updateCacheStates();
        }
        this.f45642b.drawCachedBitmapWithRootAlpha(canvas, colorFilter, this.f45641H);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f42259a;
        return drawable != null ? yp4.getAlpha(drawable) : this.f45642b.f45696b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f42259a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f45642b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f42259a;
        return drawable != null ? yp4.getColorFilter(drawable) : this.f45644d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f42259a != null) {
            return new C7140i(this.f42259a.getConstantState());
        }
        this.f45642b.f45695a = getChangingConfigurations();
        return this.f45642b;
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f42259a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f45642b.f45696b.f45688j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f42259a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f45642b.f45696b.f45687i;
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public float getPixelSize() {
        C7138g c7138g;
        C7139h c7139h = this.f45642b;
        if (c7139h == null || (c7138g = c7139h.f45696b) == null) {
            return 1.0f;
        }
        float f = c7138g.f45687i;
        if (f == 0.0f) {
            return 1.0f;
        }
        float f2 = c7138g.f45688j;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        float f3 = c7138g.f45690l;
        if (f3 == 0.0f) {
            return 1.0f;
        }
        float f4 = c7138g.f45689k;
        if (f4 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f4 / f, f3 / f2);
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f42259a;
        return drawable != null ? yp4.isAutoMirrored(drawable) : this.f45642b.f45699e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C7139h c7139h;
        ColorStateList colorStateList;
        Drawable drawable = this.f42259a;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c7139h = this.f45642b) != null && (c7139h.isStateful() || ((colorStateList = this.f45642b.f45697c) != null && colorStateList.isStateful())));
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f45645e && super.mutate() == this) {
            this.f45642b = new C7139h(this.f45642b);
            this.f45645e = true;
        }
        return this;
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C7139h c7139h = this.f45642b;
        ColorStateList colorStateList = c7139h.f45697c;
        if (colorStateList == null || (mode = c7139h.f45698d) == null) {
            z = false;
        } else {
            this.f45643c = m12765d(this.f45643c, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!c7139h.isStateful() || !c7139h.onStateChanged(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f45642b.f45696b.getRootAlpha() != i) {
            this.f45642b.f45696b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            yp4.setAutoMirrored(drawable, z);
        } else {
            this.f45642b.f45699e = z;
        }
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTint(int i) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            yp4.setTint(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            yp4.setTintList(drawable, colorStateList);
            return;
        }
        C7139h c7139h = this.f45642b;
        if (c7139h.f45697c != colorStateList) {
            c7139h.f45697c = colorStateList;
            this.f45643c = m12765d(this.f45643c, colorStateList, c7139h.f45698d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            yp4.setTintMode(drawable, mode);
            return;
        }
        C7139h c7139h = this.f45642b;
        if (c7139h.f45698d != mode) {
            c7139h.f45698d = mode;
            this.f45643c = m12765d(this.f45643c, c7139h.f45697c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f42259a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: i3i$i */
    @c5e(24)
    public static class C7140i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f45708a;

        public C7140i(Drawable.ConstantState constantState) {
            this.f45708a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f45708a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f45708a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i3i i3iVar = new i3i();
            i3iVar.f42259a = (VectorDrawable) this.f45708a.newDrawable();
            return i3iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i3i i3iVar = new i3i();
            i3iVar.f42259a = (VectorDrawable) this.f45708a.newDrawable(resources);
            return i3iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i3i i3iVar = new i3i();
            i3iVar.f42259a = (VectorDrawable) this.f45708a.newDrawable(resources, theme);
            return i3iVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f45644d = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: i3i$f */
    public static abstract class AbstractC7137f extends AbstractC7136e {

        /* JADX INFO: renamed from: e */
        public static final int f45673e = 0;

        /* JADX INFO: renamed from: a */
        public vjc.C14123b[] f45674a;

        /* JADX INFO: renamed from: b */
        public String f45675b;

        /* JADX INFO: renamed from: c */
        public int f45676c;

        /* JADX INFO: renamed from: d */
        public int f45677d;

        public AbstractC7137f() {
            super();
            this.f45674a = null;
            this.f45676c = 0;
        }

        public void applyTheme(Resources.Theme theme) {
        }

        public boolean canApplyTheme() {
            return false;
        }

        public vjc.C14123b[] getPathData() {
            return this.f45674a;
        }

        public String getPathName() {
            return this.f45675b;
        }

        public boolean isClipPath() {
            return false;
        }

        public String nodesToString(vjc.C14123b[] c14123bArr) {
            String str = C2473f.f17566z;
            for (int i = 0; i < c14123bArr.length; i++) {
                str = str + c14123bArr[i].f91405a + g1i.f38277c;
                for (float f : c14123bArr[i].f91406b) {
                    str = str + f + ",";
                }
            }
            return str;
        }

        public void printVPath(int i) {
            String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + pl8.f71328a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("current path is :");
            sb.append(this.f45675b);
            sb.append(" pathData is ");
            sb.append(nodesToString(this.f45674a));
        }

        public void setPathData(vjc.C14123b[] c14123bArr) {
            if (vjc.canMorph(this.f45674a, c14123bArr)) {
                vjc.updateNodes(this.f45674a, c14123bArr);
            } else {
                this.f45674a = vjc.deepCopyNodes(c14123bArr);
            }
        }

        public void toPath(Path path) {
            path.reset();
            vjc.C14123b[] c14123bArr = this.f45674a;
            if (c14123bArr != null) {
                vjc.C14123b.nodesToPath(c14123bArr, path);
            }
        }

        public AbstractC7137f(AbstractC7137f abstractC7137f) {
            super();
            this.f45674a = null;
            this.f45676c = 0;
            this.f45675b = abstractC7137f.f45675b;
            this.f45677d = abstractC7137f.f45677d;
            this.f45674a = vjc.deepCopyNodes(abstractC7137f.f45674a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            yp4.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C7139h c7139h = this.f45642b;
        c7139h.f45696b = new C7138g();
        TypedArray typedArrayObtainAttributes = vmh.obtainAttributes(resources, theme, attributeSet, C15299xu.f99278a);
        updateStateFromTypedArray(typedArrayObtainAttributes, xmlPullParser, theme);
        typedArrayObtainAttributes.recycle();
        c7139h.f45695a = getChangingConfigurations();
        c7139h.f45706l = true;
        inflateInternal(resources, xmlPullParser, attributeSet, theme);
        this.f45643c = m12765d(this.f45643c, c7139h.f45697c, c7139h.f45698d);
    }

    public i3i(@efb C7139h c7139h) {
        this.f45646f = true;
        this.f45639C = new float[9];
        this.f45640F = new Matrix();
        this.f45641H = new Rect();
        this.f45642b = c7139h;
        this.f45643c = m12765d(this.f45643c, c7139h.f45697c, c7139h.f45698d);
    }

    /* JADX INFO: renamed from: i3i$c */
    public static class C7134c extends AbstractC7137f {

        /* JADX INFO: renamed from: f */
        public int[] f45648f;

        /* JADX INFO: renamed from: g */
        public ti2 f45649g;

        /* JADX INFO: renamed from: h */
        public float f45650h;

        /* JADX INFO: renamed from: i */
        public ti2 f45651i;

        /* JADX INFO: renamed from: j */
        public float f45652j;

        /* JADX INFO: renamed from: k */
        public float f45653k;

        /* JADX INFO: renamed from: l */
        public float f45654l;

        /* JADX INFO: renamed from: m */
        public float f45655m;

        /* JADX INFO: renamed from: n */
        public float f45656n;

        /* JADX INFO: renamed from: o */
        public Paint.Cap f45657o;

        /* JADX INFO: renamed from: p */
        public Paint.Join f45658p;

        /* JADX INFO: renamed from: q */
        public float f45659q;

        public C7134c() {
            this.f45650h = 0.0f;
            this.f45652j = 1.0f;
            this.f45653k = 1.0f;
            this.f45654l = 0.0f;
            this.f45655m = 1.0f;
            this.f45656n = 0.0f;
            this.f45657o = Paint.Cap.BUTT;
            this.f45658p = Paint.Join.MITER;
            this.f45659q = 4.0f;
        }

        private Paint.Cap getStrokeLineCap(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join getStrokeLineJoin(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void updateStateFromTypedArray(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f45648f = null;
            if (vmh.hasAttribute(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f45675b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f45674a = vjc.createNodesFromPathData(string2);
                }
                this.f45651i = vmh.getNamedComplexColor(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f45653k = vmh.getNamedFloat(typedArray, xmlPullParser, "fillAlpha", 12, this.f45653k);
                this.f45657o = getStrokeLineCap(vmh.getNamedInt(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f45657o);
                this.f45658p = getStrokeLineJoin(vmh.getNamedInt(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f45658p);
                this.f45659q = vmh.getNamedFloat(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f45659q);
                this.f45649g = vmh.getNamedComplexColor(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f45652j = vmh.getNamedFloat(typedArray, xmlPullParser, "strokeAlpha", 11, this.f45652j);
                this.f45650h = vmh.getNamedFloat(typedArray, xmlPullParser, "strokeWidth", 4, this.f45650h);
                this.f45655m = vmh.getNamedFloat(typedArray, xmlPullParser, "trimPathEnd", 6, this.f45655m);
                this.f45656n = vmh.getNamedFloat(typedArray, xmlPullParser, "trimPathOffset", 7, this.f45656n);
                this.f45654l = vmh.getNamedFloat(typedArray, xmlPullParser, "trimPathStart", 5, this.f45654l);
                this.f45676c = vmh.getNamedInt(typedArray, xmlPullParser, "fillType", 13, this.f45676c);
            }
        }

        @Override // p000.i3i.AbstractC7137f
        public void applyTheme(Resources.Theme theme) {
        }

        @Override // p000.i3i.AbstractC7137f
        public boolean canApplyTheme() {
            return this.f45648f != null;
        }

        public float getFillAlpha() {
            return this.f45653k;
        }

        @g92
        public int getFillColor() {
            return this.f45651i.getColor();
        }

        public float getStrokeAlpha() {
            return this.f45652j;
        }

        @g92
        public int getStrokeColor() {
            return this.f45649g.getColor();
        }

        public float getStrokeWidth() {
            return this.f45650h;
        }

        public float getTrimPathEnd() {
            return this.f45655m;
        }

        public float getTrimPathOffset() {
            return this.f45656n;
        }

        public float getTrimPathStart() {
            return this.f45654l;
        }

        public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayObtainAttributes = vmh.obtainAttributes(resources, theme, attributeSet, C15299xu.f99316t);
            updateStateFromTypedArray(typedArrayObtainAttributes, xmlPullParser, theme);
            typedArrayObtainAttributes.recycle();
        }

        @Override // p000.i3i.AbstractC7136e
        public boolean isStateful() {
            return this.f45651i.isStateful() || this.f45649g.isStateful();
        }

        @Override // p000.i3i.AbstractC7136e
        public boolean onStateChanged(int[] iArr) {
            return this.f45649g.onStateChanged(iArr) | this.f45651i.onStateChanged(iArr);
        }

        public void setFillAlpha(float f) {
            this.f45653k = f;
        }

        public void setFillColor(int i) {
            this.f45651i.setColor(i);
        }

        public void setStrokeAlpha(float f) {
            this.f45652j = f;
        }

        public void setStrokeColor(int i) {
            this.f45649g.setColor(i);
        }

        public void setStrokeWidth(float f) {
            this.f45650h = f;
        }

        public void setTrimPathEnd(float f) {
            this.f45655m = f;
        }

        public void setTrimPathOffset(float f) {
            this.f45656n = f;
        }

        public void setTrimPathStart(float f) {
            this.f45654l = f;
        }

        public C7134c(C7134c c7134c) {
            super(c7134c);
            this.f45650h = 0.0f;
            this.f45652j = 1.0f;
            this.f45653k = 1.0f;
            this.f45654l = 0.0f;
            this.f45655m = 1.0f;
            this.f45656n = 0.0f;
            this.f45657o = Paint.Cap.BUTT;
            this.f45658p = Paint.Join.MITER;
            this.f45659q = 4.0f;
            this.f45648f = c7134c.f45648f;
            this.f45649g = c7134c.f45649g;
            this.f45650h = c7134c.f45650h;
            this.f45652j = c7134c.f45652j;
            this.f45651i = c7134c.f45651i;
            this.f45676c = c7134c.f45676c;
            this.f45653k = c7134c.f45653k;
            this.f45654l = c7134c.f45654l;
            this.f45655m = c7134c.f45655m;
            this.f45656n = c7134c.f45656n;
            this.f45657o = c7134c.f45657o;
            this.f45658p = c7134c.f45658p;
            this.f45659q = c7134c.f45659q;
        }
    }

    /* JADX INFO: renamed from: i3i$g */
    public static class C7138g {

        /* JADX INFO: renamed from: q */
        public static final Matrix f45678q = new Matrix();

        /* JADX INFO: renamed from: a */
        public final Path f45679a;

        /* JADX INFO: renamed from: b */
        public final Path f45680b;

        /* JADX INFO: renamed from: c */
        public final Matrix f45681c;

        /* JADX INFO: renamed from: d */
        public Paint f45682d;

        /* JADX INFO: renamed from: e */
        public Paint f45683e;

        /* JADX INFO: renamed from: f */
        public PathMeasure f45684f;

        /* JADX INFO: renamed from: g */
        public int f45685g;

        /* JADX INFO: renamed from: h */
        public final C7135d f45686h;

        /* JADX INFO: renamed from: i */
        public float f45687i;

        /* JADX INFO: renamed from: j */
        public float f45688j;

        /* JADX INFO: renamed from: k */
        public float f45689k;

        /* JADX INFO: renamed from: l */
        public float f45690l;

        /* JADX INFO: renamed from: m */
        public int f45691m;

        /* JADX INFO: renamed from: n */
        public String f45692n;

        /* JADX INFO: renamed from: o */
        public Boolean f45693o;

        /* JADX INFO: renamed from: p */
        public final x60<String, Object> f45694p;

        public C7138g() {
            this.f45681c = new Matrix();
            this.f45687i = 0.0f;
            this.f45688j = 0.0f;
            this.f45689k = 0.0f;
            this.f45690l = 0.0f;
            this.f45691m = 255;
            this.f45692n = null;
            this.f45693o = null;
            this.f45694p = new x60<>();
            this.f45686h = new C7135d();
            this.f45679a = new Path();
            this.f45680b = new Path();
        }

        private static float cross(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private void drawGroupTree(C7135d c7135d, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c7135d.f45660a.set(matrix);
            c7135d.f45660a.preConcat(c7135d.f45669j);
            canvas.save();
            for (int i3 = 0; i3 < c7135d.f45661b.size(); i3++) {
                AbstractC7136e abstractC7136e = c7135d.f45661b.get(i3);
                if (abstractC7136e instanceof C7135d) {
                    drawGroupTree((C7135d) abstractC7136e, c7135d.f45660a, canvas, i, i2, colorFilter);
                } else if (abstractC7136e instanceof AbstractC7137f) {
                    drawPath(c7135d, (AbstractC7137f) abstractC7136e, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        private void drawPath(C7135d c7135d, AbstractC7137f abstractC7137f, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f45689k;
            float f2 = i2 / this.f45690l;
            float fMin = Math.min(f, f2);
            Matrix matrix = c7135d.f45660a;
            this.f45681c.set(matrix);
            this.f45681c.postScale(f, f2);
            float matrixScale = getMatrixScale(matrix);
            if (matrixScale == 0.0f) {
                return;
            }
            abstractC7137f.toPath(this.f45679a);
            Path path = this.f45679a;
            this.f45680b.reset();
            if (abstractC7137f.isClipPath()) {
                this.f45680b.setFillType(abstractC7137f.f45676c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f45680b.addPath(path, this.f45681c);
                canvas.clipPath(this.f45680b);
                return;
            }
            C7134c c7134c = (C7134c) abstractC7137f;
            float f3 = c7134c.f45654l;
            if (f3 != 0.0f || c7134c.f45655m != 1.0f) {
                float f4 = c7134c.f45656n;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (c7134c.f45655m + f4) % 1.0f;
                if (this.f45684f == null) {
                    this.f45684f = new PathMeasure();
                }
                this.f45684f.setPath(this.f45679a, false);
                float length = this.f45684f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f45684f.getSegment(f7, length, path, true);
                    this.f45684f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f45684f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f45680b.addPath(path, this.f45681c);
            if (c7134c.f45651i.willDraw()) {
                ti2 ti2Var = c7134c.f45651i;
                if (this.f45683e == null) {
                    Paint paint = new Paint(1);
                    this.f45683e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f45683e;
                if (ti2Var.isGradient()) {
                    Shader shader = ti2Var.getShader();
                    shader.setLocalMatrix(this.f45681c);
                    paint2.setShader(shader);
                    paint2.setAlpha(Math.round(c7134c.f45653k * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i3i.m12762a(ti2Var.getColor(), c7134c.f45653k));
                }
                paint2.setColorFilter(colorFilter);
                this.f45680b.setFillType(c7134c.f45676c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f45680b, paint2);
            }
            if (c7134c.f45649g.willDraw()) {
                ti2 ti2Var2 = c7134c.f45649g;
                if (this.f45682d == null) {
                    Paint paint3 = new Paint(1);
                    this.f45682d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f45682d;
                Paint.Join join = c7134c.f45658p;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c7134c.f45657o;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c7134c.f45659q);
                if (ti2Var2.isGradient()) {
                    Shader shader2 = ti2Var2.getShader();
                    shader2.setLocalMatrix(this.f45681c);
                    paint4.setShader(shader2);
                    paint4.setAlpha(Math.round(c7134c.f45652j * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i3i.m12762a(ti2Var2.getColor(), c7134c.f45652j));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c7134c.f45650h * fMin * matrixScale);
                canvas.drawPath(this.f45680b, paint4);
            }
        }

        private float getMatrixScale(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fCross = cross(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fCross) / fMax;
            }
            return 0.0f;
        }

        public void draw(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            drawGroupTree(this.f45686h, f45678q, canvas, i, i2, colorFilter);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f45691m;
        }

        public boolean isStateful() {
            if (this.f45693o == null) {
                this.f45693o = Boolean.valueOf(this.f45686h.isStateful());
            }
            return this.f45693o.booleanValue();
        }

        public boolean onStateChanged(int[] iArr) {
            return this.f45686h.onStateChanged(iArr);
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f45691m = i;
        }

        public C7138g(C7138g c7138g) {
            this.f45681c = new Matrix();
            this.f45687i = 0.0f;
            this.f45688j = 0.0f;
            this.f45689k = 0.0f;
            this.f45690l = 0.0f;
            this.f45691m = 255;
            this.f45692n = null;
            this.f45693o = null;
            x60<String, Object> x60Var = new x60<>();
            this.f45694p = x60Var;
            this.f45686h = new C7135d(c7138g.f45686h, x60Var);
            this.f45679a = new Path(c7138g.f45679a);
            this.f45680b = new Path(c7138g.f45680b);
            this.f45687i = c7138g.f45687i;
            this.f45688j = c7138g.f45688j;
            this.f45689k = c7138g.f45689k;
            this.f45690l = c7138g.f45690l;
            this.f45685g = c7138g.f45685g;
            this.f45691m = c7138g.f45691m;
            this.f45692n = c7138g.f45692n;
            String str = c7138g.f45692n;
            if (str != null) {
                x60Var.put(str, this);
            }
            this.f45693o = c7138g.f45693o;
        }
    }

    /* JADX INFO: renamed from: i3i$d */
    public static class C7135d extends AbstractC7136e {

        /* JADX INFO: renamed from: a */
        public final Matrix f45660a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<AbstractC7136e> f45661b;

        /* JADX INFO: renamed from: c */
        public float f45662c;

        /* JADX INFO: renamed from: d */
        public float f45663d;

        /* JADX INFO: renamed from: e */
        public float f45664e;

        /* JADX INFO: renamed from: f */
        public float f45665f;

        /* JADX INFO: renamed from: g */
        public float f45666g;

        /* JADX INFO: renamed from: h */
        public float f45667h;

        /* JADX INFO: renamed from: i */
        public float f45668i;

        /* JADX INFO: renamed from: j */
        public final Matrix f45669j;

        /* JADX INFO: renamed from: k */
        public int f45670k;

        /* JADX INFO: renamed from: l */
        public int[] f45671l;

        /* JADX INFO: renamed from: m */
        public String f45672m;

        public C7135d(C7135d c7135d, x60<String, Object> x60Var) {
            AbstractC7137f c7133b;
            super();
            this.f45660a = new Matrix();
            this.f45661b = new ArrayList<>();
            this.f45662c = 0.0f;
            this.f45663d = 0.0f;
            this.f45664e = 0.0f;
            this.f45665f = 1.0f;
            this.f45666g = 1.0f;
            this.f45667h = 0.0f;
            this.f45668i = 0.0f;
            Matrix matrix = new Matrix();
            this.f45669j = matrix;
            this.f45672m = null;
            this.f45662c = c7135d.f45662c;
            this.f45663d = c7135d.f45663d;
            this.f45664e = c7135d.f45664e;
            this.f45665f = c7135d.f45665f;
            this.f45666g = c7135d.f45666g;
            this.f45667h = c7135d.f45667h;
            this.f45668i = c7135d.f45668i;
            this.f45671l = c7135d.f45671l;
            String str = c7135d.f45672m;
            this.f45672m = str;
            this.f45670k = c7135d.f45670k;
            if (str != null) {
                x60Var.put(str, this);
            }
            matrix.set(c7135d.f45669j);
            ArrayList<AbstractC7136e> arrayList = c7135d.f45661b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC7136e abstractC7136e = arrayList.get(i);
                if (abstractC7136e instanceof C7135d) {
                    this.f45661b.add(new C7135d((C7135d) abstractC7136e, x60Var));
                } else {
                    if (abstractC7136e instanceof C7134c) {
                        c7133b = new C7134c((C7134c) abstractC7136e);
                    } else {
                        if (!(abstractC7136e instanceof C7133b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        c7133b = new C7133b((C7133b) abstractC7136e);
                    }
                    this.f45661b.add(c7133b);
                    String str2 = c7133b.f45675b;
                    if (str2 != null) {
                        x60Var.put(str2, c7133b);
                    }
                }
            }
        }

        private void updateLocalMatrix() {
            this.f45669j.reset();
            this.f45669j.postTranslate(-this.f45663d, -this.f45664e);
            this.f45669j.postScale(this.f45665f, this.f45666g);
            this.f45669j.postRotate(this.f45662c, 0.0f, 0.0f);
            this.f45669j.postTranslate(this.f45667h + this.f45663d, this.f45668i + this.f45664e);
        }

        private void updateStateFromTypedArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f45671l = null;
            this.f45662c = vmh.getNamedFloat(typedArray, xmlPullParser, dq8.f30369i, 5, this.f45662c);
            this.f45663d = typedArray.getFloat(1, this.f45663d);
            this.f45664e = typedArray.getFloat(2, this.f45664e);
            this.f45665f = vmh.getNamedFloat(typedArray, xmlPullParser, "scaleX", 3, this.f45665f);
            this.f45666g = vmh.getNamedFloat(typedArray, xmlPullParser, "scaleY", 4, this.f45666g);
            this.f45667h = vmh.getNamedFloat(typedArray, xmlPullParser, "translateX", 6, this.f45667h);
            this.f45668i = vmh.getNamedFloat(typedArray, xmlPullParser, "translateY", 7, this.f45668i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f45672m = string;
            }
            updateLocalMatrix();
        }

        public String getGroupName() {
            return this.f45672m;
        }

        public Matrix getLocalMatrix() {
            return this.f45669j;
        }

        public float getPivotX() {
            return this.f45663d;
        }

        public float getPivotY() {
            return this.f45664e;
        }

        public float getRotation() {
            return this.f45662c;
        }

        public float getScaleX() {
            return this.f45665f;
        }

        public float getScaleY() {
            return this.f45666g;
        }

        public float getTranslateX() {
            return this.f45667h;
        }

        public float getTranslateY() {
            return this.f45668i;
        }

        public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayObtainAttributes = vmh.obtainAttributes(resources, theme, attributeSet, C15299xu.f99298k);
            updateStateFromTypedArray(typedArrayObtainAttributes, xmlPullParser);
            typedArrayObtainAttributes.recycle();
        }

        @Override // p000.i3i.AbstractC7136e
        public boolean isStateful() {
            for (int i = 0; i < this.f45661b.size(); i++) {
                if (this.f45661b.get(i).isStateful()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000.i3i.AbstractC7136e
        public boolean onStateChanged(int[] iArr) {
            boolean zOnStateChanged = false;
            for (int i = 0; i < this.f45661b.size(); i++) {
                zOnStateChanged |= this.f45661b.get(i).onStateChanged(iArr);
            }
            return zOnStateChanged;
        }

        public void setPivotX(float f) {
            if (f != this.f45663d) {
                this.f45663d = f;
                updateLocalMatrix();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f45664e) {
                this.f45664e = f;
                updateLocalMatrix();
            }
        }

        public void setRotation(float f) {
            if (f != this.f45662c) {
                this.f45662c = f;
                updateLocalMatrix();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f45665f) {
                this.f45665f = f;
                updateLocalMatrix();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f45666g) {
                this.f45666g = f;
                updateLocalMatrix();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f45667h) {
                this.f45667h = f;
                updateLocalMatrix();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f45668i) {
                this.f45668i = f;
                updateLocalMatrix();
            }
        }

        public C7135d() {
            super();
            this.f45660a = new Matrix();
            this.f45661b = new ArrayList<>();
            this.f45662c = 0.0f;
            this.f45663d = 0.0f;
            this.f45664e = 0.0f;
            this.f45665f = 1.0f;
            this.f45666g = 1.0f;
            this.f45667h = 0.0f;
            this.f45668i = 0.0f;
            this.f45669j = new Matrix();
            this.f45672m = null;
        }
    }
}
