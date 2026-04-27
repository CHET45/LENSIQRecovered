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

/* JADX INFO: loaded from: classes.dex */
public class iq8 extends dq8 {

    /* JADX INFO: renamed from: X */
    public static final String f47909X = "KeyCycle";

    /* JADX INFO: renamed from: Y */
    public static final String f47910Y = "KeyCycle";

    /* JADX INFO: renamed from: Z */
    public static final String f47911Z = "wavePeriod";

    /* JADX INFO: renamed from: a0 */
    public static final String f47912a0 = "waveOffset";

    /* JADX INFO: renamed from: b0 */
    public static final String f47913b0 = "wavePhase";

    /* JADX INFO: renamed from: c0 */
    public static final String f47914c0 = "waveShape";

    /* JADX INFO: renamed from: d0 */
    public static final int f47915d0 = 0;

    /* JADX INFO: renamed from: e0 */
    public static final int f47916e0 = 1;

    /* JADX INFO: renamed from: f0 */
    public static final int f47917f0 = 2;

    /* JADX INFO: renamed from: g0 */
    public static final int f47918g0 = 3;

    /* JADX INFO: renamed from: h0 */
    public static final int f47919h0 = 4;

    /* JADX INFO: renamed from: i0 */
    public static final int f47920i0 = 5;

    /* JADX INFO: renamed from: j0 */
    public static final int f47921j0 = 6;

    /* JADX INFO: renamed from: k0 */
    public static final int f47922k0 = 4;

    /* JADX INFO: renamed from: D */
    public String f47923D = null;

    /* JADX INFO: renamed from: E */
    public int f47924E = 0;

    /* JADX INFO: renamed from: F */
    public int f47925F = -1;

    /* JADX INFO: renamed from: G */
    public String f47926G = null;

    /* JADX INFO: renamed from: H */
    public float f47927H = Float.NaN;

    /* JADX INFO: renamed from: I */
    public float f47928I = 0.0f;

    /* JADX INFO: renamed from: J */
    public float f47929J = 0.0f;

    /* JADX INFO: renamed from: K */
    public float f47930K = Float.NaN;

    /* JADX INFO: renamed from: L */
    public int f47931L = -1;

    /* JADX INFO: renamed from: M */
    public float f47932M = Float.NaN;

    /* JADX INFO: renamed from: N */
    public float f47933N = Float.NaN;

    /* JADX INFO: renamed from: O */
    public float f47934O = Float.NaN;

    /* JADX INFO: renamed from: P */
    public float f47935P = Float.NaN;

    /* JADX INFO: renamed from: Q */
    public float f47936Q = Float.NaN;

    /* JADX INFO: renamed from: R */
    public float f47937R = Float.NaN;

    /* JADX INFO: renamed from: S */
    public float f47938S = Float.NaN;

    /* JADX INFO: renamed from: T */
    public float f47939T = Float.NaN;

    /* JADX INFO: renamed from: U */
    public float f47940U = Float.NaN;

    /* JADX INFO: renamed from: V */
    public float f47941V = Float.NaN;

    /* JADX INFO: renamed from: W */
    public float f47942W = Float.NaN;

    /* JADX INFO: renamed from: iq8$a */
    public static class C7563a {

        /* JADX INFO: renamed from: a */
        public static final int f47943a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f47944b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f47945c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f47946d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f47947e = 5;

        /* JADX INFO: renamed from: f */
        public static final int f47948f = 6;

        /* JADX INFO: renamed from: g */
        public static final int f47949g = 7;

        /* JADX INFO: renamed from: h */
        public static final int f47950h = 8;

        /* JADX INFO: renamed from: i */
        public static final int f47951i = 9;

        /* JADX INFO: renamed from: j */
        public static final int f47952j = 10;

        /* JADX INFO: renamed from: k */
        public static final int f47953k = 11;

        /* JADX INFO: renamed from: l */
        public static final int f47954l = 12;

        /* JADX INFO: renamed from: m */
        public static final int f47955m = 13;

        /* JADX INFO: renamed from: n */
        public static final int f47956n = 14;

        /* JADX INFO: renamed from: o */
        public static final int f47957o = 15;

