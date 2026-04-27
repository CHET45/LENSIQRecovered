package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1#1,1145:1\n1001#1,16:1146\n1001#1,16:1162\n1001#1,16:1178\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n936#1:1146,16\n957#1:1162,16\n991#1:1178,16\n*E\n"})
public final class x2b {
    private static final <T> int fastBinarySearch(List<? extends T> list, qy6<? super T, Integer> qy6Var) {
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int iIntValue = qy6Var.invoke(list.get(i2)).intValue();
            if (iIntValue < 0) {
                i = i2 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final int findParagraphByIndex(@yfb List<ddc> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ddc ddcVar = list.get(i3);
            byte b = ddcVar.getStartIndex() > i ? (byte) 1 : ddcVar.getEndIndex() <= i ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int findParagraphByLineIndex(@yfb List<ddc> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ddc ddcVar = list.get(i3);
            byte b = ddcVar.getStartLineIndex() > i ? (byte) 1 : ddcVar.getEndLineIndex() <= i ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int findParagraphByY(@yfb List<ddc> list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((ddc) v82.last((List) list)).getBottom()) {
            return l82.getLastIndex(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            ddc ddcVar = list.get(i2);
            byte b = ddcVar.getTop() > f ? (byte) 1 : ddcVar.getBottom() <= f ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m33173findParagraphsByRangeSbBc2M(@yfb List<ddc> list, long j, @yfb qy6<? super ddc, bth> qy6Var) {
        int size = list.size();
        for (int iFindParagraphByIndex = findParagraphByIndex(list, jvg.m30591getMinimpl(j)); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            ddc ddcVar = list.get(iFindParagraphByIndex);
            if (ddcVar.getStartIndex() >= jvg.m30590getMaximpl(j)) {
                return;
            }
            if (ddcVar.getStartIndex() != ddcVar.getEndIndex()) {
                qy6Var.invoke(ddcVar);
            }
        }
    }
}
