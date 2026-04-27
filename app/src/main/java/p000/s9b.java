package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class s9b implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final s9b f81013a = new s9b();

    private s9b() {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        return compare2((Comparable<Object>) comparable, (Comparable<Object>) comparable2);
    }

    @Override // java.util.Comparator
    @yfb
    public final Comparator<Comparable<? super Object>> reversed() {
        return l9e.f56918a;
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(@yfb Comparable<Object> comparable, @yfb Comparable<Object> comparable2) {
        md8.checkNotNullParameter(comparable, "a");
        md8.checkNotNullParameter(comparable2, "b");
        return comparable.compareTo(comparable2);
    }
}