        /* JADX INFO: renamed from: p */
        public static final int f47958p = 16;

        /* JADX INFO: renamed from: q */
        public static final int f47959q = 17;

        /* JADX INFO: renamed from: r */
        public static final int f47960r = 18;

        /* JADX INFO: renamed from: s */
        public static final int f47961s = 19;

        /* JADX INFO: renamed from: t */
        public static final int f47962t = 20;

        /* JADX INFO: renamed from: u */
        public static final int f47963u = 21;

        /* JADX INFO: renamed from: v */
        public static SparseIntArray f47964v;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f47964v = sparseIntArray;
            sparseIntArray.append(C0897R.styleable.KeyCycle_motionTarget, 1);
            f47964v.append(C0897R.styleable.KeyCycle_framePosition, 2);
            f47964v.append(C0897R.styleable.KeyCycle_transitionEasing, 3);
            f47964v.append(C0897R.styleable.KeyCycle_curveFit, 4);
            f47964v.append(C0897R.styleable.KeyCycle_waveShape, 5);
            f47964v.append(C0897R.styleable.KeyCycle_wavePeriod, 6);
            f47964v.append(C0897R.styleable.KeyCycle_waveOffset, 7);
            f47964v.append(C0897R.styleable.KeyCycle_waveVariesBy, 8);
            f47964v.append(C0897R.styleable.KeyCycle_android_alpha, 9);
            f47964v.append(C0897R.styleable.KeyCycle_android_elevation, 10);
            f47964v.append(C0897R.styleable.KeyCycle_android_rotation, 11);
            f47964v.append(C0897R.styleable.KeyCycle_android_rotationX, 12);
            f47964v.append(C0897R.styleable.KeyCycle_android_rotationY, 13);
            f47964v.append(C0897R.styleable.KeyCycle_transitionPathRotate, 14);
            f47964v.append(C0897R.styleable.KeyCycle_android_scaleX, 15);
            f47964v.append(C0897R.styleable.KeyCycle_android_scaleY, 16);
            f47964v.append(C0897R.styleable.KeyCycle_android_translationX, 17);
            f47964v.append(C0897R.styleable.KeyCycle_android_translationY, 18);
            f47964v.append(C0897R.styleable.KeyCycle_android_translationZ, 19);
            f47964v.append(C0897R.styleable.KeyCycle_motionProgress, 20);
            f47964v.append(C0897R.styleable.KeyCycle_wavePhase, 21);
        }

