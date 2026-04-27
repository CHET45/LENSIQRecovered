package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\n_CollectionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1971#2,14:169\n2341#2,14:183\n*S KotlinDebug\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n*L\n89#1:169,14\n126#1:183,14\n*E\n"})
public class s82 extends r82 {
    @yfb
    public static final <R> List<R> filterIsInstance(@yfb Iterable<?> iterable, @yfb Class<R> cls) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(cls, "klass");
        return (List) filterIsInstanceTo(iterable, new ArrayList(), cls);
    }

    @yfb
    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@yfb Iterable<?> iterable, @yfb C c, @yfb Class<R> cls) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(cls, "klass");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @jjf(version = "1.1")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Double m32289max(Iterable iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return v82.m32737maxOrNull((Iterable<Double>) iterable);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(Iterable<? extends T> iterable, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            R rInvoke = qy6Var.invoke(next);
            do {
                T next2 = it.next();
                R rInvoke2 = qy6Var.invoke(next2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    next = next2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return (T) next;
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object maxWith(Iterable iterable, Comparator comparator) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return v82.maxWithOrNull(iterable, comparator);
    }

    @jjf(version = "1.1")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Double m32291min(Iterable iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return v82.m32745minOrNull((Iterable<Double>) iterable);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(Iterable<? extends T> iterable, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            R rInvoke = qy6Var.invoke(next);
            do {
                T next2 = it.next();
                R rInvoke2 = qy6Var.invoke(next2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    next = next2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return (T) next;
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object minWith(Iterable iterable, Comparator comparator) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return v82.minWithOrNull(iterable, comparator);
    }

    public static <T> void reverse(@yfb List<T> list) {
        md8.checkNotNullParameter(list, "<this>");
        Collections.reverse(list);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    private static final <T> BigDecimal sumOfBigDecimal(Iterable<? extends T> iterable, qy6<? super T, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(it.next()));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    private static final <T> BigInteger sumOfBigInteger(Iterable<? extends T> iterable, qy6<? super T, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(it.next()));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @yfb
    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return (SortedSet) v82.toCollection(iterable, new TreeSet());
    }

    @jjf(version = "1.1")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Float m32290max(Iterable iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return v82.m32738maxOrNull((Iterable<Float>) iterable);
    }

    @jjf(version = "1.1")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Float m32292min(Iterable iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return v82.m32746minOrNull((Iterable<Float>) iterable);
    }

    @yfb
    public static final <T> SortedSet<T> toSortedSet(@yfb Iterable<? extends T> iterable, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) v82.toCollection(iterable, new TreeSet(comparator));
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Comparable max(Iterable iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return v82.maxOrNull(iterable);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Comparable min(Iterable iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        return v82.minOrNull(iterable);
    }
}
