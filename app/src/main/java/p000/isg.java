package p000;

import p000.ssf;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,545:1\n181#1,7:554\n181#1,7:561\n177#1,11:568\n177#1,11:579\n177#1,11:590\n177#1,11:601\n177#1,11:612\n177#1,11:623\n177#1,11:634\n177#1,11:645\n177#1,11:656\n177#1,11:667\n177#1,11:678\n177#1,11:689\n177#1,11:700\n177#1,11:711\n177#1,11:722\n177#1,11:733\n181#1,7:744\n181#1,7:751\n177#1,11:758\n177#1,11:769\n177#1,11:780\n177#1,11:791\n181#1,7:802\n602#2,8:546\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n*L\n135#1:554,7\n142#1:561,7\n197#1:568,11\n201#1:579,11\n205#1:590,11\n213#1:601,11\n224#1:612,11\n239#1:623,11\n262#1:634,11\n270#1:645,11\n278#1:656,11\n282#1:667,11\n286#1:678,11\n294#1:689,11\n305#1:700,11\n311#1:711,11\n315#1:722,11\n323#1:733,11\n333#1:744,7\n340#1:751,7\n347#1:758,11\n354#1:769,11\n358#1:780,11\n366#1:791,11\n375#1:802,7\n98#1:546,8\n*E\n"})
@e0g(parameters = 0)
public final class isg {

    /* JADX INFO: renamed from: i */
    @yfb
    public static final C7586a f48145i = new C7586a(null);

    /* JADX INFO: renamed from: j */
    public static final int f48146j = 8;

    /* JADX INFO: renamed from: k */
    public static final int f48147k = -1;

    /* JADX INFO: renamed from: a */
    @yfb
    public final jeh f48148a;

    /* JADX INFO: renamed from: b */
    @gib
    public final hug f48149b;

    /* JADX INFO: renamed from: c */
    public final boolean f48150c;

    /* JADX INFO: renamed from: d */
    public final float f48151d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final ksg f48152e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final jrg f48153f;

    /* JADX INFO: renamed from: g */
    public long f48154g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final String f48155h;

    /* JADX INFO: renamed from: isg$a */
    public static final class C7586a {
        public /* synthetic */ C7586a(jt3 jt3Var) {
            this();
        }

        private C7586a() {
        }
    }

    public isg(@yfb jeh jehVar, @gib hug hugVar, boolean z, float f, @yfb ksg ksgVar) {
        this.f48148a = jehVar;
        this.f48149b = hugVar;
        this.f48150c = z;
        this.f48151d = f;
        this.f48152e = ksgVar;
        ssf.C12771a c12771a = ssf.f82790e;
        ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
        qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            jrg visualText = jehVar.getVisualText();
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
            this.f48153f = visualText;
            this.f48154g = visualText.m30568getSelectiond9O1mEE();
            this.f48155h = visualText.toString();
        } catch (Throwable th) {
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ isg m13367a(isg isgVar, boolean z, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            isgVar.f48152e.resetCachedX();
        }
        if (isgVar.f48155h.length() > 0) {
            qy6Var.invoke(isgVar);
        }
        return isgVar;
    }

