package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: m2 */
/* JADX INFO: loaded from: classes5.dex */
@sx4
@jd7
public abstract class AbstractC9096m2<K, V> extends AbstractC7697j0<K, V> implements ad9<K, V> {
    @Override // p000.ad9, p000.lz6
    public final V apply(K key) {
        return getUnchecked(key);
    }

    @Override // p000.ad9
    public ox7<K, V> getAll(Iterable<? extends K> keys) throws ExecutionException {
        LinkedHashMap linkedHashMapNewLinkedHashMap = tt9.newLinkedHashMap();
        for (K k : keys) {
            if (!linkedHashMapNewLinkedHashMap.containsKey(k)) {
                linkedHashMapNewLinkedHashMap.put(k, get(k));
            }
        }
        return ox7.copyOf((Map) linkedHashMapNewLinkedHashMap);
    }

    @Override // p000.ad9
    @op1
    public V getUnchecked(K key) {
        try {
            return get(key);
        } catch (ExecutionException e) {
            throw new orh(e.getCause());
        }
    }

    @Override // p000.ad9
    public void refresh(K key) {
        throw new UnsupportedOperationException();
    }
}
