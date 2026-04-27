package p000;

import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;

/* JADX INFO: loaded from: classes5.dex */
public class iyc {

    /* JADX INFO: renamed from: a */
    @efb
    public static final String f48911a = "playgames.google.com";

    /* JADX INFO: renamed from: b */
    @efb
    public static final String f48912b = "playgames.google.com";

    private iyc() {
    }

    @efb
    public static AuthCredential getCredential(@efb String str) {
        return new PlayGamesAuthCredential(str);
    }
}
