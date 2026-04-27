package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.PhoneAuthCredential;

/* JADX INFO: loaded from: classes5.dex */
public class ysc {

    /* JADX INFO: renamed from: a */
    @efb
    public static final String f102907a = "phone";

    @efb
    public static xsc getAssertion(@efb PhoneAuthCredential phoneAuthCredential) {
        Preconditions.checkNotNull(phoneAuthCredential);
        return new xsc(phoneAuthCredential);
    }
}
