package p000;

import java.util.ArrayList;
import p000.cu2;
import p000.iu2;

/* JADX INFO: loaded from: classes.dex */
public class yv0 {

    /* JADX INFO: renamed from: d */
    public static final boolean f103033d = false;

    /* JADX INFO: renamed from: e */
    public static final int f103034e = 30;

    /* JADX INFO: renamed from: f */
    public static final int f103035f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f103036g = 1073741824;

    /* JADX INFO: renamed from: h */
    public static final int f103037h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public static final int f103038i = -1;

    /* JADX INFO: renamed from: j */
    public static final int f103039j = -2;

    /* JADX INFO: renamed from: k */
    public static final int f103040k = -3;

    /* JADX INFO: renamed from: a */
    public final ArrayList<iu2> f103041a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public C15817a f103042b = new C15817a();

    /* JADX INFO: renamed from: c */
    public ju2 f103043c;

    /* JADX INFO: renamed from: yv0$a */
    public static class C15817a {

        /* JADX INFO: renamed from: k */
        public static int f103044k = 0;

        /* JADX INFO: renamed from: l */
        public static int f103045l = 1;

        /* JADX INFO: renamed from: m */
        public static int f103046m = 2;

        /* JADX INFO: renamed from: a */
        public iu2.EnumC7619b f103047a;

        /* JADX INFO: renamed from: b */
        public iu2.EnumC7619b f103048b;

        /* JADX INFO: renamed from: c */
        public int f103049c;

        /* JADX INFO: renamed from: d */
        public int f103050d;

        /* JADX INFO: renamed from: e */
        public int f103051e;

        /* JADX INFO: renamed from: f */
        public int f103052f;

        /* JADX INFO: renamed from: g */
        public int f103053g;

        /* JADX INFO: renamed from: h */
        public boolean f103054h;

        /* JADX INFO: renamed from: i */
        public boolean f103055i;

        /* JADX INFO: renamed from: j */
        public int f103056j;
    }

    /* JADX INFO: renamed from: yv0$b */
    public interface InterfaceC15818b {
        void didMeasures();

        void measure(iu2 iu2Var, C15817a c15817a);
    }

    public yv0(ju2 ju2Var) {
        this.f103043c = ju2Var;
    }

