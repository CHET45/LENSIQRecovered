package p000;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes8.dex */
public class mf8<T> extends wr0<T> {

    /* JADX INFO: renamed from: a */
    public final Object f60893a;

    public mf8(T t) {
        this.f60893a = t;
    }

    private static boolean areArrayElementsEqual(Object obj, Object obj2) {
        for (int i = 0; i < Array.getLength(obj); i++) {
            if (!areEqual(Array.get(obj, i), Array.get(obj2, i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean areArrayLengthsEqual(Object obj, Object obj2) {
        return Array.getLength(obj) == Array.getLength(obj2);
    }

    private static boolean areArraysEqual(Object obj, Object obj2) {
        return areArrayLengthsEqual(obj, obj2) && areArrayElementsEqual(obj, obj2);
    }

    private static boolean areEqual(Object obj, Object obj2) {
        return obj == null ? obj2 == null : (obj2 == null || !isArray(obj)) ? obj.equals(obj2) : isArray(obj2) && areArraysEqual(obj, obj2);
    }

    @io5
    public static <T> yv9<T> equalTo(T t) {
        return new mf8(t);
    }

    private static boolean isArray(Object obj) {
        return obj.getClass().isArray();
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendValue(this.f60893a);
    }

    @Override // p000.yv9
    public boolean matches(Object obj) {
        return areEqual(obj, this.f60893a);
    }
}
