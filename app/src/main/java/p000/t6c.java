package p000;

import p000.iu2;

/* JADX INFO: loaded from: classes.dex */
public class t6c {

    /* JADX INFO: renamed from: a */
    public static final int f83808a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f83809b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f83810c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f83811d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f83812e = 8;

    /* JADX INFO: renamed from: f */
    public static final int f83813f = 16;

    /* JADX INFO: renamed from: g */
    public static final int f83814g = 32;

    /* JADX INFO: renamed from: h */
    public static final int f83815h = 64;

    /* JADX INFO: renamed from: i */
    public static final int f83816i = 128;

    /* JADX INFO: renamed from: j */
    public static final int f83817j = 256;

    /* JADX INFO: renamed from: k */
    public static final int f83818k = 512;

    /* JADX INFO: renamed from: l */
    public static final int f83819l = 1024;

    /* JADX INFO: renamed from: m */
    public static final int f83820m = 257;

    /* JADX INFO: renamed from: n */
    public static boolean[] f83821n = new boolean[3];

    /* JADX INFO: renamed from: o */
    public static final int f83822o = 0;

    /* JADX INFO: renamed from: p */
    public static final int f83823p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f83824q = 2;

    /* JADX INFO: renamed from: a */
    public static void m22394a(ju2 ju2Var, v69 v69Var, iu2 iu2Var) {
        iu2Var.f48412t = -1;
        iu2Var.f48414u = -1;
        iu2.EnumC7619b enumC7619b = ju2Var.f48377b0[0];
        iu2.EnumC7619b enumC7619b2 = iu2.EnumC7619b.WRAP_CONTENT;
        if (enumC7619b != enumC7619b2 && iu2Var.f48377b0[0] == iu2.EnumC7619b.MATCH_PARENT) {
            int i = iu2Var.f48360Q.f27601g;
            int width = ju2Var.getWidth() - iu2Var.f48364S.f27601g;
            cu2 cu2Var = iu2Var.f48360Q;
            cu2Var.f27603i = v69Var.createObjectVariable(cu2Var);
            cu2 cu2Var2 = iu2Var.f48364S;
            cu2Var2.f27603i = v69Var.createObjectVariable(cu2Var2);
            v69Var.addEquality(iu2Var.f48360Q.f27603i, i);
            v69Var.addEquality(iu2Var.f48364S.f27603i, width);
            iu2Var.f48412t = 2;
            iu2Var.setHorizontalDimension(i, width);
        }
        if (ju2Var.f48377b0[1] == enumC7619b2 || iu2Var.f48377b0[1] != iu2.EnumC7619b.MATCH_PARENT) {
            return;
        }
        int i2 = iu2Var.f48362R.f27601g;
        int height = ju2Var.getHeight() - iu2Var.f48366T.f27601g;
        cu2 cu2Var3 = iu2Var.f48362R;
        cu2Var3.f27603i = v69Var.createObjectVariable(cu2Var3);
        cu2 cu2Var4 = iu2Var.f48366T;
        cu2Var4.f27603i = v69Var.createObjectVariable(cu2Var4);
        v69Var.addEquality(iu2Var.f48362R.f27603i, i2);
        v69Var.addEquality(iu2Var.f48366T.f27603i, height);
        if (iu2Var.f48401n0 > 0 || iu2Var.getVisibility() == 8) {
            cu2 cu2Var5 = iu2Var.f48368U;
            cu2Var5.f27603i = v69Var.createObjectVariable(cu2Var5);
            v69Var.addEquality(iu2Var.f48368U.f27603i, iu2Var.f48401n0 + i2);
        }
        iu2Var.f48414u = 2;
        iu2Var.setVerticalDimension(i2, height);
    }

    public static final boolean enabled(int i, int i2) {
        return (i & i2) == i2;
    }
}
