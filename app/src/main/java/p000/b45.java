package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p000.d4b;
import p000.e4b;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
@yg8
public final class b45<E extends Enum<E>> extends AbstractC4593d3<E> implements Serializable {

    @jd7
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    public transient Class<E> f12655c;

    /* JADX INFO: renamed from: d */
    public transient E[] f12656d;

    /* JADX INFO: renamed from: e */
    public transient int[] f12657e;

    /* JADX INFO: renamed from: f */
    public transient int f12658f;

    /* JADX INFO: renamed from: m */
    public transient long f12659m;

    /* JADX INFO: renamed from: b45$a */
    public class C1732a extends b45<E>.AbstractC1734c<E> {
        public C1732a() {
            super();
        }

        @Override // p000.b45.AbstractC1734c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E mo2920a(int i) {
            return (E) b45.this.f12656d[i];
        }
    }

    /* JADX INFO: renamed from: b45$b */
    public class C1733b extends b45<E>.AbstractC1734c<d4b.InterfaceC4612a<E>> {

        /* JADX INFO: renamed from: b45$b$a */
        public class a extends e4b.AbstractC5104f<E> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f12662a;

            public a(final int val$index) {
                this.f12662a = val$index;
            }

            @Override // p000.d4b.InterfaceC4612a
            public int getCount() {
                return b45.this.f12657e[this.f12662a];
            }

            @Override // p000.d4b.InterfaceC4612a
            public E getElement() {
                return (E) b45.this.f12656d[this.f12662a];
            }
        }

        public C1733b() {
            super();
        }

        @Override // p000.b45.AbstractC1734c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d4b.InterfaceC4612a<E> mo2920a(final int index) {
            return new a(index);
        }
    }

    /* JADX INFO: renamed from: b45$c */
    public abstract class AbstractC1734c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f12664a = 0;

        /* JADX INFO: renamed from: b */
        public int f12665b = -1;

        public AbstractC1734c() {
        }

        /* JADX INFO: renamed from: a */
        public abstract T mo2920a(int index);

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.f12664a < b45.this.f12656d.length) {
                int[] iArr = b45.this.f12657e;
                int i = this.f12664a;
                if (iArr[i] > 0) {
                    return true;
                }
                this.f12664a = i + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tMo2920a = mo2920a(this.f12664a);
            int i = this.f12664a;
            this.f12665b = i;
            this.f12664a = i + 1;
            return tMo2920a;
        }

        @Override // java.util.Iterator
        public void remove() {
            s72.m21768e(this.f12665b >= 0);
            if (b45.this.f12657e[this.f12665b] > 0) {
                b45.m2915g(b45.this);
                b45.m2916h(b45.this, r0.f12657e[this.f12665b]);
                b45.this.f12657e[this.f12665b] = 0;
            }
            this.f12665b = -1;
        }
    }

    private b45(Class<E> type) {
        this.f12655c = type;
        v7d.checkArgument(type.isEnum());
        E[] enumConstants = type.getEnumConstants();
        this.f12656d = enumConstants;
        this.f12657e = new int[enumConstants.length];
    }

    private void checkIsE(Object element) {
        v7d.checkNotNull(element);
        if (isActuallyE(element)) {
            return;
        }
        throw new ClassCastException("Expected an " + this.f12655c + " but got " + element);
    }

    public static <E extends Enum<E>> b45<E> create(Class<E> type) {
        return new b45<>(type);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m2915g(b45 b45Var) {
        int i = b45Var.f12658f;
        b45Var.f12658f = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ long m2916h(b45 b45Var, long j) {
        long j2 = b45Var.f12659m - j;
        b45Var.f12659m = j2;
        return j2;
    }

    private boolean isActuallyE(@wx1 Object o) {
        if (!(o instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) o;
        int iOrdinal = r5.ordinal();
        E[] eArr = this.f12656d;
        return iOrdinal < eArr.length && eArr[iOrdinal] == r5;
    }

    @jd7
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        Objects.requireNonNull(object);
        Class<E> cls = (Class) object;
        this.f12655c = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.f12656d = enumConstants;
        this.f12657e = new int[enumConstants.length];
        b1f.m2795f(this, stream);
    }

    @jd7
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.f12655c);
        b1f.m2800k(this, stream);
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: b */
    public int mo2917b() {
        return this.f12658f;
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: c */
    public Iterator<E> mo2918c() {
        return new C1732a();
    }

    @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.f12657e, 0);
        this.f12659m = 0L;
        this.f12658f = 0;
    }

    @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection, p000.d4b
    public /* bridge */ /* synthetic */ boolean contains(@wx1 Object element) {
        return super.contains(element);
    }

    @Override // p000.d4b
    public int count(@wx1 Object element) {
        if (element == null || !isActuallyE(element)) {
            return 0;
        }
        return this.f12657e[((Enum) element).ordinal()];
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: d */
    public Iterator<d4b.InterfaceC4612a<E>> mo2919d() {
        return new C1733b();
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p000.d4b
    public Iterator<E> iterator() {
        return e4b.m9662f(this);
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public int remove(@wx1 Object element, int occurrences) {
        if (element == null || !isActuallyE(element)) {
            return 0;
        }
        Enum r1 = (Enum) element;
        s72.m21765b(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        int iOrdinal = r1.ordinal();
        int[] iArr = this.f12657e;
        int i = iArr[iOrdinal];
        if (i == 0) {
            return 0;
        }
        if (i <= occurrences) {
            iArr[iOrdinal] = 0;
            this.f12658f--;
            this.f12659m -= (long) i;
        } else {
            iArr[iOrdinal] = i - occurrences;
            this.f12659m -= (long) occurrences;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
    public int size() {
        return rd8.saturatedCast(this.f12659m);
    }

    public static <E extends Enum<E>> b45<E> create(Iterable<E> elements) {
        Iterator<E> it = elements.iterator();
        v7d.checkArgument(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        b45<E> b45Var = new b45<>(it.next().getDeclaringClass());
        vg8.addAll(b45Var, elements);
        return b45Var;
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public int add(E element, int occurrences) {
        checkIsE(element);
        s72.m21765b(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        int iOrdinal = element.ordinal();
        int i = this.f12657e[iOrdinal];
        long j = occurrences;
        long j2 = ((long) i) + j;
        v7d.checkArgument(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.f12657e[iOrdinal] = (int) j2;
        if (i == 0) {
            this.f12658f++;
        }
        this.f12659m += j;
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public /* bridge */ /* synthetic */ boolean setCount(@dgc Object element, int oldCount, int newCount) {
        return super.setCount(element, oldCount, newCount);
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public int setCount(E element, int count) {
        checkIsE(element);
        s72.m21765b(count, "count");
        int iOrdinal = element.ordinal();
        int[] iArr = this.f12657e;
        int i = iArr[iOrdinal];
        iArr[iOrdinal] = count;
        this.f12659m += (long) (count - i);
        if (i == 0 && count > 0) {
            this.f12658f++;
        } else if (i > 0 && count == 0) {
            this.f12658f--;
        }
        return i;
    }

    public static <E extends Enum<E>> b45<E> create(Iterable<E> elements, Class<E> type) {
        b45<E> b45VarCreate = create(type);
        vg8.addAll(b45VarCreate, elements);
        return b45VarCreate;
    }
}
