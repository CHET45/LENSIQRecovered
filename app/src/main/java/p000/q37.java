package p000;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public class q37 implements s2g {

    /* JADX INFO: renamed from: a */
    public final g1i f73115a;

    /* JADX INFO: renamed from: b */
    public final TaskCompletionSource<k58> f73116b;

    public q37(g1i g1iVar, TaskCompletionSource<k58> taskCompletionSource) {
        this.f73115a = g1iVar;
        this.f73116b = taskCompletionSource;
    }

    @Override // p000.s2g
    public boolean onException(Exception exc) {
        this.f73116b.trySetException(exc);
        return true;
    }

    @Override // p000.s2g
    public boolean onStateReached(iqc iqcVar) {
        if (!iqcVar.isRegistered() || this.f73115a.isAuthTokenExpired(iqcVar)) {
            return false;
        }
        this.f73116b.setResult(k58.builder().setToken(iqcVar.getAuthToken()).setTokenExpirationTimestamp(iqcVar.getExpiresInSecs()).setTokenCreationTimestamp(iqcVar.getTokenCreationEpochInSecs()).build());
        return true;
    }
}
