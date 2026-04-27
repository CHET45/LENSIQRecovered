package p000;

import com.blankj.utilcode.util.C2473f;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.kkg;
import p000.nlg;
import p000.tt9;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class l70<R, C, V> extends AbstractC1739b5<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: C */
    @wx1
    @ez8
    public transient l70<R, C, V>.C8647f f56356C;

    /* JADX INFO: renamed from: F */
    @wx1
    @ez8
    public transient l70<R, C, V>.C8649h f56357F;

    /* JADX INFO: renamed from: c */
    public final kx7<R> f56358c;

    /* JADX INFO: renamed from: d */
    public final kx7<C> f56359d;

    /* JADX INFO: renamed from: e */
    public final ox7<R, Integer> f56360e;

    /* JADX INFO: renamed from: f */
    public final ox7<C, Integer> f56361f;

    /* JADX INFO: renamed from: m */
    public final V[][] f56362m;

    /* JADX INFO: renamed from: l70$a */
    public class C8642a extends AbstractC14867x1<kkg.InterfaceC8439a<R, C, V>> {
        public C8642a(int size) {
            super(size);
        }

        @Override // p000.AbstractC14867x1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kkg.InterfaceC8439a<R, C, V> get(final int index) {
            return l70.this.getCell(index);
        }
    }

    /* JADX INFO: renamed from: l70$b */
    public class C8643b extends nlg.AbstractC9929b<R, C, V> {

        /* JADX INFO: renamed from: a */
        public final int f56364a;

        /* JADX INFO: renamed from: b */
        public final int f56365b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f56366c;

        public C8643b(final int val$index) {
            this.f56366c = val$index;
            this.f56364a = val$index / l70.this.f56359d.size();
            this.f56365b = val$index % l70.this.f56359d.size();
        }

        @Override // p000.kkg.InterfaceC8439a
        public C getColumnKey() {
            return (C) l70.this.f56359d.get(this.f56365b);
        }

        @Override // p000.kkg.InterfaceC8439a
        public R getRowKey() {
            return (R) l70.this.f56358c.get(this.f56364a);
        }

        @Override // p000.kkg.InterfaceC8439a
        @wx1
        public V getValue() {
            return (V) l70.this.m15360at(this.f56364a, this.f56365b);
        }
    }

    /* JADX INFO: renamed from: l70$c */
    public class C8644c extends AbstractC14867x1<V> {
        public C8644c(int size) {
            super(size);
        }

        @Override // p000.AbstractC14867x1
        @wx1
        public V get(int i) {
            return (V) l70.this.getValue(i);
        }
    }

    /* JADX INFO: renamed from: l70$d */
    public static abstract class AbstractC8645d<K, V> extends tt9.AbstractC13189a0<K, V> {

        /* JADX INFO: renamed from: a */
        public final ox7<K, Integer> f56369a;

        /* JADX INFO: renamed from: l70$d$a */
        public class a extends AbstractC13818v2<K, V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f56370a;

            public a(final int val$index) {
                this.f56370a = val$index;
            }

            @Override // p000.AbstractC13818v2, java.util.Map.Entry
            public K getKey() {
                return (K) AbstractC8645d.this.m15363c(this.f56370a);
            }

            @Override // p000.AbstractC13818v2, java.util.Map.Entry
            @dgc
            public V getValue() {
                return (V) AbstractC8645d.this.mo15365e(this.f56370a);
            }

            @Override // p000.AbstractC13818v2, java.util.Map.Entry
            @dgc
            public V setValue(@dgc V v) {
                return (V) AbstractC8645d.this.mo15366f(this.f56370a, v);
            }
        }

        /* JADX INFO: renamed from: l70$d$b */
        public class b extends AbstractC14867x1<Map.Entry<K, V>> {
            public b(int size) {
                super(size);
            }

            @Override // p000.AbstractC14867x1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(final int index) {
                return AbstractC8645d.this.m15362b(index);
            }
        }

        public /* synthetic */ AbstractC8645d(ox7 ox7Var, C8642a c8642a) {
            this(ox7Var);
        }

        @Override // p000.tt9.AbstractC13189a0
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, V>> mo10935a() {
            return new b(size());
        }

        /* JADX INFO: renamed from: b */
        public Map.Entry<K, V> m15362b(final int index) {
            v7d.checkElementIndex(index, size());
            return new a(index);
        }

        /* JADX INFO: renamed from: c */
        public K m15363c(int index) {
            return this.f56369a.keySet().asList().get(index);
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return this.f56369a.containsKey(key);
        }

        /* JADX INFO: renamed from: d */
        public abstract String mo15364d();

        @dgc
        /* JADX INFO: renamed from: e */
        public abstract V mo15365e(int index);

        @dgc
        /* JADX INFO: renamed from: f */
        public abstract V mo15366f(int index, @dgc V newValue);

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V get(@wx1 Object key) {
            Integer num = this.f56369a.get(key);
            if (num == null) {
                return null;
            }
            return mo15365e(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f56369a.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f56369a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V put(K key, @dgc V value) {
            Integer num = this.f56369a.get(key);
            if (num != null) {
                return mo15366f(num.intValue(), value);
            }
            throw new IllegalArgumentException(mo15364d() + C2473f.f17566z + key + " not in " + this.f56369a.keySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V remove(@wx1 Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f56369a.size();
        }

        private AbstractC8645d(ox7<K, Integer> keyIndex) {
            this.f56369a = keyIndex;
        }
    }

    /* JADX INFO: renamed from: l70$e */
    public class C8646e extends AbstractC8645d<R, V> {

        /* JADX INFO: renamed from: b */
        public final int f56373b;

        public C8646e(int columnIndex) {
            super(l70.this.f56360e, null);
            this.f56373b = columnIndex;
        }

        @Override // p000.l70.AbstractC8645d
        /* JADX INFO: renamed from: d */
        public String mo15364d() {
            return "Row";
        }

        @Override // p000.l70.AbstractC8645d
        @wx1
        /* JADX INFO: renamed from: e */
        public V mo15365e(int i) {
            return (V) l70.this.m15360at(i, this.f56373b);
        }

        @Override // p000.l70.AbstractC8645d
        @wx1
        /* JADX INFO: renamed from: f */
        public V mo15366f(int i, @wx1 V v) {
            return (V) l70.this.set(i, this.f56373b, v);
        }
    }

    /* JADX INFO: renamed from: l70$f */
    public class C8647f extends AbstractC8645d<C, Map<R, V>> {
        public /* synthetic */ C8647f(l70 l70Var, C8642a c8642a) {
            this();
        }

        @Override // p000.l70.AbstractC8645d
        /* JADX INFO: renamed from: d */
        public String mo15364d() {
            return "Column";
        }

        @Override // p000.l70.AbstractC8645d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<R, V> mo15365e(int index) {
            return new C8646e(index);
        }

        @Override // p000.l70.AbstractC8645d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<R, V> mo15366f(int index, Map<R, V> newValue) {
            throw new UnsupportedOperationException();
        }

        private C8647f() {
            super(l70.this.f56361f, null);
        }

        @Override // p000.l70.AbstractC8645d, java.util.AbstractMap, java.util.Map
        @wx1
        public Map<R, V> put(C key, Map<R, V> value) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: l70$g */
    public class C8648g extends AbstractC8645d<C, V> {

        /* JADX INFO: renamed from: b */
        public final int f56376b;

        public C8648g(int rowIndex) {
            super(l70.this.f56361f, null);
            this.f56376b = rowIndex;
        }

        @Override // p000.l70.AbstractC8645d
        /* JADX INFO: renamed from: d */
        public String mo15364d() {
            return "Column";
        }

        @Override // p000.l70.AbstractC8645d
        @wx1
        /* JADX INFO: renamed from: e */
        public V mo15365e(int i) {
            return (V) l70.this.m15360at(this.f56376b, i);
        }

        @Override // p000.l70.AbstractC8645d
        @wx1
        /* JADX INFO: renamed from: f */
        public V mo15366f(int i, @wx1 V v) {
            return (V) l70.this.set(this.f56376b, i, v);
        }
    }

    /* JADX INFO: renamed from: l70$h */
    public class C8649h extends AbstractC8645d<R, Map<C, V>> {
        public /* synthetic */ C8649h(l70 l70Var, C8642a c8642a) {
            this();
        }

        @Override // p000.l70.AbstractC8645d
        /* JADX INFO: renamed from: d */
        public String mo15364d() {
            return "Row";
        }

        @Override // p000.l70.AbstractC8645d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<C, V> mo15365e(int index) {
            return new C8648g(index);
        }

        @Override // p000.l70.AbstractC8645d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<C, V> mo15366f(int index, Map<C, V> newValue) {
            throw new UnsupportedOperationException();
        }

        private C8649h() {
            super(l70.this.f56360e, null);
        }

        @Override // p000.l70.AbstractC8645d, java.util.AbstractMap, java.util.Map
        @wx1
        public Map<C, V> put(R key, Map<C, V> value) {
            throw new UnsupportedOperationException();
        }
    }

    private l70(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        kx7<R> kx7VarCopyOf = kx7.copyOf(iterable);
        this.f56358c = kx7VarCopyOf;
        kx7<C> kx7VarCopyOf2 = kx7.copyOf(iterable2);
        this.f56359d = kx7VarCopyOf2;
        v7d.checkArgument(kx7VarCopyOf.isEmpty() == kx7VarCopyOf2.isEmpty());
        this.f56360e = tt9.m22795p(kx7VarCopyOf);
        this.f56361f = tt9.m22795p(kx7VarCopyOf2);
        this.f56362m = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, kx7VarCopyOf.size(), kx7VarCopyOf2.size()));
        eraseAll();
    }

    public static <R, C, V> l70<R, C, V> create(Iterable<? extends R> rowKeys, Iterable<? extends C> columnKeys) {
        return new l70<>(rowKeys, columnKeys);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public kkg.InterfaceC8439a<R, C, V> getCell(final int index) {
        return new C8643b(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @wx1
    public V getValue(int index) {
        return m15360at(index / this.f56359d.size(), index % this.f56359d.size());
    }

    @Override // p000.AbstractC1739b5
    /* JADX INFO: renamed from: a */
    public Iterator<kkg.InterfaceC8439a<R, C, V>> mo2931a() {
        return new C8642a(size());
    }

    @wx1
    /* JADX INFO: renamed from: at */
    public V m15360at(int rowIndex, int columnIndex) {
        v7d.checkElementIndex(rowIndex, this.f56358c.size());
        v7d.checkElementIndex(columnIndex, this.f56359d.size());
        return this.f56362m[rowIndex][columnIndex];
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public Set<kkg.InterfaceC8439a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.kkg
    public Map<R, V> column(C columnKey) {
        v7d.checkNotNull(columnKey);
        Integer num = this.f56361f.get(columnKey);
        return num == null ? Collections.emptyMap() : new C8646e(num.intValue());
    }

    public kx7<C> columnKeyList() {
        return this.f56359d;
    }

    @Override // p000.kkg
    public Map<C, Map<R, V>> columnMap() {
        l70<R, C, V>.C8647f c8647f = this.f56356C;
        if (c8647f != null) {
            return c8647f;
        }
        l70<R, C, V>.C8647f c8647f2 = new C8647f(this, null);
        this.f56356C = c8647f2;
        return c8647f2;
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public boolean contains(@wx1 Object rowKey, @wx1 Object columnKey) {
        return containsRow(rowKey) && containsColumn(columnKey);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public boolean containsColumn(@wx1 Object columnKey) {
        return this.f56361f.containsKey(columnKey);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public boolean containsRow(@wx1 Object rowKey) {
        return this.f56360e.containsKey(rowKey);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public boolean containsValue(@wx1 Object value) {
        for (V[] vArr : this.f56362m) {
            for (V v : vArr) {
                if (okb.equal(value, v)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC1739b5
    /* JADX INFO: renamed from: d */
    public Iterator<V> mo2934d() {
        return new C8644c(size());
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ boolean equals(@wx1 Object obj) {
        return super.equals(obj);
    }

    @op1
    @wx1
    public V erase(@wx1 Object rowKey, @wx1 Object columnKey) {
        Integer num = this.f56360e.get(rowKey);
        Integer num2 = this.f56361f.get(columnKey);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), null);
    }

    public void eraseAll() {
        for (V[] vArr : this.f56362m) {
            Arrays.fill(vArr, (Object) null);
        }
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    @wx1
    public V get(@wx1 Object rowKey, @wx1 Object columnKey) {
        Integer num = this.f56360e.get(rowKey);
        Integer num2 = this.f56361f.get(columnKey);
        if (num == null || num2 == null) {
            return null;
        }
        return m15360at(num.intValue(), num2.intValue());
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public boolean isEmpty() {
        return this.f56358c.isEmpty() || this.f56359d.isEmpty();
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    @op1
    @wx1
    public V put(R rowKey, C columnKey, @wx1 V value) {
        v7d.checkNotNull(rowKey);
        v7d.checkNotNull(columnKey);
        Integer num = this.f56360e.get(rowKey);
        v7d.checkArgument(num != null, "Row %s not in %s", rowKey, this.f56358c);
        Integer num2 = this.f56361f.get(columnKey);
        v7d.checkArgument(num2 != null, "Column %s not in %s", columnKey, this.f56359d);
        return set(num.intValue(), num2.intValue(), value);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public void putAll(kkg<? extends R, ? extends C, ? extends V> table) {
        super.putAll(table);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public V remove(@wx1 Object rowKey, @wx1 Object columnKey) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.kkg
    public Map<C, V> row(R rowKey) {
        v7d.checkNotNull(rowKey);
        Integer num = this.f56360e.get(rowKey);
        return num == null ? Collections.emptyMap() : new C8648g(num.intValue());
    }

    public kx7<R> rowKeyList() {
        return this.f56358c;
    }

    @Override // p000.kkg
    public Map<R, Map<C, V>> rowMap() {
        l70<R, C, V>.C8649h c8649h = this.f56357F;
        if (c8649h != null) {
            return c8649h;
        }
        l70<R, C, V>.C8649h c8649h2 = new C8649h(this, null);
        this.f56357F = c8649h2;
        return c8649h2;
    }

    @op1
    @wx1
    public V set(int rowIndex, int columnIndex, @wx1 V value) {
        v7d.checkElementIndex(rowIndex, this.f56358c.size());
        v7d.checkElementIndex(columnIndex, this.f56359d.size());
        V[] vArr = this.f56362m[rowIndex];
        V v = vArr[columnIndex];
        vArr[columnIndex] = value;
        return v;
    }

    @Override // p000.kkg
    public int size() {
        return this.f56358c.size() * this.f56359d.size();
    }

    @jd7
    public V[][] toArray(Class<V> cls) {
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) cls, this.f56358c.size(), this.f56359d.size()));
        for (int i = 0; i < this.f56358c.size(); i++) {
            V[] vArr2 = this.f56362m[i];
            System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
        return vArr;
    }

    @Override // p000.AbstractC1739b5
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public Collection<V> values() {
        return super.values();
    }

    public static <R, C, V> l70<R, C, V> create(kkg<R, C, ? extends V> table) {
        return table instanceof l70 ? new l70<>((l70) table) : new l70<>(table);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public dy7<C> columnKeySet() {
        return this.f56361f.keySet();
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public dy7<R> rowKeySet() {
        return this.f56360e.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l70(kkg<R, C, ? extends V> table) {
        this(table.rowKeySet(), table.columnKeySet());
        putAll(table);
    }

    private l70(l70<R, C, V> l70Var) {
        kx7<R> kx7Var = l70Var.f56358c;
        this.f56358c = kx7Var;
        kx7<C> kx7Var2 = l70Var.f56359d;
        this.f56359d = kx7Var2;
        this.f56360e = l70Var.f56360e;
        this.f56361f = l70Var.f56361f;
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, kx7Var.size(), kx7Var2.size()));
        this.f56362m = vArr;
        for (int i = 0; i < this.f56358c.size(); i++) {
            V[] vArr2 = l70Var.f56362m[i];
            System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
    }
}
