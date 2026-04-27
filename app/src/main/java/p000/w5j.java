package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class w5j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final String f93388a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q5j f93389b;

    public w5j(q5j q5jVar, String str) {
        Objects.requireNonNull(q5jVar);
        this.f93389b = q5jVar;
        this.f93388a = Preconditions.checkNotEmpty(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(lw5.getInstance(this.f93388a));
        if (firebaseAuth.getCurrentUser() != null) {
            Task<f57> accessToken = firebaseAuth.getAccessToken(true);
            q5j.f73296h.m5799v("Token refreshing started", new Object[0]);
            accessToken.addOnFailureListener(new u5j(this));
        }
    }
}
