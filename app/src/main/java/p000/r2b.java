package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class r2b extends lxa {

    /* JADX INFO: renamed from: c */
    public static final int f76900c = 0;

    /* JADX INFO: renamed from: b */
    @yfb
    public final auf<fxa<?>, Object> f76901b;

    public r2b(@yfb scc<? extends fxa<?>, ? extends Object> sccVar, @yfb scc<? extends fxa<?>, ? extends Object>... sccVarArr) {
        super(null);
        auf<fxa<?>, Object> aufVarMutableStateMapOf = stf.mutableStateMapOf();
        this.f76901b = aufVarMutableStateMapOf;
        aufVarMutableStateMapOf.put(sccVar.getFirst(), sccVar.getSecond());
        aufVarMutableStateMapOf.putAll(xt9.toMap(sccVarArr));
    }

    @Override // p000.lxa
    public boolean contains$ui_release(@yfb fxa<?> fxaVar) {
        return this.f76901b.containsKey(fxaVar);
    }

    @Override // p000.lxa
    @gib
    public <T> T get$ui_release(@yfb fxa<T> fxaVar) {
        T t = (T) this.f76901b.get(fxaVar);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // p000.lxa
    /* JADX INFO: renamed from: set$ui_release */
    public <T> void mo30446set$ui_release(@yfb fxa<T> fxaVar, T t) {
        this.f76901b.put(fxaVar, t);
    }
}
