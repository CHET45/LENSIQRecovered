package p000;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p000.p7e;

/* JADX INFO: renamed from: he */
/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class C6812he {
    @yfb
    public static final <T> Set<T> immutableCopyOfSet(@yfb Set<? extends T> set) {
        md8.checkNotNullParameter(set, "set");
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(v82.toSet(set));
        md8.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    @yfb
    public static final <K, V> Map<K, V> immutableMap(@yfb Map<K, ? extends V> map) {
        md8.checkNotNullParameter(map, "map");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        md8.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    @yfb
    public static final m13 ioDispatcher() {
        return df4.getIO();
    }
}
