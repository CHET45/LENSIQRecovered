package p000;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class ie3<C extends Comparable> implements Comparable<ie3<C>>, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final C f46595a;

    /* JADX INFO: renamed from: ie3$a */
    public static /* synthetic */ class C7250a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46596a;

        static {
            int[] iArr = new int[hc1.values().length];
            f46596a = iArr;
            try {
                iArr[hc1.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46596a[hc1.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ie3$b */
    public static final class C7251b extends ie3<Comparable<?>> {

        /* JADX INFO: renamed from: b */
        public static final C7251b f46597b = new C7251b();
        private static final long serialVersionUID = 0;

        private C7251b() {
            super("");
        }

        private Object readResolve() {
            return f46597b;
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: f */
        public void mo12919f(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: g */
        public void mo12920g(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: h */
        public Comparable<?> mo12921h() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // p000.ie3
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: i */
        public Comparable<?> mo12922i(ke4<Comparable<?>> domain) {
            return domain.maxValue();
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: j */
        public boolean mo12923j(Comparable<?> value) {
            return false;
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: k */
        public Comparable<?> mo12924k(ke4<Comparable<?>> domain) {
            throw new AssertionError();
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: l */
        public hc1 mo12925l() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: m */
        public hc1 mo12926m() {
            throw new IllegalStateException();
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: n */
        public ie3<Comparable<?>> mo12927n(hc1 boundType, ke4<Comparable<?>> domain) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: o */
        public ie3<Comparable<?>> mo12928o(hc1 boundType, ke4<Comparable<?>> domain) {
            throw new IllegalStateException();
        }

        public String toString() {
            return "+∞";
        }

        @Override // p000.ie3, java.lang.Comparable
        public int compareTo(ie3<Comparable<?>> o) {
            return o == this ? 0 : 1;
        }
    }

    /* JADX INFO: renamed from: ie3$c */
    public static final class C7252c<C extends Comparable> extends ie3<C> {
        private static final long serialVersionUID = 0;

        public C7252c(C endpoint) {
            super((Comparable) v7d.checkNotNull(endpoint));
        }

        @Override // p000.ie3, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object that) {
            return super.compareTo((ie3) that);
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: e */
        public ie3<C> mo12918e(ke4<C> domain) {
            Comparable comparableMo12924k = mo12924k(domain);
            return comparableMo12924k != null ? ie3.m12917d(comparableMo12924k) : ie3.m12914a();
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: f */
        public void mo12919f(StringBuilder sb) {
            sb.append('(');
            sb.append(this.f46595a);
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: g */
        public void mo12920g(StringBuilder sb) {
            sb.append(this.f46595a);
            sb.append(C4584d2.f28243l);
        }

        @Override // p000.ie3
        public int hashCode() {
            return ~this.f46595a.hashCode();
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: i */
        public C mo12922i(ke4<C> domain) {
            return this.f46595a;
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: j */
        public boolean mo12923j(C value) {
            return bpd.m3328a(this.f46595a, value) < 0;
        }

        @Override // p000.ie3
        @wx1
        /* JADX INFO: renamed from: k */
        public C mo12924k(ke4<C> ke4Var) {
            return (C) ke4Var.next(this.f46595a);
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: l */
        public hc1 mo12925l() {
            return hc1.OPEN;
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: m */
        public hc1 mo12926m() {
            return hc1.CLOSED;
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: n */
        public ie3<C> mo12927n(hc1 boundType, ke4<C> domain) {
            int i = C7250a.f46596a[boundType.ordinal()];
            if (i == 1) {
                Comparable next = domain.next(this.f46595a);
                return next == null ? ie3.m12916c() : ie3.m12917d(next);
            }
            if (i == 2) {
                return this;
            }
            throw new AssertionError();
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: o */
        public ie3<C> mo12928o(hc1 boundType, ke4<C> domain) {
            int i = C7250a.f46596a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i != 2) {
                throw new AssertionError();
            }
            Comparable next = domain.next(this.f46595a);
            return next == null ? ie3.m12914a() : ie3.m12917d(next);
        }

        public String toString() {
            return pj4.f71071b + this.f46595a + nk1.f64796h;
        }
    }

    /* JADX INFO: renamed from: ie3$d */
    public static final class C7253d extends ie3<Comparable<?>> {

        /* JADX INFO: renamed from: b */
        public static final C7253d f46598b = new C7253d();
        private static final long serialVersionUID = 0;

        private C7253d() {
            super("");
        }

        private Object readResolve() {
            return f46598b;
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: e */
        public ie3<Comparable<?>> mo12918e(ke4<Comparable<?>> domain) {
            try {
                return ie3.m12917d(domain.minValue());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: f */
        public void mo12919f(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: g */
        public void mo12920g(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: h */
        public Comparable<?> mo12921h() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // p000.ie3
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: i */
        public Comparable<?> mo12922i(ke4<Comparable<?>> domain) {
            throw new AssertionError();
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: j */
        public boolean mo12923j(Comparable<?> value) {
            return true;
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: k */
        public Comparable<?> mo12924k(ke4<Comparable<?>> domain) {
            return domain.minValue();
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: l */
        public hc1 mo12925l() {
            throw new IllegalStateException();
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: m */
        public hc1 mo12926m() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: n */
        public ie3<Comparable<?>> mo12927n(hc1 boundType, ke4<Comparable<?>> domain) {
            throw new IllegalStateException();
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: o */
        public ie3<Comparable<?>> mo12928o(hc1 boundType, ke4<Comparable<?>> domain) {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "-∞";
        }

        @Override // p000.ie3, java.lang.Comparable
        public int compareTo(ie3<Comparable<?>> o) {
            return o == this ? 0 : -1;
        }
    }

    /* JADX INFO: renamed from: ie3$e */
    public static final class C7254e<C extends Comparable> extends ie3<C> {
        private static final long serialVersionUID = 0;

        public C7254e(C endpoint) {
            super((Comparable) v7d.checkNotNull(endpoint));
        }

        @Override // p000.ie3, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object that) {
            return super.compareTo((ie3) that);
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: f */
        public void mo12919f(StringBuilder sb) {
            sb.append(C4584d2.f28242k);
            sb.append(this.f46595a);
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: g */
        public void mo12920g(StringBuilder sb) {
            sb.append(this.f46595a);
            sb.append(')');
        }

        @Override // p000.ie3
        public int hashCode() {
            return this.f46595a.hashCode();
        }

        @Override // p000.ie3
        @wx1
        /* JADX INFO: renamed from: i */
        public C mo12922i(ke4<C> ke4Var) {
            return (C) ke4Var.previous(this.f46595a);
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: j */
        public boolean mo12923j(C value) {
            return bpd.m3328a(this.f46595a, value) <= 0;
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: k */
        public C mo12924k(ke4<C> domain) {
            return this.f46595a;
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: l */
        public hc1 mo12925l() {
            return hc1.CLOSED;
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: m */
        public hc1 mo12926m() {
            return hc1.OPEN;
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: n */
        public ie3<C> mo12927n(hc1 boundType, ke4<C> domain) {
            int i = C7250a.f46596a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i != 2) {
                throw new AssertionError();
            }
            Comparable comparablePrevious = domain.previous(this.f46595a);
            return comparablePrevious == null ? ie3.m12916c() : new C7252c(comparablePrevious);
        }

        @Override // p000.ie3
        /* JADX INFO: renamed from: o */
        public ie3<C> mo12928o(hc1 boundType, ke4<C> domain) {
            int i = C7250a.f46596a[boundType.ordinal()];
            if (i == 1) {
                Comparable comparablePrevious = domain.previous(this.f46595a);
                return comparablePrevious == null ? ie3.m12914a() : new C7252c(comparablePrevious);
            }
            if (i == 2) {
                return this;
            }
            throw new AssertionError();
        }

        public String toString() {
            return nk1.f64796h + this.f46595a + pj4.f71071b;
        }
    }

    public ie3(C endpoint) {
        this.f46595a = endpoint;
    }

    /* JADX INFO: renamed from: a */
    public static <C extends Comparable> ie3<C> m12914a() {
        return C7251b.f46597b;
    }

    /* JADX INFO: renamed from: b */
    public static <C extends Comparable> ie3<C> m12915b(C endpoint) {
        return new C7252c(endpoint);
    }

    /* JADX INFO: renamed from: c */
    public static <C extends Comparable> ie3<C> m12916c() {
        return C7253d.f46598b;
    }

    /* JADX INFO: renamed from: d */
    public static <C extends Comparable> ie3<C> m12917d(C endpoint) {
        return new C7254e(endpoint);
    }

    /* JADX INFO: renamed from: e */
    public ie3<C> mo12918e(ke4<C> domain) {
        return this;
    }

    public boolean equals(@wx1 Object obj) {
        if (!(obj instanceof ie3)) {
            return false;
        }
        try {
            return compareTo((ie3) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo12919f(StringBuilder sb);

    /* JADX INFO: renamed from: g */
    public abstract void mo12920g(StringBuilder sb);

    /* JADX INFO: renamed from: h */
    public C mo12921h() {
        return this.f46595a;
    }

    public abstract int hashCode();

    @wx1
    /* JADX INFO: renamed from: i */
    public abstract C mo12922i(ke4<C> domain);

    /* JADX INFO: renamed from: j */
    public abstract boolean mo12923j(C value);

    @wx1
    /* JADX INFO: renamed from: k */
    public abstract C mo12924k(ke4<C> domain);

    /* JADX INFO: renamed from: l */
    public abstract hc1 mo12925l();

    /* JADX INFO: renamed from: m */
    public abstract hc1 mo12926m();

    /* JADX INFO: renamed from: n */
    public abstract ie3<C> mo12927n(hc1 boundType, ke4<C> domain);

    /* JADX INFO: renamed from: o */
    public abstract ie3<C> mo12928o(hc1 boundType, ke4<C> domain);

    @Override // java.lang.Comparable
    public int compareTo(ie3<C> that) {
        if (that == m12916c()) {
            return 1;
        }
        if (that == m12914a()) {
            return -1;
        }
        int iM3328a = bpd.m3328a(this.f46595a, that.f46595a);
        return iM3328a != 0 ? iM3328a : hb1.compare(this instanceof C7252c, that instanceof C7252c);
    }
}
