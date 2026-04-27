package p000;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* JADX INFO: loaded from: classes5.dex */
public final class f7j implements c7j {
    @Override // p000.c7j
    public final Task<RecaptchaTasksClient> zza(Application application, String str) {
        return Recaptcha.fetchTaskClient(application, str);
    }
}
