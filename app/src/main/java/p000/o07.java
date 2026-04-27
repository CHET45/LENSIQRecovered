package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public final class o07<F, T> extends r45<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final lz6<? super F, ? extends T> f66167a;

    /* JADX INFO: renamed from: b */
    public final r45<T> f66168b;

    public o07(lz6<? super F, ? extends T> function, r45<T> resultEquivalence) {
        this.f66167a = (lz6) v7d.checkNotNull(function);
        this.f66168b = (r45) v7d.checkNotNull(resultEquivalence);
    }

    @Override // p000.r45
    /* JADX INFO: renamed from: a */
    public boolean mo18242a(F f, F f2) {
        return this.f66168b.equivalent(this.f66167a.apply(f), this.f66167a.apply(f2));
    }

    @Override // p000.r45
    /* JADX INFO: renamed from: b */
    public int mo18243b(F f) {
        return this.f66168b.hash(this.f66167a.apply(f));
    }

    public boolean equals(@wx1 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o07)) {
            return false;
        }
        o07 o07Var = (o07) obj;
        return this.f66167a.equals(o07Var.f66167a) && this.f66168b.equals(o07Var.f66168b);
    }

    public int hashCode() {
        return okb.hashCode(this.f66167a, this.f66168b);
    }

    public String toString() {
        return this.f66168b + ".onResultOf(" + this.f66167a + c0b.f15434d;
    }
}
