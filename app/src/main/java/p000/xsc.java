package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.PhoneAuthCredential;

/* JADX INFO: loaded from: classes5.dex */
public class xsc extends k2b {

    /* JADX INFO: renamed from: a */
    public final PhoneAuthCredential f99145a;

    public xsc(@efb PhoneAuthCredential phoneAuthCredential) {
        Preconditions.checkNotNull(phoneAuthCredential);
        this.f99145a = phoneAuthCredential;
    }

    @Override // p000.k2b
    @efb
    public String getFactorId() {
        return "phone";
    }

    @efb
    public final PhoneAuthCredential zza() {
        return this.f99145a;
    }
}
