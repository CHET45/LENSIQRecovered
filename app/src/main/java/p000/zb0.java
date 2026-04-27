package p000;

import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@qx4
@yg8
public final class zb0<K> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<K, AtomicLong> f104658a;

    /* JADX INFO: renamed from: b */
    @wx1
    @ez8
    public transient Map<K, Long> f104659b;

    /* JADX INFO: renamed from: zb0$a */
    public class C16062a implements lz6<AtomicLong, Long> {
        public C16062a(final zb0 this$0) {
        }

        @Override // p000.lz6
        public Long apply(AtomicLong atomic) {
            return Long.valueOf(atomic.get());
        }
    }

    private zb0(ConcurrentHashMap<K, AtomicLong> map) {
        this.f104658a = (ConcurrentHashMap) v7d.checkNotNull(map);
    }

    public static <K> zb0<K> create() {
        return new zb0<>(new ConcurrentHashMap());
    }

    private Map<K, Long> createAsMap() {
        return Collections.unmodifiableMap(tt9.transformValues(this.f104658a, new C16062a(this)));
    }

    /* JADX INFO: renamed from: a */
    public long m26634a(K key, long newValue) {
        AtomicLong atomicLongPutIfAbsent;
        do {
            atomicLongPutIfAbsent = this.f104658a.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.f104658a.putIfAbsent(key, new AtomicLong(newValue))) == null) {
                return 0L;
            }
            long j = atomicLongPutIfAbsent.get();
            if (j != 0) {
                return j;
            }
        } while (!this.f104658a.replace(key, atomicLongPutIfAbsent, new AtomicLong(newValue)));
        return 0L;
    }

    @op1
    public long addAndGet(K key, long delta) {
        AtomicLong atomicLongPutIfAbsent;
        long j;
        long j2;
        do {
            atomicLongPutIfAbsent = this.f104658a.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.f104658a.putIfAbsent(key, new AtomicLong(delta))) == null) {
                return delta;
            }
            do {
                j = atomicLongPutIfAbsent.get();
                if (j != 0) {
                    j2 = j + delta;
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j, j2));
            return j2;
        } while (!this.f104658a.replace(key, atomicLongPutIfAbsent, new AtomicLong(delta)));
        return delta;
    }

    public Map<K, Long> asMap() {
        Map<K, Long> map = this.f104659b;
        if (map != null) {
            return map;
        }
        Map<K, Long> mapCreateAsMap = createAsMap();
        this.f104659b = mapCreateAsMap;
        return mapCreateAsMap;
    }

    /* JADX INFO: renamed from: b */
    public boolean m26635b(K key, long value) {
        AtomicLong atomicLong = this.f104658a.get(key);
        if (atomicLong == null) {
            return false;
        }
        long j = atomicLong.get();
        if (j != value) {
            return false;
        }
        if (j != 0 && !atomicLong.compareAndSet(j, 0L)) {
            return false;
        }
        this.f104658a.remove(key, atomicLong);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m26636c(K key, long expectedOldValue, long newValue) {
        if (expectedOldValue == 0) {
            return m26634a(key, newValue) == 0;
        }
        AtomicLong atomicLong = this.f104658a.get(key);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(expectedOldValue, newValue);
    }

    public void clear() {
        this.f104658a.clear();
    }

    public boolean containsKey(Object key) {
        return this.f104658a.containsKey(key);
    }

    @op1
    public long decrementAndGet(K key) {
        return addAndGet(key, -1L);
    }

    public long get(K key) {
        AtomicLong atomicLong = this.f104658a.get(key);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    @op1
    public long getAndAdd(K key, long delta) {
        AtomicLong atomicLongPutIfAbsent;
        long j;
        do {
            atomicLongPutIfAbsent = this.f104658a.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.f104658a.putIfAbsent(key, new AtomicLong(delta))) == null) {
                return 0L;
            }
            do {
                j = atomicLongPutIfAbsent.get();
                if (j == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j, j + delta));
            return j;
        } while (!this.f104658a.replace(key, atomicLongPutIfAbsent, new AtomicLong(delta)));
        return 0L;
    }

    @op1
    public long getAndDecrement(K key) {
        return getAndAdd(key, -1L);
    }

    @op1
    public long getAndIncrement(K key) {
        return getAndAdd(key, 1L);
    }

    @op1
    public long incrementAndGet(K key) {
        return addAndGet(key, 1L);
    }

    public boolean isEmpty() {
        return this.f104658a.isEmpty();
    }

    @op1
    public long put(K key, long newValue) {
        AtomicLong atomicLongPutIfAbsent;
        long j;
        do {
            atomicLongPutIfAbsent = this.f104658a.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.f104658a.putIfAbsent(key, new AtomicLong(newValue))) == null) {
                return 0L;
            }
            do {
                j = atomicLongPutIfAbsent.get();
                if (j == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j, newValue));
            return j;
        } while (!this.f104658a.replace(key, atomicLongPutIfAbsent, new AtomicLong(newValue)));
        return 0L;
    }

    public void putAll(Map<? extends K, ? extends Long> m) {
        for (Map.Entry<? extends K, ? extends Long> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue().longValue());
        }
    }

    @op1
    public long remove(K key) {
        long j;
        AtomicLong atomicLong = this.f104658a.get(key);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j = atomicLong.get();
            if (j == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j, 0L));
        this.f104658a.remove(key, atomicLong);
        return j;
    }

    public void removeAllZeros() {
        Iterator<Map.Entry<K, AtomicLong>> it = this.f104658a.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    @op1
    public boolean removeIfZero(K key) {
        return m26635b(key, 0L);
    }

    public int size() {
        return this.f104658a.size();
    }

    public long sum() {
        Iterator<AtomicLong> it = this.f104658a.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().get();
        }
        return j;
    }

    public String toString() {
        return this.f104658a.toString();
    }

    public static <K> zb0<K> create(Map<? extends K, ? extends Long> m) {
        zb0<K> zb0VarCreate = create();
        zb0VarCreate.putAll(m);
        return zb0VarCreate;
    }
}
