package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;

/* JADX INFO: loaded from: classes5.dex */
public class ly4 {

    /* JADX INFO: renamed from: a */
    @efb
    public static final String f59196a = "password";

    /* JADX INFO: renamed from: b */
    @efb
    public static final String f59197b = "emailLink";

    /* JADX INFO: renamed from: c */
    @efb
    public static final String f59198c = "password";

    private ly4() {
    }

    @efb
    public static AuthCredential getCredential(@efb String str, @efb String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return new EmailAuthCredential(str, str2);
    }

    @efb
    public static AuthCredential getCredentialWithLink(@efb String str, @efb String str2) {
        if (EmailAuthCredential.zza(str2)) {
            return new EmailAuthCredential(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}
