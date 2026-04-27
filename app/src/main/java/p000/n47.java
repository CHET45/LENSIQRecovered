package p000;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public class n47 implements s2g {

    /* JADX INFO: renamed from: a */
    public final TaskCompletionSource<String> f63246a;

    public n47(TaskCompletionSource<String> taskCompletionSource) {
        this.f63246a = taskCompletionSource;
    }

    @Override // p000.s2g
    public boolean onException(Exception exc) {
        return false;
    }

    @Override // p000.s2g
    public boolean onStateReached(iqc iqcVar) {
        if (!iqcVar.isUnregistered() && !iqcVar.isRegistered() && !iqcVar.isErrored()) {
            return false;
        }
        this.f63246a.trySetResult(iqcVar.getFirebaseInstallationId());
        return true;
    }
}
