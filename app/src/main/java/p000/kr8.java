package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0897R;
import androidx.constraintlayout.widget.C0898a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000.ubi;

/* JADX INFO: loaded from: classes.dex */
public class kr8 extends dq8 {

    /* JADX INFO: renamed from: V */
    public static final String f55111V = "KeyTimeCycle";

    /* JADX INFO: renamed from: W */
    public static final String f55112W = "KeyTimeCycle";

    /* JADX INFO: renamed from: X */
    public static final String f55113X = "wavePeriod";

    /* JADX INFO: renamed from: Y */
    public static final String f55114Y = "waveOffset";

    /* JADX INFO: renamed from: Z */
    public static final String f55115Z = "waveShape";

    /* JADX INFO: renamed from: a0 */
    public static final int f55116a0 = 0;

    /* JADX INFO: renamed from: b0 */
    public static final int f55117b0 = 1;

    /* JADX INFO: renamed from: c0 */
    public static final int f55118c0 = 2;

    /* JADX INFO: renamed from: d0 */
    public static final int f55119d0 = 3;

    /* JADX INFO: renamed from: e0 */
    public static final int f55120e0 = 4;

    /* JADX INFO: renamed from: f0 */
    public static final int f55121f0 = 5;

    /* JADX INFO: renamed from: g0 */
    public static final int f55122g0 = 6;

    /* JADX INFO: renamed from: h0 */
    public static final int f55123h0 = 3;

    /* JADX INFO: renamed from: D */
    public String f55124D;

    /* JADX INFO: renamed from: E */
    public int f55125E = -1;

    /* JADX INFO: renamed from: F */
    public float f55126F = Float.NaN;

    /* JADX INFO: renamed from: G */
    public float f55127G = Float.NaN;

    /* JADX INFO: renamed from: H */
    public float f55128H = Float.NaN;

    /* JADX INFO: renamed from: I */
    public float f55129I = Float.NaN;

    /* JADX INFO: renamed from: J */
    public float f55130J = Float.NaN;

    /* JADX INFO: renamed from: K */
    public float f55131K = Float.NaN;

    /* JADX INFO: renamed from: L */
    public float f55132L = Float.NaN;

    /* JADX INFO: renamed from: M */
    public float f55133M = Float.NaN;

    /* JADX INFO: renamed from: N */
    public float f55134N = Float.NaN;

    /* JADX INFO: renamed from: O */
    public float f55135O = Float.NaN;

    /* JADX INFO: renamed from: P */
    public float f55136P = Float.NaN;

    /* JADX INFO: renamed from: Q */
    public float f55137Q = Float.NaN;

    /* JADX INFO: renamed from: R */
    public int f55138R = 0;

    /* JADX INFO: renamed from: S */
    public String f55139S = null;

    /* JADX INFO: renamed from: T */
    public float f55140T = Float.NaN;

    /* JADX INFO: renamed from: U */
    public float f55141U = 0.0f;

    /* JADX INFO: renamed from: kr8$a */
    public static class C8505a {

        /* JADX INFO: renamed from: a */
        public static final int f55142a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f55143b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f55144c = 4;

        /* JADX INFO: renamed from: d */
        public static final int f55145d = 5;

        /* JADX INFO: renamed from: e */
        public static final int f55146e = 6;

        /* JADX INFO: renamed from: f */
        public static final int f55147f = 8;

        /* JADX INFO: renamed from: g */
        public static final int f55148g = 7;

        /* JADX INFO: renamed from: h */
        public static final int f55149h = 9;

        /* JADX INFO: renamed from: i */
        public static final int f55150i = 10;

        /* JADX INFO: renamed from: j */
        public static final int f55151j = 12;

        /* JADX INFO: renamed from: k */
        public static final int f55152k = 13;

        /* JADX INFO: renamed from: l */
        public static final int f55153l = 14;

        /* JADX INFO: renamed from: m */
        public static final int f55154m = 15;

        /* JADX INFO: renamed from: n */
        public static final int f55155n = 16;

        /* JADX INFO: renamed from: o */
        public static final int f55156o = 17;

        /* JADX INFO: renamed from: p */
        public static final int f55157p = 18;

        /* JADX INFO: renamed from: q */
        public static final int f55158q = 19;

        /* JADX INFO: renamed from: r */
        public static final int f55159r = 20;

