package p000;

import p000.wc8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,222:1\n48#2:223\n523#2:224\n523#2:225\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n*L\n198#1:223\n203#1:224\n212#1:225\n*E\n"})
public final class xc8 {
    /* JADX INFO: Access modifiers changed from: private */
    @ah5
    public static final <T> int binarySearch(f7b<wc8.C14548a<T>> f7bVar, int i) {
        int size = f7bVar.getSize() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = ((size - i2) / 2) + i2;
            int startIndex = f7bVar.getContent()[i3].getStartIndex();
            if (startIndex == i) {
                return i3;
            }
            if (startIndex < i) {
                i2 = i3 + 1;
                if (i < f7bVar.getContent()[i2].getStartIndex()) {
                    return i3;
                }
            } else {
                size = i3 - 1;
            }
        }
        return i2;
    }
}
