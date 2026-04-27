package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 2)
public final class av4<T> implements l2i<T> {

    /* JADX INFO: renamed from: b */
    public static final int f11916b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final z6b<T> f11917a;

    public av4(@yfb z6b<T> z6bVar) {
        this.f11917a = z6bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ av4 copy$default(av4 av4Var, z6b z6bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z6bVar = av4Var.f11917a;
        }
        return av4Var.copy(z6bVar);
    }

    @yfb
    public final z6b<T> component1() {
        return this.f11917a;
    }

    @yfb
    public final av4<T> copy(@yfb z6b<T> z6bVar) {
        return new av4<>(z6bVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof av4) && md8.areEqual(this.f11917a, ((av4) obj).f11917a);
    }

    @yfb
    public final z6b<T> getState() {
        return this.f11917a;
    }

    public int hashCode() {
        return this.f11917a.hashCode();
    }

    @Override // p000.l2i
    public T readValue(@yfb qqc qqcVar) {
        return this.f11917a.getValue();
    }

    @Override // p000.l2i
    @yfb
    public did<T> toProvided(@yfb kn2<T> kn2Var) {
        return new did<>(kn2Var, null, false, null, this.f11917a, null, true);
    }

    @yfb
    public String toString() {
        return "DynamicValueHolder(state=" + this.f11917a + ')';
    }
}
