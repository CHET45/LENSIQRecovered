package p000;

import com.blankj.utilcode.util.C2473f;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import p000.cu2;
import p000.dvf;

/* JADX INFO: loaded from: classes.dex */
public class v69 {

    /* JADX INFO: renamed from: A */
    public static boolean f90071A = false;

    /* JADX INFO: renamed from: B */
    public static int f90072B = 1000;

    /* JADX INFO: renamed from: C */
    public static jva f90073C = null;

    /* JADX INFO: renamed from: D */
    public static long f90074D = 0;

    /* JADX INFO: renamed from: E */
    public static long f90075E = 0;

    /* JADX INFO: renamed from: r */
    public static final boolean f90076r = false;

    /* JADX INFO: renamed from: s */
    public static final boolean f90077s = false;

    /* JADX INFO: renamed from: t */
    public static final boolean f90078t = false;

    /* JADX INFO: renamed from: u */
    public static final boolean f90079u = false;

    /* JADX INFO: renamed from: v */
    public static boolean f90080v = false;

    /* JADX INFO: renamed from: w */
    public static boolean f90081w = true;

    /* JADX INFO: renamed from: x */
    public static boolean f90082x = true;

    /* JADX INFO: renamed from: y */
    public static boolean f90083y = true;

    /* JADX INFO: renamed from: z */
    public static boolean f90084z = true;

    /* JADX INFO: renamed from: d */
    public InterfaceC13885a f90088d;

    /* JADX INFO: renamed from: g */
    public e70[] f90091g;

    /* JADX INFO: renamed from: n */
    public final fl1 f90098n;

    /* JADX INFO: renamed from: q */
    public InterfaceC13885a f90101q;

    /* JADX INFO: renamed from: a */
    public boolean f90085a = false;

    /* JADX INFO: renamed from: b */
    public int f90086b = 0;

    /* JADX INFO: renamed from: c */
    public HashMap<String, dvf> f90087c = null;

    /* JADX INFO: renamed from: e */
    public int f90089e = 32;

    /* JADX INFO: renamed from: f */
    public int f90090f = 32;

    /* JADX INFO: renamed from: h */
    public boolean f90092h = false;

    /* JADX INFO: renamed from: i */
    public boolean f90093i = false;

    /* JADX INFO: renamed from: j */
    public boolean[] f90094j = new boolean[32];

    /* JADX INFO: renamed from: k */
    public int f90095k = 1;

    /* JADX INFO: renamed from: l */
    public int f90096l = 0;

    /* JADX INFO: renamed from: m */
    public int f90097m = 32;

    /* JADX INFO: renamed from: o */
    public dvf[] f90099o = new dvf[f90072B];

    /* JADX INFO: renamed from: p */
    public int f90100p = 0;

    /* JADX INFO: renamed from: v69$a */
    public interface InterfaceC13885a {
        void addError(dvf dvfVar);

        void clear();

        dvf getKey();

        dvf getPivotCandidate(v69 v69Var, boolean[] zArr);

        void initFromRow(InterfaceC13885a interfaceC13885a);

        boolean isEmpty();

        void updateFromFinalVariable(v69 v69Var, dvf dvfVar, boolean z);

        void updateFromRow(v69 v69Var, e70 e70Var, boolean z);

        void updateFromSystem(v69 v69Var);
    }

    /* JADX INFO: renamed from: v69$b */
    public class C13886b extends e70 {
        public C13886b(fl1 fl1Var) {
            this.f31977e = new evf(this, fl1Var);
        }
    }

    public v69() {
        this.f90091g = null;
        this.f90091g = new e70[32];
        releaseRows();
        fl1 fl1Var = new fl1();
        this.f90098n = fl1Var;
        this.f90088d = new fcd(fl1Var);
        if (f90071A) {
            this.f90101q = new C13886b(fl1Var);
        } else {
            this.f90101q = new e70(fl1Var);
        }
    }

    private dvf acquireSolverVariable(dvf.EnumC4976b enumC4976b, String str) {
        dvf dvfVarAcquire = this.f90098n.f36989c.acquire();
        if (dvfVarAcquire == null) {
            dvfVarAcquire = new dvf(enumC4976b, str);
            dvfVarAcquire.setType(enumC4976b, str);
        } else {
            dvfVarAcquire.reset();
            dvfVarAcquire.setType(enumC4976b, str);
        }
        int i = this.f90100p;
        int i2 = f90072B;
        if (i >= i2) {
            int i3 = i2 * 2;
            f90072B = i3;
            this.f90099o = (dvf[]) Arrays.copyOf(this.f90099o, i3);
        }
        dvf[] dvfVarArr = this.f90099o;
        int i4 = this.f90100p;
        this.f90100p = i4 + 1;
        dvfVarArr[i4] = dvfVarAcquire;
        return dvfVarAcquire;
    }

    private void addError(e70 e70Var) {
        e70Var.addError(this, 0);
    }

