package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p000.d4b;
import p000.e4b;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class eih<E> extends AbstractC10189o4<E> implements Serializable {

    @jd7
    @yg8
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e */
    public final transient C5329g<C5328f<E>> f33105e;

    /* JADX INFO: renamed from: f */
    public final transient q27<E> f33106f;

    /* JADX INFO: renamed from: m */
    public final transient C5328f<E> f33107m;

    /* JADX INFO: renamed from: eih$a */
    public class C5323a extends e4b.AbstractC5104f<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5328f f33108a;

        public C5323a(final C5328f val$baseEntry) {
            this.f33108a = val$baseEntry;
        }

        @Override // p000.d4b.InterfaceC4612a
        public int getCount() {
            int iM10024q = this.f33108a.m10024q();
            return iM10024q == 0 ? eih.this.count(getElement()) : iM10024q;
        }

        @Override // p000.d4b.InterfaceC4612a
        @dgc
        public E getElement() {
            return (E) this.f33108a.m10025r();
        }
    }

    /* JADX INFO: renamed from: eih$b */
    public class C5324b implements Iterator<d4b.InterfaceC4612a<E>> {

        /* JADX INFO: renamed from: a */
        @wx1
        public C5328f<E> f33110a;

        /* JADX INFO: renamed from: b */
        @wx1
        public d4b.InterfaceC4612a<E> f33111b;

        public C5324b() {
            this.f33110a = eih.this.firstNode();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f33110a == null) {
                return false;
            }
            if (!eih.this.f33106f.m20016p(this.f33110a.m10025r())) {
                return true;
            }
            this.f33110a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            v7d.checkState(this.f33111b != null, "no calls to next() since the last call to remove()");
            eih.this.setCount(this.f33111b.getElement(), 0);
            this.f33111b = null;
        }

        @Override // java.util.Iterator
        public d4b.InterfaceC4612a<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            eih eihVar = eih.this;
            C5328f<E> c5328f = this.f33110a;
            Objects.requireNonNull(c5328f);
            d4b.InterfaceC4612a<E> interfaceC4612aWrapEntry = eihVar.wrapEntry(c5328f);
            this.f33111b = interfaceC4612aWrapEntry;
            if (this.f33110a.succ() == eih.this.f33107m) {
                this.f33110a = null;
            } else {
                this.f33110a = this.f33110a.succ();
            }
            return interfaceC4612aWrapEntry;
        }
    }

    /* JADX INFO: renamed from: eih$c */
    public class C5325c implements Iterator<d4b.InterfaceC4612a<E>> {

        /* JADX INFO: renamed from: a */
        @wx1
        public C5328f<E> f33113a;

        /* JADX INFO: renamed from: b */
        @wx1
        public d4b.InterfaceC4612a<E> f33114b = null;

        public C5325c() {
            this.f33113a = eih.this.lastNode();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f33113a == null) {
                return false;
            }
            if (!eih.this.f33106f.m20017q(this.f33113a.m10025r())) {
                return true;
            }
            this.f33113a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            v7d.checkState(this.f33114b != null, "no calls to next() since the last call to remove()");
            eih.this.setCount(this.f33114b.getElement(), 0);
            this.f33114b = null;
        }

        @Override // java.util.Iterator
        public d4b.InterfaceC4612a<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Objects.requireNonNull(this.f33113a);
            d4b.InterfaceC4612a<E> interfaceC4612aWrapEntry = eih.this.wrapEntry(this.f33113a);
            this.f33114b = interfaceC4612aWrapEntry;
            if (this.f33113a.pred() == eih.this.f33107m) {
                this.f33113a = null;
            } else {
                this.f33113a = this.f33113a.pred();
            }
            return interfaceC4612aWrapEntry;
        }
    }

    /* JADX INFO: renamed from: eih$d */
    public static /* synthetic */ class C5326d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33116a;

        static {
            int[] iArr = new int[hc1.values().length];
            f33116a = iArr;
            try {
                iArr[hc1.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33116a[hc1.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: eih$e */
    public static abstract class EnumC5327e {

        /* JADX INFO: renamed from: a */
        public static final EnumC5327e f33117a = new a("SIZE", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC5327e f33118b = new b("DISTINCT", 1);

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumC5327e[] f33119c = $values();

        /* JADX INFO: renamed from: eih$e$a */
        public enum a extends EnumC5327e {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.eih.EnumC5327e
            /* JADX INFO: renamed from: a */
            public int mo10006a(C5328f<?> node) {
                return node.f33121b;
            }

            @Override // p000.eih.EnumC5327e
            /* JADX INFO: renamed from: b */
            public long mo10007b(@wx1 C5328f<?> root) {
                if (root == null) {
                    return 0L;
                }
                return root.f33123d;
            }
        }

        /* JADX INFO: renamed from: eih$e$b */
        public enum b extends EnumC5327e {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.eih.EnumC5327e
            /* JADX INFO: renamed from: a */
            public int mo10006a(C5328f<?> node) {
                return 1;
            }

            @Override // p000.eih.EnumC5327e
            /* JADX INFO: renamed from: b */
            public long mo10007b(@wx1 C5328f<?> root) {
                if (root == null) {
                    return 0L;
                }
                return root.f33122c;
            }
        }

        private static /* synthetic */ EnumC5327e[] $values() {
            return new EnumC5327e[]{f33117a, f33118b};
        }

        private EnumC5327e(String $enum$name, int $enum$ordinal) {
        }

        public static EnumC5327e valueOf(String name) {
            return (EnumC5327e) Enum.valueOf(EnumC5327e.class, name);
        }

        public static EnumC5327e[] values() {
            return (EnumC5327e[]) f33119c.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo10006a(C5328f<?> node);

        /* JADX INFO: renamed from: b */
        public abstract long mo10007b(@wx1 C5328f<?> root);

        public /* synthetic */ EnumC5327e(String str, int i, C5323a c5323a) {
            this(str, i);
        }
    }

    /* JADX INFO: renamed from: eih$g */
    public static final class C5329g<T> {

        /* JADX INFO: renamed from: a */
        @wx1
        public T f33129a;

        private C5329g() {
        }

        /* JADX INFO: renamed from: a */
        public void m10029a() {
            this.f33129a = null;
        }

        public void checkAndSet(@wx1 T expected, @wx1 T newValue) {
            if (this.f33129a != expected) {
                throw new ConcurrentModificationException();
            }
            this.f33129a = newValue;
        }

        @wx1
        public T get() {
            return this.f33129a;
        }

        public /* synthetic */ C5329g(C5323a c5323a) {
            this();
        }
    }

    public eih(C5329g<C5328f<E>> rootReference, q27<E> range, C5328f<E> endLink) {
        super(range.m20005b());
        this.f33105e = rootReference;
        this.f33106f = range;
        this.f33107m = endLink;
    }

    private long aggregateAboveRange(EnumC5327e aggr, @wx1 C5328f<E> node) {
        long jMo10007b;
        long jAggregateAboveRange;
        if (node == null) {
            return 0L;
        }
        int iCompare = comparator().compare(sib.m22018a(this.f33106f.m20010i()), node.m10025r());
        if (iCompare > 0) {
            return aggregateAboveRange(aggr, node.f33126g);
        }
        if (iCompare == 0) {
            int i = C5326d.f33116a[this.f33106f.m20009h().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return aggr.mo10007b(node.f33126g);
                }
                throw new AssertionError();
            }
            jMo10007b = aggr.mo10006a(node);
            jAggregateAboveRange = aggr.mo10007b(node.f33126g);
        } else {
            jMo10007b = aggr.mo10007b(node.f33126g) + ((long) aggr.mo10006a(node));
            jAggregateAboveRange = aggregateAboveRange(aggr, node.f33125f);
        }
        return jMo10007b + jAggregateAboveRange;
    }

    private long aggregateBelowRange(EnumC5327e aggr, @wx1 C5328f<E> node) {
        long jMo10007b;
        long jAggregateBelowRange;
        if (node == null) {
            return 0L;
        }
        int iCompare = comparator().compare(sib.m22018a(this.f33106f.m20008g()), node.m10025r());
        if (iCompare < 0) {
            return aggregateBelowRange(aggr, node.f33125f);
        }
        if (iCompare == 0) {
            int i = C5326d.f33116a[this.f33106f.m20007f().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return aggr.mo10007b(node.f33125f);
                }
                throw new AssertionError();
            }
            jMo10007b = aggr.mo10006a(node);
            jAggregateBelowRange = aggr.mo10007b(node.f33125f);
        } else {
            jMo10007b = aggr.mo10007b(node.f33125f) + ((long) aggr.mo10006a(node));
            jAggregateBelowRange = aggregateBelowRange(aggr, node.f33126g);
        }
        return jMo10007b + jAggregateBelowRange;
    }

    private long aggregateForEntries(EnumC5327e aggr) {
        C5328f<E> c5328f = this.f33105e.get();
        long jMo10007b = aggr.mo10007b(c5328f);
        if (this.f33106f.m20011j()) {
            jMo10007b -= aggregateBelowRange(aggr, c5328f);
        }
        return this.f33106f.m20012k() ? jMo10007b - aggregateAboveRange(aggr, c5328f) : jMo10007b;
    }

    public static <E extends Comparable> eih<E> create() {
        return new eih<>(s7c.natural());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @wx1
    public C5328f<E> firstNode() {
        C5328f<E> c5328fSucc;
        C5328f<E> c5328f = this.f33105e.get();
        if (c5328f == null) {
            return null;
        }
        if (this.f33106f.m20011j()) {
            Object objM22018a = sib.m22018a(this.f33106f.m20008g());
            c5328fSucc = c5328f.ceiling(comparator(), objM22018a);
            if (c5328fSucc == null) {
                return null;
            }
            if (this.f33106f.m20007f() == hc1.OPEN && comparator().compare(objM22018a, c5328fSucc.m10025r()) == 0) {
                c5328fSucc = c5328fSucc.succ();
            }
        } else {
            c5328fSucc = this.f33107m.succ();
        }
        if (c5328fSucc == this.f33107m || !this.f33106f.m20006c(c5328fSucc.m10025r())) {
            return null;
        }
        return c5328fSucc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @wx1
    public C5328f<E> lastNode() {
        C5328f<E> c5328fPred;
        C5328f<E> c5328f = this.f33105e.get();
        if (c5328f == null) {
            return null;
        }
        if (this.f33106f.m20012k()) {
            Object objM22018a = sib.m22018a(this.f33106f.m20010i());
            c5328fPred = c5328f.floor(comparator(), objM22018a);
            if (c5328fPred == null) {
                return null;
            }
            if (this.f33106f.m20009h() == hc1.OPEN && comparator().compare(objM22018a, c5328fPred.m10025r()) == 0) {
                c5328fPred = c5328fPred.pred();
            }
        } else {
            c5328fPred = this.f33107m.pred();
        }
        if (c5328fPred == this.f33107m || !this.f33106f.m20006c(c5328fPred.m10025r())) {
            return null;
        }
        return c5328fPred;
    }

    /* JADX INFO: renamed from: o */
    public static int m10004o(@wx1 C5328f<?> node) {
        if (node == null) {
            return 0;
        }
        return node.f33122c;
    }

    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        Objects.requireNonNull(object);
        Comparator comparator = (Comparator) object;
        b1f.m2790a(AbstractC10189o4.class, "comparator").m2802b(this, comparator);
        b1f.m2790a(eih.class, "range").m2802b(this, q27.m20000a(comparator));
        b1f.m2790a(eih.class, "rootReference").m2802b(this, new C5329g(null));
        C5328f c5328f = new C5328f();
        b1f.m2790a(eih.class, "header").m2802b(this, c5328f);
        successor(c5328f, c5328f);
        b1f.m2795f(this, stream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(C5328f<T> a, C5328f<T> b) {
        a.f33128i = b;
        b.f33127h = a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d4b.InterfaceC4612a<E> wrapEntry(final C5328f<E> baseEntry) {
        return new C5323a(baseEntry);
    }

    @jd7
    @yg8
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(elementSet().comparator());
        b1f.m2800k(this, stream);
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public int add(@dgc E element, int occurrences) {
        s72.m21765b(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        v7d.checkArgument(this.f33106f.m20006c(element));
        C5328f<E> c5328f = this.f33105e.get();
        if (c5328f != null) {
            int[] iArr = new int[1];
            this.f33105e.checkAndSet(c5328f, c5328f.m10022o(comparator(), element, occurrences, iArr));
            return iArr[0];
        }
        comparator().compare(element, element);
        C5328f<E> c5328f2 = new C5328f<>(element, occurrences);
        C5328f<E> c5328f3 = this.f33107m;
        successor(c5328f3, c5328f2, c5328f3);
        this.f33105e.checkAndSet(c5328f, c5328f2);
        return 0;
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: b */
    public int mo2917b() {
        return rd8.saturatedCast(aggregateForEntries(EnumC5327e.f33118b));
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: c */
    public Iterator<E> mo2918c() {
        return e4b.m9659c(mo2919d());
    }

    @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.f33106f.m20011j() || this.f33106f.m20012k()) {
            wg8.m24509c(mo2919d());
            return;
        }
        C5328f<E> c5328fSucc = this.f33107m.succ();
        while (true) {
            C5328f<E> c5328f = this.f33107m;
            if (c5328fSucc == c5328f) {
                successor(c5328f, c5328f);
                this.f33105e.m10029a();
                return;
            }
            C5328f<E> c5328fSucc2 = c5328fSucc.succ();
            c5328fSucc.f33121b = 0;
            c5328fSucc.f33125f = null;
            c5328fSucc.f33126g = null;
            c5328fSucc.f33127h = null;
            c5328fSucc.f33128i = null;
            c5328fSucc = c5328fSucc2;
        }
    }

    @Override // p000.AbstractC10189o4, p000.ovf, p000.kvf
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection, p000.d4b
    public /* bridge */ /* synthetic */ boolean contains(@wx1 Object element) {
        return super.contains(element);
    }

    @Override // p000.d4b
    public int count(@wx1 Object element) {
        try {
            C5328f<E> c5328f = this.f33105e.get();
            if (this.f33106f.m20006c(element) && c5328f != null) {
                return c5328f.m10023p(comparator(), element);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: d */
    public Iterator<d4b.InterfaceC4612a<E>> mo2919d() {
        return new C5324b();
    }

    @Override // p000.AbstractC10189o4, p000.ovf
    public /* bridge */ /* synthetic */ ovf descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // p000.AbstractC10189o4, p000.AbstractC4593d3, p000.d4b
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // p000.AbstractC10189o4, p000.ovf
    @wx1
    public /* bridge */ /* synthetic */ d4b.InterfaceC4612a firstEntry() {
        return super.firstEntry();
    }

    @Override // p000.AbstractC10189o4
    /* JADX INFO: renamed from: g */
    public Iterator<d4b.InterfaceC4612a<E>> mo10005g() {
        return new C5325c();
    }

    @Override // p000.ovf
    public ovf<E> headMultiset(@dgc E upperBound, hc1 boundType) {
        return new eih(this.f33105e, this.f33106f.m20013l(q27.m20004r(comparator(), upperBound, boundType)), this.f33107m);
    }

    @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p000.d4b
    public Iterator<E> iterator() {
        return e4b.m9662f(this);
    }

    @Override // p000.AbstractC10189o4, p000.ovf
    @wx1
    public /* bridge */ /* synthetic */ d4b.InterfaceC4612a lastEntry() {
        return super.lastEntry();
    }

    @Override // p000.AbstractC10189o4, p000.ovf
    @wx1
    public /* bridge */ /* synthetic */ d4b.InterfaceC4612a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // p000.AbstractC10189o4, p000.ovf
    @wx1
    public /* bridge */ /* synthetic */ d4b.InterfaceC4612a pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public int remove(@wx1 Object element, int occurrences) {
        s72.m21765b(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        C5328f<E> c5328f = this.f33105e.get();
        int[] iArr = new int[1];
        try {
            if (this.f33106f.m20006c(element) && c5328f != null) {
                this.f33105e.checkAndSet(c5328f, c5328f.m10026s(comparator(), element, occurrences, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public int setCount(@dgc E element, int count) {
        s72.m21765b(count, "count");
        if (!this.f33106f.m20006c(element)) {
            v7d.checkArgument(count == 0);
            return 0;
        }
        C5328f<E> c5328f = this.f33105e.get();
        if (c5328f == null) {
            if (count > 0) {
                add(element, count);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.f33105e.checkAndSet(c5328f, c5328f.m10028u(comparator(), element, count, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
    public int size() {
        return rd8.saturatedCast(aggregateForEntries(EnumC5327e.f33117a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC10189o4, p000.ovf
    public /* bridge */ /* synthetic */ ovf subMultiset(@dgc Object fromElement, hc1 fromBoundType, @dgc Object toElement, hc1 toBoundType) {
        return super.subMultiset(fromElement, fromBoundType, toElement, toBoundType);
    }

    @Override // p000.ovf
    public ovf<E> tailMultiset(@dgc E lowerBound, hc1 boundType) {
        return new eih(this.f33105e, this.f33106f.m20013l(q27.m20001d(comparator(), lowerBound, boundType)), this.f33107m);
    }

    public static <E> eih<E> create(@wx1 Comparator<? super E> comparator) {
        return comparator == null ? new eih<>(s7c.natural()) : new eih<>(comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(C5328f<T> a, C5328f<T> b, C5328f<T> c) {
        successor(a, b);
        successor(b, c);
    }

    public static <E extends Comparable> eih<E> create(Iterable<? extends E> elements) {
        eih<E> eihVarCreate = create();
        vg8.addAll(eihVarCreate, elements);
        return eihVarCreate;
    }

    public eih(Comparator<? super E> comparator) {
        super(comparator);
        this.f33106f = q27.m20000a(comparator);
        C5328f<E> c5328f = new C5328f<>();
        this.f33107m = c5328f;
        successor(c5328f, c5328f);
        this.f33105e = new C5329g<>(null);
    }

    /* JADX INFO: renamed from: eih$f */
    public static final class C5328f<E> {

        /* JADX INFO: renamed from: a */
        @wx1
        public final E f33120a;

        /* JADX INFO: renamed from: b */
        public int f33121b;

        /* JADX INFO: renamed from: c */
        public int f33122c;

        /* JADX INFO: renamed from: d */
        public long f33123d;

        /* JADX INFO: renamed from: e */
        public int f33124e;

        /* JADX INFO: renamed from: f */
        @wx1
        public C5328f<E> f33125f;

        /* JADX INFO: renamed from: g */
        @wx1
        public C5328f<E> f33126g;

        /* JADX INFO: renamed from: h */
        @wx1
        public C5328f<E> f33127h;

        /* JADX INFO: renamed from: i */
        @wx1
        public C5328f<E> f33128i;

        public C5328f(@dgc E elem, int elemCount) {
            v7d.checkArgument(elemCount > 0);
            this.f33120a = elem;
            this.f33121b = elemCount;
            this.f33123d = elemCount;
            this.f33122c = 1;
            this.f33124e = 1;
            this.f33125f = null;
            this.f33126g = null;
        }

        private C5328f<E> addLeftChild(@dgc E e, int count) {
            this.f33125f = new C5328f<>(e, count);
            eih.successor(pred(), this.f33125f, this);
            this.f33124e = Math.max(2, this.f33124e);
            this.f33122c++;
            this.f33123d += (long) count;
            return this;
        }

        private C5328f<E> addRightChild(@dgc E e, int count) {
            C5328f<E> c5328f = new C5328f<>(e, count);
            this.f33126g = c5328f;
            eih.successor(this, c5328f, succ());
            this.f33124e = Math.max(2, this.f33124e);
            this.f33122c++;
            this.f33123d += (long) count;
            return this;
        }

        private int balanceFactor() {
            return height(this.f33125f) - height(this.f33126g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @wx1
        public C5328f<E> ceiling(Comparator<? super E> comparator, @dgc E e) {
            int iCompare = comparator.compare(e, m10025r());
            if (iCompare < 0) {
                C5328f<E> c5328f = this.f33125f;
                return c5328f == null ? this : (C5328f) yya.firstNonNull(c5328f.ceiling(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            C5328f<E> c5328f2 = this.f33126g;
            if (c5328f2 == null) {
                return null;
            }
            return c5328f2.ceiling(comparator, e);
        }

        @wx1
        private C5328f<E> deleteMe() {
            int i = this.f33121b;
            this.f33121b = 0;
            eih.successor(pred(), succ());
            C5328f<E> c5328f = this.f33125f;
            if (c5328f == null) {
                return this.f33126g;
            }
            C5328f<E> c5328f2 = this.f33126g;
            if (c5328f2 == null) {
                return c5328f;
            }
            if (c5328f.f33124e >= c5328f2.f33124e) {
                C5328f<E> c5328fPred = pred();
                c5328fPred.f33125f = this.f33125f.removeMax(c5328fPred);
                c5328fPred.f33126g = this.f33126g;
                c5328fPred.f33122c = this.f33122c - 1;
                c5328fPred.f33123d = this.f33123d - ((long) i);
                return c5328fPred.rebalance();
            }
            C5328f<E> c5328fSucc = succ();
            c5328fSucc.f33126g = this.f33126g.removeMin(c5328fSucc);
            c5328fSucc.f33125f = this.f33125f;
            c5328fSucc.f33122c = this.f33122c - 1;
            c5328fSucc.f33123d = this.f33123d - ((long) i);
            return c5328fSucc.rebalance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @wx1
        public C5328f<E> floor(Comparator<? super E> comparator, @dgc E e) {
            int iCompare = comparator.compare(e, m10025r());
            if (iCompare > 0) {
                C5328f<E> c5328f = this.f33126g;
                return c5328f == null ? this : (C5328f) yya.firstNonNull(c5328f.floor(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            C5328f<E> c5328f2 = this.f33125f;
            if (c5328f2 == null) {
                return null;
            }
            return c5328f2.floor(comparator, e);
        }

        private static int height(@wx1 C5328f<?> node) {
            if (node == null) {
                return 0;
            }
            return node.f33124e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C5328f<E> pred() {
            C5328f<E> c5328f = this.f33127h;
            Objects.requireNonNull(c5328f);
            return c5328f;
        }

        private C5328f<E> rebalance() {
            int iBalanceFactor = balanceFactor();
            if (iBalanceFactor == -2) {
                Objects.requireNonNull(this.f33126g);
                if (this.f33126g.balanceFactor() > 0) {
                    this.f33126g = this.f33126g.rotateRight();
                }
                return rotateLeft();
            }
            if (iBalanceFactor != 2) {
                recomputeHeight();
                return this;
            }
            Objects.requireNonNull(this.f33125f);
            if (this.f33125f.balanceFactor() < 0) {
                this.f33125f = this.f33125f.rotateLeft();
            }
            return rotateRight();
        }

        private void recompute() {
            recomputeMultiset();
            recomputeHeight();
        }

        private void recomputeHeight() {
            this.f33124e = Math.max(height(this.f33125f), height(this.f33126g)) + 1;
        }

        private void recomputeMultiset() {
            this.f33122c = eih.m10004o(this.f33125f) + 1 + eih.m10004o(this.f33126g);
            this.f33123d = ((long) this.f33121b) + totalCount(this.f33125f) + totalCount(this.f33126g);
        }

        @wx1
        private C5328f<E> removeMax(C5328f<E> node) {
            C5328f<E> c5328f = this.f33126g;
            if (c5328f == null) {
                return this.f33125f;
            }
            this.f33126g = c5328f.removeMax(node);
            this.f33122c--;
            this.f33123d -= (long) node.f33121b;
            return rebalance();
        }

        @wx1
        private C5328f<E> removeMin(C5328f<E> node) {
            C5328f<E> c5328f = this.f33125f;
            if (c5328f == null) {
                return this.f33126g;
            }
            this.f33125f = c5328f.removeMin(node);
            this.f33122c--;
            this.f33123d -= (long) node.f33121b;
            return rebalance();
        }

        private C5328f<E> rotateLeft() {
            v7d.checkState(this.f33126g != null);
            C5328f<E> c5328f = this.f33126g;
            this.f33126g = c5328f.f33125f;
            c5328f.f33125f = this;
            c5328f.f33123d = this.f33123d;
            c5328f.f33122c = this.f33122c;
            recompute();
            c5328f.recomputeHeight();
            return c5328f;
        }

        private C5328f<E> rotateRight() {
            v7d.checkState(this.f33125f != null);
            C5328f<E> c5328f = this.f33125f;
            this.f33125f = c5328f.f33126g;
            c5328f.f33126g = this;
            c5328f.f33123d = this.f33123d;
            c5328f.f33122c = this.f33122c;
            recompute();
            c5328f.recomputeHeight();
            return c5328f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C5328f<E> succ() {
            C5328f<E> c5328f = this.f33128i;
            Objects.requireNonNull(c5328f);
            return c5328f;
        }

        private static long totalCount(@wx1 C5328f<?> node) {
            if (node == null) {
                return 0L;
            }
            return node.f33123d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: o */
        public C5328f<E> m10022o(Comparator<? super E> comparator, @dgc E e, int count, int[] result) {
            int iCompare = comparator.compare(e, m10025r());
            if (iCompare < 0) {
                C5328f<E> c5328f = this.f33125f;
                if (c5328f == null) {
                    result[0] = 0;
                    return addLeftChild(e, count);
                }
                int i = c5328f.f33124e;
                C5328f<E> c5328fM10022o = c5328f.m10022o(comparator, e, count, result);
                this.f33125f = c5328fM10022o;
                if (result[0] == 0) {
                    this.f33122c++;
                }
                this.f33123d += (long) count;
                return c5328fM10022o.f33124e == i ? this : rebalance();
            }
            if (iCompare <= 0) {
                int i2 = this.f33121b;
                result[0] = i2;
                long j = count;
                v7d.checkArgument(((long) i2) + j <= 2147483647L);
                this.f33121b += count;
                this.f33123d += j;
                return this;
            }
            C5328f<E> c5328f2 = this.f33126g;
            if (c5328f2 == null) {
                result[0] = 0;
                return addRightChild(e, count);
            }
            int i3 = c5328f2.f33124e;
            C5328f<E> c5328fM10022o2 = c5328f2.m10022o(comparator, e, count, result);
            this.f33126g = c5328fM10022o2;
            if (result[0] == 0) {
                this.f33122c++;
            }
            this.f33123d += (long) count;
            return c5328fM10022o2.f33124e == i3 ? this : rebalance();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: p */
        public int m10023p(Comparator<? super E> comparator, @dgc E e) {
            int iCompare = comparator.compare(e, m10025r());
            if (iCompare < 0) {
                C5328f<E> c5328f = this.f33125f;
                if (c5328f == null) {
                    return 0;
                }
                return c5328f.m10023p(comparator, e);
            }
            if (iCompare <= 0) {
                return this.f33121b;
            }
            C5328f<E> c5328f2 = this.f33126g;
            if (c5328f2 == null) {
                return 0;
            }
            return c5328f2.m10023p(comparator, e);
        }

        /* JADX INFO: renamed from: q */
        public int m10024q() {
            return this.f33121b;
        }

        @dgc
        /* JADX INFO: renamed from: r */
        public E m10025r() {
            return (E) sib.m22018a(this.f33120a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @wx1
        /* JADX INFO: renamed from: s */
        public C5328f<E> m10026s(Comparator<? super E> comparator, @dgc E e, int count, int[] result) {
            int iCompare = comparator.compare(e, m10025r());
            if (iCompare < 0) {
                C5328f<E> c5328f = this.f33125f;
                if (c5328f == null) {
                    result[0] = 0;
                    return this;
                }
                this.f33125f = c5328f.m10026s(comparator, e, count, result);
                int i = result[0];
                if (i > 0) {
                    if (count >= i) {
                        this.f33122c--;
                        this.f33123d -= (long) i;
                    } else {
                        this.f33123d -= (long) count;
                    }
                }
                return i == 0 ? this : rebalance();
            }
            if (iCompare <= 0) {
                int i2 = this.f33121b;
                result[0] = i2;
                if (count >= i2) {
                    return deleteMe();
                }
                this.f33121b = i2 - count;
                this.f33123d -= (long) count;
                return this;
            }
            C5328f<E> c5328f2 = this.f33126g;
            if (c5328f2 == null) {
                result[0] = 0;
                return this;
            }
            this.f33126g = c5328f2.m10026s(comparator, e, count, result);
            int i3 = result[0];
            if (i3 > 0) {
                if (count >= i3) {
                    this.f33122c--;
                    this.f33123d -= (long) i3;
                } else {
                    this.f33123d -= (long) count;
                }
            }
            return rebalance();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @wx1
        /* JADX INFO: renamed from: t */
        public C5328f<E> m10027t(Comparator<? super E> comparator, @dgc E e, int expectedCount, int newCount, int[] result) {
            int iCompare = comparator.compare(e, m10025r());
            if (iCompare < 0) {
                C5328f<E> c5328f = this.f33125f;
                if (c5328f == null) {
                    result[0] = 0;
                    return (expectedCount != 0 || newCount <= 0) ? this : addLeftChild(e, newCount);
                }
                this.f33125f = c5328f.m10027t(comparator, e, expectedCount, newCount, result);
                int i = result[0];
                if (i == expectedCount) {
                    if (newCount == 0 && i != 0) {
                        this.f33122c--;
                    } else if (newCount > 0 && i == 0) {
                        this.f33122c++;
                    }
                    this.f33123d += (long) (newCount - i);
                }
                return rebalance();
            }
            if (iCompare <= 0) {
                int i2 = this.f33121b;
                result[0] = i2;
                if (expectedCount == i2) {
                    if (newCount == 0) {
                        return deleteMe();
                    }
                    this.f33123d += (long) (newCount - i2);
                    this.f33121b = newCount;
                }
                return this;
            }
            C5328f<E> c5328f2 = this.f33126g;
            if (c5328f2 == null) {
                result[0] = 0;
                return (expectedCount != 0 || newCount <= 0) ? this : addRightChild(e, newCount);
            }
            this.f33126g = c5328f2.m10027t(comparator, e, expectedCount, newCount, result);
            int i3 = result[0];
            if (i3 == expectedCount) {
                if (newCount == 0 && i3 != 0) {
                    this.f33122c--;
                } else if (newCount > 0 && i3 == 0) {
                    this.f33122c++;
                }
                this.f33123d += (long) (newCount - i3);
            }
            return rebalance();
        }

        public String toString() {
            return e4b.immutableEntry(m10025r(), m10024q()).toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @wx1
        /* JADX INFO: renamed from: u */
        public C5328f<E> m10028u(Comparator<? super E> comparator, @dgc E e, int count, int[] result) {
            int iCompare = comparator.compare(e, m10025r());
            if (iCompare < 0) {
                C5328f<E> c5328f = this.f33125f;
                if (c5328f == null) {
                    result[0] = 0;
                    return count > 0 ? addLeftChild(e, count) : this;
                }
                this.f33125f = c5328f.m10028u(comparator, e, count, result);
                if (count == 0 && result[0] != 0) {
                    this.f33122c--;
                } else if (count > 0 && result[0] == 0) {
                    this.f33122c++;
                }
                this.f33123d += (long) (count - result[0]);
                return rebalance();
            }
            if (iCompare <= 0) {
                int i = this.f33121b;
                result[0] = i;
                if (count == 0) {
                    return deleteMe();
                }
                this.f33123d += (long) (count - i);
                this.f33121b = count;
                return this;
            }
            C5328f<E> c5328f2 = this.f33126g;
            if (c5328f2 == null) {
                result[0] = 0;
                return count > 0 ? addRightChild(e, count) : this;
            }
            this.f33126g = c5328f2.m10028u(comparator, e, count, result);
            if (count == 0 && result[0] != 0) {
                this.f33122c--;
            } else if (count > 0 && result[0] == 0) {
                this.f33122c++;
            }
            this.f33123d += (long) (count - result[0]);
            return rebalance();
        }

        public C5328f() {
            this.f33120a = null;
            this.f33121b = 1;
        }
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public boolean setCount(@dgc E element, int oldCount, int newCount) {
        s72.m21765b(newCount, "newCount");
        s72.m21765b(oldCount, "oldCount");
        v7d.checkArgument(this.f33106f.m20006c(element));
        C5328f<E> c5328f = this.f33105e.get();
        if (c5328f != null) {
            int[] iArr = new int[1];
            this.f33105e.checkAndSet(c5328f, c5328f.m10027t(comparator(), element, oldCount, newCount, iArr));
            return iArr[0] == oldCount;
        }
        if (oldCount != 0) {
            return false;
        }
        if (newCount > 0) {
            add(element, newCount);
        }
        return true;
    }
}
