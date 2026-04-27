package p000;

import java.lang.Comparable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public class y0g<A extends Comparable<A>> implements Comparator<A> {

    /* JADX INFO: renamed from: a */
    public static y0g f99992a = new y0g();

    private y0g() {
    }

    public static <T extends Comparable<T>> y0g<T> getComparator(Class<T> cls) {
        return f99992a;
    }

    @Override // java.util.Comparator
    public int compare(A a, A a2) {
        return a.compareTo(a2);
    }
}
