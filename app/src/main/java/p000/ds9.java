package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ds9<K, V> {

    /* JADX INFO: renamed from: a */
    public final Map<K, V> f30596a;

    private ds9(int i) {
        this.f30596a = re3.newLinkedHashMapWithExpectedSize(i);
    }

    public static <K, V> ds9<K, V> newMapBuilder(int i) {
        return new ds9<>(i);
    }

    public Map<K, V> build() {
        return this.f30596a.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f30596a);
    }

    public ds9<K, V> put(K k, V v) {
        this.f30596a.put(k, v);
        return this;
    }

    public ds9<K, V> putAll(Map<K, V> map) {
        this.f30596a.putAll(map);
        return this;
    }
}
