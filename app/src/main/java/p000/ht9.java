package p000;

import java.util.Map;
import p000.AbstractC14363w2;

/* JADX INFO: loaded from: classes3.dex */
public final class ht9<K, V> extends AbstractC14363w2<K, V, hid<V>> implements gx8<Map<K, hid<V>>> {

    /* JADX INFO: renamed from: ht9$b */
    public static final class C7013b<K, V> extends AbstractC14363w2.a<K, V, hid<V>> {
        public ht9<K, V> build() {
            return new ht9<>(this.f93123a);
        }

        private C7013b(int i) {
            super(i);
        }

        @Override // p000.AbstractC14363w2.a
        public C7013b<K, V> put(K k, hid<V> hidVar) {
            super.put((Object) k, (hid) hidVar);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC14363w2.a
        public C7013b<K, V> putAll(hid<Map<K, hid<V>>> hidVar) {
            super.putAll((hid) hidVar);
            return this;
        }
    }

    public static <K, V> C7013b<K, V> builder(int i) {
        return new C7013b<>(i);
    }

    private ht9(Map<K, hid<V>> map) {
        super(map);
    }

    @Override // p000.hid
    public Map<K, hid<V>> get() {
        return m24322b();
    }
}
