package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public abstract class r45<T> {

    /* JADX INFO: renamed from: r45$b */
    public static final class C11880b extends r45<Object> implements Serializable {

        /* JADX INFO: renamed from: a */
        public static final C11880b f77001a = new C11880b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f77001a;
        }

        @Override // p000.r45
        /* JADX INFO: renamed from: a */
        public boolean mo18242a(Object a, Object b) {
            return a.equals(b);
        }

        @Override // p000.r45
        /* JADX INFO: renamed from: b */
        public int mo18243b(Object o) {
            return o.hashCode();
        }
    }

    /* JADX INFO: renamed from: r45$c */
    public static final class C11881c<T> implements l8d<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final r45<T> f77002a;

        /* JADX INFO: renamed from: b */
        @wx1
        public final T f77003b;

        public C11881c(r45<T> equivalence, @wx1 T target) {
            this.f77002a = (r45) v7d.checkNotNull(equivalence);
            this.f77003b = target;
        }

        @Override // p000.l8d
        public boolean apply(@wx1 T input) {
            return this.f77002a.equivalent(input, this.f77003b);
        }

        @Override // p000.l8d
        public boolean equals(@wx1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11881c)) {
                return false;
            }
            C11881c c11881c = (C11881c) obj;
            return this.f77002a.equals(c11881c.f77002a) && okb.equal(this.f77003b, c11881c.f77003b);
        }

        public int hashCode() {
            return okb.hashCode(this.f77002a, this.f77003b);
        }

        public String toString() {
            return this.f77002a + ".equivalentTo(" + this.f77003b + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: r45$d */
    public static final class C11882d extends r45<Object> implements Serializable {

        /* JADX INFO: renamed from: a */
        public static final C11882d f77004a = new C11882d();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f77004a;
        }

        @Override // p000.r45
        /* JADX INFO: renamed from: a */
        public boolean mo18242a(Object a, Object b) {
            return false;
        }

        @Override // p000.r45
        /* JADX INFO: renamed from: b */
        public int mo18243b(Object o) {
            return System.identityHashCode(o);
        }
    }

    /* JADX INFO: renamed from: r45$e */
    public static final class C11883e<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final r45<? super T> f77005a;

        /* JADX INFO: renamed from: b */
        @lgc
        public final T f77006b;

        public boolean equals(@wx1 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C11883e)) {
                return false;
            }
            C11883e c11883e = (C11883e) obj;
            if (this.f77005a.equals(c11883e.f77005a)) {
                return this.f77005a.equivalent(this.f77006b, c11883e.f77006b);
            }
            return false;
        }

        @lgc
        public T get() {
            return this.f77006b;
        }

        public int hashCode() {
            return this.f77005a.hash(this.f77006b);
        }

        public String toString() {
            return this.f77005a + ".wrap(" + this.f77006b + c0b.f15434d;
        }

        private C11883e(r45<? super T> equivalence, @lgc T reference) {
            this.f77005a = (r45) v7d.checkNotNull(equivalence);
            this.f77006b = reference;
        }
    }

    public static r45<Object> equals() {
        return C11880b.f77001a;
    }

    public static r45<Object> identity() {
        return C11882d.f77004a;
    }

    @vp6
    /* JADX INFO: renamed from: a */
    public abstract boolean mo18242a(T a, T b);

    @vp6
    /* JADX INFO: renamed from: b */
    public abstract int mo18243b(T t);

    public final boolean equivalent(@wx1 T a, @wx1 T b) {
        if (a == b) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return mo18242a(a, b);
    }

    public final l8d<T> equivalentTo(@wx1 T target) {
        return new C11881c(this, target);
    }

    public final int hash(@wx1 T t) {
        if (t == null) {
            return 0;
        }
        return mo18243b(t);
    }

    public final <F> r45<F> onResultOf(lz6<? super F, ? extends T> function) {
        return new o07(function, this);
    }

    @gd7(serializable = true)
    public final <S extends T> r45<Iterable<S>> pairwise() {
        return new zcc(this);
    }

    public final <S extends T> C11883e<S> wrap(@lgc S reference) {
        return new C11883e<>(reference);
    }
}
