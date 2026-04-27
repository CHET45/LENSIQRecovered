package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ive implements hve {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Object f48609a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final kz6<Object, pve<?>, Object, bth> f48610b;

    /* JADX INFO: renamed from: c */
    @gib
    public final kz6<pve<?>, Object, Object, kz6<Throwable, Object, e13, bth>> f48611c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final kz6<Object, Object, Object, Object> f48612d;

    /* JADX WARN: Multi-variable type inference failed */
    public ive(@yfb Object obj, @yfb kz6<Object, ? super pve<?>, Object, bth> kz6Var, @gib kz6<? super pve<?>, Object, Object, ? extends kz6<? super Throwable, Object, ? super e13, bth>> kz6Var2) {
        this.f48609a = obj;
        this.f48610b = kz6Var;
        this.f48611c = kz6Var2;
        this.f48612d = rve.f79889a;
    }

    @Override // p000.nve
    @yfb
    public Object getClauseObject() {
        return this.f48609a;
    }

    @Override // p000.nve
    @gib
    public kz6<pve<?>, Object, Object, kz6<Throwable, Object, e13, bth>> getOnCancellationConstructor() {
        return this.f48611c;
    }

    @Override // p000.nve
    @yfb
    public kz6<Object, Object, Object, Object> getProcessResFunc() {
        return this.f48612d;
    }

    @Override // p000.nve
    @yfb
    public kz6<Object, pve<?>, Object, bth> getRegFunc() {
        return this.f48610b;
    }

    public /* synthetic */ ive(Object obj, kz6 kz6Var, kz6 kz6Var2, int i, jt3 jt3Var) {
        this(obj, kz6Var, (i & 4) != 0 ? null : kz6Var2);
    }
}
