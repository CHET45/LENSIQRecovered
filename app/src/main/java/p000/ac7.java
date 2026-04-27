package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
public class ac7 extends zb7 {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @jjf(version = "1.1")
    @yfb
    public static final <T, K, R> Map<K, R> aggregate(@yfb wb7<T, ? extends K> wb7Var, @yfb oz6<? super K, ? super R, ? super T, ? super Boolean, ? extends R> oz6Var) {
        md8.checkNotNullParameter(wb7Var, "<this>");
        md8.checkNotNullParameter(oz6Var, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = wb7Var.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            Object objKeyOf = wb7Var.keyOf(next);
            InterfaceC0000a interfaceC0000a = (Object) linkedHashMap.get(objKeyOf);
            linkedHashMap.put(objKeyOf, oz6Var.invoke(objKeyOf, interfaceC0000a, next, Boolean.valueOf(interfaceC0000a == null && !linkedHashMap.containsKey(objKeyOf))));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @jjf(version = "1.1")
    @yfb
    public static final <T, K, R, M extends Map<? super K, R>> M aggregateTo(@yfb wb7<T, ? extends K> wb7Var, @yfb M m, @yfb oz6<? super K, ? super R, ? super T, ? super Boolean, ? extends R> oz6Var) {
        md8.checkNotNullParameter(wb7Var, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(oz6Var, "operation");
        Iterator<T> itSourceIterator = wb7Var.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            Object objKeyOf = wb7Var.keyOf(next);
            InterfaceC0000a interfaceC0000a = (Object) m.get(objKeyOf);
            m.put(objKeyOf, oz6Var.invoke(objKeyOf, interfaceC0000a, next, Boolean.valueOf(interfaceC0000a == null && !m.containsKey(objKeyOf))));
        }
        return m;
    }

    @jjf(version = "1.1")
    @yfb
    public static final <T, K, M extends Map<? super K, Integer>> M eachCountTo(@yfb wb7<T, ? extends K> wb7Var, @yfb M m) {
        md8.checkNotNullParameter(wb7Var, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        Iterator<T> itSourceIterator = wb7Var.sourceIterator();
        while (itSourceIterator.hasNext()) {
            K kKeyOf = wb7Var.keyOf(itSourceIterator.next());
            Object obj = m.get(kKeyOf);
            if (obj == null && !m.containsKey(kKeyOf)) {
                obj = 0;
            }
            m.put(kKeyOf, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @jjf(version = "1.1")
    @yfb
    public static final <T, K, R> Map<K, R> fold(@yfb wb7<T, ? extends K> wb7Var, @yfb gz6<? super K, ? super T, ? extends R> gz6Var, @yfb kz6<? super K, ? super R, ? super T, ? extends R> kz6Var) {
        md8.checkNotNullParameter(wb7Var, "<this>");
        md8.checkNotNullParameter(gz6Var, "initialValueSelector");
        md8.checkNotNullParameter(kz6Var, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = wb7Var.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            Object objKeyOf = wb7Var.keyOf(next);
            R rInvoke = (Object) linkedHashMap.get(objKeyOf);
            if (rInvoke == null && !linkedHashMap.containsKey(objKeyOf)) {
                rInvoke = gz6Var.invoke(objKeyOf, next);
            }
            linkedHashMap.put(objKeyOf, kz6Var.invoke(objKeyOf, rInvoke, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @jjf(version = "1.1")
    @yfb
    public static final <T, K, R, M extends Map<? super K, R>> M foldTo(@yfb wb7<T, ? extends K> wb7Var, @yfb M m, @yfb gz6<? super K, ? super T, ? extends R> gz6Var, @yfb kz6<? super K, ? super R, ? super T, ? extends R> kz6Var) {
        md8.checkNotNullParameter(wb7Var, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "initialValueSelector");
        md8.checkNotNullParameter(kz6Var, "operation");
        Iterator<T> itSourceIterator = wb7Var.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            Object objKeyOf = wb7Var.keyOf(next);
            R rInvoke = (Object) m.get(objKeyOf);
            if (rInvoke == null && !m.containsKey(objKeyOf)) {
                rInvoke = gz6Var.invoke(objKeyOf, next);
            }
            m.put(objKeyOf, kz6Var.invoke(objKeyOf, rInvoke, next));
        }
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.1")
    @yfb
    public static final <S, T extends S, K> Map<K, S> reduce(@yfb wb7<T, ? extends K> wb7Var, @yfb kz6<? super K, ? super S, ? super T, ? extends S> kz6Var) {
        md8.checkNotNullParameter(wb7Var, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itSourceIterator = wb7Var.sourceIterator();
        while (itSourceIterator.hasNext()) {
            S sInvoke = (Object) itSourceIterator.next();
            Object objKeyOf = wb7Var.keyOf(sInvoke);
            InterfaceC0000a interfaceC0000a = (Object) linkedHashMap.get(objKeyOf);
            if (!(interfaceC0000a == null && !linkedHashMap.containsKey(objKeyOf))) {
                sInvoke = kz6Var.invoke(objKeyOf, interfaceC0000a, sInvoke);
            }
            linkedHashMap.put(objKeyOf, sInvoke);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.1")
    @yfb
    public static final <S, T extends S, K, M extends Map<? super K, S>> M reduceTo(@yfb wb7<T, ? extends K> wb7Var, @yfb M m, @yfb kz6<? super K, ? super S, ? super T, ? extends S> kz6Var) {
        md8.checkNotNullParameter(wb7Var, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(kz6Var, "operation");
        Iterator itSourceIterator = wb7Var.sourceIterator();
        while (itSourceIterator.hasNext()) {
            S sInvoke = (Object) itSourceIterator.next();
            Object objKeyOf = wb7Var.keyOf(sInvoke);
            InterfaceC0000a interfaceC0000a = (Object) m.get(objKeyOf);
            if (!(interfaceC0000a == null && !m.containsKey(objKeyOf))) {
                sInvoke = kz6Var.invoke(objKeyOf, interfaceC0000a, sInvoke);
            }
            m.put(objKeyOf, sInvoke);
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @jjf(version = "1.1")
    @yfb
    public static final <T, K, R, M extends Map<? super K, R>> M foldTo(@yfb wb7<T, ? extends K> wb7Var, @yfb M m, R r, @yfb gz6<? super R, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(wb7Var, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "operation");
        Iterator<T> itSourceIterator = wb7Var.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            K kKeyOf = wb7Var.keyOf(next);
            InterfaceC0000a interfaceC0000a = (Object) m.get(kKeyOf);
            if (interfaceC0000a == null && !m.containsKey(kKeyOf)) {
                interfaceC0000a = (Object) r;
            }
            m.put(kKeyOf, gz6Var.invoke(interfaceC0000a, next));
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @jjf(version = "1.1")
    @yfb
    public static final <T, K, R> Map<K, R> fold(@yfb wb7<T, ? extends K> wb7Var, R r, @yfb gz6<? super R, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(wb7Var, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = wb7Var.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            K kKeyOf = wb7Var.keyOf(next);
            InterfaceC0000a interfaceC0000a = (Object) linkedHashMap.get(kKeyOf);
            if (interfaceC0000a == null && !linkedHashMap.containsKey(kKeyOf)) {
                interfaceC0000a = (Object) r;
            }
            linkedHashMap.put(kKeyOf, gz6Var.invoke(interfaceC0000a, next));
        }
        return linkedHashMap;
    }
}
