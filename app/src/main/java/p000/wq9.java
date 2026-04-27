package p000;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wq9 {

    /* JADX INFO: renamed from: b */
    public static final String f95147b = "mailto:";

    /* JADX INFO: renamed from: c */
    public static final String f95148c = "mailto";

    /* JADX INFO: renamed from: d */
    public static final String f95149d = "to";

    /* JADX INFO: renamed from: e */
    public static final String f95150e = "body";

    /* JADX INFO: renamed from: f */
    public static final String f95151f = "cc";

    /* JADX INFO: renamed from: g */
    public static final String f95152g = "bcc";

    /* JADX INFO: renamed from: h */
    public static final String f95153h = "subject";

    /* JADX INFO: renamed from: a */
    public HashMap<String, String> f95154a = new HashMap<>();

    private wq9() {
    }

    public static boolean isMailTo(@hib String str) {
        return str != null && str.startsWith(f95147b);
    }

    @efb
    public static wq9 parse(@efb String str) throws phc {
        String strDecode;
        String strSubstring;
        z7d.checkNotNull(str);
        if (!isMailTo(str)) {
            throw new phc("Not a mailto scheme");
        }
        int iIndexOf = str.indexOf(35);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf(63);
        if (iIndexOf2 == -1) {
            strDecode = Uri.decode(str.substring(7));
            strSubstring = null;
        } else {
            strDecode = Uri.decode(str.substring(7, iIndexOf2));
            strSubstring = str.substring(iIndexOf2 + 1);
        }
        wq9 wq9Var = new wq9();
        if (strSubstring != null) {
            for (String str2 : strSubstring.split("&")) {
                String[] strArrSplit = str2.split("=", 2);
                if (strArrSplit.length != 0) {
                    wq9Var.f95154a.put(Uri.decode(strArrSplit[0]).toLowerCase(Locale.ROOT), strArrSplit.length > 1 ? Uri.decode(strArrSplit[1]) : null);
                }
            }
        }
        String to = wq9Var.getTo();
        if (to != null) {
            strDecode = strDecode + ", " + to;
        }
        wq9Var.f95154a.put("to", strDecode);
        return wq9Var;
    }

    @hib
    public String getBcc() {
        return this.f95154a.get(f95152g);
    }

    @hib
    public String getBody() {
        return this.f95154a.get("body");
    }

    @hib
    public String getCc() {
        return this.f95154a.get(f95151f);
    }

    @hib
    public Map<String, String> getHeaders() {
        return this.f95154a;
    }

    @hib
    public String getSubject() {
        return this.f95154a.get(f95153h);
    }

    @hib
    public String getTo() {
        return this.f95154a.get("to");
    }

    @efb
    public String toString() {
        StringBuilder sb = new StringBuilder(f95147b);
        sb.append('?');
        for (Map.Entry<String, String> entry : this.f95154a.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode(entry.getValue()));
            sb.append('&');
        }
        return sb.toString();
    }

    public static boolean isMailTo(@hib Uri uri) {
        return uri != null && f95148c.equals(uri.getScheme());
    }

    @efb
    public static wq9 parse(@efb Uri uri) throws phc {
        return parse(uri.toString());
    }
}
