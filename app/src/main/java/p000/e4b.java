package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p000.d4b;
import p000.t6f;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class e4b {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: e4b$a */
    public class C5099a<E> extends AbstractC5112n<E> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d4b f31747c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ d4b f31748d;

        /* JADX INFO: renamed from: e4b$a$a */
        public class a extends AbstractC0012a2<d4b.InterfaceC4612a<E>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f31749c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Iterator f31750d;

            public a(final Iterator val$iterator1, final Iterator val$iterator2) {
                this.f31749c = val$iterator1;
                this.f31750d = val$iterator2;
            }

            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d4b.InterfaceC4612a<E> computeNext() {
                if (this.f31749c.hasNext()) {
                    d4b.InterfaceC4612a interfaceC4612a = (d4b.InterfaceC4612a) this.f31749c.next();
                    Object element = interfaceC4612a.getElement();
                    return e4b.immutableEntry(element, Math.max(interfaceC4612a.getCount(), C5099a.this.f31748d.count(element)));
                }
                while (this.f31750d.hasNext()) {
                    d4b.InterfaceC4612a interfaceC4612a2 = (d4b.InterfaceC4612a) this.f31750d.next();
                    Object element2 = interfaceC4612a2.getElement();
                    if (!C5099a.this.f31747c.contains(element2)) {
                        return e4b.immutableEntry(element2, interfaceC4612a2.getCount());
                    }
                }
                return m25a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5099a(final d4b val$multiset1, final d4b val$multiset2) {
            super(null);
            this.f31747c = val$multiset1;
            this.f31748d = val$multiset2;
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: a */
        public Set<E> mo8865a() {
            return t6f.union(this.f31747c.elementSet(), this.f31748d.elementSet());
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: c */
        public Iterator<E> mo2918c() {
            throw new AssertionError("should never be called");
        }

        @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection, p000.d4b
        public boolean contains(@wx1 Object element) {
            return this.f31747c.contains(element) || this.f31748d.contains(element);
        }

        @Override // p000.d4b
        public int count(@wx1 Object element) {
            return Math.max(this.f31747c.count(element), this.f31748d.count(element));
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: d */
        public Iterator<d4b.InterfaceC4612a<E>> mo2919d() {
            return new a(this.f31747c.entrySet().iterator(), this.f31748d.entrySet().iterator());
        }

        @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f31747c.isEmpty() && this.f31748d.isEmpty();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: e4b$b */
    public class C5100b<E> extends AbstractC5112n<E> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d4b f31752c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ d4b f31753d;

        /* JADX INFO: renamed from: e4b$b$a */
        public class a extends AbstractC0012a2<d4b.InterfaceC4612a<E>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f31754c;

            public a(final Iterator val$iterator1) {
                this.f31754c = val$iterator1;
            }

            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d4b.InterfaceC4612a<E> computeNext() {
                while (this.f31754c.hasNext()) {
                    d4b.InterfaceC4612a interfaceC4612a = (d4b.InterfaceC4612a) this.f31754c.next();
                    Object element = interfaceC4612a.getElement();
                    int iMin = Math.min(interfaceC4612a.getCount(), C5100b.this.f31753d.count(element));
                    if (iMin > 0) {
                        return e4b.immutableEntry(element, iMin);
                    }
                }
                return m25a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5100b(final d4b val$multiset1, final d4b val$multiset2) {
            super(null);
            this.f31752c = val$multiset1;
            this.f31753d = val$multiset2;
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: a */
        public Set<E> mo8865a() {
            return t6f.intersection(this.f31752c.elementSet(), this.f31753d.elementSet());
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: c */
        public Iterator<E> mo2918c() {
            throw new AssertionError("should never be called");
        }

        @Override // p000.d4b
        public int count(@wx1 Object element) {
            int iCount = this.f31752c.count(element);
            if (iCount == 0) {
                return 0;
            }
            return Math.min(iCount, this.f31753d.count(element));
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: d */
        public Iterator<d4b.InterfaceC4612a<E>> mo2919d() {
            return new a(this.f31752c.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: e4b$c */
    public class C5101c<E> extends AbstractC5112n<E> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d4b f31756c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ d4b f31757d;

        /* JADX INFO: renamed from: e4b$c$a */
        public class a extends AbstractC0012a2<d4b.InterfaceC4612a<E>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f31758c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Iterator f31759d;

            public a(final Iterator val$iterator1, final Iterator val$iterator2) {
                this.f31758c = val$iterator1;
                this.f31759d = val$iterator2;
            }

            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d4b.InterfaceC4612a<E> computeNext() {
                if (this.f31758c.hasNext()) {
                    d4b.InterfaceC4612a interfaceC4612a = (d4b.InterfaceC4612a) this.f31758c.next();
                    Object element = interfaceC4612a.getElement();
                    return e4b.immutableEntry(element, interfaceC4612a.getCount() + C5101c.this.f31757d.count(element));
                }
                while (this.f31759d.hasNext()) {
                    d4b.InterfaceC4612a interfaceC4612a2 = (d4b.InterfaceC4612a) this.f31759d.next();
                    Object element2 = interfaceC4612a2.getElement();
                    if (!C5101c.this.f31756c.contains(element2)) {
                        return e4b.immutableEntry(element2, interfaceC4612a2.getCount());
                    }
                }
                return m25a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5101c(final d4b val$multiset1, final d4b val$multiset2) {
            super(null);
            this.f31756c = val$multiset1;
            this.f31757d = val$multiset2;
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: a */
        public Set<E> mo8865a() {
            return t6f.union(this.f31756c.elementSet(), this.f31757d.elementSet());
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: c */
        public Iterator<E> mo2918c() {
            throw new AssertionError("should never be called");
        }

        @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection, p000.d4b
        public boolean contains(@wx1 Object element) {
            return this.f31756c.contains(element) || this.f31757d.contains(element);
        }

        @Override // p000.d4b
        public int count(@wx1 Object element) {
            return this.f31756c.count(element) + this.f31757d.count(element);
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: d */
        public Iterator<d4b.InterfaceC4612a<E>> mo2919d() {
            return new a(this.f31756c.entrySet().iterator(), this.f31757d.entrySet().iterator());
        }

        @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f31756c.isEmpty() && this.f31757d.isEmpty();
        }

        @Override // p000.e4b.AbstractC5112n, java.util.AbstractCollection, java.util.Collection, p000.d4b
        public int size() {
            return w68.saturatedAdd(this.f31756c.size(), this.f31757d.size());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: e4b$d */
    public class C5102d<E> extends AbstractC5112n<E> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d4b f31761c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ d4b f31762d;

        /* JADX INFO: renamed from: e4b$d$a */
        public class a extends AbstractC0012a2<E> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f31763c;

            public a(final Iterator val$iterator1) {
                this.f31763c = val$iterator1;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p000.AbstractC0012a2
            @wx1
            public E computeNext() {
                while (this.f31763c.hasNext()) {
                    d4b.InterfaceC4612a interfaceC4612a = (d4b.InterfaceC4612a) this.f31763c.next();
                    E e = (E) interfaceC4612a.getElement();
                    if (interfaceC4612a.getCount() > C5102d.this.f31762d.count(e)) {
                        return e;
                    }
                }
                return m25a();
            }
        }

        /* JADX INFO: renamed from: e4b$d$b */
        public class b extends AbstractC0012a2<d4b.InterfaceC4612a<E>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f31765c;

            public b(final Iterator val$iterator1) {
                this.f31765c = val$iterator1;
            }

            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d4b.InterfaceC4612a<E> computeNext() {
                while (this.f31765c.hasNext()) {
                    d4b.InterfaceC4612a interfaceC4612a = (d4b.InterfaceC4612a) this.f31765c.next();
                    Object element = interfaceC4612a.getElement();
                    int count = interfaceC4612a.getCount() - C5102d.this.f31762d.count(element);
                    if (count > 0) {
                        return e4b.immutableEntry(element, count);
                    }
                }
                return m25a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5102d(final d4b val$multiset1, final d4b val$multiset2) {
            super(null);
            this.f31761c = val$multiset1;
            this.f31762d = val$multiset2;
        }

        @Override // p000.e4b.AbstractC5112n, p000.AbstractC4593d3
        /* JADX INFO: renamed from: b */
        public int mo2917b() {
            return wg8.size(mo2919d());
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: c */
        public Iterator<E> mo2918c() {
            return new a(this.f31761c.entrySet().iterator());
        }

        @Override // p000.e4b.AbstractC5112n, p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.d4b
        public int count(@wx1 Object element) {
            int iCount = this.f31761c.count(element);
            if (iCount == 0) {
                return 0;
            }
            return Math.max(0, iCount - this.f31762d.count(element));
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: d */
        public Iterator<d4b.InterfaceC4612a<E>> mo2919d() {
            return new b(this.f31761c.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: e4b$e */
    public class C5103e<E> extends geh<d4b.InterfaceC4612a<E>, E> {
        public C5103e(Iterator backingIterator) {
            super(backingIterator);
        }

        @Override // p000.geh
        @dgc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E mo2935a(d4b.InterfaceC4612a<E> entry) {
            return entry.getElement();
        }
    }

    /* JADX INFO: renamed from: e4b$f */
    public static abstract class AbstractC5104f<E> implements d4b.InterfaceC4612a<E> {
        @Override // p000.d4b.InterfaceC4612a
        public boolean equals(@wx1 Object object) {
            if (!(object instanceof d4b.InterfaceC4612a)) {
                return false;
            }
            d4b.InterfaceC4612a interfaceC4612a = (d4b.InterfaceC4612a) object;
            return getCount() == interfaceC4612a.getCount() && okb.equal(getElement(), interfaceC4612a.getElement());
        }

        @Override // p000.d4b.InterfaceC4612a
        public int hashCode() {
            E element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        @Override // p000.d4b.InterfaceC4612a
        public String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    /* JADX INFO: renamed from: e4b$g */
    public static final class C5105g implements Comparator<d4b.InterfaceC4612a<?>> {

        /* JADX INFO: renamed from: a */
        public static final C5105g f31767a = new C5105g();

        private C5105g() {
        }

        @Override // java.util.Comparator
        public int compare(d4b.InterfaceC4612a<?> entry1, d4b.InterfaceC4612a<?> entry2) {
            return entry2.getCount() - entry1.getCount();
        }
    }

    /* JADX INFO: renamed from: e4b$h */
    public static abstract class AbstractC5106h<E> extends t6f.AbstractC12934k<E> {
        /* JADX INFO: renamed from: a */
        public abstract d4b<E> mo8866a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo8866a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            return mo8866a().contains(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> c) {
            return mo8866a().containsAll(c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo8866a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object o) {
            return mo8866a().remove(o, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo8866a().entrySet().size();
        }
    }

    /* JADX INFO: renamed from: e4b$i */
    public static abstract class AbstractC5107i<E> extends t6f.AbstractC12934k<d4b.InterfaceC4612a<E>> {
        /* JADX INFO: renamed from: a */
        public abstract d4b<E> mo8725a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo8725a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            if (!(o instanceof d4b.InterfaceC4612a)) {
                return false;
            }
            d4b.InterfaceC4612a interfaceC4612a = (d4b.InterfaceC4612a) o;
            return interfaceC4612a.getCount() > 0 && mo8725a().count(interfaceC4612a.getElement()) == interfaceC4612a.getCount();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object obj) {
            if (obj instanceof d4b.InterfaceC4612a) {
                d4b.InterfaceC4612a interfaceC4612a = (d4b.InterfaceC4612a) obj;
                Object element = interfaceC4612a.getElement();
                int count = interfaceC4612a.getCount();
                if (count != 0) {
                    return mo8725a().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: e4b$j */
    public static final class C5108j<E> extends AbstractC5112n<E> {

        /* JADX INFO: renamed from: c */
        public final d4b<E> f31768c;

        /* JADX INFO: renamed from: d */
        public final l8d<? super E> f31769d;

        /* JADX INFO: renamed from: e4b$j$a */
        public class a implements l8d<d4b.InterfaceC4612a<E>> {
            public a() {
            }

            @Override // p000.l8d
            public boolean apply(d4b.InterfaceC4612a<E> entry) {
                return C5108j.this.f31769d.apply(entry.getElement());
            }
        }

        public C5108j(d4b<E> unfiltered, l8d<? super E> predicate) {
            super(null);
            this.f31768c = (d4b) v7d.checkNotNull(unfiltered);
            this.f31769d = (l8d) v7d.checkNotNull(predicate);
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: a */
        public Set<E> mo8865a() {
            return t6f.filter(this.f31768c.elementSet(), this.f31769d);
        }

        @Override // p000.AbstractC4593d3, p000.d4b
        public int add(@dgc E element, int occurrences) {
            v7d.checkArgument(this.f31769d.apply(element), "Element %s does not match predicate %s", element, this.f31769d);
            return this.f31768c.add(element, occurrences);
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: c */
        public Iterator<E> mo2918c() {
            throw new AssertionError("should never be called");
        }

        @Override // p000.d4b
        public int count(@wx1 Object element) {
            int iCount = this.f31768c.count(element);
            if (iCount <= 0 || !this.f31769d.apply(element)) {
                return 0;
            }
            return iCount;
        }

        @Override // p000.AbstractC4593d3
        public Set<d4b.InterfaceC4612a<E>> createEntrySet() {
            return t6f.filter(this.f31768c.entrySet(), new a());
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: d */
        public Iterator<d4b.InterfaceC4612a<E>> mo2919d() {
            throw new AssertionError("should never be called");
        }

        @Override // p000.AbstractC4593d3, p000.d4b
        public int remove(@wx1 Object element, int occurrences) {
            s72.m21765b(occurrences, "occurrences");
            if (occurrences == 0) {
                return count(element);
            }
            if (contains(element)) {
                return this.f31768c.remove(element, occurrences);
            }
            return 0;
        }

        @Override // p000.e4b.AbstractC5112n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p000.d4b
        public quh<E> iterator() {
            return wg8.filter(this.f31768c.iterator(), this.f31769d);
        }
    }

    /* JADX INFO: renamed from: e4b$k */
    public static class C5109k<E> extends AbstractC5104f<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        @dgc
        public final E f31771a;

        /* JADX INFO: renamed from: b */
        public final int f31772b;

        public C5109k(@dgc E element, int count) {
            this.f31771a = element;
            this.f31772b = count;
            s72.m21765b(count, "count");
        }

        @Override // p000.d4b.InterfaceC4612a
        public final int getCount() {
            return this.f31772b;
        }

        @Override // p000.d4b.InterfaceC4612a
        @dgc
        public final E getElement() {
            return this.f31771a;
        }

        @wx1
        public C5109k<E> nextInBucket() {
            return null;
        }
    }

    /* JADX INFO: renamed from: e4b$l */
    public static final class C5110l<E> implements Iterator<E> {

        /* JADX INFO: renamed from: a */
        public final d4b<E> f31773a;

        /* JADX INFO: renamed from: b */
        public final Iterator<d4b.InterfaceC4612a<E>> f31774b;

        /* JADX INFO: renamed from: c */
        @wx1
        public d4b.InterfaceC4612a<E> f31775c;

        /* JADX INFO: renamed from: d */
        public int f31776d;

        /* JADX INFO: renamed from: e */
        public int f31777e;

        /* JADX INFO: renamed from: f */
        public boolean f31778f;

        public C5110l(d4b<E> multiset, Iterator<d4b.InterfaceC4612a<E>> entryIterator) {
            this.f31773a = multiset;
            this.f31774b = entryIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31776d > 0 || this.f31774b.hasNext();
        }

        @Override // java.util.Iterator
        @dgc
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f31776d == 0) {
                d4b.InterfaceC4612a<E> next = this.f31774b.next();
                this.f31775c = next;
                int count = next.getCount();
                this.f31776d = count;
                this.f31777e = count;
            }
            this.f31776d--;
            this.f31778f = true;
            d4b.InterfaceC4612a<E> interfaceC4612a = this.f31775c;
            Objects.requireNonNull(interfaceC4612a);
            return interfaceC4612a.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            s72.m21768e(this.f31778f);
            if (this.f31777e == 1) {
                this.f31774b.remove();
            } else {
                d4b<E> d4bVar = this.f31773a;
                d4b.InterfaceC4612a<E> interfaceC4612a = this.f31775c;
                Objects.requireNonNull(interfaceC4612a);
                d4bVar.remove(interfaceC4612a.getElement());
            }
            this.f31777e--;
            this.f31778f = false;
        }
    }

    /* JADX INFO: renamed from: e4b$m */
    public static class C5111m<E> extends us6<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final d4b<? extends E> f31779a;

        /* JADX INFO: renamed from: b */
        @wx1
        @ez8
        public transient Set<E> f31780b;

        /* JADX INFO: renamed from: c */
        @wx1
        @ez8
        public transient Set<d4b.InterfaceC4612a<E>> f31781c;

        public C5111m(d4b<? extends E> delegate) {
            this.f31779a = delegate;
        }

        @Override // p000.lr6, java.util.Collection, java.util.Queue
        public boolean add(@dgc E element) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.lr6, java.util.Collection
        public boolean addAll(Collection<? extends E> elementsToAdd) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.us6, p000.d4b
        public Set<E> elementSet() {
            Set<E> set = this.f31780b;
            if (set != null) {
                return set;
            }
            Set<E> setMo9674v = mo9674v();
            this.f31780b = setMo9674v;
            return setMo9674v;
        }

        @Override // p000.us6, p000.d4b
        public Set<d4b.InterfaceC4612a<E>> entrySet() {
            Set<d4b.InterfaceC4612a<E>> set = this.f31781c;
            if (set != null) {
                return set;
            }
            Set<d4b.InterfaceC4612a<E>> setUnmodifiableSet = Collections.unmodifiableSet(this.f31779a.entrySet());
            this.f31781c = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // p000.lr6, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return wg8.unmodifiableIterator(this.f31779a.iterator());
        }

        @Override // p000.us6, p000.lr6, p000.zs6
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public d4b<E> mo8967m() {
            return this.f31779a;
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object element) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> elementsToRemove) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> elementsToRetain) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.us6, p000.d4b
        public int setCount(@dgc E element, int count) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: v */
        public Set<E> mo9674v() {
            return Collections.unmodifiableSet(this.f31779a.elementSet());
        }

        @Override // p000.us6, p000.d4b
        public int add(@dgc E element, int occurrences) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.us6, p000.d4b
        public int remove(@wx1 Object element, int occurrences) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.us6, p000.d4b
        public boolean setCount(@dgc E element, int oldCount, int newCount) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: e4b$n */
    public static abstract class AbstractC5112n<E> extends AbstractC4593d3<E> {
        private AbstractC5112n() {
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: b */
        public int mo2917b() {
            return elementSet().size();
        }

        @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p000.d4b
        public Iterator<E> iterator() {
            return e4b.m9662f(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
        public int size() {
            return e4b.m9663g(this);
        }

        public /* synthetic */ AbstractC5112n(C5099a c5099a) {
            this();
        }
    }

    private e4b() {
    }

    /* JADX INFO: renamed from: a */
    public static <E> boolean m9657a(d4b<E> self, Collection<? extends E> elements) {
        v7d.checkNotNull(self);
        v7d.checkNotNull(elements);
        if (elements instanceof d4b) {
            return addAllImpl(self, m9658b(elements));
        }
        if (elements.isEmpty()) {
            return false;
        }
        return wg8.addAll(self, elements.iterator());
    }

    private static <E> boolean addAllImpl(d4b<E> self, d4b<? extends E> elements) {
        if (elements instanceof AbstractC12401s2) {
            return addAllImpl((d4b) self, (AbstractC12401s2) elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        for (d4b.InterfaceC4612a<? extends E> interfaceC4612a : elements.entrySet()) {
            self.add(interfaceC4612a.getElement(), interfaceC4612a.getCount());
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static <T> d4b<T> m9658b(Iterable<T> iterable) {
        return (d4b) iterable;
    }

    /* JADX INFO: renamed from: c */
    public static <E> Iterator<E> m9659c(Iterator<d4b.InterfaceC4612a<E>> entryIterator) {
        return new C5103e(entryIterator);
    }

    @op1
    public static boolean containsOccurrences(d4b<?> superMultiset, d4b<?> subMultiset) {
        v7d.checkNotNull(superMultiset);
        v7d.checkNotNull(subMultiset);
        for (d4b.InterfaceC4612a<?> interfaceC4612a : subMultiset.entrySet()) {
            if (superMultiset.count(interfaceC4612a.getElement()) < interfaceC4612a.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static <E> vx7<E> copyHighestCountFirst(d4b<E> multiset) {
        d4b.InterfaceC4612a[] interfaceC4612aArr = (d4b.InterfaceC4612a[]) multiset.entrySet().toArray(new d4b.InterfaceC4612a[0]);
        Arrays.sort(interfaceC4612aArr, C5105g.f31767a);
        return vx7.m24217e(Arrays.asList(interfaceC4612aArr));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9660d(d4b<?> multiset, @wx1 Object object) {
        if (object == multiset) {
            return true;
        }
        if (object instanceof d4b) {
            d4b d4bVar = (d4b) object;
            if (multiset.size() == d4bVar.size() && multiset.entrySet().size() == d4bVar.entrySet().size()) {
                for (d4b.InterfaceC4612a interfaceC4612a : d4bVar.entrySet()) {
                    if (multiset.count(interfaceC4612a.getElement()) != interfaceC4612a.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <E> d4b<E> difference(final d4b<E> multiset1, final d4b<?> multiset2) {
        v7d.checkNotNull(multiset1);
        v7d.checkNotNull(multiset2);
        return new C5102d(multiset1, multiset2);
    }

    /* JADX INFO: renamed from: e */
    public static int m9661e(Iterable<?> elements) {
        if (elements instanceof d4b) {
            return ((d4b) elements).elementSet().size();
        }
        return 11;
    }

    /* JADX INFO: renamed from: f */
    public static <E> Iterator<E> m9662f(d4b<E> multiset) {
        return new C5110l(multiset, multiset.entrySet().iterator());
    }

    public static <E> d4b<E> filter(d4b<E> unfiltered, l8d<? super E> predicate) {
        if (!(unfiltered instanceof C5108j)) {
            return new C5108j(unfiltered, predicate);
        }
        C5108j c5108j = (C5108j) unfiltered;
        return new C5108j(c5108j.f31768c, p8d.and(c5108j.f31769d, predicate));
    }

    /* JADX INFO: renamed from: g */
    public static int m9663g(d4b<?> multiset) {
        Iterator<d4b.InterfaceC4612a<?>> it = multiset.entrySet().iterator();
        long count = 0;
        while (it.hasNext()) {
            count += (long) it.next().getCount();
        }
        return rd8.saturatedCast(count);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m9664h(d4b<?> self, Collection<?> elementsToRemove) {
        if (elementsToRemove instanceof d4b) {
            elementsToRemove = ((d4b) elementsToRemove).elementSet();
        }
        return self.elementSet().removeAll(elementsToRemove);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m9665i(d4b<?> self, Collection<?> elementsToRetain) {
        v7d.checkNotNull(elementsToRetain);
        if (elementsToRetain instanceof d4b) {
            elementsToRetain = ((d4b) elementsToRetain).elementSet();
        }
        return self.elementSet().retainAll(elementsToRetain);
    }

    public static <E> d4b.InterfaceC4612a<E> immutableEntry(@dgc E e, int n) {
        return new C5109k(e, n);
    }

    public static <E> d4b<E> intersection(final d4b<E> multiset1, final d4b<?> multiset2) {
        v7d.checkNotNull(multiset1);
        v7d.checkNotNull(multiset2);
        return new C5100b(multiset1, multiset2);
    }

    /* JADX INFO: renamed from: j */
    public static <E> int m9666j(d4b<E> self, @dgc E element, int count) {
        s72.m21765b(count, "count");
        int iCount = self.count(element);
        int i = count - iCount;
        if (i > 0) {
            self.add(element, i);
        } else if (i < 0) {
            self.remove(element, -i);
        }
        return iCount;
    }

    /* JADX INFO: renamed from: k */
    public static <E> boolean m9667k(d4b<E> self, @dgc E element, int oldCount, int newCount) {
        s72.m21765b(oldCount, "oldCount");
        s72.m21765b(newCount, "newCount");
        if (self.count(element) != oldCount) {
            return false;
        }
        self.setCount(element, newCount);
        return true;
    }

    @op1
    public static boolean removeOccurrences(d4b<?> multisetToModify, Iterable<?> occurrencesToRemove) {
        if (occurrencesToRemove instanceof d4b) {
            return removeOccurrences(multisetToModify, (d4b<?>) occurrencesToRemove);
        }
        v7d.checkNotNull(multisetToModify);
        v7d.checkNotNull(occurrencesToRemove);
        Iterator<?> it = occurrencesToRemove.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= multisetToModify.remove(it.next());
        }
        return zRemove;
    }

    @op1
    public static boolean retainOccurrences(d4b<?> multisetToModify, d4b<?> multisetToRetain) {
        return retainOccurrencesImpl(multisetToModify, multisetToRetain);
    }

    private static <E> boolean retainOccurrencesImpl(d4b<E> multisetToModify, d4b<?> occurrencesToRetain) {
        v7d.checkNotNull(multisetToModify);
        v7d.checkNotNull(occurrencesToRetain);
        Iterator<d4b.InterfaceC4612a<E>> it = multisetToModify.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            d4b.InterfaceC4612a<E> next = it.next();
            int iCount = occurrencesToRetain.count(next.getElement());
            if (iCount == 0) {
                it.remove();
            } else if (iCount < next.getCount()) {
                multisetToModify.setCount(next.getElement(), iCount);
            }
            z = true;
        }
        return z;
    }

    public static <E> d4b<E> sum(final d4b<? extends E> multiset1, final d4b<? extends E> multiset2) {
        v7d.checkNotNull(multiset1);
        v7d.checkNotNull(multiset2);
        return new C5101c(multiset1, multiset2);
    }

    public static <E> d4b<E> union(final d4b<? extends E> multiset1, final d4b<? extends E> multiset2) {
        v7d.checkNotNull(multiset1);
        v7d.checkNotNull(multiset2);
        return new C5099a(multiset1, multiset2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> d4b<E> unmodifiableMultiset(d4b<? extends E> multiset) {
        return ((multiset instanceof C5111m) || (multiset instanceof vx7)) ? multiset : new C5111m((d4b) v7d.checkNotNull(multiset));
    }

    public static <E> ovf<E> unmodifiableSortedMultiset(ovf<E> sortedMultiset) {
        return new uuh((ovf) v7d.checkNotNull(sortedMultiset));
    }

    @Deprecated
    public static <E> d4b<E> unmodifiableMultiset(vx7<E> multiset) {
        return (d4b) v7d.checkNotNull(multiset);
    }

    private static <E> boolean addAllImpl(d4b<E> self, AbstractC12401s2<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        elements.m21652e(self);
        return true;
    }

    @op1
    public static boolean removeOccurrences(d4b<?> multisetToModify, d4b<?> occurrencesToRemove) {
        v7d.checkNotNull(multisetToModify);
        v7d.checkNotNull(occurrencesToRemove);
        Iterator<d4b.InterfaceC4612a<?>> it = multisetToModify.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            d4b.InterfaceC4612a<?> next = it.next();
            int iCount = occurrencesToRemove.count(next.getElement());
            if (iCount >= next.getCount()) {
                it.remove();
            } else if (iCount > 0) {
                multisetToModify.remove(next.getElement(), iCount);
            }
            z = true;
        }
        return z;
    }
}
