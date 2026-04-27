package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import p000.d4b;
import p000.qvf;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public abstract class st6<E> extends us6<E> implements ovf<E> {

    /* JADX INFO: renamed from: st6$a */
    public abstract class AbstractC12774a extends f74<E> {
        public AbstractC12774a() {
        }

        @Override // p000.f74
        /* JADX INFO: renamed from: x */
        public ovf<E> mo10697x() {
            return st6.this;
        }
    }

    /* JADX INFO: renamed from: st6$b */
    public class C12775b extends qvf.C11717b<E> {
        public C12775b(final st6 this$0) {
            super(this$0);
        }
    }

    /* JADX INFO: renamed from: A */
    public ovf<E> m22218A(@dgc E lowerBound, hc1 lowerBoundType, @dgc E upperBound, hc1 upperBoundType) {
        return tailMultiset(lowerBound, lowerBoundType).headMultiset(upperBound, upperBoundType);
    }

    @Override // p000.ovf, p000.kvf
    public Comparator<? super E> comparator() {
        return mo8967m().comparator();
    }

    @Override // p000.ovf
    public ovf<E> descendingMultiset() {
        return mo8967m().descendingMultiset();
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> firstEntry() {
        return mo8967m().firstEntry();
    }

    @Override // p000.ovf
    public ovf<E> headMultiset(@dgc E upperBound, hc1 boundType) {
        return mo8967m().headMultiset(upperBound, boundType);
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> lastEntry() {
        return mo8967m().lastEntry();
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> pollFirstEntry() {
        return mo8967m().pollFirstEntry();
    }

    @Override // p000.ovf
    @wx1
    public d4b.InterfaceC4612a<E> pollLastEntry() {
        return mo8967m().pollLastEntry();
    }

    @Override // p000.ovf
    public ovf<E> subMultiset(@dgc E lowerBound, hc1 lowerBoundType, @dgc E upperBound, hc1 upperBoundType) {
        return mo8967m().subMultiset(lowerBound, lowerBoundType, upperBound, upperBoundType);
    }

    @Override // p000.ovf
    public ovf<E> tailMultiset(@dgc E lowerBound, hc1 boundType) {
        return mo8967m().tailMultiset(lowerBound, boundType);
    }

    @Override // p000.us6
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public abstract ovf<E> mo8967m();

    @wx1
    /* JADX INFO: renamed from: w */
    public d4b.InterfaceC4612a<E> m22220w() {
        Iterator<d4b.InterfaceC4612a<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        d4b.InterfaceC4612a<E> next = it.next();
        return e4b.immutableEntry(next.getElement(), next.getCount());
    }

    @wx1
    /* JADX INFO: renamed from: x */
    public d4b.InterfaceC4612a<E> m22221x() {
        Iterator<d4b.InterfaceC4612a<E>> it = descendingMultiset().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        d4b.InterfaceC4612a<E> next = it.next();
        return e4b.immutableEntry(next.getElement(), next.getCount());
    }

    @wx1
    /* JADX INFO: renamed from: y */
    public d4b.InterfaceC4612a<E> m22222y() {
        Iterator<d4b.InterfaceC4612a<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        d4b.InterfaceC4612a<E> next = it.next();
        d4b.InterfaceC4612a<E> interfaceC4612aImmutableEntry = e4b.immutableEntry(next.getElement(), next.getCount());
        it.remove();
        return interfaceC4612aImmutableEntry;
    }

    @wx1
    /* JADX INFO: renamed from: z */
    public d4b.InterfaceC4612a<E> m22223z() {
        Iterator<d4b.InterfaceC4612a<E>> it = descendingMultiset().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        d4b.InterfaceC4612a<E> next = it.next();
        d4b.InterfaceC4612a<E> interfaceC4612aImmutableEntry = e4b.immutableEntry(next.getElement(), next.getCount());
        it.remove();
        return interfaceC4612aImmutableEntry;
    }

    @Override // p000.us6, p000.d4b
    public NavigableSet<E> elementSet() {
        return mo8967m().elementSet();
    }
}
