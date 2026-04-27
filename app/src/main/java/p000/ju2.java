package p000;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p000.iu2;
import p000.yv0;

/* JADX INFO: loaded from: classes.dex */
public class ju2 extends tki {

    /* JADX INFO: renamed from: g2 */
    public static final int f51832g2 = 8;

    /* JADX INFO: renamed from: h2 */
    public static final boolean f51833h2 = false;

    /* JADX INFO: renamed from: i2 */
    public static final boolean f51834i2 = false;

    /* JADX INFO: renamed from: j2 */
    public static final boolean f51835j2 = false;

    /* JADX INFO: renamed from: k2 */
    public static int f51836k2;

    /* JADX INFO: renamed from: B1 */
    public yv0 f51837B1;

    /* JADX INFO: renamed from: C1 */
    public o64 f51838C1;

    /* JADX INFO: renamed from: D1 */
    public int f51839D1;

    /* JADX INFO: renamed from: E1 */
    public yv0.InterfaceC15818b f51840E1;

    /* JADX INFO: renamed from: F1 */
    public boolean f51841F1;

    /* JADX INFO: renamed from: G1 */
    public jva f51842G1;

    /* JADX INFO: renamed from: H1 */
    public v69 f51843H1;

    /* JADX INFO: renamed from: I1 */
    public int f51844I1;

    /* JADX INFO: renamed from: J1 */
    public int f51845J1;

    /* JADX INFO: renamed from: K1 */
    public int f51846K1;

    /* JADX INFO: renamed from: L1 */
    public int f51847L1;

    /* JADX INFO: renamed from: M1 */
    public int f51848M1;

    /* JADX INFO: renamed from: N1 */
    public int f51849N1;

    /* JADX INFO: renamed from: O1 */
    public rt1[] f51850O1;

    /* JADX INFO: renamed from: P1 */
    public rt1[] f51851P1;

    /* JADX INFO: renamed from: Q1 */
    public boolean f51852Q1;

    /* JADX INFO: renamed from: R1 */
    public boolean f51853R1;

    /* JADX INFO: renamed from: S1 */
    public boolean f51854S1;

    /* JADX INFO: renamed from: T1 */
    public int f51855T1;

    /* JADX INFO: renamed from: U1 */
    public int f51856U1;

    /* JADX INFO: renamed from: V1 */
    public int f51857V1;

    /* JADX INFO: renamed from: W1 */
    public boolean f51858W1;

    /* JADX INFO: renamed from: X1 */
    public boolean f51859X1;

    /* JADX INFO: renamed from: Y1 */
    public boolean f51860Y1;

    /* JADX INFO: renamed from: Z1 */
    public int f51861Z1;

    /* JADX INFO: renamed from: a2 */
    public WeakReference<cu2> f51862a2;

    /* JADX INFO: renamed from: b2 */
    public WeakReference<cu2> f51863b2;

    /* JADX INFO: renamed from: c2 */
    public WeakReference<cu2> f51864c2;

    /* JADX INFO: renamed from: d2 */
    public WeakReference<cu2> f51865d2;

    /* JADX INFO: renamed from: e2 */
    public HashSet<iu2> f51866e2;

    /* JADX INFO: renamed from: f2 */
    public yv0.C15817a f51867f2;

    public ju2() {
        this.f51837B1 = new yv0(this);
        this.f51838C1 = new o64(this);
        this.f51840E1 = null;
        this.f51841F1 = false;
        this.f51843H1 = new v69();
        this.f51848M1 = 0;
        this.f51849N1 = 0;
        this.f51850O1 = new rt1[4];
        this.f51851P1 = new rt1[4];
        this.f51852Q1 = false;
        this.f51853R1 = false;
        this.f51854S1 = false;
        this.f51855T1 = 0;
        this.f51856U1 = 0;
        this.f51857V1 = 257;
        this.f51858W1 = false;
        this.f51859X1 = false;
        this.f51860Y1 = false;
        this.f51861Z1 = 0;
        this.f51862a2 = null;
        this.f51863b2 = null;
        this.f51864c2 = null;
        this.f51865d2 = null;
        this.f51866e2 = new HashSet<>();
        this.f51867f2 = new yv0.C15817a();
    }

