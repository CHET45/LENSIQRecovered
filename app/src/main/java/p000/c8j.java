package p000;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p024firebaseauthapi.zzahr;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.security.MessageDigest;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class c8j implements Continuation<zzahr, Task<IntegrityTokenResponse>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f15992a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IntegrityManager f15993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j6j f15994c;

    public c8j(j6j j6jVar, String str, IntegrityManager integrityManager) {
        this.f15992a = str;
        this.f15993b = integrityManager;
        Objects.requireNonNull(j6jVar);
        this.f15994c = j6jVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    @hib
    public final /* synthetic */ Task<IntegrityTokenResponse> then(Task<zzahr> task) throws Exception {
        if (task.isSuccessful()) {
            this.f15994c.f49658a = task.getResult().zza();
            return this.f15993b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(task.getResult().zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f15992a.getBytes("UTF-8")), 11))).build());
        }
        Log.e(j6j.f49656b, "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
        return Tasks.forException(task.getException());
    }
}
