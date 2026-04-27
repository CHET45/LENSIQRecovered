package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public class zoe extends t85 {

    /* JADX INFO: renamed from: C */
    @yfb
    public v13 f105622C;

    /* JADX INFO: renamed from: d */
    public final int f105623d;

    /* JADX INFO: renamed from: e */
    public final int f105624e;

    /* JADX INFO: renamed from: f */
    public final long f105625f;

    /* JADX INFO: renamed from: m */
    @yfb
    public final String f105626m;

    public zoe() {
        this(0, 0, 0L, null, 15, null);
    }

    private final v13 createScheduler() {
        return new v13(this.f105623d, this.f105624e, this.f105625f, this.f105626m);
    }

    @Override // p000.t85, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.f105622C.close();
    }

    @Override // p000.m13
    /* JADX INFO: renamed from: dispatch */
    public void mo29873dispatch(@yfb e13 e13Var, @yfb Runnable runnable) {
        v13.dispatch$default(this.f105622C, runnable, false, false, 6, null);
    }

    public final void dispatchWithContext$kotlinx_coroutines_core(@yfb Runnable runnable, boolean z, boolean z2) {
        this.f105622C.dispatch(runnable, z, z2);
    }

    @Override // p000.m13
    public void dispatchYield(@yfb e13 e13Var, @yfb Runnable runnable) {
        v13.dispatch$default(this.f105622C, runnable, false, true, 2, null);
    }

    @Override // p000.t85
    @yfb
    public Executor getExecutor() {
        return this.f105622C;
    }

    public final void restore$kotlinx_coroutines_core() {
        usePrivateScheduler$kotlinx_coroutines_core();
    }

    public final synchronized void shutdown$kotlinx_coroutines_core(long j) {
        this.f105622C.shutdown(j);
    }

    public final synchronized void usePrivateScheduler$kotlinx_coroutines_core() {
        this.f105622C.shutdown(1000L);
        this.f105622C = createScheduler();
    }

    public /* synthetic */ zoe(int i, int i2, long j, String str, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? vng.f91816c : i, (i3 & 2) != 0 ? vng.f91817d : i2, (i3 & 4) != 0 ? vng.f91818e : j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public zoe(int i, int i2, long j, @yfb String str) {
        this.f105623d = i;
        this.f105624e = i2;
        this.f105625f = j;
        this.f105626m = str;
        this.f105622C = createScheduler();
    }
}
