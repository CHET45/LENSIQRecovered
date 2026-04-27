package p000;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public final class p07 {

    /* JADX INFO: renamed from: p07$b */
    public static class C10731b<E> implements lz6<Object, E>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        @lgc
        public final E f69323a;

        public C10731b(@lgc E value) {
            this.f69323a = value;
        }

        @Override // p000.lz6
        @lgc
        public E apply(@wx1 Object from) {
            return this.f69323a;
        }

        @Override // p000.lz6
        public boolean equals(@wx1 Object obj) {
            if (obj instanceof C10731b) {
                return okb.equal(this.f69323a, ((C10731b) obj).f69323a);
            }
            return false;
        }

        public int hashCode() {
            E e = this.f69323a;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }

        public String toString() {
            return "Functions.constant(" + this.f69323a + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: p07$c */
    public static class C10732c<K, V> implements lz6<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Map<K, ? extends V> f69324a;

        /* JADX INFO: renamed from: b */
        @lgc
        public final V f69325b;

        public C10732c(Map<K, ? extends V> map, @lgc V defaultValue) {
            this.f69324a = (Map) v7d.checkNotNull(map);
            this.f69325b = defaultValue;
        }

        @Override // p000.lz6
        @lgc
        public V apply(@lgc K k) {
            V v = this.f69324a.get(k);
            return (v != null || this.f69324a.containsKey(k)) ? (V) uib.m23370a(v) : this.f69325b;
        }

        @Override // p000.lz6
        public boolean equals(@wx1 Object o) {
            if (!(o instanceof C10732c)) {
                return false;
            }
            C10732c c10732c = (C10732c) o;
            return this.f69324a.equals(c10732c.f69324a) && okb.equal(this.f69325b, c10732c.f69325b);
        }

        public int hashCode() {
            return okb.hashCode(this.f69324a, this.f69325b);
        }

        public String toString() {
            return "Functions.forMap(" + this.f69324a + ", defaultValue=" + this.f69325b + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: p07$d */
    public static class C10733d<A, B, C> implements lz6<A, C>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final lz6<B, C> f69326a;

        /* JADX INFO: renamed from: b */
        public final lz6<A, ? extends B> f69327b;

        public C10733d(lz6<B, C> g, lz6<A, ? extends B> f) {
            this.f69326a = (lz6) v7d.checkNotNull(g);
            this.f69327b = (lz6) v7d.checkNotNull(f);
        }

        @Override // p000.lz6
        @lgc
        public C apply(@lgc A a) {
            return (C) this.f69326a.apply(this.f69327b.apply(a));
        }

        @Override // p000.lz6
        public boolean equals(@wx1 Object obj) {
            if (!(obj instanceof C10733d)) {
                return false;
            }
            C10733d c10733d = (C10733d) obj;
            return this.f69327b.equals(c10733d.f69327b) && this.f69326a.equals(c10733d.f69326a);
        }

        public int hashCode() {
            return this.f69327b.hashCode() ^ this.f69326a.hashCode();
        }

        public String toString() {
            return this.f69326a + c0b.f15433c + this.f69327b + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: p07$e */
    public static class C10734e<K, V> implements lz6<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Map<K, V> f69328a;

        public C10734e(Map<K, V> map) {
            this.f69328a = (Map) v7d.checkNotNull(map);
        }

        @Override // p000.lz6
        @lgc
        public V apply(@lgc K k) {
            V v = this.f69328a.get(k);
            v7d.checkArgument(v != null || this.f69328a.containsKey(k), "Key '%s' not present in map", k);
            return (V) uib.m23370a(v);
        }

        @Override // p000.lz6
        public boolean equals(@wx1 Object o) {
            if (o instanceof C10734e) {
                return this.f69328a.equals(((C10734e) o).f69328a);
            }
            return false;
        }

        public int hashCode() {
            return this.f69328a.hashCode();
        }

        public String toString() {
            return "Functions.forMap(" + this.f69328a + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: p07$f */
    public enum EnumC10735f implements lz6<Object, Object> {
        INSTANCE;

        @Override // p000.lz6
        @wx1
        public Object apply(@wx1 Object o) {
            return o;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }
    }

    /* JADX INFO: renamed from: p07$g */
    public static class C10736g<T> implements lz6<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final l8d<T> f69331a;

        @Override // p000.lz6
        public boolean equals(@wx1 Object obj) {
            if (obj instanceof C10736g) {
                return this.f69331a.equals(((C10736g) obj).f69331a);
            }
            return false;
        }

        public int hashCode() {
            return this.f69331a.hashCode();
        }

        public String toString() {
            return "Functions.forPredicate(" + this.f69331a + c0b.f15434d;
        }

        private C10736g(l8d<T> predicate) {
            this.f69331a = (l8d) v7d.checkNotNull(predicate);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.lz6
        public Boolean apply(@lgc T t) {
            return Boolean.valueOf(this.f69331a.apply(t));
        }
    }

    /* JADX INFO: renamed from: p07$h */
    public static class C10737h<F, T> implements lz6<F, T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final lfg<T> f69332a;

        @Override // p000.lz6
        @lgc
        public T apply(@lgc F input) {
            return this.f69332a.get();
        }

        @Override // p000.lz6
        public boolean equals(@wx1 Object obj) {
            if (obj instanceof C10737h) {
                return this.f69332a.equals(((C10737h) obj).f69332a);
            }
            return false;
        }

        public int hashCode() {
            return this.f69332a.hashCode();
        }

        public String toString() {
            return "Functions.forSupplier(" + this.f69332a + c0b.f15434d;
        }

        private C10737h(lfg<T> supplier) {
            this.f69332a = (lfg) v7d.checkNotNull(supplier);
        }
    }

    /* JADX INFO: renamed from: p07$i */
    public enum EnumC10738i implements lz6<Object, String> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }

        @Override // p000.lz6
        public String apply(Object o) {
            v7d.checkNotNull(o);
            return o.toString();
        }
    }

    private p07() {
    }

    public static <A, B, C> lz6<A, C> compose(lz6<B, C> g, lz6<A, ? extends B> f) {
        return new C10733d(g, f);
    }

    public static <E> lz6<Object, E> constant(@lgc E value) {
        return new C10731b(value);
    }

    public static <K, V> lz6<K, V> forMap(Map<K, V> map) {
        return new C10734e(map);
    }

    public static <T> lz6<T, Boolean> forPredicate(l8d<T> predicate) {
        return new C10736g(predicate);
    }

    public static <F, T> lz6<F, T> forSupplier(lfg<T> supplier) {
        return new C10737h(supplier);
    }

    public static <E> lz6<E, E> identity() {
        return EnumC10735f.INSTANCE;
    }

    public static lz6<Object, String> toStringFunction() {
        return EnumC10738i.INSTANCE;
    }

    public static <K, V> lz6<K, V> forMap(Map<K, ? extends V> map, @lgc V defaultValue) {
        return new C10732c(map, defaultValue);
    }
}
