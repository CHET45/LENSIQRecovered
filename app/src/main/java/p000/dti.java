package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.bjc;
import p000.dw7;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nXmlVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,724:1\n168#2:725\n168#2:726\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n*L\n237#1:725\n238#1:726\n*E\n"})
public final class dti {

    /* JADX INFO: renamed from: a */
    public static final int f30857a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f30858b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f30859c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f30860d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f30861e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f30862f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f30863g = 0;

    /* JADX INFO: renamed from: h */
    @yfb
    public static final String f30864h = "clip-path";

    /* JADX INFO: renamed from: i */
    @yfb
    public static final String f30865i = "group";

    /* JADX INFO: renamed from: j */
    @yfb
    public static final String f30866j = "path";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m9364a(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = fag.f35949b.m28904getButtKaPHkGw();
        }
        return m28695getStrokeLineCapCSYIeUk(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m9365b(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = hag.f43019b.m29985getMiterLxFBmk8();
        }
        return m28696getStrokeLineJoinkLtJ_vA(i, i2);
    }

    @yfb
    public static final dw7.C4988a createVectorImageBuilder(@yfb C4538cw c4538cw, @yfb Resources resources, @gib Resources.Theme theme, @yfb AttributeSet attributeSet) throws XmlPullParserException {
        long jM32987getUnspecified0d7_KjU;
        int iM31926getSrcIn0nO6VwU;
        ColorStateList namedColorStateList;
        C4982dw c4982dw = C4982dw.f31128a;
        TypedArray typedArrayObtainAttributes = c4538cw.obtainAttributes(resources, theme, attributeSet, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean namedBoolean = c4538cw.getNamedBoolean(typedArrayObtainAttributes, "autoMirrored", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float namedFloat = c4538cw.getNamedFloat(typedArrayObtainAttributes, "viewportWidth", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float namedFloat2 = c4538cw.getNamedFloat(typedArrayObtainAttributes, "viewportHeight", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (namedFloat <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (namedFloat2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float dimension = c4538cw.getDimension(typedArrayObtainAttributes, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
        float dimension2 = c4538cw.getDimension(typedArrayObtainAttributes, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
        if (typedArrayObtainAttributes.hasValue(c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) {
            TypedValue typedValue = new TypedValue();
            typedArrayObtainAttributes.getValue(c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), typedValue);
            jM32987getUnspecified0d7_KjU = (typedValue.type == 2 || (namedColorStateList = c4538cw.getNamedColorStateList(typedArrayObtainAttributes, theme, "tint", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) == null) ? w82.f93556b.m32987getUnspecified0d7_KjU() : j92.Color(namedColorStateList.getDefaultColor());
        } else {
            jM32987getUnspecified0d7_KjU = w82.f93556b.m32987getUnspecified0d7_KjU();
        }
        long j = jM32987getUnspecified0d7_KjU;
        int i = c4538cw.getInt(typedArrayObtainAttributes, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
        if (i == -1) {
            iM31926getSrcIn0nO6VwU = q51.f73234b.m31926getSrcIn0nO6VwU();
        } else if (i == 3) {
            iM31926getSrcIn0nO6VwU = q51.f73234b.m31928getSrcOver0nO6VwU();
        } else if (i == 5) {
            iM31926getSrcIn0nO6VwU = q51.f73234b.m31926getSrcIn0nO6VwU();
        } else if (i != 9) {
            switch (i) {
                case 14:
                    iM31926getSrcIn0nO6VwU = q51.f73234b.m31917getModulate0nO6VwU();
                    break;
                case 15:
                    iM31926getSrcIn0nO6VwU = q51.f73234b.m31922getScreen0nO6VwU();
                    break;
                case 16:
                    iM31926getSrcIn0nO6VwU = q51.f73234b.m31920getPlus0nO6VwU();
                    break;
                default:
                    iM31926getSrcIn0nO6VwU = q51.f73234b.m31926getSrcIn0nO6VwU();
                    break;
            }
        } else {
            iM31926getSrcIn0nO6VwU = q51.f73234b.m31925getSrcAtop0nO6VwU();
        }
        int i2 = iM31926getSrcIn0nO6VwU;
        float fM30705constructorimpl = kn4.m30705constructorimpl(dimension / resources.getDisplayMetrics().density);
        float fM30705constructorimpl2 = kn4.m30705constructorimpl(dimension2 / resources.getDisplayMetrics().density);
        typedArrayObtainAttributes.recycle();
        return new dw7.C4988a(null, fM30705constructorimpl, fM30705constructorimpl2, namedFloat, namedFloat2, j, i2, namedBoolean, 1, null);
    }

    /* JADX INFO: renamed from: getStrokeLineCap-CSYIeUk, reason: not valid java name */
    private static final int m28695getStrokeLineCapCSYIeUk(int i, int i2) {
        return i != 0 ? i != 1 ? i != 2 ? i2 : fag.f35949b.m28906getSquareKaPHkGw() : fag.f35949b.m28905getRoundKaPHkGw() : fag.f35949b.m28904getButtKaPHkGw();
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-kLtJ_vA, reason: not valid java name */
    private static final int m28696getStrokeLineJoinkLtJ_vA(int i, int i2) {
        return i != 0 ? i != 1 ? i != 2 ? i2 : hag.f43019b.m29984getBevelLxFBmk8() : hag.f43019b.m29986getRoundLxFBmk8() : hag.f43019b.m29985getMiterLxFBmk8();
    }

    public static final boolean isAtEnd(@yfb XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    private static final he1 obtainBrushFromComplexColor(ti2 ti2Var) {
        if (!ti2Var.willDraw()) {
            return null;
        }
        Shader shader = ti2Var.getShader();
        return shader != null ? ie1.ShaderBrush(shader) : new bvf(j92.Color(ti2Var.getColor()), null);
    }

    public static final void parseClipPath(@yfb C4538cw c4538cw, @yfb Resources resources, @gib Resources.Theme theme, @yfb AttributeSet attributeSet, @yfb dw7.C4988a c4988a) {
        C4982dw c4982dw = C4982dw.f31128a;
        TypedArray typedArrayObtainAttributes = c4538cw.obtainAttributes(resources, theme, attributeSet, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = c4538cw.getString(typedArrayObtainAttributes, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        String string2 = c4538cw.getString(typedArrayObtainAttributes, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA());
        List emptyPath = string2 == null ? l3i.getEmptyPath() : xjc.pathStringToNodes$default(c4538cw.f27907c, string2, null, 2, null);
        typedArrayObtainAttributes.recycle();
        c4988a.addGroup((gsa.f40915b2 & 1) != 0 ? "" : str, (gsa.f40915b2 & 2) != 0 ? 0.0f : 0.0f, (gsa.f40915b2 & 4) != 0 ? 0.0f : 0.0f, (gsa.f40915b2 & 8) != 0 ? 0.0f : 0.0f, (gsa.f40915b2 & 16) != 0 ? 1.0f : 0.0f, (gsa.f40915b2 & 32) == 0 ? 0.0f : 1.0f, (gsa.f40915b2 & 64) != 0 ? 0.0f : 0.0f, (gsa.f40915b2 & 128) == 0 ? 0.0f : 0.0f, (gsa.f40915b2 & 256) != 0 ? l3i.getEmptyPath() : emptyPath);
    }

    public static final int parseCurrentVectorNode(@yfb C4538cw c4538cw, @yfb Resources resources, @yfb AttributeSet attributeSet, @gib Resources.Theme theme, @yfb dw7.C4988a c4988a, int i) throws XmlPullParserException {
        int eventType = c4538cw.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !md8.areEqual("group", c4538cw.getXmlParser().getName())) {
                return i;
            }
            int i2 = i + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                c4988a.clearGroup();
            }
            return 0;
        }
        String name = c4538cw.getXmlParser().getName();
        if (name == null) {
            return i;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i;
            }
            parseClipPath(c4538cw, resources, theme, attributeSet, c4988a);
            return i + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i;
            }
            parsePath(c4538cw, resources, theme, attributeSet, c4988a);
            return i;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i;
        }
        parseGroup(c4538cw, resources, theme, attributeSet, c4988a);
        return i;
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(C4538cw c4538cw, Resources resources, AttributeSet attributeSet, Resources.Theme theme, dw7.C4988a c4988a, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(c4538cw, resources, attributeSet, theme, c4988a, i);
    }

    public static final void parseGroup(@yfb C4538cw c4538cw, @yfb Resources resources, @gib Resources.Theme theme, @yfb AttributeSet attributeSet, @yfb dw7.C4988a c4988a) {
        C4982dw c4982dw = C4982dw.f31128a;
        TypedArray typedArrayObtainAttributes = c4538cw.obtainAttributes(resources, theme, attributeSet, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = c4538cw.getNamedFloat(typedArrayObtainAttributes, dq8.f30369i, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f = c4538cw.getFloat(typedArrayObtainAttributes, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f2 = c4538cw.getFloat(typedArrayObtainAttributes, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = c4538cw.getNamedFloat(typedArrayObtainAttributes, "scaleX", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = c4538cw.getNamedFloat(typedArrayObtainAttributes, "scaleY", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = c4538cw.getNamedFloat(typedArrayObtainAttributes, "translateX", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = c4538cw.getNamedFloat(typedArrayObtainAttributes, "translateY", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = c4538cw.getString(typedArrayObtainAttributes, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        typedArrayObtainAttributes.recycle();
        c4988a.addGroup(string, namedFloat, f, f2, namedFloat2, namedFloat3, namedFloat4, namedFloat5, l3i.getEmptyPath());
    }

    public static final void parsePath(@yfb C4538cw c4538cw, @yfb Resources resources, @gib Resources.Theme theme, @yfb AttributeSet attributeSet, @yfb dw7.C4988a c4988a) throws IllegalArgumentException {
        C4982dw c4982dw = C4982dw.f31128a;
        TypedArray typedArrayObtainAttributes = c4538cw.obtainAttributes(resources, theme, attributeSet, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (!vmh.hasAttribute(c4538cw.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String string = c4538cw.getString(typedArrayObtainAttributes, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        String string2 = c4538cw.getString(typedArrayObtainAttributes, c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA());
        List<? extends qjc> emptyPath = string2 == null ? l3i.getEmptyPath() : xjc.pathStringToNodes$default(c4538cw.f27907c, string2, null, 2, null);
        ti2 namedComplexColor = c4538cw.getNamedComplexColor(typedArrayObtainAttributes, theme, "fillColor", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
        float namedFloat = c4538cw.getNamedFloat(typedArrayObtainAttributes, "fillAlpha", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
        int iM28695getStrokeLineCapCSYIeUk = m28695getStrokeLineCapCSYIeUk(c4538cw.getNamedInt(typedArrayObtainAttributes, "strokeLineCap", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1), fag.f35949b.m28904getButtKaPHkGw());
        int iM28696getStrokeLineJoinkLtJ_vA = m28696getStrokeLineJoinkLtJ_vA(c4538cw.getNamedInt(typedArrayObtainAttributes, "strokeLineJoin", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1), hag.f43019b.m29984getBevelLxFBmk8());
        float namedFloat2 = c4538cw.getNamedFloat(typedArrayObtainAttributes, "strokeMiterLimit", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
        ti2 namedComplexColor2 = c4538cw.getNamedComplexColor(typedArrayObtainAttributes, theme, "strokeColor", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
        float namedFloat3 = c4538cw.getNamedFloat(typedArrayObtainAttributes, "strokeAlpha", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
        float namedFloat4 = c4538cw.getNamedFloat(typedArrayObtainAttributes, "strokeWidth", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
        float namedFloat5 = c4538cw.getNamedFloat(typedArrayObtainAttributes, "trimPathEnd", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
        float namedFloat6 = c4538cw.getNamedFloat(typedArrayObtainAttributes, "trimPathOffset", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
        float namedFloat7 = c4538cw.getNamedFloat(typedArrayObtainAttributes, "trimPathStart", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
        int namedInt = c4538cw.getNamedInt(typedArrayObtainAttributes, "fillType", c4982dw.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), f30863g);
        typedArrayObtainAttributes.recycle();
        he1 he1VarObtainBrushFromComplexColor = obtainBrushFromComplexColor(namedComplexColor);
        he1 he1VarObtainBrushFromComplexColor2 = obtainBrushFromComplexColor(namedComplexColor2);
        bjc.C1921a c1921a = bjc.f13877b;
        c4988a.m28711addPathoIyEayM(emptyPath, namedInt == 0 ? c1921a.m28005getNonZeroRgk1Os() : c1921a.m28004getEvenOddRgk1Os(), str, he1VarObtainBrushFromComplexColor, namedFloat, he1VarObtainBrushFromComplexColor2, namedFloat3, namedFloat4, iM28695getStrokeLineCapCSYIeUk, iM28696getStrokeLineJoinkLtJ_vA, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
    }

    @yfb
    public static final XmlPullParser seekToStartTag(@yfb XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
