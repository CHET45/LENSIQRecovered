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
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2487:1\n130#1,2:2488\n221#1,5:2490\n507#1,5:2496\n507#1,5:2501\n467#1:2506\n1188#1,2:2507\n468#1,2:2509\n1190#1:2511\n470#1:2512\n467#1:2513\n1188#1,2:2514\n468#1,2:2516\n1190#1:2518\n470#1:2519\n1188#1,3:2520\n497#1,2:2523\n497#1,2:2525\n755#1,4:2527\n724#1,4:2531\n740#1,4:2535\n787#1,4:2539\n887#1,5:2543\n928#1,3:2548\n931#1,3:2558\n946#1,3:2561\n949#1,3:2571\n1046#1,3:2588\n1016#1,4:2591\n1005#1:2595\n1188#1,2:2596\n1190#1:2599\n1006#1:2600\n1188#1,3:2601\n1037#1:2604\n1179#1:2605\n1180#1:2607\n1038#1:2608\n1179#1,2:2609\n1188#1,3:2611\n1985#1,2:2614\n1987#1,6:2617\n2009#1,2:2623\n2011#1,6:2626\n2432#1,6:2632\n2462#1,7:2638\n1#2:2495\n1#2:2598\n1#2:2606\n1#2:2616\n1#2:2625\n381#3,7:2551\n381#3,7:2564\n381#3,7:2574\n381#3,7:2581\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n56#1:2488,2\n66#1:2490,5\n425#1:2496,5\n434#1:2501,5\n445#1:2506\n445#1:2507,2\n445#1:2509,2\n445#1:2511\n445#1:2512\n456#1:2513\n456#1:2514,2\n456#1:2516,2\n456#1:2518\n456#1:2519\n467#1:2520,3\n479#1:2523,2\n488#1:2525,2\n682#1:2527,4\n697#1:2531,4\n711#1:2535,4\n774#1:2539,4\n847#1:2543,5\n903#1:2548,3\n903#1:2558,3\n916#1:2561,3\n916#1:2571,3\n975#1:2588,3\n985#1:2591,4\n995#1:2595\n995#1:2596,2\n995#1:2599\n995#1:2600\n1005#1:2601,3\n1029#1:2604\n1029#1:2605\n1029#1:2607\n1029#1:2608\n1037#1:2609,2\n1791#1:2611,3\n2079#1:2614,2\n2079#1:2617,6\n2096#1:2623,2\n2096#1:2626,6\n2421#1:2632,6\n2449#1:2638,7\n995#1:2598\n1029#1:2606\n2079#1:2616\n2096#1:2625\n903#1:2551,7\n916#1:2564,7\n930#1:2574,7\n948#1:2581,7\n*E\n"})
public class t9g extends n9g {

