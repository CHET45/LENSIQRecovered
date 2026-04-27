package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,813:1\n412#1:823\n423#1:828\n520#1,6:833\n545#1,6:839\n1#2:814\n1246#3,4:815\n1246#3,4:819\n1246#3,4:824\n1246#3,4:829\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n462#1:823\n477#1:828\n535#1:833,6\n560#1:839,6\n412#1:815,4\n423#1:819,4\n462#1:824,4\n477#1:829,4\n*E\n"})
public class xt9 extends wt9 {
    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    @t28
    private static final <K, V> Map<K, V> buildMap(@cg1 qy6<? super Map<K, V>, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        Map mapCreateMapBuilder = wt9.createMapBuilder();
        qy6Var.invoke(mapCreateMapBuilder);
        return wt9.build(mapCreateMapBuilder);
    }

    @t28
    private static final <K, V> K component1(Map.Entry<? extends K, ? extends V> entry) {
        md8.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    @t28
    private static final <K, V> V component2(Map.Entry<? extends K, ? extends V> entry) {
        md8.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    @t28
    private static final <K, V> boolean contains(Map<? extends K, ? extends V> map, K k) {
        md8.checkNotNullParameter(map, "<this>");
        return map.containsKey(k);
    }

    @t28
    private static final <K> boolean containsKey(Map<? extends K, ?> map, K k) {
        md8.checkNotNullParameter(map, "<this>");
        return map.containsKey(k);
    }

    @t28
    private static final <K, V> boolean containsValue(Map<K, ? extends V> map, V v) {
        md8.checkNotNullParameter(map, "<this>");
        return map.containsValue(v);
    }

    @yfb
    public static <K, V> Map<K, V> emptyMap() {
        i05 i05Var = i05.f45362a;
        md8.checkNotNull(i05Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return i05Var;
    }

    @yfb
    public static final <K, V> Map<K, V> filter(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, Boolean> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (qy6Var.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, V> Map<K, V> filterKeys(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super K, Boolean> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (qy6Var.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, V> Map<K, V> filterNot(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, Boolean> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!qy6Var.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M filterNotTo(@yfb Map<? extends K, ? extends V> map, @yfb M m, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, Boolean> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!qy6Var.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M filterTo(@yfb Map<? extends K, ? extends V> map, @yfb M m, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, Boolean> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (qy6Var.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    @yfb
    public static final <K, V> Map<K, V> filterValues(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super V, Boolean> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (qy6Var.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @t28
    private static final <K, V> V get(Map<? extends K, ? extends V> map, K k) {
        md8.checkNotNullParameter(map, "<this>");
        return map.get(k);
    }

    @t28
    private static final <K, V> V getOrElse(Map<K, ? extends V> map, K k, ny6<? extends V> ny6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        V v = map.get(k);
        return v == null ? ny6Var.invoke() : v;
    }

    public static final <K, V> V getOrElseNullable(@yfb Map<K, ? extends V> map, K k, @yfb ny6<? extends V> ny6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        V v = map.get(k);
        return (v != null || map.containsKey(k)) ? v : ny6Var.invoke();
    }

    public static final <K, V> V getOrPut(@yfb Map<K, V> map, K k, @yfb ny6<? extends V> ny6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        V v = map.get(k);
        if (v != null) {
            return v;
        }
        V vInvoke = ny6Var.invoke();
        map.put(k, vInvoke);
        return vInvoke;
    }

    @jjf(version = "1.1")
    public static <K, V> V getValue(@yfb Map<K, ? extends V> map, K k) {
        md8.checkNotNullParameter(map, "<this>");
        return (V) vt9.getOrImplicitDefaultNullable(map, k);
    }

    @jjf(version = "1.1")
    @t28
    private static final <K, V> HashMap<K, V> hashMapOf() {
        return new HashMap<>();
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lny6<+TR;>;)TR; */
    @jjf(version = "1.3")
    @t28
    private static final Object ifEmpty(Map map, ny6 ny6Var) {
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        return map.isEmpty() ? ny6Var.invoke() : map;
    }

    @t28
    private static final <K, V> boolean isNotEmpty(Map<? extends K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return !map.isEmpty();
    }

    @jjf(version = "1.3")
    @t28
    private static final <K, V> boolean isNullOrEmpty(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @t28
    private static final <K, V> Iterator<Map.Entry<K, V>> iterator(Map<? extends K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @jjf(version = "1.1")
    @t28
    private static final <K, V> LinkedHashMap<K, V> linkedMapOf() {
        return new LinkedHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V, R> Map<R, V> mapKeys(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(wt9.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(qy6Var.invoke(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V, R, M extends Map<? super R, ? super V>> M mapKeysTo(@yfb Map<? extends K, ? extends V> map, @yfb M m, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            m.put(qy6Var.invoke(entry), entry.getValue());
        }
        return m;
    }

    @yfb
    public static <K, V> Map<K, V> mapOf(@yfb scc<? extends K, ? extends V>... sccVarArr) {
        md8.checkNotNullParameter(sccVarArr, "pairs");
        return sccVarArr.length > 0 ? toMap(sccVarArr, new LinkedHashMap(wt9.mapCapacity(sccVarArr.length))) : emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V, R> Map<K, R> mapValues(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(wt9.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(entry.getKey(), qy6Var.invoke(entry));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V, R, M extends Map<? super K, ? super R>> M mapValuesTo(@yfb Map<? extends K, ? extends V> map, @yfb M m, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            m.put(entry.getKey(), qy6Var.invoke(entry));
        }
        return m;
    }

    @jjf(version = "1.1")
    @yfb
    public static final <K, V> Map<K, V> minus(@yfb Map<? extends K, ? extends V> map, K k) {
        md8.checkNotNullParameter(map, "<this>");
        Map mutableMap = toMutableMap(map);
        mutableMap.remove(k);
        return optimizeReadOnlyMap(mutableMap);
    }

    @jjf(version = "1.1")
    @t28
    private static final <K, V> void minusAssign(Map<K, V> map, K k) {
        md8.checkNotNullParameter(map, "<this>");
        map.remove(k);
    }

    @t28
    @xn8(name = "mutableIterator")
    private static final <K, V> Iterator<Map.Entry<K, V>> mutableIterator(Map<K, V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @jjf(version = "1.1")
    @t28
    private static final <K, V> Map<K, V> mutableMapOf() {
        return new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V> Map<K, V> optimizeReadOnlyMap(@yfb Map<K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : wt9.toSingletonMap(map) : emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t28
    private static final <K, V> Map<K, V> orEmpty(Map<K, ? extends V> map) {
        return map == 0 ? emptyMap() : map;
    }

    @yfb
    public static final <K, V> Map<K, V> plus(@yfb Map<? extends K, ? extends V> map, @yfb scc<? extends K, ? extends V> sccVar) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(sccVar, "pair");
        if (map.isEmpty()) {
            return wt9.mapOf(sccVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(sccVar.getFirst(), sccVar.getSecond());
        return linkedHashMap;
    }

    @t28
    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, scc<? extends K, ? extends V> sccVar) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(sccVar, "pair");
        map.put(sccVar.getFirst(), sccVar.getSecond());
    }

    public static <K, V> void putAll(@yfb Map<? super K, ? super V> map, @yfb scc<? extends K, ? extends V>[] sccVarArr) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(sccVarArr, "pairs");
        for (scc<? extends K, ? extends V> sccVar : sccVarArr) {
            map.put(sccVar.component1(), sccVar.component2());
        }
    }

    @t28
    private static final <K, V> V remove(Map<? extends K, V> map, K k) {
        md8.checkNotNullParameter(map, "<this>");
        return (V) qlh.asMutableMap(map).remove(k);
    }

    @t28
    private static final <K, V> void set(Map<K, V> map, K k, V v) {
        md8.checkNotNullParameter(map, "<this>");
        map.put(k, v);
    }

    @yfb
    public static <K, V> Map<K, V> toMap(@yfb Iterable<? extends scc<? extends K, ? extends V>> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return optimizeReadOnlyMap(toMap(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return emptyMap();
        }
        if (size != 1) {
            return toMap(iterable, new LinkedHashMap(wt9.mapCapacity(collection.size())));
        }
        return wt9.mapOf((scc) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    @jjf(version = "1.1")
    @yfb
    public static <K, V> Map<K, V> toMutableMap(@yfb Map<? extends K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }

    @t28
    private static final <K, V> scc<K, V> toPair(Map.Entry<? extends K, ? extends V> entry) {
        md8.checkNotNullParameter(entry, "<this>");
        return new scc<>(entry.getKey(), entry.getValue());
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    @t28
    private static final <K, V> Map<K, V> buildMap(int i, @cg1 qy6<? super Map<K, V>, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        Map mapCreateMapBuilder = wt9.createMapBuilder(i);
        qy6Var.invoke(mapCreateMapBuilder);
        return wt9.build(mapCreateMapBuilder);
    }

    @yfb
    public static <K, V> HashMap<K, V> hashMapOf(@yfb scc<? extends K, ? extends V>... sccVarArr) {
        md8.checkNotNullParameter(sccVarArr, "pairs");
        HashMap<K, V> map = new HashMap<>(wt9.mapCapacity(sccVarArr.length));
        putAll(map, sccVarArr);
        return map;
    }

    @yfb
    public static <K, V> LinkedHashMap<K, V> linkedMapOf(@yfb scc<? extends K, ? extends V>... sccVarArr) {
        md8.checkNotNullParameter(sccVarArr, "pairs");
        return (LinkedHashMap) toMap(sccVarArr, new LinkedHashMap(wt9.mapCapacity(sccVarArr.length)));
    }

    @t28
    private static final <K, V> Map<K, V> mapOf() {
        return emptyMap();
    }

    @jjf(version = "1.1")
    @yfb
    public static final <K, V> Map<K, V> minus(@yfb Map<? extends K, ? extends V> map, @yfb Iterable<? extends K> iterable) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(iterable, "keys");
        Map mutableMap = toMutableMap(map);
        q82.removeAll(mutableMap.keySet(), iterable);
        return optimizeReadOnlyMap(mutableMap);
    }

    @jjf(version = "1.1")
    @t28
    private static final <K, V> void minusAssign(Map<K, V> map, Iterable<? extends K> iterable) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(iterable, "keys");
        q82.removeAll(map.keySet(), iterable);
    }

    @yfb
    public static <K, V> Map<K, V> mutableMapOf(@yfb scc<? extends K, ? extends V>... sccVarArr) {
        md8.checkNotNullParameter(sccVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(wt9.mapCapacity(sccVarArr.length));
        putAll(linkedHashMap, sccVarArr);
        return linkedHashMap;
    }

    @yfb
    public static final <K, V> Map<K, V> plus(@yfb Map<? extends K, ? extends V> map, @yfb Iterable<? extends scc<? extends K, ? extends V>> iterable) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(iterable, "pairs");
        if (map.isEmpty()) {
            return toMap(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, iterable);
        return linkedHashMap;
    }

    @t28
    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Iterable<? extends scc<? extends K, ? extends V>> iterable) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(iterable, "pairs");
        putAll(map, iterable);
    }

    @jjf(version = "1.1")
    @yfb
    public static final <K, V> Map<K, V> minus(@yfb Map<? extends K, ? extends V> map, @yfb K[] kArr) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(kArr, "keys");
        Map mutableMap = toMutableMap(map);
        q82.removeAll(mutableMap.keySet(), kArr);
        return optimizeReadOnlyMap(mutableMap);
    }

    @jjf(version = "1.1")
    @t28
    private static final <K, V> void minusAssign(Map<K, V> map, K[] kArr) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(kArr, "keys");
        q82.removeAll(map.keySet(), kArr);
    }

    @yfb
    public static final <K, V> Map<K, V> plus(@yfb Map<? extends K, ? extends V> map, @yfb scc<? extends K, ? extends V>[] sccVarArr) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(sccVarArr, "pairs");
        if (map.isEmpty()) {
            return toMap(sccVarArr);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, sccVarArr);
        return linkedHashMap;
    }

    @t28
    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, scc<? extends K, ? extends V>[] sccVarArr) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(sccVarArr, "pairs");
        putAll(map, sccVarArr);
    }

    public static <K, V> void putAll(@yfb Map<? super K, ? super V> map, @yfb Iterable<? extends scc<? extends K, ? extends V>> iterable) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(iterable, "pairs");
        for (scc<? extends K, ? extends V> sccVar : iterable) {
            map.put(sccVar.component1(), sccVar.component2());
        }
    }

    @jjf(version = "1.1")
    @yfb
    public static final <K, V> Map<K, V> minus(@yfb Map<? extends K, ? extends V> map, @yfb vye<? extends K> vyeVar) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(vyeVar, "keys");
        Map mutableMap = toMutableMap(map);
        q82.removeAll(mutableMap.keySet(), vyeVar);
        return optimizeReadOnlyMap(mutableMap);
    }

    @jjf(version = "1.1")
    @t28
    private static final <K, V> void minusAssign(Map<K, V> map, vye<? extends K> vyeVar) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(vyeVar, "keys");
        q82.removeAll(map.keySet(), vyeVar);
    }

    @yfb
    public static final <K, V> Map<K, V> plus(@yfb Map<? extends K, ? extends V> map, @yfb vye<? extends scc<? extends K, ? extends V>> vyeVar) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(vyeVar, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, vyeVar);
        return optimizeReadOnlyMap(linkedHashMap);
    }

    @t28
    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, vye<? extends scc<? extends K, ? extends V>> vyeVar) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(vyeVar, "pairs");
        putAll(map, vyeVar);
    }

    @yfb
    public static <K, V> Map<K, V> plus(@yfb Map<? extends K, ? extends V> map, @yfb Map<? extends K, ? extends V> map2) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t28
    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(map2, "map");
        map.putAll(map2);
    }

    public static <K, V> void putAll(@yfb Map<? super K, ? super V> map, @yfb vye<? extends scc<? extends K, ? extends V>> vyeVar) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(vyeVar, "pairs");
        for (scc<? extends K, ? extends V> sccVar : vyeVar) {
            map.put(sccVar.component1(), sccVar.component2());
        }
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@yfb Iterable<? extends scc<? extends K, ? extends V>> iterable, @yfb M m) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        putAll(m, iterable);
        return m;
    }

    @yfb
    public static <K, V> Map<K, V> toMap(@yfb scc<? extends K, ? extends V>[] sccVarArr) {
        md8.checkNotNullParameter(sccVarArr, "<this>");
        int length = sccVarArr.length;
        if (length == 0) {
            return emptyMap();
        }
        if (length != 1) {
            return toMap(sccVarArr, new LinkedHashMap(wt9.mapCapacity(sccVarArr.length)));
        }
        return wt9.mapOf(sccVarArr[0]);
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@yfb scc<? extends K, ? extends V>[] sccVarArr, @yfb M m) {
        md8.checkNotNullParameter(sccVarArr, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        putAll(m, sccVarArr);
        return m;
    }

    @yfb
    public static final <K, V> Map<K, V> toMap(@yfb vye<? extends scc<? extends K, ? extends V>> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return optimizeReadOnlyMap(toMap(vyeVar, new LinkedHashMap()));
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@yfb vye<? extends scc<? extends K, ? extends V>> vyeVar, @yfb M m) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        putAll(m, vyeVar);
        return m;
    }

    @jjf(version = "1.1")
    @yfb
    public static <K, V> Map<K, V> toMap(@yfb Map<? extends K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return emptyMap();
        }
        if (size != 1) {
            return toMutableMap(map);
        }
        return wt9.toSingletonMap(map);
    }

    @jjf(version = "1.1")
    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@yfb Map<? extends K, ? extends V> map, @yfb M m) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        m.putAll(map);
        return m;
    }
}
