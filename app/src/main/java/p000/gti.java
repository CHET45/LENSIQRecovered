package p000;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p000.kx7;
import p000.wza;

/* JADX INFO: loaded from: classes3.dex */
public final class gti {

    /* JADX INFO: renamed from: a */
    public static final String f41116a = "MotionPhotoXmpParser";

    /* JADX INFO: renamed from: b */
    public static final String[] f41117b = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: c */
    public static final String[] f41118c = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: d */
    public static final String[] f41119d = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private gti() {
    }

    @hib
    public static wza parse(String str) throws IOException {
        try {
            return parseInternal(str);
        } catch (NumberFormatException | XmlPullParserException | yhc unused) {
            xh9.m25148w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    @hib
    private static wza parseInternal(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!bti.isStartTag(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw yhc.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        kx7<wza.C14849a> kx7VarM15110of = kx7.m15110of();
        long motionPhotoPresentationTimestampUsFromDescription = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (bti.isStartTag(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!parseMotionPhotoFlagFromDescription(xmlPullParserNewPullParser)) {
                    return null;
                }
                motionPhotoPresentationTimestampUsFromDescription = parseMotionPhotoPresentationTimestampUsFromDescription(xmlPullParserNewPullParser);
                kx7VarM15110of = parseMicroVideoOffsetFromDescription(xmlPullParserNewPullParser);
            } else if (bti.isStartTag(xmlPullParserNewPullParser, "Container:Directory")) {
                kx7VarM15110of = parseMotionPhotoV1Directory(xmlPullParserNewPullParser, "Container", "Item");
            } else if (bti.isStartTag(xmlPullParserNewPullParser, "GContainer:Directory")) {
                kx7VarM15110of = parseMotionPhotoV1Directory(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!bti.isEndTag(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (kx7VarM15110of.isEmpty()) {
            return null;
        }
        return new wza(motionPhotoPresentationTimestampUsFromDescription, kx7VarM15110of);
    }

    private static kx7<wza.C14849a> parseMicroVideoOffsetFromDescription(XmlPullParser xmlPullParser) {
        for (String str : f41119d) {
            String attributeValue = bti.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return kx7.m15112of(new wza.C14849a("image/jpeg", "Primary", 0L, 0L), new wza.C14849a("video/mp4", "MotionPhoto", Long.parseLong(attributeValue), 0L));
            }
        }
        return kx7.m15110of();
    }

    private static boolean parseMotionPhotoFlagFromDescription(XmlPullParser xmlPullParser) {
        for (String str : f41117b) {
            String attributeValue = bti.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return Integer.parseInt(attributeValue) == 1;
            }
        }
        return false;
    }

    private static long parseMotionPhotoPresentationTimestampUsFromDescription(XmlPullParser xmlPullParser) {
        for (String str : f41118c) {
            String attributeValue = bti.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                long j = Long.parseLong(attributeValue);
                if (j == -1) {
                    return -9223372036854775807L;
                }
                return j;
            }
        }
        return -9223372036854775807L;
    }

    private static kx7<wza.C14849a> parseMotionPhotoV1Directory(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        kx7.C8541a c8541aBuilder = kx7.builder();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (bti.isStartTag(xmlPullParser, str3)) {
                String attributeValue = bti.getAttributeValue(xmlPullParser, str2 + ":Mime");
                String attributeValue2 = bti.getAttributeValue(xmlPullParser, str2 + ":Semantic");
                String attributeValue3 = bti.getAttributeValue(xmlPullParser, str2 + ":Length");
                String attributeValue4 = bti.getAttributeValue(xmlPullParser, str2 + ":Padding");
                if (attributeValue == null || attributeValue2 == null) {
                    return kx7.m15110of();
                }
                c8541aBuilder.add(new wza.C14849a(attributeValue, attributeValue2, attributeValue3 != null ? Long.parseLong(attributeValue3) : 0L, attributeValue4 != null ? Long.parseLong(attributeValue4) : 0L));
            }
        } while (!bti.isEndTag(xmlPullParser, str4));
        return c8541aBuilder.build();
    }
}
