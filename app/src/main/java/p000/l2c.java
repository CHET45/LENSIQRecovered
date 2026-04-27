package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nOnDemandAllocatingPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPoolKt\n*L\n1#1,103:1\n37#1:104\n37#1:105\n28#1,10:106\n37#1:126\n1557#2:116\n1628#2,2:117\n1630#2:121\n1557#2:122\n1628#2,3:123\n97#3,2:119\n*S KotlinDebug\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n*L\n31#1:104\n50#1:105\n72#1:106,10\n88#1:126\n73#1:116\n73#1:117,2\n73#1:121\n87#1:122\n87#1:123,3\n75#1:119,2\n*E\n"})
public final class l2c<T> {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56001d = AtomicIntegerFieldUpdater.newUpdater(l2c.class, "controlState$volatile");

    /* JADX INFO: renamed from: a */
    public final int f56002a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<Integer, T> f56003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AtomicReferenceArray f56004c;
    private volatile /* synthetic */ int controlState$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public l2c(int i, @yfb qy6<? super Integer, ? extends T> qy6Var) {
        this.f56002a = i;
        this.f56003b = qy6Var;
        this.f56004c = new AtomicReferenceArray(i);
    }

    private final /* synthetic */ int getControlState$volatile() {
        return this.controlState$volatile;
    }

    private final /* synthetic */ AtomicReferenceArray getElements() {
        return this.f56004c;
    }

    private final boolean isClosed(int i) {
        return (i & Integer.MIN_VALUE) != 0;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, qy6<? super Integer, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void setControlState$volatile(int i) {
        this.controlState$volatile = i;
    }

    private final int tryForbidNewElements() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f56001d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!f56001d.compareAndSet(this, i, Integer.MIN_VALUE | i));
        return i;
    }

    public final boolean allocate() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f56001d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i) != 0) {
                return false;
            }
            if (i >= this.f56002a) {
                return true;
            }
        } while (!f56001d.compareAndSet(this, i, i + 1));
        getElements().set(i, this.f56003b.invoke(Integer.valueOf(i)));
        return true;
    }

    @yfb
    public final List<T> close() {
        int i;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f56001d;
        while (true) {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                i = 0;
                break;
            }
            if (f56001d.compareAndSet(this, i, Integer.MIN_VALUE | i)) {
                break;
            }
        }
        f78 f78VarUntil = kpd.until(0, i);
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(f78VarUntil, 10));
        Iterator<Integer> it = f78VarUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((o68) it).nextInt();
            do {
                andSet = getElements().getAndSet(iNextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    @yfb
    public final String stateRepresentation$kotlinx_coroutines_core() {
        int i = f56001d.get(this);
        f78 f78VarUntil = kpd.until(0, Integer.MAX_VALUE & i);
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(f78VarUntil, 10));
        Iterator<Integer> it = f78VarUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(getElements().get(((o68) it).nextInt()));
        }
        return arrayList.toString() + ((i & Integer.MIN_VALUE) != 0 ? "[closed]" : "");
    }

    @yfb
    public String toString() {
        return "OnDemandAllocatingPool(" + stateRepresentation$kotlinx_coroutines_core() + ')';
    }
}
