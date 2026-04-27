package p000;

import java.io.IOException;
import java.net.ProtocolException;
import p000.zk4;

/* JADX INFO: loaded from: classes6.dex */
public class ivd {

    /* JADX INFO: renamed from: a */
    public static final int f48606a = 10;

    /* JADX INFO: renamed from: b */
    public static final int f48607b = 307;

    /* JADX INFO: renamed from: c */
    public static final int f48608c = 308;

    @efb
    public static String getRedirectedUrl(zk4.InterfaceC16164a interfaceC16164a, int i) throws IOException {
        String responseHeaderField = interfaceC16164a.getResponseHeaderField("Location");
        if (responseHeaderField != null) {
            return responseHeaderField;
        }
        throw new ProtocolException("Response code is " + i + " but can't find Location field");
    }

    public static boolean isRedirect(int i) {
        return i == 301 || i == 302 || i == 303 || i == 300 || i == 307 || i == 308;
    }
}
