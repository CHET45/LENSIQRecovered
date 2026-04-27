package p000;

import androidx.compose.foundation.layout.C0629e;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
public final class vc1 implements uc1, sc1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final c64 f90581a;

    /* JADX INFO: renamed from: b */
    public final long f90582b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0629e f90583c;

    public /* synthetic */ vc1(c64 c64Var, long j, jt3 jt3Var) {
        this(c64Var, j);
    }

    private final c64 component1() {
        return this.f90581a;
    }

    /* JADX INFO: renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ vc1 m32760copy0kLqBqw$default(vc1 vc1Var, c64 c64Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            c64Var = vc1Var.f90581a;
        }
        if ((i & 2) != 0) {
            j = vc1Var.f90582b;
        }
        return vc1Var.m32762copy0kLqBqw(c64Var, j);
    }

    @Override // p000.sc1
    @f0g
    @yfb
    public InterfaceC0701e align(@yfb InterfaceC0701e interfaceC0701e, @yfb InterfaceC9407mm interfaceC9407mm) {
        return this.f90583c.align(interfaceC0701e, interfaceC9407mm);
    }

    /* JADX INFO: renamed from: component2-msEJaDk, reason: not valid java name */
    public final long m32761component2msEJaDk() {
        return this.f90582b;
    }

    @yfb
    /* JADX INFO: renamed from: copy-0kLqBqw, reason: not valid java name */
    public final vc1 m32762copy0kLqBqw(@yfb c64 c64Var, long j) {
        return new vc1(c64Var, j, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc1)) {
            return false;
        }
        vc1 vc1Var = (vc1) obj;
        return md8.areEqual(this.f90581a, vc1Var.f90581a) && ku2.m30756equalsimpl0(this.f90582b, vc1Var.f90582b);
    }

    @Override // p000.uc1
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public long mo32596getConstraintsmsEJaDk() {
        return this.f90582b;
    }

    @Override // p000.uc1
    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM */
    public float mo32597getMaxHeightD9Ej5fM() {
        return ku2.m30758getHasBoundedHeightimpl(mo32596getConstraintsmsEJaDk()) ? this.f90581a.mo27170toDpu2uoSUM(ku2.m30762getMaxHeightimpl(mo32596getConstraintsmsEJaDk())) : kn4.f54774b.m30724getInfinityD9Ej5fM();
    }

    @Override // p000.uc1
    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM */
    public float mo32598getMaxWidthD9Ej5fM() {
        return ku2.m30759getHasBoundedWidthimpl(mo32596getConstraintsmsEJaDk()) ? this.f90581a.mo27170toDpu2uoSUM(ku2.m30763getMaxWidthimpl(mo32596getConstraintsmsEJaDk())) : kn4.f54774b.m30724getInfinityD9Ej5fM();
    }

    @Override // p000.uc1
    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM */
    public float mo32599getMinHeightD9Ej5fM() {
        return this.f90581a.mo27170toDpu2uoSUM(ku2.m30764getMinHeightimpl(mo32596getConstraintsmsEJaDk()));
    }

    @Override // p000.uc1
    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM */
    public float mo32600getMinWidthD9Ej5fM() {
        return this.f90581a.mo27170toDpu2uoSUM(ku2.m30765getMinWidthimpl(mo32596getConstraintsmsEJaDk()));
    }

    public int hashCode() {
        return (this.f90581a.hashCode() * 31) + ku2.m30766hashCodeimpl(this.f90582b);
    }

    @Override // p000.sc1
    @f0g
    @yfb
    public InterfaceC0701e matchParentSize(@yfb InterfaceC0701e interfaceC0701e) {
        return this.f90583c.matchParentSize(interfaceC0701e);
    }

    @yfb
    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f90581a + ", constraints=" + ((Object) ku2.m30768toStringimpl(this.f90582b)) + ')';
    }

    private vc1(c64 c64Var, long j) {
        this.f90581a = c64Var;
        this.f90582b = j;
        this.f90583c = C0629e.f4557a;
    }
}
