package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes7.dex */
public final class r4g {

    /* JADX INFO: renamed from: d */
    public static final int f77027d = 307;

    /* JADX INFO: renamed from: e */
    public static final int f77028e = 308;

    /* JADX INFO: renamed from: f */
    public static final int f77029f = 100;

    /* JADX INFO: renamed from: a */
    public final uhd f77030a;

    /* JADX INFO: renamed from: b */
    public final int f77031b;

    /* JADX INFO: renamed from: c */
    public final String f77032c;

    public r4g(uhd uhdVar, int i, String str) {
        this.f77030a = uhdVar;
        this.f77031b = i;
        this.f77032c = str;
    }

    public static r4g parse(String str) throws IOException {
        uhd uhdVar;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                uhdVar = uhd.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                uhdVar = uhd.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            uhdVar = uhd.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i + 4);
            }
            return new r4g(uhdVar, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f77030a == uhd.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f77031b);
        if (this.f77032c != null) {
            sb.append(' ');
            sb.append(this.f77032c);
        }
        return sb.toString();
    }
}
