package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.C0915R;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class x87 {

    /* JADX INFO: renamed from: a */
    public static final int f97184a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f97185b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f97186c = 2;

    private x87() {
    }

    /* JADX INFO: renamed from: a */
    public static Shader m25042a(@efb Resources resources, @efb XmlPullParser xmlPullParser, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m25043b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: renamed from: b */
    public static Shader m25043b(@efb Resources resources, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayObtainAttributes = vmh.obtainAttributes(resources, theme, attributeSet, C0915R.styleable.GradientColor);
        float namedFloat = vmh.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "startX", C0915R.styleable.GradientColor_android_startX, 0.0f);
        float namedFloat2 = vmh.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "startY", C0915R.styleable.GradientColor_android_startY, 0.0f);
        float namedFloat3 = vmh.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "endX", C0915R.styleable.GradientColor_android_endX, 0.0f);
        float namedFloat4 = vmh.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "endY", C0915R.styleable.GradientColor_android_endY, 0.0f);
        float namedFloat5 = vmh.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "centerX", C0915R.styleable.GradientColor_android_centerX, 0.0f);
        float namedFloat6 = vmh.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "centerY", C0915R.styleable.GradientColor_android_centerY, 0.0f);
        int namedInt = vmh.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "type", C0915R.styleable.GradientColor_android_type, 0);
        int namedColor = vmh.getNamedColor(typedArrayObtainAttributes, xmlPullParser, "startColor", C0915R.styleable.GradientColor_android_startColor, 0);
        boolean zHasAttribute = vmh.hasAttribute(xmlPullParser, "centerColor");
        int namedColor2 = vmh.getNamedColor(typedArrayObtainAttributes, xmlPullParser, "centerColor", C0915R.styleable.GradientColor_android_centerColor, 0);
        int namedColor3 = vmh.getNamedColor(typedArrayObtainAttributes, xmlPullParser, "endColor", C0915R.styleable.GradientColor_android_endColor, 0);
        int namedInt2 = vmh.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "tileMode", C0915R.styleable.GradientColor_android_tileMode, 0);
        float namedFloat7 = vmh.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "gradientRadius", C0915R.styleable.GradientColor_android_gradientRadius, 0.0f);
        typedArrayObtainAttributes.recycle();
        C14986a c14986aCheckColors = checkColors(inflateChildElements(resources, xmlPullParser, attributeSet, theme), namedColor, namedColor3, zHasAttribute, namedColor2);
        if (namedInt != 1) {
            return namedInt != 2 ? new LinearGradient(namedFloat, namedFloat2, namedFloat3, namedFloat4, c14986aCheckColors.f97187a, c14986aCheckColors.f97188b, parseTileMode(namedInt2)) : new SweepGradient(namedFloat5, namedFloat6, c14986aCheckColors.f97187a, c14986aCheckColors.f97188b);
        }
        if (namedFloat7 > 0.0f) {
            return new RadialGradient(namedFloat5, namedFloat6, namedFloat7, c14986aCheckColors.f97187a, c14986aCheckColors.f97188b, parseTileMode(namedInt2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static C14986a checkColors(@hib C14986a c14986a, @g92 int i, @g92 int i2, boolean z, @g92 int i3) {
        return c14986a != null ? c14986a : z ? new C14986a(i, i3, i2) : new C14986a(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new p000.x87.C14986a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000.x87.C14986a inflateChildElements(@p000.efb android.content.res.Resources r8, @p000.efb org.xmlpull.v1.XmlPullParser r9, @p000.efb android.util.AttributeSet r10, @p000.hib android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = androidx.core.C0915R.styleable.GradientColorItem
            android.content.res.TypedArray r3 = p000.vmh.obtainAttributes(r8, r11, r10, r3)
            int r5 = androidx.core.C0915R.styleable.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = androidx.core.C0915R.styleable.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = androidx.core.C0915R.styleable.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = androidx.core.C0915R.styleable.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            x87$a r8 = new x87$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x87.inflateChildElements(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):x87$a");
    }

    private static Shader.TileMode parseTileMode(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* JADX INFO: renamed from: x87$a */
    public static final class C14986a {

        /* JADX INFO: renamed from: a */
        public final int[] f97187a;

        /* JADX INFO: renamed from: b */
        public final float[] f97188b;

        public C14986a(@efb List<Integer> list, @efb List<Float> list2) {
            int size = list.size();
            this.f97187a = new int[size];
            this.f97188b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f97187a[i] = list.get(i).intValue();
                this.f97188b[i] = list2.get(i).floatValue();
            }
        }

        public C14986a(@g92 int i, @g92 int i2) {
            this.f97187a = new int[]{i, i2};
            this.f97188b = new float[]{0.0f, 1.0f};
        }

        public C14986a(@g92 int i, @g92 int i2, @g92 int i3) {
            this.f97187a = new int[]{i, i2, i3};
            this.f97188b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
