package p000;

import java.util.Comparator;
import java.util.NavigableSet;
import p000.d4b;
import p000.e4b;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class uuh<E> extends e4b.C5111m<E> implements ovf<E> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d */
    @wx1
    @ez8
    public transient uuh<E> f89187d;

    public uuh(ovf<E> delegate) {
        super(delegate);
    }

    @Override // p000.ovf, p000.kvf
    public Comparator<? super E> comparator() {
        return mo8967m().comparator();
    }

    @Override // p000.ovf
    public ovf<E> descendingMultiset() {
        uuh<E> uuhVar = this.f89187d;
        if (uuhVar != null) {
            return uuhVar;
        }
        uuh<E> uuhVar2 = new uuh<>(mo8967m().descendingMultiset());
        uuhVar2.f89187d = this;
        this.f89187d = uuhVar2;
        return uuhVar2;
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> firstEntry() {
        return mo8967m().firstEntry();
    }

    @Override // p000.ovf
    public ovf<E> headMultiset(@dgc E upperBound, hc1 boundType) {
        return e4b.unmodifiableSortedMultiset(mo8967m().headMultiset(upperBound, boundType));
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> lastEntry() {
        return mo8967m().lastEntry();
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ovf
    public ovf<E> subMultiset(@dgc E lowerBound, hc1 lowerBoundType, @dgc E upperBound, hc1 upperBoundType) {
        return e4b.unmodifiableSortedMultiset(mo8967m().subMultiset(lowerBound, lowerBoundType, upperBound, upperBoundType));
    }

    @Override // p000.ovf
    public ovf<E> tailMultiset(@dgc E lowerBound, hc1 boundType) {
        return e4b.unmodifiableSortedMultiset(mo8967m().tailMultiset(lowerBound, boundType));
    }

    @Override // p000.e4b.C5111m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> mo9674v() {
        return t6f.unmodifiableNavigableSet(mo8967m().elementSet());
    }

    @Override // p000.e4b.C5111m, p000.us6
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public ovf<E> mo8967m() {
        return (ovf) super.mo8967m();
    }

    @Override // p000.e4b.C5111m, p000.us6, p000.d4b
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
