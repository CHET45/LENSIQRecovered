package p000;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ocg extends djf {

    /* JADX INFO: renamed from: A */
    public static final String f67237A = "{\\an3}";

    /* JADX INFO: renamed from: B */
    public static final String f67238B = "{\\an4}";

    /* JADX INFO: renamed from: C */
    public static final String f67239C = "{\\an5}";

    /* JADX INFO: renamed from: D */
    public static final String f67240D = "{\\an6}";

    /* JADX INFO: renamed from: E */
    public static final String f67241E = "{\\an7}";

    /* JADX INFO: renamed from: F */
    public static final String f67242F = "{\\an8}";

    /* JADX INFO: renamed from: G */
    public static final String f67243G = "{\\an9}";

    /* JADX INFO: renamed from: q */
    public static final float f67244q = 0.08f;

    /* JADX INFO: renamed from: r */
    public static final float f67245r = 0.92f;

    /* JADX INFO: renamed from: s */
    public static final float f67246s = 0.5f;

    /* JADX INFO: renamed from: t */
    public static final String f67247t = "SubripDecoder";

    /* JADX INFO: renamed from: u */
    public static final String f67248u = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";

    /* JADX INFO: renamed from: v */
    public static final Pattern f67249v = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: w */
    public static final Pattern f67250w = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: x */
    public static final String f67251x = "\\{\\\\an[1-9]\\}";

    /* JADX INFO: renamed from: y */
    public static final String f67252y = "{\\an1}";

    /* JADX INFO: renamed from: z */
    public static final String f67253z = "{\\an2}";

    /* JADX INFO: renamed from: o */
    public final StringBuilder f67254o;

    /* JADX INFO: renamed from: p */
    public final ArrayList<String> f67255p;

    public ocg() {
        super(f67247t);
        this.f67254o = new StringBuilder();
        this.f67255p = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000.o93 buildCue(android.text.Spanned r17, @p000.hib java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ocg.buildCue(android.text.Spanned, java.lang.String):o93");
    }

    private Charset detectUtfCharset(ihc ihcVar) {
        Charset utfCharsetFromBom = ihcVar.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : yw1.f103176c;
    }

    /* JADX INFO: renamed from: n */
    public static float m18579n(int i) {
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
        long j = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) u80.checkNotNull(matcher.group(i + 2))) * 60000) + (Long.parseLong((String) u80.checkNotNull(matcher.group(i + 3))) * 1000);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    private String processLine(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = f67250w.matcher(strTrim);
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

    @Override // p000.djf
    /* JADX INFO: renamed from: l */
    public xdg mo9213l(byte[] bArr, int i, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        ok9 ok9Var = new ok9();
        ihc ihcVar = new ihc(bArr, i);
        Charset charsetDetectUtfCharset = detectUtfCharset(ihcVar);
        while (true) {
            String line = ihcVar.readLine(charsetDetectUtfCharset);
            int i2 = 0;
            if (line == null) {
                break;
            }
            if (line.length() != 0) {
                try {
                    Integer.parseInt(line);
                    String line2 = ihcVar.readLine(charsetDetectUtfCharset);
                    if (line2 == null) {
                        yh9.m25919w(f67247t, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f67249v.matcher(line2);
                    if (matcher.matches()) {
                        ok9Var.add(parseTimecode(matcher, 1));
                        ok9Var.add(parseTimecode(matcher, 6));
                        this.f67254o.setLength(0);
                        this.f67255p.clear();
                        for (String line3 = ihcVar.readLine(charsetDetectUtfCharset); !TextUtils.isEmpty(line3); line3 = ihcVar.readLine(charsetDetectUtfCharset)) {
                            if (this.f67254o.length() > 0) {
                                this.f67254o.append("<br>");
                            }
                            this.f67254o.append(processLine(line3, this.f67255p));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f67254o.toString());
                        while (true) {
                            if (i2 >= this.f67255p.size()) {
                                str = null;
                                break;
                            }
                            str = this.f67255p.get(i2);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(buildCue(spannedFromHtml, str));
                        arrayList.add(o93.f66835M1);
                    } else {
                        yh9.m25919w(f67247t, "Skipping invalid timing: " + line2);
                    }
                } catch (NumberFormatException unused) {
                    yh9.m25919w(f67247t, "Skipping invalid index: " + line);
                }
            }
        }
        return new qcg((o93[]) arrayList.toArray(new o93[0]), ok9Var.toArray());
    }
}
