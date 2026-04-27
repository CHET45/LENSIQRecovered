package p000;

import androidx.lifecycle.C1171x;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i70 {

    /* JADX INFO: renamed from: a */
    public static final int f45865a = 4;

    public static final <E> void addAllInternal(@yfb g70<E> g70Var, @yfb g70<? extends E> g70Var2) {
        md8.checkNotNullParameter(g70Var, "<this>");
        md8.checkNotNullParameter(g70Var2, "array");
        int i = g70Var2.get_size$collection();
        g70Var.ensureCapacity(g70Var.get_size$collection() + i);
        if (g70Var.get_size$collection() != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                g70Var.add(g70Var2.valueAt(i2));
            }
            return;
        }
        if (i > 0) {
            u70.copyInto$default(g70Var2.getHashes$collection(), g70Var.getHashes$collection(), 0, 0, i, 6, (Object) null);
            u70.copyInto$default(g70Var2.getArray$collection(), g70Var.getArray$collection(), 0, 0, i, 6, (Object) null);
            if (g70Var.get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            g70Var.set_size$collection(i);
        }
    }

    public static final <E> boolean addInternal(@yfb g70<E> g70Var, E e) {
        int i;
        int iIndexOf;
        md8.checkNotNullParameter(g70Var, "<this>");
        int i2 = g70Var.get_size$collection();
        if (e == null) {
            iIndexOf = indexOfNull(g70Var);
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iIndexOf = indexOf(g70Var, e, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i3 = ~iIndexOf;
        if (i2 >= g70Var.getHashes$collection().length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            int[] hashes$collection = g70Var.getHashes$collection();
            Object[] array$collection = g70Var.getArray$collection();
            allocArrays(g70Var, i4);
            if (i2 != g70Var.get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(g70Var.getHashes$collection().length == 0)) {
                u70.copyInto$default(hashes$collection, g70Var.getHashes$collection(), 0, 0, hashes$collection.length, 6, (Object) null);
                u70.copyInto$default(array$collection, g70Var.getArray$collection(), 0, 0, array$collection.length, 6, (Object) null);
            }
        }
        if (i3 < i2) {
            int i5 = i3 + 1;
            u70.copyInto(g70Var.getHashes$collection(), g70Var.getHashes$collection(), i5, i3, i2);
            u70.copyInto(g70Var.getArray$collection(), g70Var.getArray$collection(), i5, i3, i2);
        }
        if (i2 != g70Var.get_size$collection() || i3 >= g70Var.getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        g70Var.getHashes$collection()[i3] = i;
        g70Var.getArray$collection()[i3] = e;
        g70Var.set_size$collection(g70Var.get_size$collection() + 1);
        return true;
    }

    public static final <E> void allocArrays(@yfb g70<E> g70Var, int i) {
        md8.checkNotNullParameter(g70Var, "<this>");
        g70Var.setHashes$collection(new int[i]);
        g70Var.setArray$collection(new Object[i]);
    }

    @yfb
    public static final <T> g70<T> arraySetOf() {
        return new g70<>(0, 1, null);
    }

    public static final <E> int binarySearchInternal(@yfb g70<E> g70Var, int i) {
        md8.checkNotNullParameter(g70Var, "<this>");
        try {
            return cv2.binarySearch(g70Var.getHashes$collection(), g70Var.get_size$collection(), i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void clearInternal(@yfb g70<E> g70Var) {
        md8.checkNotNullParameter(g70Var, "<this>");
        if (g70Var.get_size$collection() != 0) {
            g70Var.setHashes$collection(cv2.f27723a);
            g70Var.setArray$collection(cv2.f27725c);
            g70Var.set_size$collection(0);
        }
        if (g70Var.get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean containsAllInternal(@yfb g70<E> g70Var, @yfb Collection<? extends E> collection) {
        md8.checkNotNullParameter(g70Var, "<this>");
        md8.checkNotNullParameter(collection, "elements");
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            if (!g70Var.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean containsInternal(@yfb g70<E> g70Var, E e) {
        md8.checkNotNullParameter(g70Var, "<this>");
        return g70Var.indexOf(e) >= 0;
    }

    public static final <E> void ensureCapacityInternal(@yfb g70<E> g70Var, int i) {
        md8.checkNotNullParameter(g70Var, "<this>");
        int i2 = g70Var.get_size$collection();
        if (g70Var.getHashes$collection().length < i) {
            int[] hashes$collection = g70Var.getHashes$collection();
            Object[] array$collection = g70Var.getArray$collection();
            allocArrays(g70Var, i);
            if (g70Var.get_size$collection() > 0) {
                u70.copyInto$default(hashes$collection, g70Var.getHashes$collection(), 0, 0, g70Var.get_size$collection(), 6, (Object) null);
                u70.copyInto$default(array$collection, g70Var.getArray$collection(), 0, 0, g70Var.get_size$collection(), 6, (Object) null);
            }
        }
        if (g70Var.get_size$collection() != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean equalsInternal(@yfb g70<E> g70Var, @gib Object obj) {
        md8.checkNotNullParameter(g70Var, "<this>");
        if (g70Var == obj) {
            return true;
        }
        if (!(obj instanceof Set) || g70Var.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = g70Var.get_size$collection();
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(g70Var.valueAt(i2))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int hashCodeInternal(@yfb g70<E> g70Var) {
        md8.checkNotNullParameter(g70Var, "<this>");
        int[] hashes$collection = g70Var.getHashes$collection();
        int i = g70Var.get_size$collection();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += hashes$collection[i3];
        }
        return i2;
    }

    public static final <E> int indexOf(@yfb g70<E> g70Var, @gib Object obj, int i) {
        md8.checkNotNullParameter(g70Var, "<this>");
        int i2 = g70Var.get_size$collection();
        if (i2 == 0) {
            return -1;
        }
        int iBinarySearchInternal = binarySearchInternal(g70Var, i);
        if (iBinarySearchInternal < 0 || md8.areEqual(obj, g70Var.getArray$collection()[iBinarySearchInternal])) {
            return iBinarySearchInternal;
        }
        int i3 = iBinarySearchInternal + 1;
        while (i3 < i2 && g70Var.getHashes$collection()[i3] == i) {
            if (md8.areEqual(obj, g70Var.getArray$collection()[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iBinarySearchInternal - 1; i4 >= 0 && g70Var.getHashes$collection()[i4] == i; i4--) {
            if (md8.areEqual(obj, g70Var.getArray$collection()[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static final <E> int indexOfInternal(@yfb g70<E> g70Var, @gib Object obj) {
        md8.checkNotNullParameter(g70Var, "<this>");
        return obj == null ? indexOfNull(g70Var) : indexOf(g70Var, obj, obj.hashCode());
    }

    public static final <E> int indexOfNull(@yfb g70<E> g70Var) {
        md8.checkNotNullParameter(g70Var, "<this>");
        return indexOf(g70Var, null, 0);
    }

    public static final <E> boolean isEmptyInternal(@yfb g70<E> g70Var) {
        md8.checkNotNullParameter(g70Var, "<this>");
        return g70Var.get_size$collection() <= 0;
    }

    public static final <E> boolean removeAllInternal(@yfb g70<E> g70Var, @yfb g70<? extends E> g70Var2) {
        md8.checkNotNullParameter(g70Var, "<this>");
        md8.checkNotNullParameter(g70Var2, "array");
        int i = g70Var2.get_size$collection();
        int i2 = g70Var.get_size$collection();
        for (int i3 = 0; i3 < i; i3++) {
            g70Var.remove(g70Var2.valueAt(i3));
        }
        return i2 != g70Var.get_size$collection();
    }

    public static final <E> E removeAtInternal(@yfb g70<E> g70Var, int i) {
        md8.checkNotNullParameter(g70Var, "<this>");
        int i2 = g70Var.get_size$collection();
        E e = (E) g70Var.getArray$collection()[i];
        if (i2 <= 1) {
            g70Var.clear();
        } else {
            int i3 = i2 - 1;
            if (g70Var.getHashes$collection().length <= 8 || g70Var.get_size$collection() >= g70Var.getHashes$collection().length / 3) {
                if (i < i3) {
                    int i4 = i + 1;
                    u70.copyInto(g70Var.getHashes$collection(), g70Var.getHashes$collection(), i, i4, i2);
                    u70.copyInto(g70Var.getArray$collection(), g70Var.getArray$collection(), i, i4, i2);
                }
                g70Var.getArray$collection()[i3] = null;
            } else {
                int i5 = g70Var.get_size$collection() > 8 ? g70Var.get_size$collection() + (g70Var.get_size$collection() >> 1) : 8;
                int[] hashes$collection = g70Var.getHashes$collection();
                Object[] array$collection = g70Var.getArray$collection();
                allocArrays(g70Var, i5);
                if (i > 0) {
                    u70.copyInto$default(hashes$collection, g70Var.getHashes$collection(), 0, 0, i, 6, (Object) null);
                    u70.copyInto$default(array$collection, g70Var.getArray$collection(), 0, 0, i, 6, (Object) null);
                }
                if (i < i3) {
                    int i6 = i + 1;
                    u70.copyInto(hashes$collection, g70Var.getHashes$collection(), i, i6, i2);
                    u70.copyInto(array$collection, g70Var.getArray$collection(), i, i6, i2);
                }
            }
            if (i2 != g70Var.get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            g70Var.set_size$collection(i3);
        }
        return e;
    }

    public static final <E> boolean removeInternal(@yfb g70<E> g70Var, E e) {
        md8.checkNotNullParameter(g70Var, "<this>");
        int iIndexOf = g70Var.indexOf(e);
        if (iIndexOf < 0) {
            return false;
        }
        g70Var.removeAt(iIndexOf);
        return true;
    }

    public static final <E> boolean retainAllInternal(@yfb g70<E> g70Var, @yfb Collection<? extends E> collection) {
        md8.checkNotNullParameter(g70Var, "<this>");
        md8.checkNotNullParameter(collection, "elements");
        boolean z = false;
        for (int i = g70Var.get_size$collection() - 1; -1 < i; i--) {
            if (!v82.contains(collection, g70Var.getArray$collection()[i])) {
                g70Var.removeAt(i);
                z = true;
            }
        }
        return z;
    }

    @yfb
    public static final <E> String toStringInternal(@yfb g70<E> g70Var) {
        md8.checkNotNullParameter(g70Var, "<this>");
        if (g70Var.isEmpty()) {
            return isa.f48126c;
        }
        StringBuilder sb = new StringBuilder(g70Var.get_size$collection() * 14);
        sb.append('{');
        int i = g70Var.get_size$collection();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E eValueAt = g70Var.valueAt(i2);
            if (eValueAt != g70Var) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static final <E> E valueAtInternal(@yfb g70<E> g70Var, int i) {
        md8.checkNotNullParameter(g70Var, "<this>");
        return (E) g70Var.getArray$collection()[i];
    }

    @yfb
    public static final <T> g70<T> arraySetOf(@yfb T... tArr) {
        md8.checkNotNullParameter(tArr, C1171x.f7958g);
        g70<T> g70Var = new g70<>(tArr.length);
        for (T t : tArr) {
            g70Var.add(t);
        }
        return g70Var;
    }

    public static final <E> boolean removeAllInternal(@yfb g70<E> g70Var, @yfb Collection<? extends E> collection) {
        md8.checkNotNullParameter(g70Var, "<this>");
        md8.checkNotNullParameter(collection, "elements");
        Iterator<? extends E> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= g70Var.remove(it.next());
        }
        return zRemove;
    }

    public static final <E> boolean addAllInternal(@yfb g70<E> g70Var, @yfb Collection<? extends E> collection) {
        md8.checkNotNullParameter(g70Var, "<this>");
        md8.checkNotNullParameter(collection, "elements");
        g70Var.ensureCapacity(g70Var.get_size$collection() + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= g70Var.add(it.next());
        }
        return zAdd;
    }
}
