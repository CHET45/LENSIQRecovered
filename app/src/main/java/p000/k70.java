package p000;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.ft8;
import p000.ky7;

/* JADX INFO: loaded from: classes5.dex */
public class k70<K, V> extends ky7<K, V> {

    /* JADX INFO: renamed from: a */
    public final K[] f52699a;

    /* JADX INFO: renamed from: b */
    public final V[] f52700b;

    /* JADX INFO: renamed from: c */
    public final Comparator<K> f52701c;

    /* JADX INFO: renamed from: k70$a */
    public class C8219a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f52702a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f52703b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f52704c;

        public C8219a(int i, boolean z) {
            this.f52703b = i;
            this.f52704c = z;
            this.f52702a = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52704c) {
                if (this.f52702a < 0) {
                    return false;
                }
            } else if (this.f52702a >= k70.this.f52699a.length) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            Object obj = k70.this.f52699a[this.f52702a];
            Object[] objArr = k70.this.f52700b;
            int i = this.f52702a;
            Object obj2 = objArr[i];
            this.f52702a = this.f52704c ? i - 1 : i + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }
    }

    public k70(Comparator<K> comparator) {
        this.f52699a = (K[]) new Object[0];
        this.f52700b = (V[]) new Object[0];
        this.f52701c = comparator;
    }

    private static <T> T[] addToArray(T[] tArr, int i, T t) {
        T[] tArr2 = (T[]) new Object[tArr.length + 1];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        tArr2[i] = t;
        System.arraycopy(tArr, i, tArr2, i + 1, (r0 - i) - 1);
        return tArr2;
    }

    public static <A, B, C> k70<A, C> buildFrom(List<A> list, Map<B, C> map, ky7.C8553a.a<A, B> aVar, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i = 0;
        for (A a : list) {
            objArr[i] = a;
            objArr2[i] = map.get(aVar.translate(a));
            i++;
        }
        return new k70<>(comparator, objArr, objArr2);
    }

    private int findKey(K k) {
        int i = 0;
        for (K k2 : this.f52699a) {
            if (this.f52701c.compare(k, k2) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private int findKeyOrInsertPosition(K k) {
        int i = 0;
        while (true) {
            K[] kArr = this.f52699a;
            if (i >= kArr.length || this.f52701c.compare(kArr[i], k) >= 0) {
                break;
            }
            i++;
        }
        return i;
    }

    public static <K, V> k70<K, V> fromMap(Map<K, V> map, Comparator<K> comparator) {
        return buildFrom(new ArrayList(map.keySet()), map, ky7.C8553a.identityTranslator(), comparator);
    }

    private Iterator<Map.Entry<K, V>> iterator(int i, boolean z) {
        return new C8219a(i, z);
    }

    private static <T> T[] removeFromArray(T[] tArr, int i) {
        int length = tArr.length - 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        System.arraycopy(tArr, i + 1, tArr2, i, length - i);
        return tArr2;
    }

    private static <T> T[] replaceInArray(T[] tArr, int i, T t) {
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i] = t;
        return tArr2;
    }

    @Override // p000.ky7
    public boolean containsKey(K k) {
        return findKey(k) != -1;
    }

    @Override // p000.ky7
    public V get(K k) {
        int iFindKey = findKey(k);
        if (iFindKey != -1) {
            return this.f52700b[iFindKey];
        }
        return null;
    }

    @Override // p000.ky7
    public Comparator<K> getComparator() {
        return this.f52701c;
    }

    @Override // p000.ky7
    public K getMaxKey() {
        K[] kArr = this.f52699a;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    @Override // p000.ky7
    public K getMinKey() {
        K[] kArr = this.f52699a;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    @Override // p000.ky7
    public K getPredecessorKey(K k) {
        int iFindKey = findKey(k);
        if (iFindKey == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (iFindKey > 0) {
            return this.f52699a[iFindKey - 1];
        }
        return null;
    }

    @Override // p000.ky7
    public K getSuccessorKey(K k) {
        int iFindKey = findKey(k);
        if (iFindKey == -1) {
            throw new IllegalArgumentException("Can't find successor of nonexistent key");
        }
        K[] kArr = this.f52699a;
        if (iFindKey < kArr.length - 1) {
            return kArr[iFindKey + 1];
        }
        return null;
    }

    @Override // p000.ky7
    public void inOrderTraversal(ft8.AbstractC5960b<K, V> abstractC5960b) {
        int i = 0;
        while (true) {
            K[] kArr = this.f52699a;
            if (i >= kArr.length) {
                return;
            }
            abstractC5960b.visitEntry(kArr[i], this.f52700b[i]);
            i++;
        }
    }

    @Override // p000.ky7
    public int indexOf(K k) {
        return findKey(k);
    }

    @Override // p000.ky7
    public ky7<K, V> insert(K k, V v) {
        int iFindKey = findKey(k);
        if (iFindKey != -1) {
            K[] kArr = this.f52699a;
            if (kArr[iFindKey] == k && this.f52700b[iFindKey] == v) {
                return this;
            }
            return new k70(this.f52701c, replaceInArray(kArr, iFindKey, k), replaceInArray(this.f52700b, iFindKey, v));
        }
        if (this.f52699a.length <= 25) {
            int iFindKeyOrInsertPosition = findKeyOrInsertPosition(k);
            return new k70(this.f52701c, addToArray(this.f52699a, iFindKeyOrInsertPosition, k), addToArray(this.f52700b, iFindKeyOrInsertPosition, v));
        }
        HashMap map = new HashMap(this.f52699a.length + 1);
        int i = 0;
        while (true) {
            K[] kArr2 = this.f52699a;
            if (i >= kArr2.length) {
                map.put(k, v);
                return pod.fromMap(map, this.f52701c);
            }
            map.put(kArr2[i], this.f52700b[i]);
            i++;
        }
    }

    @Override // p000.ky7
    public boolean isEmpty() {
        return this.f52699a.length == 0;
    }

    @Override // p000.ky7
    public Iterator<Map.Entry<K, V>> iteratorFrom(K k) {
        return iterator(findKeyOrInsertPosition(k), false);
    }

    @Override // p000.ky7
    public ky7<K, V> remove(K k) {
        int iFindKey = findKey(k);
        if (iFindKey == -1) {
            return this;
        }
        return new k70(this.f52701c, removeFromArray(this.f52699a, iFindKey), removeFromArray(this.f52700b, iFindKey));
    }

    @Override // p000.ky7
    public Iterator<Map.Entry<K, V>> reverseIterator() {
        return iterator(this.f52699a.length - 1, true);
    }

    @Override // p000.ky7
    public Iterator<Map.Entry<K, V>> reverseIteratorFrom(K k) {
        int iFindKeyOrInsertPosition = findKeyOrInsertPosition(k);
        K[] kArr = this.f52699a;
        return (iFindKeyOrInsertPosition >= kArr.length || this.f52701c.compare(kArr[iFindKeyOrInsertPosition], k) != 0) ? iterator(iFindKeyOrInsertPosition - 1, true) : iterator(iFindKeyOrInsertPosition, true);
    }

    @Override // p000.ky7
    public int size() {
        return this.f52699a.length;
    }

    @Override // p000.ky7, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return iterator(0, false);
    }

    private k70(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.f52699a = kArr;
        this.f52700b = vArr;
        this.f52701c = comparator;
    }
}
