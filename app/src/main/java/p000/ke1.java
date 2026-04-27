package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ke1 implements btg {

    /* JADX INFO: renamed from: b */
    @yfb
    public final a8f f53684b;

    /* JADX INFO: renamed from: c */
    public final float f53685c;

    public ke1(@yfb a8f a8fVar, float f) {
        this.f53684b = a8fVar;
        this.f53685c = f;
    }

    public static /* synthetic */ ke1 copy$default(ke1 ke1Var, a8f a8fVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            a8fVar = ke1Var.f53684b;
        }
        if ((i & 2) != 0) {
            f = ke1Var.f53685c;
        }
        return ke1Var.copy(a8fVar, f);
    }

    @yfb
    public final a8f component1() {
        return this.f53684b;
    }

    public final float component2() {
        return this.f53685c;
    }

    @yfb
    public final ke1 copy(@yfb a8f a8fVar, float f) {
        return new ke1(a8fVar, f);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke1)) {
            return false;
        }
        ke1 ke1Var = (ke1) obj;
        return md8.areEqual(this.f53684b, ke1Var.f53684b) && Float.compare(this.f53685c, ke1Var.f53685c) == 0;
    }

    @Override // p000.btg
    public float getAlpha() {
        return this.f53685c;
    }

    @Override // p000.btg
    @yfb
    public he1 getBrush() {
        return this.f53684b;
    }

    @Override // p000.btg
    /* JADX INFO: renamed from: getColor-0d7_KjU */
    public long mo28155getColor0d7_KjU() {
        return w82.f93556b.m32987getUnspecified0d7_KjU();
    }

    @yfb
    public final a8f getValue() {
        return this.f53684b;
    }

    public int hashCode() {
        return (this.f53684b.hashCode() * 31) + Float.hashCode(this.f53685c);
    }

    @yfb
    public String toString() {
        return "BrushStyle(value=" + this.f53684b + ", alpha=" + this.f53685c + ')';
    }
}
