package p000;

/* JADX INFO: loaded from: classes6.dex */
public class qr0 implements kw3 {

    /* JADX INFO: renamed from: a */
    public final String f75181a = "BaseLifecycle";

    /* JADX INFO: renamed from: b */
    public nm2 f75182b;

    public void addNetDisposable(mf4 mf4Var) {
        if (this.f75182b == null) {
            this.f75182b = new nm2();
        }
        this.f75182b.add(mf4Var);
    }

    public void dispose() {
        nm2 nm2Var = this.f75182b;
        if (nm2Var != null) {
            nm2Var.dispose();
            this.f75182b.clear();
        }
    }

    @Override // p000.kw3
    public void onCreate(@efb g59 g59Var) {
    }

    @Override // p000.kw3
    public void onDestroy(@efb g59 g59Var) {
        g59Var.getClass();
        dispose();
    }

    @Override // p000.kw3
    public void onPause(@efb g59 g59Var) {
    }

    @Override // p000.kw3
    public void onResume(@efb g59 g59Var) {
    }

    @Override // p000.kw3
    public void onStart(@efb g59 g59Var) {
    }

    @Override // p000.kw3
    public void onStop(@efb g59 g59Var) {
    }
}
