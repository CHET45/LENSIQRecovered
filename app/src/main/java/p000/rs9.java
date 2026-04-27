package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC14363w2;

/* JADX INFO: loaded from: classes3.dex */
public final class rs9<K, V> extends AbstractC14363w2<K, V, V> {

    /* JADX INFO: renamed from: b */
    public static final hid<Map<Object, Object>> f79197b = p58.create(Collections.emptyMap());

    /* JADX INFO: renamed from: rs9$b */
    public static final class C12233b<K, V> extends AbstractC14363w2.a<K, V, V> {
        public rs9<K, V> build() {
            return new rs9<>(this.f93123a);
        }

        private C12233b(int i) {
            super(i);
        }

        @Override // p000.AbstractC14363w2.a
        public C12233b<K, V> put(K k, hid<V> hidVar) {
            super.put((Object) k, (hid) hidVar);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC14363w2.a
        public C12233b<K, V> putAll(hid<Map<K, V>> hidVar) {
            super.putAll((hid) hidVar);
            return this;
        }
    }

    public static <K, V> C12233b<K, V> builder(int i) {
        return new C12233b<>(i);
    }

    public static <K, V> hid<Map<K, V>> emptyMapProvider() {
        return (hid<Map<K, V>>) f79197b;
    }

    private rs9(Map<K, hid<V>> map) {
        super(map);
    }

    @Override // p000.hid
    public Map<K, V> get() {
        LinkedHashMap linkedHashMapNewLinkedHashMapWithExpectedSize = re3.newLinkedHashMapWithExpectedSize(m24322b().size());
        for (Map.Entry<K, hid<V>> entry : m24322b().entrySet()) {
            linkedHashMapNewLinkedHashMapWithExpectedSize.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMapNewLinkedHashMapWithExpectedSize);
    }
}
