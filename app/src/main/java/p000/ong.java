package p000;

import java.util.concurrent.Executor;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public interface ong {
    void executeOnBackgroundThread(Runnable runnable);

    q0f getBackgroundExecutor();

    Executor getMainThreadExecutor();

    void postToMainThread(Runnable runnable);
}
