package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1618:1\n948#1,2:1641\n948#1,2:1652\n948#1,2:1656\n652#1:1659\n955#1,2:1662\n955#1,2:1669\n955#1,2:1691\n955#1,2:1701\n955#1,2:1704\n955#1,2:1708\n1864#2,3:1619\n1855#2:1651\n1856#2:1654\n1855#2:1703\n1856#2:1706\n267#3,4:1622\n237#3,7:1626\n248#3,3:1634\n251#3,2:1638\n272#3:1640\n273#3:1643\n254#3,6:1644\n274#3:1650\n267#3,4:1672\n237#3,7:1676\n248#3,3:1684\n251#3,2:1688\n272#3:1690\n273#3:1693\n254#3,6:1694\n274#3:1700\n1810#4:1633\n1672#4:1637\n1810#4:1683\n1672#4:1687\n1295#5:1655\n1296#5:1658\n1295#5:1707\n1296#5:1710\n80#6:1660\n305#6,4:1665\n310#6:1671\n75#6:1711\n75#6:1712\n75#6:1713\n75#6:1714\n75#6:1715\n75#6:1716\n75#6:1717\n75#6:1718\n13579#7:1661\n13580#7:1664\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n864#1:1641,2\n898#1:1652,2\n907#1:1656,2\n927#1:1659\n1050#1:1662,2\n1059#1:1669,2\n1068#1:1691,2\n1077#1:1701,2\n1086#1:1704,2\n1095#1:1708,2\n740#1:1619,3\n897#1:1651\n897#1:1654\n1085#1:1703\n1085#1:1706\n863#1:1622,4\n863#1:1626,7\n863#1:1634,3\n863#1:1638,2\n863#1:1640\n863#1:1643\n863#1:1644,6\n863#1:1650\n1067#1:1672,4\n1067#1:1676,7\n1067#1:1684,3\n1067#1:1688,2\n1067#1:1690\n1067#1:1693\n1067#1:1694,6\n1067#1:1700\n863#1:1633\n863#1:1637\n1067#1:1683\n1067#1:1687\n906#1:1655\n906#1:1658\n1094#1:1707\n1094#1:1710\n979#1:1660\n1058#1:1665,4\n1058#1:1671\n1105#1:1711\n1109#1:1712\n1159#1:1713\n1175#1:1714\n1191#1:1715\n1207#1:1716\n1223#1:1717\n1242#1:1718\n1049#1:1661\n1049#1:1664\n*E\n"})
public final class f6b<E> extends ckb<E> {

    /* JADX INFO: renamed from: c */
    @gib
    public C5637b<E> f35491c;

    /* JADX INFO: renamed from: f6b$a */
    public static final class C5636a<T> implements ListIterator<T>, zo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final List<T> f35492a;

        /* JADX INFO: renamed from: b */
        public int f35493b;

