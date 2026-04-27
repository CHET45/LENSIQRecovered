package p000;

/* JADX INFO: loaded from: classes8.dex */
public class nf8 extends w94<Object> {

    /* JADX INFO: renamed from: a */
    public final Class<?> f64258a;

    /* JADX INFO: renamed from: b */
    public final Class<?> f64259b;

    public nf8(Class<?> cls) {
        this.f64258a = cls;
        this.f64259b = matchableClass(cls);
    }

    @io5
    public static <T> yv9<T> any(Class<T> cls) {
        return new nf8(cls);
    }

    @io5
    public static <T> yv9<T> instanceOf(Class<?> cls) {
        return new nf8(cls);
    }

    private static Class<?> matchableClass(Class<?> cls) {
        return Boolean.TYPE.equals(cls) ? Boolean.class : Byte.TYPE.equals(cls) ? Byte.class : Character.TYPE.equals(cls) ? Character.class : Double.TYPE.equals(cls) ? Double.class : Float.TYPE.equals(cls) ? Float.class : Integer.TYPE.equals(cls) ? Integer.class : Long.TYPE.equals(cls) ? Long.class : Short.TYPE.equals(cls) ? Short.class : cls;
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendText("an instance of ").appendText(this.f64258a.getName());
    }

    @Override // p000.w94
    public boolean matches(Object obj, i74 i74Var) {
        if (obj == null) {
            i74Var.appendText("null");
            return false;
        }
        if (this.f64259b.isInstance(obj)) {
            return true;
        }
        i74Var.appendValue(obj).appendText(" is a " + obj.getClass().getName());
        return false;
    }
}
