package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class o58<T> implements ho5<T>, ex8<T> {

    /* JADX INFO: renamed from: b */
    public static final o58<Object> f66494b = new o58<>(null);

    /* JADX INFO: renamed from: a */
    public final T f66495a;

    private o58(T t) {
        this.f66495a = t;
    }

    public static <T> ho5<T> create(T t) {
        return new o58(y7d.checkNotNull(t, "instance cannot be null"));
    }

    public static <T> ho5<T> createNullable(T t) {
        return t == null ? nullInstanceFactory() : new o58(t);
    }

    private static <T> o58<T> nullInstanceFactory() {
        return (o58<T>) f66494b;
    }

    @Override // p000.gid
    public T get() {
        return this.f66495a;
    }
}
