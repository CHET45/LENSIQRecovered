package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class fy2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final fx2 f38019a;

    public fy2(fx2 fx2Var) {
        this.f38019a = fx2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fx2 fx2VarAttach = this.f38019a.attach();
        try {
            runInContext();
        } finally {
            this.f38019a.detach(fx2VarAttach);
        }
    }

    public abstract void runInContext();
}
