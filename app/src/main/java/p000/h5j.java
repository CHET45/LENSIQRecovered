package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzal;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class h5j implements Continuation<AuthResult, Task<AuthResult>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzal f42433a;

    public h5j(zzal zzalVar) {
        Objects.requireNonNull(zzalVar);
        this.f42433a = zzalVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<AuthResult> then(@efb Task<AuthResult> task) throws Exception {
        if (this.f42433a.f23409d == null) {
            return task;
        }
        if (task.isSuccessful()) {
            AuthResult result = task.getResult();
            return Tasks.forResult(new zzz((zzaf) result.getUser(), (zzx) result.getAdditionalUserInfo(), this.f42433a.f23409d));
        }
        Exception exception = task.getException();
        if (exception instanceof fx5) {
            ((fx5) exception).zza(this.f42433a.f23409d);
        }
        return Tasks.forException(exception);
    }
}
