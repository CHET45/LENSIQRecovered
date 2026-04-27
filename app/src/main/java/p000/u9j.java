package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p024firebaseauthapi.zzair;
import com.google.android.gms.internal.p024firebaseauthapi.zzaix;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class u9j implements Continuation<zzair, Task<k5h>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FirebaseAuth f87244a;

    public u9j(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.f87244a = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<k5h> then(Task<zzair> task) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) Preconditions.checkNotNull(task.getException()));
        }
        zzair result = task.getResult();
        if (result instanceof zzaix) {
            zzaix zzaixVar = (zzaix) result;
            return Tasks.forResult(new r7j(Preconditions.checkNotEmpty(zzaixVar.zzf()), Preconditions.checkNotEmpty(zzaixVar.zze()), zzaixVar.zzc(), zzaixVar.zzb(), zzaixVar.zzd(), Preconditions.checkNotEmpty(zzaixVar.zza()), this.f87244a));
        }
        throw new IllegalArgumentException("Response should be an instance of StartTotpMfaEnrollmentResponse but was " + result.getClass().getName() + ".");
    }
}
