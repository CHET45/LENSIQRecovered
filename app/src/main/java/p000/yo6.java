package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.core.C0915R;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class yo6 {

    /* JADX INFO: renamed from: a */
    public static final int f102392a = 400;

    /* JADX INFO: renamed from: b */
    public static final int f102393b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f102394c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f102395d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f102396e = -1;

    /* JADX INFO: renamed from: f */
    public static final int f102397f = 500;

    /* JADX INFO: renamed from: yo6$a */
    @c5e(21)
    public static class C15739a {
        private C15739a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m26256a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* JADX INFO: renamed from: yo6$b */
    public interface InterfaceC15740b {
    }

    /* JADX INFO: renamed from: yo6$c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15741c {
    }

    /* JADX INFO: renamed from: yo6$d */
    public static final class C15742d implements InterfaceC15740b {

        /* JADX INFO: renamed from: a */
        @efb
        public final C15743e[] f102398a;

        public C15742d(@efb C15743e[] c15743eArr) {
            this.f102398a = c15743eArr;
        }

        @efb
        public C15743e[] getEntries() {
            return this.f102398a;
        }
    }

    /* JADX INFO: renamed from: yo6$e */
    public static final class C15743e {

        /* JADX INFO: renamed from: a */
        @efb
        public final String f102399a;

        /* JADX INFO: renamed from: b */
        public final int f102400b;

        /* JADX INFO: renamed from: c */
        public final boolean f102401c;

        /* JADX INFO: renamed from: d */
        public final String f102402d;

        /* JADX INFO: renamed from: e */
        public final int f102403e;

        /* JADX INFO: renamed from: f */
        public final int f102404f;

        public C15743e(@efb String str, int i, boolean z, @hib String str2, int i2, int i3) {
            this.f102399a = str;
            this.f102400b = i;
            this.f102401c = z;
            this.f102402d = str2;
            this.f102403e = i2;
            this.f102404f = i3;
        }

        @efb
        public String getFileName() {
            return this.f102399a;
        }

        public int getResourceId() {
            return this.f102404f;
        }

        public int getTtcIndex() {
            return this.f102403e;
        }

        @hib
        public String getVariationSettings() {
            return this.f102402d;
        }

        public int getWeight() {
            return this.f102400b;
        }

        public boolean isItalic() {
            return this.f102401c;
        }
    }

    private yo6() {
    }

    private static int getType(TypedArray typedArray, int i) {
        return C15739a.m26256a(typedArray, i);
    }

    @hib
    public static InterfaceC15740b parse(@efb XmlPullParser xmlPullParser, @efb Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return readFamilies(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @efb
    public static List<List<byte[]>> readCerts(@efb Resources resources, @d70 int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (getType(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(toByteArrayList(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(toByteArrayList(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    @hib
    private static InterfaceC15740b readFamilies(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return readFamily(xmlPullParser, resources);
        }
        skip(xmlPullParser);
        return null;
    }

    @hib
    private static InterfaceC15740b readFamily(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0915R.styleable.FontFamily);
        String string = typedArrayObtainAttributes.getString(C0915R.styleable.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(C0915R.styleable.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(C0915R.styleable.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(C0915R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(C0915R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(C0915R.styleable.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = typedArrayObtainAttributes.getString(C0915R.styleable.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                skip(xmlPullParser);
            }
            return new C15744f(new to6(string, string2, string3, readCerts(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(ypa.f102577q)) {
                    arrayList.add(readFont(xmlPullParser, resources));
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C15742d((C15743e[]) arrayList.toArray(new C15743e[0]));
    }

    private static C15743e readFont(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0915R.styleable.FontFamilyFont);
        int i = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(C0915R.styleable.FontFamilyFont_fontWeight) ? C0915R.styleable.FontFamilyFont_fontWeight : C0915R.styleable.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(C0915R.styleable.FontFamilyFont_fontStyle) ? C0915R.styleable.FontFamilyFont_fontStyle : C0915R.styleable.FontFamilyFont_android_fontStyle, 0);
        int i2 = typedArrayObtainAttributes.hasValue(C0915R.styleable.FontFamilyFont_ttcIndex) ? C0915R.styleable.FontFamilyFont_ttcIndex : C0915R.styleable.FontFamilyFont_android_ttcIndex;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(C0915R.styleable.FontFamilyFont_fontVariationSettings) ? C0915R.styleable.FontFamilyFont_fontVariationSettings : C0915R.styleable.FontFamilyFont_android_fontVariationSettings);
        int i3 = typedArrayObtainAttributes.getInt(i2, 0);
        int i4 = typedArrayObtainAttributes.hasValue(C0915R.styleable.FontFamilyFont_font) ? C0915R.styleable.FontFamilyFont_font : C0915R.styleable.FontFamilyFont_android_font;
        int resourceId = typedArrayObtainAttributes.getResourceId(i4, 0);
        String string2 = typedArrayObtainAttributes.getString(i4);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            skip(xmlPullParser);
        }
        return new C15743e(string2, i, z, string, i3, resourceId);
    }

    private static void skip(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static List<byte[]> toByteArrayList(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: yo6$f */
    public static final class C15744f implements InterfaceC15740b {

        /* JADX INFO: renamed from: a */
        @efb
        public final to6 f102405a;

        /* JADX INFO: renamed from: b */
        public final int f102406b;

        /* JADX INFO: renamed from: c */
        public final int f102407c;

        /* JADX INFO: renamed from: d */
        @hib
        public final String f102408d;

        @p7e({p7e.EnumC10826a.f69934a})
        public C15744f(@efb to6 to6Var, int i, int i2, @hib String str) {
            this.f102405a = to6Var;
            this.f102407c = i;
            this.f102406b = i2;
            this.f102408d = str;
        }

        public int getFetchStrategy() {
            return this.f102407c;
        }

        @efb
        public to6 getRequest() {
            return this.f102405a;
        }

        @hib
        @p7e({p7e.EnumC10826a.f69934a})
        public String getSystemFontFamilyName() {
            return this.f102408d;
        }

        public int getTimeout() {
            return this.f102406b;
        }

        public C15744f(@efb to6 to6Var, int i, int i2) {
            this(to6Var, i, i2, null);
        }
    }
}
