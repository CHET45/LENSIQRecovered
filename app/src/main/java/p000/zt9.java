package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,595:1\n97#1,5:596\n112#1,5:601\n153#1,3:606\n144#1:609\n216#1:610\n217#1:612\n145#1:613\n216#1:614\n217#1:616\n1#2:611\n1#2:615\n1948#3,14:617\n1971#3,14:631\n2318#3,14:645\n2341#3,14:659\n1872#3,3:673\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n77#1:596,5\n90#1:601,5\n126#1:606,3\n136#1:609\n136#1:610\n136#1:612\n136#1:613\n144#1:614\n144#1:616\n136#1:611\n231#1:617,14\n242#1:631,14\n391#1:645,14\n402#1:659,14\n575#1:673,3\n*E\n"})
public class zt9 extends yt9 {
    public static final <K, V> boolean all(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, Boolean> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!qy6Var.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean any(@yfb Map<? extends K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return !map.isEmpty();
    }

    @t28
    private static final <K, V> Iterable<Map.Entry<K, V>> asIterable(Map<? extends K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return map.entrySet();
    }

    @yfb
    public static <K, V> vye<Map.Entry<K, V>> asSequence(@yfb Map<? extends K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return v82.asSequence(map.entrySet());
    }

    @t28
    private static final <K, V> int count(Map<? extends K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @jjf(version = "1.5")
    @t28
    private static final <K, V, R> R firstNotNullOf(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        R rInvoke;
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                rInvoke = null;
                break;
            }
            rInvoke = qy6Var.invoke(it.next());
            if (rInvoke != null) {
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @jjf(version = "1.5")
    @t28
    private static final <K, V, R> R firstNotNullOfOrNull(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = qy6Var.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @yfb
    public static final <K, V, R> List<R> flatMap(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            q82.addAll(arrayList, qy6Var.invoke(it.next()));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @xn8(name = "flatMapSequence")
    @yfb
    public static final <K, V, R> List<R> flatMapSequence(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, ? extends vye<? extends R>> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            q82.addAll(arrayList, qy6Var.invoke(it.next()));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @xn8(name = "flatMapSequenceTo")
    @yfb
    public static final <K, V, R, C extends Collection<? super R>> C flatMapSequenceTo(@yfb Map<? extends K, ? extends V> map, @yfb C c, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, ? extends vye<? extends R>> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            q82.addAll(c, qy6Var.invoke(it.next()));
        }
        return c;
    }

    @yfb
    public static final <K, V, R, C extends Collection<? super R>> C flatMapTo(@yfb Map<? extends K, ? extends V> map, @yfb C c, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            q82.addAll(c, qy6Var.invoke(it.next()));
        }
        return c;
    }

    @xj7
    public static final <K, V> void forEach(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, bth> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            qy6Var.invoke(it.next());
        }
    }

    @yfb
    public static final <K, V, R> List<R> map(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(qy6Var.invoke(it.next()));
        }
        return arrayList;
    }

    @yfb
    public static final <K, V, R> List<R> mapNotNull(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = qy6Var.invoke(it.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @yfb
    public static final <K, V, R, C extends Collection<? super R>> C mapNotNullTo(@yfb Map<? extends K, ? extends V> map, @yfb C c, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = qy6Var.invoke(it.next());
            if (rInvoke != null) {
                c.add(rInvoke);
            }
        }
        return c;
    }

    @yfb
    public static final <K, V, R, C extends Collection<? super R>> C mapTo(@yfb Map<? extends K, ? extends V> map, @yfb C c, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            c.add(qy6Var.invoke(it.next()));
        }
        return c;
    }

    @jjf(version = "1.4")
    @t28
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxByOrNull(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
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

    @jjf(version = "1.7")
    @t28
    @xn8(name = "maxByOrThrow")
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxByOrThrow(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = qy6Var.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = qy6Var.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <K, V> double maxOf(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, Double> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <K, V> Double m33531maxOfOrNull(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, Double> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <K, V, R> R maxOfWith(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <K, V, R> R maxOfWithOrNull(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = qy6Var.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = (Object) rInvoke2;
            }
        }
        return rInvoke;
    }

    @jjf(version = "1.4")
    @t28
    private static final <K, V> Map.Entry<K, V> maxWithOrNull(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) v82.maxWithOrNull(map.entrySet(), comparator);
    }

    @jjf(version = "1.7")
    @t28
    @xn8(name = "maxWithOrThrow")
    private static final <K, V> Map.Entry<K, V> maxWithOrThrow(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) v82.maxWithOrThrow(map.entrySet(), comparator);
    }

    @jjf(version = "1.4")
    @t28
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minByOrNull(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
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

    @jjf(version = "1.7")
    @t28
    @xn8(name = "minByOrThrow")
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minByOrThrow(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = qy6Var.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = qy6Var.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <K, V> double minOf(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, Double> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <K, V> Double m33535minOfOrNull(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, Double> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <K, V, R> R minOfWith(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <K, V, R> R minOfWithOrNull(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = qy6Var.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = (Object) rInvoke2;
            }
        }
        return rInvoke;
    }

    @jjf(version = "1.4")
    @t28
    private static final <K, V> Map.Entry<K, V> minWithOrNull(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) v82.minWithOrNull(map.entrySet(), comparator);
    }

    @jjf(version = "1.7")
    @t28
    @xn8(name = "minWithOrThrow")
    private static final <K, V> Map.Entry<K, V> minWithOrThrow(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) v82.minWithOrThrow(map.entrySet(), comparator);
    }

    public static final <K, V> boolean none(@yfb Map<? extends K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        return map.isEmpty();
    }

    @jjf(version = "1.1")
    @yfb
    public static final <K, V, M extends Map<? extends K, ? extends V>> M onEach(@yfb M m, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, bth> qy6Var) {
        md8.checkNotNullParameter(m, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        Iterator<Map.Entry<K, V>> it = m.entrySet().iterator();
        while (it.hasNext()) {
            qy6Var.invoke(it.next());
        }
        return m;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <K, V, M extends Map<? extends K, ? extends V>> M onEachIndexed(@yfb M m, @yfb gz6<? super Integer, ? super Map.Entry<? extends K, ? extends V>, bth> gz6Var) {
        md8.checkNotNullParameter(m, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        Iterator<T> it = m.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC0000a interfaceC0000a = (Object) it.next();
            int i2 = i + 1;
            if (i < 0) {
                l82.throwIndexOverflow();
            }
            gz6Var.invoke(Integer.valueOf(i), interfaceC0000a);
            i = i2;
        }
        return m;
    }

    @yfb
    public static final <K, V> List<scc<K, V>> toList(@yfb Map<? extends K, ? extends V> map) {
        md8.checkNotNullParameter(map, "<this>");
        if (map.size() == 0) {
            return l82.emptyList();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return l82.emptyList();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return k82.listOf(new scc(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new scc(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new scc(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static final <K, V> boolean any(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, Boolean> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (qy6Var.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <K, V> int count(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, Boolean> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = 0;
        if (map.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (qy6Var.invoke(it.next()).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <K, V> float m33529maxOf(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, Float> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = qy6Var.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, qy6Var.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <K, V> Float m33532maxOfOrNull(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, Float> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = qy6Var.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, qy6Var.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <K, V> float m33533minOf(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, Float> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = qy6Var.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, qy6Var.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <K, V> Float m33536minOfOrNull(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, Float> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = qy6Var.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, qy6Var.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final <K, V> boolean none(@yfb Map<? extends K, ? extends V> map, @yfb qy6<? super Map.Entry<? extends K, ? extends V>, Boolean> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (qy6Var.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <K, V, R extends Comparable<? super R>> R m33530maxOf(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <K, V, R extends Comparable<? super R>> R maxOfOrNull(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = qy6Var.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <K, V, R extends Comparable<? super R>> R m33534minOf(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <K, V, R extends Comparable<? super R>> R minOfOrNull(Map<? extends K, ? extends V> map, qy6<? super Map.Entry<? extends K, ? extends V>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = qy6Var.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }
}
