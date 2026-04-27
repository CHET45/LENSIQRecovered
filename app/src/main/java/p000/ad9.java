package p000;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes5.dex */
@sx4
@gd7
public interface ad9<K, V> extends el1<K, V>, lz6<K, V> {
    @Override // p000.lz6
    @Deprecated
    V apply(K key);

    @Override // p000.el1
    ConcurrentMap<K, V> asMap();

    @op1
    V get(K key) throws ExecutionException;

    @op1
    ox7<K, V> getAll(Iterable<? extends K> keys) throws ExecutionException;

    @op1
    V getUnchecked(K key);

    void refresh(K key);
}
