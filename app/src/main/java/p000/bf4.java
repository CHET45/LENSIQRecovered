package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class bf4 implements Executor {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final m13 f13617a;

    public bf4(@yfb m13 m13Var) {
        this.f13617a = m13Var;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@yfb Runnable runnable) {
        m13 m13Var = this.f13617a;
        a05 a05Var = a05.f2a;
        if (m13Var.isDispatchNeeded(a05Var)) {
            this.f13617a.mo29873dispatch(a05Var, runnable);
        } else {
            runnable.run();
        }
    }

    @yfb
    public String toString() {
        return this.f13617a.toString();
    }
}
