package p000;

import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;

/* JADX INFO: loaded from: classes5.dex */
public class zkh {

    /* JADX INFO: renamed from: a */
    @efb
    public static final String f105360a = "twitter.com";

    /* JADX INFO: renamed from: b */
    @efb
    public static final String f105361b = "twitter.com";

    private zkh() {
    }

    @efb
    public static AuthCredential getCredential(@efb String str, @efb String str2) {
        return new TwitterAuthCredential(str, str2);
    }
}
