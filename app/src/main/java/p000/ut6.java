package p000;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class ut6<K, V> extends kt6<K, V> implements rvf<K, V> {
    @Override // p000.kt6, p000.ts6, p000.zs6
    /* JADX INFO: renamed from: delegate */
    public abstract rvf<K, V> mo8967m();

    @Override // p000.rvf
    @wx1
    public Comparator<? super V> valueComparator() {
        return mo8967m().valueComparator();
    }

    @Override // p000.kt6, p000.ts6, p000.u3b
    public SortedSet<V> get(@dgc K key) {
        return mo8967m().get((Object) key);
    }

    @Override // p000.kt6, p000.ts6, p000.u3b
    public SortedSet<V> removeAll(@wx1 Object key) {
        return mo8967m().removeAll(key);
    }

    @Override // p000.kt6, p000.ts6, p000.u3b
    public SortedSet<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
        return mo8967m().replaceValues((Object) key, (Iterable) values);
    }
}
