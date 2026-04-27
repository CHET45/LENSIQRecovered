package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class vmh {

    /* JADX INFO: renamed from: a */
    public static final String f91761a = "http://schemas.android.com/apk/res/android";

    private vmh() {
    }

    public static int getAttr(@efb Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static boolean getBoolean(@efb TypedArray typedArray, @ebg int i, @ebg int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    @hib
    public static Drawable getDrawable(@efb TypedArray typedArray, @ebg int i, @ebg int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        return drawable == null ? typedArray.getDrawable(i2) : drawable;
    }

    public static int getInt(@efb TypedArray typedArray, @ebg int i, @ebg int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    public static boolean getNamedBoolean(@efb TypedArray typedArray, @efb XmlPullParser xmlPullParser, @efb String str, @ebg int i, boolean z) {
        return !hasAttribute(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    @g92
    public static int getNamedColor(@efb TypedArray typedArray, @efb XmlPullParser xmlPullParser, @efb String str, @ebg int i, @g92 int i2) {
        return !hasAttribute(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    @hib
    public static ColorStateList getNamedColorStateList(@efb TypedArray typedArray, @efb XmlPullParser xmlPullParser, @hib Resources.Theme theme, @efb String str, @ebg int i) {
        if (!hasAttribute(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? sa2.inflate(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : getNamedColorStateListFromInt(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    @efb
    private static ColorStateList getNamedColorStateListFromInt(@efb TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static ti2 getNamedComplexColor(@efb TypedArray typedArray, @efb XmlPullParser xmlPullParser, @hib Resources.Theme theme, @efb String str, @ebg int i, @g92 int i2) {
        if (hasAttribute(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return ti2.m22670a(typedValue.data);
            }
            ti2 ti2VarInflate = ti2.inflate(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (ti2VarInflate != null) {
                return ti2VarInflate;
            }
        }
        return ti2.m22670a(i2);
    }

    public static float getNamedFloat(@efb TypedArray typedArray, @efb XmlPullParser xmlPullParser, @efb String str, @ebg int i, float f) {
        return !hasAttribute(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int getNamedInt(@efb TypedArray typedArray, @efb XmlPullParser xmlPullParser, @efb String str, @ebg int i, int i2) {
        return !hasAttribute(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    @e00
    public static int getNamedResourceId(@efb TypedArray typedArray, @efb XmlPullParser xmlPullParser, @efb String str, @ebg int i, @e00 int i2) {
        return !hasAttribute(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    @hib
    public static String getNamedString(@efb TypedArray typedArray, @efb XmlPullParser xmlPullParser, @efb String str, @ebg int i) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    @e00
    public static int getResourceId(@efb TypedArray typedArray, @ebg int i, @ebg int i2, @e00 int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    @hib
    public static String getString(@efb TypedArray typedArray, @ebg int i, @ebg int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    @hib
    public static CharSequence getText(@efb TypedArray typedArray, @ebg int i, @ebg int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    @hib
    public static CharSequence[] getTextArray(@efb TypedArray typedArray, @ebg int i, @ebg int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static boolean hasAttribute(@efb XmlPullParser xmlPullParser, @efb String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @efb
    public static TypedArray obtainAttributes(@efb Resources resources, @hib Resources.Theme theme, @efb AttributeSet attributeSet, @efb int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @hib
    public static TypedValue peekNamedValue(@efb TypedArray typedArray, @efb XmlPullParser xmlPullParser, @efb String str, int i) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }
}
