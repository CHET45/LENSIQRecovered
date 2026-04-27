package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class sgd {
    @jjf(version = "1.4")
    @t28
    private static final <V> V getValue(ip8<? extends V> ip8Var, Object obj, hp8<?> hp8Var) {
        md8.checkNotNullParameter(ip8Var, "<this>");
        md8.checkNotNullParameter(hp8Var, "property");
        return ip8Var.get();
    }

    @jjf(version = "1.4")
    @t28
    private static final <V> void setValue(cp8<V> cp8Var, Object obj, hp8<?> hp8Var, V v) {
        md8.checkNotNullParameter(cp8Var, "<this>");
        md8.checkNotNullParameter(hp8Var, "property");
        cp8Var.set(v);
    }

    @jjf(version = "1.4")
    @t28
    private static final <T, V> V getValue(jp8<T, ? extends V> jp8Var, T t, hp8<?> hp8Var) {
        md8.checkNotNullParameter(jp8Var, "<this>");
        md8.checkNotNullParameter(hp8Var, "property");
        return jp8Var.get(t);
    }

    @jjf(version = "1.4")
    @t28
    private static final <T, V> void setValue(dp8<T, V> dp8Var, T t, hp8<?> hp8Var, V v) {
        md8.checkNotNullParameter(dp8Var, "<this>");
        md8.checkNotNullParameter(hp8Var, "property");
        dp8Var.set(t, v);
    }
}
