package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1437#2,14:173\n1843#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"})
public class kze extends ize {
    @yfb
    public static final <R> vye<R> filterIsInstance(@yfb vye<?> vyeVar, @yfb final Class<R> cls) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(cls, "klass");
        vye<R> vyeVarFilter = vze.filter(vyeVar, new qy6() { // from class: jze
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return Boolean.valueOf(cls.isInstance(obj));
            }
        });
        md8.checkNotNull(vyeVarFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return vyeVarFilter;
    }

    @yfb
    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@yfb vye<?> vyeVar, @yfb C c, @yfb Class<R> cls) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(cls, "klass");
        for (Object obj : vyeVar) {
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
    public static final /* synthetic */ Double m30798max(vye vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return vze.m32829maxOrNull((vye<Double>) vyeVar);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(vye<? extends T> vyeVar, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
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
    public static final /* synthetic */ Object maxWith(vye vyeVar, Comparator comparator) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return vze.maxWithOrNull(vyeVar, comparator);
    }

    @jjf(version = "1.1")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Double m30800min(vye vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return vze.m32837minOrNull((vye<Double>) vyeVar);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(vye<? extends T> vyeVar, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
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
    public static final /* synthetic */ Object minWith(vye vyeVar, Comparator comparator) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return vze.minWithOrNull(vyeVar, comparator);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    private static final <T> BigDecimal sumOfBigDecimal(vye<? extends T> vyeVar, qy6<? super T, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator<? extends T> it = vyeVar.iterator();
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
    private static final <T> BigInteger sumOfBigInteger(vye<? extends T> vyeVar, qy6<? super T, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(it.next()));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @yfb
    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return (SortedSet) vze.toCollection(vyeVar, new TreeSet());
    }

    @jjf(version = "1.1")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Float m30799max(vye vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return vze.m32830maxOrNull((vye<Float>) vyeVar);
    }

    @jjf(version = "1.1")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Float m30801min(vye vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return vze.m32838minOrNull((vye<Float>) vyeVar);
    }

    @yfb
    public static final <T> SortedSet<T> toSortedSet(@yfb vye<? extends T> vyeVar, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) vze.toCollection(vyeVar, new TreeSet(comparator));
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Comparable max(vye vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return vze.maxOrNull(vyeVar);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Comparable min(vye vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return vze.minOrNull(vyeVar);
    }
}
