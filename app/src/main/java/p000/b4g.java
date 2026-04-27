package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class b4g<T> implements l2i<T> {

    /* JADX INFO: renamed from: b */
    public static final int f12683b = 0;

    /* JADX INFO: renamed from: a */
    public final T f12684a;

    public b4g(T t) {
        this.f12684a = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b4g copy$default(b4g b4gVar, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = b4gVar.f12684a;
        }
        return b4gVar.copy(obj);
    }

    public final T component1() {
        return this.f12684a;
    }

    @yfb
    public final b4g<T> copy(T t) {
        return new b4g<>(t);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4g) && md8.areEqual(this.f12684a, ((b4g) obj).f12684a);
    }

    public final T getValue() {
        return this.f12684a;
    }

    public int hashCode() {
        T t = this.f12684a;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    @Override // p000.l2i
    public T readValue(@yfb qqc qqcVar) {
        return this.f12684a;
    }

    @Override // p000.l2i
    @yfb
    public did<T> toProvided(@yfb kn2<T> kn2Var) {
        T t = this.f12684a;
        return new did<>(kn2Var, t, t == null, null, null, null, false);
    }

    @yfb
    public String toString() {
        return "StaticValueHolder(value=" + this.f12684a + ')';
    }
}
