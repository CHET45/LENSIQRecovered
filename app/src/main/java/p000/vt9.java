package p000;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n350#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
public class vt9 {
    @xn8(name = "getOrImplicitDefaultNullable")
    @yjd
    public static final <K, V> V getOrImplicitDefaultNullable(@yfb Map<K, ? extends V> map, K k) {
        md8.checkNotNullParameter(map, "<this>");
        if (map instanceof ot9) {
            return (V) ((ot9) map).getOrImplicitDefault(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }

    @yfb
    public static final <K, V> Map<K, V> withDefault(@yfb Map<K, ? extends V> map, @yfb qy6<? super K, ? extends V> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return map instanceof ot9 ? withDefault(((ot9) map).getMap(), qy6Var) : new pt9(map, qy6Var);
    }

    @yfb
    @xn8(name = "withDefaultMutable")
    public static final <K, V> Map<K, V> withDefaultMutable(@yfb Map<K, V> map, @yfb qy6<? super K, ? extends V> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return map instanceof a6b ? withDefaultMutable(((a6b) map).getMap(), qy6Var) : new b6b(map, qy6Var);
    }
}
