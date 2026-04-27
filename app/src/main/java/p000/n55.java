package p000;

import com.blankj.utilcode.util.C2473f;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class n55 {

    /* JADX INFO: renamed from: a */
    public static final String f63330a = "[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]";

    /* JADX INFO: renamed from: b */
    public static final String f63331b = "&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});";

    /* JADX INFO: renamed from: c */
    public static final Pattern f63332c = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f63333d = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: e */
    public static final Pattern f63334e = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");

    /* JADX INFO: renamed from: f */
    public static final char[] f63335f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', sjc.f82030t, 'B', sjc.f82022l, 'D', 'E', 'F'};

    /* JADX INFO: renamed from: g */
    public static final Pattern f63336g = Pattern.compile("[ \t\r\n]+");

    /* JADX INFO: renamed from: h */
    public static final InterfaceC9703c f63337h = new C9701a();

    /* JADX INFO: renamed from: i */
    public static final InterfaceC9703c f63338i = new C9702b();

    /* JADX INFO: renamed from: n55$a */
    public static class C9701a implements InterfaceC9703c {
        @Override // p000.n55.InterfaceC9703c
        public void replace(String str, StringBuilder sb) {
            if (str.charAt(0) == '\\') {
                sb.append((CharSequence) str, 1, str.length());
            } else {
                sb.append(bm7.entityToString(str));
            }
        }
    }

    /* JADX INFO: renamed from: n55$b */
    public static class C9702b implements InterfaceC9703c {
        @Override // p000.n55.InterfaceC9703c
        public void replace(String str, StringBuilder sb) {
            if (str.startsWith(yv7.f103133a)) {
                if (str.length() == 3) {
                    sb.append(str);
                    return;
                } else {
                    sb.append("%25");
                    sb.append((CharSequence) str, 1, str.length());
                    return;
                }
            }
            for (byte b : str.getBytes(Charset.forName("UTF-8"))) {
                sb.append('%');
                sb.append(n55.f63335f[(b >> 4) & 15]);
                sb.append(n55.f63335f[b & 15]);
            }
        }
    }

    /* JADX INFO: renamed from: n55$c */
    public interface InterfaceC9703c {
        void replace(String str, StringBuilder sb);
    }

    public static String escapeHtml(String str) {
        String str2;
        StringBuilder sb = null;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"') {
                str2 = "&quot;";
            } else if (cCharAt == '&') {
                str2 = "&amp;";
            } else if (cCharAt == '<') {
                str2 = "&lt;";
            } else if (cCharAt != '>') {
                if (sb != null) {
                    sb.append(cCharAt);
                }
            } else {
                str2 = "&gt;";
            }
            if (sb == null) {
                sb = new StringBuilder();
                sb.append((CharSequence) str, 0, i);
            }
            sb.append(str2);
        }
        return sb != null ? sb.toString() : str;
    }

    public static String normalizeLabelContent(String str) {
        return f63336g.matcher(str.trim().toLowerCase(Locale.ROOT)).replaceAll(C2473f.f17566z);
    }

    public static String normalizeReference(String str) {
        return normalizeLabelContent(str.substring(1, str.length() - 1));
    }

    public static String percentEncodeUrl(String str) {
        return replaceAll(f63334e, str, f63338i);
    }

    private static String replaceAll(Pattern pattern, String str, InterfaceC9703c interfaceC9703c) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb.append((CharSequence) str, iEnd, matcher.start());
            interfaceC9703c.replace(matcher.group(), sb);
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb.append((CharSequence) str, iEnd, str.length());
        }
        return sb.toString();
    }

    public static String unescapeString(String str) {
        return f63332c.matcher(str).find() ? replaceAll(f63333d, str, f63337h) : str;
    }
}
