package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
public class qza extends oza {

    /* JADX INFO: renamed from: R */
    public static final String f76367R = "KeyCycle";

    /* JADX INFO: renamed from: S */
    public static final String f76368S = "KeyCycle";

    /* JADX INFO: renamed from: T */
    public static final String f76369T = "wavePeriod";

    /* JADX INFO: renamed from: U */
    public static final String f76370U = "waveOffset";

    /* JADX INFO: renamed from: V */
    public static final String f76371V = "wavePhase";

    /* JADX INFO: renamed from: W */
    public static final String f76372W = "waveShape";

    /* JADX INFO: renamed from: X */
    public static final int f76373X = 0;

    /* JADX INFO: renamed from: Y */
    public static final int f76374Y = 1;

    /* JADX INFO: renamed from: Z */
    public static final int f76375Z = 2;

    /* JADX INFO: renamed from: a0 */
    public static final int f76376a0 = 3;

    /* JADX INFO: renamed from: b0 */
    public static final int f76377b0 = 4;

    /* JADX INFO: renamed from: c0 */
    public static final int f76378c0 = 5;

    /* JADX INFO: renamed from: d0 */
    public static final int f76379d0 = 6;

    /* JADX INFO: renamed from: e0 */
    public static final int f76380e0 = 4;

    /* JADX INFO: renamed from: y */
    public String f76398y = null;

    /* JADX INFO: renamed from: z */
    public int f76399z = 0;

    /* JADX INFO: renamed from: A */
    public int f76381A = -1;

    /* JADX INFO: renamed from: B */
    public String f76382B = null;

    /* JADX INFO: renamed from: C */
    public float f76383C = Float.NaN;

    /* JADX INFO: renamed from: D */
    public float f76384D = 0.0f;

    /* JADX INFO: renamed from: E */
    public float f76385E = 0.0f;

    /* JADX INFO: renamed from: F */
    public float f76386F = Float.NaN;

    /* JADX INFO: renamed from: G */
    public float f76387G = Float.NaN;

    /* JADX INFO: renamed from: H */
    public float f76388H = Float.NaN;

    /* JADX INFO: renamed from: I */
    public float f76389I = Float.NaN;

    /* JADX INFO: renamed from: J */
    public float f76390J = Float.NaN;

    /* JADX INFO: renamed from: K */
    public float f76391K = Float.NaN;

    /* JADX INFO: renamed from: L */
    public float f76392L = Float.NaN;

    /* JADX INFO: renamed from: M */
    public float f76393M = Float.NaN;

    /* JADX INFO: renamed from: N */
    public float f76394N = Float.NaN;

    /* JADX INFO: renamed from: O */
    public float f76395O = Float.NaN;

    /* JADX INFO: renamed from: P */
    public float f76396P = Float.NaN;

    /* JADX INFO: renamed from: Q */
    public float f76397Q = Float.NaN;

    public qza() {
        this.f69277k = 4;
        this.f69278l = new HashMap<>();
    }

