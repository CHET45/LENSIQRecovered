package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class glc extends m13 {

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public final ue4 f40138c = new ue4();

    @Override // p000.m13
    /* JADX INFO: renamed from: dispatch */
    public void mo29873dispatch(@yfb e13 e13Var, @yfb Runnable runnable) {
        md8.checkNotNullParameter(e13Var, "context");
        md8.checkNotNullParameter(runnable, "block");
        this.f40138c.dispatchAndEnqueue(e13Var, runnable);
    }

    @Override // p000.m13
    public boolean isDispatchNeeded(@yfb e13 e13Var) {
        md8.checkNotNullParameter(e13Var, "context");
        if (df4.getMain().getImmediate().isDispatchNeeded(e13Var)) {
            return true;
        }
        return !this.f40138c.canRun();
    }
}
