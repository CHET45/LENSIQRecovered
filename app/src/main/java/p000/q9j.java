package p000;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class q9j implements a6j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FirebaseUser f73703a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirebaseAuth f73704b;

    public q9j(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.f73703a = firebaseUser;
        Objects.requireNonNull(firebaseAuth);
        this.f73704b = firebaseAuth;
    }

    @Override // p000.a6j
    public final void zza() {
        if (this.f73704b.f23273f == null || !this.f73704b.f23273f.getUid().equalsIgnoreCase(this.f73703a.getUid())) {
            return;
        }
        this.f73704b.zzg();
    }

    @Override // p000.y5j
    public final void zza(Status status) {
        if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005) {
            this.f73704b.signOut();
        }
    }
}
