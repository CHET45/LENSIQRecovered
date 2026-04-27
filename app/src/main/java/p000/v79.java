package p000;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class v79<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: F */
    public static final Comparator<Comparable> f90207F = new C13919a();

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ boolean f90208H = false;

    /* JADX INFO: renamed from: C */
    public v79<K, V>.C13923e f90209C;

    /* JADX INFO: renamed from: a */
    public Comparator<? super K> f90210a;

    /* JADX INFO: renamed from: b */
    public C13925g<K, V>[] f90211b;

    /* JADX INFO: renamed from: c */
    public final C13925g<K, V> f90212c;

    /* JADX INFO: renamed from: d */
    public int f90213d;

    /* JADX INFO: renamed from: e */
    public int f90214e;

    /* JADX INFO: renamed from: f */
    public int f90215f;

    /* JADX INFO: renamed from: m */
    public v79<K, V>.C13922d f90216m;

    /* JADX INFO: renamed from: v79$a */
    public class C13919a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: renamed from: v79$b */
    public static final class C13920b<K, V> {

        /* JADX INFO: renamed from: a */
        public C13925g<K, V> f90217a;

        /* JADX INFO: renamed from: b */
        public int f90218b;

        /* JADX INFO: renamed from: c */
        public int f90219c;

        /* JADX INFO: renamed from: d */
        public int f90220d;

        /* JADX INFO: renamed from: a */
        public void m23837a(C13925g<K, V> c13925g) {
            c13925g.f90234c = null;
            c13925g.f90232a = null;
            c13925g.f90233b = null;
            c13925g.f90231F = 1;
            int i = this.f90218b;
            if (i > 0) {
                int i2 = this.f90220d;
                if ((i2 & 1) == 0) {
                    this.f90220d = i2 + 1;
                    this.f90218b = i - 1;
                    this.f90219c++;
                }
            }
            c13925g.f90232a = this.f90217a;
            this.f90217a = c13925g;
            int i3 = this.f90220d;
            int i4 = i3 + 1;
            this.f90220d = i4;
            int i5 = this.f90218b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.f90220d = i3 + 2;
                this.f90218b = i5 - 1;
                this.f90219c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.f90220d & i7) != i7) {
                    return;
                }
                int i8 = this.f90219c;
                if (i8 == 0) {
                    C13925g<K, V> c13925g2 = this.f90217a;
                    C13925g<K, V> c13925g3 = c13925g2.f90232a;
                    C13925g<K, V> c13925g4 = c13925g3.f90232a;
                    c13925g3.f90232a = c13925g4.f90232a;
                    this.f90217a = c13925g3;
                    c13925g3.f90233b = c13925g4;
                    c13925g3.f90234c = c13925g2;
                    c13925g3.f90231F = c13925g2.f90231F + 1;
                    c13925g4.f90232a = c13925g3;
                    c13925g2.f90232a = c13925g3;
                } else if (i8 == 1) {
                    C13925g<K, V> c13925g5 = this.f90217a;
                    C13925g<K, V> c13925g6 = c13925g5.f90232a;
                    this.f90217a = c13925g6;
                    c13925g6.f90234c = c13925g5;
                    c13925g6.f90231F = c13925g5.f90231F + 1;
                    c13925g5.f90232a = c13925g6;
                    this.f90219c = 0;
                } else if (i8 == 2) {
                    this.f90219c = 0;
                }
                i6 *= 2;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m23838b(int i) {
            this.f90218b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f90220d = 0;
            this.f90219c = 0;
            this.f90217a = null;
        }

        /* JADX INFO: renamed from: c */
        public C13925g<K, V> m23839c() {
            C13925g<K, V> c13925g = this.f90217a;
            if (c13925g.f90232a == null) {
                return c13925g;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: v79$c */
    public static class C13921c<K, V> {

        /* JADX INFO: renamed from: a */
        public C13925g<K, V> f90221a;

        /* JADX INFO: renamed from: a */
        public void m23840a(C13925g<K, V> c13925g) {
            C13925g<K, V> c13925g2 = null;
            while (c13925g != null) {
                c13925g.f90232a = c13925g2;
                c13925g2 = c13925g;
                c13925g = c13925g.f90233b;
            }
            this.f90221a = c13925g2;
        }

        public C13925g<K, V> next() {
            C13925g<K, V> c13925g = this.f90221a;
            if (c13925g == null) {
                return null;
            }
            C13925g<K, V> c13925g2 = c13925g.f90232a;
            c13925g.f90232a = null;
            C13925g<K, V> c13925g3 = c13925g.f90234c;
            while (true) {
                C13925g<K, V> c13925g4 = c13925g2;
                c13925g2 = c13925g3;
                if (c13925g2 == null) {
                    this.f90221a = c13925g4;
                    return c13925g;
                }
                c13925g2.f90232a = c13925g4;
                c13925g3 = c13925g2.f90233b;
            }
        }
    }

    /* JADX INFO: renamed from: v79$d */
    public final class C13922d extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: v79$d$a */
        public class a extends v79<K, V>.AbstractC13924f<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return m23841a();
            }
        }

        public C13922d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            v79.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && v79.this.m23833c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C13925g<K, V> c13925gM23833c;
            if (!(obj instanceof Map.Entry) || (c13925gM23833c = v79.this.m23833c((Map.Entry) obj)) == null) {
                return false;
            }
            v79.this.m23835e(c13925gM23833c, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v79.this.f90213d;
        }
    }

    /* JADX INFO: renamed from: v79$e */
    public final class C13923e extends AbstractSet<K> {

        /* JADX INFO: renamed from: v79$e$a */
        public class a extends v79<K, V>.AbstractC13924f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m23841a().f90237f;
            }
        }

        public C13923e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            v79.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return v79.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return v79.this.m23836f(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v79.this.f90213d;
        }
    }

    /* JADX INFO: renamed from: v79$f */
    public abstract class AbstractC13924f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public C13925g<K, V> f90226a;

        /* JADX INFO: renamed from: b */
        public C13925g<K, V> f90227b = null;

        /* JADX INFO: renamed from: c */
        public int f90228c;

        public AbstractC13924f() {
            this.f90226a = v79.this.f90212c.f90235d;
            this.f90228c = v79.this.f90214e;
        }

        /* JADX INFO: renamed from: a */
        public final C13925g<K, V> m23841a() {
            C13925g<K, V> c13925g = this.f90226a;
            v79 v79Var = v79.this;
            if (c13925g == v79Var.f90212c) {
                throw new NoSuchElementException();
            }
            if (v79Var.f90214e != this.f90228c) {
                throw new ConcurrentModificationException();
            }
            this.f90226a = c13925g.f90235d;
            this.f90227b = c13925g;
            return c13925g;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f90226a != v79.this.f90212c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C13925g<K, V> c13925g = this.f90227b;
            if (c13925g == null) {
                throw new IllegalStateException();
            }
            v79.this.m23835e(c13925g, true);
            this.f90227b = null;
            this.f90228c = v79.this.f90214e;
        }
    }

    public v79() {
        this(null);
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> C13925g<K, V>[] m23831a(C13925g<K, V>[] c13925gArr) {
        int length = c13925gArr.length;
        C13925g<K, V>[] c13925gArr2 = new C13925g[length * 2];
        C13921c c13921c = new C13921c();
        C13920b c13920b = new C13920b();
        C13920b c13920b2 = new C13920b();
        for (int i = 0; i < length; i++) {
            C13925g<K, V> c13925g = c13925gArr[i];
            if (c13925g != null) {
                c13921c.m23840a(c13925g);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C13925g<K, V> next = c13921c.next();
                    if (next == null) {
                        break;
                    }
                    if ((next.f90238m & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                c13920b.m23838b(i2);
                c13920b2.m23838b(i3);
                c13921c.m23840a(c13925g);
                while (true) {
                    C13925g<K, V> next2 = c13921c.next();
                    if (next2 == null) {
                        break;
                    }
                    if ((next2.f90238m & length) == 0) {
                        c13920b.m23837a(next2);
                    } else {
                        c13920b2.m23837a(next2);
                    }
                }
                c13925gArr2[i] = i2 > 0 ? c13920b.m23839c() : null;
                c13925gArr2[i + length] = i3 > 0 ? c13920b2.m23839c() : null;
            }
        }
        return c13925gArr2;
    }

    private void doubleCapacity() {
        C13925g<K, V>[] c13925gArrM23831a = m23831a(this.f90211b);
        this.f90211b = c13925gArrM23831a;
        this.f90215f = (c13925gArrM23831a.length / 2) + (c13925gArrM23831a.length / 4);
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void rebalance(C13925g<K, V> c13925g, boolean z) {
        while (c13925g != null) {
            C13925g<K, V> c13925g2 = c13925g.f90233b;
            C13925g<K, V> c13925g3 = c13925g.f90234c;
            int i = c13925g2 != null ? c13925g2.f90231F : 0;
            int i2 = c13925g3 != null ? c13925g3.f90231F : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C13925g<K, V> c13925g4 = c13925g3.f90233b;
                C13925g<K, V> c13925g5 = c13925g3.f90234c;
                int i4 = (c13925g4 != null ? c13925g4.f90231F : 0) - (c13925g5 != null ? c13925g5.f90231F : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    rotateLeft(c13925g);
                } else {
                    rotateRight(c13925g3);
                    rotateLeft(c13925g);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C13925g<K, V> c13925g6 = c13925g2.f90233b;
                C13925g<K, V> c13925g7 = c13925g2.f90234c;
                int i5 = (c13925g6 != null ? c13925g6.f90231F : 0) - (c13925g7 != null ? c13925g7.f90231F : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    rotateRight(c13925g);
                } else {
                    rotateLeft(c13925g2);
                    rotateRight(c13925g);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c13925g.f90231F = i + 1;
                if (z) {
                    return;
                }
            } else {
                c13925g.f90231F = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c13925g = c13925g.f90232a;
        }
    }

    private void replaceInParent(C13925g<K, V> c13925g, C13925g<K, V> c13925g2) {
        C13925g<K, V> c13925g3 = c13925g.f90232a;
        c13925g.f90232a = null;
        if (c13925g2 != null) {
            c13925g2.f90232a = c13925g3;
        }
        if (c13925g3 == null) {
            int i = c13925g.f90238m;
            this.f90211b[i & (r0.length - 1)] = c13925g2;
        } else if (c13925g3.f90233b == c13925g) {
            c13925g3.f90233b = c13925g2;
        } else {
            c13925g3.f90234c = c13925g2;
        }
    }

    private void rotateLeft(C13925g<K, V> c13925g) {
        C13925g<K, V> c13925g2 = c13925g.f90233b;
        C13925g<K, V> c13925g3 = c13925g.f90234c;
        C13925g<K, V> c13925g4 = c13925g3.f90233b;
        C13925g<K, V> c13925g5 = c13925g3.f90234c;
        c13925g.f90234c = c13925g4;
        if (c13925g4 != null) {
            c13925g4.f90232a = c13925g;
        }
        replaceInParent(c13925g, c13925g3);
        c13925g3.f90233b = c13925g;
        c13925g.f90232a = c13925g3;
        int iMax = Math.max(c13925g2 != null ? c13925g2.f90231F : 0, c13925g4 != null ? c13925g4.f90231F : 0) + 1;
        c13925g.f90231F = iMax;
        c13925g3.f90231F = Math.max(iMax, c13925g5 != null ? c13925g5.f90231F : 0) + 1;
    }

    private void rotateRight(C13925g<K, V> c13925g) {
        C13925g<K, V> c13925g2 = c13925g.f90233b;
        C13925g<K, V> c13925g3 = c13925g.f90234c;
        C13925g<K, V> c13925g4 = c13925g2.f90233b;
        C13925g<K, V> c13925g5 = c13925g2.f90234c;
        c13925g.f90233b = c13925g5;
        if (c13925g5 != null) {
            c13925g5.f90232a = c13925g;
        }
        replaceInParent(c13925g, c13925g2);
        c13925g2.f90234c = c13925g;
        c13925g.f90232a = c13925g2;
        int iMax = Math.max(c13925g3 != null ? c13925g3.f90231F : 0, c13925g5 != null ? c13925g5.f90231F : 0) + 1;
        c13925g.f90231F = iMax;
        c13925g2.f90231F = Math.max(iMax, c13925g4 != null ? c13925g4.f90231F : 0) + 1;
    }

    private static int secondaryHash(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* JADX INFO: renamed from: b */
    public C13925g<K, V> m23832b(K k, boolean z) {
        int iCompareTo;
        C13925g<K, V> c13925g;
        Comparator<? super K> comparator = this.f90210a;
        C13925g<K, V>[] c13925gArr = this.f90211b;
        int iSecondaryHash = secondaryHash(k.hashCode());
        int length = (c13925gArr.length - 1) & iSecondaryHash;
        C13925g<K, V> c13925g2 = c13925gArr[length];
        if (c13925g2 != null) {
            Comparable comparable = comparator == f90207F ? (Comparable) k : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(c13925g2.f90237f) : comparator.compare(k, c13925g2.f90237f);
                if (iCompareTo == 0) {
                    return c13925g2;
                }
                C13925g<K, V> c13925g3 = iCompareTo < 0 ? c13925g2.f90233b : c13925g2.f90234c;
                if (c13925g3 == null) {
                    break;
                }
                c13925g2 = c13925g3;
            }
        } else {
            iCompareTo = 0;
        }
        C13925g<K, V> c13925g4 = c13925g2;
        int i = iCompareTo;
        if (!z) {
            return null;
        }
        C13925g<K, V> c13925g5 = this.f90212c;
        if (c13925g4 != null) {
            c13925g = new C13925g<>(c13925g4, k, iSecondaryHash, c13925g5, c13925g5.f90236e);
            if (i < 0) {
                c13925g4.f90233b = c13925g;
            } else {
                c13925g4.f90234c = c13925g;
            }
            rebalance(c13925g4, true);
        } else {
            if (comparator == f90207F && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            c13925g = new C13925g<>(c13925g4, k, iSecondaryHash, c13925g5, c13925g5.f90236e);
            c13925gArr[length] = c13925g;
        }
        int i2 = this.f90213d;
        this.f90213d = i2 + 1;
        if (i2 > this.f90215f) {
            doubleCapacity();
        }
        this.f90214e++;
        return c13925g;
    }

    /* JADX INFO: renamed from: c */
    public C13925g<K, V> m23833c(Map.Entry<?, ?> entry) {
        C13925g<K, V> c13925gM23834d = m23834d(entry.getKey());
        if (c13925gM23834d == null || !equal(c13925gM23834d.f90230C, entry.getValue())) {
            return null;
        }
        return c13925gM23834d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f90211b, (Object) null);
        this.f90213d = 0;
        this.f90214e++;
        C13925g<K, V> c13925g = this.f90212c;
        C13925g<K, V> c13925g2 = c13925g.f90235d;
        while (c13925g2 != c13925g) {
            C13925g<K, V> c13925g3 = c13925g2.f90235d;
            c13925g2.f90236e = null;
            c13925g2.f90235d = null;
            c13925g2 = c13925g3;
        }
        c13925g.f90236e = c13925g;
        c13925g.f90235d = c13925g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m23834d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public C13925g<K, V> m23834d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m23832b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m23835e(C13925g<K, V> c13925g, boolean z) {
        int i;
        if (z) {
            C13925g<K, V> c13925g2 = c13925g.f90236e;
            c13925g2.f90235d = c13925g.f90235d;
            c13925g.f90235d.f90236e = c13925g2;
            c13925g.f90236e = null;
            c13925g.f90235d = null;
        }
        C13925g<K, V> c13925g3 = c13925g.f90233b;
        C13925g<K, V> c13925g4 = c13925g.f90234c;
        C13925g<K, V> c13925g5 = c13925g.f90232a;
        int i2 = 0;
        if (c13925g3 == null || c13925g4 == null) {
            if (c13925g3 != null) {
                replaceInParent(c13925g, c13925g3);
                c13925g.f90233b = null;
            } else if (c13925g4 != null) {
                replaceInParent(c13925g, c13925g4);
                c13925g.f90234c = null;
            } else {
                replaceInParent(c13925g, null);
            }
            rebalance(c13925g5, false);
            this.f90213d--;
            this.f90214e++;
            return;
        }
        C13925g<K, V> c13925gLast = c13925g3.f90231F > c13925g4.f90231F ? c13925g3.last() : c13925g4.first();
        m23835e(c13925gLast, false);
        C13925g<K, V> c13925g6 = c13925g.f90233b;
        if (c13925g6 != null) {
            i = c13925g6.f90231F;
            c13925gLast.f90233b = c13925g6;
            c13925g6.f90232a = c13925gLast;
            c13925g.f90233b = null;
        } else {
            i = 0;
        }
        C13925g<K, V> c13925g7 = c13925g.f90234c;
        if (c13925g7 != null) {
            i2 = c13925g7.f90231F;
            c13925gLast.f90234c = c13925g7;
            c13925g7.f90232a = c13925gLast;
            c13925g.f90234c = null;
        }
        c13925gLast.f90231F = Math.max(i, i2) + 1;
        replaceInParent(c13925g, c13925gLast);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        v79<K, V>.C13922d c13922d = this.f90216m;
        if (c13922d != null) {
            return c13922d;
        }
        v79<K, V>.C13922d c13922d2 = new C13922d();
        this.f90216m = c13922d2;
        return c13922d2;
    }

    /* JADX INFO: renamed from: f */
    public C13925g<K, V> m23836f(Object obj) {
        C13925g<K, V> c13925gM23834d = m23834d(obj);
        if (c13925gM23834d != null) {
            m23835e(c13925gM23834d, true);
        }
        return c13925gM23834d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C13925g<K, V> c13925gM23834d = m23834d(obj);
        if (c13925gM23834d != null) {
            return c13925gM23834d.f90230C;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        v79<K, V>.C13923e c13923e = this.f90209C;
        if (c13923e != null) {
            return c13923e;
        }
        v79<K, V>.C13923e c13923e2 = new C13923e();
        this.f90209C = c13923e2;
        return c13923e2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        C13925g<K, V> c13925gM23832b = m23832b(k, true);
        V v2 = c13925gM23832b.f90230C;
        c13925gM23832b.f90230C = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C13925g<K, V> c13925gM23836f = m23836f(obj);
        if (c13925gM23836f != null) {
            return c13925gM23836f.f90230C;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f90213d;
    }

    public v79(Comparator<? super K> comparator) {
        this.f90213d = 0;
        this.f90214e = 0;
        this.f90210a = comparator == null ? f90207F : comparator;
        this.f90212c = new C13925g<>();
        C13925g<K, V>[] c13925gArr = new C13925g[16];
        this.f90211b = c13925gArr;
        this.f90215f = (c13925gArr.length / 2) + (c13925gArr.length / 4);
    }

    /* JADX INFO: renamed from: v79$g */
    public static final class C13925g<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: C */
        public V f90230C;

        /* JADX INFO: renamed from: F */
        public int f90231F;

        /* JADX INFO: renamed from: a */
        public C13925g<K, V> f90232a;

        /* JADX INFO: renamed from: b */
        public C13925g<K, V> f90233b;

        /* JADX INFO: renamed from: c */
        public C13925g<K, V> f90234c;

        /* JADX INFO: renamed from: d */
        public C13925g<K, V> f90235d;

        /* JADX INFO: renamed from: e */
        public C13925g<K, V> f90236e;

        /* JADX INFO: renamed from: f */
        public final K f90237f;

        /* JADX INFO: renamed from: m */
        public final int f90238m;

        public C13925g() {
            this.f90237f = null;
            this.f90238m = -1;
            this.f90236e = this;
            this.f90235d = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f90237f;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f90230C;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public C13925g<K, V> first() {
            C13925g<K, V> c13925g = this;
            for (C13925g<K, V> c13925g2 = this.f90233b; c13925g2 != null; c13925g2 = c13925g2.f90233b) {
                c13925g = c13925g2;
            }
            return c13925g;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f90237f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f90230C;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f90237f;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.f90230C;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public C13925g<K, V> last() {
            C13925g<K, V> c13925g = this;
            for (C13925g<K, V> c13925g2 = this.f90234c; c13925g2 != null; c13925g2 = c13925g2.f90234c) {
                c13925g = c13925g2;
            }
            return c13925g;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f90230C;
            this.f90230C = v;
            return v2;
        }

        public String toString() {
            return this.f90237f + "=" + this.f90230C;
        }

        public C13925g(C13925g<K, V> c13925g, K k, int i, C13925g<K, V> c13925g2, C13925g<K, V> c13925g3) {
            this.f90232a = c13925g;
            this.f90237f = k;
            this.f90238m = i;
            this.f90231F = 1;
            this.f90235d = c13925g2;
            this.f90236e = c13925g3;
            c13925g3.f90235d = this;
            c13925g2.f90236e = this;
        }
    }
}
