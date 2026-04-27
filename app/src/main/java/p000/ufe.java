package p000;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ufe {

    /* JADX INFO: renamed from: a */
    public static wfe f87907a;

    public static void clear() {
        clear(getDefaultSPUtils());
    }

    public static boolean contains(@efb String str) {
        if (str != null) {
            return contains(str, getDefaultSPUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Map<String, ?> getAll() {
        return getAll(getDefaultSPUtils());
    }

    public static boolean getBoolean(@efb String str) {
        if (str != null) {
            return getBoolean(str, getDefaultSPUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    private static wfe getDefaultSPUtils() {
        wfe wfeVar = f87907a;
        return wfeVar != null ? wfeVar : wfe.getInstance();
    }

    public static float getFloat(@efb String str) {
        if (str != null) {
            return getFloat(str, getDefaultSPUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static int getInt(@efb String str) {
        if (str != null) {
            return getInt(str, getDefaultSPUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static long getLong(@efb String str) {
        if (str != null) {
            return getLong(str, getDefaultSPUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getString(@efb String str) {
        if (str != null) {
            return getString(str, getDefaultSPUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Set<String> getStringSet(@efb String str) {
        if (str != null) {
            return getStringSet(str, getDefaultSPUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        put(str, str2, getDefaultSPUtils());
    }

    public static void remove(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        remove(str, getDefaultSPUtils());
    }

    public static void setDefaultSPUtils(wfe wfeVar) {
        f87907a = wfeVar;
    }

    public static void clear(boolean z) {
        clear(z, getDefaultSPUtils());
    }

    public static Map<String, ?> getAll(@efb wfe wfeVar) {
        if (wfeVar != null) {
            return wfeVar.getAll();
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void clear(@efb wfe wfeVar) {
        if (wfeVar != null) {
            wfeVar.clear();
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean contains(@efb String str, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            return wfeVar.contains(str);
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean getBoolean(@efb String str, boolean z) {
        if (str != null) {
            return getBoolean(str, z, getDefaultSPUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static float getFloat(@efb String str, float f) {
        if (str != null) {
            return getFloat(str, f, getDefaultSPUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static int getInt(@efb String str, int i) {
        if (str != null) {
            return getInt(str, i, getDefaultSPUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static long getLong(@efb String str, long j) {
        if (str != null) {
            return getLong(str, j, getDefaultSPUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getString(@efb String str, String str2) {
        if (str != null) {
            return getString(str, str2, getDefaultSPUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Set<String> getStringSet(@efb String str, Set<String> set) {
        if (str != null) {
            return getStringSet(str, set, getDefaultSPUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, String str2, boolean z) {
        if (str != null) {
            put(str, str2, z, getDefaultSPUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void remove(@efb String str, boolean z) {
        if (str != null) {
            remove(str, z, getDefaultSPUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void clear(boolean z, @efb wfe wfeVar) {
        if (wfeVar != null) {
            wfeVar.clear(z);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean getBoolean(@efb String str, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            return wfeVar.getBoolean(str);
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static float getFloat(@efb String str, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            return wfeVar.getFloat(str);
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static int getInt(@efb String str, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            return wfeVar.getInt(str);
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static long getLong(@efb String str, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            return wfeVar.getLong(str);
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getString(@efb String str, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            return wfeVar.getString(str);
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Set<String> getStringSet(@efb String str, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            return wfeVar.getStringSet(str);
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, int i) {
        if (str != null) {
            put(str, i, getDefaultSPUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void remove(@efb String str, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.remove(str);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean getBoolean(@efb String str, boolean z, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            return wfeVar.getBoolean(str, z);
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static float getFloat(@efb String str, float f, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            return wfeVar.getFloat(str, f);
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static int getInt(@efb String str, int i, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            return wfeVar.getInt(str, i);
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static long getLong(@efb String str, long j, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            return wfeVar.getLong(str, j);
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getString(@efb String str, String str2, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            return wfeVar.getString(str, str2);
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Set<String> getStringSet(@efb String str, Set<String> set, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            return wfeVar.getStringSet(str, set);
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, int i, boolean z) {
        if (str != null) {
            put(str, i, z, getDefaultSPUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void remove(@efb String str, boolean z, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.remove(str, z);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, long j) {
        if (str != null) {
            put(str, j, getDefaultSPUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, long j, boolean z) {
        if (str != null) {
            put(str, j, z, getDefaultSPUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, float f) {
        if (str != null) {
            put(str, f, getDefaultSPUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, float f, boolean z) {
        if (str != null) {
            put(str, f, z, getDefaultSPUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, boolean z) {
        if (str != null) {
            put(str, z, getDefaultSPUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, boolean z, boolean z2) {
        if (str != null) {
            put(str, z, z2, getDefaultSPUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Set<String> set) {
        if (str != null) {
            put(str, set, getDefaultSPUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Set<String> set, boolean z) {
        if (str != null) {
            put(str, set, z, getDefaultSPUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, String str2, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.put(str, str2);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, String str2, boolean z, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.put(str, str2, z);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, int i, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.put(str, i);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, int i, boolean z, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.put(str, i, z);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, long j, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.put(str, j);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, long j, boolean z, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.put(str, j, z);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, float f, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.put(str, f);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, float f, boolean z, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.put(str, f, z);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, boolean z, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.put(str, z);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, boolean z, boolean z2, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.put(str, z, z2);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Set<String> set, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.put(str, set);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Set<String> set, boolean z, @efb wfe wfeVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (wfeVar != null) {
            wfeVar.put(str, set, z);
            return;
        }
        throw new NullPointerException("Argument 'spUtils' of type SPUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
