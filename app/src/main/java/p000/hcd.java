package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,4151:1\n4551#2,7:4152\n61#3,7:4159\n61#3,7:4166\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n4092#1:4152,7\n4140#1:4159,7\n4141#1:4166,7\n*E\n"})
@e0g(parameters = 0)
public final class hcd {

    /* JADX INFO: renamed from: b */
    public static final int f43144b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<Integer> f43145a;

    public hcd() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void add(int i) {
        if (!this.f43145a.isEmpty()) {
            if (this.f43145a.get(0).intValue() == i) {
                return;
            }
            if (this.f43145a.get(r0.size() - 1).intValue() == i) {
                return;
            }
        }
        int size = this.f43145a.size();
        this.f43145a.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int iIntValue = this.f43145a.get(i2).intValue();
            if (i <= iIntValue) {
                break;
            }
            this.f43145a.set(size, Integer.valueOf(iIntValue));
            size = i2;
        }
        this.f43145a.set(size, Integer.valueOf(i));
    }

    public final boolean isEmpty() {
        return this.f43145a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.f43145a.isEmpty();
    }

    public final int peek() {
        return ((Number) v82.first((List) this.f43145a)).intValue();
    }

    public final int takeMax() {
        int iIntValue;
        if (!(this.f43145a.size() > 0)) {
            gm2.composeImmediateRuntimeError("Set is empty");
        }
        int iIntValue2 = this.f43145a.get(0).intValue();
        while (!this.f43145a.isEmpty() && this.f43145a.get(0).intValue() == iIntValue2) {
            List<Integer> list = this.f43145a;
            list.set(0, (Integer) v82.last((List) list));
            List<Integer> list2 = this.f43145a;
            list2.remove(list2.size() - 1);
            int size = this.f43145a.size();
            int size2 = this.f43145a.size() >>> 1;
            int i = 0;
            while (i < size2) {
                int iIntValue3 = this.f43145a.get(i).intValue();
                int i2 = (i + 1) * 2;
                int i3 = i2 - 1;
                int iIntValue4 = this.f43145a.get(i3).intValue();
                if (i2 >= size || (iIntValue = this.f43145a.get(i2).intValue()) <= iIntValue4) {
                    if (iIntValue4 > iIntValue3) {
                        this.f43145a.set(i, Integer.valueOf(iIntValue4));
                        this.f43145a.set(i3, Integer.valueOf(iIntValue3));
                        i = i3;
                    }
                } else if (iIntValue > iIntValue3) {
                    this.f43145a.set(i, Integer.valueOf(iIntValue));
                    this.f43145a.set(i2, Integer.valueOf(iIntValue3));
                    i = i2;
                }
            }
        }
        return iIntValue2;
    }

    public final void validateHeap() {
        int size = this.f43145a.size();
        int i = size / 2;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            int i4 = i3 * 2;
            boolean z = true;
            if (!(this.f43145a.get(i2).intValue() >= this.f43145a.get(i4 + (-1)).intValue())) {
                a8d.throwIllegalStateException("Check failed.");
            }
            if (i4 < size && this.f43145a.get(i2).intValue() < this.f43145a.get(i4).intValue()) {
                z = false;
            }
            if (!z) {
                a8d.throwIllegalStateException("Check failed.");
            }
            i2 = i3;
        }
    }

    public hcd(@yfb List<Integer> list) {
        this.f43145a = list;
    }

    public /* synthetic */ hcd(List list, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
