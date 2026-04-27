package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;
import p000.AbstractC11848r2;

/* JADX INFO: renamed from: p4 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class AbstractC10786p4<K, V> extends AbstractC7729j4<K, V> implements rvf<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    public AbstractC10786p4(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // p000.AbstractC7729j4
    /* JADX INFO: renamed from: A */
    public abstract SortedSet<V> mo9181p();

    @Override // p000.AbstractC7729j4
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public SortedSet<V> mo13707t() {
        return (SortedSet<V>) mo13708v(mo9181p());
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public <E> SortedSet<E> mo13708v(Collection<E> collection) {
        return collection instanceof NavigableSet ? t6f.unmodifiableNavigableSet((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC2173c3, p000.u3b
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    public Collection<V> values() {
        return super.values();
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2
    /* JADX INFO: renamed from: w */
    public Collection<V> mo13709w(@dgc K key, Collection<V> collection) {
        return collection instanceof NavigableSet ? new AbstractC11848r2.m(key, (NavigableSet) collection, null) : new AbstractC11848r2.o(key, (SortedSet) collection, null);
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2, p000.u3b
    public SortedSet<V> get(@dgc K key) {
        return (SortedSet) super.get((Object) key);
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2, p000.u3b
    @op1
    public SortedSet<V> removeAll(@wx1 Object key) {
        return (SortedSet) super.removeAll(key);
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    @op1
    public SortedSet<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
        return (SortedSet) super.replaceValues((Object) key, (Iterable) values);
    }
}
