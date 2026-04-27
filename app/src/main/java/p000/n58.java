package p000;

/* JADX INFO: loaded from: classes4.dex */
public final class n58<T> implements go5<T>, cx8<T> {

    /* JADX INFO: renamed from: b */
    public static final n58<Object> f63339b = new n58<>(null);

    /* JADX INFO: renamed from: a */
    public final T f63340a;

    private n58(T t) {
        this.f63340a = t;
    }

    public static <T> go5<T> create(T t) {
        return new n58(u7d.checkNotNull(t, "instance cannot be null"));
    }

    public static <T> go5<T> createNullable(T t) {
        return t == null ? nullInstanceFactory() : new n58(t);
    }

    private static <T> n58<T> nullInstanceFactory() {
        return (n58<T>) f63339b;
    }

    @Override // p000.gid
    public T get() {
        return this.f63340a;
    }
}
