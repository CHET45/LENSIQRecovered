package p000;

import p000.do6;

/* JADX INFO: loaded from: classes.dex */
public final class srg {

    /* JADX INFO: renamed from: a */
    public static final int f82722a = 10;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f82723b = h9g.repeat("H", 10);

    public static final long computeSizeForDefaultText(@yfb yvg yvgVar, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b, @yfb String str, int i) {
        bdc bdcVarM29987ParagraphUdtVg6A = hdc.m29987ParagraphUdtVg6A(str, yvgVar, nu2.Constraints$default(0, 0, 0, 0, 15, null), c64Var, interfaceC4891b, (64 & 32) != 0 ? l82.emptyList() : l82.emptyList(), (64 & 64) != 0 ? l82.emptyList() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i, (64 & 256) != 0 ? false : false);
        return s78.IntSize(uqg.ceilToIntPx(bdcVarM29987ParagraphUdtVg6A.getMinIntrinsicWidth()), uqg.ceilToIntPx(bdcVarM29987ParagraphUdtVg6A.getHeight()));
    }

    public static /* synthetic */ long computeSizeForDefaultText$default(yvg yvgVar, c64 c64Var, do6.InterfaceC4891b interfaceC4891b, String str, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = f82723b;
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return computeSizeForDefaultText(yvgVar, c64Var, interfaceC4891b, str, i);
    }

    @yfb
    public static final String getEmptyTextReplacement() {
        return f82723b;
    }
}
