package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import p000.p7e;
import p000.yo6;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class jki {

    /* JADX INFO: renamed from: a */
    public static final String f51075a = "WeightTypeface";

    /* JADX INFO: renamed from: b */
    public static final String f51076b = "native_instance";

    /* JADX INFO: renamed from: c */
    public static final Field f51077c;

    /* JADX INFO: renamed from: d */
    @xc7("sWeightCacheLock")
    public static final zl9<SparseArray<Typeface>> f51078d;

    /* JADX INFO: renamed from: e */
    public static final Object f51079e;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
        } catch (Exception e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
            declaredField = null;
        }
        f51077c = declaredField;
        f51078d = new zl9<>(3);
        f51079e = new Object();
    }

    private jki() {
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static Typeface m14168a(@efb inh inhVar, @efb Context context, @efb Typeface typeface, int i, boolean z) {
        if (!isPrivateApiAvailable()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (f51079e) {
            try {
                long nativeInstance = getNativeInstance(typeface);
                zl9<SparseArray<Typeface>> zl9Var = f51078d;
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
                Typeface bestFontFromFamily = getBestFontFromFamily(inhVar, context, typeface, i, z);
                if (bestFontFromFamily == null) {
                    bestFontFromFamily = platformTypefaceCreate(typeface, i, z);
                }
                sparseArray.put(i2, bestFontFromFamily);
                return bestFontFromFamily;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @hib
    private static Typeface getBestFontFromFamily(@efb inh inhVar, @efb Context context, @efb Typeface typeface, int i, boolean z) {
        yo6.C15742d c15742dM13231e = inhVar.m13231e(typeface);
        if (c15742dM13231e == null) {
            return null;
        }
        return inhVar.m13230a(context, c15742dM13231e, context.getResources(), i, z);
    }

    private static long getNativeInstance(@efb Typeface typeface) {
        try {
            return ((Number) f51077c.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isPrivateApiAvailable() {
        return f51077c != null;
    }

    private static Typeface platformTypefaceCreate(Typeface typeface, int i, boolean z) {
        boolean z2 = i >= 600;
        return Typeface.create(typeface, (z2 || z) ? !z2 ? 2 : !z ? 1 : 3 : 0);
    }
}