        public C5636a(@yfb List<T> list, int i) {
            md8.checkNotNullParameter(list, "list");
            this.f35492a = list;
            this.f35493b = i - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            List<T> list = this.f35492a;
            int i = this.f35493b + 1;
            this.f35493b = i;
            list.add(i, t);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f35493b < this.f35492a.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f35493b >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.f35492a;
            int i = this.f35493b + 1;
            this.f35493b = i;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f35493b + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.f35492a;
            int i = this.f35493b;
            this.f35493b = i - 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f35493b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f35492a.remove(this.f35493b);
            this.f35493b--;
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.f35492a.set(this.f35493b, t);
        }
    }

    /* JADX INFO: renamed from: f6b$b */
    public static final class C5637b<T> implements List<T>, yo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final f6b<T> f35494a;

        public C5637b(@yfb f6b<T> f6bVar) {
            md8.checkNotNullParameter(f6bVar, "objectList");
            this.f35494a = f6bVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            return this.f35494a.add(t);
        }

        @Override // java.util.List
        public boolean addAll(int i, @yfb Collection<? extends T> collection) {
            md8.checkNotNullParameter(collection, "elements");
            return this.f35494a.addAll(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f35494a.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f35494a.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@yfb Collection<? extends Object> collection) {
            md8.checkNotNullParameter(collection, "elements");
            return this.f35494a.containsAll(collection);
        }

        @Override // java.util.List
        public T get(int i) {
            dkb.checkIndex(this, i);
            return this.f35494a.get(i);
        }

        public int getSize() {
            return this.f35494a.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f35494a.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f35494a.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @yfb
        public Iterator<T> iterator() {
            return new C5636a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f35494a.lastIndexOf(obj);
        }

        @Override // java.util.List
        @yfb
        public ListIterator<T> listIterator() {
            return new C5636a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@yfb Collection<? extends Object> collection) {
            md8.checkNotNullParameter(collection, "elements");
            return this.f35494a.removeAll(collection);
        }

        public T removeAt(int i) {
            dkb.checkIndex(this, i);
            return this.f35494a.removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@yfb Collection<? extends Object> collection) {
            md8.checkNotNullParameter(collection, "elements");
            return this.f35494a.retainAll((Collection<? extends T>) collection);
        }

        @Override // java.util.List
        public T set(int i, T t) {
            dkb.checkIndex(this, i);
            return this.f35494a.set(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @yfb
        public List<T> subList(int i, int i2) {
            dkb.checkSubIndex(this, i, i2);
            return new C5638c(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return f82.toArray(this);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.f35494a.add(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@yfb Collection<? extends T> collection) {
            md8.checkNotNullParameter(collection, "elements");
            return this.f35494a.addAll(collection);
        }

        @Override // java.util.List
        @yfb
        public ListIterator<T> listIterator(int i) {
            return new C5636a(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f35494a.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            md8.checkNotNullParameter(tArr, "array");
            return (T[]) f82.toArray(this, tArr);
        }
    }

    /* JADX INFO: renamed from: f6b$c */
    @dwf({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n1855#2,2:1619\n1855#2,2:1621\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n*L\n1395#1:1619,2\n1477#1:1621,2\n*E\n"})
    public static final class C5638c<T> implements List<T>, yo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final List<T> f35495a;

        /* JADX INFO: renamed from: b */
        public final int f35496b;

        /* JADX INFO: renamed from: c */
        public int f35497c;

        public C5638c(@yfb List<T> list, int i, int i2) {
            md8.checkNotNullParameter(list, "list");
            this.f35495a = list;
            this.f35496b = i;
            this.f35497c = i2;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            List<T> list = this.f35495a;
            int i = this.f35497c;
            this.f35497c = i + 1;
            list.add(i, t);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i, @yfb Collection<? extends T> collection) {
            md8.checkNotNullParameter(collection, "elements");
            this.f35495a.addAll(i + this.f35496b, collection);
            this.f35497c += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.f35497c - 1;
            int i2 = this.f35496b;
            if (i2 <= i) {
                while (true) {
                    this.f35495a.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.f35497c = this.f35496b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.f35497c;
            for (int i2 = this.f35496b; i2 < i; i2++) {
                if (md8.areEqual(this.f35495a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@yfb Collection<? extends Object> collection) {
            md8.checkNotNullParameter(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i) {
            dkb.checkIndex(this, i);
            return this.f35495a.get(i + this.f35496b);
        }

        public int getSize() {
            return this.f35497c - this.f35496b;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.f35497c;
            for (int i2 = this.f35496b; i2 < i; i2++) {
                if (md8.areEqual(this.f35495a.get(i2), obj)) {
                    return i2 - this.f35496b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f35497c == this.f35496b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @yfb
        public Iterator<T> iterator() {
            return new C5636a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.f35497c - 1;
            int i2 = this.f35496b;
            if (i2 > i) {
                return -1;
            }
            while (!md8.areEqual(this.f35495a.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f35496b;
        }

        @Override // java.util.List
        @yfb
        public ListIterator<T> listIterator() {
            return new C5636a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@yfb Collection<? extends Object> collection) {
            md8.checkNotNullParameter(collection, "elements");
            int i = this.f35497c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.f35497c;
        }

        public T removeAt(int i) {
            dkb.checkIndex(this, i);
            this.f35497c--;
            return this.f35495a.remove(i + this.f35496b);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@yfb Collection<? extends Object> collection) {
            md8.checkNotNullParameter(collection, "elements");
            int i = this.f35497c;
            int i2 = i - 1;
            int i3 = this.f35496b;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.f35495a.get(i2))) {
                        this.f35495a.remove(i2);
                        this.f35497c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.f35497c;
        }

        @Override // java.util.List
        public T set(int i, T t) {
            dkb.checkIndex(this, i);
            return this.f35495a.set(i + this.f35496b, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @yfb
        public List<T> subList(int i, int i2) {
            dkb.checkSubIndex(this, i, i2);
            return new C5638c(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return f82.toArray(this);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.f35495a.add(i + this.f35496b, t);
            this.f35497c++;
        }

        @Override // java.util.List
        @yfb
        public ListIterator<T> listIterator(int i) {
            return new C5636a(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.f35497c;
            for (int i2 = this.f35496b; i2 < i; i2++) {
                if (md8.areEqual(this.f35495a.get(i2), obj)) {
                    this.f35495a.remove(i2);
                    this.f35497c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            md8.checkNotNullParameter(tArr, "array");
            return (T[]) f82.toArray(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@yfb Collection<? extends T> collection) {
            md8.checkNotNullParameter(collection, "elements");
            this.f35495a.addAll(this.f35497c, collection);
            this.f35497c += collection.size();
            return collection.size() > 0;
        }
    }

    public f6b() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(f6b f6bVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = f6bVar.f16824b;
        }
        f6bVar.trim(i);
    }

    public final boolean add(E e) {
        ensureCapacity(this.f16824b + 1);
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        objArr[i] = e;
        this.f16824b = i + 1;
        return true;
    }

    public final boolean addAll(@h78(from = 0) int i, @yfb E[] eArr) {
        int i2;
        md8.checkNotNullParameter(eArr, "elements");
        if (i < 0 || i > (i2 = this.f16824b)) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.f16824b);
        }
        if (eArr.length == 0) {
            return false;
        }
        ensureCapacity(i2 + eArr.length);
        Object[] objArr = this.f16823a;
        int i3 = this.f16824b;
        if (i != i3) {
            u70.copyInto(objArr, objArr, eArr.length + i, i, i3);
        }
        u70.copyInto$default(eArr, objArr, i, 0, 0, 12, (Object) null);
        this.f16824b += eArr.length;
        return true;
    }

    @Override // p000.ckb
    @yfb
    public List<E> asList() {
        return asMutableList();
    }

    @yfb
    public final List<E> asMutableList() {
        C5637b<E> c5637b = this.f35491c;
        if (c5637b != null) {
            return c5637b;
        }
        C5637b<E> c5637b2 = new C5637b<>(this);
        this.f35491c = c5637b2;
        return c5637b2;
    }

    public final void clear() {
        u70.fill(this.f16823a, (Object) null, 0, this.f16824b);
        this.f16824b = 0;
    }

    public final void ensureCapacity(int i) {
        Object[] objArr = this.f16823a;
        if (objArr.length < i) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i, (objArr.length * 3) / 2));
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f16823a = objArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.f16823a.length;
    }

    public final void minusAssign(E e) {
        remove(e);
    }

    public final void plusAssign(@yfb ckb<E> ckbVar) {
        md8.checkNotNullParameter(ckbVar, "elements");
        if (ckbVar.isEmpty()) {
            return;
        }
        ensureCapacity(this.f16824b + ckbVar.f16824b);
        u70.copyInto(ckbVar.f16823a, this.f16823a, this.f16824b, 0, ckbVar.f16824b);
        this.f16824b += ckbVar.f16824b;
    }

    public final boolean remove(E e) {
        int iIndexOf = indexOf(e);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@yfb E[] eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        int i = this.f16824b;
        for (E e : eArr) {
            remove(e);
        }
        return i != this.f16824b;
    }

    public final E removeAt(@h78(from = 0) int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f16824b)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index ");
            sb.append(i);
            sb.append(" must be in 0..");
            sb.append(this.f16824b - 1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        Object[] objArr = this.f16823a;
        E e = (E) objArr[i];
        if (i != i2 - 1) {
            u70.copyInto(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.f16824b - 1;
        this.f16824b = i3;
        objArr[i3] = null;
        return e;
    }

    public final void removeIf(@yfb qy6<? super E, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = this.f16824b;
        Object[] objArr = this.f16823a;
        int i2 = 0;
        f78 f78VarUntil = kpd.until(0, i);
        int first = f78VarUntil.getFirst();
        int last = f78VarUntil.getLast();
        if (first <= last) {
            while (true) {
                objArr[first - i2] = objArr[first];
                if (qy6Var.invoke(objArr[first]).booleanValue()) {
                    i2++;
                }
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        u70.fill(objArr, (Object) null, i - i2, i);
        this.f16824b -= i2;
    }

    public final void removeRange(@h78(from = 0) int i, @h78(from = 0) int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.f16824b) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.f16824b);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.f16823a;
                u70.copyInto(objArr, objArr, i, i2, i3);
            }
            int i4 = this.f16824b;
            int i5 = i4 - (i2 - i);
            u70.fill(this.f16823a, (Object) null, i5, i4);
            this.f16824b = i5;
        }
    }

    public final boolean retainAll(@yfb E[] eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        int i = this.f16824b;
        Object[] objArr = this.f16823a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (e80.indexOf(eArr, objArr[i2]) < 0) {
                removeAt(i2);
            }
        }
        return i != this.f16824b;
    }

    public final E set(@h78(from = 0) int i, E e) {
        if (i >= 0 && i < this.f16824b) {
            Object[] objArr = this.f16823a;
            E e2 = (E) objArr[i];
            objArr[i] = e;
            return e2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i);
        sb.append(" must be between 0 .. ");
        sb.append(this.f16824b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this.f16824b);
        Object[] objArr = this.f16823a;
        if (objArr.length > iMax) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, iMax);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f16823a = objArrCopyOf;
        }
    }

    public /* synthetic */ f6b(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(@yfb List<? extends E> list) {
        md8.checkNotNullParameter(list, "elements");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            remove(list.get(i));
        }
    }

    public f6b(int i) {
        super(i, null);
    }

    public final void add(@h78(from = 0) int i, E e) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f16824b)) {
            ensureCapacity(i2 + 1);
            Object[] objArr = this.f16823a;
            int i3 = this.f16824b;
            if (i != i3) {
                u70.copyInto(objArr, objArr, i + 1, i, i3);
            }
            objArr[i] = e;
            this.f16824b++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.f16824b);
    }

    public final void minusAssign(@yfb E[] eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        for (E e : eArr) {
            remove(e);
        }
    }

    public final boolean removeAll(@yfb ckb<E> ckbVar) {
        md8.checkNotNullParameter(ckbVar, "elements");
        int i = this.f16824b;
        minusAssign((ckb) ckbVar);
        return i != this.f16824b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@yfb ckb<E> ckbVar) {
        md8.checkNotNullParameter(ckbVar, "elements");
        Object[] objArr = ckbVar.f16823a;
        int i = ckbVar.f16824b;
        for (int i2 = 0; i2 < i; i2++) {
            remove(objArr[i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(@yfb ckb<E> ckbVar) {
        md8.checkNotNullParameter(ckbVar, "elements");
        int i = this.f16824b;
        Object[] objArr = this.f16823a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!ckbVar.contains(objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this.f16824b;
    }

    public final boolean removeAll(@yfb doe<E> doeVar) {
        md8.checkNotNullParameter(doeVar, "elements");
        int i = this.f16824b;
        minusAssign((doe) doeVar);
        return i != this.f16824b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@yfb doe<E> doeVar) {
        md8.checkNotNullParameter(doeVar, "elements");
        if (doeVar.isEmpty()) {
            return;
        }
        ensureCapacity(this.f16824b + doeVar.getSize());
        Object[] objArr = doeVar.f30278b;
        long[] jArr = doeVar.f30277a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        add(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean addAll(@h78(from = 0) int i, @yfb Collection<? extends E> collection) {
        md8.checkNotNullParameter(collection, "elements");
        if (i >= 0 && i <= this.f16824b) {
            int i2 = 0;
            if (collection.isEmpty()) {
                return false;
            }
            ensureCapacity(this.f16824b + collection.size());
            Object[] objArr = this.f16823a;
            if (i != this.f16824b) {
                u70.copyInto(objArr, objArr, collection.size() + i, i, this.f16824b);
            }
            for (Object obj : collection) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    l82.throwIndexOverflow();
                }
                objArr[i2 + i] = obj;
                i2 = i3;
            }
            this.f16824b += collection.size();
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.f16824b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@yfb doe<E> doeVar) {
        md8.checkNotNullParameter(doeVar, "elements");
        Object[] objArr = doeVar.f30278b;
        long[] jArr = doeVar.f30277a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        remove(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean removeAll(@yfb List<? extends E> list) {
        md8.checkNotNullParameter(list, "elements");
        int i = this.f16824b;
        minusAssign((List) list);
        return i != this.f16824b;
    }

    public final boolean retainAll(@yfb Collection<? extends E> collection) {
        md8.checkNotNullParameter(collection, "elements");
        int i = this.f16824b;
        Object[] objArr = this.f16823a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this.f16824b;
    }

    public final boolean removeAll(@yfb Iterable<? extends E> iterable) {
        md8.checkNotNullParameter(iterable, "elements");
        int i = this.f16824b;
        minusAssign((Iterable) iterable);
        return i != this.f16824b;
    }

    public final void minusAssign(@yfb Iterable<? extends E> iterable) {
        md8.checkNotNullParameter(iterable, "elements");
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@yfb E[] eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        if (eArr.length == 0) {
            return;
        }
        ensureCapacity(this.f16824b + eArr.length);
        u70.copyInto$default(eArr, this.f16823a, this.f16824b, 0, 0, 12, (Object) null);
        this.f16824b += eArr.length;
    }

    public final boolean removeAll(@yfb vye<? extends E> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "elements");
        int i = this.f16824b;
        minusAssign((vye) vyeVar);
        return i != this.f16824b;
    }

    public final void minusAssign(@yfb vye<? extends E> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "elements");
        Iterator<? extends E> it = vyeVar.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean retainAll(@yfb Iterable<? extends E> iterable) {
        md8.checkNotNullParameter(iterable, "elements");
        int i = this.f16824b;
        Object[] objArr = this.f16823a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!v82.contains(iterable, objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this.f16824b;
    }

    public final void plusAssign(@yfb List<? extends E> list) {
        md8.checkNotNullParameter(list, "elements");
        if (list.isEmpty()) {
            return;
        }
        int i = this.f16824b;
        ensureCapacity(list.size() + i);
        Object[] objArr = this.f16823a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2 + i] = list.get(i2);
        }
        this.f16824b += list.size();
    }

    public final boolean addAll(@h78(from = 0) int i, @yfb ckb<E> ckbVar) {
        md8.checkNotNullParameter(ckbVar, "elements");
        if (i >= 0 && i <= this.f16824b) {
            if (ckbVar.isEmpty()) {
                return false;
            }
            ensureCapacity(this.f16824b + ckbVar.f16824b);
            Object[] objArr = this.f16823a;
            int i2 = this.f16824b;
            if (i != i2) {
                u70.copyInto(objArr, objArr, ckbVar.f16824b + i, i, i2);
            }
            u70.copyInto(ckbVar.f16823a, objArr, i, 0, ckbVar.f16824b);
            this.f16824b += ckbVar.f16824b;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.f16824b);
    }

    public final boolean retainAll(@yfb vye<? extends E> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "elements");
        int i = this.f16824b;
        Object[] objArr = this.f16823a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!vze.contains(vyeVar, objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this.f16824b;
    }

    public final void plusAssign(E e) {
        add(e);
    }

    public final void plusAssign(@yfb Iterable<? extends E> iterable) {
        md8.checkNotNullParameter(iterable, "elements");
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void plusAssign(@yfb vye<? extends E> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "elements");
        Iterator<? extends E> it = vyeVar.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(@yfb ckb<E> ckbVar) {
        md8.checkNotNullParameter(ckbVar, "elements");
        int i = this.f16824b;
        plusAssign((ckb) ckbVar);
        return i != this.f16824b;
    }

    public final boolean addAll(@yfb doe<E> doeVar) {
        md8.checkNotNullParameter(doeVar, "elements");
        int i = this.f16824b;
        plusAssign((doe) doeVar);
        return i != this.f16824b;
    }

    public final boolean addAll(@yfb E[] eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        int i = this.f16824b;
        plusAssign((Object[]) eArr);
        return i != this.f16824b;
    }

    public final boolean addAll(@yfb List<? extends E> list) {
        md8.checkNotNullParameter(list, "elements");
        int i = this.f16824b;
        plusAssign((List) list);
        return i != this.f16824b;
    }

    public final boolean addAll(@yfb Iterable<? extends E> iterable) {
        md8.checkNotNullParameter(iterable, "elements");
        int i = this.f16824b;
        plusAssign((Iterable) iterable);
        return i != this.f16824b;
    }

    public final boolean addAll(@yfb vye<? extends E> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "elements");
        int i = this.f16824b;
        plusAssign((vye) vyeVar);
        return i != this.f16824b;
    }
}
