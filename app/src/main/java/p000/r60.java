package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public final class r60<K, V> extends s60<K, V> {

    /* JADX INFO: renamed from: F */
    public static final int f77103F = 3;

    @jd7
    @yg8
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: C */
    @gdi
    public transient int f77104C;

    private r60() {
        this(12, 3);
    }

    public static <K, V> r60<K, V> create() {
        return new r60<>();
    }

    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        this.f77104C = 3;
        int iM2797h = b1f.m2797h(stream);
        m20771u(pc2.create());
        b1f.m2794e(this, stream, iM2797h);
    }

    @jd7
    @yg8
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        b1f.m2799j(this, stream);
    }

    @Override // p000.AbstractC8167k2, p000.AbstractC2173c3, p000.u3b
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

    @Override // p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ Collection entries() {
        return super.entries();
    }

    @Override // p000.AbstractC8167k2, p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean equals(@wx1 Object object) {
        return super.equals(object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC8167k2, p000.AbstractC11848r2, p000.u3b
    public /* bridge */ /* synthetic */ List get(@dgc Object key) {
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
    @Override // p000.AbstractC8167k2, p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
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

    @Override // p000.AbstractC8167k2, p000.AbstractC11848r2, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ List removeAll(@wx1 Object key) {
        return super.removeAll(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC8167k2, p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ List replaceValues(@dgc Object key, Iterable values) {
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

    @Deprecated
    public void trimToSize() {
        Iterator<Collection<V>> it = mo17770o().values().iterator();
        while (it.hasNext()) {
            ((ArrayList) it.next()).trimToSize();
        }
    }

    @Override // p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @Override // p000.AbstractC8167k2, p000.AbstractC11848r2
    /* JADX INFO: renamed from: y */
    public List<V> mo9181p() {
        return new ArrayList(this.f77104C);
    }

    private r60(int expectedKeys, int expectedValuesPerKey) {
        super(swc.m22271d(expectedKeys));
        s72.m21765b(expectedValuesPerKey, "expectedValuesPerKey");
        this.f77104C = expectedValuesPerKey;
    }

    public static <K, V> r60<K, V> create(int expectedKeys, int expectedValuesPerKey) {
        return new r60<>(expectedKeys, expectedValuesPerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean putAll(@dgc Object key, Iterable values) {
        return super.putAll(key, values);
    }

    public static <K, V> r60<K, V> create(u3b<? extends K, ? extends V> multimap) {
        return new r60<>(multimap);
    }

    private r60(u3b<? extends K, ? extends V> multimap) {
        this(multimap.keySet().size(), multimap instanceof r60 ? ((r60) multimap).f77104C : 3);
        putAll(multimap);
    }
}
