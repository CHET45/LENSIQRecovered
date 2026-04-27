package p000;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p024firebaseauthapi.zzaen;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class n6j extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final WeakReference<Activity> f63421a;

    /* JADX INFO: renamed from: b */
    public final TaskCompletionSource<AuthResult> f63422b;

    /* JADX INFO: renamed from: c */
    public final FirebaseAuth f63423c;

    /* JADX INFO: renamed from: d */
    public final FirebaseUser f63424d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ c6j f63425e;

    public n6j(c6j c6jVar, Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        Objects.requireNonNull(c6jVar);
        this.f63425e = c6jVar;
        this.f63421a = new WeakReference<>(activity);
        this.f63422b = taskCompletionSource;
        this.f63423c = firebaseAuth;
        this.f63424d = firebaseUser;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f63421a.get() == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f63422b.setException(zzaen.zza(new Status(qx5.f76256y, "Activity that started the web operation is no longer alive; see logcat for details")));
            c6j.m3825a(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            if (t7j.zzb(intent)) {
                this.f63422b.setException(zzaen.zza(t7j.zza(intent)));
                c6j.m3825a(context);
                return;
            } else {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    this.f63422b.setException(zzaen.zza(m5j.zza("WEB_CONTEXT_CANCELED")));
                    c6j.m3825a(context);
                    return;
                }
                return;
            }
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            c6j c6jVar = this.f63425e;
            TaskCompletionSource<AuthResult> taskCompletionSource = this.f63422b;
            this.f63423c.signInWithCredential(c6j.zza(intent)).addOnSuccessListener(new e6j(c6jVar, taskCompletionSource, context)).addOnFailureListener(new b6j(c6jVar, taskCompletionSource, context));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
            c6j c6jVar2 = this.f63425e;
            TaskCompletionSource<AuthResult> taskCompletionSource2 = this.f63422b;
            this.f63424d.linkWithCredential(c6j.zza(intent)).addOnSuccessListener(new m6j(c6jVar2, taskCompletionSource2, context)).addOnFailureListener(new d6j(c6jVar2, taskCompletionSource2, context));
        } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            c6j c6jVar3 = this.f63425e;
            TaskCompletionSource<AuthResult> taskCompletionSource3 = this.f63422b;
            this.f63424d.reauthenticateAndRetrieveData(c6j.zza(intent)).addOnSuccessListener(new o6j(c6jVar3, taskCompletionSource3, context)).addOnFailureListener(new l6j(c6jVar3, taskCompletionSource3, context));
        } else {
            this.f63422b.setException(zzaen.zza(m5j.zza("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + c0b.f15434d)));
        }
    }
}
