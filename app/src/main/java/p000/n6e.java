package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.resources.C0437R;
import androidx.appcompat.widget.C0546a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.p7e;
import p000.qd2;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class n6e {

    /* JADX INFO: renamed from: h */
    public static final String f63400h = "ResourceManagerInternal";

    /* JADX INFO: renamed from: i */
    public static final boolean f63401i = false;

    /* JADX INFO: renamed from: k */
    public static final String f63403k = "appcompat_skip_skip";

    /* JADX INFO: renamed from: l */
    public static final String f63404l = "android.graphics.drawable.VectorDrawable";

    /* JADX INFO: renamed from: m */
    public static n6e f63405m;

    /* JADX INFO: renamed from: a */
    public WeakHashMap<Context, mxf<ColorStateList>> f63407a;

    /* JADX INFO: renamed from: b */
    public scf<String, InterfaceC9713e> f63408b;

    /* JADX INFO: renamed from: c */
    public mxf<String> f63409c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap<Context, zl9<WeakReference<Drawable.ConstantState>>> f63410d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e */
    public TypedValue f63411e;

    /* JADX INFO: renamed from: f */
    public boolean f63412f;

    /* JADX INFO: renamed from: g */
    public InterfaceC9714f f63413g;

    /* JADX INFO: renamed from: j */
    public static final PorterDuff.Mode f63402j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: n */
    public static final C9711c f63406n = new C9711c(6);

    /* JADX INFO: renamed from: n6e$a */
    public static class C9709a implements InterfaceC9713e {
        @Override // p000.n6e.InterfaceC9713e
        public Drawable createFromXmlInner(@efb Context context, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) {
            try {
                return C13266tx.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: n6e$b */
    public static class C9710b implements InterfaceC9713e {
        @Override // p000.n6e.InterfaceC9713e
        public Drawable createFromXmlInner(@efb Context context, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) {
            try {
                return C13752ux.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: n6e$c */
    public static class C9711c extends pp9<Integer, PorterDuffColorFilter> {
        public C9711c(int i) {
            super(i);
        }

        private static int generateCacheKey(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* JADX INFO: renamed from: a */
        public PorterDuffColorFilter m17798a(int i, PorterDuff.Mode mode) {
            return get(Integer.valueOf(generateCacheKey(i, mode)));
        }

        /* JADX INFO: renamed from: b */
        public PorterDuffColorFilter m17799b(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(generateCacheKey(i, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: renamed from: n6e$d */
    public static class C9712d implements InterfaceC9713e {
        @Override // p000.n6e.InterfaceC9713e
        public Drawable createFromXmlInner(@efb Context context, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C9712d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    qd2.C11437c.inflate(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: n6e$e */
    public interface InterfaceC9713e {
        Drawable createFromXmlInner(@efb Context context, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme);
    }

    /* JADX INFO: renamed from: n6e$f */
    @p7e({p7e.EnumC10826a.f69936c})
    public interface InterfaceC9714f {
        @hib
        Drawable createDrawableFor(@efb n6e n6eVar, @efb Context context, @gq4 int i);

        @hib
        ColorStateList getTintListForDrawableRes(@efb Context context, @gq4 int i);

        @hib
        PorterDuff.Mode getTintModeForDrawableRes(int i);

        boolean tintDrawable(@efb Context context, @gq4 int i, @efb Drawable drawable);

        boolean tintDrawableUsingColorFilter(@efb Context context, @gq4 int i, @efb Drawable drawable);
    }

    /* JADX INFO: renamed from: n6e$g */
    public static class C9715g implements InterfaceC9713e {
        @Override // p000.n6e.InterfaceC9713e
        public Drawable createFromXmlInner(@efb Context context, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) {
            try {
                return i3i.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    private void addDelegate(@efb String str, @efb InterfaceC9713e interfaceC9713e) {
        if (this.f63408b == null) {
            this.f63408b = new scf<>();
        }
        this.f63408b.put(str, interfaceC9713e);
    }

    private synchronized boolean addDrawableToCache(@efb Context context, long j, @efb Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            zl9<WeakReference<Drawable.ConstantState>> zl9Var = this.f63410d.get(context);
            if (zl9Var == null) {
                zl9Var = new zl9<>();
                this.f63410d.put(context, zl9Var);
            }
            zl9Var.put(j, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void addTintListToCache(@efb Context context, @gq4 int i, @efb ColorStateList colorStateList) {
        if (this.f63407a == null) {
            this.f63407a = new WeakHashMap<>();
        }
        mxf<ColorStateList> mxfVar = this.f63407a.get(context);
        if (mxfVar == null) {
            mxfVar = new mxf<>();
            this.f63407a.put(context, mxfVar);
        }
        mxfVar.append(i, colorStateList);
    }

    private void checkVectorDrawableSetup(@efb Context context) {
        if (this.f63412f) {
            return;
        }
        this.f63412f = true;
        Drawable drawable = getDrawable(context, C0437R.drawable.abc_vector_test);
        if (drawable == null || !isVectorDrawable(drawable)) {
            this.f63412f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable createDrawableIfNeeded(@efb Context context, @gq4 int i) {
        if (this.f63411e == null) {
            this.f63411e = new TypedValue();
        }
        TypedValue typedValue = this.f63411e;
        context.getResources().getValue(i, typedValue, true);
        long jCreateCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, jCreateCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        InterfaceC9714f interfaceC9714f = this.f63413g;
        Drawable drawableCreateDrawableFor = interfaceC9714f == null ? null : interfaceC9714f.createDrawableFor(this, context, i);
        if (drawableCreateDrawableFor != null) {
            drawableCreateDrawableFor.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, jCreateCacheKey, drawableCreateDrawableFor);
        }
        return drawableCreateDrawableFor;
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* JADX INFO: renamed from: e */
    public static void m17792e(Drawable drawable, r2h r2hVar, int[] iArr) {
        int[] state = drawable.getState();
        if (!qq4.canSafelyMutateDrawable(drawable) || drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = r2hVar.f76913d;
            if (z || r2hVar.f76912c) {
                drawable.setColorFilter(createTintFilter(z ? r2hVar.f76910a : null, r2hVar.f76912c ? r2hVar.f76911b : f63402j, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public static synchronized n6e get() {
        try {
            if (f63405m == null) {
                n6e n6eVar = new n6e();
                f63405m = n6eVar;
                installDefaultInflateDelegates(n6eVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f63405m;
    }

    private synchronized Drawable getCachedDrawable(@efb Context context, long j) {
        zl9<WeakReference<Drawable.ConstantState>> zl9Var = this.f63410d.get(context);
        if (zl9Var == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReference = zl9Var.get(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            zl9Var.remove(j);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM17798a;
        C9711c c9711c = f63406n;
        porterDuffColorFilterM17798a = c9711c.m17798a(i, mode);
        if (porterDuffColorFilterM17798a == null) {
            porterDuffColorFilterM17798a = new PorterDuffColorFilter(i, mode);
            c9711c.m17799b(i, mode, porterDuffColorFilterM17798a);
        }
        return porterDuffColorFilterM17798a;
    }

    private ColorStateList getTintListFromCache(@efb Context context, @gq4 int i) {
        mxf<ColorStateList> mxfVar;
        WeakHashMap<Context, mxf<ColorStateList>> weakHashMap = this.f63407a;
        if (weakHashMap == null || (mxfVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return mxfVar.get(i);
    }

    private static void installDefaultInflateDelegates(@efb n6e n6eVar) {
    }

    private static boolean isVectorDrawable(@efb Drawable drawable) {
        return (drawable instanceof i3i) || f63404l.equals(drawable.getClass().getName());
    }

    private Drawable loadDrawableFromDelegates(@efb Context context, @gq4 int i) {
        int next;
        scf<String, InterfaceC9713e> scfVar = this.f63408b;
        if (scfVar == null || scfVar.isEmpty()) {
            return null;
        }
        mxf<String> mxfVar = this.f63409c;
        if (mxfVar != null) {
            String str = mxfVar.get(i);
            if (f63403k.equals(str) || (str != null && this.f63408b.get(str) == null)) {
                return null;
            }
        } else {
            this.f63409c = new mxf<>();
        }
        if (this.f63411e == null) {
            this.f63411e = new TypedValue();
        }
        TypedValue typedValue = this.f63411e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long jCreateCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, jCreateCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(C0546a.f3363y)) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f63409c.append(i, name);
                InterfaceC9713e interfaceC9713e = this.f63408b.get(name);
                if (interfaceC9713e != null) {
                    cachedDrawable = interfaceC9713e.createFromXmlInner(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (cachedDrawable != null) {
                    cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                    addDrawableToCache(context, jCreateCacheKey, cachedDrawable);
                }
            } catch (Exception e) {
                Log.e(f63400h, "Exception while inflating drawable", e);
            }
        }
        if (cachedDrawable == null) {
            this.f63409c.append(i, f63403k);
        }
        return cachedDrawable;
    }

    private Drawable tintDrawable(@efb Context context, @gq4 int i, boolean z, @efb Drawable drawable) {
        ColorStateList colorStateListM17794b = m17794b(context, i);
        if (colorStateListM17794b == null) {
            InterfaceC9714f interfaceC9714f = this.f63413g;
            if ((interfaceC9714f == null || !interfaceC9714f.tintDrawable(context, i, drawable)) && !m17797f(context, i, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (qq4.canSafelyMutateDrawable(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableWrap = yp4.wrap(drawable);
        yp4.setTintList(drawableWrap, colorStateListM17794b);
        PorterDuff.Mode modeM17795c = m17795c(i);
        if (modeM17795c == null) {
            return drawableWrap;
        }
        yp4.setTintMode(drawableWrap, modeM17795c);
        return drawableWrap;
    }

    /* JADX INFO: renamed from: a */
    public synchronized Drawable m17793a(@efb Context context, @gq4 int i, boolean z) {
        Drawable drawableLoadDrawableFromDelegates;
        try {
            checkVectorDrawableSetup(context);
            drawableLoadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
            if (drawableLoadDrawableFromDelegates == null) {
                drawableLoadDrawableFromDelegates = createDrawableIfNeeded(context, i);
            }
            if (drawableLoadDrawableFromDelegates == null) {
                drawableLoadDrawableFromDelegates = lx2.getDrawable(context, i);
            }
            if (drawableLoadDrawableFromDelegates != null) {
                drawableLoadDrawableFromDelegates = tintDrawable(context, i, z, drawableLoadDrawableFromDelegates);
            }
            if (drawableLoadDrawableFromDelegates != null) {
                qq4.m20499a(drawableLoadDrawableFromDelegates);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableLoadDrawableFromDelegates;
    }

    /* JADX INFO: renamed from: b */
    public synchronized ColorStateList m17794b(@efb Context context, @gq4 int i) {
        ColorStateList tintListFromCache;
        tintListFromCache = getTintListFromCache(context, i);
        if (tintListFromCache == null) {
            InterfaceC9714f interfaceC9714f = this.f63413g;
            tintListFromCache = interfaceC9714f == null ? null : interfaceC9714f.getTintListForDrawableRes(context, i);
            if (tintListFromCache != null) {
                addTintListToCache(context, i, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode m17795c(int i) {
        InterfaceC9714f interfaceC9714f = this.f63413g;
        if (interfaceC9714f == null) {
            return null;
        }
        return interfaceC9714f.getTintModeForDrawableRes(i);
    }

    /* JADX INFO: renamed from: d */
    public synchronized Drawable m17796d(@efb Context context, @efb j3i j3iVar, @gq4 int i) {
        try {
            Drawable drawableLoadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
            if (drawableLoadDrawableFromDelegates == null) {
                drawableLoadDrawableFromDelegates = j3iVar.m17115a(i);
            }
            if (drawableLoadDrawableFromDelegates == null) {
                return null;
            }
            return tintDrawable(context, i, false, drawableLoadDrawableFromDelegates);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m17797f(@efb Context context, @gq4 int i, @efb Drawable drawable) {
        InterfaceC9714f interfaceC9714f = this.f63413g;
        return interfaceC9714f != null && interfaceC9714f.tintDrawableUsingColorFilter(context, i, drawable);
    }

    public synchronized Drawable getDrawable(@efb Context context, @gq4 int i) {
        return m17793a(context, i, false);
    }

    public synchronized void onConfigurationChanged(@efb Context context) {
        zl9<WeakReference<Drawable.ConstantState>> zl9Var = this.f63410d.get(context);
        if (zl9Var != null) {
            zl9Var.clear();
        }
    }

    public synchronized void setHooks(InterfaceC9714f interfaceC9714f) {
        this.f63413g = interfaceC9714f;
    }
}
