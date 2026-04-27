package p000;

import java.util.List;
import java.util.Locale;
import p000.C9041lz;
import p000.do6;
import p000.wqg;

/* JADX INFO: renamed from: au */
/* JADX INFO: loaded from: classes.dex */
public final class C1608au {
    @yfb
    public static final fdc ActualParagraphIntrinsics(@yfb String str, @yfb yvg yvgVar, @yfb List<C9041lz.c<swf>> list, @yfb List<C9041lz.c<ewc>> list2, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b) {
        return new C16248zt(str, yvgVar, list, list2, interfaceC4891b, c64Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(yvg yvgVar) {
        mxc paragraphStyle;
        zxc platformStyle = yvgVar.getPlatformStyle();
        return !(((platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : gz4.m29879boximpl(paragraphStyle.m31090getEmojiSupportMatch_3YsG6Y())) == null ? false : gz4.m29882equalsimpl0(r1.m29885unboximpl(), gz4.f41853b.m29888getNone_3YsG6Y()));
    }

    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    public static final int m27881resolveTextDirectionHeuristicsHklW4sA(int i, @gib ye9 ye9Var) {
        Locale platformLocale;
        wqg.C14751a c14751a = wqg.f95173b;
        if (wqg.m33087equalsimpl0(i, c14751a.m33092getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (!wqg.m33087equalsimpl0(i, c14751a.m33093getContentOrRtls_7Xco())) {
            if (wqg.m33087equalsimpl0(i, c14751a.m33094getLtrs_7Xco())) {
                return 0;
            }
            if (wqg.m33087equalsimpl0(i, c14751a.m33095getRtls_7Xco())) {
                return 1;
            }
            if (!(wqg.m33087equalsimpl0(i, c14751a.m33091getContents_7Xco()) ? true : wqg.m33087equalsimpl0(i, c14751a.m33096getUnspecifieds_7Xco()))) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            if (ye9Var == null || (platformLocale = ye9Var.get(0).getPlatformLocale()) == null) {
                platformLocale = Locale.getDefault();
            }
            int layoutDirectionFromLocale = nwg.getLayoutDirectionFromLocale(platformLocale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                return 2;
            }
        }
        return 3;
    }

    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m27882resolveTextDirectionHeuristicsHklW4sA$default(int i, ye9 ye9Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            ye9Var = null;
        }
        return m27881resolveTextDirectionHeuristicsHklW4sA(i, ye9Var);
    }
}
