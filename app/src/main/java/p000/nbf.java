package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class nbf {

    /* JADX INFO: renamed from: a */
    public static final String f63926a = "ShortcutXmlParser";

    /* JADX INFO: renamed from: b */
    public static final String f63927b = "android.app.shortcuts";

    /* JADX INFO: renamed from: c */
    public static final String f63928c = "shortcut";

    /* JADX INFO: renamed from: d */
    public static final String f63929d = "shortcutId";

    /* JADX INFO: renamed from: e */
    public static volatile ArrayList<String> f63930e;

    /* JADX INFO: renamed from: f */
    public static final Object f63931f = new Object();

    private nbf() {
    }

    private static String getAttributeValue(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    @efb
    @xqi
    public static List<String> getShortcutIds(@efb Context context) {
        if (f63930e == null) {
            synchronized (f63931f) {
                try {
                    if (f63930e == null) {
                        f63930e = new ArrayList<>();
                        f63930e.addAll(parseShortcutIds(context));
                    }
                } finally {
                }
            }
        }
        return f63930e;
    }

    @efb
    private static XmlResourceParser getXmlResourceParser(Context context, ActivityInfo activityInfo) {
        XmlResourceParser xmlResourceParserLoadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), f63927b);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    @efb
    private static Set<String> parseShortcutIds(@efb Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (listQueryIntentActivities != null && listQueryIntentActivities.size() != 0) {
            try {
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(f63927b)) {
                        XmlResourceParser xmlResourceParser = getXmlResourceParser(context, activityInfo);
                        try {
                            hashSet.addAll(parseShortcutIds(xmlResourceParser));
                            if (xmlResourceParser != null) {
                                xmlResourceParser.close();
                            }
                        } finally {
                        }
                    }
                }
            } catch (Exception e) {
                Log.e(f63926a, "Failed to parse the Xml resource: ", e);
            }
        }
        return hashSet;
    }

    @efb
    @fdi
    public static List<String> parseShortcutIds(@efb XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && f63928c.equals(name) && (attributeValue = getAttributeValue(xmlPullParser, f63929d)) != null) {
                arrayList.add(attributeValue);
            }
        }
        return arrayList;
    }
}
