package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class p58<T> implements jo5<T>, gx8<T> {

    /* JADX INFO: renamed from: b */
    public static final p58<Object> f69725b = new p58<>(null);

    /* JADX INFO: renamed from: a */
    public final T f69726a;

    private p58(T t) {
        this.f69726a = t;
    }

    public static <T> jo5<T> create(T t) {
        return new p58(s7d.checkNotNull(t, "instance cannot be null"));
    }

    public static <T> jo5<T> createNullable(T t) {
        return t == null ? nullInstanceFactory() : new p58(t);
    }

    private static <T> p58<T> nullInstanceFactory() {
        return (p58<T>) f69725b;
    }

    @Override // p000.hid
    public T get() {
        return this.f69726a;
    }
}
