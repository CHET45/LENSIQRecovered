package p000;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: n4 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class AbstractC9686n4<K, V> extends AbstractC10786p4<K, V> {
    public AbstractC9686n4(SortedMap<K, Collection<V>> map) {
        super(map);
    }

    @Override // p000.AbstractC11848r2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public SortedMap<K, Collection<V>> mo17770o() {
        return (SortedMap) super.mo17770o();
    }

    @Override // p000.AbstractC11848r2, p000.AbstractC2173c3
    /* JADX INFO: renamed from: c */
    public Set<K> mo3679c() {
        return m20770s();
    }

    @Override // p000.AbstractC10786p4, p000.AbstractC7729j4, p000.AbstractC2173c3, p000.u3b
    public SortedMap<K, Collection<V>> asMap() {
        return (SortedMap) super.asMap();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }
}
