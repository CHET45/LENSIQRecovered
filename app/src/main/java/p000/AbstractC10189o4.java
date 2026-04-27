package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import p000.d4b;
import p000.qvf;

/* JADX INFO: renamed from: o4 */
/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public abstract class AbstractC10189o4<E> extends AbstractC4593d3<E> implements ovf<E> {

    /* JADX INFO: renamed from: c */
    @ld7
    public final Comparator<? super E> f66436c;

    /* JADX INFO: renamed from: d */
    @wx1
    @ez8
    public transient ovf<E> f66437d;

    /* JADX INFO: renamed from: o4$a */
    public class a extends f74<E> {
        public a() {
        }

        @Override // p000.f74, p000.lr6, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return AbstractC10189o4.this.descendingIterator();
        }

        @Override // p000.f74
        /* JADX INFO: renamed from: w */
        public Iterator<d4b.InterfaceC4612a<E>> mo10696w() {
            return AbstractC10189o4.this.mo10005g();
        }

        @Override // p000.f74
        /* JADX INFO: renamed from: x */
        public ovf<E> mo10697x() {
            return AbstractC10189o4.this;
        }
    }

    public AbstractC10189o4() {
        this(s7c.natural());
    }

    public Comparator<? super E> comparator() {
        return this.f66436c;
    }

    public Iterator<E> descendingIterator() {
        return e4b.m9662f(descendingMultiset());
    }

    public ovf<E> descendingMultiset() {
        ovf<E> ovfVar = this.f66437d;
        if (ovfVar != null) {
            return ovfVar;
        }
        ovf<E> ovfVarM18340e = m18340e();
        this.f66437d = ovfVarM18340e;
        return ovfVarM18340e;
    }

    /* JADX INFO: renamed from: e */
    public ovf<E> m18340e() {
        return new a();
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> mo8865a() {
        return new qvf.C11717b(this);
    }

    @wx1
    public d4b.InterfaceC4612a<E> firstEntry() {
        Iterator<d4b.InterfaceC4612a<E>> itMo2919d = mo2919d();
        if (itMo2919d.hasNext()) {
            return itMo2919d.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract Iterator<d4b.InterfaceC4612a<E>> mo10005g();

    @wx1
    public d4b.InterfaceC4612a<E> lastEntry() {
        Iterator<d4b.InterfaceC4612a<E>> itMo10005g = mo10005g();
        if (itMo10005g.hasNext()) {
            return itMo10005g.next();
        }
        return null;
    }

    @wx1
    public d4b.InterfaceC4612a<E> pollFirstEntry() {
        Iterator<d4b.InterfaceC4612a<E>> itMo2919d = mo2919d();
        if (!itMo2919d.hasNext()) {
            return null;
        }
        d4b.InterfaceC4612a<E> next = itMo2919d.next();
        d4b.InterfaceC4612a<E> interfaceC4612aImmutableEntry = e4b.immutableEntry(next.getElement(), next.getCount());
        itMo2919d.remove();
        return interfaceC4612aImmutableEntry;
    }

    @wx1
    public d4b.InterfaceC4612a<E> pollLastEntry() {
        Iterator<d4b.InterfaceC4612a<E>> itMo10005g = mo10005g();
        if (!itMo10005g.hasNext()) {
            return null;
        }
        d4b.InterfaceC4612a<E> next = itMo10005g.next();
        d4b.InterfaceC4612a<E> interfaceC4612aImmutableEntry = e4b.immutableEntry(next.getElement(), next.getCount());
        itMo10005g.remove();
        return interfaceC4612aImmutableEntry;
    }

    public ovf<E> subMultiset(@dgc E fromElement, hc1 fromBoundType, @dgc E toElement, hc1 toBoundType) {
        v7d.checkNotNull(fromBoundType);
        v7d.checkNotNull(toBoundType);
        return tailMultiset(fromElement, fromBoundType).headMultiset(toElement, toBoundType);
    }

    public AbstractC10189o4(Comparator<? super E> comparator) {
        this.f66436c = (Comparator) v7d.checkNotNull(comparator);
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
