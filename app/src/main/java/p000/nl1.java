package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class nl1 {

    /* JADX INFO: renamed from: a */
    public static ol1 f64827a;

    public static boolean clear() {
        return clear(getDefaultCacheDiskUtils());
    }

    public static Bitmap getBitmap(@efb String str) {
        if (str != null) {
            return getBitmap(str, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static byte[] getBytes(@efb String str) {
        if (str != null) {
            return getBytes(str, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static int getCacheCount() {
        return getCacheCount(getDefaultCacheDiskUtils());
    }

    public static long getCacheSize() {
        return getCacheSize(getDefaultCacheDiskUtils());
    }

    @efb
    private static ol1 getDefaultCacheDiskUtils() {
        ol1 ol1Var = f64827a;
        if (ol1Var == null) {
            ol1Var = ol1.getInstance();
        }
        if (ol1Var != null) {
            return ol1Var;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.CacheDiskStaticUtils.getDefaultCacheDiskUtils() marked by @androidx.annotation.NonNull");
    }

    public static Drawable getDrawable(@efb String str) {
        if (str != null) {
            return getDrawable(str, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONArray getJSONArray(@efb String str) {
        if (str != null) {
            return getJSONArray(str, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONObject getJSONObject(@efb String str) {
        if (str != null) {
            return getJSONObject(str, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T getParcelable(@efb String str, @efb Parcelable.Creator<T> creator) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (creator != null) {
            return (T) getParcelable(str, (Parcelable.Creator) creator, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'creator' of type Parcelable.Creator<T> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Object getSerializable(@efb String str) {
        if (str != null) {
            return getSerializable(str, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getString(@efb String str) {
        if (str != null) {
            return getString(str, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib byte[] bArr) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        put(str, bArr, getDefaultCacheDiskUtils());
    }

    public static boolean remove(@efb String str) {
        if (str != null) {
            return remove(str, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void setDefaultCacheDiskUtils(@hib ol1 ol1Var) {
        f64827a = ol1Var;
    }

    public static boolean clear(@efb ol1 ol1Var) {
        if (ol1Var != null) {
            return ol1Var.clear();
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static int getCacheCount(@efb ol1 ol1Var) {
        if (ol1Var != null) {
            return ol1Var.getCacheCount();
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static long getCacheSize(@efb ol1 ol1Var) {
        if (ol1Var != null) {
            return ol1Var.getCacheSize();
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Bitmap getBitmap(@efb String str, @hib Bitmap bitmap) {
        if (str != null) {
            return getBitmap(str, bitmap, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static byte[] getBytes(@efb String str, @hib byte[] bArr) {
        if (str != null) {
            return getBytes(str, bArr, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Drawable getDrawable(@efb String str, @hib Drawable drawable) {
        if (str != null) {
            return getDrawable(str, drawable, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONArray getJSONArray(@efb String str, @hib JSONArray jSONArray) {
        if (str != null) {
            return getJSONArray(str, jSONArray, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONObject getJSONObject(@efb String str, @hib JSONObject jSONObject) {
        if (str != null) {
            return getJSONObject(str, jSONObject, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Object getSerializable(@efb String str, @hib Object obj) {
        if (str != null) {
            return getSerializable(str, obj, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getString(@efb String str, @hib String str2) {
        if (str != null) {
            return getString(str, str2, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib byte[] bArr, int i) {
        if (str != null) {
            put(str, bArr, i, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean remove(@efb String str, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.remove(str);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T getParcelable(@efb String str, @efb Parcelable.Creator<T> creator, @hib T t) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (creator != null) {
            return (T) getParcelable(str, creator, t, getDefaultCacheDiskUtils());
        }
        throw new NullPointerException("Argument 'creator' of type Parcelable.Creator<T> (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Bitmap getBitmap(@efb String str, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getBitmap(str);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static byte[] getBytes(@efb String str, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getBytes(str);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Drawable getDrawable(@efb String str, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getDrawable(str);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONArray getJSONArray(@efb String str, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getJSONArray(str);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONObject getJSONObject(@efb String str, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getJSONObject(str);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Object getSerializable(@efb String str, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getSerializable(str);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getString(@efb String str, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getString(str);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib String str2) {
        if (str != null) {
            put(str, str2, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Bitmap getBitmap(@efb String str, @hib Bitmap bitmap, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getBitmap(str, bitmap);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static byte[] getBytes(@efb String str, @hib byte[] bArr, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getBytes(str, bArr);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Drawable getDrawable(@efb String str, @hib Drawable drawable, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getDrawable(str, drawable);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONArray getJSONArray(@efb String str, @hib JSONArray jSONArray, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getJSONArray(str, jSONArray);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static JSONObject getJSONObject(@efb String str, @hib JSONObject jSONObject, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getJSONObject(str, jSONObject);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T getParcelable(@efb String str, @efb Parcelable.Creator<T> creator, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (creator == null) {
            throw new NullPointerException("Argument 'creator' of type Parcelable.Creator<T> (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return (T) ol1Var.getParcelable(str, creator);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Object getSerializable(@efb String str, @hib Object obj, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getSerializable(str, obj);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getString(@efb String str, @hib String str2, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return ol1Var.getString(str, str2);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib String str2, int i) {
        if (str != null) {
            put(str, str2, i, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib JSONObject jSONObject) {
        if (str != null) {
            put(str, jSONObject, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T getParcelable(@efb String str, @efb Parcelable.Creator<T> creator, @hib T t, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (creator == null) {
            throw new NullPointerException("Argument 'creator' of type Parcelable.Creator<T> (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            return (T) ol1Var.getParcelable(str, creator, t);
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib JSONObject jSONObject, int i) {
        if (str != null) {
            put(str, jSONObject, i, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib JSONArray jSONArray) {
        if (str != null) {
            put(str, jSONArray, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib JSONArray jSONArray, int i) {
        if (str != null) {
            put(str, jSONArray, i, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Bitmap bitmap) {
        if (str != null) {
            put(str, bitmap, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Bitmap bitmap, int i) {
        if (str != null) {
            put(str, bitmap, i, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Drawable drawable) {
        if (str != null) {
            put(str, drawable, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Drawable drawable, int i) {
        if (str != null) {
            put(str, drawable, i, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Parcelable parcelable) {
        if (str != null) {
            put(str, parcelable, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Parcelable parcelable, int i) {
        if (str != null) {
            put(str, parcelable, i, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Serializable serializable) {
        if (str != null) {
            put(str, serializable, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Serializable serializable, int i) {
        if (str != null) {
            put(str, serializable, i, getDefaultCacheDiskUtils());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib byte[] bArr, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, bArr);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib byte[] bArr, int i, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, bArr, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib String str2, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, str2);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib String str2, int i, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, str2, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib JSONObject jSONObject, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, jSONObject);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib JSONObject jSONObject, int i, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, jSONObject, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib JSONArray jSONArray, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, jSONArray);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib JSONArray jSONArray, int i, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, jSONArray, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Bitmap bitmap, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, bitmap);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Bitmap bitmap, int i, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, bitmap, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Drawable drawable, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, drawable);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Drawable drawable, int i, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, drawable, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Parcelable parcelable, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, parcelable);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Parcelable parcelable, int i, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, parcelable, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Serializable serializable, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, serializable);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void put(@efb String str, @hib Serializable serializable, int i, @efb ol1 ol1Var) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var != null) {
            ol1Var.put(str, serializable, i);
            return;
        }
        throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
