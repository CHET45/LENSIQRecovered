package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class r39 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.inputmethod.CursorAnchorInfo$Builder] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, p000.nzb r20, p000.hug r21, p000.rud r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.originalToTransformed(r2)
            int r5 = r1.originalToTransformed(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            u2b r7 = r21.getMultiParagraph()
            long r8 = p000.kvg.TextRange(r4, r5)
            r5 = 0
            r7.m32531fillBoundingBoxes8ffj60Q(r8, r6, r5)
        L22:
            if (r2 >= r0) goto L8e
            int r5 = r1.originalToTransformed(r2)
            int r7 = r5 - r4
            int r7 = r7 * 4
            rud r8 = new rud
            r9 = r6[r7]
            int r10 = r7 + 1
            r10 = r6[r10]
            int r11 = r7 + 2
            r11 = r6[r11]
            int r7 = r7 + 3
            r7 = r6[r7]
            r8.<init>(r9, r10, r11, r7)
            boolean r7 = r3.overlaps(r8)
            float r9 = r8.getLeft()
            float r10 = r8.getTop()
            boolean r9 = containsInclusive(r3, r9, r10)
            if (r9 == 0) goto L63
            float r9 = r8.getRight()
            float r10 = r8.getBottom()
            boolean r9 = containsInclusive(r3, r9, r10)
            if (r9 != 0) goto L60
            goto L63
        L60:
            r9 = r21
            goto L66
        L63:
            r7 = r7 | 2
            goto L60
        L66:
            q5e r5 = r9.getBidiRunDirection(r5)
            q5e r10 = p000.q5e.Rtl
            if (r5 != r10) goto L73
            r5 = r7 | 4
            r16 = r5
            goto L75
        L73:
            r16 = r7
        L75:
            float r12 = r8.getLeft()
            float r13 = r8.getTop()
            float r14 = r8.getRight()
            float r15 = r8.getBottom()
            r10 = r17
            r11 = r2
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r2 = r2 + 1
            goto L22
        L8e:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.r39.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, nzb, hug, rud):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    @yfb
    public static final CursorAnchorInfo build(@yfb CursorAnchorInfo.Builder builder, @yfb zsg zsgVar, @yfb nzb nzbVar, @yfb hug hugVar, @yfb Matrix matrix, @yfb rud rudVar, @yfb rud rudVar2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int iM30591getMinimpl = jvg.m30591getMinimpl(zsgVar.m33527getSelectiond9O1mEE());
        builder.setSelectionRange(iM30591getMinimpl, jvg.m30590getMaximpl(zsgVar.m33527getSelectiond9O1mEE()));
        if (z) {
            setInsertionMarker(builder, iM30591getMinimpl, nzbVar, hugVar, rudVar);
        }
        if (z2) {
            jvg jvgVarM33526getCompositionMzsxiRA = zsgVar.m33526getCompositionMzsxiRA();
            int iM30591getMinimpl2 = jvgVarM33526getCompositionMzsxiRA != null ? jvg.m30591getMinimpl(jvgVarM33526getCompositionMzsxiRA.m30597unboximpl()) : -1;
            jvg jvgVarM33526getCompositionMzsxiRA2 = zsgVar.m33526getCompositionMzsxiRA();
            int iM30590getMaximpl = jvgVarM33526getCompositionMzsxiRA2 != null ? jvg.m30590getMaximpl(jvgVarM33526getCompositionMzsxiRA2.m30597unboximpl()) : -1;
            if (iM30591getMinimpl2 >= 0 && iM30591getMinimpl2 < iM30590getMaximpl) {
                builder.setComposingText(iM30591getMinimpl2, zsgVar.getText().subSequence(iM30591getMinimpl2, iM30590getMaximpl));
                addCharacterBounds(builder, iM30591getMinimpl2, iM30590getMaximpl, nzbVar, hugVar, rudVar);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && z3) {
            oa3.setEditorBoundsInfo(builder, rudVar2);
        }
        if (i >= 34 && z4) {
            ra3.addVisibleLineBounds(builder, hugVar, rudVar);
        }
        return builder.build();
    }

    public static final boolean containsInclusive(@yfb rud rudVar, float f, float f2) {
        float left = rudVar.getLeft();
        if (f <= rudVar.getRight() && left <= f) {
            float top = rudVar.getTop();
            if (f2 <= rudVar.getBottom() && top <= f2) {
                return true;
            }
        }
        return false;
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i, nzb nzbVar, hug hugVar, rud rudVar) {
        if (i < 0) {
            return builder;
        }
        int iOriginalToTransformed = nzbVar.originalToTransformed(i);
        rud cursorRect = hugVar.getCursorRect(iOriginalToTransformed);
        float fCoerceIn = kpd.coerceIn(cursorRect.getLeft(), 0.0f, r78.m32087getWidthimpl(hugVar.m30130getSizeYbymL2g()));
        boolean zContainsInclusive = containsInclusive(rudVar, fCoerceIn, cursorRect.getTop());
        boolean zContainsInclusive2 = containsInclusive(rudVar, fCoerceIn, cursorRect.getBottom());
        boolean z = hugVar.getBidiRunDirection(iOriginalToTransformed) == q5e.Rtl;
        int i2 = (zContainsInclusive || zContainsInclusive2) ? 1 : 0;
        if (!zContainsInclusive || !zContainsInclusive2) {
            i2 |= 2;
        }
        builder.setInsertionMarkerLocation(fCoerceIn, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), z ? i2 | 4 : i2);
        return builder;
    }
}
