package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class nh7<K, V> extends et9<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* JADX INFO: renamed from: c */
    @yfb
    public final f0f f64518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh7(@yfb lp8<K> lp8Var, @yfb lp8<V> lp8Var2) {
        super(lp8Var, lp8Var2, null);
        md8.checkNotNullParameter(lp8Var, "kSerializer");
        md8.checkNotNullParameter(lp8Var2, "vSerializer");
        this.f64518c = new mh7(lp8Var.getDescriptor(), lp8Var2.getDescriptor());
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> builder() {
        return new HashMap<>();
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int builderSize(@yfb HashMap<K, V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return map.size() * 2;
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void checkCapacity(@yfb HashMap<K, V> map, int i) {
        md8.checkNotNullParameter(map, "<this>");
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> collectionIterator(@yfb Map<K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int collectionSize(@yfb Map<K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @Override // p000.et9, p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return this.f64518c;
    }

    @Override // p000.et9
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void insertKeyValuePair(@yfb HashMap<K, V> map, int i, K k, V v) {
        md8.checkNotNullParameter(map, "<this>");
        map.put(k, v);
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> toBuilder(@yfb Map<K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        HashMap<K, V> map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap<>(map) : map2;
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map<K, V> toResult(@yfb HashMap<K, V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return map;
    }
}
