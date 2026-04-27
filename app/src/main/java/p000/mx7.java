package p000;

import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import p000.kx7;
import p000.ox7;
import p000.ux7;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public class mx7<K, V> extends ux7<K, V> implements j99<K, V> {

    @jd7
    @yg8
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: C */
    @RetainedWith
    @wx1
    @ez8
    public transient mx7<V, K> f62628C;

    /* JADX INFO: renamed from: mx7$a */
    public static final class C9581a<K, V> extends ux7.C13757c<K, V> {
        @Override // p000.ux7.C13757c
        @op1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C9581a<K, V> mo12033a(ux7.C13757c<K, V> other) {
            super.mo12033a(other);
            return this;
        }

        @Override // p000.ux7.C13757c
        public mx7<K, V> build() {
            return (mx7) super.build();
        }

        @Override // p000.ux7.C13757c
        @op1
        public C9581a<K, V> orderKeysBy(Comparator<? super K> keyComparator) {
            super.orderKeysBy((Comparator) keyComparator);
            return this;
        }

        @Override // p000.ux7.C13757c
        @op1
        public C9581a<K, V> orderValuesBy(Comparator<? super V> valueComparator) {
            super.orderValuesBy((Comparator) valueComparator);
            return this;
        }

        @Override // p000.ux7.C13757c
        @op1
        public C9581a<K, V> put(K key, V value) {
            super.put((Object) key, (Object) value);
            return this;
        }

        @Override // p000.ux7.C13757c
        @op1
        public C9581a<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // p000.ux7.C13757c
        @op1
        public C9581a<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            super.putAll((Iterable) entries);
            return this;
        }

        @Override // p000.ux7.C13757c
        @op1
        public C9581a<K, V> putAll(K key, Iterable<? extends V> values) {
            super.putAll((Object) key, (Iterable) values);
            return this;
        }

        @Override // p000.ux7.C13757c
        @op1
        public C9581a<K, V> putAll(K key, V... values) {
            super.putAll((Object) key, (Object[]) values);
            return this;
        }

        @Override // p000.ux7.C13757c
        @op1
        public C9581a<K, V> putAll(u3b<? extends K, ? extends V> multimap) {
            super.putAll((u3b) multimap);
            return this;
        }
    }

    public mx7(ox7<K, kx7<V>> map, int size) {
        super(map, size);
    }

    public static <K, V> C9581a<K, V> builder() {
        return new C9581a<>();
    }

    public static <K, V> mx7<K, V> copyOf(u3b<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return m17655of();
        }
        if (multimap instanceof mx7) {
            mx7<K, V> mx7Var = (mx7) multimap;
            if (!mx7Var.m23631l()) {
                return mx7Var;
            }
        }
        return m17654n(multimap.asMap().entrySet(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private mx7<V, K> invert() {
        C9581a c9581aBuilder = builder();
        quh it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c9581aBuilder.put(entry.getValue(), entry.getKey());
        }
        mx7<V, K> mx7VarBuild = c9581aBuilder.build();
        mx7VarBuild.f62628C = this;
        return mx7VarBuild;
    }

    /* JADX INFO: renamed from: n */
    public static <K, V> mx7<K, V> m17654n(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> mapEntries, @wx1 Comparator<? super V> valueComparator) {
        if (mapEntries.isEmpty()) {
            return m17655of();
        }
        ox7.C10705d c10705d = new ox7.C10705d(mapEntries.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : mapEntries) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            kx7 kx7VarCopyOf = valueComparator == null ? kx7.copyOf((Collection) value) : kx7.sortedCopyOf(valueComparator, value);
            if (!kx7VarCopyOf.isEmpty()) {
                c10705d.put(key, kx7VarCopyOf);
                size += kx7VarCopyOf.size();
            }
        }
        return new mx7<>(c10705d.buildOrThrow(), size);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> mx7<K, V> m17655of() {
        return e05.f31418F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
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
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = stream.readObject();
                Objects.requireNonNull(object2);
                c8541aBuilder.add(object2);
            }
            c10705dBuilder.put(object, c8541aBuilder.build());
            i2 += i4;
        }
        try {
            ux7.C13759e.f89345a.m2802b(this, c10705dBuilder.buildOrThrow());
            ux7.C13759e.f89346b.m2801a(this, i2);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    @jd7
    @yg8
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        b1f.m2799j(this, stream);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> mx7<K, V> m17656of(K k1, V v1) {
        C9581a c9581aBuilder = builder();
        c9581aBuilder.put((Object) k1, (Object) v1);
        return c9581aBuilder.build();
    }

    @Override // p000.ux7
    public mx7<V, K> inverse() {
        mx7<V, K> mx7Var = this.f62628C;
        if (mx7Var != null) {
            return mx7Var;
        }
        mx7<V, K> mx7VarInvert = invert();
        this.f62628C = mx7VarInvert;
        return mx7VarInvert;
    }

    @Override // p000.ux7, p000.u3b
    public kx7<V> get(K key) {
        kx7<V> kx7Var = (kx7) this.f89332f.get(key);
        return kx7Var == null ? kx7.m15110of() : kx7Var;
    }

    @Override // p000.ux7, p000.u3b
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final kx7<V> removeAll(@wx1 Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ux7, p000.AbstractC2173c3, p000.u3b
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final kx7<V> replaceValues(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> mx7<K, V> m17657of(K k1, V v1, K k2, V v2) {
        C9581a c9581aBuilder = builder();
        c9581aBuilder.put((Object) k1, (Object) v1);
        c9581aBuilder.put((Object) k2, (Object) v2);
        return c9581aBuilder.build();
    }

    public static <K, V> mx7<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return new C9581a().putAll((Iterable) entries).build();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> mx7<K, V> m17658of(K k1, V v1, K k2, V v2, K k3, V v3) {
        C9581a c9581aBuilder = builder();
        c9581aBuilder.put((Object) k1, (Object) v1);
        c9581aBuilder.put((Object) k2, (Object) v2);
        c9581aBuilder.put((Object) k3, (Object) v3);
        return c9581aBuilder.build();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> mx7<K, V> m17659of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        C9581a c9581aBuilder = builder();
        c9581aBuilder.put((Object) k1, (Object) v1);
        c9581aBuilder.put((Object) k2, (Object) v2);
        c9581aBuilder.put((Object) k3, (Object) v3);
        c9581aBuilder.put((Object) k4, (Object) v4);
        return c9581aBuilder.build();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> mx7<K, V> m17660of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C9581a c9581aBuilder = builder();
        c9581aBuilder.put((Object) k1, (Object) v1);
        c9581aBuilder.put((Object) k2, (Object) v2);
        c9581aBuilder.put((Object) k3, (Object) v3);
        c9581aBuilder.put((Object) k4, (Object) v4);
        c9581aBuilder.put((Object) k5, (Object) v5);
        return c9581aBuilder.build();
    }
}
