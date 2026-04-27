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
import p000.mbi;

/* JADX INFO: loaded from: classes.dex */
public class fq8 extends dq8 {

    /* JADX INFO: renamed from: U */
    public static final String f37424U = "KeyAttribute";

    /* JADX INFO: renamed from: V */
    public static final String f37425V = "KeyAttributes";

    /* JADX INFO: renamed from: W */
    public static final boolean f37426W = false;

    /* JADX INFO: renamed from: X */
    public static final int f37427X = 1;

    /* JADX INFO: renamed from: D */
    public String f37428D;

    /* JADX INFO: renamed from: E */
    public int f37429E = -1;

    /* JADX INFO: renamed from: F */
    public boolean f37430F = false;

    /* JADX INFO: renamed from: G */
    public float f37431G = Float.NaN;

    /* JADX INFO: renamed from: H */
    public float f37432H = Float.NaN;

    /* JADX INFO: renamed from: I */
    public float f37433I = Float.NaN;

    /* JADX INFO: renamed from: J */
    public float f37434J = Float.NaN;

    /* JADX INFO: renamed from: K */
    public float f37435K = Float.NaN;

    /* JADX INFO: renamed from: L */
    public float f37436L = Float.NaN;

    /* JADX INFO: renamed from: M */
    public float f37437M = Float.NaN;

    /* JADX INFO: renamed from: N */
    public float f37438N = Float.NaN;

    /* JADX INFO: renamed from: O */
    public float f37439O = Float.NaN;

    /* JADX INFO: renamed from: P */
    public float f37440P = Float.NaN;

    /* JADX INFO: renamed from: Q */
    public float f37441Q = Float.NaN;

    /* JADX INFO: renamed from: R */
    public float f37442R = Float.NaN;

    /* JADX INFO: renamed from: S */
    public float f37443S = Float.NaN;

    /* JADX INFO: renamed from: T */
    public float f37444T = Float.NaN;

    /* JADX INFO: renamed from: fq8$a */
    public static class C5929a {

        /* JADX INFO: renamed from: a */
        public static final int f37445a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f37446b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f37447c = 4;

        /* JADX INFO: renamed from: d */
        public static final int f37448d = 5;

        /* JADX INFO: renamed from: e */
        public static final int f37449e = 6;

        /* JADX INFO: renamed from: f */
        public static final int f37450f = 8;

        /* JADX INFO: renamed from: g */
        public static final int f37451g = 7;

        /* JADX INFO: renamed from: h */
        public static final int f37452h = 9;

        /* JADX INFO: renamed from: i */
        public static final int f37453i = 10;

        /* JADX INFO: renamed from: j */
        public static final int f37454j = 12;

        /* JADX INFO: renamed from: k */
        public static final int f37455k = 13;

        /* JADX INFO: renamed from: l */
        public static final int f37456l = 14;

        /* JADX INFO: renamed from: m */
        public static final int f37457m = 15;

        /* JADX INFO: renamed from: n */
        public static final int f37458n = 16;

        /* JADX INFO: renamed from: o */
        public static final int f37459o = 17;

        /* JADX INFO: renamed from: p */
        public static final int f37460p = 18;

        /* JADX INFO: renamed from: q */
        public static final int f37461q = 19;

        /* JADX INFO: renamed from: r */
        public static final int f37462r = 20;

        /* JADX INFO: renamed from: s */
        public static SparseIntArray f37463s;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f37463s = sparseIntArray;
            sparseIntArray.append(C0897R.styleable.KeyAttribute_android_alpha, 1);
            f37463s.append(C0897R.styleable.KeyAttribute_android_elevation, 2);
            f37463s.append(C0897R.styleable.KeyAttribute_android_rotation, 4);
            f37463s.append(C0897R.styleable.KeyAttribute_android_rotationX, 5);
            f37463s.append(C0897R.styleable.KeyAttribute_android_rotationY, 6);
            f37463s.append(C0897R.styleable.KeyAttribute_android_transformPivotX, 19);
            f37463s.append(C0897R.styleable.KeyAttribute_android_transformPivotY, 20);
            f37463s.append(C0897R.styleable.KeyAttribute_android_scaleX, 7);
            f37463s.append(C0897R.styleable.KeyAttribute_transitionPathRotate, 8);
            f37463s.append(C0897R.styleable.KeyAttribute_transitionEasing, 9);
            f37463s.append(C0897R.styleable.KeyAttribute_motionTarget, 10);
            f37463s.append(C0897R.styleable.KeyAttribute_framePosition, 12);
            f37463s.append(C0897R.styleable.KeyAttribute_curveFit, 13);
            f37463s.append(C0897R.styleable.KeyAttribute_android_scaleY, 14);
            f37463s.append(C0897R.styleable.KeyAttribute_android_translationX, 15);
            f37463s.append(C0897R.styleable.KeyAttribute_android_translationY, 16);
            f37463s.append(C0897R.styleable.KeyAttribute_android_translationZ, 17);
            f37463s.append(C0897R.styleable.KeyAttribute_motionProgress, 18);
        }

