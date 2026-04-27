package p000;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes7.dex */
public interface a62<T extends Comparable<? super T>> {

    /* JADX INFO: renamed from: a62$a */
    public static final class C0071a {
        public static <T extends Comparable<? super T>> boolean contains(@yfb a62<T> a62Var, @yfb T t) {
            md8.checkNotNullParameter(t, "value");
            return t.compareTo(a62Var.getStart()) >= 0 && t.compareTo(a62Var.getEndInclusive()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(@yfb a62<T> a62Var) {
            return a62Var.getStart().compareTo(a62Var.getEndInclusive()) > 0;
        }
    }

    boolean contains(@yfb T t);

    @yfb
    T getEndInclusive();

    @yfb
    T getStart();

    boolean isEmpty();
}