    private boolean measure(InterfaceC15818b interfaceC15818b, iu2 iu2Var, int i) {
        this.f103042b.f103047a = iu2Var.getHorizontalDimensionBehaviour();
        this.f103042b.f103048b = iu2Var.getVerticalDimensionBehaviour();
        this.f103042b.f103049c = iu2Var.getWidth();
        this.f103042b.f103050d = iu2Var.getHeight();
        C15817a c15817a = this.f103042b;
        c15817a.f103055i = false;
        c15817a.f103056j = i;
        iu2.EnumC7619b enumC7619b = c15817a.f103047a;
        iu2.EnumC7619b enumC7619b2 = iu2.EnumC7619b.MATCH_CONSTRAINT;
        boolean z = enumC7619b == enumC7619b2;
        boolean z2 = c15817a.f103048b == enumC7619b2;
        boolean z3 = z && iu2Var.f48385f0 > 0.0f;
        boolean z4 = z2 && iu2Var.f48385f0 > 0.0f;
        if (z3 && iu2Var.f48422y[0] == 4) {
            c15817a.f103047a = iu2.EnumC7619b.FIXED;
        }
        if (z4 && iu2Var.f48422y[1] == 4) {
            c15817a.f103048b = iu2.EnumC7619b.FIXED;
        }
        interfaceC15818b.measure(iu2Var, c15817a);
        iu2Var.setWidth(this.f103042b.f103051e);
        iu2Var.setHeight(this.f103042b.f103052f);
        iu2Var.setHasBaseline(this.f103042b.f103054h);
        iu2Var.setBaselineDistance(this.f103042b.f103053g);
        C15817a c15817a2 = this.f103042b;
        c15817a2.f103056j = C15817a.f103044k;
        return c15817a2.f103055i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0098 A[PHI: r10
  0x0098: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0062, B:34:0x0068, B:36:0x006c, B:54:0x0095, B:52:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void measureChildren(p000.ju2 r13) {
        /*
            r12 = this;
            java.util.ArrayList<iu2> r0 = r13.f85148A1
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.optimizeFor(r1)
            yv0$b r2 = r13.getMeasurer()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<iu2> r5 = r13.f85148A1
            java.lang.Object r5 = r5.get(r4)
            iu2 r5 = (p000.iu2) r5
            boolean r6 = r5 instanceof p000.dd7
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof p000.zp0
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.isInVirtualLayout()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            rl7 r6 = r5.f48382e
            if (r6 == 0) goto L48
            k5i r7 = r5.f48384f
            if (r7 == 0) goto L48
            ad4 r6 = r6.f94566e
            boolean r6 = r6.f69826j
            if (r6 == 0) goto L48
            ad4 r6 = r7.f94566e
            boolean r6 = r6.f69826j
            if (r6 == 0) goto L48
            goto Lac
        L48:
            iu2$b r6 = r5.getDimensionBehaviour(r3)
            r7 = 1
            iu2$b r8 = r5.getDimensionBehaviour(r7)
            iu2$b r9 = p000.iu2.EnumC7619b.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.f48418w
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.f48420x
            if (r10 == r7) goto L61
            r10 = r7
            goto L62
        L61:
            r10 = r3
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.optimizeFor(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof p000.adi
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.f48418w
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L7d
            r10 = r7
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.f48420x
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L8c
            r10 = r7
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.f48385f0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = p000.yv0.C15817a.f103044k
            r12.measure(r2, r5, r6)
            jva r5 = r13.f51842G1
            if (r5 == 0) goto Lac
            long r6 = r5.f52065c
            r8 = 1
            long r6 = r6 + r8
            r5.f52065c = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.didMeasures()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.yv0.measureChildren(ju2):void");
    }

    private void solveLinearSystem(ju2 ju2Var, String str, int i, int i2, int i3) {
        int minWidth = ju2Var.getMinWidth();
        int minHeight = ju2Var.getMinHeight();
        ju2Var.setMinWidth(0);
        ju2Var.setMinHeight(0);
        ju2Var.setWidth(i2);
        ju2Var.setHeight(i3);
        ju2Var.setMinWidth(minWidth);
        ju2Var.setMinHeight(minHeight);
        this.f103043c.setPass(i);
        this.f103043c.layout();
    }

    public long solverMeasure(ju2 ju2Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zDirectMeasureWithOrientation;
        int i10;
        int i11;
        boolean z;
        int i12;
        InterfaceC15818b interfaceC15818b;
        int i13;
        int i14;
        int i15;
        boolean z2;
        jva jvaVar;
        InterfaceC15818b measurer = ju2Var.getMeasurer();
        int size = ju2Var.f85148A1.size();
        int width = ju2Var.getWidth();
        int height = ju2Var.getHeight();
        boolean zEnabled = t6c.enabled(i, 128);
        boolean z3 = zEnabled || t6c.enabled(i, 64);
        if (z3) {
            for (int i16 = 0; i16 < size; i16++) {
                iu2 iu2Var = ju2Var.f85148A1.get(i16);
                iu2.EnumC7619b horizontalDimensionBehaviour = iu2Var.getHorizontalDimensionBehaviour();
                iu2.EnumC7619b enumC7619b = iu2.EnumC7619b.MATCH_CONSTRAINT;
                boolean z4 = (horizontalDimensionBehaviour == enumC7619b) && (iu2Var.getVerticalDimensionBehaviour() == enumC7619b) && iu2Var.getDimensionRatio() > 0.0f;
                if ((iu2Var.isInHorizontalChain() && z4) || ((iu2Var.isInVerticalChain() && z4) || (iu2Var instanceof adi) || iu2Var.isInHorizontalChain() || iu2Var.isInVerticalChain())) {
                    z3 = false;
                    break;
                }
            }
        }
        if (z3 && (jvaVar = v69.f90073C) != null) {
            jvaVar.f52067e++;
        }
        boolean z5 = z3 & ((i4 == 1073741824 && i6 == 1073741824) || zEnabled);
        int i17 = 2;
        if (z5) {
            int iMin = Math.min(ju2Var.getMaxWidth(), i5);
            int iMin2 = Math.min(ju2Var.getMaxHeight(), i7);
            if (i4 == 1073741824 && ju2Var.getWidth() != iMin) {
                ju2Var.setWidth(iMin);
                ju2Var.invalidateGraph();
            }
            if (i6 == 1073741824 && ju2Var.getHeight() != iMin2) {
                ju2Var.setHeight(iMin2);
                ju2Var.invalidateGraph();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                zDirectMeasureWithOrientation = ju2Var.directMeasure(zEnabled);
                i10 = 2;
            } else {
                boolean zDirectMeasureSetup = ju2Var.directMeasureSetup(zEnabled);
                if (i4 == 1073741824) {
                    zDirectMeasureSetup &= ju2Var.directMeasureWithOrientation(zEnabled, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    zDirectMeasureWithOrientation = ju2Var.directMeasureWithOrientation(zEnabled, 1) & zDirectMeasureSetup;
                    i10++;
                } else {
                    zDirectMeasureWithOrientation = zDirectMeasureSetup;
                }
            }
            if (zDirectMeasureWithOrientation) {
                ju2Var.updateFromRuns(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            zDirectMeasureWithOrientation = false;
            i10 = 0;
        }
        if (zDirectMeasureWithOrientation && i10 == 2) {
            return 0L;
        }
        int optimizationLevel = ju2Var.getOptimizationLevel();
        if (size > 0) {
            measureChildren(ju2Var);
        }
        updateHierarchy(ju2Var);
        int size2 = this.f103041a.size();
        if (size > 0) {
            solveLinearSystem(ju2Var, "First pass", 0, width, height);
        }
        if (size2 > 0) {
            iu2.EnumC7619b horizontalDimensionBehaviour2 = ju2Var.getHorizontalDimensionBehaviour();
            iu2.EnumC7619b enumC7619b2 = iu2.EnumC7619b.WRAP_CONTENT;
            boolean z6 = horizontalDimensionBehaviour2 == enumC7619b2;
            boolean z7 = ju2Var.getVerticalDimensionBehaviour() == enumC7619b2;
            int iMax = Math.max(ju2Var.getWidth(), this.f103043c.getMinWidth());
            int iMax2 = Math.max(ju2Var.getHeight(), this.f103043c.getMinHeight());
            int i18 = 0;
            boolean zNeedSolverPass = false;
            while (i18 < size2) {
                iu2 iu2Var2 = this.f103041a.get(i18);
                if (iu2Var2 instanceof adi) {
                    int width2 = iu2Var2.getWidth();
                    i13 = optimizationLevel;
                    int height2 = iu2Var2.getHeight();
                    i14 = height;
                    boolean zMeasure = measure(measurer, iu2Var2, C15817a.f103045l) | zNeedSolverPass;
                    jva jvaVar2 = ju2Var.f51842G1;
                    i15 = width;
                    if (jvaVar2 != null) {
                        jvaVar2.f52066d++;
                    }
                    int width3 = iu2Var2.getWidth();
                    int height3 = iu2Var2.getHeight();
                    if (width3 != width2) {
                        iu2Var2.setWidth(width3);
                        if (z6 && iu2Var2.getRight() > iMax) {
                            iMax = Math.max(iMax, iu2Var2.getRight() + iu2Var2.getAnchor(cu2.EnumC4503b.RIGHT).getMargin());
                        }
                        z2 = true;
                    } else {
                        z2 = zMeasure;
                    }
                    if (height3 != height2) {
                        iu2Var2.setHeight(height3);
                        if (z7 && iu2Var2.getBottom() > iMax2) {
                            iMax2 = Math.max(iMax2, iu2Var2.getBottom() + iu2Var2.getAnchor(cu2.EnumC4503b.BOTTOM).getMargin());
                        }
                        z2 = true;
                    }
                    zNeedSolverPass = z2 | ((adi) iu2Var2).needSolverPass();
                } else {
                    i13 = optimizationLevel;
                    i15 = width;
                    i14 = height;
                }
                i18++;
                optimizationLevel = i13;
                height = i14;
                width = i15;
                i17 = 2;
            }
            int i19 = optimizationLevel;
            int i20 = width;
            int i21 = height;
            int i22 = i17;
            int i23 = 0;
            while (i23 < i22) {
                int i24 = 0;
                while (i24 < size2) {
                    iu2 iu2Var3 = this.f103041a.get(i24);
                    if (((iu2Var3 instanceof nj7) && !(iu2Var3 instanceof adi)) || (iu2Var3 instanceof dd7) || iu2Var3.getVisibility() == 8 || ((z5 && iu2Var3.f48382e.f94566e.f69826j && iu2Var3.f48384f.f94566e.f69826j) || (iu2Var3 instanceof adi))) {
                        z = z5;
                        i12 = size2;
                        interfaceC15818b = measurer;
                    } else {
                        int width4 = iu2Var3.getWidth();
                        int height4 = iu2Var3.getHeight();
                        int baselineDistance = iu2Var3.getBaselineDistance();
                        int i25 = C15817a.f103045l;
                        z = z5;
                        if (i23 == 1) {
                            i25 = C15817a.f103046m;
                        }
                        boolean zMeasure2 = measure(measurer, iu2Var3, i25) | zNeedSolverPass;
                        jva jvaVar3 = ju2Var.f51842G1;
                        i12 = size2;
                        interfaceC15818b = measurer;
                        if (jvaVar3 != null) {
                            jvaVar3.f52066d++;
                        }
                        int width5 = iu2Var3.getWidth();
                        int height5 = iu2Var3.getHeight();
                        if (width5 != width4) {
                            iu2Var3.setWidth(width5);
                            if (z6 && iu2Var3.getRight() > iMax) {
                                iMax = Math.max(iMax, iu2Var3.getRight() + iu2Var3.getAnchor(cu2.EnumC4503b.RIGHT).getMargin());
                            }
                            zMeasure2 = true;
                        }
                        if (height5 != height4) {
                            iu2Var3.setHeight(height5);
                            if (z7 && iu2Var3.getBottom() > iMax2) {
                                iMax2 = Math.max(iMax2, iu2Var3.getBottom() + iu2Var3.getAnchor(cu2.EnumC4503b.BOTTOM).getMargin());
                            }
                            zMeasure2 = true;
                        }
                        zNeedSolverPass = (!iu2Var3.hasBaseline() || baselineDistance == iu2Var3.getBaselineDistance()) ? zMeasure2 : true;
                    }
                    i24++;
                    measurer = interfaceC15818b;
                    z5 = z;
                    size2 = i12;
                }
                boolean z8 = z5;
                int i26 = size2;
                InterfaceC15818b interfaceC15818b2 = measurer;
                if (!zNeedSolverPass) {
                    break;
                }
                i23++;
                solveLinearSystem(ju2Var, "intermediate pass", i23, i20, i21);
                measurer = interfaceC15818b2;
                z5 = z8;
                size2 = i26;
                i22 = 2;
                zNeedSolverPass = false;
            }
            i11 = i19;
        } else {
            i11 = optimizationLevel;
        }
        ju2Var.setOptimizationLevel(i11);
        return 0L;
    }

    public void updateHierarchy(ju2 ju2Var) {
        this.f103041a.clear();
        int size = ju2Var.f85148A1.size();
        for (int i = 0; i < size; i++) {
            iu2 iu2Var = ju2Var.f85148A1.get(i);
            iu2.EnumC7619b horizontalDimensionBehaviour = iu2Var.getHorizontalDimensionBehaviour();
            iu2.EnumC7619b enumC7619b = iu2.EnumC7619b.MATCH_CONSTRAINT;
            if (horizontalDimensionBehaviour == enumC7619b || iu2Var.getVerticalDimensionBehaviour() == enumC7619b) {
                this.f103041a.add(iu2Var);
            }
        }
        ju2Var.invalidateGraph();
    }
}
