package p000;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes5.dex */
@sx4
@jd7
public abstract class cr6<K, V> extends zs6 implements el1<K, V> {

    /* JADX INFO: renamed from: cr6$a */
    public static abstract class AbstractC4469a<K, V> extends cr6<K, V> {

        /* JADX INFO: renamed from: a */
        public final el1<K, V> f27129a;

        public AbstractC4469a(el1<K, V> delegate) {
            this.f27129a = (el1) v7d.checkNotNull(delegate);
        }

        @Override // p000.cr6, p000.zs6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final el1<K, V> mo8967m() {
            return this.f27129a;
        }
    }

    @Override // p000.zs6
    /* JADX INFO: renamed from: a */
    public abstract el1<K, V> mo8967m();

    @Override // p000.el1
    public ConcurrentMap<K, V> asMap() {
        return mo8967m().asMap();
    }

    @Override // p000.el1
    public void cleanUp() {
        mo8967m().cleanUp();
    }

    @Override // p000.el1
    public V get(K key, Callable<? extends V> valueLoader) throws ExecutionException {
        return mo8967m().get(key, valueLoader);
    }

    @Override // p000.el1
    public ox7<K, V> getAllPresent(Iterable<? extends Object> keys) {
        return mo8967m().getAllPresent(keys);
    }

    @Override // p000.el1
    @wx1
    public V getIfPresent(Object key) {
        return mo8967m().getIfPresent(key);
    }

    @Override // p000.el1
    public void invalidate(Object key) {
        mo8967m().invalidate(key);
    }

    @Override // p000.el1
    public void invalidateAll(Iterable<? extends Object> keys) {
        mo8967m().invalidateAll(keys);
    }

    @Override // p000.el1
    public void put(K key, V value) {
        mo8967m().put(key, value);
    }

    @Override // p000.el1
    public void putAll(Map<? extends K, ? extends V> m) {
        mo8967m().putAll(m);
    }

    @Override // p000.el1
    public long size() {
        return mo8967m().size();
    }

    @Override // p000.el1
    public om1 stats() {
        return mo8967m().stats();
    }

    @Override // p000.el1
    public void invalidateAll() {
        mo8967m().invalidateAll();
    }
}
