package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000.wyf;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
public class pza extends oza {

    /* JADX INFO: renamed from: P */
    public static final String f72567P = "KeyAttribute";

    /* JADX INFO: renamed from: Q */
    public static final String f72568Q = "KeyAttributes";

    /* JADX INFO: renamed from: R */
    public static final boolean f72569R = false;

    /* JADX INFO: renamed from: S */
    public static final int f72570S = 1;

    /* JADX INFO: renamed from: y */
    public String f72586y;

    /* JADX INFO: renamed from: z */
    public int f72587z = -1;

    /* JADX INFO: renamed from: A */
    public int f72571A = 0;

    /* JADX INFO: renamed from: B */
    public float f72572B = Float.NaN;

    /* JADX INFO: renamed from: C */
    public float f72573C = Float.NaN;

    /* JADX INFO: renamed from: D */
    public float f72574D = Float.NaN;

    /* JADX INFO: renamed from: E */
    public float f72575E = Float.NaN;

    /* JADX INFO: renamed from: F */
    public float f72576F = Float.NaN;

    /* JADX INFO: renamed from: G */
    public float f72577G = Float.NaN;

    /* JADX INFO: renamed from: H */
    public float f72578H = Float.NaN;

    /* JADX INFO: renamed from: I */
    public float f72579I = Float.NaN;

    /* JADX INFO: renamed from: J */
    public float f72580J = Float.NaN;

    /* JADX INFO: renamed from: K */
    public float f72581K = Float.NaN;

    /* JADX INFO: renamed from: L */
    public float f72582L = Float.NaN;

    /* JADX INFO: renamed from: M */
    public float f72583M = Float.NaN;

    /* JADX INFO: renamed from: N */
    public float f72584N = Float.NaN;

    /* JADX INFO: renamed from: O */
    public float f72585O = Float.NaN;

    public pza() {
        this.f69277k = 1;
        this.f69278l = new HashMap<>();
    }

    private float getFloatValue(int i) {
        if (i == 100) {
            return this.f69274h;
        }
        switch (i) {
            case 303:
                return this.f72572B;
            case 304:
                return this.f72582L;
            case 305:
                return this.f72583M;
            case 306:
                return this.f72584N;
            case 307:
                return this.f72573C;
            case 308:
                return this.f72575E;
            case 309:
                return this.f72576F;
            case 310:
                return this.f72574D;
            case 311:
                return this.f72580J;
            case 312:
                return this.f72581K;
            case 313:
                return this.f72577G;
            case 314:
                return this.f72578H;
            case 315:
                return this.f72585O;
            case ymh.InterfaceC15722a.f102113q /* 316 */:
                return this.f72579I;
            default:
                return Float.NaN;
        }
    }

