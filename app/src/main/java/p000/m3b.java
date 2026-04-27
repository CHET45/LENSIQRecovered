package p000;

import p000.gwe;
import p000.izb;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class m3b implements cwe {

    /* JADX INFO: renamed from: f */
    public static final int f59826f = 8;

    /* JADX INFO: renamed from: a */
    public final long f59827a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ny6<mv8> f59828b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final ny6<hug> f59829c;

    /* JADX INFO: renamed from: d */
    @gib
    public hug f59830d;

    /* JADX INFO: renamed from: e */
    public int f59831e = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public m3b(long j, @yfb ny6<? extends mv8> ny6Var, @yfb ny6<hug> ny6Var2) {
        this.f59827a = j;
        this.f59828b = ny6Var;
        this.f59829c = ny6Var2;
    }

    private final synchronized int getLastVisibleOffset(hug hugVar) {
        int lineCount;
        try {
            if (this.f59830d != hugVar) {
                if (!hugVar.getDidOverflowHeight() || hugVar.getMultiParagraph().getDidExceedMaxLines()) {
                    lineCount = hugVar.getLineCount() - 1;
                } else {
                    int iCoerceAtMost = kpd.coerceAtMost(hugVar.getLineForVerticalPosition(r78.m32086getHeightimpl(hugVar.m30130getSizeYbymL2g())), hugVar.getLineCount() - 1);
                    while (iCoerceAtMost >= 0 && hugVar.getLineTop(iCoerceAtMost) >= r78.m32086getHeightimpl(hugVar.m30130getSizeYbymL2g())) {
                        iCoerceAtMost--;
                    }
                    lineCount = kpd.coerceAtLeast(iCoerceAtMost, 0);
                }
                this.f59831e = hugVar.getLineEnd(lineCount, true);
                this.f59830d = hugVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f59831e;
    }

    @Override // p000.cwe
    public void appendSelectableInfoToBuilder(@yfb wwe wweVar) {
        hug hugVarInvoke;
        mv8 layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null || (hugVarInvoke = this.f59829c.invoke()) == null) {
            return;
        }
        mv8 containerCoordinates = wweVar.getContainerCoordinates();
        izb.C7673a c7673a = izb.f49009b;
        long jMo30034localPositionOfR5De75A = containerCoordinates.mo30034localPositionOfR5De75A(layoutCoordinates, c7673a.m30445getZeroF1C5BW0());
        n3b.m31120appendSelectableInfoParwq6A(wweVar, hugVarInvoke, izb.m30433minusMKHz9U(wweVar.m33120getCurrentPositionF1C5BW0(), jMo30034localPositionOfR5De75A), mzb.m31102isUnspecifiedk4lQ0M(wweVar.m33121getPreviousHandlePositionF1C5BW0()) ? c7673a.m30444getUnspecifiedF1C5BW0() : izb.m30433minusMKHz9U(wweVar.m33121getPreviousHandlePositionF1C5BW0(), jMo30034localPositionOfR5De75A), getSelectableId());
    }

    @Override // p000.cwe
    @yfb
    public rud getBoundingBox(int i) {
        int length;
        hug hugVarInvoke = this.f59829c.invoke();
        if (hugVarInvoke != null && (length = hugVarInvoke.getLayoutInput().getText().length()) >= 1) {
            return hugVarInvoke.getBoundingBox(kpd.coerceIn(i, 0, length - 1));
        }
        return rud.f79687e.getZero();
    }

    @Override // p000.cwe
    public float getCenterYForOffset(int i) {
        int lineForOffset;
        hug hugVarInvoke = this.f59829c.invoke();
        if (hugVarInvoke == null || (lineForOffset = hugVarInvoke.getLineForOffset(i)) >= hugVarInvoke.getLineCount()) {
            return -1.0f;
        }
        float lineTop = hugVarInvoke.getLineTop(lineForOffset);
        return ((hugVarInvoke.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop;
    }

    @Override // p000.cwe
    /* JADX INFO: renamed from: getHandlePosition-dBAh8RU */
    public long mo28556getHandlePositiondBAh8RU(@yfb gwe gweVar, boolean z) {
        hug hugVarInvoke;
        if ((z && gweVar.getStart().getSelectableId() != getSelectableId()) || (!z && gweVar.getEnd().getSelectableId() != getSelectableId())) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        if (getLayoutCoordinates() != null && (hugVarInvoke = this.f59829c.invoke()) != null) {
            return uvg.getSelectionHandleCoordinates(hugVarInvoke, kpd.coerceIn((z ? gweVar.getStart() : gweVar.getEnd()).getOffset(), 0, getLastVisibleOffset(hugVarInvoke)), z, gweVar.getHandlesCrossed());
        }
        return izb.f49009b.m30444getUnspecifiedF1C5BW0();
    }

    @Override // p000.cwe
    @gib
    public mv8 getLayoutCoordinates() {
        mv8 mv8VarInvoke = this.f59828b.invoke();
        if (mv8VarInvoke == null || !mv8VarInvoke.isAttached()) {
            return null;
        }
        return mv8VarInvoke;
    }

    @Override // p000.cwe
    public float getLineLeft(int i) {
        int lineForOffset;
        hug hugVarInvoke = this.f59829c.invoke();
        if (hugVarInvoke != null && (lineForOffset = hugVarInvoke.getLineForOffset(i)) < hugVarInvoke.getLineCount()) {
            return hugVarInvoke.getLineLeft(lineForOffset);
        }
        return -1.0f;
    }

    @Override // p000.cwe
    public float getLineRight(int i) {
        int lineForOffset;
        hug hugVarInvoke = this.f59829c.invoke();
        if (hugVarInvoke != null && (lineForOffset = hugVarInvoke.getLineForOffset(i)) < hugVarInvoke.getLineCount()) {
            return hugVarInvoke.getLineRight(lineForOffset);
        }
        return -1.0f;
    }

    @Override // p000.cwe
    /* JADX INFO: renamed from: getRangeOfLineContaining--jx7JFs */
    public long mo28557getRangeOfLineContainingjx7JFs(int i) {
        int lastVisibleOffset;
        hug hugVarInvoke = this.f59829c.invoke();
        if (hugVarInvoke != null && (lastVisibleOffset = getLastVisibleOffset(hugVarInvoke)) >= 1) {
            int lineForOffset = hugVarInvoke.getLineForOffset(kpd.coerceIn(i, 0, lastVisibleOffset - 1));
            return kvg.TextRange(hugVarInvoke.getLineStart(lineForOffset), hugVarInvoke.getLineEnd(lineForOffset, true));
        }
        return jvg.f52112b.m30598getZerod9O1mEE();
    }

    @Override // p000.cwe
    @gib
    public gwe getSelectAllSelection() {
        hug hugVarInvoke = this.f59829c.invoke();
        if (hugVarInvoke == null) {
            return null;
        }
        int length = hugVarInvoke.getLayoutInput().getText().length();
        return new gwe(new gwe.C6633a(hugVarInvoke.getBidiRunDirection(0), 0, getSelectableId()), new gwe.C6633a(hugVarInvoke.getBidiRunDirection(Math.max(length - 1, 0)), length, getSelectableId()), false);
    }

    @Override // p000.cwe
    public long getSelectableId() {
        return this.f59827a;
    }

    @Override // p000.cwe
    @yfb
    public C9041lz getText() {
        hug hugVarInvoke = this.f59829c.invoke();
        return hugVarInvoke == null ? new C9041lz("", null, null, 6, null) : hugVarInvoke.getLayoutInput().getText();
    }

    @Override // p000.cwe
    public int getLastVisibleOffset() {
        hug hugVarInvoke = this.f59829c.invoke();
        if (hugVarInvoke == null) {
            return 0;
        }
        return getLastVisibleOffset(hugVarInvoke);
    }
}
