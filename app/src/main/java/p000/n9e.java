package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class n9e<T> implements Comparator<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Comparator<T> f63760a;

    public n9e(@yfb Comparator<T> comparator) {
        md8.checkNotNullParameter(comparator, "comparator");
        this.f63760a = comparator;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        return this.f63760a.compare(t2, t);
    }

    @yfb
    public final Comparator<T> getComparator() {
        return this.f63760a;
    }

    @Override // java.util.Comparator
    @yfb
    public final Comparator<T> reversed() {
        return this.f63760a;
    }
}
