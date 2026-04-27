package p000;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.a0g;
import p000.o93;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class vzf extends djf {

    /* JADX INFO: renamed from: t */
    public static final String f93019t = "SsaDecoder";

    /* JADX INFO: renamed from: u */
    public static final Pattern f93020u = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: v */
    public static final String f93021v = "Format:";

    /* JADX INFO: renamed from: w */
    public static final String f93022w = "Style:";

    /* JADX INFO: renamed from: x */
    public static final String f93023x = "Dialogue:";

    /* JADX INFO: renamed from: y */
    public static final float f93024y = 0.05f;

    /* JADX INFO: renamed from: o */
    public final boolean f93025o;

    /* JADX INFO: renamed from: p */
    @hib
    public final wzf f93026p;

    /* JADX INFO: renamed from: q */
    public Map<String, a0g> f93027q;

    /* JADX INFO: renamed from: r */
    public float f93028r;

    /* JADX INFO: renamed from: s */
    public float f93029s;

    public vzf() {
        this(null);
    }

    private static int addCuePlacerholderByTime(long j, List<Long> list, List<List<o93>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }

    private static float computeDefaultLineOrPosition(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static o93 createCue(String str, @hib a0g a0gVar, a0g.C0004b c0004b, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        o93.C10261c text = new o93.C10261c().setText(spannableString);
        if (a0gVar != null) {
            if (a0gVar.f59c != null) {
                spannableString.setSpan(new ForegroundColorSpan(a0gVar.f59c.intValue()), 0, spannableString.length(), 33);
            }
            if (a0gVar.f66j == 3 && a0gVar.f60d != null) {
                spannableString.setSpan(new BackgroundColorSpan(a0gVar.f60d.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = a0gVar.f61e;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                text.setTextSize(f3 / f2, 1);
            }
            boolean z = a0gVar.f62f;
            if (z && a0gVar.f63g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (a0gVar.f63g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (a0gVar.f64h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (a0gVar.f65i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = c0004b.f84a;
        if (i == -1) {
            i = a0gVar != null ? a0gVar.f58b : -1;
        }
        text.setTextAlignment(toTextAlignment(i)).setPositionAnchor(toPositionAnchor(i)).setLineAnchor(toLineAnchor(i));
        PointF pointF = c0004b.f85b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            text.setPosition(computeDefaultLineOrPosition(text.getPositionAnchor()));
            text.setLine(computeDefaultLineOrPosition(text.getLineAnchor()), 0);
        } else {
            text.setPosition(pointF.x / f);
            text.setLine(c0004b.f85b.y / f2, 0);
        }
        return text.build();
    }

    private Charset detectUtfCharset(ihc ihcVar) {
        Charset utfCharsetFromBom = ihcVar.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : yw1.f103176c;
    }

    private void parseDialogueLine(String str, wzf wzfVar, List<List<o93>> list, List<Long> list2) {
        int i;
        u80.checkArgument(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", wzfVar.f95875e);
        if (strArrSplit.length != wzfVar.f95875e) {
            yh9.m25919w(f93019t, "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long timecodeUs = parseTimecodeUs(strArrSplit[wzfVar.f95871a]);
        if (timecodeUs == -9223372036854775807L) {
            yh9.m25919w(f93019t, "Skipping invalid timing: " + str);
            return;
        }
        long timecodeUs2 = parseTimecodeUs(strArrSplit[wzfVar.f95872b]);
        if (timecodeUs2 == -9223372036854775807L) {
            yh9.m25919w(f93019t, "Skipping invalid timing: " + str);
            return;
        }
        Map<String, a0g> map = this.f93027q;
        a0g a0gVar = (map == null || (i = wzfVar.f95873c) == -1) ? null : map.get(strArrSplit[i].trim());
        String str2 = strArrSplit[wzfVar.f95874d];
        o93 o93VarCreateCue = createCue(a0g.C0004b.stripStyleOverrides(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", fm7.f37105b), a0gVar, a0g.C0004b.parseFromDialogue(str2), this.f93028r, this.f93029s);
        int iAddCuePlacerholderByTime = addCuePlacerholderByTime(timecodeUs2, list2, list);
        for (int iAddCuePlacerholderByTime2 = addCuePlacerholderByTime(timecodeUs, list2, list); iAddCuePlacerholderByTime2 < iAddCuePlacerholderByTime; iAddCuePlacerholderByTime2++) {
            list.get(iAddCuePlacerholderByTime2).add(o93VarCreateCue);
        }
    }

    private void parseEventBody(ihc ihcVar, List<List<o93>> list, List<Long> list2, Charset charset) {
        wzf wzfVarFromFormatLine = this.f93025o ? this.f93026p : null;
        while (true) {
            String line = ihcVar.readLine(charset);
            if (line == null) {
                return;
            }
            if (line.startsWith("Format:")) {
                wzfVarFromFormatLine = wzf.fromFormatLine(line);
            } else if (line.startsWith("Dialogue:")) {
                if (wzfVarFromFormatLine == null) {
                    yh9.m25919w(f93019t, "Skipping dialogue line before complete format: " + line);
                } else {
                    parseDialogueLine(line, wzfVarFromFormatLine, list, list2);
                }
            }
        }
    }

    private void parseHeader(ihc ihcVar, Charset charset) {
        while (true) {
            String line = ihcVar.readLine(charset);
            if (line == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(line)) {
                parseScriptInfo(ihcVar, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(line)) {
                this.f93027q = parseStyles(ihcVar, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(line)) {
                yh9.m25917i(f93019t, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(line)) {
                return;
            }
        }
    }

    private void parseScriptInfo(ihc ihcVar, Charset charset) {
        while (true) {
            String line = ihcVar.readLine(charset);
            if (line == null) {
                return;
            }
            if (ihcVar.bytesLeft() != 0 && ihcVar.peekChar(charset) == '[') {
                return;
            }
            String[] strArrSplit = line.split(g1i.f38277c);
            if (strArrSplit.length == 2) {
                String lowerCase = i80.toLowerCase(strArrSplit[0].trim());
                lowerCase.hashCode();
                if (lowerCase.equals("playresx")) {
                    this.f93028r = Float.parseFloat(strArrSplit[1].trim());
                } else if (lowerCase.equals("playresy")) {
                    try {
                        this.f93029s = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, a0g> parseStyles(ihc ihcVar, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a0g.C0003a c0003aFromFormatLine = null;
        while (true) {
            String line = ihcVar.readLine(charset);
            if (line == null || (ihcVar.bytesLeft() != 0 && ihcVar.peekChar(charset) == '[')) {
                break;
            }
            if (line.startsWith("Format:")) {
                c0003aFromFormatLine = a0g.C0003a.fromFormatLine(line);
            } else if (line.startsWith("Style:")) {
                if (c0003aFromFormatLine == null) {
                    yh9.m25919w(f93019t, "Skipping 'Style:' line before 'Format:' line: " + line);
                } else {
                    a0g a0gVarFromStyleLine = a0g.fromStyleLine(line, c0003aFromFormatLine);
                    if (a0gVarFromStyleLine != null) {
                        linkedHashMap.put(a0gVarFromStyleLine.f57a, a0gVarFromStyleLine);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long parseTimecodeUs(String str) {
        Matcher matcher = f93020u.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) x0i.castNonNull(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) x0i.castNonNull(matcher.group(2))) * 60000000) + (Long.parseLong((String) x0i.castNonNull(matcher.group(3))) * 1000000) + (Long.parseLong((String) x0i.castNonNull(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int toLineAnchor(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                yh9.m25919w(f93019t, "Unknown alignment: " + i);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int toPositionAnchor(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                yh9.m25919w(f93019t, "Unknown alignment: " + i);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    @hib
    private static Layout.Alignment toTextAlignment(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                yh9.m25919w(f93019t, "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // p000.djf
    /* JADX INFO: renamed from: l */
    public xdg mo9213l(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ihc ihcVar = new ihc(bArr, i);
        Charset charsetDetectUtfCharset = detectUtfCharset(ihcVar);
        if (!this.f93025o) {
            parseHeader(ihcVar, charsetDetectUtfCharset);
        }
        parseEventBody(ihcVar, arrayList, arrayList2, charsetDetectUtfCharset);
        return new b0g(arrayList, arrayList2);
    }

    public vzf(@hib List<byte[]> list) {
        super(f93019t);
        this.f93028r = -3.4028235E38f;
        this.f93029s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f93025o = false;
            this.f93026p = null;
            return;
        }
        this.f93025o = true;
        String strFromUtf8Bytes = x0i.fromUtf8Bytes(list.get(0));
        u80.checkArgument(strFromUtf8Bytes.startsWith("Format:"));
        this.f93026p = (wzf) u80.checkNotNull(wzf.fromFormatLine(strFromUtf8Bytes));
        parseHeader(new ihc(list.get(1)), yw1.f103176c);
    }
}
