package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.internal.zzaf;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class f5j extends j2b {

    /* JADX INFO: renamed from: a */
    public final zzaf f35389a;

    public f5j(zzaf zzafVar) {
        Preconditions.checkNotNull(zzafVar);
        this.f35389a = zzafVar;
    }

    @Override // p000.j2b
    public final Task<Void> enroll(k2b k2bVar, @hib String str) {
        Preconditions.checkNotNull(k2bVar);
        zzaf zzafVar = this.f35389a;
        return FirebaseAuth.getInstance(zzafVar.zza()).zza(zzafVar, k2bVar, str);
    }

    @Override // p000.j2b
    public final List<MultiFactorInfo> getEnrolledFactors() {
        return this.f35389a.zzi();
    }

    @Override // p000.j2b
    public final Task<MultiFactorSession> getSession() {
        return this.f35389a.getIdToken(false).continueWithTask(new d5j(this));
    }

    @Override // p000.j2b
    public final Task<Void> unenroll(MultiFactorInfo multiFactorInfo) {
        Preconditions.checkNotNull(multiFactorInfo);
        return unenroll(multiFactorInfo.getUid());
    }

    @Override // p000.j2b
    public final Task<Void> unenroll(String str) {
        Preconditions.checkNotEmpty(str);
        zzaf zzafVar = this.f35389a;
        return FirebaseAuth.getInstance(zzafVar.zza()).zza(zzafVar, str);
    }
}
