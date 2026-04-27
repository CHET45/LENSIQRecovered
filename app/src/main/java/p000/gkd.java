package p000;

/* JADX INFO: loaded from: classes.dex */
public final class gkd implements y03, b58 {

    /* JADX INFO: renamed from: a */
    public final float f40021a;

    public gkd(float f) {
        this.f40021a = f;
    }

    private final float component1() {
        return this.f40021a;
    }

    public static /* synthetic */ gkd copy$default(gkd gkdVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = gkdVar.f40021a;
        }
        return gkdVar.copy(f);
    }

    @yfb
    public final gkd copy(float f) {
        return new gkd(f);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gkd) && Float.compare(this.f40021a, ((gkd) obj).f40021a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f40021a);
    }

    @Override // p000.y03
    /* JADX INFO: renamed from: toPx-TmRCtEA, reason: not valid java name */
    public float mo29740toPxTmRCtEA(long j, @yfb c64 c64Var) {
        return this.f40021a;
    }

    @yfb
    public String toString() {
        return "CornerSize(size = " + this.f40021a + ".px)";
    }

    @Override // p000.b58
    @yfb
    public String getValueOverride() {
        return this.f40021a + "px";
    }
}
