package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class hjc implements Interpolator {

    /* JADX INFO: renamed from: c */
    public static final float f43816c = 0.002f;

    /* JADX INFO: renamed from: d */
    public static final int f43817d = 3000;

    /* JADX INFO: renamed from: e */
    public static final double f43818e = 1.0E-5d;

    /* JADX INFO: renamed from: a */
    public float[] f43819a;

    /* JADX INFO: renamed from: b */
    public float[] f43820b;

    public hjc(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void initCubic(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        initPath(path);
    }

    private void initPath(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f43819a = new float[iMin];
        this.f43820b = new float[iMin];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < iMin; i2++) {
            pathMeasure.getPosTan((i2 * length) / (iMin - 1), fArr, null);
            this.f43819a[i2] = fArr[0];
            this.f43820b[i2] = fArr[1];
        }
        if (Math.abs(this.f43819a[0]) <= 1.0E-5d && Math.abs(this.f43820b[0]) <= 1.0E-5d) {
            int i3 = iMin - 1;
            if (Math.abs(this.f43819a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f43820b[i3] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < iMin) {
                    float[] fArr2 = this.f43819a;
                    int i5 = i4 + 1;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f43819a[0]);
        sb.append(",");
        sb.append(this.f43820b[0]);
        sb.append(" end:");
        int i6 = iMin - 1;
        sb.append(this.f43819a[i6]);
        sb.append(",");
        sb.append(this.f43820b[i6]);
        throw new IllegalArgumentException(sb.toString());
    }

    private void initQuad(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        initPath(path);
    }

    private void parseInterpolatorFromTypeArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (vmh.hasAttribute(xmlPullParser, "pathData")) {
            String namedString = vmh.getNamedString(typedArray, xmlPullParser, "pathData", 4);
            Path pathCreatePathFromPathData = vjc.createPathFromPathData(namedString);
            if (pathCreatePathFromPathData != null) {
                initPath(pathCreatePathFromPathData);
                return;
            }
            throw new InflateException("The path is null, which is created from " + namedString);
        }
        if (!vmh.hasAttribute(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!vmh.hasAttribute(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float namedFloat = vmh.getNamedFloat(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float namedFloat2 = vmh.getNamedFloat(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean zHasAttribute = vmh.hasAttribute(xmlPullParser, "controlX2");
        if (zHasAttribute != vmh.hasAttribute(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (zHasAttribute) {
            initCubic(namedFloat, namedFloat2, vmh.getNamedFloat(typedArray, xmlPullParser, "controlX2", 2, 0.0f), vmh.getNamedFloat(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            initQuad(namedFloat, namedFloat2);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.f43819a.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f43819a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f43819a;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.f43820b[i];
        }
        float f5 = (f - f3) / f4;
        float[] fArr2 = this.f43820b;
        float f6 = fArr2[i];
        return f6 + (f5 * (fArr2[length] - f6));
    }

    public hjc(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainAttributes = vmh.obtainAttributes(resources, theme, attributeSet, C15299xu.f99313r0);
        parseInterpolatorFromTypeArray(typedArrayObtainAttributes, xmlPullParser);
        typedArrayObtainAttributes.recycle();
    }
}
