package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class rog implements InterfaceC7667iz {

    /* JADX INFO: renamed from: d */
    public static final C12183b f78883d;

    /* JADX INFO: renamed from: e */
    public static final C12184c f78884e;

    /* JADX INFO: renamed from: a */
    public final Class<?> f78885a;

    /* JADX INFO: renamed from: b */
    public final Map<Class<? extends Annotation>, List<ow6>> f78886b;

    /* JADX INFO: renamed from: c */
    public final Map<Class<? extends Annotation>, List<tv6>> f78887c;

    /* JADX INFO: renamed from: rog$b */
    public static class C12183b implements Comparator<Field> {
        private C12183b() {
        }

        @Override // java.util.Comparator
        public int compare(Field field, Field field2) {
            return field.getName().compareTo(field2.getName());
        }
    }

    /* JADX INFO: renamed from: rog$c */
    public static class C12184c implements Comparator<ow6> {
        private C12184c() {
        }

        @Override // java.util.Comparator
        public int compare(ow6 ow6Var, ow6 ow6Var2) {
            return xua.f99418b.compare(ow6Var.getMethod(), ow6Var2.getMethod());
        }
    }

    static {
        f78883d = new C12183b();
        f78884e = new C12184c();
    }

    public rog(Class<?> cls) {
        this.f78885a = cls;
        if (cls != null && cls.getConstructors().length > 1) {
            throw new IllegalArgumentException("Test class can only have one constructor");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        m21454b(linkedHashMap, linkedHashMap2);
        this.f78886b = makeDeeplyUnmodifiable(linkedHashMap);
        this.f78887c = makeDeeplyUnmodifiable(linkedHashMap2);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends nw6<T>> void m21453a(T t, Map<Class<? extends Annotation>, List<T>> map) {
        for (Annotation annotation : t.getAnnotations()) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            List<T> annotatedMembers = getAnnotatedMembers(map, clsAnnotationType, true);
            if (t.m18168b(annotatedMembers)) {
                return;
            }
            if (runsTopToBottom(clsAnnotationType)) {
                annotatedMembers.add(0, t);
            } else {
                annotatedMembers.add(t);
            }
        }
    }

    private <T> List<T> collectValues(Map<?, List<T>> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<List<T>> it = map.values().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(it.next());
        }
        return new ArrayList(linkedHashSet);
    }

    private static <T> List<T> getAnnotatedMembers(Map<Class<? extends Annotation>, List<T>> map, Class<? extends Annotation> cls, boolean z) {
        if (!map.containsKey(cls) && z) {
            map.put(cls, new ArrayList());
        }
        List<T> list = map.get(cls);
        return list == null ? Collections.emptyList() : list;
    }

    private static Field[] getSortedDeclaredFields(Class<?> cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        Arrays.sort(declaredFields, f78883d);
        return declaredFields;
    }

    private static List<Class<?>> getSuperClasses(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    private static <T extends nw6<T>> Map<Class<? extends Annotation>, List<T>> makeDeeplyUnmodifiable(Map<Class<? extends Annotation>, List<T>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Class<? extends Annotation>, List<T>> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Collections.unmodifiableList(entry.getValue()));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static boolean runsTopToBottom(Class<? extends Annotation> cls) {
        return cls.equals(kx0.class) || cls.equals(lx0.class);
    }

    /* JADX INFO: renamed from: b */
    public void m21454b(Map<Class<? extends Annotation>, List<ow6>> map, Map<Class<? extends Annotation>, List<tv6>> map2) {
        for (Class<?> cls : getSuperClasses(this.f78885a)) {
            for (Method method : xua.getDeclaredMethods(cls)) {
                m21453a(new ow6(method), map);
            }
            for (Field field : getSortedDeclaredFields(cls)) {
                m21453a(new tv6(field), map2);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f78885a == ((rog) obj).f78885a;
    }

    public <T> List<T> getAnnotatedFieldValues(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        Iterator<tv6> it = getAnnotatedFields(cls).iterator();
        while (it.hasNext()) {
            try {
                Object obj2 = it.next().get(obj);
                if (cls2.isInstance(obj2)) {
                    arrayList.add(cls2.cast(obj2));
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("How did getFields return a field we couldn't access?", e);
            }
        }
        return arrayList;
    }

    public List<tv6> getAnnotatedFields() {
        return collectValues(this.f78887c);
    }

    public <T> List<T> getAnnotatedMethodValues(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        for (ow6 ow6Var : getAnnotatedMethods(cls)) {
            try {
                if (cls2.isAssignableFrom(ow6Var.getReturnType())) {
                    arrayList.add(cls2.cast(ow6Var.invokeExplosively(obj, new Object[0])));
                }
            } catch (Throwable th) {
                throw new RuntimeException("Exception in " + ow6Var.getName(), th);
            }
        }
        return arrayList;
    }

    public List<ow6> getAnnotatedMethods() {
        List<ow6> listCollectValues = collectValues(this.f78886b);
        Collections.sort(listCollectValues, f78884e);
        return listCollectValues;
    }

    @Override // p000.InterfaceC7667iz
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        Class<?> cls2 = this.f78885a;
        if (cls2 == null) {
            return null;
        }
        return (T) cls2.getAnnotation(cls);
    }

    @Override // p000.InterfaceC7667iz
    public Annotation[] getAnnotations() {
        Class<?> cls = this.f78885a;
        return cls == null ? new Annotation[0] : cls.getAnnotations();
    }

    public Class<?> getJavaClass() {
        return this.f78885a;
    }

    public String getName() {
        Class<?> cls = this.f78885a;
        return cls == null ? "null" : cls.getName();
    }

    public Constructor<?> getOnlyConstructor() {
        Constructor<?>[] constructors = this.f78885a.getConstructors();
        q80.assertEquals(1L, constructors.length);
        return constructors[0];
    }

    public int hashCode() {
        Class<?> cls = this.f78885a;
        if (cls == null) {
            return 0;
        }
        return cls.hashCode();
    }

    public boolean isANonStaticInnerClass() {
        return this.f78885a.isMemberClass() && !Modifier.isStatic(this.f78885a.getModifiers());
    }

    public boolean isPublic() {
        return Modifier.isPublic(this.f78885a.getModifiers());
    }

    public List<tv6> getAnnotatedFields(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(getAnnotatedMembers(this.f78887c, cls, false));
    }

    public List<ow6> getAnnotatedMethods(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(getAnnotatedMembers(this.f78886b, cls, false));
    }
}
