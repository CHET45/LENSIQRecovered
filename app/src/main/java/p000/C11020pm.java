package p000;

import androidx.compose.foundation.layout.C0621a;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: renamed from: pm */
/* JADX INFO: loaded from: classes.dex */
public final class C11020pm extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: X */
    @yfb
    public AbstractC9938nm f71360X;

    /* JADX INFO: renamed from: Y */
    public float f71361Y;

    /* JADX INFO: renamed from: Z */
    public float f71362Z;

    public /* synthetic */ C11020pm(AbstractC9938nm abstractC9938nm, float f, float f2, jt3 jt3Var) {
        this(abstractC9938nm, f, f2);
    }

    /* JADX INFO: renamed from: getAfter-D9Ej5fM, reason: not valid java name */
    public final float m31782getAfterD9Ej5fM() {
        return this.f71362Z;
    }

    @yfb
    public final AbstractC9938nm getAlignmentLine() {
        return this.f71360X;
    }

    /* JADX INFO: renamed from: getBefore-D9Ej5fM, reason: not valid java name */
    public final float m31783getBeforeD9Ej5fM() {
        return this.f71361Y;
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        return C0621a.m27379alignmentLineOffsetMeasuretjqqzMA(interfaceC0761n, this.f71360X, this.f71361Y, this.f71362Z, rbaVar, j);
    }

    /* JADX INFO: renamed from: setAfter-0680j_4, reason: not valid java name */
    public final void m31784setAfter0680j_4(float f) {
        this.f71362Z = f;
    }

    public final void setAlignmentLine(@yfb AbstractC9938nm abstractC9938nm) {
        this.f71360X = abstractC9938nm;
    }

    /* JADX INFO: renamed from: setBefore-0680j_4, reason: not valid java name */
    public final void m31785setBefore0680j_4(float f) {
        this.f71361Y = f;
    }

    private C11020pm(AbstractC9938nm abstractC9938nm, float f, float f2) {
        this.f71360X = abstractC9938nm;
        this.f71361Y = f;
        this.f71362Z = f2;
    }
}
