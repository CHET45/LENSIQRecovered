package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class zp4 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: N */
    public static final boolean f105648N = false;

    /* JADX INFO: renamed from: Q */
    public static final String f105649Q = "DrawableContainerCompat";

    /* JADX INFO: renamed from: X */
    public static final boolean f105650X = true;

    /* JADX INFO: renamed from: C */
    public boolean f105651C;

    /* JADX INFO: renamed from: F */
    public Runnable f105652F;

    /* JADX INFO: renamed from: H */
    public long f105653H;

    /* JADX INFO: renamed from: L */
    public long f105654L;

    /* JADX INFO: renamed from: M */
    public C16209c f105655M;

    /* JADX INFO: renamed from: a */
    public AbstractC16210d f105656a;

    /* JADX INFO: renamed from: b */
    public Rect f105657b;

    /* JADX INFO: renamed from: c */
    public Drawable f105658c;

    /* JADX INFO: renamed from: d */
    public Drawable f105659d;

    /* JADX INFO: renamed from: f */
    public boolean f105661f;

    /* JADX INFO: renamed from: e */
    public int f105660e = 255;

    /* JADX INFO: renamed from: m */
    public int f105662m = -1;

    /* JADX INFO: renamed from: zp4$a */
    public class RunnableC16207a implements Runnable {
        public RunnableC16207a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zp4.this.m26933a(true);
            zp4.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: zp4$b */
    @c5e(21)
    public static class C16208b {
        private C16208b() {
        }

        public static boolean canApplyTheme(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void getOutline(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources getResources(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: renamed from: zp4$c */
    public static class C16209c implements Drawable.Callback {

        /* JADX INFO: renamed from: a */
        public Drawable.Callback f105664a;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@efb Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@efb Drawable drawable, @efb Runnable runnable, long j) {
            Drawable.Callback callback = this.f105664a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@efb Drawable drawable, @efb Runnable runnable) {
            Drawable.Callback callback = this.f105664a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        public Drawable.Callback unwrap() {
            Drawable.Callback callback = this.f105664a;
            this.f105664a = null;
            return callback;
        }

        public C16209c wrap(Drawable.Callback callback) {
            this.f105664a = callback;
            return this;
        }
    }

    /* JADX INFO: renamed from: zp4$d */
    public static abstract class AbstractC16210d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: A */
        public int f105665A;

        /* JADX INFO: renamed from: B */
        public int f105666B;

        /* JADX INFO: renamed from: C */
        public boolean f105667C;

        /* JADX INFO: renamed from: D */
        public ColorFilter f105668D;

        /* JADX INFO: renamed from: E */
        public boolean f105669E;

        /* JADX INFO: renamed from: F */
        public ColorStateList f105670F;

        /* JADX INFO: renamed from: G */
        public PorterDuff.Mode f105671G;

        /* JADX INFO: renamed from: H */
        public boolean f105672H;

        /* JADX INFO: renamed from: I */
        public boolean f105673I;

        /* JADX INFO: renamed from: a */
        public final zp4 f105674a;

        /* JADX INFO: renamed from: b */
        public Resources f105675b;

        /* JADX INFO: renamed from: c */
        public int f105676c;

        /* JADX INFO: renamed from: d */
        public int f105677d;

        /* JADX INFO: renamed from: e */
        public int f105678e;

        /* JADX INFO: renamed from: f */
        public SparseArray<Drawable.ConstantState> f105679f;

        /* JADX INFO: renamed from: g */
        public Drawable[] f105680g;

        /* JADX INFO: renamed from: h */
        public int f105681h;

        /* JADX INFO: renamed from: i */
        public boolean f105682i;

        /* JADX INFO: renamed from: j */
        public boolean f105683j;

        /* JADX INFO: renamed from: k */
        public Rect f105684k;

        /* JADX INFO: renamed from: l */
        public boolean f105685l;

        /* JADX INFO: renamed from: m */
        public boolean f105686m;

        /* JADX INFO: renamed from: n */
        public int f105687n;

        /* JADX INFO: renamed from: o */
        public int f105688o;

        /* JADX INFO: renamed from: p */
        public int f105689p;

        /* JADX INFO: renamed from: q */
        public int f105690q;

        /* JADX INFO: renamed from: r */
        public boolean f105691r;

        /* JADX INFO: renamed from: s */
        public int f105692s;

        /* JADX INFO: renamed from: t */
        public boolean f105693t;

        /* JADX INFO: renamed from: u */
        public boolean f105694u;

        /* JADX INFO: renamed from: v */
        public boolean f105695v;

        /* JADX INFO: renamed from: w */
        public boolean f105696w;

        /* JADX INFO: renamed from: x */
        public boolean f105697x;

        /* JADX INFO: renamed from: y */
        public boolean f105698y;

        /* JADX INFO: renamed from: z */
        public int f105699z;

        public AbstractC16210d(AbstractC16210d abstractC16210d, zp4 zp4Var, Resources resources) {
            this.f105682i = false;
            this.f105685l = false;
            this.f105697x = true;
            this.f105665A = 0;
            this.f105666B = 0;
            this.f105674a = zp4Var;
            this.f105675b = resources != null ? resources : abstractC16210d != null ? abstractC16210d.f105675b : null;
            int iM26932e = zp4.m26932e(resources, abstractC16210d != null ? abstractC16210d.f105676c : 0);
            this.f105676c = iM26932e;
            if (abstractC16210d == null) {
                this.f105680g = new Drawable[10];
                this.f105681h = 0;
                return;
            }
            this.f105677d = abstractC16210d.f105677d;
            this.f105678e = abstractC16210d.f105678e;
            this.f105695v = true;
            this.f105696w = true;
            this.f105682i = abstractC16210d.f105682i;
            this.f105685l = abstractC16210d.f105685l;
            this.f105697x = abstractC16210d.f105697x;
            this.f105698y = abstractC16210d.f105698y;
            this.f105699z = abstractC16210d.f105699z;
            this.f105665A = abstractC16210d.f105665A;
            this.f105666B = abstractC16210d.f105666B;
            this.f105667C = abstractC16210d.f105667C;
            this.f105668D = abstractC16210d.f105668D;
            this.f105669E = abstractC16210d.f105669E;
            this.f105670F = abstractC16210d.f105670F;
            this.f105671G = abstractC16210d.f105671G;
            this.f105672H = abstractC16210d.f105672H;
            this.f105673I = abstractC16210d.f105673I;
            if (abstractC16210d.f105676c == iM26932e) {
                if (abstractC16210d.f105683j) {
                    this.f105684k = abstractC16210d.f105684k != null ? new Rect(abstractC16210d.f105684k) : null;
                    this.f105683j = true;
                }
                if (abstractC16210d.f105686m) {
                    this.f105687n = abstractC16210d.f105687n;
                    this.f105688o = abstractC16210d.f105688o;
                    this.f105689p = abstractC16210d.f105689p;
                    this.f105690q = abstractC16210d.f105690q;
                    this.f105686m = true;
                }
            }
            if (abstractC16210d.f105691r) {
                this.f105692s = abstractC16210d.f105692s;
                this.f105691r = true;
            }
            if (abstractC16210d.f105693t) {
                this.f105694u = abstractC16210d.f105694u;
                this.f105693t = true;
            }
            Drawable[] drawableArr = abstractC16210d.f105680g;
            this.f105680g = new Drawable[drawableArr.length];
            this.f105681h = abstractC16210d.f105681h;
            SparseArray<Drawable.ConstantState> sparseArray = abstractC16210d.f105679f;
            if (sparseArray != null) {
                this.f105679f = sparseArray.clone();
            } else {
                this.f105679f = new SparseArray<>(this.f105681h);
            }
            int i = this.f105681h;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f105679f.put(i2, constantState);
                    } else {
                        this.f105680g[i2] = drawableArr[i2];
                    }
                }
            }
        }

        private void createAllFutures() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f105679f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f105680g[this.f105679f.keyAt(i)] = prepareDrawable(this.f105679f.valueAt(i).newDrawable(this.f105675b));
                }
                this.f105679f = null;
            }
        }

        private Drawable prepareDrawable(Drawable drawable) {
            yp4.setLayoutDirection(drawable, this.f105699z);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f105674a);
            return drawableMutate;
        }

        @c5e(21)
        /* JADX INFO: renamed from: a */
        public final void m26938a(Resources.Theme theme) {
            if (theme != null) {
                createAllFutures();
                int i = this.f105681h;
                Drawable[] drawableArr = this.f105680g;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null && yp4.canApplyTheme(drawable)) {
                        yp4.applyTheme(drawableArr[i2], theme);
                        this.f105678e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m26944h(C16208b.getResources(theme));
            }
        }

        public final int addChild(Drawable drawable) {
            int i = this.f105681h;
            if (i >= this.f105680g.length) {
                growArray(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f105674a);
            this.f105680g[i] = drawable;
            this.f105681h++;
            this.f105678e = drawable.getChangingConfigurations() | this.f105678e;
            m26942e();
            this.f105684k = null;
            this.f105683j = false;
            this.f105686m = false;
            this.f105695v = false;
            return i;
        }

        /* JADX INFO: renamed from: b */
        public final void m26939b() {
            this.f105698y = false;
        }

        /* JADX INFO: renamed from: c */
        public void m26940c() {
            this.f105686m = true;
            createAllFutures();
            int i = this.f105681h;
            Drawable[] drawableArr = this.f105680g;
            this.f105688o = -1;
            this.f105687n = -1;
            this.f105690q = 0;
            this.f105689p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f105687n) {
                    this.f105687n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f105688o) {
                    this.f105688o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f105689p) {
                    this.f105689p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f105690q) {
                    this.f105690q = minimumHeight;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @c5e(21)
        public boolean canApplyTheme() {
            int i = this.f105681h;
            Drawable[] drawableArr = this.f105680g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f105679f.get(i2);
                    if (constantState != null && C16208b.canApplyTheme(constantState)) {
                        return true;
                    }
                } else if (yp4.canApplyTheme(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public boolean canConstantState() {
            if (this.f105695v) {
                return this.f105696w;
            }
            createAllFutures();
            this.f105695v = true;
            int i = this.f105681h;
            Drawable[] drawableArr = this.f105680g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f105696w = false;
                    return false;
                }
            }
            this.f105696w = true;
            return true;
        }

        /* JADX INFO: renamed from: d */
        public final int m26941d() {
            return this.f105680g.length;
        }

        /* JADX INFO: renamed from: e */
        public void m26942e() {
            this.f105691r = false;
            this.f105693t = false;
        }

        /* JADX INFO: renamed from: f */
        public void mo20028f() {
            int i = this.f105681h;
            Drawable[] drawableArr = this.f105680g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f105698y = true;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m26943g(int i, int i2) {
            int i3 = this.f105681h;
            Drawable[] drawableArr = this.f105680g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    boolean layoutDirection = yp4.setLayoutDirection(drawable, i);
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f105699z = i;
            return z;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f105677d | this.f105678e;
        }

        public final Drawable getChild(int i) {
            int iIndexOfKey;
            Drawable drawable = this.f105680g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f105679f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable drawablePrepareDrawable = prepareDrawable(this.f105679f.valueAt(iIndexOfKey).newDrawable(this.f105675b));
            this.f105680g[i] = drawablePrepareDrawable;
            this.f105679f.removeAt(iIndexOfKey);
            if (this.f105679f.size() == 0) {
                this.f105679f = null;
            }
            return drawablePrepareDrawable;
        }

        public final int getChildCount() {
            return this.f105681h;
        }

        public final int getConstantHeight() {
            if (!this.f105686m) {
                m26940c();
            }
            return this.f105688o;
        }

        public final int getConstantMinimumHeight() {
            if (!this.f105686m) {
                m26940c();
            }
            return this.f105690q;
        }

        public final int getConstantMinimumWidth() {
            if (!this.f105686m) {
                m26940c();
            }
            return this.f105689p;
        }

        public final Rect getConstantPadding() {
            Rect rect = null;
            if (this.f105682i) {
                return null;
            }
            Rect rect2 = this.f105684k;
            if (rect2 != null || this.f105683j) {
                return rect2;
            }
            createAllFutures();
            Rect rect3 = new Rect();
            int i = this.f105681h;
            Drawable[] drawableArr = this.f105680g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f105683j = true;
            this.f105684k = rect;
            return rect;
        }

        public final int getConstantWidth() {
            if (!this.f105686m) {
                m26940c();
            }
            return this.f105687n;
        }

        public final int getEnterFadeDuration() {
            return this.f105665A;
        }

        public final int getExitFadeDuration() {
            return this.f105666B;
        }

        public final int getOpacity() {
            if (this.f105691r) {
                return this.f105692s;
            }
            createAllFutures();
            int i = this.f105681h;
            Drawable[] drawableArr = this.f105680g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f105692s = opacity;
            this.f105691r = true;
            return opacity;
        }

        public void growArray(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f105680g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f105680g = drawableArr;
        }

        /* JADX INFO: renamed from: h */
        public final void m26944h(Resources resources) {
            if (resources != null) {
                this.f105675b = resources;
                int iM26932e = zp4.m26932e(resources, this.f105676c);
                int i = this.f105676c;
                this.f105676c = iM26932e;
                if (i != iM26932e) {
                    this.f105686m = false;
                    this.f105683j = false;
                }
            }
        }

        public final boolean isConstantSize() {
            return this.f105685l;
        }

        public final boolean isStateful() {
            if (this.f105693t) {
                return this.f105694u;
            }
            createAllFutures();
            int i = this.f105681h;
            Drawable[] drawableArr = this.f105680g;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                }
                i2++;
            }
            this.f105694u = z;
            this.f105693t = true;
            return z;
        }

        public final void setConstantSize(boolean z) {
            this.f105685l = z;
        }

        public final void setEnterFadeDuration(int i) {
            this.f105665A = i;
        }

        public final void setExitFadeDuration(int i) {
            this.f105666B = i;
        }

        public final void setVariablePadding(boolean z) {
            this.f105682i = z;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m26932e(@hib Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    private void initializeDrawableForDisplay(Drawable drawable) {
        if (this.f105655M == null) {
            this.f105655M = new C16209c();
        }
        drawable.setCallback(this.f105655M.wrap(drawable.getCallback()));
        try {
            if (this.f105656a.f105665A <= 0 && this.f105661f) {
                drawable.setAlpha(this.f105660e);
            }
            AbstractC16210d abstractC16210d = this.f105656a;
            if (abstractC16210d.f105669E) {
                drawable.setColorFilter(abstractC16210d.f105668D);
            } else {
                if (abstractC16210d.f105672H) {
                    yp4.setTintList(drawable, abstractC16210d.f105670F);
                }
                AbstractC16210d abstractC16210d2 = this.f105656a;
                if (abstractC16210d2.f105673I) {
                    yp4.setTintMode(drawable, abstractC16210d2.f105671G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f105656a.f105697x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            yp4.setLayoutDirection(drawable, yp4.getLayoutDirection(this));
            yp4.setAutoMirrored(drawable, this.f105656a.f105667C);
            Rect rect = this.f105657b;
            if (rect != null) {
                yp4.setHotspotBounds(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f105655M.unwrap());
        } catch (Throwable th) {
            drawable.setCallback(this.f105655M.unwrap());
            throw th;
        }
    }

    private boolean needsMirroring() {
        return isAutoMirrored() && yp4.getLayoutDirection(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m26933a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f105661f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f105658c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f105653H
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f105660e
            r3.setAlpha(r9)
            r13.f105653H = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            zp4$d r10 = r13.f105656a
            int r10 = r10.f105665A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f105660e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f105653H = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f105659d
            if (r9 == 0) goto L61
            long r10 = r13.f105654L
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f105659d = r0
            r13.f105654L = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            zp4$d r4 = r13.f105656a
            int r4 = r4.f105666B
            int r3 = r3 / r4
            int r4 = r13.f105660e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f105654L = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f105652F
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zp4.m26933a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    @c5e(21)
    public void applyTheme(@efb Resources.Theme theme) {
        this.f105656a.m26938a(theme);
    }

    /* JADX INFO: renamed from: b */
    public void mo20018b() {
        this.f105656a.m26939b();
        this.f105651C = false;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC16210d mo20019c() {
        return this.f105656a;
    }

    @Override // android.graphics.drawable.Drawable
    @c5e(21)
    public boolean canApplyTheme() {
        return this.f105656a.canApplyTheme();
    }

    /* JADX INFO: renamed from: d */
    public int m26934d() {
        return this.f105662m;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        Drawable drawable = this.f105658c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f105659d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m26935f(int r10) {
        /*
            r9 = this;
            int r0 = r9.f105662m
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            zp4$d r0 = r9.f105656a
            int r0 = r0.f105666B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f105659d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f105658c
            if (r0 == 0) goto L29
            r9.f105659d = r0
            zp4$d r0 = r9.f105656a
            int r0 = r0.f105666B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f105654L = r0
            goto L35
        L29:
            r9.f105659d = r4
            r9.f105654L = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f105658c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            zp4$d r0 = r9.f105656a
            int r1 = r0.f105681h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.getChild(r10)
            r9.f105658c = r0
            r9.f105662m = r10
            if (r0 == 0) goto L5a
            zp4$d r10 = r9.f105656a
            int r10 = r10.f105665A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f105653H = r2
        L51:
            r9.initializeDrawableForDisplay(r0)
            goto L5a
        L55:
            r9.f105658c = r4
            r10 = -1
            r9.f105662m = r10
        L5a:
            long r0 = r9.f105653H
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f105654L
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f105652F
            if (r10 != 0) goto L73
            zp4$a r10 = new zp4$a
            r10.<init>()
            r9.f105652F = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.m26933a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zp4.m26935f(int):boolean");
    }

    /* JADX INFO: renamed from: g */
    public void mo20020g(AbstractC16210d abstractC16210d) {
        this.f105656a = abstractC16210d;
        int i = this.f105662m;
        if (i >= 0) {
            Drawable child = abstractC16210d.getChild(i);
            this.f105658c = child;
            if (child != null) {
                initializeDrawableForDisplay(child);
            }
        }
        this.f105659d = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f105660e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f105656a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f105656a.canConstantState()) {
            return null;
        }
        this.f105656a.f105677d = getChangingConfigurations();
        return this.f105656a;
    }

    @Override // android.graphics.drawable.Drawable
    @efb
    public Drawable getCurrent() {
        return this.f105658c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@efb Rect rect) {
        Rect rect2 = this.f105657b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f105656a.isConstantSize()) {
            return this.f105656a.getConstantHeight();
        }
        Drawable drawable = this.f105658c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f105656a.isConstantSize()) {
            return this.f105656a.getConstantWidth();
        }
        Drawable drawable = this.f105658c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f105656a.isConstantSize()) {
            return this.f105656a.getConstantMinimumHeight();
        }
        Drawable drawable = this.f105658c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f105656a.isConstantSize()) {
            return this.f105656a.getConstantMinimumWidth();
        }
        Drawable drawable = this.f105658c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f105658c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f105656a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    @c5e(21)
    public void getOutline(@efb Outline outline) {
        Drawable drawable = this.f105658c;
        if (drawable != null) {
            C16208b.getOutline(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@efb Rect rect) {
        boolean padding;
        Rect constantPadding = this.f105656a.getConstantPadding();
        if (constantPadding != null) {
            rect.set(constantPadding);
            padding = (constantPadding.right | ((constantPadding.left | constantPadding.top) | constantPadding.bottom)) != 0;
        } else {
            Drawable drawable = this.f105658c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (needsMirroring()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    /* JADX INFO: renamed from: h */
    public void m26936h(int i) {
        m26935f(i);
    }

    /* JADX INFO: renamed from: i */
    public final void m26937i(Resources resources) {
        this.f105656a.m26944h(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@efb Drawable drawable) {
        AbstractC16210d abstractC16210d = this.f105656a;
        if (abstractC16210d != null) {
            abstractC16210d.m26942e();
        }
        if (drawable != this.f105658c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f105656a.f105667C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f105656a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f105659d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f105659d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f105658c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f105661f) {
                this.f105658c.setAlpha(this.f105660e);
            }
        }
        if (this.f105654L != 0) {
            this.f105654L = 0L;
            z = true;
        }
        if (this.f105653H != 0) {
            this.f105653H = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f105651C && super.mutate() == this) {
            AbstractC16210d abstractC16210dMo20019c = mo20019c();
            abstractC16210dMo20019c.mo20028f();
            mo20020g(abstractC16210dMo20019c);
            this.f105651C = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f105659d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f105658c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f105656a.m26943g(i, m26934d());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f105659d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f105658c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@efb int[] iArr) {
        Drawable drawable = this.f105659d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f105658c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@efb Drawable drawable, @efb Runnable runnable, long j) {
        if (drawable != this.f105658c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f105661f && this.f105660e == i) {
            return;
        }
        this.f105661f = true;
        this.f105660e = i;
        Drawable drawable = this.f105658c;
        if (drawable != null) {
            if (this.f105653H == 0) {
                drawable.setAlpha(i);
            } else {
                m26933a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC16210d abstractC16210d = this.f105656a;
        if (abstractC16210d.f105667C != z) {
            abstractC16210d.f105667C = z;
            Drawable drawable = this.f105658c;
            if (drawable != null) {
                yp4.setAutoMirrored(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC16210d abstractC16210d = this.f105656a;
        abstractC16210d.f105669E = true;
        if (abstractC16210d.f105668D != colorFilter) {
            abstractC16210d.f105668D = colorFilter;
            Drawable drawable = this.f105658c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC16210d abstractC16210d = this.f105656a;
        if (abstractC16210d.f105697x != z) {
            abstractC16210d.f105697x = z;
            Drawable drawable = this.f105658c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setEnterFadeDuration(int i) {
        this.f105656a.f105665A = i;
    }

    public void setExitFadeDuration(int i) {
        this.f105656a.f105666B = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f105658c;
        if (drawable != null) {
            yp4.setHotspot(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f105657b;
        if (rect == null) {
            this.f105657b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f105658c;
        if (drawable != null) {
            yp4.setHotspotBounds(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@g92 int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC16210d abstractC16210d = this.f105656a;
        abstractC16210d.f105672H = true;
        if (abstractC16210d.f105670F != colorStateList) {
            abstractC16210d.f105670F = colorStateList;
            yp4.setTintList(this.f105658c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@efb PorterDuff.Mode mode) {
        AbstractC16210d abstractC16210d = this.f105656a;
        abstractC16210d.f105673I = true;
        if (abstractC16210d.f105671G != mode) {
            abstractC16210d.f105671G = mode;
            yp4.setTintMode(this.f105658c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f105659d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f105658c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@efb Drawable drawable, @efb Runnable runnable) {
        if (drawable != this.f105658c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
