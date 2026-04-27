package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class mrh implements dm9 {

    /* JADX INFO: renamed from: b */
    public static final int f61892b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final i2g<Long> f61893a;

    public mrh(@yfb i2g<Long> i2gVar) {
        this.f61893a = i2gVar;
    }

    @Override // p000.dm9
    public long getLongValue() {
        return this.f61893a.getValue().longValue();
    }

    @yfb
    public String toString() {
        return "UnboxedLongState(baseState=" + this.f61893a + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.dm9, p000.i2g
    @yfb
    public Long getValue() {
        return this.f61893a.getValue();
    }
}
