package p000;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0898a;
import androidx.constraintlayout.widget.C0901d;
import com.arthenica.ffmpegkit.StreamInformation;
import com.eyevue.glassapp.view.photo.C2865a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p000.mbi;

/* JADX INFO: loaded from: classes.dex */
public class bza implements Comparable<bza> {

    /* JADX INFO: renamed from: j2 */
    public static final String f15239j2 = "MotionPaths";

    /* JADX INFO: renamed from: k2 */
    public static final boolean f15240k2 = false;

    /* JADX INFO: renamed from: l2 */
    public static final int f15241l2 = 1;

    /* JADX INFO: renamed from: m2 */
    public static final int f15242m2 = 2;

    /* JADX INFO: renamed from: n2 */
    public static String[] f15243n2 = {C2865a.f19004r, "x", "y", StreamInformation.KEY_WIDTH, StreamInformation.KEY_HEIGHT, "pathRotate"};

    /* JADX INFO: renamed from: M1 */
    public float f15249M1;

    /* JADX INFO: renamed from: V1 */
    public float f15252V1;

    /* JADX INFO: renamed from: Y */
    public gv4 f15254Y;

    /* JADX INFO: renamed from: Z1 */
    public float f15256Z1;

    /* JADX INFO: renamed from: a2 */
    public float f15258a2;

    /* JADX INFO: renamed from: b2 */
    public float f15260b2;

    /* JADX INFO: renamed from: c */
    public int f15261c;

    /* JADX INFO: renamed from: a */
    public float f15257a = 1.0f;

    /* JADX INFO: renamed from: b */
    public int f15259b = 0;

    /* JADX INFO: renamed from: d */
    public boolean f15263d = false;

    /* JADX INFO: renamed from: e */
    public float f15265e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f15267f = 0.0f;

    /* JADX INFO: renamed from: m */
    public float f15272m = 0.0f;

    /* JADX INFO: renamed from: C */
    public float f15244C = 0.0f;

    /* JADX INFO: renamed from: F */
    public float f15245F = 1.0f;

    /* JADX INFO: renamed from: H */
    public float f15246H = 1.0f;

    /* JADX INFO: renamed from: L */
    public float f15247L = Float.NaN;

    /* JADX INFO: renamed from: M */
    public float f15248M = Float.NaN;

    /* JADX INFO: renamed from: N */
    public float f15250N = 0.0f;

    /* JADX INFO: renamed from: Q */
    public float f15251Q = 0.0f;

    /* JADX INFO: renamed from: X */
    public float f15253X = 0.0f;

    /* JADX INFO: renamed from: Z */
    public int f15255Z = 0;

    /* JADX INFO: renamed from: c2 */
    public float f15262c2 = Float.NaN;

    /* JADX INFO: renamed from: d2 */
    public float f15264d2 = Float.NaN;

    /* JADX INFO: renamed from: e2 */
    public int f15266e2 = -1;

    /* JADX INFO: renamed from: f2 */
    public LinkedHashMap<String, C0898a> f15268f2 = new LinkedHashMap<>();

    /* JADX INFO: renamed from: g2 */
    public int f15269g2 = 0;

    /* JADX INFO: renamed from: h2 */
    public double[] f15270h2 = new double[18];

    /* JADX INFO: renamed from: i2 */
    public double[] f15271i2 = new double[18];

