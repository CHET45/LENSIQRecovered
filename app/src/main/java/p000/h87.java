package p000;

import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;

/* JADX INFO: loaded from: classes5.dex */
public class h87 {

    /* JADX INFO: renamed from: a */
    @efb
    public static final String f42903a = "google.com";

    /* JADX INFO: renamed from: b */
    @efb
    public static final String f42904b = "google.com";

    private h87() {
    }

    @efb
    public static AuthCredential getCredential(@hib String str, @hib String str2) {
        return new GoogleAuthCredential(str, str2);
    }
}
