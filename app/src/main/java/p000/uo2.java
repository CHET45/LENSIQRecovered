package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 2)
public final class uo2<T> implements l2i<T> {

    /* JADX INFO: renamed from: b */
    public static final int f88667b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<ln2, T> f88668a;

    /* JADX WARN: Multi-variable type inference failed */
    public uo2(@yfb qy6<? super ln2, ? extends T> qy6Var) {
        this.f88668a = qy6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ uo2 copy$default(uo2 uo2Var, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            qy6Var = uo2Var.f88668a;
        }
        return uo2Var.copy(qy6Var);
    }

    @yfb
    public final qy6<ln2, T> component1() {
        return this.f88668a;
    }

    @yfb
    public final uo2<T> copy(@yfb qy6<? super ln2, ? extends T> qy6Var) {
        return new uo2<>(qy6Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uo2) && md8.areEqual(this.f88668a, ((uo2) obj).f88668a);
    }

    @yfb
    public final qy6<ln2, T> getCompute() {
        return this.f88668a;
    }

    public int hashCode() {
        return this.f88668a.hashCode();
    }

    @Override // p000.l2i
    public T readValue(@yfb qqc qqcVar) {
        return this.f88668a.invoke(qqcVar);
    }

    @Override // p000.l2i
    @yfb
    public did<T> toProvided(@yfb kn2<T> kn2Var) {
        return new did<>(kn2Var, null, false, null, null, this.f88668a, false);
    }

    @yfb
    public String toString() {
        return "ComputedValueHolder(compute=" + this.f88668a + ')';
    }
}