    private final isg applyIfNotEmpty(boolean z, qy6<? super isg, bth> qy6Var) {
        if (z) {
            this.f48152e.resetCachedX();
        }
        if (this.f48155h.length() > 0) {
            qy6Var.invoke(this);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m13368b(isg isgVar, hug hugVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jvg.m30590getMaximpl(isgVar.f48154g);
        }
        return isgVar.getLineEndByOffsetForLayout(hugVar, i);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m13369c(isg isgVar, hug hugVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jvg.m30591getMinimpl(isgVar.f48154g);
        }
        return isgVar.getLineStartByOffsetForLayout(hugVar, i);
    }

    private final int charOffset(int i) {
        return kpd.coerceAtMost(i, this.f48155h.length() - 1);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m13370d(isg isgVar, hug hugVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jvg.m30588getEndimpl(isgVar.f48154g);
        }
        return isgVar.getNextWordOffsetForLayout(hugVar, i);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m13371e(isg isgVar, hug hugVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jvg.m30588getEndimpl(isgVar.f48154g);
        }
        return isgVar.getPrevWordOffsetForLayout(hugVar, i);
    }

    private final int getLineEndByOffsetForLayout(hug hugVar, int i) {
        return hugVar.getLineEnd(hugVar.getLineForOffset(i), true);
    }

    private final int getLineStartByOffsetForLayout(hug hugVar, int i) {
        return hugVar.getLineStart(hugVar.getLineForOffset(i));
    }

    private final int getNextWordOffsetForLayout(hug hugVar, int i) {
        while (i < this.f48153f.length()) {
            long jM30131getWordBoundaryjx7JFs = hugVar.m30131getWordBoundaryjx7JFs(charOffset(i));
            if (jvg.m30588getEndimpl(jM30131getWordBoundaryjx7JFs) > i) {
                return jvg.m30588getEndimpl(jM30131getWordBoundaryjx7JFs);
            }
            i++;
        }
        return this.f48153f.length();
    }

    private final int getPrevWordOffsetForLayout(hug hugVar, int i) {
        while (i > 0) {
            long jM30131getWordBoundaryjx7JFs = hugVar.m30131getWordBoundaryjx7JFs(charOffset(i));
            if (jvg.m30593getStartimpl(jM30131getWordBoundaryjx7JFs) < i) {
                return jvg.m30593getStartimpl(jM30131getWordBoundaryjx7JFs);
            }
            i--;
        }
        return 0;
    }

    private final boolean isLtr() {
        q5e paragraphDirection;
        hug hugVar = this.f48149b;
        return hugVar == null || (paragraphDirection = hugVar.getParagraphDirection(jvg.m30588getEndimpl(this.f48154g))) == null || paragraphDirection == q5e.Ltr;
    }

    private final int jumpByLinesOffset(hug hugVar, int i) {
        int iM30588getEndimpl = jvg.m30588getEndimpl(this.f48154g);
        if (Float.isNaN(this.f48152e.getCachedX())) {
            this.f48152e.setCachedX(hugVar.getCursorRect(iM30588getEndimpl).getLeft());
        }
        int lineForOffset = hugVar.getLineForOffset(iM30588getEndimpl) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= hugVar.getLineCount()) {
            return this.f48155h.length();
        }
        float lineBottom = hugVar.getLineBottom(lineForOffset) - 1;
        float cachedX = this.f48152e.getCachedX();
        return ((!isLtr() || cachedX < hugVar.getLineRight(lineForOffset)) && (isLtr() || cachedX > hugVar.getLineLeft(lineForOffset))) ? hugVar.m30129getOffsetForPositionk4lQ0M(mzb.Offset(cachedX, lineBottom)) : hugVar.getLineEnd(lineForOffset, true);
    }

    private final int jumpByPagesOffset(int i) {
        int iM30588getEndimpl = jvg.m30588getEndimpl(this.f48153f.m30568getSelectiond9O1mEE());
        if (this.f48149b == null || Float.isNaN(this.f48151d)) {
            return iM30588getEndimpl;
        }
        rud rudVarTranslate = this.f48149b.getCursorRect(iM30588getEndimpl).translate(0.0f, this.f48151d * i);
        float lineBottom = this.f48149b.getLineBottom(this.f48149b.getLineForVerticalPosition(rudVarTranslate.getTop()));
        return Math.abs(rudVarTranslate.getTop() - lineBottom) > Math.abs(rudVarTranslate.getBottom() - lineBottom) ? this.f48149b.m30129getOffsetForPositionk4lQ0M(rudVarTranslate.m32208getTopLeftF1C5BW0()) : this.f48149b.m30129getOffsetForPositionk4lQ0M(rudVarTranslate.m32201getBottomLeftF1C5BW0());
    }

