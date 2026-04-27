package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1863#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
public class zb7 {
    @jjf(version = "1.1")
    @yfb
    public static final <T, K> Map<K, Integer> eachCount(@yfb wb7<T, ? extends K> wb7Var) {
        md8.checkNotNullParameter(wb7Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = wb7Var.sourceIterator();
        while (itSourceIterator.hasNext()) {
            K kKeyOf = wb7Var.keyOf(itSourceIterator.next());
            Object c8119f = linkedHashMap.get(kKeyOf);
            if (c8119f == null && !linkedHashMap.containsKey(kKeyOf)) {
                c8119f = new jvd.C8119f();
            }
            jvd.C8119f c8119f2 = (jvd.C8119f) c8119f;
            c8119f2.f52108a++;
            linkedHashMap.put(kKeyOf, c8119f2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            md8.checkNotNull(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            qlh.asMutableMapEntry(entry).setValue(Integer.valueOf(((jvd.C8119f) entry.getValue()).f52108a));
        }
        return qlh.asMutableMap(linkedHashMap);
    }

    @t28
    @yjd
    private static final <K, V, R> Map<K, R> mapValuesInPlace(Map<K, V> map, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "f");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            md8.checkNotNull(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            qlh.asMutableMapEntry(entry).setValue(qy6Var.invoke(entry));
        }
        return qlh.asMutableMap(map);
    }
}
