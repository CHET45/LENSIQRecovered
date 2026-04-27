package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntListExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntListExtension.kt\nandroidx/compose/animation/core/IntListExtensionKt\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,74:1\n33#2,7:75\n*S KotlinDebug\n*F\n+ 1 IntListExtension.kt\nandroidx/compose/animation/core/IntListExtensionKt\n*L\n49#1:75,7\n*E\n"})
public final class r68 {
    @yn8
    public static final int binarySearch(@yfb q68 q68Var, int i) {
        return binarySearch$default(q68Var, i, 0, 0, 6, null);
    }

    public static /* synthetic */ int binarySearch$default(q68 q68Var, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = q68Var.getSize();
        }
        return binarySearch(q68Var, i, i2, i3);
    }

    @yn8
    public static final int binarySearch(@yfb q68 q68Var, int i, int i2) {
        return binarySearch$default(q68Var, i, i2, 0, 4, null);
    }

    @yn8
    public static final int binarySearch(@yfb q68 q68Var, int i, int i2, int i3) {
        if (!(i2 <= i3)) {
            c8d.throwIllegalArgumentException("fromIndex(" + i2 + ") > toIndex(" + i3 + ')');
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Index out of range: " + i2);
        }
        if (i3 > q68Var.getSize()) {
            throw new IndexOutOfBoundsException("Index out of range: " + i3);
        }
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = q68Var.get(i5);
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }
}
