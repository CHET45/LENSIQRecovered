package p000;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.1")
public interface z52<T extends Comparable<? super T>> extends a62<T> {

    /* JADX INFO: renamed from: z52$a */
    public static final class C16009a {
        public static <T extends Comparable<? super T>> boolean contains(@yfb z52<T> z52Var, @yfb T t) {
            md8.checkNotNullParameter(t, "value");
            return z52Var.lessThanOrEquals(z52Var.getStart(), t) && z52Var.lessThanOrEquals(t, z52Var.getEndInclusive());
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(@yfb z52<T> z52Var) {
            return !z52Var.lessThanOrEquals(z52Var.getStart(), z52Var.getEndInclusive());
        }
    }

    @Override // p000.a62, p000.r5c
    boolean contains(@yfb T t);

    @Override // p000.a62, p000.r5c
    boolean isEmpty();

    boolean lessThanOrEquals(@yfb T t, @yfb T t2);
}
