package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class jrh implements hk4 {

    /* JADX INFO: renamed from: b */
    public static final int f51639b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final i2g<Double> f51640a;

    public jrh(@yfb i2g<Double> i2gVar) {
        this.f51640a = i2gVar;
    }

    @Override // p000.hk4
    public double getDoubleValue() {
        return this.f51640a.getValue().doubleValue();
    }

    @yfb
    public String toString() {
        return "UnboxedDoubleState(baseState=" + this.f51640a + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.hk4, p000.i2g
    @yfb
    public Double getValue() {
        return this.f51640a.getValue();
    }
}
