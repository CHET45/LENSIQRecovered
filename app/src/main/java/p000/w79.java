package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p000.t6f;
import p000.x3b;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public class w79<K, V> extends AbstractC2173c3<K, V> implements j99<K, V>, Serializable {

    @jd7
    @yg8
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: C */
    public transient Map<K, C14456f<K, V>> f93466C;

    /* JADX INFO: renamed from: F */
    public transient int f93467F;

    /* JADX INFO: renamed from: H */
    public transient int f93468H;

    /* JADX INFO: renamed from: f */
    @wx1
    public transient C14457g<K, V> f93469f;

    /* JADX INFO: renamed from: m */
    @wx1
    public transient C14457g<K, V> f93470m;

    /* JADX INFO: renamed from: w79$a */
    public class C14451a extends AbstractSequentialList<V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f93471a;

        public C14451a(final Object val$key) {
            this.f93471a = val$key;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int index) {
            return new C14459i(this.f93471a, index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            C14456f c14456f = (C14456f) w79.this.f93466C.get(this.f93471a);
            if (c14456f == null) {
                return 0;
            }
            return c14456f.f93484c;
        }
    }

    /* JADX INFO: renamed from: w79$b */
    public class C14452b extends AbstractSequentialList<Map.Entry<K, V>> {
        public C14452b() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<Map.Entry<K, V>> listIterator(int index) {
            return new C14458h(index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return w79.this.f93467F;
        }
    }

    /* JADX INFO: renamed from: w79$c */
    public class C14453c extends t6f.AbstractC12934k<K> {
        public C14453c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object key) {
            return w79.this.containsKey(key);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C14455e(w79.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object o) {
            return !w79.this.removeAll(o).isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return w79.this.f93466C.size();
        }
    }

    /* JADX INFO: renamed from: w79$d */
    public class C14454d extends AbstractSequentialList<V> {

        /* JADX INFO: renamed from: w79$d$a */
        public class a extends heh<Map.Entry<K, V>, V> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C14458h f93476b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(final C14454d this$1, ListIterator backingIterator, final C14458h val$nodeItr) {
                super(backingIterator);
                this.f93476b = val$nodeItr;
            }

            @Override // p000.geh
            @dgc
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public V mo2935a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }

            @Override // p000.heh, java.util.ListIterator
            public void set(@dgc V value) {
                this.f93476b.m24380a(value);
            }
        }

        public C14454d() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int index) {
            C14458h c14458h = new C14458h(index);
            return new a(this, c14458h, c14458h);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return w79.this.f93467F;
        }
    }

    /* JADX INFO: renamed from: w79$f */
    public static class C14456f<K, V> {

        /* JADX INFO: renamed from: a */
        public C14457g<K, V> f93482a;

        /* JADX INFO: renamed from: b */
        public C14457g<K, V> f93483b;

        /* JADX INFO: renamed from: c */
        public int f93484c;

        public C14456f(C14457g<K, V> firstNode) {
            this.f93482a = firstNode;
            this.f93483b = firstNode;
            firstNode.f93490f = null;
            firstNode.f93489e = null;
            this.f93484c = 1;
        }
    }

    /* JADX INFO: renamed from: w79$g */
    public static final class C14457g<K, V> extends AbstractC13818v2<K, V> {

        /* JADX INFO: renamed from: a */
        @dgc
        public final K f93485a;

        /* JADX INFO: renamed from: b */
        @dgc
        public V f93486b;

        /* JADX INFO: renamed from: c */
        @wx1
        public C14457g<K, V> f93487c;

        /* JADX INFO: renamed from: d */
        @wx1
        public C14457g<K, V> f93488d;

        /* JADX INFO: renamed from: e */
        @wx1
        public C14457g<K, V> f93489e;

        /* JADX INFO: renamed from: f */
        @wx1
        public C14457g<K, V> f93490f;

        public C14457g(@dgc K key, @dgc V value) {
            this.f93485a = key;
            this.f93486b = value;
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public K getKey() {
            return this.f93485a;
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public V getValue() {
            return this.f93486b;
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public V setValue(@dgc V newValue) {
            V v = this.f93486b;
            this.f93486b = newValue;
            return v;
        }
    }

    /* JADX INFO: renamed from: w79$h */
    public class C14458h implements ListIterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f93491a;

        /* JADX INFO: renamed from: b */
        @wx1
        public C14457g<K, V> f93492b;

        /* JADX INFO: renamed from: c */
        @wx1
        public C14457g<K, V> f93493c;

        /* JADX INFO: renamed from: d */
        @wx1
        public C14457g<K, V> f93494d;

        /* JADX INFO: renamed from: e */
        public int f93495e;

        public C14458h(int index) {
            this.f93495e = w79.this.f93468H;
            int size = w79.this.size();
            v7d.checkPositionIndex(index, size);
            if (index < size / 2) {
                this.f93492b = w79.this.f93469f;
                while (true) {
                    int i = index - 1;
                    if (index <= 0) {
                        break;
                    }
                    next();
                    index = i;
                }
            } else {
                this.f93494d = w79.this.f93470m;
                this.f93491a = size;
                while (true) {
                    int i2 = index + 1;
                    if (index >= size) {
                        break;
                    }
                    previous();
                    index = i2;
                }
            }
            this.f93493c = null;
        }

        private void checkForConcurrentModification() {
            if (w79.this.f93468H != this.f93495e) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m24380a(@dgc V value) {
            v7d.checkState(this.f93493c != null);
            this.f93493c.f93486b = value;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            return this.f93492b != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            checkForConcurrentModification();
            return this.f93494d != null;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f93491a;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f93491a - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            v7d.checkState(this.f93493c != null, "no calls to next() since the last call to remove()");
            C14457g<K, V> c14457g = this.f93493c;
            if (c14457g != this.f93492b) {
                this.f93494d = c14457g.f93488d;
                this.f93491a--;
            } else {
                this.f93492b = c14457g.f93487c;
            }
            w79.this.removeNode(c14457g);
            this.f93493c = null;
            this.f93495e = w79.this.f93468H;
        }

        @Override // java.util.ListIterator
        public void add(Map.Entry<K, V> e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @op1
        public C14457g<K, V> next() {
            checkForConcurrentModification();
            C14457g<K, V> c14457g = this.f93492b;
            if (c14457g == null) {
                throw new NoSuchElementException();
            }
            this.f93493c = c14457g;
            this.f93494d = c14457g;
            this.f93492b = c14457g.f93487c;
            this.f93491a++;
            return c14457g;
        }

        @Override // java.util.ListIterator
        @op1
        public C14457g<K, V> previous() {
            checkForConcurrentModification();
            C14457g<K, V> c14457g = this.f93494d;
            if (c14457g == null) {
                throw new NoSuchElementException();
            }
            this.f93493c = c14457g;
            this.f93492b = c14457g;
            this.f93494d = c14457g.f93488d;
            this.f93491a--;
            return c14457g;
        }

        @Override // java.util.ListIterator
        public void set(Map.Entry<K, V> e) {
            throw new UnsupportedOperationException();
        }
    }

    public w79() {
        this(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @op1
    public C14457g<K, V> addNode(@dgc K key, @dgc V value, @wx1 C14457g<K, V> nextSibling) {
        C14457g<K, V> c14457g = new C14457g<>(key, value);
        if (this.f93469f == null) {
            this.f93470m = c14457g;
            this.f93469f = c14457g;
            this.f93466C.put(key, new C14456f<>(c14457g));
            this.f93468H++;
        } else if (nextSibling == null) {
            C14457g<K, V> c14457g2 = this.f93470m;
            Objects.requireNonNull(c14457g2);
            c14457g2.f93487c = c14457g;
            c14457g.f93488d = this.f93470m;
            this.f93470m = c14457g;
            C14456f<K, V> c14456f = this.f93466C.get(key);
            if (c14456f == null) {
                this.f93466C.put(key, new C14456f<>(c14457g));
                this.f93468H++;
            } else {
                c14456f.f93484c++;
                C14457g<K, V> c14457g3 = c14456f.f93483b;
                c14457g3.f93489e = c14457g;
                c14457g.f93490f = c14457g3;
                c14456f.f93483b = c14457g;
            }
        } else {
            C14456f<K, V> c14456f2 = this.f93466C.get(key);
            Objects.requireNonNull(c14456f2);
            c14456f2.f93484c++;
            c14457g.f93488d = nextSibling.f93488d;
            c14457g.f93490f = nextSibling.f93490f;
            c14457g.f93487c = nextSibling;
            c14457g.f93489e = nextSibling;
            C14457g<K, V> c14457g4 = nextSibling.f93490f;
            if (c14457g4 == null) {
                c14456f2.f93482a = c14457g;
            } else {
                c14457g4.f93489e = c14457g;
            }
            C14457g<K, V> c14457g5 = nextSibling.f93488d;
            if (c14457g5 == null) {
                this.f93469f = c14457g;
            } else {
                c14457g5.f93487c = c14457g;
            }
            nextSibling.f93488d = c14457g;
            nextSibling.f93490f = c14457g;
        }
        this.f93467F++;
        return c14457g;
    }

    public static <K, V> w79<K, V> create() {
        return new w79<>();
    }

    private List<V> getCopy(@dgc K key) {
        return Collections.unmodifiableList(eb9.newArrayList(new C14459i(key)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        this.f93466C = sc2.create();
        int i = stream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            put(stream.readObject(), stream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllNodes(@dgc K key) {
        wg8.m24509c(new C14459i(key));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNode(C14457g<K, V> node) {
        C14457g<K, V> c14457g = node.f93488d;
        if (c14457g != null) {
            c14457g.f93487c = node.f93487c;
        } else {
            this.f93469f = node.f93487c;
        }
        C14457g<K, V> c14457g2 = node.f93487c;
        if (c14457g2 != null) {
            c14457g2.f93488d = c14457g;
        } else {
            this.f93470m = c14457g;
        }
        if (node.f93490f == null && node.f93489e == null) {
            C14456f<K, V> c14456fRemove = this.f93466C.remove(node.f93485a);
            Objects.requireNonNull(c14456fRemove);
            c14456fRemove.f93484c = 0;
            this.f93468H++;
        } else {
            C14456f<K, V> c14456f = this.f93466C.get(node.f93485a);
            Objects.requireNonNull(c14456f);
            c14456f.f93484c--;
            C14457g<K, V> c14457g3 = node.f93490f;
            if (c14457g3 == null) {
                C14457g<K, V> c14457g4 = node.f93489e;
                Objects.requireNonNull(c14457g4);
                c14456f.f93482a = c14457g4;
            } else {
                c14457g3.f93489e = node.f93489e;
            }
            C14457g<K, V> c14457g5 = node.f93489e;
            if (c14457g5 == null) {
                C14457g<K, V> c14457g6 = node.f93490f;
                Objects.requireNonNull(c14457g6);
                c14456f.f93483b = c14457g6;
            } else {
                c14457g5.f93490f = node.f93490f;
            }
        }
        this.f93467F--;
    }

    @jd7
    @yg8
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: a */
    public Map<K, Collection<V>> mo3677a() {
        return new x3b.C14895a(this);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: c */
    public Set<K> mo3679c() {
        return new C14453c();
    }

    @Override // p000.u3b
    public void clear() {
        this.f93469f = null;
        this.f93470m = null;
        this.f93466C.clear();
        this.f93467F = 0;
        this.f93468H++;
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean containsEntry(@wx1 Object key, @wx1 Object value) {
        return super.containsEntry(key, value);
    }

    @Override // p000.u3b
    public boolean containsKey(@wx1 Object key) {
        return this.f93466C.containsKey(key);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public boolean containsValue(@wx1 Object value) {
        return values().contains(value);
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: d */
    public d4b<K> mo3680d() {
        return new x3b.C14901g(this);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean equals(@wx1 Object object) {
        return super.equals(object);
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: f */
    public Iterator<Map.Entry<K, V>> mo3682f() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public boolean isEmpty() {
        return this.f93469f == null;
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ d4b keys() {
        return super.keys();
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public List<Map.Entry<K, V>> mo3678b() {
        return new C14452b();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public boolean put(@dgc K key, @dgc V value) {
        addNode(key, value, null);
        return true;
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean putAll(u3b multimap) {
        return super.putAll(multimap);
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public List<V> mo3681e() {
        return new C14454d();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean remove(@wx1 Object key, @wx1 Object value) {
        return super.remove(key, value);
    }

    @Override // p000.u3b
    public int size() {
        return this.f93467F;
    }

    @Override // p000.AbstractC2173c3
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private w79(int expectedKeys) {
        this.f93466C = swc.m22271d(expectedKeys);
    }

    public static <K, V> w79<K, V> create(int expectedKeys) {
        return new w79<>(expectedKeys);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public List<Map.Entry<K, V>> entries() {
        return (List) super.entries();
    }

    @Override // p000.u3b
    public List<V> get(@dgc final K key) {
        return new C14451a(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean putAll(@dgc Object key, Iterable values) {
        return super.putAll(key, values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.u3b
    @op1
    public List<V> removeAll(@wx1 Object key) {
        List<V> copy = getCopy(key);
        removeAllNodes(key);
        return copy;
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public List<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
        List<V> copy = getCopy(key);
        C14459i c14459i = new C14459i(key);
        Iterator<? extends V> it = values.iterator();
        while (c14459i.hasNext() && it.hasNext()) {
            c14459i.next();
            c14459i.set(it.next());
        }
        while (c14459i.hasNext()) {
            c14459i.next();
            c14459i.remove();
        }
        while (it.hasNext()) {
            c14459i.add(it.next());
        }
        return copy;
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public List<V> values() {
        return (List) super.values();
    }

    public static <K, V> w79<K, V> create(u3b<? extends K, ? extends V> multimap) {
        return new w79<>(multimap);
    }

    /* JADX INFO: renamed from: w79$e */
    public class C14455e implements Iterator<K> {

        /* JADX INFO: renamed from: a */
        public final Set<K> f93477a;

        /* JADX INFO: renamed from: b */
        @wx1
        public C14457g<K, V> f93478b;

        /* JADX INFO: renamed from: c */
        @wx1
        public C14457g<K, V> f93479c;

        /* JADX INFO: renamed from: d */
        public int f93480d;

        private C14455e() {
            this.f93477a = t6f.newHashSetWithExpectedSize(w79.this.keySet().size());
            this.f93478b = w79.this.f93469f;
            this.f93480d = w79.this.f93468H;
        }

        private void checkForConcurrentModification() {
            if (w79.this.f93468H != this.f93480d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            return this.f93478b != null;
        }

        @Override // java.util.Iterator
        @dgc
        public K next() {
            C14457g<K, V> c14457g;
            checkForConcurrentModification();
            C14457g<K, V> c14457g2 = this.f93478b;
            if (c14457g2 == null) {
                throw new NoSuchElementException();
            }
            this.f93479c = c14457g2;
            this.f93477a.add(c14457g2.f93485a);
            do {
                c14457g = this.f93478b.f93487c;
                this.f93478b = c14457g;
                if (c14457g == null) {
                    break;
                }
            } while (!this.f93477a.add(c14457g.f93485a));
            return this.f93479c.f93485a;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            v7d.checkState(this.f93479c != null, "no calls to next() since the last call to remove()");
            w79.this.removeAllNodes(this.f93479c.f93485a);
            this.f93479c = null;
            this.f93480d = w79.this.f93468H;
        }

        public /* synthetic */ C14455e(w79 w79Var, C14451a c14451a) {
            this();
        }
    }

    /* JADX INFO: renamed from: w79$i */
    public class C14459i implements ListIterator<V> {

        /* JADX INFO: renamed from: a */
        @dgc
        public final K f93497a;

        /* JADX INFO: renamed from: b */
        public int f93498b;

        /* JADX INFO: renamed from: c */
        @wx1
        public C14457g<K, V> f93499c;

        /* JADX INFO: renamed from: d */
        @wx1
        public C14457g<K, V> f93500d;

        /* JADX INFO: renamed from: e */
        @wx1
        public C14457g<K, V> f93501e;

        public C14459i(@dgc K key) {
            this.f93497a = key;
            C14456f c14456f = (C14456f) w79.this.f93466C.get(key);
            this.f93499c = c14456f == null ? null : c14456f.f93482a;
        }

        @Override // java.util.ListIterator
        public void add(@dgc V value) {
            this.f93501e = w79.this.addNode(this.f93497a, value, this.f93499c);
            this.f93498b++;
            this.f93500d = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f93499c != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f93501e != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @op1
        @dgc
        public V next() {
            C14457g<K, V> c14457g = this.f93499c;
            if (c14457g == null) {
                throw new NoSuchElementException();
            }
            this.f93500d = c14457g;
            this.f93501e = c14457g;
            this.f93499c = c14457g.f93489e;
            this.f93498b++;
            return c14457g.f93486b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f93498b;
        }

        @Override // java.util.ListIterator
        @op1
        @dgc
        public V previous() {
            C14457g<K, V> c14457g = this.f93501e;
            if (c14457g == null) {
                throw new NoSuchElementException();
            }
            this.f93500d = c14457g;
            this.f93499c = c14457g;
            this.f93501e = c14457g.f93490f;
            this.f93498b--;
            return c14457g.f93486b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f93498b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            v7d.checkState(this.f93500d != null, "no calls to next() since the last call to remove()");
            C14457g<K, V> c14457g = this.f93500d;
            if (c14457g != this.f93499c) {
                this.f93501e = c14457g.f93490f;
                this.f93498b--;
            } else {
                this.f93499c = c14457g.f93489e;
            }
            w79.this.removeNode(c14457g);
            this.f93500d = null;
        }

        @Override // java.util.ListIterator
        public void set(@dgc V value) {
            v7d.checkState(this.f93500d != null);
            this.f93500d.f93486b = value;
        }

        public C14459i(@dgc K key, int index) {
            C14456f c14456f = (C14456f) w79.this.f93466C.get(key);
            int i = c14456f == null ? 0 : c14456f.f93484c;
            v7d.checkPositionIndex(index, i);
            if (index >= i / 2) {
                this.f93501e = c14456f == null ? null : c14456f.f93483b;
                this.f93498b = i;
                while (true) {
                    int i2 = index + 1;
                    if (index >= i) {
                        break;
                    }
                    previous();
                    index = i2;
                }
            } else {
                this.f93499c = c14456f == null ? null : c14456f.f93482a;
                while (true) {
                    int i3 = index - 1;
                    if (index <= 0) {
                        break;
                    }
                    next();
                    index = i3;
                }
            }
            this.f93497a = key;
            this.f93500d = null;
        }
    }

    private w79(u3b<? extends K, ? extends V> multimap) {
        this(multimap.keySet().size());
        putAll(multimap);
    }
}
