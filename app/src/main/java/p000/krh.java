package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class krh implements f56 {

    /* JADX INFO: renamed from: b */
    public static final int f55187b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final i2g<Float> f55188a;

    public krh(@yfb i2g<Float> i2gVar) {
        this.f55188a = i2gVar;
    }

    @Override // p000.f56
    public float getFloatValue() {
        return this.f55188a.getValue().floatValue();
    }

    @yfb
    public String toString() {
        return "UnboxedFloatState(baseState=" + this.f55188a + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.f56, p000.i2g
    @yfb
    public Float getValue() {
        return this.f55188a.getValue();
    }
}
