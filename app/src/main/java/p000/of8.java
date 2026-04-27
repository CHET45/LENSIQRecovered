package p000;

/* JADX INFO: loaded from: classes8.dex */
public class of8<T> extends wr0<T> {

    /* JADX INFO: renamed from: a */
    public final yv9<T> f67510a;

    public of8(yv9<T> yv9Var) {
        this.f67510a = yv9Var;
    }

    @io5
    public static <T> yv9<T> not(yv9<T> yv9Var) {
        return new of8(yv9Var);
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendText("not ").appendDescriptionOf(this.f67510a);
    }

    @Override // p000.yv9
    public boolean matches(Object obj) {
        return !this.f67510a.matches(obj);
    }

    @io5
    public static <T> yv9<T> not(T t) {
        return not(mf8.equalTo(t));
    }
}
