package p000;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p000.zr5;

/* JADX INFO: loaded from: classes3.dex */
public class wrf<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: m */
    public static final int f95232m = 16;

    /* JADX INFO: renamed from: a */
    public List<wrf<K, V>.C14763d> f95233a;

    /* JADX INFO: renamed from: b */
    public Map<K, V> f95234b;

    /* JADX INFO: renamed from: c */
    public boolean f95235c;

    /* JADX INFO: renamed from: d */
    public volatile wrf<K, V>.C14765f f95236d;

    /* JADX INFO: renamed from: e */
    public Map<K, V> f95237e;

    /* JADX INFO: renamed from: f */
    public volatile wrf<K, V>.C14762c f95238f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: renamed from: wrf$a */
    public class C14760a<FieldDescriptorType> extends wrf<FieldDescriptorType, Object> {
        public C14760a() {
            super(null);
        }

        @Override // p000.wrf
        public void makeImmutable() {
            if (!isImmutable()) {
                for (int i = 0; i < getNumArrayEntries(); i++) {
                    Map.Entry<FieldDescriptorType, Object> arrayEntryAt = getArrayEntryAt(i);
                    if (((zr5.InterfaceC16225c) arrayEntryAt.getKey()).isRepeated()) {
                        arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : getOverflowEntries()) {
                    if (((zr5.InterfaceC16225c) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.makeImmutable();
        }

        @Override // p000.wrf, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object key, Object value) {
            return super.put((Comparable) key, value);
        }
    }

    /* JADX INFO: renamed from: wrf$b */
    public class C14761b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f95239a;

        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<K, V>> f95240b;

        private C14761b() {
            this.f95239a = wrf.this.f95233a.size();
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
            if (this.f95240b == null) {
                this.f95240b = wrf.this.f95237e.entrySet().iterator();
            }
            return this.f95240b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f95239a;
            return (i > 0 && i <= wrf.this.f95233a.size()) || getOverflowIterator().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (getOverflowIterator().hasNext()) {
                return getOverflowIterator().next();
            }
            List list = wrf.this.f95233a;
            int i = this.f95239a - 1;
            this.f95239a = i;
            return (Map.Entry) list.get(i);
        }

        public /* synthetic */ C14761b(wrf wrfVar, C14760a c14760a) {
            this();
        }
    }

    /* JADX INFO: renamed from: wrf$c */
    public class C14762c extends wrf<K, V>.C14765f {
        private C14762c() {
            super(wrf.this, null);
        }

        @Override // p000.wrf.C14765f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C14761b(wrf.this, null);
        }

        public /* synthetic */ C14762c(wrf wrfVar, C14760a c14760a) {
            this();
        }
    }

    /* JADX INFO: renamed from: wrf$d */
    public class C14763d implements Map.Entry<K, V>, Comparable<wrf<K, V>.C14763d> {

        /* JADX INFO: renamed from: a */
        public final K f95243a;

        /* JADX INFO: renamed from: b */
        public V f95244b;

        public C14763d(final wrf this$0, Map.Entry<K, V> copy) {
            this(copy.getKey(), copy.getValue());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            return equals(this.f95243a, entry.getKey()) && equals(this.f95244b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f95244b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f95243a;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.f95244b;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            wrf.this.checkMutable();
            V v = this.f95244b;
            this.f95244b = newValue;
            return v;
        }

        public String toString() {
            return this.f95243a + "=" + this.f95244b;
        }

        public C14763d(K key, V value) {
            this.f95243a = key;
            this.f95244b = value;
        }

        @Override // java.lang.Comparable
        public int compareTo(wrf<K, V>.C14763d other) {
            return getKey().compareTo(other.getKey());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f95243a;
        }

        private boolean equals(Object o1, Object o2) {
            if (o1 == null) {
                return o2 == null;
            }
            return o1.equals(o2);
        }
    }

    /* JADX INFO: renamed from: wrf$e */
    public class C14764e implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f95246a;

        /* JADX INFO: renamed from: b */
        public boolean f95247b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<K, V>> f95248c;

        private C14764e() {
            this.f95246a = -1;
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
            if (this.f95248c == null) {
                this.f95248c = wrf.this.f95234b.entrySet().iterator();
            }
            return this.f95248c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95246a + 1 >= wrf.this.f95233a.size()) {
                return !wrf.this.f95234b.isEmpty() && getOverflowIterator().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f95247b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f95247b = false;
            wrf.this.checkMutable();
            if (this.f95246a >= wrf.this.f95233a.size()) {
                getOverflowIterator().remove();
                return;
            }
            wrf wrfVar = wrf.this;
            int i = this.f95246a;
            this.f95246a = i - 1;
            wrfVar.removeArrayEntryAt(i);
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.f95247b = true;
            int i = this.f95246a + 1;
            this.f95246a = i;
            return i < wrf.this.f95233a.size() ? (Map.Entry) wrf.this.f95233a.get(this.f95246a) : getOverflowIterator().next();
        }

        public /* synthetic */ C14764e(wrf wrfVar, C14760a c14760a) {
            this();
        }
    }

    /* JADX INFO: renamed from: wrf$f */
    public class C14765f extends AbstractSet<Map.Entry<K, V>> {
        private C14765f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            wrf.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o) {
            Map.Entry entry = (Map.Entry) o;
            Object obj = wrf.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj == value || (obj != null && obj.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C14764e(wrf.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o) {
            Map.Entry entry = (Map.Entry) o;
            if (!contains(entry)) {
                return false;
            }
            wrf.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return wrf.this.size();
        }

        public /* synthetic */ C14765f(wrf wrfVar, C14760a c14760a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            wrf.this.put((Comparable) entry.getKey(), (Object) entry.getValue());
            return true;
        }
    }

    public /* synthetic */ wrf(C14760a c14760a) {
        this();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int binarySearchInArray(K r5) {
        /*
            r4 = this;
            java.util.List<wrf<K, V>$d> r0 = r4.f95233a
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List<wrf<K, V>$d> r2 = r4.f95233a
            java.lang.Object r2 = r2.get(r1)
            wrf$d r2 = (p000.wrf.C14763d) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<wrf<K, V>$d> r3 = r4.f95233a
            java.lang.Object r3 = r3.get(r2)
            wrf$d r3 = (p000.wrf.C14763d) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wrf.binarySearchInArray(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (this.f95235c) {
            throw new UnsupportedOperationException();
        }
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (!this.f95233a.isEmpty() || (this.f95233a instanceof ArrayList)) {
            return;
        }
        this.f95233a = new ArrayList(16);
    }

    /* JADX INFO: renamed from: g */
    public static <FieldDescriptorType extends zr5.InterfaceC16225c<FieldDescriptorType>> wrf<FieldDescriptorType, Object> m24766g() {
        return new C14760a();
    }

    private SortedMap<K, V> getOverflowEntriesMutable() {
        checkMutable();
        if (this.f95234b.isEmpty() && !(this.f95234b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f95234b = treeMap;
            this.f95237e = treeMap.descendingMap();
        }
        return (SortedMap) this.f95234b;
    }

    /* JADX INFO: renamed from: h */
    public static <K extends Comparable<K>, V> wrf<K, V> m24767h() {
        return new wrf<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeArrayEntryAt(int index) {
        checkMutable();
        V value = this.f95233a.remove(index).getValue();
        if (!this.f95234b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.f95233a.add(new C14763d(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (!this.f95233a.isEmpty()) {
            this.f95233a.clear();
        }
        if (this.f95234b.isEmpty()) {
            return;
        }
        this.f95234b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object o) {
        Comparable comparable = (Comparable) o;
        return binarySearchInArray(comparable) >= 0 || this.f95234b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f95236d == null) {
            this.f95236d = new C14765f(this, null);
        }
        return this.f95236d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wrf)) {
            return super.equals(o);
        }
        wrf wrfVar = (wrf) o;
        int size = size();
        if (size != wrfVar.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != wrfVar.getNumArrayEntries()) {
            return entrySet().equals(wrfVar.entrySet());
        }
        for (int i = 0; i < numArrayEntries; i++) {
            if (!getArrayEntryAt(i).equals(wrfVar.getArrayEntryAt(i))) {
                return false;
            }
        }
        if (numArrayEntries != size) {
            return this.f95234b.equals(wrfVar.f95234b);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public Set<Map.Entry<K, V>> m24768f() {
        if (this.f95238f == null) {
            this.f95238f = new C14762c(this, null);
        }
        return this.f95238f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object o) {
        Comparable comparable = (Comparable) o;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        return iBinarySearchInArray >= 0 ? this.f95233a.get(iBinarySearchInArray).getValue() : this.f95234b.get(comparable);
    }

    public Map.Entry<K, V> getArrayEntryAt(int index) {
        return this.f95233a.get(index);
    }

    public int getNumArrayEntries() {
        return this.f95233a.size();
    }

    public int getNumOverflowEntries() {
        return this.f95234b.size();
    }

    public Iterable<Map.Entry<K, V>> getOverflowEntries() {
        return this.f95234b.isEmpty() ? Collections.emptySet() : this.f95234b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int iHashCode = 0;
        for (int i = 0; i < numArrayEntries; i++) {
            iHashCode += this.f95233a.get(i).hashCode();
        }
        return getNumOverflowEntries() > 0 ? iHashCode + this.f95234b.hashCode() : iHashCode;
    }

    public boolean isImmutable() {
        return this.f95235c;
    }

    public void makeImmutable() {
        if (this.f95235c) {
            return;
        }
        this.f95234b = this.f95234b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f95234b);
        this.f95237e = this.f95237e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f95237e);
        this.f95235c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object o) {
        checkMutable();
        Comparable comparable = (Comparable) o;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        if (iBinarySearchInArray >= 0) {
            return removeArrayEntryAt(iBinarySearchInArray);
        }
        if (this.f95234b.isEmpty()) {
            return null;
        }
        return this.f95234b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f95233a.size() + this.f95234b.size();
    }

    private wrf() {
        this.f95233a = Collections.emptyList();
        this.f95234b = Collections.emptyMap();
        this.f95237e = Collections.emptyMap();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        checkMutable();
        int iBinarySearchInArray = binarySearchInArray(k);
        if (iBinarySearchInArray >= 0) {
            return this.f95233a.get(iBinarySearchInArray).setValue(v);
        }
        ensureEntryArrayMutable();
        int i = -(iBinarySearchInArray + 1);
        if (i >= 16) {
            return getOverflowEntriesMutable().put(k, v);
        }
        if (this.f95233a.size() == 16) {
            wrf<K, V>.C14763d c14763dRemove = this.f95233a.remove(15);
            getOverflowEntriesMutable().put(c14763dRemove.getKey(), c14763dRemove.getValue());
        }
        this.f95233a.add(i, new C14763d(k, v));
        return null;
    }
}
