package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class ire {

    /* JADX INFO: renamed from: d */
    public static final int f48097d = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ny6<Float> f48098a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ny6<Float> f48099b;

    /* JADX INFO: renamed from: c */
    public final boolean f48100c;

    public ire(@yfb ny6<Float> ny6Var, @yfb ny6<Float> ny6Var2, boolean z) {
        this.f48098a = ny6Var;
        this.f48099b = ny6Var2;
        this.f48100c = z;
    }

    @yfb
    public final ny6<Float> getMaxValue() {
        return this.f48099b;
    }

    public final boolean getReverseScrolling() {
        return this.f48100c;
    }

    @yfb
    public final ny6<Float> getValue() {
        return this.f48098a;
    }

    @yfb
    public String toString() {
        return "ScrollAxisRange(value=" + this.f48098a.invoke().floatValue() + ", maxValue=" + this.f48099b.invoke().floatValue() + ", reverseScrolling=" + this.f48100c + ')';
    }

    public /* synthetic */ ire(ny6 ny6Var, ny6 ny6Var2, boolean z, int i, jt3 jt3Var) {
        this(ny6Var, ny6Var2, (i & 4) != 0 ? false : z);
    }
}
