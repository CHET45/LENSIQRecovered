package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ox4
public final class tbd {

    /* JADX INFO: renamed from: a */
    public static final Map<Class<?>, Class<?>> f84176a;

    /* JADX INFO: renamed from: b */
    public static final Map<Class<?>, Class<?>> f84177b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        add(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        add(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        add(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        add(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        add(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        add(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        add(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        add(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        add(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        f84176a = Collections.unmodifiableMap(linkedHashMap);
        f84177b = Collections.unmodifiableMap(linkedHashMap2);
    }

    private tbd() {
    }

    private static void add(Map<Class<?>, Class<?>> forward, Map<Class<?>, Class<?>> backward, Class<?> key, Class<?> value) {
        forward.put(key, value);
        backward.put(value, key);
    }

    public static Set<Class<?>> allPrimitiveTypes() {
        return f84176a.keySet();
    }

    public static Set<Class<?>> allWrapperTypes() {
        return f84177b.keySet();
    }

    public static boolean isWrapperType(Class<?> type) {
        return f84177b.containsKey(v7d.checkNotNull(type));
    }

    public static <T> Class<T> unwrap(Class<T> type) {
        v7d.checkNotNull(type);
        Class<T> cls = (Class) f84177b.get(type);
        return cls == null ? type : cls;
    }

    public static <T> Class<T> wrap(Class<T> type) {
        v7d.checkNotNull(type);
        Class<T> cls = (Class) f84176a.get(type);
        return cls == null ? type : cls;
    }
}
