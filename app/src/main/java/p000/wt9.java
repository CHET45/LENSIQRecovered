package p000;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
public class wt9 extends vt9 {

    /* JADX INFO: renamed from: a */
    public static final int f95489a = 1073741824;

    @jjf(version = "1.3")
    @yfb
    @yjd
    public static <K, V> Map<K, V> build(@yfb Map<K, V> map) {
        md8.checkNotNullParameter(map, "builder");
        return ((cs9) map).build();
    }

    @jjf(version = "1.3")
    @t28
    @yjd
    private static final <K, V> Map<K, V> buildMapInternal(qy6<? super Map<K, V>, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        Map mapCreateMapBuilder = createMapBuilder();
        qy6Var.invoke(mapCreateMapBuilder);
        return build(mapCreateMapBuilder);
    }

    @jjf(version = "1.3")
    @yfb
    @yjd
    public static <K, V> Map<K, V> createMapBuilder() {
        return new cs9();
    }

    public static final <K, V> V getOrPut(@yfb ConcurrentMap<K, V> concurrentMap, K k, @yfb ny6<? extends V> ny6Var) {
        md8.checkNotNullParameter(concurrentMap, "<this>");
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        V v = concurrentMap.get(k);
        if (v != null) {
            return v;
        }
        V vInvoke = ny6Var.invoke();
        V vPutIfAbsent = concurrentMap.putIfAbsent(k, vInvoke);
        return vPutIfAbsent == null ? vInvoke : vPutIfAbsent;
    }

    @yjd
    public static int mapCapacity(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @yfb
    public static <K, V> Map<K, V> mapOf(@yfb scc<? extends K, ? extends V> sccVar) {
        md8.checkNotNullParameter(sccVar, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(sccVar.getFirst(), sccVar.getSecond());
        md8.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    @yfb
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> sortedMapOf(@yfb scc<? extends K, ? extends V>... sccVarArr) {
        md8.checkNotNullParameter(sccVarArr, "pairs");
        TreeMap treeMap = new TreeMap();
        xt9.putAll(treeMap, sccVarArr);
        return treeMap;
    }

    @t28
    private static final Properties toProperties(Map<String, String> map) {
        md8.checkNotNullParameter(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @yfb
    public static final <K, V> Map<K, V> toSingletonMap(@yfb Map<? extends K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        md8.checkNotNullExpressionValue(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    @t28
    private static final <K, V> Map<K, V> toSingletonMapOrSelf(Map<K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return toSingletonMap(map);
    }

    @yfb
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> toSortedMap(@yfb Map<? extends K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return new TreeMap(map);
    }

    @jjf(version = "1.3")
    @t28
    @yjd
    private static final <K, V> Map<K, V> buildMapInternal(int i, qy6<? super Map<K, V>, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        Map mapCreateMapBuilder = createMapBuilder(i);
        qy6Var.invoke(mapCreateMapBuilder);
        return build(mapCreateMapBuilder);
    }

    @jjf(version = "1.3")
    @yfb
    @yjd
    public static <K, V> Map<K, V> createMapBuilder(int i) {
        return new cs9(i);
    }

    @jjf(version = "1.4")
    @yfb
    public static final <K, V> SortedMap<K, V> sortedMapOf(@yfb Comparator<? super K> comparator, @yfb scc<? extends K, ? extends V>... sccVarArr) {
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(sccVarArr, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        xt9.putAll(treeMap, sccVarArr);
        return treeMap;
    }

    @yfb
    public static final <K, V> SortedMap<K, V> toSortedMap(@yfb Map<? extends K, ? extends V> map, @yfb Comparator<? super K> comparator) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
