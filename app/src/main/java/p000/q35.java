package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
@yg8
public final class q35<K extends Enum<K>, V extends Enum<V>> extends AbstractC5028e0<K, V> {

    @jd7
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: f */
    public transient Class<K> f73088f;

    /* JADX INFO: renamed from: m */
    public transient Class<V> f73089m;

    private q35(Class<K> keyTypeOrObjectUnderJ2cl, Class<V> valueTypeOrObjectUnderJ2cl) {
        super(new EnumMap(keyTypeOrObjectUnderJ2cl), new EnumMap(valueTypeOrObjectUnderJ2cl));
        this.f73088f = keyTypeOrObjectUnderJ2cl;
        this.f73089m = valueTypeOrObjectUnderJ2cl;
    }

    public static <K extends Enum<K>, V extends Enum<V>> q35<K, V> create(Class<K> keyType, Class<V> valueType) {
        return new q35<>(keyType, valueType);
    }

    private static <V extends Enum<V>> Class<V> inferValueTypeOrObjectUnderJ2cl(Map<?, V> map) {
        if (map instanceof q35) {
            return ((q35) map).f73089m;
        }
        v7d.checkArgument(!map.isEmpty());
        return swc.m22269b(map.values().iterator().next());
    }

    @jd7
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        Objects.requireNonNull(object);
        this.f73088f = (Class) object;
        Object object2 = stream.readObject();
        Objects.requireNonNull(object2);
        this.f73089m = (Class) object2;
        m9609s(new EnumMap(this.f73088f), new EnumMap(this.f73089m));
        b1f.m2791b(this, stream);
    }

    /* JADX INFO: renamed from: w */
    public static <K extends Enum<K>> Class<K> m20031w(Map<K, ?> map) {
        if (map instanceof q35) {
            return ((q35) map).f73088f;
        }
        if (map instanceof a45) {
            return ((a45) map).f358f;
        }
        v7d.checkArgument(!map.isEmpty());
        return swc.m22269b(map.keySet().iterator().next());
    }

    @jd7
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.f73088f);
        stream.writeObject(this.f73089m);
        b1f.m2798i(this, stream);
    }

    @Override // p000.AbstractC5028e0, p000.qs6, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // p000.AbstractC5028e0, p000.qs6, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(@wx1 Object value) {
        return super.containsValue(value);
    }

    @Override // p000.AbstractC5028e0, p000.qs6, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC5028e0, p000.k11
    @op1
    @wx1
    public /* bridge */ /* synthetic */ Object forcePut(@dgc Object key, @dgc Object value) {
        return super.forcePut(key, value);
    }

    @Override // p000.AbstractC5028e0, p000.k11
    public /* bridge */ /* synthetic */ k11 inverse() {
        return super.inverse();
    }

    @Override // p000.AbstractC5028e0, p000.qs6, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @jd7
    public Class<K> keyType() {
        return this.f73088f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC5028e0, p000.qs6, java.util.Map, p000.k11
    @op1
    @wx1
    public /* bridge */ /* synthetic */ Object put(@dgc Object key, @dgc Object value) {
        return super.put(key, value);
    }

    @Override // p000.AbstractC5028e0, p000.qs6, java.util.Map, p000.k11
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // p000.AbstractC5028e0, p000.qs6, java.util.Map
    @op1
    @wx1
    public /* bridge */ /* synthetic */ Object remove(@wx1 Object key) {
        return super.remove(key);
    }

    @Override // p000.AbstractC5028e0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public K mo135o(K key) {
        return (K) v7d.checkNotNull(key);
    }

    @Override // p000.AbstractC5028e0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public V mo9606p(V value) {
        return (V) v7d.checkNotNull(value);
    }

    @jd7
    public Class<V> valueType() {
        return this.f73089m;
    }

    @Override // p000.AbstractC5028e0, p000.qs6, java.util.Map, p000.k11
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public static <K extends Enum<K>, V extends Enum<V>> q35<K, V> create(Map<K, V> map) {
        q35<K, V> q35VarCreate = create(m20031w(map), inferValueTypeOrObjectUnderJ2cl(map));
        q35VarCreate.putAll(map);
        return q35VarCreate;
    }
}
