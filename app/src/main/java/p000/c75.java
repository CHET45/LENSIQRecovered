package p000;

/* JADX INFO: loaded from: classes8.dex */
public class c75<T> extends jmh<Iterable<T>> {

    /* JADX INFO: renamed from: c */
    public final yv9<? super T> f15900c;

    public c75(yv9<? super T> yv9Var) {
        this.f15900c = yv9Var;
    }

    @io5
    public static <U> yv9<Iterable<U>> everyItem(yv9<U> yv9Var) {
        return new c75(yv9Var);
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendText("every item is ").appendDescriptionOf(this.f15900c);
    }

    @Override // p000.jmh
    public boolean matchesSafely(Iterable<T> iterable, i74 i74Var) {
        for (T t : iterable) {
            if (!this.f15900c.matches(t)) {
                i74Var.appendText("an item ");
                this.f15900c.describeMismatch(t, i74Var);
                return false;
            }
        }
        return true;
    }
}