    public void addCycleValues(HashMap<String, jq8> map) {
        jq8 jq8Var;
        jq8 jq8Var2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ge3 ge3Var = this.f69278l.get(str.substring(7));
                if (ge3Var != null && ge3Var.getType() == 901 && (jq8Var = map.get(str)) != null) {
                    jq8Var.setPoint(this.f69274h, this.f76381A, this.f76382B, -1, this.f76383C, this.f76384D, this.f76385E, ge3Var.getValueToInterpolate(), ge3Var);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value) && (jq8Var2 = map.get(str)) != null) {
                    jq8Var2.setPoint(this.f69274h, this.f76381A, this.f76382B, -1, this.f76383C, this.f76384D, this.f76385E, value);
                }
            }
        }
    }

    @Override // p000.oza
    public void addValues(HashMap<String, wyf> map) {
    }

    public void dump() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.f76381A + ", mWavePeriod=" + this.f76383C + ", mWaveOffset=" + this.f76384D + ", mWavePhase=" + this.f76385E + ", mRotation=" + this.f76389I + '}');
    }

    @Override // p000.oza
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f76387G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f76388H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f76389I)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f76391K)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f76392L)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f76393M)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f76394N)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f76390J)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f76395O)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f76396P)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f76397Q)) {
            hashSet.add("translationZ");
        }
        if (this.f69278l.size() > 0) {
            Iterator<String> it = this.f69278l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // p000.ymh
    public int getId(String str) {
        str.hashCode();
        switch (str) {
            case "customWave":
                return 422;
            case "easing":
                return 420;
            case "rotationX":
                return 308;
            case "rotationY":
                return 309;
            case "rotationZ":
                return 310;
            case "translationX":
                return 304;
            case "translationY":
                return 305;
            case "translationZ":
                return 306;
            case "offset":
                return 424;
            case "progress":
                return 315;
            case "period":
                return 423;
            case "pivotX":
                return 313;
            case "pivotY":
                return 314;
            case "scaleX":
                return 311;
            case "scaleY":
                return 312;
            case "alpha":
                return 403;
            case "phase":
                return ymh.InterfaceC15724c.f102181w;
            case "curveFit":
                return 401;
            case "pathRotate":
                return 416;
            case "waveShape":
                return 421;
            case "visibility":
                return 402;
            default:
                return -1;
        }
    }

    public float getValue(String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return this.f76391K;
            case "rotationY":
                return this.f76392L;
            case "rotationZ":
                return this.f76389I;
            case "translationX":
                return this.f76395O;
            case "translationY":
                return this.f76396P;
            case "translationZ":
                return this.f76397Q;
            case "offset":
                return this.f76384D;
            case "progress":
                return this.f76386F;
            case "scaleX":
                return this.f76393M;
            case "scaleY":
                return this.f76394N;
            case "elevation":
                return this.f76388H;
            case "alpha":
                return this.f76387G;
            case "phase":
                return this.f76385E;
            case "pathRotate":
                return this.f76390J;
            default:
                return Float.NaN;
        }
    }

    public void printAttributes() {
        HashSet<String> hashSet = new HashSet<>();
        getAttributeNames(hashSet);
        d1i.log(" ------------- " + this.f69274h + " -------------");
        d1i.log("MotionKeyCycle{Shape=" + this.f76381A + ", Period=" + this.f76383C + ", Offset=" + this.f76384D + ", Phase=" + this.f76385E + '}');
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            ymh.InterfaceC15722a.getId(strArr[i]);
            d1i.log(strArr[i] + g1i.f38277c + getValue(strArr[i]));
        }
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, int i2) {
        if (i == 401) {
            this.f76399z = i2;
            return true;
        }
        if (i == 421) {
            this.f76381A = i2;
            return true;
        }
        if (setValue(i, i2)) {
            return true;
        }
        return super.setValue(i, i2);
    }

    @Override // p000.oza
    public oza clone() {
        return null;
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, String str) {
        if (i == 420) {
            this.f76398y = str;
            return true;
        }
        if (i != 422) {
            return super.setValue(i, str);
        }
        this.f76382B = str;
        return true;
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, float f) {
        if (i == 315) {
            this.f76386F = f;
            return true;
        }
        if (i == 403) {
            this.f76387G = f;
            return true;
        }
        if (i != 416) {
            switch (i) {
                case 304:
                    this.f76395O = f;
                    return true;
                case 305:
                    this.f76396P = f;
                    return true;
                case 306:
                    this.f76397Q = f;
                    return true;
                case 307:
                    this.f76388H = f;
                    return true;
                case 308:
                    this.f76391K = f;
                    return true;
                case 309:
                    this.f76392L = f;
                    return true;
                case 310:
                    this.f76389I = f;
                    return true;
                case 311:
                    this.f76393M = f;
                    return true;
                case 312:
                    this.f76394N = f;
                    return true;
                default:
                    switch (i) {
                        case 423:
                            this.f76383C = f;
                            return true;
                        case 424:
                            this.f76384D = f;
                            return true;
                        case ymh.InterfaceC15724c.f102181w /* 425 */:
                            this.f76385E = f;
                            return true;
                        default:
                            return super.setValue(i, f);
                    }
            }
        }
        this.f76390J = f;
        return true;
    }
}
