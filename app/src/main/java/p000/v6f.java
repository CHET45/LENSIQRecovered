package p000;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
public class v6f {
    @jjf(version = "1.3")
    @yfb
    @yjd
    public static <E> Set<E> build(@yfb Set<E> set) {
        md8.checkNotNullParameter(set, "builder");
        return ((h6f) set).build();
    }

    @jjf(version = "1.3")
    @t28
    @yjd
    private static final <E> Set<E> buildSetInternal(qy6<? super Set<E>, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        Set setCreateSetBuilder = createSetBuilder();
        qy6Var.invoke(setCreateSetBuilder);
        return build(setCreateSetBuilder);
    }

    @jjf(version = "1.3")
    @yfb
    @yjd
    public static <E> Set<E> createSetBuilder() {
        return new h6f();
    }

    @yfb
    public static <T> Set<T> setOf(T t) {
        Set<T> setSingleton = Collections.singleton(t);
        md8.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }

    @yfb
    public static <T> TreeSet<T> sortedSetOf(@yfb T... tArr) {
        md8.checkNotNullParameter(tArr, "elements");
        return (TreeSet) e80.toCollection(tArr, new TreeSet());
    }

    @jjf(version = "1.3")
    @t28
    @yjd
    private static final <E> Set<E> buildSetInternal(int i, qy6<? super Set<E>, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        Set setCreateSetBuilder = createSetBuilder(i);
        qy6Var.invoke(setCreateSetBuilder);
        return build(setCreateSetBuilder);
    }

    @jjf(version = "1.3")
    @yfb
    @yjd
    public static <E> Set<E> createSetBuilder(int i) {
        return new h6f(i);
    }

    @yfb
    public static final <T> TreeSet<T> sortedSetOf(@yfb Comparator<? super T> comparator, @yfb T... tArr) {
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(tArr, "elements");
        return (TreeSet) e80.toCollection(tArr, new TreeSet(comparator));
    }
}
