package p000;

import java.util.ArrayList;
import java.util.List;
import p000.h09;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyLayoutBeyondBoundsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,62:1\n33#2,6:63\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n*L\n50#1:63,6\n*E\n"})
public final class pz8 {
    @yfb
    public static final List<Integer> calculateLazyLayoutPinnedIndices(@yfb vz8 vz8Var, @yfb h09 h09Var, @yfb lz8 lz8Var) {
        if (!lz8Var.hasIntervals() && h09Var.isEmpty()) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        f78 f78Var = lz8Var.hasIntervals() ? new f78(lz8Var.getStart(), Math.min(lz8Var.getEnd(), vz8Var.getItemCount() - 1)) : f78.f35619e.getEMPTY();
        int size = h09Var.size();
        for (int i = 0; i < size; i++) {
            h09.InterfaceC6669a interfaceC6669a = h09Var.get(i);
            int iFindIndexByKey = wz8.findIndexByKey(vz8Var, interfaceC6669a.getKey(), interfaceC6669a.getIndex());
            int first = f78Var.getFirst();
            if ((iFindIndexByKey > f78Var.getLast() || first > iFindIndexByKey) && iFindIndexByKey >= 0 && iFindIndexByKey < vz8Var.getItemCount()) {
                arrayList.add(Integer.valueOf(iFindIndexByKey));
            }
        }
        int first2 = f78Var.getFirst();
        int last = f78Var.getLast();
        if (first2 <= last) {
            while (true) {
                arrayList.add(Integer.valueOf(first2));
                if (first2 == last) {
                    break;
                }
                first2++;
            }
        }
        return arrayList;
    }
}
