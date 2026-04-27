package p000;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class sc7 {

    /* JADX INFO: renamed from: a */
    public static final String f81206a = "defaultGson";

    /* JADX INFO: renamed from: b */
    public static final String f81207b = "delegateGson";

    /* JADX INFO: renamed from: c */
    public static final String f81208c = "logUtilsGson";

    /* JADX INFO: renamed from: d */
    public static final Map<String, Gson> f81209d = new ConcurrentHashMap();

    private sc7() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* JADX INFO: renamed from: a */
    public static Gson m21820a() {
        Map<String, Gson> map = f81209d;
        Gson gson = map.get("logUtilsGson");
        if (gson != null) {
            return gson;
        }
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        map.put("logUtilsGson", gsonCreate);
        return gsonCreate;
    }

    private static Gson createGson() {
        return new GsonBuilder().serializeNulls().disableHtmlEscaping().create();
    }

    public static <T> T fromJson(String str, @efb Class<T> cls) {
        if (cls != null) {
            return (T) fromJson(getGson(), str, (Class) cls);
        }
        throw new NullPointerException("Argument 'type' of type Class<T> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Type getArrayType(@efb Type type) {
        if (type != null) {
            return TypeToken.getArray(type).getType();
        }
        throw new NullPointerException("Argument 'type' of type Type (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Gson getGson(String str) {
        return f81209d.get(str);
    }

    public static Type getListType(@efb Type type) {
        if (type != null) {
            return TypeToken.getParameterized(List.class, type).getType();
        }
        throw new NullPointerException("Argument 'type' of type Type (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Type getMapType(@efb Type type, @efb Type type2) {
        if (type == null) {
            throw new NullPointerException("Argument 'keyType' of type Type (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (type2 != null) {
            return TypeToken.getParameterized(Map.class, type, type2).getType();
        }
        throw new NullPointerException("Argument 'valueType' of type Type (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Type getSetType(@efb Type type) {
        if (type != null) {
            return TypeToken.getParameterized(Set.class, type).getType();
        }
        throw new NullPointerException("Argument 'type' of type Type (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Type getType(@efb Type type, @efb Type... typeArr) {
        if (type == null) {
            throw new NullPointerException("Argument 'rawType' of type Type (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (typeArr != null) {
            return TypeToken.getParameterized(type, typeArr).getType();
        }
        throw new NullPointerException("Argument 'typeArguments' of type Type[] (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void setGson(String str, Gson gson) {
        if (TextUtils.isEmpty(str) || gson == null) {
            return;
        }
        f81209d.put(str, gson);
    }

    public static void setGsonDelegate(Gson gson) {
        if (gson == null) {
            return;
        }
        f81209d.put("delegateGson", gson);
    }

    public static String toJson(Object obj) {
        return toJson(getGson(), obj);
    }

    public static Gson getGson() {
        Map<String, Gson> map = f81209d;
        Gson gson = map.get("delegateGson");
        if (gson != null) {
            return gson;
        }
        Gson gson2 = map.get("defaultGson");
        if (gson2 != null) {
            return gson2;
        }
        Gson gsonCreateGson = createGson();
        map.put("defaultGson", gsonCreateGson);
        return gsonCreateGson;
    }

    public static String toJson(Object obj, @efb Type type) {
        if (type != null) {
            return toJson(getGson(), obj, type);
        }
        throw new NullPointerException("Argument 'typeOfSrc' of type Type (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T fromJson(String str, @efb Type type) {
        if (type != null) {
            return (T) fromJson(getGson(), str, type);
        }
        throw new NullPointerException("Argument 'type' of type Type (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String toJson(@efb Gson gson, Object obj) {
        if (gson != null) {
            return gson.toJson(obj);
        }
        throw new NullPointerException("Argument 'gson' of type Gson (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T fromJson(@efb Reader reader, @efb Class<T> cls) {
        if (reader == null) {
            throw new NullPointerException("Argument 'reader' of type Reader (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (cls != null) {
            return (T) fromJson(getGson(), reader, (Class) cls);
        }
        throw new NullPointerException("Argument 'type' of type Class<T> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String toJson(@efb Gson gson, Object obj, @efb Type type) {
        if (gson == null) {
            throw new NullPointerException("Argument 'gson' of type Gson (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (type != null) {
            return gson.toJson(obj, type);
        }
        throw new NullPointerException("Argument 'typeOfSrc' of type Type (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T fromJson(@efb Reader reader, @efb Type type) {
        if (reader == null) {
            throw new NullPointerException("Argument 'reader' of type Reader (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (type != null) {
            return (T) fromJson(getGson(), reader, type);
        }
        throw new NullPointerException("Argument 'type' of type Type (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T fromJson(@efb Gson gson, String str, @efb Class<T> cls) {
        if (gson == null) {
            throw new NullPointerException("Argument 'gson' of type Gson (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (cls != null) {
            return (T) gson.fromJson(str, (Class) cls);
        }
        throw new NullPointerException("Argument 'type' of type Class<T> (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T fromJson(@efb Gson gson, String str, @efb Type type) {
        if (gson == null) {
            throw new NullPointerException("Argument 'gson' of type Gson (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (type != null) {
            return (T) gson.fromJson(str, type);
        }
        throw new NullPointerException("Argument 'type' of type Type (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T fromJson(@efb Gson gson, Reader reader, @efb Class<T> cls) {
        if (gson == null) {
            throw new NullPointerException("Argument 'gson' of type Gson (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (cls != null) {
            return (T) gson.fromJson(reader, (Class) cls);
        }
        throw new NullPointerException("Argument 'type' of type Class<T> (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static <T> T fromJson(@efb Gson gson, Reader reader, @efb Type type) {
        if (gson == null) {
            throw new NullPointerException("Argument 'gson' of type Gson (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (type != null) {
            return (T) gson.fromJson(reader, type);
        }
        throw new NullPointerException("Argument 'type' of type Type (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
