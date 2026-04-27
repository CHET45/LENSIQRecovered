package p000;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 2)
public final class hih<E> extends TreeSet<E> {

    /* JADX INFO: renamed from: a */
    public static final int f43775a = 0;

    public hih(@yfb Comparator<? super E> comparator) {
        super(comparator);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
