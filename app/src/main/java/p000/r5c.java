package p000;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {rh5.class})
@jjf(version = "1.9")
public interface r5c<T extends Comparable<? super T>> {

    /* JADX INFO: renamed from: r5c$a */
    public static final class C11895a {
        public static <T extends Comparable<? super T>> boolean contains(@yfb r5c<T> r5cVar, @yfb T t) {
            md8.checkNotNullParameter(t, "value");
            return t.compareTo(r5cVar.getStart()) >= 0 && t.compareTo(r5cVar.getEndExclusive()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(@yfb r5c<T> r5cVar) {
            return r5cVar.getStart().compareTo(r5cVar.getEndExclusive()) >= 0;
        }
    }

    boolean contains(@yfb T t);

    @yfb
    T getEndExclusive();

    @yfb
    T getStart();

    boolean isEmpty();
}