    private void addHorizontalChain(iu2 iu2Var) {
        int i = this.f51848M1 + 1;
        rt1[] rt1VarArr = this.f51851P1;
        if (i >= rt1VarArr.length) {
            this.f51851P1 = (rt1[]) Arrays.copyOf(rt1VarArr, rt1VarArr.length * 2);
        }
        this.f51851P1[this.f51848M1] = new rt1(iu2Var, 0, isRtl());
        this.f51848M1++;
    }

    private void addMaxWrap(cu2 cu2Var, dvf dvfVar) {
        this.f51843H1.addGreaterThan(dvfVar, this.f51843H1.createObjectVariable(cu2Var), 0, 5);
    }

    private void addMinWrap(cu2 cu2Var, dvf dvfVar) {
        this.f51843H1.addGreaterThan(this.f51843H1.createObjectVariable(cu2Var), dvfVar, 0, 5);
    }

    private void addVerticalChain(iu2 iu2Var) {
        int i = this.f51849N1 + 1;
        rt1[] rt1VarArr = this.f51850O1;
        if (i >= rt1VarArr.length) {
            this.f51850O1 = (rt1[]) Arrays.copyOf(rt1VarArr, rt1VarArr.length * 2);
        }
        this.f51850O1[this.f51849N1] = new rt1(iu2Var, 1, isRtl());
        this.f51849N1++;
    }

    private void resetChains() {
        this.f51848M1 = 0;
        this.f51849N1 = 0;
    }

