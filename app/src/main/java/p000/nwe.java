package p000;

import p000.gwe;

/* JADX INFO: loaded from: classes.dex */
public final class nwe {

    /* JADX INFO: renamed from: nwe$a */
    public static final class C10094a extends tt8 implements ny6<gwe.C6633a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ewe f65915a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f65916b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f65917c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ vwe f65918d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fx8<Integer> f65919e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10094a(ewe eweVar, int i, int i2, vwe vweVar, fx8<Integer> fx8Var) {
            super(0);
            this.f65915a = eweVar;
            this.f65916b = i;
            this.f65917c = i2;
            this.f65918d = vweVar;
            this.f65919e = fx8Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final gwe.C6633a invoke() {
            return nwe.snapToWordBoundary(this.f65915a, nwe.updateSelectionBoundary$lambda$0(this.f65919e), this.f65916b, this.f65917c, this.f65918d.isStartHandle(), this.f65918d.getCrossStatus() == z83.CROSSED);
        }
    }

    /* JADX INFO: renamed from: nwe$b */
    public static final class C10095b extends tt8 implements ny6<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ewe f65920a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f65921b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10095b(ewe eweVar, int i) {
            super(0);
            this.f65920a = eweVar;
            this.f65921b = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Integer invoke() {
            return Integer.valueOf(this.f65920a.getTextLayoutResult().getLineForOffset(this.f65921b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gwe adjustToBoundaries(vwe vweVar, ic1 ic1Var) {
        boolean z = vweVar.getCrossStatus() == z83.CROSSED;
        return new gwe(anchorOnBoundary(vweVar.getStartInfo(), z, true, vweVar.getStartSlot(), ic1Var), anchorOnBoundary(vweVar.getEndInfo(), z, false, vweVar.getEndSlot(), ic1Var), z);
    }

    private static final gwe.C6633a anchorOnBoundary(ewe eweVar, boolean z, boolean z2, int i, ic1 ic1Var) {
        int rawStartHandleOffset = z2 ? eweVar.getRawStartHandleOffset() : eweVar.getRawEndHandleOffset();
        if (i != eweVar.getSlot()) {
            return eweVar.anchorForOffset(rawStartHandleOffset);
        }
        long jMo30191getBoundaryfzxv0v0 = ic1Var.mo30191getBoundaryfzxv0v0(eweVar, rawStartHandleOffset);
        return eweVar.anchorForOffset(z ^ z2 ? jvg.m30593getStartimpl(jMo30191getBoundaryfzxv0v0) : jvg.m30588getEndimpl(jMo30191getBoundaryfzxv0v0));
    }

    private static final gwe.C6633a changeOffset(gwe.C6633a c6633a, ewe eweVar, int i) {
        return gwe.C6633a.copy$default(c6633a, eweVar.getTextLayoutResult().getBidiRunDirection(i), i, 0L, 4, null);
    }

    @yfb
    public static final gwe ensureAtLeastOneChar(@yfb gwe gweVar, @yfb vwe vweVar) {
        if (xwe.isCollapsed(gweVar, vweVar)) {
            return (vweVar.getSize() > 1 || vweVar.getPreviousSelection() == null || vweVar.getCurrentInfo().getInputText().length() == 0) ? gweVar : expandOneChar(gweVar, vweVar);
        }
        return gweVar;
    }

    private static final gwe expandOneChar(gwe gweVar, vwe vweVar) {
        ewe currentInfo = vweVar.getCurrentInfo();
        String inputText = currentInfo.getInputText();
        int rawStartHandleOffset = currentInfo.getRawStartHandleOffset();
        int length = inputText.length();
        if (rawStartHandleOffset == 0) {
            int iFindFollowingBreak = u7g.findFollowingBreak(inputText, 0);
            return vweVar.isStartHandle() ? gwe.copy$default(gweVar, changeOffset(gweVar.getStart(), currentInfo, iFindFollowingBreak), null, true, 2, null) : gwe.copy$default(gweVar, null, changeOffset(gweVar.getEnd(), currentInfo, iFindFollowingBreak), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int iFindPrecedingBreak = u7g.findPrecedingBreak(inputText, length);
            return vweVar.isStartHandle() ? gwe.copy$default(gweVar, changeOffset(gweVar.getStart(), currentInfo, iFindPrecedingBreak), null, false, 2, null) : gwe.copy$default(gweVar, null, changeOffset(gweVar.getEnd(), currentInfo, iFindPrecedingBreak), true, 1, null);
        }
        gwe previousSelection = vweVar.getPreviousSelection();
        boolean z = previousSelection != null && previousSelection.getHandlesCrossed();
        int iFindPrecedingBreak2 = vweVar.isStartHandle() ^ z ? u7g.findPrecedingBreak(inputText, rawStartHandleOffset) : u7g.findFollowingBreak(inputText, rawStartHandleOffset);
        return vweVar.isStartHandle() ? gwe.copy$default(gweVar, changeOffset(gweVar.getStart(), currentInfo, iFindPrecedingBreak2), null, z, 2, null) : gwe.copy$default(gweVar, null, changeOffset(gweVar.getEnd(), currentInfo, iFindPrecedingBreak2), z, 1, null);
    }

    private static final boolean isExpanding(ewe eweVar, int i, boolean z) {
        if (eweVar.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i == eweVar.getRawPreviousHandleOffset()) {
            return false;
        }
        if (z ^ (eweVar.getRawCrossStatus() == z83.CROSSED)) {
            if (i < eweVar.getRawPreviousHandleOffset()) {
                return true;
            }
        } else if (i > eweVar.getRawPreviousHandleOffset()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gwe.C6633a snapToWordBoundary(ewe eweVar, int i, int i2, int i3, boolean z, boolean z2) {
        long jM30131getWordBoundaryjx7JFs = eweVar.getTextLayoutResult().m30131getWordBoundaryjx7JFs(i2);
        int iM30593getStartimpl = eweVar.getTextLayoutResult().getLineForOffset(jvg.m30593getStartimpl(jM30131getWordBoundaryjx7JFs)) == i ? jvg.m30593getStartimpl(jM30131getWordBoundaryjx7JFs) : i >= eweVar.getTextLayoutResult().getLineCount() ? eweVar.getTextLayoutResult().getLineStart(eweVar.getTextLayoutResult().getLineCount() - 1) : eweVar.getTextLayoutResult().getLineStart(i);
        int iM30588getEndimpl = eweVar.getTextLayoutResult().getLineForOffset(jvg.m30588getEndimpl(jM30131getWordBoundaryjx7JFs)) == i ? jvg.m30588getEndimpl(jM30131getWordBoundaryjx7JFs) : i >= eweVar.getTextLayoutResult().getLineCount() ? hug.getLineEnd$default(eweVar.getTextLayoutResult(), eweVar.getTextLayoutResult().getLineCount() - 1, false, 2, null) : hug.getLineEnd$default(eweVar.getTextLayoutResult(), i, false, 2, null);
        if (iM30593getStartimpl == i3) {
            return eweVar.anchorForOffset(iM30588getEndimpl);
        }
        if (iM30588getEndimpl == i3) {
            return eweVar.anchorForOffset(iM30593getStartimpl);
        }
        if (!(z ^ z2) ? i2 >= iM30593getStartimpl : i2 > iM30588getEndimpl) {
            iM30593getStartimpl = iM30588getEndimpl;
        }
        return eweVar.anchorForOffset(iM30593getStartimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gwe.C6633a updateSelectionBoundary(vwe vweVar, ewe eweVar, gwe.C6633a c6633a) {
        int rawStartHandleOffset = vweVar.isStartHandle() ? eweVar.getRawStartHandleOffset() : eweVar.getRawEndHandleOffset();
        if ((vweVar.isStartHandle() ? vweVar.getStartSlot() : vweVar.getEndSlot()) != eweVar.getSlot()) {
            return eweVar.anchorForOffset(rawStartHandleOffset);
        }
        g39 g39Var = g39.f38327c;
        fx8 fx8VarLazy = hz8.lazy(g39Var, (ny6) new C10095b(eweVar, rawStartHandleOffset));
        fx8 fx8VarLazy2 = hz8.lazy(g39Var, (ny6) new C10094a(eweVar, rawStartHandleOffset, vweVar.isStartHandle() ? eweVar.getRawEndHandleOffset() : eweVar.getRawStartHandleOffset(), vweVar, fx8VarLazy));
        if (eweVar.getSelectableId() != c6633a.getSelectableId()) {
            return updateSelectionBoundary$lambda$1(fx8VarLazy2);
        }
        int rawPreviousHandleOffset = eweVar.getRawPreviousHandleOffset();
        if (rawStartHandleOffset == rawPreviousHandleOffset) {
            return c6633a;
        }
        if (updateSelectionBoundary$lambda$0(fx8VarLazy) != eweVar.getTextLayoutResult().getLineForOffset(rawPreviousHandleOffset)) {
            return updateSelectionBoundary$lambda$1(fx8VarLazy2);
        }
        int offset = c6633a.getOffset();
        long jM30131getWordBoundaryjx7JFs = eweVar.getTextLayoutResult().m30131getWordBoundaryjx7JFs(offset);
        return !isExpanding(eweVar, rawStartHandleOffset, vweVar.isStartHandle()) ? eweVar.anchorForOffset(rawStartHandleOffset) : (offset == jvg.m30593getStartimpl(jM30131getWordBoundaryjx7JFs) || offset == jvg.m30588getEndimpl(jM30131getWordBoundaryjx7JFs)) ? updateSelectionBoundary$lambda$1(fx8VarLazy2) : eweVar.anchorForOffset(rawStartHandleOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateSelectionBoundary$lambda$0(fx8<Integer> fx8Var) {
        return fx8Var.getValue().intValue();
    }

    private static final gwe.C6633a updateSelectionBoundary$lambda$1(fx8<gwe.C6633a> fx8Var) {
        return fx8Var.getValue();
    }
}
