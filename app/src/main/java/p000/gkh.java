package p000;

import android.text.Layout;
import com.blankj.utilcode.util.C2473f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class gkh extends djf {

    /* JADX INFO: renamed from: E */
    public static final int f40044E = 30;

    /* JADX INFO: renamed from: p */
    public static final String f40047p = "TtmlDecoder";

    /* JADX INFO: renamed from: q */
    public static final String f40048q = "http://www.w3.org/ns/ttml#parameter";

    /* JADX INFO: renamed from: r */
    public static final String f40049r = "begin";

    /* JADX INFO: renamed from: s */
    public static final String f40050s = "dur";

    /* JADX INFO: renamed from: t */
    public static final String f40051t = "end";

    /* JADX INFO: renamed from: u */
    public static final String f40052u = "style";

    /* JADX INFO: renamed from: v */
    public static final String f40053v = "region";

    /* JADX INFO: renamed from: w */
    public static final String f40054w = "backgroundImage";

    /* JADX INFO: renamed from: o */
    public final XmlPullParserFactory f40058o;

    /* JADX INFO: renamed from: x */
    public static final Pattern f40055x = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: y */
    public static final Pattern f40056y = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: z */
    public static final Pattern f40057z = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: A */
    public static final Pattern f40040A = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: B */
    public static final Pattern f40041B = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: C */
    public static final Pattern f40042C = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: D */
    public static final Pattern f40043D = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: F */
    public static final C6363b f40045F = new C6363b(30.0f, 1, 1);

    /* JADX INFO: renamed from: G */
    public static final C6362a f40046G = new C6362a(32, 15);

    /* JADX INFO: renamed from: gkh$a */
    public static final class C6362a {

        /* JADX INFO: renamed from: a */
        public final int f40059a;

        /* JADX INFO: renamed from: b */
        public final int f40060b;

        public C6362a(int i, int i2) {
            this.f40059a = i;
            this.f40060b = i2;
        }
    }

    /* JADX INFO: renamed from: gkh$b */
    public static final class C6363b {

        /* JADX INFO: renamed from: a */
        public final float f40061a;

        /* JADX INFO: renamed from: b */
        public final int f40062b;

        /* JADX INFO: renamed from: c */
        public final int f40063c;

        public C6363b(float f, int i, int i2) {
            this.f40061a = f;
            this.f40062b = i;
            this.f40063c = i2;
        }
    }

    /* JADX INFO: renamed from: gkh$c */
    public static final class C6364c {

        /* JADX INFO: renamed from: a */
        public final int f40064a;

        /* JADX INFO: renamed from: b */
        public final int f40065b;

        public C6364c(int i, int i2) {
            this.f40064a = i;
            this.f40065b = i2;
        }
    }

    public gkh() {
        super(f40047p);
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f40058o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private static pkh createIfNull(@hib pkh pkhVar) {
        return pkhVar == null ? new pkh() : pkhVar;
    }

    private static boolean isSupportedTag(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    @hib
    private static Layout.Alignment parseAlignment(String str) {
        String lowerCase = i80.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static C6362a parseCellResolution(XmlPullParser xmlPullParser, C6362a c6362a) throws beg {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c6362a;
        }
        Matcher matcher = f40043D.matcher(attributeValue);
        if (!matcher.matches()) {
            yh9.m25919w(f40047p, "Ignoring malformed cell resolution: " + attributeValue);
            return c6362a;
        }
        try {
            int i = Integer.parseInt((String) u80.checkNotNull(matcher.group(1)));
            int i2 = Integer.parseInt((String) u80.checkNotNull(matcher.group(2)));
            if (i != 0 && i2 != 0) {
                return new C6362a(i, i2);
            }
            throw new beg("Invalid cell resolution " + i + C2473f.f17566z + i2);
        } catch (NumberFormatException unused) {
            yh9.m25919w(f40047p, "Ignoring malformed cell resolution: " + attributeValue);
            return c6362a;
        }
    }

    private static void parseFontSize(String str, pkh pkhVar) throws beg {
        Matcher matcher;
        String str2;
        String[] strArrSplit = x0i.split(str, "\\s+");
        if (strArrSplit.length == 1) {
            matcher = f40057z.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new beg("Invalid number of entries for fontSize: " + strArrSplit.length + ".");
            }
            matcher = f40057z.matcher(strArrSplit[1]);
            yh9.m25919w(f40047p, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new beg("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) u80.checkNotNull(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                pkhVar.setFontSizeUnit(3);
                break;
            case "em":
                pkhVar.setFontSizeUnit(2);
                break;
            case "px":
                pkhVar.setFontSizeUnit(1);
                break;
            default:
                throw new beg("Invalid unit for fontSize: '" + str2 + "'.");
        }
        pkhVar.setFontSize(Float.parseFloat((String) u80.checkNotNull(matcher.group(1))));
    }

    private static C6363b parseFrameAndTickRates(XmlPullParser xmlPullParser) throws beg {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (x0i.split(attributeValue2, C2473f.f17566z).length != 2) {
                throw new beg("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        C6363b c6363b = f40045F;
        int i2 = c6363b.f40062b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = c6363b.f40063c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C6363b(i * f, i2, i3);
    }

    private static Map<String, pkh> parseHeader(XmlPullParser xmlPullParser, Map<String, pkh> map, C6362a c6362a, @hib C6364c c6364c, Map<String, kkh> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (ati.isStartTag(xmlPullParser, "style")) {
                String attributeValue = ati.getAttributeValue(xmlPullParser, "style");
                pkh styleAttributes = parseStyleAttributes(xmlPullParser, new pkh());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        styleAttributes.chain(map.get(str));
                    }
                }
                String id = styleAttributes.getId();
                if (id != null) {
                    map.put(id, styleAttributes);
                }
            } else if (ati.isStartTag(xmlPullParser, "region")) {
                kkh regionAttributes = parseRegionAttributes(xmlPullParser, c6362a, c6364c);
                if (regionAttributes != null) {
                    map2.put(regionAttributes.f54564a, regionAttributes);
                }
            } else if (ati.isStartTag(xmlPullParser, "metadata")) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!ati.isEndTag(xmlPullParser, "head"));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (ati.isStartTag(xmlPullParser, "image") && (attributeValue = ati.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!ati.isEndTag(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000.hkh parseNode(org.xmlpull.v1.XmlPullParser r20, @p000.hib p000.hkh r21, java.util.Map<java.lang.String, p000.kkh> r22, p000.gkh.C6363b r23) throws p000.beg {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gkh.parseNode(org.xmlpull.v1.XmlPullParser, hkh, java.util.Map, gkh$b):hkh");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b9  */
    @p000.hib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000.kkh parseRegionAttributes(org.xmlpull.v1.XmlPullParser r18, p000.gkh.C6362a r19, @p000.hib p000.gkh.C6364c r20) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gkh.parseRegionAttributes(org.xmlpull.v1.XmlPullParser, gkh$a, gkh$c):kkh");
    }

    private static float parseShear(String str) {
        Matcher matcher = f40040A.matcher(str);
        if (!matcher.matches()) {
            yh9.m25919w(f40047p, "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) u80.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e) {
            yh9.m25920w(f40047p, "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    private static pkh parseStyleAttributes(XmlPullParser xmlPullParser, pkh pkhVar) {
        String attributeValue;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            switch (attributeName) {
                case "fontStyle":
                    pkhVar = createIfNull(pkhVar).setItalic("italic".equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    pkhVar = createIfNull(pkhVar).setFontFamily(attributeValue);
                    break;
                case "textAlign":
                    pkhVar = createIfNull(pkhVar).setTextAlign(parseAlignment(attributeValue));
                    break;
                case "textDecoration":
                    String lowerCase = i80.toLowerCase(attributeValue);
                    lowerCase.hashCode();
                    switch (lowerCase) {
                        case "nounderline":
                            pkhVar = createIfNull(pkhVar).setUnderline(false);
                            break;
                        case "underline":
                            pkhVar = createIfNull(pkhVar).setUnderline(true);
                            break;
                        case "nolinethrough":
                            pkhVar = createIfNull(pkhVar).setLinethrough(false);
                            break;
                        case "linethrough":
                            pkhVar = createIfNull(pkhVar).setLinethrough(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    pkhVar = createIfNull(pkhVar).setBold("bold".equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        pkhVar = createIfNull(pkhVar).setId(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String lowerCase2 = i80.toLowerCase(attributeValue);
                    lowerCase2.hashCode();
                    switch (lowerCase2) {
                        case "baseContainer":
                        case "base":
                            pkhVar = createIfNull(pkhVar).setRubyType(2);
                            break;
                        case "container":
                            pkhVar = createIfNull(pkhVar).setRubyType(1);
                            break;
                        case "delimiter":
                            pkhVar = createIfNull(pkhVar).setRubyType(4);
                            break;
                        case "textContainer":
                        case "text":
                            pkhVar = createIfNull(pkhVar).setRubyType(3);
                            break;
                    }
                    break;
                case "color":
                    pkhVar = createIfNull(pkhVar);
                    try {
                        pkhVar.setFontColor(s92.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        yh9.m25919w(f40047p, "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    pkhVar = createIfNull(pkhVar).setShearPercentage(parseShear(attributeValue));
                    break;
                case "textCombine":
                    String lowerCase3 = i80.toLowerCase(attributeValue);
                    lowerCase3.hashCode();
                    if (!lowerCase3.equals("all")) {
                        if (lowerCase3.equals("none")) {
                            pkhVar = createIfNull(pkhVar).setTextCombine(false);
                        }
                        break;
                    } else {
                        pkhVar = createIfNull(pkhVar).setTextCombine(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        pkhVar = createIfNull(pkhVar);
                        parseFontSize(attributeValue, pkhVar);
                        break;
                    } catch (beg unused2) {
                        yh9.m25919w(f40047p, "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    pkhVar = createIfNull(pkhVar).setTextEmphasis(erg.parse(attributeValue));
                    break;
                case "rubyPosition":
                    String lowerCase4 = i80.toLowerCase(attributeValue);
                    lowerCase4.hashCode();
                    if (!lowerCase4.equals("before")) {
                        if (lowerCase4.equals("after")) {
                            pkhVar = createIfNull(pkhVar).setRubyPosition(2);
                        }
                        break;
                    } else {
                        pkhVar = createIfNull(pkhVar).setRubyPosition(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    pkhVar = createIfNull(pkhVar);
                    try {
                        pkhVar.setBackgroundColor(s92.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        yh9.m25919w(f40047p, "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    pkhVar = createIfNull(pkhVar).setMultiRowAlign(parseAlignment(attributeValue));
                    break;
            }
        }
        return pkhVar;
    }

    private static String[] parseStyleIds(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : x0i.split(strTrim, "\\s+");
    }

    private static long parseTimeExpression(String str, C6363b c6363b) throws beg {
        double d;
        double d2;
        double d3;
        Matcher matcher = f40055x.matcher(str);
        if (matcher.matches()) {
            double d4 = (Long.parseLong((String) u80.checkNotNull(matcher.group(1))) * 3600) + (Long.parseLong((String) u80.checkNotNull(matcher.group(2))) * 60) + Long.parseLong((String) u80.checkNotNull(matcher.group(3)));
            String strGroup = matcher.group(4);
            return (long) ((d4 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / c6363b.f40061a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) c6363b.f40062b)) / ((double) c6363b.f40061a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f40056y.matcher(str);
        if (!matcher2.matches()) {
            throw new beg("Malformed time expression: " + str);
        }
        d = Double.parseDouble((String) u80.checkNotNull(matcher2.group(1)));
        String str2 = (String) u80.checkNotNull(matcher2.group(2));
        str2.hashCode();
        switch (str2) {
            case "f":
                d2 = c6363b.f40061a;
                d /= d2;
                return (long) (d * 1000000.0d);
            case "h":
                d3 = 3600.0d;
                break;
            case "m":
                d3 = 60.0d;
                break;
            case "t":
                d2 = c6363b.f40063c;
                d /= d2;
                return (long) (d * 1000000.0d);
            case "ms":
                d2 = 1000.0d;
                d /= d2;
                return (long) (d * 1000000.0d);
            default:
                return (long) (d * 1000000.0d);
        }
        d *= d3;
        return (long) (d * 1000000.0d);
    }

    @hib
    private static C6364c parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = ati.getAttributeValue(xmlPullParser, "extent");
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = f40042C.matcher(attributeValue);
        if (!matcher.matches()) {
            yh9.m25919w(f40047p, "Ignoring non-pixel tts extent: " + attributeValue);
            return null;
        }
        try {
            return new C6364c(Integer.parseInt((String) u80.checkNotNull(matcher.group(1))), Integer.parseInt((String) u80.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            yh9.m25919w(f40047p, "Ignoring malformed tts extent: " + attributeValue);
            return null;
        }
    }

    @Override // p000.djf
    /* JADX INFO: renamed from: l */
    public xdg mo9213l(byte[] bArr, int i, boolean z) throws beg {
        C6363b c6363b;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f40058o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new kkh(""));
            C6364c ttsExtent = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C6363b frameAndTickRates = f40045F;
            C6362a cellResolution = f40046G;
            int i2 = 0;
            qkh qkhVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                hkh hkhVar = (hkh) arrayDeque.peek();
                if (i2 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            frameAndTickRates = parseFrameAndTickRates(xmlPullParserNewPullParser);
                            cellResolution = parseCellResolution(xmlPullParserNewPullParser, f40046G);
                            ttsExtent = parseTtsExtent(xmlPullParserNewPullParser);
                        }
                        C6364c c6364c = ttsExtent;
                        C6363b c6363b2 = frameAndTickRates;
                        C6362a c6362a = cellResolution;
                        if (isSupportedTag(name)) {
                            if ("head".equals(name)) {
                                c6363b = c6363b2;
                                parseHeader(xmlPullParserNewPullParser, map, c6362a, c6364c, map2, map3);
                            } else {
                                c6363b = c6363b2;
                                try {
                                    hkh node = parseNode(xmlPullParserNewPullParser, hkhVar, map2, c6363b);
                                    arrayDeque.push(node);
                                    if (hkhVar != null) {
                                        hkhVar.addChild(node);
                                    }
                                } catch (beg e) {
                                    yh9.m25920w(f40047p, "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            frameAndTickRates = c6363b;
                        } else {
                            yh9.m25917i(f40047p, "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i2++;
                            frameAndTickRates = c6363b2;
                        }
                        ttsExtent = c6364c;
                        cellResolution = c6362a;
                    } else if (eventType == 4) {
                        ((hkh) u80.checkNotNull(hkhVar)).addChild(hkh.buildTextNode(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            qkhVar = new qkh((hkh) u80.checkNotNull((hkh) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (qkhVar != null) {
                return qkhVar;
            }
            throw new beg("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new beg("Unable to decode source", e3);
        }
    }
}
