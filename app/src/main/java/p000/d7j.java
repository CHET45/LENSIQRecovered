package p000;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p024firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* JADX INFO: loaded from: classes5.dex */
public final class d7j implements Continuation<Object, Task<Object>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f28725a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h7j f28726b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ RecaptchaAction f28727c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Continuation f28728d;

    public d7j(String str, h7j h7jVar, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f28725a = str;
        this.f28726b = h7jVar;
        this.f28727c = recaptchaAction;
        this.f28728d = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Object> then(Task<Object> task) throws Exception {
        if (task.isSuccessful() || !zzaen.zzc((Exception) Preconditions.checkNotNull(task.getException()))) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + this.f28725a);
        }
        return this.f28726b.zza(this.f28725a, Boolean.TRUE, this.f28727c).continueWithTask(this.f28728d);
    }
}
