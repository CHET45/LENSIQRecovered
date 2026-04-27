package p000;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class w6f extends v6f {
    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    @t28
    private static final <E> Set<E> buildSet(@cg1 qy6<? super Set<E>, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        Set setCreateSetBuilder = v6f.createSetBuilder();
        qy6Var.invoke(setCreateSetBuilder);
        return v6f.build(setCreateSetBuilder);
    }

    @yfb
    public static <T> Set<T> emptySet() {
        return u05.f86463a;
    }

    @jjf(version = "1.1")
    @t28
    private static final <T> HashSet<T> hashSetOf() {
        return new HashSet<>();
    }

    @jjf(version = "1.1")
    @t28
    private static final <T> LinkedHashSet<T> linkedSetOf() {
        return new LinkedHashSet<>();
    }

    @jjf(version = "1.1")
    @t28
    private static final <T> Set<T> mutableSetOf() {
        return new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T> Set<T> optimizeReadOnlySet(@yfb Set<? extends T> set) {
        md8.checkNotNullParameter(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : v6f.setOf(set.iterator().next()) : emptySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t28
    private static final <T> Set<T> orEmpty(Set<? extends T> set) {
        return set == 0 ? emptySet() : set;
    }

    @yfb
    public static <T> Set<T> setOf(@yfb T... tArr) {
        md8.checkNotNullParameter(tArr, "elements");
        return e80.toSet(tArr);
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T> Set<T> setOfNotNull(@gib T t) {
        return t != null ? v6f.setOf(t) : emptySet();
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    @t28
    private static final <E> Set<E> buildSet(int i, @cg1 qy6<? super Set<E>, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        Set setCreateSetBuilder = v6f.createSetBuilder(i);
        qy6Var.invoke(setCreateSetBuilder);
        return v6f.build(setCreateSetBuilder);
    }

    @yfb
    public static final <T> HashSet<T> hashSetOf(@yfb T... tArr) {
        md8.checkNotNullParameter(tArr, "elements");
        return (HashSet) e80.toCollection(tArr, new HashSet(wt9.mapCapacity(tArr.length)));
    }

    @yfb
    public static final <T> LinkedHashSet<T> linkedSetOf(@yfb T... tArr) {
        md8.checkNotNullParameter(tArr, "elements");
        return (LinkedHashSet) e80.toCollection(tArr, new LinkedHashSet(wt9.mapCapacity(tArr.length)));
    }

    @yfb
    public static <T> Set<T> mutableSetOf(@yfb T... tArr) {
        md8.checkNotNullParameter(tArr, "elements");
        return (Set) e80.toCollection(tArr, new LinkedHashSet(wt9.mapCapacity(tArr.length)));
    }

    @t28
    private static final <T> Set<T> setOf() {
        return emptySet();
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T> Set<T> setOfNotNull(@yfb T... tArr) {
        md8.checkNotNullParameter(tArr, "elements");
        return (Set) e80.filterNotNullTo(tArr, new LinkedHashSet());
    }
}
