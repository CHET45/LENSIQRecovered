package p000;

import java.util.Comparator;
import p000.d4b;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public final class pxd<E> extends ny7<E> {

    /* JADX INFO: renamed from: F */
    public static final long[] f72465F = {0};

    /* JADX INFO: renamed from: H */
    public static final ny7<Comparable> f72466H = new pxd(s7c.natural());

    /* JADX INFO: renamed from: C */
    public final transient int f72467C;

    /* JADX INFO: renamed from: e */
    @gdi
    public final transient qxd<E> f72468e;

    /* JADX INFO: renamed from: f */
    public final transient long[] f72469f;

    /* JADX INFO: renamed from: m */
    public final transient int f72470m;

    public pxd(Comparator<? super E> comparator) {
        this.f72468e = py7.m19839l(comparator);
        this.f72469f = f72465F;
        this.f72470m = 0;
        this.f72467C = 0;
    }

    private int getCount(int index) {
        long[] jArr = this.f72469f;
        int i = this.f72470m;
        return (int) (jArr[(i + index) + 1] - jArr[i + index]);
    }

    @Override // p000.d4b
    public int count(@wx1 Object element) {
        int iIndexOf = this.f72468e.indexOf(element);
        if (iIndexOf >= 0) {
            return getCount(iIndexOf);
        }
        return 0;
    }

    @Override // p000.vx7
    /* JADX INFO: renamed from: f */
    public d4b.InterfaceC4612a<E> mo8961f(int index) {
        return e4b.immutableEntry(this.f72468e.asList().get(index), getCount(index));
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return mo8961f(0);
    }

    /* JADX INFO: renamed from: h */
    public ny7<E> m19837h(int from, int to) {
        v7d.checkPositionIndexes(from, to, this.f72467C);
        return from == to ? ny7.m18203g(comparator()) : (from == 0 && to == this.f72467C) ? this : new pxd(this.f72468e.m20706r(from, to), this.f72469f, this.f72470m + from, to - from);
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return this.f72470m > 0 || this.f72467C < this.f72469f.length - 1;
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return mo8961f(this.f72467C - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
    public int size() {
        long[] jArr = this.f72469f;
        int i = this.f72470m;
        return rd8.saturatedCast(jArr[this.f72467C + i] - jArr[i]);
    }

    @Override // p000.ny7, p000.ovf
    public ny7<E> headMultiset(E upperBound, hc1 boundType) {
        return m19837h(0, this.f72468e.m20707s(upperBound, v7d.checkNotNull(boundType) == hc1.CLOSED));
    }

    @Override // p000.ny7, p000.ovf
    public ny7<E> tailMultiset(E lowerBound, hc1 boundType) {
        return m19837h(this.f72468e.m20708t(lowerBound, v7d.checkNotNull(boundType) == hc1.CLOSED), this.f72467C);
    }

    @Override // p000.ny7, p000.vx7, p000.d4b
    public py7<E> elementSet() {
        return this.f72468e;
    }

    public pxd(qxd<E> elementSet, long[] cumulativeCounts, int offset, int length) {
        this.f72468e = elementSet;
        this.f72469f = cumulativeCounts;
        this.f72470m = offset;
        this.f72467C = length;
    }
}
