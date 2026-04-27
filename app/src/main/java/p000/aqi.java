package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class aqi implements ong {

    /* JADX INFO: renamed from: a */
    public final q0f f11623a;

    /* JADX INFO: renamed from: b */
    public final Handler f11624b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public final Executor f11625c = new ExecutorC1566a();

    /* JADX INFO: renamed from: aqi$a */
    public class ExecutorC1566a implements Executor {
        public ExecutorC1566a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@efb Runnable command) {
            aqi.this.postToMainThread(command);
        }
    }

    public aqi(@efb Executor backgroundExecutor) {
        this.f11623a = new q0f(backgroundExecutor);
    }

    @Override // p000.ong
    public void executeOnBackgroundThread(Runnable runnable) {
        this.f11623a.execute(runnable);
    }

    @Override // p000.ong
    @efb
    public q0f getBackgroundExecutor() {
        return this.f11623a;
    }

    @Override // p000.ong
    public Executor getMainThreadExecutor() {
        return this.f11625c;
    }

    @Override // p000.ong
    public void postToMainThread(Runnable runnable) {
        this.f11624b.post(runnable);
    }
}
