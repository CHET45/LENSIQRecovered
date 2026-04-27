package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidDensity.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDensity.android.kt\nandroidx/compose/ui/unit/DensityWithConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public final class g64 implements c64 {

    /* JADX INFO: renamed from: a */
    public final float f38879a;

    /* JADX INFO: renamed from: b */
    public final float f38880b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final ap6 f38881c;

    public g64(float f, float f2, @yfb ap6 ap6Var) {
        this.f38879a = f;
        this.f38880b = f2;
        this.f38881c = ap6Var;
    }

    private final ap6 component3() {
        return this.f38881c;
    }

    public static /* synthetic */ g64 copy$default(g64 g64Var, float f, float f2, ap6 ap6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = g64Var.f38879a;
        }
        if ((i & 2) != 0) {
            f2 = g64Var.f38880b;
        }
        if ((i & 4) != 0) {
            ap6Var = g64Var.f38881c;
        }
        return g64Var.copy(f, f2, ap6Var);
    }

    public final float component1() {
        return this.f38879a;
    }

    public final float component2() {
        return this.f38880b;
    }

    @yfb
    public final g64 copy(float f, float f2, @yfb ap6 ap6Var) {
        return new g64(f, f2, ap6Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g64)) {
            return false;
        }
        g64 g64Var = (g64) obj;
        return Float.compare(this.f38879a, g64Var.f38879a) == 0 && Float.compare(this.f38880b, g64Var.f38880b) == 0 && md8.areEqual(this.f38881c, g64Var.f38881c);
    }

    @Override // p000.c64
    public float getDensity() {
        return this.f38879a;
    }

    @Override // p000.dp6
    public float getFontScale() {
        return this.f38880b;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f38879a) * 31) + Float.hashCode(this.f38880b)) * 31) + this.f38881c.hashCode();
    }

    @Override // p000.dp6
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo27168toDpGaN1DYA(long j) {
        if (lwg.m30918equalsimpl0(jwg.m30612getTypeUIouoOA(j), lwg.f59101b.m30923getSpUIouoOA())) {
            return kn4.m30705constructorimpl(this.f38881c.convertSpToDp(jwg.m30613getValueimpl(j)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // p000.dp6
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo27175toSp0xMU5do(float f) {
        return kwg.getSp(this.f38881c.convertDpToSp(f));
    }

    @yfb
    public String toString() {
        return "DensityWithConverter(density=" + this.f38879a + ", fontScale=" + this.f38880b + ", converter=" + this.f38881c + ')';
    }
}
