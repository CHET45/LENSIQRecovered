package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.C0915R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class sa2 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f81028a = new ThreadLocal<>();

    private sa2() {
    }

    @efb
    public static ColorStateList createFromXml(@efb Resources resources, @efb XmlPullParser xmlPullParser, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return createFromXmlInner(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @efb
    public static ColorStateList createFromXmlInner(@efb Resources resources, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return inflate(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @efb
    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = f81028a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @hib
    public static ColorStateList inflate(@efb Resources resources, @cti int i, @hib Resources.Theme theme) {
        try {
            return createFromXml(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    private static boolean isColorInt(@efb Resources resources, @w92 int i) {
        TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        return i2 >= 28 && i2 <= 31;
    }

    @g92
    private static int modulateColorAlpha(@g92 int i, @y46(from = 0.0d, m25645to = 1.0d) float f, @y46(from = 0.0d, m25645to = ua2.f87251b) float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f == 1.0f && !z) {
            return i;
        }
        int iClamp = r3a.clamp((int) ((Color.alpha(i) * f) + 0.5f), 0, 255);
        if (z) {
            yo1 yo1VarM26241b = yo1.m26241b(i);
            i = yo1.toColor(yo1VarM26241b.m26248g(), yo1VarM26241b.m26247f(), f2);
        }
        return (i & 16777215) | (iClamp << 24);
    }

    private static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private static ColorStateList inflate(@efb Resources resources, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        Resources resources2 = resources;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrAppend = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = obtainAttributes(resources2, theme, attributeSet, C0915R.styleable.ColorStateListItem);
                int resourceId = typedArrayObtainAttributes.getResourceId(C0915R.styleable.ColorStateListItem_android_color, -1);
                if (resourceId != -1 && !isColorInt(resources2, resourceId)) {
                    try {
                        color = createFromXml(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayObtainAttributes.getColor(C0915R.styleable.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(C0915R.styleable.ColorStateListItem_android_color, -65281);
                }
                float f2 = 1.0f;
                if (typedArrayObtainAttributes.hasValue(C0915R.styleable.ColorStateListItem_android_alpha)) {
                    f2 = typedArrayObtainAttributes.getFloat(C0915R.styleable.ColorStateListItem_android_alpha, 1.0f);
                } else if (typedArrayObtainAttributes.hasValue(C0915R.styleable.ColorStateListItem_alpha)) {
                    f2 = typedArrayObtainAttributes.getFloat(C0915R.styleable.ColorStateListItem_alpha, 1.0f);
                }
                if (Build.VERSION.SDK_INT >= 31 && typedArrayObtainAttributes.hasValue(C0915R.styleable.ColorStateListItem_android_lStar)) {
                    f = typedArrayObtainAttributes.getFloat(C0915R.styleable.ColorStateListItem_android_lStar, -1.0f);
                } else {
                    f = typedArrayObtainAttributes.getFloat(C0915R.styleable.ColorStateListItem_lStar, -1.0f);
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C0915R.attr.alpha && attributeNameResource != C0915R.attr.lStar) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i3);
                iArrAppend = bc7.append(iArrAppend, i2, modulateColorAlpha(color, f2, f));
                iArr = (int[][]) bc7.append(iArr, i2, iArrTrimStateSet);
                i2++;
            }
            i = 1;
            resources2 = resources;
        }
        int[] iArr3 = new int[i2];
        int[][] iArr4 = new int[i2][];
        System.arraycopy(iArrAppend, 0, iArr3, 0, i2);
        System.arraycopy(iArr, 0, iArr4, 0, i2);
        return new ColorStateList(iArr4, iArr3);
    }
}
