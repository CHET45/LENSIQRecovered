package p000;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p024firebaseauthapi.zzaen;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class p6j extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final WeakReference<Activity> f69859a;

    /* JADX INFO: renamed from: b */
    public final TaskCompletionSource<String> f69860b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c6j f69861c;

    public p6j(c6j c6jVar, Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        Objects.requireNonNull(c6jVar);
        this.f69861c = c6jVar;
        this.f69859a = new WeakReference<>(activity);
        this.f69860b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f69859a.get() == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f69860b.setException(zzaen.zza(new Status(qx5.f76256y, "Activity that started the web operation is no longer alive; see logcat for details")));
            c6j.m3825a(context);
            return;
        }
        if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                c6j.m3826b(this.f69861c, intent, this.f69860b, context);
                return;
            }
            this.f69860b.setException(zzaen.zza(m5j.zza("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + c0b.f15434d)));
            return;
        }
        if (t7j.zzb(intent)) {
            this.f69860b.setException(zzaen.zza(t7j.zza(intent)));
            c6j.m3825a(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f69860b.setException(zzaen.zza(m5j.zza("WEB_CONTEXT_CANCELED")));
            c6j.m3825a(context);
        }
    }
}
