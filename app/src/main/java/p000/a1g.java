package p000;

/* JADX INFO: loaded from: classes7.dex */
public class a1g {
    @t28
    private static final Void TODO() {
        throw new wfb(null, 1, null);
    }

    @jjf(version = "1.1")
    @t28
    private static final <T> T also(T t, qy6<? super T, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        qy6Var.invoke(t);
        return t;
    }

    @t28
    private static final <T> T apply(T t, qy6<? super T, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        qy6Var.invoke(t);
        return t;
    }

    @t28
    private static final <T, R> R let(T t, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        return qy6Var.invoke(t);
    }

    @t28
    private static final void repeat(int i, qy6<? super Integer, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "action");
        for (int i2 = 0; i2 < i; i2++) {
            qy6Var.invoke(Integer.valueOf(i2));
        }
    }

    @t28
    private static final <R> R run(ny6<? extends R> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "block");
        return ny6Var.invoke();
    }

    @jjf(version = "1.1")
    @t28
    private static final <T> T takeIf(T t, qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        if (qy6Var.invoke(t).booleanValue()) {
            return t;
        }
        return null;
    }

    @jjf(version = "1.1")
    @t28
    private static final <T> T takeUnless(T t, qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        if (qy6Var.invoke(t).booleanValue()) {
            return null;
        }
        return t;
    }

    @t28
    private static final <T, R> R with(T t, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        return qy6Var.invoke(t);
    }

    @t28
    private static final Void TODO(String str) {
        md8.checkNotNullParameter(str, "reason");
        throw new wfb("An operation is not implemented: " + str);
    }

    @t28
    private static final <T, R> R run(T t, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        return qy6Var.invoke(t);
    }
}
