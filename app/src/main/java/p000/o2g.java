package p000;

import java.util.concurrent.atomic.AtomicReference;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 Concurrent.common.kt\nkotlinx/coroutines/internal/Concurrent_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,433:1\n37#2,2:434\n1#3:436\n351#4,11:437\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n280#1:434,2\n303#1:437,11\n*E\n"})
public final class o2g extends AbstractC9123m4<m2g<?>> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final AtomicReference<Object> f66353a = new AtomicReference<>(null);

    @gib
    public final Object awaitPending(@yfb zy2<? super bth> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        if (!v7b.m23844a(this.f66353a, n2g.f63091a, fq1Var)) {
            v7e.C13927a c13927a = v7e.f90266b;
            fq1Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
        }
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    public final void makePending() {
        AtomicReference<Object> atomicReference = this.f66353a;
        while (true) {
            Object value = up2.getValue(atomicReference);
            if (value == null || value == n2g.f63092b) {
                return;
            }
            if (value == n2g.f63091a) {
                if (v7b.m23844a(this.f66353a, value, n2g.f63092b)) {
                    return;
                }
            } else if (v7b.m23844a(this.f66353a, value, n2g.f63091a)) {
                v7e.C13927a c13927a = v7e.f90266b;
                ((fq1) value).resumeWith(v7e.m32723constructorimpl(bth.f14751a));
                return;
            }
        }
    }

    public final boolean takePending() {
        Object andSet = this.f66353a.getAndSet(n2g.f63091a);
        md8.checkNotNull(andSet);
        return andSet == n2g.f63092b;
    }

    @Override // p000.AbstractC9123m4
    public boolean allocateLocked(@yfb m2g<?> m2gVar) {
        if (up2.getValue(this.f66353a) != null) {
            return false;
        }
        up2.setValue(this.f66353a, n2g.f63091a);
        return true;
    }

    @Override // p000.AbstractC9123m4
    @yfb
    public zy2<bth>[] freeLocked(@yfb m2g<?> m2gVar) {
        up2.setValue(this.f66353a, null);
        return C8604l4.f56132a;
    }
}
