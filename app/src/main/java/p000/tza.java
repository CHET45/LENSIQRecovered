package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class tza extends oza {

    /* JADX INFO: renamed from: R */
    public static final String f86395R = "KeyTrigger";

    /* JADX INFO: renamed from: S */
    public static final String f86396S = "viewTransitionOnCross";

    /* JADX INFO: renamed from: T */
    public static final String f86397T = "viewTransitionOnPositiveCross";

    /* JADX INFO: renamed from: U */
    public static final String f86398U = "viewTransitionOnNegativeCross";

    /* JADX INFO: renamed from: V */
    public static final String f86399V = "postLayout";

    /* JADX INFO: renamed from: W */
    public static final String f86400W = "triggerSlack";

    /* JADX INFO: renamed from: X */
    public static final String f86401X = "triggerCollisionView";

    /* JADX INFO: renamed from: Y */
    public static final String f86402Y = "triggerCollisionId";

    /* JADX INFO: renamed from: Z */
    public static final String f86403Z = "triggerID";

    /* JADX INFO: renamed from: a0 */
    public static final String f86404a0 = "positiveCross";

    /* JADX INFO: renamed from: b0 */
    public static final String f86405b0 = "negativeCross";

    /* JADX INFO: renamed from: c0 */
    public static final String f86406c0 = "triggerReceiver";

    /* JADX INFO: renamed from: d0 */
    public static final String f86407d0 = "CROSS";

    /* JADX INFO: renamed from: e0 */
    public static final int f86408e0 = 301;

    /* JADX INFO: renamed from: f0 */
    public static final int f86409f0 = 302;

    /* JADX INFO: renamed from: g0 */
    public static final int f86410g0 = 303;

    /* JADX INFO: renamed from: h0 */
    public static final int f86411h0 = 304;

    /* JADX INFO: renamed from: i0 */
    public static final int f86412i0 = 305;

    /* JADX INFO: renamed from: j0 */
    public static final int f86413j0 = 306;

    /* JADX INFO: renamed from: k0 */
    public static final int f86414k0 = 307;

    /* JADX INFO: renamed from: l0 */
    public static final int f86415l0 = 308;

    /* JADX INFO: renamed from: m0 */
    public static final int f86416m0 = 309;

    /* JADX INFO: renamed from: n0 */
    public static final int f86417n0 = 310;

    /* JADX INFO: renamed from: o0 */
    public static final int f86418o0 = 311;

    /* JADX INFO: renamed from: p0 */
    public static final int f86419p0 = 312;

    /* JADX INFO: renamed from: q0 */
    public static final int f86420q0 = 5;

    /* JADX INFO: renamed from: A */
    public int f86421A;

    /* JADX INFO: renamed from: B */
    public String f86422B;

    /* JADX INFO: renamed from: C */
    public String f86423C;

    /* JADX INFO: renamed from: D */
    public int f86424D;

    /* JADX INFO: renamed from: E */
    public int f86425E;

    /* JADX INFO: renamed from: F */
    public float f86426F;

    /* JADX INFO: renamed from: G */
    public boolean f86427G;

    /* JADX INFO: renamed from: H */
    public boolean f86428H;

    /* JADX INFO: renamed from: I */
    public boolean f86429I;

    /* JADX INFO: renamed from: J */
    public float f86430J;

    /* JADX INFO: renamed from: K */
    public float f86431K;

    /* JADX INFO: renamed from: L */
    public boolean f86432L;

    /* JADX INFO: renamed from: M */
    public int f86433M;

    /* JADX INFO: renamed from: N */
    public int f86434N;

    /* JADX INFO: renamed from: O */
    public int f86435O;

    /* JADX INFO: renamed from: P */
    public z46 f86436P;

    /* JADX INFO: renamed from: Q */
    public z46 f86437Q;

    /* JADX INFO: renamed from: y */
    public int f86438y = -1;

    /* JADX INFO: renamed from: z */
    public String f86439z = null;

    public tza() {
        int i = oza.f69262m;
        this.f86421A = i;
        this.f86422B = null;
        this.f86423C = null;
        this.f86424D = i;
        this.f86425E = i;
        this.f86426F = 0.1f;
        this.f86427G = true;
        this.f86428H = true;
        this.f86429I = true;
        this.f86430J = Float.NaN;
        this.f86432L = false;
        this.f86433M = i;
        this.f86434N = i;
        this.f86435O = i;
        this.f86436P = new z46();
        this.f86437Q = new z46();
        this.f69277k = 5;
        this.f69278l = new HashMap<>();
    }

    private void fireCustom(String str, d0b d0bVar) {
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f69278l.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                ge3 ge3Var = this.f69278l.get(str2);
                if (ge3Var != null) {
                    ge3Var.applyToWidget(d0bVar);
                }
            }
        }
    }

    @Override // p000.oza
    public void addValues(HashMap<String, wyf> map) {
    }

    public void conditionallyFire(float f, d0b d0bVar) {
    }

    @Override // p000.oza
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    @Override // p000.ymh
    public int getId(String str) {
        str.hashCode();
        switch (str) {
            case "positiveCross":
                return 309;
            case "viewTransitionOnPositiveCross":
                return 302;
            case "triggerCollisionId":
                return 307;
            case "triggerID":
                return 308;
            case "negativeCross":
                return 310;
            case "triggerCollisionView":
                return 306;
            case "viewTransitionOnNegativeCross":
                return 303;
            case "triggerSlack":
                return 305;
            case "viewTransitionOnCross":
                return 301;
            case "postLayout":
                return 304;
            case "triggerReceiver":
                return 311;
            default:
                return -1;
        }
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, int i2) {
        if (i == 307) {
            this.f86425E = i2;
            return true;
        }
        if (i == 308) {
            this.f86424D = m19112d(Integer.valueOf(i2));
            return true;
        }
        if (i == 311) {
            this.f86421A = i2;
            return true;
        }
        switch (i) {
            case 301:
                this.f86435O = i2;
                return true;
            case 302:
                this.f86434N = i2;
                return true;
            case 303:
                this.f86433M = i2;
                return true;
            default:
                return super.setValue(i, i2);
        }
    }

    @Override // p000.oza
    public oza clone() {
        return new tza().copy((oza) this);
    }

    @Override // p000.oza
    public tza copy(oza ozaVar) {
        super.copy(ozaVar);
        tza tzaVar = (tza) ozaVar;
        this.f86438y = tzaVar.f86438y;
        this.f86439z = tzaVar.f86439z;
        this.f86421A = tzaVar.f86421A;
        this.f86422B = tzaVar.f86422B;
        this.f86423C = tzaVar.f86423C;
        this.f86424D = tzaVar.f86424D;
        this.f86425E = tzaVar.f86425E;
        this.f86426F = tzaVar.f86426F;
        this.f86427G = tzaVar.f86427G;
        this.f86428H = tzaVar.f86428H;
        this.f86429I = tzaVar.f86429I;
        this.f86430J = tzaVar.f86430J;
        this.f86431K = tzaVar.f86431K;
        this.f86432L = tzaVar.f86432L;
        this.f86436P = tzaVar.f86436P;
        this.f86437Q = tzaVar.f86437Q;
        return this;
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, float f) {
        if (i != 305) {
            return super.setValue(i, f);
        }
        this.f86426F = f;
        return true;
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, String str) {
        if (i == 309) {
            this.f86423C = str;
            return true;
        }
        if (i == 310) {
            this.f86422B = str;
            return true;
        }
        if (i != 312) {
            return super.setValue(i, str);
        }
        this.f86439z = str;
        return true;
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, boolean z) {
        if (i != 304) {
            return super.setValue(i, z);
        }
        this.f86432L = z;
        return true;
    }
}