    @Override // p000.oza
    public void addValues(HashMap<String, wyf> map) {
        for (String str : map.keySet()) {
            wyf wyfVar = map.get(str);
            if (wyfVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f72575E)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72575E);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f72576F)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72576F);
                                break;
                            }
                            break;
                        case "rotationZ":
                            if (Float.isNaN(this.f72574D)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72574D);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f72582L)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72582L);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f72583M)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72583M);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f72584N)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72584N);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f72585O)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72585O);
                                break;
                            }
                            break;
                        case "pivotX":
                            if (Float.isNaN(this.f72575E)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72577G);
                                break;
                            }
                            break;
                        case "pivotY":
                            if (Float.isNaN(this.f72576F)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72578H);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f72580J)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72580J);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f72581K)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72581K);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f72573C)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72573C);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f72572B)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72572B);
                                break;
                            }
                            break;
                        case "pathRotate":
                            if (Float.isNaN(this.f72579I)) {
                                break;
                            } else {
                                wyfVar.setPoint(this.f69274h, this.f72579I);
                                break;
                            }
                            break;
                        default:
                            System.err.println("not supported by KeyAttributes " + str);
                            break;
                    }
                } else {
                    ge3 ge3Var = this.f69278l.get(str.substring(7));
                    if (ge3Var != null) {
                        ((wyf.C14841c) wyfVar).setPoint(this.f69274h, ge3Var);
                    }
                }
            }
        }
    }

    @Override // p000.oza
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f72572B)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f72573C)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f72574D)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f72575E)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f72576F)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f72577G)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.f72578H)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.f72582L)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f72583M)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f72584N)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f72579I)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f72580J)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f72581K)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f72585O)) {
            hashSet.add("progress");
        }
        if (this.f69278l.size() > 0) {
            Iterator<String> it = this.f69278l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public int getCurveFit() {
        return this.f72587z;
    }

    @Override // p000.ymh
    public int getId(String str) {
        return ymh.InterfaceC15722a.getId(str);
    }

    public void printAttributes() {
        HashSet<String> hashSet = new HashSet<>();
        getAttributeNames(hashSet);
        System.out.println(" ------------- " + this.f69274h + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            int id = ymh.InterfaceC15722a.getId(strArr[i]);
            System.out.println(strArr[i] + g1i.f38277c + getFloatValue(id));
        }
    }

    @Override // p000.oza
    public void setInterpolation(HashMap<String, Integer> map) {
        if (!Float.isNaN(this.f72572B)) {
            map.put("alpha", Integer.valueOf(this.f72587z));
        }
        if (!Float.isNaN(this.f72573C)) {
            map.put("elevation", Integer.valueOf(this.f72587z));
        }
        if (!Float.isNaN(this.f72574D)) {
            map.put("rotationZ", Integer.valueOf(this.f72587z));
        }
        if (!Float.isNaN(this.f72575E)) {
            map.put("rotationX", Integer.valueOf(this.f72587z));
        }
        if (!Float.isNaN(this.f72576F)) {
            map.put("rotationY", Integer.valueOf(this.f72587z));
        }
        if (!Float.isNaN(this.f72577G)) {
            map.put("pivotX", Integer.valueOf(this.f72587z));
        }
        if (!Float.isNaN(this.f72578H)) {
            map.put("pivotY", Integer.valueOf(this.f72587z));
        }
        if (!Float.isNaN(this.f72582L)) {
            map.put("translationX", Integer.valueOf(this.f72587z));
        }
        if (!Float.isNaN(this.f72583M)) {
            map.put("translationY", Integer.valueOf(this.f72587z));
        }
        if (!Float.isNaN(this.f72584N)) {
            map.put("translationZ", Integer.valueOf(this.f72587z));
        }
        if (!Float.isNaN(this.f72579I)) {
            map.put("pathRotate", Integer.valueOf(this.f72587z));
        }
        if (!Float.isNaN(this.f72580J)) {
            map.put("scaleX", Integer.valueOf(this.f72587z));
        }
        if (!Float.isNaN(this.f72581K)) {
            map.put("scaleY", Integer.valueOf(this.f72587z));
        }
        if (!Float.isNaN(this.f72585O)) {
            map.put("progress", Integer.valueOf(this.f72587z));
        }
        if (this.f69278l.size() > 0) {
            Iterator<String> it = this.f69278l.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f72587z));
            }
        }
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, int i2) {
        if (i == 100) {
            this.f69274h = i2;
            return true;
        }
        if (i == 301) {
            this.f72587z = i2;
            return true;
        }
        if (i == 302) {
            this.f72571A = i2;
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
    public boolean setValue(int i, float f) {
        if (i != 100) {
            switch (i) {
                case 303:
                    this.f72572B = f;
                    return true;
                case 304:
                    this.f72582L = f;
                    return true;
                case 305:
                    this.f72583M = f;
                    return true;
                case 306:
                    this.f72584N = f;
                    return true;
                case 307:
                    this.f72573C = f;
                    return true;
                case 308:
                    this.f72575E = f;
                    return true;
                case 309:
                    this.f72576F = f;
                    return true;
                case 310:
                    this.f72574D = f;
                    return true;
                case 311:
                    this.f72580J = f;
                    return true;
                case 312:
                    this.f72581K = f;
                    return true;
                case 313:
                    this.f72577G = f;
                    return true;
                case 314:
                    this.f72578H = f;
                    return true;
                case 315:
                    this.f72585O = f;
                    return true;
                case ymh.InterfaceC15722a.f102113q /* 316 */:
                    this.f72579I = f;
                    return true;
                default:
                    return super.setValue(i, f);
            }
        }
        this.f72579I = f;
        return true;
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, String str) {
        if (i == 101) {
            this.f69276j = str;
            return true;
        }
        if (i != 317) {
            return super.setValue(i, str);
        }
        this.f72586y = str;
        return true;
    }
}
