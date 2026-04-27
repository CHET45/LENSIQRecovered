package p000;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p000.as5;

/* JADX INFO: loaded from: classes4.dex */
public class vrf<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a */
    public final int f92091a;

    /* JADX INFO: renamed from: b */
    public List<vrf<K, V>.C14236e> f92092b;

    /* JADX INFO: renamed from: c */
    public Map<K, V> f92093c;

    /* JADX INFO: renamed from: d */
    public boolean f92094d;

    /* JADX INFO: renamed from: e */
    public volatile vrf<K, V>.C14238g f92095e;

    /* JADX INFO: renamed from: f */
    public Map<K, V> f92096f;

    /* JADX INFO: renamed from: m */
    public volatile vrf<K, V>.C14234c f92097m;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: renamed from: vrf$a */
    public class C14232a<FieldDescriptorType> extends vrf<FieldDescriptorType, Object> {
        public C14232a(int arraySize) {
            super(arraySize, null);
        }

        @Override // p000.vrf
        public void makeImmutable() {
            if (!isImmutable()) {
                for (int i = 0; i < getNumArrayEntries(); i++) {
                    Map.Entry<FieldDescriptorType, Object> arrayEntryAt = getArrayEntryAt(i);
                    if (((as5.InterfaceC1587c) arrayEntryAt.getKey()).isRepeated()) {
                        arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : getOverflowEntries()) {
                    if (((as5.InterfaceC1587c) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.makeImmutable();
        }

        @Override // p000.vrf, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object key, Object value) {
            return super.put((Comparable) key, value);
        }
    }

    /* JADX INFO: renamed from: vrf$b */
    public class C14233b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f92098a;

        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<K, V>> f92099b;

        private C14233b() {
            this.f92098a = vrf.this.f92092b.size();
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
            if (this.f92099b == null) {
                this.f92099b = vrf.this.f92096f.entrySet().iterator();
            }
            return this.f92099b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f92098a;
            return (i > 0 && i <= vrf.this.f92092b.size()) || getOverflowIterator().hasNext();
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
            List list = vrf.this.f92092b;
            int i = this.f92098a - 1;
            this.f92098a = i;
            return (Map.Entry) list.get(i);
        }

        public /* synthetic */ C14233b(vrf vrfVar, C14232a c14232a) {
            this();
        }
    }

    /* JADX INFO: renamed from: vrf$c */
    public class C14234c extends vrf<K, V>.C14238g {
        private C14234c() {
            super(vrf.this, null);
        }

        @Override // p000.vrf.C14238g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C14233b(vrf.this, null);
        }

        public /* synthetic */ C14234c(vrf vrfVar, C14232a c14232a) {
            this();
        }
    }

    /* JADX INFO: renamed from: vrf$d */
    public static class C14235d {

        /* JADX INFO: renamed from: a */
        public static final Iterator<Object> f92102a = new a();

        /* JADX INFO: renamed from: b */
        public static final Iterable<Object> f92103b = new b();

        /* JADX INFO: renamed from: vrf$d$a */
        public class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: vrf$d$b */
        public class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return C14235d.f92102a;
            }
        }

        private C14235d() {
        }

        /* JADX INFO: renamed from: b */
        public static <T> Iterable<T> m24163b() {
            return (Iterable<T>) f92103b;
        }
    }

    /* JADX INFO: renamed from: vrf$e */
    public class C14236e implements Map.Entry<K, V>, Comparable<vrf<K, V>.C14236e> {

        /* JADX INFO: renamed from: a */
        public final K f92104a;

        /* JADX INFO: renamed from: b */
        public V f92105b;

        public C14236e(final vrf this$0, Map.Entry<K, V> copy) {
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
            return equals(this.f92104a, entry.getKey()) && equals(this.f92105b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f92105b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f92104a;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.f92105b;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            vrf.this.checkMutable();
            V v = this.f92105b;
            this.f92105b = newValue;
            return v;
        }

        public String toString() {
            return this.f92104a + "=" + this.f92105b;
        }

        public C14236e(K key, V value) {
            this.f92104a = key;
            this.f92105b = value;
        }

        @Override // java.lang.Comparable
        public int compareTo(vrf<K, V>.C14236e other) {
            return getKey().compareTo(other.getKey());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f92104a;
        }

        private boolean equals(Object o1, Object o2) {
            if (o1 == null) {
                return o2 == null;
            }
            return o1.equals(o2);
        }
    }

    /* JADX INFO: renamed from: vrf$f */
    public class C14237f implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f92107a;

        /* JADX INFO: renamed from: b */
        public boolean f92108b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<K, V>> f92109c;

        private C14237f() {
            this.f92107a = -1;
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
            if (this.f92109c == null) {
                this.f92109c = vrf.this.f92093c.entrySet().iterator();
            }
            return this.f92109c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f92107a + 1 >= vrf.this.f92092b.size()) {
                return !vrf.this.f92093c.isEmpty() && getOverflowIterator().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f92108b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f92108b = false;
            vrf.this.checkMutable();
            if (this.f92107a >= vrf.this.f92092b.size()) {
                getOverflowIterator().remove();
                return;
            }
            vrf vrfVar = vrf.this;
            int i = this.f92107a;
            this.f92107a = i - 1;
            vrfVar.removeArrayEntryAt(i);
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.f92108b = true;
            int i = this.f92107a + 1;
            this.f92107a = i;
            return i < vrf.this.f92092b.size() ? (Map.Entry) vrf.this.f92092b.get(this.f92107a) : getOverflowIterator().next();
        }

        public /* synthetic */ C14237f(vrf vrfVar, C14232a c14232a) {
            this();
        }
    }

    /* JADX INFO: renamed from: vrf$g */
    public class C14238g extends AbstractSet<Map.Entry<K, V>> {
        private C14238g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            vrf.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o) {
            Map.Entry entry = (Map.Entry) o;
            Object obj = vrf.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj == value || (obj != null && obj.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C14237f(vrf.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o) {
            Map.Entry entry = (Map.Entry) o;
            if (!contains(entry)) {
                return false;
            }
            vrf.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return vrf.this.size();
        }

        public /* synthetic */ C14238g(vrf vrfVar, C14232a c14232a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            vrf.this.put((Comparable) entry.getKey(), (Object) entry.getValue());
            return true;
        }
    }

    public /* synthetic */ vrf(int i, C14232a c14232a) {
        this(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int binarySearchInArray(K r5) {
        /*
            r4 = this;
            java.util.List<vrf<K, V>$e> r0 = r4.f92092b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List<vrf<K, V>$e> r2 = r4.f92092b
            java.lang.Object r2 = r2.get(r1)
            vrf$e r2 = (p000.vrf.C14236e) r2
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
            java.util.List<vrf<K, V>$e> r3 = r4.f92092b
            java.lang.Object r3 = r3.get(r2)
            vrf$e r3 = (p000.vrf.C14236e) r3
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
        throw new UnsupportedOperationException("Method not decompiled: p000.vrf.binarySearchInArray(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (this.f92094d) {
            throw new UnsupportedOperationException();
        }
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (!this.f92092b.isEmpty() || (this.f92092b instanceof ArrayList)) {
            return;
        }
        this.f92092b = new ArrayList(this.f92091a);
    }

    private SortedMap<K, V> getOverflowEntriesMutable() {
        checkMutable();
        if (this.f92093c.isEmpty() && !(this.f92093c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f92093c = treeMap;
            this.f92096f = treeMap.descendingMap();
        }
        return (SortedMap) this.f92093c;
    }

    /* JADX INFO: renamed from: h */
    public static <FieldDescriptorType extends as5.InterfaceC1587c<FieldDescriptorType>> vrf<FieldDescriptorType, Object> m24158h(int arraySize) {
        return new C14232a(arraySize);
    }

    /* JADX INFO: renamed from: i */
    public static <K extends Comparable<K>, V> vrf<K, V> m24159i(int arraySize) {
        return new vrf<>(arraySize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeArrayEntryAt(int index) {
        checkMutable();
        V value = this.f92092b.remove(index).getValue();
        if (!this.f92093c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.f92092b.add(new C14236e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (!this.f92092b.isEmpty()) {
            this.f92092b.clear();
        }
        if (this.f92093c.isEmpty()) {
            return;
        }
        this.f92093c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object o) {
        Comparable comparable = (Comparable) o;
        return binarySearchInArray(comparable) >= 0 || this.f92093c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f92095e == null) {
            this.f92095e = new C14238g(this, null);
        }
        return this.f92095e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vrf)) {
            return super.equals(o);
        }
        vrf vrfVar = (vrf) o;
        int size = size();
        if (size != vrfVar.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != vrfVar.getNumArrayEntries()) {
            return entrySet().equals(vrfVar.entrySet());
        }
        for (int i = 0; i < numArrayEntries; i++) {
            if (!getArrayEntryAt(i).equals(vrfVar.getArrayEntryAt(i))) {
                return false;
            }
        }
        if (numArrayEntries != size) {
            return this.f92093c.equals(vrfVar.f92093c);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public Set<Map.Entry<K, V>> m24160f() {
        if (this.f92097m == null) {
            this.f92097m = new C14234c(this, null);
        }
        return this.f92097m;
    }

    /* JADX INFO: renamed from: g */
    public Iterable<Map.Entry<K, V>> m24161g() {
        return this.f92096f.isEmpty() ? C14235d.m24163b() : this.f92096f.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object o) {
        Comparable comparable = (Comparable) o;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        return iBinarySearchInArray >= 0 ? this.f92092b.get(iBinarySearchInArray).getValue() : this.f92093c.get(comparable);
    }

    public Map.Entry<K, V> getArrayEntryAt(int index) {
        return this.f92092b.get(index);
    }

    public int getNumArrayEntries() {
        return this.f92092b.size();
    }

    public int getNumOverflowEntries() {
        return this.f92093c.size();
    }

    public Iterable<Map.Entry<K, V>> getOverflowEntries() {
        return this.f92093c.isEmpty() ? C14235d.m24163b() : this.f92093c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int iHashCode = 0;
        for (int i = 0; i < numArrayEntries; i++) {
            iHashCode += this.f92092b.get(i).hashCode();
        }
        return getNumOverflowEntries() > 0 ? iHashCode + this.f92093c.hashCode() : iHashCode;
    }

    public boolean isImmutable() {
        return this.f92094d;
    }

    public void makeImmutable() {
        if (this.f92094d) {
            return;
        }
        this.f92093c = this.f92093c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f92093c);
        this.f92096f = this.f92096f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f92096f);
        this.f92094d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object o) {
        checkMutable();
        Comparable comparable = (Comparable) o;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        if (iBinarySearchInArray >= 0) {
            return removeArrayEntryAt(iBinarySearchInArray);
        }
        if (this.f92093c.isEmpty()) {
            return null;
        }
        return this.f92093c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f92092b.size() + this.f92093c.size();
    }

    private vrf(int arraySize) {
        this.f92091a = arraySize;
        this.f92092b = Collections.emptyList();
        this.f92093c = Collections.emptyMap();
        this.f92096f = Collections.emptyMap();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        checkMutable();
        int iBinarySearchInArray = binarySearchInArray(k);
        if (iBinarySearchInArray >= 0) {
            return this.f92092b.get(iBinarySearchInArray).setValue(v);
        }
        ensureEntryArrayMutable();
        int i = -(iBinarySearchInArray + 1);
        if (i >= this.f92091a) {
            return getOverflowEntriesMutable().put(k, v);
        }
        int size = this.f92092b.size();
        int i2 = this.f92091a;
        if (size == i2) {
            vrf<K, V>.C14236e c14236eRemove = this.f92092b.remove(i2 - 1);
            getOverflowEntriesMutable().put(c14236eRemove.getKey(), c14236eRemove.getValue());
        }
        this.f92092b.add(i, new C14236e(k, v));
        return null;
    }
}
