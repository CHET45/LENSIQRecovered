package p000;

import p000.lu0;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n73#1,8:438\n73#1,8:446\n73#1,8:454\n73#1,8:462\n73#1,8:470\n73#1,8:478\n73#1,8:486\n73#1,8:494\n73#1,8:502\n73#1,8:510\n73#1,8:518\n73#1,8:526\n73#1,6:534\n80#1:541\n73#1,8:542\n73#1,8:550\n73#1,8:558\n74#1,7:566\n74#1,7:573\n73#1,8:580\n73#1,8:588\n73#1,8:596\n73#1,8:604\n74#1,7:612\n1#2:540\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:438,8\n95#1:446,8\n99#1:454,8\n107#1:462,8\n118#1:470,8\n134#1:478,8\n158#1:486,8\n163#1:494,8\n168#1:502,8\n172#1:510,8\n176#1:518,8\n184#1:526,8\n194#1:534,6\n194#1:541\n200#1:542,8\n204#1:550,8\n212#1:558,8\n220#1:566,7\n224#1:573,7\n230#1:580,8\n236#1:588,8\n240#1:596,8\n248#1:604,8\n257#1:612,7\n*E\n"})
@e0g(parameters = 0)
public abstract class lu0<T extends lu0<T>> {

    /* JADX INFO: renamed from: h */
    @yfb
    public static final C8972a f58715h = new C8972a(null);

    /* JADX INFO: renamed from: i */
    public static final int f58716i = 8;

    /* JADX INFO: renamed from: j */
    public static final int f58717j = -1;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C9041lz f58718a;

    /* JADX INFO: renamed from: b */
    public final long f58719b;

    /* JADX INFO: renamed from: c */
    @gib
    public final hug f58720c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final nzb f58721d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final ivg f58722e;

    /* JADX INFO: renamed from: f */
    public long f58723f;

    /* JADX INFO: renamed from: g */
    @yfb
    public C9041lz f58724g;

    /* JADX INFO: renamed from: lu0$a */
    public static final class C8972a {
        public /* synthetic */ C8972a(jt3 jt3Var) {
            this();
        }

        private C8972a() {
        }
    }

    public /* synthetic */ lu0(C9041lz c9041lz, long j, hug hugVar, nzb nzbVar, ivg ivgVar, jt3 jt3Var) {
        this(c9041lz, j, hugVar, nzbVar, ivgVar);
    }

