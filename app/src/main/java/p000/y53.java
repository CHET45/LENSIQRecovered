package p000;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class y53 {
    @yfb
    public static final <K, V> Map<K, V> createMapForCache(int i) {
        return new ConcurrentHashMap(i);
    }
}
