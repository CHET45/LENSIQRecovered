package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.internal.zzam;

/* JADX INFO: loaded from: classes5.dex */
public final class j5h {

    /* JADX INFO: renamed from: a */
    @efb
    public static final String f49585a = "totp";

    private j5h() {
    }

    @efb
    public static Task<k5h> generateSecret(@efb MultiFactorSession multiFactorSession) {
        Preconditions.checkNotNull(multiFactorSession);
        zzam zzamVar = (zzam) multiFactorSession;
        return FirebaseAuth.getInstance(zzamVar.zza().zza()).zza(zzamVar);
    }

    @efb
    public static i5h getAssertionForEnrollment(@efb k5h k5hVar, @efb String str) {
        return new i5h((String) Preconditions.checkNotNull(str), (k5h) Preconditions.checkNotNull(k5hVar), null);
    }

    @efb
    public static i5h getAssertionForSignIn(@efb String str, @efb String str2) {
        return new i5h((String) Preconditions.checkNotNull(str2), null, (String) Preconditions.checkNotNull(str));
    }
}
