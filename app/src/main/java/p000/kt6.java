package p000;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class kt6<K, V> extends ts6<K, V> implements p6f<K, V> {
    @Override // p000.ts6, p000.zs6
    /* JADX INFO: renamed from: delegate */
    public abstract p6f<K, V> mo8967m();

    @Override // p000.ts6, p000.u3b
    public Set<Map.Entry<K, V>> entries() {
        return mo8967m().entries();
    }

    @Override // p000.ts6, p000.u3b
    public Set<V> get(@dgc K key) {
        return mo8967m().get((Object) key);
    }

    @Override // p000.ts6, p000.u3b
    @op1
    public Set<V> removeAll(@wx1 Object key) {
        return mo8967m().removeAll(key);
    }

    @Override // p000.ts6, p000.u3b
    @op1
    public Set<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
        return mo8967m().replaceValues((Object) key, (Iterable) values);
    }
}
