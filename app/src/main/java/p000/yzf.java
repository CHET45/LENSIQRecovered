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
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.n93;
import p000.peg;
import p000.zzf;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class yzf implements peg {

    /* JADX INFO: renamed from: g */
    public static final int f103554g = 1;

    /* JADX INFO: renamed from: h */
    public static final String f103555h = "SsaParser";

    /* JADX INFO: renamed from: i */
    public static final Pattern f103556i = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: j */
    public static final String f103557j = "Format:";

    /* JADX INFO: renamed from: k */
    public static final String f103558k = "Style:";

    /* JADX INFO: renamed from: l */
    public static final String f103559l = "Dialogue:";

    /* JADX INFO: renamed from: m */
    public static final float f103560m = 0.05f;

    /* JADX INFO: renamed from: a */
    public final boolean f103561a;

    /* JADX INFO: renamed from: b */
    @hib
    public final xzf f103562b;

    /* JADX INFO: renamed from: c */
    public final jhc f103563c;

    /* JADX INFO: renamed from: d */
    public Map<String, zzf> f103564d;

    /* JADX INFO: renamed from: e */
    public float f103565e;

    /* JADX INFO: renamed from: f */
    public float f103566f;

    public yzf() {
        this(null);
    }

    private static int addCuePlacerholderByTime(long j, List<Long> list, List<List<n93>> list2) {
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

    private static n93 createCue(String str, int i, @hib zzf zzfVar, zzf.C16329b c16329b, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        n93.C9750c zIndex = new n93.C9750c().setText(spannableString).setZIndex(i);
        if (zzfVar != null) {
            if (zzfVar.f106598c != null) {
                spannableString.setSpan(new ForegroundColorSpan(zzfVar.f106598c.intValue()), 0, spannableString.length(), 33);
            }
            if (zzfVar.f106605j == 3 && zzfVar.f106599d != null) {
                spannableString.setSpan(new BackgroundColorSpan(zzfVar.f106599d.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = zzfVar.f106600e;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                zIndex.setTextSize(f3 / f2, 1);
            }
            boolean z = zzfVar.f106601f;
            if (z && zzfVar.f106602g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (zzfVar.f106602g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (zzfVar.f106603h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (zzfVar.f106604i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i2 = c16329b.f106623a;
        if (i2 == -1) {
            i2 = zzfVar != null ? zzfVar.f106597b : -1;
        }
        zIndex.setTextAlignment(toTextAlignment(i2)).setPositionAnchor(toPositionAnchor(i2)).setLineAnchor(toLineAnchor(i2));
        PointF pointF = c16329b.f106624b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            zIndex.setPosition(computeDefaultLineOrPosition(zIndex.getPositionAnchor()));
            zIndex.setLine(computeDefaultLineOrPosition(zIndex.getLineAnchor()), 0);
        } else {
            zIndex.setPosition(pointF.x / f);
            zIndex.setLine(c16329b.f106624b.y / f2, 0);
        }
        return zIndex.build();
    }

    private Charset detectUtfCharset(jhc jhcVar) {
        Charset utfCharsetFromBom = jhcVar.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : StandardCharsets.UTF_8;
    }

    private void parseDialogueLine(String str, xzf xzfVar, List<List<n93>> list, List<Long> list2) {
        int i;
        int i2;
        v80.checkArgument(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", xzfVar.f99806f);
        if (strArrSplit.length != xzfVar.f99806f) {
            xh9.m25148w(f103555h, "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        int i3 = xzfVar.f99801a;
        if (i3 != -1) {
            try {
                i = Integer.parseInt(strArrSplit[i3].trim());
            } catch (RuntimeException unused) {
                xh9.m25148w(f103555h, "Fail to parse layer: " + strArrSplit[xzfVar.f99801a]);
                i = 0;
            }
        } else {
            i = 0;
        }
        int i4 = i;
        long timecodeUs = parseTimecodeUs(strArrSplit[xzfVar.f99802b]);
        if (timecodeUs == -9223372036854775807L) {
            xh9.m25148w(f103555h, "Skipping invalid timing: " + str);
            return;
        }
        long timecodeUs2 = parseTimecodeUs(strArrSplit[xzfVar.f99803c]);
        if (timecodeUs2 == -9223372036854775807L || timecodeUs2 <= timecodeUs) {
            xh9.m25148w(f103555h, "Skipping invalid timing: " + str);
            return;
        }
        Map<String, zzf> map = this.f103564d;
        zzf zzfVar = (map == null || (i2 = xzfVar.f99804d) == -1) ? null : map.get(strArrSplit[i2].trim());
        String str2 = strArrSplit[xzfVar.f99805e];
        n93 n93VarCreateCue = createCue(zzf.C16329b.stripStyleOverrides(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", fm7.f37105b), i4, zzfVar, zzf.C16329b.parseFromDialogue(str2), this.f103565e, this.f103566f);
        int iAddCuePlacerholderByTime = addCuePlacerholderByTime(timecodeUs2, list2, list);
        for (int iAddCuePlacerholderByTime2 = addCuePlacerholderByTime(timecodeUs, list2, list); iAddCuePlacerholderByTime2 < iAddCuePlacerholderByTime; iAddCuePlacerholderByTime2++) {
            list.get(iAddCuePlacerholderByTime2).add(n93VarCreateCue);
        }
    }

    private void parseEventBody(jhc jhcVar, List<List<n93>> list, List<Long> list2, Charset charset) {
        xzf xzfVarFromFormatLine = this.f103561a ? this.f103562b : null;
        while (true) {
            String line = jhcVar.readLine(charset);
            if (line == null) {
                return;
            }
            if (line.startsWith("Format:")) {
                xzfVarFromFormatLine = xzf.fromFormatLine(line);
            } else if (line.startsWith("Dialogue:")) {
                if (xzfVarFromFormatLine == null) {
                    xh9.m25148w(f103555h, "Skipping dialogue line before complete format: " + line);
                } else {
                    parseDialogueLine(line, xzfVarFromFormatLine, list, list2);
                }
            }
        }
    }

    private void parseHeader(jhc jhcVar, Charset charset) {
        while (true) {
            String line = jhcVar.readLine(charset);
            if (line == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(line)) {
                parseScriptInfo(jhcVar, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(line)) {
                this.f103564d = parseStyles(jhcVar, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(line)) {
                xh9.m25146i(f103555h, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(line)) {
                return;
            }
        }
    }

    private void parseScriptInfo(jhc jhcVar, Charset charset) {
        while (true) {
            String line = jhcVar.readLine(charset);
            if (line == null) {
                return;
            }
            if (jhcVar.bytesLeft() != 0 && jhcVar.peekCodePoint(charset) == 91) {
                return;
            }
            String[] strArrSplit = line.split(g1i.f38277c);
            if (strArrSplit.length == 2) {
                String lowerCase = i80.toLowerCase(strArrSplit[0].trim());
                lowerCase.hashCode();
                if (lowerCase.equals("playresx")) {
                    this.f103565e = Float.parseFloat(strArrSplit[1].trim());
                } else if (lowerCase.equals("playresy")) {
                    try {
                        this.f103566f = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, zzf> parseStyles(jhc jhcVar, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzf.C16328a c16328aFromFormatLine = null;
        while (true) {
            String line = jhcVar.readLine(charset);
            if (line == null || (jhcVar.bytesLeft() != 0 && jhcVar.peekCodePoint(charset) == 91)) {
                break;
            }
            if (line.startsWith("Format:")) {
                c16328aFromFormatLine = zzf.C16328a.fromFormatLine(line);
            } else if (line.startsWith("Style:")) {
                if (c16328aFromFormatLine == null) {
                    xh9.m25148w(f103555h, "Skipping 'Style:' line before 'Format:' line: " + line);
                } else {
                    zzf zzfVarFromStyleLine = zzf.fromStyleLine(line, c16328aFromFormatLine);
                    if (zzfVarFromStyleLine != null) {
                        linkedHashMap.put(zzfVarFromStyleLine.f106596a, zzfVarFromStyleLine);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long parseTimecodeUs(String str) {
        Matcher matcher = f103556i.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) t0i.castNonNull(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) t0i.castNonNull(matcher.group(2))) * 60000000) + (Long.parseLong((String) t0i.castNonNull(matcher.group(3))) * 1000000) + (Long.parseLong((String) t0i.castNonNull(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int toLineAnchor(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                xh9.m25148w(f103555h, "Unknown alignment: " + i);
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
                xh9.m25148w(f103555h, "Unknown alignment: " + i);
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
                xh9.m25148w(f103555h, "Unknown alignment: " + i);
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

    @Override // p000.peg
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // p000.peg
    public void parse(byte[] bArr, int i, int i2, peg.C10937b c10937b, qu2<ba3> qu2Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f103563c.reset(bArr, i + i2);
        this.f103563c.setPosition(i);
        Charset charsetDetectUtfCharset = detectUtfCharset(this.f103563c);
        if (!this.f103561a) {
            parseHeader(this.f103563c, charsetDetectUtfCharset);
        }
        parseEventBody(this.f103563c, arrayList, arrayList2, charsetDetectUtfCharset);
        ArrayList arrayList3 = (c10937b.f70577a == -9223372036854775807L || !c10937b.f70578b) ? null : new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            List<n93> list = arrayList.get(i3);
            if (!list.isEmpty() || i3 == 0) {
                if (i3 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = arrayList2.get(i3).longValue();
                long jLongValue2 = arrayList2.get(i3 + 1).longValue();
                ba3 ba3Var = new ba3(list, jLongValue, jLongValue2 - jLongValue);
                long j = c10937b.f70577a;
                if (j == -9223372036854775807L || jLongValue2 >= j) {
                    qu2Var.accept(ba3Var);
                } else if (arrayList3 != null) {
                    arrayList3.add(ba3Var);
                }
            }
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                qu2Var.accept((ba3) it.next());
            }
        }
    }

    public yzf(@hib List<byte[]> list) {
        this.f103565e = -3.4028235E38f;
        this.f103566f = -3.4028235E38f;
        this.f103563c = new jhc();
        if (list == null || list.isEmpty()) {
            this.f103561a = false;
            this.f103562b = null;
            return;
        }
        this.f103561a = true;
        String strFromUtf8Bytes = t0i.fromUtf8Bytes(list.get(0));
        v80.checkArgument(strFromUtf8Bytes.startsWith("Format:"));
        this.f103562b = (xzf) v80.checkNotNull(xzf.fromFormatLine(strFromUtf8Bytes));
        parseHeader(new jhc(list.get(1)), StandardCharsets.UTF_8);
    }
}
