package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public final class f7e {

    /* JADX INFO: renamed from: a */
    public static final String f35643a = "ResourcesCompat";

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<TypedValue> f35644b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    @xc7("sColorStateCacheLock")
    public static final WeakHashMap<C5671e, SparseArray<C5670d>> f35645c = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: d */
    public static final Object f35646d = new Object();

    /* JADX INFO: renamed from: e */
    @e00
    public static final int f35647e = 0;

    /* JADX INFO: renamed from: f7e$a */
    @c5e(21)
    public static class C5667a {
        private C5667a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Drawable m10700a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static Drawable m10701b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* JADX INFO: renamed from: f7e$b */
    @c5e(23)
    public static class C5668b {
        private C5668b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m10702a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @efb
        @ih4
        /* JADX INFO: renamed from: b */
        public static ColorStateList m10703b(@efb Resources resources, @w92 int i, @hib Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* JADX INFO: renamed from: f7e$c */
    @c5e(29)
    public static class C5669c {
        private C5669c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static float m10704a(@efb Resources resources, @xc4 int i) {
            return resources.getFloat(i);
        }
    }

    /* JADX INFO: renamed from: f7e$d */
    public static class C5670d {

        /* JADX INFO: renamed from: a */
        public final ColorStateList f35648a;

        /* JADX INFO: renamed from: b */
        public final Configuration f35649b;

        /* JADX INFO: renamed from: c */
        public final int f35650c;

        public C5670d(@efb ColorStateList colorStateList, @efb Configuration configuration, @hib Resources.Theme theme) {
            this.f35648a = colorStateList;
            this.f35649b = configuration;
            this.f35650c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: renamed from: f7e$e */
    public static final class C5671e {

        /* JADX INFO: renamed from: a */
        public final Resources f35651a;

        /* JADX INFO: renamed from: b */
        public final Resources.Theme f35652b;

        public C5671e(@efb Resources resources, @hib Resources.Theme theme) {
            this.f35651a = resources;
            this.f35652b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5671e.class != obj.getClass()) {
                return false;
            }
            C5671e c5671e = (C5671e) obj;
            return this.f35651a.equals(c5671e.f35651a) && pkb.equals(this.f35652b, c5671e.f35652b);
        }

        public int hashCode() {
            return pkb.hash(this.f35651a, this.f35652b);
        }
    }

    /* JADX INFO: renamed from: f7e$f */
    public static abstract class AbstractC5672f {
        @efb
        @p7e({p7e.EnumC10826a.f69934a})
        public static Handler getHandler(@hib Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @p7e({p7e.EnumC10826a.f69936c})
        public final void callbackFailAsync(final int i, @hib Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: h7e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42743a.lambda$callbackFailAsync$1(i);
                }
            });
        }

        @p7e({p7e.EnumC10826a.f69936c})
        public final void callbackSuccessAsync(@efb final Typeface typeface, @hib Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: g7e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38966a.lambda$callbackSuccessAsync$0(typeface);
                }
            });
        }

        /* JADX INFO: renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
        public abstract void lambda$callbackFailAsync$1(int i);

        /* JADX INFO: renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
        public abstract void lambda$callbackSuccessAsync$0(@efb Typeface typeface);
    }

    /* JADX INFO: renamed from: f7e$g */
    public static final class C5673g {

        /* JADX INFO: renamed from: f7e$g$a */
        @c5e(23)
        public static class a {

            /* JADX INFO: renamed from: a */
            public static final Object f35653a = new Object();

            /* JADX INFO: renamed from: b */
            public static Method f35654b;

            /* JADX INFO: renamed from: c */
            public static boolean f35655c;

            private a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @p000.igg({"BanUncheckedReflection"})
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static void m10707a(@p000.efb android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = p000.f7e.C5673g.a.f35653a
                    monitor-enter(r0)
                    boolean r1 = p000.f7e.C5673g.a.f35655c     // Catch: java.lang.Throwable -> L17
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    p000.f7e.C5673g.a.f35654b = r3     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    goto L21
                L17:
                    r6 = move-exception
                    goto L39
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L17
                L21:
                    p000.f7e.C5673g.a.f35655c = r1     // Catch: java.lang.Throwable -> L17
                L23:
                    java.lang.reflect.Method r1 = p000.f7e.C5673g.a.f35654b     // Catch: java.lang.Throwable -> L17
                    if (r1 == 0) goto L37
                    r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L17 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
                    goto L37
                L2b:
                    r6 = move-exception
                    goto L2e
                L2d:
                    r6 = move-exception
                L2e:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r3 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r3, r6)     // Catch: java.lang.Throwable -> L17
                    p000.f7e.C5673g.a.f35654b = r2     // Catch: java.lang.Throwable -> L17
                L37:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    return
                L39:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.f7e.C5673g.a.m10707a(android.content.res.Resources$Theme):void");
            }
        }

        /* JADX INFO: renamed from: f7e$g$b */
        @c5e(29)
        public static class b {
            private b() {
            }

            @ih4
            /* JADX INFO: renamed from: a */
            public static void m10708a(@efb Resources.Theme theme) {
                theme.rebase();
            }
        }

        private C5673g() {
        }

        public static void rebase(@efb Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.m10708a(theme);
            } else {
                a.m10707a(theme);
            }
        }
    }

    private f7e() {
    }

    private static void addColorStateListToCache(@efb C5671e c5671e, @w92 int i, @efb ColorStateList colorStateList, @hib Resources.Theme theme) {
        synchronized (f35646d) {
            try {
                WeakHashMap<C5671e, SparseArray<C5670d>> weakHashMap = f35645c;
                SparseArray<C5670d> sparseArray = weakHashMap.get(c5671e);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(c5671e, sparseArray);
                }
                sparseArray.append(i, new C5670d(colorStateList, c5671e.f35651a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void clearCachesForTheme(@efb Resources.Theme theme) {
        synchronized (f35646d) {
            try {
                Iterator<C5671e> it = f35645c.keySet().iterator();
                while (it.hasNext()) {
                    C5671e next = it.next();
                    if (next != null && theme.equals(next.f35652b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f35650c == r5.hashCode()) goto L22;
     */
    @p000.hib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.res.ColorStateList getCachedColorStateList(@p000.efb p000.f7e.C5671e r5, @p000.w92 int r6) {
        /*
            java.lang.Object r0 = p000.f7e.f35646d
            monitor-enter(r0)
            java.util.WeakHashMap<f7e$e, android.util.SparseArray<f7e$d>> r1 = p000.f7e.f35645c     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            f7e$d r2 = (p000.f7e.C5670d) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f35649b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f35651a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f35652b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f35650c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f35650c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f35648a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f7e.getCachedColorStateList(f7e$e, int):android.content.res.ColorStateList");
    }

    @hib
    public static Typeface getCachedFont(@efb Context context, @xo6 int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, null, null, false, true);
    }

    @g92
    public static int getColor(@efb Resources resources, @w92 int i, @hib Resources.Theme theme) throws Resources.NotFoundException {
        return C5668b.m10702a(resources, i, theme);
    }

    @hib
    public static ColorStateList getColorStateList(@efb Resources resources, @w92 int i, @hib Resources.Theme theme) throws Resources.NotFoundException {
        C5671e c5671e = new C5671e(resources, theme);
        ColorStateList cachedColorStateList = getCachedColorStateList(c5671e, i);
        if (cachedColorStateList != null) {
            return cachedColorStateList;
        }
        ColorStateList colorStateListInflateColorStateList = inflateColorStateList(resources, i, theme);
        if (colorStateListInflateColorStateList == null) {
            return C5668b.m10703b(resources, i, theme);
        }
        addColorStateListToCache(c5671e, i, colorStateListInflateColorStateList, theme);
        return colorStateListInflateColorStateList;
    }

    @hib
    public static Drawable getDrawable(@efb Resources resources, @gq4 int i, @hib Resources.Theme theme) throws Resources.NotFoundException {
        return C5667a.m10700a(resources, i, theme);
    }

    @hib
    public static Drawable getDrawableForDensity(@efb Resources resources, @gq4 int i, int i2, @hib Resources.Theme theme) throws Resources.NotFoundException {
        return C5667a.m10701b(resources, i, i2, theme);
    }

    public static float getFloat(@efb Resources resources, @xc4 int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C5669c.m10704a(resources, i);
        }
        TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    @hib
    public static Typeface getFont(@efb Context context, @xo6 int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, null, null, false, false);
    }

    @efb
    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = f35644b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @hib
    private static ColorStateList inflateColorStateList(Resources resources, int i, @hib Resources.Theme theme) {
        if (isColorInt(resources, i)) {
            return null;
        }
        try {
            return sa2.createFromXml(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w(f35643a, "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static boolean isColorInt(@efb Resources resources, @w92 int i) {
        TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        return i2 >= 28 && i2 <= 31;
    }

    private static Typeface loadFont(@efb Context context, int i, @efb TypedValue typedValue, int i2, @hib AbstractC5672f abstractC5672f, @hib Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceLoadFont = loadFont(context, resources, typedValue, i, i2, abstractC5672f, handler, z, z2);
        if (typefaceLoadFont != null || abstractC5672f != null || z2) {
            return typefaceLoadFont;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    public static void getFont(@efb Context context, @xo6 int i, @efb AbstractC5672f abstractC5672f, @hib Handler handler) throws Resources.NotFoundException {
        z7d.checkNotNull(abstractC5672f);
        if (context.isRestricted()) {
            abstractC5672f.callbackFailAsync(-4, handler);
        } else {
            loadFont(context, i, new TypedValue(), 0, abstractC5672f, handler, false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface loadFont(@p000.efb android.content.Context r16, android.content.res.Resources r17, @p000.efb android.util.TypedValue r18, int r19, int r20, @p000.hib p000.f7e.AbstractC5672f r21, @p000.hib android.os.Handler r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f7e.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, f7e$f, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    @hib
    @p7e({p7e.EnumC10826a.f69936c})
    public static Typeface getFont(@efb Context context, @xo6 int i, @efb TypedValue typedValue, int i2, @hib AbstractC5672f abstractC5672f) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, abstractC5672f, null, true, false);
    }
}
