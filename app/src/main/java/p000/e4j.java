package p000;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e4j implements Runnable {

    /* JADX INFO: renamed from: a */
    @hib
    private final TaskCompletionSource f31801a;

    public e4j() {
        this.f31801a = null;
    }

    /* JADX INFO: renamed from: a */
    public void mo6635a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f31801a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo6636b();

    @hib
    /* JADX INFO: renamed from: c */
    public final TaskCompletionSource m9678c() {
        return this.f31801a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo6636b();
        } catch (Exception e) {
            mo6635a(e);
        }
    }

    public e4j(@hib TaskCompletionSource taskCompletionSource) {
        this.f31801a = taskCompletionSource;
    }
}
