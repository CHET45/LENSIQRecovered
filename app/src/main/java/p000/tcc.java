package p000;

import com.blankj.utilcode.util.C2473f;

/* JADX INFO: loaded from: classes.dex */
public class tcc<F, S> {

    /* JADX INFO: renamed from: a */
    public final F f84271a;

    /* JADX INFO: renamed from: b */
    public final S f84272b;

    public tcc(F f, S s) {
        this.f84271a = f;
        this.f84272b = s;
    }

    @efb
    public static <A, B> tcc<A, B> create(A a, B b) {
        return new tcc<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof tcc)) {
            return false;
        }
        tcc tccVar = (tcc) obj;
        return pkb.equals(tccVar.f84271a, this.f84271a) && pkb.equals(tccVar.f84272b, this.f84272b);
    }

    public int hashCode() {
        F f = this.f84271a;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.f84272b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    @efb
    public String toString() {
        return "Pair{" + this.f84271a + C2473f.f17566z + this.f84272b + "}";
    }
}
