package p000;

import p000.ip6;

/* JADX INFO: loaded from: classes.dex */
public final class ko6 {
    @yfb
    @th5
    /* JADX INFO: renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final xn6 m30726FontF3nL8kk(int i, @yfb jp6 jp6Var, int i2, int i3, @yfb ip6.C7556e c7556e) {
        return new i6e(i, jp6Var, i2, c7556e, i3, null);
    }

    /* JADX INFO: renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ xn6 m30727FontF3nL8kk$default(int i, jp6 jp6Var, int i2, int i3, ip6.C7556e c7556e, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            jp6Var = jp6.f51403b.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = fp6.f37355b.m29582getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = oo6.f68233b.m31524getBlockingPKNRLFQ();
        }
        if ((i4 & 16) != 0) {
            c7556e = ip6.f47830a.m30313Settings6EWAqTQ(jp6Var, i2, new ip6.InterfaceC7552a[0]);
        }
        return m30726FontF3nL8kk(i, jp6Var, i2, i3, c7556e);
    }

    @f0g
    @q64(level = u64.f86867c, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @i2e(expression = "Font(resId, weight, style)", imports = {}))
    /* JADX INFO: renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ xn6 m30728FontRetOiIg(int i, jp6 jp6Var, int i2) {
        return new i6e(i, jp6Var, i2, null, oo6.f68233b.m31524getBlockingPKNRLFQ(), 8, null);
    }

    /* JADX INFO: renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ xn6 m30729FontRetOiIg$default(int i, jp6 jp6Var, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            jp6Var = jp6.f51403b.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = fp6.f37355b.m29582getNormal_LCdwA();
        }
        return m30728FontRetOiIg(i, jp6Var, i2);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final xn6 m30730FontYpTlLL0(int i, @yfb jp6 jp6Var, int i2, int i3) {
        return new i6e(i, jp6Var, i2, new ip6.C7556e(new ip6.InterfaceC7552a[0]), i3, null);
    }

    /* JADX INFO: renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ xn6 m30731FontYpTlLL0$default(int i, jp6 jp6Var, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            jp6Var = jp6.f51403b.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = fp6.f37355b.m29582getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = oo6.f68233b.m31524getBlockingPKNRLFQ();
        }
        return m30730FontYpTlLL0(i, jp6Var, i2, i3);
    }

    @f0g
    @yfb
    public static final do6 toFontFamily(@yfb xn6 xn6Var) {
        return eo6.FontFamily(xn6Var);
    }
}
