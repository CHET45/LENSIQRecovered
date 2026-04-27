package p000;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public interface kvf<T> extends Iterable<T> {
    Comparator<? super T> comparator();

    @Override // java.lang.Iterable
    Iterator<T> iterator();
}
