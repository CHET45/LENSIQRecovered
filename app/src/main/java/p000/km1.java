package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class km1 {

    /* JADX INFO: renamed from: a */
    public static lm1 f54674a;

    public static void clear() {
        clear(getDefaultCacheMemoryUtils());
    }

    public static <T> T get(@efb String str) {
        if (str != null) {
            return (T) get(str, getDefaultCacheMemoryUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static int getCacheCount() {
        return getCacheCount(getDefaultCacheMemoryUtils());
    }

    private static lm1 getDefaultCacheMemoryUtils() {
        lm1 lm1Var = f54674a;
        return lm1Var != null ? lm1Var : lm1.getInstance();
    }

    public static void put(@efb String str, Object obj) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        put(str, obj, getDefaultCacheMemoryUtils());
    }

    public static Object remove(@efb String str) {
        if (str != null) {
            return remove(str, getDefaultCacheMemoryUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void setDefaultCacheMemoryUtils(lm1 lm1Var) {
        f54674a = lm1Var;
    }

    public static void clear(@efb lm1 lm1Var) {
        if (lm1Var == null) {
            throw new NullPointerException("Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        lm1Var.clear();
    }

    public static int getCacheCount(@efb lm1 lm1Var) {
        if (lm1Var != null) {
            return lm1Var.getCacheCount();
        }
        throw new NullPointerException("Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T get(@efb String str, T t) {
        if (str != null) {
            return (T) get(str, t, getDefaultCacheMemoryUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Object obj, int i) {
        if (str != null) {
            put(str, obj, i, getDefaultCacheMemoryUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Object remove(@efb String str, @efb lm1 lm1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (lm1Var != null) {
            return lm1Var.remove(str);
        }
        throw new NullPointerException("Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T get(@efb String str, @efb lm1 lm1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (lm1Var != null) {
            return (T) lm1Var.get(str);
        }
        throw new NullPointerException("Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Object obj, @efb lm1 lm1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (lm1Var != null) {
            lm1Var.put(str, obj);
            return;
        }
        throw new NullPointerException("Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T get(@efb String str, T t, @efb lm1 lm1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (lm1Var != null) {
            return (T) lm1Var.get(str, t);
        }
        throw new NullPointerException("Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Object obj, int i, @efb lm1 lm1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (lm1Var != null) {
            lm1Var.put(str, obj, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
