package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n370#1,2:397\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n383#1:397,2\n*E\n"})
public final class mye extends sue<mye> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f62822e;

    public mye(long j, @gib mye myeVar, int i) {
        super(j, myeVar, i);
        this.f62822e = new AtomicReferenceArray(lye.f59271f);
    }

    public final boolean cas(int i, @gib Object obj, @gib Object obj2) {
        return bag.m3024a(getAcquirers(), i, obj, obj2);
    }

    @gib
    public final Object get(int i) {
        return getAcquirers().get(i);
    }

    public final /* synthetic */ AtomicReferenceArray getAcquirers() {
        return this.f62822e;
    }

    @gib
    public final Object getAndSet(int i, @gib Object obj) {
        return getAcquirers().getAndSet(i, obj);
    }

    @Override // p000.sue
    public int getNumberOfSlots() {
        return lye.f59271f;
    }

    @Override // p000.sue
    public void onCancellation(int i, @gib Throwable th, @yfb e13 e13Var) {
        getAcquirers().set(i, lye.f59270e);
        onSlotCleaned();
    }

    public final void set(int i, @gib Object obj) {
        getAcquirers().set(i, obj);
    }

    @yfb
    public String toString() {
        return "SemaphoreSegment[id=" + this.f82931c + ", hashCode=" + hashCode() + C4584d2.f28243l;
    }
}
