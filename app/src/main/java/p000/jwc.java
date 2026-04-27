package p000;

import android.text.Spannable;
import java.util.List;
import p000.C9041lz;
import p000.lwg;
import p000.nwc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n33#2,6:94\n13579#3,2:100\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,6\n48#1:100,2\n*E\n"})
public final class jwc {
    /* JADX INFO: renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m30599getSpanUnitR2X_6o(long j) {
        long jM30612getTypeUIouoOA = jwg.m30612getTypeUIouoOA(j);
        lwg.C9014a c9014a = lwg.f59101b;
        if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30923getSpUIouoOA())) {
            return 0;
        }
        return lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30922getEmUIouoOA()) ? 1 : 2;
    }

    /* JADX INFO: renamed from: getSpanUnit--R2X_6o$annotations, reason: not valid java name */
    private static /* synthetic */ void m30600getSpanUnitR2X_6o$annotations(long j) {
    }

    /* JADX INFO: renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m30601getSpanVerticalAligndo9XGg(int i) {
        nwc.C10093a c10093a = nwc.f65903b;
        if (nwc.m31271equalsimpl0(i, c10093a.m31275getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (nwc.m31271equalsimpl0(i, c10093a.m31281getTopJ6kI3mc())) {
            return 1;
        }
        if (nwc.m31271equalsimpl0(i, c10093a.m31276getBottomJ6kI3mc())) {
            return 2;
        }
        if (nwc.m31271equalsimpl0(i, c10093a.m31277getCenterJ6kI3mc())) {
            return 3;
        }
        if (nwc.m31271equalsimpl0(i, c10093a.m31280getTextTopJ6kI3mc())) {
            return 4;
        }
        if (nwc.m31271equalsimpl0(i, c10093a.m31278getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (nwc.m31271equalsimpl0(i, c10093a.m31279getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    /* JADX INFO: renamed from: getSpanVerticalAlign-do9X-Gg$annotations, reason: not valid java name */
    private static /* synthetic */ void m30602getSpanVerticalAligndo9XGg$annotations(int i) {
    }

    private static final void setPlaceholder(Spannable spannable, ewc ewcVar, int i, int i2, c64 c64Var) {
        for (Object obj : spannable.getSpans(i, i2, fz4.class)) {
            spannable.removeSpan((fz4) obj);
        }
        zwf.setSpan(spannable, new lwc(jwg.m30613getValueimpl(ewcVar.m28874getWidthXSAIIZE()), m30599getSpanUnitR2X_6o(ewcVar.m28874getWidthXSAIIZE()), jwg.m30613getValueimpl(ewcVar.m28872getHeightXSAIIZE()), m30599getSpanUnitR2X_6o(ewcVar.m28872getHeightXSAIIZE()), c64Var.getFontScale() * c64Var.getDensity(), m30601getSpanVerticalAligndo9XGg(ewcVar.m28873getPlaceholderVerticalAlignJ6kI3mc())), i, i2);
    }

    public static final void setPlaceholders(@yfb Spannable spannable, @yfb List<C9041lz.c<ewc>> list, @yfb c64 c64Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C9041lz.c<ewc> cVar = list.get(i);
            setPlaceholder(spannable, cVar.component1(), cVar.component2(), cVar.component3(), c64Var);
        }
    }
}
