package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1220:1\n1187#1,2:1221\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1208#1:1221,2\n*E\n"})
public final class g7b {
    public static final /* synthetic */ <T> f7b<T> MutableVector(int i) {
        md8.reifiedOperationMarker(0, "T?");
        return new f7b<>(new Object[i], 0);
    }

    public static /* synthetic */ f7b MutableVector$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 16;
        }
        md8.reifiedOperationMarker(0, "T?");
        return new f7b(new Object[i], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }

    public static final /* synthetic */ <T> f7b<T> mutableVectorOf(T... tArr) {
        return new f7b<>(tArr, tArr.length);
    }

    public static final /* synthetic */ <T> f7b<T> MutableVector(int i, qy6<? super Integer, ? extends T> qy6Var) {
        md8.reifiedOperationMarker(0, "T");
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = qy6Var.invoke(Integer.valueOf(i2));
        }
        return new f7b<>(objArr, i);
    }

    public static final /* synthetic */ <T> f7b<T> mutableVectorOf() {
        md8.reifiedOperationMarker(0, "T?");
        return new f7b<>(new Object[16], 0);
    }
}
