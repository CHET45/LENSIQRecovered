package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wr0<T> implements yv9<T> {
    @Override // p000.yv9
    @Deprecated
    public final void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
    }

    @Override // p000.yv9
    public void describeMismatch(Object obj, i74 i74Var) {
        i74Var.appendText("was ").appendValue(obj);
    }

    public String toString() {
        return p7g.toString(this);
    }
}
