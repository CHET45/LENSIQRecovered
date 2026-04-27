package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class p79<K, V> extends et9<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* JADX INFO: renamed from: c */
    @yfb
    public final f0f f69923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p79(@yfb lp8<K> lp8Var, @yfb lp8<V> lp8Var2) {
        super(lp8Var, lp8Var2, null);
        md8.checkNotNullParameter(lp8Var, "kSerializer");
        md8.checkNotNullParameter(lp8Var2, "vSerializer");
        this.f69923c = new o79(lp8Var.getDescriptor(), lp8Var2.getDescriptor());
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> builder() {
        return new LinkedHashMap<>();
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int builderSize(@yfb LinkedHashMap<K, V> linkedHashMap) {
        md8.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void checkCapacity(@yfb LinkedHashMap<K, V> linkedHashMap, int i) {
        md8.checkNotNullParameter(linkedHashMap, "<this>");
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
        return this.f69923c;
    }

    @Override // p000.et9
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void insertKeyValuePair(@yfb LinkedHashMap<K, V> linkedHashMap, int i, K k, V v) {
        md8.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put(k, v);
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> toBuilder(@yfb Map<K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map<K, V> toResult(@yfb LinkedHashMap<K, V> linkedHashMap) {
        md8.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
