package p000;

import com.google.j2objc.annotations.RetainedWith;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p000.ax7;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public abstract class dy7<E> extends ax7<E> implements Set<E> {

    /* JADX INFO: renamed from: c */
    public static final int f31294c = 1073741824;

    /* JADX INFO: renamed from: d */
    public static final double f31295d = 0.7d;

    /* JADX INFO: renamed from: e */
    public static final int f31296e = 751619276;

    /* JADX INFO: renamed from: b */
    @RetainedWith
    @wx1
    @ez8
    public transient kx7<E> f31297b;

    /* JADX INFO: renamed from: dy7$a */
    public static class C5007a<E> extends ax7.AbstractC1636a<E> {

        /* JADX INFO: renamed from: e */
        @gdi
        @wx1
        public Object[] f31298e;

        /* JADX INFO: renamed from: f */
        public int f31299f;

        public C5007a() {
            super(4);
        }

        private void addDeduping(E element) {
            Objects.requireNonNull(this.f31298e);
            int length = this.f31298e.length - 1;
            int iHashCode = element.hashCode();
            int iM25911c = yh7.m25911c(iHashCode);
            while (true) {
                int i = iM25911c & length;
                Object[] objArr = this.f31298e;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = element;
                    this.f31299f += iHashCode;
                    super.add((Object) element);
                    return;
                } else if (obj.equals(element)) {
                    return;
                } else {
                    iM25911c = i + 1;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @op1
        /* JADX INFO: renamed from: c */
        public C5007a<E> mo9584c(C5007a<E> other) {
            if (this.f31298e != null) {
                for (int i = 0; i < other.f12101c; i++) {
                    Object obj = other.f12100b[i];
                    Objects.requireNonNull(obj);
                    add(obj);
                }
            } else {
                m2722b(other.f12100b, other.f12101c);
            }
            return this;
        }

        public C5007a(int capacity) {
            super(capacity);
            this.f31298e = new Object[dy7.m9574g(capacity)];
        }

        @Override // p000.ax7.AbstractC1637b
        public dy7<E> build() {
            dy7<E> dy7VarConstruct;
            int i = this.f12101c;
            if (i == 0) {
                return dy7.m9575of();
            }
            if (i == 1) {
                Object obj = this.f12100b[0];
                Objects.requireNonNull(obj);
                return dy7.m9576of(obj);
            }
            if (this.f31298e == null || dy7.m9574g(i) != this.f31298e.length) {
                dy7VarConstruct = dy7.construct(this.f12101c, this.f12100b);
                this.f12101c = dy7VarConstruct.size();
            } else {
                Object[] objArrCopyOf = dy7.shouldTrim(this.f12101c, this.f12100b.length) ? Arrays.copyOf(this.f12100b, this.f12101c) : this.f12100b;
                dy7VarConstruct = new oxd<>(objArrCopyOf, this.f31299f, this.f31298e, r5.length - 1, this.f12101c);
            }
            this.f12102d = true;
            this.f31298e = null;
            return dy7VarConstruct;
        }

        @Override // p000.ax7.AbstractC1636a, p000.ax7.AbstractC1637b
        @op1
        public C5007a<E> addAll(Iterable<? extends E> elements) {
            v7d.checkNotNull(elements);
            if (this.f31298e != null) {
                Iterator<? extends E> it = elements.iterator();
                while (it.hasNext()) {
                    add((Object) it.next());
                }
            } else {
                super.addAll((Iterable) elements);
            }
            return this;
        }

        @Override // p000.ax7.AbstractC1636a, p000.ax7.AbstractC1637b
        @op1
        public C5007a<E> add(E element) {
            v7d.checkNotNull(element);
            if (this.f31298e != null && dy7.m9574g(this.f12101c) <= this.f31298e.length) {
                addDeduping(element);
                return this;
            }
            this.f31298e = null;
            super.add((Object) element);
            return this;
        }

        @Override // p000.ax7.AbstractC1637b
        @op1
        public C5007a<E> addAll(Iterator<? extends E> elements) {
            v7d.checkNotNull(elements);
            while (elements.hasNext()) {
                add((Object) elements.next());
            }
            return this;
        }

        @Override // p000.ax7.AbstractC1636a, p000.ax7.AbstractC1637b
        @op1
        public C5007a<E> add(E... elements) {
            if (this.f31298e != null) {
                for (E e : elements) {
                    add((Object) e);
                }
            } else {
                super.add((Object[]) elements);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: dy7$b */
    @yg8
    public static class C5008b implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Object[] f31300a;

        public C5008b(Object[] elements) {
            this.f31300a = elements;
        }

        public Object readResolve() {
            return dy7.copyOf(this.f31300a);
        }
    }

    public static <E> C5007a<E> builder() {
        return new C5007a<>();
    }

    public static <E> C5007a<E> builderWithExpectedSize(int expectedSize) {
        s72.m21765b(expectedSize, "expectedSize");
        return new C5007a<>(expectedSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> dy7<E> construct(int n, Object... elements) {
        if (n == 0) {
            return m9575of();
        }
        if (n == 1) {
            Object obj = elements[0];
            Objects.requireNonNull(obj);
            return m9576of(obj);
        }
        int iM9574g = m9574g(n);
        Object[] objArr = new Object[iM9574g];
        int i = iM9574g - 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < n; i4++) {
            Object objM19531a = pjb.m19531a(elements[i4], i4);
            int iHashCode = objM19531a.hashCode();
            int iM25911c = yh7.m25911c(iHashCode);
            while (true) {
                int i5 = iM25911c & i;
                Object obj2 = objArr[i5];
                if (obj2 == null) {
                    elements[i3] = objM19531a;
                    objArr[i5] = objM19531a;
                    i2 += iHashCode;
                    i3++;
                    break;
                }
                if (obj2.equals(objM19531a)) {
                    break;
                }
                iM25911c++;
            }
        }
        Arrays.fill(elements, i3, n, (Object) null);
        if (i3 == 1) {
            Object obj3 = elements[0];
            Objects.requireNonNull(obj3);
            return new tpf(obj3);
        }
        if (m9574g(i3) < iM9574g / 2) {
            return construct(i3, elements);
        }
        if (shouldTrim(i3, elements.length)) {
            elements = Arrays.copyOf(elements, i3);
        }
        return new oxd(elements, i2, objArr, i, i3);
    }

    public static <E> dy7<E> copyOf(Collection<? extends E> elements) {
        if ((elements instanceof dy7) && !(elements instanceof SortedSet)) {
            dy7<E> dy7Var = (dy7) elements;
            if (!dy7Var.isPartialView()) {
                return dy7Var;
            }
        }
        Object[] array = elements.toArray();
        return construct(array.length, array);
    }

    @gdi
    /* JADX INFO: renamed from: g */
    public static int m9574g(int setSize) {
        int iMax = Math.max(setSize, 2);
        if (iMax >= 751619276) {
            v7d.checkArgument(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: of */
    public static <E> dy7<E> m9575of() {
        return oxd.f69163M;
    }

    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int actualUnique, int expectedUnique) {
        return actualUnique < (expectedUnique >> 1) + (expectedUnique >> 2);
    }

    @Override // p000.ax7
    public kx7<E> asList() {
        kx7<E> kx7Var = this.f31297b;
        if (kx7Var != null) {
            return kx7Var;
        }
        kx7<E> kx7VarMo9582h = mo9582h();
        this.f31297b = kx7VarMo9582h;
        return kx7VarMo9582h;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if ((object instanceof dy7) && mo9583i() && ((dy7) object).mo9583i() && hashCode() != object.hashCode()) {
            return false;
        }
        return t6f.m22396a(this, object);
    }

    /* JADX INFO: renamed from: h */
    public kx7<E> mo9582h() {
        return kx7.m15108e(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return t6f.m22397b(this);
    }

    /* JADX INFO: renamed from: i */
    public boolean mo9583i() {
        return false;
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract quh<E> iterator();

    @Override // p000.ax7
    @yg8
    public Object writeReplace() {
        return new C5008b(toArray());
    }

    /* JADX INFO: renamed from: of */
    public static <E> dy7<E> m9576of(E element) {
        return new tpf(element);
    }

    /* JADX INFO: renamed from: of */
    public static <E> dy7<E> m9577of(E e1, E e2) {
        return construct(2, e1, e2);
    }

    /* JADX INFO: renamed from: of */
    public static <E> dy7<E> m9578of(E e1, E e2, E e3) {
        return construct(3, e1, e2, e3);
    }

    /* JADX INFO: renamed from: of */
    public static <E> dy7<E> m9579of(E e1, E e2, E e3, E e4) {
        return construct(4, e1, e2, e3, e4);
    }

    public static <E> dy7<E> copyOf(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return copyOf((Collection) elements);
        }
        return copyOf(elements.iterator());
    }

    /* JADX INFO: renamed from: of */
    public static <E> dy7<E> m9580of(E e1, E e2, E e3, E e4, E e5) {
        return construct(5, e1, e2, e3, e4, e5);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: of */
    public static <E> dy7<E> m9581of(E e1, E e2, E e3, E e4, E e5, E e6, E... others) {
        v7d.checkArgument(others.length <= 2147483641, "the total number of elements must fit in an int");
        int length = others.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e1;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(others, 0, objArr, 6, others.length);
        return construct(length, objArr);
    }

    public static <E> dy7<E> copyOf(Iterator<? extends E> elements) {
        if (!elements.hasNext()) {
            return m9575of();
        }
        E next = elements.next();
        if (!elements.hasNext()) {
            return m9576of((Object) next);
        }
        return new C5007a().add((Object) next).addAll((Iterator) elements).build();
    }

    public static <E> dy7<E> copyOf(E[] elements) {
        int length = elements.length;
        if (length == 0) {
            return m9575of();
        }
        if (length != 1) {
            return construct(elements.length, (Object[]) elements.clone());
        }
        return m9576of((Object) elements[0]);
    }
}
