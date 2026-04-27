package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class bp9<T> {

    /* JADX INFO: renamed from: a */
    public final io9<T> f14385a;

    /* JADX INFO: renamed from: b */
    @hib
    public nr0<?, ?> f14386b;

    /* JADX INFO: renamed from: c */
    @hib
    public T f14387c;

    public bp9() {
        this.f14385a = new io9<>();
        this.f14387c = null;
    }

    @hib
    public T getValue(io9<T> io9Var) {
        return this.f14387c;
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    public final T getValueInternal(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return getValue(this.f14385a.set(f, f2, t, t2, f3, f4, f5));
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public final void setAnimation(@hib nr0<?, ?> nr0Var) {
        this.f14386b = nr0Var;
    }

    public final void setValue(@hib T t) {
        this.f14387c = t;
        nr0<?, ?> nr0Var = this.f14386b;
        if (nr0Var != null) {
            nr0Var.notifyListeners();
        }
    }

    public bp9(@hib T t) {
        this.f14385a = new io9<>();
        this.f14387c = t;
    }
}
