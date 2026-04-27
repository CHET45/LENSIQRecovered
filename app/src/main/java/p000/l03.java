package p000;

import p000.db2;

/* JADX INFO: loaded from: classes8.dex */
public class l03 {
    public static <T> yv9<T> allOf(Iterable<yv9<? super T>> iterable) {
        return C16183zm.allOf(iterable);
    }

    public static <T> yv9<T> any(Class<T> cls) {
        return nf8.any(cls);
    }

    public static <T> C16325zz<T> anyOf(Iterable<yv9<? super T>> iterable) {
        return C16325zz.anyOf(iterable);
    }

    public static yv9<Object> anything() {
        return ef8.anything();
    }

    public static <LHS> db2.C4720a<LHS> both(yv9<? super LHS> yv9Var) {
        return db2.both(yv9Var);
    }

    public static yv9<String> containsString(String str) {
        return m7g.containsString(str);
    }

    public static <T> yv9<T> describedAs(String str, yv9<T> yv9Var, Object... objArr) {
        return h74.describedAs(str, yv9Var, objArr);
    }

    public static <LHS> db2.C4721b<LHS> either(yv9<? super LHS> yv9Var) {
        return db2.either(yv9Var);
    }

    public static yv9<String> endsWith(String str) {
        return q7g.endsWith(str);
    }

    public static <T> yv9<T> equalTo(T t) {
        return mf8.equalTo(t);
    }

    public static <U> yv9<Iterable<U>> everyItem(yv9<U> yv9Var) {
        return c75.everyItem(yv9Var);
    }

    public static <T> yv9<Iterable<? super T>> hasItem(T t) {
        return ff8.hasItem(t);
    }

    public static <T> yv9<Iterable<T>> hasItems(T... tArr) {
        return ff8.hasItems(tArr);
    }

    public static <T> yv9<T> instanceOf(Class<?> cls) {
        return nf8.instanceOf(cls);
    }

    /* JADX INFO: renamed from: is */
    public static <T> yv9<T> m15228is(T t) {
        return df8.m9123is(t);
    }

    public static <T> yv9<T> isA(Class<T> cls) {
        return df8.isA(cls);
    }

    public static <T> yv9<T> not(yv9<T> yv9Var) {
        return of8.not((yv9) yv9Var);
    }

    public static yv9<Object> notNullValue() {
        return pf8.notNullValue();
    }

    public static yv9<Object> nullValue() {
        return pf8.nullValue();
    }

    public static <T> yv9<T> sameInstance(T t) {
        return qf8.sameInstance(t);
    }

    public static yv9<String> startsWith(String str) {
        return j8g.startsWith(str);
    }

    public static <T> yv9<T> theInstance(T t) {
        return qf8.theInstance(t);
    }

    public static <T> yv9<T> allOf(yv9<? super T>... yv9VarArr) {
        return C16183zm.allOf(yv9VarArr);
    }

    public static <T> C16325zz<T> anyOf(yv9<T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3) {
        return C16325zz.anyOf(yv9Var, yv9Var2, yv9Var3);
    }

    public static yv9<Object> anything(String str) {
        return ef8.anything(str);
    }

    public static <T> yv9<Iterable<? super T>> hasItem(yv9<? super T> yv9Var) {
        return ff8.hasItem((yv9) yv9Var);
    }

    public static <T> yv9<Iterable<T>> hasItems(yv9<? super T>... yv9VarArr) {
        return ff8.hasItems((yv9[]) yv9VarArr);
    }

    /* JADX INFO: renamed from: is */
    public static <T> yv9<T> m15229is(yv9<T> yv9Var) {
        return df8.m9124is((yv9) yv9Var);
    }

    public static <T> yv9<T> not(T t) {
        return of8.not(t);
    }

    public static <T> yv9<T> notNullValue(Class<T> cls) {
        return pf8.notNullValue(cls);
    }

    public static <T> yv9<T> nullValue(Class<T> cls) {
        return pf8.nullValue(cls);
    }

    public static <T> yv9<T> allOf(yv9<? super T> yv9Var, yv9<? super T> yv9Var2) {
        return C16183zm.allOf(yv9Var, yv9Var2);
    }

    public static <T> C16325zz<T> anyOf(yv9<T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3, yv9<? super T> yv9Var4) {
        return C16325zz.anyOf(yv9Var, yv9Var2, yv9Var3, yv9Var4);
    }

    /* JADX INFO: renamed from: is */
    public static <T> yv9<T> m15227is(Class<T> cls) {
        return df8.m9122is((Class) cls);
    }

    public static <T> yv9<T> allOf(yv9<? super T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3) {
        return C16183zm.allOf(yv9Var, yv9Var2, yv9Var3);
    }

    public static <T> C16325zz<T> anyOf(yv9<T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3, yv9<? super T> yv9Var4, yv9<? super T> yv9Var5) {
        return C16325zz.anyOf(yv9Var, yv9Var2, yv9Var3, yv9Var4, yv9Var5);
    }

    public static <T> yv9<T> allOf(yv9<? super T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3, yv9<? super T> yv9Var4) {
        return C16183zm.allOf(yv9Var, yv9Var2, yv9Var3, yv9Var4);
    }

    public static <T> C16325zz<T> anyOf(yv9<T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3, yv9<? super T> yv9Var4, yv9<? super T> yv9Var5, yv9<? super T> yv9Var6) {
        return C16325zz.anyOf(yv9Var, yv9Var2, yv9Var3, yv9Var4, yv9Var5, yv9Var6);
    }

    public static <T> yv9<T> allOf(yv9<? super T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3, yv9<? super T> yv9Var4, yv9<? super T> yv9Var5) {
        return C16183zm.allOf(yv9Var, yv9Var2, yv9Var3, yv9Var4, yv9Var5);
    }

    public static <T> C16325zz<T> anyOf(yv9<T> yv9Var, yv9<? super T> yv9Var2) {
        return C16325zz.anyOf(yv9Var, yv9Var2);
    }

    public static <T> yv9<T> allOf(yv9<? super T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3, yv9<? super T> yv9Var4, yv9<? super T> yv9Var5, yv9<? super T> yv9Var6) {
        return C16183zm.allOf(yv9Var, yv9Var2, yv9Var3, yv9Var4, yv9Var5, yv9Var6);
    }

    public static <T> C16325zz<T> anyOf(yv9<? super T>... yv9VarArr) {
        return C16325zz.anyOf(yv9VarArr);
    }
}