    public boolean addChildrenToSolver(v69 v69Var) {
        boolean zOptimizeFor = optimizeFor(64);
        addToSolver(v69Var, zOptimizeFor);
        int size = this.f85148A1.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            iu2 iu2Var = this.f85148A1.get(i);
            iu2Var.m13424e(0, false);
            iu2Var.m13424e(1, false);
            if (iu2Var instanceof zp0) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                iu2 iu2Var2 = this.f85148A1.get(i2);
                if (iu2Var2 instanceof zp0) {
                    ((zp0) iu2Var2).m26931g();
                }
            }
        }
        this.f51866e2.clear();
        for (int i3 = 0; i3 < size; i3++) {
            iu2 iu2Var3 = this.f85148A1.get(i3);
            if (iu2Var3.m13420a()) {
                if (iu2Var3 instanceof adi) {
                    this.f51866e2.add(iu2Var3);
                } else {
                    iu2Var3.addToSolver(v69Var, zOptimizeFor);
                }
            }
        }
        while (this.f51866e2.size() > 0) {
            int size2 = this.f51866e2.size();
            Iterator<iu2> it = this.f51866e2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                adi adiVar = (adi) it.next();
                if (adiVar.contains(this.f51866e2)) {
                    adiVar.addToSolver(v69Var, zOptimizeFor);
                    this.f51866e2.remove(adiVar);
                    break;
                }
            }
            if (size2 == this.f51866e2.size()) {
                Iterator<iu2> it2 = this.f51866e2.iterator();
                while (it2.hasNext()) {
                    it2.next().addToSolver(v69Var, zOptimizeFor);
                }
                this.f51866e2.clear();
            }
        }
        if (v69.f90080v) {
            HashSet<iu2> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                iu2 iu2Var4 = this.f85148A1.get(i4);
                if (!iu2Var4.m13420a()) {
                    hashSet.add(iu2Var4);
                }
            }
            addChildrenToSolverByDependency(this, v69Var, hashSet, getHorizontalDimensionBehaviour() == iu2.EnumC7619b.WRAP_CONTENT ? 0 : 1, false);
            for (iu2 iu2Var5 : hashSet) {
                t6c.m22394a(this, v69Var, iu2Var5);
                iu2Var5.addToSolver(v69Var, zOptimizeFor);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                iu2 iu2Var6 = this.f85148A1.get(i5);
                if (iu2Var6 instanceof ju2) {
                    iu2.EnumC7619b[] enumC7619bArr = iu2Var6.f48377b0;
                    iu2.EnumC7619b enumC7619b = enumC7619bArr[0];
                    iu2.EnumC7619b enumC7619b2 = enumC7619bArr[1];
                    iu2.EnumC7619b enumC7619b3 = iu2.EnumC7619b.WRAP_CONTENT;
                    if (enumC7619b == enumC7619b3) {
                        iu2Var6.setHorizontalDimensionBehaviour(iu2.EnumC7619b.FIXED);
                    }
                    if (enumC7619b2 == enumC7619b3) {
                        iu2Var6.setVerticalDimensionBehaviour(iu2.EnumC7619b.FIXED);
                    }
                    iu2Var6.addToSolver(v69Var, zOptimizeFor);
                    if (enumC7619b == enumC7619b3) {
                        iu2Var6.setHorizontalDimensionBehaviour(enumC7619b);
                    }
                    if (enumC7619b2 == enumC7619b3) {
                        iu2Var6.setVerticalDimensionBehaviour(enumC7619b2);
                    }
                } else {
                    t6c.m22394a(this, v69Var, iu2Var6);
                    if (!iu2Var6.m13420a()) {
                        iu2Var6.addToSolver(v69Var, zOptimizeFor);
                    }
                }
            }
        }
        if (this.f51848M1 > 0) {
            qt1.applyChainConstraints(this, v69Var, null, 0);
        }
        if (this.f51849N1 > 0) {
            qt1.applyChainConstraints(this, v69Var, null, 1);
        }
        return true;
    }

    public void addHorizontalWrapMaxVariable(cu2 cu2Var) {
        WeakReference<cu2> weakReference = this.f51865d2;
        if (weakReference == null || weakReference.get() == null || cu2Var.getFinalValue() > this.f51865d2.get().getFinalValue()) {
            this.f51865d2 = new WeakReference<>(cu2Var);
        }
    }

    public void addHorizontalWrapMinVariable(cu2 cu2Var) {
        WeakReference<cu2> weakReference = this.f51863b2;
        if (weakReference == null || weakReference.get() == null || cu2Var.getFinalValue() > this.f51863b2.get().getFinalValue()) {
            this.f51863b2 = new WeakReference<>(cu2Var);
        }
    }

    public void defineTerminalWidgets() {
        this.f51838C1.defineTerminalWidgets(getHorizontalDimensionBehaviour(), getVerticalDimensionBehaviour());
    }

    public boolean directMeasure(boolean z) {
        return this.f51838C1.directMeasure(z);
    }

    public boolean directMeasureSetup(boolean z) {
        return this.f51838C1.directMeasureSetup(z);
    }

    public boolean directMeasureWithOrientation(boolean z, int i) {
        return this.f51838C1.directMeasureWithOrientation(z, i);
    }

    public void fillMetrics(jva jvaVar) {
        this.f51842G1 = jvaVar;
        this.f51843H1.fillMetrics(jvaVar);
    }

    /* JADX INFO: renamed from: g */
    public void m14310g(iu2 iu2Var, int i) {
        if (i == 0) {
            addHorizontalChain(iu2Var);
        } else if (i == 1) {
            addVerticalChain(iu2Var);
        }
    }

    public ArrayList<dd7> getHorizontalGuidelines() {
        ArrayList<dd7> arrayList = new ArrayList<>();
        int size = this.f85148A1.size();
        for (int i = 0; i < size; i++) {
            iu2 iu2Var = this.f85148A1.get(i);
            if (iu2Var instanceof dd7) {
                dd7 dd7Var = (dd7) iu2Var;
                if (dd7Var.getOrientation() == 0) {
                    arrayList.add(dd7Var);
                }
            }
        }
        return arrayList;
    }

    public yv0.InterfaceC15818b getMeasurer() {
        return this.f51840E1;
    }

    public int getOptimizationLevel() {
        return this.f51857V1;
    }

    @Override // p000.iu2
    public void getSceneString(StringBuilder sb) {
        sb.append(this.f48402o + ":{\n");
        sb.append("  actualWidth:" + this.f48381d0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f48383e0);
        sb.append("\n");
        Iterator<iu2> it = getChildren().iterator();
        while (it.hasNext()) {
            it.next().getSceneString(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public v69 getSystem() {
        return this.f51843H1;
    }

    @Override // p000.iu2
    public String getType() {
        return ConstraintLayout.f6625j2;
    }

    public ArrayList<dd7> getVerticalGuidelines() {
        ArrayList<dd7> arrayList = new ArrayList<>();
        int size = this.f85148A1.size();
        for (int i = 0; i < size; i++) {
            iu2 iu2Var = this.f85148A1.get(i);
            if (iu2Var instanceof dd7) {
                dd7 dd7Var = (dd7) iu2Var;
                if (dd7Var.getOrientation() == 1) {
                    arrayList.add(dd7Var);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public void m14311h(cu2 cu2Var) {
        WeakReference<cu2> weakReference = this.f51864c2;
        if (weakReference == null || weakReference.get() == null || cu2Var.getFinalValue() > this.f51864c2.get().getFinalValue()) {
            this.f51864c2 = new WeakReference<>(cu2Var);
        }
    }

    public boolean handlesInternalConstraints() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m14312i(cu2 cu2Var) {
        WeakReference<cu2> weakReference = this.f51862a2;
        if (weakReference == null || weakReference.get() == null || cu2Var.getFinalValue() > this.f51862a2.get().getFinalValue()) {
            this.f51862a2 = new WeakReference<>(cu2Var);
        }
    }

    public void invalidateGraph() {
        this.f51838C1.invalidateGraph();
    }

    public void invalidateMeasures() {
        this.f51838C1.invalidateMeasures();
    }

    public boolean isHeightMeasuredTooSmall() {
        return this.f51860Y1;
    }

    public boolean isRtl() {
        return this.f51841F1;
    }

    public boolean isWidthMeasuredTooSmall() {
        return this.f51859X1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0312 A[PHI: r2 r16
  0x0312: PHI (r2v15 ??) = (r2v14 ??), (r2v19 ??), (r2v19 ??), (r2v19 ??) binds: [B:141:0x02d3, B:149:0x02f8, B:150:0x02fa, B:152:0x0300] A[DONT_GENERATE, DONT_INLINE]
  0x0312: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:141:0x02d3, B:149:0x02f8, B:150:0x02fa, B:152:0x0300] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // p000.tki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layout() {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ju2.layout():void");
    }

    public long measure(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f51844I1 = i8;
        this.f51845J1 = i9;
        return this.f51837B1.solverMeasure(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean optimizeFor(int i) {
        return (this.f51857V1 & i) == i;
    }

    @Override // p000.tki, p000.iu2
    public void reset() {
        this.f51843H1.reset();
        this.f51844I1 = 0;
        this.f51846K1 = 0;
        this.f51845J1 = 0;
        this.f51847L1 = 0;
        this.f51858W1 = false;
        super.reset();
    }

    public void setMeasurer(yv0.InterfaceC15818b interfaceC15818b) {
        this.f51840E1 = interfaceC15818b;
        this.f51838C1.setMeasurer(interfaceC15818b);
    }

    public void setOptimizationLevel(int i) {
        this.f51857V1 = i;
        v69.f90080v = optimizeFor(512);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f51844I1 = i;
        this.f51845J1 = i2;
        this.f51846K1 = i3;
        this.f51847L1 = i4;
    }

    public void setPass(int i) {
        this.f51839D1 = i;
    }

    public void setRtl(boolean z) {
        this.f51841F1 = z;
    }

    public boolean updateChildrenFromSolver(v69 v69Var, boolean[] zArr) {
        zArr[2] = false;
        boolean zOptimizeFor = optimizeFor(64);
        updateFromSolver(v69Var, zOptimizeFor);
        int size = this.f85148A1.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            iu2 iu2Var = this.f85148A1.get(i);
            iu2Var.updateFromSolver(v69Var, zOptimizeFor);
            if (iu2Var.hasDimensionOverride()) {
                z = true;
            }
        }
        return z;
    }

    @Override // p000.iu2
    public void updateFromRuns(boolean z, boolean z2) {
        super.updateFromRuns(z, z2);
        int size = this.f85148A1.size();
        for (int i = 0; i < size; i++) {
            this.f85148A1.get(i).updateFromRuns(z, z2);
        }
    }

    public void updateHierarchy() {
        this.f51837B1.updateHierarchy(this);
    }

    public static boolean measure(int i, iu2 iu2Var, yv0.InterfaceC15818b interfaceC15818b, yv0.C15817a c15817a, int i2) {
        int i3;
        int i4;
        if (interfaceC15818b == null) {
            return false;
        }
        if (iu2Var.getVisibility() != 8 && !(iu2Var instanceof dd7) && !(iu2Var instanceof zp0)) {
            c15817a.f103047a = iu2Var.getHorizontalDimensionBehaviour();
            c15817a.f103048b = iu2Var.getVerticalDimensionBehaviour();
            c15817a.f103049c = iu2Var.getWidth();
            c15817a.f103050d = iu2Var.getHeight();
            c15817a.f103055i = false;
            c15817a.f103056j = i2;
            iu2.EnumC7619b enumC7619b = c15817a.f103047a;
            iu2.EnumC7619b enumC7619b2 = iu2.EnumC7619b.MATCH_CONSTRAINT;
            boolean z = enumC7619b == enumC7619b2;
            boolean z2 = c15817a.f103048b == enumC7619b2;
            boolean z3 = z && iu2Var.f48385f0 > 0.0f;
            boolean z4 = z2 && iu2Var.f48385f0 > 0.0f;
            if (z && iu2Var.hasDanglingDimension(0) && iu2Var.f48418w == 0 && !z3) {
                c15817a.f103047a = iu2.EnumC7619b.WRAP_CONTENT;
                if (z2 && iu2Var.f48420x == 0) {
                    c15817a.f103047a = iu2.EnumC7619b.FIXED;
                }
                z = false;
            }
            if (z2 && iu2Var.hasDanglingDimension(1) && iu2Var.f48420x == 0 && !z4) {
                c15817a.f103048b = iu2.EnumC7619b.WRAP_CONTENT;
                if (z && iu2Var.f48418w == 0) {
                    c15817a.f103048b = iu2.EnumC7619b.FIXED;
                }
                z2 = false;
            }
            if (iu2Var.isResolvedHorizontally()) {
                c15817a.f103047a = iu2.EnumC7619b.FIXED;
                z = false;
            }
            if (iu2Var.isResolvedVertically()) {
                c15817a.f103048b = iu2.EnumC7619b.FIXED;
                z2 = false;
            }
            if (z3) {
                if (iu2Var.f48422y[0] == 4) {
                    c15817a.f103047a = iu2.EnumC7619b.FIXED;
                } else if (!z2) {
                    iu2.EnumC7619b enumC7619b3 = c15817a.f103048b;
                    iu2.EnumC7619b enumC7619b4 = iu2.EnumC7619b.FIXED;
                    if (enumC7619b3 == enumC7619b4) {
                        i4 = c15817a.f103050d;
                    } else {
                        c15817a.f103047a = iu2.EnumC7619b.WRAP_CONTENT;
                        interfaceC15818b.measure(iu2Var, c15817a);
                        i4 = c15817a.f103052f;
                    }
                    c15817a.f103047a = enumC7619b4;
                    c15817a.f103049c = (int) (iu2Var.getDimensionRatio() * i4);
                }
            }
            if (z4) {
                if (iu2Var.f48422y[1] == 4) {
                    c15817a.f103048b = iu2.EnumC7619b.FIXED;
                } else if (!z) {
                    iu2.EnumC7619b enumC7619b5 = c15817a.f103047a;
                    iu2.EnumC7619b enumC7619b6 = iu2.EnumC7619b.FIXED;
                    if (enumC7619b5 == enumC7619b6) {
                        i3 = c15817a.f103049c;
                    } else {
                        c15817a.f103048b = iu2.EnumC7619b.WRAP_CONTENT;
                        interfaceC15818b.measure(iu2Var, c15817a);
                        i3 = c15817a.f103051e;
                    }
                    c15817a.f103048b = enumC7619b6;
                    if (iu2Var.getDimensionRatioSide() == -1) {
                        c15817a.f103050d = (int) (i3 / iu2Var.getDimensionRatio());
                    } else {
                        c15817a.f103050d = (int) (iu2Var.getDimensionRatio() * i3);
                    }
                }
            }
            interfaceC15818b.measure(iu2Var, c15817a);
            iu2Var.setWidth(c15817a.f103051e);
            iu2Var.setHeight(c15817a.f103052f);
            iu2Var.setHasBaseline(c15817a.f103054h);
            iu2Var.setBaselineDistance(c15817a.f103053g);
            c15817a.f103056j = yv0.C15817a.f103044k;
            return c15817a.f103055i;
        }
        c15817a.f103051e = 0;
        c15817a.f103052f = 0;
        return false;
    }

    public ju2(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.f51837B1 = new yv0(this);
        this.f51838C1 = new o64(this);
        this.f51840E1 = null;
        this.f51841F1 = false;
        this.f51843H1 = new v69();
        this.f51848M1 = 0;
        this.f51849N1 = 0;
        this.f51850O1 = new rt1[4];
        this.f51851P1 = new rt1[4];
        this.f51852Q1 = false;
        this.f51853R1 = false;
        this.f51854S1 = false;
        this.f51855T1 = 0;
        this.f51856U1 = 0;
        this.f51857V1 = 257;
        this.f51858W1 = false;
        this.f51859X1 = false;
        this.f51860Y1 = false;
        this.f51861Z1 = 0;
        this.f51862a2 = null;
        this.f51863b2 = null;
        this.f51864c2 = null;
        this.f51865d2 = null;
        this.f51866e2 = new HashSet<>();
        this.f51867f2 = new yv0.C15817a();
    }

    public ju2(int i, int i2) {
        super(i, i2);
        this.f51837B1 = new yv0(this);
        this.f51838C1 = new o64(this);
        this.f51840E1 = null;
        this.f51841F1 = false;
        this.f51843H1 = new v69();
        this.f51848M1 = 0;
        this.f51849N1 = 0;
        this.f51850O1 = new rt1[4];
        this.f51851P1 = new rt1[4];
        this.f51852Q1 = false;
        this.f51853R1 = false;
        this.f51854S1 = false;
        this.f51855T1 = 0;
        this.f51856U1 = 0;
        this.f51857V1 = 257;
        this.f51858W1 = false;
        this.f51859X1 = false;
        this.f51860Y1 = false;
        this.f51861Z1 = 0;
        this.f51862a2 = null;
        this.f51863b2 = null;
        this.f51864c2 = null;
        this.f51865d2 = null;
        this.f51866e2 = new HashSet<>();
        this.f51867f2 = new yv0.C15817a();
    }

    public ju2(String str, int i, int i2) {
        super(i, i2);
        this.f51837B1 = new yv0(this);
        this.f51838C1 = new o64(this);
        this.f51840E1 = null;
        this.f51841F1 = false;
        this.f51843H1 = new v69();
        this.f51848M1 = 0;
        this.f51849N1 = 0;
        this.f51850O1 = new rt1[4];
        this.f51851P1 = new rt1[4];
        this.f51852Q1 = false;
        this.f51853R1 = false;
        this.f51854S1 = false;
        this.f51855T1 = 0;
        this.f51856U1 = 0;
        this.f51857V1 = 257;
        this.f51858W1 = false;
        this.f51859X1 = false;
        this.f51860Y1 = false;
        this.f51861Z1 = 0;
        this.f51862a2 = null;
        this.f51863b2 = null;
        this.f51864c2 = null;
        this.f51865d2 = null;
        this.f51866e2 = new HashSet<>();
        this.f51867f2 = new yv0.C15817a();
        setDebugName(str);
    }
}
