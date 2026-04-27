package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1220:1\n48#1:1224\n48#1:1225\n523#1:1226\n53#1:1229\n523#1:1230\n48#1:1231\n523#1:1232\n523#1:1233\n523#1:1234\n48#1:1235\n523#1:1236\n48#1:1237\n523#1:1238\n523#1:1239\n523#1:1240\n48#1:1241\n523#1:1242\n48#1:1245\n48#1:1246\n48#1:1247\n523#1:1248\n1864#2,3:1221\n1855#2,2:1227\n1855#2,2:1243\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n249#1:1224\n259#1:1225\n260#1:1226\n292#1:1229\n293#1:1230\n307#1:1231\n308#1:1232\n334#1:1233\n359#1:1234\n595#1:1235\n595#1:1236\n637#1:1237\n637#1:1238\n665#1:1239\n675#1:1240\n768#1:1241\n769#1:1242\n794#1:1245\n821#1:1246\n859#1:1247\n860#1:1248\n185#1:1221,3\n281#1:1227,2\n782#1:1243,2\n*E\n"})
@e0g(parameters = 0)
public final class f7b<T> implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final int f35631d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public T[] f35632a;

    /* JADX INFO: renamed from: b */
    @gib
    public List<T> f35633b;

    /* JADX INFO: renamed from: c */
    public int f35634c;

    /* JADX INFO: renamed from: f7b$a */
    @dwf({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1220:1\n523#2:1221\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n967#1:1221\n*E\n"})
    public static final class C5664a<T> implements List<T>, yo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final f7b<T> f35635a;

        public C5664a(@yfb f7b<T> f7bVar) {
            this.f35635a = f7bVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            return this.f35635a.add(t);
        }

        @Override // java.util.List
        public boolean addAll(int i, @yfb Collection<? extends T> collection) {
            return this.f35635a.addAll(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f35635a.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f35635a.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@yfb Collection<? extends Object> collection) {
            return this.f35635a.containsAll(collection);
        }

        @Override // java.util.List
        public T get(int i) {
            g7b.checkIndex(this, i);
            return this.f35635a.getContent()[i];
        }

        public int getSize() {
            return this.f35635a.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f35635a.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f35635a.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @yfb
        public Iterator<T> iterator() {
            return new C5666c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f35635a.lastIndexOf(obj);
        }

        @Override // java.util.List
        @yfb
        public ListIterator<T> listIterator() {
            return new C5666c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@yfb Collection<? extends Object> collection) {
            return this.f35635a.removeAll(collection);
        }

        public T removeAt(int i) {
            g7b.checkIndex(this, i);
            return this.f35635a.removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@yfb Collection<? extends Object> collection) {
            return this.f35635a.retainAll(collection);
        }

        @Override // java.util.List
        public T set(int i, T t) {
            g7b.checkIndex(this, i);
            return this.f35635a.set(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @yfb
        public List<T> subList(int i, int i2) {
            g7b.checkSubIndex(this, i, i2);
            return new C5665b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return f82.toArray(this);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.f35635a.add(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@yfb Collection<? extends T> collection) {
            return this.f35635a.addAll(collection);
        }

        @Override // java.util.List
        @yfb
        public ListIterator<T> listIterator(int i) {
            return new C5666c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f35635a.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f82.toArray(this, tArr);
        }
    }

    /* JADX INFO: renamed from: f7b$b */
    @dwf({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1220:1\n1855#2,2:1221\n1855#2,2:1223\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n1039#1:1221,2\n1121#1:1223,2\n*E\n"})
    public static final class C5665b<T> implements List<T>, yo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final List<T> f35636a;

        /* JADX INFO: renamed from: b */
        public final int f35637b;

        /* JADX INFO: renamed from: c */
        public int f35638c;

        public C5665b(@yfb List<T> list, int i, int i2) {
            this.f35636a = list;
            this.f35637b = i;
            this.f35638c = i2;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            List<T> list = this.f35636a;
            int i = this.f35638c;
            this.f35638c = i + 1;
            list.add(i, t);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i, @yfb Collection<? extends T> collection) {
            this.f35636a.addAll(i + this.f35637b, collection);
            this.f35638c += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.f35638c - 1;
            int i2 = this.f35637b;
            if (i2 <= i) {
                while (true) {
                    this.f35636a.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.f35638c = this.f35637b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.f35638c;
            for (int i2 = this.f35637b; i2 < i; i2++) {
                if (md8.areEqual(this.f35636a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@yfb Collection<? extends Object> collection) {
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
            g7b.checkIndex(this, i);
            return this.f35636a.get(i + this.f35637b);
        }

        public int getSize() {
            return this.f35638c - this.f35637b;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.f35638c;
            for (int i2 = this.f35637b; i2 < i; i2++) {
                if (md8.areEqual(this.f35636a.get(i2), obj)) {
                    return i2 - this.f35637b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f35638c == this.f35637b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @yfb
        public Iterator<T> iterator() {
            return new C5666c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.f35638c - 1;
            int i2 = this.f35637b;
            if (i2 > i) {
                return -1;
            }
            while (!md8.areEqual(this.f35636a.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f35637b;
        }

        @Override // java.util.List
        @yfb
        public ListIterator<T> listIterator() {
            return new C5666c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@yfb Collection<? extends Object> collection) {
            int i = this.f35638c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.f35638c;
        }

        public T removeAt(int i) {
            g7b.checkIndex(this, i);
            this.f35638c--;
            return this.f35636a.remove(i + this.f35637b);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@yfb Collection<? extends Object> collection) {
            int i = this.f35638c;
            int i2 = i - 1;
            int i3 = this.f35637b;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.f35636a.get(i2))) {
                        this.f35636a.remove(i2);
                        this.f35638c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.f35638c;
        }

        @Override // java.util.List
        public T set(int i, T t) {
            g7b.checkIndex(this, i);
            return this.f35636a.set(i + this.f35637b, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @yfb
        public List<T> subList(int i, int i2) {
            g7b.checkSubIndex(this, i, i2);
            return new C5665b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return f82.toArray(this);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.f35636a.add(i + this.f35637b, t);
            this.f35638c++;
        }

        @Override // java.util.List
        @yfb
        public ListIterator<T> listIterator(int i) {
            return new C5666c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.f35638c;
            for (int i2 = this.f35637b; i2 < i; i2++) {
                if (md8.areEqual(this.f35636a.get(i2), obj)) {
                    this.f35636a.remove(i2);
                    this.f35638c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f82.toArray(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@yfb Collection<? extends T> collection) {
            this.f35636a.addAll(this.f35638c, collection);
            this.f35638c += collection.size();
            return collection.size() > 0;
        }
    }

    /* JADX INFO: renamed from: f7b$c */
    public static final class C5666c<T> implements ListIterator<T>, zo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final List<T> f35639a;

        /* JADX INFO: renamed from: b */
        public int f35640b;

        public C5666c(@yfb List<T> list, int i) {
            this.f35639a = list;
            this.f35640b = i;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            this.f35639a.add(this.f35640b, t);
            this.f35640b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f35640b < this.f35639a.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f35640b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.f35639a;
            int i = this.f35640b;
            this.f35640b = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f35640b;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.f35640b - 1;
            this.f35640b = i;
            return this.f35639a.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f35640b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.f35640b - 1;
            this.f35640b = i;
            this.f35639a.remove(i);
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.f35639a.set(this.f35640b, t);
        }
    }

    @yjd
    public f7b(@yfb T[] tArr, int i) {
        this.f35632a = tArr;
        this.f35634c = i;
    }

    @yjd
    public static /* synthetic */ void getContent$annotations() {
    }

    public final boolean add(T t) {
        ensureCapacity(this.f35634c + 1);
        T[] tArr = this.f35632a;
        int i = this.f35634c;
        tArr[i] = t;
        this.f35634c = i + 1;
        return true;
    }

    public final boolean addAll(int i, @yfb List<? extends T> list) {
        if (list.isEmpty()) {
            return false;
        }
        ensureCapacity(this.f35634c + list.size());
        T[] tArr = this.f35632a;
        if (i != this.f35634c) {
            u70.copyInto(tArr, tArr, list.size() + i, i, this.f35634c);
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            tArr[i + i2] = list.get(i2);
        }
        this.f35634c += list.size();
        return true;
    }

    public final boolean any(@yfb qy6<? super T, Boolean> qy6Var) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            while (!qy6Var.invoke(content[i]).booleanValue()) {
                i++;
                if (i >= size) {
                }
            }
            return true;
        }
        return false;
    }

    @yfb
    public final List<T> asMutableList() {
        List<T> list = this.f35633b;
        if (list != null) {
            return list;
        }
        C5664a c5664a = new C5664a(this);
        this.f35633b = c5664a;
        return c5664a;
    }

    public final void clear() {
        T[] tArr = this.f35632a;
        int size = getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                this.f35634c = 0;
                return;
            }
            tArr[size] = null;
        }
    }

    public final boolean contains(T t) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; !md8.areEqual(getContent()[i], t); i++) {
                if (i != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(@yfb List<? extends T> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!contains(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(@yfb f7b<T> f7bVar) {
        if (f7bVar.f35634c != this.f35634c) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; md8.areEqual(f7bVar.getContent()[i], getContent()[i]); i++) {
                if (i != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int i) {
        T[] tArr = this.f35632a;
        if (tArr.length < i) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            md8.checkNotNullExpressionValue(tArr2, "copyOf(this, newSize)");
            this.f35632a = tArr2;
        }
    }

    public final T first() {
        if (isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return getContent()[0];
    }

    @gib
    public final T firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R fold(R r, @yfb gz6<? super R, ? super T, ? extends R> gz6Var) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                r = gz6Var.invoke(r, content[i]);
                i++;
            } while (i < size);
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldIndexed(R r, @yfb kz6<? super Integer, ? super R, ? super T, ? extends R> kz6Var) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                r = kz6Var.invoke(Integer.valueOf(i), r, content[i]);
                i++;
            } while (i < size);
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRight(R r, @yfb gz6<? super T, ? super R, ? extends R> gz6Var) {
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                r = gz6Var.invoke(content[i], r);
                i--;
            } while (i >= 0);
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRightIndexed(R r, @yfb kz6<? super Integer, ? super T, ? super R, ? extends R> kz6Var) {
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                r = kz6Var.invoke(Integer.valueOf(i), content[i], r);
                i--;
            } while (i >= 0);
        }
        return r;
    }

    public final void forEach(@yfb qy6<? super T, bth> qy6Var) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                qy6Var.invoke(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachIndexed(@yfb gz6<? super Integer, ? super T, bth> gz6Var) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                gz6Var.invoke(Integer.valueOf(i), content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachReversed(@yfb qy6<? super T, bth> qy6Var) {
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                qy6Var.invoke(content[i]);
                i--;
            } while (i >= 0);
        }
    }

    public final void forEachReversedIndexed(@yfb gz6<? super Integer, ? super T, bth> gz6Var) {
        if (getSize() > 0) {
            int size = getSize() - 1;
            T[] content = getContent();
            do {
                gz6Var.invoke(Integer.valueOf(size), content[size]);
                size--;
            } while (size >= 0);
        }
    }

    public final T get(int i) {
        return getContent()[i];
    }

    @yfb
    public final T[] getContent() {
        return this.f35632a;
    }

    @yfb
    public final f78 getIndices() {
        return new f78(0, getSize() - 1);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.f35634c;
    }

    public final int indexOf(T t) {
        int i = this.f35634c;
        if (i <= 0) {
            return -1;
        }
        T[] tArr = this.f35632a;
        int i2 = 0;
        while (!md8.areEqual(t, tArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    public final int indexOfFirst(@yfb qy6<? super T, Boolean> qy6Var) {
        int size = getSize();
        if (size <= 0) {
            return -1;
        }
        T[] content = getContent();
        int i = 0;
        while (!qy6Var.invoke(content[i]).booleanValue()) {
            i++;
            if (i >= size) {
                return -1;
            }
        }
        return i;
    }

    public final int indexOfLast(@yfb qy6<? super T, Boolean> qy6Var) {
        int size = getSize();
        if (size <= 0) {
            return -1;
        }
        int i = size - 1;
        T[] content = getContent();
        while (!qy6Var.invoke(content[i]).booleanValue()) {
            i--;
            if (i < 0) {
                return -1;
            }
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f35634c == 0;
    }

    public final boolean isNotEmpty() {
        return this.f35634c != 0;
    }

    public final T last() {
        if (isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return getContent()[getSize() - 1];
    }

    public final int lastIndexOf(T t) {
        int i = this.f35634c;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        T[] tArr = this.f35632a;
        while (!md8.areEqual(t, tArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    @gib
    public final T lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[getSize() - 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] map(qy6<? super T, ? extends R> qy6Var) {
        int size = getSize();
        md8.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = qy6Var.invoke(getContent()[i]);
        }
        return rArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] mapIndexed(gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        int size = getSize();
        md8.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = gz6Var.invoke(Integer.valueOf(i), getContent()[i]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> f7b<R> mapIndexedNotNull(gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        int size = getSize();
        int i = 0;
        md8.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                R rInvoke = gz6Var.invoke(Integer.valueOf(i), content[i]);
                if (rInvoke != null) {
                    objArr[i2] = rInvoke;
                    i2++;
                }
                i++;
            } while (i < size);
            i = i2;
        }
        return new f7b<>(objArr, i);
    }

    public final /* synthetic */ <R> f7b<R> mapNotNull(qy6<? super T, ? extends R> qy6Var) {
        int size = getSize();
        int i = 0;
        md8.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                R rInvoke = qy6Var.invoke(content[i]);
                if (rInvoke != null) {
                    objArr[i2] = rInvoke;
                    i2++;
                }
                i++;
            } while (i < size);
            i = i2;
        }
        return new f7b<>(objArr, i);
    }

    public final void minusAssign(T t) {
        remove(t);
    }

    public final void plusAssign(T t) {
        add(t);
    }

    public final boolean remove(T t) {
        int iIndexOf = indexOf(t);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@yfb List<? extends T> list) {
        int i = this.f35634c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            remove(list.get(i2));
        }
        return i != this.f35634c;
    }

    public final T removeAt(int i) {
        T[] tArr = this.f35632a;
        T t = tArr[i];
        if (i != getSize() - 1) {
            u70.copyInto(tArr, tArr, i, i + 1, this.f35634c);
        }
        int i2 = this.f35634c - 1;
        this.f35634c = i2;
        tArr[i2] = null;
        return t;
    }

    public final void removeIf(@yfb qy6<? super T, Boolean> qy6Var) {
        int size = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (qy6Var.invoke(getContent()[i2]).booleanValue()) {
                i++;
            } else if (i > 0) {
                getContent()[i2 - i] = getContent()[i2];
            }
        }
        int i3 = size - i;
        u70.fill(getContent(), (Object) null, i3, size);
        setSize(i3);
    }

    public final void removeRange(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f35634c;
            if (i2 < i3) {
                T[] tArr = this.f35632a;
                u70.copyInto(tArr, tArr, i, i2, i3);
            }
            int i4 = this.f35634c - (i2 - i);
            int size = getSize() - 1;
            if (i4 <= size) {
                int i5 = i4;
                while (true) {
                    this.f35632a[i5] = null;
                    if (i5 == size) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f35634c = i4;
        }
    }

    public final boolean retainAll(@yfb Collection<? extends T> collection) {
        int i = this.f35634c;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!collection.contains(getContent()[size])) {
                removeAt(size);
            }
        }
        return i != this.f35634c;
    }

    public final boolean reversedAny(@yfb qy6<? super T, Boolean> qy6Var) {
        int size = getSize();
        if (size <= 0) {
            return false;
        }
        int i = size - 1;
        T[] content = getContent();
        while (!qy6Var.invoke(content[i]).booleanValue()) {
            i--;
            if (i < 0) {
                return false;
            }
        }
        return true;
    }

    public final T set(int i, T t) {
        T[] tArr = this.f35632a;
        T t2 = tArr[i];
        tArr[i] = t;
        return t2;
    }

    public final void setContent(@yfb T[] tArr) {
        this.f35632a = tArr;
    }

    @yjd
    public final void setSize(int i) {
        this.f35634c = i;
    }

    public final void sortWith(@yfb Comparator<T> comparator) {
        u70.sortWith(this.f35632a, comparator, 0, this.f35634c);
    }

    public final int sumBy(@yfb qy6<? super T, Integer> qy6Var) {
        int size = getSize();
        int iIntValue = 0;
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                iIntValue += qy6Var.invoke(content[i]).intValue();
                i++;
            } while (i < size);
        }
        return iIntValue;
    }

    @yfb
    @yjd
    public final Void throwNoSuchElementException() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    public final boolean containsAll(@yfb Collection<? extends T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @gib
    public final T firstOrNull(@yfb qy6<? super T, Boolean> qy6Var) {
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        T[] content = getContent();
        int i = 0;
        do {
            T t = content[i];
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
            i++;
        } while (i < size);
        return null;
    }

    public final void add(int i, T t) {
        ensureCapacity(this.f35634c + 1);
        T[] tArr = this.f35632a;
        int i2 = this.f35634c;
        if (i != i2) {
            u70.copyInto(tArr, tArr, i + 1, i, i2);
        }
        tArr[i] = t;
        this.f35634c++;
    }

    public final T first(@yfb qy6<? super T, Boolean> qy6Var) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                T t = content[i];
                if (qy6Var.invoke(t).booleanValue()) {
                    return t;
                }
                i++;
            } while (i < size);
        }
        throwNoSuchElementException();
        throw new us8();
    }

    @gib
    public final T lastOrNull(@yfb qy6<? super T, Boolean> qy6Var) {
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        int i = size - 1;
        T[] content = getContent();
        do {
            T t = content[i];
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
            i--;
        } while (i >= 0);
        return null;
    }

    public final T last(@yfb qy6<? super T, Boolean> qy6Var) {
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                T t = content[i];
                if (qy6Var.invoke(t).booleanValue()) {
                    return t;
                }
                i--;
            } while (i >= 0);
        }
        throwNoSuchElementException();
        throw new us8();
    }

    public final boolean removeAll(@yfb f7b<T> f7bVar) {
        int i = this.f35634c;
        int size = f7bVar.getSize() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                remove(f7bVar.getContent()[i2]);
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return i != this.f35634c;
    }

    public final boolean containsAll(@yfb f7b<T> f7bVar) {
        f78 f78Var = new f78(0, f7bVar.getSize() - 1);
        int first = f78Var.getFirst();
        int last = f78Var.getLast();
        if (first <= last) {
            while (contains(f7bVar.getContent()[first])) {
                if (first != last) {
                    first++;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean removeAll(@yfb Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i = this.f35634c;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.f35634c;
    }

    public final boolean addAll(int i, @yfb f7b<T> f7bVar) {
        if (f7bVar.isEmpty()) {
            return false;
        }
        ensureCapacity(this.f35634c + f7bVar.f35634c);
        T[] tArr = this.f35632a;
        int i2 = this.f35634c;
        if (i != i2) {
            u70.copyInto(tArr, tArr, f7bVar.f35634c + i, i, i2);
        }
        u70.copyInto(f7bVar.f35632a, tArr, i, 0, f7bVar.f35634c);
        this.f35634c += f7bVar.f35634c;
        return true;
    }

    public final boolean addAll(@yfb List<? extends T> list) {
        return addAll(getSize(), (List) list);
    }

    public final boolean addAll(@yfb f7b<T> f7bVar) {
        return addAll(getSize(), f7bVar);
    }

    public final boolean addAll(@yfb T[] tArr) {
        if (tArr.length == 0) {
            return false;
        }
        ensureCapacity(this.f35634c + tArr.length);
        u70.copyInto$default(tArr, this.f35632a, this.f35634c, 0, 0, 12, (Object) null);
        this.f35634c += tArr.length;
        return true;
    }

    public final boolean addAll(int i, @yfb Collection<? extends T> collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        ensureCapacity(this.f35634c + collection.size());
        T[] tArr = this.f35632a;
        if (i != this.f35634c) {
            u70.copyInto(tArr, tArr, collection.size() + i, i, this.f35634c);
        }
        for (T t : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                l82.throwIndexOverflow();
            }
            tArr[i2 + i] = t;
            i2 = i3;
        }
        this.f35634c += collection.size();
        return true;
    }

    public final boolean addAll(@yfb Collection<? extends T> collection) {
        return addAll(this.f35634c, collection);
    }
}
