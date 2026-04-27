package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class hs6<K, V> extends ts6<K, V> implements j99<K, V> {
    @Override // p000.ts6, p000.zs6
    /* JADX INFO: renamed from: delegate */
    public abstract j99<K, V> mo8967m();

    @Override // p000.ts6, p000.u3b
    public List<V> get(@dgc K key) {
        return mo8967m().get((Object) key);
    }

    @Override // p000.ts6, p000.u3b
    @op1
    public List<V> removeAll(@wx1 Object key) {
        return mo8967m().removeAll(key);
    }

    @Override // p000.ts6, p000.u3b
    @op1
    public List<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
        return mo8967m().replaceValues((Object) key, (Iterable) values);
    }
}
