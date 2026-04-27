package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: j0 */
/* JADX INFO: loaded from: classes5.dex */
@sx4
@gd7
public abstract class AbstractC7697j0<K, V> implements el1<K, V> {

    /* JADX INFO: renamed from: j0$a */
    public static final class a implements b {

        /* JADX INFO: renamed from: a */
        public final jk9 f49196a = kk9.create();

        /* JADX INFO: renamed from: b */
        public final jk9 f49197b = kk9.create();

        /* JADX INFO: renamed from: c */
        public final jk9 f49198c = kk9.create();

        /* JADX INFO: renamed from: d */
        public final jk9 f49199d = kk9.create();

        /* JADX INFO: renamed from: e */
        public final jk9 f49200e = kk9.create();

        /* JADX INFO: renamed from: f */
        public final jk9 f49201f = kk9.create();

        private static long negativeToMaxValue(long value) {
            if (value >= 0) {
                return value;
            }
            return Long.MAX_VALUE;
        }

        public void incrementBy(b other) {
            om1 om1VarSnapshot = other.snapshot();
            this.f49196a.add(om1VarSnapshot.hitCount());
            this.f49197b.add(om1VarSnapshot.missCount());
            this.f49198c.add(om1VarSnapshot.loadSuccessCount());
            this.f49199d.add(om1VarSnapshot.loadExceptionCount());
            this.f49200e.add(om1VarSnapshot.totalLoadTime());
            this.f49201f.add(om1VarSnapshot.evictionCount());
        }

        @Override // p000.AbstractC7697j0.b
        public void recordEviction() {
            this.f49201f.increment();
        }

        @Override // p000.AbstractC7697j0.b
        public void recordHits(int count) {
            this.f49196a.add(count);
        }

        @Override // p000.AbstractC7697j0.b
        public void recordLoadException(long loadTime) {
            this.f49199d.increment();
            this.f49200e.add(loadTime);
        }

        @Override // p000.AbstractC7697j0.b
        public void recordLoadSuccess(long loadTime) {
            this.f49198c.increment();
            this.f49200e.add(loadTime);
        }

        @Override // p000.AbstractC7697j0.b
        public void recordMisses(int count) {
            this.f49197b.add(count);
        }

        @Override // p000.AbstractC7697j0.b
        public om1 snapshot() {
            return new om1(negativeToMaxValue(this.f49196a.sum()), negativeToMaxValue(this.f49197b.sum()), negativeToMaxValue(this.f49198c.sum()), negativeToMaxValue(this.f49199d.sum()), negativeToMaxValue(this.f49200e.sum()), negativeToMaxValue(this.f49201f.sum()));
        }
    }

    /* JADX INFO: renamed from: j0$b */
    public interface b {
        void recordEviction();

        void recordHits(int count);

        void recordLoadException(long loadTime);

        void recordLoadSuccess(long loadTime);

        void recordMisses(int count);

        om1 snapshot();
    }

    @Override // p000.el1
    public ConcurrentMap<K, V> asMap() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.el1
    public void cleanUp() {
    }

    @Override // p000.el1
    public V get(K key, Callable<? extends V> valueLoader) throws ExecutionException {
        throw new UnsupportedOperationException();
    }

    @Override // p000.el1
    public ox7<K, V> getAllPresent(Iterable<? extends Object> keys) {
        V ifPresent;
        LinkedHashMap linkedHashMapNewLinkedHashMap = tt9.newLinkedHashMap();
        for (Object obj : keys) {
            if (!linkedHashMapNewLinkedHashMap.containsKey(obj) && (ifPresent = getIfPresent(obj)) != null) {
                linkedHashMapNewLinkedHashMap.put(obj, ifPresent);
            }
        }
        return ox7.copyOf((Map) linkedHashMapNewLinkedHashMap);
    }

    @Override // p000.el1
    public void invalidate(Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.el1
    public void invalidateAll(Iterable<? extends Object> keys) {
        Iterator<? extends Object> it = keys.iterator();
        while (it.hasNext()) {
            invalidate(it.next());
        }
    }

    @Override // p000.el1
    public void put(K key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.el1
    public void putAll(Map<? extends K, ? extends V> m) {
        for (Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.el1
    public long size() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.el1
    public om1 stats() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.el1
    public void invalidateAll() {
        throw new UnsupportedOperationException();
    }
}
