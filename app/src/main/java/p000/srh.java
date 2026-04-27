package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class srh extends m13 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final srh f82724c = new srh();

    private srh() {
    }

    @Override // p000.m13
    /* JADX INFO: renamed from: dispatch */
    public void mo29873dispatch(@yfb e13 e13Var, @yfb Runnable runnable) {
        kti ktiVar = (kti) e13Var.get(kti.f55315c);
        if (ktiVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        ktiVar.f55316b = true;
    }

    @Override // p000.m13
    public boolean isDispatchNeeded(@yfb e13 e13Var) {
        return false;
    }

    @Override // p000.m13
    @yfb
    public m13 limitedParallelism(int i, @gib String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // p000.m13
    @yfb
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
