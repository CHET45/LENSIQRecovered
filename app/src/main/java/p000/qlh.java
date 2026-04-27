package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p000.ap8;

/* JADX INFO: loaded from: classes7.dex */
public class qlh {
    public static Collection asMutableCollection(Object obj) {
        if ((obj instanceof uo8) && !(obj instanceof vo8)) {
            throwCce(obj, "kotlin.collections.MutableCollection");
        }
        return castToCollection(obj);
    }

    public static Iterable asMutableIterable(Object obj) {
        if ((obj instanceof uo8) && !(obj instanceof wo8)) {
            throwCce(obj, "kotlin.collections.MutableIterable");
        }
        return castToIterable(obj);
    }

    public static Iterator asMutableIterator(Object obj) {
        if ((obj instanceof uo8) && !(obj instanceof xo8)) {
            throwCce(obj, "kotlin.collections.MutableIterator");
        }
        return castToIterator(obj);
    }

    public static List asMutableList(Object obj) {
        if ((obj instanceof uo8) && !(obj instanceof yo8)) {
            throwCce(obj, "kotlin.collections.MutableList");
        }
        return castToList(obj);
    }

    public static ListIterator asMutableListIterator(Object obj) {
        if ((obj instanceof uo8) && !(obj instanceof zo8)) {
            throwCce(obj, "kotlin.collections.MutableListIterator");
        }
        return castToListIterator(obj);
    }

    public static Map asMutableMap(Object obj) {
        if ((obj instanceof uo8) && !(obj instanceof ap8)) {
            throwCce(obj, "kotlin.collections.MutableMap");
        }
        return castToMap(obj);
    }

    public static Map.Entry asMutableMapEntry(Object obj) {
        if ((obj instanceof uo8) && !(obj instanceof ap8.InterfaceC1546a)) {
            throwCce(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return castToMapEntry(obj);
    }

    public static Set asMutableSet(Object obj) {
        if ((obj instanceof uo8) && !(obj instanceof fp8)) {
            throwCce(obj, "kotlin.collections.MutableSet");
        }
        return castToSet(obj);
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int i) {
        if (obj != null && !isFunctionOfArity(obj, i)) {
            throwCce(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    public static Collection castToCollection(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw throwCce(e);
        }
    }

    public static Iterable castToIterable(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw throwCce(e);
        }
    }

    public static Iterator castToIterator(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e) {
            throw throwCce(e);
        }
    }

    public static List castToList(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw throwCce(e);
        }
    }

    public static ListIterator castToListIterator(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e) {
            throw throwCce(e);
        }
    }

    public static Map castToMap(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw throwCce(e);
        }
    }

    public static Map.Entry castToMapEntry(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw throwCce(e);
        }
    }

    public static Set castToSet(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw throwCce(e);
        }
    }

    public static int getFunctionArity(Object obj) {
        if (obj instanceof h07) {
            return ((h07) obj).getArity();
        }
        if (obj instanceof ny6) {
            return 0;
        }
        if (obj instanceof qy6) {
            return 1;
        }
        if (obj instanceof gz6) {
            return 2;
        }
        if (obj instanceof kz6) {
            return 3;
        }
        if (obj instanceof oz6) {
            return 4;
        }
        if (obj instanceof rz6) {
            return 5;
        }
        if (obj instanceof uz6) {
            return 6;
        }
        if (obj instanceof xz6) {
            return 7;
        }
        if (obj instanceof a07) {
            return 8;
        }
        if (obj instanceof d07) {
            return 9;
        }
        if (obj instanceof oy6) {
            return 10;
        }
        if (obj instanceof ry6) {
            return 11;
        }
        if (obj instanceof ty6) {
            return 12;
        }
        if (obj instanceof vy6) {
            return 13;
        }
        if (obj instanceof wy6) {
            return 14;
        }
        if (obj instanceof xy6) {
            return 15;
        }
        if (obj instanceof yy6) {
            return 16;
        }
        if (obj instanceof zy6) {
            return 17;
        }
        if (obj instanceof az6) {
            return 18;
        }
        if (obj instanceof bz6) {
            return 19;
        }
        if (obj instanceof dz6) {
            return 20;
        }
        if (obj instanceof ez6) {
            return 21;
        }
        return obj instanceof fz6 ? 22 : -1;
    }

    public static boolean isFunctionOfArity(Object obj, int i) {
        return (obj instanceof uy6) && getFunctionArity(obj) == i;
    }

    public static boolean isMutableCollection(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof uo8) || (obj instanceof vo8));
    }

    public static boolean isMutableIterable(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof uo8) || (obj instanceof wo8));
    }

    public static boolean isMutableIterator(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof uo8) || (obj instanceof xo8));
    }

    public static boolean isMutableList(Object obj) {
        return (obj instanceof List) && (!(obj instanceof uo8) || (obj instanceof yo8));
    }

    public static boolean isMutableListIterator(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof uo8) || (obj instanceof zo8));
    }

    public static boolean isMutableMap(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof uo8) || (obj instanceof ap8));
    }

    public static boolean isMutableMapEntry(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof uo8) || (obj instanceof ap8.InterfaceC1546a));
    }

    public static boolean isMutableSet(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof uo8) || (obj instanceof fp8));
    }

    private static <T extends Throwable> T sanitizeStackTrace(T t) {
        return (T) md8.m17263a(t, qlh.class.getName());
    }

    public static void throwCce(Object obj, String str) {
        throwCce((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int i, String str) {
        if (obj != null && !isFunctionOfArity(obj, i)) {
            throwCce(str);
        }
        return obj;
    }

    public static void throwCce(String str) {
        throw throwCce(new ClassCastException(str));
    }

    public static Collection asMutableCollection(Object obj, String str) {
        if ((obj instanceof uo8) && !(obj instanceof vo8)) {
            throwCce(str);
        }
        return castToCollection(obj);
    }

    public static Iterable asMutableIterable(Object obj, String str) {
        if ((obj instanceof uo8) && !(obj instanceof wo8)) {
            throwCce(str);
        }
        return castToIterable(obj);
    }

    public static Iterator asMutableIterator(Object obj, String str) {
        if ((obj instanceof uo8) && !(obj instanceof xo8)) {
            throwCce(str);
        }
        return castToIterator(obj);
    }

    public static List asMutableList(Object obj, String str) {
        if ((obj instanceof uo8) && !(obj instanceof yo8)) {
            throwCce(str);
        }
        return castToList(obj);
    }

    public static ListIterator asMutableListIterator(Object obj, String str) {
        if ((obj instanceof uo8) && !(obj instanceof zo8)) {
            throwCce(str);
        }
        return castToListIterator(obj);
    }

    public static Map asMutableMap(Object obj, String str) {
        if ((obj instanceof uo8) && !(obj instanceof ap8)) {
            throwCce(str);
        }
        return castToMap(obj);
    }

    public static Map.Entry asMutableMapEntry(Object obj, String str) {
        if ((obj instanceof uo8) && !(obj instanceof ap8.InterfaceC1546a)) {
            throwCce(str);
        }
        return castToMapEntry(obj);
    }

    public static Set asMutableSet(Object obj, String str) {
        if ((obj instanceof uo8) && !(obj instanceof fp8)) {
            throwCce(str);
        }
        return castToSet(obj);
    }

    public static ClassCastException throwCce(ClassCastException classCastException) {
        throw ((ClassCastException) sanitizeStackTrace(classCastException));
    }
}
