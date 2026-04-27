package p000;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public class xua {

    /* JADX INFO: renamed from: a */
    public static final Comparator<Method> f99417a = new C15305a();

    /* JADX INFO: renamed from: b */
    public static final Comparator<Method> f99418b = new C15306b();

    /* JADX INFO: renamed from: xua$a */
    public static class C15305a implements Comparator<Method> {
        @Override // java.util.Comparator
        public int compare(Method method, Method method2) {
            int iHashCode = method.getName().hashCode();
            int iHashCode2 = method2.getName().hashCode();
            return iHashCode != iHashCode2 ? iHashCode < iHashCode2 ? -1 : 1 : xua.f99418b.compare(method, method2);
        }
    }

    /* JADX INFO: renamed from: xua$b */
    public static class C15306b implements Comparator<Method> {
        @Override // java.util.Comparator
        public int compare(Method method, Method method2) {
            int iCompareTo = method.getName().compareTo(method2.getName());
            return iCompareTo != 0 ? iCompareTo : method.toString().compareTo(method2.toString());
        }
    }

    private xua() {
    }

    public static Method[] getDeclaredMethods(Class<?> cls) {
        Comparator<Method> sorter = getSorter((v16) cls.getAnnotation(v16.class));
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (sorter != null) {
            Arrays.sort(declaredMethods, sorter);
        }
        return declaredMethods;
    }

    private static Comparator<Method> getSorter(v16 v16Var) {
        return v16Var == null ? f99417a : v16Var.value().getComparator();
    }
}
