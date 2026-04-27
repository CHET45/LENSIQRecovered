package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class fv5<K, V> extends gv5<K, V> implements j99<K, V> {
    public fv5(j99<K, V> unfiltered, l8d<? super K> keyPredicate) {
        super(unfiltered, keyPredicate);
    }

    @Override // p000.gv5, p000.u3b
    public List<V> get(@dgc K key) {
        return (List) super.get((Object) key);
    }

    @Override // p000.gv5, p000.u3b
    public List<V> removeAll(@wx1 Object key) {
        return (List) super.removeAll(key);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public List<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
        return (List) super.replaceValues((Object) key, (Iterable) values);
    }

    @Override // p000.gv5, p000.iv5
    public j99<K, V> unfiltered() {
        return (j99) super.unfiltered();
    }
}
