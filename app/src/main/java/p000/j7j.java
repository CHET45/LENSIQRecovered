package p000;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class j7j implements Continuation<RecaptchaTasksClient, Task<String>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecaptchaAction f49803a;

    public j7j(h7j h7jVar, RecaptchaAction recaptchaAction) {
        this.f49803a = recaptchaAction;
        Objects.requireNonNull(h7jVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<String> then(Task<RecaptchaTasksClient> task) throws Exception {
        if (task.isSuccessful()) {
            return task.getResult().executeTask(this.f49803a);
        }
        Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
        if (!(exc instanceof e7j)) {
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exc.getMessage());
        }
        return Tasks.forResult("");
    }
}
