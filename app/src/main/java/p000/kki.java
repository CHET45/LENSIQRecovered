package p000;

import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@c5e(21)
@igg({"SoonBlockedPrivateApi"})
@p7e({p7e.EnumC10826a.f69934a})
public final class kki {

    /* JADX INFO: renamed from: a */
    public static final String f54574a = "WeightTypeface";

    /* JADX INFO: renamed from: b */
    public static final String f54575b = "native_instance";

    /* JADX INFO: renamed from: c */
    public static final String f54576c = "nativeCreateFromTypeface";

    /* JADX INFO: renamed from: d */
    public static final String f54577d = "nativeCreateWeightAlias";

    /* JADX INFO: renamed from: e */
    public static final Field f54578e;

    /* JADX INFO: renamed from: f */
    public static final Method f54579f;

    /* JADX INFO: renamed from: g */
    public static final Method f54580g;

    /* JADX INFO: renamed from: h */
    public static final Constructor<Typeface> f54581h;

    /* JADX INFO: renamed from: i */
    @xc7("sWeightCacheLock")
    public static final zl9<SparseArray<Typeface>> f54582i;

    /* JADX INFO: renamed from: j */
    public static final Object f54583j;

    static {
        Field declaredField;
        Constructor<Typeface> declaredConstructor;
        Method declaredMethod;
        Method declaredMethod2;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod(f54576c, cls, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod2 = Typeface.class.getDeclaredMethod(f54577d, cls, cls2);
            declaredMethod2.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
            declaredMethod2 = null;
        }
        f54578e = declaredField;
        f54579f = declaredMethod;
        f54580g = declaredMethod2;
        f54581h = declaredConstructor;
        f54582i = new zl9<>(3);
        f54583j = new Object();
    }

    private kki() {
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static Typeface m14817a(@efb Typeface typeface, int i, boolean z) {
        if (!isPrivateApiAvailable()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (f54583j) {
            try {
                long nativeInstance = getNativeInstance(typeface);
                zl9<SparseArray<Typeface>> zl9Var = f54582i;
                SparseArray<Typeface> sparseArray = zl9Var.get(nativeInstance);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>(4);
                    zl9Var.put(nativeInstance, sparseArray);
                } else {
                    Typeface typeface2 = sparseArray.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface typefaceCreate = z == typeface.isItalic() ? create(nativeCreateWeightAlias(nativeInstance, i)) : create(nativeCreateFromTypefaceWithExactStyle(nativeInstance, i, z));
                sparseArray.put(i2, typefaceCreate);
                return typefaceCreate;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @hib
    private static Typeface create(long j) {
        try {
            return f54581h.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static long getNativeInstance(@efb Typeface typeface) {
        try {
            return f54578e.getLong(typeface);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isPrivateApiAvailable() {
        return f54578e != null;
    }

    @igg({"BanUncheckedReflection"})
    private static long nativeCreateFromTypefaceWithExactStyle(long j, int i, boolean z) {
        try {
            Long l = (Long) f54579f.invoke(null, Long.valueOf(j), Integer.valueOf(z ? 2 : 0));
            l.longValue();
            return ((Long) f54580g.invoke(null, l, Integer.valueOf(i))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @igg({"BanUncheckedReflection"})
    private static long nativeCreateWeightAlias(long j, int i) {
        try {
            return ((Long) f54580g.invoke(null, Long.valueOf(j), Integer.valueOf(i))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
