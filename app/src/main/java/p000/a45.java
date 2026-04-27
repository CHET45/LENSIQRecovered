package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
@yg8
public final class a45<K extends Enum<K>, V> extends AbstractC5028e0<K, V> {

    @jd7
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: f */
    public transient Class<K> f358f;

    private a45(Class<K> keyType) {
        super(new EnumMap(keyType), new HashMap());
        this.f358f = keyType;
    }

    public static <K extends Enum<K>, V> a45<K, V> create(Class<K> keyType) {
        return new a45<>(keyType);
    }

    @jd7
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        Objects.requireNonNull(object);
        this.f358f = (Class) object;
        m9609s(new EnumMap(this.f358f), new HashMap());
        b1f.m2791b(this, stream);
    }

    @jd7
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.f358f);
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
        return this.f358f;
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

    @Override // p000.AbstractC5028e0, p000.qs6, java.util.Map, p000.k11
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public static <K extends Enum<K>, V> a45<K, V> create(Map<K, ? extends V> map) {
        a45<K, V> a45VarCreate = create(q35.m20031w(map));
        a45VarCreate.putAll(map);
        return a45VarCreate;
    }

    @Override // p000.AbstractC5028e0, p000.k11
    @op1
    @wx1
    public V forcePut(K k, @dgc V v) {
        return (V) super.forcePut(k, (Object) v);
    }

    @Override // p000.AbstractC5028e0, p000.qs6, java.util.Map, p000.k11
    @op1
    @wx1
    public V put(K k, @dgc V v) {
        return (V) super.put(k, (Object) v);
    }
}