        /* JADX INFO: renamed from: s */
        public static final int f55160s = 21;

        /* JADX INFO: renamed from: t */
        public static SparseIntArray f55161t;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f55161t = sparseIntArray;
            sparseIntArray.append(C0897R.styleable.KeyTimeCycle_android_alpha, 1);
            f55161t.append(C0897R.styleable.KeyTimeCycle_android_elevation, 2);
            f55161t.append(C0897R.styleable.KeyTimeCycle_android_rotation, 4);
            f55161t.append(C0897R.styleable.KeyTimeCycle_android_rotationX, 5);
            f55161t.append(C0897R.styleable.KeyTimeCycle_android_rotationY, 6);
            f55161t.append(C0897R.styleable.KeyTimeCycle_android_scaleX, 7);
            f55161t.append(C0897R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            f55161t.append(C0897R.styleable.KeyTimeCycle_transitionEasing, 9);
            f55161t.append(C0897R.styleable.KeyTimeCycle_motionTarget, 10);
            f55161t.append(C0897R.styleable.KeyTimeCycle_framePosition, 12);
            f55161t.append(C0897R.styleable.KeyTimeCycle_curveFit, 13);
            f55161t.append(C0897R.styleable.KeyTimeCycle_android_scaleY, 14);
            f55161t.append(C0897R.styleable.KeyTimeCycle_android_translationX, 15);
            f55161t.append(C0897R.styleable.KeyTimeCycle_android_translationY, 16);
            f55161t.append(C0897R.styleable.KeyTimeCycle_android_translationZ, 17);
            f55161t.append(C0897R.styleable.KeyTimeCycle_motionProgress, 18);
            f55161t.append(C0897R.styleable.KeyTimeCycle_wavePeriod, 20);
            f55161t.append(C0897R.styleable.KeyTimeCycle_waveOffset, 21);
            f55161t.append(C0897R.styleable.KeyTimeCycle_waveShape, 19);
        }

        private C8505a() {
        }

