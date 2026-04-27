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
@c5e(26)
@igg({"SoonBlockedPrivateApi"})
@p7e({p7e.EnumC10826a.f69934a})
public final class lki {

    /* JADX INFO: renamed from: a */
    public static final String f58022a = "WeightTypeface";

    /* JADX INFO: renamed from: b */
    public static final String f58023b = "native_instance";

    /* JADX INFO: renamed from: c */
    public static final String f58024c = "nativeCreateFromTypefaceWithExactStyle";

    /* JADX INFO: renamed from: d */
    public static final Field f58025d;

    /* JADX INFO: renamed from: e */
    public static final Method f58026e;

    /* JADX INFO: renamed from: f */
    public static final Constructor<Typeface> f58027f;

    /* JADX INFO: renamed from: g */
    @xc7("sWeightCacheLock")
    public static final zl9<SparseArray<Typeface>> f58028g;

    /* JADX INFO: renamed from: h */
    public static final Object f58029h;

    static {
        Field declaredField;
        Constructor<Typeface> declaredConstructor;
        Method declaredMethod;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod(f58024c, cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
        }
        f58025d = declaredField;
        f58026e = declaredMethod;
        f58027f = declaredConstructor;
        f58028g = new zl9<>(3);
        f58029h = new Object();
    }

    private lki() {
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static Typeface m16209a(@efb Typeface typeface, int i, boolean z) {
        if (!isPrivateApiAvailable()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (f58029h) {
            try {
                long nativeInstance = getNativeInstance(typeface);
                zl9<SparseArray<Typeface>> zl9Var = f58028g;
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
                Typeface typefaceCreate = create(nativeCreateFromTypefaceWithExactStyle(nativeInstance, i, z));
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
            return f58027f.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static long getNativeInstance(@efb Typeface typeface) {
        try {
            return f58025d.getLong(typeface);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isPrivateApiAvailable() {
        return f58025d != null;
    }

    @igg({"BanUncheckedReflection"})
    private static long nativeCreateFromTypefaceWithExactStyle(long j, int i, boolean z) {
        try {
            return ((Long) f58026e.invoke(null, Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
