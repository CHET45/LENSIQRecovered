package p000;

import android.text.TextUtils;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class wo7 {

    /* JADX INFO: renamed from: a */
    public static final String f94933a = "HttpUtil";

    /* JADX INFO: renamed from: b */
    public static final Pattern f94934b = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: c */
    public static final Pattern f94935c = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private wo7() {
    }

    @hib
    public static String buildRangeRequestHeader(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    public static long getContentLength(@hib String str, @hib String str2) {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                xh9.m25144e("HttpUtil", "Unexpected Content-Length [" + str + "]");
                j = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f94934b.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong((String) v80.checkNotNull(matcher.group(2))) - Long.parseLong((String) v80.checkNotNull(matcher.group(1)))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            xh9.m25148w("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            xh9.m25144e("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j;
        }
    }

    public static String getCookieHeader(String str, Map<String, List<String>> map, @hib CookieHandler cookieHandler) {
        List<String> list;
        if (cookieHandler == null) {
            return "";
        }
        Map<String, List<String>> mapM19076of = ox7.m19076of();
        try {
            mapM19076of = cookieHandler.get(new URI(str), map);
        } catch (Exception e) {
            xh9.m25149w("HttpUtil", "Failed to read cookies from CookieHandler", e);
        }
        StringBuilder sb = new StringBuilder();
        if (mapM19076of.containsKey(go7.f40565p) && (list = mapM19076of.get(go7.f40565p)) != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append("; ");
            }
        }
        return uo7.m23491a(sb.toString());
    }

    public static long getDocumentSize(@hib String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f94935c.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) v80.checkNotNull(matcher.group(1)));
        }
        return -1L;
    }

    public static void storeCookiesFromHeaders(String str, Map<String, List<String>> map, @hib CookieHandler cookieHandler) {
        if (cookieHandler == null) {
            return;
        }
        try {
            cookieHandler.put(new URI(str), map);
        } catch (Exception e) {
            xh9.m25149w("HttpUtil", "Failed to store cookies in CookieHandler", e);
        }
    }
}
