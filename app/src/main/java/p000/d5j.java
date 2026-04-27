package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.internal.zzam;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class d5j implements Continuation<f57, Task<MultiFactorSession>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f5j f28487a;

    public d5j(f5j f5jVar) {
        Objects.requireNonNull(f5jVar);
        this.f28487a = f5jVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<MultiFactorSession> then(Task<f57> task) throws Exception {
        return !task.isSuccessful() ? Tasks.forException((Exception) Preconditions.checkNotNull(task.getException())) : Tasks.forResult(zzam.zza(task.getResult().getToken(), this.f28487a.f35389a));
    }
}
