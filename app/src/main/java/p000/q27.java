package p000;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public final class q27<T> implements Serializable {

    /* JADX INFO: renamed from: C */
    @wx1
    @ez8
    public transient q27<T> f73043C;

    /* JADX INFO: renamed from: a */
    public final Comparator<? super T> f73044a;

    /* JADX INFO: renamed from: b */
    public final boolean f73045b;

    /* JADX INFO: renamed from: c */
    @wx1
    public final T f73046c;

    /* JADX INFO: renamed from: d */
    public final hc1 f73047d;

    /* JADX INFO: renamed from: e */
    public final boolean f73048e;

    /* JADX INFO: renamed from: f */
    @wx1
    public final T f73049f;

    /* JADX INFO: renamed from: m */
    public final hc1 f73050m;

    private q27(Comparator<? super T> comparator, boolean z, @wx1 T t, hc1 hc1Var, boolean z2, @wx1 T t2, hc1 hc1Var2) {
        this.f73044a = (Comparator) v7d.checkNotNull(comparator);
        this.f73045b = z;
        this.f73048e = z2;
        this.f73046c = t;
        this.f73047d = (hc1) v7d.checkNotNull(hc1Var);
        this.f73049f = t2;
        this.f73050m = (hc1) v7d.checkNotNull(hc1Var2);
        if (z) {
            comparator.compare((Object) sib.m22018a(t), (Object) sib.m22018a(t));
        }
        if (z2) {
            comparator.compare((Object) sib.m22018a(t2), (Object) sib.m22018a(t2));
        }
        if (z && z2) {
            int iCompare = comparator.compare((Object) sib.m22018a(t), (Object) sib.m22018a(t2));
            v7d.checkArgument(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (iCompare == 0) {
                hc1 hc1Var3 = hc1.OPEN;
                v7d.checkArgument((hc1Var == hc1Var3 && hc1Var2 == hc1Var3) ? false : true);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> q27<T> m20000a(Comparator<? super T> comparator) {
        hc1 hc1Var = hc1.OPEN;
        return new q27<>(comparator, false, null, hc1Var, false, null, hc1Var);
    }

    /* JADX INFO: renamed from: d */
    public static <T> q27<T> m20001d(Comparator<? super T> comparator, @dgc T endpoint, hc1 boundType) {
        return new q27<>(comparator, true, endpoint, boundType, false, null, hc1.OPEN);
    }

    /* JADX INFO: renamed from: e */
    public static <T extends Comparable> q27<T> m20002e(bpd<T> range) {
        return new q27<>(s7c.natural(), range.hasLowerBound(), range.hasLowerBound() ? range.lowerEndpoint() : null, range.hasLowerBound() ? range.lowerBoundType() : hc1.OPEN, range.hasUpperBound(), range.hasUpperBound() ? range.upperEndpoint() : null, range.hasUpperBound() ? range.upperBoundType() : hc1.OPEN);
    }

    /* JADX INFO: renamed from: n */
    public static <T> q27<T> m20003n(Comparator<? super T> comparator, @dgc T lower, hc1 lowerType, @dgc T upper, hc1 upperType) {
        return new q27<>(comparator, true, lower, lowerType, true, upper, upperType);
    }

    /* JADX INFO: renamed from: r */
    public static <T> q27<T> m20004r(Comparator<? super T> comparator, @dgc T endpoint, hc1 boundType) {
        return new q27<>(comparator, false, null, hc1.OPEN, true, endpoint, boundType);
    }

    /* JADX INFO: renamed from: b */
    public Comparator<? super T> m20005b() {
        return this.f73044a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m20006c(@dgc T t) {
        return (m20017q(t) || m20016p(t)) ? false : true;
    }

    public boolean equals(@wx1 Object obj) {
        if (!(obj instanceof q27)) {
            return false;
        }
        q27 q27Var = (q27) obj;
        return this.f73044a.equals(q27Var.f73044a) && this.f73045b == q27Var.f73045b && this.f73048e == q27Var.f73048e && m20007f().equals(q27Var.m20007f()) && m20009h().equals(q27Var.m20009h()) && okb.equal(m20008g(), q27Var.m20008g()) && okb.equal(m20010i(), q27Var.m20010i());
    }

    /* JADX INFO: renamed from: f */
    public hc1 m20007f() {
        return this.f73047d;
    }

    @wx1
    /* JADX INFO: renamed from: g */
    public T m20008g() {
        return this.f73046c;
    }

    /* JADX INFO: renamed from: h */
    public hc1 m20009h() {
        return this.f73050m;
    }

    public int hashCode() {
        return okb.hashCode(this.f73044a, m20008g(), m20007f(), m20010i(), m20009h());
    }

    @wx1
    /* JADX INFO: renamed from: i */
    public T m20010i() {
        return this.f73049f;
    }

    /* JADX INFO: renamed from: j */
    public boolean m20011j() {
        return this.f73045b;
    }

    /* JADX INFO: renamed from: k */
    public boolean m20012k() {
        return this.f73048e;
    }

    /* JADX INFO: renamed from: l */
    public q27<T> m20013l(q27<T> other) {
        int iCompare;
        int iCompare2;
        T t;
        hc1 hc1Var;
        hc1 hc1Var2;
        int iCompare3;
        hc1 hc1Var3;
        v7d.checkNotNull(other);
        v7d.checkArgument(this.f73044a.equals(other.f73044a));
        boolean z = this.f73045b;
        T tM20008g = m20008g();
        hc1 hc1VarM20007f = m20007f();
        if (!m20011j()) {
            z = other.f73045b;
            tM20008g = other.m20008g();
            hc1VarM20007f = other.m20007f();
        } else if (other.m20011j() && ((iCompare = this.f73044a.compare(m20008g(), other.m20008g())) < 0 || (iCompare == 0 && other.m20007f() == hc1.OPEN))) {
            tM20008g = other.m20008g();
            hc1VarM20007f = other.m20007f();
        }
        boolean z2 = z;
        boolean z3 = this.f73048e;
        T tM20010i = m20010i();
        hc1 hc1VarM20009h = m20009h();
        if (!m20012k()) {
            z3 = other.f73048e;
            tM20010i = other.m20010i();
            hc1VarM20009h = other.m20009h();
        } else if (other.m20012k() && ((iCompare2 = this.f73044a.compare(m20010i(), other.m20010i())) > 0 || (iCompare2 == 0 && other.m20009h() == hc1.OPEN))) {
            tM20010i = other.m20010i();
            hc1VarM20009h = other.m20009h();
        }
        boolean z4 = z3;
        T t2 = tM20010i;
        if (z2 && z4 && ((iCompare3 = this.f73044a.compare(tM20008g, t2)) > 0 || (iCompare3 == 0 && hc1VarM20007f == (hc1Var3 = hc1.OPEN) && hc1VarM20009h == hc1Var3))) {
            hc1Var = hc1.OPEN;
            hc1Var2 = hc1.CLOSED;
            t = t2;
        } else {
            t = tM20008g;
            hc1Var = hc1VarM20007f;
            hc1Var2 = hc1VarM20009h;
        }
        return new q27<>(this.f73044a, z2, t, hc1Var, z4, t2, hc1Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public boolean m20014m() {
        return (m20012k() && m20017q(sib.m22018a(m20010i()))) || (m20011j() && m20016p(sib.m22018a(m20008g())));
    }

    /* JADX INFO: renamed from: o */
    public q27<T> m20015o() {
        q27<T> q27Var = this.f73043C;
        if (q27Var != null) {
            return q27Var;
        }
        q27<T> q27Var2 = new q27<>(s7c.from(this.f73044a).reverse(), this.f73048e, m20010i(), m20009h(), this.f73045b, m20008g(), m20007f());
        q27Var2.f73043C = this;
        this.f73043C = q27Var2;
        return q27Var2;
    }

    /* JADX INFO: renamed from: p */
    public boolean m20016p(@dgc T t) {
        if (!m20012k()) {
            return false;
        }
        int iCompare = this.f73044a.compare(t, sib.m22018a(m20010i()));
        return ((iCompare == 0) & (m20009h() == hc1.OPEN)) | (iCompare > 0);
    }

    /* JADX INFO: renamed from: q */
    public boolean m20017q(@dgc T t) {
        if (!m20011j()) {
            return false;
        }
        int iCompare = this.f73044a.compare(t, sib.m22018a(m20008g()));
        return ((iCompare == 0) & (m20007f() == hc1.OPEN)) | (iCompare < 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f73044a);
        sb.append(g1i.f38277c);
        hc1 hc1Var = this.f73047d;
        hc1 hc1Var2 = hc1.CLOSED;
        sb.append(hc1Var == hc1Var2 ? C4584d2.f28242k : '(');
        sb.append(this.f73045b ? this.f73046c : "-∞");
        sb.append(C4584d2.f28238g);
        sb.append(this.f73048e ? this.f73049f : "∞");
        sb.append(this.f73050m == hc1Var2 ? C4584d2.f28243l : ')');
        return sb.toString();
    }
}
