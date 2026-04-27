package p000;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.p024firebaseauthapi.zzajb;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zze;

/* JADX INFO: loaded from: classes5.dex */
public final class c6j {

    /* JADX INFO: renamed from: c */
    public static c6j f15885c;

    /* JADX INFO: renamed from: a */
    public boolean f15886a = false;

    /* JADX INFO: renamed from: b */
    public BroadcastReceiver f15887b;

    private c6j() {
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public static void m3825a(Context context) {
        c6j c6jVar = f15885c;
        c6jVar.f15886a = false;
        if (c6jVar.f15887b != null) {
            fd9.getInstance(context).unregisterReceiver(f15885c.f15887b);
        }
        f15885c.f15887b = null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3826b(c6j c6jVar, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        m3825a(context);
    }

    private static AuthCredential zza(Intent intent) {
        Preconditions.checkNotNull(intent);
        return zze.zza(((zzajb) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzajb.CREATOR)).zzc(true));
    }

    public static c6j zza() {
        if (f15885c == null) {
            f15885c = new c6j();
        }
        return f15885c;
    }

    private final void zza(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f15887b = broadcastReceiver;
        fd9.getInstance(activity).registerReceiver(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return zza(activity, taskCompletionSource, firebaseAuth, null);
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (this.f15886a) {
            return false;
        }
        zza(activity, new n6j(this, activity, taskCompletionSource, firebaseAuth, firebaseUser));
        this.f15886a = true;
        return true;
    }

    public final boolean zza(Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        if (this.f15886a) {
            return false;
        }
        zza(activity, new p6j(this, activity, taskCompletionSource));
        this.f15886a = true;
        return true;
    }
}
