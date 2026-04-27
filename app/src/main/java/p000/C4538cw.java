package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: cw */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C4538cw {

    /* JADX INFO: renamed from: d */
    public static final int f27904d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final XmlPullParser f27905a;

    /* JADX INFO: renamed from: b */
    public int f27906b;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public final xjc f27907c;

    public C4538cw(@yfb XmlPullParser xmlPullParser, int i) {
        this.f27905a = xmlPullParser;
        this.f27906b = i;
        this.f27907c = new xjc();
    }

    public static /* synthetic */ C4538cw copy$default(C4538cw c4538cw, XmlPullParser xmlPullParser, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xmlPullParser = c4538cw.f27905a;
        }
        if ((i2 & 2) != 0) {
            i = c4538cw.f27906b;
        }
        return c4538cw.copy(xmlPullParser, i);
    }

    private final void updateConfig(int i) {
        this.f27906b = i | this.f27906b;
    }

    @yfb
    public final XmlPullParser component1() {
        return this.f27905a;
    }

    public final int component2() {
        return this.f27906b;
    }

    @yfb
    public final C4538cw copy(@yfb XmlPullParser xmlPullParser, int i) {
        return new C4538cw(xmlPullParser, i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4538cw)) {
            return false;
        }
        C4538cw c4538cw = (C4538cw) obj;
        return md8.areEqual(this.f27905a, c4538cw.f27905a) && this.f27906b == c4538cw.f27906b;
    }

    public final int getConfig() {
        return this.f27906b;
    }

    public final float getDimension(@yfb TypedArray typedArray, int i, float f) {
        float dimension = typedArray.getDimension(i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(@yfb TypedArray typedArray, int i, float f) {
        float f2 = typedArray.getFloat(i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return f2;
    }

    public final int getInt(@yfb TypedArray typedArray, int i, int i2) {
        int i3 = typedArray.getInt(i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return i3;
    }

    public final boolean getNamedBoolean(@yfb TypedArray typedArray, @yfb String str, @ebg int i, boolean z) {
        boolean namedBoolean = vmh.getNamedBoolean(typedArray, this.f27905a, str, i, z);
        updateConfig(typedArray.getChangingConfigurations());
        return namedBoolean;
    }

    @gib
    public final ColorStateList getNamedColorStateList(@yfb TypedArray typedArray, @gib Resources.Theme theme, @yfb String str, @ebg int i) {
        ColorStateList namedColorStateList = vmh.getNamedColorStateList(typedArray, this.f27905a, theme, str, i);
        updateConfig(typedArray.getChangingConfigurations());
        return namedColorStateList;
    }

    @yfb
    public final ti2 getNamedComplexColor(@yfb TypedArray typedArray, @gib Resources.Theme theme, @yfb String str, @ebg int i, @g92 int i2) {
        ti2 namedComplexColor = vmh.getNamedComplexColor(typedArray, this.f27905a, theme, str, i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return namedComplexColor;
    }

    public final float getNamedFloat(@yfb TypedArray typedArray, @yfb String str, @ebg int i, float f) {
        float namedFloat = vmh.getNamedFloat(typedArray, this.f27905a, str, i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return namedFloat;
    }

    public final int getNamedInt(@yfb TypedArray typedArray, @yfb String str, @ebg int i, int i2) {
        int namedInt = vmh.getNamedInt(typedArray, this.f27905a, str, i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return namedInt;
    }

    @gib
    public final String getString(@yfb TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        updateConfig(typedArray.getChangingConfigurations());
        return string;
    }

    @yfb
    public final XmlPullParser getXmlParser() {
        return this.f27905a;
    }

    public int hashCode() {
        return (this.f27905a.hashCode() * 31) + Integer.hashCode(this.f27906b);
    }

    @yfb
    public final TypedArray obtainAttributes(@yfb Resources resources, @gib Resources.Theme theme, @yfb AttributeSet attributeSet, @yfb int[] iArr) {
        TypedArray typedArrayObtainAttributes = vmh.obtainAttributes(resources, theme, attributeSet, iArr);
        updateConfig(typedArrayObtainAttributes.getChangingConfigurations());
        return typedArrayObtainAttributes;
    }

    public final void setConfig(int i) {
        this.f27906b = i;
    }

    @yfb
    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f27905a + ", config=" + this.f27906b + ')';
    }

    public /* synthetic */ C4538cw(XmlPullParser xmlPullParser, int i, int i2, jt3 jt3Var) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}
