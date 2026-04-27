package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mve<P, Q> implements lve<P, Q> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Object f62391a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final kz6<Object, pve<?>, Object, bth> f62392b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final kz6<Object, Object, Object, Object> f62393c;

    /* JADX INFO: renamed from: d */
    @gib
    public final kz6<pve<?>, Object, Object, kz6<Throwable, Object, e13, bth>> f62394d;

    /* JADX WARN: Multi-variable type inference failed */
    public mve(@yfb Object obj, @yfb kz6<Object, ? super pve<?>, Object, bth> kz6Var, @yfb kz6<Object, Object, Object, ? extends Object> kz6Var2, @gib kz6<? super pve<?>, Object, Object, ? extends kz6<? super Throwable, Object, ? super e13, bth>> kz6Var3) {
        this.f62391a = obj;
        this.f62392b = kz6Var;
        this.f62393c = kz6Var2;
        this.f62394d = kz6Var3;
    }

    @Override // p000.nve
    @yfb
    public Object getClauseObject() {
        return this.f62391a;
    }

    @Override // p000.nve
    @gib
    public kz6<pve<?>, Object, Object, kz6<Throwable, Object, e13, bth>> getOnCancellationConstructor() {
        return this.f62394d;
    }

    @Override // p000.nve
    @yfb
    public kz6<Object, Object, Object, Object> getProcessResFunc() {
        return this.f62393c;
    }

    @Override // p000.nve
    @yfb
    public kz6<Object, pve<?>, Object, bth> getRegFunc() {
        return this.f62392b;
    }

    public /* synthetic */ mve(Object obj, kz6 kz6Var, kz6 kz6Var2, kz6 kz6Var3, int i, jt3 jt3Var) {
        this(obj, kz6Var, kz6Var2, (i & 8) != 0 ? null : kz6Var3);
    }
}
