package p000;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p024firebaseauthapi.zzac;
import com.google.android.gms.internal.p024firebaseauthapi.zzahs;
import com.google.android.gms.internal.p024firebaseauthapi.zzt;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class g7j implements Continuation<zzahs, Task<RecaptchaTasksClient>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f38978a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h7j f38979b;

    public g7j(h7j h7jVar, String str) {
        this.f38978a = str;
        Objects.requireNonNull(h7jVar);
        this.f38979b = h7jVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<RecaptchaTasksClient> then(Task<zzahs> task) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new e7j((String) Preconditions.checkNotNull(((Exception) Preconditions.checkNotNull(task.getException())).getMessage())));
        }
        zzahs result = task.getResult();
        String strZza = result.zza();
        if (zzac.zzc(strZza)) {
            return Tasks.forException(new e7j("No Recaptcha Enterprise siteKey configured for tenant/project " + this.f38978a));
        }
        List<String> listZza = zzt.zza('/').zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + strZza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.f38978a);
        }
        h7j h7jVar = this.f38979b;
        Task<RecaptchaTasksClient> taskZza = h7jVar.f42877f.zza((Application) h7jVar.f42875d.getApplicationContext(), str);
        h7j.m12258a(this.f38979b, result, taskZza, this.f38978a);
        return taskZza;
    }
}
