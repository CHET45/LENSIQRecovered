package p000;

import p000.d4b;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public final class d74<E> extends ny7<E> {

    /* JADX INFO: renamed from: e */
    public final transient ny7<E> f28619e;

    public d74(ny7<E> forward) {
        this.f28619e = forward;
    }

    @Override // p000.d4b
    public int count(@wx1 Object element) {
        return this.f28619e.count(element);
    }

    @Override // p000.vx7
    /* JADX INFO: renamed from: f */
    public d4b.InterfaceC4612a<E> mo8961f(int index) {
        return this.f28619e.entrySet().asList().reverse().get(index);
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> firstEntry() {
        return this.f28619e.lastEntry();
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return this.f28619e.isPartialView();
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> lastEntry() {
        return this.f28619e.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
    public int size() {
        return this.f28619e.size();
    }

    @Override // p000.ny7, p000.ovf
    public ny7<E> descendingMultiset() {
        return this.f28619e;
    }

    @Override // p000.ny7, p000.ovf
    public ny7<E> headMultiset(E upperBound, hc1 boundType) {
        return this.f28619e.tailMultiset((Object) upperBound, boundType).descendingMultiset();
    }

    @Override // p000.ny7, p000.ovf
    public ny7<E> tailMultiset(E lowerBound, hc1 boundType) {
        return this.f28619e.headMultiset((Object) lowerBound, boundType).descendingMultiset();
    }

    @Override // p000.ny7, p000.vx7, p000.d4b
    public py7<E> elementSet() {
        return this.f28619e.elementSet().descendingSet();
    }
}
