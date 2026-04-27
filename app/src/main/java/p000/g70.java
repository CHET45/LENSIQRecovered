package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,300:1\n304#2,10:301\n317#2,14:311\n334#2:325\n339#2:326\n345#2:327\n350#2:328\n355#2,61:329\n420#2,17:390\n440#2,6:407\n450#2,60:413\n518#2,9:473\n531#2,22:482\n557#2,7:504\n568#2,19:511\n591#2,6:530\n601#2,6:536\n611#2,5:542\n620#2,8:547\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n98#1:301,10\n108#1:311,14\n118#1:325\n128#1:326\n138#1:327\n145#1:328\n157#1:329,61\n167#1:390,17\n177#1:407,6\n188#1:413,60\n197#1:473,9\n224#1:482,22\n231#1:504,7\n240#1:511,19\n267#1:530,6\n276#1:536,6\n286#1:542,5\n297#1:547,8\n*E\n"})
public final class g70<E> implements Collection<E>, Set<E>, vo8, fp8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public int[] f38928a;

    /* JADX INFO: renamed from: b */
    @yfb
    public Object[] f38929b;

    /* JADX INFO: renamed from: c */
    public int f38930c;

    /* JADX INFO: renamed from: g70$a */
    public final class C6153a extends b08<E> {
        public C6153a() {
            super(g70.this.get_size$collection());
        }

        @Override // p000.b08
        /* JADX INFO: renamed from: a */
        public E mo2782a(int i) {
            return g70.this.valueAt(i);
        }

        @Override // p000.b08
        /* JADX INFO: renamed from: b */
        public void mo2783b(int i) {
            g70.this.removeAt(i);
        }
    }

    @yn8
    public g70() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iIndexOf;
        int i2 = get_size$collection();
        if (e == null) {
            iIndexOf = i70.indexOfNull(this);
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iIndexOf = i70.indexOf(this, e, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i3 = ~iIndexOf;
        if (i2 >= getHashes$collection().length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            i70.allocArrays(this, i4);
            if (i2 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes$collection().length == 0)) {
                u70.copyInto$default(hashes$collection, getHashes$collection(), 0, 0, hashes$collection.length, 6, (Object) null);
                u70.copyInto$default(array$collection, getArray$collection(), 0, 0, array$collection.length, 6, (Object) null);
            }
        }
        if (i3 < i2) {
            int i5 = i3 + 1;
            u70.copyInto(getHashes$collection(), getHashes$collection(), i5, i3, i2);
            u70.copyInto(getArray$collection(), getArray$collection(), i5, i3, i2);
        }
        if (i2 != get_size$collection() || i3 >= getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        getHashes$collection()[i3] = i;
        getArray$collection()[i3] = e;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    public final void addAll(@yfb g70<? extends E> g70Var) {
        md8.checkNotNullParameter(g70Var, "array");
        int i = g70Var.get_size$collection();
        ensureCapacity(get_size$collection() + i);
        if (get_size$collection() != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(g70Var.valueAt(i2));
            }
            return;
        }
        if (i > 0) {
            u70.copyInto$default(g70Var.getHashes$collection(), getHashes$collection(), 0, 0, i, 6, (Object) null);
            u70.copyInto$default(g70Var.getArray$collection(), getArray$collection(), 0, 0, i, 6, (Object) null);
            if (get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(cv2.f27723a);
            setArray$collection(cv2.f27725c);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void ensureCapacity(int i) {
        int i2 = get_size$collection();
        if (getHashes$collection().length < i) {
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            i70.allocArrays(this, i);
            if (get_size$collection() > 0) {
                u70.copyInto$default(hashes$collection, getHashes$collection(), 0, 0, get_size$collection(), 6, (Object) null);
                u70.copyInto$default(array$collection, getArray$collection(), 0, 0, get_size$collection(), 6, (Object) null);
            }
        }
        if (get_size$collection() != i2) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int i = get_size$collection();
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Set) obj).contains(valueAt(i2))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @yfb
    public final Object[] getArray$collection() {
        return this.f38929b;
    }

    @yfb
    public final int[] getHashes$collection() {
        return this.f38928a;
    }

    public int getSize() {
        return this.f38930c;
    }

    public final int get_size$collection() {
        return this.f38930c;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes$collection = getHashes$collection();
        int i = get_size$collection();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += hashes$collection[i3];
        }
        return i2;
    }

    public final int indexOf(@gib Object obj) {
        return obj == null ? i70.indexOfNull(this) : i70.indexOf(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<E> iterator() {
        return new C6153a();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@yfb g70<? extends E> g70Var) {
        md8.checkNotNullParameter(g70Var, "array");
        int i = g70Var.get_size$collection();
        int i2 = get_size$collection();
        for (int i3 = 0; i3 < i; i3++) {
            remove(g70Var.valueAt(i3));
        }
        return i2 != get_size$collection();
    }

    public final E removeAt(int i) {
        int i2 = get_size$collection();
        E e = (E) getArray$collection()[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            if (getHashes$collection().length <= 8 || get_size$collection() >= getHashes$collection().length / 3) {
                if (i < i3) {
                    int i4 = i + 1;
                    u70.copyInto(getHashes$collection(), getHashes$collection(), i, i4, i2);
                    u70.copyInto(getArray$collection(), getArray$collection(), i, i4, i2);
                }
                getArray$collection()[i3] = null;
            } else {
                int i5 = get_size$collection() > 8 ? get_size$collection() + (get_size$collection() >> 1) : 8;
                int[] hashes$collection = getHashes$collection();
                Object[] array$collection = getArray$collection();
                i70.allocArrays(this, i5);
                if (i > 0) {
                    u70.copyInto$default(hashes$collection, getHashes$collection(), 0, 0, i, 6, (Object) null);
                    u70.copyInto$default(array$collection, getArray$collection(), 0, 0, i, 6, (Object) null);
                }
                if (i < i3) {
                    int i6 = i + 1;
                    u70.copyInto(hashes$collection, getHashes$collection(), i, i6, i2);
                    u70.copyInto(array$collection, getArray$collection(), i, i6, i2);
                }
            }
            if (i2 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i3);
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        boolean z = false;
        for (int i = get_size$collection() - 1; -1 < i; i--) {
            if (!v82.contains(collection, getArray$collection()[i])) {
                removeAt(i);
                z = true;
            }
        }
        return z;
    }

    public final void setArray$collection(@yfb Object[] objArr) {
        md8.checkNotNullParameter(objArr, "<set-?>");
        this.f38929b = objArr;
    }

    public final void setHashes$collection(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<set-?>");
        this.f38928a = iArr;
    }

    public final void set_size$collection(int i) {
        this.f38930c = i;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.util.Set
    @yfb
    public final Object[] toArray() {
        return u70.copyOfRange(this.f38929b, 0, this.f38930c);
    }

    @yfb
    public String toString() {
        if (isEmpty()) {
            return isa.f48126c;
        }
        StringBuilder sb = new StringBuilder(get_size$collection() * 14);
        sb.append('{');
        int i = get_size$collection();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E eValueAt = valueAt(i2);
            if (eValueAt != this) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final E valueAt(int i) {
        return (E) getArray$collection()[i];
    }

    @yn8
    public g70(int i) {
        this.f38928a = cv2.f27723a;
        this.f38929b = cv2.f27725c;
        if (i > 0) {
            i70.allocArrays(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    @yfb
    public final <T> T[] toArray(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        T[] tArr2 = (T[]) h70.m12172a(tArr, this.f38930c);
        u70.copyInto(this.f38929b, tArr2, 0, 0, this.f38930c);
        md8.checkNotNullExpressionValue(tArr2, "result");
        return tArr2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    public /* synthetic */ g70(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public g70(@gib g70<? extends E> g70Var) {
        this(0);
        if (g70Var != null) {
            addAll((g70) g70Var);
        }
    }

    public g70(@gib Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@yfb Collection<? extends E> collection) {
        md8.checkNotNullParameter(collection, "elements");
        ensureCapacity(get_size$collection() + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g70(@gib E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator it = l60.iterator(eArr);
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }
}
