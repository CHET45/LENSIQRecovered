package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000.ymh;
import p000.zzg;

/* JADX INFO: loaded from: classes.dex */
public class sza extends oza {

    /* JADX INFO: renamed from: Q */
    public static final String f83256Q = "KeyTimeCycle";

    /* JADX INFO: renamed from: R */
    public static final String f83257R = "KeyTimeCycle";

    /* JADX INFO: renamed from: S */
    public static final int f83258S = 3;

    /* JADX INFO: renamed from: y */
    public String f83275y;

    /* JADX INFO: renamed from: z */
    public int f83276z = -1;

    /* JADX INFO: renamed from: A */
    public float f83259A = Float.NaN;

    /* JADX INFO: renamed from: B */
    public float f83260B = Float.NaN;

    /* JADX INFO: renamed from: C */
    public float f83261C = Float.NaN;

    /* JADX INFO: renamed from: D */
    public float f83262D = Float.NaN;

    /* JADX INFO: renamed from: E */
    public float f83263E = Float.NaN;

    /* JADX INFO: renamed from: F */
    public float f83264F = Float.NaN;

    /* JADX INFO: renamed from: G */
    public float f83265G = Float.NaN;

    /* JADX INFO: renamed from: H */
    public float f83266H = Float.NaN;

    /* JADX INFO: renamed from: I */
    public float f83267I = Float.NaN;

    /* JADX INFO: renamed from: J */
    public float f83268J = Float.NaN;

    /* JADX INFO: renamed from: K */
    public float f83269K = Float.NaN;

    /* JADX INFO: renamed from: L */
    public float f83270L = Float.NaN;

    /* JADX INFO: renamed from: M */
    public int f83271M = 0;

    /* JADX INFO: renamed from: N */
    public String f83272N = null;

    /* JADX INFO: renamed from: O */
    public float f83273O = Float.NaN;

    /* JADX INFO: renamed from: P */
    public float f83274P = 0.0f;

    public sza() {
        this.f69277k = 3;
        this.f69278l = new HashMap<>();
    }

