package p000;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class pcg implements peg {

    /* JADX INFO: renamed from: d */
    public static final int f70369d = 1;

    /* JADX INFO: renamed from: e */
    public static final float f70370e = 0.08f;

    /* JADX INFO: renamed from: f */
    public static final float f70371f = 0.92f;

    /* JADX INFO: renamed from: g */
    public static final float f70372g = 0.5f;

    /* JADX INFO: renamed from: h */
    public static final String f70373h = "SubripParser";

    /* JADX INFO: renamed from: i */
    public static final String f70374i = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?";

    /* JADX INFO: renamed from: j */
    public static final Pattern f70375j = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: k */
    public static final Pattern f70376k = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: l */
    public static final String f70377l = "\\{\\\\an[1-9]\\}";

    /* JADX INFO: renamed from: m */
    public static final String f70378m = "{\\an1}";

    /* JADX INFO: renamed from: n */
    public static final String f70379n = "{\\an2}";

    /* JADX INFO: renamed from: o */
    public static final String f70380o = "{\\an3}";

    /* JADX INFO: renamed from: p */
    public static final String f70381p = "{\\an4}";

    /* JADX INFO: renamed from: q */
    public static final String f70382q = "{\\an5}";

    /* JADX INFO: renamed from: r */
    public static final String f70383r = "{\\an6}";

    /* JADX INFO: renamed from: s */
    public static final String f70384s = "{\\an7}";

    /* JADX INFO: renamed from: t */
    public static final String f70385t = "{\\an8}";

    /* JADX INFO: renamed from: u */
    public static final String f70386u = "{\\an9}";

    /* JADX INFO: renamed from: a */
    public final StringBuilder f70387a = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public final ArrayList<String> f70388b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final jhc f70389c = new jhc();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000.n93 buildCue(android.text.Spanned r17, @p000.hib java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pcg.buildCue(android.text.Spanned, java.lang.String):n93");
    }

    private Charset detectUtfCharset(jhc jhcVar) {
        Charset utfCharsetFromBom = jhcVar.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : StandardCharsets.UTF_8;
    }

    @fdi(otherwise = 2)
    public static float getFractionalPositionForAnchorType(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long parseTimecode(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) v80.checkNotNull(matcher.group(i + 2))) * 60000) + (Long.parseLong((String) v80.checkNotNull(matcher.group(i + 3))) * 1000);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    private String processLine(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = f70376k.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i += length;
        }
        return sb.toString();
    }

    @Override // p000.peg
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // p000.peg
    public void parse(byte[] bArr, int i, int i2, peg.C10937b c10937b, qu2<ba3> qu2Var) {
        String str;
        qu2<ba3> qu2Var2;
        String line;
        String str2;
        String str3;
        qu2<ba3> qu2Var3;
        qu2<ba3> qu2Var4 = qu2Var;
        String str4 = f70373h;
        this.f70389c.reset(bArr, i + i2);
        this.f70389c.setPosition(i);
        Charset charsetDetectUtfCharset = detectUtfCharset(this.f70389c);
        ArrayList arrayList = (c10937b.f70577a == -9223372036854775807L || !c10937b.f70578b) ? null : new ArrayList();
        while (true) {
            String line2 = this.f70389c.readLine(charsetDetectUtfCharset);
            if (line2 == null) {
                break;
            }
            if (!line2.isEmpty()) {
                try {
                    Integer.parseInt(line2);
                    line = this.f70389c.readLine(charsetDetectUtfCharset);
                } catch (NumberFormatException unused) {
                    str = str4;
                    qu2Var2 = qu2Var4;
                    xh9.m25148w(str, "Skipping invalid index: " + line2);
                }
                if (line == null) {
                    xh9.m25148w(str4, "Unexpected end");
                    break;
                }
                Matcher matcher = f70375j.matcher(line);
                if (matcher.matches()) {
                    long timecode = parseTimecode(matcher, 1);
                    long timecode2 = parseTimecode(matcher, 6);
                    int i3 = 0;
                    this.f70387a.setLength(0);
                    this.f70388b.clear();
                    String line3 = this.f70389c.readLine(charsetDetectUtfCharset);
                    while (!TextUtils.isEmpty(line3)) {
                        if (this.f70387a.length() > 0) {
                            this.f70387a.append("<br>");
                        }
                        this.f70387a.append(processLine(line3, this.f70388b));
                        line3 = this.f70389c.readLine(charsetDetectUtfCharset);
                    }
                    Spanned spannedFromHtml = Html.fromHtml(this.f70387a.toString());
                    while (true) {
                        if (i3 >= this.f70388b.size()) {
                            str2 = str4;
                            str3 = null;
                            break;
                        } else {
                            str3 = this.f70388b.get(i3);
                            if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                str2 = str4;
                                break;
                            }
                            i3++;
                        }
                    }
                    long j = c10937b.f70577a;
                    if (j == -9223372036854775807L || timecode2 >= j) {
                        qu2Var3 = qu2Var;
                        qu2Var3.accept(new ba3(kx7.m15111of(buildCue(spannedFromHtml, str3)), timecode, timecode2 - timecode));
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new ba3(kx7.m15111of(buildCue(spannedFromHtml, str3)), timecode, timecode2 - timecode));
                        }
                        qu2Var3 = qu2Var;
                    }
                    qu2Var4 = qu2Var3;
                    str4 = str2;
                } else {
                    String str5 = str4;
                    qu2Var2 = qu2Var4;
                    str = str5;
                    xh9.m25148w(str, "Skipping invalid timing: " + line);
                    qu2Var4 = qu2Var2;
                    str4 = str;
                }
            }
        }
        qu2<ba3> qu2Var5 = qu2Var4;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                qu2Var5.accept((ba3) it.next());
            }
        }
    }
}