        public static void read(kr8 c, TypedArray a) {
            int indexCount = a.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = a.getIndex(i);
                switch (f55161t.get(index)) {
                    case 1:
                        c.f55126F = a.getFloat(index, c.f55126F);
                        break;
                    case 2:
                        c.f55127G = a.getDimension(index, c.f55127G);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + d99.f28832c + f55161t.get(index));
                        break;
                    case 4:
                        c.f55128H = a.getFloat(index, c.f55128H);
                        break;
                    case 5:
                        c.f55129I = a.getFloat(index, c.f55129I);
                        break;
                    case 6:
                        c.f55130J = a.getFloat(index, c.f55130J);
                        break;
                    case 7:
                        c.f55132L = a.getFloat(index, c.f55132L);
                        break;
                    case 8:
                        c.f55131K = a.getFloat(index, c.f55131K);
                        break;
                    case 9:
                        c.f55124D = a.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f6116c4) {
                            int resourceId = a.getResourceId(index, c.f30388b);
                            c.f30388b = resourceId;
                            if (resourceId == -1) {
                                c.f30389c = a.getString(index);
                            }
                        } else if (a.peekValue(index).type == 3) {
                            c.f30389c = a.getString(index);
                        } else {
                            c.f30388b = a.getResourceId(index, c.f30388b);
                        }
                        break;
                    case 12:
                        c.f30387a = a.getInt(index, c.f30387a);
                        break;
                    case 13:
                        c.f55125E = a.getInteger(index, c.f55125E);
                        break;
                    case 14:
                        c.f55133M = a.getFloat(index, c.f55133M);
                        break;
                    case 15:
                        c.f55134N = a.getDimension(index, c.f55134N);
                        break;
                    case 16:
                        c.f55135O = a.getDimension(index, c.f55135O);
                        break;
                    case 17:
                        c.f55136P = a.getDimension(index, c.f55136P);
                        break;
                    case 18:
                        c.f55137Q = a.getFloat(index, c.f55137Q);
                        break;
                    case 19:
                        if (a.peekValue(index).type == 3) {
                            c.f55139S = a.getString(index);
                            c.f55138R = 7;
                        } else {
                            c.f55138R = a.getInt(index, c.f55138R);
                        }
                        break;
                    case 20:
                        c.f55140T = a.getFloat(index, c.f55140T);
                        break;
                    case 21:
                        if (a.peekValue(index).type == 5) {
                            c.f55141U = a.getDimension(index, c.f55141U);
                        } else {
                            c.f55141U = a.getFloat(index, c.f55141U);
                        }
                        break;
                }
            }
        }
    }

    public kr8() {
        this.f30390d = 3;
        this.f30391e = new HashMap<>();
    }

    public void addTimeValues(HashMap<String, ubi> splines) {
        for (String str : splines.keySet()) {
            ubi ubiVar = splines.get(str);
            if (ubiVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f55129I)) {
                                break;
                            } else {
                                ubiVar.setPoint(this.f30387a, this.f55129I, this.f55140T, this.f55138R, this.f55141U);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f55130J)) {
                                break;
                            } else {
                                ubiVar.setPoint(this.f30387a, this.f55130J, this.f55140T, this.f55138R, this.f55141U);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f55134N)) {
                                break;
                            } else {
                                ubiVar.setPoint(this.f30387a, this.f55134N, this.f55140T, this.f55138R, this.f55141U);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f55135O)) {
                                break;
                            } else {
                                ubiVar.setPoint(this.f30387a, this.f55135O, this.f55140T, this.f55138R, this.f55141U);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f55136P)) {
                                break;
                            } else {
                                ubiVar.setPoint(this.f30387a, this.f55136P, this.f55140T, this.f55138R, this.f55141U);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f55137Q)) {
                                break;
                            } else {
                                ubiVar.setPoint(this.f30387a, this.f55137Q, this.f55140T, this.f55138R, this.f55141U);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f55132L)) {
                                break;
                            } else {
                                ubiVar.setPoint(this.f30387a, this.f55132L, this.f55140T, this.f55138R, this.f55141U);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f55133M)) {
                                break;
                            } else {
                                ubiVar.setPoint(this.f30387a, this.f55133M, this.f55140T, this.f55138R, this.f55141U);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f55128H)) {
                                break;
                            } else {
                                ubiVar.setPoint(this.f30387a, this.f55128H, this.f55140T, this.f55138R, this.f55141U);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f55127G)) {
                                break;
                            } else {
                                ubiVar.setPoint(this.f30387a, this.f55127G, this.f55140T, this.f55138R, this.f55141U);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f55131K)) {
                                break;
                            } else {
                                ubiVar.setPoint(this.f30387a, this.f55131K, this.f55140T, this.f55138R, this.f55141U);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f55126F)) {
                                break;
                            } else {
                                ubiVar.setPoint(this.f30387a, this.f55126F, this.f55140T, this.f55138R, this.f55141U);
                                break;
                            }
                            break;
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    C0898a c0898a = this.f30391e.get(str.substring(7));
                    if (c0898a != null) {
                        ((ubi.C13466b) ubiVar).setPoint(this.f30387a, c0898a, this.f55140T, this.f55138R, this.f55141U);
                    }
                }
            }
        }
    }

    @Override // p000.dq8
    public void addValues(HashMap<String, mbi> splines) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // p000.dq8
    public dq8 copy(dq8 src) {
        super.copy(src);
        kr8 kr8Var = (kr8) src;
        this.f55124D = kr8Var.f55124D;
        this.f55125E = kr8Var.f55125E;
        this.f55138R = kr8Var.f55138R;
        this.f55140T = kr8Var.f55140T;
        this.f55141U = kr8Var.f55141U;
        this.f55137Q = kr8Var.f55137Q;
        this.f55126F = kr8Var.f55126F;
        this.f55127G = kr8Var.f55127G;
        this.f55128H = kr8Var.f55128H;
        this.f55131K = kr8Var.f55131K;
        this.f55129I = kr8Var.f55129I;
        this.f55130J = kr8Var.f55130J;
        this.f55132L = kr8Var.f55132L;
        this.f55133M = kr8Var.f55133M;
        this.f55134N = kr8Var.f55134N;
        this.f55135O = kr8Var.f55135O;
        this.f55136P = kr8Var.f55136P;
        return this;
    }

    @Override // p000.dq8
    public void getAttributeNames(HashSet<String> attributes) {
        if (!Float.isNaN(this.f55126F)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.f55127G)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.f55128H)) {
            attributes.add(dq8.f30369i);
        }
        if (!Float.isNaN(this.f55129I)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.f55130J)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.f55134N)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.f55135O)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.f55136P)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.f55131K)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f55132L)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.f55133M)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.f55137Q)) {
            attributes.add("progress");
        }
        if (this.f30391e.size() > 0) {
            Iterator<String> it = this.f30391e.keySet().iterator();
            while (it.hasNext()) {
                attributes.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // p000.dq8
    public void load(Context context, AttributeSet attrs) {
        C8505a.read(this, context.obtainStyledAttributes(attrs, C0897R.styleable.KeyTimeCycle));
    }

    @Override // p000.dq8
    public void setInterpolation(HashMap<String, Integer> interpolation) {
        if (this.f55125E == -1) {
            return;
        }
        if (!Float.isNaN(this.f55126F)) {
            interpolation.put("alpha", Integer.valueOf(this.f55125E));
        }
        if (!Float.isNaN(this.f55127G)) {
            interpolation.put("elevation", Integer.valueOf(this.f55125E));
        }
        if (!Float.isNaN(this.f55128H)) {
            interpolation.put(dq8.f30369i, Integer.valueOf(this.f55125E));
        }
        if (!Float.isNaN(this.f55129I)) {
            interpolation.put("rotationX", Integer.valueOf(this.f55125E));
        }
        if (!Float.isNaN(this.f55130J)) {
            interpolation.put("rotationY", Integer.valueOf(this.f55125E));
        }
        if (!Float.isNaN(this.f55134N)) {
            interpolation.put("translationX", Integer.valueOf(this.f55125E));
        }
        if (!Float.isNaN(this.f55135O)) {
            interpolation.put("translationY", Integer.valueOf(this.f55125E));
        }
        if (!Float.isNaN(this.f55136P)) {
            interpolation.put("translationZ", Integer.valueOf(this.f55125E));
        }
        if (!Float.isNaN(this.f55131K)) {
            interpolation.put("transitionPathRotate", Integer.valueOf(this.f55125E));
        }
        if (!Float.isNaN(this.f55132L)) {
            interpolation.put("scaleX", Integer.valueOf(this.f55125E));
        }
        if (!Float.isNaN(this.f55132L)) {
            interpolation.put("scaleY", Integer.valueOf(this.f55125E));
        }
        if (!Float.isNaN(this.f55137Q)) {
            interpolation.put("progress", Integer.valueOf(this.f55125E));
        }
        if (this.f30391e.size() > 0) {
            Iterator<String> it = this.f30391e.keySet().iterator();
            while (it.hasNext()) {
                interpolation.put("CUSTOM," + it.next(), Integer.valueOf(this.f55125E));
            }
        }
    }

    @Override // p000.dq8
    public void setValue(String tag, Object value) {
        tag.hashCode();
        switch (tag) {
            case "motionProgress":
                this.f55137Q = m9298c(value);
                break;
            case "transitionEasing":
                this.f55124D = value.toString();
                break;
            case "rotationX":
                this.f55129I = m9298c(value);
                break;
            case "rotationY":
                this.f55130J = m9298c(value);
                break;
            case "translationX":
                this.f55134N = m9298c(value);
                break;
            case "translationY":
                this.f55135O = m9298c(value);
                break;
            case "translationZ":
                this.f55136P = m9298c(value);
                break;
            case "scaleX":
                this.f55132L = m9298c(value);
                break;
            case "scaleY":
                this.f55133M = m9298c(value);
                break;
            case "rotation":
                this.f55128H = m9298c(value);
                break;
            case "elevation":
                this.f55127G = m9298c(value);
                break;
            case "transitionPathRotate":
                this.f55131K = m9298c(value);
                break;
            case "alpha":
                this.f55126F = m9298c(value);
                break;
            case "waveOffset":
                this.f55141U = m9298c(value);
                break;
            case "wavePeriod":
                this.f55140T = m9298c(value);
                break;
            case "curveFit":
                this.f55125E = m9299d(value);
                break;
            case "waveShape":
                if (!(value instanceof Integer)) {
                    this.f55138R = 7;
                    this.f55139S = value.toString();
                    break;
                } else {
                    this.f55138R = m9299d(value);
                    break;
                }
                break;
        }
    }

    @Override // p000.dq8
    /* JADX INFO: renamed from: clone */
    public dq8 mo28677clone() {
        return new kr8().copy(this);
    }
}
