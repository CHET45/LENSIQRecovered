package p000;

import com.arthenica.ffmpegkit.StreamInformation;
import com.eyevue.glassapp.view.photo.C2865a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p000.wyf;

/* JADX INFO: loaded from: classes.dex */
public class cza implements Comparable<cza> {

    /* JADX INFO: renamed from: j2 */
    public static final String f28076j2 = "MotionPaths";

    /* JADX INFO: renamed from: k2 */
    public static final boolean f28077k2 = false;

    /* JADX INFO: renamed from: l2 */
    public static final int f28078l2 = 1;

    /* JADX INFO: renamed from: m2 */
    public static final int f28079m2 = 2;

    /* JADX INFO: renamed from: n2 */
    public static String[] f28080n2 = {C2865a.f19004r, "x", "y", StreamInformation.KEY_WIDTH, StreamInformation.KEY_HEIGHT, "pathRotate"};

    /* JADX INFO: renamed from: M1 */
    public float f28086M1;

    /* JADX INFO: renamed from: V1 */
    public float f28089V1;

    /* JADX INFO: renamed from: Y */
    public gv4 f28091Y;

    /* JADX INFO: renamed from: Z1 */
    public float f28093Z1;

    /* JADX INFO: renamed from: a2 */
    public float f28095a2;

    /* JADX INFO: renamed from: b2 */
    public float f28097b2;

    /* JADX INFO: renamed from: c */
    public int f28098c;

    /* JADX INFO: renamed from: a */
    public float f28094a = 1.0f;

    /* JADX INFO: renamed from: b */
    public int f28096b = 0;

    /* JADX INFO: renamed from: d */
    public boolean f28100d = false;

    /* JADX INFO: renamed from: e */
    public float f28102e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f28104f = 0.0f;

    /* JADX INFO: renamed from: m */
    public float f28109m = 0.0f;

    /* JADX INFO: renamed from: C */
    public float f28081C = 0.0f;

    /* JADX INFO: renamed from: F */
    public float f28082F = 1.0f;

    /* JADX INFO: renamed from: H */
    public float f28083H = 1.0f;

    /* JADX INFO: renamed from: L */
    public float f28084L = Float.NaN;

    /* JADX INFO: renamed from: M */
    public float f28085M = Float.NaN;

    /* JADX INFO: renamed from: N */
    public float f28087N = 0.0f;

    /* JADX INFO: renamed from: Q */
    public float f28088Q = 0.0f;

    /* JADX INFO: renamed from: X */
    public float f28090X = 0.0f;

    /* JADX INFO: renamed from: Z */
    public int f28092Z = 0;

    /* JADX INFO: renamed from: c2 */
    public float f28099c2 = Float.NaN;

    /* JADX INFO: renamed from: d2 */
    public float f28101d2 = Float.NaN;

    /* JADX INFO: renamed from: e2 */
    public int f28103e2 = -1;

    /* JADX INFO: renamed from: f2 */
    public LinkedHashMap<String, ge3> f28105f2 = new LinkedHashMap<>();

    /* JADX INFO: renamed from: g2 */
    public int f28106g2 = 0;

    /* JADX INFO: renamed from: h2 */
    public double[] f28107h2 = new double[18];

    /* JADX INFO: renamed from: i2 */
    public double[] f28108i2 = new double[18];

