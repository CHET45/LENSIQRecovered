package p000;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i7e {

    /* JADX INFO: renamed from: a */
    public static final String f45927a = "ResourcesFlusher";

    /* JADX INFO: renamed from: b */
    public static Field f45928b;

    /* JADX INFO: renamed from: c */
    public static boolean f45929c;

    /* JADX INFO: renamed from: d */
    public static Class<?> f45930d;

    /* JADX INFO: renamed from: e */
    public static boolean f45931e;

    /* JADX INFO: renamed from: f */
    public static Field f45932f;

    /* JADX INFO: renamed from: g */
    public static boolean f45933g;

    /* JADX INFO: renamed from: h */
    public static Field f45934h;

    /* JADX INFO: renamed from: i */
    public static boolean f45935i;

    /* JADX INFO: renamed from: i7e$a */
    @c5e(16)
    public static class C7177a {
        private C7177a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m12850a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    private i7e() {
    }

    /* JADX INFO: renamed from: a */
    public static void m12849a(@efb Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        flushNougats(resources);
    }

    @c5e(21)
    private static void flushLollipops(@efb Resources resources) {
        Map map;
        if (!f45929c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f45928b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f45927a, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f45929c = true;
        }
        Field field = f45928b;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(f45927a, "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @c5e(23)
    private static void flushMarshmallows(@efb Resources resources) {
        Object obj;
        if (!f45929c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f45928b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f45927a, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f45929c = true;
        }
        Field field = f45928b;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(f45927a, "Could not retrieve value from Resources#mDrawableCache", e2);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        flushThemedResourcesCache(obj);
    }

    @c5e(24)
    private static void flushNougats(@efb Resources resources) {
        Object obj;
        if (!f45935i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f45934h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f45927a, "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f45935i = true;
        }
        Field field = f45934h;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e(f45927a, "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f45929c) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f45928b = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e(f45927a, "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f45929c = true;
        }
        Field field2 = f45928b;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e(f45927a, "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
        }
        if (obj2 != null) {
            flushThemedResourcesCache(obj2);
        }
    }

    @c5e(16)
    private static void flushThemedResourcesCache(@efb Object obj) {
        LongSparseArray longSparseArray;
        if (!f45931e) {
            try {
                f45930d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e(f45927a, "Could not find ThemedResourceCache class", e);
            }
            f45931e = true;
        }
        Class<?> cls = f45930d;
        if (cls == null) {
            return;
        }
        if (!f45933g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f45932f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(f45927a, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f45933g = true;
        }
        Field field = f45932f;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e(f45927a, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            C7177a.m12850a(longSparseArray);
        }
    }
}
