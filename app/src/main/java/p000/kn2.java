package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public abstract class kn2<T> {

    /* JADX INFO: renamed from: b */
    public static final int f54770b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final l2i<T> f54771a;

    public /* synthetic */ kn2(ny6 ny6Var, jt3 jt3Var) {
        this(ny6Var);
    }

    public static /* synthetic */ void getCurrent$annotations() {
    }

    @xn8(name = "getCurrent")
    @hk2
    @wqd
    public final T getCurrent(@gib zl2 zl2Var, int i) {
        return (T) zl2Var.consume(this);
    }

    @yfb
    public l2i<T> getDefaultValueHolder$runtime_release() {
        return this.f54771a;
    }

    @yfb
    public abstract l2i<T> updatedStateOf$runtime_release(@yfb did<T> didVar, @gib l2i<T> l2iVar);

    private kn2(ny6<? extends T> ny6Var) {
        this.f54771a = new h39(ny6Var);
    }
}
