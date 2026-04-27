package p000;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.arthenica.ffmpegkit.MediaInformation;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.glassapp.view.photo.C2865a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.o93;
import p000.yji;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class yji {

    /* JADX INFO: renamed from: A */
    public static final int f101811A = 2;

    /* JADX INFO: renamed from: B */
    public static final float f101812B = 0.5f;

    /* JADX INFO: renamed from: C */
    public static final String f101813C = "WebvttCueParser";

    /* JADX INFO: renamed from: D */
    public static final Map<String, Integer> f101814D;

    /* JADX INFO: renamed from: E */
    public static final Map<String, Integer> f101815E;

    /* JADX INFO: renamed from: a */
    public static final int f101816a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f101817b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f101818c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f101819d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f101820e = 5;

    /* JADX INFO: renamed from: f */
    public static final Pattern f101821f = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: g */
    public static final Pattern f101822g = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: h */
    public static final char f101823h = '<';

    /* JADX INFO: renamed from: i */
    public static final char f101824i = '>';

    /* JADX INFO: renamed from: j */
    public static final char f101825j = '/';

    /* JADX INFO: renamed from: k */
    public static final char f101826k = '&';

    /* JADX INFO: renamed from: l */
    public static final char f101827l = ';';

    /* JADX INFO: renamed from: m */
    public static final char f101828m = ' ';

    /* JADX INFO: renamed from: n */
    public static final String f101829n = "lt";

    /* JADX INFO: renamed from: o */
    public static final String f101830o = "gt";

    /* JADX INFO: renamed from: p */
    public static final String f101831p = "amp";

    /* JADX INFO: renamed from: q */
    public static final String f101832q = "nbsp";

    /* JADX INFO: renamed from: r */
    public static final String f101833r = "b";

    /* JADX INFO: renamed from: s */
    public static final String f101834s = "c";

    /* JADX INFO: renamed from: t */
    public static final String f101835t = "i";

    /* JADX INFO: renamed from: u */
    public static final String f101836u = "lang";

    /* JADX INFO: renamed from: v */
    public static final String f101837v = "ruby";

    /* JADX INFO: renamed from: w */
    public static final String f101838w = "rt";

    /* JADX INFO: renamed from: x */
    public static final String f101839x = "u";

    /* JADX INFO: renamed from: y */
    public static final String f101840y = "v";

    /* JADX INFO: renamed from: z */
    public static final int f101841z = 1;

    /* JADX INFO: renamed from: yji$b */
    public static class C15695b {

        /* JADX INFO: renamed from: c */
        public static final Comparator<C15695b> f101842c = new Comparator() { // from class: wji
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return yji.C15695b.lambda$static$0((yji.C15695b) obj, (yji.C15695b) obj2);
            }
        };

        /* JADX INFO: renamed from: a */
        public final C15696c f101843a;

        /* JADX INFO: renamed from: b */
        public final int f101844b;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(C15695b c15695b, C15695b c15695b2) {
            return Integer.compare(c15695b.f101843a.f101846b, c15695b2.f101843a.f101846b);
        }

        private C15695b(C15696c c15696c, int i) {
            this.f101843a = c15696c;
            this.f101844b = i;
        }
    }

    /* JADX INFO: renamed from: yji$c */
    public static final class C15696c {

        /* JADX INFO: renamed from: a */
        public final String f101845a;

        /* JADX INFO: renamed from: b */
        public final int f101846b;

        /* JADX INFO: renamed from: c */
        public final String f101847c;

        /* JADX INFO: renamed from: d */
        public final Set<String> f101848d;

        private C15696c(String str, int i, String str2, Set<String> set) {
            this.f101846b = i;
            this.f101845a = str;
            this.f101847c = str2;
            this.f101848d = set;
        }

        public static C15696c buildStartTag(String str, int i) {
            String str2;
            String strTrim = str.trim();
            u80.checkArgument(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(C2473f.f17566z);
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrSplit = x0i.split(strTrim, "\\.");
            String str3 = strArrSplit[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                hashSet.add(strArrSplit[i2]);
            }
            return new C15696c(str3, i, str2, hashSet);
        }

        public static C15696c buildWholeCueVirtualTag() {
            return new C15696c("", 0, "", Collections.emptySet());
        }
    }

    /* JADX INFO: renamed from: yji$d */
    public static final class C15697d implements Comparable<C15697d> {

        /* JADX INFO: renamed from: a */
        public final int f101849a;

        /* JADX INFO: renamed from: b */
        public final sji f101850b;

        public C15697d(int i, sji sjiVar) {
            this.f101849a = i;
            this.f101850b = sjiVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(C15697d c15697d) {
            return Integer.compare(this.f101849a, c15697d.f101849a);
        }
    }

    /* JADX INFO: renamed from: yji$e */
    public static final class C15698e {

        /* JADX INFO: renamed from: c */
        public CharSequence f101853c;

        /* JADX INFO: renamed from: a */
        public long f101851a = 0;

        /* JADX INFO: renamed from: b */
        public long f101852b = 0;

        /* JADX INFO: renamed from: d */
        public int f101854d = 2;

        /* JADX INFO: renamed from: e */
        public float f101855e = -3.4028235E38f;

        /* JADX INFO: renamed from: f */
        public int f101856f = 1;

        /* JADX INFO: renamed from: g */
        public int f101857g = 0;

        /* JADX INFO: renamed from: h */
        public float f101858h = -3.4028235E38f;

        /* JADX INFO: renamed from: i */
        public int f101859i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j */
        public float f101860j = 1.0f;

        /* JADX INFO: renamed from: k */
        public int f101861k = Integer.MIN_VALUE;

        private static float computeLine(float f, int i) {
            if (f == -3.4028235E38f || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return f != -3.4028235E38f ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        @hib
        private static Layout.Alignment convertTextAlignment(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            yh9.m25919w("WebvttCueParser", "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float deriveMaxSize(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }

        private static float derivePosition(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int derivePositionAnchor(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        public tji build() {
            return new tji(toCueBuilder().build(), this.f101851a, this.f101852b);
        }

        public o93.C10261c toCueBuilder() {
            float fDerivePosition = this.f101858h;
            if (fDerivePosition == -3.4028235E38f) {
                fDerivePosition = derivePosition(this.f101854d);
            }
            int iDerivePositionAnchor = this.f101859i;
            if (iDerivePositionAnchor == Integer.MIN_VALUE) {
                iDerivePositionAnchor = derivePositionAnchor(this.f101854d);
            }
            o93.C10261c verticalType = new o93.C10261c().setTextAlignment(convertTextAlignment(this.f101854d)).setLine(computeLine(this.f101855e, this.f101856f), this.f101856f).setLineAnchor(this.f101857g).setPosition(fDerivePosition).setPositionAnchor(iDerivePositionAnchor).setSize(Math.min(this.f101860j, deriveMaxSize(iDerivePositionAnchor, fDerivePosition))).setVerticalType(this.f101861k);
            CharSequence charSequence = this.f101853c;
            if (charSequence != null) {
                verticalType.setText(charSequence);
            }
            return verticalType;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f101814D = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f101815E = Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    public static o93 m26150a(CharSequence charSequence) {
        C15698e c15698e = new C15698e();
        c15698e.f101853c = charSequence;
        return c15698e.toCueBuilder().build();
    }

    private static void applyDefaultColors(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = f101814D;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = f101815E;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    private static void applyEntity(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                yh9.m25919w("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void applyRubySpans(SpannableStringBuilder spannableStringBuilder, @hib String str, C15696c c15696c, List<C15695b> list, List<sji> list2) {
        int rubyPosition = getRubyPosition(list2, str, c15696c);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C15695b.f101842c);
        int i = c15696c.f101846b;
        int length = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if ("rt".equals(((C15695b) arrayList.get(i2)).f101843a.f101845a)) {
                C15695b c15695b = (C15695b) arrayList.get(i2);
                int iFirstKnownRubyPosition = firstKnownRubyPosition(getRubyPosition(list2, str, c15695b.f101843a), rubyPosition, 1);
                int i3 = c15695b.f101843a.f101846b - length;
                int i4 = c15695b.f101844b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new lce(charSequenceSubSequence.toString(), iFirstKnownRubyPosition), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    private static void applySpansForTag(@hib String str, C15696c c15696c, List<C15695b> list, SpannableStringBuilder spannableStringBuilder, List<sji> list2) {
        int i;
        int length;
        i = c15696c.f101846b;
        length = spannableStringBuilder.length();
        String str2 = c15696c.f101845a;
        str2.hashCode();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                applyDefaultColors(spannableStringBuilder, c15696c.f101848d, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "ruby":
                applyRubySpans(spannableStringBuilder, str, c15696c, list, list2);
                break;
            default:
                return;
        }
        List<C15697d> applicableStyles = getApplicableStyles(list2, str, c15696c);
        for (int i2 = 0; i2 < applicableStyles.size(); i2++) {
            applyStyleToText(spannableStringBuilder, applicableStyles.get(i2).f101850b, i, length);
        }
    }

    private static void applyStyleToText(SpannableStringBuilder spannableStringBuilder, sji sjiVar, int i, int i2) {
        if (sjiVar == null) {
            return;
        }
        if (sjiVar.getStyle() != -1) {
            uwf.addOrReplaceSpan(spannableStringBuilder, new StyleSpan(sjiVar.getStyle()), i, i2, 33);
        }
        if (sjiVar.isLinethrough()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (sjiVar.isUnderline()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (sjiVar.hasFontColor()) {
            uwf.addOrReplaceSpan(spannableStringBuilder, new ForegroundColorSpan(sjiVar.getFontColor()), i, i2, 33);
        }
        if (sjiVar.hasBackgroundColor()) {
            uwf.addOrReplaceSpan(spannableStringBuilder, new BackgroundColorSpan(sjiVar.getBackgroundColor()), i, i2, 33);
        }
        if (sjiVar.getFontFamily() != null) {
            uwf.addOrReplaceSpan(spannableStringBuilder, new TypefaceSpan(sjiVar.getFontFamily()), i, i2, 33);
        }
        int fontSizeUnit = sjiVar.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            uwf.addOrReplaceSpan(spannableStringBuilder, new AbsoluteSizeSpan((int) sjiVar.getFontSize(), true), i, i2, 33);
        } else if (fontSizeUnit == 2) {
            uwf.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(sjiVar.getFontSize()), i, i2, 33);
        } else if (fontSizeUnit == 3) {
            uwf.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(sjiVar.getFontSize() / 100.0f), i, i2, 33);
        }
        if (sjiVar.getCombineUpright()) {
            spannableStringBuilder.setSpan(new pl7(), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: b */
    public static o93.C10261c m26151b(String str) {
        C15698e c15698e = new C15698e();
        parseCueSettingsList(str, c15698e);
        return c15698e.toCueBuilder();
    }

    /* JADX INFO: renamed from: c */
    public static SpannedString m26152c(@hib String str, String str2, List<sji> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    applyEntity(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) C2473f.f17566z);
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int iFindEndOfTag = i + 1;
                if (iFindEndOfTag < str2.length()) {
                    boolean z = str2.charAt(iFindEndOfTag) == '/';
                    iFindEndOfTag = findEndOfTag(str2, iFindEndOfTag);
                    int i2 = iFindEndOfTag - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = iFindEndOfTag - 1;
                    }
                    String strSubstring = str2.substring(i3, i2);
                    if (!strSubstring.trim().isEmpty()) {
                        String tagName = getTagName(strSubstring);
                        if (isSupportedTag(tagName)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    C15696c c15696c = (C15696c) arrayDeque.pop();
                                    applySpansForTag(str, c15696c, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new C15695b(c15696c, spannableStringBuilder.length()));
                                    }
                                    if (c15696c.f101845a.equals(tagName)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(C15696c.buildStartTag(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iFindEndOfTag;
            }
        }
        while (!arrayDeque.isEmpty()) {
            applySpansForTag(str, (C15696c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        applySpansForTag(str, C15696c.buildWholeCueVirtualTag(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int findEndOfTag(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int firstKnownRubyPosition(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    private static List<C15697d> getApplicableStyles(List<sji> list, @hib String str, C15696c c15696c) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            sji sjiVar = list.get(i);
            int specificityScore = sjiVar.getSpecificityScore(str, c15696c.f101845a, c15696c.f101848d, c15696c.f101847c);
            if (specificityScore > 0) {
                arrayList.add(new C15697d(specificityScore, sjiVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int getRubyPosition(List<sji> list, @hib String str, C15696c c15696c) {
        List<C15697d> applicableStyles = getApplicableStyles(list, str, c15696c);
        for (int i = 0; i < applicableStyles.size(); i++) {
            sji sjiVar = applicableStyles.get(i).f101850b;
            if (sjiVar.getRubyPosition() != -1) {
                return sjiVar.getRubyPosition();
            }
        }
        return -1;
    }

    private static String getTagName(String str) {
        String strTrim = str.trim();
        u80.checkArgument(!strTrim.isEmpty());
        return x0i.splitAtFirst(strTrim, "[ \\.]")[0];
    }

    private static boolean isSupportedTag(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    @hib
    public static tji parseCue(ihc ihcVar, List<sji> list) {
        String line = ihcVar.readLine();
        if (line == null) {
            return null;
        }
        Pattern pattern = f101821f;
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return parseCue(null, matcher, ihcVar, list);
        }
        String line2 = ihcVar.readLine();
        if (line2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(line2);
        if (matcher2.matches()) {
            return parseCue(line.trim(), matcher2, ihcVar, list);
        }
        return null;
    }

    private static void parseCueSettingsList(String str, C15698e c15698e) {
        Matcher matcher = f101822g.matcher(str);
        while (matcher.find()) {
            String str2 = (String) u80.checkNotNull(matcher.group(1));
            String str3 = (String) u80.checkNotNull(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    parseLineAttribute(str3, c15698e);
                } else if ("align".equals(str2)) {
                    c15698e.f101854d = parseTextAlignment(str3);
                } else if (C2865a.f19004r.equals(str2)) {
                    parsePositionAttribute(str3, c15698e);
                } else if (MediaInformation.KEY_SIZE.equals(str2)) {
                    c15698e.f101860j = bki.parsePercentage(str3);
                } else if ("vertical".equals(str2)) {
                    c15698e.f101861k = parseVerticalAttribute(str3);
                } else {
                    yh9.m25919w("WebvttCueParser", "Unknown cue setting " + str2 + g1i.f38277c + str3);
                }
            } catch (NumberFormatException unused) {
                yh9.m25919w("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    private static int parseLineAnchor(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                yh9.m25919w("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void parseLineAttribute(String str, C15698e c15698e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c15698e.f101857g = parseLineAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith(yv7.f103133a)) {
            c15698e.f101855e = bki.parsePercentage(str);
            c15698e.f101856f = 0;
        } else {
            c15698e.f101855e = Integer.parseInt(str);
            c15698e.f101856f = 1;
        }
    }

    private static int parsePositionAnchor(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                yh9.m25919w("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void parsePositionAttribute(String str, C15698e c15698e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c15698e.f101859i = parsePositionAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c15698e.f101858h = bki.parsePercentage(str);
    }

    private static int parseTextAlignment(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                yh9.m25919w("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int parseVerticalAttribute(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        yh9.m25919w("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }

    @hib
    private static tji parseCue(@hib String str, Matcher matcher, ihc ihcVar, List<sji> list) {
        C15698e c15698e = new C15698e();
        try {
            c15698e.f101851a = bki.parseTimestampUs((String) u80.checkNotNull(matcher.group(1)));
            c15698e.f101852b = bki.parseTimestampUs((String) u80.checkNotNull(matcher.group(2)));
            parseCueSettingsList((String) u80.checkNotNull(matcher.group(3)), c15698e);
            StringBuilder sb = new StringBuilder();
            String line = ihcVar.readLine();
            while (!TextUtils.isEmpty(line)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(line.trim());
                line = ihcVar.readLine();
            }
            c15698e.f101853c = m26152c(str, sb.toString(), list);
            return c15698e.build();
        } catch (NumberFormatException unused) {
            yh9.m25919w("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }
}
