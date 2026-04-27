package p000;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public final class h4j extends e4j {

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ e4j f42382C;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ bvi f42383F;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ TaskCompletionSource f42384m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4j(bvi bviVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, e4j e4jVar) {
        super(taskCompletionSource);
        this.f42383F = bviVar;
        this.f42384m = taskCompletionSource2;
        this.f42382C = e4jVar;
    }

    @Override // p000.e4j
    /* JADX INFO: renamed from: b */
    public final void mo6636b() {
        synchronized (this.f42383F.f14972f) {
            try {
                bvi.m3449o(this.f42383F, this.f42384m);
                if (this.f42383F.f14978l.getAndIncrement() > 0) {
                    this.f42383F.f14968b.m3767d("Already connected to the service.", new Object[0]);
                }
                bvi.m3451q(this.f42383F, this.f42382C);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
