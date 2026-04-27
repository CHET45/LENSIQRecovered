package p000;

import com.google.android.gms.internal.p024firebaseauthapi.zzac;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class s4j implements Continuation<RecaptchaTasksClient, Task<Void>> {
    public s4j(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<RecaptchaTasksClient> task) throws Exception {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        return Tasks.forException(new xw5("INTERNAL_ERROR", zzac.zzb(exception != null ? exception.getMessage() : "")));
    }
}
