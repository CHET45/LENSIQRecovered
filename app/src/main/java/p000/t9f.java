package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
public final class t9f extends AbstractC9123m4<r9f<?>> {

    /* JADX INFO: renamed from: a */
    @un8
    public long f84055a = -1;

    /* JADX INFO: renamed from: b */
    @gib
    @un8
    public zy2<? super bth> f84056b;

    @Override // p000.AbstractC9123m4
    public boolean allocateLocked(@yfb r9f<?> r9fVar) {
        if (this.f84055a >= 0) {
            return false;
        }
        this.f84055a = r9fVar.updateNewCollectorIndexLocked$kotlinx_coroutines_core();
        return true;
    }

    @Override // p000.AbstractC9123m4
    @yfb
    public zy2<bth>[] freeLocked(@yfb r9f<?> r9fVar) {
        long j = this.f84055a;
        this.f84055a = -1L;
        this.f84056b = null;
        return r9fVar.updateCollectorIndexLocked$kotlinx_coroutines_core(j);
    }
}
