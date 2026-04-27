package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class a5j implements Continuation<f57, Task<Void>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ActionCodeSettings f479a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirebaseUser f480b;

    public a5j(FirebaseUser firebaseUser, ActionCodeSettings actionCodeSettings) {
        this.f479a = actionCodeSettings;
        Objects.requireNonNull(firebaseUser);
        this.f480b = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<f57> task) throws Exception {
        return FirebaseAuth.getInstance(this.f480b.zza()).zza(this.f479a, (String) Preconditions.checkNotNull(task.getResult().getToken()));
    }
}