    public void addTimeValues(HashMap<String, zzg> map) {
        for (String str : map.keySet()) {
            zzg zzgVar = map.get(str);
            if (zzgVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f83262D)) {
                                break;
                            } else {
                                zzgVar.setPoint(this.f69274h, this.f83262D, this.f83273O, this.f83271M, this.f83274P);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f83263E)) {
                                break;
                            } else {
                                zzgVar.setPoint(this.f69274h, this.f83263E, this.f83273O, this.f83271M, this.f83274P);
                                break;
                            }
                            break;
                        case "rotationZ":
                            if (Float.isNaN(this.f83261C)) {
                                break;
                            } else {
                                zzgVar.setPoint(this.f69274h, this.f83261C, this.f83273O, this.f83271M, this.f83274P);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f83267I)) {
                                break;
                            } else {
                                zzgVar.setPoint(this.f69274h, this.f83267I, this.f83273O, this.f83271M, this.f83274P);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f83268J)) {
                                break;
                            } else {
                                zzgVar.setPoint(this.f69274h, this.f83268J, this.f83273O, this.f83271M, this.f83274P);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f83269K)) {
                                break;
                            } else {
                                zzgVar.setPoint(this.f69274h, this.f83269K, this.f83273O, this.f83271M, this.f83274P);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f83270L)) {
                                break;
                            } else {
                                zzgVar.setPoint(this.f69274h, this.f83270L, this.f83273O, this.f83271M, this.f83274P);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f83265G)) {
                                break;
                            } else {
                                zzgVar.setPoint(this.f69274h, this.f83265G, this.f83273O, this.f83271M, this.f83274P);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f83266H)) {
                                break;
                            } else {
                                zzgVar.setPoint(this.f69274h, this.f83266H, this.f83273O, this.f83271M, this.f83274P);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f83269K)) {
                                break;
                            } else {
                                zzgVar.setPoint(this.f69274h, this.f83269K, this.f83273O, this.f83271M, this.f83274P);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f83259A)) {
                                break;
                            } else {
                                zzgVar.setPoint(this.f69274h, this.f83259A, this.f83273O, this.f83271M, this.f83274P);
                                break;
                            }
                            break;
                        case "pathRotate":
                            if (Float.isNaN(this.f83264F)) {
                                break;
                            } else {
                                zzgVar.setPoint(this.f69274h, this.f83264F, this.f83273O, this.f83271M, this.f83274P);
                                break;
                            }
                            break;
                        default:
                            d1i.loge("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    ge3 ge3Var = this.f69278l.get(str.substring(7));
                    if (ge3Var != null) {
                        ((zzg.C16333b) zzgVar).setPoint(this.f69274h, ge3Var, this.f83273O, this.f83271M, this.f83274P);
                    }
                }
            }
        }
    }

    @Override // p000.oza
    public void addValues(HashMap<String, wyf> map) {
    }

    @Override // p000.oza
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f83259A)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f83260B)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f83261C)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f83262D)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f83263E)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f83265G)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f83266H)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f83264F)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f83267I)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f83268J)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f83269K)) {
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
        return ymh.InterfaceC15724c.getId(str);
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, int i2) {
        if (i == 100) {
            this.f69274h = i2;
            return true;
        }
        if (i != 421) {
            return super.setValue(i, i2);
        }
        this.f83271M = i2;
        return true;
    }

    @Override // p000.oza
    public oza clone() {
        return new sza().copy((oza) this);
    }

    @Override // p000.oza
    public sza copy(oza ozaVar) {
        super.copy(ozaVar);
        sza szaVar = (sza) ozaVar;
        this.f83275y = szaVar.f83275y;
        this.f83276z = szaVar.f83276z;
        this.f83271M = szaVar.f83271M;
        this.f83273O = szaVar.f83273O;
        this.f83274P = szaVar.f83274P;
        this.f83270L = szaVar.f83270L;
        this.f83259A = szaVar.f83259A;
        this.f83260B = szaVar.f83260B;
        this.f83261C = szaVar.f83261C;
        this.f83264F = szaVar.f83264F;
        this.f83262D = szaVar.f83262D;
        this.f83263E = szaVar.f83263E;
        this.f83265G = szaVar.f83265G;
        this.f83266H = szaVar.f83266H;
        this.f83267I = szaVar.f83267I;
        this.f83268J = szaVar.f83268J;
        this.f83269K = szaVar.f83269K;
        return this;
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, float f) {
        if (i == 315) {
            this.f83270L = m19111c(Float.valueOf(f));
            return true;
        }
        if (i == 401) {
            this.f83276z = m19112d(Float.valueOf(f));
            return true;
        }
        if (i == 403) {
            this.f83259A = f;
            return true;
        }
        if (i == 416) {
            this.f83264F = m19111c(Float.valueOf(f));
            return true;
        }
        if (i == 423) {
            this.f83273O = m19111c(Float.valueOf(f));
            return true;
        }
        if (i != 424) {
            switch (i) {
                case 304:
                    this.f83267I = m19111c(Float.valueOf(f));
                    return true;
                case 305:
                    this.f83268J = m19111c(Float.valueOf(f));
                    return true;
                case 306:
                    this.f83269K = m19111c(Float.valueOf(f));
                    return true;
                case 307:
                    this.f83260B = m19111c(Float.valueOf(f));
                    return true;
                case 308:
                    this.f83262D = m19111c(Float.valueOf(f));
                    return true;
                case 309:
                    this.f83263E = m19111c(Float.valueOf(f));
                    return true;
                case 310:
                    this.f83261C = m19111c(Float.valueOf(f));
                    return true;
                case 311:
                    this.f83265G = m19111c(Float.valueOf(f));
                    return true;
                case 312:
                    this.f83266H = m19111c(Float.valueOf(f));
                    return true;
                default:
                    return super.setValue(i, f);
            }
        }
        this.f83274P = m19111c(Float.valueOf(f));
        return true;
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, String str) {
        if (i == 420) {
            this.f83275y = str;
            return true;
        }
        if (i != 421) {
            return super.setValue(i, str);
        }
        this.f83271M = 7;
        this.f83272N = str;
        return true;
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, boolean z) {
        return super.setValue(i, z);
    }
}
