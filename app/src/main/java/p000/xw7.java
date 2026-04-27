package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import p000.ox7;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public abstract class xw7<K, V> extends ox7<K, V> implements k11<K, V> {

    /* JADX INFO: renamed from: xw7$a */
    public static final class C15330a<K, V> extends ox7.C10705d<K, V> {
        public C15330a() {
        }

        @Override // p000.ox7.C10705d
        @op1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C15330a<K, V> mo19089a(ox7.C10705d<K, V> builder) {
            super.mo19089a(builder);
            return this;
        }

        public C15330a(int size) {
            super(size);
        }

        @Override // p000.ox7.C10705d
        public xw7<K, V> build() {
            return buildOrThrow();
        }

        @Override // p000.ox7.C10705d
        @hh4
        @Deprecated
        public xw7<K, V> buildKeepingLast() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // p000.ox7.C10705d
        public xw7<K, V> buildOrThrow() {
            int i = this.f69150c;
            if (i == 0) {
                return xw7.m25512of();
            }
            if (this.f69148a != null) {
                if (this.f69151d) {
                    this.f69149b = Arrays.copyOf(this.f69149b, i * 2);
                }
                ox7.C10705d.m19088b(this.f69149b, this.f69150c, this.f69148a);
            }
            this.f69151d = true;
            return new kxd(this.f69149b, this.f69150c);
        }

        @Override // p000.ox7.C10705d
        @op1
        public C15330a<K, V> orderEntriesByValue(Comparator<? super V> valueComparator) {
            super.orderEntriesByValue((Comparator) valueComparator);
            return this;
        }

        @Override // p000.ox7.C10705d
        @op1
        public C15330a<K, V> put(K key, V value) {
            super.put((Object) key, (Object) value);
            return this;
        }

        @Override // p000.ox7.C10705d
        @op1
        public C15330a<K, V> putAll(Map<? extends K, ? extends V> map) {
            super.putAll((Map) map);
            return this;
        }

        @Override // p000.ox7.C10705d
        @op1
        public C15330a<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // p000.ox7.C10705d
        @op1
        public C15330a<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            super.putAll((Iterable) entries);
            return this;
        }
    }

    /* JADX INFO: renamed from: xw7$b */
    @yg8
    public static class C15331b<K, V> extends ox7.C10706e<K, V> {
        private static final long serialVersionUID = 0;

        public C15331b(xw7<K, V> bimap) {
            super(bimap);
        }

        @Override // p000.ox7.C10706e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C15330a<K, V> mo13563b(int size) {
            return new C15330a<>(size);
        }
    }

    public static <K, V> C15330a<K, V> builder() {
        return new C15330a<>();
    }

    public static <K, V> C15330a<K, V> builderWithExpectedSize(int expectedSize) {
        s72.m21765b(expectedSize, "expectedSize");
        return new C15330a<>(expectedSize);
    }

    public static <K, V> xw7<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof xw7) {
            xw7<K, V> xw7Var = (xw7) map;
            if (!xw7Var.mo2953h()) {
                return xw7Var;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> xw7<K, V> m25512of() {
        return kxd.f55591L;
    }

    @SafeVarargs
    public static <K, V> xw7<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entries) {
        return copyOf((Iterable) Arrays.asList(entries));
    }

    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p000.k11
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final V forcePut(K key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.k11
    public abstract xw7<V, K> inverse();

    @Override // p000.ox7
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final dy7<V> mo13560e() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.ox7
    @yg8
    public Object writeReplace() {
        return new C15331b(this);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> xw7<K, V> m25513of(K k1, V v1) {
        s72.m21764a(k1, v1);
        return new kxd(new Object[]{k1, v1}, 1);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> xw7<K, V> m25514of(K k1, V v1, K k2, V v2) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        return new kxd(new Object[]{k1, v1, k2, v2}, 2);
    }

    @Override // p000.ox7, java.util.Map, java.util.SortedMap
    public dy7<V> values() {
        return inverse().keySet();
    }

    public static <K, V> xw7<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return new C15330a(entries instanceof Collection ? ((Collection) entries).size() : 4).putAll((Iterable) entries).build();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> xw7<K, V> m25515of(K k1, V v1, K k2, V v2, K k3, V v3) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        return new kxd(new Object[]{k1, v1, k2, v2, k3, v3}, 3);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> xw7<K, V> m25516of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        return new kxd(new Object[]{k1, v1, k2, v2, k3, v3, k4, v4}, 4);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> xw7<K, V> m25517of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        s72.m21764a(k5, v5);
        return new kxd(new Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5}, 5);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> xw7<K, V> m25518of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        s72.m21764a(k5, v5);
        s72.m21764a(k6, v6);
        return new kxd(new Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6}, 6);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> xw7<K, V> m25519of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        s72.m21764a(k5, v5);
        s72.m21764a(k6, v6);
        s72.m21764a(k7, v7);
        return new kxd(new Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7}, 7);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> xw7<K, V> m25520of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        s72.m21764a(k5, v5);
        s72.m21764a(k6, v6);
        s72.m21764a(k7, v7);
        s72.m21764a(k8, v8);
        return new kxd(new Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8}, 8);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> xw7<K, V> m25521of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        s72.m21764a(k5, v5);
        s72.m21764a(k6, v6);
        s72.m21764a(k7, v7);
        s72.m21764a(k8, v8);
        s72.m21764a(k9, v9);
        return new kxd(new Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9}, 9);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> xw7<K, V> m25522of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        s72.m21764a(k5, v5);
        s72.m21764a(k6, v6);
        s72.m21764a(k7, v7);
        s72.m21764a(k8, v8);
        s72.m21764a(k9, v9);
        s72.m21764a(k10, v10);
        return new kxd(new Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10}, 10);
    }
}
