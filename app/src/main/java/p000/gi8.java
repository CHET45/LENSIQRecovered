package p000;

import p000.db2;

/* JADX INFO: loaded from: classes8.dex */
public class gi8 {
    @Deprecated
    public static <T> db2.C4720a<T> both(yv9<? super T> yv9Var) {
        return l03.both(yv9Var);
    }

    @Deprecated
    public static yv9<String> containsString(String str) {
        return l03.containsString(str);
    }

    @Deprecated
    public static <T> db2.C4721b<T> either(yv9<? super T> yv9Var) {
        return l03.either(yv9Var);
    }

    @Deprecated
    public static <T> yv9<Iterable<T>> everyItem(yv9<T> yv9Var) {
        return l03.everyItem(yv9Var);
    }

    @Deprecated
    public static <T> yv9<Iterable<? super T>> hasItem(T t) {
        return l03.hasItem(t);
    }

    @Deprecated
    public static <T> yv9<Iterable<T>> hasItems(T... tArr) {
        return l03.hasItems(tArr);
    }

    public static <T extends Exception> yv9<T> isException(yv9<T> yv9Var) {
        return n0g.isException(yv9Var);
    }

    public static <T extends Throwable> yv9<T> isThrowable(yv9<T> yv9Var) {
        return n0g.isThrowable(yv9Var);
    }

    @Deprecated
    public static <T> yv9<Iterable<? super T>> hasItem(yv9<? super T> yv9Var) {
        return l03.hasItem((yv9) yv9Var);
    }

    @Deprecated
    public static <T> yv9<Iterable<T>> hasItems(yv9<? super T>... yv9VarArr) {
        return l03.hasItems((yv9[]) yv9VarArr);
    }
}
