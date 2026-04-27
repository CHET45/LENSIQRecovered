package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import p000.d4b;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public interface ovf<E> extends pvf<E>, kvf<E> {
    Comparator<? super E> comparator();

    ovf<E> descendingMultiset();

    @Override // p000.pvf, p000.d4b
    NavigableSet<E> elementSet();

    @Override // p000.d4b
    Set<d4b.InterfaceC4612a<E>> entrySet();

    @wx1
    d4b.InterfaceC4612a<E> firstEntry();

    ovf<E> headMultiset(@dgc E upperBound, hc1 boundType);

    @Override // p000.d4b, java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    @wx1
    d4b.InterfaceC4612a<E> lastEntry();

    @wx1
    d4b.InterfaceC4612a<E> pollFirstEntry();

    @wx1
    d4b.InterfaceC4612a<E> pollLastEntry();

    ovf<E> subMultiset(@dgc E lowerBound, hc1 lowerBoundType, @dgc E upperBound, hc1 upperBoundType);

    ovf<E> tailMultiset(@dgc E lowerBound, hc1 boundType);
}