        private C7563a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void read(iq8 c, TypedArray a) {
            int indexCount = a.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = a.getIndex(i);
                switch (f47964v.get(index)) {
                    case 1:
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
                    case 2:
                        c.f30387a = a.getInt(index, c.f30387a);
                        break;
                    case 3:
                        c.f47923D = a.getString(index);
                        break;
                    case 4:
                        c.f47924E = a.getInteger(index, c.f47924E);
                        break;
                    case 5:
                        if (a.peekValue(index).type == 3) {
                            c.f47926G = a.getString(index);
                            c.f47925F = 7;
                        } else {
                            c.f47925F = a.getInt(index, c.f47925F);
                        }
                        break;
                    case 6:
                        c.f47927H = a.getFloat(index, c.f47927H);
                        break;
                    case 7:
                        if (a.peekValue(index).type == 5) {
                            c.f47928I = a.getDimension(index, c.f47928I);
                        } else {
                            c.f47928I = a.getFloat(index, c.f47928I);
                        }
                        break;
                    case 8:
                        c.f47931L = a.getInt(index, c.f47931L);
                        break;
                    case 9:
                        c.f47932M = a.getFloat(index, c.f47932M);
                        break;
                    case 10:
                        c.f47933N = a.getDimension(index, c.f47933N);
                        break;
                    case 11:
                        c.f47934O = a.getFloat(index, c.f47934O);
                        break;
                    case 12:
                        c.f47936Q = a.getFloat(index, c.f47936Q);
                        break;
                    case 13:
                        c.f47937R = a.getFloat(index, c.f47937R);
                        break;
                    case 14:
                        c.f47935P = a.getFloat(index, c.f47935P);
                        break;
                    case 15:
                        c.f47938S = a.getFloat(index, c.f47938S);
                        break;
                    case 16:
                        c.f47939T = a.getFloat(index, c.f47939T);
                        break;
                    case 17:
                        c.f47940U = a.getDimension(index, c.f47940U);
                        break;
                    case 18:
                        c.f47941V = a.getDimension(index, c.f47941V);
                        break;
                    case 19:
                        c.f47942W = a.getDimension(index, c.f47942W);
                        break;
                    case 20:
                        c.f47930K = a.getFloat(index, c.f47930K);
                        break;
                    case 21:
                        c.f47929J = a.getFloat(index, c.f47929J) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + d99.f28832c + f47964v.get(index));
                        break;
                }
            }
        }
    }

    public iq8() {
        this.f30390d = 4;
        this.f30391e = new HashMap<>();
    }

    public void addCycleValues(HashMap<String, rai> oscSet) {
        rai raiVar;
        rai raiVar2;
        for (String str : oscSet.keySet()) {
            if (str.startsWith("CUSTOM")) {
                C0898a c0898a = this.f30391e.get(str.substring(7));
                if (c0898a != null && c0898a.getType() == C0898a.b.FLOAT_TYPE && (raiVar = oscSet.get(str)) != null) {
                    raiVar.setPoint(this.f30387a, this.f47925F, this.f47926G, this.f47931L, this.f47927H, this.f47928I, this.f47929J, c0898a.getValueToInterpolate(), c0898a);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value) && (raiVar2 = oscSet.get(str)) != null) {
                    raiVar2.setPoint(this.f30387a, this.f47925F, this.f47926G, this.f47931L, this.f47927H, this.f47928I, this.f47929J, value);
                }
            }
        }
    }

    @Override // p000.dq8
    public void addValues(HashMap<String, mbi> splines) {
        vj3.logStack("KeyCycle", "add " + splines.size() + " values", 2);
        for (String str : splines.keySet()) {
            mbi mbiVar = splines.get(str);
            if (mbiVar != null) {
                str.hashCode();
                switch (str) {
                    case "rotationX":
                        mbiVar.setPoint(this.f30387a, this.f47936Q);
                        break;
                    case "rotationY":
                        mbiVar.setPoint(this.f30387a, this.f47937R);
                        break;
                    case "translationX":
                        mbiVar.setPoint(this.f30387a, this.f47940U);
                        break;
                    case "translationY":
                        mbiVar.setPoint(this.f30387a, this.f47941V);
                        break;
                    case "translationZ":
                        mbiVar.setPoint(this.f30387a, this.f47942W);
                        break;
                    case "progress":
                        mbiVar.setPoint(this.f30387a, this.f47930K);
                        break;
                    case "scaleX":
                        mbiVar.setPoint(this.f30387a, this.f47938S);
                        break;
                    case "scaleY":
                        mbiVar.setPoint(this.f30387a, this.f47939T);
                        break;
                    case "rotation":
                        mbiVar.setPoint(this.f30387a, this.f47934O);
                        break;
                    case "elevation":
                        mbiVar.setPoint(this.f30387a, this.f47933N);
                        break;
                    case "transitionPathRotate":
                        mbiVar.setPoint(this.f30387a, this.f47935P);
                        break;
                    case "alpha":
                        mbiVar.setPoint(this.f30387a, this.f47932M);
                        break;
                    case "waveOffset":
                        mbiVar.setPoint(this.f30387a, this.f47928I);
                        break;
                    case "wavePhase":
                        mbiVar.setPoint(this.f30387a, this.f47929J);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("  UNKNOWN  ");
                            sb.append(str);
                            break;
                        }
                        break;
                }
            }
        }
    }

    @Override // p000.dq8
    public dq8 copy(dq8 src) {
        super.copy(src);
        iq8 iq8Var = (iq8) src;
        this.f47923D = iq8Var.f47923D;
        this.f47924E = iq8Var.f47924E;
        this.f47925F = iq8Var.f47925F;
        this.f47926G = iq8Var.f47926G;
        this.f47927H = iq8Var.f47927H;
        this.f47928I = iq8Var.f47928I;
        this.f47929J = iq8Var.f47929J;
        this.f47930K = iq8Var.f47930K;
        this.f47931L = iq8Var.f47931L;
        this.f47932M = iq8Var.f47932M;
        this.f47933N = iq8Var.f47933N;
        this.f47934O = iq8Var.f47934O;
        this.f47935P = iq8Var.f47935P;
        this.f47936Q = iq8Var.f47936Q;
        this.f47937R = iq8Var.f47937R;
        this.f47938S = iq8Var.f47938S;
        this.f47939T = iq8Var.f47939T;
        this.f47940U = iq8Var.f47940U;
        this.f47941V = iq8Var.f47941V;
        this.f47942W = iq8Var.f47942W;
        return this;
    }

    @Override // p000.dq8
    public void getAttributeNames(HashSet<String> attributes) {
        if (!Float.isNaN(this.f47932M)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.f47933N)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.f47934O)) {
            attributes.add(dq8.f30369i);
        }
        if (!Float.isNaN(this.f47936Q)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.f47937R)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.f47938S)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.f47939T)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.f47935P)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f47940U)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.f47941V)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.f47942W)) {
            attributes.add("translationZ");
        }
        if (this.f30391e.size() > 0) {
            Iterator<String> it = this.f30391e.keySet().iterator();
            while (it.hasNext()) {
                attributes.add("CUSTOM," + it.next());
            }
        }
    }

    public float getValue(String key) {
        key.hashCode();
        switch (key) {
            case "rotationX":
                return this.f47936Q;
            case "rotationY":
                return this.f47937R;
            case "translationX":
                return this.f47940U;
            case "translationY":
                return this.f47941V;
            case "translationZ":
                return this.f47942W;
            case "progress":
                return this.f47930K;
            case "scaleX":
                return this.f47938S;
            case "scaleY":
                return this.f47939T;
            case "rotation":
                return this.f47934O;
            case "elevation":
                return this.f47933N;
            case "transitionPathRotate":
                return this.f47935P;
            case "alpha":
                return this.f47932M;
            case "waveOffset":
                return this.f47928I;
            case "wavePhase":
                return this.f47929J;
            default:
                if (key.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("  UNKNOWN  ");
                sb.append(key);
                return Float.NaN;
        }
    }

    @Override // p000.dq8
    public void load(Context context, AttributeSet attrs) {
        C7563a.read(this, context.obtainStyledAttributes(attrs, C0897R.styleable.KeyCycle));
    }

    @Override // p000.dq8
    public void setValue(String tag, Object value) {
        tag.hashCode();
        switch (tag) {
            case "motionProgress":
                this.f47930K = m9298c(value);
                break;
            case "transitionEasing":
                this.f47923D = value.toString();
                break;
            case "rotationX":
                this.f47936Q = m9298c(value);
                break;
            case "rotationY":
                this.f47937R = m9298c(value);
                break;
            case "translationX":
                this.f47940U = m9298c(value);
                break;
            case "translationY":
                this.f47941V = m9298c(value);
                break;
            case "translationZ":
                this.f47942W = m9298c(value);
                break;
            case "scaleX":
                this.f47938S = m9298c(value);
                break;
            case "scaleY":
                this.f47939T = m9298c(value);
                break;
            case "rotation":
                this.f47934O = m9298c(value);
                break;
            case "elevation":
                this.f47933N = m9298c(value);
                break;
            case "transitionPathRotate":
                this.f47935P = m9298c(value);
                break;
            case "alpha":
                this.f47932M = m9298c(value);
                break;
            case "waveOffset":
                this.f47928I = m9298c(value);
                break;
            case "wavePeriod":
                this.f47927H = m9298c(value);
                break;
            case "curveFit":
                this.f47924E = m9299d(value);
                break;
            case "wavePhase":
                this.f47929J = m9298c(value);
                break;
            case "waveShape":
                if (!(value instanceof Integer)) {
                    this.f47925F = 7;
                    this.f47926G = value.toString();
                    break;
                } else {
                    this.f47925F = m9299d(value);
                    break;
                }
                break;
        }
    }

    @Override // p000.dq8
    /* JADX INFO: renamed from: clone */
    public dq8 mo28677clone() {
        return new iq8().copy(this);
    }
}
