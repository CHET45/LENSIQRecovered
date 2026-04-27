package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class yt9 extends xt9 {
    @t28
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    private static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxBy(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        Map.Entry<K, V> entry;
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = qy6Var.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = qy6Var.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @t28
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    private static final /* synthetic */ <K, V> Map.Entry<K, V> maxWith(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) v82.maxWithOrNull(map.entrySet(), comparator);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minBy(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        Map.Entry<K, V> entry;
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = qy6Var.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = qy6Var.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Map.Entry minWith(Map map, Comparator comparator) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) v82.minWithOrNull(map.entrySet(), comparator);
    }
}
