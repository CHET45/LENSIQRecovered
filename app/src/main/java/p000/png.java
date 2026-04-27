package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public abstract class png {
    public abstract void executeOnDiskIO(@efb Runnable runnable);

    public void executeOnMainThread(@efb Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            postToMainThread(runnable);
        }
    }

    public abstract boolean isMainThread();

    public abstract void postToMainThread(@efb Runnable runnable);
}
