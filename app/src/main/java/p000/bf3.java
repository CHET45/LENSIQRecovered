package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p000.dic;
import p000.kq6;
import p000.uue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class bf3 extends DefaultHandler implements dic.InterfaceC4797a<af3> {

    /* JADX INFO: renamed from: b */
    public static final String f13602b = "MpdParser";

    /* JADX INFO: renamed from: c */
    public static final Pattern f13603c = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: d */
    public static final Pattern f13604d = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: e */
    public static final Pattern f13605e = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: f */
    public static final int[] f13606f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a */
    public final XmlPullParserFactory f13607a;

    /* JADX INFO: renamed from: bf3$a */
    public static final class C1874a {

        /* JADX INFO: renamed from: a */
        public final kq6 f13608a;

        /* JADX INFO: renamed from: b */
        public final kx7<ru0> f13609b;

        /* JADX INFO: renamed from: c */
        public final uue f13610c;

        /* JADX INFO: renamed from: d */
        @hib
        public final String f13611d;

        /* JADX INFO: renamed from: e */
        public final ArrayList<DrmInitData.SchemeData> f13612e;

        /* JADX INFO: renamed from: f */
        public final ArrayList<k74> f13613f;

        /* JADX INFO: renamed from: g */
        public final long f13614g;

        /* JADX INFO: renamed from: h */
        public final List<k74> f13615h;

        /* JADX INFO: renamed from: i */
        public final List<k74> f13616i;

        public C1874a(kq6 kq6Var, List<ru0> list, uue uueVar, @hib String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<k74> arrayList2, List<k74> list2, List<k74> list3, long j) {
            this.f13608a = kq6Var;
            this.f13609b = kx7.copyOf((Collection) list);
            this.f13610c = uueVar;
            this.f13611d = str;
            this.f13612e = arrayList;
            this.f13613f = arrayList2;
            this.f13615h = list2;
            this.f13616i = list3;
            this.f13614g = j;
        }
    }

    public bf3() {
        try {
            this.f13607a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m3090A(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: B */
    public static long m3091B(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : x0i.parseXsDuration(attributeValue);
    }

    /* JADX INFO: renamed from: C */
    public static String m3092C(List<k74> list) {
        for (int i = 0; i < list.size(); i++) {
            k74 k74Var = list.get(i);
            String str = k74Var.f52718a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(k74Var.f52719b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(k74Var.f52719b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* JADX INFO: renamed from: G */
    public static float m3093G(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    /* JADX INFO: renamed from: H */
    public static float m3094H(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f13603c.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
    }

    /* JADX INFO: renamed from: J */
    public static int m3095J(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    /* JADX INFO: renamed from: L */
    public static long m3096L(List<k74> list) {
        for (int i = 0; i < list.size(); i++) {
            k74 k74Var = list.get(i);
            if (i80.equalsIgnoreCase("http://dashif.org/guidelines/last-segment-number", k74Var.f52718a)) {
                return Long.parseLong(k74Var.f52719b);
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: M */
    public static long m3097M(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* JADX INFO: renamed from: O */
    public static int m3098O(XmlPullParser xmlPullParser) {
        int iM3095J = m3095J(xmlPullParser, "value", -1);
        if (iM3095J < 0) {
            return -1;
        }
        int[] iArr = f13606f;
        if (iM3095J < iArr.length) {
            return iArr[iM3095J];
        }
        return -1;
    }

    private long addSegmentTimelineElementsToList(List<uue.C13718d> list, long j, long j2, int i, long j3) {
        int iCeilDivide = i >= 0 ? i + 1 : (int) x0i.ceilDivide(j3 - j, j2);
        for (int i2 = 0; i2 < iCeilDivide; i2++) {
            list.add(m3142k(j, j2));
            j += j2;
        }
        return j;
    }

    private static int checkContentTypeConsistency(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        u80.checkState(i == i2);
        return i;
    }

    @hib
    private static String checkLanguageConsistency(@hib String str, @hib String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        u80.checkState(str.equals(str2));
        return str;
    }

    private static void fillInClearKeyInformation(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i);
            if (kk1.f54456f2.equals(schemeData.f19398b) && (str = schemeData.f19399c) != null) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str == null) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            DrmInitData.SchemeData schemeData2 = arrayList.get(i2);
            if (kk1.f54451e2.equals(schemeData2.f19398b) && schemeData2.f19399c == null) {
                arrayList.set(i2, new DrmInitData.SchemeData(kk1.f54456f2, str, schemeData2.f19400d, schemeData2.f19401e));
            }
        }
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.hasData()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i).canReplace(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static String m3099g0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    private static long getFinalAvailabilityTimeOffset(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    @hib
    private static String getSampleMimeType(@hib String str, @hib String str2) {
        if (sva.isAudio(str)) {
            return sva.getAudioMediaMimeType(str2);
        }
        if (sva.isVideo(str)) {
            return sva.getVideoMediaMimeType(str2);
        }
        if (sva.isText(str) || sva.isImage(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String mediaMimeType = sva.getMediaMimeType(str2);
        return "text/vtt".equals(mediaMimeType) ? "application/x-mp4-vtt" : mediaMimeType;
    }

    /* JADX INFO: renamed from: h0 */
    public static String m3100h0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!ati.isEndTag(xmlPullParser, str));
        return text;
    }

    private boolean isDvbProfileDeclared(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (ati.isStartTag(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (ati.isStartTag(xmlPullParser)) {
                    i++;
                } else if (ati.isEndTag(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static int m3101s(List<k74> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            k74 k74Var = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(k74Var.f52718a) && (str = k74Var.f52719b) != null) {
                Matcher matcher = f13604d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                yh9.m25919w(f13602b, "Unable to parse CEA-608 channel number from: " + k74Var.f52719b);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: t */
    public static int m3102t(List<k74> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            k74 k74Var = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(k74Var.f52718a) && (str = k74Var.f52719b) != null) {
                Matcher matcher = f13605e.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                yh9.m25919w(f13602b, "Unable to parse CEA-708 service block number from: " + k74Var.f52719b);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: w */
    public static long m3103w(XmlPullParser xmlPullParser, String str, long j) throws xhc {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : x0i.parseXsDateTime(attributeValue);
    }

    /* JADX INFO: renamed from: x */
    public static k74 m3104x(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strM3099g0 = m3099g0(xmlPullParser, "schemeIdUri", "");
        String strM3099g02 = m3099g0(xmlPullParser, "value", null);
        String strM3099g03 = m3099g0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!ati.isEndTag(xmlPullParser, str));
        return new k74(strM3099g0, strM3099g02, strM3099g03);
    }

    /* JADX INFO: renamed from: y */
    public static int m3105y(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String lowerCase = i80.toLowerCase(attributeValue);
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public static int m3106z(XmlPullParser xmlPullParser) {
        int iM3095J = m3095J(xmlPullParser, "value", -1);
        if (iM3095J <= 0 || iM3095J >= 33) {
            return -1;
        }
        return iM3095J;
    }

    /* JADX INFO: renamed from: D */
    public Pair<Long, EventMessage> m3107D(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jM3097M = m3097M(xmlPullParser, "id", 0L);
        long jM3097M2 = m3097M(xmlPullParser, "duration", -9223372036854775807L);
        long jM3097M3 = m3097M(xmlPullParser, "presentationTime", 0L);
        long jScaleLargeTimestamp = x0i.scaleLargeTimestamp(jM3097M2, 1000L, j);
        long jScaleLargeTimestamp2 = x0i.scaleLargeTimestamp(jM3097M3 - j2, 1000000L, j);
        String strM3099g0 = m3099g0(xmlPullParser, "messageData", null);
        byte[] bArrM3108E = m3108E(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jScaleLargeTimestamp2);
        if (strM3099g0 != null) {
            bArrM3108E = x0i.getUtf8Bytes(strM3099g0);
        }
        return Pair.create(lValueOf, m3126b(str, str2, jM3097M, jScaleLargeTimestamp, bArrM3108E));
    }

    /* JADX INFO: renamed from: E */
    public byte[] m3108E(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, yw1.f103176c.name());
        xmlPullParser.nextToken();
        while (!ati.isEndTag(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: F */
    public a75 m3109F(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        long j;
        ArrayList arrayList;
        String strM3099g0 = m3099g0(xmlPullParser, "schemeIdUri", "");
        String strM3099g02 = m3099g0(xmlPullParser, "value", "");
        long jM3097M = m3097M(xmlPullParser, "timescale", 1L);
        long jM3097M2 = m3097M(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (ati.isStartTag(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j2 = jM3097M2;
                j = jM3097M2;
                arrayList = arrayList2;
                arrayList.add(m3107D(xmlPullParser, strM3099g0, strM3099g02, jM3097M, j2, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j = jM3097M2;
                arrayList = arrayList2;
                maybeSkipTag(xmlPullParser);
            }
            if (ati.isEndTag(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            jM3097M2 = j;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return m3128c(strM3099g0, strM3099g02, jM3097M, jArr, eventMessageArr);
    }

    /* JADX INFO: renamed from: I */
    public hpd m3110I(XmlPullParser xmlPullParser) {
        return m3116S(xmlPullParser, "sourceURL", "range");
    }

    /* JADX INFO: renamed from: K */
    public String m3111K(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return m3100h0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6 A[LOOP:0: B:24:0x00a2->B:81:0x01e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.af3 m3112N(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bf3.m3112N(org.xmlpull.v1.XmlPullParser, android.net.Uri):af3");
    }

    /* JADX INFO: renamed from: P */
    public Pair<vnc, Long> m3113P(XmlPullParser xmlPullParser, List<ru0> list, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        long j5;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j6;
        uue uueVarM3125a0;
        bf3 bf3Var = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long jM3091B = m3091B(xmlPullParser2, "start", j);
        long j7 = -9223372036854775807L;
        long j8 = j3 != -9223372036854775807L ? j3 + jM3091B : -9223372036854775807L;
        long jM3091B2 = m3091B(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long jM3150q = j2;
        boolean z2 = false;
        long j9 = -9223372036854775807L;
        uue uueVarM3122Y = null;
        k74 k74VarM3104x = null;
        while (true) {
            xmlPullParser.next();
            if (ati.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    jM3150q = bf3Var.m3150q(xmlPullParser2, jM3150q);
                    z2 = true;
                }
                arrayList6.addAll(bf3Var.m3151r(xmlPullParser2, list, z));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j6 = j7;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (ati.isStartTag(xmlPullParser2, "AdaptationSet")) {
                    j5 = jM3150q;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(m3147n(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, uueVarM3122Y, jM3091B2, jM3150q, j9, j8, j4, z));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j5 = jM3150q;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (ati.isStartTag(xmlPullParser2, "EventStream")) {
                        arrayList7.add(m3109F(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else if (ati.isStartTag(xmlPullParser2, "SegmentBase")) {
                        arrayList3 = arrayList7;
                        uueVarM3122Y = m3122Y(xmlPullParser2, null);
                        obj = null;
                        jM3150q = j5;
                        j6 = -9223372036854775807L;
                    } else {
                        arrayList3 = arrayList7;
                        if (ati.isStartTag(xmlPullParser2, "SegmentList")) {
                            long jM3150q2 = m3150q(xmlPullParser2, -9223372036854775807L);
                            obj = null;
                            uueVarM3125a0 = m3123Z(xmlPullParser, null, j8, jM3091B2, j5, jM3150q2, j4);
                            j9 = jM3150q2;
                            jM3150q = j5;
                            j6 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (ati.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                long jM3150q3 = m3150q(xmlPullParser2, -9223372036854775807L);
                                j6 = -9223372036854775807L;
                                uueVarM3125a0 = m3125a0(xmlPullParser, null, kx7.m15110of(), j8, jM3091B2, j5, jM3150q3, j4);
                                j9 = jM3150q3;
                                jM3150q = j5;
                            } else {
                                j6 = -9223372036854775807L;
                                if (ati.isStartTag(xmlPullParser2, "AssetIdentifier")) {
                                    k74VarM3104x = m3104x(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    maybeSkipTag(xmlPullParser);
                                }
                                jM3150q = j5;
                            }
                        }
                        uueVarM3122Y = uueVarM3125a0;
                    }
                }
                obj = null;
                j6 = -9223372036854775807L;
                jM3150q = j5;
            }
            if (ati.isEndTag(xmlPullParser2, "Period")) {
                return Pair.create(m3134f(attributeValue, jM3091B, arrayList2, arrayList3, k74VarM3104x), Long.valueOf(jM3091B2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j7 = j6;
            bf3Var = this;
        }
    }

    /* JADX INFO: renamed from: Q */
    public String[] m3114Q(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    /* JADX INFO: renamed from: R */
    public hed m3115R(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strM3099g0 = m3099g0(xmlPullParser, "moreInformationURL", null);
        String strM3099g02 = m3099g0(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (ati.isStartTag(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (ati.isStartTag(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (ati.isStartTag(xmlPullParser, k95.f53095a0)) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str = strNextText3;
            if (ati.isEndTag(xmlPullParser, "ProgramInformation")) {
                return new hed(strNextText, strNextText2, str, strM3099g0, strM3099g02);
            }
            strNextText3 = str;
        }
    }

    /* JADX INFO: renamed from: S */
    public hpd m3116S(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return m3136g(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return m3136g(attributeValue, j, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ee A[LOOP:0: B:3:0x006a->B:57:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198 A[EDGE_INSN: B:58:0x0198->B:47:0x0198 BREAK  A[LOOP:0: B:3:0x006a->B:57:0x01ee], SYNTHETIC] */
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.bf3.C1874a m3117T(org.xmlpull.v1.XmlPullParser r36, java.util.List<p000.ru0> r37, @p000.hib java.lang.String r38, @p000.hib java.lang.String r39, int r40, int r41, float r42, int r43, int r44, @p000.hib java.lang.String r45, java.util.List<p000.k74> r46, java.util.List<p000.k74> r47, java.util.List<p000.k74> r48, java.util.List<p000.k74> r49, @p000.hib p000.uue r50, long r51, long r53, long r55, long r57, long r59, boolean r61) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bf3.m3117T(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, uue, long, long, long, long, long, boolean):bf3$a");
    }

    /* JADX INFO: renamed from: U */
    public int m3118U(List<k74> list) {
        int iM3141j0;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            k74 k74Var = list.get(i2);
            if (i80.equalsIgnoreCase("urn:mpeg:dash:role:2011", k74Var.f52718a)) {
                iM3141j0 = m3119V(k74Var.f52719b);
            } else if (i80.equalsIgnoreCase("urn:tva:metadata:cs:AudioPurposeCS:2007", k74Var.f52718a)) {
                iM3141j0 = m3141j0(k74Var.f52719b);
            }
            i |= iM3141j0;
        }
        return i;
    }

    /* JADX INFO: renamed from: V */
    public int m3119V(@hib String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: W */
    public int m3120W(List<k74> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i80.equalsIgnoreCase("http://dashif.org/guidelines/trickmode", list.get(i2).f52718a)) {
                i = 16384;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: X */
    public int m3121X(List<k74> list) {
        int iM3119V = 0;
        for (int i = 0; i < list.size(); i++) {
            k74 k74Var = list.get(i);
            if (i80.equalsIgnoreCase("urn:mpeg:dash:role:2011", k74Var.f52718a)) {
                iM3119V |= m3119V(k74Var.f52719b);
            }
        }
        return iM3119V;
    }

    /* JADX INFO: renamed from: Y */
    public uue.C13719e m3122Y(XmlPullParser xmlPullParser, @hib uue.C13719e c13719e) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long jM3097M = m3097M(xmlPullParser, "timescale", c13719e != null ? c13719e.f89160b : 1L);
        long jM3097M2 = m3097M(xmlPullParser, "presentationTimeOffset", c13719e != null ? c13719e.f89161c : 0L);
        long j3 = c13719e != null ? c13719e.f89174d : 0L;
        long j4 = c13719e != null ? c13719e.f89175e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j2 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j2) + 1;
        } else {
            j = j4;
            j2 = j3;
        }
        hpd hpdVarM3110I = c13719e != null ? c13719e.f89159a : null;
        do {
            xmlPullParser.next();
            if (ati.isStartTag(xmlPullParser, "Initialization")) {
                hpdVarM3110I = m3110I(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!ati.isEndTag(xmlPullParser, "SegmentBase"));
        return m3144l(hpdVarM3110I, jM3097M, jM3097M2, j2, j);
    }

    /* JADX INFO: renamed from: Z */
    public uue.C13716b m3123Z(XmlPullParser xmlPullParser, @hib uue.C13716b c13716b, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long jM3097M = m3097M(xmlPullParser, "timescale", c13716b != null ? c13716b.f89160b : 1L);
        long jM3097M2 = m3097M(xmlPullParser, "presentationTimeOffset", c13716b != null ? c13716b.f89161c : 0L);
        long jM3097M3 = m3097M(xmlPullParser, "duration", c13716b != null ? c13716b.f89163e : -9223372036854775807L);
        long jM3097M4 = m3097M(xmlPullParser, "startNumber", c13716b != null ? c13716b.f89162d : 1L);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        List<uue.C13718d> listM3127b0 = null;
        List<hpd> arrayList = null;
        hpd hpdVarM3110I = null;
        do {
            xmlPullParser.next();
            if (ati.isStartTag(xmlPullParser, "Initialization")) {
                hpdVarM3110I = m3110I(xmlPullParser);
            } else if (ati.isStartTag(xmlPullParser, "SegmentTimeline")) {
                listM3127b0 = m3127b0(xmlPullParser, jM3097M, j2);
            } else if (ati.isStartTag(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(m3129c0(xmlPullParser));
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!ati.isEndTag(xmlPullParser, "SegmentList"));
        if (c13716b != null) {
            if (hpdVarM3110I == null) {
                hpdVarM3110I = c13716b.f89159a;
            }
            if (listM3127b0 == null) {
                listM3127b0 = c13716b.f89164f;
            }
            if (arrayList == null) {
                arrayList = c13716b.f89168j;
            }
        }
        return m3138i(hpdVarM3110I, jM3097M, jM3097M2, jM3097M4, jM3097M3, listM3127b0, finalAvailabilityTimeOffset, arrayList, j5, j);
    }

    /* JADX INFO: renamed from: a */
    public C8362kh m3124a(long j, int i, List<n3e> list, List<k74> list2, List<k74> list3, List<k74> list4) {
        return new C8362kh(j, i, list, list2, list3, list4);
    }

    /* JADX INFO: renamed from: a0 */
    public uue.C13717c m3125a0(XmlPullParser xmlPullParser, @hib uue.C13717c c13717c, List<k74> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long jM3097M = m3097M(xmlPullParser, "timescale", c13717c != null ? c13717c.f89160b : 1L);
        long jM3097M2 = m3097M(xmlPullParser, "presentationTimeOffset", c13717c != null ? c13717c.f89161c : 0L);
        long jM3097M3 = m3097M(xmlPullParser, "duration", c13717c != null ? c13717c.f89163e : -9223372036854775807L);
        long jM3097M4 = m3097M(xmlPullParser, "startNumber", c13717c != null ? c13717c.f89162d : 1L);
        long jM3096L = m3096L(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        List<uue.C13718d> listM3127b0 = null;
        iyh iyhVarM3143k0 = m3143k0(xmlPullParser, "media", c13717c != null ? c13717c.f89170k : null);
        iyh iyhVarM3143k02 = m3143k0(xmlPullParser, "initialization", c13717c != null ? c13717c.f89169j : null);
        hpd hpdVarM3110I = null;
        do {
            xmlPullParser.next();
            if (ati.isStartTag(xmlPullParser, "Initialization")) {
                hpdVarM3110I = m3110I(xmlPullParser);
            } else if (ati.isStartTag(xmlPullParser, "SegmentTimeline")) {
                listM3127b0 = m3127b0(xmlPullParser, jM3097M, j2);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!ati.isEndTag(xmlPullParser, "SegmentTemplate"));
        if (c13717c != null) {
            if (hpdVarM3110I == null) {
                hpdVarM3110I = c13717c.f89159a;
            }
            if (listM3127b0 == null) {
                listM3127b0 = c13717c.f89164f;
            }
        }
        return m3140j(hpdVarM3110I, jM3097M, jM3097M2, jM3097M4, jM3096L, jM3097M3, listM3127b0, finalAvailabilityTimeOffset, iyhVarM3143k02, iyhVarM3143k0, j5, j);
    }

    /* JADX INFO: renamed from: b */
    public EventMessage m3126b(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    /* JADX INFO: renamed from: b0 */
    public List<uue.C13718d> m3127b0(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jAddSegmentTimelineElementsToList = 0;
        long jM3097M = -9223372036854775807L;
        boolean z = false;
        int iM3095J = 0;
        do {
            xmlPullParser.next();
            if (ati.isStartTag(xmlPullParser, k95.f53020R4)) {
                long jM3097M2 = m3097M(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    jAddSegmentTimelineElementsToList = addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, jM3097M, iM3095J, jM3097M2);
                }
                if (jM3097M2 == -9223372036854775807L) {
                    jM3097M2 = jAddSegmentTimelineElementsToList;
                }
                jM3097M = m3097M(xmlPullParser, "d", -9223372036854775807L);
                iM3095J = m3095J(xmlPullParser, "r", 0);
                z = true;
                jAddSegmentTimelineElementsToList = jM3097M2;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!ati.isEndTag(xmlPullParser, "SegmentTimeline"));
        if (z) {
            addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, jM3097M, iM3095J, x0i.scaleLargeTimestamp(j2, j, 1000L));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public a75 m3128c(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new a75(str, str2, j, jArr, eventMessageArr);
    }

    /* JADX INFO: renamed from: c0 */
    public hpd m3129c0(XmlPullParser xmlPullParser) {
        return m3116S(xmlPullParser, "media", "mediaRange");
    }

    /* JADX INFO: renamed from: d */
    public kq6 m3130d(@hib String str, @hib String str2, int i, int i2, float f, int i3, int i4, int i5, @hib String str3, List<k74> list, List<k74> list2, @hib String str4, List<k74> list3, List<k74> list4) {
        String str5 = str4;
        String sampleMimeType = getSampleMimeType(str2, str5);
        if ("audio/eac3".equals(sampleMimeType)) {
            sampleMimeType = m3092C(list4);
            if ("audio/eac3-joc".equals(sampleMimeType)) {
                str5 = "ec+3";
            }
        }
        int iM3133e0 = m3133e0(list);
        int iM3121X = m3121X(list) | m3118U(list2) | m3120W(list3) | m3120W(list4);
        Pair<Integer, Integer> pairM3139i0 = m3139i0(list3);
        kq6.C8497b language = new kq6.C8497b().setId(str).setContainerMimeType(str2).setSampleMimeType(sampleMimeType).setCodecs(str5).setPeakBitrate(i5).setSelectionFlags(iM3133e0).setRoleFlags(iM3121X).setLanguage(str3);
        int iM3102t = -1;
        kq6.C8497b tileCountVertical = language.setTileCountHorizontal(pairM3139i0 != null ? ((Integer) pairM3139i0.first).intValue() : -1).setTileCountVertical(pairM3139i0 != null ? ((Integer) pairM3139i0.second).intValue() : -1);
        if (sva.isVideo(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2).setFrameRate(f);
        } else if (sva.isAudio(sampleMimeType)) {
            tileCountVertical.setChannelCount(i3).setSampleRate(i4);
        } else if (sva.isText(sampleMimeType)) {
            if ("application/cea-608".equals(sampleMimeType)) {
                iM3102t = m3101s(list2);
            } else if ("application/cea-708".equals(sampleMimeType)) {
                iM3102t = m3102t(list2);
            }
            tileCountVertical.setAccessibilityChannel(iM3102t);
        } else if (sva.isImage(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2);
        }
        return tileCountVertical.build();
    }

    /* JADX INFO: renamed from: d0 */
    public int m3131d0(@hib String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    /* JADX INFO: renamed from: e */
    public af3 m3132e(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @hib hed hedVar, @hib kzh kzhVar, @hib j4f j4fVar, @hib Uri uri, List<vnc> list) {
        return new af3(j, j2, j3, z, j4, j5, j6, j7, hedVar, kzhVar, j4fVar, uri, list);
    }

    /* JADX INFO: renamed from: e0 */
    public int m3133e0(List<k74> list) {
        int iM3131d0 = 0;
        for (int i = 0; i < list.size(); i++) {
            k74 k74Var = list.get(i);
            if (i80.equalsIgnoreCase("urn:mpeg:dash:role:2011", k74Var.f52718a)) {
                iM3131d0 |= m3131d0(k74Var.f52719b);
            }
        }
        return iM3131d0;
    }

    /* JADX INFO: renamed from: f */
    public vnc m3134f(@hib String str, long j, List<C8362kh> list, List<a75> list2, @hib k74 k74Var) {
        return new vnc(str, j, list, list2, k74Var);
    }

    /* JADX INFO: renamed from: f0 */
    public j4f m3135f0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long jM3097M = -9223372036854775807L;
        long jM3097M2 = -9223372036854775807L;
        long jM3097M3 = -9223372036854775807L;
        float fM3093G = -3.4028235E38f;
        float fM3093G2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (ati.isStartTag(xmlPullParser, "Latency")) {
                jM3097M = m3097M(xmlPullParser, "target", -9223372036854775807L);
                jM3097M2 = m3097M(xmlPullParser, "min", -9223372036854775807L);
                jM3097M3 = m3097M(xmlPullParser, "max", -9223372036854775807L);
            } else if (ati.isStartTag(xmlPullParser, "PlaybackRate")) {
                fM3093G = m3093G(xmlPullParser, "min", -3.4028235E38f);
                fM3093G2 = m3093G(xmlPullParser, "max", -3.4028235E38f);
            }
            long j = jM3097M;
            long j2 = jM3097M2;
            long j3 = jM3097M3;
            float f = fM3093G;
            float f2 = fM3093G2;
            if (ati.isEndTag(xmlPullParser, "ServiceDescription")) {
                return new j4f(j, j2, j3, f, f2);
            }
            jM3097M = j;
            jM3097M2 = j2;
            jM3097M3 = j3;
            fM3093G = f;
            fM3093G2 = f2;
        }
    }

    /* JADX INFO: renamed from: g */
    public hpd m3136g(String str, long j, long j2) {
        return new hpd(str, j, j2);
    }

    /* JADX INFO: renamed from: h */
    public n3e m3137h(C1874a c1874a, @hib String str, @hib String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<k74> arrayList2) {
        kq6.C8497b c8497bBuildUpon = c1874a.f13608a.buildUpon();
        if (str != null) {
            c8497bBuildUpon.setLabel(str);
        }
        String str3 = c1874a.f13611d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = c1874a.f13612e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            fillInClearKeyInformation(arrayList3);
            filterRedundantIncompleteSchemeDatas(arrayList3);
            c8497bBuildUpon.setDrmInitData(new DrmInitData(str2, arrayList3));
        }
        ArrayList<k74> arrayList4 = c1874a.f13613f;
        arrayList4.addAll(arrayList2);
        return n3e.newInstance(c1874a.f13614g, c8497bBuildUpon.build(), c1874a.f13609b, c1874a.f13610c, arrayList4, c1874a.f13615h, c1874a.f13616i, null);
    }

    /* JADX INFO: renamed from: i */
    public uue.C13716b m3138i(hpd hpdVar, long j, long j2, long j3, long j4, @hib List<uue.C13718d> list, long j5, @hib List<hpd> list2, long j6, long j7) {
        return new uue.C13716b(hpdVar, j, j2, j3, j4, list, j5, list2, x0i.msToUs(j6), x0i.msToUs(j7));
    }

    @hib
    /* JADX INFO: renamed from: i0 */
    public Pair<Integer, Integer> m3139i0(List<k74> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            k74 k74Var = list.get(i);
            if ((i80.equalsIgnoreCase("http://dashif.org/thumbnail_tile", k74Var.f52718a) || i80.equalsIgnoreCase("http://dashif.org/guidelines/thumbnail_tile", k74Var.f52718a)) && (str = k74Var.f52719b) != null) {
                String[] strArrSplit = x0i.split(str, "x");
                if (strArrSplit.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public uue.C13717c m3140j(hpd hpdVar, long j, long j2, long j3, long j4, long j5, List<uue.C13718d> list, long j6, @hib iyh iyhVar, @hib iyh iyhVar2, long j7, long j8) {
        return new uue.C13717c(hpdVar, j, j2, j3, j4, j5, list, j6, iyhVar, iyhVar2, x0i.msToUs(j7), x0i.msToUs(j8));
    }

    /* JADX INFO: renamed from: j0 */
    public int m3141j0(@hib String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public uue.C13718d m3142k(long j, long j2) {
        return new uue.C13718d(j, j2);
    }

    @hib
    /* JADX INFO: renamed from: k0 */
    public iyh m3143k0(XmlPullParser xmlPullParser, String str, @hib iyh iyhVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? iyh.compile(attributeValue) : iyhVar;
    }

    /* JADX INFO: renamed from: l */
    public uue.C13719e m3144l(hpd hpdVar, long j, long j2, long j3, long j4) {
        return new uue.C13719e(hpdVar, j, j2, j3, j4);
    }

    /* JADX INFO: renamed from: l0 */
    public kzh m3145l0(XmlPullParser xmlPullParser) {
        return m3146m(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    /* JADX INFO: renamed from: m */
    public kzh m3146m(String str, String str2) {
        return new kzh(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0310 A[LOOP:0: B:3:0x007e->B:71:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d0 A[EDGE_INSN: B:72:0x02d0->B:65:0x02d0 BREAK  A[LOOP:0: B:3:0x007e->B:71:0x0310], SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.C8362kh m3147n(org.xmlpull.v1.XmlPullParser r56, java.util.List<p000.ru0> r57, @p000.hib p000.uue r58, long r59, long r61, long r63, long r65, long r67, boolean r69) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bf3.m3147n(org.xmlpull.v1.XmlPullParser, java.util.List, uue, long, long, long, long, long, boolean):kh");
    }

    /* JADX INFO: renamed from: o */
    public void m3148o(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        maybeSkipTag(xmlPullParser);
    }

    /* JADX INFO: renamed from: p */
    public int m3149p(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int iM3106z;
        String strM3099g0 = m3099g0(xmlPullParser, "schemeIdUri", null);
        strM3099g0.hashCode();
        iM3106z = -1;
        switch (strM3099g0) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                iM3106z = m3106z(xmlPullParser);
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iM3106z = m3095J(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                iM3106z = m3105y(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                iM3106z = m3098O(xmlPullParser);
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                iM3106z = m3090A(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!ati.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        return iM3106z;
    }

    /* JADX INFO: renamed from: q */
    public long m3150q(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* JADX INFO: renamed from: r */
    public List<ru0> m3151r(XmlPullParser xmlPullParser, List<ru0> list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strM3100h0 = m3100h0(xmlPullParser, "BaseURL");
        if (byh.isAbsolute(strM3100h0)) {
            if (attributeValue3 == null) {
                attributeValue3 = strM3100h0;
            }
            return eb9.newArrayList(new ru0(strM3100h0, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ru0 ru0Var = list.get(i3);
            String strResolve = byh.resolve(ru0Var.f79575a, strM3100h0);
            String str = attributeValue3 == null ? strResolve : attributeValue3;
            if (z) {
                i = ru0Var.f79577c;
                i2 = ru0Var.f79578d;
                str = ru0Var.f79576b;
            }
            arrayList.add(new ru0(strResolve, str, i, i2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData.SchemeData> m3152u(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bf3.m3152u(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* JADX INFO: renamed from: v */
    public int m3153v(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.dic.InterfaceC4797a
    public af3 parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f13607a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return m3112N(xmlPullParserNewPullParser, uri);
            }
            throw xhc.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e) {
            throw xhc.createForMalformedManifest(null, e);
        }
    }
}
