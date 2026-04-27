package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyListHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n1#2:96\n69#3,6:97\n*S KotlinDebug\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n*L\n57#1:97,6\n*E\n"})
public final class q09 {
    @gib
    public static final b19 findOrComposeLazyListHeader(@yfb List<b19> list, @yfb d19 d19Var, @yfb List<Integer> list2, int i, int i2, int i3) {
        int index = ((b19) v82.first((List) list)).getIndex();
        int size = list2.size();
        int iIntValue = -1;
        int iIntValue2 = -1;
        int i4 = 0;
        while (i4 < size && list2.get(i4).intValue() <= index) {
            iIntValue2 = list2.get(i4).intValue();
            i4++;
            iIntValue = ((i4 < 0 || i4 > l82.getLastIndex(list2)) ? -1 : list2.get(i4)).intValue();
        }
        int size2 = list.size();
        int offset = Integer.MIN_VALUE;
        int offset2 = Integer.MIN_VALUE;
        int i5 = -1;
        for (int i6 = 0; i6 < size2; i6++) {
            b19 b19Var = list.get(i6);
            if (b19Var.getIndex() == iIntValue2) {
                offset = b19Var.getOffset();
                i5 = i6;
            } else if (b19Var.getIndex() == iIntValue) {
                offset2 = b19Var.getOffset();
            }
        }
        if (iIntValue2 == -1) {
            return null;
        }
        b19 b19VarM28564getAndMeasure0kLqBqw$default = d19.m28564getAndMeasure0kLqBqw$default(d19Var, iIntValue2, 0L, 2, null);
        b19VarM28564getAndMeasure0kLqBqw$default.setNonScrollableItem(true);
        int iMax = offset != Integer.MIN_VALUE ? Math.max(-i, offset) : -i;
        if (offset2 != Integer.MIN_VALUE) {
            iMax = Math.min(iMax, offset2 - b19VarM28564getAndMeasure0kLqBqw$default.getSize());
        }
        b19VarM28564getAndMeasure0kLqBqw$default.position(iMax, i2, i3);
        if (i5 != -1) {
            list.set(i5, b19VarM28564getAndMeasure0kLqBqw$default);
        } else {
            list.add(0, b19VarM28564getAndMeasure0kLqBqw$default);
        }
        return b19VarM28564getAndMeasure0kLqBqw$default;
    }
}
