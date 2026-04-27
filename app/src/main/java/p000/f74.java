package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import p000.d4b;
import p000.e4b;
import p000.qvf;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public abstract class f74<E> extends us6<E> implements ovf<E> {

    /* JADX INFO: renamed from: a */
    @wx1
    @ez8
    public transient Comparator<? super E> f35604a;

    /* JADX INFO: renamed from: b */
    @wx1
    @ez8
    public transient NavigableSet<E> f35605b;

    /* JADX INFO: renamed from: c */
    @wx1
    @ez8
    public transient Set<d4b.InterfaceC4612a<E>> f35606c;

    /* JADX INFO: renamed from: f74$a */
    public class C5658a extends e4b.AbstractC5107i<E> {
        public C5658a() {
        }

        @Override // p000.e4b.AbstractC5107i
        /* JADX INFO: renamed from: a */
        public d4b<E> mo8725a() {
            return f74.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<d4b.InterfaceC4612a<E>> iterator() {
            return f74.this.mo10696w();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f74.this.mo10697x().entrySet().size();
        }
    }

    @Override // p000.ovf, p000.kvf
    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f35604a;
        if (comparator != null) {
            return comparator;
        }
        s7c s7cVarReverse = s7c.from(mo10697x().comparator()).reverse();
        this.f35604a = s7cVarReverse;
        return s7cVarReverse;
    }

    @Override // p000.ovf
    public ovf<E> descendingMultiset() {
        return mo10697x();
    }

    @Override // p000.us6, p000.d4b
    public Set<d4b.InterfaceC4612a<E>> entrySet() {
        Set<d4b.InterfaceC4612a<E>> set = this.f35606c;
        if (set != null) {
            return set;
        }
        Set<d4b.InterfaceC4612a<E>> setM10695v = m10695v();
        this.f35606c = setM10695v;
        return setM10695v;
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> firstEntry() {
        return mo10697x().lastEntry();
    }

    @Override // p000.ovf
    public ovf<E> headMultiset(@dgc E toElement, hc1 boundType) {
        return mo10697x().tailMultiset(toElement, boundType).descendingMultiset();
    }

    @Override // p000.lr6, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return e4b.m9662f(this);
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> lastEntry() {
        return mo10697x().firstEntry();
    }

    @Override // p000.us6, p000.lr6, p000.zs6
    /* JADX INFO: renamed from: m */
    public d4b<E> mo8967m() {
        return mo10697x();
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> pollFirstEntry() {
        return mo10697x().pollLastEntry();
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> pollLastEntry() {
        return mo10697x().pollFirstEntry();
    }

    @Override // p000.ovf
    public ovf<E> subMultiset(@dgc E fromElement, hc1 fromBoundType, @dgc E toElement, hc1 toBoundType) {
        return mo10697x().subMultiset(toElement, toBoundType, fromElement, fromBoundType).descendingMultiset();
    }

    @Override // p000.ovf
    public ovf<E> tailMultiset(@dgc E fromElement, hc1 boundType) {
        return mo10697x().headMultiset(fromElement, boundType).descendingMultiset();
    }

    @Override // p000.lr6, java.util.Collection
    public Object[] toArray() {
        return m16327j();
    }

    @Override // p000.zs6
    public String toString() {
        return entrySet().toString();
    }

    /* JADX INFO: renamed from: v */
    public Set<d4b.InterfaceC4612a<E>> m10695v() {
        return new C5658a();
    }

    /* JADX INFO: renamed from: w */
    public abstract Iterator<d4b.InterfaceC4612a<E>> mo10696w();

    /* JADX INFO: renamed from: x */
    public abstract ovf<E> mo10697x();

    @Override // p000.lr6, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) m16328k(tArr);
    }

    @Override // p000.us6, p000.d4b
    public NavigableSet<E> elementSet() {
        NavigableSet<E> navigableSet = this.f35605b;
        if (navigableSet != null) {
            return navigableSet;
        }
        qvf.C11717b c11717b = new qvf.C11717b(this);
        this.f35605b = c11717b;
        return c11717b;
    }
}
