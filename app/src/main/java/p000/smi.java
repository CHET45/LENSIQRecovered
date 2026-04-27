package p000;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class smi {

    /* JADX INFO: renamed from: b */
    public static final String f82270b = "WindowInsetsCompat";

    /* JADX INFO: renamed from: c */
    @efb
    public static final smi f82271c;

    /* JADX INFO: renamed from: a */
    public final C12677l f82272a;

    /* JADX INFO: renamed from: smi$a */
    @c5e(21)
    @igg({"SoonBlockedPrivateApi"})
    public static class C12666a {

        /* JADX INFO: renamed from: a */
        public static Field f82273a;

        /* JADX INFO: renamed from: b */
        public static Field f82274b;

        /* JADX INFO: renamed from: c */
        public static Field f82275c;

        /* JADX INFO: renamed from: d */
        public static boolean f82276d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f82273a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f82274b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f82275c = declaredField3;
                declaredField3.setAccessible(true);
                f82276d = true;
            } catch (ReflectiveOperationException e) {
                Log.w(smi.f82270b, "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        private C12666a() {
        }

        @hib
        public static smi getRootWindowInsets(@efb View view) {
            if (f82276d && view.isAttachedToWindow()) {
                try {
                    Object obj = f82273a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f82274b.get(obj);
                        Rect rect2 = (Rect) f82275c.get(obj);
                        if (rect != null && rect2 != null) {
                            smi smiVarBuild = new C12667b().setStableInsets(r48.m21005of(rect)).setSystemWindowInsets(r48.m21005of(rect2)).build();
                            smiVarBuild.m22115e(smiVarBuild);
                            smiVarBuild.m22112a(view.getRootView());
                            return smiVarBuild;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w(smi.f82270b, "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: smi$e */
    @c5e(30)
    public static class C12670e extends C12669d {
        public C12670e() {
        }

        @Override // p000.smi.C12671f
        /* JADX INFO: renamed from: d */
        public void mo22124d(int i, @efb r48 r48Var) {
            this.f82284c.setInsets(C12679n.m22148a(i), r48Var.toPlatformInsets());
        }

        @Override // p000.smi.C12671f
        /* JADX INFO: renamed from: e */
        public void mo22125e(int i, @efb r48 r48Var) {
            this.f82284c.setInsetsIgnoringVisibility(C12679n.m22148a(i), r48Var.toPlatformInsets());
        }

        @Override // p000.smi.C12671f
        /* JADX INFO: renamed from: k */
        public void mo22126k(int i, boolean z) {
            this.f82284c.setVisible(C12679n.m22148a(i), z);
        }

        public C12670e(@efb smi smiVar) {
            super(smiVar);
        }
    }

    /* JADX INFO: renamed from: smi$f */
    public static class C12671f {

        /* JADX INFO: renamed from: a */
        public final smi f82285a;

        /* JADX INFO: renamed from: b */
        public r48[] f82286b;

        public C12671f() {
            this(new smi((smi) null));
        }

        /* JADX INFO: renamed from: a */
        public final void m22127a() {
            r48[] r48VarArr = this.f82286b;
            if (r48VarArr != null) {
                r48 insets = r48VarArr[C12678m.m22147b(1)];
                r48 insets2 = this.f82286b[C12678m.m22147b(2)];
                if (insets2 == null) {
                    insets2 = this.f82285a.getInsets(2);
                }
                if (insets == null) {
                    insets = this.f82285a.getInsets(1);
                }
                mo22119i(r48.max(insets, insets2));
                r48 r48Var = this.f82286b[C12678m.m22147b(16)];
                if (r48Var != null) {
                    mo22122h(r48Var);
                }
                r48 r48Var2 = this.f82286b[C12678m.m22147b(32)];
                if (r48Var2 != null) {
                    mo22121f(r48Var2);
                }
                r48 r48Var3 = this.f82286b[C12678m.m22147b(64)];
                if (r48Var3 != null) {
                    mo22123j(r48Var3);
                }
            }
        }

        @efb
        /* JADX INFO: renamed from: b */
        public smi mo22117b() {
            m22127a();
            return this.f82285a;
        }

        /* JADX INFO: renamed from: c */
        public void mo22120c(@hib if4 if4Var) {
        }

        /* JADX INFO: renamed from: d */
        public void mo22124d(int i, @efb r48 r48Var) {
            if (this.f82286b == null) {
                this.f82286b = new r48[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f82286b[C12678m.m22147b(i2)] = r48Var;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public void mo22125e(int i, @efb r48 r48Var) {
            if (i == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        /* JADX INFO: renamed from: f */
        public void mo22121f(@efb r48 r48Var) {
        }

        /* JADX INFO: renamed from: g */
        public void mo22118g(@efb r48 r48Var) {
        }

        /* JADX INFO: renamed from: h */
        public void mo22122h(@efb r48 r48Var) {
        }

        /* JADX INFO: renamed from: i */
        public void mo22119i(@efb r48 r48Var) {
        }

        /* JADX INFO: renamed from: j */
        public void mo22123j(@efb r48 r48Var) {
        }

        /* JADX INFO: renamed from: k */
        public void mo22126k(int i, boolean z) {
        }

        public C12671f(@efb smi smiVar) {
            this.f82285a = smiVar;
        }
    }

    /* JADX INFO: renamed from: smi$g */
    @c5e(20)
    public static class C12672g extends C12677l {

        /* JADX INFO: renamed from: h */
        public static boolean f82287h;

        /* JADX INFO: renamed from: i */
        public static Method f82288i;

        /* JADX INFO: renamed from: j */
        public static Class<?> f82289j;

        /* JADX INFO: renamed from: k */
        public static Field f82290k;

        /* JADX INFO: renamed from: l */
        public static Field f82291l;

        /* JADX INFO: renamed from: c */
        @efb
        public final WindowInsets f82292c;

        /* JADX INFO: renamed from: d */
        public r48[] f82293d;

        /* JADX INFO: renamed from: e */
        public r48 f82294e;

        /* JADX INFO: renamed from: f */
        public smi f82295f;

        /* JADX INFO: renamed from: g */
        public r48 f82296g;

        public C12672g(@efb smi smiVar, @efb WindowInsets windowInsets) {
            super(smiVar);
            this.f82294e = null;
            this.f82292c = windowInsets;
        }

        private r48 getRootStableInsets() {
            smi smiVar = this.f82295f;
            return smiVar != null ? smiVar.getStableInsets() : r48.f77013e;
        }

        @hib
        private r48 getVisibleInsets(@efb View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f82287h) {
                loadReflectionField();
            }
            Method method = f82288i;
            if (method != null && f82289j != null && f82290k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w(smi.f82270b, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f82290k.get(f82291l.get(objInvoke));
                    if (rect != null) {
                        return r48.m21005of(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e(smi.f82270b, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @igg({"PrivateApi"})
        private static void loadReflectionField() {
            try {
                f82288i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f82289j = cls;
                f82290k = cls.getDeclaredField("mVisibleInsets");
                f82291l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f82290k.setAccessible(true);
                f82291l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e(smi.f82270b, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f82287h = true;
        }

        @Override // p000.smi.C12677l
        /* JADX INFO: renamed from: d */
        public void mo22128d(@efb View view) {
            r48 visibleInsets = getVisibleInsets(view);
            if (visibleInsets == null) {
                visibleInsets = r48.f77013e;
            }
            mo22133o(visibleInsets);
        }

        @Override // p000.smi.C12677l
        /* JADX INFO: renamed from: e */
        public void mo22129e(@efb smi smiVar) {
            smiVar.m22115e(this.f82295f);
            smiVar.m22114d(this.f82296g);
        }

        @Override // p000.smi.C12677l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f82296g, ((C12672g) obj).f82296g);
            }
            return false;
        }

        @Override // p000.smi.C12677l
        @efb
        public r48 getInsets(int i) {
            return getInsets(i, false);
        }

        @Override // p000.smi.C12677l
        @efb
        public r48 getInsetsIgnoringVisibility(int i) {
            return getInsets(i, true);
        }

        @Override // p000.smi.C12677l
        @igg({"WrongConstant"})
        public boolean isVisible(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !m22136r(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p000.smi.C12677l
        @efb
        /* JADX INFO: renamed from: j */
        public final r48 mo22130j() {
            if (this.f82294e == null) {
                this.f82294e = r48.m21004of(this.f82292c.getSystemWindowInsetLeft(), this.f82292c.getSystemWindowInsetTop(), this.f82292c.getSystemWindowInsetRight(), this.f82292c.getSystemWindowInsetBottom());
            }
            return this.f82294e;
        }

        @Override // p000.smi.C12677l
        @efb
        /* JADX INFO: renamed from: l */
        public smi mo22131l(int i, int i2, int i3, int i4) {
            C12667b c12667b = new C12667b(smi.toWindowInsetsCompat(this.f82292c));
            c12667b.setSystemWindowInsets(smi.m22111b(mo22130j(), i, i2, i3, i4));
            c12667b.setStableInsets(smi.m22111b(mo22139h(), i, i2, i3, i4));
            return c12667b.build();
        }

        @Override // p000.smi.C12677l
        /* JADX INFO: renamed from: n */
        public boolean mo22132n() {
            return this.f82292c.isRound();
        }

        @Override // p000.smi.C12677l
        /* JADX INFO: renamed from: o */
        public void mo22133o(@efb r48 r48Var) {
            this.f82296g = r48Var;
        }

        @Override // p000.smi.C12677l
        /* JADX INFO: renamed from: p */
        public void mo22134p(@hib smi smiVar) {
            this.f82295f = smiVar;
        }

        @efb
        /* JADX INFO: renamed from: q */
        public r48 m22135q(int i, boolean z) {
            r48 stableInsets;
            int i2;
            if (i == 1) {
                return z ? r48.m21004of(0, Math.max(getRootStableInsets().f77015b, mo22130j().f77015b), 0, 0) : r48.m21004of(0, mo22130j().f77015b, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    r48 rootStableInsets = getRootStableInsets();
                    r48 r48VarMo22139h = mo22139h();
                    return r48.m21004of(Math.max(rootStableInsets.f77014a, r48VarMo22139h.f77014a), 0, Math.max(rootStableInsets.f77016c, r48VarMo22139h.f77016c), Math.max(rootStableInsets.f77017d, r48VarMo22139h.f77017d));
                }
                r48 r48VarMo22130j = mo22130j();
                smi smiVar = this.f82295f;
                stableInsets = smiVar != null ? smiVar.getStableInsets() : null;
                int iMin = r48VarMo22130j.f77017d;
                if (stableInsets != null) {
                    iMin = Math.min(iMin, stableInsets.f77017d);
                }
                return r48.m21004of(r48VarMo22130j.f77014a, 0, r48VarMo22130j.f77016c, iMin);
            }
            if (i != 8) {
                if (i == 16) {
                    return mo22144i();
                }
                if (i == 32) {
                    return mo22143g();
                }
                if (i == 64) {
                    return mo22145k();
                }
                if (i != 128) {
                    return r48.f77013e;
                }
                smi smiVar2 = this.f82295f;
                if4 displayCutout = smiVar2 != null ? smiVar2.getDisplayCutout() : mo22142f();
                return displayCutout != null ? r48.m21004of(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom()) : r48.f77013e;
            }
            r48[] r48VarArr = this.f82293d;
            stableInsets = r48VarArr != null ? r48VarArr[C12678m.m22147b(8)] : null;
            if (stableInsets != null) {
                return stableInsets;
            }
            r48 r48VarMo22130j2 = mo22130j();
            r48 rootStableInsets2 = getRootStableInsets();
            int i3 = r48VarMo22130j2.f77017d;
            if (i3 > rootStableInsets2.f77017d) {
                return r48.m21004of(0, 0, 0, i3);
            }
            r48 r48Var = this.f82296g;
            return (r48Var == null || r48Var.equals(r48.f77013e) || (i2 = this.f82296g.f77017d) <= rootStableInsets2.f77017d) ? r48.f77013e : r48.m21004of(0, 0, 0, i2);
        }

        /* JADX INFO: renamed from: r */
        public boolean m22136r(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !m22135q(i, false).equals(r48.f77013e);
        }

        @Override // p000.smi.C12677l
        public void setOverriddenInsets(r48[] r48VarArr) {
            this.f82293d = r48VarArr;
        }

        @efb
        @igg({"WrongConstant"})
        private r48 getInsets(int i, boolean z) {
            r48 r48VarMax = r48.f77013e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    r48VarMax = r48.max(r48VarMax, m22135q(i2, z));
                }
            }
            return r48VarMax;
        }

        public C12672g(@efb smi smiVar, @efb C12672g c12672g) {
            this(smiVar, new WindowInsets(c12672g.f82292c));
        }
    }

    /* JADX INFO: renamed from: smi$i */
    @c5e(28)
    public static class C12674i extends C12673h {
        public C12674i(@efb smi smiVar, @efb WindowInsets windowInsets) {
            super(smiVar, windowInsets);
        }

        @Override // p000.smi.C12677l
        @efb
        /* JADX INFO: renamed from: a */
        public smi mo22141a() {
            return smi.toWindowInsetsCompat(this.f82292c.consumeDisplayCutout());
        }

        @Override // p000.smi.C12672g, p000.smi.C12677l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12674i)) {
                return false;
            }
            C12674i c12674i = (C12674i) obj;
            return Objects.equals(this.f82292c, c12674i.f82292c) && Objects.equals(this.f82296g, c12674i.f82296g);
        }

        @Override // p000.smi.C12677l
        @hib
        /* JADX INFO: renamed from: f */
        public if4 mo22142f() {
            return if4.m12998b(this.f82292c.getDisplayCutout());
        }

        @Override // p000.smi.C12677l
        public int hashCode() {
            return this.f82292c.hashCode();
        }

        public C12674i(@efb smi smiVar, @efb C12674i c12674i) {
            super(smiVar, c12674i);
        }
    }

    /* JADX INFO: renamed from: smi$k */
    @c5e(30)
    public static class C12676k extends C12675j {

        /* JADX INFO: renamed from: q */
        @efb
        public static final smi f82301q = smi.toWindowInsetsCompat(WindowInsets.CONSUMED);

        public C12676k(@efb smi smiVar, @efb WindowInsets windowInsets) {
            super(smiVar, windowInsets);
        }

        @Override // p000.smi.C12672g, p000.smi.C12677l
        /* JADX INFO: renamed from: d */
        public final void mo22128d(@efb View view) {
        }

        @Override // p000.smi.C12672g, p000.smi.C12677l
        @efb
        public r48 getInsets(int i) {
            return r48.toCompatInsets(this.f82292c.getInsets(C12679n.m22148a(i)));
        }

        @Override // p000.smi.C12672g, p000.smi.C12677l
        @efb
        public r48 getInsetsIgnoringVisibility(int i) {
            return r48.toCompatInsets(this.f82292c.getInsetsIgnoringVisibility(C12679n.m22148a(i)));
        }

        @Override // p000.smi.C12672g, p000.smi.C12677l
        public boolean isVisible(int i) {
            return this.f82292c.isVisible(C12679n.m22148a(i));
        }

        public C12676k(@efb smi smiVar, @efb C12676k c12676k) {
            super(smiVar, c12676k);
        }
    }

    /* JADX INFO: renamed from: smi$l */
    public static class C12677l {

        /* JADX INFO: renamed from: b */
        @efb
        public static final smi f82302b = new C12667b().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();

        /* JADX INFO: renamed from: a */
        public final smi f82303a;

        public C12677l(@efb smi smiVar) {
            this.f82303a = smiVar;
        }

        @efb
        /* JADX INFO: renamed from: a */
        public smi mo22141a() {
            return this.f82303a;
        }

        @efb
        /* JADX INFO: renamed from: b */
        public smi mo22137b() {
            return this.f82303a;
        }

        @efb
        /* JADX INFO: renamed from: c */
        public smi mo22138c() {
            return this.f82303a;
        }

        /* JADX INFO: renamed from: d */
        public void mo22128d(@efb View view) {
        }

        /* JADX INFO: renamed from: e */
        public void mo22129e(@efb smi smiVar) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12677l)) {
                return false;
            }
            C12677l c12677l = (C12677l) obj;
            return mo22132n() == c12677l.mo22132n() && mo22140m() == c12677l.mo22140m() && pkb.equals(mo22130j(), c12677l.mo22130j()) && pkb.equals(mo22139h(), c12677l.mo22139h()) && pkb.equals(mo22142f(), c12677l.mo22142f());
        }

        @hib
        /* JADX INFO: renamed from: f */
        public if4 mo22142f() {
            return null;
        }

        @efb
        /* JADX INFO: renamed from: g */
        public r48 mo22143g() {
            return mo22130j();
        }

        @efb
        public r48 getInsets(int i) {
            return r48.f77013e;
        }

        @efb
        public r48 getInsetsIgnoringVisibility(int i) {
            if ((i & 8) == 0) {
                return r48.f77013e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        @efb
        /* JADX INFO: renamed from: h */
        public r48 mo22139h() {
            return r48.f77013e;
        }

        public int hashCode() {
            return pkb.hash(Boolean.valueOf(mo22132n()), Boolean.valueOf(mo22140m()), mo22130j(), mo22139h(), mo22142f());
        }

        @efb
        /* JADX INFO: renamed from: i */
        public r48 mo22144i() {
            return mo22130j();
        }

        public boolean isVisible(int i) {
            return true;
        }

        @efb
        /* JADX INFO: renamed from: j */
        public r48 mo22130j() {
            return r48.f77013e;
        }

        @efb
        /* JADX INFO: renamed from: k */
        public r48 mo22145k() {
            return mo22130j();
        }

        @efb
        /* JADX INFO: renamed from: l */
        public smi mo22131l(int i, int i2, int i3, int i4) {
            return f82302b;
        }

        /* JADX INFO: renamed from: m */
        public boolean mo22140m() {
            return false;
        }

        /* JADX INFO: renamed from: n */
        public boolean mo22132n() {
            return false;
        }

        /* JADX INFO: renamed from: o */
        public void mo22133o(@efb r48 r48Var) {
        }

        /* JADX INFO: renamed from: p */
        public void mo22134p(@hib smi smiVar) {
        }

        public void setOverriddenInsets(r48[] r48VarArr) {
        }

        public void setStableInsets(r48 r48Var) {
        }
    }

    /* JADX INFO: renamed from: smi$m */
    public static final class C12678m {

        /* JADX INFO: renamed from: a */
        public static final int f82304a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f82305b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f82306c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f82307d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f82308e = 8;

        /* JADX INFO: renamed from: f */
        public static final int f82309f = 16;

        /* JADX INFO: renamed from: g */
        public static final int f82310g = 32;

        /* JADX INFO: renamed from: h */
        public static final int f82311h = 64;

        /* JADX INFO: renamed from: i */
        public static final int f82312i = 128;

        /* JADX INFO: renamed from: j */
        public static final int f82313j = 256;

        /* JADX INFO: renamed from: k */
        public static final int f82314k = 9;

        /* JADX INFO: renamed from: l */
        public static final int f82315l = 256;

        /* JADX INFO: renamed from: smi$m$a */
        @Retention(RetentionPolicy.SOURCE)
        @p7e({p7e.EnumC10826a.f69935b})
        public @interface a {
        }

        private C12678m() {
        }

        @igg({"WrongConstant"})
        @p7e({p7e.EnumC10826a.f69935b})
        /* JADX INFO: renamed from: a */
        public static int m22146a() {
            return -1;
        }

        /* JADX INFO: renamed from: b */
        public static int m22147b(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        public static int captionBar() {
            return 4;
        }

        public static int displayCutout() {
            return 128;
        }

        public static int ime() {
            return 8;
        }

        public static int mandatorySystemGestures() {
            return 32;
        }

        public static int navigationBars() {
            return 2;
        }

        public static int statusBars() {
            return 1;
        }

        public static int systemBars() {
            return 7;
        }

        public static int systemGestures() {
            return 16;
        }

        public static int tappableElement() {
            return 64;
        }
    }

    /* JADX INFO: renamed from: smi$n */
    @c5e(30)
    public static final class C12679n {
        private C12679n() {
        }

        /* JADX INFO: renamed from: a */
        public static int m22148a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f82271c = C12676k.f82301q;
        } else {
            f82271c = C12677l.f82302b;
        }
    }

    @c5e(20)
    private smi(@efb WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f82272a = new C12676k(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f82272a = new C12675j(this, windowInsets);
        } else if (i >= 28) {
            this.f82272a = new C12674i(this, windowInsets);
        } else {
            this.f82272a = new C12673h(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static r48 m22111b(@efb r48 r48Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, r48Var.f77014a - i);
        int iMax2 = Math.max(0, r48Var.f77015b - i2);
        int iMax3 = Math.max(0, r48Var.f77016c - i3);
        int iMax4 = Math.max(0, r48Var.f77017d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? r48Var : r48.m21004of(iMax, iMax2, iMax3, iMax4);
    }

    @c5e(20)
    @efb
    public static smi toWindowInsetsCompat(@efb WindowInsets windowInsets) {
        return toWindowInsetsCompat(windowInsets, null);
    }

    /* JADX INFO: renamed from: a */
    public void m22112a(@efb View view) {
        this.f82272a.mo22128d(view);
    }

    /* JADX INFO: renamed from: c */
    public void m22113c(r48[] r48VarArr) {
        this.f82272a.setOverriddenInsets(r48VarArr);
    }

    @efb
    @Deprecated
    public smi consumeDisplayCutout() {
        return this.f82272a.mo22141a();
    }

    @efb
    @Deprecated
    public smi consumeStableInsets() {
        return this.f82272a.mo22137b();
    }

    @efb
    @Deprecated
    public smi consumeSystemWindowInsets() {
        return this.f82272a.mo22138c();
    }

    /* JADX INFO: renamed from: d */
    public void m22114d(@efb r48 r48Var) {
        this.f82272a.mo22133o(r48Var);
    }

    /* JADX INFO: renamed from: e */
    public void m22115e(@hib smi smiVar) {
        this.f82272a.mo22134p(smiVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof smi) {
            return pkb.equals(this.f82272a, ((smi) obj).f82272a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m22116f(@hib r48 r48Var) {
        this.f82272a.setStableInsets(r48Var);
    }

    @hib
    public if4 getDisplayCutout() {
        return this.f82272a.mo22142f();
    }

    @efb
    public r48 getInsets(int i) {
        return this.f82272a.getInsets(i);
    }

    @efb
    public r48 getInsetsIgnoringVisibility(int i) {
        return this.f82272a.getInsetsIgnoringVisibility(i);
    }

    @efb
    @Deprecated
    public r48 getMandatorySystemGestureInsets() {
        return this.f82272a.mo22143g();
    }

    @Deprecated
    public int getStableInsetBottom() {
        return this.f82272a.mo22139h().f77017d;
    }

    @Deprecated
    public int getStableInsetLeft() {
        return this.f82272a.mo22139h().f77014a;
    }

    @Deprecated
    public int getStableInsetRight() {
        return this.f82272a.mo22139h().f77016c;
    }

    @Deprecated
    public int getStableInsetTop() {
        return this.f82272a.mo22139h().f77015b;
    }

    @efb
    @Deprecated
    public r48 getStableInsets() {
        return this.f82272a.mo22139h();
    }

    @efb
    @Deprecated
    public r48 getSystemGestureInsets() {
        return this.f82272a.mo22144i();
    }

    @Deprecated
    public int getSystemWindowInsetBottom() {
        return this.f82272a.mo22130j().f77017d;
    }

    @Deprecated
    public int getSystemWindowInsetLeft() {
        return this.f82272a.mo22130j().f77014a;
    }

    @Deprecated
    public int getSystemWindowInsetRight() {
        return this.f82272a.mo22130j().f77016c;
    }

    @Deprecated
    public int getSystemWindowInsetTop() {
        return this.f82272a.mo22130j().f77015b;
    }

    @efb
    @Deprecated
    public r48 getSystemWindowInsets() {
        return this.f82272a.mo22130j();
    }

    @efb
    @Deprecated
    public r48 getTappableElementInsets() {
        return this.f82272a.mo22145k();
    }

    public boolean hasInsets() {
        r48 insets = getInsets(C12678m.m22146a());
        r48 r48Var = r48.f77013e;
        return (insets.equals(r48Var) && getInsetsIgnoringVisibility(C12678m.m22146a() ^ C12678m.ime()).equals(r48Var) && getDisplayCutout() == null) ? false : true;
    }

    @Deprecated
    public boolean hasStableInsets() {
        return !this.f82272a.mo22139h().equals(r48.f77013e);
    }

    @Deprecated
    public boolean hasSystemWindowInsets() {
        return !this.f82272a.mo22130j().equals(r48.f77013e);
    }

    public int hashCode() {
        C12677l c12677l = this.f82272a;
        if (c12677l == null) {
            return 0;
        }
        return c12677l.hashCode();
    }

    @efb
    public smi inset(@efb r48 r48Var) {
        return inset(r48Var.f77014a, r48Var.f77015b, r48Var.f77016c, r48Var.f77017d);
    }

    public boolean isConsumed() {
        return this.f82272a.mo22140m();
    }

    public boolean isRound() {
        return this.f82272a.mo22132n();
    }

    public boolean isVisible(int i) {
        return this.f82272a.isVisible(i);
    }

    @efb
    @Deprecated
    public smi replaceSystemWindowInsets(int i, int i2, int i3, int i4) {
        return new C12667b(this).setSystemWindowInsets(r48.m21004of(i, i2, i3, i4)).build();
    }

    @c5e(20)
    @hib
    public WindowInsets toWindowInsets() {
        C12677l c12677l = this.f82272a;
        if (c12677l instanceof C12672g) {
            return ((C12672g) c12677l).f82292c;
        }
        return null;
    }

    /* JADX INFO: renamed from: smi$c */
    @c5e(api = 20)
    public static class C12668c extends C12671f {

        /* JADX INFO: renamed from: e */
        public static Field f82278e;

        /* JADX INFO: renamed from: f */
        public static boolean f82279f;

        /* JADX INFO: renamed from: g */
        public static Constructor<WindowInsets> f82280g;

        /* JADX INFO: renamed from: h */
        public static boolean f82281h;

        /* JADX INFO: renamed from: c */
        public WindowInsets f82282c;

        /* JADX INFO: renamed from: d */
        public r48 f82283d;

        public C12668c() {
            this.f82282c = createWindowInsetsInstance();
        }

        @hib
        private static WindowInsets createWindowInsetsInstance() {
            if (!f82279f) {
                try {
                    f82278e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i(smi.f82270b, "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f82279f = true;
            }
            Field field = f82278e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i(smi.f82270b, "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f82281h) {
                try {
                    f82280g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i(smi.f82270b, "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f82281h = true;
            }
            Constructor<WindowInsets> constructor = f82280g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i(smi.f82270b, "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // p000.smi.C12671f
        @efb
        /* JADX INFO: renamed from: b */
        public smi mo22117b() {
            m22127a();
            smi windowInsetsCompat = smi.toWindowInsetsCompat(this.f82282c);
            windowInsetsCompat.m22113c(this.f82286b);
            windowInsetsCompat.m22116f(this.f82283d);
            return windowInsetsCompat;
        }

        @Override // p000.smi.C12671f
        /* JADX INFO: renamed from: g */
        public void mo22118g(@hib r48 r48Var) {
            this.f82283d = r48Var;
        }

        @Override // p000.smi.C12671f
        /* JADX INFO: renamed from: i */
        public void mo22119i(@efb r48 r48Var) {
            WindowInsets windowInsets = this.f82282c;
            if (windowInsets != null) {
                this.f82282c = windowInsets.replaceSystemWindowInsets(r48Var.f77014a, r48Var.f77015b, r48Var.f77016c, r48Var.f77017d);
            }
        }

        public C12668c(@efb smi smiVar) {
            super(smiVar);
            this.f82282c = smiVar.toWindowInsets();
        }
    }

    /* JADX INFO: renamed from: smi$d */
    @c5e(api = 29)
    public static class C12669d extends C12671f {

        /* JADX INFO: renamed from: c */
        public final WindowInsets.Builder f82284c;

        public C12669d() {
            this.f82284c = bni.m3266a();
        }

        @Override // p000.smi.C12671f
        @efb
        /* JADX INFO: renamed from: b */
        public smi mo22117b() {
            m22127a();
            smi windowInsetsCompat = smi.toWindowInsetsCompat(this.f82284c.build());
            windowInsetsCompat.m22113c(this.f82286b);
            return windowInsetsCompat;
        }

        @Override // p000.smi.C12671f
        /* JADX INFO: renamed from: c */
        public void mo22120c(@hib if4 if4Var) {
            this.f82284c.setDisplayCutout(if4Var != null ? if4Var.m12999a() : null);
        }

        @Override // p000.smi.C12671f
        /* JADX INFO: renamed from: f */
        public void mo22121f(@efb r48 r48Var) {
            this.f82284c.setMandatorySystemGestureInsets(r48Var.toPlatformInsets());
        }

        @Override // p000.smi.C12671f
        /* JADX INFO: renamed from: g */
        public void mo22118g(@efb r48 r48Var) {
            this.f82284c.setStableInsets(r48Var.toPlatformInsets());
        }

        @Override // p000.smi.C12671f
        /* JADX INFO: renamed from: h */
        public void mo22122h(@efb r48 r48Var) {
            this.f82284c.setSystemGestureInsets(r48Var.toPlatformInsets());
        }

        @Override // p000.smi.C12671f
        /* JADX INFO: renamed from: i */
        public void mo22119i(@efb r48 r48Var) {
            this.f82284c.setSystemWindowInsets(r48Var.toPlatformInsets());
        }

        @Override // p000.smi.C12671f
        /* JADX INFO: renamed from: j */
        public void mo22123j(@efb r48 r48Var) {
            this.f82284c.setTappableElementInsets(r48Var.toPlatformInsets());
        }

        public C12669d(@efb smi smiVar) {
            WindowInsets.Builder builderM3266a;
            super(smiVar);
            WindowInsets windowInsets = smiVar.toWindowInsets();
            if (windowInsets != null) {
                builderM3266a = ani.m2494a(windowInsets);
            } else {
                builderM3266a = bni.m3266a();
            }
            this.f82284c = builderM3266a;
        }
    }

    /* JADX INFO: renamed from: smi$h */
    @c5e(21)
    public static class C12673h extends C12672g {

        /* JADX INFO: renamed from: m */
        public r48 f82297m;

        public C12673h(@efb smi smiVar, @efb WindowInsets windowInsets) {
            super(smiVar, windowInsets);
            this.f82297m = null;
        }

        @Override // p000.smi.C12677l
        @efb
        /* JADX INFO: renamed from: b */
        public smi mo22137b() {
            return smi.toWindowInsetsCompat(this.f82292c.consumeStableInsets());
        }

        @Override // p000.smi.C12677l
        @efb
        /* JADX INFO: renamed from: c */
        public smi mo22138c() {
            return smi.toWindowInsetsCompat(this.f82292c.consumeSystemWindowInsets());
        }

        @Override // p000.smi.C12677l
        @efb
        /* JADX INFO: renamed from: h */
        public final r48 mo22139h() {
            if (this.f82297m == null) {
                this.f82297m = r48.m21004of(this.f82292c.getStableInsetLeft(), this.f82292c.getStableInsetTop(), this.f82292c.getStableInsetRight(), this.f82292c.getStableInsetBottom());
            }
            return this.f82297m;
        }

        @Override // p000.smi.C12677l
        /* JADX INFO: renamed from: m */
        public boolean mo22140m() {
            return this.f82292c.isConsumed();
        }

        @Override // p000.smi.C12677l
        public void setStableInsets(@hib r48 r48Var) {
            this.f82297m = r48Var;
        }

        public C12673h(@efb smi smiVar, @efb C12673h c12673h) {
            super(smiVar, c12673h);
            this.f82297m = null;
            this.f82297m = c12673h.f82297m;
        }
    }

    @c5e(20)
    @efb
    public static smi toWindowInsetsCompat(@efb WindowInsets windowInsets, @hib View view) {
        smi smiVar = new smi((WindowInsets) z7d.checkNotNull(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            smiVar.m22115e(o8i.getRootWindowInsets(view));
            smiVar.m22112a(view.getRootView());
        }
        return smiVar;
    }

    @efb
    public smi inset(@h78(from = 0) int i, @h78(from = 0) int i2, @h78(from = 0) int i3, @h78(from = 0) int i4) {
        return this.f82272a.mo22131l(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: smi$j */
    @c5e(29)
    public static class C12675j extends C12674i {

        /* JADX INFO: renamed from: n */
        public r48 f82298n;

        /* JADX INFO: renamed from: o */
        public r48 f82299o;

        /* JADX INFO: renamed from: p */
        public r48 f82300p;

        public C12675j(@efb smi smiVar, @efb WindowInsets windowInsets) {
            super(smiVar, windowInsets);
            this.f82298n = null;
            this.f82299o = null;
            this.f82300p = null;
        }

        @Override // p000.smi.C12677l
        @efb
        /* JADX INFO: renamed from: g */
        public r48 mo22143g() {
            if (this.f82299o == null) {
                this.f82299o = r48.toCompatInsets(this.f82292c.getMandatorySystemGestureInsets());
            }
            return this.f82299o;
        }

        @Override // p000.smi.C12677l
        @efb
        /* JADX INFO: renamed from: i */
        public r48 mo22144i() {
            if (this.f82298n == null) {
                this.f82298n = r48.toCompatInsets(this.f82292c.getSystemGestureInsets());
            }
            return this.f82298n;
        }

        @Override // p000.smi.C12677l
        @efb
        /* JADX INFO: renamed from: k */
        public r48 mo22145k() {
            if (this.f82300p == null) {
                this.f82300p = r48.toCompatInsets(this.f82292c.getTappableElementInsets());
            }
            return this.f82300p;
        }

        @Override // p000.smi.C12672g, p000.smi.C12677l
        @efb
        /* JADX INFO: renamed from: l */
        public smi mo22131l(int i, int i2, int i3, int i4) {
            return smi.toWindowInsetsCompat(this.f82292c.inset(i, i2, i3, i4));
        }

        @Override // p000.smi.C12673h, p000.smi.C12677l
        public void setStableInsets(@hib r48 r48Var) {
        }

        public C12675j(@efb smi smiVar, @efb C12675j c12675j) {
            super(smiVar, c12675j);
            this.f82298n = null;
            this.f82299o = null;
            this.f82300p = null;
        }
    }

    @efb
    @Deprecated
    public smi replaceSystemWindowInsets(@efb Rect rect) {
        return new C12667b(this).setSystemWindowInsets(r48.m21005of(rect)).build();
    }

    /* JADX INFO: renamed from: smi$b */
    public static final class C12667b {

        /* JADX INFO: renamed from: a */
        public final C12671f f82277a;

        public C12667b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f82277a = new C12670e();
            } else if (i >= 29) {
                this.f82277a = new C12669d();
            } else {
                this.f82277a = new C12668c();
            }
        }

        @efb
        public smi build() {
            return this.f82277a.mo22117b();
        }

        @efb
        public C12667b setDisplayCutout(@hib if4 if4Var) {
            this.f82277a.mo22120c(if4Var);
            return this;
        }

        @efb
        public C12667b setInsets(int i, @efb r48 r48Var) {
            this.f82277a.mo22124d(i, r48Var);
            return this;
        }

        @efb
        public C12667b setInsetsIgnoringVisibility(int i, @efb r48 r48Var) {
            this.f82277a.mo22125e(i, r48Var);
            return this;
        }

        @efb
        @Deprecated
        public C12667b setMandatorySystemGestureInsets(@efb r48 r48Var) {
            this.f82277a.mo22121f(r48Var);
            return this;
        }

        @efb
        @Deprecated
        public C12667b setStableInsets(@efb r48 r48Var) {
            this.f82277a.mo22118g(r48Var);
            return this;
        }

        @efb
        @Deprecated
        public C12667b setSystemGestureInsets(@efb r48 r48Var) {
            this.f82277a.mo22122h(r48Var);
            return this;
        }

        @efb
        @Deprecated
        public C12667b setSystemWindowInsets(@efb r48 r48Var) {
            this.f82277a.mo22119i(r48Var);
            return this;
        }

        @efb
        @Deprecated
        public C12667b setTappableElementInsets(@efb r48 r48Var) {
            this.f82277a.mo22123j(r48Var);
            return this;
        }

        @efb
        public C12667b setVisible(int i, boolean z) {
            this.f82277a.mo22126k(i, z);
            return this;
        }

        public C12667b(@efb smi smiVar) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f82277a = new C12670e(smiVar);
            } else if (i >= 29) {
                this.f82277a = new C12669d(smiVar);
            } else {
                this.f82277a = new C12668c(smiVar);
            }
        }
    }

    public smi(@hib smi smiVar) {
        if (smiVar != null) {
            C12677l c12677l = smiVar.f82272a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (c12677l instanceof C12676k)) {
                this.f82272a = new C12676k(this, (C12676k) c12677l);
            } else if (i >= 29 && (c12677l instanceof C12675j)) {
                this.f82272a = new C12675j(this, (C12675j) c12677l);
            } else if (i >= 28 && (c12677l instanceof C12674i)) {
                this.f82272a = new C12674i(this, (C12674i) c12677l);
            } else if (c12677l instanceof C12673h) {
                this.f82272a = new C12673h(this, (C12673h) c12677l);
            } else if (c12677l instanceof C12672g) {
                this.f82272a = new C12672g(this, (C12672g) c12677l);
            } else {
                this.f82272a = new C12677l(this);
            }
            c12677l.mo22129e(this);
            return;
        }
        this.f82272a = new C12677l(this);
    }
}
