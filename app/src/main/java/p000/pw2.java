package p000;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface pw2 {

    /* JADX INFO: renamed from: a */
    public static final String f72252a = "custom_";

    /* JADX INFO: renamed from: b */
    public static final String f72253b = "exo_redir";

    /* JADX INFO: renamed from: c */
    public static final String f72254c = "exo_len";

    static long getContentLength(pw2 pw2Var) {
        return pw2Var.get("exo_len", -1L);
    }

    @hib
    static Uri getRedirectedUri(pw2 pw2Var) {
        String str = pw2Var.get("exo_redir", (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    boolean contains(String str);

    long get(String str, long j);

    @hib
    String get(String str, @hib String str2);

    @hib
    byte[] get(String str, @hib byte[] bArr);
}
