package p000;

import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;

/* JADX INFO: loaded from: classes5.dex */
public class fo5 {

    /* JADX INFO: renamed from: a */
    @efb
    public static final String f37217a = "facebook.com";

    /* JADX INFO: renamed from: b */
    @efb
    public static final String f37218b = "facebook.com";

    private fo5() {
    }

    @efb
    public static AuthCredential getCredential(@efb String str) {
        return new FacebookAuthCredential(str);
    }
}
