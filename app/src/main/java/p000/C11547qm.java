package p000;

import androidx.compose.foundation.layout.C0621a;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: renamed from: qm */
/* JADX INFO: loaded from: classes.dex */
public final class C11547qm extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: X */
    @yfb
    public AbstractC9938nm f74891X;

    /* JADX INFO: renamed from: Y */
    public long f74892Y;

    /* JADX INFO: renamed from: Z */
    public long f74893Z;

    public /* synthetic */ C11547qm(AbstractC9938nm abstractC9938nm, long j, long j2, jt3 jt3Var) {
        this(abstractC9938nm, j, j2);
    }

    /* JADX INFO: renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m31942getAfterXSAIIZE() {
        return this.f74893Z;
    }

    @yfb
    public final AbstractC9938nm getAlignmentLine() {
        return this.f74891X;
    }

    /* JADX INFO: renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m31943getBeforeXSAIIZE() {
        return this.f74892Y;
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        return C0621a.m27379alignmentLineOffsetMeasuretjqqzMA(interfaceC0761n, this.f74891X, !kwg.m30790isUnspecifiedR2X_6o(this.f74892Y) ? interfaceC0761n.mo27168toDpGaN1DYA(this.f74892Y) : kn4.f54774b.m30725getUnspecifiedD9Ej5fM(), !kwg.m30790isUnspecifiedR2X_6o(this.f74893Z) ? interfaceC0761n.mo27168toDpGaN1DYA(this.f74893Z) : kn4.f54774b.m30725getUnspecifiedD9Ej5fM(), rbaVar, j);
    }

    /* JADX INFO: renamed from: setAfter--R2X_6o, reason: not valid java name */
    public final void m31944setAfterR2X_6o(long j) {
        this.f74893Z = j;
    }

    public final void setAlignmentLine(@yfb AbstractC9938nm abstractC9938nm) {
        this.f74891X = abstractC9938nm;
    }

    /* JADX INFO: renamed from: setBefore--R2X_6o, reason: not valid java name */
    public final void m31945setBeforeR2X_6o(long j) {
        this.f74892Y = j;
    }

    private C11547qm(AbstractC9938nm abstractC9938nm, long j, long j2) {
        this.f74891X = abstractC9938nm;
        this.f74892Y = j;
        this.f74893Z = j2;
    }
}
