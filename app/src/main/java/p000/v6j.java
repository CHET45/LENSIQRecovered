package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.p024firebaseauthapi.zzaen;
import com.google.android.gms.internal.p024firebaseauthapi.zzah;
import com.google.android.gms.internal.p024firebaseauthapi.zzajb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zze;

/* JADX INFO: loaded from: classes5.dex */
public final class v6j {

    /* JADX INFO: renamed from: d */
    @fdi
    public static long f90124d = 3600000;

    /* JADX INFO: renamed from: e */
    public static final zzah<String> f90125e = zzah.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* JADX INFO: renamed from: f */
    public static final v6j f90126f = new v6j();

    /* JADX INFO: renamed from: a */
    public Task<AuthResult> f90127a;

    /* JADX INFO: renamed from: b */
    public Task<String> f90128b;

    /* JADX INFO: renamed from: c */
    public long f90129c = 0;

    private v6j() {
    }

    public static v6j zzc() {
        return f90126f;
    }

    @hib
    public final Task<AuthResult> zza() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.f90129c < f90124d) {
            return this.f90127a;
        }
        return null;
    }

    @hib
    public final Task<String> zzb() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.f90129c < f90124d) {
            return this.f90128b;
        }
        return null;
    }

    private static void zza(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        zzah<String> zzahVar = f90125e;
        int size = zzahVar.size();
        int i = 0;
        while (i < size) {
            String str = zzahVar.get(i);
            i++;
            editorEdit.remove(str);
        }
        editorEdit.commit();
    }

    public final void zza(Context context) {
        Preconditions.checkNotNull(context);
        zza(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f90127a = null;
        this.f90129c = 0L;
    }

    public final void zza(FirebaseAuth firebaseAuth) {
        zzajb zzajbVar;
        String string;
        Preconditions.checkNotNull(firebaseAuth);
        SharedPreferences sharedPreferences = firebaseAuth.getApp().getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        if (firebaseAuth.getApp().getName().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (sharedPreferences.contains("verifyAssertionRequest")) {
                zzajbVar = (zzajb) SafeParcelableSerializer.deserializeFromString(sharedPreferences.getString("verifyAssertionRequest", ""), zzajb.CREATOR);
                String string2 = sharedPreferences.getString("operation", "");
                String string3 = sharedPreferences.getString("tenantId", null);
                string = sharedPreferences.getString("firebaseUserUid", "");
                this.f90129c = sharedPreferences.getLong("timestamp", 0L);
                if (string3 != null) {
                    firebaseAuth.setTenantId(string3);
                    zzajbVar.zzb(string3);
                }
                string2.hashCode();
                switch (string2) {
                    case "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE":
                        if (firebaseAuth.getCurrentUser().getUid().equals(string)) {
                            this.f90127a = firebaseAuth.zzc(firebaseAuth.getCurrentUser(), zze.zza(zzajbVar));
                            break;
                        } else {
                            this.f90127a = null;
                            break;
                        }
                        break;
                    case "com.google.firebase.auth.internal.NONGMSCORE_LINK":
                        if (firebaseAuth.getCurrentUser().getUid().equals(string)) {
                            this.f90127a = firebaseAuth.zza(firebaseAuth.getCurrentUser(), zze.zza(zzajbVar));
                            break;
                        } else {
                            this.f90127a = null;
                            break;
                        }
                        break;
                    case "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN":
                        this.f90127a = firebaseAuth.signInWithCredential(zze.zza(zzajbVar));
                        break;
                    default:
                        this.f90127a = null;
                        break;
                }
                zza(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains("recaptchaToken")) {
                String string4 = sharedPreferences.getString("recaptchaToken", "");
                String string5 = sharedPreferences.getString("operation", "");
                this.f90129c = sharedPreferences.getLong("timestamp", 0L);
                string5.hashCode();
                this.f90128b = string5.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA") ? Tasks.forResult(string4) : null;
                zza(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains("statusCode")) {
                Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""));
                this.f90129c = sharedPreferences.getLong("timestamp", 0L);
                zza(sharedPreferences);
                this.f90127a = Tasks.forException(zzaen.zza(status));
            }
        }
    }

    public static void zza(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.getStatusCode());
        editorEdit.putString("statusMessage", status.getStatusMessage());
        editorEdit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        editorEdit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(firebaseAuth);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        editorEdit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(firebaseAuth);
        Preconditions.checkNotNull(firebaseUser);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        editorEdit.putString("firebaseUserUid", firebaseUser.getUid());
        editorEdit.commit();
    }

    public static void zza(Context context, zzajb zzajbVar, String str, @hib String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("verifyAssertionRequest", SafeParcelableSerializer.serializeToString(zzajbVar));
        editorEdit.putString("operation", str);
        editorEdit.putString("tenantId", str2);
        editorEdit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        editorEdit.commit();
    }

    public static void zza(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("recaptchaToken", str);
        editorEdit.putString("operation", str2);
        editorEdit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        editorEdit.commit();
    }
}
