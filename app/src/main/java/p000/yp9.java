package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yp9<K, V> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final LinkedHashMap<K, V> f102477a;

    public yp9() {
        this(0, 0.0f, 3, null);
    }

    @gib
    public final V get(@yfb K k) {
        md8.checkNotNullParameter(k, "key");
        return this.f102477a.get(k);
    }

    @yfb
    public final Set<Map.Entry<K, V>> getEntries() {
        Set<Map.Entry<K, V>> setEntrySet = this.f102477a.entrySet();
        md8.checkNotNullExpressionValue(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final boolean isEmpty() {
        return this.f102477a.isEmpty();
    }

    @gib
    public final V put(@yfb K k, @yfb V v) {
        md8.checkNotNullParameter(k, "key");
        md8.checkNotNullParameter(v, "value");
        return this.f102477a.put(k, v);
    }

    @gib
    public final V remove(@yfb K k) {
        md8.checkNotNullParameter(k, "key");
        return this.f102477a.remove(k);
    }

    public yp9(int i, float f) {
        this.f102477a = new LinkedHashMap<>(i, f, true);
    }

    public /* synthetic */ yp9(int i, float f, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 16 : i, (i2 & 2) != 0 ? 0.75f : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yp9(@yfb yp9<? extends K, V> yp9Var) {
        this(0, 0.0f, 3, null);
        md8.checkNotNullParameter(yp9Var, "original");
        for (Map.Entry<? extends K, V> entry : yp9Var.getEntries()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
