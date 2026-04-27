package p000;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.watchfun.transcommon.bean.TransLanguageData;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class rc7 {

    /* JADX INFO: renamed from: a */
    public static final String f77807a = "defaultGson";

    /* JADX INFO: renamed from: b */
    public static final String f77808b = "delegateGson";

    /* JADX INFO: renamed from: c */
    public static final String f77809c = "logUtilsGson";

    /* JADX INFO: renamed from: d */
    public static final Map<String, Gson> f77810d = new ConcurrentHashMap();

    private rc7() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* JADX INFO: renamed from: a */
    public static Gson m21163a() {
        Map<String, Gson> map = f77810d;
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

    public static Type getArrayType(@efb final Type type) {
        return TypeToken.getArray(type).getType();
    }

    public static Gson getGson(final String key) {
        return f77810d.get(key);
    }

    public static Type getListType(@efb final Type type) {
        return TypeToken.getParameterized(List.class, type).getType();
    }

    public static Type getMapType(@efb final Type keyType, @efb final Type valueType) {
        return TypeToken.getParameterized(Map.class, keyType, valueType).getType();
    }

    public static Type getSetType(@efb final Type type) {
        return TypeToken.getParameterized(Set.class, type).getType();
    }

    public static TransLanguageData getTransLanguageData(String text) {
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        return (TransLanguageData) new Gson().fromJson(text, TransLanguageData.class);
    }

    public static Type getType(@efb final Type rawType, @efb final Type... typeArguments) {
        return TypeToken.getParameterized(rawType, typeArguments).getType();
    }

    public static void setGson(final String key, final Gson gson) {
        if (TextUtils.isEmpty(key) || gson == null) {
            return;
        }
        f77810d.put(key, gson);
    }

    public static void setGsonDelegate(Gson delegate) {
        if (delegate == null) {
            return;
        }
        f77810d.put("delegateGson", delegate);
    }

    public static String toJson(final Object object) {
        return toJson(getGson(), object);
    }

    public static <T> T fromJson(String str, @efb Type type) {
        return (T) fromJson(getGson(), str, type);
    }

    public static Gson getGson() {
        Map<String, Gson> map = f77810d;
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

    public static String toJson(final Object src, @efb final Type typeOfSrc) {
        return toJson(getGson(), src, typeOfSrc);
    }

    public static <T> T fromJson(@efb Reader reader, @efb Class<T> cls) {
        return (T) fromJson(getGson(), reader, (Class) cls);
    }

    public static String toJson(@efb final Gson gson, final Object object) {
        return gson.toJson(object);
    }

    public static <T> T fromJson(@efb Reader reader, @efb Type type) {
        return (T) fromJson(getGson(), reader, type);
    }

    public static String toJson(@efb final Gson gson, final Object src, @efb final Type typeOfSrc) {
        return gson.toJson(src, typeOfSrc);
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
