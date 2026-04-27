package p000;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p024firebaseauthapi.zzaen;
import com.google.android.gms.internal.p024firebaseauthapi.zzafz;
import com.google.android.gms.internal.p024firebaseauthapi.zzagl;
import com.google.android.gms.internal.p024firebaseauthapi.zzahr;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes5.dex */
public class j6j {

    /* JADX INFO: renamed from: b */
    public static final String f49656b = "j6j";

    /* JADX INFO: renamed from: c */
    public static final j6j f49657c = new j6j();

    /* JADX INFO: renamed from: a */
    public String f49658a;

    private j6j() {
    }

    public final Task<a9j> zza(final FirebaseAuth firebaseAuth, @hib final String str, @hib final Activity activity, final boolean z, boolean z2, boolean z3, final RecaptchaAction recaptchaAction) {
        t4j t4jVar = (t4j) firebaseAuth.getFirebaseAuthSettings();
        final v7j v7jVarZzc = v7j.zzc();
        if (zzagl.zza(firebaseAuth.getApp()) || t4jVar.zze()) {
            return Tasks.forResult(new h9j().zza());
        }
        String str2 = f49656b;
        Log.i(str2, "ForceRecaptchaV2Flow from phoneAuthOptions = " + z2 + ", ForceRecaptchav2Flow from firebaseSettings = " + t4jVar.zzc());
        boolean z4 = z2 || t4jVar.zzc();
        final TaskCompletionSource<a9j> taskCompletionSource = new TaskCompletionSource<>();
        Task<String> taskZzb = v7jVarZzc.zzb();
        if (taskZzb != null) {
            if (taskZzb.isSuccessful()) {
                return Tasks.forResult(new h9j().zzc(taskZzb.getResult()).zza());
            }
            Log.e(str2, "Error in previous reCAPTCHAV2 flow: " + taskZzb.getException().getMessage());
            Log.e(str2, "Continuing with application verification as normal");
        }
        if (z4 || z3) {
            zza(firebaseAuth, str, activity, z, z4, v7jVarZzc, taskCompletionSource);
        } else {
            final boolean z5 = false;
            firebaseAuth.initializeRecaptchaConfig().addOnCompleteListener(new OnCompleteListener() { // from class: p4j
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    j6j.zza(this.f69672a, taskCompletionSource, firebaseAuth, recaptchaAction, str, activity, z, z5, v7jVarZzc, task);
                }
            });
        }
        return taskCompletionSource.getTask();
    }

    public static j6j zza() {
        return f49657c;
    }

    public static /* synthetic */ void zza(j6j j6jVar, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, RecaptchaAction recaptchaAction, String str, Activity activity, boolean z, boolean z2, v7j v7jVar, Task task) {
        if (!task.isSuccessful()) {
            Log.e(f49656b, "Failed to initialize reCAPTCHA config: " + task.getException().getMessage());
        }
        if (firebaseAuth.zzb() != null && firebaseAuth.zzb().zzb("PHONE_PROVIDER")) {
            firebaseAuth.zzb().zza(firebaseAuth.getTenantId(), Boolean.FALSE, recaptchaAction).addOnSuccessListener(new l8j(j6jVar, taskCompletionSource)).addOnFailureListener(new n7j(j6jVar, firebaseAuth, str, activity, z, z2, v7jVar, taskCompletionSource));
        } else {
            j6jVar.zza(firebaseAuth, str, activity, z, z2, v7jVar, (TaskCompletionSource<a9j>) taskCompletionSource);
        }
    }

    public static /* synthetic */ void zza(j6j j6jVar, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, v7j v7jVar, Activity activity, Task task) {
        if (task.isSuccessful() && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new h9j().zza(((IntegrityTokenResponse) task.getResult()).token()).zza());
            return;
        }
        String message = task.getException() == null ? "" : task.getException().getMessage();
        Log.e(f49656b, "Play Integrity Token fetch failed, falling back to Recaptcha" + message);
        j6jVar.zza(firebaseAuth, v7jVar, activity, taskCompletionSource);
    }

    private final void zza(FirebaseAuth firebaseAuth, v7j v7jVar, Activity activity, TaskCompletionSource<a9j> taskCompletionSource) {
        Task<String> task;
        if (activity == null) {
            taskCompletionSource.setException(new ax5());
            return;
        }
        v6j.zza(firebaseAuth.getApp().getApplicationContext(), firebaseAuth);
        Preconditions.checkNotNull(activity);
        TaskCompletionSource<String> taskCompletionSource2 = new TaskCompletionSource<>();
        if (!c6j.zza().zza(activity, taskCompletionSource2)) {
            task = Tasks.forException(zzaen.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        } else {
            new zzafz(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        }
        task.addOnSuccessListener(new p8j(this, taskCompletionSource)).addOnFailureListener(new r8j(this, taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z, boolean z2, final v7j v7jVar, final TaskCompletionSource<a9j> taskCompletionSource) {
        Task<zzahr> taskZza;
        if (z && !z2) {
            IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(firebaseAuth.getApp().getApplicationContext());
            if (!TextUtils.isEmpty(this.f49658a)) {
                taskZza = Tasks.forResult(new zzahr(this.f49658a));
            } else {
                taskZza = firebaseAuth.zza();
            }
            taskZza.continueWithTask(firebaseAuth.zzf(), new c8j(this, str, integrityManagerCreate)).addOnCompleteListener(new OnCompleteListener() { // from class: z7j
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    j6j.zza(this.f104353a, taskCompletionSource, firebaseAuth, v7jVar, activity, task);
                }
            });
            return;
        }
        zza(firebaseAuth, v7jVar, activity, taskCompletionSource);
    }

    public static boolean zza(Exception exc) {
        if (exc instanceof ax5) {
            return true;
        }
        return (exc instanceof xw5) && ((xw5) exc).getErrorCode().endsWith("UNAUTHORIZED_DOMAIN");
    }
}
