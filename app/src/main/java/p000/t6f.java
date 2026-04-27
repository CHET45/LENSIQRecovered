package p000;

import com.arthenica.ffmpegkit.MediaInformation;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import p000.dy7;
import p000.h82;
import p000.kx7;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class t6f {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: t6f$a */
    public class C12924a<E> extends AbstractC12936m<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Set f83831a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set f83832b;

        /* JADX INFO: renamed from: t6f$a$a */
        public class a extends AbstractC0012a2<E> {

            /* JADX INFO: renamed from: c */
            public final Iterator<? extends E> f83833c;

            /* JADX INFO: renamed from: d */
            public final Iterator<? extends E> f83834d;

            public a() {
                this.f83833c = C12924a.this.f83831a.iterator();
                this.f83834d = C12924a.this.f83832b.iterator();
            }

            @Override // p000.AbstractC0012a2
            @wx1
            public E computeNext() {
                if (this.f83833c.hasNext()) {
                    return this.f83833c.next();
                }
                while (this.f83834d.hasNext()) {
                    E next = this.f83834d.next();
                    if (!C12924a.this.f83831a.contains(next)) {
                        return next;
                    }
                }
                return m25a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12924a(final Set val$set1, final Set val$set2) {
            super(null);
            this.f83831a = val$set1;
            this.f83832b = val$set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object object) {
            return this.f83831a.contains(object) || this.f83832b.contains(object);
        }

        @Override // p000.t6f.AbstractC12936m
        public <S extends Set<E>> S copyInto(S set) {
            set.addAll(this.f83831a);
            set.addAll(this.f83832b);
            return set;
        }

        @Override // p000.t6f.AbstractC12936m
        public dy7<E> immutableCopy() {
            return new dy7.C5007a().addAll((Iterable) this.f83831a).addAll((Iterable) this.f83832b).build();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f83831a.isEmpty() && this.f83832b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f83831a.size();
            Iterator<E> it = this.f83832b.iterator();
            while (it.hasNext()) {
                if (!this.f83831a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }

        @Override // p000.t6f.AbstractC12936m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public quh<E> iterator() {
            return new a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: t6f$b */
    public class C12925b<E> extends AbstractC12936m<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Set f83836a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set f83837b;

        /* JADX INFO: renamed from: t6f$b$a */
        public class a extends AbstractC0012a2<E> {

            /* JADX INFO: renamed from: c */
            public final Iterator<E> f83838c;

            public a() {
                this.f83838c = C12925b.this.f83836a.iterator();
            }

            @Override // p000.AbstractC0012a2
            @wx1
            public E computeNext() {
                while (this.f83838c.hasNext()) {
                    E next = this.f83838c.next();
                    if (C12925b.this.f83837b.contains(next)) {
                        return next;
                    }
                }
                return m25a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12925b(final Set val$set1, final Set val$set2) {
            super(null);
            this.f83836a = val$set1;
            this.f83837b = val$set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object object) {
            return this.f83836a.contains(object) && this.f83837b.contains(object);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f83836a.containsAll(collection) && this.f83837b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f83837b, this.f83836a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f83836a.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f83837b.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // p000.t6f.AbstractC12936m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public quh<E> iterator() {
            return new a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: t6f$c */
    public class C12926c<E> extends AbstractC12936m<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Set f83840a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set f83841b;

        /* JADX INFO: renamed from: t6f$c$a */
        public class a extends AbstractC0012a2<E> {

            /* JADX INFO: renamed from: c */
            public final Iterator<E> f83842c;

            public a() {
                this.f83842c = C12926c.this.f83840a.iterator();
            }

            @Override // p000.AbstractC0012a2
            @wx1
            public E computeNext() {
                while (this.f83842c.hasNext()) {
                    E next = this.f83842c.next();
                    if (!C12926c.this.f83841b.contains(next)) {
                        return next;
                    }
                }
                return m25a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12926c(final Set val$set1, final Set val$set2) {
            super(null);
            this.f83840a = val$set1;
            this.f83841b = val$set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object element) {
            return this.f83840a.contains(element) && !this.f83841b.contains(element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f83841b.containsAll(this.f83840a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f83840a.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!this.f83841b.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // p000.t6f.AbstractC12936m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public quh<E> iterator() {
            return new a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: t6f$d */
    public class C12927d<E> extends AbstractC12936m<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Set f83844a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set f83845b;

        /* JADX INFO: renamed from: t6f$d$a */
        public class a extends AbstractC0012a2<E> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f83846c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Iterator f83847d;

            public a(final Iterator val$itr1, final Iterator val$itr2) {
                this.f83846c = val$itr1;
                this.f83847d = val$itr2;
            }

            @Override // p000.AbstractC0012a2
            @wx1
            public E computeNext() {
                while (this.f83846c.hasNext()) {
                    E e = (E) this.f83846c.next();
                    if (!C12927d.this.f83845b.contains(e)) {
                        return e;
                    }
                }
                while (this.f83847d.hasNext()) {
                    E e2 = (E) this.f83847d.next();
                    if (!C12927d.this.f83844a.contains(e2)) {
                        return e2;
                    }
                }
                return m25a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12927d(final Set val$set1, final Set val$set2) {
            super(null);
            this.f83844a = val$set1;
            this.f83845b = val$set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object element) {
            return this.f83845b.contains(element) ^ this.f83844a.contains(element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f83844a.equals(this.f83845b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f83844a.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!this.f83845b.contains(it.next())) {
                    i++;
                }
            }
            Iterator<E> it2 = this.f83845b.iterator();
            while (it2.hasNext()) {
                if (!this.f83844a.contains(it2.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // p000.t6f.AbstractC12936m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public quh<E> iterator() {
            return new a(this.f83844a.iterator(), this.f83845b.iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: t6f$e */
    public class C12928e<E> extends AbstractSet<Set<E>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f83849a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ox7 f83850b;

        /* JADX INFO: renamed from: t6f$e$a */
        public class a extends AbstractC0012a2<Set<E>> {

            /* JADX INFO: renamed from: c */
            public final BitSet f83851c;

            /* JADX INFO: renamed from: t6f$e$a$a, reason: collision with other inner class name */
            public class C16529a extends AbstractSet<E> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ BitSet f83853a;

                /* JADX INFO: renamed from: t6f$e$a$a$a, reason: collision with other inner class name */
                public class C16530a extends AbstractC0012a2<E> {

                    /* JADX INFO: renamed from: c */
                    public int f83855c = -1;

                    public C16530a() {
                    }

                    @Override // p000.AbstractC0012a2
                    @wx1
                    public E computeNext() {
                        int iNextSetBit = C16529a.this.f83853a.nextSetBit(this.f83855c + 1);
                        this.f83855c = iNextSetBit;
                        return iNextSetBit == -1 ? m25a() : C12928e.this.f83850b.keySet().asList().get(this.f83855c);
                    }
                }

                public C16529a(final BitSet val$copy) {
                    this.f83853a = val$copy;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(@wx1 Object o) {
                    Integer num = (Integer) C12928e.this.f83850b.get(o);
                    return num != null && this.f83853a.get(num.intValue());
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<E> iterator() {
                    return new C16530a();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return C12928e.this.f83849a;
                }
            }

            public a() {
                this.f83851c = new BitSet(C12928e.this.f83850b.size());
            }

            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Set<E> computeNext() {
                if (this.f83851c.isEmpty()) {
                    this.f83851c.set(0, C12928e.this.f83849a);
                } else {
                    int iNextSetBit = this.f83851c.nextSetBit(0);
                    int iNextClearBit = this.f83851c.nextClearBit(iNextSetBit);
                    if (iNextClearBit == C12928e.this.f83850b.size()) {
                        return m25a();
                    }
                    int i = (iNextClearBit - iNextSetBit) - 1;
                    this.f83851c.set(0, i);
                    this.f83851c.clear(i, iNextClearBit);
                    this.f83851c.set(iNextClearBit);
                }
                return new C16529a((BitSet) this.f83851c.clone());
            }
        }

        public C12928e(final int val$size, final ox7 val$index) {
            this.f83849a = val$size;
            this.f83850b = val$index;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            if (!(o instanceof Set)) {
                return false;
            }
            Set set = (Set) o;
            return set.size() == this.f83849a && this.f83850b.keySet().containsAll(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return w68.binomial(this.f83850b.size(), this.f83849a);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "Sets.combinations(" + this.f83850b.keySet() + ", " + this.f83849a + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: t6f$f */
    public static final class C12929f<E> extends lr6<List<E>> implements Set<List<E>> {

        /* JADX INFO: renamed from: a */
        public final transient kx7<dy7<E>> f83857a;

        /* JADX INFO: renamed from: b */
        public final transient ns1<E> f83858b;

        /* JADX INFO: renamed from: t6f$f$a */
        public class a extends kx7<List<E>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ kx7 f83859c;

            public a(final kx7 val$axes) {
                this.f83859c = val$axes;
            }

            @Override // p000.ax7
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.f83859c.size();
            }

            @Override // java.util.List
            public List<E> get(int i) {
                return ((dy7) this.f83859c.get(i)).asList();
            }
        }

        private C12929f(kx7<dy7<E>> axes, ns1<E> delegate) {
            this.f83857a = axes;
            this.f83858b = delegate;
        }

        /* JADX INFO: renamed from: m */
        public static <E> Set<List<E>> m22401m(List<? extends Set<? extends E>> sets) {
            kx7.C8541a c8541a = new kx7.C8541a(sets.size());
            Iterator<? extends Set<? extends E>> it = sets.iterator();
            while (it.hasNext()) {
                dy7 dy7VarCopyOf = dy7.copyOf((Collection) it.next());
                if (dy7VarCopyOf.isEmpty()) {
                    return dy7.m9575of();
                }
                c8541a.add(dy7VarCopyOf);
            }
            kx7<E> kx7VarBuild = c8541a.build();
            return new C12929f(kx7VarBuild, new ns1(new a(kx7VarBuild)));
        }

        @Override // p000.lr6, p000.zs6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<List<E>> mo8967m() {
            return this.f83858b;
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object object) {
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (list.size() != this.f83857a.size()) {
                return false;
            }
            Iterator<E> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!this.f83857a.get(i).contains(it.next())) {
                    return false;
                }
                i++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@wx1 Object object) {
            return object instanceof C12929f ? this.f83857a.equals(((C12929f) object).f83857a) : super.equals(object);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i = 1;
            int size = size() - 1;
            for (int i2 = 0; i2 < this.f83857a.size(); i2++) {
                size = ~(~(size * 31));
            }
            quh<dy7<E>> it = this.f83857a.iterator();
            while (it.hasNext()) {
                dy7<E> next = it.next();
                i = ~(~((i * 31) + ((size() / next.size()) * next.hashCode())));
            }
            return ~(~(i + size));
        }
    }

    /* JADX INFO: renamed from: t6f$g */
    @jd7
    public static class C12930g<E> extends xs6<E> {

        /* JADX INFO: renamed from: a */
        public final NavigableSet<E> f83860a;

        public C12930g(NavigableSet<E> forward) {
            this.f83860a = forward;
        }

        private static <T> s7c<T> reverse(Comparator<T> forward) {
            return s7c.from(forward).reverse();
        }

        @Override // p000.xs6, java.util.NavigableSet
        @wx1
        public E ceiling(@dgc E e) {
            return this.f83860a.floor(e);
        }

        @Override // p000.tt6, java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator = this.f83860a.comparator();
            return comparator == null ? s7c.natural().reverse() : reverse(comparator);
        }

        @Override // p000.xs6, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return this.f83860a.iterator();
        }

        @Override // p000.xs6, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return this.f83860a;
        }

        @Override // p000.tt6, java.util.SortedSet
        @dgc
        public E first() {
            return this.f83860a.last();
        }

        @Override // p000.xs6, java.util.NavigableSet
        @wx1
        public E floor(@dgc E e) {
            return this.f83860a.ceiling(e);
        }

        @Override // p000.xs6, java.util.NavigableSet
        public NavigableSet<E> headSet(@dgc E toElement, boolean inclusive) {
            return this.f83860a.tailSet(toElement, inclusive).descendingSet();
        }

        @Override // p000.xs6, java.util.NavigableSet
        @wx1
        public E higher(@dgc E e) {
            return this.f83860a.lower(e);
        }

        @Override // p000.lr6, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.f83860a.descendingIterator();
        }

        @Override // p000.tt6, java.util.SortedSet
        @dgc
        public E last() {
            return this.f83860a.first();
        }

        @Override // p000.xs6, java.util.NavigableSet
        @wx1
        public E lower(@dgc E e) {
            return this.f83860a.higher(e);
        }

        @Override // p000.xs6, java.util.NavigableSet
        @wx1
        public E pollFirst() {
            return this.f83860a.pollLast();
        }

        @Override // p000.xs6, java.util.NavigableSet
        @wx1
        public E pollLast() {
            return this.f83860a.pollFirst();
        }

        @Override // p000.xs6, p000.tt6
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> mo8967m() {
            return this.f83860a;
        }

        @Override // p000.xs6, java.util.NavigableSet
        public NavigableSet<E> subSet(@dgc E fromElement, boolean fromInclusive, @dgc E toElement, boolean toInclusive) {
            return this.f83860a.subSet(toElement, toInclusive, fromElement, fromInclusive).descendingSet();
        }

        @Override // p000.xs6, java.util.NavigableSet
        public NavigableSet<E> tailSet(@dgc E fromElement, boolean inclusive) {
            return this.f83860a.headSet(fromElement, inclusive).descendingSet();
        }

        @Override // p000.lr6, java.util.Collection
        public Object[] toArray() {
            return m16327j();
        }

        @Override // p000.zs6
        public String toString() {
            return mo16329l();
        }

        @Override // p000.tt6, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(@dgc E toElement) {
            return m25437v(toElement);
        }

        @Override // p000.tt6, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(@dgc E fromElement, @dgc E toElement) {
            return mo22770q(fromElement, toElement);
        }

        @Override // p000.tt6, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(@dgc E fromElement) {
            return m25433C(fromElement);
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m16328k(tArr);
        }
    }

    /* JADX INFO: renamed from: t6f$h */
    @jd7
    public static class C12931h<E> extends C12933j<E> implements NavigableSet<E> {
        public C12931h(NavigableSet<E> unfiltered, l8d<? super E> predicate) {
            super(unfiltered, predicate);
        }

        /* JADX INFO: renamed from: b */
        public NavigableSet<E> m22404b() {
            return (NavigableSet) this.f42883a;
        }

        @Override // java.util.NavigableSet
        @wx1
        public E ceiling(@dgc E e) {
            return (E) vg8.find(m22404b().tailSet(e, true), this.f42884b, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return wg8.filter(m22404b().descendingIterator(), this.f42884b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return t6f.filter((NavigableSet) m22404b().descendingSet(), (l8d) this.f42884b);
        }

        @Override // java.util.NavigableSet
        @wx1
        public E floor(@dgc E e) {
            return (E) wg8.find(m22404b().headSet(e, true).descendingIterator(), this.f42884b, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@dgc E toElement, boolean inclusive) {
            return t6f.filter((NavigableSet) m22404b().headSet(toElement, inclusive), (l8d) this.f42884b);
        }

        @Override // java.util.NavigableSet
        @wx1
        public E higher(@dgc E e) {
            return (E) vg8.find(m22404b().tailSet(e, false), this.f42884b, null);
        }

        @Override // p000.t6f.C12933j, java.util.SortedSet
        @dgc
        public E last() {
            return (E) wg8.find(m22404b().descendingIterator(), this.f42884b);
        }

        @Override // java.util.NavigableSet
        @wx1
        public E lower(@dgc E e) {
            return (E) wg8.find(m22404b().headSet(e, false).descendingIterator(), this.f42884b, null);
        }

        @Override // java.util.NavigableSet
        @wx1
        public E pollFirst() {
            return (E) vg8.m23935a(m22404b(), this.f42884b);
        }

        @Override // java.util.NavigableSet
        @wx1
        public E pollLast() {
            return (E) vg8.m23935a(m22404b().descendingSet(), this.f42884b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@dgc E fromElement, boolean fromInclusive, @dgc E toElement, boolean toInclusive) {
            return t6f.filter((NavigableSet) m22404b().subSet(fromElement, fromInclusive, toElement, toInclusive), (l8d) this.f42884b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@dgc E fromElement, boolean inclusive) {
            return t6f.filter((NavigableSet) m22404b().tailSet(fromElement, inclusive), (l8d) this.f42884b);
        }
    }

    /* JADX INFO: renamed from: t6f$i */
    public static class C12932i<E> extends h82.C6744a<E> implements Set<E> {
        public C12932i(Set<E> unfiltered, l8d<? super E> predicate) {
            super(unfiltered, predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@wx1 Object object) {
            return t6f.m22396a(this, object);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return t6f.m22397b(this);
        }
    }

    /* JADX INFO: renamed from: t6f$j */
    public static class C12933j<E> extends C12932i<E> implements SortedSet<E> {
        public C12933j(SortedSet<E> unfiltered, l8d<? super E> predicate) {
            super(unfiltered, predicate);
        }

        @Override // java.util.SortedSet
        @wx1
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f42883a).comparator();
        }

        @Override // java.util.SortedSet
        @dgc
        public E first() {
            return (E) wg8.find(this.f42883a.iterator(), this.f42884b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@dgc E toElement) {
            return new C12933j(((SortedSet) this.f42883a).headSet(toElement), this.f42884b);
        }

        @dgc
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f42883a;
            while (true) {
                E e = (Object) sortedSetHeadSet.last();
                if (this.f42884b.apply(e)) {
                    return e;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@dgc E fromElement, @dgc E toElement) {
            return new C12933j(((SortedSet) this.f42883a).subSet(fromElement, toElement), this.f42884b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@dgc E fromElement) {
            return new C12933j(((SortedSet) this.f42883a).tailSet(fromElement), this.f42884b);
        }
    }

    /* JADX INFO: renamed from: t6f$k */
    public static abstract class AbstractC12934k<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c) {
            return t6f.m22398c(this, c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c) {
            return super.retainAll((Collection) v7d.checkNotNull(c));
        }
    }

    /* JADX INFO: renamed from: t6f$l */
    public static final class C12935l<E> extends AbstractSet<Set<E>> {

        /* JADX INFO: renamed from: a */
        public final ox7<E, Integer> f83861a;

        /* JADX INFO: renamed from: t6f$l$a */
        public class a extends AbstractC14867x1<Set<E>> {
            public a(int size) {
                super(size);
            }

            @Override // p000.AbstractC14867x1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Set<E> get(final int setBits) {
                return new C12937n(C12935l.this.f83861a, setBits);
            }
        }

        public C12935l(Set<E> input) {
            v7d.checkArgument(input.size() <= 30, "Too many elements to create power set: %s > 30", input.size());
            this.f83861a = tt9.m22795p(input);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.f83861a.keySet().containsAll((Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@wx1 Object obj) {
            return obj instanceof C12935l ? this.f83861a.keySet().equals(((C12935l) obj).f83861a.keySet()) : super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f83861a.keySet().hashCode() << (this.f83861a.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a(size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.f83861a.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "powerSet(" + this.f83861a + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: t6f$m */
    public static abstract class AbstractC12936m<E> extends AbstractSet<E> {
        public /* synthetic */ AbstractC12936m(C12924a c12924a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        @hh4("Always throws UnsupportedOperationException")
        @op1
        public final boolean add(@dgc E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        @hh4("Always throws UnsupportedOperationException")
        @op1
        public final boolean addAll(Collection<? extends E> newElements) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @hh4("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @op1
        public <S extends Set<E>> S copyInto(S set) {
            set.addAll(this);
            return set;
        }

        public dy7<E> immutableCopy() {
            return dy7.copyOf((Collection) this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract quh<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @hh4("Always throws UnsupportedOperationException")
        @op1
        @Deprecated
        public final boolean remove(@wx1 Object object) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        @hh4("Always throws UnsupportedOperationException")
        @op1
        public final boolean removeAll(Collection<?> oldElements) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        @hh4("Always throws UnsupportedOperationException")
        @op1
        public final boolean retainAll(Collection<?> elementsToKeep) {
            throw new UnsupportedOperationException();
        }

        private AbstractC12936m() {
        }
    }

    /* JADX INFO: renamed from: t6f$n */
    public static final class C12937n<E> extends AbstractSet<E> {

        /* JADX INFO: renamed from: a */
        public final ox7<E, Integer> f83863a;

        /* JADX INFO: renamed from: b */
        public final int f83864b;

        /* JADX INFO: renamed from: t6f$n$a */
        public class a extends quh<E> {

            /* JADX INFO: renamed from: a */
            public final kx7<E> f83865a;

            /* JADX INFO: renamed from: b */
            public int f83866b;

            public a() {
                this.f83865a = C12937n.this.f83863a.keySet().asList();
                this.f83866b = C12937n.this.f83864b;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f83866b != 0;
            }

            @Override // java.util.Iterator
            public E next() {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f83866b);
                if (iNumberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.f83866b &= ~(1 << iNumberOfTrailingZeros);
                return this.f83865a.get(iNumberOfTrailingZeros);
            }
        }

        public C12937n(ox7<E, Integer> inputSet, int mask) {
            this.f83863a = inputSet;
            this.f83864b = mask;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            Integer num = this.f83863a.get(o);
            if (num != null) {
                if (((1 << num.intValue()) & this.f83864b) != 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.f83864b);
        }
    }

    /* JADX INFO: renamed from: t6f$o */
    public static final class C12938o<E> extends tt6<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final NavigableSet<E> f83868a;

        /* JADX INFO: renamed from: b */
        public final SortedSet<E> f83869b;

        /* JADX INFO: renamed from: c */
        @wx1
        @ez8
        public transient C12938o<E> f83870c;

        public C12938o(NavigableSet<E> delegate) {
            this.f83868a = (NavigableSet) v7d.checkNotNull(delegate);
            this.f83869b = Collections.unmodifiableSortedSet(delegate);
        }

        @Override // java.util.NavigableSet
        @wx1
        public E ceiling(@dgc E e) {
            return this.f83868a.ceiling(e);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return wg8.unmodifiableIterator(this.f83868a.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            C12938o<E> c12938o = this.f83870c;
            if (c12938o != null) {
                return c12938o;
            }
            C12938o<E> c12938o2 = new C12938o<>(this.f83868a.descendingSet());
            this.f83870c = c12938o2;
            c12938o2.f83870c = this;
            return c12938o2;
        }

        @Override // java.util.NavigableSet
        @wx1
        public E floor(@dgc E e) {
            return this.f83868a.floor(e);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@dgc E toElement, boolean inclusive) {
            return t6f.unmodifiableNavigableSet(this.f83868a.headSet(toElement, inclusive));
        }

        @Override // java.util.NavigableSet
        @wx1
        public E higher(@dgc E e) {
            return this.f83868a.higher(e);
        }

        @Override // java.util.NavigableSet
        @wx1
        public E lower(@dgc E e) {
            return this.f83868a.lower(e);
        }

        @Override // p000.tt6, p000.jt6
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedSet<E> mo8967m() {
            return this.f83869b;
        }

        @Override // java.util.NavigableSet
        @wx1
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @wx1
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@dgc E fromElement, boolean fromInclusive, @dgc E toElement, boolean toInclusive) {
            return t6f.unmodifiableNavigableSet(this.f83868a.subSet(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@dgc E fromElement, boolean inclusive) {
            return t6f.unmodifiableNavigableSet(this.f83868a.tailSet(fromElement, inclusive));
        }
    }

    private t6f() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m22396a(Set<?> s, @wx1 Object object) {
        if (s == object) {
            return true;
        }
        if (object instanceof Set) {
            Set set = (Set) object;
            try {
                if (s.size() == set.size()) {
                    if (s.containsAll(set)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static int m22397b(Set<?> s) {
        Iterator<?> it = s.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m22398c(Set<?> set, Collection<?> collection) {
        v7d.checkNotNull(collection);
        if (collection instanceof d4b) {
            collection = ((d4b) collection).elementSet();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? m22399d(set, collection.iterator()) : wg8.removeAll(set.iterator(), collection);
    }

    public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> sets) {
        return C12929f.m22401m(sets);
    }

    public static <E> Set<Set<E>> combinations(Set<E> set, final int size) {
        ox7 ox7VarM22795p = tt9.m22795p(set);
        s72.m21765b(size, MediaInformation.KEY_SIZE);
        v7d.checkArgument(size <= ox7VarM22795p.size(), "size (%s) must be <= set.size() (%s)", size, ox7VarM22795p.size());
        return size == 0 ? dy7.m9576of(dy7.m9575of()) : size == ox7VarM22795p.size() ? dy7.m9576of(ox7VarM22795p.keySet()) : new C12928e(size, ox7VarM22795p);
    }

    @jd7
    @yg8
    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        v7d.checkArgument(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return makeComplementByHand(collection, collection.iterator().next().getDeclaringClass());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m22399d(Set<?> set, Iterator<?> iterator) {
        boolean zRemove = false;
        while (iterator.hasNext()) {
            zRemove |= set.remove(iterator.next());
        }
        return zRemove;
    }

    public static <E> AbstractC12936m<E> difference(final Set<E> set1, final Set<?> set2) {
        v7d.checkNotNull(set1, "set1");
        v7d.checkNotNull(set2, "set2");
        return new C12926c(set1, set2);
    }

    public static <E> Set<E> filter(Set<E> unfiltered, l8d<? super E> predicate) {
        if (unfiltered instanceof SortedSet) {
            return filter((SortedSet) unfiltered, (l8d) predicate);
        }
        if (!(unfiltered instanceof C12932i)) {
            return new C12932i((Set) v7d.checkNotNull(unfiltered), (l8d) v7d.checkNotNull(predicate));
        }
        C12932i c12932i = (C12932i) unfiltered;
        return new C12932i((Set) c12932i.f42883a, p8d.and(c12932i.f42884b, predicate));
    }

    @gd7(serializable = true)
    public static <E extends Enum<E>> dy7<E> immutableEnumSet(E anElement, E... otherElements) {
        return gx7.m12020j(EnumSet.of((Enum) anElement, (Enum[]) otherElements));
    }

    public static <E> AbstractC12936m<E> intersection(final Set<E> set1, final Set<?> set2) {
        v7d.checkNotNull(set1, "set1");
        v7d.checkNotNull(set2, "set2");
        return new C12925b(set1, set2);
    }

    @jd7
    private static <E extends Enum<E>> EnumSet<E> makeComplementByHand(Collection<E> collection, Class<E> type) {
        EnumSet<E> enumSetAllOf = EnumSet.allOf(type);
        enumSetAllOf.removeAll(collection);
        return enumSetAllOf;
    }

    public static <E> Set<E> newConcurrentHashSet() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    @jd7
    @yg8
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> iterable, Class<E> elementType) {
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(elementType);
        vg8.addAll(enumSetNoneOf, iterable);
        return enumSetNoneOf;
    }

    public static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int expectedSize) {
        return new HashSet<>(tt9.m22790k(expectedSize));
    }

    public static <E> Set<E> newIdentityHashSet() {
        return Collections.newSetFromMap(tt9.newIdentityHashMap());
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int expectedSize) {
        return new LinkedHashSet<>(tt9.m22790k(expectedSize));
    }

    @Deprecated
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet() {
        return new TreeSet<>();
    }

    @gd7(serializable = false)
    public static <E> Set<Set<E>> powerSet(Set<E> set) {
        return new C12935l(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jd7
    public static <K extends Comparable<? super K>> NavigableSet<K> subSet(NavigableSet<K> set, bpd<K> range) {
        if (set.comparator() != null && set.comparator() != s7c.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            v7d.checkArgument(set.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            Comparable comparableLowerEndpoint = range.lowerEndpoint();
            hc1 hc1VarLowerBoundType = range.lowerBoundType();
            hc1 hc1Var = hc1.CLOSED;
            return set.subSet(comparableLowerEndpoint, hc1VarLowerBoundType == hc1Var, range.upperEndpoint(), range.upperBoundType() == hc1Var);
        }
        if (range.hasLowerBound()) {
            return set.tailSet(range.lowerEndpoint(), range.lowerBoundType() == hc1.CLOSED);
        }
        if (range.hasUpperBound()) {
            return set.headSet(range.upperEndpoint(), range.upperBoundType() == hc1.CLOSED);
        }
        return (NavigableSet) v7d.checkNotNull(set);
    }

    public static <E> AbstractC12936m<E> symmetricDifference(final Set<? extends E> set1, final Set<? extends E> set2) {
        v7d.checkNotNull(set1, "set1");
        v7d.checkNotNull(set2, "set2");
        return new C12927d(set1, set2);
    }

    @jd7
    public static <E> NavigableSet<E> synchronizedNavigableSet(NavigableSet<E> navigableSet) {
        return xhg.m25169o(navigableSet);
    }

    public static <E> AbstractC12936m<E> union(final Set<? extends E> set1, final Set<? extends E> set2) {
        v7d.checkNotNull(set1, "set1");
        v7d.checkNotNull(set2, "set2");
        return new C12924a(set1, set2);
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> set) {
        return ((set instanceof ax7) || (set instanceof C12938o)) ? set : new C12938o(set);
    }

    @SafeVarargs
    public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... sets) {
        return cartesianProduct(Arrays.asList(sets));
    }

    @gd7(serializable = true)
    public static <E extends Enum<E>> dy7<E> immutableEnumSet(Iterable<E> elements) {
        if (elements instanceof gx7) {
            return (gx7) elements;
        }
        if (elements instanceof Collection) {
            Collection collection = (Collection) elements;
            return collection.isEmpty() ? dy7.m9575of() : gx7.m12020j(EnumSet.copyOf(collection));
        }
        Iterator<E> it = elements.iterator();
        if (!it.hasNext()) {
            return dy7.m9575of();
        }
        EnumSet enumSetOf = EnumSet.of((Enum) it.next());
        wg8.addAll(enumSetOf, it);
        return gx7.m12020j(enumSetOf);
    }

    public static <E> Set<E> newConcurrentHashSet(Iterable<? extends E> elements) {
        Set<E> setNewConcurrentHashSet = newConcurrentHashSet();
        vg8.addAll(setNewConcurrentHashSet, elements);
        return setNewConcurrentHashSet;
    }

    @jd7
    @yg8
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet(Iterable<? extends E> elements) {
        return new CopyOnWriteArraySet<>(elements instanceof Collection ? (Collection) elements : eb9.newArrayList(elements));
    }

    public static <E> HashSet<E> newHashSet(E... elements) {
        HashSet<E> hashSetNewHashSetWithExpectedSize = newHashSetWithExpectedSize(elements.length);
        Collections.addAll(hashSetNewHashSetWithExpectedSize, elements);
        return hashSetNewHashSetWithExpectedSize;
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new LinkedHashSet<>((Collection) elements);
        }
        LinkedHashSet<E> linkedHashSetNewLinkedHashSet = newLinkedHashSet();
        vg8.addAll(linkedHashSetNewLinkedHashSet, elements);
        return linkedHashSetNewLinkedHashSet;
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> elements) {
        TreeSet<E> treeSetNewTreeSet = newTreeSet();
        vg8.addAll(treeSetNewTreeSet, elements);
        return treeSetNewTreeSet;
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new HashSet<>((Collection) elements);
        }
        return newHashSet(elements.iterator());
    }

    public static <E> TreeSet<E> newTreeSet(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) v7d.checkNotNull(comparator));
    }

    @jd7
    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection, Class<E> type) {
        v7d.checkNotNull(collection);
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        return makeComplementByHand(collection, type);
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> elements) {
        HashSet<E> hashSetNewHashSet = newHashSet();
        wg8.addAll(hashSetNewHashSet, elements);
        return hashSetNewHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> filter(SortedSet<E> unfiltered, l8d<? super E> predicate) {
        if (unfiltered instanceof C12932i) {
            C12932i c12932i = (C12932i) unfiltered;
            return new C12933j((SortedSet) c12932i.f42883a, p8d.and(c12932i.f42884b, predicate));
        }
        return new C12933j((SortedSet) v7d.checkNotNull(unfiltered), (l8d) v7d.checkNotNull(predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jd7
    public static <E> NavigableSet<E> filter(NavigableSet<E> unfiltered, l8d<? super E> predicate) {
        if (unfiltered instanceof C12932i) {
            C12932i c12932i = (C12932i) unfiltered;
            return new C12931h((NavigableSet) c12932i.f42883a, p8d.and(c12932i.f42884b, predicate));
        }
        return new C12931h((NavigableSet) v7d.checkNotNull(unfiltered), (l8d) v7d.checkNotNull(predicate));
    }
}
