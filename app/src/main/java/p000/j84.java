package p000;

import p000.ip6;

/* JADX INFO: loaded from: classes.dex */
@xn8(name = "DeviceFontFamilyNameFontKt")
public final class j84 {
    @yfb
    /* JADX INFO: renamed from: Font-vxs03AY, reason: not valid java name */
    public static final xn6 m30479Fontvxs03AY(@yfb String str, @yfb jp6 jp6Var, int i, @yfb ip6.C7556e c7556e) {
        return new i84(str, jp6Var, i, c7556e, null);
    }

    /* JADX INFO: renamed from: Font-vxs03AY$default, reason: not valid java name */
    public static /* synthetic */ xn6 m30480Fontvxs03AY$default(String str, jp6 jp6Var, int i, ip6.C7556e c7556e, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jp6Var = jp6.f51403b.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = fp6.f37355b.m29582getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            c7556e = new ip6.C7556e(new ip6.InterfaceC7552a[0]);
        }
        return m30479Fontvxs03AY(str, jp6Var, i, c7556e);
    }
}
