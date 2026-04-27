package p000;

import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import p000.b1f;
import p000.dy7;
import p000.ox7;
import p000.py7;
import p000.ux7;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public class gy7<K, V> extends ux7<K, V> implements p6f<K, V> {

    @jd7
    @yg8
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: C */
    public final transient dy7<V> f41816C;

    /* JADX INFO: renamed from: F */
    @RetainedWith
    @wx1
    @ez8
    public transient gy7<V, K> f41817F;

    /* JADX INFO: renamed from: H */
    @RetainedWith
    @wx1
    @ez8
    public transient dy7<Map.Entry<K, V>> f41818H;

    /* JADX INFO: renamed from: gy7$a */
    public static final class C6650a<K, V> extends ux7.C13757c<K, V> {
        @Override // p000.ux7.C13757c
        /* JADX INFO: renamed from: b */
        public Collection<V> mo12034b() {
            return swc.m22275h();
        }

        @Override // p000.ux7.C13757c
        @op1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C6650a<K, V> mo12033a(ux7.C13757c<K, V> other) {
            super.mo12033a(other);
            return this;
        }

        @Override // p000.ux7.C13757c
        public gy7<K, V> build() {
            Collection collectionEntrySet = this.f89341a.entrySet();
            Comparator<? super K> comparator = this.f89342b;
            if (comparator != null) {
                collectionEntrySet = s7c.from(comparator).m21770a().immutableSortedCopy(collectionEntrySet);
            }
            return gy7.m12026n(collectionEntrySet, this.f89343c);
        }

        @Override // p000.ux7.C13757c
        @op1
        public C6650a<K, V> orderKeysBy(Comparator<? super K> keyComparator) {
            super.orderKeysBy((Comparator) keyComparator);
            return this;
        }

        @Override // p000.ux7.C13757c
        @op1
        public C6650a<K, V> orderValuesBy(Comparator<? super V> valueComparator) {
            super.orderValuesBy((Comparator) valueComparator);
            return this;
        }

        @Override // p000.ux7.C13757c
        @op1
        public C6650a<K, V> put(K key, V value) {
            super.put((Object) key, (Object) value);
            return this;
        }

        @Override // p000.ux7.C13757c
        @op1
        public C6650a<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // p000.ux7.C13757c
        @op1
        public C6650a<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            super.putAll((Iterable) entries);
            return this;
        }

        @Override // p000.ux7.C13757c
        @op1
        public C6650a<K, V> putAll(K key, Iterable<? extends V> values) {
            super.putAll((Object) key, (Iterable) values);
            return this;
        }

        @Override // p000.ux7.C13757c
        @op1
        public C6650a<K, V> putAll(K key, V... values) {
            return putAll((Object) key, (Iterable) Arrays.asList(values));
        }

        @Override // p000.ux7.C13757c
        @op1
        public C6650a<K, V> putAll(u3b<? extends K, ? extends V> multimap) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : multimap.asMap().entrySet()) {
                putAll((Object) entry.getKey(), (Iterable) entry.getValue());
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: gy7$b */
    public static final class C6651b<K, V> extends dy7<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: f */
        @Weak
        public final transient gy7<K, V> f41819f;

        public C6651b(gy7<K, V> multimap) {
            this.f41819f = multimap;
        }

        @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            return this.f41819f.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f41819f.size();
        }

        @Override // p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public quh<Map.Entry<K, V>> iterator() {
            return this.f41819f.mo3682f();
        }
    }

    /* JADX INFO: renamed from: gy7$c */
    @jd7
    @yg8
    public static final class C6652c {

        /* JADX INFO: renamed from: a */
        public static final b1f.C1698b<gy7> f41820a = b1f.m2790a(gy7.class, "emptySet");

        private C6652c() {
        }
    }

    public gy7(ox7<K, dy7<V>> map, int size, @wx1 Comparator<? super V> valueComparator) {
        super(map, size);
        this.f41816C = emptySet(valueComparator);
    }

    public static <K, V> C6650a<K, V> builder() {
        return new C6650a<>();
    }

    public static <K, V> gy7<K, V> copyOf(u3b<? extends K, ? extends V> multimap) {
        return copyOf(multimap, null);
    }

    private static <V> dy7<V> emptySet(@wx1 Comparator<? super V> valueComparator) {
        return valueComparator == null ? dy7.m9575of() : py7.m19839l(valueComparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private gy7<V, K> invert() {
        C6650a c6650aBuilder = builder();
        quh it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c6650aBuilder.put(entry.getValue(), entry.getKey());
        }
        gy7<V, K> gy7VarBuild = c6650aBuilder.build();
        gy7VarBuild.f41817F = this;
        return gy7VarBuild;
    }

    /* JADX INFO: renamed from: n */
    public static <K, V> gy7<K, V> m12026n(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> mapEntries, @wx1 Comparator<? super V> valueComparator) {
        if (mapEntries.isEmpty()) {
            return m12027of();
        }
        ox7.C10705d c10705d = new ox7.C10705d(mapEntries.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : mapEntries) {
            K key = entry.getKey();
            dy7 dy7VarValueSet = valueSet(valueComparator, entry.getValue());
            if (!dy7VarValueSet.isEmpty()) {
                c10705d.put(key, dy7VarValueSet);
                size += dy7VarValueSet.size();
            }
        }
        return new gy7<>(c10705d.buildOrThrow(), size, valueComparator);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> gy7<K, V> m12027of() {
        return f05.f34629L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Comparator comparator = (Comparator) stream.readObject();
        int i = stream.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Invalid key count " + i);
        }
        ox7.C10705d c10705dBuilder = ox7.builder();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            int i4 = stream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException("Invalid value count " + i4);
            }
            dy7.C5007a c5007aValuesBuilder = valuesBuilder(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = stream.readObject();
                Objects.requireNonNull(object2);
                c5007aValuesBuilder.add(object2);
            }
            dy7 dy7VarBuild = c5007aValuesBuilder.build();
            if (dy7VarBuild.size() != i4) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + object);
            }
            c10705dBuilder.put(object, dy7VarBuild);
            i2 += i4;
        }
        try {
            ux7.C13759e.f89345a.m2802b(this, c10705dBuilder.buildOrThrow());
            ux7.C13759e.f89346b.m2801a(this, i2);
            C6652c.f41820a.m2802b(this, emptySet(comparator));
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private static <V> dy7<V> valueSet(@wx1 Comparator<? super V> valueComparator, Collection<? extends V> values) {
        return valueComparator == null ? dy7.copyOf((Collection) values) : py7.copyOf((Comparator) valueComparator, (Collection) values);
    }

    private static <V> dy7.C5007a<V> valuesBuilder(@wx1 Comparator<? super V> valueComparator) {
        return valueComparator == null ? new dy7.C5007a<>() : new py7.C11183a(valueComparator);
    }

    @jd7
    @yg8
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(valueComparator());
        b1f.m2799j(this, stream);
    }

    @wx1
    public Comparator<? super V> valueComparator() {
        dy7<V> dy7Var = this.f41816C;
        if (dy7Var instanceof py7) {
            return ((py7) dy7Var).comparator();
        }
        return null;
    }

    private static <K, V> gy7<K, V> copyOf(u3b<? extends K, ? extends V> multimap, @wx1 Comparator<? super V> valueComparator) {
        v7d.checkNotNull(multimap);
        if (multimap.isEmpty() && valueComparator == null) {
            return m12027of();
        }
        if (multimap instanceof gy7) {
            gy7<K, V> gy7Var = (gy7) multimap;
            if (!gy7Var.m23631l()) {
                return gy7Var;
            }
        }
        return m12026n(multimap.asMap().entrySet(), valueComparator);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> gy7<K, V> m12028of(K k1, V v1) {
        C6650a c6650aBuilder = builder();
        c6650aBuilder.put((Object) k1, (Object) v1);
        return c6650aBuilder.build();
    }

    @Override // p000.ux7
    public gy7<V, K> inverse() {
        gy7<V, K> gy7Var = this.f41817F;
        if (gy7Var != null) {
            return gy7Var;
        }
        gy7<V, K> gy7VarInvert = invert();
        this.f41817F = gy7VarInvert;
        return gy7VarInvert;
    }

    @Override // p000.ux7, p000.AbstractC2173c3, p000.u3b
    public dy7<Map.Entry<K, V>> entries() {
        dy7<Map.Entry<K, V>> dy7Var = this.f41818H;
        if (dy7Var != null) {
            return dy7Var;
        }
        C6651b c6651b = new C6651b(this);
        this.f41818H = c6651b;
        return c6651b;
    }

    @Override // p000.ux7, p000.u3b
    public dy7<V> get(K key) {
        return (dy7) yya.firstNonNull((dy7) this.f89332f.get(key), this.f41816C);
    }

    @Override // p000.ux7, p000.u3b
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final dy7<V> removeAll(@wx1 Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ux7, p000.AbstractC2173c3, p000.u3b
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final dy7<V> replaceValues(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> gy7<K, V> m12029of(K k1, V v1, K k2, V v2) {
        C6650a c6650aBuilder = builder();
        c6650aBuilder.put((Object) k1, (Object) v1);
        c6650aBuilder.put((Object) k2, (Object) v2);
        return c6650aBuilder.build();
    }

    public static <K, V> gy7<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return new C6650a().putAll((Iterable) entries).build();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> gy7<K, V> m12030of(K k1, V v1, K k2, V v2, K k3, V v3) {
        C6650a c6650aBuilder = builder();
        c6650aBuilder.put((Object) k1, (Object) v1);
        c6650aBuilder.put((Object) k2, (Object) v2);
        c6650aBuilder.put((Object) k3, (Object) v3);
        return c6650aBuilder.build();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> gy7<K, V> m12031of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        C6650a c6650aBuilder = builder();
        c6650aBuilder.put((Object) k1, (Object) v1);
        c6650aBuilder.put((Object) k2, (Object) v2);
        c6650aBuilder.put((Object) k3, (Object) v3);
        c6650aBuilder.put((Object) k4, (Object) v4);
        return c6650aBuilder.build();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> gy7<K, V> m12032of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C6650a c6650aBuilder = builder();
        c6650aBuilder.put((Object) k1, (Object) v1);
        c6650aBuilder.put((Object) k2, (Object) v2);
        c6650aBuilder.put((Object) k3, (Object) v3);
        c6650aBuilder.put((Object) k4, (Object) v4);
        c6650aBuilder.put((Object) k5, (Object) v5);
        return c6650aBuilder.build();
    }
}
