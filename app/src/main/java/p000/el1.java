package p000;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use CacheBuilder.newBuilder().build()")
@sx4
@gd7
public interface el1<K, V> {
    ConcurrentMap<K, V> asMap();

    void cleanUp();

    @op1
    V get(K key, Callable<? extends V> loader) throws ExecutionException;

    ox7<K, V> getAllPresent(Iterable<? extends Object> keys);

    @op1
    @wx1
    V getIfPresent(@rd2("K") Object key);

    void invalidate(@rd2("K") Object key);

    void invalidateAll();

    void invalidateAll(Iterable<? extends Object> keys);

    void put(K key, V value);

    void putAll(Map<? extends K, ? extends V> m);

    long size();

    om1 stats();
}
