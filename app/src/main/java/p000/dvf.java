package p000;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class dvf implements Comparable<dvf> {

    /* JADX INFO: renamed from: M1 */
    public static final boolean f31045M1 = false;

    /* JADX INFO: renamed from: V1 */
    public static final boolean f31046V1 = false;

    /* JADX INFO: renamed from: Z1 */
    public static final int f31047Z1 = 0;

    /* JADX INFO: renamed from: a2 */
    public static final int f31048a2 = 1;

    /* JADX INFO: renamed from: b2 */
    public static final int f31049b2 = 2;

    /* JADX INFO: renamed from: c2 */
    public static final int f31050c2 = 3;

    /* JADX INFO: renamed from: d2 */
    public static final int f31051d2 = 4;

    /* JADX INFO: renamed from: e2 */
    public static final int f31052e2 = 5;

    /* JADX INFO: renamed from: f2 */
    public static final int f31053f2 = 6;

    /* JADX INFO: renamed from: g2 */
    public static final int f31054g2 = 7;

    /* JADX INFO: renamed from: h2 */
    public static final int f31055h2 = 8;

    /* JADX INFO: renamed from: i2 */
    public static int f31056i2 = 1;

    /* JADX INFO: renamed from: j2 */
    public static int f31057j2 = 1;

    /* JADX INFO: renamed from: k2 */
    public static int f31058k2 = 1;

    /* JADX INFO: renamed from: l2 */
    public static int f31059l2 = 1;

    /* JADX INFO: renamed from: m2 */
    public static int f31060m2 = 1;

    /* JADX INFO: renamed from: n2 */
    public static final int f31061n2 = 9;

    /* JADX INFO: renamed from: C */
    public float[] f31062C;

    /* JADX INFO: renamed from: F */
    public float[] f31063F;

    /* JADX INFO: renamed from: H */
    public EnumC4976b f31064H;

    /* JADX INFO: renamed from: L */
    public e70[] f31065L;

    /* JADX INFO: renamed from: M */
    public int f31066M;

    /* JADX INFO: renamed from: N */
    public int f31067N;

    /* JADX INFO: renamed from: Q */
    public boolean f31068Q;

    /* JADX INFO: renamed from: X */
    public int f31069X;

    /* JADX INFO: renamed from: Y */
    public float f31070Y;

    /* JADX INFO: renamed from: Z */
    public HashSet<e70> f31071Z;

    /* JADX INFO: renamed from: a */
    public boolean f31072a;

    /* JADX INFO: renamed from: b */
    public String f31073b;

    /* JADX INFO: renamed from: c */
    public int f31074c;

    /* JADX INFO: renamed from: d */
    public int f31075d;

    /* JADX INFO: renamed from: e */
    public int f31076e;

    /* JADX INFO: renamed from: f */
    public float f31077f;

    /* JADX INFO: renamed from: m */
    public boolean f31078m;

    /* JADX INFO: renamed from: dvf$a */
    public static /* synthetic */ class C4975a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31079a;

        static {
            int[] iArr = new int[EnumC4976b.values().length];
            f31079a = iArr;
            try {
                iArr[EnumC4976b.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31079a[EnumC4976b.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31079a[EnumC4976b.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31079a[EnumC4976b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31079a[EnumC4976b.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: dvf$b */
    public enum EnumC4976b {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public dvf(String str, EnumC4976b enumC4976b) {
        this.f31074c = -1;
        this.f31075d = -1;
        this.f31076e = 0;
        this.f31078m = false;
        this.f31062C = new float[9];
        this.f31063F = new float[9];
        this.f31065L = new e70[16];
        this.f31066M = 0;
        this.f31067N = 0;
        this.f31068Q = false;
        this.f31069X = -1;
        this.f31070Y = 0.0f;
        this.f31071Z = null;
        this.f31073b = str;
        this.f31064H = enumC4976b;
    }

    /* JADX INFO: renamed from: b */
    public static void m9435b() {
        f31057j2++;
    }

    private static String getUniqueName(EnumC4976b enumC4976b, String str) {
        if (str != null) {
            return str + f31057j2;
        }
        int i = C4975a.f31079a[enumC4976b.ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("U");
            int i2 = f31058k2 + 1;
            f31058k2 = i2;
            sb.append(i2);
            return sb.toString();
        }
        if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("C");
            int i3 = f31059l2 + 1;
            f31059l2 = i3;
            sb2.append(i3);
            return sb2.toString();
        }
        if (i == 3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(k95.f53020R4);
            int i4 = f31056i2 + 1;
            f31056i2 = i4;
            sb3.append(i4);
            return sb3.toString();
        }
        if (i == 4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("e");
            int i5 = f31057j2 + 1;
            f31057j2 = i5;
            sb4.append(i5);
            return sb4.toString();
        }
        if (i != 5) {
            throw new AssertionError(enumC4976b.name());
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(k95.f53074X4);
        int i6 = f31060m2 + 1;
        f31060m2 = i6;
        sb5.append(i6);
        return sb5.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m9436a() {
        for (int i = 0; i < 9; i++) {
            this.f31062C[i] = 0.0f;
        }
    }

    public final void addToRow(e70 e70Var) {
        int i = 0;
        while (true) {
            int i2 = this.f31066M;
            if (i >= i2) {
                e70[] e70VarArr = this.f31065L;
                if (i2 >= e70VarArr.length) {
                    this.f31065L = (e70[]) Arrays.copyOf(e70VarArr, e70VarArr.length * 2);
                }
                e70[] e70VarArr2 = this.f31065L;
                int i3 = this.f31066M;
                e70VarArr2[i3] = e70Var;
                this.f31066M = i3 + 1;
                return;
            }
            if (this.f31065L[i] == e70Var) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public String m9437c() {
        String str = this + "[";
        boolean z = false;
        boolean z2 = true;
        for (int i = 0; i < this.f31062C.length; i++) {
            String str2 = str + this.f31062C[i];
            float[] fArr = this.f31062C;
            float f = fArr[i];
            if (f > 0.0f) {
                z = false;
            } else if (f < 0.0f) {
                z = true;
            }
            if (f != 0.0f) {
                z2 = false;
            }
            str = i < fArr.length - 1 ? str2 + ", " : str2 + "] ";
        }
        if (z) {
            str = str + " (-)";
        }
        if (!z2) {
            return str;
        }
        return str + " (*)";
    }

    public String getName() {
        return this.f31073b;
    }

    public final void removeFromRow(e70 e70Var) {
        int i = this.f31066M;
        int i2 = 0;
        while (i2 < i) {
            if (this.f31065L[i2] == e70Var) {
                while (i2 < i - 1) {
                    e70[] e70VarArr = this.f31065L;
                    int i3 = i2 + 1;
                    e70VarArr[i2] = e70VarArr[i3];
                    i2 = i3;
                }
                this.f31066M--;
                return;
            }
            i2++;
        }
    }

    public void reset() {
        this.f31073b = null;
        this.f31064H = EnumC4976b.UNKNOWN;
        this.f31076e = 0;
        this.f31074c = -1;
        this.f31075d = -1;
        this.f31077f = 0.0f;
        this.f31078m = false;
        this.f31068Q = false;
        this.f31069X = -1;
        this.f31070Y = 0.0f;
        int i = this.f31066M;
        for (int i2 = 0; i2 < i; i2++) {
            this.f31065L[i2] = null;
        }
        this.f31066M = 0;
        this.f31067N = 0;
        this.f31072a = false;
        Arrays.fill(this.f31063F, 0.0f);
    }

    public void setFinalValue(v69 v69Var, float f) {
        this.f31077f = f;
        this.f31078m = true;
        this.f31068Q = false;
        this.f31069X = -1;
        this.f31070Y = 0.0f;
        int i = this.f31066M;
        this.f31075d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f31065L[i2].updateFromFinalVariable(v69Var, this, false);
        }
        this.f31066M = 0;
    }

    public void setName(String str) {
        this.f31073b = str;
    }

    public void setSynonym(v69 v69Var, dvf dvfVar, float f) {
        this.f31068Q = true;
        this.f31069X = dvfVar.f31074c;
        this.f31070Y = f;
        int i = this.f31066M;
        this.f31075d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f31065L[i2].updateFromSynonymVariable(v69Var, this, false);
        }
        this.f31066M = 0;
        v69Var.displayReadableRows();
    }

    public void setType(EnumC4976b enumC4976b, String str) {
        this.f31064H = enumC4976b;
    }

    public String toString() {
        if (this.f31073b != null) {
            return "" + this.f31073b;
        }
        return "" + this.f31074c;
    }

    public final void updateReferencesWithNewDefinition(v69 v69Var, e70 e70Var) {
        int i = this.f31066M;
        for (int i2 = 0; i2 < i; i2++) {
            this.f31065L[i2].updateFromRow(v69Var, e70Var, false);
        }
        this.f31066M = 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(dvf dvfVar) {
        return this.f31074c - dvfVar.f31074c;
    }

    public dvf(EnumC4976b enumC4976b, String str) {
        this.f31074c = -1;
        this.f31075d = -1;
        this.f31076e = 0;
        this.f31078m = false;
        this.f31062C = new float[9];
        this.f31063F = new float[9];
        this.f31065L = new e70[16];
        this.f31066M = 0;
        this.f31067N = 0;
        this.f31068Q = false;
        this.f31069X = -1;
        this.f31070Y = 0.0f;
        this.f31071Z = null;
        this.f31064H = enumC4976b;
    }
}