        private C5929a() {
        }

        public static void read(fq8 c, TypedArray a) {
            int indexCount = a.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = a.getIndex(i);
                switch (f37463s.get(index)) {
                    case 1:
                        c.f37431G = a.getFloat(index, c.f37431G);
                        break;
                    case 2:
                        c.f37432H = a.getDimension(index, c.f37432H);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + d99.f28832c + f37463s.get(index));
                        break;
                    case 4:
                        c.f37433I = a.getFloat(index, c.f37433I);
                        break;
                    case 5:
                        c.f37434J = a.getFloat(index, c.f37434J);
                        break;
                    case 6:
                        c.f37435K = a.getFloat(index, c.f37435K);
                        break;
                    case 7:
                        c.f37439O = a.getFloat(index, c.f37439O);
                        break;
                    case 8:
                        c.f37438N = a.getFloat(index, c.f37438N);
                        break;
                    case 9:
                        c.f37428D = a.getString(index);
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
                        c.f37429E = a.getInteger(index, c.f37429E);
                        break;
                    case 14:
                        c.f37440P = a.getFloat(index, c.f37440P);
                        break;
                    case 15:
                        c.f37441Q = a.getDimension(index, c.f37441Q);
                        break;
                    case 16:
                        c.f37442R = a.getDimension(index, c.f37442R);
                        break;
                    case 17:
                        c.f37443S = a.getDimension(index, c.f37443S);
                        break;
                    case 18:
                        c.f37444T = a.getFloat(index, c.f37444T);
                        break;
                    case 19:
                        c.f37436L = a.getDimension(index, c.f37436L);
                        break;
                    case 20:
                        c.f37437M = a.getDimension(index, c.f37437M);
                        break;
                }
            }
        }
    }

    public fq8() {
        this.f30390d = 1;
        this.f30391e = new HashMap<>();
    }

    /* JADX INFO: renamed from: J */
    public int m11097J() {
        return this.f37429E;
    }

    @Override // p000.dq8
    public void addValues(HashMap<String, mbi> splines) {
        for (String str : splines.keySet()) {
            mbi mbiVar = splines.get(str);
            if (mbiVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f37434J)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37434J);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f37435K)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37435K);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f37441Q)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37441Q);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f37442R)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37442R);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f37443S)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37443S);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f37444T)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37444T);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f37439O)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37439O);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f37440P)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37440P);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f37434J)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37436L);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.f37435K)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37437M);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f37433I)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37433I);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f37432H)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37432H);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f37438N)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37438N);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f37431G)) {
                                break;
                            } else {
                                mbiVar.setPoint(this.f30387a, this.f37431G);
                                break;
                            }
                            break;
                    }
                } else {
                    C0898a c0898a = this.f30391e.get(str.substring(7));
                    if (c0898a != null) {
                        ((mbi.C9264b) mbiVar).setPoint(this.f30387a, c0898a);
                    }
                }
            }
        }
    }

    @Override // p000.dq8
    public dq8 copy(dq8 src) {
        super.copy(src);
        fq8 fq8Var = (fq8) src;
        this.f37429E = fq8Var.f37429E;
        this.f37430F = fq8Var.f37430F;
        this.f37431G = fq8Var.f37431G;
        this.f37432H = fq8Var.f37432H;
        this.f37433I = fq8Var.f37433I;
        this.f37434J = fq8Var.f37434J;
        this.f37435K = fq8Var.f37435K;
        this.f37436L = fq8Var.f37436L;
        this.f37437M = fq8Var.f37437M;
        this.f37438N = fq8Var.f37438N;
        this.f37439O = fq8Var.f37439O;
        this.f37440P = fq8Var.f37440P;
        this.f37441Q = fq8Var.f37441Q;
        this.f37442R = fq8Var.f37442R;
        this.f37443S = fq8Var.f37443S;
        this.f37444T = fq8Var.f37444T;
        return this;
    }

    @Override // p000.dq8
    public void getAttributeNames(HashSet<String> attributes) {
        if (!Float.isNaN(this.f37431G)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.f37432H)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.f37433I)) {
            attributes.add(dq8.f30369i);
        }
        if (!Float.isNaN(this.f37434J)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.f37435K)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.f37436L)) {
            attributes.add(dq8.f30372l);
        }
        if (!Float.isNaN(this.f37437M)) {
            attributes.add(dq8.f30373m);
        }
        if (!Float.isNaN(this.f37441Q)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.f37442R)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.f37443S)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.f37438N)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f37439O)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.f37440P)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.f37444T)) {
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
        C5929a.read(this, context.obtainStyledAttributes(attrs, C0897R.styleable.KeyAttribute));
    }

    @Override // p000.dq8
    public void setInterpolation(HashMap<String, Integer> interpolation) {
        if (this.f37429E == -1) {
            return;
        }
        if (!Float.isNaN(this.f37431G)) {
            interpolation.put("alpha", Integer.valueOf(this.f37429E));
        }
        if (!Float.isNaN(this.f37432H)) {
            interpolation.put("elevation", Integer.valueOf(this.f37429E));
        }
        if (!Float.isNaN(this.f37433I)) {
            interpolation.put(dq8.f30369i, Integer.valueOf(this.f37429E));
        }
        if (!Float.isNaN(this.f37434J)) {
            interpolation.put("rotationX", Integer.valueOf(this.f37429E));
        }
        if (!Float.isNaN(this.f37435K)) {
            interpolation.put("rotationY", Integer.valueOf(this.f37429E));
        }
        if (!Float.isNaN(this.f37436L)) {
            interpolation.put(dq8.f30372l, Integer.valueOf(this.f37429E));
        }
        if (!Float.isNaN(this.f37437M)) {
            interpolation.put(dq8.f30373m, Integer.valueOf(this.f37429E));
        }
        if (!Float.isNaN(this.f37441Q)) {
            interpolation.put("translationX", Integer.valueOf(this.f37429E));
        }
        if (!Float.isNaN(this.f37442R)) {
            interpolation.put("translationY", Integer.valueOf(this.f37429E));
        }
        if (!Float.isNaN(this.f37443S)) {
            interpolation.put("translationZ", Integer.valueOf(this.f37429E));
        }
        if (!Float.isNaN(this.f37438N)) {
            interpolation.put("transitionPathRotate", Integer.valueOf(this.f37429E));
        }
        if (!Float.isNaN(this.f37439O)) {
            interpolation.put("scaleX", Integer.valueOf(this.f37429E));
        }
        if (!Float.isNaN(this.f37440P)) {
            interpolation.put("scaleY", Integer.valueOf(this.f37429E));
        }
        if (!Float.isNaN(this.f37444T)) {
            interpolation.put("progress", Integer.valueOf(this.f37429E));
        }
        if (this.f30391e.size() > 0) {
            Iterator<String> it = this.f30391e.keySet().iterator();
            while (it.hasNext()) {
                interpolation.put("CUSTOM," + it.next(), Integer.valueOf(this.f37429E));
            }
        }
    }

    @Override // p000.dq8
    public void setValue(String tag, Object value) {
        tag.hashCode();
        switch (tag) {
            case "motionProgress":
                this.f37444T = m9298c(value);
                break;
            case "transitionEasing":
                this.f37428D = value.toString();
                break;
            case "rotationX":
                this.f37434J = m9298c(value);
                break;
            case "rotationY":
                this.f37435K = m9298c(value);
                break;
            case "translationX":
                this.f37441Q = m9298c(value);
                break;
            case "translationY":
                this.f37442R = m9298c(value);
                break;
            case "translationZ":
                this.f37443S = m9298c(value);
                break;
            case "scaleX":
                this.f37439O = m9298c(value);
                break;
            case "scaleY":
                this.f37440P = m9298c(value);
                break;
            case "transformPivotX":
                this.f37436L = m9298c(value);
                break;
            case "transformPivotY":
                this.f37437M = m9298c(value);
                break;
            case "rotation":
                this.f37433I = m9298c(value);
                break;
            case "elevation":
                this.f37432H = m9298c(value);
                break;
            case "transitionPathRotate":
                this.f37438N = m9298c(value);
                break;
            case "alpha":
                this.f37431G = m9298c(value);
                break;
            case "curveFit":
                this.f37429E = m9299d(value);
                break;
            case "visibility":
                this.f37430F = m9297b(value);
                break;
        }
    }

    @Override // p000.dq8
    /* JADX INFO: renamed from: clone */
    public dq8 mo28677clone() {
        return new fq8().copy(this);
    }
}
