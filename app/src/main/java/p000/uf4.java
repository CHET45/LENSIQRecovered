package p000;

/* JADX INFO: loaded from: classes.dex */
public final class uf4 implements eyd {

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<wf4, vf4> f87855a;

    /* JADX INFO: renamed from: b */
    @gib
    public vf4 f87856b;

    /* JADX WARN: Multi-variable type inference failed */
    public uf4(@yfb qy6<? super wf4, ? extends vf4> qy6Var) {
        this.f87855a = qy6Var;
    }

    @Override // p000.eyd
    public void onAbandoned() {
    }

    @Override // p000.eyd
    public void onForgotten() {
        vf4 vf4Var = this.f87856b;
        if (vf4Var != null) {
            vf4Var.dispose();
        }
        this.f87856b = null;
    }

    @Override // p000.eyd
    public void onRemembered() {
        this.f87856b = this.f87855a.invoke(jx4.f52168a);
    }
}
