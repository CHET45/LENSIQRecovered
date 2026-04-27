package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p69 implements ap6 {

    /* JADX INFO: renamed from: a */
    public final float f69843a;

    public p69(float f) {
        this.f69843a = f;
    }

    private final float component1() {
        return this.f69843a;
    }

    public static /* synthetic */ p69 copy$default(p69 p69Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = p69Var.f69843a;
        }
        return p69Var.copy(f);
    }

    @Override // p000.ap6
    public float convertDpToSp(float f) {
        return f / this.f69843a;
    }

    @Override // p000.ap6
    public float convertSpToDp(float f) {
        return f * this.f69843a;
    }

    @yfb
    public final p69 copy(float f) {
        return new p69(f);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p69) && Float.compare(this.f69843a, ((p69) obj).f69843a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f69843a);
    }

    @yfb
    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f69843a + ')';
    }
}
