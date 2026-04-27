package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class e99 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final e99 f32223a = new e99();

    /* JADX INFO: renamed from: b */
    public static final int f32224b = 0;

    private e99() {
    }

    @do8
    public static final void checkElementIndex$runtime_release(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    @do8
    public static final void checkPositionIndex$runtime_release(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    @do8
    public static final void checkRangeIndexes$runtime_release(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    @do8
    public static final boolean orderedEquals$runtime_release(@yfb Collection<?> collection, @yfb Collection<?> collection2) {
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator<?> it = collection2.iterator();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!md8.areEqual(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    @do8
    public static final int orderedHashCode$runtime_release(@yfb Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }
}
