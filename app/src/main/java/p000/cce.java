package p000;

import androidx.compose.foundation.layout.AbstractC0635k;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,722:1\n33#2,4:723\n38#2:728\n33#2,6:730\n33#2,4:737\n38#2:742\n26#3:727\n26#3:729\n26#3:736\n26#3:741\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n*L\n431#1:723,4\n431#1:728\n456#1:730,6\n484#1:737,4\n484#1:742\n438#1:727\n441#1:729\n481#1:736\n492#1:741\n*E\n"})
public final class cce {
    @gib
    public static final AbstractC0635k getCrossAxisAlignment(@gib fce fceVar) {
        if (fceVar != null) {
            return fceVar.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean getFill(@gib fce fceVar) {
        if (fceVar != null) {
            return fceVar.getFill();
        }
        return true;
    }

    @gib
    public static final fce getRowColumnParentData(@yfb ed8 ed8Var) {
        Object parentData = ed8Var.getParentData();
        if (parentData instanceof fce) {
            return (fce) parentData;
        }
        return null;
    }

    public static final float getWeight(@gib fce fceVar) {
        if (fceVar != null) {
            return fceVar.getWeight();
        }
        return 0.0f;
    }

    private static final int intrinsicCrossAxisSize(List<? extends ed8> list, gz6<? super ed8, ? super Integer, Integer> gz6Var, gz6<? super ed8, ? super Integer, Integer> gz6Var2, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            ed8 ed8Var = list.get(i3);
            float weight = getWeight(getRowColumnParentData(ed8Var));
            if (weight == 0.0f) {
                int iMin2 = Math.min(gz6Var.invoke(ed8Var, Integer.MAX_VALUE).intValue(), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, gz6Var2.invoke(ed8Var, Integer.valueOf(iMin2)).intValue());
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ed8 ed8Var2 = list.get(i4);
            float weight2 = getWeight(getRowColumnParentData(ed8Var2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, gz6Var2.invoke(ed8Var2, Integer.valueOf(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE)).intValue());
            }
        }
        return iMax;
    }

    private static final int intrinsicMainAxisSize(List<? extends ed8> list, gz6<? super ed8, ? super Integer, Integer> gz6Var, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            ed8 ed8Var = list.get(i4);
            float weight = getWeight(getRowColumnParentData(ed8Var));
            int iIntValue = gz6Var.invoke(ed8Var, Integer.valueOf(i)).intValue();
            if (weight == 0.0f) {
                i3 += iIntValue;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iIntValue / weight));
            }
        }
        return Math.round(iMax * f) + i3 + ((list.size() - 1) * i2);
    }

    public static final boolean isRelative(@gib fce fceVar) {
        AbstractC0635k crossAxisAlignment = getCrossAxisAlignment(fceVar);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    @gib
    public static final fce getRowColumnParentData(@yfb AbstractC0767t abstractC0767t) {
        Object parentData = abstractC0767t.getParentData();
        if (parentData instanceof fce) {
            return (fce) parentData;
        }
        return null;
    }
}
