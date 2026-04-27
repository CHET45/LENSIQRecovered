package p000;

import java.util.List;
import p000.C9041lz;
import p000.do6;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,349:1\n26#2:350\n*S KotlinDebug\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n*L\n304#1:350\n*E\n"})
public final class uqg {
    public static final int ceilToIntPx(float f) {
        return Math.round((float) Math.ceil(f));
    }

    @yfb
    /* JADX INFO: renamed from: updateTextDelegate-rm0N8CA, reason: not valid java name */
    public static final sqg m32655updateTextDelegaterm0N8CA(@yfb sqg sqgVar, @yfb C9041lz c9041lz, @yfb yvg yvgVar, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b, boolean z, int i, int i2, int i3, @yfb List<C9041lz.c<ewc>> list) {
        if (!md8.areEqual(sqgVar.getText(), c9041lz) || !md8.areEqual(sqgVar.getStyle(), yvgVar) || sqgVar.getSoftWrap() != z) {
            return new sqg(c9041lz, yvgVar, i2, i3, z, i, c64Var, interfaceC4891b, list, null);
        }
        if (!bvg.m28164equalsimpl0(sqgVar.m32317getOverflowgIe3tQ8(), i)) {
            return new sqg(c9041lz, yvgVar, i2, i3, z, i, c64Var, interfaceC4891b, list, null);
        }
        if (sqgVar.getMaxLines() != i2) {
            return new sqg(c9041lz, yvgVar, i2, i3, z, i, c64Var, interfaceC4891b, list, null);
        }
        if (sqgVar.getMinLines() == i3 && md8.areEqual(sqgVar.getDensity(), c64Var)) {
            if (md8.areEqual(sqgVar.getPlaceholders(), list) && sqgVar.getFontFamilyResolver() == interfaceC4891b) {
                return sqgVar;
            }
            return new sqg(c9041lz, yvgVar, i2, i3, z, i, c64Var, interfaceC4891b, list, null);
        }
        return new sqg(c9041lz, yvgVar, i2, i3, z, i, c64Var, interfaceC4891b, list, null);
    }
}
