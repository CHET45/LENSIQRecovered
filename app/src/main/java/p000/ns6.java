package p000;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes5.dex */
@sx4
@jd7
public abstract class ns6<K, V> extends cr6<K, V> implements ad9<K, V> {

    /* JADX INFO: renamed from: ns6$a */
    public static abstract class AbstractC10040a<K, V> extends ns6<K, V> {

        /* JADX INFO: renamed from: a */
        public final ad9<K, V> f65484a;

        public AbstractC10040a(ad9<K, V> delegate) {
            this.f65484a = (ad9) v7d.checkNotNull(delegate);
        }

        @Override // p000.ns6, p000.cr6, p000.zs6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ad9<K, V> mo8967m() {
            return this.f65484a;
        }
    }

    @Override // p000.ad9, p000.lz6
    public V apply(K key) {
        return mo8967m().apply(key);
    }

    @Override // p000.cr6, p000.zs6
    /* JADX INFO: renamed from: b */
    public abstract ad9<K, V> mo8967m();

    @Override // p000.ad9
    @op1
    public V get(K key) throws ExecutionException {
        return mo8967m().get(key);
    }

    @Override // p000.ad9
    @op1
    public ox7<K, V> getAll(Iterable<? extends K> keys) throws ExecutionException {
        return mo8967m().getAll(keys);
    }

    @Override // p000.ad9
    @op1
    public V getUnchecked(K key) {
        return mo8967m().getUnchecked(key);
    }

    @Override // p000.ad9
    public void refresh(K key) {
        mo8967m().refresh(key);
    }
}
