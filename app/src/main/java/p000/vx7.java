package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p000.ax7;
import p000.d4b;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public abstract class vx7<E> extends wx7<E> implements d4b<E> {

    /* JADX INFO: renamed from: b */
    @wx1
    @ez8
    public transient kx7<E> f92544b;

    /* JADX INFO: renamed from: c */
    @wx1
    @ez8
    public transient dy7<d4b.InterfaceC4612a<E>> f92545c;

    /* JADX INFO: renamed from: vx7$a */
    public class C14286a extends quh<E> {

        /* JADX INFO: renamed from: a */
        public int f92546a;

        /* JADX INFO: renamed from: b */
        @wx1
        public E f92547b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Iterator f92548c;

        public C14286a(final vx7 this$0, final Iterator val$entryIterator) {
            this.f92548c = val$entryIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f92546a > 0 || this.f92548c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f92546a <= 0) {
                d4b.InterfaceC4612a interfaceC4612a = (d4b.InterfaceC4612a) this.f92548c.next();
                this.f92547b = (E) interfaceC4612a.getElement();
                this.f92546a = interfaceC4612a.getCount();
            }
            this.f92546a--;
            E e = this.f92547b;
            Objects.requireNonNull(e);
            return e;
        }
    }

    /* JADX INFO: renamed from: vx7$b */
    public static class C14287b<E> extends ax7.AbstractC1637b<E> {

        /* JADX INFO: renamed from: b */
        @wx1
        public qjb<E> f92549b;

        /* JADX INFO: renamed from: c */
        public boolean f92550c;

        /* JADX INFO: renamed from: d */
        public boolean f92551d;

        public C14287b() {
            this(4);
        }

        @wx1
        /* JADX INFO: renamed from: b */
        public static <T> qjb<T> m24225b(Iterable<T> iterable) {
            if (iterable instanceof nxd) {
                return ((nxd) iterable).f65970d;
            }
            if (iterable instanceof AbstractC12401s2) {
                return ((AbstractC12401s2) iterable).f80399c;
            }
            return null;
        }

        @op1
        public C14287b<E> addCopies(E element, int occurrences) {
            Objects.requireNonNull(this.f92549b);
            if (occurrences == 0) {
                return this;
            }
            if (this.f92550c) {
                this.f92549b = new qjb<>(this.f92549b);
                this.f92551d = false;
            }
            this.f92550c = false;
            v7d.checkNotNull(element);
            qjb<E> qjbVar = this.f92549b;
            qjbVar.put(element, occurrences + qjbVar.get(element));
            return this;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @op1
        public C14287b<E> setCount(E e, int i) {
            Objects.requireNonNull(this.f92549b);
            if (i == 0 && !this.f92551d) {
                this.f92549b = new rjb(this.f92549b);
                this.f92551d = true;
            } else if (this.f92550c) {
                this.f92549b = new qjb<>(this.f92549b);
                this.f92551d = false;
            }
            this.f92550c = false;
            v7d.checkNotNull(e);
            if (i == 0) {
                this.f92549b.remove(e);
            } else {
                this.f92549b.put((E) v7d.checkNotNull(e), i);
            }
            return this;
        }

        public C14287b(int estimatedDistinct) {
            this.f92550c = false;
            this.f92551d = false;
            this.f92549b = qjb.m20386b(estimatedDistinct);
        }

        @Override // p000.ax7.AbstractC1637b
        public vx7<E> build() {
            Objects.requireNonNull(this.f92549b);
            if (this.f92549b.m20401q() == 0) {
                return vx7.m24218of();
            }
            if (this.f92551d) {
                this.f92549b = new qjb<>(this.f92549b);
                this.f92551d = false;
            }
            this.f92550c = true;
            return new nxd(this.f92549b);
        }

        @Override // p000.ax7.AbstractC1637b
        @op1
        public C14287b<E> add(E element) {
            return addCopies(element, 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ax7.AbstractC1637b
        @op1
        public C14287b<E> addAll(Iterable<? extends E> elements) {
            Objects.requireNonNull(this.f92549b);
            if (elements instanceof d4b) {
                d4b d4bVarM9658b = e4b.m9658b(elements);
                qjb qjbVarM24225b = m24225b(d4bVarM9658b);
                if (qjbVarM24225b != null) {
                    qjb<E> qjbVar = this.f92549b;
                    qjbVar.m20387c(Math.max(qjbVar.m20401q(), qjbVarM24225b.m20401q()));
                    for (int iMo20388d = qjbVarM24225b.mo20388d(); iMo20388d >= 0; iMo20388d = qjbVarM24225b.mo20396l(iMo20388d)) {
                        addCopies(qjbVarM24225b.m20390f(iMo20388d), qjbVarM24225b.m20391g(iMo20388d));
                    }
                } else {
                    Set<d4b.InterfaceC4612a<E>> setEntrySet = d4bVarM9658b.entrySet();
                    qjb<E> qjbVar2 = this.f92549b;
                    qjbVar2.m20387c(Math.max(qjbVar2.m20401q(), setEntrySet.size()));
                    for (d4b.InterfaceC4612a<E> interfaceC4612a : d4bVarM9658b.entrySet()) {
                        addCopies(interfaceC4612a.getElement(), interfaceC4612a.getCount());
                    }
                }
            } else {
                super.addAll((Iterable) elements);
            }
            return this;
        }

        @Override // p000.ax7.AbstractC1637b
        @op1
        public C14287b<E> add(E... elements) {
            super.add((Object[]) elements);
            return this;
        }

        public C14287b(boolean forSubtype) {
            this.f92550c = false;
            this.f92551d = false;
            this.f92549b = null;
        }

        @Override // p000.ax7.AbstractC1637b
        @op1
        public C14287b<E> addAll(Iterator<? extends E> elements) {
            super.addAll((Iterator) elements);
            return this;
        }
    }

    /* JADX INFO: renamed from: vx7$c */
    public final class C14288c extends p08<d4b.InterfaceC4612a<E>> {

        @yg8
        private static final long serialVersionUID = 0;

        private C14288c() {
        }

        @jd7
        @yg8
        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object o) {
            if (!(o instanceof d4b.InterfaceC4612a)) {
                return false;
            }
            d4b.InterfaceC4612a interfaceC4612a = (d4b.InterfaceC4612a) o;
            return interfaceC4612a.getCount() > 0 && vx7.this.count(interfaceC4612a.getElement()) == interfaceC4612a.getCount();
        }

        @Override // p000.dy7, java.util.Collection, java.util.Set
        public int hashCode() {
            return vx7.this.hashCode();
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return vx7.this.isPartialView();
        }

        @Override // p000.p08
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public d4b.InterfaceC4612a<E> get(int index) {
            return vx7.this.mo8961f(index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return vx7.this.elementSet().size();
        }

        @Override // p000.dy7, p000.ax7
        @jd7
        @yg8
        public Object writeReplace() {
            return new C14289d(vx7.this);
        }

        public /* synthetic */ C14288c(vx7 vx7Var, C14286a c14286a) {
            this();
        }
    }

    /* JADX INFO: renamed from: vx7$d */
    @jd7
    @yg8
    public static class C14289d<E> implements Serializable {

        /* JADX INFO: renamed from: a */
        public final vx7<E> f92553a;

        public C14289d(vx7<E> multiset) {
            this.f92553a = multiset;
        }

        public Object readResolve() {
            return this.f92553a.entrySet();
        }
    }

    public static <E> C14287b<E> builder() {
        return new C14287b<>();
    }

    private static <E> vx7<E> copyFromElements(E... elements) {
        return new C14287b().add((Object[]) elements).build();
    }

    public static <E> vx7<E> copyOf(E[] elements) {
        return copyFromElements(elements);
    }

    private dy7<d4b.InterfaceC4612a<E>> createEntrySet() {
        return isEmpty() ? dy7.m9575of() : new C14288c(this, null);
    }

    /* JADX INFO: renamed from: e */
    public static <E> vx7<E> m24217e(Collection<? extends d4b.InterfaceC4612a<? extends E>> entries) {
        C14287b c14287b = new C14287b(entries.size());
        for (d4b.InterfaceC4612a<? extends E> interfaceC4612a : entries) {
            c14287b.addCopies(interfaceC4612a.getElement(), interfaceC4612a.getCount());
        }
        return c14287b.build();
    }

    /* JADX INFO: renamed from: of */
    public static <E> vx7<E> m24218of() {
        return nxd.f65969m;
    }

    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p000.ax7
    @jd7
    /* JADX INFO: renamed from: a */
    public int mo2718a(Object[] dst, int offset) {
        quh<d4b.InterfaceC4612a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            d4b.InterfaceC4612a<E> next = it.next();
            Arrays.fill(dst, offset, next.getCount() + offset, next.getElement());
            offset += next.getCount();
        }
        return offset;
    }

    @Override // p000.d4b
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final int add(E element, int occurrences) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ax7
    public kx7<E> asList() {
        kx7<E> kx7Var = this.f92544b;
        if (kx7Var != null) {
            return kx7Var;
        }
        kx7<E> kx7VarAsList = super.asList();
        this.f92544b = kx7VarAsList;
        return kx7VarAsList;
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object object) {
        return count(object) > 0;
    }

    @Override // p000.d4b
    public abstract dy7<E> elementSet();

    @Override // java.util.Collection, p000.d4b
    public boolean equals(@wx1 Object object) {
        return e4b.m9660d(this, object);
    }

    /* JADX INFO: renamed from: f */
    public abstract d4b.InterfaceC4612a<E> mo8961f(int index);

    @Override // java.util.Collection, p000.d4b
    public int hashCode() {
        return t6f.m22397b(entrySet());
    }

    @Override // p000.d4b
    @hh4("Always throws UnsupportedOperationException")
    @op1
    @Deprecated
    public final int remove(@wx1 Object element, int occurrences) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.d4b
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final int setCount(E element, int count) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, p000.d4b
    public String toString() {
        return entrySet().toString();
    }

    @Override // p000.ax7
    @jd7
    @yg8
    public abstract Object writeReplace();

    public static <E> vx7<E> copyOf(Iterable<? extends E> elements) {
        if (elements instanceof vx7) {
            vx7<E> vx7Var = (vx7) elements;
            if (!vx7Var.isPartialView()) {
                return vx7Var;
            }
        }
        C14287b c14287b = new C14287b(e4b.m9661e(elements));
        c14287b.addAll((Iterable) elements);
        return c14287b.build();
    }

    /* JADX INFO: renamed from: of */
    public static <E> vx7<E> m24219of(E element) {
        return copyFromElements(element);
    }

    @Override // p000.d4b
    public dy7<d4b.InterfaceC4612a<E>> entrySet() {
        dy7<d4b.InterfaceC4612a<E>> dy7Var = this.f92545c;
        if (dy7Var != null) {
            return dy7Var;
        }
        dy7<d4b.InterfaceC4612a<E>> dy7VarCreateEntrySet = createEntrySet();
        this.f92545c = dy7VarCreateEntrySet;
        return dy7VarCreateEntrySet;
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public quh<E> iterator() {
        return new C14286a(this, entrySet().iterator());
    }

    @Override // p000.d4b
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final boolean setCount(E element, int oldCount, int newCount) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: of */
    public static <E> vx7<E> m24220of(E e1, E e2) {
        return copyFromElements(e1, e2);
    }

    /* JADX INFO: renamed from: of */
    public static <E> vx7<E> m24221of(E e1, E e2, E e3) {
        return copyFromElements(e1, e2, e3);
    }

    /* JADX INFO: renamed from: of */
    public static <E> vx7<E> m24222of(E e1, E e2, E e3, E e4) {
        return copyFromElements(e1, e2, e3, e4);
    }

    /* JADX INFO: renamed from: of */
    public static <E> vx7<E> m24223of(E e1, E e2, E e3, E e4, E e5) {
        return copyFromElements(e1, e2, e3, e4, e5);
    }

    /* JADX INFO: renamed from: of */
    public static <E> vx7<E> m24224of(E e1, E e2, E e3, E e4, E e5, E e6, E... others) {
        return new C14287b().add((Object) e1).add((Object) e2).add((Object) e3).add((Object) e4).add((Object) e5).add((Object) e6).add((Object[]) others).build();
    }

    public static <E> vx7<E> copyOf(Iterator<? extends E> elements) {
        return new C14287b().addAll((Iterator) elements).build();
    }
}
