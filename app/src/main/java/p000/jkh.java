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
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class jkh implements peg {

    /* JADX INFO: renamed from: b */
    public static final int f51050b = 1;

    /* JADX INFO: renamed from: c */
    public static final String f51051c = "TtmlParser";

    /* JADX INFO: renamed from: d */
    public static final String f51052d = "http://www.w3.org/ns/ttml#parameter";

    /* JADX INFO: renamed from: e */
    public static final String f51053e = "begin";

    /* JADX INFO: renamed from: f */
    public static final String f51054f = "dur";

    /* JADX INFO: renamed from: g */
    public static final String f51055g = "end";

    /* JADX INFO: renamed from: h */
    public static final String f51056h = "style";

    /* JADX INFO: renamed from: i */
    public static final String f51057i = "region";

    /* JADX INFO: renamed from: j */
    public static final String f51058j = "backgroundImage";

    /* JADX INFO: renamed from: r */
    public static final int f51066r = 30;

    /* JADX INFO: renamed from: t */
    public static final int f51068t = 15;

    /* JADX INFO: renamed from: a */
    public final XmlPullParserFactory f51069a;

    /* JADX INFO: renamed from: k */
    public static final Pattern f51059k = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: l */
    public static final Pattern f51060l = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: m */
    public static final Pattern f51061m = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: n */
    public static final Pattern f51062n = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: o */
    public static final Pattern f51063o = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: p */
    public static final Pattern f51064p = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: q */
    public static final Pattern f51065q = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: s */
    public static final C7963a f51067s = new C7963a(30.0f, 1, 1);

    /* JADX INFO: renamed from: jkh$a */
    public static final class C7963a {

        /* JADX INFO: renamed from: a */
        public final float f51070a;

        /* JADX INFO: renamed from: b */
        public final int f51071b;

        /* JADX INFO: renamed from: c */
        public final int f51072c;

        public C7963a(float f, int i, int i2) {
            this.f51070a = f;
            this.f51071b = i;
            this.f51072c = i2;
        }
    }

    /* JADX INFO: renamed from: jkh$b */
    public static final class C7964b {

        /* JADX INFO: renamed from: a */
        public final int f51073a;

        /* JADX INFO: renamed from: b */
        public final int f51074b;

        public C7964b(int i, int i2) {
            this.f51073a = i;
            this.f51074b = i2;
        }
    }

    public jkh() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f51069a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private static okh createIfNull(@hib okh okhVar) {
        return okhVar == null ? new okh() : okhVar;
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

    private static int parseCellRows(XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i;
        }
        Matcher matcher = f51065q.matcher(attributeValue);
        if (!matcher.matches()) {
            xh9.m25148w(f51051c, "Ignoring malformed cell resolution: " + attributeValue);
            return i;
        }
        boolean z = true;
        try {
            int i2 = Integer.parseInt((String) v80.checkNotNull(matcher.group(1)));
            int i3 = Integer.parseInt((String) v80.checkNotNull(matcher.group(2)));
            if (i2 == 0 || i3 == 0) {
                z = false;
            }
            v80.checkArgument(z, "Invalid cell resolution " + i2 + C2473f.f17566z + i3);
            return i3;
        } catch (NumberFormatException unused) {
            xh9.m25148w(f51051c, "Ignoring malformed cell resolution: " + attributeValue);
            return i;
        }
    }

    private static void parseFontSize(String str, okh okhVar) throws ceg {
        Matcher matcher;
        String str2;
        String[] strArrSplit = t0i.split(str, "\\s+");
        if (strArrSplit.length == 1) {
            matcher = f51061m.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new ceg("Invalid number of entries for fontSize: " + strArrSplit.length + ".");
            }
            matcher = f51061m.matcher(strArrSplit[1]);
            xh9.m25148w(f51051c, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new ceg("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) v80.checkNotNull(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                okhVar.setFontSizeUnit(3);
                break;
            case "em":
                okhVar.setFontSizeUnit(2);
                break;
            case "px":
                okhVar.setFontSizeUnit(1);
                break;
            default:
                throw new ceg("Invalid unit for fontSize: '" + str2 + "'.");
        }
        okhVar.setFontSize(Float.parseFloat((String) v80.checkNotNull(matcher.group(1))));
    }

    private static C7963a parseFrameAndTickRates(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            v80.checkArgument(t0i.split(attributeValue2, C2473f.f17566z).length == 2, "frameRateMultiplier doesn't have 2 parts");
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        C7963a c7963a = f51067s;
        int i2 = c7963a.f51071b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = c7963a.f51072c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C7963a(i * f, i2, i3);
    }

    private static Map<String, okh> parseHeader(XmlPullParser xmlPullParser, Map<String, okh> map, int i, @hib C7964b c7964b, Map<String, lkh> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (bti.isStartTag(xmlPullParser, "style")) {
                String attributeValue = bti.getAttributeValue(xmlPullParser, "style");
                okh styleAttributes = parseStyleAttributes(xmlPullParser, new okh());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        styleAttributes.chain(map.get(str));
                    }
                }
                String id = styleAttributes.getId();
                if (id != null) {
                    map.put(id, styleAttributes);
                }
            } else if (bti.isStartTag(xmlPullParser, "region")) {
                lkh regionAttributes = parseRegionAttributes(xmlPullParser, i, c7964b, map);
                if (regionAttributes != null) {
                    map2.put(regionAttributes.f58012a, regionAttributes);
                }
            } else if (bti.isStartTag(xmlPullParser, "metadata")) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!bti.isEndTag(xmlPullParser, "head"));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (bti.isStartTag(xmlPullParser, "image") && (attributeValue = bti.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!bti.isEndTag(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000.ikh parseNode(org.xmlpull.v1.XmlPullParser r20, @p000.hib p000.ikh r21, java.util.Map<java.lang.String, p000.lkh> r22, p000.jkh.C7963a r23) throws p000.ceg {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jkh.parseNode(org.xmlpull.v1.XmlPullParser, ikh, java.util.Map, jkh$a):ikh");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0239  */
    @p000.hib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000.lkh parseRegionAttributes(org.xmlpull.v1.XmlPullParser r18, int r19, @p000.hib p000.jkh.C7964b r20, java.util.Map<java.lang.String, p000.okh> r21) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jkh.parseRegionAttributes(org.xmlpull.v1.XmlPullParser, int, jkh$b, java.util.Map):lkh");
    }

    private static float parseShear(String str) {
        Matcher matcher = f51062n.matcher(str);
        if (!matcher.matches()) {
            xh9.m25148w(f51051c, "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) v80.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e) {
            xh9.m25149w(f51051c, "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    private static okh parseStyleAttributes(XmlPullParser xmlPullParser, okh okhVar) {
        String attributeValue;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            switch (attributeName) {
                case "fontStyle":
                    okhVar = createIfNull(okhVar).setItalic("italic".equalsIgnoreCase(attributeValue));
                    break;
                case "extent":
                    okhVar = createIfNull(okhVar).setExtent(attributeValue);
                    break;
                case "fontFamily":
                    okhVar = createIfNull(okhVar).setFontFamily(attributeValue);
                    break;
                case "textAlign":
                    okhVar = createIfNull(okhVar).setTextAlign(parseAlignment(attributeValue));
                    break;
                case "origin":
                    okhVar = createIfNull(okhVar).setOrigin(attributeValue);
                    break;
                case "textDecoration":
                    String lowerCase = i80.toLowerCase(attributeValue);
                    lowerCase.hashCode();
                    switch (lowerCase) {
                        case "nounderline":
                            okhVar = createIfNull(okhVar).setUnderline(false);
                            break;
                        case "underline":
                            okhVar = createIfNull(okhVar).setUnderline(true);
                            break;
                        case "nolinethrough":
                            okhVar = createIfNull(okhVar).setLinethrough(false);
                            break;
                        case "linethrough":
                            okhVar = createIfNull(okhVar).setLinethrough(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    okhVar = createIfNull(okhVar).setBold("bold".equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        okhVar = createIfNull(okhVar).setId(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String lowerCase2 = i80.toLowerCase(attributeValue);
                    lowerCase2.hashCode();
                    switch (lowerCase2) {
                        case "baseContainer":
                        case "base":
                            okhVar = createIfNull(okhVar).setRubyType(2);
                            break;
                        case "container":
                            okhVar = createIfNull(okhVar).setRubyType(1);
                            break;
                        case "delimiter":
                            okhVar = createIfNull(okhVar).setRubyType(4);
                            break;
                        case "textContainer":
                        case "text":
                            okhVar = createIfNull(okhVar).setRubyType(3);
                            break;
                    }
                    break;
                case "color":
                    okhVar = createIfNull(okhVar);
                    try {
                        okhVar.setFontColor(t92.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        xh9.m25148w(f51051c, "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    okhVar = createIfNull(okhVar).setShearPercentage(parseShear(attributeValue));
                    break;
                case "textCombine":
                    String lowerCase3 = i80.toLowerCase(attributeValue);
                    lowerCase3.hashCode();
                    if (!lowerCase3.equals("all")) {
                        if (lowerCase3.equals("none")) {
                            okhVar = createIfNull(okhVar).setTextCombine(false);
                        }
                        break;
                    } else {
                        okhVar = createIfNull(okhVar).setTextCombine(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        okhVar = createIfNull(okhVar);
                        parseFontSize(attributeValue, okhVar);
                        break;
                    } catch (ceg unused2) {
                        xh9.m25148w(f51051c, "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    okhVar = createIfNull(okhVar).setTextEmphasis(drg.parse(attributeValue));
                    break;
                case "rubyPosition":
                    String lowerCase4 = i80.toLowerCase(attributeValue);
                    lowerCase4.hashCode();
                    if (!lowerCase4.equals("before")) {
                        if (lowerCase4.equals("after")) {
                            okhVar = createIfNull(okhVar).setRubyPosition(2);
                        }
                        break;
                    } else {
                        okhVar = createIfNull(okhVar).setRubyPosition(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    okhVar = createIfNull(okhVar);
                    try {
                        okhVar.setBackgroundColor(t92.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        xh9.m25148w(f51051c, "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    okhVar = createIfNull(okhVar).setMultiRowAlign(parseAlignment(attributeValue));
                    break;
            }
        }
        return okhVar;
    }

    private static String[] parseStyleIds(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : t0i.split(strTrim, "\\s+");
    }

    private static long parseTimeExpression(String str, C7963a c7963a) throws ceg {
        double d;
        double d2;
        double d3;
        Matcher matcher = f51059k.matcher(str);
        if (matcher.matches()) {
            double d4 = (Long.parseLong((String) v80.checkNotNull(matcher.group(1))) * 3600) + (Long.parseLong((String) v80.checkNotNull(matcher.group(2))) * 60) + Long.parseLong((String) v80.checkNotNull(matcher.group(3)));
            String strGroup = matcher.group(4);
            return (long) ((d4 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / c7963a.f51070a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) c7963a.f51071b)) / ((double) c7963a.f51070a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f51060l.matcher(str);
        if (!matcher2.matches()) {
            throw new ceg("Malformed time expression: " + str);
        }
        d = Double.parseDouble((String) v80.checkNotNull(matcher2.group(1)));
        String str2 = (String) v80.checkNotNull(matcher2.group(2));
        str2.hashCode();
        switch (str2) {
            case "f":
                d2 = c7963a.f51070a;
                d /= d2;
                return (long) (d * 1000000.0d);
            case "h":
                d3 = 3600.0d;
                break;
            case "m":
                d3 = 60.0d;
                break;
            case "t":
                d2 = c7963a.f51072c;
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
    private static C7964b parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = bti.getAttributeValue(xmlPullParser, "extent");
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = f51064p.matcher(attributeValue);
        if (!matcher.matches()) {
            xh9.m25148w(f51051c, "Ignoring non-pixel tts extent: " + attributeValue);
            return null;
        }
        try {
            return new C7964b(Integer.parseInt((String) v80.checkNotNull(matcher.group(1))), Integer.parseInt((String) v80.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            xh9.m25148w(f51051c, "Ignoring malformed tts extent: " + attributeValue);
            return null;
        }
    }

    @Override // p000.peg
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // p000.peg
    public void parse(byte[] bArr, int i, int i2, peg.C10937b c10937b, qu2<ba3> qu2Var) {
        y39.toCuesWithTiming(parseToLegacySubtitle(bArr, i, i2), c10937b, qu2Var);
    }

    @Override // p000.peg
    public ydg parseToLegacySubtitle(byte[] bArr, int i, int i2) {
        char c;
        C7963a c7963a;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f51069a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new lkh(""));
            C7964b ttsExtent = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C7963a frameAndTickRates = f51067s;
            rkh rkhVar = null;
            int i3 = 0;
            int cellRows = 15;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                ikh ikhVar = (ikh) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            frameAndTickRates = parseFrameAndTickRates(xmlPullParserNewPullParser);
                            c = 15;
                            cellRows = parseCellRows(xmlPullParserNewPullParser, 15);
                            ttsExtent = parseTtsExtent(xmlPullParserNewPullParser);
                        } else {
                            c = 15;
                        }
                        C7964b c7964b = ttsExtent;
                        C7963a c7963a2 = frameAndTickRates;
                        int i4 = cellRows;
                        if (isSupportedTag(name)) {
                            if ("head".equals(name)) {
                                c7963a = c7963a2;
                                parseHeader(xmlPullParserNewPullParser, map, i4, c7964b, map2, map3);
                            } else {
                                c7963a = c7963a2;
                                try {
                                    ikh node = parseNode(xmlPullParserNewPullParser, ikhVar, map2, c7963a);
                                    arrayDeque.push(node);
                                    if (ikhVar != null) {
                                        ikhVar.addChild(node);
                                    }
                                } catch (ceg e) {
                                    xh9.m25149w(f51051c, "Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            frameAndTickRates = c7963a;
                            ttsExtent = c7964b;
                            cellRows = i4;
                        } else {
                            xh9.m25146i(f51051c, "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i3++;
                            frameAndTickRates = c7963a2;
                            ttsExtent = c7964b;
                            cellRows = i4;
                        }
                    } else if (eventType == 4) {
                        ((ikh) v80.checkNotNull(ikhVar)).addChild(ikh.buildTextNode(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            rkhVar = new rkh((ikh) v80.checkNotNull((ikh) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (ydg) v80.checkNotNull(rkhVar);
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }
}
