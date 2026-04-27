package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class qt1 {

    /* JADX INFO: renamed from: a */
    public static final boolean f75575a = false;

    /* JADX INFO: renamed from: b */
    public static final boolean f75576b = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[PHI: r8 r16
  0x0033: PHI (r8v39 boolean) = (r8v1 boolean), (r8v41 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r16v6 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[PHI: r8 r16
  0x0035: PHI (r8v3 boolean) = (r8v1 boolean), (r8v41 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016a  */
    /* JADX WARN: Type inference failed for: r38v0, types: [v69] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [dvf] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [iu2] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m20652a(p000.ju2 r37, p000.v69 r38, int r39, int r40, p000.rt1 r41) {
        /*
            Method dump skipped, instruction units count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qt1.m20652a(ju2, v69, int, int, rt1):void");
    }

    public static void applyChainConstraints(ju2 ju2Var, v69 v69Var, ArrayList<iu2> arrayList, int i) {
        int i2;
        rt1[] rt1VarArr;
        int i3;
        if (i == 0) {
            i2 = ju2Var.f51848M1;
            rt1VarArr = ju2Var.f51851P1;
            i3 = 0;
        } else {
            i2 = ju2Var.f51849N1;
            rt1VarArr = ju2Var.f51850O1;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            rt1 rt1Var = rt1VarArr[i4];
            rt1Var.define();
            if (arrayList == null || arrayList.contains(rt1Var.f79426a)) {
                m20652a(ju2Var, v69Var, i, i3, rt1Var);
            }
        }
    }
}
