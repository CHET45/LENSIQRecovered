package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class c5j implements Continuation<f57, Task<Void>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FirebaseUser f15815a;

    public c5j(FirebaseUser firebaseUser) {
        Objects.requireNonNull(firebaseUser);
        this.f15815a = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<f57> task) throws Exception {
        return FirebaseAuth.getInstance(this.f15815a.zza()).zza((ActionCodeSettings) null, (String) Preconditions.checkNotNull(task.getResult().getToken()));
    }
}
