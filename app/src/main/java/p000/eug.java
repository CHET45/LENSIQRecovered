package p000;

import android.graphics.RectF;
import android.text.Layout;
import p000.qv8;

/* JADX INFO: loaded from: classes.dex */
public final class eug {
    private static final float getCharacterLeftBounds(int i, int i2, float[] fArr) {
        return fArr[(i - i2) * 2];
    }

    private static final float getCharacterRightBounds(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    private static final int getEndOffsetForRectWithinRun(qv8.C11711a c11711a, RectF rectF, int i, int i2, int i3, float f, float f2, float[] fArr, yue yueVar, gz6<? super RectF, ? super RectF, Boolean> gz6Var) {
        int start;
        int iNextEndBoundary;
        if (!horizontalOverlap(rectF, f, f2)) {
            return -1;
        }
        if ((c11711a.isRtl() || rectF.right < f2) && (!c11711a.isRtl() || rectF.left > f)) {
            start = c11711a.getStart();
            int end = c11711a.getEnd();
            while (end - start > 1) {
                int i4 = (end + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i4, i, fArr);
                if ((c11711a.isRtl() || characterLeftBounds <= rectF.right) && (!c11711a.isRtl() || characterLeftBounds >= rectF.left)) {
                    start = i4;
                } else {
                    end = i4;
                }
            }
            if (c11711a.isRtl()) {
                start = end;
            }
        } else {
            start = c11711a.getEnd() - 1;
        }
        int iPreviousStartBoundary = yueVar.previousStartBoundary(start + 1);
        if (iPreviousStartBoundary == -1 || (iNextEndBoundary = yueVar.nextEndBoundary(iPreviousStartBoundary)) <= c11711a.getStart()) {
            return -1;
        }
        int iCoerceAtLeast = kpd.coerceAtLeast(iPreviousStartBoundary, c11711a.getStart());
        int iCoerceAtMost = kpd.coerceAtMost(iNextEndBoundary, c11711a.getEnd());
        RectF rectF2 = new RectF(0.0f, i2, 0.0f, i3);
        while (true) {
            rectF2.left = c11711a.isRtl() ? getCharacterLeftBounds(iCoerceAtMost - 1, i, fArr) : getCharacterLeftBounds(iCoerceAtLeast, i, fArr);
            rectF2.right = c11711a.isRtl() ? getCharacterRightBounds(iCoerceAtLeast, i, fArr) : getCharacterRightBounds(iCoerceAtMost - 1, i, fArr);
            if (gz6Var.invoke(rectF2, rectF).booleanValue()) {
                return iCoerceAtMost;
            }
            iCoerceAtMost = yueVar.previousEndBoundary(iCoerceAtMost);
            if (iCoerceAtMost == -1 || iCoerceAtMost <= c11711a.getStart()) {
                break;
            }
            iCoerceAtLeast = kpd.coerceAtLeast(yueVar.previousStartBoundary(iCoerceAtMost), c11711a.getStart());
        }
        return -1;
    }

    @gib
    public static final int[] getRangeForRect(@yfb cug cugVar, @yfb Layout layout, @yfb qv8 qv8Var, @yfb RectF rectF, int i, @yfb gz6<? super RectF, ? super RectF, Boolean> gz6Var) {
        int i2;
        int i3;
        yue lpiVar = i == 1 ? new lpi(cugVar.getText(), cugVar.getWordIterator()) : zue.createGraphemeClusterSegmentFinder(cugVar.getText(), cugVar.getTextPaint());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > cugVar.getLineBottom(lineForVertical) && (lineForVertical = lineForVertical + 1) >= cugVar.getLineCount()) {
            return null;
        }
        int i4 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < cugVar.getLineTop(0)) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(cugVar, layout, qv8Var, i4, rectF, lpiVar, gz6Var, true);
        while (true) {
            i2 = i4;
            i3 = startOrEndOffsetForRectWithinLine;
            if (i3 != -1 || i2 >= lineForVertical2) {
                break;
            }
            i4 = i2 + 1;
            startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(cugVar, layout, qv8Var, i4, rectF, lpiVar, gz6Var, true);
        }
        if (i3 == -1) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(cugVar, layout, qv8Var, lineForVertical2, rectF, lpiVar, gz6Var, false);
        while (startOrEndOffsetForRectWithinLine2 == -1 && i2 < lineForVertical2) {
            lineForVertical2--;
            startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(cugVar, layout, qv8Var, lineForVertical2, rectF, lpiVar, gz6Var, false);
        }
        if (startOrEndOffsetForRectWithinLine2 == -1) {
            return null;
        }
        return new int[]{lpiVar.previousStartBoundary(i3 + 1), lpiVar.nextEndBoundary(startOrEndOffsetForRectWithinLine2 - 1)};
    }

    private static final int getStartOffsetForRectWithinRun(qv8.C11711a c11711a, RectF rectF, int i, int i2, int i3, float f, float f2, float[] fArr, yue yueVar, gz6<? super RectF, ? super RectF, Boolean> gz6Var) {
        int start;
        int iPreviousStartBoundary;
        if (!horizontalOverlap(rectF, f, f2)) {
            return -1;
        }
        if ((c11711a.isRtl() || rectF.left > f) && (!c11711a.isRtl() || rectF.right < f2)) {
            start = c11711a.getStart();
            int end = c11711a.getEnd();
            while (end - start > 1) {
                int i4 = (end + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i4, i, fArr);
                if ((c11711a.isRtl() || characterLeftBounds <= rectF.left) && (!c11711a.isRtl() || characterLeftBounds >= rectF.right)) {
                    start = i4;
                } else {
                    end = i4;
                }
            }
            if (c11711a.isRtl()) {
                start = end;
            }
        } else {
            start = c11711a.getStart();
        }
        int iNextEndBoundary = yueVar.nextEndBoundary(start);
        if (iNextEndBoundary == -1 || (iPreviousStartBoundary = yueVar.previousStartBoundary(iNextEndBoundary)) >= c11711a.getEnd()) {
            return -1;
        }
        int iCoerceAtLeast = kpd.coerceAtLeast(iPreviousStartBoundary, c11711a.getStart());
        int iCoerceAtMost = kpd.coerceAtMost(iNextEndBoundary, c11711a.getEnd());
        RectF rectF2 = new RectF(0.0f, i2, 0.0f, i3);
        while (true) {
            rectF2.left = c11711a.isRtl() ? getCharacterLeftBounds(iCoerceAtMost - 1, i, fArr) : getCharacterLeftBounds(iCoerceAtLeast, i, fArr);
            rectF2.right = c11711a.isRtl() ? getCharacterRightBounds(iCoerceAtLeast, i, fArr) : getCharacterRightBounds(iCoerceAtMost - 1, i, fArr);
            if (gz6Var.invoke(rectF2, rectF).booleanValue()) {
                return iCoerceAtLeast;
            }
            iCoerceAtLeast = yueVar.nextStartBoundary(iCoerceAtLeast);
            if (iCoerceAtLeast == -1 || iCoerceAtLeast >= c11711a.getEnd()) {
                break;
            }
            iCoerceAtMost = kpd.coerceAtMost(yueVar.nextEndBoundary(iCoerceAtLeast), c11711a.getEnd());
        }
        return -1;
    }

    private static final int getStartOrEndOffsetForRectWithinLine(cug cugVar, Layout layout, qv8 qv8Var, int i, RectF rectF, yue yueVar, gz6<? super RectF, ? super RectF, Boolean> gz6Var, boolean z) {
        int i2;
        qv8.C11711a[] c11711aArr;
        int i3;
        int endOffsetForRectWithinRun;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        cugVar.fillLineHorizontalBounds$ui_text_release(i, fArr);
        qv8.C11711a[] lineBidiRuns$ui_text_release = qv8Var.getLineBidiRuns$ui_text_release(i);
        d78 indices = z ? e80.getIndices(lineBidiRuns$ui_text_release) : kpd.downTo(e80.getLastIndex(lineBidiRuns$ui_text_release), 0);
        int first = indices.getFirst();
        int last = indices.getLast();
        int step = indices.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return -1;
        }
        int i4 = first;
        while (true) {
            qv8.C11711a c11711a = lineBidiRuns$ui_text_release[i4];
            float characterLeftBounds = c11711a.isRtl() ? getCharacterLeftBounds(c11711a.getEnd() - 1, lineStart, fArr) : getCharacterLeftBounds(c11711a.getStart(), lineStart, fArr);
            float characterRightBounds = c11711a.isRtl() ? getCharacterRightBounds(c11711a.getStart(), lineStart, fArr) : getCharacterRightBounds(c11711a.getEnd() - 1, lineStart, fArr);
            if (z) {
                i2 = i4;
                c11711aArr = lineBidiRuns$ui_text_release;
                i3 = last;
                endOffsetForRectWithinRun = getStartOffsetForRectWithinRun(c11711a, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, yueVar, gz6Var);
            } else {
                i2 = i4;
                c11711aArr = lineBidiRuns$ui_text_release;
                i3 = last;
                endOffsetForRectWithinRun = getEndOffsetForRectWithinRun(c11711a, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, yueVar, gz6Var);
            }
            if (endOffsetForRectWithinRun >= 0) {
                return endOffsetForRectWithinRun;
            }
            if (i2 == i3) {
                return -1;
            }
            i4 = i2 + step;
            last = i3;
            lineBidiRuns$ui_text_release = c11711aArr;
        }
    }

    private static final boolean horizontalOverlap(RectF rectF, float f, float f2) {
        return f2 >= rectF.left && f <= rectF.right;
    }
}
