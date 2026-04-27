package p000;

/* JADX INFO: loaded from: classes8.dex */
public class pf8<T> extends wr0<T> {
    @io5
    public static yv9<Object> notNullValue() {
        return of8.not((yv9) nullValue());
    }

    @io5
    public static yv9<Object> nullValue() {
        return new pf8();
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendText("null");
    }

    @Override // p000.yv9
    public boolean matches(Object obj) {
        return obj == null;
    }

    @io5
    public static <T> yv9<T> notNullValue(Class<T> cls) {
        return of8.not(nullValue(cls));
    }

    @io5
    public static <T> yv9<T> nullValue(Class<T> cls) {
        return new pf8();
    }
}
