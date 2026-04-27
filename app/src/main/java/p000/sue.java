package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p000.sue;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,265:1\n248#2,4:266\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n221#1:266,4\n*E\n"})
public abstract class sue<S extends sue<S>> extends pp2<S> implements ufb {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f82930d = AtomicIntegerFieldUpdater.newUpdater(sue.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c */
    @un8
    public final long f82931c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public sue(long j, @gib S s, int i) {
        super(s);
        this.f82931c = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    private final /* synthetic */ int getCleanedAndPointers$volatile() {
        return this.cleanedAndPointers$volatile;
    }

    private final /* synthetic */ void setCleanedAndPointers$volatile(int i) {
        this.cleanedAndPointers$volatile = i;
    }

    public final boolean decPointers$kotlinx_coroutines_core() {
        return f82930d.addAndGet(this, -65536) == getNumberOfSlots() && !isTail();
    }

    public abstract int getNumberOfSlots();

    @Override // p000.pp2
    public boolean isRemoved() {
        return f82930d.get(this) == getNumberOfSlots() && !isTail();
    }

    public abstract void onCancellation(int i, @gib Throwable th, @yfb e13 e13Var);

    public final void onSlotCleaned() {
        if (f82930d.incrementAndGet(this) == getNumberOfSlots()) {
            remove();
        }
    }

    public final boolean tryIncPointers$kotlinx_coroutines_core() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f82930d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == getNumberOfSlots() && !isTail()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
