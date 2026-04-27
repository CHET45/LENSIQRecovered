package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class pl1 {

    /* JADX INFO: renamed from: a */
    public static ql1 f71308a;

    public static void clear() {
        clear(getDefaultCacheDoubleUtils());
    }

    public static Bitmap getBitmap(@efb String str) {
        if (str != null) {
            return getBitmap(str, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static byte[] getBytes(@efb String str) {
        if (str != null) {
            return getBytes(str, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static int getCacheDiskCount() {
        return getCacheDiskCount(getDefaultCacheDoubleUtils());
    }

    public static long getCacheDiskSize() {
        return getCacheDiskSize(getDefaultCacheDoubleUtils());
    }

    public static int getCacheMemoryCount() {
        return getCacheMemoryCount(getDefaultCacheDoubleUtils());
    }

    private static ql1 getDefaultCacheDoubleUtils() {
        ql1 ql1Var = f71308a;
        return ql1Var != null ? ql1Var : ql1.getInstance();
    }

    public static Drawable getDrawable(@efb String str) {
        if (str != null) {
            return getDrawable(str, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONArray getJSONArray(@efb String str) {
        if (str != null) {
            return getJSONArray(str, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONObject getJSONObject(@efb String str) {
        if (str != null) {
            return getJSONObject(str, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T getParcelable(@efb String str, @efb Parcelable.Creator<T> creator) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (creator != null) {
            return (T) getParcelable(str, (Parcelable.Creator) creator, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'creator' of type Parcelable.Creator<T> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Object getSerializable(@efb String str) {
        if (str != null) {
            return getSerializable(str, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getString(@efb String str) {
        if (str != null) {
            return getString(str, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, byte[] bArr) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        put(str, bArr, getDefaultCacheDoubleUtils());
    }

    public static void remove(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        remove(str, getDefaultCacheDoubleUtils());
    }

    public static void setDefaultCacheDoubleUtils(ql1 ql1Var) {
        f71308a = ql1Var;
    }

    public static void clear(@efb ql1 ql1Var) {
        if (ql1Var == null) {
            throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        ql1Var.clear();
    }

    public static int getCacheDiskCount(@efb ql1 ql1Var) {
        if (ql1Var != null) {
            return ql1Var.getCacheDiskCount();
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static long getCacheDiskSize(@efb ql1 ql1Var) {
        if (ql1Var != null) {
            return ql1Var.getCacheDiskSize();
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static int getCacheMemoryCount(@efb ql1 ql1Var) {
        if (ql1Var != null) {
            return ql1Var.getCacheMemoryCount();
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Bitmap getBitmap(@efb String str, Bitmap bitmap) {
        if (str != null) {
            return getBitmap(str, bitmap, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static byte[] getBytes(@efb String str, byte[] bArr) {
        if (str != null) {
            return getBytes(str, bArr, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Drawable getDrawable(@efb String str, Drawable drawable) {
        if (str != null) {
            return getDrawable(str, drawable, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONArray getJSONArray(@efb String str, JSONArray jSONArray) {
        if (str != null) {
            return getJSONArray(str, jSONArray, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONObject getJSONObject(@efb String str, JSONObject jSONObject) {
        if (str != null) {
            return getJSONObject(str, jSONObject, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Object getSerializable(@efb String str, Object obj) {
        if (str != null) {
            return getSerializable(str, obj, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getString(@efb String str, String str2) {
        if (str != null) {
            return getString(str, str2, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, byte[] bArr, int i) {
        if (str != null) {
            put(str, bArr, i, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void remove(@efb String str, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.remove(str);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T getParcelable(@efb String str, @efb Parcelable.Creator<T> creator, T t) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (creator != null) {
            return (T) getParcelable(str, creator, t, getDefaultCacheDoubleUtils());
        }
        throw new NullPointerException("Argument 'creator' of type Parcelable.Creator<T> (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Bitmap getBitmap(@efb String str, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getBitmap(str);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static byte[] getBytes(@efb String str, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getBytes(str);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Drawable getDrawable(@efb String str, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getDrawable(str);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONArray getJSONArray(@efb String str, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getJSONArray(str);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONObject getJSONObject(@efb String str, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getJSONObject(str);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Object getSerializable(@efb String str, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getSerializable(str);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getString(@efb String str, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getString(str);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, String str2) {
        if (str != null) {
            put(str, str2, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Bitmap getBitmap(@efb String str, Bitmap bitmap, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getBitmap(str, bitmap);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static byte[] getBytes(@efb String str, byte[] bArr, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getBytes(str, bArr);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Drawable getDrawable(@efb String str, Drawable drawable, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getDrawable(str, drawable);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONArray getJSONArray(@efb String str, JSONArray jSONArray, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getJSONArray(str, jSONArray);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T getParcelable(@efb String str, @efb Parcelable.Creator<T> creator, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (creator == null) {
            throw new NullPointerException("Argument 'creator' of type Parcelable.Creator<T> (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return (T) ql1Var.getParcelable(str, creator);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Object getSerializable(@efb String str, Object obj, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getSerializable(str, obj);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getString(@efb String str, String str2, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getString(str, str2);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, String str2, int i) {
        if (str != null) {
            put(str, str2, i, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONObject getJSONObject(@efb String str, JSONObject jSONObject, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return ql1Var.getJSONObject(str, jSONObject);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, JSONObject jSONObject) {
        if (str != null) {
            put(str, jSONObject, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T getParcelable(@efb String str, @efb Parcelable.Creator<T> creator, T t, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (creator == null) {
            throw new NullPointerException("Argument 'creator' of type Parcelable.Creator<T> (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            return (T) ql1Var.getParcelable(str, creator, t);
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, JSONObject jSONObject, int i) {
        if (str != null) {
            put(str, jSONObject, i, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, JSONArray jSONArray) {
        if (str != null) {
            put(str, jSONArray, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, JSONArray jSONArray, int i) {
        if (str != null) {
            put(str, jSONArray, i, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Bitmap bitmap) {
        if (str != null) {
            put(str, bitmap, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Bitmap bitmap, int i) {
        if (str != null) {
            put(str, bitmap, i, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Drawable drawable) {
        if (str != null) {
            put(str, drawable, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Drawable drawable, int i) {
        if (str != null) {
            put(str, drawable, i, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Parcelable parcelable) {
        if (str != null) {
            put(str, parcelable, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Parcelable parcelable, int i) {
        if (str != null) {
            put(str, parcelable, i, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Serializable serializable) {
        if (str != null) {
            put(str, serializable, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Serializable serializable, int i) {
        if (str != null) {
            put(str, serializable, i, getDefaultCacheDoubleUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, byte[] bArr, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, bArr);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, byte[] bArr, int i, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, bArr, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, String str2, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, str2);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, String str2, int i, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, str2, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, JSONObject jSONObject, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, jSONObject);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, JSONObject jSONObject, int i, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, jSONObject, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, JSONArray jSONArray, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, jSONArray);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, JSONArray jSONArray, int i, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, jSONArray, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Bitmap bitmap, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, bitmap);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Bitmap bitmap, int i, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, bitmap, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Drawable drawable, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, drawable);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Drawable drawable, int i, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, drawable, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Parcelable parcelable, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, parcelable);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Parcelable parcelable, int i, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, parcelable, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Serializable serializable, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, serializable);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, Serializable serializable, int i, @efb ql1 ql1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ql1Var != null) {
            ql1Var.put(str, serializable, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
