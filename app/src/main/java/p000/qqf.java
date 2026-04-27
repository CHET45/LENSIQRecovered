package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class qqf {

    /* JADX INFO: renamed from: c */
    public static final int f75138c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<r78, a78> f75139a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final fw5<a78> f75140b;

    /* JADX WARN: Multi-variable type inference failed */
    public qqf(@yfb qy6<? super r78, a78> qy6Var, @yfb fw5<a78> fw5Var) {
        this.f75139a = qy6Var;
        this.f75140b = fw5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ qqf copy$default(qqf qqfVar, qy6 qy6Var, fw5 fw5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            qy6Var = qqfVar.f75139a;
        }
        if ((i & 2) != 0) {
            fw5Var = qqfVar.f75140b;
        }
        return qqfVar.copy(qy6Var, fw5Var);
    }

    @yfb
    public final qy6<r78, a78> component1() {
        return this.f75139a;
    }

    @yfb
    public final fw5<a78> component2() {
        return this.f75140b;
    }

    @yfb
    public final qqf copy(@yfb qy6<? super r78, a78> qy6Var, @yfb fw5<a78> fw5Var) {
        return new qqf(qy6Var, fw5Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqf)) {
            return false;
        }
        qqf qqfVar = (qqf) obj;
        return md8.areEqual(this.f75139a, qqfVar.f75139a) && md8.areEqual(this.f75140b, qqfVar.f75140b);
    }

    @yfb
    public final fw5<a78> getAnimationSpec() {
        return this.f75140b;
    }

    @yfb
    public final qy6<r78, a78> getSlideOffset() {
        return this.f75139a;
    }

    public int hashCode() {
        return (this.f75139a.hashCode() * 31) + this.f75140b.hashCode();
    }

    @yfb
    public String toString() {
        return "Slide(slideOffset=" + this.f75139a + ", animationSpec=" + this.f75140b + ')';
    }
}
