package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import p000.md2;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3686:1\n295#1,2:3687\n528#1,7:3689\n543#1,6:3696\n865#1,2:3703\n796#1:3705\n1872#1,2:3706\n797#1,2:3708\n1874#1:3710\n799#1:3711\n1872#1,3:3712\n817#1,2:3715\n855#1,2:3717\n1261#1,4:3727\n1230#1,4:3731\n1246#1,4:3735\n1293#1,4:3739\n1454#1,5:3743\n1469#1,5:3748\n1510#1,3:3753\n1513#1,3:3763\n1528#1,3:3766\n1531#1,3:3776\n1628#1,3:3793\n1598#1,4:3796\n1587#1:3800\n1872#1,2:3801\n1874#1:3804\n1588#1:3805\n1872#1,3:3806\n1619#1:3809\n1863#1:3810\n1864#1:3812\n1620#1:3813\n1863#1,2:3814\n1872#1,3:3816\n2853#1,3:3819\n2856#1,6:3823\n2878#1,3:3829\n2881#1,7:3833\n865#1,2:3840\n827#1:3842\n855#1,2:3843\n827#1:3845\n855#1,2:3846\n827#1:3848\n855#1,2:3849\n3408#1,8:3855\n3436#1,7:3863\n3467#1,10:3870\n1#2:3702\n1#2:3803\n1#2:3811\n1#2:3822\n1#2:3832\n37#3:3719\n36#3,3:3720\n37#3:3723\n36#3,3:3724\n381#4,7:3756\n381#4,7:3769\n381#4,7:3779\n381#4,7:3786\n32#5,2:3851\n32#5,2:3853\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n174#1:3687,2\n184#1:3689,7\n194#1:3696,6\n774#1:3703,2\n785#1:3705\n785#1:3706,2\n785#1:3708,2\n785#1:3710\n785#1:3711\n796#1:3712,3\n808#1:3715,2\n827#1:3717,2\n1188#1:3727,4\n1203#1:3731,4\n1217#1:3735,4\n1280#1:3739,4\n1368#1:3743,5\n1381#1:3748,5\n1485#1:3753,3\n1485#1:3763,3\n1498#1:3766,3\n1498#1:3776,3\n1557#1:3793,3\n1567#1:3796,4\n1577#1:3800\n1577#1:3801,2\n1577#1:3804\n1577#1:3805\n1587#1:3806,3\n1611#1:3809\n1611#1:3810\n1611#1:3812\n1611#1:3813\n1619#1:3814,2\n2653#1:3816,3\n2953#1:3819,3\n2953#1:3823,6\n2970#1:3829,3\n2970#1:3833,7\n3146#1:3840,2\n3154#1:3842\n3154#1:3843,2\n3164#1:3845\n3164#1:3846,2\n3174#1:3848\n3174#1:3849,2\n3397#1:3855,8\n3425#1:3863,7\n3454#1:3870,10\n1577#1:3803\n1611#1:3811\n2953#1:3822\n2970#1:3832\n1040#1:3719\n1040#1:3720,3\n1083#1:3723\n1083#1:3724,3\n1485#1:3756,7\n1498#1:3769,7\n1512#1:3779,7\n1530#1:3786,7\n3342#1:3851,2\n3384#1:3853,2\n*E\n"})
public class v82 extends s82 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: v82$a */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n3527#2:23\n*E\n"})
    public static final class C13933a<T> implements vye<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable f90287a;

        public C13933a(Iterable iterable) {
            this.f90287a = iterable;
        }

        @Override // p000.vye
        public Iterator<T> iterator() {
            return this.f90287a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* JADX INFO: renamed from: v82$b */
    public static final class C13934b<K, T> implements wb7<T, K> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable<T> f90288a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<T, K> f90289b;

        /* JADX WARN: Multi-variable type inference failed */
        public C13934b(Iterable<? extends T> iterable, qy6<? super T, ? extends K> qy6Var) {
            this.f90288a = iterable;
            this.f90289b = qy6Var;
        }

        @Override // p000.wb7
        public K keyOf(T t) {
            return this.f90289b.invoke(t);
        }

        @Override // p000.wb7
        public Iterator<T> sourceIterator() {
            return this.f90288a.iterator();
        }
    }

    public static final <T> boolean all(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!qy6Var.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t28
    private static final <T> Iterable<T> asIterable(Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return iterable;
    }

    @yfb
    public static <T> vye<T> asSequence(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return new C13933a(iterable);
    }

    @yfb
    public static final <T, K, V> Map<K, V> associate(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(m82.collectionSizeOrDefault(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(it.next());
            linkedHashMap.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @yfb
    public static final <T, K> Map<K, T> associateBy(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(m82.collectionSizeOrDefault(iterable, 10)), 16));
        for (T t : iterable) {
            linkedHashMap.put(qy6Var.invoke(t), t);
        }
        return linkedHashMap;
    }

    @yfb
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@yfb Iterable<? extends T> iterable, @yfb M m, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (T t : iterable) {
            m.put(qy6Var.invoke(t), t);
        }
        return m;
    }

    @yfb
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@yfb Iterable<? extends T> iterable, @yfb M m, @yfb qy6<? super T, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(it.next());
            m.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return m;
    }

    @jjf(version = "1.3")
    @yfb
    public static final <K, V> Map<K, V> associateWith(@yfb Iterable<? extends K> iterable, @yfb qy6<? super K, ? extends V> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(m82.collectionSizeOrDefault(iterable, 10)), 16));
        for (K k : iterable) {
            linkedHashMap.put(k, qy6Var.invoke(k));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.3")
    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@yfb Iterable<? extends K> iterable, @yfb M m, @yfb qy6<? super K, ? extends V> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        for (K k : iterable) {
            m.put(k, qy6Var.invoke(k));
        }
        return m;
    }

    @xn8(name = "averageOfByte")
    public static final double averageOfByte(@yfb Iterable<Byte> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        double dByteValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dByteValue += (double) it.next().byteValue();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i);
    }

    @xn8(name = "averageOfDouble")
    public static final double averageOfDouble(@yfb Iterable<Double> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i);
    }

    @xn8(name = "averageOfFloat")
    public static double averageOfFloat(@yfb Iterable<Float> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += (double) it.next().floatValue();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    @xn8(name = "averageOfInt")
    public static final double averageOfInt(@yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        double dIntValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dIntValue += (double) it.next().intValue();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i);
    }

    @xn8(name = "averageOfLong")
    public static final double averageOfLong(@yfb Iterable<Long> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double dLongValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i);
    }

    @xn8(name = "averageOfShort")
    public static final double averageOfShort(@yfb Iterable<Short> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        double dShortValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dShortValue += (double) it.next().shortValue();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i);
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T> List<List<T>> chunked(@yfb Iterable<? extends T> iterable, int i) {
        md8.checkNotNullParameter(iterable, "<this>");
        return windowed(iterable, i, i, true);
    }

    @t28
    private static final <T> T component1(List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        return list.get(0);
    }

    @t28
    private static final <T> T component2(List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        return list.get(1);
    }

    @t28
    private static final <T> T component3(List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        return list.get(2);
    }

    @t28
    private static final <T> T component4(List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        return list.get(3);
    }

    @t28
    private static final <T> T component5(List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        return list.get(4);
    }

    public static <T> boolean contains(@yfb Iterable<? extends T> iterable, T t) {
        md8.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t) : indexOf(iterable, t) >= 0;
    }

    public static final <T> int count(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        return i;
    }

    @yfb
    public static <T> List<T> distinct(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return toList(toMutableSet(iterable));
    }

    @yfb
    public static final <T, K> List<T> distinctBy(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (hashSet.add(qy6Var.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @yfb
    public static <T> List<T> drop(@yfb Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        md8.checkNotNullParameter(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return toList(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return l82.emptyList();
            }
            if (size == 1) {
                return k82.listOf(last(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (T t : iterable) {
            if (i2 >= i) {
                arrayList.add(t);
            } else {
                i2++;
            }
        }
        return l82.optimizeReadOnlyList(arrayList);
    }

    @yfb
    public static <T> List<T> dropLast(@yfb List<? extends T> list, int i) {
        md8.checkNotNullParameter(list, "<this>");
        if (i >= 0) {
            return take(list, kpd.coerceAtLeast(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final <T> List<T> dropLastWhile(@yfb List<? extends T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!qy6Var.invoke(listIterator.previous()).booleanValue()) {
                    return take(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return l82.emptyList();
    }

    @yfb
    public static final <T> List<T> dropWhile(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (T t : iterable) {
            if (z) {
                arrayList.add(t);
            } else if (!qy6Var.invoke(t).booleanValue()) {
                arrayList.add(t);
                z = true;
            }
        }
        return arrayList;
    }

    public static final <T> T elementAt(@yfb Iterable<? extends T> iterable, final int i) {
        md8.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i) : (T) elementAtOrElse(iterable, i, new qy6() { // from class: u82
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return v82.elementAt$lambda$0$CollectionsKt___CollectionsKt(i, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object elementAt$lambda$0$CollectionsKt___CollectionsKt(int i, int i2) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + a18.f100c);
    }

    public static final <T> T elementAtOrElse(@yfb Iterable<? extends T> iterable, int i, @yfb qy6<? super Integer, ? extends T> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i < 0 || i >= list.size()) ? qy6Var.invoke(Integer.valueOf(i)) : (T) list.get(i);
        }
        if (i < 0) {
            return qy6Var.invoke(Integer.valueOf(i));
        }
        int i2 = 0;
        for (T t : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return qy6Var.invoke(Integer.valueOf(i));
    }

    @gib
    public static final <T> T elementAtOrNull(@yfb Iterable<? extends T> iterable, int i) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) getOrNull((List) iterable, i);
        }
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (T t : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return null;
    }

    @yfb
    public static final <T> List<T> filter(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (qy6Var.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @yfb
    public static final <T> List<T> filterIndexed(@yfb Iterable<? extends T> iterable, @yfb gz6<? super Integer, ? super T, Boolean> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(gz6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            if (gz6Var.invoke(Integer.valueOf(i), t).booleanValue()) {
                arrayList.add(t);
            }
            i = i2;
        }
        return arrayList;
    }

    @yfb
    public static final <T, C extends Collection<? super T>> C filterIndexedTo(@yfb Iterable<? extends T> iterable, @yfb C c, @yfb gz6<? super Integer, ? super T, Boolean> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            if (gz6Var.invoke(Integer.valueOf(i), t).booleanValue()) {
                c.add(t);
            }
            i = i2;
        }
        return c;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Iterable<?> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            md8.reifiedOperationMarker(3, "R");
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Iterable<?> iterable, C c) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (Object obj : iterable) {
            md8.reifiedOperationMarker(3, "R");
            if (obj != null) {
                c.add(obj);
            }
        }
        return c;
    }

    @yfb
    public static final <T> List<T> filterNot(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!qy6Var.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @yfb
    public static <T> List<T> filterNotNull(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return (List) filterNotNullTo(iterable, new ArrayList());
    }

    @yfb
    public static final <C extends Collection<? super T>, T> C filterNotNullTo(@yfb Iterable<? extends T> iterable, @yfb C c) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (T t : iterable) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    @yfb
    public static final <T, C extends Collection<? super T>> C filterNotTo(@yfb Iterable<? extends T> iterable, @yfb C c, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : iterable) {
            if (!qy6Var.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    @yfb
    public static final <T, C extends Collection<? super T>> C filterTo(@yfb Iterable<? extends T> iterable, @yfb C c, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : iterable) {
            if (qy6Var.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @t28
    private static final <T> T find(Iterable<? extends T> iterable, qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : iterable) {
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @t28
    private static final <T> T findLast(Iterable<? extends T> iterable, qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        T t = null;
        for (T t2 : iterable) {
            if (qy6Var.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    public static <T> T first(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) first((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @jjf(version = "1.5")
    @t28
    private static final <T, R> R firstNotNullOf(Iterable<? extends T> iterable, qy6<? super T, ? extends R> qy6Var) {
        R rInvoke;
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = iterable.iterator();
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
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @jjf(version = "1.5")
    @t28
    private static final <T, R> R firstNotNullOfOrNull(Iterable<? extends T> iterable, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = qy6Var.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @gib
    public static <T> T firstOrNull(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @yfb
    public static final <T, R> List<R> flatMap(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            q82.addAll(arrayList, qy6Var.invoke(it.next()));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterable")
    private static final <T, R> List<R> flatMapIndexedIterable(Iterable<? extends T> iterable, gz6<? super Integer, ? super T, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterableTo")
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(Iterable<? extends T> iterable, C c, gz6<? super Integer, ? super T, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return c;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedSequence")
    private static final <T, R> List<R> flatMapIndexedSequence(Iterable<? extends T> iterable, gz6<? super Integer, ? super T, ? extends vye<? extends R>> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedSequenceTo")
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(Iterable<? extends T> iterable, C c, gz6<? super Integer, ? super T, ? extends vye<? extends R>> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return c;
    }

    @r9c
    @jjf(version = "1.4")
    @xn8(name = "flatMapSequence")
    @yfb
    public static final <T, R> List<R> flatMapSequence(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends vye<? extends R>> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            q82.addAll(arrayList, qy6Var.invoke(it.next()));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @xn8(name = "flatMapSequenceTo")
    @yfb
    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(@yfb Iterable<? extends T> iterable, @yfb C c, @yfb qy6<? super T, ? extends vye<? extends R>> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            q82.addAll(c, qy6Var.invoke(it.next()));
        }
        return c;
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C flatMapTo(@yfb Iterable<? extends T> iterable, @yfb C c, @yfb qy6<? super T, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            q82.addAll(c, qy6Var.invoke(it.next()));
        }
        return c;
    }

    public static final <T, R> R fold(@yfb Iterable<? extends T> iterable, R r, @yfb gz6<? super R, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = gz6Var.invoke(r, it.next());
        }
        return r;
    }

    public static final <T, R> R foldIndexed(@yfb Iterable<? extends T> iterable, R r, @yfb kz6<? super Integer, ? super R, ? super T, ? extends R> kz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            r = kz6Var.invoke(Integer.valueOf(i), r, t);
            i = i2;
        }
        return r;
    }

    public static final <T, R> R foldRight(@yfb List<? extends T> list, R r, @yfb gz6<? super T, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r = gz6Var.invoke(listIterator.previous(), r);
            }
        }
        return r;
    }

    public static final <T, R> R foldRightIndexed(@yfb List<? extends T> list, R r, @yfb kz6<? super Integer, ? super T, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r = kz6Var.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r);
            }
        }
        return r;
    }

    @xj7
    public static final <T> void forEach(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, bth> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            qy6Var.invoke(it.next());
        }
    }

    public static final <T> void forEachIndexed(@yfb Iterable<? extends T> iterable, @yfb gz6<? super Integer, ? super T, bth> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            gz6Var.invoke(Integer.valueOf(i), t);
            i = i2;
        }
    }

    @t28
    private static final <T> T getOrElse(List<? extends T> list, int i, qy6<? super Integer, ? extends T> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= list.size()) ? qy6Var.invoke(Integer.valueOf(i)) : list.get(i);
    }

    @gib
    public static <T> T getOrNull(@yfb List<? extends T> list, int i) {
        md8.checkNotNullParameter(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    @yfb
    public static final <T, K> Map<K, List<T>> groupBy(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : iterable) {
            K kInvoke = qy6Var.invoke(t);
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return linkedHashMap;
    }

    @yfb
    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@yfb Iterable<? extends T> iterable, @yfb M m, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (T t : iterable) {
            K kInvoke = qy6Var.invoke(t);
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return m;
    }

    @jjf(version = "1.1")
    @yfb
    public static final <T, K> wb7<T, K> groupingBy(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        return new C13934b(iterable, qy6Var);
    }

    public static final <T> int indexOf(@yfb Iterable<? extends T> iterable, T t) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                l82.throwIndexOverflow();
            }
            if (md8.areEqual(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            if (qy6Var.invoke(t).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = -1;
        int i2 = 0;
        for (T t : iterable) {
            if (i2 < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            if (qy6Var.invoke(t).booleanValue()) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    @yfb
    public static <T> Set<T> intersect(@yfb Iterable<? extends T> iterable, @yfb Iterable<? extends T> iterable2) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(iterable2, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        q82.retainAll(mutableSet, iterable2);
        return mutableSet;
    }

    @yfb
    public static final <T, A extends Appendable> A joinTo(@yfb Iterable<? extends T> iterable, @yfb A a, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super T, ? extends CharSequence> qy6Var) throws IOException {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(a, "buffer");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            w8g.appendElement(a, t, qy6Var);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @yfb
    public static final <T> String joinToString(@yfb Iterable<? extends T> iterable, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super T, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return ((StringBuilder) joinTo(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, qy6Var)).toString();
    }

    public static /* synthetic */ String joinToString$default(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return joinToString(iterable, charSequence, charSequence5, charSequence6, i3, charSequence7, qy6Var);
    }

    public static final <T> T last(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) last((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> int lastIndexOf(@yfb Iterable<? extends T> iterable, T t) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t);
        }
        int i = -1;
        int i2 = 0;
        for (T t2 : iterable) {
            if (i2 < 0) {
                l82.throwIndexOverflow();
            }
            if (md8.areEqual(t, t2)) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    @gib
    public static final <T> T lastOrNull(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @yfb
    public static final <T, R> List<R> map(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(qy6Var.invoke(it.next()));
        }
        return arrayList;
    }

    @yfb
    public static final <T, R> List<R> mapIndexed(@yfb Iterable<? extends T> iterable, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(iterable, 10));
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            arrayList.add(gz6Var.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return arrayList;
    }

    @yfb
    public static final <T, R> List<R> mapIndexedNotNull(@yfb Iterable<? extends T> iterable, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            R rInvoke = gz6Var.invoke(Integer.valueOf(i), t);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i = i2;
        }
        return arrayList;
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@yfb Iterable<? extends T> iterable, @yfb C c, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            R rInvoke = gz6Var.invoke(Integer.valueOf(i), t);
            if (rInvoke != null) {
                c.add(rInvoke);
            }
            i = i2;
        }
        return c;
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@yfb Iterable<? extends T> iterable, @yfb C c, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            c.add(gz6Var.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return c;
    }

    @yfb
    public static final <T, R> List<R> mapNotNull(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = qy6Var.invoke(it.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@yfb Iterable<? extends T> iterable, @yfb C c, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = qy6Var.invoke(it.next());
            if (rInvoke != null) {
                c.add(rInvoke);
            }
        }
        return c;
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C mapTo(@yfb Iterable<? extends T> iterable, @yfb C c, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(qy6Var.invoke(it.next()));
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @gib
    @jjf(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = qy6Var.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = qy6Var.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @jjf(version = "1.7")
    @xn8(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = qy6Var.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = qy6Var.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T> double maxOf(Iterable<? extends T> iterable, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Double m32735maxOfOrNull(Iterable<? extends T> iterable, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R> R maxOfWith(Iterable<? extends T> iterable, Comparator<? super R> comparator, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R> R maxOfWithOrNull(Iterable<? extends T> iterable, Comparator<? super R> comparator, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = qy6Var.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @gib
    @jjf(version = "1.4")
    /* JADX INFO: renamed from: maxOrNull, reason: collision with other method in class */
    public static final Double m32737maxOrNull(@yfb Iterable<Double> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    public static final double maxOrThrow(@yfb Iterable<Double> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @gib
    @jjf(version = "1.4")
    public static final <T> T maxWithOrNull(@yfb Iterable<? extends T> iterable, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow")
    public static final <T> T maxWithOrThrow(@yfb Iterable<? extends T> iterable, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @gib
    @jjf(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T minByOrNull(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = qy6Var.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = qy6Var.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @jjf(version = "1.7")
    @xn8(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = qy6Var.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = qy6Var.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T> double minOf(Iterable<? extends T> iterable, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Double m32743minOfOrNull(Iterable<? extends T> iterable, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R> R minOfWith(Iterable<? extends T> iterable, Comparator<? super R> comparator, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R> R minOfWithOrNull(Iterable<? extends T> iterable, Comparator<? super R> comparator, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = qy6Var.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @gib
    @jjf(version = "1.4")
    /* JADX INFO: renamed from: minOrNull, reason: collision with other method in class */
    public static final Double m32745minOrNull(@yfb Iterable<Double> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    public static final double minOrThrow(@yfb Iterable<Double> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @gib
    @jjf(version = "1.4")
    public static final <T> T minWithOrNull(@yfb Iterable<? extends T> iterable, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow")
    public static final <T> T minWithOrThrow(@yfb Iterable<? extends T> iterable, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @yfb
    public static <T> List<T> minus(@yfb Iterable<? extends T> iterable, T t) {
        md8.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(iterable, 10));
        boolean z = false;
        for (T t2 : iterable) {
            boolean z2 = true;
            if (!z && md8.areEqual(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    @t28
    private static final <T> List<T> minusElement(Iterable<? extends T> iterable, T t) {
        md8.checkNotNullParameter(iterable, "<this>");
        return minus(iterable, t);
    }

    public static final <T> boolean none(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    @jjf(version = "1.1")
    @yfb
    public static final <T, C extends Iterable<? extends T>> C onEach(@yfb C c, @yfb qy6<? super T, bth> qy6Var) {
        md8.checkNotNullParameter(c, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        Iterator<T> it = c.iterator();
        while (it.hasNext()) {
            qy6Var.invoke(it.next());
        }
        return c;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T, C extends Iterable<? extends T>> C onEachIndexed(@yfb C c, @yfb gz6<? super Integer, ? super T, bth> gz6Var) {
        md8.checkNotNullParameter(c, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int i = 0;
        for (T t : c) {
            int i2 = i + 1;
            if (i < 0) {
                l82.throwIndexOverflow();
            }
            gz6Var.invoke(Integer.valueOf(i), t);
            i = i2;
        }
        return c;
    }

    @yfb
    public static final <T> scc<List<T>, List<T>> partition(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : iterable) {
            if (qy6Var.invoke(t).booleanValue()) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        return new scc<>(arrayList, arrayList2);
    }

    @yfb
    public static final <T> List<T> plus(@yfb Iterable<? extends T> iterable, T t) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Object) t);
        }
        ArrayList arrayList = new ArrayList();
        q82.addAll(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    @t28
    private static final <T> List<T> plusElement(Iterable<? extends T> iterable, T t) {
        md8.checkNotNullParameter(iterable, "<this>");
        return plus(iterable, t);
    }

    @jjf(version = "1.3")
    @t28
    private static final <T> T random(Collection<? extends T> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        return (T) random(collection, tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final <T> T randomOrNull(Collection<? extends T> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        return (T) randomOrNull(collection, tod.f85517a);
    }

    public static final <S, T extends S> S reduce(@yfb Iterable<? extends T> iterable, @yfb gz6<? super S, ? super T, ? extends S> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = gz6Var.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexed(@yfb Iterable<? extends T> iterable, @yfb kz6<? super Integer, ? super S, ? super T, ? extends S> kz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            next = kz6Var.invoke(Integer.valueOf(i), next, it.next());
            i = i2;
        }
        return next;
    }

    @gib
    @jjf(version = "1.4")
    public static final <S, T extends S> S reduceIndexedOrNull(@yfb Iterable<? extends T> iterable, @yfb kz6<? super Integer, ? super S, ? super T, ? extends S> kz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            next = kz6Var.invoke(Integer.valueOf(i), next, it.next());
            i = i2;
        }
        return next;
    }

    @gib
    @jjf(version = "1.4")
    public static final <S, T extends S> S reduceOrNull(@yfb Iterable<? extends T> iterable, @yfb gz6<? super S, ? super T, ? extends S> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = gz6Var.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceRight(@yfb List<? extends T> list, @yfb gz6<? super T, ? super S, ? extends S> gz6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = gz6Var.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    public static final <S, T extends S> S reduceRightIndexed(@yfb List<? extends T> list, @yfb kz6<? super Integer, ? super T, ? super S, ? extends S> kz6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = kz6Var.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @gib
    @jjf(version = "1.4")
    public static final <S, T extends S> S reduceRightIndexedOrNull(@yfb List<? extends T> list, @yfb kz6<? super Integer, ? super T, ? super S, ? extends S> kz6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = kz6Var.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @gib
    @jjf(version = "1.4")
    public static final <S, T extends S> S reduceRightOrNull(@yfb List<? extends T> list, @yfb gz6<? super T, ? super S, ? extends S> gz6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = gz6Var.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T> Iterable<T> requireNoNulls(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + a18.f100c);
            }
        }
        return iterable;
    }

    @yfb
    public static final <T> List<T> reversed(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return toList(iterable);
        }
        List<T> mutableList = toMutableList(iterable);
        s82.reverse(mutableList);
        return mutableList;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T, R> List<R> runningFold(@yfb Iterable<? extends T> iterable, R r, @yfb gz6<? super R, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = gz6Var.invoke(r, it.next());
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T, R> List<R> runningFoldIndexed(@yfb Iterable<? extends T> iterable, R r, @yfb kz6<? super Integer, ? super R, ? super T, ? extends R> kz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            r = kz6Var.invoke(Integer.valueOf(i), r, it.next());
            arrayList.add(r);
            i++;
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <S, T extends S> List<S> runningReduce(@yfb Iterable<? extends T> iterable, @yfb gz6<? super S, ? super T, ? extends S> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return l82.emptyList();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        while (it.hasNext()) {
            next = gz6Var.invoke(next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <S, T extends S> List<S> runningReduceIndexed(@yfb Iterable<? extends T> iterable, @yfb kz6<? super Integer, ? super S, ? super T, ? extends S> kz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return l82.emptyList();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        int i = 1;
        while (it.hasNext()) {
            next = kz6Var.invoke(Integer.valueOf(i), next, it.next());
            arrayList.add(next);
            i++;
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T, R> List<R> scan(@yfb Iterable<? extends T> iterable, R r, @yfb gz6<? super R, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = gz6Var.invoke(r, it.next());
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T, R> List<R> scanIndexed(@yfb Iterable<? extends T> iterable, R r, @yfb kz6<? super Integer, ? super R, ? super T, ? extends R> kz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            r = kz6Var.invoke(Integer.valueOf(i), r, it.next());
            arrayList.add(r);
            i++;
        }
        return arrayList;
    }

    @jjf(version = "1.3")
    public static final <T> void shuffle(@yfb List<T> list, @yfb tod todVar) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        for (int lastIndex = l82.getLastIndex(list); lastIndex > 0; lastIndex--) {
            int iNextInt = todVar.nextInt(lastIndex + 1);
            list.set(iNextInt, list.set(lastIndex, list.get(iNextInt)));
        }
    }

    public static <T> T single(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) single((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    @gib
    public static final <T> T singleOrNull(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @yfb
    public static <T> List<T> slice(@yfb List<? extends T> list, @yfb f78 f78Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? l82.emptyList() : toList(list.subList(f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1));
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(@yfb List<T> list, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (list.size() > 1) {
            p82.sortWith(list, new md2.C9296a(qy6Var));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(@yfb List<T> list, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (list.size() > 1) {
            p82.sortWith(list, new md2.C9298c(qy6Var));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(@yfb List<T> list) {
        md8.checkNotNullParameter(list, "<this>");
        p82.sortWith(list, md2.reverseOrder());
    }

    @yfb
    public static <T extends Comparable<? super T>> List<T> sorted(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = toMutableList(iterable);
            p82.sort(mutableList);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return toList(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        u70.sort(array);
        return u70.asList(array);
    }

    @yfb
    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(iterable, new md2.C9296a(qy6Var));
    }

    @yfb
    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(iterable, new md2.C9298c(qy6Var));
    }

    @yfb
    public static final <T extends Comparable<? super T>> List<T> sortedDescending(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return sortedWith(iterable, md2.reverseOrder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static <T> List<T> sortedWith(@yfb Iterable<? extends T> iterable, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = toMutableList(iterable);
            p82.sortWith(mutableList, comparator);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return toList(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        u70.sortWith(array, comparator);
        return u70.asList(array);
    }

    @yfb
    public static final <T> Set<T> subtract(@yfb Iterable<? extends T> iterable, @yfb Iterable<? extends T> iterable2) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(iterable2, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        q82.removeAll(mutableSet, iterable2);
        return mutableSet;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> int sumBy(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Integer> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += qy6Var.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> double sumByDouble(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += qy6Var.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @xn8(name = "sumOfByte")
    public static final int sumOfByte(@yfb Iterable<Byte> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    private static final <T> double sumOfDouble(Iterable<? extends T> iterable, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += qy6Var.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @xn8(name = "sumOfFloat")
    public static final float sumOfFloat(@yfb Iterable<Float> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    private static final <T> int sumOfInt(Iterable<? extends T> iterable, qy6<? super T, Integer> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += qy6Var.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    private static final <T> long sumOfLong(Iterable<? extends T> iterable, qy6<? super T, Long> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += qy6Var.invoke(it.next()).longValue();
        }
        return jLongValue;
    }

    @xn8(name = "sumOfShort")
    public static final int sumOfShort(@yfb Iterable<Short> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    private static final <T> int sumOfUInt(Iterable<? extends T> iterable, qy6<? super T, woh> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(it.next()).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    private static final <T> long sumOfULong(Iterable<? extends T> iterable, qy6<? super T, oph> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(it.next()).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @yfb
    public static <T> List<T> take(@yfb Iterable<? extends T> iterable, int i) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return toList(iterable);
            }
            if (i == 1) {
                return k82.listOf(first(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return l82.optimizeReadOnlyList(arrayList);
    }

    @yfb
    public static final <T> List<T> takeLast(@yfb List<? extends T> list, int i) {
        md8.checkNotNullParameter(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return l82.emptyList();
        }
        int size = list.size();
        if (i >= size) {
            return toList(list);
        }
        if (i == 1) {
            return k82.listOf(last((List) list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    @yfb
    public static final <T> List<T> takeLastWhile(@yfb List<? extends T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        if (list.isEmpty()) {
            return l82.emptyList();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!qy6Var.invoke(listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return l82.emptyList();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return toList(list);
    }

    @yfb
    public static final <T> List<T> takeWhile(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!qy6Var.invoke(t).booleanValue()) {
                break;
            }
            arrayList.add(t);
        }
        return arrayList;
    }

    @yfb
    public static boolean[] toBooleanArray(@yfb Collection<Boolean> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = it.next().booleanValue();
            i++;
        }
        return zArr;
    }

    @yfb
    public static byte[] toByteArray(@yfb Collection<Byte> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = it.next().byteValue();
            i++;
        }
        return bArr;
    }

    @yfb
    public static final char[] toCharArray(@yfb Collection<Character> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            cArr[i] = it.next().charValue();
            i++;
        }
        return cArr;
    }

    @yfb
    public static final <T, C extends Collection<? super T>> C toCollection(@yfb Iterable<? extends T> iterable, @yfb C c) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    @yfb
    public static final double[] toDoubleArray(@yfb Collection<Double> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            dArr[i] = it.next().doubleValue();
            i++;
        }
        return dArr;
    }

    @yfb
    public static float[] toFloatArray(@yfb Collection<Float> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = it.next().floatValue();
            i++;
        }
        return fArr;
    }

    @yfb
    public static <T> HashSet<T> toHashSet(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return (HashSet) toCollection(iterable, new HashSet(wt9.mapCapacity(m82.collectionSizeOrDefault(iterable, 12))));
    }

    @yfb
    public static int[] toIntArray(@yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    @yfb
    public static <T> List<T> toList(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return l82.optimizeReadOnlyList(toMutableList(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return l82.emptyList();
        }
        if (size != 1) {
            return toMutableList(collection);
        }
        return k82.listOf(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    @yfb
    public static long[] toLongArray(@yfb Collection<Long> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    @yfb
    public static final <T> List<T> toMutableList(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? toMutableList((Collection) iterable) : (List) toCollection(iterable, new ArrayList());
    }

    @yfb
    public static <T> Set<T> toMutableSet(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) toCollection(iterable, new LinkedHashSet());
    }

    @yfb
    public static <T> Set<T> toSet(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return w6f.optimizeReadOnlySet((Set) toCollection(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return w6f.emptySet();
        }
        if (size != 1) {
            return (Set) toCollection(iterable, new LinkedHashSet(wt9.mapCapacity(collection.size())));
        }
        return v6f.setOf(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    @yfb
    public static final short[] toShortArray(@yfb Collection<Short> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            sArr[i] = it.next().shortValue();
            i++;
        }
        return sArr;
    }

    @yfb
    public static final <T> Set<T> union(@yfb Iterable<? extends T> iterable, @yfb Iterable<? extends T> iterable2) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(iterable2, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        q82.addAll(mutableSet, iterable2);
        return mutableSet;
    }

    @jjf(version = "1.2")
    @yfb
    public static <T> List<List<T>> windowed(@yfb Iterable<? extends T> iterable, int i, int i2, boolean z) {
        md8.checkNotNullParameter(iterable, "<this>");
        krf.checkWindowSizeStep(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itWindowedIterator = krf.windowedIterator(iterable.iterator(), i, i2, z, false);
            while (itWindowedIterator.hasNext()) {
                arrayList.add((List) itWindowedIterator.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int iCoerceAtMost = kpd.coerceAtMost(i, size - i3);
            if (iCoerceAtMost < i && !z) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iCoerceAtMost);
            for (int i4 = 0; i4 < iCoerceAtMost; i4++) {
                arrayList3.add(list.get(i4 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowed(iterable, i, i2, z);
    }

    @yfb
    public static final <T> Iterable<q08<T>> withIndex(@yfb final Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return new r08(new ny6() { // from class: t82
            @Override // p000.ny6
            public final Object invoke() {
                return iterable.iterator();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T, R, V> List<V> zip(@yfb Iterable<? extends T> iterable, @yfb R[] rArr, @yfb gz6<? super T, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (T t : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(gz6Var.invoke(t, rArr[i]));
            i++;
        }
        return arrayList;
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T, R> List<R> zipWithNext(@yfb Iterable<? extends T> iterable, @yfb gz6<? super T, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC0000a next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(gz6Var.invoke(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T, R> List<R> chunked(@yfb Iterable<? extends T> iterable, int i, @yfb qy6<? super List<? extends T>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        return windowed(iterable, i, i, true, qy6Var);
    }

    @t28
    private static final <T> List<T> plusElement(Collection<? extends T> collection, T t) {
        md8.checkNotNullParameter(collection, "<this>");
        return plus((Collection) collection, (Object) t);
    }

    @jjf(version = "1.3")
    public static final <T> T random(@yfb Collection<? extends T> collection, @yfb tod todVar) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) elementAt(collection, todVar.nextInt(collection.size()));
    }

    @gib
    @jjf(version = "1.4")
    public static final <T> T randomOrNull(@yfb Collection<? extends T> collection, @yfb tod todVar) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) elementAt(collection, todVar.nextInt(collection.size()));
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i, int i2, boolean z, qy6 qy6Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowed(iterable, i, i2, z, qy6Var);
    }

    public static final <T> boolean any(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (qy6Var.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@yfb Iterable<? extends T> iterable, @yfb M m, @yfb qy6<? super T, ? extends K> qy6Var, @yfb qy6<? super T, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (T t : iterable) {
            m.put(qy6Var.invoke(t), qy6Var2.invoke(t));
        }
        return m;
    }

    @t28
    private static final <T> int count(Collection<? extends T> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @t28
    private static final <T> T findLast(List<? extends T> list, qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (qy6Var.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    public static final <T> boolean none(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (qy6Var.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T> List<T> requireNoNulls(@yfb List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + a18.f100c);
            }
        }
        return list;
    }

    @yfb
    public static final <T> List<T> slice(@yfb List<? extends T> list, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    @xn8(name = "sumOfDouble")
    public static final double sumOfDouble(@yfb Iterable<Double> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    @xn8(name = "sumOfInt")
    public static final int sumOfInt(@yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    @xn8(name = "sumOfLong")
    public static final long sumOfLong(@yfb Iterable<Long> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    public static final <T> int count(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (qy6Var.invoke(it.next()).booleanValue() && (i = i + 1) < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
                l82.throwCountOverflow();
            }
        }
        return i;
    }

    @t28
    private static final <T> T elementAt(List<? extends T> list, int i) {
        md8.checkNotNullParameter(list, "<this>");
        return list.get(i);
    }

    public static final <T> int indexOfFirst(@yfb List<? extends T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (qy6Var.invoke(it.next()).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(@yfb List<? extends T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (qy6Var.invoke(listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @yfb
    public static <T> List<T> toMutableList(@yfb Collection<? extends T> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    @yfb
    public static final <T, K, V> Map<K, V> associateBy(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends K> qy6Var, @yfb qy6<? super T, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(m82.collectionSizeOrDefault(iterable, 10)), 16));
        for (T t : iterable) {
            linkedHashMap.put(qy6Var.invoke(t), qy6Var2.invoke(t));
        }
        return linkedHashMap;
    }

    public static final <T> int indexOf(@yfb List<? extends T> list, T t) {
        md8.checkNotNullParameter(list, "<this>");
        return list.indexOf(t);
    }

    public static final <T> int lastIndexOf(@yfb List<? extends T> list, T t) {
        md8.checkNotNullParameter(list, "<this>");
        return list.lastIndexOf(t);
    }

    @yfb
    public static final <T> List<T> minus(@yfb Iterable<? extends T> iterable, @yfb T[] tArr) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(tArr, "elements");
        if (tArr.length == 0) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!e80.contains(tArr, t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @yfb
    public static <T> List<T> plus(@yfb Collection<? extends T> collection, T t) {
        md8.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    @yfb
    public static final <T, R, V> List<V> zip(@yfb Iterable<? extends T> iterable, @yfb Iterable<? extends R> iterable2, @yfb gz6<? super T, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(iterable2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), m82.collectionSizeOrDefault(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(gz6Var.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    @t28
    private static final <T> T elementAtOrNull(List<? extends T> list, int i) {
        md8.checkNotNullParameter(list, "<this>");
        return (T) getOrNull(list, i);
    }

    public static <T> T first(@yfb List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @gib
    public static <T> T singleOrNull(@yfb List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @gib
    public static <T> T firstOrNull(@yfb List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @gib
    public static <T> T lastOrNull(@yfb List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @gib
    public static final <T> T singleOrNull(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        boolean z = false;
        T t = null;
        for (T t2 : iterable) {
            if (qy6Var.invoke(t2).booleanValue()) {
                if (z) {
                    return null;
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        return null;
    }

    @t28
    private static final <T> T elementAtOrElse(List<? extends T> list, int i, qy6<? super Integer, ? extends T> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= list.size()) ? qy6Var.invoke(Integer.valueOf(i)) : list.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @gib
    public static final <T> T firstOrNull(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : iterable) {
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@yfb Iterable<? extends T> iterable, @yfb M m, @yfb qy6<? super T, ? extends K> qy6Var, @yfb qy6<? super T, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (T t : iterable) {
            K kInvoke = qy6Var.invoke(t);
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(t));
        }
        return m;
    }

    public static <T> T last(@yfb List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(l82.getLastIndex(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    @gib
    public static final <T> T lastOrNull(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        T t = null;
        for (T t2 : iterable) {
            if (qy6Var.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <T> float m32733maxOf(Iterable<? extends T> iterable, qy6<? super T, Float> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float fFloatValue = qy6Var.invoke(it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(it.next()).floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Float m32736maxOfOrNull(Iterable<? extends T> iterable, qy6<? super T, Float> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, qy6Var.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @gib
    @jjf(version = "1.4")
    /* JADX INFO: renamed from: maxOrNull, reason: collision with other method in class */
    public static final Float m32738maxOrNull(@yfb Iterable<Float> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    /* JADX INFO: renamed from: maxOrThrow, reason: collision with other method in class */
    public static final float m32739maxOrThrow(@yfb Iterable<Float> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float fFloatValue = it.next().floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, it.next().floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <T> float m32741minOf(Iterable<? extends T> iterable, qy6<? super T, Float> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float fFloatValue = qy6Var.invoke(it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(it.next()).floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Float m32744minOfOrNull(Iterable<? extends T> iterable, qy6<? super T, Float> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, qy6Var.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @gib
    @jjf(version = "1.4")
    /* JADX INFO: renamed from: minOrNull, reason: collision with other method in class */
    public static final Float m32746minOrNull(@yfb Iterable<Float> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    /* JADX INFO: renamed from: minOrThrow, reason: collision with other method in class */
    public static final float m32747minOrThrow(@yfb Iterable<Float> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float fFloatValue = it.next().floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, it.next().floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @yfb
    public static final <T> List<T> plus(@yfb Iterable<? extends T> iterable, @yfb T[] tArr) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(tArr, "elements");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Object[]) tArr);
        }
        ArrayList arrayList = new ArrayList();
        q82.addAll(arrayList, iterable);
        q82.addAll(arrayList, tArr);
        return arrayList;
    }

    public static <T> T single(@yfb List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T> List<scc<T, T>> zipWithNext(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(vkh.m24050to(next, next2));
            next = next2;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T first(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : iterable) {
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @yfb
    public static final <T, K, V> Map<K, List<V>> groupBy(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends K> qy6Var, @yfb qy6<? super T, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : iterable) {
            K kInvoke = qy6Var.invoke(t);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(t));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @gib
    public static final <T> T lastOrNull(@yfb List<? extends T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (qy6Var.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    @yfb
    public static final <T> List<T> minus(@yfb Iterable<? extends T> iterable, @yfb Iterable<? extends T> iterable2) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(iterable2, "elements");
        Collection collectionConvertToListIfNotCollection = q82.convertToListIfNotCollection(iterable2);
        if (collectionConvertToListIfNotCollection.isEmpty()) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!collectionConvertToListIfNotCollection.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @yfb
    public static final <T, R> List<scc<T, R>> zip(@yfb Iterable<? extends T> iterable, @yfb R[] rArr) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(rArr, "other");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (T t : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(vkh.m24050to(t, rArr[i]));
            i++;
        }
        return arrayList;
    }

    public static final <T> T last(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : iterable) {
            if (qy6Var.invoke(t2).booleanValue()) {
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @yfb
    public static final <T> List<T> plus(@yfb Collection<? extends T> collection, @yfb T[] tArr) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(tArr, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + tArr.length);
        arrayList.addAll(collection);
        q82.addAll(arrayList, tArr);
        return arrayList;
    }

    public static final <T> T single(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : iterable) {
            if (qy6Var.invoke(t2).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T, R> List<R> windowed(@yfb Iterable<? extends T> iterable, int i, int i2, boolean z, @yfb qy6<? super List<? extends T>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        krf.checkWindowSizeStep(i, i2);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i3 = 0;
            ArrayList arrayList = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
            l0b l0bVar = new l0b(list);
            while (i3 >= 0 && i3 < size) {
                int iCoerceAtMost = kpd.coerceAtMost(i, size - i3);
                if (!z && iCoerceAtMost < i) {
                    break;
                }
                l0bVar.move(i3, iCoerceAtMost + i3);
                arrayList.add(qy6Var.invoke(l0bVar));
                i3 += i2;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator itWindowedIterator = krf.windowedIterator(iterable.iterator(), i, i2, z, true);
        while (itWindowedIterator.hasNext()) {
            arrayList2.add(qy6Var.invoke((List) itWindowedIterator.next()));
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    public static final <T> T last(@yfb List<? extends T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (qy6Var.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m32734maxOf(Iterable<? extends T> iterable, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R rInvoke = qy6Var.invoke(it.next());
            while (it.hasNext()) {
                R rInvoke2 = qy6Var.invoke(it.next());
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R extends Comparable<? super R>> R maxOfOrNull(Iterable<? extends T> iterable, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = qy6Var.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @gib
    @jjf(version = "1.4")
    public static final <T extends Comparable<? super T>> T maxOrNull(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @jjf(version = "1.7")
    @yfb
    @xn8(name = "maxOrThrow")
    /* JADX INFO: renamed from: maxOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m32740maxOrThrow(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m32742minOf(Iterable<? extends T> iterable, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R rInvoke = qy6Var.invoke(it.next());
            while (it.hasNext()) {
                R rInvoke2 = qy6Var.invoke(it.next());
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R extends Comparable<? super R>> R minOfOrNull(Iterable<? extends T> iterable, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = qy6Var.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @gib
    @jjf(version = "1.4")
    public static <T extends Comparable<? super T>> T minOrNull(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @jjf(version = "1.7")
    @yfb
    @xn8(name = "minOrThrow")
    /* JADX INFO: renamed from: minOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m32748minOrThrow(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @yfb
    public static final <T> List<T> plus(@yfb Iterable<? extends T> iterable, @yfb Iterable<? extends T> iterable2) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(iterable2, "elements");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Iterable) iterable2);
        }
        ArrayList arrayList = new ArrayList();
        q82.addAll(arrayList, iterable);
        q82.addAll(arrayList, iterable2);
        return arrayList;
    }

    @yfb
    public static <T, R> List<scc<T, R>> zip(@yfb Iterable<? extends T> iterable, @yfb Iterable<? extends R> iterable2) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(m82.collectionSizeOrDefault(iterable, 10), m82.collectionSizeOrDefault(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(vkh.m24050to(it.next(), it2.next()));
        }
        return arrayList;
    }

    @yfb
    public static final <T> List<T> minus(@yfb Iterable<? extends T> iterable, @yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(vyeVar, "elements");
        List list = vze.toList(vyeVar);
        if (list.isEmpty()) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!list.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @yfb
    public static <T> List<T> plus(@yfb Collection<? extends T> collection, @yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        q82.addAll(arrayList2, iterable);
        return arrayList2;
    }

    @yfb
    public static final <T> List<T> plus(@yfb Iterable<? extends T> iterable, @yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(vyeVar, "elements");
        ArrayList arrayList = new ArrayList();
        q82.addAll(arrayList, iterable);
        q82.addAll(arrayList, vyeVar);
        return arrayList;
    }

    @yfb
    public static final <T> List<T> plus(@yfb Collection<? extends T> collection, @yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(vyeVar, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        q82.addAll(arrayList, vyeVar);
        return arrayList;
    }
}