    private boolean diff(float a, float b) {
        return (Float.isNaN(a) || Float.isNaN(b)) ? Float.isNaN(a) != Float.isNaN(b) : Math.abs(a - b) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: a */
    public void m3497a(bza points, HashSet<String> keySet) {
        if (diff(this.f15257a, points.f15257a)) {
            keySet.add("alpha");
        }
        if (diff(this.f15265e, points.f15265e)) {
            keySet.add("elevation");
        }
        int i = this.f15261c;
        int i2 = points.f15261c;
        if (i != i2 && this.f15259b == 0 && (i == 0 || i2 == 0)) {
            keySet.add("alpha");
        }
        if (diff(this.f15267f, points.f15267f)) {
            keySet.add(dq8.f30369i);
        }
        if (!Float.isNaN(this.f15262c2) || !Float.isNaN(points.f15262c2)) {
            keySet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f15264d2) || !Float.isNaN(points.f15264d2)) {
            keySet.add("progress");
        }
        if (diff(this.f15272m, points.f15272m)) {
            keySet.add("rotationX");
        }
        if (diff(this.f15244C, points.f15244C)) {
            keySet.add("rotationY");
        }
        if (diff(this.f15247L, points.f15247L)) {
            keySet.add(dq8.f30372l);
        }
        if (diff(this.f15248M, points.f15248M)) {
            keySet.add(dq8.f30373m);
        }
        if (diff(this.f15245F, points.f15245F)) {
            keySet.add("scaleX");
        }
        if (diff(this.f15246H, points.f15246H)) {
            keySet.add("scaleY");
        }
        if (diff(this.f15250N, points.f15250N)) {
            keySet.add("translationX");
        }
        if (diff(this.f15251Q, points.f15251Q)) {
            keySet.add("translationY");
        }
        if (diff(this.f15253X, points.f15253X)) {
            keySet.add("translationZ");
        }
    }

