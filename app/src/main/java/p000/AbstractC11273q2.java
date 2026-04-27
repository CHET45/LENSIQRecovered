package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: q2 */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.1")
@dwf({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1755#2,3:154\n1734#2,3:157\n295#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
public abstract class AbstractC11273q2<K, V> implements Map<K, V>, uo8 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final a f72987c = new a(null);

    /* JADX INFO: renamed from: a */
    @gib
    public volatile Set<? extends K> f72988a;

    /* JADX INFO: renamed from: b */
    @gib
    public volatile Collection<? extends V> f72989b;

    /* JADX INFO: renamed from: q2$a */
    @dwf({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class a {
        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }

        public final boolean entryEquals$kotlin_stdlib(@yfb Map.Entry<?, ?> entry, @gib Object obj) {
            md8.checkNotNullParameter(entry, "e");
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry2 = (Map.Entry) obj;
            return md8.areEqual(entry.getKey(), entry2.getKey()) && md8.areEqual(entry.getValue(), entry2.getValue());
        }

        public final int entryHashCode$kotlin_stdlib(@yfb Map.Entry<?, ?> entry) {
            md8.checkNotNullParameter(entry, "e");
            Object key = entry.getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = entry.getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @yfb
        public final String entryToString$kotlin_stdlib(@yfb Map.Entry<?, ?> entry) {
            md8.checkNotNullParameter(entry, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            return sb.toString();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: q2$b */
    public static final class b extends AbstractC7141i4<K> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC11273q2<K, V> f72990b;

        /* JADX INFO: renamed from: q2$b$a */
        public static final class a implements Iterator<K>, uo8 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f72991a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f72991a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f72991a.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f72991a.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(AbstractC11273q2<K, ? extends V> abstractC11273q2) {
            this.f72990b = abstractC11273q2;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f72990b.containsKey(obj);
        }

        @Override // p000.AbstractC10126o0
        public int getSize() {
            return this.f72990b.size();
        }

        @Override // p000.AbstractC7141i4, p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this.f72990b.entrySet().iterator());
        }
    }

    /* JADX INFO: renamed from: q2$c */
    public static final class c extends AbstractC10126o0<V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC11273q2<K, V> f72992a;

        /* JADX INFO: renamed from: q2$c$a */
        public static final class a implements Iterator<V>, uo8 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f72993a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f72993a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f72993a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f72993a.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(AbstractC11273q2<K, ? extends V> abstractC11273q2) {
            this.f72992a = abstractC11273q2;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f72992a.containsValue(obj);
        }

        @Override // p000.AbstractC10126o0
        public int getSize() {
            return this.f72992a.size();
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new a(this.f72992a.entrySet().iterator());
        }
    }

    private final Map.Entry<K, V> implFindEntry(K k) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (md8.areEqual(((Map.Entry) next).getKey(), k)) {
                break;
            }
        }
        return (Map.Entry) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$2(AbstractC11273q2 abstractC11273q2, Map.Entry entry) {
        md8.checkNotNullParameter(entry, "it");
        return abstractC11273q2.toString(entry);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsEntry$kotlin_stdlib(@gib Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        md8.checkNotNull(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v = get(key);
        if (!md8.areEqual(value, v)) {
            return false;
        }
        if (v != null) {
            return true;
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return implFindEntry(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (md8.areEqual(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@gib Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!containsEntry$kotlin_stdlib((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @gib
    public V get(Object obj) {
        Map.Entry<K, V> entryImplFindEntry = implFindEntry(obj);
        if (entryImplFindEntry != null) {
            return entryImplFindEntry.getValue();
        }
        return null;
    }

    public abstract Set getEntries();

    @yfb
    public Set<K> getKeys() {
        if (this.f72988a == null) {
            this.f72988a = new b(this);
        }
        Set<? extends K> set = this.f72988a;
        md8.checkNotNull(set);
        return set;
    }

    public int getSize() {
        return entrySet().size();
    }

    @yfb
    public Collection<V> getValues() {
        if (this.f72989b == null) {
            this.f72989b = new c(this);
        }
        Collection<? extends V> collection = this.f72989b;
        md8.checkNotNull(collection);
        return collection;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @yfb
    public String toString() {
        return v82.joinToString$default(entrySet(), ", ", "{", "}", 0, null, new qy6() { // from class: p2
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return AbstractC11273q2.toString$lambda$2(this.f69466a, (Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    private final String toString(Map.Entry<? extends K, ? extends V> entry) {
        return toString(entry.getKey()) + '=' + toString(entry.getValue());
    }

    private final String toString(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }
}
