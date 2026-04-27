package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p000.t6f;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public final class q79<K, V> extends r79<K, V> {

    /* JADX INFO: renamed from: H */
    public static final int f73413H = 16;

    /* JADX INFO: renamed from: L */
    public static final int f73414L = 2;

    /* JADX INFO: renamed from: M */
    @gdi
    public static final double f73415M = 1.0d;

    @jd7
    @yg8
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: C */
    @gdi
    public transient int f73416C;

    /* JADX INFO: renamed from: F */
    public transient C11337b<K, V> f73417F;

    /* JADX INFO: renamed from: q79$a */
    public class C11336a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public C11337b<K, V> f73418a;

        /* JADX INFO: renamed from: b */
        @wx1
        public C11337b<K, V> f73419b;

        public C11336a() {
            this.f73418a = q79.this.f73417F.getSuccessorInMultimap();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f73418a != q79.this.f73417F;
        }

        @Override // java.util.Iterator
        public void remove() {
            v7d.checkState(this.f73419b != null, "no calls to next() since the last call to remove()");
            q79.this.remove(this.f73419b.getKey(), this.f73419b.getValue());
            this.f73419b = null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            C11337b<K, V> c11337b = this.f73418a;
            this.f73419b = c11337b;
            this.f73418a = c11337b.getSuccessorInMultimap();
            return c11337b;
        }
    }

    /* JADX INFO: renamed from: q79$b */
    @gdi
    public static final class C11337b<K, V> extends ex7<K, V> implements InterfaceC11339d<K, V> {

        /* JADX INFO: renamed from: C */
        @wx1
        public C11337b<K, V> f73421C;

        /* JADX INFO: renamed from: c */
        public final int f73422c;

        /* JADX INFO: renamed from: d */
        @wx1
        public C11337b<K, V> f73423d;

        /* JADX INFO: renamed from: e */
        @wx1
        public InterfaceC11339d<K, V> f73424e;

        /* JADX INFO: renamed from: f */
        @wx1
        public InterfaceC11339d<K, V> f73425f;

        /* JADX INFO: renamed from: m */
        @wx1
        public C11337b<K, V> f73426m;

        public C11337b(@dgc K key, @dgc V value, int smearedValueHash, @wx1 C11337b<K, V> nextInValueBucket) {
            super(key, value);
            this.f73422c = smearedValueHash;
            this.f73423d = nextInValueBucket;
        }

        /* JADX INFO: renamed from: b */
        public static <K, V> C11337b<K, V> m20109b() {
            return new C11337b<>(null, null, 0, null);
        }

        /* JADX INFO: renamed from: a */
        public boolean m20110a(@wx1 Object v, int smearedVHash) {
            return this.f73422c == smearedVHash && okb.equal(getValue(), v);
        }

        public C11337b<K, V> getPredecessorInMultimap() {
            C11337b<K, V> c11337b = this.f73426m;
            Objects.requireNonNull(c11337b);
            return c11337b;
        }

        @Override // p000.q79.InterfaceC11339d
        public InterfaceC11339d<K, V> getPredecessorInValueSet() {
            InterfaceC11339d<K, V> interfaceC11339d = this.f73424e;
            Objects.requireNonNull(interfaceC11339d);
            return interfaceC11339d;
        }

        public C11337b<K, V> getSuccessorInMultimap() {
            C11337b<K, V> c11337b = this.f73421C;
            Objects.requireNonNull(c11337b);
            return c11337b;
        }

        @Override // p000.q79.InterfaceC11339d
        public InterfaceC11339d<K, V> getSuccessorInValueSet() {
            InterfaceC11339d<K, V> interfaceC11339d = this.f73425f;
            Objects.requireNonNull(interfaceC11339d);
            return interfaceC11339d;
        }

        public void setPredecessorInMultimap(C11337b<K, V> multimapPredecessor) {
            this.f73426m = multimapPredecessor;
        }

        @Override // p000.q79.InterfaceC11339d
        public void setPredecessorInValueSet(InterfaceC11339d<K, V> entry) {
            this.f73424e = entry;
        }

        public void setSuccessorInMultimap(C11337b<K, V> multimapSuccessor) {
            this.f73421C = multimapSuccessor;
        }

        @Override // p000.q79.InterfaceC11339d
        public void setSuccessorInValueSet(InterfaceC11339d<K, V> entry) {
            this.f73425f = entry;
        }
    }

    /* JADX INFO: renamed from: q79$c */
    @gdi
    public final class C11338c extends t6f.AbstractC12934k<V> implements InterfaceC11339d<K, V> {

        /* JADX INFO: renamed from: a */
        @dgc
        public final K f73427a;

        /* JADX INFO: renamed from: b */
        @gdi
        public C11337b<K, V>[] f73428b;

        /* JADX INFO: renamed from: c */
        public int f73429c = 0;

        /* JADX INFO: renamed from: d */
        public int f73430d = 0;

        /* JADX INFO: renamed from: e */
        public InterfaceC11339d<K, V> f73431e = this;

        /* JADX INFO: renamed from: f */
        public InterfaceC11339d<K, V> f73432f = this;

        /* JADX INFO: renamed from: q79$c$a */
        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: a */
            public InterfaceC11339d<K, V> f73434a;

            /* JADX INFO: renamed from: b */
            @wx1
            public C11337b<K, V> f73435b;

            /* JADX INFO: renamed from: c */
            public int f73436c;

            public a() {
                this.f73434a = C11338c.this.f73431e;
                this.f73436c = C11338c.this.f73430d;
            }

            private void checkForComodification() {
                if (C11338c.this.f73430d != this.f73436c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                checkForComodification();
                return this.f73434a != C11338c.this;
            }

            @Override // java.util.Iterator
            @dgc
            public V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                C11337b<K, V> c11337b = (C11337b) this.f73434a;
                V value = c11337b.getValue();
                this.f73435b = c11337b;
                this.f73434a = c11337b.getSuccessorInValueSet();
                return value;
            }

            @Override // java.util.Iterator
            public void remove() {
                checkForComodification();
                v7d.checkState(this.f73435b != null, "no calls to next() since the last call to remove()");
                C11338c.this.remove(this.f73435b.getValue());
                this.f73436c = C11338c.this.f73430d;
                this.f73435b = null;
            }
        }

        public C11338c(@dgc K key, int expectedValues) {
            this.f73427a = key;
            this.f73428b = new C11337b[yh7.m25909a(expectedValues, 1.0d)];
        }

        private int mask() {
            return this.f73428b.length - 1;
        }

        private void rehashIfNecessary() {
            if (yh7.m25910b(this.f73429c, this.f73428b.length, 1.0d)) {
                int length = this.f73428b.length * 2;
                C11337b<K, V>[] c11337bArr = new C11337b[length];
                this.f73428b = c11337bArr;
                int i = length - 1;
                for (InterfaceC11339d<K, V> successorInValueSet = this.f73431e; successorInValueSet != this; successorInValueSet = successorInValueSet.getSuccessorInValueSet()) {
                    C11337b<K, V> c11337b = (C11337b) successorInValueSet;
                    int i2 = c11337b.f73422c & i;
                    c11337b.f73423d = c11337bArr[i2];
                    c11337bArr[i2] = c11337b;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(@dgc V value) {
            int iM25912d = yh7.m25912d(value);
            int iMask = mask() & iM25912d;
            C11337b<K, V> c11337b = this.f73428b[iMask];
            for (C11337b<K, V> c11337b2 = c11337b; c11337b2 != null; c11337b2 = c11337b2.f73423d) {
                if (c11337b2.m20110a(value, iM25912d)) {
                    return false;
                }
            }
            C11337b<K, V> c11337b3 = new C11337b<>(this.f73427a, value, iM25912d, c11337b);
            q79.succeedsInValueSet(this.f73432f, c11337b3);
            q79.succeedsInValueSet(c11337b3, this);
            q79.succeedsInMultimap(q79.this.f73417F.getPredecessorInMultimap(), c11337b3);
            q79.succeedsInMultimap(c11337b3, q79.this.f73417F);
            this.f73428b[iMask] = c11337b3;
            this.f73429c++;
            this.f73430d++;
            rehashIfNecessary();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f73428b, (Object) null);
            this.f73429c = 0;
            for (InterfaceC11339d<K, V> successorInValueSet = this.f73431e; successorInValueSet != this; successorInValueSet = successorInValueSet.getSuccessorInValueSet()) {
                q79.deleteFromMultimap((C11337b) successorInValueSet);
            }
            q79.succeedsInValueSet(this, this);
            this.f73430d++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            int iM25912d = yh7.m25912d(o);
            for (C11337b<K, V> c11337b = this.f73428b[mask() & iM25912d]; c11337b != null; c11337b = c11337b.f73423d) {
                if (c11337b.m20110a(o, iM25912d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000.q79.InterfaceC11339d
        public InterfaceC11339d<K, V> getPredecessorInValueSet() {
            return this.f73432f;
        }

        @Override // p000.q79.InterfaceC11339d
        public InterfaceC11339d<K, V> getSuccessorInValueSet() {
            return this.f73431e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @op1
        public boolean remove(@wx1 Object o) {
            int iM25912d = yh7.m25912d(o);
            int iMask = mask() & iM25912d;
            C11337b<K, V> c11337b = null;
            for (C11337b<K, V> c11337b2 = this.f73428b[iMask]; c11337b2 != null; c11337b2 = c11337b2.f73423d) {
                if (c11337b2.m20110a(o, iM25912d)) {
                    if (c11337b == null) {
                        this.f73428b[iMask] = c11337b2.f73423d;
                    } else {
                        c11337b.f73423d = c11337b2.f73423d;
                    }
                    q79.deleteFromValueSet(c11337b2);
                    q79.deleteFromMultimap(c11337b2);
                    this.f73429c--;
                    this.f73430d++;
                    return true;
                }
                c11337b = c11337b2;
            }
            return false;
        }

        @Override // p000.q79.InterfaceC11339d
        public void setPredecessorInValueSet(InterfaceC11339d<K, V> entry) {
            this.f73432f = entry;
        }

        @Override // p000.q79.InterfaceC11339d
        public void setSuccessorInValueSet(InterfaceC11339d<K, V> entry) {
            this.f73431e = entry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f73429c;
        }
    }

    /* JADX INFO: renamed from: q79$d */
    public interface InterfaceC11339d<K, V> {
        InterfaceC11339d<K, V> getPredecessorInValueSet();

        InterfaceC11339d<K, V> getSuccessorInValueSet();

        void setPredecessorInValueSet(InterfaceC11339d<K, V> entry);

        void setSuccessorInValueSet(InterfaceC11339d<K, V> entry);
    }

    private q79(int keyCapacity, int valueSetCapacity) {
        super(swc.m22273f(keyCapacity));
        this.f73416C = 2;
        s72.m21765b(valueSetCapacity, "expectedValuesPerKey");
        this.f73416C = valueSetCapacity;
        C11337b<K, V> c11337bM20109b = C11337b.m20109b();
        this.f73417F = c11337bM20109b;
        succeedsInMultimap(c11337bM20109b, c11337bM20109b);
    }

    public static <K, V> q79<K, V> create() {
        return new q79<>(16, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromMultimap(C11337b<K, V> entry) {
        succeedsInMultimap(entry.getPredecessorInMultimap(), entry.getSuccessorInMultimap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromValueSet(InterfaceC11339d<K, V> entry) {
        succeedsInValueSet(entry.getPredecessorInValueSet(), entry.getSuccessorInValueSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        C11337b<K, V> c11337bM20109b = C11337b.m20109b();
        this.f73417F = c11337bM20109b;
        succeedsInMultimap(c11337bM20109b, c11337bM20109b);
        this.f73416C = 2;
        int i = stream.readInt();
        Map mapM22273f = swc.m22273f(12);
        for (int i2 = 0; i2 < i; i2++) {
            Object object = stream.readObject();
            mapM22273f.put(object, mo9182q(object));
        }
        int i3 = stream.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            Object object2 = stream.readObject();
            Object object3 = stream.readObject();
            Collection collection = (Collection) mapM22273f.get(object2);
            Objects.requireNonNull(collection);
            collection.add(object3);
        }
        m20771u(mapM22273f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInMultimap(C11337b<K, V> pred, C11337b<K, V> succ) {
        pred.setSuccessorInMultimap(succ);
        succ.setPredecessorInMultimap(pred);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInValueSet(InterfaceC11339d<K, V> pred, InterfaceC11339d<K, V> succ) {
        pred.setSuccessorInValueSet(succ);
        succ.setPredecessorInValueSet(pred);
    }

    @jd7
    @yg8
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(keySet().size());
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
        stream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // p000.AbstractC11848r2, p000.u3b
    public void clear() {
        super.clear();
        C11337b<K, V> c11337b = this.f73417F;
        succeedsInMultimap(c11337b, c11337b);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean containsEntry(@wx1 Object key, @wx1 Object value) {
        return super.containsEntry(key, value);
    }

    @Override // p000.AbstractC11848r2, p000.u3b
    public /* bridge */ /* synthetic */ boolean containsKey(@wx1 Object key) {
        return super.containsKey(key);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean containsValue(@wx1 Object value) {
        return super.containsValue(value);
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean equals(@wx1 Object object) {
        return super.equals(object);
    }

    @Override // p000.AbstractC11848r2, p000.AbstractC2173c3
    /* JADX INFO: renamed from: f */
    public Iterator<Map.Entry<K, V>> mo3682f() {
        return new C11336a();
    }

    @Override // p000.AbstractC11848r2, p000.AbstractC2173c3
    /* JADX INFO: renamed from: g */
    public Iterator<V> mo3683g() {
        return tt9.m22777G(mo3682f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2, p000.u3b
    public /* bridge */ /* synthetic */ Set get(@dgc Object key) {
        return super.get(key);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ d4b keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean put(@dgc Object key, @dgc Object value) {
        return super.put(key, value);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean putAll(u3b multimap) {
        return super.putAll(multimap);
    }

    @Override // p000.AbstractC11848r2
    /* JADX INFO: renamed from: q */
    public Collection<V> mo9182q(@dgc K key) {
        return new C11338c(key, this.f73416C);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean remove(@wx1 Object key, @wx1 Object value) {
        return super.remove(key, value);
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ Set removeAll(@wx1 Object key) {
        return super.removeAll(key);
    }

    @Override // p000.AbstractC11848r2, p000.u3b
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // p000.AbstractC2173c3
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    public Collection<V> values() {
        return super.values();
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2
    /* JADX INFO: renamed from: y */
    public Set<V> mo9181p() {
        return swc.m22274g(this.f73416C);
    }

    public static <K, V> q79<K, V> create(int expectedKeys, int expectedValuesPerKey) {
        return new q79<>(tt9.m22790k(expectedKeys), tt9.m22790k(expectedValuesPerKey));
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2173c3, p000.u3b
    @op1
    public /* bridge */ /* synthetic */ boolean putAll(@dgc Object key, Iterable values) {
        return super.putAll(key, values);
    }

    @Override // p000.AbstractC7729j4, p000.AbstractC11848r2, p000.AbstractC2173c3, p000.u3b
    @op1
    public Set<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
        return super.replaceValues((Object) key, (Iterable) values);
    }

    public static <K, V> q79<K, V> create(u3b<? extends K, ? extends V> multimap) {
        q79<K, V> q79VarCreate = create(multimap.keySet().size(), 2);
        q79VarCreate.putAll(multimap);
        return q79VarCreate;
    }
}
