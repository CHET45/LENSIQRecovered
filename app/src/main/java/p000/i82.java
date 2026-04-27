package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "CollectionsJDK8Kt")
public final class i82 {
    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.2")
    @t28
    private static final <K, V> V getOrDefault(Map<? extends K, ? extends V> map, K k, V v) {
        md8.checkNotNullParameter(map, "<this>");
        return map.getOrDefault(k, v);
    }

    @jjf(version = "1.2")
    @t28
    private static final <K, V> boolean remove(Map<? extends K, ? extends V> map, K k, V v) {
        md8.checkNotNullParameter(map, "<this>");
        return qlh.asMutableMap(map).remove(k, v);
    }
}
