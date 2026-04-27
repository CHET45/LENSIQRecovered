package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCornerSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerSize.kt\nandroidx/compose/foundation/shape/DpCornerSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
public final class ln4 implements y03, b58 {

    /* JADX INFO: renamed from: a */
    public final float f58294a;

    public /* synthetic */ ln4(float f, jt3 jt3Var) {
        this(f);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m30875component1D9Ej5fM() {
        return this.f58294a;
    }

    /* JADX INFO: renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ ln4 m30876copy0680j_4$default(ln4 ln4Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ln4Var.f58294a;
        }
        return ln4Var.m30877copy0680j_4(f);
    }

    @yfb
    /* JADX INFO: renamed from: copy-0680j_4, reason: not valid java name */
    public final ln4 m30877copy0680j_4(float f) {
        return new ln4(f, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln4) && kn4.m30710equalsimpl0(this.f58294a, ((ln4) obj).f58294a);
    }

    @Override // p000.b58
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return kn4.m30703boximpl(m30878getValueOverrideD9Ej5fM());
    }

    /* JADX INFO: renamed from: getValueOverride-D9Ej5fM, reason: not valid java name */
    public float m30878getValueOverrideD9Ej5fM() {
        return this.f58294a;
    }

    public int hashCode() {
        return kn4.m30711hashCodeimpl(this.f58294a);
    }

    @Override // p000.y03
    /* JADX INFO: renamed from: toPx-TmRCtEA */
    public float mo29740toPxTmRCtEA(long j, @yfb c64 c64Var) {
        return c64Var.mo27173toPx0680j_4(this.f58294a);
    }

    @yfb
    public String toString() {
        return "CornerSize(size = " + this.f58294a + ".dp)";
    }

    private ln4(float f) {
        this.f58294a = f;
    }
}
