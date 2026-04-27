package p000;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface ow2 {

    /* JADX INFO: renamed from: a */
    public static final String f68997a = "custom_";

    /* JADX INFO: renamed from: b */
    public static final String f68998b = "exo_redir";

    /* JADX INFO: renamed from: c */
    public static final String f68999c = "exo_len";

    static long getContentLength(ow2 ow2Var) {
        return ow2Var.get("exo_len", -1L);
    }

    @hib
    static Uri getRedirectedUri(ow2 ow2Var) {
        String str = ow2Var.get("exo_redir", (String) null);
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
