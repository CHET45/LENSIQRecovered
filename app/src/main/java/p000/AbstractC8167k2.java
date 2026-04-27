package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: k2 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class AbstractC8167k2<K, V> extends AbstractC11848r2<K, V> implements j99<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public AbstractC8167k2(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public boolean equals(@wx1 Object object) {
        return super.equals(object);
    }

    @Override // p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    @op1
    public boolean put(@dgc K key, @dgc V value) {
        return super.put(key, value);
    }

    @Override // p000.AbstractC11848r2
    /* JADX INFO: renamed from: v */
    public <E> Collection<E> mo13708v(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // p000.AbstractC11848r2
    /* JADX INFO: renamed from: w */
    public Collection<V> mo13709w(@dgc K key, Collection<V> collection) {
        return m20772x(key, (List) collection, null);
    }

    @Override // p000.AbstractC11848r2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract List<V> mo9181p();

    @Override // p000.AbstractC11848r2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public List<V> mo13707t() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC11848r2, p000.u3b
    public List<V> get(@dgc K key) {
        return (List) super.get((Object) key);
    }

    @Override // p000.AbstractC11848r2, p000.u3b
    @op1
    public List<V> removeAll(@wx1 Object key) {
        return (List) super.removeAll(key);
    }

    @Override // p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    @op1
    public List<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
        return (List) super.replaceValues((Object) key, (Iterable) values);
    }
}
