package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,496:1\n1726#2,3:497\n1855#2,2:500\n33#3,7:502\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n*L\n348#1:497,3\n357#1:500,2\n483#1:502,7\n*E\n"})
public final class dcg<T> implements List<T>, yo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ytf<T> f29355a;

    /* JADX INFO: renamed from: b */
    public final int f29356b;

    /* JADX INFO: renamed from: c */
    public int f29357c;

    /* JADX INFO: renamed from: d */
    public int f29358d;

    /* JADX INFO: renamed from: dcg$a */
    public static final class C4744a implements ListIterator<T>, zo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8119f f29359a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dcg<T> f29360b;

        public C4744a(jvd.C8119f c8119f, dcg<T> dcgVar) {
            this.f29359a = c8119f;
            this.f29360b = dcgVar;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f29359a.f52108a < this.f29360b.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f29359a.f52108a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i = this.f29359a.f52108a + 1;
            ztf.validateRange(i, this.f29360b.size());
            this.f29359a.f52108a = i;
            return this.f29360b.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f29359a.f52108a + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.f29359a.f52108a;
            ztf.validateRange(i, this.f29360b.size());
            this.f29359a.f52108a = i - 1;
            return this.f29360b.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f29359a.f52108a;
        }

        @Override // java.util.ListIterator
        @yfb
        public Void add(T t) {
            ztf.modificationError();
            throw new us8();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @yfb
        public Void remove() {
            ztf.modificationError();
            throw new us8();
        }

        @Override // java.util.ListIterator
        @yfb
        public Void set(T t) {
            ztf.modificationError();
            throw new us8();
        }
    }

    public dcg(@yfb ytf<T> ytfVar, int i, int i2) {
        this.f29355a = ytfVar;
        this.f29356b = i;
        this.f29357c = ytfVar.getStructure$runtime_release();
        this.f29358d = i2 - i;
    }

    private final void validateModification() {
        if (this.f29355a.getStructure$runtime_release() != this.f29357c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        validateModification();
        this.f29355a.add(this.f29356b + size(), t);
        this.f29358d = size() + 1;
        this.f29357c = this.f29355a.getStructure$runtime_release();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, @yfb Collection<? extends T> collection) {
        validateModification();
        boolean zAddAll = this.f29355a.addAll(i + this.f29356b, collection);
        if (zAddAll) {
            this.f29358d = size() + collection.size();
            this.f29357c = this.f29355a.getStructure$runtime_release();
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            validateModification();
            ytf<T> ytfVar = this.f29355a;
            int i = this.f29356b;
            ytfVar.removeRange(i, size() + i);
            this.f29358d = 0;
            this.f29357c = this.f29355a.getStructure$runtime_release();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int i) {
        validateModification();
        ztf.validateRange(i, size());
        return this.f29355a.get(this.f29356b + i);
    }

    @yfb
    public final ytf<T> getParentList() {
        return this.f29355a;
    }

    public int getSize() {
        return this.f29358d;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        validateModification();
        int i = this.f29356b;
        Iterator<Integer> it = kpd.until(i, size() + i).iterator();
        while (it.hasNext()) {
            int iNextInt = ((o68) it).nextInt();
            if (md8.areEqual(obj, this.f29355a.get(iNextInt))) {
                return iNextInt - this.f29356b;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        validateModification();
        int size = this.f29356b + size();
        do {
            size--;
            if (size < this.f29356b) {
                return -1;
            }
        } while (!md8.areEqual(obj, this.f29355a.get(size)));
        return size - this.f29356b;
    }

    @Override // java.util.List
    @yfb
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@yfb Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public T removeAt(int i) {
        validateModification();
        T tRemove = this.f29355a.remove(this.f29356b + i);
        this.f29358d = size() - 1;
        this.f29357c = this.f29355a.getStructure$runtime_release();
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@yfb Collection<? extends Object> collection) {
        validateModification();
        ytf<T> ytfVar = this.f29355a;
        int i = this.f29356b;
        int iRetainAllInRange$runtime_release = ytfVar.retainAllInRange$runtime_release(collection, i, size() + i);
        if (iRetainAllInRange$runtime_release > 0) {
            this.f29357c = this.f29355a.getStructure$runtime_release();
            this.f29358d = size() - iRetainAllInRange$runtime_release;
        }
        return iRetainAllInRange$runtime_release > 0;
    }

    @Override // java.util.List
    public T set(int i, T t) {
        ztf.validateRange(i, size());
        validateModification();
        T t2 = this.f29355a.set(i + this.f29356b, t);
        this.f29357c = this.f29355a.getStructure$runtime_release();
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @yfb
    public List<T> subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            a8d.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        validateModification();
        ytf<T> ytfVar = this.f29355a;
        int i3 = this.f29356b;
        return new dcg(ytfVar, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return f82.toArray(this);
    }

    @Override // java.util.List
    @yfb
    public ListIterator<T> listIterator(int i) {
        validateModification();
        jvd.C8119f c8119f = new jvd.C8119f();
        c8119f.f52108a = i - 1;
        return new C4744a(c8119f, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) f82.toArray(this, tArr);
    }

    @Override // java.util.List
    public void add(int i, T t) {
        validateModification();
        this.f29355a.add(this.f29356b + i, t);
        this.f29358d = size() + 1;
        this.f29357c = this.f29355a.getStructure$runtime_release();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@yfb Collection<? extends T> collection) {
        return addAll(size(), collection);
    }
}
