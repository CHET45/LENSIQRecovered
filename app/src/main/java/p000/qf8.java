package p000;

/* JADX INFO: loaded from: classes8.dex */
public class qf8<T> extends wr0<T> {

    /* JADX INFO: renamed from: a */
    public final T f74306a;

    public qf8(T t) {
        this.f74306a = t;
    }

    @io5
    public static <T> yv9<T> sameInstance(T t) {
        return new qf8(t);
    }

    @io5
    public static <T> yv9<T> theInstance(T t) {
        return new qf8(t);
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendText("sameInstance(").appendValue(this.f74306a).appendText(c0b.f15434d);
    }

    @Override // p000.yv9
    public boolean matches(Object obj) {
        return obj == this.f74306a;
    }
}
