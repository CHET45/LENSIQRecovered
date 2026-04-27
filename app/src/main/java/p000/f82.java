package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n1#1,88:1\n63#1,22:89\n63#1,22:111\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n22#1:89,22\n37#1:111,22\n*E\n"})
@xn8(name = "CollectionToArray")
public final class f82 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Object[] f35672a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final int f35673b = 2147483645;

    @t64(errorSince = "2.1", warningSince = "1.9")
    @xn8(name = "toArray")
    @q64(message = "This function will be made internal in a future release")
    @yfb
    public static final Object[] toArray(@yfb Collection<?> collection, @gib Object[] objArr) {
        Object[] objArrCopyOf;
        md8.checkNotNullParameter(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            md8.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = f35673b;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                md8.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    private static final Object[] toArrayImpl(Collection<?> collection, ny6<Object[]> ny6Var, qy6<? super Integer, Object[]> qy6Var, gz6<? super Object[], ? super Integer, Object[]> gz6Var) {
        int size = collection.size();
        if (size == 0) {
            return ny6Var.invoke();
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return ny6Var.invoke();
        }
        Object[] objArrInvoke = qy6Var.invoke(Integer.valueOf(size));
        int i = 0;
        ?? CopyOf = objArrInvoke;
        while (true) {
            int i2 = i + 1;
            CopyOf[i] = it.next();
            if (i2 >= CopyOf.length) {
                if (!it.hasNext()) {
                    return CopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = f35673b;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                CopyOf = Arrays.copyOf((Object[]) CopyOf, i3);
            } else if (!it.hasNext()) {
                return gz6Var.invoke(CopyOf, Integer.valueOf(i2));
            }
            i = i2;
            CopyOf = CopyOf;
        }
    }

    @t64(errorSince = "2.1", warningSince = "1.9")
    @xn8(name = "toArray")
    @q64(message = "This function will be made internal in a future release")
    @yfb
    public static final Object[] toArray(@yfb Collection<?> collection) {
        md8.checkNotNullParameter(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = f35673b;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        md8.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            }
        }
        return f35672a;
    }
}
