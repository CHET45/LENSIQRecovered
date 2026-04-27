package p000;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class vo7 {

    /* JADX INFO: renamed from: a */
    public static final String f91836a = "HttpUtil";

    /* JADX INFO: renamed from: b */
    public static final Pattern f91837b = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: c */
    public static final Pattern f91838c = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private vo7() {
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
                yh9.m25915e("HttpUtil", "Unexpected Content-Length [" + str + "]");
                j = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f91837b.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong((String) u80.checkNotNull(matcher.group(2))) - Long.parseLong((String) u80.checkNotNull(matcher.group(1)))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            yh9.m25919w("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            yh9.m25915e("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j;
        }
    }

    public static long getDocumentSize(@hib String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f91838c.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) u80.checkNotNull(matcher.group(1)));
        }
        return -1L;
    }
}
