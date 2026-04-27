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

/* JADX INFO: loaded from: classes7.dex */
public final class qc7 {

    /* JADX INFO: renamed from: a */
    public static final String f73948a = "defaultGson";

    /* JADX INFO: renamed from: b */
    public static final String f73949b = "delegateGson";

    /* JADX INFO: renamed from: c */
    public static final String f73950c = "logUtilsGson";

    /* JADX INFO: renamed from: d */
    public static final Map<String, Gson> f73951d = new ConcurrentHashMap();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: qc7$a */
    public class C11425a<T> extends TypeToken<List<T>> {
    }

    private qc7() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* JADX INFO: renamed from: a */
    public static Gson m20250a() {
        Map<String, Gson> map = f73951d;
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
        return (T) fromJson(getGson(), str, (Class) cls);
    }

    public static Type getArrayType(@efb Type type) {
        return TypeToken.getArray(type).getType();
    }

    public static Gson getGson(String str) {
        return f73951d.get(str);
    }

    public static Type getListType(@efb Type type) {
        return TypeToken.getParameterized(List.class, type).getType();
    }

    public static Type getMapType(@efb Type type, @efb Type type2) {
        return TypeToken.getParameterized(Map.class, type, type2).getType();
    }

    public static Type getSetType(@efb Type type) {
        return TypeToken.getParameterized(Set.class, type).getType();
    }

    public static Type getType(@efb Type type, @efb Type... typeArr) {
        return TypeToken.getParameterized(type, typeArr).getType();
    }

    public static <T> List<T> jsonToList(String str) {
        return (List) getGson().fromJson(str, new C11425a().getType());
    }

    public static void setGson(String str, Gson gson) {
        if (TextUtils.isEmpty(str) || gson == null) {
            return;
        }
        f73951d.put(str, gson);
    }

    public static void setGsonDelegate(Gson gson) {
        if (gson == null) {
            return;
        }
        f73951d.put("delegateGson", gson);
    }

    public static String toJson(Object obj) {
        return toJson(getGson(), obj);
    }

    public static <T> T fromJson(String str, @efb Type type) {
        return (T) fromJson(getGson(), str, type);
    }

    public static Gson getGson() {
        Map<String, Gson> map = f73951d;
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
        return toJson(getGson(), obj, type);
    }

    public static <T> T fromJson(@efb Reader reader, @efb Class<T> cls) {
        return (T) fromJson(getGson(), reader, (Class) cls);
    }

    public static String toJson(@efb Gson gson, Object obj) {
        return gson.toJson(obj);
    }

    public static <T> T fromJson(@efb Reader reader, @efb Type type) {
        return (T) fromJson(getGson(), reader, type);
    }

    public static String toJson(@efb Gson gson, Object obj, @efb Type type) {
        return gson.toJson(obj, type);
    }

    public static <T> T fromJson(@efb Gson gson, String str, @efb Class<T> cls) {
        return (T) gson.fromJson(str, (Class) cls);
    }

    public static <T> T fromJson(@efb Gson gson, String str, @efb Type type) {
        return (T) gson.fromJson(str, type);
    }

    public static <T> T fromJson(@efb Gson gson, Reader reader, @efb Class<T> cls) {
        return (T) gson.fromJson(reader, (Class) cls);
    }

    public static <T> T fromJson(@efb Gson gson, Reader reader, @efb Type type) {
        return (T) gson.fromJson(reader, type);
    }
}
