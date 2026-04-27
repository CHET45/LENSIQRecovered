package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public class md2 {

    /* JADX INFO: renamed from: md2$a */
    public static final class C9296a<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<T, Comparable<?>> f60625a;

        /* JADX WARN: Multi-variable type inference failed */
        public C9296a(qy6<? super T, ? extends Comparable<?>> qy6Var) {
            this.f60625a = qy6Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            qy6<T, Comparable<?>> qy6Var = this.f60625a;
            return md2.compareValues(qy6Var.invoke(t), qy6Var.invoke(t2));
        }
    }

    /* JADX INFO: renamed from: md2$b */
    public static final class C9297b<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparator<? super K> f60626a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<T, K> f60627b;

        /* JADX WARN: Multi-variable type inference failed */
        public C9297b(Comparator<? super K> comparator, qy6<? super T, ? extends K> qy6Var) {
            this.f60626a = comparator;
            this.f60627b = qy6Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.f60626a;
            qy6<T, K> qy6Var = this.f60627b;
            return comparator.compare((Object) qy6Var.invoke(t), (Object) qy6Var.invoke(t2));
        }
    }

    /* JADX INFO: renamed from: md2$c */
    public static final class C9298c<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<T, Comparable<?>> f60628a;

        /* JADX WARN: Multi-variable type inference failed */
        public C9298c(qy6<? super T, ? extends Comparable<?>> qy6Var) {
            this.f60628a = qy6Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            qy6<T, Comparable<?>> qy6Var = this.f60628a;
            return md2.compareValues(qy6Var.invoke(t2), qy6Var.invoke(t));
        }
    }

    /* JADX INFO: renamed from: md2$d */
    public static final class C9299d<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparator<? super K> f60629a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<T, K> f60630b;

        /* JADX WARN: Multi-variable type inference failed */
        public C9299d(Comparator<? super K> comparator, qy6<? super T, ? extends K> qy6Var) {
            this.f60629a = comparator;
            this.f60630b = qy6Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.f60629a;
            qy6<T, K> qy6Var = this.f60630b;
            return comparator.compare((Object) qy6Var.invoke(t2), (Object) qy6Var.invoke(t));
        }
    }

    /* JADX INFO: renamed from: md2$e */
    public static final class C9300e<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparator<T> f60631a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<T, Comparable<?>> f60632b;

        /* JADX WARN: Multi-variable type inference failed */
        public C9300e(Comparator<T> comparator, qy6<? super T, ? extends Comparable<?>> qy6Var) {
            this.f60631a = comparator;
            this.f60632b = qy6Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f60631a.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            qy6<T, Comparable<?>> qy6Var = this.f60632b;
            return md2.compareValues(qy6Var.invoke(t), qy6Var.invoke(t2));
        }
    }

    /* JADX INFO: renamed from: md2$f */
    public static final class C9301f<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparator<T> f60633a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Comparator<? super K> f60634b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<T, K> f60635c;

        /* JADX WARN: Multi-variable type inference failed */
        public C9301f(Comparator<T> comparator, Comparator<? super K> comparator2, qy6<? super T, ? extends K> qy6Var) {
            this.f60633a = comparator;
            this.f60634b = comparator2;
            this.f60635c = qy6Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f60633a.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f60634b;
            qy6<T, K> qy6Var = this.f60635c;
            return comparator.compare((Object) qy6Var.invoke(t), (Object) qy6Var.invoke(t2));
        }
    }

    /* JADX INFO: renamed from: md2$g */
    public static final class C9302g<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparator<T> f60636a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<T, Comparable<?>> f60637b;

        /* JADX WARN: Multi-variable type inference failed */
        public C9302g(Comparator<T> comparator, qy6<? super T, ? extends Comparable<?>> qy6Var) {
            this.f60636a = comparator;
            this.f60637b = qy6Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f60636a.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            qy6<T, Comparable<?>> qy6Var = this.f60637b;
            return md2.compareValues(qy6Var.invoke(t2), qy6Var.invoke(t));
        }
    }

    /* JADX INFO: renamed from: md2$h */
    public static final class C9303h<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparator<T> f60638a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Comparator<? super K> f60639b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<T, K> f60640c;

        /* JADX WARN: Multi-variable type inference failed */
        public C9303h(Comparator<T> comparator, Comparator<? super K> comparator2, qy6<? super T, ? extends K> qy6Var) {
            this.f60638a = comparator;
            this.f60639b = comparator2;
            this.f60640c = qy6Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f60638a.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f60639b;
            qy6<T, K> qy6Var = this.f60640c;
            return comparator.compare((Object) qy6Var.invoke(t2), (Object) qy6Var.invoke(t));
        }
    }

    /* JADX INFO: renamed from: md2$i */
    public static final class C9304i<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparator<T> f60641a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<T, T, Integer> f60642b;

        /* JADX WARN: Multi-variable type inference failed */
        public C9304i(Comparator<T> comparator, gz6<? super T, ? super T, Integer> gz6Var) {
            this.f60641a = comparator;
            this.f60642b = gz6Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f60641a.compare(t, t2);
            return iCompare != 0 ? iCompare : this.f60642b.invoke(t, t2).intValue();
        }
    }

    @yfb
    public static <T> Comparator<T> compareBy(@yfb final qy6<? super T, ? extends Comparable<?>>... qy6VarArr) {
        md8.checkNotNullParameter(qy6VarArr, "selectors");
        if (qy6VarArr.length > 0) {
            return new Comparator() { // from class: kd2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return md2.compareBy$lambda$0$ComparisonsKt__ComparisonsKt(qy6VarArr, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int compareBy$lambda$0$ComparisonsKt__ComparisonsKt(qy6[] qy6VarArr, Object obj, Object obj2) {
        return compareValuesByImpl$ComparisonsKt__ComparisonsKt(obj, obj2, qy6VarArr);
    }

    @t28
    private static final <T> Comparator<T> compareByDescending(qy6<? super T, ? extends Comparable<?>> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "selector");
        return new C9298c(qy6Var);
    }

    public static <T extends Comparable<?>> int compareValues(@gib T t, @gib T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static <T> int compareValuesBy(T t, T t2, @yfb qy6<? super T, ? extends Comparable<?>>... qy6VarArr) {
        md8.checkNotNullParameter(qy6VarArr, "selectors");
        if (qy6VarArr.length > 0) {
            return compareValuesByImpl$ComparisonsKt__ComparisonsKt(t, t2, qy6VarArr);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T t, T t2, qy6<? super T, ? extends Comparable<?>>[] qy6VarArr) {
        for (qy6<? super T, ? extends Comparable<?>> qy6Var : qy6VarArr) {
            int iCompareValues = compareValues(qy6Var.invoke(t), qy6Var.invoke(t2));
            if (iCompareValues != 0) {
                return iCompareValues;
            }
        }
        return 0;
    }

    @yfb
    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        s9b s9bVar = s9b.f81013a;
        md8.checkNotNull(s9bVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return s9bVar;
    }

    @yfb
    public static final <T> Comparator<T> nullsFirst(@yfb final Comparator<? super T> comparator) {
        md8.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: ld2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return md2.nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(comparator, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @yfb
    public static final <T> Comparator<T> nullsLast(@yfb final Comparator<? super T> comparator) {
        md8.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: hd2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return md2.nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(comparator, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @yfb
    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        l9e l9eVar = l9e.f56918a;
        md8.checkNotNull(l9eVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return l9eVar;
    }

    @yfb
    public static final <T> Comparator<T> reversed(@yfb Comparator<T> comparator) {
        md8.checkNotNullParameter(comparator, "<this>");
        if (comparator instanceof n9e) {
            return ((n9e) comparator).getComparator();
        }
        Comparator<T> n9eVar = s9b.f81013a;
        if (md8.areEqual(comparator, n9eVar)) {
            l9e l9eVar = l9e.f56918a;
            md8.checkNotNull(l9eVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
            return l9eVar;
        }
        if (md8.areEqual(comparator, l9e.f56918a)) {
            md8.checkNotNull(n9eVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
        } else {
            n9eVar = new n9e<>(comparator);
        }
        return n9eVar;
    }

    @yfb
    public static final <T> Comparator<T> then(@yfb final Comparator<T> comparator, @yfb final Comparator<? super T> comparator2) {
        md8.checkNotNullParameter(comparator, "<this>");
        md8.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: jd2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return md2.then$lambda$1$ComparisonsKt__ComparisonsKt(comparator, comparator2, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int then$lambda$1$ComparisonsKt__ComparisonsKt(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
    }

    @t28
    private static final <T> Comparator<T> thenBy(Comparator<T> comparator, qy6<? super T, ? extends Comparable<?>> qy6Var) {
        md8.checkNotNullParameter(comparator, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return new C9300e(comparator, qy6Var);
    }

    @t28
    private static final <T> Comparator<T> thenByDescending(Comparator<T> comparator, qy6<? super T, ? extends Comparable<?>> qy6Var) {
        md8.checkNotNullParameter(comparator, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return new C9302g(comparator, qy6Var);
    }

    @t28
    private static final <T> Comparator<T> thenComparator(Comparator<T> comparator, gz6<? super T, ? super T, Integer> gz6Var) {
        md8.checkNotNullParameter(comparator, "<this>");
        md8.checkNotNullParameter(gz6Var, "comparison");
        return new C9304i(comparator, gz6Var);
    }

    @yfb
    public static final <T> Comparator<T> thenDescending(@yfb final Comparator<T> comparator, @yfb final Comparator<? super T> comparator2) {
        md8.checkNotNullParameter(comparator, "<this>");
        md8.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: id2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return md2.thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(comparator, comparator2, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj2, obj);
    }

    @t28
    private static final <T, K> Comparator<T> compareByDescending(Comparator<? super K> comparator, qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        return new C9299d(comparator, qy6Var);
    }

    @t28
    private static final <T extends Comparable<? super T>> Comparator<T> nullsFirst() {
        return nullsFirst(naturalOrder());
    }

    @t28
    private static final <T extends Comparable<? super T>> Comparator<T> nullsLast() {
        return nullsLast(naturalOrder());
    }

    @t28
    private static final <T, K> Comparator<T> thenBy(Comparator<T> comparator, Comparator<? super K> comparator2, qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(comparator, "<this>");
        md8.checkNotNullParameter(comparator2, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        return new C9301f(comparator, comparator2, qy6Var);
    }

    @t28
    private static final <T, K> Comparator<T> thenByDescending(Comparator<T> comparator, Comparator<? super K> comparator2, qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(comparator, "<this>");
        md8.checkNotNullParameter(comparator2, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        return new C9303h(comparator, comparator2, qy6Var);
    }

    @t28
    private static final <T> Comparator<T> compareBy(qy6<? super T, ? extends Comparable<?>> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "selector");
        return new C9296a(qy6Var);
    }

    @t28
    private static final <T> int compareValuesBy(T t, T t2, qy6<? super T, ? extends Comparable<?>> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "selector");
        return compareValues(qy6Var.invoke(t), qy6Var.invoke(t2));
    }

    @t28
    private static final <T, K> Comparator<T> compareBy(Comparator<? super K> comparator, qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        return new C9297b(comparator, qy6Var);
    }

    @t28
    private static final <T, K> int compareValuesBy(T t, T t2, Comparator<? super K> comparator, qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        return comparator.compare(qy6Var.invoke(t), qy6Var.invoke(t2));
    }
}
