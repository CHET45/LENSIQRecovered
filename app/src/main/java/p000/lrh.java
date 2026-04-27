package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class lrh implements w78 {

    /* JADX INFO: renamed from: b */
    public static final int f58568b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final i2g<Integer> f58569a;

    public lrh(@yfb i2g<Integer> i2gVar) {
        this.f58569a = i2gVar;
    }

    @Override // p000.w78
    public int getIntValue() {
        return this.f58569a.getValue().intValue();
    }

    @yfb
    public String toString() {
        return "UnboxedIntState(baseState=" + this.f58569a + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.w78, p000.i2g
    @yfb
    public Integer getValue() {
        return this.f58569a.getValue();
    }
}
