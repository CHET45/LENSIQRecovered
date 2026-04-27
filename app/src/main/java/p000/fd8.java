package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,722:1\n427#2,5:723\n432#2,7:732\n440#2:740\n441#2,2:742\n452#2,5:744\n457#2,17:753\n476#2,6:771\n484#2,17:778\n452#2,5:795\n457#2,17:804\n476#2,6:822\n484#2,17:829\n427#2,5:846\n432#2,7:855\n440#2:863\n441#2,2:865\n427#2,5:867\n432#2,7:876\n440#2:884\n441#2,2:886\n452#2,5:888\n457#2,17:897\n476#2,6:915\n484#2,17:922\n452#2,5:939\n457#2,17:948\n476#2,6:966\n484#2,17:973\n427#2,5:990\n432#2,7:999\n440#2:1007\n441#2,2:1009\n33#3,4:728\n38#3:741\n33#3,4:749\n38#3:770\n33#3,4:800\n38#3:821\n33#3,4:851\n38#3:864\n33#3,4:872\n38#3:885\n33#3,4:893\n38#3:914\n33#3,4:944\n38#3:965\n33#3,4:995\n38#3:1008\n26#4:739\n26#4:777\n26#4:828\n26#4:862\n26#4:883\n26#4:921\n26#4:972\n26#4:1006\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n*L\n324#1:723,5\n324#1:732,7\n324#1:740\n324#1:742,2\n336#1:744,5\n336#1:753,17\n336#1:771,6\n336#1:778,17\n349#1:795,5\n349#1:804,17\n349#1:822,6\n349#1:829,17\n362#1:846,5\n362#1:855,7\n362#1:863\n362#1:865,2\n374#1:867,5\n374#1:876,7\n374#1:884\n374#1:886,2\n386#1:888,5\n386#1:897,17\n386#1:915,6\n386#1:922,17\n399#1:939,5\n399#1:948,17\n399#1:966,6\n399#1:973,17\n412#1:990,5\n412#1:999,7\n412#1:1007\n412#1:1009,2\n324#1:728,4\n324#1:741\n336#1:749,4\n336#1:770\n349#1:800,4\n349#1:821\n362#1:851,4\n362#1:864\n374#1:872,4\n374#1:885\n386#1:893,4\n386#1:914\n399#1:944,4\n399#1:965\n412#1:995,4\n412#1:1008\n324#1:739\n336#1:777\n349#1:828\n362#1:862\n374#1:883\n386#1:921\n399#1:972\n412#1:1006\n*E\n"})
@e0g(parameters = 1)
public final class fd8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final fd8 f36188a = new fd8();

    /* JADX INFO: renamed from: b */
    public static final int f36189b = 0;

    private fd8() {
    }

    public final int HorizontalMaxHeight(@yfb List<? extends ed8> list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            ed8 ed8Var = list.get(i3);
            float weight = cce.getWeight(cce.getRowColumnParentData(ed8Var));
            if (weight == 0.0f) {
                int iMin2 = Math.min(ed8Var.maxIntrinsicWidth(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ed8Var.maxIntrinsicHeight(iMin2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ed8 ed8Var2 = list.get(i4);
            float weight2 = cce.getWeight(cce.getRowColumnParentData(ed8Var2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, ed8Var2.maxIntrinsicHeight(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int HorizontalMaxWidth(@yfb List<? extends ed8> list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            ed8 ed8Var = list.get(i4);
            float weight = cce.getWeight(cce.getRowColumnParentData(ed8Var));
            int iMaxIntrinsicWidth = ed8Var.maxIntrinsicWidth(i);
            if (weight == 0.0f) {
                i3 += iMaxIntrinsicWidth;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iMaxIntrinsicWidth / weight));
            }
        }
        return Math.round(iMax * f) + i3 + ((list.size() - 1) * i2);
    }

    public final int HorizontalMinHeight(@yfb List<? extends ed8> list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            ed8 ed8Var = list.get(i3);
            float weight = cce.getWeight(cce.getRowColumnParentData(ed8Var));
            if (weight == 0.0f) {
                int iMin2 = Math.min(ed8Var.maxIntrinsicWidth(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ed8Var.minIntrinsicHeight(iMin2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ed8 ed8Var2 = list.get(i4);
            float weight2 = cce.getWeight(cce.getRowColumnParentData(ed8Var2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, ed8Var2.minIntrinsicHeight(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int HorizontalMinWidth(@yfb List<? extends ed8> list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            ed8 ed8Var = list.get(i4);
            float weight = cce.getWeight(cce.getRowColumnParentData(ed8Var));
            int iMinIntrinsicWidth = ed8Var.minIntrinsicWidth(i);
            if (weight == 0.0f) {
                i3 += iMinIntrinsicWidth;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iMinIntrinsicWidth / weight));
            }
        }
        return Math.round(iMax * f) + i3 + ((list.size() - 1) * i2);
    }

    public final int VerticalMaxHeight(@yfb List<? extends ed8> list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            ed8 ed8Var = list.get(i4);
            float weight = cce.getWeight(cce.getRowColumnParentData(ed8Var));
            int iMaxIntrinsicHeight = ed8Var.maxIntrinsicHeight(i);
            if (weight == 0.0f) {
                i3 += iMaxIntrinsicHeight;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iMaxIntrinsicHeight / weight));
            }
        }
        return Math.round(iMax * f) + i3 + ((list.size() - 1) * i2);
    }

    public final int VerticalMaxWidth(@yfb List<? extends ed8> list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            ed8 ed8Var = list.get(i3);
            float weight = cce.getWeight(cce.getRowColumnParentData(ed8Var));
            if (weight == 0.0f) {
                int iMin2 = Math.min(ed8Var.maxIntrinsicHeight(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ed8Var.maxIntrinsicWidth(iMin2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ed8 ed8Var2 = list.get(i4);
            float weight2 = cce.getWeight(cce.getRowColumnParentData(ed8Var2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, ed8Var2.maxIntrinsicWidth(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int VerticalMinHeight(@yfb List<? extends ed8> list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            ed8 ed8Var = list.get(i4);
            float weight = cce.getWeight(cce.getRowColumnParentData(ed8Var));
            int iMinIntrinsicHeight = ed8Var.minIntrinsicHeight(i);
            if (weight == 0.0f) {
                i3 += iMinIntrinsicHeight;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iMinIntrinsicHeight / weight));
            }
        }
        return Math.round(iMax * f) + i3 + ((list.size() - 1) * i2);
    }

    public final int VerticalMinWidth(@yfb List<? extends ed8> list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            ed8 ed8Var = list.get(i3);
            float weight = cce.getWeight(cce.getRowColumnParentData(ed8Var));
            if (weight == 0.0f) {
                int iMin2 = Math.min(ed8Var.maxIntrinsicHeight(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ed8Var.minIntrinsicWidth(iMin2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ed8 ed8Var2 = list.get(i4);
            float weight2 = cce.getWeight(cce.getRowColumnParentData(ed8Var2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, ed8Var2.minIntrinsicWidth(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
