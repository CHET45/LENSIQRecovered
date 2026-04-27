package p000;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.C3568c;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class d9j implements OnCompleteListener<a9j> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3568c f28848a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f28849b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FirebaseAuth f28850c;

    public d9j(FirebaseAuth firebaseAuth, C3568c c3568c, String str) {
        this.f28848a = c3568c;
        this.f28849b = str;
        Objects.requireNonNull(firebaseAuth);
        this.f28850c = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<a9j> task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", "Error while validating application identity: " + (exception != null ? exception.getMessage() : ""));
            if (exception != null && j6j.zza(exception)) {
                FirebaseAuth.zza((rx5) exception, this.f28848a, this.f28849b);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
        }
        this.f28850c.zza(this.f28848a, task.getResult());
    }
}
