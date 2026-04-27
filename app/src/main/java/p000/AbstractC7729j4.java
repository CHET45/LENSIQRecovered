package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p000.AbstractC11848r2;

/* JADX INFO: renamed from: j4 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class AbstractC7729j4<K, V> extends AbstractC11848r2<K, V> implements p6f<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    public AbstractC7729j4(Map<K, Collection<V>> map) {
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
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // p000.AbstractC11848r2
    /* JADX INFO: renamed from: w */
    public Collection<V> mo13709w(@dgc K key, Collection<V> collection) {
        return new AbstractC11848r2.n(key, (Set) collection);
    }

    @Override // p000.AbstractC11848r2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract Set<V> mo9181p();

    @Override // p000.AbstractC11848r2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Set<V> mo13707t() {
        return Collections.emptySet();
    }

    @Override // p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // p000.AbstractC11848r2, p000.u3b
    public Set<V> get(@dgc K key) {
        return (Set) super.get((Object) key);
    }

    @Override // p000.AbstractC11848r2, p000.u3b
    @op1
    public Set<V> removeAll(@wx1 Object key) {
        return (Set) super.removeAll(key);
    }

    @Override // p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    @op1
    public Set<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
        return (Set) super.replaceValues((Object) key, (Iterable) values);
    }
}