    private boolean diff(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: a */
    public void m8798a(cza czaVar, HashSet<String> hashSet) {
        if (diff(this.f28094a, czaVar.f28094a)) {
            hashSet.add("alpha");
        }
        if (diff(this.f28102e, czaVar.f28102e)) {
            hashSet.add("translationZ");
        }
        int i = this.f28098c;
        int i2 = czaVar.f28098c;
        if (i != i2 && this.f28096b == 0 && (i == 4 || i2 == 4)) {
            hashSet.add("alpha");
        }
        if (diff(this.f28104f, czaVar.f28104f)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f28099c2) || !Float.isNaN(czaVar.f28099c2)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f28101d2) || !Float.isNaN(czaVar.f28101d2)) {
            hashSet.add("progress");
        }
        if (diff(this.f28109m, czaVar.f28109m)) {
            hashSet.add("rotationX");
        }
        if (diff(this.f28081C, czaVar.f28081C)) {
            hashSet.add("rotationY");
        }
        if (diff(this.f28084L, czaVar.f28084L)) {
            hashSet.add("pivotX");
        }
        if (diff(this.f28085M, czaVar.f28085M)) {
            hashSet.add("pivotY");
        }
        if (diff(this.f28082F, czaVar.f28082F)) {
            hashSet.add("scaleX");
        }
        if (diff(this.f28083H, czaVar.f28083H)) {
            hashSet.add("scaleY");
        }
        if (diff(this.f28087N, czaVar.f28087N)) {
            hashSet.add("translationX");
        }
        if (diff(this.f28088Q, czaVar.f28088Q)) {
            hashSet.add("translationY");
        }
        if (diff(this.f28090X, czaVar.f28090X)) {
            hashSet.add("translationZ");
        }
        if (diff(this.f28102e, czaVar.f28102e)) {
            hashSet.add("elevation");
        }
    }

    public void addValues(HashMap<String, wyf> map, int i) {
        wyf wyfVar;
        for (String str : map.keySet()) {
            wyfVar = map.get(str);
            str.hashCode();
            switch (str) {
                case "rotationX":
                    wyfVar.setPoint(i, Float.isNaN(this.f28109m) ? 0.0f : this.f28109m);
                    break;
                case "rotationY":
                    wyfVar.setPoint(i, Float.isNaN(this.f28081C) ? 0.0f : this.f28081C);
                    break;
                case "rotationZ":
                    wyfVar.setPoint(i, Float.isNaN(this.f28104f) ? 0.0f : this.f28104f);
                    break;
                case "translationX":
                    wyfVar.setPoint(i, Float.isNaN(this.f28087N) ? 0.0f : this.f28087N);
                    break;
                case "translationY":
                    wyfVar.setPoint(i, Float.isNaN(this.f28088Q) ? 0.0f : this.f28088Q);
                    break;
                case "translationZ":
                    wyfVar.setPoint(i, Float.isNaN(this.f28090X) ? 0.0f : this.f28090X);
                    break;
                case "progress":
                    wyfVar.setPoint(i, Float.isNaN(this.f28101d2) ? 0.0f : this.f28101d2);
                    break;
                case "pivotX":
                    wyfVar.setPoint(i, Float.isNaN(this.f28084L) ? 0.0f : this.f28084L);
                    break;
                case "pivotY":
                    wyfVar.setPoint(i, Float.isNaN(this.f28085M) ? 0.0f : this.f28085M);
                    break;
                case "scaleX":
                    wyfVar.setPoint(i, Float.isNaN(this.f28082F) ? 1.0f : this.f28082F);
                    break;
                case "scaleY":
                    wyfVar.setPoint(i, Float.isNaN(this.f28083H) ? 1.0f : this.f28083H);
                    break;
                case "alpha":
                    wyfVar.setPoint(i, Float.isNaN(this.f28094a) ? 1.0f : this.f28094a);
                    break;
                case "pathRotate":
                    wyfVar.setPoint(i, Float.isNaN(this.f28099c2) ? 0.0f : this.f28099c2);
                    break;
                default:
                    if (!str.startsWith("CUSTOM")) {
                        d1i.loge("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    } else {
                        String str2 = str.split(",")[1];
                        if (this.f28105f2.containsKey(str2)) {
                            ge3 ge3Var = this.f28105f2.get(str2);
                            if (wyfVar instanceof wyf.C14841c) {
                                ((wyf.C14841c) wyfVar).setPoint(i, ge3Var);
                            } else {
                                d1i.loge("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + ge3Var.getValueToInterpolate() + wyfVar);
                            }
                        }
                        break;
                    }
                    break;
            }
        }
    }

    public void applyParameters(d0b d0bVar) {
        this.f28098c = d0bVar.getVisibility();
        this.f28094a = d0bVar.getVisibility() != 4 ? 0.0f : d0bVar.getAlpha();
        this.f28100d = false;
        this.f28104f = d0bVar.getRotationZ();
        this.f28109m = d0bVar.getRotationX();
        this.f28081C = d0bVar.getRotationY();
        this.f28082F = d0bVar.getScaleX();
        this.f28083H = d0bVar.getScaleY();
        this.f28084L = d0bVar.getPivotX();
        this.f28085M = d0bVar.getPivotY();
        this.f28087N = d0bVar.getTranslationX();
        this.f28088Q = d0bVar.getTranslationY();
        this.f28090X = d0bVar.getTranslationZ();
        for (String str : d0bVar.getCustomAttributeNames()) {
            ge3 customAttribute = d0bVar.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.f28105f2.put(str, customAttribute);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m8799b(cza czaVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | diff(this.f28086M1, czaVar.f28086M1);
        zArr[1] = zArr[1] | diff(this.f28089V1, czaVar.f28089V1);
        zArr[2] = zArr[2] | diff(this.f28093Z1, czaVar.f28093Z1);
        zArr[3] = zArr[3] | diff(this.f28095a2, czaVar.f28095a2);
        zArr[4] = diff(this.f28097b2, czaVar.f28097b2) | zArr[4];
    }

    /* JADX INFO: renamed from: c */
    public void m8800c(double[] dArr, int[] iArr) {
        int i = 0;
        float[] fArr = {this.f28086M1, this.f28089V1, this.f28093Z1, this.f28095a2, this.f28097b2, this.f28094a, this.f28102e, this.f28104f, this.f28109m, this.f28081C, this.f28082F, this.f28083H, this.f28084L, this.f28085M, this.f28087N, this.f28088Q, this.f28090X, this.f28099c2};
        for (int i2 : iArr) {
            if (i2 < 18) {
                dArr[i] = fArr[r5];
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int m8801d(String str, double[] dArr, int i) {
        ge3 ge3Var = this.f28105f2.get(str);
        if (ge3Var.numberOfInterpolatedValues() == 1) {
            dArr[i] = ge3Var.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = ge3Var.numberOfInterpolatedValues();
        ge3Var.getValuesToInterpolate(new float[iNumberOfInterpolatedValues]);
        int i2 = 0;
        while (i2 < iNumberOfInterpolatedValues) {
            dArr[i] = r1[i2];
            i2++;
            i++;
        }
        return iNumberOfInterpolatedValues;
    }

    /* JADX INFO: renamed from: e */
    public int m8802e(String str) {
        return this.f28105f2.get(str).numberOfInterpolatedValues();
    }

    /* JADX INFO: renamed from: f */
    public boolean m8803f(String str) {
        return this.f28105f2.containsKey(str);
    }

    /* JADX INFO: renamed from: g */
    public void m8804g(float f, float f2, float f3, float f4) {
        this.f28089V1 = f;
        this.f28093Z1 = f2;
        this.f28095a2 = f3;
        this.f28097b2 = f4;
    }

    public void setState(d0b d0bVar) {
        m8804g(d0bVar.getX(), d0bVar.getY(), d0bVar.getWidth(), d0bVar.getHeight());
        applyParameters(d0bVar);
    }

    @Override // java.lang.Comparable
    public int compareTo(cza czaVar) {
        return Float.compare(this.f28086M1, czaVar.f28086M1);
    }

    public void setState(sud sudVar, d0b d0bVar, int i, float f) {
        m8804g(sudVar.f82927b, sudVar.f82929d, sudVar.width(), sudVar.height());
        applyParameters(d0bVar);
        this.f28084L = Float.NaN;
        this.f28085M = Float.NaN;
        if (i == 1) {
            this.f28104f = f - 90.0f;
        } else {
            if (i != 2) {
                return;
            }
            this.f28104f = f + 90.0f;
        }
    }
}
