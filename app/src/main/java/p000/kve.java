package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class kve<Q> implements jve<Q> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Object f55462a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final kz6<Object, pve<?>, Object, bth> f55463b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final kz6<Object, Object, Object, Object> f55464c;

    /* JADX INFO: renamed from: d */
    @gib
    public final kz6<pve<?>, Object, Object, kz6<Throwable, Object, e13, bth>> f55465d;

    /* JADX WARN: Multi-variable type inference failed */
    public kve(@yfb Object obj, @yfb kz6<Object, ? super pve<?>, Object, bth> kz6Var, @yfb kz6<Object, Object, Object, ? extends Object> kz6Var2, @gib kz6<? super pve<?>, Object, Object, ? extends kz6<? super Throwable, Object, ? super e13, bth>> kz6Var3) {
        this.f55462a = obj;
        this.f55463b = kz6Var;
        this.f55464c = kz6Var2;
        this.f55465d = kz6Var3;
    }

    @Override // p000.nve
    @yfb
    public Object getClauseObject() {
        return this.f55462a;
    }

    @Override // p000.nve
    @gib
    public kz6<pve<?>, Object, Object, kz6<Throwable, Object, e13, bth>> getOnCancellationConstructor() {
        return this.f55465d;
    }

    @Override // p000.nve
    @yfb
    public kz6<Object, Object, Object, Object> getProcessResFunc() {
        return this.f55464c;
    }

    @Override // p000.nve
    @yfb
    public kz6<Object, pve<?>, Object, bth> getRegFunc() {
        return this.f55463b;
    }

    public /* synthetic */ kve(Object obj, kz6 kz6Var, kz6 kz6Var2, kz6 kz6Var3, int i, jt3 jt3Var) {
        this(obj, kz6Var, kz6Var2, (i & 8) != 0 ? null : kz6Var3);
    }
}
