package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public class od2 extends nd2 {
    @jjf(version = "1.1")
    public static final <T> T maxOf(T t, T t2, T t3, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(comparator, "comparator");
        return (T) maxOf(t, maxOf(t2, t3, comparator), comparator);
    }

    @jjf(version = "1.1")
    public static final <T> T minOf(T t, T t2, T t3, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(comparator, "comparator");
        return (T) minOf(t, minOf(t2, t3, comparator), comparator);
    }

    @jjf(version = "1.1")
    public static final <T> T maxOf(T t, T t2, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t, t2) >= 0 ? t : t2;
    }

    @jjf(version = "1.1")
    public static final <T> T minOf(T t, T t2, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t, t2) <= 0 ? t : t2;
    }

    @jjf(version = "1.4")
    public static final <T> T maxOf(T t, @yfb T[] tArr, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(tArr, "other");
        md8.checkNotNullParameter(comparator, "comparator");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    @jjf(version = "1.4")
    public static final <T> T minOf(T t, @yfb T[] tArr, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(tArr, "other");
        md8.checkNotNullParameter(comparator, "comparator");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) > 0) {
                t = t2;
            }
        }
        return t;
    }
}
