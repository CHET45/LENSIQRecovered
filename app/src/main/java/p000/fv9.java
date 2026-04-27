package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fv9 implements n72 {

    /* JADX INFO: renamed from: b */
    public final char f37812b;

    public fv9(char c) {
        this.f37812b = c;
    }

    public static /* synthetic */ fv9 copy$default(fv9 fv9Var, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            c = fv9Var.f37812b;
        }
        return fv9Var.copy(c);
    }

    public final char component1() {
        return this.f37812b;
    }

    @yfb
    public final fv9 copy(char c) {
        return new fv9(c);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fv9) && this.f37812b == ((fv9) obj).f37812b;
    }

    public final char getCharacter() {
        return this.f37812b;
    }

    public int hashCode() {
        return Character.hashCode(this.f37812b);
    }

    @yfb
    public String toString() {
        return "MaskCodepointTransformation(character=" + this.f37812b + ')';
    }

    @Override // p000.n72
    public int transform(int i, int i2) {
        return this.f37812b;
    }
}
