package p000;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class n7j implements OnFailureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FirebaseAuth f63471a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f63472b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f63473c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f63474d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f63475e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ v7j f63476f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TaskCompletionSource f63477g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ j6j f63478h;

    public n7j(j6j j6jVar, FirebaseAuth firebaseAuth, String str, Activity activity, boolean z, boolean z2, v7j v7jVar, TaskCompletionSource taskCompletionSource) {
        this.f63471a = firebaseAuth;
        this.f63472b = str;
        this.f63473c = activity;
        this.f63474d = z;
        this.f63475e = z2;
        this.f63476f = v7jVar;
        this.f63477g = taskCompletionSource;
        Objects.requireNonNull(j6jVar);
        this.f63478h = j6jVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@efb Exception exc) {
        Log.e(j6j.f49656b, "Failed to get reCAPTCHA enterprise token: " + exc.getMessage() + "\n\n Using fallback methods.");
        if (this.f63471a.zzb().zza("PHONE_PROVIDER")) {
            this.f63478h.zza(this.f63471a, this.f63472b, this.f63473c, this.f63474d, this.f63475e, this.f63476f, (TaskCompletionSource<a9j>) this.f63477g);
        } else {
            this.f63477g.setResult(new h9j().zza());
        }
    }
}
