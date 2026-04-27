package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class e5j implements Continuation<f57, Task<Void>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f31876a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionCodeSettings f31877b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FirebaseUser f31878c;

    public e5j(FirebaseUser firebaseUser, String str, ActionCodeSettings actionCodeSettings) {
        this.f31876a = str;
        this.f31877b = actionCodeSettings;
        Objects.requireNonNull(firebaseUser);
        this.f31878c = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<f57> task) throws Exception {
        return FirebaseAuth.getInstance(this.f31878c.zza()).zza((String) Preconditions.checkNotNull(task.getResult().getToken()), this.f31876a, this.f31877b);
    }
}
