package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p024firebaseauthapi.zzac;
import com.google.android.gms.internal.p024firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class h7j {

    /* JADX INFO: renamed from: a */
    public final Object f42872a;

    /* JADX INFO: renamed from: b */
    public final Map<String, Task<RecaptchaTasksClient>> f42873b;

    /* JADX INFO: renamed from: c */
    @hib
    public zzahs f42874c;

    /* JADX INFO: renamed from: d */
    public lw5 f42875d;

    /* JADX INFO: renamed from: e */
    public FirebaseAuth f42876e;

    /* JADX INFO: renamed from: f */
    public c7j f42877f;

    public h7j(lw5 lw5Var, FirebaseAuth firebaseAuth) {
        this(lw5Var, firebaseAuth, new f7j());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12258a(h7j h7jVar, zzahs zzahsVar, Task task, String str) {
        synchronized (h7jVar.f42872a) {
            h7jVar.f42874c = zzahsVar;
            h7jVar.f42873b.put(str, task);
        }
    }

    @hib
    private final Task<RecaptchaTasksClient> zzc(String str) {
        Task<RecaptchaTasksClient> task;
        synchronized (this.f42872a) {
            task = this.f42873b.get(str);
        }
        return task;
    }

    private static String zzd(@hib String str) {
        return zzac.zzc(str) ? "*" : str;
    }

    public final Task<String> zza(@hib String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String strZzd = zzd(str);
        Task<RecaptchaTasksClient> taskZzc = zzc(strZzd);
        if (bool.booleanValue() || taskZzc == null) {
            taskZzc = zza(strZzd, bool);
        }
        return taskZzc.continueWithTask(new j7j(this, recaptchaAction));
    }

    public final boolean zzb(String str) {
        boolean z;
        synchronized (this.f42872a) {
            try {
                zzahs zzahsVar = this.f42874c;
                z = zzahsVar != null && zzahsVar.zzc(str);
            } finally {
            }
        }
        return z;
    }

    private h7j(lw5 lw5Var, FirebaseAuth firebaseAuth, c7j c7jVar) {
        this.f42872a = new Object();
        this.f42873b = new HashMap();
        this.f42875d = lw5Var;
        this.f42876e = firebaseAuth;
        this.f42877f = c7jVar;
    }

    public final Task<RecaptchaTasksClient> zza(@hib String str, Boolean bool) {
        Task<RecaptchaTasksClient> taskZzc;
        String strZzd = zzd(str);
        return (bool.booleanValue() || (taskZzc = zzc(strZzd)) == null) ? this.f42876e.zza("RECAPTCHA_ENTERPRISE").continueWithTask(new g7j(this, strZzd)) : taskZzc;
    }

    public final boolean zza(String str) {
        String strZzb;
        Preconditions.checkNotNull(str);
        zzahs zzahsVar = this.f42874c;
        if (zzahsVar == null || (strZzb = zzahsVar.zzb(str)) == null) {
            return false;
        }
        return strZzb.equals("AUDIT");
    }
}
