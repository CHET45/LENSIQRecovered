package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class h39<T> implements l2i<T> {

    /* JADX INFO: renamed from: b */
    public static final int f42174b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final fx8 f42175a;

    public h39(@yfb ny6<? extends T> ny6Var) {
        this.f42175a = hz8.lazy(ny6Var);
    }

    private final T getCurrent() {
        return (T) this.f42175a.getValue();
    }

    @Override // p000.l2i
    public T readValue(@yfb qqc qqcVar) {
        return getCurrent();
    }

    @Override // p000.l2i
    @yfb
    public did<T> toProvided(@yfb kn2<T> kn2Var) {
        gm2.composeRuntimeError("Cannot produce a provider from a lazy value holder");
        throw new us8();
    }
}
