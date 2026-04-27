package p000;

/* JADX INFO: loaded from: classes8.dex */
public class df8<T> extends wr0<T> {

    /* JADX INFO: renamed from: a */
    public final yv9<T> f29564a;

    public df8(yv9<T> yv9Var) {
        this.f29564a = yv9Var;
    }

    @io5
    /* JADX INFO: renamed from: is */
    public static <T> yv9<T> m9124is(yv9<T> yv9Var) {
        return new df8(yv9Var);
    }

    @io5
    public static <T> yv9<T> isA(Class<T> cls) {
        return m9124is(nf8.instanceOf(cls));
    }

    @Override // p000.wr0, p000.yv9
    public void describeMismatch(Object obj, i74 i74Var) {
        this.f29564a.describeMismatch(obj, i74Var);
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendText("is ").appendDescriptionOf(this.f29564a);
    }

    @Override // p000.yv9
    public boolean matches(Object obj) {
        return this.f29564a.matches(obj);
    }

    @io5
    /* JADX INFO: renamed from: is */
    public static <T> yv9<T> m9123is(T t) {
        return m9124is(mf8.equalTo(t));
    }

    @io5
    @Deprecated
    /* JADX INFO: renamed from: is */
    public static <T> yv9<T> m9122is(Class<T> cls) {
        return m9124is(nf8.instanceOf(cls));
    }
}
