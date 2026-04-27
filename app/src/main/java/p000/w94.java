package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class w94<T> extends wr0<T> {
    @Override // p000.wr0, p000.yv9
    public final void describeMismatch(Object obj, i74 i74Var) {
        matches(obj, i74Var);
    }

    @Override // p000.yv9
    public final boolean matches(Object obj) {
        return matches(obj, i74.f45895a);
    }

    public abstract boolean matches(Object obj, i74 i74Var);
}
