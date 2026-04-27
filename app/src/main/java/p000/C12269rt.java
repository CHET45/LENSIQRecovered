package p000;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p000.C11673qt;

/* JADX INFO: renamed from: rt */
/* JADX INFO: loaded from: classes5.dex */
public final class C12269rt {

    /* JADX INFO: renamed from: a */
    public static final String f79407a = "AndroidManifest.xml";

    /* JADX INFO: renamed from: b */
    public static final String f79408b = "http://schemas.android.com/apk/res/android";

    /* JADX INFO: renamed from: c */
    public static final String f79409c = "manifest";

    /* JADX INFO: renamed from: d */
    public static final String f79410d = "uses-sdk";

    /* JADX INFO: renamed from: e */
    public static final String f79411e = "uses-permission";

    /* JADX INFO: renamed from: f */
    public static final String f79412f = "uses-permission-sdk-23";

    /* JADX INFO: renamed from: g */
    public static final String f79413g = "uses-permission-sdk-m";

    /* JADX INFO: renamed from: h */
    public static final String f79414h = "application";

    /* JADX INFO: renamed from: i */
    public static final String f79415i = "activity";

    /* JADX INFO: renamed from: j */
    public static final String f79416j = "activity-alias";

    /* JADX INFO: renamed from: k */
    public static final String f79417k = "service";

    /* JADX INFO: renamed from: l */
    public static final String f79418l = "package";

    /* JADX INFO: renamed from: m */
    public static final String f79419m = "name";

    /* JADX INFO: renamed from: n */
    public static final String f79420n = "maxSdkVersion";

    /* JADX INFO: renamed from: o */
    public static final String f79421o = "minSdkVersion";

    /* JADX INFO: renamed from: p */
    public static final String f79422p = "usesPermissionFlags";

    /* JADX INFO: renamed from: q */
    public static final String f79423q = "requestLegacyExternalStorage";

    /* JADX INFO: renamed from: r */
    public static final String f79424r = "supportsPictureInPicture";

    /* JADX INFO: renamed from: s */
    public static final String f79425s = "permission";

    private C12269rt() {
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static C11673qt m21512a(@efb Context context, int i) throws XmlPullParserException, IOException {
        C11673qt c11673qt = new C11673qt();
        XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser(i, f79407a);
        do {
            try {
                if (xmlResourceParserOpenXmlResourceParser.getEventType() == 2) {
                    String name = xmlResourceParserOpenXmlResourceParser.getName();
                    if (TextUtils.equals(f79409c, name)) {
                        c11673qt.f75558a = xmlResourceParserOpenXmlResourceParser.getAttributeValue(null, f79418l);
                    }
                    if (TextUtils.equals(f79410d, name)) {
                        c11673qt.f75559b = parseUsesSdkFromXml(xmlResourceParserOpenXmlResourceParser);
                    }
                    if (TextUtils.equals(f79411e, name) || TextUtils.equals(f79412f, name) || TextUtils.equals(f79413g, name)) {
                        c11673qt.f75560c.add(parsePermissionFromXml(xmlResourceParserOpenXmlResourceParser));
                    }
                    if (TextUtils.equals("application", name)) {
                        c11673qt.f75561d = parseApplicationFromXml(xmlResourceParserOpenXmlResourceParser);
                    }
                    if (TextUtils.equals("activity", name) || TextUtils.equals(f79416j, name)) {
                        c11673qt.f75562e.add(parseActivityFromXml(xmlResourceParserOpenXmlResourceParser));
                    }
                    if (TextUtils.equals("service", name)) {
                        c11673qt.f75563f.add(parseServerFromXml(xmlResourceParserOpenXmlResourceParser));
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (xmlResourceParserOpenXmlResourceParser != null) {
                        try {
                            xmlResourceParserOpenXmlResourceParser.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } while (xmlResourceParserOpenXmlResourceParser.next() != 1);
        xmlResourceParserOpenXmlResourceParser.close();
        return c11673qt;
    }

    @efb
    private static C11673qt.a parseActivityFromXml(@efb XmlResourceParser xmlResourceParser) {
        C11673qt.a aVar = new C11673qt.a();
        aVar.f75564a = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        aVar.f75565b = xmlResourceParser.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", f79424r, false);
        return aVar;
    }

    @efb
    private static C11673qt.b parseApplicationFromXml(@efb XmlResourceParser xmlResourceParser) {
        C11673qt.b bVar = new C11673qt.b();
        bVar.f75566a = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        bVar.f75567b = xmlResourceParser.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", f79423q, false);
        return bVar;
    }

    @efb
    private static C11673qt.c parsePermissionFromXml(@efb XmlResourceParser xmlResourceParser) {
        C11673qt.c cVar = new C11673qt.c();
        cVar.f75569a = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        cVar.f75570b = xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", f79420n, Integer.MAX_VALUE);
        cVar.f75571c = xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", f79422p, 0);
        return cVar;
    }

    @efb
    private static C11673qt.d parseServerFromXml(@efb XmlResourceParser xmlResourceParser) {
        C11673qt.d dVar = new C11673qt.d();
        dVar.f75572a = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        dVar.f75573b = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", f79425s);
        return dVar;
    }

    @efb
    private static C11673qt.e parseUsesSdkFromXml(@efb XmlResourceParser xmlResourceParser) {
        C11673qt.e eVar = new C11673qt.e();
        eVar.f75574a = xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", f79421o, 0);
        return eVar;
    }
}
