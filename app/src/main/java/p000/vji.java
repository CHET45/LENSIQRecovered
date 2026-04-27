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
import p000.n93;
import p000.vji;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class vji {

    /* JADX INFO: renamed from: A */
    public static final int f91424A = 2;

    /* JADX INFO: renamed from: B */
    public static final float f91425B = 0.5f;

    /* JADX INFO: renamed from: C */
    public static final String f91426C = "WebvttCueParser";

    /* JADX INFO: renamed from: D */
    public static final Map<String, Integer> f91427D;

    /* JADX INFO: renamed from: E */
    public static final Map<String, Integer> f91428E;

    /* JADX INFO: renamed from: a */
    public static final int f91429a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f91430b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f91431c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f91432d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f91433e = 5;

    /* JADX INFO: renamed from: f */
    public static final Pattern f91434f = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* JADX INFO: renamed from: g */
    public static final Pattern f91435g = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: h */
    public static final char f91436h = '<';

    /* JADX INFO: renamed from: i */
    public static final char f91437i = '>';

    /* JADX INFO: renamed from: j */
    public static final char f91438j = '/';

    /* JADX INFO: renamed from: k */
    public static final char f91439k = '&';

    /* JADX INFO: renamed from: l */
    public static final char f91440l = ';';

    /* JADX INFO: renamed from: m */
    public static final char f91441m = ' ';

    /* JADX INFO: renamed from: n */
    public static final String f91442n = "lt";

    /* JADX INFO: renamed from: o */
    public static final String f91443o = "gt";

    /* JADX INFO: renamed from: p */
    public static final String f91444p = "amp";

    /* JADX INFO: renamed from: q */
    public static final String f91445q = "nbsp";

    /* JADX INFO: renamed from: r */
    public static final String f91446r = "b";

    /* JADX INFO: renamed from: s */
    public static final String f91447s = "c";

    /* JADX INFO: renamed from: t */
    public static final String f91448t = "i";

    /* JADX INFO: renamed from: u */
    public static final String f91449u = "lang";

    /* JADX INFO: renamed from: v */
    public static final String f91450v = "ruby";

    /* JADX INFO: renamed from: w */
    public static final String f91451w = "rt";

    /* JADX INFO: renamed from: x */
    public static final String f91452x = "u";

    /* JADX INFO: renamed from: y */
    public static final String f91453y = "v";

    /* JADX INFO: renamed from: z */
    public static final int f91454z = 1;

    /* JADX INFO: renamed from: vji$b */
    public static class C14127b {

        /* JADX INFO: renamed from: c */
        public static final Comparator<C14127b> f91455c = new Comparator() { // from class: xji
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return vji.C14127b.lambda$static$0((vji.C14127b) obj, (vji.C14127b) obj2);
            }
        };

        /* JADX INFO: renamed from: a */
        public final C14128c f91456a;

        /* JADX INFO: renamed from: b */
        public final int f91457b;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(C14127b c14127b, C14127b c14127b2) {
            return Integer.compare(c14127b.f91456a.f91459b, c14127b2.f91456a.f91459b);
        }

        private C14127b(C14128c c14128c, int i) {
            this.f91456a = c14128c;
            this.f91457b = i;
        }
    }

    /* JADX INFO: renamed from: vji$c */
    public static final class C14128c {

        /* JADX INFO: renamed from: a */
        public final String f91458a;

        /* JADX INFO: renamed from: b */
        public final int f91459b;

        /* JADX INFO: renamed from: c */
        public final String f91460c;

        /* JADX INFO: renamed from: d */
        public final Set<String> f91461d;

        private C14128c(String str, int i, String str2, Set<String> set) {
            this.f91459b = i;
            this.f91458a = str;
            this.f91460c = str2;
            this.f91461d = set;
        }

        public static C14128c buildStartTag(String str, int i) {
            String str2;
            String strTrim = str.trim();
            v80.checkArgument(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(C2473f.f17566z);
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrSplit = t0i.split(strTrim, "\\.");
            String str3 = strArrSplit[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                hashSet.add(strArrSplit[i2]);
            }
            return new C14128c(str3, i, str2, hashSet);
        }

        public static C14128c buildWholeCueVirtualTag() {
            return new C14128c("", 0, "", Collections.emptySet());
        }
    }

    /* JADX INFO: renamed from: vji$d */
    public static final class C14129d implements Comparable<C14129d> {

        /* JADX INFO: renamed from: a */
        public final int f91462a;

        /* JADX INFO: renamed from: b */
        public final rji f91463b;

        public C14129d(int i, rji rjiVar) {
            this.f91462a = i;
            this.f91463b = rjiVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(C14129d c14129d) {
            return Integer.compare(this.f91462a, c14129d.f91462a);
        }
    }

    /* JADX INFO: renamed from: vji$e */
    public static final class C14130e {

        /* JADX INFO: renamed from: c */
        public CharSequence f91466c;

        /* JADX INFO: renamed from: a */
        public long f91464a = 0;

        /* JADX INFO: renamed from: b */
        public long f91465b = 0;

        /* JADX INFO: renamed from: d */
        public int f91467d = 2;

        /* JADX INFO: renamed from: e */
        public float f91468e = -3.4028235E38f;

        /* JADX INFO: renamed from: f */
        public int f91469f = 1;

        /* JADX INFO: renamed from: g */
        public int f91470g = 0;

        /* JADX INFO: renamed from: h */
        public float f91471h = -3.4028235E38f;

        /* JADX INFO: renamed from: i */
        public int f91472i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j */
        public float f91473j = 1.0f;

        /* JADX INFO: renamed from: k */
        public int f91474k = Integer.MIN_VALUE;

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
                            xh9.m25148w("WebvttCueParser", "Unknown textAlignment: " + i);
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

        public uji build() {
            return new uji(toCueBuilder().build(), this.f91464a, this.f91465b);
        }

        public n93.C9750c toCueBuilder() {
            float fDerivePosition = this.f91471h;
            if (fDerivePosition == -3.4028235E38f) {
                fDerivePosition = derivePosition(this.f91467d);
            }
            int iDerivePositionAnchor = this.f91472i;
            if (iDerivePositionAnchor == Integer.MIN_VALUE) {
                iDerivePositionAnchor = derivePositionAnchor(this.f91467d);
            }
            n93.C9750c verticalType = new n93.C9750c().setTextAlignment(convertTextAlignment(this.f91467d)).setLine(computeLine(this.f91468e, this.f91469f), this.f91469f).setLineAnchor(this.f91470g).setPosition(fDerivePosition).setPositionAnchor(iDerivePositionAnchor).setSize(Math.min(this.f91473j, deriveMaxSize(iDerivePositionAnchor, fDerivePosition))).setVerticalType(this.f91474k);
            CharSequence charSequence = this.f91466c;
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
        f91427D = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f91428E = Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    public static n93.C9750c m24039a(String str) {
        C14130e c14130e = new C14130e();
        parseCueSettingsList(str, c14130e);
        return c14130e.toCueBuilder();
    }

    private static void applyDefaultColors(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = f91427D;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = f91428E;
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
                xh9.m25148w("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void applyRubySpans(SpannableStringBuilder spannableStringBuilder, @hib String str, C14128c c14128c, List<C14127b> list, List<rji> list2) {
        int rubyPosition = getRubyPosition(list2, str, c14128c);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C14127b.f91455c);
        int i = c14128c.f91459b;
        int length = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if ("rt".equals(((C14127b) arrayList.get(i2)).f91456a.f91458a)) {
                C14127b c14127b = (C14127b) arrayList.get(i2);
                int iFirstKnownRubyPosition = firstKnownRubyPosition(getRubyPosition(list2, str, c14127b.f91456a), rubyPosition, 1);
                int i3 = c14127b.f91456a.f91459b - length;
                int i4 = c14127b.f91457b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new mce(charSequenceSubSequence.toString(), iFirstKnownRubyPosition), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    private static void applySpansForTag(@hib String str, C14128c c14128c, List<C14127b> list, SpannableStringBuilder spannableStringBuilder, List<rji> list2) {
        int i;
        int length;
        i = c14128c.f91459b;
        length = spannableStringBuilder.length();
        String str2 = c14128c.f91458a;
        str2.hashCode();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                applyDefaultColors(spannableStringBuilder, c14128c.f91461d, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "v":
                applyVoiceSpan(spannableStringBuilder, c14128c.f91460c, i, length);
                break;
            case "ruby":
                applyRubySpans(spannableStringBuilder, str, c14128c, list, list2);
                break;
            default:
                return;
        }
        List<C14129d> applicableStyles = getApplicableStyles(list2, str, c14128c);
        for (int i2 = 0; i2 < applicableStyles.size(); i2++) {
            applyStyleToText(spannableStringBuilder, applicableStyles.get(i2).f91463b, i, length);
        }
    }

    private static void applyStyleToText(SpannableStringBuilder spannableStringBuilder, rji rjiVar, int i, int i2) {
        if (rjiVar == null) {
            return;
        }
        if (rjiVar.getStyle() != -1) {
            vwf.addOrReplaceSpan(spannableStringBuilder, new StyleSpan(rjiVar.getStyle()), i, i2, 33);
        }
        if (rjiVar.isLinethrough()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (rjiVar.isUnderline()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (rjiVar.hasFontColor()) {
            vwf.addOrReplaceSpan(spannableStringBuilder, new ForegroundColorSpan(rjiVar.getFontColor()), i, i2, 33);
        }
        if (rjiVar.hasBackgroundColor()) {
            vwf.addOrReplaceSpan(spannableStringBuilder, new BackgroundColorSpan(rjiVar.getBackgroundColor()), i, i2, 33);
        }
        if (rjiVar.getFontFamily() != null) {
            vwf.addOrReplaceSpan(spannableStringBuilder, new TypefaceSpan(rjiVar.getFontFamily()), i, i2, 33);
        }
        int fontSizeUnit = rjiVar.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            vwf.addOrReplaceSpan(spannableStringBuilder, new AbsoluteSizeSpan((int) rjiVar.getFontSize(), true), i, i2, 33);
        } else if (fontSizeUnit == 2) {
            vwf.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(rjiVar.getFontSize()), i, i2, 33);
        } else if (fontSizeUnit == 3) {
            vwf.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(rjiVar.getFontSize() / 100.0f), i, i2, 33);
        }
        if (rjiVar.getCombineUpright()) {
            spannableStringBuilder.setSpan(new ql7(), i, i2, 33);
        }
    }

    private static void applyVoiceSpan(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        spannableStringBuilder.setSpan(new yfi(str), i, i2, 33);
    }

    /* JADX INFO: renamed from: b */
    public static SpannedString m24040b(@hib String str, String str2, List<rji> list) {
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
                                    C14128c c14128c = (C14128c) arrayDeque.pop();
                                    applySpansForTag(str, c14128c, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new C14127b(c14128c, spannableStringBuilder.length()));
                                    }
                                    if (c14128c.f91458a.equals(tagName)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(C14128c.buildStartTag(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iFindEndOfTag;
            }
        }
        while (!arrayDeque.isEmpty()) {
            applySpansForTag(str, (C14128c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        applySpansForTag(str, C14128c.buildWholeCueVirtualTag(), Collections.emptyList(), spannableStringBuilder, list);
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

    private static List<C14129d> getApplicableStyles(List<rji> list, @hib String str, C14128c c14128c) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            rji rjiVar = list.get(i);
            int specificityScore = rjiVar.getSpecificityScore(str, c14128c.f91458a, c14128c.f91461d, c14128c.f91460c);
            if (specificityScore > 0) {
                arrayList.add(new C14129d(specificityScore, rjiVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int getRubyPosition(List<rji> list, @hib String str, C14128c c14128c) {
        List<C14129d> applicableStyles = getApplicableStyles(list, str, c14128c);
        for (int i = 0; i < applicableStyles.size(); i++) {
            rji rjiVar = applicableStyles.get(i).f91463b;
            if (rjiVar.getRubyPosition() != -1) {
                return rjiVar.getRubyPosition();
            }
        }
        return -1;
    }

    private static String getTagName(String str) {
        String strTrim = str.trim();
        v80.checkArgument(!strTrim.isEmpty());
        return t0i.splitAtFirst(strTrim, "[ \\.]")[0];
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

    @fdi(otherwise = 3)
    public static n93 newCueForText(CharSequence charSequence) {
        C14130e c14130e = new C14130e();
        c14130e.f91466c = charSequence;
        return c14130e.toCueBuilder().build();
    }

    @hib
    public static uji parseCue(jhc jhcVar, List<rji> list) {
        String line = jhcVar.readLine();
        if (line == null) {
            return null;
        }
        Pattern pattern = f91434f;
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return parseCue(null, matcher, jhcVar, list);
        }
        String line2 = jhcVar.readLine();
        if (line2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(line2);
        if (matcher2.matches()) {
            return parseCue(line.trim(), matcher2, jhcVar, list);
        }
        return null;
    }

    private static void parseCueSettingsList(String str, C14130e c14130e) {
        Matcher matcher = f91435g.matcher(str);
        while (matcher.find()) {
            String str2 = (String) v80.checkNotNull(matcher.group(1));
            String str3 = (String) v80.checkNotNull(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    parseLineAttribute(str3, c14130e);
                } else if ("align".equals(str2)) {
                    c14130e.f91467d = parseTextAlignment(str3);
                } else if (C2865a.f19004r.equals(str2)) {
                    parsePositionAttribute(str3, c14130e);
                } else if (MediaInformation.KEY_SIZE.equals(str2)) {
                    c14130e.f91473j = cki.parsePercentage(str3);
                } else if ("vertical".equals(str2)) {
                    c14130e.f91474k = parseVerticalAttribute(str3);
                } else {
                    xh9.m25148w("WebvttCueParser", "Unknown cue setting " + str2 + g1i.f38277c + str3);
                }
            } catch (NumberFormatException unused) {
                xh9.m25148w("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
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
                xh9.m25148w("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void parseLineAttribute(String str, C14130e c14130e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c14130e.f91470g = parseLineAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith(yv7.f103133a)) {
            c14130e.f91468e = cki.parsePercentage(str);
            c14130e.f91469f = 0;
        } else {
            c14130e.f91468e = Integer.parseInt(str);
            c14130e.f91469f = 1;
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
                xh9.m25148w("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void parsePositionAttribute(String str, C14130e c14130e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c14130e.f91472i = parsePositionAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c14130e.f91471h = cki.parsePercentage(str);
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
                xh9.m25148w("WebvttCueParser", "Invalid alignment value: " + str);
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
        xh9.m25148w("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }

    @hib
    private static uji parseCue(@hib String str, Matcher matcher, jhc jhcVar, List<rji> list) {
        C14130e c14130e = new C14130e();
        try {
            c14130e.f91464a = cki.parseTimestampUs((String) v80.checkNotNull(matcher.group(1)));
            c14130e.f91465b = cki.parseTimestampUs((String) v80.checkNotNull(matcher.group(2)));
            parseCueSettingsList((String) v80.checkNotNull(matcher.group(3)), c14130e);
            StringBuilder sb = new StringBuilder();
            String line = jhcVar.readLine();
            while (!TextUtils.isEmpty(line)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(line.trim());
                line = jhcVar.readLine();
            }
            c14130e.f91466c = m24040b(str, sb.toString(), list);
            return c14130e.build();
        } catch (IllegalArgumentException unused) {
            xh9.m25148w("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }
}
