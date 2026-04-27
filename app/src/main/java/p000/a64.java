package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class a64 {

    /* JADX INFO: renamed from: b */
    public static final int f495b = 8;

    /* JADX INFO: renamed from: a */
    public int f496a;

    public a64() {
        this(0, 1, null);
    }

    public static /* synthetic */ a64 copy$default(a64 a64Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = a64Var.f496a;
        }
        return a64Var.copy(i);
    }

    public final int component1() {
        return this.f496a;
    }

    @yfb
    public final a64 copy(int i) {
        return new a64(i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a64) && this.f496a == ((a64) obj).f496a;
    }

    public final int getCount() {
        return this.f496a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f496a);
    }

    public final void plusAssign(int i) {
        this.f496a += i;
    }

    public final void setCount(int i) {
        this.f496a = i;
    }

    @yfb
    public String toString() {
        return "DeltaCounter(count=" + this.f496a + ')';
    }

    public a64(int i) {
        this.f496a = i;
    }

    public /* synthetic */ a64(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
