package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.kkg;
import p000.t6f;
import p000.tt9;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public class i1g<R, C, V> extends AbstractC1739b5<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    @ld7
    public final Map<R, Map<C, V>> f45450c;

    /* JADX INFO: renamed from: d */
    @ld7
    public final lfg<? extends Map<C, V>> f45451d;

    /* JADX INFO: renamed from: e */
    @wx1
    @ez8
    public transient Set<C> f45452e;

    /* JADX INFO: renamed from: f */
    @wx1
    @ez8
    public transient Map<R, Map<C, V>> f45453f;

    /* JADX INFO: renamed from: m */
    @wx1
    @ez8
    public transient i1g<R, C, V>.C7106f f45454m;

    /* JADX INFO: renamed from: i1g$b */
    public class C7102b implements Iterator<kkg.InterfaceC8439a<R, C, V>> {

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<R, Map<C, V>>> f45455a;

        /* JADX INFO: renamed from: b */
        @wx1
        public Map.Entry<R, Map<C, V>> f45456b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<C, V>> f45457c;

        private C7102b() {
            this.f45455a = i1g.this.f45450c.entrySet().iterator();
            this.f45457c = wg8.m24513g();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f45455a.hasNext() || this.f45457c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f45457c.remove();
            Map.Entry<R, Map<C, V>> entry = this.f45456b;
            Objects.requireNonNull(entry);
            if (entry.getValue().isEmpty()) {
                this.f45455a.remove();
                this.f45456b = null;
            }
        }

        @Override // java.util.Iterator
        public kkg.InterfaceC8439a<R, C, V> next() {
            if (!this.f45457c.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f45455a.next();
                this.f45456b = next;
                this.f45457c = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.f45456b);
            Map.Entry<C, V> next2 = this.f45457c.next();
            return nlg.immutableCell(this.f45456b.getKey(), next2.getKey(), next2.getValue());
        }
    }

    /* JADX INFO: renamed from: i1g$c */
    public class C7103c extends tt9.AbstractC13223r0<R, V> {

        /* JADX INFO: renamed from: d */
        public final C f45459d;

        /* JADX INFO: renamed from: i1g$c$a */
        public class a extends t6f.AbstractC12934k<Map.Entry<R, V>> {
            private a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                C7103c.this.m12723b(p8d.alwaysTrue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@wx1 Object o) {
                if (!(o instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) o;
                return i1g.this.containsMapping(entry.getKey(), C7103c.this.f45459d, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                C7103c c7103c = C7103c.this;
                return !i1g.this.containsColumn(c7103c.f45459d);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
                return new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@wx1 Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return i1g.this.removeMapping(entry.getKey(), C7103c.this.f45459d, entry.getValue());
            }

            @Override // p000.t6f.AbstractC12934k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c) {
                return C7103c.this.m12723b(p8d.not(p8d.m19339in(c)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<C, V>> it = i1g.this.f45450c.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(C7103c.this.f45459d)) {
                        i++;
                    }
                }
                return i;
            }
        }

        /* JADX INFO: renamed from: i1g$c$b */
        public class b extends AbstractC0012a2<Map.Entry<R, V>> {

            /* JADX INFO: renamed from: c */
            public final Iterator<Map.Entry<R, Map<C, V>>> f45462c;

            /* JADX INFO: renamed from: i1g$c$b$a */
            public class a extends AbstractC13818v2<R, V> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Map.Entry f45464a;

                public a(final Map.Entry val$entry) {
                    this.f45464a = val$entry;
                }

                @Override // p000.AbstractC13818v2, java.util.Map.Entry
                public R getKey() {
                    return (R) this.f45464a.getKey();
                }

                @Override // p000.AbstractC13818v2, java.util.Map.Entry
                public V getValue() {
                    return (V) ((Map) this.f45464a.getValue()).get(C7103c.this.f45459d);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p000.AbstractC13818v2, java.util.Map.Entry
                public V setValue(V v) {
                    return (V) sib.m22018a(((Map) this.f45464a.getValue()).put(C7103c.this.f45459d, v7d.checkNotNull(v)));
                }
            }

            private b() {
                this.f45462c = i1g.this.f45450c.entrySet().iterator();
            }

            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<R, V> computeNext() {
                while (this.f45462c.hasNext()) {
                    Map.Entry<R, Map<C, V>> next = this.f45462c.next();
                    if (next.getValue().containsKey(C7103c.this.f45459d)) {
                        return new a(next);
                    }
                }
                return m25a();
            }
        }

        /* JADX INFO: renamed from: i1g$c$c */
        public class c extends tt9.C13191b0<R, V> {
            public c() {
                super(C7103c.this);
            }

            @Override // p000.tt9.C13191b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@wx1 Object obj) {
                C7103c c7103c = C7103c.this;
                return i1g.this.contains(obj, c7103c.f45459d);
            }

            @Override // p000.tt9.C13191b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@wx1 Object obj) {
                C7103c c7103c = C7103c.this;
                return i1g.this.remove(obj, c7103c.f45459d) != null;
            }

            @Override // p000.t6f.AbstractC12934k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(final Collection<?> c) {
                return C7103c.this.m12723b(tt9.m22799t(p8d.not(p8d.m19339in(c))));
            }
        }

        /* JADX INFO: renamed from: i1g$c$d */
        public class d extends tt9.C13221q0<R, V> {
            public d() {
                super(C7103c.this);
            }

            @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@wx1 Object obj) {
                return obj != null && C7103c.this.m12723b(tt9.m22779I(p8d.equalTo(obj)));
            }

            @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(final Collection<?> c) {
                return C7103c.this.m12723b(tt9.m22779I(p8d.m19339in(c)));
            }

            @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(final Collection<?> c) {
                return C7103c.this.m12723b(tt9.m22779I(p8d.not(p8d.m19339in(c))));
            }
        }

        public C7103c(C c2) {
            this.f45459d = (C) v7d.checkNotNull(c2);
        }

        @Override // p000.tt9.AbstractC13223r0
        /* JADX INFO: renamed from: a */
        public Collection<V> mo8721a() {
            return new d();
        }

        @op1
        /* JADX INFO: renamed from: b */
        public boolean m12723b(l8d<? super Map.Entry<R, V>> predicate) {
            Iterator<Map.Entry<R, Map<C, V>>> it = i1g.this.f45450c.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v = value.get(this.f45459d);
                if (v != null && predicate.apply(tt9.immutableEntry(next.getKey(), v))) {
                    value.remove(this.f45459d);
                    if (value.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return i1g.this.contains(key, this.f45459d);
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<Map.Entry<R, V>> createEntrySet() {
            return new a();
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<R> createKeySet() {
            return new c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V get(@wx1 Object obj) {
            return (V) i1g.this.get(obj, this.f45459d);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V put(R r, V v) {
            return (V) i1g.this.put(r, this.f45459d, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V remove(@wx1 Object obj) {
            return (V) i1g.this.remove(obj, this.f45459d);
        }
    }

    /* JADX INFO: renamed from: i1g$d */
    public class C7104d extends AbstractC0012a2<C> {

        /* JADX INFO: renamed from: c */
        public final Map<C, V> f45468c;

        /* JADX INFO: renamed from: d */
        public final Iterator<Map<C, V>> f45469d;

        /* JADX INFO: renamed from: e */
        public Iterator<Map.Entry<C, V>> f45470e;

        private C7104d() {
            this.f45468c = i1g.this.f45451d.get();
            this.f45469d = i1g.this.f45450c.values().iterator();
            this.f45470e = wg8.m24511e();
        }

        @Override // p000.AbstractC0012a2
        @wx1
        public C computeNext() {
            while (true) {
                if (this.f45470e.hasNext()) {
                    Map.Entry<C, V> next = this.f45470e.next();
                    if (!this.f45468c.containsKey(next.getKey())) {
                        this.f45468c.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    if (!this.f45469d.hasNext()) {
                        return m25a();
                    }
                    this.f45470e = this.f45469d.next().entrySet().iterator();
                }
            }
        }
    }

    /* JADX INFO: renamed from: i1g$e */
    public class C7105e extends i1g<R, C, V>.AbstractC7109i<C> {
        private C7105e() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object obj) {
            return i1g.this.containsColumn(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return i1g.this.mo12722h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = i1g.this.f45450c.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // p000.t6f.AbstractC12934k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c) {
            v7d.checkNotNull(c);
            Iterator<Map<C, V>> it = i1g.this.f45450c.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (wg8.removeAll(next.keySet().iterator(), c)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // p000.t6f.AbstractC12934k, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c) {
            v7d.checkNotNull(c);
            Iterator<Map<C, V>> it = i1g.this.f45450c.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().retainAll(c)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return wg8.size(iterator());
        }
    }

    /* JADX INFO: renamed from: i1g$f */
    public class C7106f extends tt9.AbstractC13223r0<C, Map<R, V>> {

        /* JADX INFO: renamed from: i1g$f$a */
        public class a extends i1g<R, C, V>.AbstractC7109i<Map.Entry<C, Map<R, V>>> {

            /* JADX INFO: renamed from: i1g$f$a$a, reason: collision with other inner class name */
            public class C16452a implements lz6<C, Map<R, V>> {
                public C16452a() {
                }

                @Override // p000.lz6
                public Map<R, V> apply(C columnKey) {
                    return i1g.this.column(columnKey);
                }
            }

            public a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@wx1 Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!i1g.this.containsColumn(entry.getKey())) {
                    return false;
                }
                Map<R, V> map = C7106f.this.get(entry.getKey());
                Objects.requireNonNull(map);
                return map.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return tt9.m22788i(i1g.this.columnKeySet(), new C16452a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@wx1 Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                i1g.this.removeColumn(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // p000.t6f.AbstractC12934k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> c) {
                v7d.checkNotNull(c);
                return t6f.m22399d(this, c.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.t6f.AbstractC12934k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c) {
                v7d.checkNotNull(c);
                boolean z = false;
                for (Object obj : eb9.newArrayList(i1g.this.columnKeySet().iterator())) {
                    if (!c.contains(tt9.immutableEntry(obj, i1g.this.column(obj)))) {
                        i1g.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return i1g.this.columnKeySet().size();
            }
        }

        /* JADX INFO: renamed from: i1g$f$b */
        public class b extends tt9.C13221q0<C, Map<R, V>> {
            public b() {
                super(C7106f.this);
            }

            @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@wx1 Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : C7106f.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        i1g.this.removeColumn(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> c) {
                v7d.checkNotNull(c);
                boolean z = false;
                for (Object obj : eb9.newArrayList(i1g.this.columnKeySet().iterator())) {
                    if (c.contains(i1g.this.column(obj))) {
                        i1g.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> c) {
                v7d.checkNotNull(c);
                boolean z = false;
                for (Object obj : eb9.newArrayList(i1g.this.columnKeySet().iterator())) {
                    if (!c.contains(i1g.this.column(obj))) {
                        i1g.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }
        }

        private C7106f() {
        }

        @Override // p000.tt9.AbstractC13223r0
        /* JADX INFO: renamed from: a */
        public Collection<Map<R, V>> mo8721a() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return i1g.this.containsColumn(key);
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<Map.Entry<C, Map<R, V>>> createEntrySet() {
            return new a();
        }

        @Override // p000.tt9.AbstractC13223r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<C> keySet() {
            return i1g.this.columnKeySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public Map<R, V> get(@wx1 Object key) {
            if (!i1g.this.containsColumn(key)) {
                return null;
            }
            i1g i1gVar = i1g.this;
            Objects.requireNonNull(key);
            return i1gVar.column(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public Map<R, V> remove(@wx1 Object key) {
            if (i1g.this.containsColumn(key)) {
                return i1g.this.removeColumn(key);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: i1g$g */
    public class C7107g extends tt9.AbstractC13189a0<C, V> {

        /* JADX INFO: renamed from: a */
        public final R f45477a;

        /* JADX INFO: renamed from: b */
        @wx1
        public Map<C, V> f45478b;

        /* JADX INFO: renamed from: i1g$g$a */
        public class a implements Iterator<Map.Entry<C, V>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Iterator f45480a;

            public a(final Iterator val$iterator) {
                this.f45480a = val$iterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f45480a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f45480a.remove();
                C7107g.this.mo12726c();
            }

            @Override // java.util.Iterator
            public Map.Entry<C, V> next() {
                return C7107g.this.m12728e((Map.Entry) this.f45480a.next());
            }
        }

        /* JADX INFO: renamed from: i1g$g$b */
        public class b extends rs6<C, V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Map.Entry f45482a;

            public b(final C7107g this$1, final Map.Entry val$entry) {
                this.f45482a = val$entry;
            }

            @Override // p000.rs6, p000.zs6
            /* JADX INFO: renamed from: a */
            public Map.Entry<C, V> mo8967m() {
                return this.f45482a;
            }

            @Override // p000.rs6, java.util.Map.Entry
            public boolean equals(@wx1 Object object) {
                return m21506b(object);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.rs6, java.util.Map.Entry
            public V setValue(V v) {
                return (V) super.setValue(v7d.checkNotNull(v));
            }
        }

        public C7107g(R r) {
            this.f45477a = (R) v7d.checkNotNull(r);
        }

        @Override // p000.tt9.AbstractC13189a0
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<C, V>> mo10935a() {
            m12727d();
            Map<C, V> map = this.f45478b;
            return map == null ? wg8.m24513g() : new a(map.entrySet().iterator());
        }

        @wx1
        /* JADX INFO: renamed from: b */
        public Map<C, V> mo12725b() {
            return i1g.this.f45450c.get(this.f45477a);
        }

        /* JADX INFO: renamed from: c */
        public void mo12726c() {
            m12727d();
            Map<C, V> map = this.f45478b;
            if (map == null || !map.isEmpty()) {
                return;
            }
            i1g.this.f45450c.remove(this.f45477a);
            this.f45478b = null;
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            m12727d();
            Map<C, V> map = this.f45478b;
            if (map != null) {
                map.clear();
            }
            mo12726c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            Map<C, V> map;
            m12727d();
            return (key == null || (map = this.f45478b) == null || !tt9.m22803x(map, key)) ? false : true;
        }

        /* JADX INFO: renamed from: d */
        public final void m12727d() {
            Map<C, V> map = this.f45478b;
            if (map == null || (map.isEmpty() && i1g.this.f45450c.containsKey(this.f45477a))) {
                this.f45478b = mo12725b();
            }
        }

        /* JADX INFO: renamed from: e */
        public Map.Entry<C, V> m12728e(final Map.Entry<C, V> entry) {
            return new b(this, entry);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V get(@wx1 Object obj) {
            Map<C, V> map;
            m12727d();
            if (obj == null || (map = this.f45478b) == null) {
                return null;
            }
            return (V) tt9.m22804y(map, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V put(C c, V v) {
            v7d.checkNotNull(c);
            v7d.checkNotNull(v);
            Map<C, V> map = this.f45478b;
            return (map == null || map.isEmpty()) ? (V) i1g.this.put(this.f45477a, c, v) : this.f45478b.put(c, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V remove(@wx1 Object obj) {
            m12727d();
            Map<C, V> map = this.f45478b;
            if (map == null) {
                return null;
            }
            V v = (V) tt9.m22805z(map, obj);
            mo12726c();
            return v;
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public int size() {
            m12727d();
            Map<C, V> map = this.f45478b;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    /* JADX INFO: renamed from: i1g$h */
    public class C7108h extends tt9.AbstractC13223r0<R, Map<C, V>> {

        /* JADX INFO: renamed from: i1g$h$a */
        public class a extends i1g<R, C, V>.AbstractC7109i<Map.Entry<R, Map<C, V>>> {

            /* JADX INFO: renamed from: i1g$h$a$a, reason: collision with other inner class name */
            public class C16453a implements lz6<R, Map<C, V>> {
                public C16453a() {
                }

                @Override // p000.lz6
                public Map<C, V> apply(R rowKey) {
                    return i1g.this.row(rowKey);
                }
            }

            public a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@wx1 Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && h82.m12263d(i1g.this.f45450c.entrySet(), entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return tt9.m22788i(i1g.this.f45450c.keySet(), new C16453a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@wx1 Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && i1g.this.f45450c.entrySet().remove(entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return i1g.this.f45450c.size();
            }
        }

        public C7108h() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return i1g.this.containsRow(key);
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<Map.Entry<R, Map<C, V>>> createEntrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public Map<C, V> get(@wx1 Object key) {
            if (!i1g.this.containsRow(key)) {
                return null;
            }
            i1g i1gVar = i1g.this;
            Objects.requireNonNull(key);
            return i1gVar.row(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public Map<C, V> remove(@wx1 Object key) {
            if (key == null) {
                return null;
            }
            return i1g.this.f45450c.remove(key);
        }
    }

    /* JADX INFO: renamed from: i1g$i */
    public abstract class AbstractC7109i<T> extends t6f.AbstractC12934k<T> {
        private AbstractC7109i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i1g.this.f45450c.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return i1g.this.f45450c.isEmpty();
        }
    }

    public i1g(Map<R, Map<C, V>> backingMap, lfg<? extends Map<C, V>> factory) {
        this.f45450c = backingMap;
        this.f45451d = factory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean containsMapping(@wx1 Object rowKey, @wx1 Object columnKey, @wx1 Object value) {
        return value != null && value.equals(get(rowKey, columnKey));
    }

    private Map<C, V> getOrCreate(R rowKey) {
        Map<C, V> map = this.f45450c.get(rowKey);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = this.f45451d.get();
        this.f45450c.put(rowKey, map2);
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @op1
    public Map<R, V> removeColumn(@wx1 Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.f45450c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it.next();
            V vRemove = next.getValue().remove(obj);
            if (vRemove != null) {
                linkedHashMap.put(next.getKey(), vRemove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeMapping(@wx1 Object rowKey, @wx1 Object columnKey, @wx1 Object value) {
        if (!containsMapping(rowKey, columnKey, value)) {
            return false;
        }
        remove(rowKey, columnKey);
        return true;
    }

    @Override // p000.AbstractC1739b5
    /* JADX INFO: renamed from: a */
    public Iterator<kkg.InterfaceC8439a<R, C, V>> mo2931a() {
        return new C7102b();
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public Set<kkg.InterfaceC8439a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public void clear() {
        this.f45450c.clear();
    }

    @Override // p000.kkg
    public Map<R, V> column(C columnKey) {
        return new C7103c(columnKey);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public Set<C> columnKeySet() {
        Set<C> set = this.f45452e;
        if (set != null) {
            return set;
        }
        C7105e c7105e = new C7105e();
        this.f45452e = c7105e;
        return c7105e;
    }

    @Override // p000.kkg
    public Map<C, Map<R, V>> columnMap() {
        i1g<R, C, V>.C7106f c7106f = this.f45454m;
        if (c7106f != null) {
            return c7106f;
        }
        i1g<R, C, V>.C7106f c7106f2 = new C7106f();
        this.f45454m = c7106f2;
        return c7106f2;
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public boolean contains(@wx1 Object rowKey, @wx1 Object columnKey) {
        return (rowKey == null || columnKey == null || !super.contains(rowKey, columnKey)) ? false : true;
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public boolean containsColumn(@wx1 Object columnKey) {
        if (columnKey == null) {
            return false;
        }
        Iterator<Map<C, V>> it = this.f45450c.values().iterator();
        while (it.hasNext()) {
            if (tt9.m22803x(it.next(), columnKey)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public boolean containsRow(@wx1 Object rowKey) {
        return rowKey != null && tt9.m22803x(this.f45450c, rowKey);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public boolean containsValue(@wx1 Object value) {
        return value != null && super.containsValue(value);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    @wx1
    public V get(@wx1 Object obj, @wx1 Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.get(obj, obj2);
    }

    /* JADX INFO: renamed from: h */
    public Iterator<C> mo12722h() {
        return new C7104d();
    }

    /* JADX INFO: renamed from: i */
    public Map<R, Map<C, V>> mo11306i() {
        return new C7108h();
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public boolean isEmpty() {
        return this.f45450c.isEmpty();
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    @op1
    @wx1
    public V put(R rowKey, C columnKey, V value) {
        v7d.checkNotNull(rowKey);
        v7d.checkNotNull(columnKey);
        v7d.checkNotNull(value);
        return getOrCreate(rowKey).put(columnKey, value);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    @op1
    @wx1
    public V remove(@wx1 Object obj, @wx1 Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) tt9.m22804y(this.f45450c, obj)) == null) {
            return null;
        }
        V v = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.f45450c.remove(obj);
        }
        return v;
    }

    @Override // p000.kkg
    public Map<C, V> row(R rowKey) {
        return new C7107g(rowKey);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // p000.kkg
    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.f45453f;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapMo11306i = mo11306i();
        this.f45453f = mapMo11306i;
        return mapMo11306i;
    }

    @Override // p000.kkg
    public int size() {
        Iterator<Map<C, V>> it = this.f45450c.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public Collection<V> values() {
        return super.values();
    }
}