    public static /* synthetic */ lu0 apply$default(lu0 lu0Var, Object obj, boolean z, qy6 qy6Var, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            lu0Var.getState().resetCachedX();
        }
        if (lu0Var.getText$foundation_release().length() > 0) {
            qy6Var.invoke(obj);
        }
        md8.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (lu0) obj;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m16383b(lu0 lu0Var, hug hugVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i2 & 1) != 0) {
            i = lu0Var.transformedMaxOffset();
        }
        return lu0Var.getLineEndByOffsetForLayout(hugVar, i);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m16384c(lu0 lu0Var, hug hugVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i2 & 1) != 0) {
            i = lu0Var.transformedMinOffset();
        }
        return lu0Var.getLineStartByOffsetForLayout(hugVar, i);
    }

    private final int charOffset(int i) {
        return kpd.coerceAtMost(i, getText$foundation_release().length() - 1);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m16385d(lu0 lu0Var, hug hugVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i2 & 1) != 0) {
            i = lu0Var.transformedEndOffset();
        }
        return lu0Var.getNextWordOffsetForLayout(hugVar, i);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m16386e(lu0 lu0Var, hug hugVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i2 & 1) != 0) {
            i = lu0Var.transformedEndOffset();
        }
        return lu0Var.getPrevWordOffset(hugVar, i);
    }

    private final int getLineEndByOffsetForLayout(hug hugVar, int i) {
        return this.f58721d.transformedToOriginal(hugVar.getLineEnd(hugVar.getLineForOffset(i), true));
    }

    private final int getLineStartByOffsetForLayout(hug hugVar, int i) {
        return this.f58721d.transformedToOriginal(hugVar.getLineStart(hugVar.getLineForOffset(i)));
    }

    private final int getNextWordOffsetForLayout(hug hugVar, int i) {
        while (i < this.f58718a.length()) {
            long jM30131getWordBoundaryjx7JFs = hugVar.m30131getWordBoundaryjx7JFs(charOffset(i));
            if (jvg.m30588getEndimpl(jM30131getWordBoundaryjx7JFs) > i) {
                return this.f58721d.transformedToOriginal(jvg.m30588getEndimpl(jM30131getWordBoundaryjx7JFs));
            }
            i++;
        }
        return this.f58718a.length();
    }

    private final int getPrevWordOffset(hug hugVar, int i) {
        while (i > 0) {
            long jM30131getWordBoundaryjx7JFs = hugVar.m30131getWordBoundaryjx7JFs(charOffset(i));
            if (jvg.m30593getStartimpl(jM30131getWordBoundaryjx7JFs) < i) {
                return this.f58721d.transformedToOriginal(jvg.m30593getStartimpl(jM30131getWordBoundaryjx7JFs));
            }
            i--;
        }
        return 0;
    }

    private final boolean isLtr() {
        hug hugVar = this.f58720c;
        return (hugVar != null ? hugVar.getParagraphDirection(transformedEndOffset()) : null) != q5e.Rtl;
    }

    private final int jumpByLinesOffset(hug hugVar, int i) {
        int iTransformedEndOffset = transformedEndOffset();
        if (this.f58722e.getCachedX() == null) {
            this.f58722e.setCachedX(Float.valueOf(hugVar.getCursorRect(iTransformedEndOffset).getLeft()));
        }
        int lineForOffset = hugVar.getLineForOffset(iTransformedEndOffset) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= hugVar.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = hugVar.getLineBottom(lineForOffset) - 1;
        Float cachedX = this.f58722e.getCachedX();
        md8.checkNotNull(cachedX);
        float fFloatValue = cachedX.floatValue();
        if ((isLtr() && fFloatValue >= hugVar.getLineRight(lineForOffset)) || (!isLtr() && fFloatValue <= hugVar.getLineLeft(lineForOffset))) {
            return hugVar.getLineEnd(lineForOffset, true);
        }
        return this.f58721d.transformedToOriginal(hugVar.m30129getOffsetForPositionk4lQ0M(mzb.Offset(cachedX.floatValue(), lineBottom)));
    }

    private final T moveCursorNext() {
        int nextCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            m16388f(nextCharacterIndex);
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorNextByWord() {
        Integer nextWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextWordOffset = getNextWordOffset()) != null) {
            m16388f(nextWordOffset.intValue());
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorPrev() {
        int precedingCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            m16388f(precedingCharacterIndex);
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorPrevByWord() {
        Integer previousWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (previousWordOffset = getPreviousWordOffset()) != null) {
            m16388f(previousWordOffset.intValue());
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int transformedEndOffset() {
        return this.f58721d.originalToTransformed(jvg.m30588getEndimpl(this.f58723f));
    }

    private final int transformedMaxOffset() {
        return this.f58721d.originalToTransformed(jvg.m30590getMaximpl(this.f58723f));
    }

    private final int transformedMinOffset() {
        return this.f58721d.originalToTransformed(jvg.m30591getMinimpl(this.f58723f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    /* JADX INFO: renamed from: a */
    public final <U> T m16387a(U u, boolean z, @yfb qy6<? super U, bth> qy6Var) {
        if (z) {
            getState().resetCachedX();
        }
        if (getText$foundation_release().length() > 0) {
            qy6Var.invoke(u);
        }
        md8.checkNotNull(u, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u;
    }

    @yfb
    public final T collapseLeftOr(@yfb qy6<? super T, bth> qy6Var) {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (jvg.m30587getCollapsedimpl(this.f58723f)) {
                md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                qy6Var.invoke(this);
            } else if (isLtr()) {
                m16388f(jvg.m30591getMinimpl(this.f58723f));
            } else {
                m16388f(jvg.m30590getMaximpl(this.f58723f));
            }
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T collapseRightOr(@yfb qy6<? super T, bth> qy6Var) {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (jvg.m30587getCollapsedimpl(this.f58723f)) {
                md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                qy6Var.invoke(this);
            } else if (isLtr()) {
                m16388f(jvg.m30590getMaximpl(this.f58723f));
            } else {
                m16388f(jvg.m30591getMinimpl(this.f58723f));
            }
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T deselect() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            m16388f(jvg.m30588getEndimpl(this.f58723f));
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final void m16388f(int i) {
        m16389g(i, i);
    }

    /* JADX INFO: renamed from: g */
    public final void m16389g(int i, int i2) {
        this.f58723f = kvg.TextRange(i, i2);
    }

    @yfb
    public final C9041lz getAnnotatedString() {
        return this.f58724g;
    }

    @gib
    public final hug getLayoutResult() {
        return this.f58720c;
    }

    @gib
    public final Integer getLineEndByOffset() {
        hug hugVar = this.f58720c;
        if (hugVar != null) {
            return Integer.valueOf(m16383b(this, hugVar, 0, 1, null));
        }
        return null;
    }

    @gib
    public final Integer getLineStartByOffset() {
        hug hugVar = this.f58720c;
        if (hugVar != null) {
            return Integer.valueOf(m16384c(this, hugVar, 0, 1, null));
        }
        return null;
    }

    public final int getNextCharacterIndex() {
        return u7g.findFollowingBreak(this.f58724g.getText(), jvg.m30588getEndimpl(this.f58723f));
    }

    @gib
    public final Integer getNextWordOffset() {
        hug hugVar = this.f58720c;
        if (hugVar != null) {
            return Integer.valueOf(m16385d(this, hugVar, 0, 1, null));
        }
        return null;
    }

    @yfb
    public final nzb getOffsetMapping() {
        return this.f58721d;
    }

    /* JADX INFO: renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m30890getOriginalSelectiond9O1mEE() {
        return this.f58719b;
    }

    @yfb
    public final C9041lz getOriginalText() {
        return this.f58718a;
    }

    public final int getPrecedingCharacterIndex() {
        return u7g.findPrecedingBreak(this.f58724g.getText(), jvg.m30588getEndimpl(this.f58723f));
    }

    @gib
    public final Integer getPreviousWordOffset() {
        hug hugVar = this.f58720c;
        if (hugVar != null) {
            return Integer.valueOf(m16386e(this, hugVar, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m30891getSelectiond9O1mEE() {
        return this.f58723f;
    }

    @yfb
    public final ivg getState() {
        return this.f58722e;
    }

    @yfb
    public final String getText$foundation_release() {
        return this.f58724g.getText();
    }

    @yfb
    public final T moveCursorDownByLine() {
        hug hugVar;
        if (getText$foundation_release().length() > 0 && (hugVar = this.f58720c) != null) {
            m16388f(jumpByLinesOffset(hugVar, 1));
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T moveCursorLeft() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T moveCursorLeftByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T moveCursorNextByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            int iFindParagraphEnd = t7g.findParagraphEnd(getText$foundation_release(), jvg.m30590getMaximpl(this.f58723f));
            if (iFindParagraphEnd == jvg.m30590getMaximpl(this.f58723f) && iFindParagraphEnd != getText$foundation_release().length()) {
                iFindParagraphEnd = t7g.findParagraphEnd(getText$foundation_release(), iFindParagraphEnd + 1);
            }
            m16388f(iFindParagraphEnd);
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T moveCursorPrevByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            int iFindParagraphStart = t7g.findParagraphStart(getText$foundation_release(), jvg.m30591getMinimpl(this.f58723f));
            if (iFindParagraphStart == jvg.m30591getMinimpl(this.f58723f) && iFindParagraphStart != 0) {
                iFindParagraphStart = t7g.findParagraphStart(getText$foundation_release(), iFindParagraphStart - 1);
            }
            m16388f(iFindParagraphStart);
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T moveCursorRight() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T moveCursorRightByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T moveCursorToEnd() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            m16388f(getText$foundation_release().length());
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T moveCursorToHome() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            m16388f(0);
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T moveCursorToLineEnd() {
        Integer lineEndByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineEndByOffset = getLineEndByOffset()) != null) {
            m16388f(lineEndByOffset.intValue());
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T moveCursorToLineLeftSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T moveCursorToLineRightSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T moveCursorToLineStart() {
        Integer lineStartByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineStartByOffset = getLineStartByOffset()) != null) {
            m16388f(lineStartByOffset.intValue());
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T moveCursorUpByLine() {
        hug hugVar;
        if (getText$foundation_release().length() > 0 && (hugVar = this.f58720c) != null) {
            m16388f(jumpByLinesOffset(hugVar, -1));
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T selectAll() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            m16389g(0, getText$foundation_release().length());
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final T selectMovement() {
        if (getText$foundation_release().length() > 0) {
            this.f58723f = kvg.TextRange(jvg.m30593getStartimpl(this.f58719b), jvg.m30588getEndimpl(this.f58723f));
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void setAnnotatedString(@yfb C9041lz c9041lz) {
        this.f58724g = c9041lz;
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m30892setSelection5zctL8(long j) {
        this.f58723f = j;
    }

    private lu0(C9041lz c9041lz, long j, hug hugVar, nzb nzbVar, ivg ivgVar) {
        this.f58718a = c9041lz;
        this.f58719b = j;
        this.f58720c = hugVar;
        this.f58721d = nzbVar;
        this.f58722e = ivgVar;
        this.f58723f = j;
        this.f58724g = c9041lz;
    }
}
