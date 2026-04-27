package p000;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@by4
public final class n45 {

    /* JADX INFO: renamed from: a */
    @jd7
    public static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> f63244a = new WeakHashMap();

    /* JADX INFO: renamed from: n45$a */
    @jd7
    public static final class C9691a<T extends Enum<T>> extends wz2<String, T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c */
        public final Class<T> f63245c;

        public C9691a(Class<T> enumClass) {
            this.f63245c = (Class) v7d.checkNotNull(enumClass);
        }

        @Override // p000.wz2, p000.lz6
        public boolean equals(@wx1 Object object) {
            if (object instanceof C9691a) {
                return this.f63245c.equals(((C9691a) object).f63245c);
            }
            return false;
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String mo13178d(T enumValue) {
            return enumValue.name();
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T mo13179e(String str) {
            return (T) Enum.valueOf(this.f63245c, str);
        }

        public int hashCode() {
            return this.f63245c.hashCode();
        }

        public String toString() {
            return "Enums.stringConverter(" + this.f63245c.getName() + ".class)";
        }
    }

    private n45() {
    }

    @jd7
    /* JADX INFO: renamed from: a */
    public static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> m17772a(Class<T> enumClass) {
        Map<String, WeakReference<? extends Enum<?>>> mapPopulateCache;
        Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> map = f63244a;
        synchronized (map) {
            try {
                mapPopulateCache = map.get(enumClass);
                if (mapPopulateCache == null) {
                    mapPopulateCache = populateCache(enumClass);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mapPopulateCache;
    }

    @jd7
    public static Field getField(Enum<?> enumValue) {
        try {
            return enumValue.getDeclaringClass().getDeclaredField(enumValue.name());
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static <T extends Enum<T>> z6c<T> getIfPresent(Class<T> enumClass, String value) {
        v7d.checkNotNull(enumClass);
        v7d.checkNotNull(value);
        return rwc.m21591d(enumClass, value);
    }

    @jd7
    private static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> populateCache(Class<T> enumClass) {
        HashMap map = new HashMap();
        for (Enum r2 : EnumSet.allOf(enumClass)) {
            map.put(r2.name(), new WeakReference(r2));
        }
        f63244a.put(enumClass, map);
        return map;
    }

    @jd7
    public static <T extends Enum<T>> wz2<String, T> stringConverter(Class<T> enumClass) {
        return new C9691a(enumClass);
    }
}
