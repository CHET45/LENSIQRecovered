package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class ew3 extends t85 implements Executor {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final ew3 f34286d = new ew3();

    /* JADX INFO: renamed from: e */
    @yfb
    public static final m13 f34287e = m13.limitedParallelism$default(nuh.f65757c, bkg.systemProp$default(ef4.f32796a, kpd.coerceAtLeast(64, zjg.getAVAILABLE_PROCESSORS()), 0, 0, 12, (Object) null), null, 2, null);

    private ew3() {
    }

    @Override // p000.t85, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // p000.m13
    /* JADX INFO: renamed from: dispatch */
    public void mo29873dispatch(@yfb e13 e13Var, @yfb Runnable runnable) {
        f34287e.mo29873dispatch(e13Var, runnable);
    }

    @Override // p000.m13
    @la8
    public void dispatchYield(@yfb e13 e13Var, @yfb Runnable runnable) {
        f34287e.dispatchYield(e13Var, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@yfb Runnable runnable) {
        mo29873dispatch(a05.f2a, runnable);
    }

    @Override // p000.t85
    @yfb
    public Executor getExecutor() {
        return this;
    }

    @Override // p000.m13
    @yfb
    public m13 limitedParallelism(int i, @gib String str) {
        return nuh.f65757c.limitedParallelism(i, str);
    }

    @Override // p000.m13
    @yfb
    public String toString() {
        return "Dispatchers.IO";
    }
}