    private final void addRow(e70 e70Var) {
        int i;
        if (f90082x && e70Var.f31978f) {
            e70Var.f31973a.setFinalValue(this, e70Var.f31974b);
        } else {
            e70[] e70VarArr = this.f90091g;
            int i2 = this.f90096l;
            e70VarArr[i2] = e70Var;
            dvf dvfVar = e70Var.f31973a;
            dvfVar.f31075d = i2;
            this.f90096l = i2 + 1;
            dvfVar.updateReferencesWithNewDefinition(this, e70Var);
        }
        if (f90082x && this.f90085a) {
            int i3 = 0;
            while (i3 < this.f90096l) {
                if (this.f90091g[i3] == null) {
                    System.out.println("WTF");
                }
                e70 e70Var2 = this.f90091g[i3];
                if (e70Var2 != null && e70Var2.f31978f) {
                    e70Var2.f31973a.setFinalValue(this, e70Var2.f31974b);
                    if (f90071A) {
                        this.f90098n.f36987a.release(e70Var2);
                    } else {
                        this.f90098n.f36988b.release(e70Var2);
                    }
                    this.f90091g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f90096l;
                        if (i4 >= i) {
                            break;
                        }
                        e70[] e70VarArr2 = this.f90091g;
                        int i6 = i4 - 1;
                        e70 e70Var3 = e70VarArr2[i4];
                        e70VarArr2[i6] = e70Var3;
                        dvf dvfVar2 = e70Var3.f31973a;
                        if (dvfVar2.f31075d == i4) {
                            dvfVar2.f31075d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f90091g[i5] = null;
                    }
                    this.f90096l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f90085a = false;
        }
    }

    private void addSingleError(e70 e70Var, int i) {
        m23810a(e70Var, i, 0);
    }

    private void computeValues() {
        for (int i = 0; i < this.f90096l; i++) {
            e70 e70Var = this.f90091g[i];
            e70Var.f31973a.f31077f = e70Var.f31974b;
        }
    }

    public static e70 createRowDimensionPercent(v69 v69Var, dvf dvfVar, dvf dvfVar2, float f) {
        return v69Var.createRow().m9766f(dvfVar, dvfVar2, f);
    }

    private dvf createVariable(String str, dvf.EnumC4976b enumC4976b) {
        jva jvaVar = f90073C;
        if (jvaVar != null) {
            jvaVar.f52078p++;
        }
        if (this.f90095k + 1 >= this.f90090f) {
            increaseTableSize();
        }
        dvf dvfVarAcquireSolverVariable = acquireSolverVariable(enumC4976b, null);
        dvfVarAcquireSolverVariable.setName(str);
        int i = this.f90086b + 1;
        this.f90086b = i;
        this.f90095k++;
        dvfVarAcquireSolverVariable.f31074c = i;
        if (this.f90087c == null) {
            this.f90087c = new HashMap<>();
        }
        this.f90087c.put(str, dvfVarAcquireSolverVariable);
        this.f90098n.f36990d[this.f90086b] = dvfVarAcquireSolverVariable;
        return dvfVarAcquireSolverVariable;
    }

    private void displayRows() {
        displaySolverVariables();
        String str = "";
        for (int i = 0; i < this.f90096l; i++) {
            str = (str + this.f90091g[i]) + "\n";
        }
        System.out.println(str + this.f90088d + "\n");
    }

    private void displaySolverVariables() {
        System.out.println("Display Rows (" + this.f90096l + "x" + this.f90095k + ")\n");
    }

    private int enforceBFS(InterfaceC13885a interfaceC13885a) throws Exception {
        for (int i = 0; i < this.f90096l; i++) {
            e70 e70Var = this.f90091g[i];
            if (e70Var.f31973a.f31064H != dvf.EnumC4976b.UNRESTRICTED && e70Var.f31974b < 0.0f) {
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    jva jvaVar = f90073C;
                    if (jvaVar != null) {
                        jvaVar.f52077o++;
                    }
                    i2++;
                    float f = Float.MAX_VALUE;
                    int i3 = 0;
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = 0;
                    while (true) {
                        if (i3 >= this.f90096l) {
                            break;
                        }
                        e70 e70Var2 = this.f90091g[i3];
                        if (e70Var2.f31973a.f31064H != dvf.EnumC4976b.UNRESTRICTED && !e70Var2.f31978f && e70Var2.f31974b < 0.0f) {
                            int i7 = 9;
                            if (f90084z) {
                                int currentSize = e70Var2.f31977e.getCurrentSize();
                                int i8 = 0;
                                while (i8 < currentSize) {
                                    dvf variable = e70Var2.f31977e.getVariable(i8);
                                    float f2 = e70Var2.f31977e.get(variable);
                                    if (f2 > 0.0f) {
                                        int i9 = 0;
                                        while (i9 < i7) {
                                            float f3 = variable.f31062C[i9] / f2;
                                            if ((f3 < f && i9 == i6) || i9 > i6) {
                                                i6 = i9;
                                                i5 = variable.f31074c;
                                                i4 = i3;
                                                f = f3;
                                            }
                                            i9++;
                                            i7 = 9;
                                        }
                                    }
                                    i8++;
                                    i7 = 9;
                                }
                            } else {
                                for (int i10 = 1; i10 < this.f90095k; i10++) {
                                    dvf dvfVar = this.f90098n.f36990d[i10];
                                    float f4 = e70Var2.f31977e.get(dvfVar);
                                    if (f4 > 0.0f) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f5 = dvfVar.f31062C[i11] / f4;
                                            if ((f5 < f && i11 == i6) || i11 > i6) {
                                                i6 = i11;
                                                i4 = i3;
                                                i5 = i10;
                                                f = f5;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i3++;
                    }
                    if (i4 != -1) {
                        e70 e70Var3 = this.f90091g[i4];
                        e70Var3.f31973a.f31075d = -1;
                        jva jvaVar2 = f90073C;
                        if (jvaVar2 != null) {
                            jvaVar2.f52076n++;
                        }
                        e70Var3.m9770j(this.f90098n.f36990d[i5]);
                        dvf dvfVar2 = e70Var3.f31973a;
                        dvfVar2.f31075d = i4;
                        dvfVar2.updateReferencesWithNewDefinition(this, e70Var3);
                    } else {
                        z = true;
                    }
                    if (i2 > this.f90095k / 2) {
                        z = true;
                    }
                }
                return i2;
            }
        }
        return 0;
    }

    private String getDisplaySize(int i) {
        int i2 = i * 4;
        int i3 = i2 / 1024;
        int i4 = i3 / 1024;
        if (i4 > 0) {
            return "" + i4 + " Mb";
        }
        if (i3 > 0) {
            return "" + i3 + " Kb";
        }
        return "" + i2 + " bytes";
    }

    private String getDisplayStrength(int i) {
        return i == 1 ? "LOW" : i == 2 ? "MEDIUM" : i == 3 ? "HIGH" : i == 4 ? "HIGHEST" : i == 5 ? "EQUALITY" : i == 8 ? "FIXED" : i == 6 ? "BARRIER" : "NONE";
    }

    public static jva getMetrics() {
        return f90073C;
    }

    private void increaseTableSize() {
        int i = this.f90089e * 2;
        this.f90089e = i;
        this.f90091g = (e70[]) Arrays.copyOf(this.f90091g, i);
        fl1 fl1Var = this.f90098n;
        fl1Var.f36990d = (dvf[]) Arrays.copyOf(fl1Var.f36990d, this.f90089e);
        int i2 = this.f90089e;
        this.f90094j = new boolean[i2];
        this.f90090f = i2;
        this.f90097m = i2;
        jva jvaVar = f90073C;
        if (jvaVar != null) {
            jvaVar.f52070h++;
            jvaVar.f52082t = Math.max(jvaVar.f52082t, i2);
            jva jvaVar2 = f90073C;
            jvaVar2.f52055J = jvaVar2.f52082t;
        }
    }

    private final int optimize(InterfaceC13885a interfaceC13885a, boolean z) {
        jva jvaVar = f90073C;
        if (jvaVar != null) {
            jvaVar.f52074l++;
        }
        for (int i = 0; i < this.f90095k; i++) {
            this.f90094j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            jva jvaVar2 = f90073C;
            if (jvaVar2 != null) {
                jvaVar2.f52075m++;
            }
            i2++;
            if (i2 >= this.f90095k * 2) {
                return i2;
            }
            if (interfaceC13885a.getKey() != null) {
                this.f90094j[interfaceC13885a.getKey().f31074c] = true;
            }
            dvf pivotCandidate = interfaceC13885a.getPivotCandidate(this, this.f90094j);
            if (pivotCandidate != null) {
                boolean[] zArr = this.f90094j;
                int i3 = pivotCandidate.f31074c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (pivotCandidate != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f90096l; i5++) {
                    e70 e70Var = this.f90091g[i5];
                    if (e70Var.f31973a.f31064H != dvf.EnumC4976b.UNRESTRICTED && !e70Var.f31978f && e70Var.m9769i(pivotCandidate)) {
                        float f2 = e70Var.f31977e.get(pivotCandidate);
                        if (f2 < 0.0f) {
                            float f3 = (-e70Var.f31974b) / f2;
                            if (f3 < f) {
                                i4 = i5;
                                f = f3;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    e70 e70Var2 = this.f90091g[i4];
                    e70Var2.f31973a.f31075d = -1;
                    jva jvaVar3 = f90073C;
                    if (jvaVar3 != null) {
                        jvaVar3.f52076n++;
                    }
                    e70Var2.m9770j(pivotCandidate);
                    dvf dvfVar = e70Var2.f31973a;
                    dvfVar.f31075d = i4;
                    dvfVar.updateReferencesWithNewDefinition(this, e70Var2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    private void releaseRows() {
        int i = 0;
        if (f90071A) {
            while (i < this.f90096l) {
                e70 e70Var = this.f90091g[i];
                if (e70Var != null) {
                    this.f90098n.f36987a.release(e70Var);
                }
                this.f90091g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f90096l) {
            e70 e70Var2 = this.f90091g[i];
            if (e70Var2 != null) {
                this.f90098n.f36988b.release(e70Var2);
            }
            this.f90091g[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23810a(e70 e70Var, int i, int i2) {
        e70Var.m9761a(createErrorVariable(i2, null), i);
    }

    public void addCenterPoint(iu2 iu2Var, iu2 iu2Var2, float f, int i) {
        cu2.EnumC4503b enumC4503b = cu2.EnumC4503b.LEFT;
        dvf dvfVarCreateObjectVariable = createObjectVariable(iu2Var.getAnchor(enumC4503b));
        cu2.EnumC4503b enumC4503b2 = cu2.EnumC4503b.TOP;
        dvf dvfVarCreateObjectVariable2 = createObjectVariable(iu2Var.getAnchor(enumC4503b2));
        cu2.EnumC4503b enumC4503b3 = cu2.EnumC4503b.RIGHT;
        dvf dvfVarCreateObjectVariable3 = createObjectVariable(iu2Var.getAnchor(enumC4503b3));
        cu2.EnumC4503b enumC4503b4 = cu2.EnumC4503b.BOTTOM;
        dvf dvfVarCreateObjectVariable4 = createObjectVariable(iu2Var.getAnchor(enumC4503b4));
        dvf dvfVarCreateObjectVariable5 = createObjectVariable(iu2Var2.getAnchor(enumC4503b));
        dvf dvfVarCreateObjectVariable6 = createObjectVariable(iu2Var2.getAnchor(enumC4503b2));
        dvf dvfVarCreateObjectVariable7 = createObjectVariable(iu2Var2.getAnchor(enumC4503b3));
        dvf dvfVarCreateObjectVariable8 = createObjectVariable(iu2Var2.getAnchor(enumC4503b4));
        e70 e70VarCreateRow = createRow();
        double d = f;
        double d2 = i;
        e70VarCreateRow.createRowWithAngle(dvfVarCreateObjectVariable2, dvfVarCreateObjectVariable4, dvfVarCreateObjectVariable6, dvfVarCreateObjectVariable8, (float) (Math.sin(d) * d2));
        addConstraint(e70VarCreateRow);
        e70 e70VarCreateRow2 = createRow();
        e70VarCreateRow2.createRowWithAngle(dvfVarCreateObjectVariable, dvfVarCreateObjectVariable3, dvfVarCreateObjectVariable5, dvfVarCreateObjectVariable7, (float) (Math.cos(d) * d2));
        addConstraint(e70VarCreateRow2);
    }

    public void addCentering(dvf dvfVar, dvf dvfVar2, int i, float f, dvf dvfVar3, dvf dvfVar4, int i2, int i3) {
        e70 e70VarCreateRow = createRow();
        e70VarCreateRow.m9764d(dvfVar, dvfVar2, i, f, dvfVar3, dvfVar4, i2);
        if (i3 != 8) {
            e70VarCreateRow.addError(this, i3);
        }
        addConstraint(e70VarCreateRow);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addConstraint(p000.e70 r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            jva r0 = p000.v69.f90073C
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.f52072j
            long r3 = r3 + r1
            r0.f52072j = r3
            boolean r3 = r8.f31978f
            if (r3 == 0) goto L17
            long r3 = r0.f52073k
            long r3 = r3 + r1
            r0.f52073k = r3
        L17:
            int r0 = r7.f90096l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f90097m
            if (r0 >= r4) goto L26
            int r0 = r7.f90095k
            int r0 = r0 + r3
            int r4 = r7.f90090f
            if (r0 < r4) goto L29
        L26:
            r7.increaseTableSize()
        L29:
            boolean r0 = r8.f31978f
            r4 = 0
            if (r0 != 0) goto La1
            r8.updateFromSystem(r7)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L38
            return
        L38:
            r8.m9767g()
            boolean r0 = r8.m9762b(r7)
            if (r0 == 0) goto L98
            dvf r0 = r7.createExtraVariable()
            r8.f31973a = r0
            int r5 = r7.f90096l
            r7.addRow(r8)
            int r6 = r7.f90096l
            int r5 = r5 + r3
            if (r6 != r5) goto L98
            v69$a r4 = r7.f90101q
            r4.initFromRow(r8)
            v69$a r4 = r7.f90101q
            r7.optimize(r4, r3)
            int r4 = r0.f31075d
            r5 = -1
            if (r4 != r5) goto L99
            dvf r4 = r8.f31973a
            if (r4 != r0) goto L76
            dvf r0 = r8.pickPivot(r0)
            if (r0 == 0) goto L76
            jva r4 = p000.v69.f90073C
            if (r4 == 0) goto L73
            long r5 = r4.f52076n
            long r5 = r5 + r1
            r4.f52076n = r5
        L73:
            r8.m9770j(r0)
        L76:
            boolean r0 = r8.f31978f
            if (r0 != 0) goto L7f
            dvf r0 = r8.f31973a
            r0.updateReferencesWithNewDefinition(r7, r8)
        L7f:
            boolean r0 = p000.v69.f90071A
            if (r0 == 0) goto L8b
            fl1 r0 = r7.f90098n
            o4d$a<e70> r0 = r0.f36987a
            r0.release(r8)
            goto L92
        L8b:
            fl1 r0 = r7.f90098n
            o4d$a<e70> r0 = r0.f36988b
            r0.release(r8)
        L92:
            int r0 = r7.f90096l
            int r0 = r0 - r3
            r7.f90096l = r0
            goto L99
        L98:
            r3 = r4
        L99:
            boolean r0 = r8.m9768h()
            if (r0 != 0) goto La0
            return
        La0:
            r4 = r3
        La1:
            if (r4 != 0) goto La6
            r7.addRow(r8)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v69.addConstraint(e70):void");
    }

    public e70 addEquality(dvf dvfVar, dvf dvfVar2, int i, int i2) {
        if (f90081w && i2 == 8 && dvfVar2.f31078m && dvfVar.f31075d == -1) {
            dvfVar.setFinalValue(this, dvfVar2.f31077f + i);
            return null;
        }
        e70 e70VarCreateRow = createRow();
        e70VarCreateRow.createRowEquals(dvfVar, dvfVar2, i);
        if (i2 != 8) {
            e70VarCreateRow.addError(this, i2);
        }
        addConstraint(e70VarCreateRow);
        return e70VarCreateRow;
    }

    public void addGreaterBarrier(dvf dvfVar, dvf dvfVar2, int i, boolean z) {
        e70 e70VarCreateRow = createRow();
        dvf dvfVarCreateSlackVariable = createSlackVariable();
        dvfVarCreateSlackVariable.f31076e = 0;
        e70VarCreateRow.createRowGreaterThan(dvfVar, dvfVar2, dvfVarCreateSlackVariable, i);
        addConstraint(e70VarCreateRow);
    }

    public void addGreaterThan(dvf dvfVar, dvf dvfVar2, int i, int i2) {
        e70 e70VarCreateRow = createRow();
        dvf dvfVarCreateSlackVariable = createSlackVariable();
        dvfVarCreateSlackVariable.f31076e = 0;
        e70VarCreateRow.createRowGreaterThan(dvfVar, dvfVar2, dvfVarCreateSlackVariable, i);
        if (i2 != 8) {
            m23810a(e70VarCreateRow, (int) (e70VarCreateRow.f31977e.get(dvfVarCreateSlackVariable) * (-1.0f)), i2);
        }
        addConstraint(e70VarCreateRow);
    }

    public void addLowerBarrier(dvf dvfVar, dvf dvfVar2, int i, boolean z) {
        e70 e70VarCreateRow = createRow();
        dvf dvfVarCreateSlackVariable = createSlackVariable();
        dvfVarCreateSlackVariable.f31076e = 0;
        e70VarCreateRow.createRowLowerThan(dvfVar, dvfVar2, dvfVarCreateSlackVariable, i);
        addConstraint(e70VarCreateRow);
    }

    public void addLowerThan(dvf dvfVar, dvf dvfVar2, int i, int i2) {
        e70 e70VarCreateRow = createRow();
        dvf dvfVarCreateSlackVariable = createSlackVariable();
        dvfVarCreateSlackVariable.f31076e = 0;
        e70VarCreateRow.createRowLowerThan(dvfVar, dvfVar2, dvfVarCreateSlackVariable, i);
        if (i2 != 8) {
            m23810a(e70VarCreateRow, (int) (e70VarCreateRow.f31977e.get(dvfVarCreateSlackVariable) * (-1.0f)), i2);
        }
        addConstraint(e70VarCreateRow);
    }

    public void addRatio(dvf dvfVar, dvf dvfVar2, dvf dvfVar3, dvf dvfVar4, float f, int i) {
        e70 e70VarCreateRow = createRow();
        e70VarCreateRow.createRowDimensionRatio(dvfVar, dvfVar2, dvfVar3, dvfVar4, f);
        if (i != 8) {
            e70VarCreateRow.addError(this, i);
        }
        addConstraint(e70VarCreateRow);
    }

    public void addSynonym(dvf dvfVar, dvf dvfVar2, int i) {
        if (dvfVar.f31075d != -1 || i != 0) {
            addEquality(dvfVar, dvfVar2, i, 8);
            return;
        }
        if (dvfVar2.f31068Q) {
            dvfVar2 = this.f90098n.f36990d[dvfVar2.f31069X];
        }
        if (dvfVar.f31068Q) {
            dvf dvfVar3 = this.f90098n.f36990d[dvfVar.f31069X];
        } else {
            dvfVar.setSynonym(this, dvfVar2, 0.0f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m23811b() {
        int i;
        int i2 = 0;
        while (i2 < this.f90096l) {
            e70 e70Var = this.f90091g[i2];
            if (e70Var.f31977e.getCurrentSize() == 0) {
                e70Var.f31978f = true;
            }
            if (e70Var.f31978f) {
                dvf dvfVar = e70Var.f31973a;
                dvfVar.f31077f = e70Var.f31974b;
                dvfVar.removeFromRow(e70Var);
                int i3 = i2;
                while (true) {
                    i = this.f90096l;
                    if (i3 >= i - 1) {
                        break;
                    }
                    e70[] e70VarArr = this.f90091g;
                    int i4 = i3 + 1;
                    e70VarArr[i3] = e70VarArr[i4];
                    i3 = i4;
                }
                this.f90091g[i - 1] = null;
                this.f90096l = i - 1;
                i2--;
                if (f90071A) {
                    this.f90098n.f36987a.release(e70Var);
                } else {
                    this.f90098n.f36988b.release(e70Var);
                }
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m23812c() {
        int iM9771k = 0;
        for (int i = 0; i < this.f90089e; i++) {
            e70 e70Var = this.f90091g[i];
            if (e70Var != null) {
                iM9771k += e70Var.m9771k();
            }
        }
        int iM9771k2 = 0;
        for (int i2 = 0; i2 < this.f90096l; i2++) {
            e70 e70Var2 = this.f90091g[i2];
            if (e70Var2 != null) {
                iM9771k2 += e70Var2.m9771k();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("Linear System -> Table size: ");
        sb.append(this.f90089e);
        sb.append(" (");
        int i3 = this.f90089e;
        sb.append(getDisplaySize(i3 * i3));
        sb.append(") -- row sizes: ");
        sb.append(getDisplaySize(iM9771k));
        sb.append(", actual size: ");
        sb.append(getDisplaySize(iM9771k2));
        sb.append(" rows: ");
        sb.append(this.f90096l);
        sb.append(pj4.f71071b);
        sb.append(this.f90097m);
        sb.append(" cols: ");
        sb.append(this.f90095k);
        sb.append(pj4.f71071b);
        sb.append(this.f90090f);
        sb.append(C2473f.f17566z);
        sb.append(0);
        sb.append(" occupied cells, ");
        sb.append(getDisplaySize(0));
        printStream.println(sb.toString());
    }

    public dvf createErrorVariable(int i, String str) {
        jva jvaVar = f90073C;
        if (jvaVar != null) {
            jvaVar.f52079q++;
        }
        if (this.f90095k + 1 >= this.f90090f) {
            increaseTableSize();
        }
        dvf dvfVarAcquireSolverVariable = acquireSolverVariable(dvf.EnumC4976b.ERROR, str);
        int i2 = this.f90086b + 1;
        this.f90086b = i2;
        this.f90095k++;
        dvfVarAcquireSolverVariable.f31074c = i2;
        dvfVarAcquireSolverVariable.f31076e = i;
        this.f90098n.f36990d[i2] = dvfVarAcquireSolverVariable;
        this.f90088d.addError(dvfVarAcquireSolverVariable);
        return dvfVarAcquireSolverVariable;
    }

    public dvf createExtraVariable() {
        jva jvaVar = f90073C;
        if (jvaVar != null) {
            jvaVar.f52081s++;
        }
        if (this.f90095k + 1 >= this.f90090f) {
            increaseTableSize();
        }
        dvf dvfVarAcquireSolverVariable = acquireSolverVariable(dvf.EnumC4976b.SLACK, null);
        int i = this.f90086b + 1;
        this.f90086b = i;
        this.f90095k++;
        dvfVarAcquireSolverVariable.f31074c = i;
        this.f90098n.f36990d[i] = dvfVarAcquireSolverVariable;
        return dvfVarAcquireSolverVariable;
    }

    public dvf createObjectVariable(Object obj) {
        dvf solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f90095k + 1 >= this.f90090f) {
            increaseTableSize();
        }
        if (obj instanceof cu2) {
            cu2 cu2Var = (cu2) obj;
            solverVariable = cu2Var.getSolverVariable();
            if (solverVariable == null) {
                cu2Var.resetSolverVariable(this.f90098n);
                solverVariable = cu2Var.getSolverVariable();
            }
            int i = solverVariable.f31074c;
            if (i == -1 || i > this.f90086b || this.f90098n.f36990d[i] == null) {
                if (i != -1) {
                    solverVariable.reset();
                }
                int i2 = this.f90086b + 1;
                this.f90086b = i2;
                this.f90095k++;
                solverVariable.f31074c = i2;
                solverVariable.f31064H = dvf.EnumC4976b.UNRESTRICTED;
                this.f90098n.f36990d[i2] = solverVariable;
            }
        }
        return solverVariable;
    }

    public e70 createRow() {
        e70 e70VarAcquire;
        if (f90071A) {
            e70VarAcquire = this.f90098n.f36987a.acquire();
            if (e70VarAcquire == null) {
                e70VarAcquire = new C13886b(this.f90098n);
                f90075E++;
            } else {
                e70VarAcquire.reset();
            }
        } else {
            e70VarAcquire = this.f90098n.f36988b.acquire();
            if (e70VarAcquire == null) {
                e70VarAcquire = new e70(this.f90098n);
                f90074D++;
            } else {
                e70VarAcquire.reset();
            }
        }
        dvf.m9435b();
        return e70VarAcquire;
    }

    public dvf createSlackVariable() {
        jva jvaVar = f90073C;
        if (jvaVar != null) {
            jvaVar.f52080r++;
        }
        if (this.f90095k + 1 >= this.f90090f) {
            increaseTableSize();
        }
        dvf dvfVarAcquireSolverVariable = acquireSolverVariable(dvf.EnumC4976b.SLACK, null);
        int i = this.f90086b + 1;
        this.f90086b = i;
        this.f90095k++;
        dvfVarAcquireSolverVariable.f31074c = i;
        this.f90098n.f36990d[i] = dvfVarAcquireSolverVariable;
        return dvfVarAcquireSolverVariable;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC13885a m23813d() {
        return this.f90088d;
    }

    public void displayReadableRows() {
        displaySolverVariables();
        String str = " num vars " + this.f90086b + "\n";
        for (int i = 0; i < this.f90086b + 1; i++) {
            dvf dvfVar = this.f90098n.f36990d[i];
            if (dvfVar != null && dvfVar.f31078m) {
                str = str + " $[" + i + "] => " + dvfVar + " = " + dvfVar.f31077f + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i2 = 0; i2 < this.f90086b + 1; i2++) {
            dvf[] dvfVarArr = this.f90098n.f36990d;
            dvf dvfVar2 = dvfVarArr[i2];
            if (dvfVar2 != null && dvfVar2.f31068Q) {
                str2 = str2 + " ~[" + i2 + "] => " + dvfVar2 + " = " + dvfVarArr[dvfVar2.f31069X] + " + " + dvfVar2.f31070Y + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i3 = 0; i3 < this.f90096l; i3++) {
            str3 = (str3 + this.f90091g[i3].m9772l()) + "\n #  ";
        }
        if (this.f90088d != null) {
            str3 = str3 + "Goal: " + this.f90088d + "\n";
        }
        System.out.println(str3);
    }

    public void displayVariablesReadableRows() {
        displaySolverVariables();
        String str = "";
        for (int i = 0; i < this.f90096l; i++) {
            if (this.f90091g[i].f31973a.f31064H == dvf.EnumC4976b.UNRESTRICTED) {
                str = (str + this.f90091g[i].m9772l()) + "\n";
            }
        }
        System.out.println(str + this.f90088d + "\n");
    }

    /* JADX INFO: renamed from: e */
    public e70 m23814e(int i) {
        return this.f90091g[i];
    }

    /* JADX INFO: renamed from: f */
    public float m23815f(String str) {
        dvf dvfVarM23816g = m23816g(str, dvf.EnumC4976b.UNRESTRICTED);
        if (dvfVarM23816g == null) {
            return 0.0f;
        }
        return dvfVarM23816g.f31077f;
    }

    public void fillMetrics(jva jvaVar) {
        f90073C = jvaVar;
    }

    /* JADX INFO: renamed from: g */
    public dvf m23816g(String str, dvf.EnumC4976b enumC4976b) {
        if (this.f90087c == null) {
            this.f90087c = new HashMap<>();
        }
        dvf dvfVar = this.f90087c.get(str);
        return dvfVar == null ? createVariable(str, enumC4976b) : dvfVar;
    }

    public fl1 getCache() {
        return this.f90098n;
    }

    public int getMemoryUsed() {
        int iM9771k = 0;
        for (int i = 0; i < this.f90096l; i++) {
            e70 e70Var = this.f90091g[i];
            if (e70Var != null) {
                iM9771k += e70Var.m9771k();
            }
        }
        return iM9771k;
    }

    public int getNumEquations() {
        return this.f90096l;
    }

    public int getNumVariables() {
        return this.f90086b;
    }

    public int getObjectVariableValue(Object obj) {
        dvf solverVariable = ((cu2) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.f31077f + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public void m23817h(InterfaceC13885a interfaceC13885a) throws Exception {
        jva jvaVar = f90073C;
        if (jvaVar != null) {
            jvaVar.f52088z++;
            jvaVar.f52046A = Math.max(jvaVar.f52046A, this.f90095k);
            jva jvaVar2 = f90073C;
            jvaVar2.f52047B = Math.max(jvaVar2.f52047B, this.f90096l);
        }
        enforceBFS(interfaceC13885a);
        optimize(interfaceC13885a, false);
        computeValues();
    }

    public void minimize() throws Exception {
        jva jvaVar = f90073C;
        if (jvaVar != null) {
            jvaVar.f52071i++;
        }
        if (this.f90088d.isEmpty()) {
            computeValues();
            return;
        }
        if (!this.f90092h && !this.f90093i) {
            m23817h(this.f90088d);
            return;
        }
        jva jvaVar2 = f90073C;
        if (jvaVar2 != null) {
            jvaVar2.f52084v++;
        }
        for (int i = 0; i < this.f90096l; i++) {
            if (!this.f90091g[i].f31978f) {
                m23817h(this.f90088d);
                return;
            }
        }
        jva jvaVar3 = f90073C;
        if (jvaVar3 != null) {
            jvaVar3.f52083u++;
        }
        computeValues();
    }

    public void removeRow(e70 e70Var) {
        dvf dvfVar;
        int i;
        if (!e70Var.f31978f || (dvfVar = e70Var.f31973a) == null) {
            return;
        }
        int i2 = dvfVar.f31075d;
        if (i2 != -1) {
            while (true) {
                i = this.f90096l;
                if (i2 >= i - 1) {
                    break;
                }
                e70[] e70VarArr = this.f90091g;
                int i3 = i2 + 1;
                e70 e70Var2 = e70VarArr[i3];
                dvf dvfVar2 = e70Var2.f31973a;
                if (dvfVar2.f31075d == i3) {
                    dvfVar2.f31075d = i2;
                }
                e70VarArr[i2] = e70Var2;
                i2 = i3;
            }
            this.f90096l = i - 1;
        }
        dvf dvfVar3 = e70Var.f31973a;
        if (!dvfVar3.f31078m) {
            dvfVar3.setFinalValue(this, e70Var.f31974b);
        }
        if (f90071A) {
            this.f90098n.f36987a.release(e70Var);
        } else {
            this.f90098n.f36988b.release(e70Var);
        }
    }

    public void reset() {
        fl1 fl1Var;
        int i = 0;
        while (true) {
            fl1Var = this.f90098n;
            dvf[] dvfVarArr = fl1Var.f36990d;
            if (i >= dvfVarArr.length) {
                break;
            }
            dvf dvfVar = dvfVarArr[i];
            if (dvfVar != null) {
                dvfVar.reset();
            }
            i++;
        }
        fl1Var.f36989c.releaseAll(this.f90099o, this.f90100p);
        this.f90100p = 0;
        Arrays.fill(this.f90098n.f36990d, (Object) null);
        HashMap<String, dvf> map = this.f90087c;
        if (map != null) {
            map.clear();
        }
        this.f90086b = 0;
        this.f90088d.clear();
        this.f90095k = 1;
        for (int i2 = 0; i2 < this.f90096l; i2++) {
            e70 e70Var = this.f90091g[i2];
            if (e70Var != null) {
                e70Var.f31975c = false;
            }
        }
        releaseRows();
        this.f90096l = 0;
        if (f90071A) {
            this.f90101q = new C13886b(this.f90098n);
        } else {
            this.f90101q = new e70(this.f90098n);
        }
    }

    public void addEquality(dvf dvfVar, int i) {
        if (f90081w && dvfVar.f31075d == -1) {
            float f = i;
            dvfVar.setFinalValue(this, f);
            for (int i2 = 0; i2 < this.f90086b + 1; i2++) {
                dvf dvfVar2 = this.f90098n.f36990d[i2];
                if (dvfVar2 != null && dvfVar2.f31068Q && dvfVar2.f31069X == dvfVar.f31074c) {
                    dvfVar2.setFinalValue(this, dvfVar2.f31070Y + f);
                }
            }
            return;
        }
        int i3 = dvfVar.f31075d;
        if (i3 != -1) {
            e70 e70Var = this.f90091g[i3];
            if (e70Var.f31978f) {
                e70Var.f31974b = i;
                return;
            }
            if (e70Var.f31977e.getCurrentSize() == 0) {
                e70Var.f31978f = true;
                e70Var.f31974b = i;
                return;
            } else {
                e70 e70VarCreateRow = createRow();
                e70VarCreateRow.createRowEquals(dvfVar, i);
                addConstraint(e70VarCreateRow);
                return;
            }
        }
        e70 e70VarCreateRow2 = createRow();
        e70VarCreateRow2.m9765e(dvfVar, i);
        addConstraint(e70VarCreateRow2);
    }
}
