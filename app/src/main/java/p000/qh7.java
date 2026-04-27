package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public final class qh7<K, V> extends rh7<K, V> {

    /* JADX INFO: renamed from: F */
    public static final int f74460F = 2;

    @jd7
    @yg8
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: C */
    @gdi
    public transient int f74461C;

    private qh7() {
        this(12, 2);
    }

    public static <K, V> qh7<K, V> create() {
        return new qh7<>();
    }

    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        this.f74461C = 2;
        int iM2797h = b1f.m2797h(stream);
        m20771u(swc.m22271d(12));
        b1f.m2794e(this, stream, iM2797h);
    }

    @jd7
    @yg8
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        b1f.m2799j(this, stream);
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // p000.AbstractC11848r2, p000.u3b
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean containsEntry(@wx1 Object key, @wx1 Object value) {
        return super.containsEntry(key, value);
    }

    @Override // p000.AbstractC11848r2, p000.u3b
    public /* bridge */ /* synthetic */ boolean containsKey(@wx1 Object key) {
        return super.containsKey(key);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean containsValue(@wx1 Object value) {
        return super.containsValue(value);
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ Set entries() {
        return super.entries();
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean equals(@wx1 Object object) {
        return super.equals(object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2, p000.u3b
    public /* bridge */ /* synthetic */ Set get(@dgc Object key) {
        return super.get(key);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ d4b keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean put(@dgc Object key, @dgc Object value) {
        return super.put(key, value);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean putAll(u3b multimap) {
        return super.putAll(multimap);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean remove(@wx1 Object key, @wx1 Object value) {
        return super.remove(key, value);
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ Set removeAll(@wx1 Object key) {
        return super.removeAll(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ Set replaceValues(@dgc Object key, Iterable values) {
        return super.replaceValues(key, values);
    }

    @Override // p000.AbstractC11848r2, p000.u3b
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // p000.AbstractC2173c3
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2
    /* JADX INFO: renamed from: y */
    public Set<V> mo9181p() {
        return swc.m22272e(this.f74461C);
    }

    private qh7(int expectedKeys, int expectedValuesPerKey) {
        super(swc.m22271d(expectedKeys));
        this.f74461C = 2;
        v7d.checkArgument(expectedValuesPerKey >= 0);
        this.f74461C = expectedValuesPerKey;
    }

    public static <K, V> qh7<K, V> create(int expectedKeys, int expectedValuesPerKey) {
        return new qh7<>(expectedKeys, expectedValuesPerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean putAll(@dgc Object key, Iterable values) {
        return super.putAll(key, values);
    }

    public static <K, V> qh7<K, V> create(u3b<? extends K, ? extends V> multimap) {
        return new qh7<>(multimap);
    }

    private qh7(u3b<? extends K, ? extends V> multimap) {
        super(swc.m22271d(multimap.keySet().size()));
        this.f74461C = 2;
        putAll(multimap);
    }
}
