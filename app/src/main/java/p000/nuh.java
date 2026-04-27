package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class nuh extends m13 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final nuh f65757c = new nuh();

    private nuh() {
    }

    @Override // p000.m13
    /* JADX INFO: renamed from: dispatch */
    public void mo29873dispatch(@yfb e13 e13Var, @yfb Runnable runnable) {
        gz3.f41852F.dispatchWithContext$kotlinx_coroutines_core(runnable, true, false);
    }

    @Override // p000.m13
    @la8
    public void dispatchYield(@yfb e13 e13Var, @yfb Runnable runnable) {
        gz3.f41852F.dispatchWithContext$kotlinx_coroutines_core(runnable, true, true);
    }

    @Override // p000.m13
    @yfb
    public m13 limitedParallelism(int i, @gib String str) {
        c69.checkParallelism(i);
        return i >= vng.f91817d ? c69.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    @Override // p000.m13
    @yfb
    public String toString() {
        return "Dispatchers.IO";
    }
}