    /* JADX INFO: renamed from: t9g$a */
    @dwf({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,17:1\n2476#2:18\n*E\n"})
    public static final class C12960a implements Iterable<Character>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CharSequence f84057a;

        public C12960a(CharSequence charSequence) {
            this.f84057a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return m9g.iterator(this.f84057a);
        }
    }

    /* JADX INFO: renamed from: t9g$b */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,22:1\n2484#2:23\n*E\n"})
    public static final class C12961b implements vye<Character> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CharSequence f84058a;

        public C12961b(CharSequence charSequence) {
            this.f84058a = charSequence;
        }

        @Override // p000.vye
        public Iterator<Character> iterator() {
            return m9g.iterator(this.f84058a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K] */
    /* JADX INFO: renamed from: t9g$c */
    public static final class C12962c<K> implements wb7<Character, K> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CharSequence f84059a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<Character, K> f84060b;

        /* JADX WARN: Multi-variable type inference failed */
        public C12962c(CharSequence charSequence, qy6<? super Character, ? extends K> qy6Var) {
            this.f84059a = charSequence;
            this.f84060b = qy6Var;
        }

        @Override // p000.wb7
        public /* bridge */ /* synthetic */ Object keyOf(Character ch) {
            return keyOf(ch.charValue());
        }

        @Override // p000.wb7
        public Iterator<Character> sourceIterator() {
            return m9g.iterator(this.f84059a);
        }

        public K keyOf(char c) {
            return this.f84060b.invoke(Character.valueOf(c));
        }
    }

    public static final boolean all(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    @yfb
    public static final Iterable<Character> asIterable(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? l82.emptyList() : new C12960a(charSequence);
    }

    @yfb
    public static final vye<Character> asSequence(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? ize.emptySequence() : new C12961b(charSequence);
    }

    @yfb
    public static final <K, V> Map<K, V> associate(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
            linkedHashMap.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K> Map<K, Character> associateBy(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends K> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            linkedHashMap.put(qy6Var.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@yfb CharSequence charSequence, @yfb M m, @yfb qy6<? super Character, ? extends K> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            m.put(qy6Var.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return m;
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@yfb CharSequence charSequence, @yfb M m, @yfb qy6<? super Character, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
            m.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return m;
    }

    @jjf(version = "1.3")
    @yfb
    public static final <V> Map<Character, V> associateWith(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends V> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(kpd.coerceAtMost(charSequence.length(), 128)), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            linkedHashMap.put(Character.valueOf(cCharAt), qy6Var.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.3")
    @yfb
    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(@yfb CharSequence charSequence, @yfb M m, @yfb qy6<? super Character, ? extends V> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            m.put(Character.valueOf(cCharAt), qy6Var.invoke(Character.valueOf(cCharAt)));
        }
        return m;
    }

    @jjf(version = "1.2")
    @yfb
    public static List<String> chunked(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i, i, true);
    }

    @jjf(version = "1.2")
    @yfb
    public static final vye<String> chunkedSequence(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return chunkedSequence(charSequence, i, new qy6() { // from class: q9g
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return t9g.chunkedSequence$lambda$22$StringsKt___StringsKt((CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String chunkedSequence$lambda$22$StringsKt___StringsKt(CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "it");
        return charSequence.toString();
    }

    @t28
    private static final int count(CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length();
    }

    @yfb
    public static final CharSequence drop(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            return charSequence.subSequence(kpd.coerceAtMost(i, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final CharSequence dropLast(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            return take(charSequence, kpd.coerceAtLeast(charSequence.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final CharSequence dropLastWhile(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = m9g.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                return charSequence.subSequence(0, lastIndex + 1);
            }
        }
        return "";
    }

    @yfb
    public static final CharSequence dropWhile(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @t28
    private static final char elementAtOrElse(CharSequence charSequence, int i, qy6<? super Integer, Character> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= charSequence.length()) ? qy6Var.invoke(Integer.valueOf(i)).charValue() : charSequence.charAt(i);
    }

    @t28
    private static final Character elementAtOrNull(CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return getOrNull(charSequence, i);
    }

    @yfb
    public static final CharSequence filter(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) throws IOException {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    @yfb
    public static final CharSequence filterIndexed(@yfb CharSequence charSequence, @yfb gz6<? super Integer, ? super Character, Boolean> gz6Var) throws IOException {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "predicate");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i++;
            i2 = i3;
        }
        return sb;
    }

    @yfb
    public static final <C extends Appendable> C filterIndexedTo(@yfb CharSequence charSequence, @yfb C c, @yfb gz6<? super Integer, ? super Character, Boolean> gz6Var) throws IOException {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)).booleanValue()) {
                c.append(cCharAt);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @yfb
    public static final CharSequence filterNot(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) throws IOException {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    @yfb
    public static final <C extends Appendable> C filterNotTo(@yfb CharSequence charSequence, @yfb C c, @yfb qy6<? super Character, Boolean> qy6Var) throws IOException {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                c.append(cCharAt);
            }
        }
        return c;
    }

    @yfb
    public static final <C extends Appendable> C filterTo(@yfb CharSequence charSequence, @yfb C c, @yfb qy6<? super Character, Boolean> qy6Var) throws IOException {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                c.append(cCharAt);
            }
        }
        return c;
    }

    @t28
    private static final Character find(CharSequence charSequence, qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @t28
    private static final Character findLast(CharSequence charSequence, qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    return Character.valueOf(cCharAt);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    public static final char first(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @jjf(version = "1.5")
    @t28
    private static final <R> R firstNotNullOf(CharSequence charSequence, qy6<? super Character, ? extends R> qy6Var) {
        R rInvoke;
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        int i = 0;
        while (true) {
            if (i >= charSequence.length()) {
                rInvoke = null;
                break;
            }
            rInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                break;
            }
            i++;
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @jjf(version = "1.5")
    @t28
    private static final <R> R firstNotNullOfOrNull(CharSequence charSequence, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            R rInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @gib
    public static final Character firstOrNull(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @yfb
    public static final <R> List<R> flatMap(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            q82.addAll(arrayList, qy6Var.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(CharSequence charSequence, gz6<? super Integer, ? super Character, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            q82.addAll(arrayList, gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(CharSequence charSequence, C c, gz6<? super Integer, ? super Character, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C flatMapTo(@yfb CharSequence charSequence, @yfb C c, @yfb qy6<? super Character, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            q82.addAll(c, qy6Var.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return c;
    }

    public static final <R> R fold(@yfb CharSequence charSequence, R r, @yfb gz6<? super R, ? super Character, ? extends R> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int i = 0; i < charSequence.length(); i++) {
            r = gz6Var.invoke(r, Character.valueOf(charSequence.charAt(i)));
        }
        return r;
    }

    public static final <R> R foldIndexed(@yfb CharSequence charSequence, R r, @yfb kz6<? super Integer, ? super R, ? super Character, ? extends R> kz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, Character.valueOf(charSequence.charAt(i)));
            i++;
            i2++;
        }
        return r;
    }

    public static final <R> R foldRight(@yfb CharSequence charSequence, R r, @yfb gz6<? super Character, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        for (int lastIndex = m9g.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r = gz6Var.invoke(Character.valueOf(charSequence.charAt(lastIndex)), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@yfb CharSequence charSequence, R r, @yfb kz6<? super Integer, ? super Character, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        for (int lastIndex = m9g.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r = kz6Var.invoke(Integer.valueOf(lastIndex), Character.valueOf(charSequence.charAt(lastIndex)), r);
        }
        return r;
    }

    public static final void forEach(@yfb CharSequence charSequence, @yfb qy6<? super Character, bth> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (int i = 0; i < charSequence.length(); i++) {
            qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
        }
    }

    public static final void forEachIndexed(@yfb CharSequence charSequence, @yfb gz6<? super Integer, ? super Character, bth> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            i++;
            i2++;
        }
    }

    @t28
    private static final char getOrElse(CharSequence charSequence, int i, qy6<? super Integer, Character> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= charSequence.length()) ? qy6Var.invoke(Integer.valueOf(i)).charValue() : charSequence.charAt(i);
    }

    @gib
    public static final Character getOrNull(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    @yfb
    public static final <K> Map<K, List<Character>> groupBy(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends K> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            K kInvoke = qy6Var.invoke(Character.valueOf(cCharAt));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @yfb
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@yfb CharSequence charSequence, @yfb M m, @yfb qy6<? super Character, ? extends K> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            K kInvoke = qy6Var.invoke(Character.valueOf(cCharAt));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return m;
    }

    @jjf(version = "1.1")
    @yfb
    public static final <K> wb7<Character, K> groupingBy(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends K> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        return new C12962c(charSequence, qy6Var);
    }

    public static final int indexOfFirst(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (qy6Var.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static char last(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(m9g.getLastIndex(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @gib
    public static final Character lastOrNull(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    @yfb
    public static final <R> List<R> map(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            arrayList.add(qy6Var.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<R> mapIndexed(@yfb CharSequence charSequence, @yfb gz6<? super Integer, ? super Character, ? extends R> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @yfb
    public static final <R> List<R> mapIndexedNotNull(@yfb CharSequence charSequence, @yfb gz6<? super Integer, ? super Character, ? extends R> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            R rInvoke = gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(@yfb CharSequence charSequence, @yfb C c, @yfb gz6<? super Integer, ? super Character, ? extends R> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            R rInvoke = gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                c.add(rInvoke);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@yfb CharSequence charSequence, @yfb C c, @yfb gz6<? super Integer, ? super Character, ? extends R> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            c.add(gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return c;
    }

    @yfb
    public static final <R> List<R> mapNotNull(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            R rInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapNotNullTo(@yfb CharSequence charSequence, @yfb C c, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            R rInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                c.add(rInvoke);
            }
        }
        return c;
    }

    @yfb
    public static final <R, C extends Collection<? super R>> C mapTo(@yfb CharSequence charSequence, @yfb C c, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            c.add(qy6Var.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return c;
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Character maxByOrNull(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(cCharAt));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke2 = qy6Var.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char maxByOrThrow(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return cCharAt;
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(cCharAt));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke2 = qy6Var.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double maxOf(CharSequence charSequence, qy6<? super Character, Double> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m32385maxOfOrNull(CharSequence charSequence, qy6<? super Character, Double> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R maxOfWith(CharSequence charSequence, Comparator<? super R> comparator, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R maxOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @gib
    @jjf(version = "1.4")
    public static final Character maxOrNull(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (md8.compare((int) cCharAt, (int) cCharAt2) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    public static final char maxOrThrow(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (md8.compare((int) cCharAt, (int) cCharAt2) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    @gib
    @jjf(version = "1.4")
    public static final Character maxWithOrNull(@yfb CharSequence charSequence, @yfb Comparator<? super Character> comparator) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow")
    public static final char maxWithOrThrow(@yfb CharSequence charSequence, @yfb Comparator<? super Character> comparator) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    @gib
    @jjf(version = "1.4")
    public static final <R extends Comparable<? super R>> Character minByOrNull(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(cCharAt));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke2 = qy6Var.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @jjf(version = "1.7")
    @xn8(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char minByOrThrow(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return cCharAt;
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(cCharAt));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke2 = qy6Var.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final double minOf(CharSequence charSequence, qy6<? super Character, Double> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m32389minOfOrNull(CharSequence charSequence, qy6<? super Character, Double> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R minOfWith(CharSequence charSequence, Comparator<? super R> comparator, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R> R minOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @gib
    @jjf(version = "1.4")
    public static final Character minOrNull(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (md8.compare((int) cCharAt, (int) cCharAt2) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    public static final char minOrThrow(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (md8.compare((int) cCharAt, (int) cCharAt2) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    @gib
    @jjf(version = "1.4")
    public static final Character minWithOrNull(@yfb CharSequence charSequence, @yfb Comparator<? super Character> comparator) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow")
    public static final char minWithOrThrow(@yfb CharSequence charSequence, @yfb Comparator<? super Character> comparator) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    public static final boolean none(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @jjf(version = "1.1")
    @yfb
    public static final <S extends CharSequence> S onEach(@yfb S s, @yfb qy6<? super Character, bth> qy6Var) {
        md8.checkNotNullParameter(s, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        for (int i = 0; i < s.length(); i++) {
            qy6Var.invoke(Character.valueOf(s.charAt(i)));
        }
        return s;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <S extends CharSequence> S onEachIndexed(@yfb S s, @yfb gz6<? super Integer, ? super Character, bth> gz6Var) {
        md8.checkNotNullParameter(s, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int i = 0;
        int i2 = 0;
        while (i < s.length()) {
            gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(s.charAt(i)));
            i++;
            i2++;
        }
        return s;
    }

    @yfb
    public static final scc<CharSequence, CharSequence> partition(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        return new scc<>(sb, sb2);
    }

    @jjf(version = "1.3")
    @t28
    private static final char random(CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return random(charSequence, tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final Character randomOrNull(CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return randomOrNull(charSequence, tod.f85517a);
    }

    public static final char reduce(@yfb CharSequence charSequence, @yfb gz6<? super Character, ? super Character, Character> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharAt = gz6Var.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    public static final char reduceIndexed(@yfb CharSequence charSequence, @yfb kz6<? super Integer, ? super Character, ? super Character, Character> kz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharAt = kz6Var.invoke(Integer.valueOf(i), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    @gib
    @jjf(version = "1.4")
    public static final Character reduceIndexedOrNull(@yfb CharSequence charSequence, @yfb kz6<? super Integer, ? super Character, ? super Character, Character> kz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharAt = kz6Var.invoke(Integer.valueOf(i), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @gib
    @jjf(version = "1.4")
    public static final Character reduceOrNull(@yfb CharSequence charSequence, @yfb gz6<? super Character, ? super Character, Character> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharAt = gz6Var.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final char reduceRight(@yfb CharSequence charSequence, @yfb gz6<? super Character, ? super Character, Character> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = m9g.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharAt = gz6Var.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    public static final char reduceRightIndexed(@yfb CharSequence charSequence, @yfb kz6<? super Integer, ? super Character, ? super Character, Character> kz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = m9g.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharAt = kz6Var.invoke(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    @gib
    @jjf(version = "1.4")
    public static final Character reduceRightIndexedOrNull(@yfb CharSequence charSequence, @yfb kz6<? super Integer, ? super Character, ? super Character, Character> kz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int lastIndex = m9g.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharAt = kz6Var.invoke(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @gib
    @jjf(version = "1.4")
    public static final Character reduceRightOrNull(@yfb CharSequence charSequence, @yfb gz6<? super Character, ? super Character, Character> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        int lastIndex = m9g.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharAt = gz6Var.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @yfb
    public static final CharSequence reversed(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    @jjf(version = "1.4")
    @yfb
    public static final <R> List<R> runningFold(@yfb CharSequence charSequence, R r, @yfb gz6<? super R, ? super Character, ? extends R> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (charSequence.length() == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        for (int i = 0; i < charSequence.length(); i++) {
            r = gz6Var.invoke(r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <R> List<R> runningFoldIndexed(@yfb CharSequence charSequence, R r, @yfb kz6<? super Integer, ? super R, ? super Character, ? extends R> kz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (charSequence.length() == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @yfb
    public static final List<Character> runningReduce(@yfb CharSequence charSequence, @yfb gz6<? super Character, ? super Character, Character> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (charSequence.length() == 0) {
            return l82.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i = 1;
        while (i < length) {
            Character chInvoke = gz6Var.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i)));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @yfb
    public static final List<Character> runningReduceIndexed(@yfb CharSequence charSequence, @yfb kz6<? super Integer, ? super Character, ? super Character, Character> kz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (charSequence.length() == 0) {
            return l82.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i = 1;
        while (i < length) {
            Character chInvoke = kz6Var.invoke(Integer.valueOf(i), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i)));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <R> List<R> scan(@yfb CharSequence charSequence, R r, @yfb gz6<? super R, ? super Character, ? extends R> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        if (charSequence.length() == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        for (int i = 0; i < charSequence.length(); i++) {
            r = gz6Var.invoke(r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <R> List<R> scanIndexed(@yfb CharSequence charSequence, R r, @yfb kz6<? super Integer, ? super R, ? super Character, ? extends R> kz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        if (charSequence.length() == 0) {
            return k82.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            r = kz6Var.invoke(Integer.valueOf(i), r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    public static char single(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    @gib
    public static final Character singleOrNull(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @yfb
    public static final CharSequence slice(@yfb CharSequence charSequence, @yfb f78 f78Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? "" : m9g.subSequence(charSequence, f78Var);
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final int sumBy(@yfb CharSequence charSequence, @yfb qy6<? super Character, Integer> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            iIntValue += qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).intValue();
        }
        return iIntValue;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final double sumByDouble(@yfb CharSequence charSequence, @yfb qy6<? super Character, Double> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (int i = 0; i < charSequence.length(); i++) {
            dDoubleValue += qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    private static final double sumOfDouble(CharSequence charSequence, qy6<? super Character, Double> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        double dDoubleValue = 0.0d;
        for (int i = 0; i < charSequence.length(); i++) {
            dDoubleValue += qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue();
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    private static final int sumOfInt(CharSequence charSequence, qy6<? super Character, Integer> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iIntValue = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            iIntValue += qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    private static final long sumOfLong(CharSequence charSequence, qy6<? super Character, Long> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jLongValue = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            jLongValue += qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).longValue();
        }
        return jLongValue;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    private static final int sumOfUInt(CharSequence charSequence, qy6<? super Character, woh> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        for (int i = 0; i < charSequence.length(); i++) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    private static final long sumOfULong(CharSequence charSequence, qy6<? super Character, oph> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        for (int i = 0; i < charSequence.length(); i++) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @yfb
    public static final CharSequence take(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            return charSequence.subSequence(0, kpd.coerceAtMost(i, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final CharSequence takeLast(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - kpd.coerceAtMost(i, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final CharSequence takeLastWhile(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = m9g.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                return charSequence.subSequence(lastIndex + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @yfb
    public static final CharSequence takeWhile(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @yfb
    public static <C extends Collection<? super Character>> C toCollection(@yfb CharSequence charSequence, @yfb C c) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (int i = 0; i < charSequence.length(); i++) {
            c.add(Character.valueOf(charSequence.charAt(i)));
        }
        return c;
    }

    @yfb
    public static final HashSet<Character> toHashSet(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return (HashSet) toCollection(charSequence, new HashSet(wt9.mapCapacity(kpd.coerceAtMost(charSequence.length(), 128))));
    }

    @yfb
    public static final List<Character> toList(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? toMutableList(charSequence) : k82.listOf(Character.valueOf(charSequence.charAt(0))) : l82.emptyList();
    }

    @yfb
    public static final List<Character> toMutableList(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return (List) toCollection(charSequence, new ArrayList(charSequence.length()));
    }

    @yfb
    public static final Set<Character> toSet(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? (Set) toCollection(charSequence, new LinkedHashSet(wt9.mapCapacity(kpd.coerceAtMost(charSequence.length(), 128)))) : v6f.setOf(Character.valueOf(charSequence.charAt(0))) : w6f.emptySet();
    }

    @jjf(version = "1.2")
    @yfb
    public static final List<String> windowed(@yfb CharSequence charSequence, int i, int i2, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i, i2, z, new qy6() { // from class: o9g
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return t9g.windowed$lambda$23$StringsKt___StringsKt((CharSequence) obj);
            }
        });
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowed(charSequence, i, i2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String windowed$lambda$23$StringsKt___StringsKt(CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "it");
        return charSequence.toString();
    }

    @jjf(version = "1.2")
    @yfb
    public static final vye<String> windowedSequence(@yfb CharSequence charSequence, int i, int i2, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return windowedSequence(charSequence, i, i2, z, new qy6() { // from class: p9g
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return t9g.windowedSequence$lambda$24$StringsKt___StringsKt((CharSequence) obj);
            }
        });
    }

    public static /* synthetic */ vye windowedSequence$default(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowedSequence(charSequence, i, i2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String windowedSequence$lambda$24$StringsKt___StringsKt(CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "it");
        return charSequence.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object windowedSequence$lambda$25$StringsKt___StringsKt(int i, CharSequence charSequence, qy6 qy6Var, int i2) {
        int length = i + i2;
        if (length < 0 || length > charSequence.length()) {
            length = charSequence.length();
        }
        return qy6Var.invoke(charSequence.subSequence(i2, length));
    }

    @yfb
    public static final Iterable<q08<Character>> withIndex(@yfb final CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return new r08(new ny6() { // from class: r9g
            @Override // p000.ny6
            public final Object invoke() {
                return m9g.iterator(charSequence);
            }
        });
    }

    @yfb
    public static final <V> List<V> zip(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb gz6<? super Character, ? super Character, ? extends V> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
        }
        return arrayList;
    }

    @jjf(version = "1.2")
    @yfb
    public static final <R> List<R> zipWithNext(@yfb CharSequence charSequence, @yfb gz6<? super Character, ? super Character, ? extends R> gz6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i));
            i++;
            arrayList.add(gz6Var.invoke(chValueOf, Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    public static final boolean any(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @jjf(version = "1.2")
    @yfb
    public static final <R> List<R> chunked(@yfb CharSequence charSequence, int i, @yfb qy6<? super CharSequence, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        return windowed(charSequence, i, i, true, qy6Var);
    }

    @jjf(version = "1.2")
    @yfb
    public static final <R> vye<R> chunkedSequence(@yfb CharSequence charSequence, int i, @yfb qy6<? super CharSequence, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        return windowedSequence(charSequence, i, i, true, qy6Var);
    }

    public static final int count(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (qy6Var.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @gib
    public static final Character firstOrNull(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @gib
    public static final Character lastOrNull(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            char cCharAt = charSequence.charAt(length);
            if (qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    public static final boolean none(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @jjf(version = "1.3")
    public static char random(@yfb CharSequence charSequence, @yfb tod todVar) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(todVar.nextInt(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @gib
    @jjf(version = "1.4")
    public static final Character randomOrNull(@yfb CharSequence charSequence, @yfb tod todVar) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(todVar.nextInt(charSequence.length())));
    }

    @t28
    private static final String reversed(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return reversed((CharSequence) str).toString();
    }

    @gib
    public static final Character singleOrNull(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Character chValueOf = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z) {
                    return null;
                }
                chValueOf = Character.valueOf(cCharAt);
                z = true;
            }
        }
        if (z) {
            return chValueOf;
        }
        return null;
    }

    @jjf(version = "1.2")
    @yfb
    public static final <R> List<R> windowed(@yfb CharSequence charSequence, int i, int i2, boolean z, @yfb qy6<? super CharSequence, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        krf.checkWindowSizeStep(i, i2);
        int length = charSequence.length();
        int i3 = 0;
        ArrayList arrayList = new ArrayList((length / i2) + (length % i2 == 0 ? 0 : 1));
        while (i3 >= 0 && i3 < length) {
            int i4 = i3 + i;
            if (i4 < 0 || i4 > length) {
                if (!z) {
                    break;
                }
                i4 = length;
            }
            arrayList.add(qy6Var.invoke(charSequence.subSequence(i3, i4)));
            i3 += i2;
        }
        return arrayList;
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i, int i2, boolean z, qy6 qy6Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowed(charSequence, i, i2, z, qy6Var);
    }

    @jjf(version = "1.2")
    @yfb
    public static final <R> vye<R> windowedSequence(@yfb final CharSequence charSequence, final int i, int i2, boolean z, @yfb final qy6<? super CharSequence, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        krf.checkWindowSizeStep(i, i2);
        return vze.map(v82.asSequence(kpd.step(z ? m9g.getIndices(charSequence) : kpd.until(0, (charSequence.length() - i) + 1), i2)), new qy6() { // from class: s9g
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return t9g.windowedSequence$lambda$25$StringsKt___StringsKt(i, charSequence, qy6Var, ((Integer) obj).intValue());
            }
        });
    }

    public static /* synthetic */ vye windowedSequence$default(CharSequence charSequence, int i, int i2, boolean z, qy6 qy6Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowedSequence(charSequence, i, i2, z, qy6Var);
    }

    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@yfb CharSequence charSequence, @yfb M m, @yfb qy6<? super Character, ? extends K> qy6Var, @yfb qy6<? super Character, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            m.put(qy6Var.invoke(Character.valueOf(cCharAt)), qy6Var2.invoke(Character.valueOf(cCharAt)));
        }
        return m;
    }

    @yfb
    public static String drop(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            String strSubstring = str.substring(kpd.coerceAtMost(i, str.length()));
            md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @yfb
    public static String dropLast(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            return take(str, kpd.coerceAtLeast(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final String filterNot(@yfb String str, @yfb qy6<? super Character, Boolean> qy6Var) throws IOException {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    @yfb
    public static final String slice(@yfb String str, @yfb f78 f78Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(f78Var, "indices");
        return f78Var.isEmpty() ? "" : m9g.substring(str, f78Var);
    }

    @yfb
    public static String take(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            String strSubstring = str.substring(0, kpd.coerceAtMost(i, str.length()));
            md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final String filterIndexed(@yfb String str, @yfb gz6<? super Integer, ? super Character, Boolean> gz6Var) throws IOException {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(gz6Var, "predicate");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (gz6Var.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i++;
            i2 = i3;
        }
        return sb.toString();
    }

    public static final char first(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return cCharAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final char last(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (!qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return cCharAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @yfb
    public static final String takeLast(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - kpd.coerceAtMost(i, length));
            md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final List<scc<Character, Character>> zip(@yfb CharSequence charSequence, @yfb CharSequence charSequence2) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "other");
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vkh.m24050to(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
        }
        return arrayList;
    }

    @yfb
    public static final <K, V> Map<K, V> associateBy(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends K> qy6Var, @yfb qy6<? super Character, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            linkedHashMap.put(qy6Var.invoke(Character.valueOf(cCharAt)), qy6Var2.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @yfb
    public static final String dropLastWhile(@yfb String str, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = m9g.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String strSubstring = str.substring(0, lastIndex + 1);
                md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    @yfb
    public static final String dropWhile(@yfb String str, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!qy6Var.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                String strSubstring = str.substring(i);
                md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    @yfb
    public static final String filter(@yfb String str, @yfb qy6<? super Character, Boolean> qy6Var) throws IOException {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static final char single(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Character chValueOf = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (!z) {
                    chValueOf = Character.valueOf(cCharAt);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (z) {
            md8.checkNotNull(chValueOf, "null cannot be cast to non-null type kotlin.Char");
            return chValueOf.charValue();
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @yfb
    public static final CharSequence slice(@yfb CharSequence charSequence, @yfb Iterable<Integer> iterable) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(iterable, "indices");
        int iCollectionSizeOrDefault = m82.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(charSequence.charAt(it.next().intValue()));
        }
        return sb;
    }

    @yfb
    public static final String takeLastWhile(@yfb String str, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (int lastIndex = m9g.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!qy6Var.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String strSubstring = str.substring(lastIndex + 1);
                md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    @yfb
    public static final String takeWhile(@yfb String str, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!qy6Var.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                String strSubstring = str.substring(0, i);
                md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    @jjf(version = "1.2")
    @yfb
    public static final List<scc<Character, Character>> zipWithNext(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            i++;
            arrayList.add(vkh.m24050to(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m32383maxOf(CharSequence charSequence, qy6<? super Character, Float> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() != 0) {
            float fFloatValue = qy6Var.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
            int lastIndex = m9g.getLastIndex(charSequence);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m32386maxOfOrNull(CharSequence charSequence, qy6<? super Character, Float> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m32387minOf(CharSequence charSequence, qy6<? super Character, Float> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() != 0) {
            float fFloatValue = qy6Var.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
            int lastIndex = m9g.getLastIndex(charSequence);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m32390minOfOrNull(CharSequence charSequence, qy6<? super Character, Float> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@yfb CharSequence charSequence, @yfb M m, @yfb qy6<? super Character, ? extends K> qy6Var, @yfb qy6<? super Character, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            K kInvoke = qy6Var.invoke(Character.valueOf(cCharAt));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(Character.valueOf(cCharAt)));
        }
        return m;
    }

    @yfb
    public static final scc<String, String> partition(@yfb String str, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (qy6Var.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        return new scc<>(sb.toString(), sb2.toString());
    }

    @yfb
    public static final <K, V> Map<K, List<V>> groupBy(@yfb CharSequence charSequence, @yfb qy6<? super Character, ? extends K> qy6Var, @yfb qy6<? super Character, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            K kInvoke = qy6Var.invoke(Character.valueOf(cCharAt));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @t28
    private static final String slice(String str, Iterable<Integer> iterable) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(iterable, "indices");
        return slice((CharSequence) str, iterable).toString();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m32384maxOf(CharSequence charSequence, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() != 0) {
            R rInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(0)));
            int lastIndex = m9g.getLastIndex(charSequence);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R extends Comparable<? super R>> R maxOfOrNull(CharSequence charSequence, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m32388minOf(CharSequence charSequence, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() != 0) {
            R rInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(0)));
            int lastIndex = m9g.getLastIndex(charSequence);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <R extends Comparable<? super R>> R minOfOrNull(CharSequence charSequence, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = m9g.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(Character.valueOf(charSequence.charAt(i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }
}
