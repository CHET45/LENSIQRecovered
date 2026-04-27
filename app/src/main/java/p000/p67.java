package p000;

import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.GithubAuthCredential;

/* JADX INFO: loaded from: classes5.dex */
public class p67 {

    /* JADX INFO: renamed from: a */
    @efb
    public static final String f69841a = "github.com";

    /* JADX INFO: renamed from: b */
    @efb
    public static final String f69842b = "github.com";

    private p67() {
    }

    @efb
    public static AuthCredential getCredential(@efb String str) {
        return new GithubAuthCredential(str);
    }
}
