package p000;

import java.util.Comparator;
import p000.gwe;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
public final class n3b {
    /* JADX INFO: renamed from: appendSelectableInfo-Parwq6A, reason: not valid java name */
    public static final void m31120appendSelectableInfoParwq6A(@yfb wwe wweVar, @yfb hug hugVar, long j, long j2, long j3) {
        pd4 pd4VarAppendSelectableInfo_Parwq6A$otherDirection;
        pd4 pd4Var;
        pd4 pd4Var2;
        pd4 pd4Var3;
        pd4 pd4Var4;
        int previousAdjustedOffset;
        int previousAdjustedOffset2;
        gwe.C6633a start;
        gwe.C6633a end;
        rud rudVar = new rud(0.0f, 0.0f, r78.m32087getWidthimpl(hugVar.m30130getSizeYbymL2g()), r78.m32086getHeightimpl(hugVar.m30130getSizeYbymL2g()));
        pd4 pd4VarM31122getXDirection3MmeM6k = m31122getXDirection3MmeM6k(j, rudVar);
        pd4 pd4VarM31123getYDirection3MmeM6k = m31123getYDirection3MmeM6k(j, rudVar);
        if (wweVar.isStartHandle()) {
            gwe previousSelection = wweVar.getPreviousSelection();
            pd4VarAppendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(pd4VarM31122getXDirection3MmeM6k, pd4VarM31123getYDirection3MmeM6k, wweVar, j3, previousSelection != null ? previousSelection.getEnd() : null);
            pd4Var3 = pd4VarAppendSelectableInfo_Parwq6A$otherDirection;
            pd4Var4 = pd4Var3;
            pd4Var = pd4VarM31122getXDirection3MmeM6k;
            pd4Var2 = pd4VarM31123getYDirection3MmeM6k;
        } else {
            gwe previousSelection2 = wweVar.getPreviousSelection();
            pd4VarAppendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(pd4VarM31122getXDirection3MmeM6k, pd4VarM31123getYDirection3MmeM6k, wweVar, j3, previousSelection2 != null ? previousSelection2.getStart() : null);
            pd4Var = pd4VarAppendSelectableInfo_Parwq6A$otherDirection;
            pd4Var2 = pd4Var;
            pd4Var3 = pd4VarM31122getXDirection3MmeM6k;
            pd4Var4 = pd4VarM31123getYDirection3MmeM6k;
        }
        if (isSelected(xwe.resolve2dDirection(pd4VarM31122getXDirection3MmeM6k, pd4VarM31123getYDirection3MmeM6k), pd4VarAppendSelectableInfo_Parwq6A$otherDirection)) {
            int length = hugVar.getLayoutInput().getText().length();
            if (wweVar.isStartHandle()) {
                int iM31121getOffsetForPosition3MmeM6k = m31121getOffsetForPosition3MmeM6k(j, hugVar);
                gwe previousSelection3 = wweVar.getPreviousSelection();
                previousAdjustedOffset2 = iM31121getOffsetForPosition3MmeM6k;
                previousAdjustedOffset = (previousSelection3 == null || (end = previousSelection3.getEnd()) == null) ? iM31121getOffsetForPosition3MmeM6k : getPreviousAdjustedOffset(end, wweVar.getSelectableIdOrderingComparator(), j3, length);
            } else {
                int iM31121getOffsetForPosition3MmeM6k2 = m31121getOffsetForPosition3MmeM6k(j, hugVar);
                gwe previousSelection4 = wweVar.getPreviousSelection();
                previousAdjustedOffset = iM31121getOffsetForPosition3MmeM6k2;
                previousAdjustedOffset2 = (previousSelection4 == null || (start = previousSelection4.getStart()) == null) ? iM31121getOffsetForPosition3MmeM6k2 : getPreviousAdjustedOffset(start, wweVar.getSelectableIdOrderingComparator(), j3, length);
            }
            wweVar.appendInfo(j3, previousAdjustedOffset2, pd4Var, pd4Var2, previousAdjustedOffset, pd4Var3, pd4Var4, mzb.m31102isUnspecifiedk4lQ0M(j2) ? -1 : m31121getOffsetForPosition3MmeM6k(j2, hugVar), hugVar);
        }
    }

    private static final pd4 appendSelectableInfo_Parwq6A$otherDirection(pd4 pd4Var, pd4 pd4Var2, wwe wweVar, long j, gwe.C6633a c6633a) {
        pd4 directionById;
        return (c6633a == null || (directionById = getDirectionById(wweVar, c6633a.getSelectableId(), j)) == null) ? xwe.resolve2dDirection(pd4Var, pd4Var2) : directionById;
    }

    private static final pd4 getDirectionById(wwe wweVar, long j, long j2) {
        int iCompare = wweVar.getSelectableIdOrderingComparator().compare(Long.valueOf(j), Long.valueOf(j2));
        return iCompare < 0 ? pd4.BEFORE : iCompare > 0 ? pd4.AFTER : pd4.ON;
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    private static final int m31121getOffsetForPosition3MmeM6k(long j, hug hugVar) {
        if (izb.m30430getYimpl(j) <= 0.0f) {
            return 0;
        }
        return izb.m30430getYimpl(j) >= hugVar.getMultiParagraph().getHeight() ? hugVar.getLayoutInput().getText().length() : hugVar.m30129getOffsetForPositionk4lQ0M(j);
    }

    private static final int getPreviousAdjustedOffset(gwe.C6633a c6633a, Comparator<Long> comparator, long j, int i) {
        int iCompare = comparator.compare(Long.valueOf(c6633a.getSelectableId()), Long.valueOf(j));
        if (iCompare < 0) {
            return 0;
        }
        return iCompare > 0 ? i : c6633a.getOffset();
    }

    /* JADX INFO: renamed from: getXDirection-3MmeM6k, reason: not valid java name */
    private static final pd4 m31122getXDirection3MmeM6k(long j, rud rudVar) {
        return izb.m30429getXimpl(j) < rudVar.getLeft() ? pd4.BEFORE : izb.m30429getXimpl(j) > rudVar.getRight() ? pd4.AFTER : pd4.ON;
    }

    /* JADX INFO: renamed from: getYDirection-3MmeM6k, reason: not valid java name */
    private static final pd4 m31123getYDirection3MmeM6k(long j, rud rudVar) {
        return izb.m30430getYimpl(j) < rudVar.getTop() ? pd4.BEFORE : izb.m30430getYimpl(j) > rudVar.getBottom() ? pd4.AFTER : pd4.ON;
    }

    private static final boolean isSelected(pd4 pd4Var, pd4 pd4Var2) {
        return pd4Var == pd4.ON || pd4Var != pd4Var2;
    }
}
