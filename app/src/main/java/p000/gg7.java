package p000;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class gg7 {

    /* JADX INFO: renamed from: a */
    public static final int f39763a = 10;

    /* JADX INFO: renamed from: b */
    public static final int f39764b = 160;

    /* JADX INFO: renamed from: gg7$a */
    public static final class C6303a implements lw4 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ lw4[] f39765a;

        public C6303a(lw4[] lw4VarArr) {
            this.f39765a = lw4VarArr;
        }

        @Override // p000.lw4
        public void applyTo(@yfb rw4 rw4Var) {
            for (lw4 lw4Var : this.f39765a) {
                lw4Var.applyTo(rw4Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    public static final long m29728adjustHandwritingDeleteGestureRange72CqOWE(long j, CharSequence charSequence) {
        int iM30593getStartimpl = jvg.m30593getStartimpl(j);
        int iM30588getEndimpl = jvg.m30588getEndimpl(j);
        int iCodePointBefore = iM30593getStartimpl > 0 ? Character.codePointBefore(charSequence, iM30593getStartimpl) : 10;
        int iCodePointAt = iM30588getEndimpl < charSequence.length() ? Character.codePointAt(charSequence, iM30588getEndimpl) : 10;
        if (isWhitespaceExceptNewline(iCodePointBefore) && (isWhitespace(iCodePointAt) || isPunctuation(iCodePointAt))) {
            do {
                iM30593getStartimpl -= Character.charCount(iCodePointBefore);
                if (iM30593getStartimpl == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iM30593getStartimpl);
            } while (isWhitespaceExceptNewline(iCodePointBefore));
            return kvg.TextRange(iM30593getStartimpl, iM30588getEndimpl);
        }
        if (!isWhitespaceExceptNewline(iCodePointAt)) {
            return j;
        }
        if (!isWhitespace(iCodePointBefore) && !isPunctuation(iCodePointBefore)) {
            return j;
        }
        do {
            iM30588getEndimpl += Character.charCount(iCodePointAt);
            if (iM30588getEndimpl == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iM30588getEndimpl);
        } while (isWhitespaceExceptNewline(iCodePointAt));
        return kvg.TextRange(iM30593getStartimpl, iM30588getEndimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lw4 compoundEditCommand(lw4... lw4VarArr) {
        return new C6303a(lw4VarArr);
    }

    /* JADX INFO: renamed from: enclosure-pWDy79M, reason: not valid java name */
    private static final long m29729enclosurepWDy79M(long j, long j2) {
        return kvg.TextRange(Math.min(jvg.m30593getStartimpl(j), jvg.m30593getStartimpl(j)), Math.max(jvg.m30588getEndimpl(j2), jvg.m30588getEndimpl(j2)));
    }

    /* JADX INFO: renamed from: getLineForHandwritingGesture-d-4ec7I, reason: not valid java name */
    private static final int m29730getLineForHandwritingGestured4ec7I(u2b u2bVar, long j, u8i u8iVar) {
        float handwritingGestureLineMargin = u8iVar != null ? u8iVar.getHandwritingGestureLineMargin() : 0.0f;
        int lineForVerticalPosition = u2bVar.getLineForVerticalPosition(izb.m30430getYimpl(j));
        if (izb.m30430getYimpl(j) < u2bVar.getLineTop(lineForVerticalPosition) - handwritingGestureLineMargin || izb.m30430getYimpl(j) > u2bVar.getLineBottom(lineForVerticalPosition) + handwritingGestureLineMargin || izb.m30429getXimpl(j) < (-handwritingGestureLineMargin) || izb.m30429getXimpl(j) > u2bVar.getWidth() + handwritingGestureLineMargin) {
            return -1;
        }
        return lineForVerticalPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m29731getOffsetForHandwritingGestured4ec7I(lug lugVar, long j, u8i u8iVar) {
        u2b multiParagraph;
        hug layoutResult = lugVar.getLayoutResult();
        if (layoutResult == null || (multiParagraph = layoutResult.getMultiParagraph()) == null) {
            return -1;
        }
        return m29733getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j, lugVar.getTextLayoutNodeCoordinates(), u8iVar);
    }

    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-ubNVwUQ, reason: not valid java name */
    private static final int m29733getOffsetForHandwritingGestureubNVwUQ(u2b u2bVar, long j, mv8 mv8Var, u8i u8iVar) {
        long jMo30041screenToLocalMKHz9U;
        int iM29730getLineForHandwritingGestured4ec7I;
        if (mv8Var == null || (iM29730getLineForHandwritingGestured4ec7I = m29730getLineForHandwritingGestured4ec7I(u2bVar, (jMo30041screenToLocalMKHz9U = mv8Var.mo30041screenToLocalMKHz9U(j)), u8iVar)) == -1) {
            return -1;
        }
        return u2bVar.m32532getOffsetForPositionk4lQ0M(izb.m30423copydBAh8RU$default(jMo30041screenToLocalMKHz9U, 0.0f, (u2bVar.getLineTop(iM29730getLineForHandwritingGestured4ec7I) + u2bVar.getLineBottom(iM29730getLineForHandwritingGestured4ec7I)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    public static final long m29734getRangeForRemoveSpaceGesture5iVPX68(hug hugVar, long j, long j2, mv8 mv8Var, u8i u8iVar) {
        if (hugVar == null || mv8Var == null) {
            return jvg.f52112b.m30598getZerod9O1mEE();
        }
        long jMo30041screenToLocalMKHz9U = mv8Var.mo30041screenToLocalMKHz9U(j);
        long jMo30041screenToLocalMKHz9U2 = mv8Var.mo30041screenToLocalMKHz9U(j2);
        int iM29730getLineForHandwritingGestured4ec7I = m29730getLineForHandwritingGestured4ec7I(hugVar.getMultiParagraph(), jMo30041screenToLocalMKHz9U, u8iVar);
        int iM29730getLineForHandwritingGestured4ec7I2 = m29730getLineForHandwritingGestured4ec7I(hugVar.getMultiParagraph(), jMo30041screenToLocalMKHz9U2, u8iVar);
        if (iM29730getLineForHandwritingGestured4ec7I != -1) {
            if (iM29730getLineForHandwritingGestured4ec7I2 != -1) {
                iM29730getLineForHandwritingGestured4ec7I = Math.min(iM29730getLineForHandwritingGestured4ec7I, iM29730getLineForHandwritingGestured4ec7I2);
            }
            iM29730getLineForHandwritingGestured4ec7I2 = iM29730getLineForHandwritingGestured4ec7I;
        } else if (iM29730getLineForHandwritingGestured4ec7I2 == -1) {
            return jvg.f52112b.m30598getZerod9O1mEE();
        }
        float lineTop = (hugVar.getLineTop(iM29730getLineForHandwritingGestured4ec7I2) + hugVar.getLineBottom(iM29730getLineForHandwritingGestured4ec7I2)) / 2;
        return hugVar.getMultiParagraph().m32533getRangeForRect86BmAI(new rud(Math.min(izb.m30429getXimpl(jMo30041screenToLocalMKHz9U), izb.m30429getXimpl(jMo30041screenToLocalMKHz9U2)), lineTop - 0.1f, Math.max(izb.m30429getXimpl(jMo30041screenToLocalMKHz9U), izb.m30429getXimpl(jMo30041screenToLocalMKHz9U2)), lineTop + 0.1f), htg.f44857b.m30125getCharacterDRrd7Zo(), mtg.f62116a.getAnyOverlap());
    }

    /* JADX INFO: renamed from: getRangeForScreenRect-O048IG0, reason: not valid java name */
    private static final long m29735getRangeForScreenRectO048IG0(u2b u2bVar, rud rudVar, mv8 mv8Var, int i, mtg mtgVar) {
        return (u2bVar == null || mv8Var == null) ? jvg.f52112b.m30598getZerod9O1mEE() : u2bVar.m32533getRangeForRect86BmAI(rudVar.m32210translatek4lQ0M(mv8Var.mo30041screenToLocalMKHz9U(izb.f49009b.m30445getZeroF1C5BW0())), i, mtgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m29736getRangeForScreenRectOH9lIzo(lug lugVar, rud rudVar, int i, mtg mtgVar) {
        hug layoutResult = lugVar.getLayoutResult();
        return m29735getRangeForScreenRectO048IG0(layoutResult != null ? layoutResult.getMultiParagraph() : null, rudVar, lugVar.getTextLayoutNodeCoordinates(), i, mtgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m29738getRangeForScreenRectsO048IG0(lug lugVar, rud rudVar, rud rudVar2, int i, mtg mtgVar) {
        long jM29736getRangeForScreenRectOH9lIzo = m29736getRangeForScreenRectOH9lIzo(lugVar, rudVar, i, mtgVar);
        if (jvg.m30587getCollapsedimpl(jM29736getRangeForScreenRectOH9lIzo)) {
            return jvg.f52112b.m30598getZerod9O1mEE();
        }
        long jM29736getRangeForScreenRectOH9lIzo2 = m29736getRangeForScreenRectOH9lIzo(lugVar, rudVar2, i, mtgVar);
        return jvg.m30587getCollapsedimpl(jM29736getRangeForScreenRectOH9lIzo2) ? jvg.f52112b.m30598getZerod9O1mEE() : m29729enclosurepWDy79M(jM29736getRangeForScreenRectOH9lIzo, jM29736getRangeForScreenRectOH9lIzo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBiDiBoundary(hug hugVar, int i) {
        int lineForOffset = hugVar.getLineForOffset(i);
        return (i == hugVar.getLineStart(lineForOffset) || i == hug.getLineEnd$default(hugVar, lineForOffset, false, 2, null)) ? hugVar.getParagraphDirection(i) != hugVar.getBidiRunDirection(i) : hugVar.getBidiRunDirection(i) != hugVar.getBidiRunDirection(i - 1);
    }

    private static final boolean isNewline(int i) {
        int type = Character.getType(i);
        return type == 14 || type == 13 || i == 10;
    }

    private static final boolean isPunctuation(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean isWhitespace(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    private static final boolean isWhitespaceExceptNewline(int i) {
        return isWhitespace(i) && !isNewline(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rangeOfWhitespaces(CharSequence charSequence, int i) {
        int iCharCount = i;
        while (iCharCount > 0) {
            int iCodePointBefore = m72.codePointBefore(charSequence, iCharCount);
            if (!isWhitespace(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i < charSequence.length()) {
            int iCodePointAt = m72.codePointAt(charSequence, i);
            if (!isWhitespace(iCodePointAt)) {
                break;
            }
            i += m72.charCount(iCodePointAt);
        }
        return kvg.TextRange(iCharCount, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toOffset(PointF pointF) {
        return mzb.Offset(pointF.x, pointF.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m29732getOffsetForHandwritingGestured4ec7I(z39 z39Var, long j, u8i u8iVar) {
        hug value;
        u2b multiParagraph;
        iug layoutResult = z39Var.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return m29733getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j, z39Var.getLayoutCoordinates(), u8iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m29737getRangeForScreenRectOH9lIzo(z39 z39Var, rud rudVar, int i, mtg mtgVar) {
        hug value;
        iug layoutResult = z39Var.getLayoutResult();
        return m29735getRangeForScreenRectO048IG0((layoutResult == null || (value = layoutResult.getValue()) == null) ? null : value.getMultiParagraph(), rudVar, z39Var.getLayoutCoordinates(), i, mtgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m29739getRangeForScreenRectsO048IG0(z39 z39Var, rud rudVar, rud rudVar2, int i, mtg mtgVar) {
        long jM29737getRangeForScreenRectOH9lIzo = m29737getRangeForScreenRectOH9lIzo(z39Var, rudVar, i, mtgVar);
        if (jvg.m30587getCollapsedimpl(jM29737getRangeForScreenRectOH9lIzo)) {
            return jvg.f52112b.m30598getZerod9O1mEE();
        }
        long jM29737getRangeForScreenRectOH9lIzo2 = m29737getRangeForScreenRectOH9lIzo(z39Var, rudVar2, i, mtgVar);
        return jvg.m30587getCollapsedimpl(jM29737getRangeForScreenRectOH9lIzo2) ? jvg.f52112b.m30598getZerod9O1mEE() : m29729enclosurepWDy79M(jM29737getRangeForScreenRectOH9lIzo, jM29737getRangeForScreenRectOH9lIzo2);
    }
}
