package p000;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class ev5<K, V> extends cv5<K, V> implements kv5<K, V> {
    public ev5(p6f<K, V> unfiltered, l8d<? super Map.Entry<K, V>> predicate) {
        super(unfiltered, predicate);
    }

    @Override // p000.cv5, p000.AbstractC2173c3
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Set<Map.Entry<K, V>> mo3678b() {
        return t6f.filter(unfiltered().entries(), entryPredicate());
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // p000.cv5, p000.u3b
    public Set<V> get(@dgc K key) {
        return (Set) super.get((Object) key);
    }

    @Override // p000.cv5, p000.u3b
    public Set<V> removeAll(@wx1 Object key) {
        return (Set) super.removeAll(key);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public Set<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
        return (Set) super.replaceValues((Object) key, (Iterable) values);
    }

    @Override // p000.cv5, p000.iv5
    public p6f<K, V> unfiltered() {
        return (p6f) this.f27749f;
    }
}
