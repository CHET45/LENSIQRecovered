package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class q08<T> {

    /* JADX INFO: renamed from: a */
    public final int f72684a;

    /* JADX INFO: renamed from: b */
    public final T f72685b;

    public q08(int i, T t) {
        this.f72684a = i;
        this.f72685b = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q08 copy$default(q08 q08Var, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = q08Var.f72684a;
        }
        if ((i2 & 2) != 0) {
            obj = q08Var.f72685b;
        }
        return q08Var.copy(i, obj);
    }

    public final int component1() {
        return this.f72684a;
    }

    public final T component2() {
        return this.f72685b;
    }

    @yfb
    public final q08<T> copy(int i, T t) {
        return new q08<>(i, t);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q08)) {
            return false;
        }
        q08 q08Var = (q08) obj;
        return this.f72684a == q08Var.f72684a && md8.areEqual(this.f72685b, q08Var.f72685b);
    }

    public final int getIndex() {
        return this.f72684a;
    }

    public final T getValue() {
        return this.f72685b;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f72684a) * 31;
        T t = this.f72685b;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    @yfb
    public String toString() {
        return "IndexedValue(index=" + this.f72684a + ", value=" + this.f72685b + ')';
    }
}
