package p000;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* JADX INFO: loaded from: classes5.dex */
public final class v7j {

    /* JADX INFO: renamed from: c */
    public static final v7j f90271c = new v7j();

    /* JADX INFO: renamed from: a */
    public final v6j f90272a;

    /* JADX INFO: renamed from: b */
    public final c6j f90273b;

    private v7j() {
        this(v6j.zzc(), c6j.zza());
    }

    public static v7j zzc() {
        return f90271c;
    }

    public final Task<AuthResult> zza() {
        return this.f90272a.zza();
    }

    public final Task<String> zzb() {
        return this.f90272a.zzb();
    }

    @fdi
    private v7j(v6j v6jVar, c6j c6jVar) {
        this.f90272a = v6jVar;
        this.f90273b = c6jVar;
    }

    public final void zza(Context context) {
        this.f90272a.zza(context);
    }

    public final void zza(FirebaseAuth firebaseAuth) {
        this.f90272a.zza(firebaseAuth);
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.f90273b.zza(activity, taskCompletionSource, firebaseAuth);
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        return this.f90273b.zza(activity, taskCompletionSource, firebaseAuth, firebaseUser);
    }
}
