package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public final class it9<K, V> extends bt9<K, V> {

    /* JADX INFO: renamed from: c */
    @wx1
    public volatile transient C7595a<K, V> f48207c;

    /* JADX INFO: renamed from: d */
    @wx1
    public volatile transient C7595a<K, V> f48208d;

    /* JADX INFO: renamed from: it9$a */
    public static final class C7595a<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f48209a;

        /* JADX INFO: renamed from: b */
        public final V f48210b;

        public C7595a(K key, V value) {
            this.f48209a = key;
            this.f48210b = value;
        }
    }

    public it9(Map<K, V> backingMap) {
        super(backingMap);
    }

    private void addToCache(K key, V value) {
        addToCache(new C7595a<>(key, value));
    }

    @Override // p000.bt9
    /* JADX INFO: renamed from: d */
    public void mo3394d() {
        super.mo3394d();
        this.f48207c = null;
        this.f48208d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.bt9
    @wx1
    /* JADX INFO: renamed from: f */
    public V mo3396f(Object key) {
        v7d.checkNotNull(key);
        V vMo3397g = mo3397g(key);
        if (vMo3397g != null) {
            return vMo3397g;
        }
        V vM3398h = m3398h(key);
        if (vM3398h != null) {
            addToCache(key, vM3398h);
        }
        return vM3398h;
    }

    @Override // p000.bt9
    @wx1
    /* JADX INFO: renamed from: g */
    public V mo3397g(@wx1 Object obj) {
        V v = (V) super.mo3397g(obj);
        if (v != null) {
            return v;
        }
        C7595a<K, V> c7595a = this.f48207c;
        if (c7595a != null && c7595a.f48209a == obj) {
            return c7595a.f48210b;
        }
        C7595a<K, V> c7595a2 = this.f48208d;
        if (c7595a2 == null || c7595a2.f48209a != obj) {
            return null;
        }
        addToCache(c7595a2);
        return c7595a2.f48210b;
    }

    private void addToCache(C7595a<K, V> entry) {
        this.f48208d = this.f48207c;
        this.f48207c = entry;
    }
}
