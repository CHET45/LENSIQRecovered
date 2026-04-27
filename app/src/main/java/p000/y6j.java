package p000;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p024firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes5.dex */
public abstract class y6j<T> {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m25670a(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) throws Exception {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
        if (zzaen.zzd(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + String.valueOf(recaptchaAction));
            }
            if (firebaseAuth.zzb() == null) {
                firebaseAuth.zza(new h7j(firebaseAuth.getApp(), firebaseAuth));
            }
            return zza(firebaseAuth.zzb(), recaptchaAction, str, continuation);
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
        return Tasks.forException(exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> Task<T> zza(h7j h7jVar, RecaptchaAction recaptchaAction, @hib String str, Continuation<String, Task<T>> continuation) {
        Task<String> taskZza = h7jVar.zza(str, Boolean.FALSE, recaptchaAction);
        return taskZza.continueWithTask(continuation).continueWithTask(new d7j(str, h7jVar, recaptchaAction, continuation));
    }

    public abstract Task<T> zza(@hib String str);

    public final Task<T> zza(final FirebaseAuth firebaseAuth, @hib final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: a7j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                y6j y6jVar = this.f600a;
                if (task.isSuccessful()) {
                    return y6jVar.zza((String) task.getResult());
                }
                Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) Preconditions.checkNotNull(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
                return y6jVar.zza("NO_RECAPTCHA");
            }
        };
        h7j h7jVarZzb = firebaseAuth.zzb();
        if (h7jVarZzb != null && h7jVarZzb.zzb(str2)) {
            return zza(h7jVarZzb, recaptchaAction, str, continuation);
        }
        return (Task<T>) zza(null).continueWithTask(new Continuation() { // from class: b7j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return y6j.m25670a(recaptchaAction, firebaseAuth, str, continuation, task);
            }
        });
    }
}
