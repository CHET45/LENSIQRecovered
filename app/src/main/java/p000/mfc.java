package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class mfc {

    /* JADX INFO: renamed from: c */
    public static final Map<Class<?>, Class<?>> f60894c = buildConvertableTypesMap();

    /* JADX INFO: renamed from: a */
    public final Class<?> f60895a;

    /* JADX INFO: renamed from: b */
    public final Annotation[] f60896b;

    private mfc(Class<?> cls, Annotation[] annotationArr) {
        this.f60895a = cls;
        this.f60896b = annotationArr;
    }

    private static Map<Class<?>, Class<?>> buildConvertableTypesMap() {
        HashMap map = new HashMap();
        putSymmetrically(map, Boolean.TYPE, Boolean.class);
        putSymmetrically(map, Byte.TYPE, Byte.class);
        putSymmetrically(map, Short.TYPE, Short.class);
        putSymmetrically(map, Character.TYPE, Character.class);
        putSymmetrically(map, Integer.TYPE, Integer.class);
        putSymmetrically(map, Long.TYPE, Long.class);
        putSymmetrically(map, Float.TYPE, Float.class);
        putSymmetrically(map, Double.TYPE, Double.class);
        return Collections.unmodifiableMap(map);
    }

    private boolean isAssignableViaTypeConversion(Class<?> cls, Class<?> cls2) {
        Map<Class<?>, Class<?>> map = f60894c;
        if (map.containsKey(cls2)) {
            return cls.isAssignableFrom(map.get(cls2));
        }
        return false;
    }

    private static <T> void putSymmetrically(Map<T, T> map, T t, T t2) {
        map.put(t, t2);
        map.put(t2, t);
    }

    public static ArrayList<mfc> signatures(Method method) {
        return signatures(method.getParameterTypes(), method.getParameterAnnotations());
    }

    public boolean canAcceptType(Class<?> cls) {
        return this.f60895a.isAssignableFrom(cls) || isAssignableViaTypeConversion(this.f60895a, cls);
    }

    public boolean canAcceptValue(Object obj) {
        return obj == null ? !this.f60895a.isPrimitive() : canAcceptType(obj.getClass());
    }

    public boolean canPotentiallyAcceptType(Class<?> cls) {
        return cls.isAssignableFrom(this.f60895a) || isAssignableViaTypeConversion(cls, this.f60895a) || canAcceptType(cls);
    }

    public <T extends Annotation> T findDeepAnnotation(Class<T> cls) {
        return (T) findDeepAnnotation(this.f60896b, cls, 3);
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        for (Annotation annotation : getAnnotations()) {
            if (cls.isInstance(annotation)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }

    public List<Annotation> getAnnotations() {
        return Arrays.asList(this.f60896b);
    }

    public Class<?> getType() {
        return this.f60895a;
    }

    public boolean hasAnnotation(Class<? extends Annotation> cls) {
        return getAnnotation(cls) != null;
    }

    public static List<mfc> signatures(Constructor<?> constructor) {
        return signatures(constructor.getParameterTypes(), constructor.getParameterAnnotations());
    }

    private <T extends Annotation> T findDeepAnnotation(Annotation[] annotationArr, Class<T> cls, int i) {
        if (i == 0) {
            return null;
        }
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return cls.cast(annotation);
            }
            Annotation annotationFindDeepAnnotation = findDeepAnnotation(annotation.annotationType().getAnnotations(), cls, i - 1);
            if (annotationFindDeepAnnotation != null) {
                return cls.cast(annotationFindDeepAnnotation);
            }
        }
        return null;
    }

    private static ArrayList<mfc> signatures(Class<?>[] clsArr, Annotation[][] annotationArr) {
        ArrayList<mfc> arrayList = new ArrayList<>();
        for (int i = 0; i < clsArr.length; i++) {
            arrayList.add(new mfc(clsArr[i], annotationArr[i]));
        }
        return arrayList;
    }
}
