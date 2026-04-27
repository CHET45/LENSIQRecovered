package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ta3 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r14, int r15, int r16, p000.hug r17, p000.rud r18) {
        /*
            r0 = r16
            r1 = r18
            int r2 = r0 - r15
            int r2 = r2 * 4
            float[] r2 = new float[r2]
            u2b r3 = r17.getMultiParagraph()
            long r4 = p000.kvg.TextRange(r15, r16)
            r6 = 0
            r3.m32531fillBoundingBoxes8ffj60Q(r4, r2, r6)
            r3 = r15
        L17:
            if (r3 >= r0) goto L7a
            int r4 = r3 - r15
            int r4 = r4 * 4
            rud r5 = new rud
            r6 = r2[r4]
            int r7 = r4 + 1
            r7 = r2[r7]
            int r8 = r4 + 2
            r8 = r2[r8]
            int r4 = r4 + 3
            r4 = r2[r4]
            r5.<init>(r6, r7, r8, r4)
            boolean r4 = r1.overlaps(r5)
            float r6 = r5.getLeft()
            float r7 = r5.getTop()
            boolean r6 = p000.r39.containsInclusive(r1, r6, r7)
            if (r6 == 0) goto L54
            float r6 = r5.getRight()
            float r7 = r5.getBottom()
            boolean r6 = p000.r39.containsInclusive(r1, r6, r7)
            if (r6 != 0) goto L51
            goto L54
        L51:
            r6 = r17
            goto L57
        L54:
            r4 = r4 | 2
            goto L51
        L57:
            q5e r7 = r6.getBidiRunDirection(r3)
            q5e r8 = p000.q5e.Rtl
            if (r7 != r8) goto L61
            r4 = r4 | 4
        L61:
            r13 = r4
            float r9 = r5.getLeft()
            float r10 = r5.getTop()
            float r11 = r5.getRight()
            float r12 = r5.getBottom()
            r7 = r14
            r8 = r3
            r7.addCharacterBounds(r8, r9, r10, r11, r12, r13)
            int r3 = r3 + 1
            goto L17
        L7a:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ta3.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, hug, rud):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    @yfb
    /* JADX INFO: renamed from: build-vxqZcH0, reason: not valid java name */
    public static final CursorAnchorInfo m32395buildvxqZcH0(@yfb CursorAnchorInfo.Builder builder, @yfb CharSequence charSequence, long j, @gib jvg jvgVar, @yfb hug hugVar, @yfb Matrix matrix, @yfb rud rudVar, @yfb rud rudVar2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int iM30591getMinimpl = jvg.m30591getMinimpl(j);
        builder.setSelectionRange(iM30591getMinimpl, jvg.m30590getMaximpl(j));
        if (z) {
            setInsertionMarker(builder, iM30591getMinimpl, hugVar, rudVar);
        }
        if (z2) {
            int iM30591getMinimpl2 = jvgVar != null ? jvg.m30591getMinimpl(jvgVar.m30597unboximpl()) : -1;
            int iM30590getMaximpl = jvgVar != null ? jvg.m30590getMaximpl(jvgVar.m30597unboximpl()) : -1;
            if (iM30591getMinimpl2 >= 0 && iM30591getMinimpl2 < iM30590getMaximpl) {
                builder.setComposingText(iM30591getMinimpl2, charSequence.subSequence(iM30591getMinimpl2, iM30590getMaximpl));
                addCharacterBounds(builder, iM30591getMinimpl2, iM30590getMaximpl, hugVar, rudVar);
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

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i, hug hugVar, rud rudVar) {
        if (i < 0) {
            return builder;
        }
        rud cursorRect = hugVar.getCursorRect(i);
        float fCoerceIn = kpd.coerceIn(cursorRect.getLeft(), 0.0f, r78.m32087getWidthimpl(hugVar.m30130getSizeYbymL2g()));
        boolean zContainsInclusive = r39.containsInclusive(rudVar, fCoerceIn, cursorRect.getTop());
        boolean zContainsInclusive2 = r39.containsInclusive(rudVar, fCoerceIn, cursorRect.getBottom());
        boolean z = hugVar.getBidiRunDirection(i) == q5e.Rtl;
        int i2 = (zContainsInclusive || zContainsInclusive2) ? 1 : 0;
        if (!zContainsInclusive || !zContainsInclusive2) {
            i2 |= 2;
        }
        builder.setInsertionMarkerLocation(fCoerceIn, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), z ? i2 | 4 : i2);
        return builder;
    }
}
