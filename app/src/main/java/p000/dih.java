package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public class dih<K, V> extends AbstractC9686n4<K, V> {

    @jd7
    @yg8
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: C */
    public transient Comparator<? super K> f29726C;

    /* JADX INFO: renamed from: F */
    public transient Comparator<? super V> f29727F;

    public dih(Comparator<? super K> keyComparator, Comparator<? super V> valueComparator) {
        super(new TreeMap(keyComparator));
        this.f29726C = keyComparator;
        this.f29727F = valueComparator;
    }

    public static <K extends Comparable, V extends Comparable> dih<K, V> create() {
        return new dih<>(s7c.natural(), s7c.natural());
    }

    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        this.f29726C = (Comparator) v7d.checkNotNull((Comparator) stream.readObject());
        this.f29727F = (Comparator) v7d.checkNotNull((Comparator) stream.readObject());
        m20771u(new TreeMap(this.f29726C));
        b1f.m2793d(this, stream);
    }

    @jd7
    @yg8
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(keyComparator());
        stream.writeObject(valueComparator());
        b1f.m2799j(this, stream);
    }

    @Override // p000.AbstractC10786p4, p000.AbstractC7729j4
    /* JADX INFO: renamed from: A */
    public SortedSet<V> mo9181p() {
        return new TreeSet(this.f29727F);
    }

    @Override // p000.AbstractC11848r2, p000.AbstractC2173c3
    /* JADX INFO: renamed from: a */
    public Map<K, Collection<V>> mo3677a() {
        return m20769r();
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

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Deprecated
    public Comparator<? super K> keyComparator() {
        return this.f29726C;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC11848r2
    /* JADX INFO: renamed from: q */
    public Collection<V> mo9182q(@dgc K key) {
        if (key == 0) {
            keyComparator().compare(key, key);
        }
        return super.mo9182q(key);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean remove(@wx1 Object key, @wx1 Object value) {
        return super.remove(key, value);
    }

    @Override // p000.AbstractC10786p4, p000.AbstractC7729j4, p000.AbstractC11848r2, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ SortedSet removeAll(@wx1 Object key) {
        return super.removeAll(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC10786p4, p000.AbstractC7729j4, p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ SortedSet replaceValues(@dgc Object key, Iterable values) {
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

    @Override // p000.rvf
    public Comparator<? super V> valueComparator() {
        return this.f29727F;
    }

    @Override // p000.AbstractC10786p4, p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <K, V> dih<K, V> create(Comparator<? super K> keyComparator, Comparator<? super V> valueComparator) {
        return new dih<>((Comparator) v7d.checkNotNull(keyComparator), (Comparator) v7d.checkNotNull(valueComparator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean putAll(@dgc Object key, Iterable values) {
        return super.putAll(key, values);
    }

    public static <K extends Comparable, V extends Comparable> dih<K, V> create(u3b<? extends K, ? extends V> multimap) {
        return new dih<>(s7c.natural(), s7c.natural(), multimap);
    }

    @Override // p000.AbstractC9686n4, p000.AbstractC10786p4, p000.AbstractC7729j4, p000.AbstractC2173c3, p000.u3b
    public NavigableMap<K, Collection<V>> asMap() {
        return (NavigableMap) super.asMap();
    }

    @Override // p000.AbstractC9686n4, p000.AbstractC2173c3, p000.u3b
    public NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    private dih(Comparator<? super K> keyComparator, Comparator<? super V> valueComparator, u3b<? extends K, ? extends V> multimap) {
        this(keyComparator, valueComparator);
        putAll(multimap);
    }

    @Override // p000.AbstractC10786p4, p000.AbstractC7729j4, p000.AbstractC11848r2, p000.u3b
    @jd7
    public NavigableSet<V> get(@dgc K key) {
        return (NavigableSet) super.get((Object) key);
    }
}
