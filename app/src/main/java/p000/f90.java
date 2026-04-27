package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class f90 {
    public static void assumeFalse(boolean z) {
        assumeTrue(!z);
    }

    public static void assumeNoException(Throwable th) {
        assumeThat(th, l03.nullValue());
    }

    public static void assumeNotNull(Object... objArr) {
        assumeThat(Arrays.asList(objArr), l03.everyItem(l03.notNullValue()));
    }

    public static <T> void assumeThat(T t, yv9<T> yv9Var) {
        if (!yv9Var.matches(t)) {
            throw new h90(t, yv9Var);
        }
    }

    public static void assumeTrue(boolean z) {
        assumeThat(Boolean.valueOf(z), l03.m15228is(Boolean.TRUE));
    }

    public static void assumeFalse(String str, boolean z) {
        assumeTrue(str, !z);
    }

    public static void assumeNoException(String str, Throwable th) {
        assumeThat(str, th, l03.nullValue());
    }

    public static void assumeTrue(String str, boolean z) {
        if (!z) {
            throw new h90(str);
        }
    }

    public static <T> void assumeThat(String str, T t, yv9<T> yv9Var) {
        if (!yv9Var.matches(t)) {
            throw new h90(str, t, yv9Var);
        }
    }
}
