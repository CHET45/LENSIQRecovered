package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class lo5 {

    /* JADX INFO: renamed from: c */
    public static final int f58358c = 0;

    /* JADX INFO: renamed from: a */
    public final float f58359a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final fw5<Float> f58360b;

    public lo5(float f, @yfb fw5<Float> fw5Var) {
        this.f58359a = f;
        this.f58360b = fw5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ lo5 copy$default(lo5 lo5Var, float f, fw5 fw5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = lo5Var.f58359a;
        }
        if ((i & 2) != 0) {
            fw5Var = lo5Var.f58360b;
        }
        return lo5Var.copy(f, fw5Var);
    }

    public final float component1() {
        return this.f58359a;
    }

    @yfb
    public final fw5<Float> component2() {
        return this.f58360b;
    }

    @yfb
    public final lo5 copy(float f, @yfb fw5<Float> fw5Var) {
        return new lo5(f, fw5Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo5)) {
            return false;
        }
        lo5 lo5Var = (lo5) obj;
        return Float.compare(this.f58359a, lo5Var.f58359a) == 0 && md8.areEqual(this.f58360b, lo5Var.f58360b);
    }

    public final float getAlpha() {
        return this.f58359a;
    }

    @yfb
    public final fw5<Float> getAnimationSpec() {
        return this.f58360b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f58359a) * 31) + this.f58360b.hashCode();
    }

    @yfb
    public String toString() {
        return "Fade(alpha=" + this.f58359a + ", animationSpec=" + this.f58360b + ')';
    }
}
