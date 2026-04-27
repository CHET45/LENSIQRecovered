package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p024firebaseauthapi.zzahv;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class z9j implements y5j, e9j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FirebaseAuth f104517a;

    public z9j(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.f104517a = firebaseAuth;
    }

    @Override // p000.e9j
    public final void zza(zzahv zzahvVar, FirebaseUser firebaseUser) {
        this.f104517a.m6708d(firebaseUser, zzahvVar, true, true);
    }

    @Override // p000.y5j
    public final void zza(Status status) {
        int statusCode = status.getStatusCode();
        if (statusCode == 17011 || statusCode == 17021 || statusCode == 17005) {
            this.f104517a.signOut();
        }
    }
}
