package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class y9j implements Continuation<f57, Task<Void>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f100897a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirebaseAuth f100898b;

    public y9j(FirebaseAuth firebaseAuth, String str) {
        this.f100897a = str;
        Objects.requireNonNull(firebaseAuth);
        this.f100898b = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(@efb Task<f57> task) throws Exception {
        return !task.isSuccessful() ? Tasks.forException((Exception) Preconditions.checkNotNull(task.getException())) : this.f100898b.f23272e.zza(this.f100897a, (String) Preconditions.checkNotNull(task.getResult().getToken()), "apple.com", this.f100898b.f23278k);
    }
}
