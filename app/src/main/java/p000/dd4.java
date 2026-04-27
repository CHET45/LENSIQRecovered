package p000;

import java.util.ArrayList;
import java.util.Iterator;
import p000.a77;
import p000.cu2;
import p000.iu2;
import p000.yv0;

/* JADX INFO: loaded from: classes.dex */
public class dd4 {

    /* JADX INFO: renamed from: a */
    public static final boolean f29375a = false;

    /* JADX INFO: renamed from: b */
    public static final boolean f29376b = false;

    /* JADX INFO: renamed from: d */
    public static final boolean f29378d = true;

    /* JADX INFO: renamed from: c */
    public static yv0.C15817a f29377c = new yv0.C15817a();

    /* JADX INFO: renamed from: e */
    public static int f29379e = 0;

    /* JADX INFO: renamed from: f */
    public static int f29380f = 0;

    private static boolean canMeasure(int i, iu2 iu2Var) {
        iu2.EnumC7619b enumC7619b;
        iu2.EnumC7619b enumC7619b2;
        iu2.EnumC7619b horizontalDimensionBehaviour = iu2Var.getHorizontalDimensionBehaviour();
        iu2.EnumC7619b verticalDimensionBehaviour = iu2Var.getVerticalDimensionBehaviour();
        ju2 ju2Var = iu2Var.getParent() != null ? (ju2) iu2Var.getParent() : null;
        if (ju2Var != null) {
            ju2Var.getHorizontalDimensionBehaviour();
            iu2.EnumC7619b enumC7619b3 = iu2.EnumC7619b.FIXED;
        }
        if (ju2Var != null) {
            ju2Var.getVerticalDimensionBehaviour();
            iu2.EnumC7619b enumC7619b4 = iu2.EnumC7619b.FIXED;
        }
        iu2.EnumC7619b enumC7619b5 = iu2.EnumC7619b.FIXED;
        boolean z = horizontalDimensionBehaviour == enumC7619b5 || iu2Var.isResolvedHorizontally() || horizontalDimensionBehaviour == iu2.EnumC7619b.WRAP_CONTENT || (horizontalDimensionBehaviour == (enumC7619b2 = iu2.EnumC7619b.MATCH_CONSTRAINT) && iu2Var.f48418w == 0 && iu2Var.f48385f0 == 0.0f && iu2Var.hasDanglingDimension(0)) || (horizontalDimensionBehaviour == enumC7619b2 && iu2Var.f48418w == 1 && iu2Var.hasResolvedTargets(0, iu2Var.getWidth()));
        boolean z2 = verticalDimensionBehaviour == enumC7619b5 || iu2Var.isResolvedVertically() || verticalDimensionBehaviour == iu2.EnumC7619b.WRAP_CONTENT || (verticalDimensionBehaviour == (enumC7619b = iu2.EnumC7619b.MATCH_CONSTRAINT) && iu2Var.f48420x == 0 && iu2Var.f48385f0 == 0.0f && iu2Var.hasDanglingDimension(1)) || (verticalDimensionBehaviour == enumC7619b && iu2Var.f48420x == 1 && iu2Var.hasResolvedTargets(1, iu2Var.getHeight()));
        if (iu2Var.f48385f0 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    private static void horizontalSolvingPass(int i, iu2 iu2Var, yv0.InterfaceC15818b interfaceC15818b, boolean z) {
        cu2 cu2Var;
        cu2 cu2Var2;
        cu2 cu2Var3;
        cu2 cu2Var4;
        if (iu2Var.isHorizontalSolvingPassDone()) {
            return;
        }
        boolean z2 = true;
        f29379e++;
        if (!(iu2Var instanceof ju2) && iu2Var.isMeasureRequested()) {
            int i2 = i + 1;
            if (canMeasure(i2, iu2Var)) {
                ju2.measure(i2, iu2Var, interfaceC15818b, new yv0.C15817a(), yv0.C15817a.f103044k);
            }
        }
        cu2 anchor = iu2Var.getAnchor(cu2.EnumC4503b.LEFT);
        cu2 anchor2 = iu2Var.getAnchor(cu2.EnumC4503b.RIGHT);
        int finalValue = anchor.getFinalValue();
        int finalValue2 = anchor2.getFinalValue();
        if (anchor.getDependents() != null && anchor.hasFinalValue()) {
            Iterator<cu2> it = anchor.getDependents().iterator();
            while (it.hasNext()) {
                cu2 next = it.next();
                iu2 iu2Var2 = next.f27598d;
                int i3 = i + 1;
                boolean zCanMeasure = canMeasure(i3, iu2Var2);
                if (iu2Var2.isMeasureRequested() && zCanMeasure) {
                    ju2.measure(i3, iu2Var2, interfaceC15818b, new yv0.C15817a(), yv0.C15817a.f103044k);
                }
                boolean z3 = ((next == iu2Var2.f48360Q && (cu2Var4 = iu2Var2.f48364S.f27600f) != null && cu2Var4.hasFinalValue()) || (next == iu2Var2.f48364S && (cu2Var3 = iu2Var2.f48360Q.f27600f) != null && cu2Var3.hasFinalValue())) ? z2 : false;
                iu2.EnumC7619b horizontalDimensionBehaviour = iu2Var2.getHorizontalDimensionBehaviour();
                iu2.EnumC7619b enumC7619b = iu2.EnumC7619b.MATCH_CONSTRAINT;
                if (horizontalDimensionBehaviour != enumC7619b || zCanMeasure) {
                    if (!iu2Var2.isMeasureRequested()) {
                        cu2 cu2Var5 = iu2Var2.f48360Q;
                        if (next == cu2Var5 && iu2Var2.f48364S.f27600f == null) {
                            int margin = cu2Var5.getMargin() + finalValue;
                            iu2Var2.setFinalHorizontal(margin, iu2Var2.getWidth() + margin);
                            horizontalSolvingPass(i3, iu2Var2, interfaceC15818b, z);
                        } else {
                            cu2 cu2Var6 = iu2Var2.f48364S;
                            if (next == cu2Var6 && cu2Var5.f27600f == null) {
                                int margin2 = finalValue - cu2Var6.getMargin();
                                iu2Var2.setFinalHorizontal(margin2 - iu2Var2.getWidth(), margin2);
                                horizontalSolvingPass(i3, iu2Var2, interfaceC15818b, z);
                            } else if (z3 && !iu2Var2.isInHorizontalChain()) {
                                solveHorizontalCenterConstraints(i3, interfaceC15818b, iu2Var2, z);
                            }
                        }
                    }
                } else if (iu2Var2.getHorizontalDimensionBehaviour() == enumC7619b && iu2Var2.f48328A >= 0 && iu2Var2.f48424z >= 0 && ((iu2Var2.getVisibility() == 8 || (iu2Var2.f48418w == 0 && iu2Var2.getDimensionRatio() == 0.0f)) && !iu2Var2.isInHorizontalChain() && !iu2Var2.isInVirtualLayout() && z3 && !iu2Var2.isInHorizontalChain())) {
                    solveHorizontalMatchConstraint(i3, iu2Var, interfaceC15818b, iu2Var2, z);
                }
                z2 = true;
            }
        }
        if (iu2Var instanceof dd7) {
            return;
        }
        if (anchor2.getDependents() != null && anchor2.hasFinalValue()) {
            Iterator<cu2> it2 = anchor2.getDependents().iterator();
            while (it2.hasNext()) {
                cu2 next2 = it2.next();
                iu2 iu2Var3 = next2.f27598d;
                int i4 = i + 1;
                boolean zCanMeasure2 = canMeasure(i4, iu2Var3);
                if (iu2Var3.isMeasureRequested() && zCanMeasure2) {
                    ju2.measure(i4, iu2Var3, interfaceC15818b, new yv0.C15817a(), yv0.C15817a.f103044k);
                }
                boolean z4 = (next2 == iu2Var3.f48360Q && (cu2Var2 = iu2Var3.f48364S.f27600f) != null && cu2Var2.hasFinalValue()) || (next2 == iu2Var3.f48364S && (cu2Var = iu2Var3.f48360Q.f27600f) != null && cu2Var.hasFinalValue());
                iu2.EnumC7619b horizontalDimensionBehaviour2 = iu2Var3.getHorizontalDimensionBehaviour();
                iu2.EnumC7619b enumC7619b2 = iu2.EnumC7619b.MATCH_CONSTRAINT;
                if (horizontalDimensionBehaviour2 != enumC7619b2 || zCanMeasure2) {
                    if (!iu2Var3.isMeasureRequested()) {
                        cu2 cu2Var7 = iu2Var3.f48360Q;
                        if (next2 == cu2Var7 && iu2Var3.f48364S.f27600f == null) {
                            int margin3 = cu2Var7.getMargin() + finalValue2;
                            iu2Var3.setFinalHorizontal(margin3, iu2Var3.getWidth() + margin3);
                            horizontalSolvingPass(i4, iu2Var3, interfaceC15818b, z);
                        } else {
                            cu2 cu2Var8 = iu2Var3.f48364S;
                            if (next2 == cu2Var8 && cu2Var7.f27600f == null) {
                                int margin4 = finalValue2 - cu2Var8.getMargin();
                                iu2Var3.setFinalHorizontal(margin4 - iu2Var3.getWidth(), margin4);
                                horizontalSolvingPass(i4, iu2Var3, interfaceC15818b, z);
                            } else if (z4 && !iu2Var3.isInHorizontalChain()) {
                                solveHorizontalCenterConstraints(i4, interfaceC15818b, iu2Var3, z);
                            }
                        }
                    }
                } else if (iu2Var3.getHorizontalDimensionBehaviour() == enumC7619b2 && iu2Var3.f48328A >= 0 && iu2Var3.f48424z >= 0 && (iu2Var3.getVisibility() == 8 || (iu2Var3.f48418w == 0 && iu2Var3.getDimensionRatio() == 0.0f))) {
                    if (!iu2Var3.isInHorizontalChain() && !iu2Var3.isInVirtualLayout() && z4 && !iu2Var3.isInHorizontalChain()) {
                        solveHorizontalMatchConstraint(i4, iu2Var, interfaceC15818b, iu2Var3, z);
                    }
                }
            }
        }
        iu2Var.markHorizontalSolvingPassDone();
    }

    /* JADX INFO: renamed from: ls */
    public static String m9078ls(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(a77.C0077a.f542d);
        }
        sb.append("+-(" + i + ") ");
        return sb.toString();
    }

    private static void solveBarrier(int i, zp0 zp0Var, yv0.InterfaceC15818b interfaceC15818b, int i2, boolean z) {
        if (zp0Var.allSolved()) {
            if (i2 == 0) {
                horizontalSolvingPass(i + 1, zp0Var, interfaceC15818b, z);
            } else {
                verticalSolvingPass(i + 1, zp0Var, interfaceC15818b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0150  */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean solveChain(p000.ju2 r20, p000.v69 r21, int r22, int r23, p000.rt1 r24, boolean r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dd4.solveChain(ju2, v69, int, int, rt1, boolean, boolean, boolean):boolean");
    }

    private static void solveHorizontalCenterConstraints(int i, yv0.InterfaceC15818b interfaceC15818b, iu2 iu2Var, boolean z) {
        float horizontalBiasPercent = iu2Var.getHorizontalBiasPercent();
        int finalValue = iu2Var.f48360Q.f27600f.getFinalValue();
        int finalValue2 = iu2Var.f48364S.f27600f.getFinalValue();
        int margin = iu2Var.f48360Q.getMargin() + finalValue;
        int margin2 = finalValue2 - iu2Var.f48364S.getMargin();
        if (finalValue == finalValue2) {
            horizontalBiasPercent = 0.5f;
        } else {
            finalValue = margin;
            finalValue2 = margin2;
        }
        int width = iu2Var.getWidth();
        int i2 = (finalValue2 - finalValue) - width;
        if (finalValue > finalValue2) {
            i2 = (finalValue - finalValue2) - width;
        }
        int i3 = ((int) (i2 > 0 ? (horizontalBiasPercent * i2) + 0.5f : horizontalBiasPercent * i2)) + finalValue;
        int i4 = i3 + width;
        if (finalValue > finalValue2) {
            i4 = i3 - width;
        }
        iu2Var.setFinalHorizontal(i3, i4);
        horizontalSolvingPass(i + 1, iu2Var, interfaceC15818b, z);
    }

    private static void solveHorizontalMatchConstraint(int i, iu2 iu2Var, yv0.InterfaceC15818b interfaceC15818b, iu2 iu2Var2, boolean z) {
        float horizontalBiasPercent = iu2Var2.getHorizontalBiasPercent();
        int finalValue = iu2Var2.f48360Q.f27600f.getFinalValue() + iu2Var2.f48360Q.getMargin();
        int finalValue2 = iu2Var2.f48364S.f27600f.getFinalValue() - iu2Var2.f48364S.getMargin();
        if (finalValue2 >= finalValue) {
            int width = iu2Var2.getWidth();
            if (iu2Var2.getVisibility() != 8) {
                int i2 = iu2Var2.f48418w;
                if (i2 == 2) {
                    width = (int) (iu2Var2.getHorizontalBiasPercent() * 0.5f * (iu2Var instanceof ju2 ? iu2Var.getWidth() : iu2Var.getParent().getWidth()));
                } else if (i2 == 0) {
                    width = finalValue2 - finalValue;
                }
                width = Math.max(iu2Var2.f48424z, width);
                int i3 = iu2Var2.f48328A;
                if (i3 > 0) {
                    width = Math.min(i3, width);
                }
            }
            int i4 = finalValue + ((int) ((horizontalBiasPercent * ((finalValue2 - finalValue) - width)) + 0.5f));
            iu2Var2.setFinalHorizontal(i4, width + i4);
            horizontalSolvingPass(i + 1, iu2Var2, interfaceC15818b, z);
        }
    }

    private static void solveVerticalCenterConstraints(int i, yv0.InterfaceC15818b interfaceC15818b, iu2 iu2Var) {
        float verticalBiasPercent = iu2Var.getVerticalBiasPercent();
        int finalValue = iu2Var.f48362R.f27600f.getFinalValue();
        int finalValue2 = iu2Var.f48366T.f27600f.getFinalValue();
        int margin = iu2Var.f48362R.getMargin() + finalValue;
        int margin2 = finalValue2 - iu2Var.f48366T.getMargin();
        if (finalValue == finalValue2) {
            verticalBiasPercent = 0.5f;
        } else {
            finalValue = margin;
            finalValue2 = margin2;
        }
        int height = iu2Var.getHeight();
        int i2 = (finalValue2 - finalValue) - height;
        if (finalValue > finalValue2) {
            i2 = (finalValue - finalValue2) - height;
        }
        int i3 = (int) (i2 > 0 ? (verticalBiasPercent * i2) + 0.5f : verticalBiasPercent * i2);
        int i4 = finalValue + i3;
        int i5 = i4 + height;
        if (finalValue > finalValue2) {
            i4 = finalValue - i3;
            i5 = i4 - height;
        }
        iu2Var.setFinalVertical(i4, i5);
        verticalSolvingPass(i + 1, iu2Var, interfaceC15818b);
    }

    private static void solveVerticalMatchConstraint(int i, iu2 iu2Var, yv0.InterfaceC15818b interfaceC15818b, iu2 iu2Var2) {
        float verticalBiasPercent = iu2Var2.getVerticalBiasPercent();
        int finalValue = iu2Var2.f48362R.f27600f.getFinalValue() + iu2Var2.f48362R.getMargin();
        int finalValue2 = iu2Var2.f48366T.f27600f.getFinalValue() - iu2Var2.f48366T.getMargin();
        if (finalValue2 >= finalValue) {
            int height = iu2Var2.getHeight();
            if (iu2Var2.getVisibility() != 8) {
                int i2 = iu2Var2.f48420x;
                if (i2 == 2) {
                    height = (int) (verticalBiasPercent * 0.5f * (iu2Var instanceof ju2 ? iu2Var.getHeight() : iu2Var.getParent().getHeight()));
                } else if (i2 == 0) {
                    height = finalValue2 - finalValue;
                }
                height = Math.max(iu2Var2.f48332C, height);
                int i3 = iu2Var2.f48334D;
                if (i3 > 0) {
                    height = Math.min(i3, height);
                }
            }
            int i4 = finalValue + ((int) ((verticalBiasPercent * ((finalValue2 - finalValue) - height)) + 0.5f));
            iu2Var2.setFinalVertical(i4, height + i4);
            verticalSolvingPass(i + 1, iu2Var2, interfaceC15818b);
        }
    }

    public static void solvingPass(ju2 ju2Var, yv0.InterfaceC15818b interfaceC15818b) {
        iu2.EnumC7619b horizontalDimensionBehaviour = ju2Var.getHorizontalDimensionBehaviour();
        iu2.EnumC7619b verticalDimensionBehaviour = ju2Var.getVerticalDimensionBehaviour();
        f29379e = 0;
        f29380f = 0;
        ju2Var.resetFinalResolution();
        ArrayList<iu2> children = ju2Var.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            children.get(i).resetFinalResolution();
        }
        boolean zIsRtl = ju2Var.isRtl();
        if (horizontalDimensionBehaviour == iu2.EnumC7619b.FIXED) {
            ju2Var.setFinalHorizontal(0, ju2Var.getWidth());
        } else {
            ju2Var.setFinalLeft(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            iu2 iu2Var = children.get(i2);
            if (iu2Var instanceof dd7) {
                dd7 dd7Var = (dd7) iu2Var;
                if (dd7Var.getOrientation() == 1) {
                    if (dd7Var.getRelativeBegin() != -1) {
                        dd7Var.setFinalValue(dd7Var.getRelativeBegin());
                    } else if (dd7Var.getRelativeEnd() != -1 && ju2Var.isResolvedHorizontally()) {
                        dd7Var.setFinalValue(ju2Var.getWidth() - dd7Var.getRelativeEnd());
                    } else if (ju2Var.isResolvedHorizontally()) {
                        dd7Var.setFinalValue((int) ((dd7Var.getRelativePercent() * ju2Var.getWidth()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((iu2Var instanceof zp0) && ((zp0) iu2Var).getOrientation() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                iu2 iu2Var2 = children.get(i3);
                if (iu2Var2 instanceof dd7) {
                    dd7 dd7Var2 = (dd7) iu2Var2;
                    if (dd7Var2.getOrientation() == 1) {
                        horizontalSolvingPass(0, dd7Var2, interfaceC15818b, zIsRtl);
                    }
                }
            }
        }
        horizontalSolvingPass(0, ju2Var, interfaceC15818b, zIsRtl);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                iu2 iu2Var3 = children.get(i4);
                if (iu2Var3 instanceof zp0) {
                    zp0 zp0Var = (zp0) iu2Var3;
                    if (zp0Var.getOrientation() == 0) {
                        solveBarrier(0, zp0Var, interfaceC15818b, 0, zIsRtl);
                    }
                }
            }
        }
        if (verticalDimensionBehaviour == iu2.EnumC7619b.FIXED) {
            ju2Var.setFinalVertical(0, ju2Var.getHeight());
        } else {
            ju2Var.setFinalTop(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            iu2 iu2Var4 = children.get(i5);
            if (iu2Var4 instanceof dd7) {
                dd7 dd7Var3 = (dd7) iu2Var4;
                if (dd7Var3.getOrientation() == 0) {
                    if (dd7Var3.getRelativeBegin() != -1) {
                        dd7Var3.setFinalValue(dd7Var3.getRelativeBegin());
                    } else if (dd7Var3.getRelativeEnd() != -1 && ju2Var.isResolvedVertically()) {
                        dd7Var3.setFinalValue(ju2Var.getHeight() - dd7Var3.getRelativeEnd());
                    } else if (ju2Var.isResolvedVertically()) {
                        dd7Var3.setFinalValue((int) ((dd7Var3.getRelativePercent() * ju2Var.getHeight()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((iu2Var4 instanceof zp0) && ((zp0) iu2Var4).getOrientation() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                iu2 iu2Var5 = children.get(i6);
                if (iu2Var5 instanceof dd7) {
                    dd7 dd7Var4 = (dd7) iu2Var5;
                    if (dd7Var4.getOrientation() == 0) {
                        verticalSolvingPass(1, dd7Var4, interfaceC15818b);
                    }
                }
            }
        }
        verticalSolvingPass(0, ju2Var, interfaceC15818b);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                iu2 iu2Var6 = children.get(i7);
                if (iu2Var6 instanceof zp0) {
                    zp0 zp0Var2 = (zp0) iu2Var6;
                    if (zp0Var2.getOrientation() == 1) {
                        solveBarrier(0, zp0Var2, interfaceC15818b, 1, zIsRtl);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            iu2 iu2Var7 = children.get(i8);
            if (iu2Var7.isMeasureRequested() && canMeasure(0, iu2Var7)) {
                ju2.measure(0, iu2Var7, interfaceC15818b, f29377c, yv0.C15817a.f103044k);
                if (!(iu2Var7 instanceof dd7)) {
                    horizontalSolvingPass(0, iu2Var7, interfaceC15818b, zIsRtl);
                    verticalSolvingPass(0, iu2Var7, interfaceC15818b);
                } else if (((dd7) iu2Var7).getOrientation() == 0) {
                    verticalSolvingPass(0, iu2Var7, interfaceC15818b);
                } else {
                    horizontalSolvingPass(0, iu2Var7, interfaceC15818b, zIsRtl);
                }
            }
        }
    }

    private static void verticalSolvingPass(int i, iu2 iu2Var, yv0.InterfaceC15818b interfaceC15818b) {
        cu2 cu2Var;
        cu2 cu2Var2;
        cu2 cu2Var3;
        cu2 cu2Var4;
        if (iu2Var.isVerticalSolvingPassDone()) {
            return;
        }
        f29380f++;
        if (!(iu2Var instanceof ju2) && iu2Var.isMeasureRequested()) {
            int i2 = i + 1;
            if (canMeasure(i2, iu2Var)) {
                ju2.measure(i2, iu2Var, interfaceC15818b, new yv0.C15817a(), yv0.C15817a.f103044k);
            }
        }
        cu2 anchor = iu2Var.getAnchor(cu2.EnumC4503b.TOP);
        cu2 anchor2 = iu2Var.getAnchor(cu2.EnumC4503b.BOTTOM);
        int finalValue = anchor.getFinalValue();
        int finalValue2 = anchor2.getFinalValue();
        if (anchor.getDependents() != null && anchor.hasFinalValue()) {
            Iterator<cu2> it = anchor.getDependents().iterator();
            while (it.hasNext()) {
                cu2 next = it.next();
                iu2 iu2Var2 = next.f27598d;
                int i3 = i + 1;
                boolean zCanMeasure = canMeasure(i3, iu2Var2);
                if (iu2Var2.isMeasureRequested() && zCanMeasure) {
                    ju2.measure(i3, iu2Var2, interfaceC15818b, new yv0.C15817a(), yv0.C15817a.f103044k);
                }
                boolean z = (next == iu2Var2.f48362R && (cu2Var4 = iu2Var2.f48366T.f27600f) != null && cu2Var4.hasFinalValue()) || (next == iu2Var2.f48366T && (cu2Var3 = iu2Var2.f48362R.f27600f) != null && cu2Var3.hasFinalValue());
                iu2.EnumC7619b verticalDimensionBehaviour = iu2Var2.getVerticalDimensionBehaviour();
                iu2.EnumC7619b enumC7619b = iu2.EnumC7619b.MATCH_CONSTRAINT;
                if (verticalDimensionBehaviour != enumC7619b || zCanMeasure) {
                    if (!iu2Var2.isMeasureRequested()) {
                        cu2 cu2Var5 = iu2Var2.f48362R;
                        if (next == cu2Var5 && iu2Var2.f48366T.f27600f == null) {
                            int margin = cu2Var5.getMargin() + finalValue;
                            iu2Var2.setFinalVertical(margin, iu2Var2.getHeight() + margin);
                            verticalSolvingPass(i3, iu2Var2, interfaceC15818b);
                        } else {
                            cu2 cu2Var6 = iu2Var2.f48366T;
                            if (next == cu2Var6 && cu2Var5.f27600f == null) {
                                int margin2 = finalValue - cu2Var6.getMargin();
                                iu2Var2.setFinalVertical(margin2 - iu2Var2.getHeight(), margin2);
                                verticalSolvingPass(i3, iu2Var2, interfaceC15818b);
                            } else if (z && !iu2Var2.isInVerticalChain()) {
                                solveVerticalCenterConstraints(i3, interfaceC15818b, iu2Var2);
                            }
                        }
                    }
                } else if (iu2Var2.getVerticalDimensionBehaviour() == enumC7619b && iu2Var2.f48334D >= 0 && iu2Var2.f48332C >= 0 && (iu2Var2.getVisibility() == 8 || (iu2Var2.f48420x == 0 && iu2Var2.getDimensionRatio() == 0.0f))) {
                    if (!iu2Var2.isInVerticalChain() && !iu2Var2.isInVirtualLayout() && z && !iu2Var2.isInVerticalChain()) {
                        solveVerticalMatchConstraint(i3, iu2Var, interfaceC15818b, iu2Var2);
                    }
                }
            }
        }
        if (iu2Var instanceof dd7) {
            return;
        }
        if (anchor2.getDependents() != null && anchor2.hasFinalValue()) {
            Iterator<cu2> it2 = anchor2.getDependents().iterator();
            while (it2.hasNext()) {
                cu2 next2 = it2.next();
                iu2 iu2Var3 = next2.f27598d;
                int i4 = i + 1;
                boolean zCanMeasure2 = canMeasure(i4, iu2Var3);
                if (iu2Var3.isMeasureRequested() && zCanMeasure2) {
                    ju2.measure(i4, iu2Var3, interfaceC15818b, new yv0.C15817a(), yv0.C15817a.f103044k);
                }
                boolean z2 = (next2 == iu2Var3.f48362R && (cu2Var2 = iu2Var3.f48366T.f27600f) != null && cu2Var2.hasFinalValue()) || (next2 == iu2Var3.f48366T && (cu2Var = iu2Var3.f48362R.f27600f) != null && cu2Var.hasFinalValue());
                iu2.EnumC7619b verticalDimensionBehaviour2 = iu2Var3.getVerticalDimensionBehaviour();
                iu2.EnumC7619b enumC7619b2 = iu2.EnumC7619b.MATCH_CONSTRAINT;
                if (verticalDimensionBehaviour2 != enumC7619b2 || zCanMeasure2) {
                    if (!iu2Var3.isMeasureRequested()) {
                        cu2 cu2Var7 = iu2Var3.f48362R;
                        if (next2 == cu2Var7 && iu2Var3.f48366T.f27600f == null) {
                            int margin3 = cu2Var7.getMargin() + finalValue2;
                            iu2Var3.setFinalVertical(margin3, iu2Var3.getHeight() + margin3);
                            verticalSolvingPass(i4, iu2Var3, interfaceC15818b);
                        } else {
                            cu2 cu2Var8 = iu2Var3.f48366T;
                            if (next2 == cu2Var8 && cu2Var7.f27600f == null) {
                                int margin4 = finalValue2 - cu2Var8.getMargin();
                                iu2Var3.setFinalVertical(margin4 - iu2Var3.getHeight(), margin4);
                                verticalSolvingPass(i4, iu2Var3, interfaceC15818b);
                            } else if (z2 && !iu2Var3.isInVerticalChain()) {
                                solveVerticalCenterConstraints(i4, interfaceC15818b, iu2Var3);
                            }
                        }
                    }
                } else if (iu2Var3.getVerticalDimensionBehaviour() == enumC7619b2 && iu2Var3.f48334D >= 0 && iu2Var3.f48332C >= 0 && (iu2Var3.getVisibility() == 8 || (iu2Var3.f48420x == 0 && iu2Var3.getDimensionRatio() == 0.0f))) {
                    if (!iu2Var3.isInVerticalChain() && !iu2Var3.isInVirtualLayout() && z2 && !iu2Var3.isInVerticalChain()) {
                        solveVerticalMatchConstraint(i4, iu2Var, interfaceC15818b, iu2Var3);
                    }
                }
            }
        }
        cu2 anchor3 = iu2Var.getAnchor(cu2.EnumC4503b.BASELINE);
        if (anchor3.getDependents() != null && anchor3.hasFinalValue()) {
            int finalValue3 = anchor3.getFinalValue();
            for (cu2 cu2Var9 : anchor3.getDependents()) {
                iu2 iu2Var4 = cu2Var9.f27598d;
                int i5 = i + 1;
                boolean zCanMeasure3 = canMeasure(i5, iu2Var4);
                if (iu2Var4.isMeasureRequested() && zCanMeasure3) {
                    ju2.measure(i5, iu2Var4, interfaceC15818b, new yv0.C15817a(), yv0.C15817a.f103044k);
                }
                if (iu2Var4.getVerticalDimensionBehaviour() != iu2.EnumC7619b.MATCH_CONSTRAINT || zCanMeasure3) {
                    if (!iu2Var4.isMeasureRequested() && cu2Var9 == iu2Var4.f48368U) {
                        iu2Var4.setFinalBaseline(cu2Var9.getMargin() + finalValue3);
                        verticalSolvingPass(i5, iu2Var4, interfaceC15818b);
                    }
                }
            }
        }
        iu2Var.markVerticalSolvingPassDone();
    }
}
