package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: w2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14363w2<K, V, V2> implements jo5<Map<K, V2>> {

    /* JADX INFO: renamed from: a */
    public final Map<K, hid<V>> f93122a;

    /* JADX INFO: renamed from: w2$a */
    public static abstract class a<K, V, V2> {

        /* JADX INFO: renamed from: a */
        public final LinkedHashMap<K, hid<V>> f93123a;

        public a(int i) {
            this.f93123a = re3.newLinkedHashMapWithExpectedSize(i);
        }

        public a<K, V, V2> put(K k, hid<V> hidVar) {
            this.f93123a.put((K) s7d.checkNotNull(k, "key"), (hid<V>) s7d.checkNotNull(hidVar, "provider"));
            return this;
        }

        public a<K, V, V2> putAll(hid<Map<K, V2>> hidVar) {
            if (hidVar instanceof y34) {
                return putAll(((y34) hidVar).m25636a());
            }
            this.f93123a.putAll(((AbstractC14363w2) hidVar).f93122a);
            return this;
        }
    }

    public AbstractC14363w2(Map<K, hid<V>> map) {
        this.f93122a = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: b */
    public final Map<K, hid<V>> m24322b() {
        return this.f93122a;
    }
}
