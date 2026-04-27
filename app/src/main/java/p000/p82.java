package p000;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public class p82 extends o82 {
    @jjf(version = "1.2")
    @t28
    private static final <T> void fill(List<T> list, T t) {
        md8.checkNotNullParameter(list, "<this>");
        Collections.fill(list, t);
    }

    @jjf(version = "1.2")
    @t28
    private static final <T> void shuffle(List<T> list) {
        md8.checkNotNullParameter(list, "<this>");
        Collections.shuffle(list);
    }

    @t28
    @q64(level = u64.f86866b, message = "Use sortWith(comparator) instead.", replaceWith = @i2e(expression = "this.sortWith(comparator)", imports = {}))
    private static final <T> void sort(List<T> list, Comparator<? super T> comparator) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        throw new wfb(null, 1, null);
    }

    public static <T> void sortWith(@yfb List<T> list, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    @jjf(version = "1.2")
    @t28
    private static final <T> void shuffle(List<T> list, Random random) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(random, "random");
        Collections.shuffle(list, random);
    }

    @t28
    @q64(level = u64.f86866b, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @i2e(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    private static final <T> void sort(List<T> list, gz6<? super T, ? super T, Integer> gz6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(gz6Var, "comparison");
        throw new wfb(null, 1, null);
    }

    public static <T extends Comparable<? super T>> void sort(@yfb List<T> list) {
        md8.checkNotNullParameter(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