    public void addValues(HashMap<String, mbi> splines, int mFramePosition) {
        mbi mbiVar;
        for (String str : splines.keySet()) {
            mbiVar = splines.get(str);
            str.hashCode();
            switch (str) {
                case "rotationX":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15272m) ? 0.0f : this.f15272m);
                    break;
                case "rotationY":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15244C) ? 0.0f : this.f15244C);
                    break;
                case "translationX":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15250N) ? 0.0f : this.f15250N);
                    break;
                case "translationY":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15251Q) ? 0.0f : this.f15251Q);
                    break;
                case "translationZ":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15253X) ? 0.0f : this.f15253X);
                    break;
                case "progress":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15264d2) ? 0.0f : this.f15264d2);
                    break;
                case "scaleX":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15245F) ? 1.0f : this.f15245F);
                    break;
                case "scaleY":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15246H) ? 1.0f : this.f15246H);
                    break;
                case "transformPivotX":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15247L) ? 0.0f : this.f15247L);
                    break;
                case "transformPivotY":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15248M) ? 0.0f : this.f15248M);
                    break;
                case "rotation":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15267f) ? 0.0f : this.f15267f);
                    break;
                case "elevation":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15265e) ? 0.0f : this.f15265e);
                    break;
                case "transitionPathRotate":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15262c2) ? 0.0f : this.f15262c2);
                    break;
                case "alpha":
                    mbiVar.setPoint(mFramePosition, Float.isNaN(this.f15257a) ? 1.0f : this.f15257a);
                    break;
                default:
                    if (!str.startsWith("CUSTOM")) {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    } else {
                        String str2 = str.split(",")[1];
                        if (this.f15268f2.containsKey(str2)) {
                            C0898a c0898a = this.f15268f2.get(str2);
                            if (mbiVar instanceof mbi.C9264b) {
                                ((mbi.C9264b) mbiVar).setPoint(mFramePosition, c0898a);
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + mFramePosition + ", value" + c0898a.getValueToInterpolate() + mbiVar);
                            }
                        }
                        break;
                    }
                    break;
            }
        }
    }

    public void applyParameters(View view) {
        this.f15261c = view.getVisibility();
        this.f15257a = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f15263d = false;
        this.f15265e = view.getElevation();
        this.f15267f = view.getRotation();
        this.f15272m = view.getRotationX();
        this.f15244C = view.getRotationY();
        this.f15245F = view.getScaleX();
        this.f15246H = view.getScaleY();
        this.f15247L = view.getPivotX();
        this.f15248M = view.getPivotY();
        this.f15250N = view.getTranslationX();
        this.f15251Q = view.getTranslationY();
        this.f15253X = view.getTranslationZ();
    }

    /* JADX INFO: renamed from: b */
    public void m3498b(bza points, boolean[] mask, String[] custom) {
        mask[0] = mask[0] | diff(this.f15249M1, points.f15249M1);
        mask[1] = mask[1] | diff(this.f15252V1, points.f15252V1);
        mask[2] = mask[2] | diff(this.f15256Z1, points.f15256Z1);
        mask[3] = mask[3] | diff(this.f15258a2, points.f15258a2);
        mask[4] = diff(this.f15260b2, points.f15260b2) | mask[4];
    }

    /* JADX INFO: renamed from: c */
    public void m3499c(double[] data, int[] toUse) {
        int i = 0;
        float[] fArr = {this.f15249M1, this.f15252V1, this.f15256Z1, this.f15258a2, this.f15260b2, this.f15257a, this.f15265e, this.f15267f, this.f15272m, this.f15244C, this.f15245F, this.f15246H, this.f15247L, this.f15248M, this.f15250N, this.f15251Q, this.f15253X, this.f15262c2};
        for (int i2 : toUse) {
            if (i2 < 18) {
                data[i] = fArr[r5];
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int m3500d(String name, double[] value, int offset) {
        C0898a c0898a = this.f15268f2.get(name);
        if (c0898a.numberOfInterpolatedValues() == 1) {
            value[offset] = c0898a.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = c0898a.numberOfInterpolatedValues();
        c0898a.getValuesToInterpolate(new float[iNumberOfInterpolatedValues]);
        int i = 0;
        while (i < iNumberOfInterpolatedValues) {
            value[offset] = r1[i];
            i++;
            offset++;
        }
        return iNumberOfInterpolatedValues;
    }

    /* JADX INFO: renamed from: e */
    public int m3501e(String name) {
        return this.f15268f2.get(name).numberOfInterpolatedValues();
    }

    /* JADX INFO: renamed from: f */
    public boolean m3502f(String name) {
        return this.f15268f2.containsKey(name);
    }

    /* JADX INFO: renamed from: g */
    public void m3503g(float x, float y, float w, float h) {
        this.f15252V1 = x;
        this.f15256Z1 = y;
        this.f15258a2 = w;
        this.f15260b2 = h;
    }

    public void setState(View view) {
        m3503g(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        applyParameters(view);
    }

    @Override // java.lang.Comparable
    public int compareTo(bza o) {
        return Float.compare(this.f15249M1, o.f15249M1);
    }

    public void setState(Rect rect, View view, int rotation, float prevous) {
        m3503g(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(view);
        this.f15247L = Float.NaN;
        this.f15248M = Float.NaN;
        if (rotation == 1) {
            this.f15267f = prevous - 90.0f;
        } else {
            if (rotation != 2) {
                return;
            }
            this.f15267f = prevous + 90.0f;
        }
    }

    public void setState(Rect cw, C0901d constraintSet, int rotation, int viewId) {
        m3503g(cw.left, cw.top, cw.width(), cw.height());
        applyParameters(constraintSet.getParameters(viewId));
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    if (rotation != 4) {
                        return;
                    }
                }
            }
            float f = this.f15267f + 90.0f;
            this.f15267f = f;
            if (f > 180.0f) {
                this.f15267f = f - 360.0f;
                return;
            }
            return;
        }
        this.f15267f -= 90.0f;
    }

    public void applyParameters(C0901d.a c) {
        C0901d.d dVar = c.f7064c;
        int i = dVar.f7256c;
        this.f15259b = i;
        int i2 = dVar.f7255b;
        this.f15261c = i2;
        this.f15257a = (i2 == 0 || i != 0) ? dVar.f7257d : 0.0f;
        C0901d.e eVar = c.f7067f;
        this.f15263d = eVar.f7284m;
        this.f15265e = eVar.f7285n;
        this.f15267f = eVar.f7273b;
        this.f15272m = eVar.f7274c;
        this.f15244C = eVar.f7275d;
        this.f15245F = eVar.f7276e;
        this.f15246H = eVar.f7277f;
        this.f15247L = eVar.f7278g;
        this.f15248M = eVar.f7279h;
        this.f15250N = eVar.f7281j;
        this.f15251Q = eVar.f7282k;
        this.f15253X = eVar.f7283l;
        this.f15254Y = gv4.getInterpolator(c.f7065d.f7243d);
        C0901d.c cVar = c.f7065d;
        this.f15262c2 = cVar.f7248i;
        this.f15255Z = cVar.f7245f;
        this.f15266e2 = cVar.f7241b;
        this.f15264d2 = c.f7064c.f7258e;
        for (String str : c.f7068g.keySet()) {
            C0898a c0898a = c.f7068g.get(str);
            if (c0898a.isContinuous()) {
                this.f15268f2.put(str, c0898a);
            }
        }
    }
}