    private final isg moveCursorNext() {
        int iM30588getEndimpl;
        int iCalculateAdjacentCursorPosition;
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0 && (iCalculateAdjacentCursorPosition = hvg.calculateAdjacentCursorPosition(this.f48155h, (iM30588getEndimpl = jvg.m30588getEndimpl(this.f48154g)), true, this.f48148a)) != iM30588getEndimpl) {
            setCursor(iCalculateAdjacentCursorPosition);
        }
        return this;
    }

    private final isg moveCursorNextByWord() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            setCursor(getNextWordOffset());
        }
        return this;
    }

    private final isg moveCursorPrev() {
        int iM30588getEndimpl;
        int iCalculateAdjacentCursorPosition;
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0 && (iCalculateAdjacentCursorPosition = hvg.calculateAdjacentCursorPosition(this.f48155h, (iM30588getEndimpl = jvg.m30588getEndimpl(this.f48154g)), false, this.f48148a)) != iM30588getEndimpl) {
            setCursor(iCalculateAdjacentCursorPosition);
        }
        return this;
    }

    private final isg moveCursorPrevByWord() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            setCursor(getPreviousWordOffset());
        }
        return this;
    }

    private final void setCursor(int i) {
        this.f48154g = kvg.TextRange(i, i);
    }

    @yfb
    public final isg collapseLeftOr(@yfb qy6<? super isg, bth> qy6Var) {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            if (jvg.m30587getCollapsedimpl(this.f48154g)) {
                qy6Var.invoke(this);
            } else if (isLtr()) {
                setCursor(jvg.m30591getMinimpl(this.f48154g));
            } else {
                setCursor(jvg.m30590getMaximpl(this.f48154g));
            }
        }
        return this;
    }

    @yfb
    public final isg collapseRightOr(@yfb qy6<? super isg, bth> qy6Var) {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            if (jvg.m30587getCollapsedimpl(this.f48154g)) {
                qy6Var.invoke(this);
            } else if (isLtr()) {
                setCursor(jvg.m30590getMaximpl(this.f48154g));
            } else {
                setCursor(jvg.m30591getMinimpl(this.f48154g));
            }
        }
        return this;
    }

    public final void deleteIfSelectedOr(@yfb ny6<jvg> ny6Var) {
        if (!jvg.m30587getCollapsedimpl(m30391getSelectiond9O1mEE())) {
            jeh.m30512replaceTextM8tDOmk$default(this.f48148a, "", m30391getSelectiond9O1mEE(), null, !this.f48150c, 4, null);
            return;
        }
        jvg jvgVarInvoke = ny6Var.invoke();
        if (jvgVarInvoke != null) {
            jeh.m30512replaceTextM8tDOmk$default(this.f48148a, "", jvgVarInvoke.m30597unboximpl(), null, !this.f48150c, 4, null);
        }
    }

    @yfb
    public final isg deselect() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            setCursor(jvg.m30588getEndimpl(this.f48154g));
        }
        return this;
    }

    @yfb
    public final jrg getInitialValue() {
        return this.f48153f;
    }

    public final int getLineEndByOffset() {
        hug hugVar = this.f48149b;
        return hugVar != null ? m13368b(this, hugVar, 0, 1, null) : this.f48155h.length();
    }

    public final int getLineStartByOffset() {
        hug hugVar = this.f48149b;
        if (hugVar != null) {
            return m13369c(this, hugVar, 0, 1, null);
        }
        return 0;
    }

    public final int getNextCharacterIndex() {
        return u7g.findFollowingBreak(this.f48155h, jvg.m30588getEndimpl(this.f48154g));
    }

    public final int getNextWordOffset() {
        hug hugVar = this.f48149b;
        return hugVar != null ? m13370d(this, hugVar, 0, 1, null) : this.f48155h.length();
    }

    public final int getPrecedingCharacterIndex() {
        return u7g.findPrecedingBreak(this.f48155h, jvg.m30588getEndimpl(this.f48154g));
    }

    public final int getPreviousWordOffset() {
        hug hugVar = this.f48149b;
        if (hugVar != null) {
            return m13371e(this, hugVar, 0, 1, null);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m30391getSelectiond9O1mEE() {
        return this.f48154g;
    }

    @yfb
    public final isg moveCursorDownByLine() {
        if (this.f48149b != null && this.f48155h.length() > 0) {
            hug hugVar = this.f48149b;
            md8.checkNotNull(hugVar);
            setCursor(jumpByLinesOffset(hugVar, 1));
        }
        return this;
    }

    @yfb
    public final isg moveCursorDownByPage() {
        if (this.f48155h.length() > 0) {
            setCursor(jumpByPagesOffset(1));
        }
        return this;
    }

    @yfb
    public final isg moveCursorLeft() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        return this;
    }

    @yfb
    public final isg moveCursorLeftByWord() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        return this;
    }

    @yfb
    public final isg moveCursorNextByParagraph() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            int iFindParagraphEnd = t7g.findParagraphEnd(this.f48155h, jvg.m30590getMaximpl(this.f48154g));
            if (iFindParagraphEnd == jvg.m30590getMaximpl(this.f48154g) && iFindParagraphEnd != this.f48155h.length()) {
                iFindParagraphEnd = t7g.findParagraphEnd(this.f48155h, iFindParagraphEnd + 1);
            }
            setCursor(iFindParagraphEnd);
        }
        return this;
    }

    @yfb
    public final isg moveCursorPrevByParagraph() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            int iFindParagraphStart = t7g.findParagraphStart(this.f48155h, jvg.m30591getMinimpl(this.f48154g));
            if (iFindParagraphStart == jvg.m30591getMinimpl(this.f48154g) && iFindParagraphStart != 0) {
                iFindParagraphStart = t7g.findParagraphStart(this.f48155h, iFindParagraphStart - 1);
            }
            setCursor(iFindParagraphStart);
        }
        return this;
    }

    @yfb
    public final isg moveCursorRight() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        return this;
    }

    @yfb
    public final isg moveCursorRightByWord() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        return this;
    }

    @yfb
    public final isg moveCursorToEnd() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            setCursor(this.f48155h.length());
        }
        return this;
    }

    @yfb
    public final isg moveCursorToHome() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            setCursor(0);
        }
        return this;
    }

    @yfb
    public final isg moveCursorToLineEnd() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            setCursor(getLineEndByOffset());
        }
        return this;
    }

    @yfb
    public final isg moveCursorToLineLeftSide() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        return this;
    }

    @yfb
    public final isg moveCursorToLineRightSide() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        return this;
    }

    @yfb
    public final isg moveCursorToLineStart() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            setCursor(getLineStartByOffset());
        }
        return this;
    }

    @yfb
    public final isg moveCursorUpByLine() {
        if (this.f48149b != null && this.f48155h.length() > 0) {
            hug hugVar = this.f48149b;
            md8.checkNotNull(hugVar);
            setCursor(jumpByLinesOffset(hugVar, -1));
        }
        return this;
    }

    @yfb
    public final isg moveCursorUpByPage() {
        if (this.f48155h.length() > 0) {
            setCursor(jumpByPagesOffset(-1));
        }
        return this;
    }

    @yfb
    public final isg selectAll() {
        this.f48152e.resetCachedX();
        if (this.f48155h.length() > 0) {
            this.f48154g = kvg.TextRange(0, this.f48155h.length());
        }
        return this;
    }

    @yfb
    public final isg selectMovement() {
        if (this.f48155h.length() > 0) {
            this.f48154g = kvg.TextRange(jvg.m30593getStartimpl(this.f48153f.m30568getSelectiond9O1mEE()), jvg.m30588getEndimpl(this.f48154g));
        }
        return this;
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m30392setSelection5zctL8(long j) {
        this.f48154g = j;
    }
}
