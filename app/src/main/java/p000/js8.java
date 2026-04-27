package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public abstract class js8<T> {

    /* JADX INFO: renamed from: c */
    public static final int f51695c = 8;

    /* JADX INFO: renamed from: a */
    public final T f51696a;

    /* JADX INFO: renamed from: b */
    @yfb
    public hv4 f51697b;

    public /* synthetic */ js8(Object obj, hv4 hv4Var, jt3 jt3Var) {
        this(obj, hv4Var);
    }

    @yfb
    public final hv4 getEasing$animation_core_release() {
        return this.f51697b;
    }

    public final T getValue$animation_core_release() {
        return this.f51696a;
    }

    public final void setEasing$animation_core_release(@yfb hv4 hv4Var) {
        this.f51697b = hv4Var;
    }

    @yfb
    public final <V extends AbstractC16313zy> scc<V, hv4> toPair$animation_core_release(@yfb qy6<? super T, ? extends V> qy6Var) {
        return vkh.m24050to(qy6Var.invoke(this.f51696a), this.f51697b);
    }

    private js8(T t, hv4 hv4Var) {
        this.f51696a = t;
        this.f51697b = hv4Var;
    }
}
