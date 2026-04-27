package p000;

import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import com.tencent.mmkv.MMKVContentProvider;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p000.js9;
import p000.ox7;
import p000.t6f;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class tt9 {

    /* JADX INFO: Add missing generic type declarations: [V1, V2] */
    /* JADX INFO: renamed from: tt9$a */
    public class C13188a<V1, V2> implements lz6<V1, V2> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC13225t f85827a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f85828b;

        public C13188a(final InterfaceC13225t val$transformer, final Object val$key) {
            this.f85827a = val$transformer;
            this.f85828b = val$key;
        }

        @Override // p000.lz6
        @dgc
        public V2 apply(@dgc V1 v1) {
            return (V2) this.f85827a.transformEntry(this.f85828b, v1);
        }
    }

    /* JADX INFO: renamed from: tt9$a0 */
    public static abstract class AbstractC13189a0<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: tt9$a0$a */
        public class a extends AbstractC13224s<K, V> {
            public a() {
            }

            @Override // p000.tt9.AbstractC13224s
            /* JADX INFO: renamed from: a */
            public Map<K, V> mo8722a() {
                return AbstractC13189a0.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return AbstractC13189a0.this.mo10935a();
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract Iterator<Map.Entry<K, V>> mo10935a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            wg8.m24509c(mo10935a());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* JADX INFO: renamed from: tt9$b */
    public class C13190b<K, V1, V2> implements lz6<Map.Entry<K, V1>, V2> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC13225t f85830a;

        public C13190b(final InterfaceC13225t val$transformer) {
            this.f85830a = val$transformer;
        }

        @Override // p000.lz6
        @dgc
        public V2 apply(Map.Entry<K, V1> entry) {
            return (V2) this.f85830a.transformEntry(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: tt9$b0 */
    public static class C13191b0<K, V> extends t6f.AbstractC12934k<K> {

        /* JADX INFO: renamed from: a */
        @Weak
        public final Map<K, V> f85831a;

        public C13191b0(Map<K, V> map) {
            this.f85831a = (Map) v7d.checkNotNull(map);
        }

        /* JADX INFO: renamed from: a */
        public Map<K, V> mo22808b() {
            return this.f85831a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo22808b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            return mo22808b().containsKey(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo22808b().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return tt9.m22797r(mo22808b().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object o) {
            if (!contains(o)) {
                return false;
            }
            mo22808b().remove(o);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo22808b().size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    /* JADX INFO: renamed from: tt9$c */
    public class C13192c<K, V2> extends AbstractC13818v2<K, V2> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map.Entry f85832a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC13225t f85833b;

        public C13192c(final Map.Entry val$entry, final InterfaceC13225t val$transformer) {
            this.f85832a = val$entry;
            this.f85833b = val$transformer;
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public K getKey() {
            return (K) this.f85832a.getKey();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public V2 getValue() {
            return (V2) this.f85833b.transformEntry(this.f85832a.getKey(), this.f85832a.getValue());
        }
    }

    /* JADX INFO: renamed from: tt9$c0 */
    public static class C13193c0<K, V> implements js9<K, V> {

        /* JADX INFO: renamed from: a */
        public final Map<K, V> f85834a;

        /* JADX INFO: renamed from: b */
        public final Map<K, V> f85835b;

        /* JADX INFO: renamed from: c */
        public final Map<K, V> f85836c;

        /* JADX INFO: renamed from: d */
        public final Map<K, js9.InterfaceC8052a<V>> f85837d;

        public C13193c0(Map<K, V> onlyOnLeft, Map<K, V> onlyOnRight, Map<K, V> onBoth, Map<K, js9.InterfaceC8052a<V>> differences) {
            this.f85834a = tt9.unmodifiableMap(onlyOnLeft);
            this.f85835b = tt9.unmodifiableMap(onlyOnRight);
            this.f85836c = tt9.unmodifiableMap(onBoth);
            this.f85837d = tt9.unmodifiableMap(differences);
        }

        @Override // p000.js9
        public boolean areEqual() {
            return this.f85834a.isEmpty() && this.f85835b.isEmpty() && this.f85837d.isEmpty();
        }

        @Override // p000.js9
        public Map<K, js9.InterfaceC8052a<V>> entriesDiffering() {
            return this.f85837d;
        }

        @Override // p000.js9
        public Map<K, V> entriesInCommon() {
            return this.f85836c;
        }

        @Override // p000.js9
        public Map<K, V> entriesOnlyOnLeft() {
            return this.f85834a;
        }

        @Override // p000.js9
        public Map<K, V> entriesOnlyOnRight() {
            return this.f85835b;
        }

        @Override // p000.js9
        public boolean equals(@wx1 Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof js9)) {
                return false;
            }
            js9 js9Var = (js9) object;
            return entriesOnlyOnLeft().equals(js9Var.entriesOnlyOnLeft()) && entriesOnlyOnRight().equals(js9Var.entriesOnlyOnRight()) && entriesInCommon().equals(js9Var.entriesInCommon()) && entriesDiffering().equals(js9Var.entriesDiffering());
        }

        @Override // p000.js9
        public int hashCode() {
            return okb.hashCode(entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering());
        }

        public String toString() {
            if (areEqual()) {
                return "equal";
            }
            StringBuilder sb = new StringBuilder("not equal");
            if (!this.f85834a.isEmpty()) {
                sb.append(": only on left=");
                sb.append(this.f85834a);
            }
            if (!this.f85835b.isEmpty()) {
                sb.append(": only on right=");
                sb.append(this.f85835b);
            }
            if (!this.f85837d.isEmpty()) {
                sb.append(": value differences=");
                sb.append(this.f85837d);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* JADX INFO: renamed from: tt9$d */
    public class C13194d<K, V1, V2> implements lz6<Map.Entry<K, V1>, Map.Entry<K, V2>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC13225t f85838a;

        public C13194d(final InterfaceC13225t val$transformer) {
            this.f85838a = val$transformer;
        }

        @Override // p000.lz6
        public Map.Entry<K, V2> apply(final Map.Entry<K, V1> entry) {
            return tt9.m22772B(this.f85838a, entry);
        }
    }

    /* JADX INFO: renamed from: tt9$d0 */
    @jd7
    public static final class C13195d0<K, V> extends AbstractC7124i3<K, V> {

        /* JADX INFO: renamed from: a */
        public final NavigableSet<K> f85839a;

        /* JADX INFO: renamed from: b */
        public final lz6<? super K, V> f85840b;

        public C13195d0(NavigableSet<K> ks, lz6<? super K, V> vFunction) {
            this.f85839a = (NavigableSet) v7d.checkNotNull(ks);
            this.f85840b = (lz6) v7d.checkNotNull(vFunction);
        }

        @Override // p000.tt9.AbstractC13189a0
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, V>> mo10935a() {
            return tt9.m22788i(this.f85839a, this.f85840b);
        }

        @Override // p000.AbstractC7124i3
        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<K, V>> mo11694b() {
            return descendingMap().entrySet().iterator();
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f85839a.clear();
        }

        @Override // java.util.SortedMap
        @wx1
        public Comparator<? super K> comparator() {
            return this.f85839a.comparator();
        }

        @Override // p000.AbstractC7124i3, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return tt9.asMap((NavigableSet) this.f85839a.descendingSet(), (lz6) this.f85840b);
        }

        @Override // p000.AbstractC7124i3, java.util.AbstractMap, java.util.Map
        @wx1
        public V get(@wx1 Object key) {
            if (h82.m12263d(this.f85839a, key)) {
                return this.f85840b.apply(key);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@dgc K toKey, boolean inclusive) {
            return tt9.asMap((NavigableSet) this.f85839a.headSet(toKey, inclusive), (lz6) this.f85840b);
        }

        @Override // p000.AbstractC7124i3, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return tt9.removeOnlyNavigableSet(this.f85839a);
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f85839a.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@dgc K fromKey, boolean fromInclusive, @dgc K toKey, boolean toInclusive) {
            return tt9.asMap((NavigableSet) this.f85839a.subSet(fromKey, fromInclusive, toKey, toInclusive), (lz6) this.f85840b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@dgc K fromKey, boolean inclusive) {
            return tt9.asMap((NavigableSet) this.f85839a.tailSet(fromKey, inclusive), (lz6) this.f85840b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: tt9$e */
    public class C13196e<K, V> extends geh<Map.Entry<K, V>, K> {
        public C13196e(Iterator backingIterator) {
            super(backingIterator);
        }

        @Override // p000.geh
        @dgc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public K mo2935a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* JADX INFO: renamed from: tt9$e0 */
    @jd7
    public static class C13197e0<K, V> extends C13201g0<K, V> implements NavigableSet<K> {
        public C13197e0(NavigableMap<K, V> map) {
            super(map);
        }

        @Override // p000.tt9.C13201g0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> mo22808b() {
            return (NavigableMap) this.f85831a;
        }

        @Override // java.util.NavigableSet
        @wx1
        public K ceiling(@dgc K e) {
            return mo22806a().ceilingKey(e);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return mo22806a().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        @wx1
        public K floor(@dgc K e) {
            return mo22806a().floorKey(e);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@dgc K toElement, boolean inclusive) {
            return mo22806a().headMap(toElement, inclusive).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        @wx1
        public K higher(@dgc K e) {
            return mo22806a().higherKey(e);
        }

        @Override // java.util.NavigableSet
        @wx1
        public K lower(@dgc K e) {
            return mo22806a().lowerKey(e);
        }

        @Override // java.util.NavigableSet
        @wx1
        public K pollFirst() {
            return (K) tt9.m22798s(mo22806a().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @wx1
        public K pollLast() {
            return (K) tt9.m22798s(mo22806a().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@dgc K fromElement, boolean fromInclusive, @dgc K toElement, boolean toInclusive) {
            return mo22806a().subMap(fromElement, fromInclusive, toElement, toInclusive).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@dgc K fromElement, boolean inclusive) {
            return mo22806a().tailMap(fromElement, inclusive).navigableKeySet();
        }

        @Override // p000.tt9.C13201g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(@dgc K toElement) {
            return headSet(toElement, false);
        }

        @Override // p000.tt9.C13201g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(@dgc K fromElement, @dgc K toElement) {
            return subSet(fromElement, true, toElement, false);
        }

        @Override // p000.tt9.C13201g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(@dgc K fromElement) {
            return tailSet(fromElement, true);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: tt9$f */
    public class C13198f<K, V> extends geh<Map.Entry<K, V>, V> {
        public C13198f(Iterator backingIterator) {
            super(backingIterator);
        }

        @Override // p000.geh
        @dgc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V mo2935a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: renamed from: tt9$f0 */
    public static class C13199f0<K, V> extends C13216o<K, V> implements SortedMap<K, V> {
        public C13199f0(SortedSet<K> set, lz6<? super K, V> function) {
            super(set, function);
        }

        @Override // p000.tt9.C13216o
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> mo22811b() {
            return (SortedSet) super.mo22811b();
        }

        @Override // java.util.SortedMap
        @wx1
        public Comparator<? super K> comparator() {
            return mo22811b().comparator();
        }

        @Override // java.util.SortedMap
        @dgc
        public K firstKey() {
            return mo22811b().first();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@dgc K toKey) {
            return tt9.asMap((SortedSet) mo22811b().headSet(toKey), (lz6) this.f85858e);
        }

        @Override // p000.tt9.AbstractC13223r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            return tt9.removeOnlySortedSet(mo22811b());
        }

        @Override // java.util.SortedMap
        @dgc
        public K lastKey() {
            return mo22811b().last();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@dgc K fromKey, @dgc K toKey) {
            return tt9.asMap((SortedSet) mo22811b().subSet(fromKey, toKey), (lz6) this.f85858e);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@dgc K fromKey) {
            return tt9.asMap((SortedSet) mo22811b().tailSet(fromKey), (lz6) this.f85858e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: tt9$g */
    public class C13200g<K, V> extends geh<K, Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ lz6 f85841b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13200g(Iterator backingIterator, final lz6 val$function) {
            super(backingIterator);
            this.f85841b = val$function;
        }

        @Override // p000.geh
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo2935a(@dgc final K key) {
            return tt9.immutableEntry(key, this.f85841b.apply(key));
        }
    }

    /* JADX INFO: renamed from: tt9$g0 */
    public static class C13201g0<K, V> extends C13191b0<K, V> implements SortedSet<K> {
        public C13201g0(SortedMap<K, V> map) {
            super(map);
        }

        @Override // p000.tt9.C13191b0
        /* JADX INFO: renamed from: b */
        public SortedMap<K, V> mo22808b() {
            return (SortedMap) super.mo22808b();
        }

        @Override // java.util.SortedSet
        @wx1
        public Comparator<? super K> comparator() {
            return mo22808b().comparator();
        }

        @Override // java.util.SortedSet
        @dgc
        public K first() {
            return mo22808b().firstKey();
        }

        public SortedSet<K> headSet(@dgc K toElement) {
            return new C13201g0(mo22808b().headMap(toElement));
        }

        @Override // java.util.SortedSet
        @dgc
        public K last() {
            return mo22808b().lastKey();
        }

        public SortedSet<K> subSet(@dgc K fromElement, @dgc K toElement) {
            return new C13201g0(mo22808b().subMap(fromElement, toElement));
        }

        public SortedSet<K> tailSet(@dgc K fromElement) {
            return new C13201g0(mo22808b().tailMap(fromElement));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: tt9$h */
    public class C13202h<E> extends jt6<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Set f85842a;

        public C13202h(final Set val$set) {
            this.f85842a = val$set;
        }

        @Override // p000.lr6, java.util.Collection, java.util.Queue
        public boolean add(@dgc E element) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.lr6, java.util.Collection
        public boolean addAll(Collection<? extends E> es) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.jt6, p000.lr6, p000.zs6
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Set<E> mo8967m() {
            return this.f85842a;
        }
    }

    /* JADX INFO: renamed from: tt9$h0 */
    public static class C13203h0<K, V> extends C13193c0<K, V> implements nvf<K, V> {
        public C13203h0(SortedMap<K, V> onlyOnLeft, SortedMap<K, V> onlyOnRight, SortedMap<K, V> onBoth, SortedMap<K, js9.InterfaceC8052a<V>> differences) {
            super(onlyOnLeft, onlyOnRight, onBoth, differences);
        }

        @Override // p000.tt9.C13193c0, p000.js9
        public SortedMap<K, js9.InterfaceC8052a<V>> entriesDiffering() {
            return (SortedMap) super.entriesDiffering();
        }

        @Override // p000.tt9.C13193c0, p000.js9
        public SortedMap<K, V> entriesInCommon() {
            return (SortedMap) super.entriesInCommon();
        }

        @Override // p000.tt9.C13193c0, p000.js9
        public SortedMap<K, V> entriesOnlyOnLeft() {
            return (SortedMap) super.entriesOnlyOnLeft();
        }

        @Override // p000.tt9.C13193c0, p000.js9
        public SortedMap<K, V> entriesOnlyOnRight() {
            return (SortedMap) super.entriesOnlyOnRight();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: tt9$i */
    public class C13204i<E> extends tt6<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SortedSet f85843a;

        public C13204i(final SortedSet val$set) {
            this.f85843a = val$set;
        }

        @Override // p000.lr6, java.util.Collection, java.util.Queue
        public boolean add(@dgc E element) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.lr6, java.util.Collection
        public boolean addAll(Collection<? extends E> es) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.tt6, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(@dgc E toElement) {
            return tt9.removeOnlySortedSet(super.headSet(toElement));
        }

        @Override // p000.tt6, p000.jt6
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedSet<E> mo8967m() {
            return this.f85843a;
        }

        @Override // p000.tt6, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(@dgc E fromElement, @dgc E toElement) {
            return tt9.removeOnlySortedSet(super.subSet(fromElement, toElement));
        }

        @Override // p000.tt6, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(@dgc E fromElement) {
            return tt9.removeOnlySortedSet(super.tailSet(fromElement));
        }
    }

    /* JADX INFO: renamed from: tt9$i0 */
    public static class C13205i0<K, V1, V2> extends AbstractC13189a0<K, V2> {

        /* JADX INFO: renamed from: a */
        public final Map<K, V1> f85844a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC13225t<? super K, ? super V1, V2> f85845b;

        public C13205i0(Map<K, V1> fromMap, InterfaceC13225t<? super K, ? super V1, V2> transformer) {
            this.f85844a = (Map) v7d.checkNotNull(fromMap);
            this.f85845b = (InterfaceC13225t) v7d.checkNotNull(transformer);
        }

        @Override // p000.tt9.AbstractC13189a0
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, V2>> mo10935a() {
            return wg8.transform(this.f85844a.entrySet().iterator(), tt9.m22785f(this.f85845b));
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f85844a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return this.f85844a.containsKey(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V2 get(@wx1 Object obj) {
            V1 v1 = this.f85844a.get(obj);
            if (v1 != null || this.f85844a.containsKey(obj)) {
                return this.f85845b.transformEntry(obj, (Object) sib.m22018a(v1));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f85844a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V2 remove(@wx1 Object obj) {
            if (this.f85844a.containsKey(obj)) {
                return this.f85845b.transformEntry(obj, (Object) sib.m22018a(this.f85844a.remove(obj)));
            }
            return null;
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f85844a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new C13221q0(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: tt9$j */
    public class C13206j<E> extends xs6<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ NavigableSet f85846a;

        public C13206j(final NavigableSet val$set) {
            this.f85846a = val$set;
        }

        @Override // p000.lr6, java.util.Collection, java.util.Queue
        public boolean add(@dgc E element) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.lr6, java.util.Collection
        public boolean addAll(Collection<? extends E> es) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.xs6, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return tt9.removeOnlyNavigableSet(super.descendingSet());
        }

        @Override // p000.tt6, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(@dgc E toElement) {
            return tt9.removeOnlySortedSet(super.headSet(toElement));
        }

        @Override // p000.xs6, p000.tt6
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> mo8967m() {
            return this.f85846a;
        }

        @Override // p000.tt6, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(@dgc E fromElement, @dgc E toElement) {
            return tt9.removeOnlySortedSet(super.subSet(fromElement, toElement));
        }

        @Override // p000.tt6, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(@dgc E fromElement) {
            return tt9.removeOnlySortedSet(super.tailSet(fromElement));
        }

        @Override // p000.xs6, java.util.NavigableSet
        public NavigableSet<E> headSet(@dgc E toElement, boolean inclusive) {
            return tt9.removeOnlyNavigableSet(super.headSet(toElement, inclusive));
        }

        @Override // p000.xs6, java.util.NavigableSet
        public NavigableSet<E> subSet(@dgc E fromElement, boolean fromInclusive, @dgc E toElement, boolean toInclusive) {
            return tt9.removeOnlyNavigableSet(super.subSet(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // p000.xs6, java.util.NavigableSet
        public NavigableSet<E> tailSet(@dgc E fromElement, boolean inclusive) {
            return tt9.removeOnlyNavigableSet(super.tailSet(fromElement, inclusive));
        }
    }

    /* JADX INFO: renamed from: tt9$j0 */
    @jd7
    public static class C13207j0<K, V1, V2> extends C13209k0<K, V1, V2> implements NavigableMap<K, V2> {
        public C13207j0(NavigableMap<K, V1> fromMap, InterfaceC13225t<? super K, ? super V1, V2> transformer) {
            super(fromMap, transformer);
        }

        @wx1
        private Map.Entry<K, V2> transformEntry(@wx1 Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return tt9.m22772B(this.f85845b, entry);
        }

        @Override // p000.tt9.C13209k0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V1> mo22814b() {
            return (NavigableMap) super.mo22814b();
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V2> ceilingEntry(@dgc K key) {
            return transformEntry(mo22814b().ceilingEntry(key));
        }

        @Override // java.util.NavigableMap
        @wx1
        public K ceilingKey(@dgc K key) {
            return mo22814b().ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return mo22814b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
            return tt9.transformEntries((NavigableMap) mo22814b().descendingMap(), (InterfaceC13225t) this.f85845b);
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V2> firstEntry() {
            return transformEntry(mo22814b().firstEntry());
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V2> floorEntry(@dgc K key) {
            return transformEntry(mo22814b().floorEntry(key));
        }

        @Override // java.util.NavigableMap
        @wx1
        public K floorKey(@dgc K key) {
            return mo22814b().floorKey(key);
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V2> higherEntry(@dgc K key) {
            return transformEntry(mo22814b().higherEntry(key));
        }

        @Override // java.util.NavigableMap
        @wx1
        public K higherKey(@dgc K key) {
            return mo22814b().higherKey(key);
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V2> lastEntry() {
            return transformEntry(mo22814b().lastEntry());
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V2> lowerEntry(@dgc K key) {
            return transformEntry(mo22814b().lowerEntry(key));
        }

        @Override // java.util.NavigableMap
        @wx1
        public K lowerKey(@dgc K key) {
            return mo22814b().lowerKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return mo22814b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V2> pollFirstEntry() {
            return transformEntry(mo22814b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V2> pollLastEntry() {
            return transformEntry(mo22814b().pollLastEntry());
        }

        @Override // p000.tt9.C13209k0, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> headMap(@dgc K toKey) {
            return headMap(toKey, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(@dgc K fromKey, boolean fromInclusive, @dgc K toKey, boolean toInclusive) {
            return tt9.transformEntries((NavigableMap) mo22814b().subMap(fromKey, fromInclusive, toKey, toInclusive), (InterfaceC13225t) this.f85845b);
        }

        @Override // p000.tt9.C13209k0, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(@dgc K fromKey) {
            return tailMap(fromKey, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(@dgc K toKey, boolean inclusive) {
            return tt9.transformEntries((NavigableMap) mo22814b().headMap(toKey, inclusive), (InterfaceC13225t) this.f85845b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(@dgc K fromKey, boolean inclusive) {
            return tt9.transformEntries((NavigableMap) mo22814b().tailMap(fromKey, inclusive), (InterfaceC13225t) this.f85845b);
        }

        @Override // p000.tt9.C13209k0, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> subMap(@dgc K fromKey, @dgc K toKey) {
            return subMap(fromKey, true, toKey, false);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: tt9$k */
    public class C13208k<K, V> extends AbstractC13818v2<K, V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map.Entry f85847a;

        public C13208k(final Map.Entry val$entry) {
            this.f85847a = val$entry;
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public K getKey() {
            return (K) this.f85847a.getKey();
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public V getValue() {
            return (V) this.f85847a.getValue();
        }
    }

    /* JADX INFO: renamed from: tt9$k0 */
    public static class C13209k0<K, V1, V2> extends C13205i0<K, V1, V2> implements SortedMap<K, V2> {
        public C13209k0(SortedMap<K, V1> fromMap, InterfaceC13225t<? super K, ? super V1, V2> transformer) {
            super(fromMap, transformer);
        }

        /* JADX INFO: renamed from: b */
        public SortedMap<K, V1> mo22814b() {
            return (SortedMap) this.f85844a;
        }

        @Override // java.util.SortedMap
        @wx1
        public Comparator<? super K> comparator() {
            return mo22814b().comparator();
        }

        @Override // java.util.SortedMap
        @dgc
        public K firstKey() {
            return mo22814b().firstKey();
        }

        public SortedMap<K, V2> headMap(@dgc K toKey) {
            return tt9.transformEntries((SortedMap) mo22814b().headMap(toKey), (InterfaceC13225t) this.f85845b);
        }

        @Override // java.util.SortedMap
        @dgc
        public K lastKey() {
            return mo22814b().lastKey();
        }

        public SortedMap<K, V2> subMap(@dgc K fromKey, @dgc K toKey) {
            return tt9.transformEntries((SortedMap) mo22814b().subMap(fromKey, toKey), (InterfaceC13225t) this.f85845b);
        }

        public SortedMap<K, V2> tailMap(@dgc K fromKey) {
            return tt9.transformEntries((SortedMap) mo22814b().tailMap(fromKey), (InterfaceC13225t) this.f85845b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: tt9$l */
    public class C13210l<K, V> extends quh<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f85848a;

        public C13210l(final Iterator val$entryIterator) {
            this.f85848a = val$entryIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f85848a.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            return tt9.m22773C((Map.Entry) this.f85848a.next());
        }
    }

    /* JADX INFO: renamed from: tt9$l0 */
    public static class C13211l0<K, V> extends qs6<K, V> implements k11<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Map<K, V> f85849a;

        /* JADX INFO: renamed from: b */
        public final k11<? extends K, ? extends V> f85850b;

        /* JADX INFO: renamed from: c */
        @RetainedWith
        @wx1
        @ez8
        public k11<V, K> f85851c;

        /* JADX INFO: renamed from: d */
        @wx1
        @ez8
        public transient Set<V> f85852d;

        public C13211l0(k11<? extends K, ? extends V> delegate, @wx1 k11<V, K> inverse) {
            this.f85849a = Collections.unmodifiableMap(delegate);
            this.f85850b = delegate;
            this.f85851c = inverse;
        }

        @Override // p000.qs6, p000.zs6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<K, V> mo8967m() {
            return this.f85849a;
        }

        @Override // p000.k11
        @wx1
        public V forcePut(@dgc K key, @dgc V value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.k11
        public k11<V, K> inverse() {
            k11<V, K> k11Var = this.f85851c;
            if (k11Var != null) {
                return k11Var;
            }
            C13211l0 c13211l0 = new C13211l0(this.f85850b.inverse(), this);
            this.f85851c = c13211l0;
            return c13211l0;
        }

        @Override // p000.qs6, java.util.Map, p000.k11
        public Set<V> values() {
            Set<V> set = this.f85852d;
            if (set != null) {
                return set;
            }
            Set<V> setUnmodifiableSet = Collections.unmodifiableSet(this.f85850b.values());
            this.f85852d = setUnmodifiableSet;
            return setUnmodifiableSet;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* JADX INFO: renamed from: tt9$m */
    public class C13212m<K, V1, V2> implements InterfaceC13225t<K, V1, V2> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ lz6 f85853a;

        public C13212m(final lz6 val$function) {
            this.f85853a = val$function;
        }

        @Override // p000.tt9.InterfaceC13225t
        @dgc
        public V2 transformEntry(@dgc K k, @dgc V1 v1) {
            return (V2) this.f85853a.apply(v1);
        }
    }

    /* JADX INFO: renamed from: tt9$m0 */
    public static class C13213m0<K, V> extends lr6<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final Collection<Map.Entry<K, V>> f85854a;

        public C13213m0(Collection<Map.Entry<K, V>> entries) {
            this.f85854a = entries;
        }

        @Override // p000.lr6, p000.zs6
        /* JADX INFO: renamed from: a */
        public Collection<Map.Entry<K, V>> mo8967m() {
            return this.f85854a;
        }

        @Override // p000.lr6, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return tt9.m22774D(this.f85854a.iterator());
        }

        @Override // p000.lr6, java.util.Collection
        public Object[] toArray() {
            return m16327j();
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m16328k(tArr);
        }
    }

    /* JADX INFO: renamed from: tt9$n */
    public static abstract class AbstractC13214n<K, V> extends AbstractC13223r0<K, V> {

        /* JADX INFO: renamed from: d */
        public final Map<K, V> f85855d;

        /* JADX INFO: renamed from: e */
        public final l8d<? super Map.Entry<K, V>> f85856e;

        public AbstractC13214n(Map<K, V> unfiltered, l8d<? super Map.Entry<K, V>> predicate) {
            this.f85855d = unfiltered;
            this.f85856e = predicate;
        }

        @Override // p000.tt9.AbstractC13223r0
        /* JADX INFO: renamed from: a */
        public Collection<V> mo8721a() {
            return new C13231z(this, this.f85855d, this.f85856e);
        }

        /* JADX INFO: renamed from: b */
        public boolean m22816b(@wx1 Object key, @dgc V value) {
            return this.f85856e.apply(tt9.immutableEntry(key, value));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return this.f85855d.containsKey(key) && m22816b(key, this.f85855d.get(key));
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V get(@wx1 Object key) {
            V v = this.f85855d.get(key);
            if (v == null || !m22816b(key, v)) {
                return null;
            }
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V put(@dgc K key, @dgc V value) {
            v7d.checkArgument(m22816b(key, value));
            return this.f85855d.put(key, value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                v7d.checkArgument(m22816b(entry.getKey(), entry.getValue()));
            }
            this.f85855d.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V remove(@wx1 Object key) {
            if (containsKey(key)) {
                return this.f85855d.remove(key);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: tt9$n0 */
    public static class C13215n0<K, V> extends C13213m0<K, V> implements Set<Map.Entry<K, V>> {
        public C13215n0(Set<Map.Entry<K, V>> entries) {
            super(entries);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@wx1 Object object) {
            return t6f.m22396a(this, object);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return t6f.m22397b(this);
        }
    }

    /* JADX INFO: renamed from: tt9$o */
    public static class C13216o<K, V> extends AbstractC13223r0<K, V> {

        /* JADX INFO: renamed from: d */
        public final Set<K> f85857d;

        /* JADX INFO: renamed from: e */
        public final lz6<? super K, V> f85858e;

        /* JADX INFO: renamed from: tt9$o$a */
        public class a extends AbstractC13224s<K, V> {
            public a() {
            }

            @Override // p000.tt9.AbstractC13224s
            /* JADX INFO: renamed from: a */
            public Map<K, V> mo8722a() {
                return C13216o.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return tt9.m22788i(C13216o.this.mo22811b(), C13216o.this.f85858e);
            }
        }

        public C13216o(Set<K> set, lz6<? super K, V> function) {
            this.f85857d = (Set) v7d.checkNotNull(set);
            this.f85858e = (lz6) v7d.checkNotNull(function);
        }

        @Override // p000.tt9.AbstractC13223r0
        /* JADX INFO: renamed from: a */
        public Collection<V> mo8721a() {
            return h82.transform(this.f85857d, this.f85858e);
        }

        /* JADX INFO: renamed from: b */
        public Set<K> mo22811b() {
            return this.f85857d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            mo22811b().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return mo22811b().contains(key);
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<Map.Entry<K, V>> createEntrySet() {
            return new a();
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<K> createKeySet() {
            return tt9.removeOnlySet(mo22811b());
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V get(@wx1 Object key) {
            if (h82.m12263d(mo22811b(), key)) {
                return this.f85858e.apply(key);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V remove(@wx1 Object key) {
            if (mo22811b().remove(key)) {
                return this.f85858e.apply(key);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return mo22811b().size();
        }
    }

    /* JADX INFO: renamed from: tt9$o0 */
    @jd7
    public static class C13217o0<K, V> extends rt6<K, V> implements NavigableMap<K, V>, Serializable {

        /* JADX INFO: renamed from: a */
        public final NavigableMap<K, ? extends V> f85860a;

        /* JADX INFO: renamed from: b */
        @wx1
        @ez8
        public transient C13217o0<K, V> f85861b;

        public C13217o0(NavigableMap<K, ? extends V> delegate) {
            this.f85860a = delegate;
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> ceilingEntry(@dgc K key) {
            return tt9.unmodifiableOrNull(this.f85860a.ceilingEntry(key));
        }

        @Override // java.util.NavigableMap
        @wx1
        public K ceilingKey(@dgc K key) {
            return this.f85860a.ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return t6f.unmodifiableNavigableSet(this.f85860a.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            C13217o0<K, V> c13217o0 = this.f85861b;
            if (c13217o0 != null) {
                return c13217o0;
            }
            C13217o0<K, V> c13217o02 = new C13217o0<>(this.f85860a.descendingMap(), this);
            this.f85861b = c13217o02;
            return c13217o02;
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> firstEntry() {
            return tt9.unmodifiableOrNull(this.f85860a.firstEntry());
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> floorEntry(@dgc K key) {
            return tt9.unmodifiableOrNull(this.f85860a.floorEntry(key));
        }

        @Override // java.util.NavigableMap
        @wx1
        public K floorKey(@dgc K key) {
            return this.f85860a.floorKey(key);
        }

        @Override // p000.rt6, java.util.SortedMap
        public SortedMap<K, V> headMap(@dgc K toKey) {
            return headMap(toKey, false);
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> higherEntry(@dgc K key) {
            return tt9.unmodifiableOrNull(this.f85860a.higherEntry(key));
        }

        @Override // java.util.NavigableMap
        @wx1
        public K higherKey(@dgc K key) {
            return this.f85860a.higherKey(key);
        }

        @Override // p000.rt6, p000.qs6, p000.zs6
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public SortedMap<K, V> mo8967m() {
            return Collections.unmodifiableSortedMap(this.f85860a);
        }

        @Override // p000.qs6, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> lastEntry() {
            return tt9.unmodifiableOrNull(this.f85860a.lastEntry());
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> lowerEntry(@dgc K key) {
            return tt9.unmodifiableOrNull(this.f85860a.lowerEntry(key));
        }

        @Override // java.util.NavigableMap
        @wx1
        public K lowerKey(@dgc K key) {
            return this.f85860a.lowerKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return t6f.unmodifiableNavigableSet(this.f85860a.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        @wx1
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        @wx1
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.rt6, java.util.SortedMap
        public SortedMap<K, V> subMap(@dgc K fromKey, @dgc K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // p000.rt6, java.util.SortedMap
        public SortedMap<K, V> tailMap(@dgc K fromKey) {
            return tailMap(fromKey, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@dgc K toKey, boolean inclusive) {
            return tt9.unmodifiableNavigableMap(this.f85860a.headMap(toKey, inclusive));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@dgc K fromKey, boolean fromInclusive, @dgc K toKey, boolean toInclusive) {
            return tt9.unmodifiableNavigableMap(this.f85860a.subMap(fromKey, fromInclusive, toKey, toInclusive));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@dgc K fromKey, boolean inclusive) {
            return tt9.unmodifiableNavigableMap(this.f85860a.tailMap(fromKey, inclusive));
        }

        public C13217o0(NavigableMap<K, ? extends V> delegate, C13217o0<K, V> descendingMap) {
            this.f85860a = delegate;
            this.f85861b = descendingMap;
        }
    }

    /* JADX INFO: renamed from: tt9$p */
    public static final class C13218p<A, B> extends wz2<A, B> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c */
        public final k11<A, B> f85862c;

        public C13218p(k11<A, B> bimap) {
            this.f85862c = (k11) v7d.checkNotNull(bimap);
        }

        private static <X, Y> Y convert(k11<X, Y> bimap, X input) {
            Y y = bimap.get(input);
            v7d.checkArgument(y != null, "No non-null mapping present for input: %s", input);
            return y;
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: d */
        public A mo13178d(B b) {
            return (A) convert(this.f85862c.inverse(), b);
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: e */
        public B mo13179e(A a) {
            return (B) convert(this.f85862c, a);
        }

        @Override // p000.wz2, p000.lz6
        public boolean equals(@wx1 Object object) {
            if (object instanceof C13218p) {
                return this.f85862c.equals(((C13218p) object).f85862c);
            }
            return false;
        }

        public int hashCode() {
            return this.f85862c.hashCode();
        }

        public String toString() {
            return "Maps.asConverter(" + this.f85862c + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: tt9$p0 */
    public static class C13219p0<V> implements js9.InterfaceC8052a<V> {

        /* JADX INFO: renamed from: a */
        @dgc
        public final V f85863a;

        /* JADX INFO: renamed from: b */
        @dgc
        public final V f85864b;

        private C13219p0(@dgc V left, @dgc V right) {
            this.f85863a = left;
            this.f85864b = right;
        }

        /* JADX INFO: renamed from: a */
        public static <V> js9.InterfaceC8052a<V> m22817a(@dgc V left, @dgc V right) {
            return new C13219p0(left, right);
        }

        @Override // p000.js9.InterfaceC8052a
        public boolean equals(@wx1 Object object) {
            if (!(object instanceof js9.InterfaceC8052a)) {
                return false;
            }
            js9.InterfaceC8052a interfaceC8052a = (js9.InterfaceC8052a) object;
            return okb.equal(this.f85863a, interfaceC8052a.leftValue()) && okb.equal(this.f85864b, interfaceC8052a.rightValue());
        }

        @Override // p000.js9.InterfaceC8052a
        public int hashCode() {
            return okb.hashCode(this.f85863a, this.f85864b);
        }

        @Override // p000.js9.InterfaceC8052a
        @dgc
        public V leftValue() {
            return this.f85863a;
        }

        @Override // p000.js9.InterfaceC8052a
        @dgc
        public V rightValue() {
            return this.f85864b;
        }

        public String toString() {
            return c0b.f15433c + this.f85863a + ", " + this.f85864b + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: tt9$q */
    @jd7
    public static abstract class AbstractC13220q<K, V> extends qs6<K, V> implements NavigableMap<K, V> {

        /* JADX INFO: renamed from: a */
        @wx1
        @ez8
        public transient Comparator<? super K> f85865a;

        /* JADX INFO: renamed from: b */
        @wx1
        @ez8
        public transient Set<Map.Entry<K, V>> f85866b;

        /* JADX INFO: renamed from: c */
        @wx1
        @ez8
        public transient NavigableSet<K> f85867c;

        /* JADX INFO: renamed from: tt9$q$a */
        public class a extends AbstractC13224s<K, V> {
            public a() {
            }

            @Override // p000.tt9.AbstractC13224s
            /* JADX INFO: renamed from: a */
            public Map<K, V> mo8722a() {
                return AbstractC13220q.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return AbstractC13220q.this.mo12750l();
            }
        }

        private static <T> s7c<T> reverse(Comparator<T> forward) {
            return s7c.from(forward).reverse();
        }

        @Override // p000.qs6, p000.zs6
        /* JADX INFO: renamed from: a */
        public final Map<K, V> mo8967m() {
            return mo12751m();
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> ceilingEntry(@dgc K key) {
            return mo12751m().floorEntry(key);
        }

        @Override // java.util.NavigableMap
        @wx1
        public K ceilingKey(@dgc K key) {
            return mo12751m().floorKey(key);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f85865a;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = mo12751m().comparator();
            if (comparator2 == null) {
                comparator2 = s7c.natural();
            }
            s7c s7cVarReverse = reverse(comparator2);
            this.f85865a = s7cVarReverse;
            return s7cVarReverse;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return mo12751m().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return mo12751m();
        }

        @Override // p000.qs6, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f85866b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setM22818k = m22818k();
            this.f85866b = setM22818k;
            return setM22818k;
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> firstEntry() {
            return mo12751m().lastEntry();
        }

        @Override // java.util.SortedMap
        @dgc
        public K firstKey() {
            return mo12751m().lastKey();
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> floorEntry(@dgc K key) {
            return mo12751m().ceilingEntry(key);
        }

        @Override // java.util.NavigableMap
        @wx1
        public K floorKey(@dgc K key) {
            return mo12751m().ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@dgc K toKey, boolean inclusive) {
            return mo12751m().tailMap(toKey, inclusive).descendingMap();
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> higherEntry(@dgc K key) {
            return mo12751m().lowerEntry(key);
        }

        @Override // java.util.NavigableMap
        @wx1
        public K higherKey(@dgc K key) {
            return mo12751m().lowerKey(key);
        }

        /* JADX INFO: renamed from: k */
        public Set<Map.Entry<K, V>> m22818k() {
            return new a();
        }

        @Override // p000.qs6, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        /* JADX INFO: renamed from: l */
        public abstract Iterator<Map.Entry<K, V>> mo12750l();

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> lastEntry() {
            return mo12751m().firstEntry();
        }

        @Override // java.util.SortedMap
        @dgc
        public K lastKey() {
            return mo12751m().firstKey();
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> lowerEntry(@dgc K key) {
            return mo12751m().higherEntry(key);
        }

        @Override // java.util.NavigableMap
        @wx1
        public K lowerKey(@dgc K key) {
            return mo12751m().higherKey(key);
        }

        /* JADX INFO: renamed from: m */
        public abstract NavigableMap<K, V> mo12751m();

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f85867c;
            if (navigableSet != null) {
                return navigableSet;
            }
            C13197e0 c13197e0 = new C13197e0(this);
            this.f85867c = c13197e0;
            return c13197e0;
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> pollFirstEntry() {
            return mo12751m().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> pollLastEntry() {
            return mo12751m().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@dgc K fromKey, boolean fromInclusive, @dgc K toKey, boolean toInclusive) {
            return mo12751m().subMap(toKey, toInclusive, fromKey, fromInclusive).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@dgc K fromKey, boolean inclusive) {
            return mo12751m().headMap(fromKey, inclusive).descendingMap();
        }

        @Override // p000.zs6
        public String toString() {
            return m20644j();
        }

        @Override // p000.qs6, java.util.Map, p000.k11
        public Collection<V> values() {
            return new C13221q0(this);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(@dgc K toKey) {
            return headMap(toKey, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(@dgc K fromKey, @dgc K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(@dgc K fromKey) {
            return tailMap(fromKey, true);
        }
    }

    /* JADX INFO: renamed from: tt9$q0 */
    public static class C13221q0<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a */
        @Weak
        public final Map<K, V> f85869a;

        public C13221q0(Map<K, V> map) {
            this.f85869a = (Map) v7d.checkNotNull(map);
        }

        /* JADX INFO: renamed from: a */
        public final Map<K, V> m22819a() {
            return this.f85869a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m22819a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object o) {
            return m22819a().containsValue(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m22819a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return tt9.m22777G(m22819a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@wx1 Object o) {
            try {
                return super.remove(o);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : m22819a().entrySet()) {
                    if (okb.equal(o, entry.getValue())) {
                        m22819a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> c) {
            try {
                return super.removeAll((Collection) v7d.checkNotNull(c));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSet = t6f.newHashSet();
                for (Map.Entry<K, V> entry : m22819a().entrySet()) {
                    if (c.contains(entry.getValue())) {
                        hashSetNewHashSet.add(entry.getKey());
                    }
                }
                return m22819a().keySet().removeAll(hashSetNewHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> c) {
            try {
                return super.retainAll((Collection) v7d.checkNotNull(c));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSet = t6f.newHashSet();
                for (Map.Entry<K, V> entry : m22819a().entrySet()) {
                    if (c.contains(entry.getValue())) {
                        hashSetNewHashSet.add(entry.getKey());
                    }
                }
                return m22819a().keySet().retainAll(hashSetNewHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m22819a().size();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: tt9$r */
    public static abstract class EnumC13222r implements lz6<Map.Entry<?, ?>, Object> {

        /* JADX INFO: renamed from: a */
        public static final EnumC13222r f85870a = new a(MMKVContentProvider.f24850a, 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC13222r f85871b = new b("VALUE", 1);

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumC13222r[] f85872c = $values();

        /* JADX INFO: renamed from: tt9$r$a */
        public enum a extends EnumC13222r {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.lz6
            @wx1
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: tt9$r$b */
        public enum b extends EnumC13222r {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.lz6
            @wx1
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private static /* synthetic */ EnumC13222r[] $values() {
            return new EnumC13222r[]{f85870a, f85871b};
        }

        private EnumC13222r(String $enum$name, int $enum$ordinal) {
        }

        public static EnumC13222r valueOf(String name) {
            return (EnumC13222r) Enum.valueOf(EnumC13222r.class, name);
        }

        public static EnumC13222r[] values() {
            return (EnumC13222r[]) f85872c.clone();
        }

        public /* synthetic */ EnumC13222r(String str, int i, C13196e c13196e) {
            this(str, i);
        }
    }

    /* JADX INFO: renamed from: tt9$r0 */
    @gd7
    public static abstract class AbstractC13223r0<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a */
        @wx1
        @ez8
        public transient Set<Map.Entry<K, V>> f85873a;

        /* JADX INFO: renamed from: b */
        @wx1
        @ez8
        public transient Set<K> f85874b;

        /* JADX INFO: renamed from: c */
        @wx1
        @ez8
        public transient Collection<V> f85875c;

        /* JADX INFO: renamed from: a */
        public Collection<V> mo8721a() {
            return new C13221q0(this);
        }

        public abstract Set<Map.Entry<K, V>> createEntrySet();

        public Set<K> createKeySet() {
            return new C13191b0(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f85873a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
            this.f85873a = setCreateEntrySet;
            return setCreateEntrySet;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            Set<K> set = this.f85874b;
            if (set != null) {
                return set;
            }
            Set<K> setCreateKeySet = createKeySet();
            this.f85874b = setCreateKeySet;
            return setCreateKeySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f85875c;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionMo8721a = mo8721a();
            this.f85875c = collectionMo8721a;
            return collectionMo8721a;
        }
    }

    /* JADX INFO: renamed from: tt9$s */
    public static abstract class AbstractC13224s<K, V> extends t6f.AbstractC12934k<Map.Entry<K, V>> {
        /* JADX INFO: renamed from: a */
        public abstract Map<K, V> mo8722a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo8722a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            Object key = entry.getKey();
            Object objM22804y = tt9.m22804y(mo8722a(), key);
            if (okb.equal(objM22804y, entry.getValue())) {
                return objM22804y != null || mo8722a().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo8722a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object o) {
            if (contains(o) && (o instanceof Map.Entry)) {
                return mo8722a().keySet().remove(((Map.Entry) o).getKey());
            }
            return false;
        }

        @Override // p000.t6f.AbstractC12934k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c) {
            try {
                return super.removeAll((Collection) v7d.checkNotNull(c));
            } catch (UnsupportedOperationException unused) {
                return t6f.m22399d(this, c.iterator());
            }
        }

        @Override // p000.t6f.AbstractC12934k, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c) {
            try {
                return super.retainAll((Collection) v7d.checkNotNull(c));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSetWithExpectedSize = t6f.newHashSetWithExpectedSize(c.size());
                for (Object obj : c) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetNewHashSetWithExpectedSize.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo8722a().keySet().retainAll(hashSetNewHashSetWithExpectedSize);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo8722a().size();
        }
    }

    /* JADX INFO: renamed from: tt9$t */
    public interface InterfaceC13225t<K, V1, V2> {
        @dgc
        V2 transformEntry(@dgc K key, @dgc V1 value);
    }

    /* JADX INFO: renamed from: tt9$u */
    public static final class C13226u<K, V> extends C13227v<K, V> implements k11<K, V> {

        /* JADX INFO: renamed from: m */
        @RetainedWith
        public final k11<V, K> f85876m;

        /* JADX INFO: renamed from: tt9$u$a */
        public class a implements l8d<Map.Entry<V, K>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ l8d f85877a;

            public a(final l8d val$forwardPredicate) {
                this.f85877a = val$forwardPredicate;
            }

            @Override // p000.l8d
            public boolean apply(Map.Entry<V, K> input) {
                return this.f85877a.apply(tt9.immutableEntry(input.getValue(), input.getKey()));
            }
        }

        public C13226u(k11<K, V> delegate, l8d<? super Map.Entry<K, V>> predicate) {
            super(delegate, predicate);
            this.f85876m = new C13226u(delegate.inverse(), inversePredicate(predicate), this);
        }

        private static <K, V> l8d<Map.Entry<V, K>> inversePredicate(final l8d<? super Map.Entry<K, V>> forwardPredicate) {
            return new a(forwardPredicate);
        }

        /* JADX INFO: renamed from: e */
        public k11<K, V> m22820e() {
            return (k11) this.f85855d;
        }

        @Override // p000.k11
        @wx1
        public V forcePut(@dgc K key, @dgc V value) {
            v7d.checkArgument(m22816b(key, value));
            return m22820e().forcePut(key, value);
        }

        @Override // p000.k11
        public k11<V, K> inverse() {
            return this.f85876m;
        }

        @Override // p000.tt9.AbstractC13223r0, java.util.AbstractMap, java.util.Map
        public Set<V> values() {
            return this.f85876m.keySet();
        }

        private C13226u(k11<K, V> delegate, l8d<? super Map.Entry<K, V>> predicate, k11<V, K> inverse) {
            super(delegate, predicate);
            this.f85876m = inverse;
        }
    }

    /* JADX INFO: renamed from: tt9$v */
    public static class C13227v<K, V> extends AbstractC13214n<K, V> {

        /* JADX INFO: renamed from: f */
        public final Set<Map.Entry<K, V>> f85878f;

        /* JADX INFO: renamed from: tt9$v$a */
        public class a extends jt6<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: tt9$v$a$a, reason: collision with other inner class name */
            public class C16532a extends geh<Map.Entry<K, V>, Map.Entry<K, V>> {

                /* JADX INFO: renamed from: tt9$v$a$a$a, reason: collision with other inner class name */
                public class C16533a extends rs6<K, V> {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Map.Entry f85881a;

                    public C16533a(final Map.Entry val$entry) {
                        this.f85881a = val$entry;
                    }

                    @Override // p000.rs6, p000.zs6
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Map.Entry<K, V> mo8967m() {
                        return this.f85881a;
                    }

                    @Override // p000.rs6, java.util.Map.Entry
                    @dgc
                    public V setValue(@dgc V v) {
                        v7d.checkArgument(C13227v.this.m22816b(getKey(), v));
                        return (V) super.setValue(v);
                    }
                }

                public C16532a(Iterator backingIterator) {
                    super(backingIterator);
                }

                @Override // p000.geh
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> mo2935a(final Map.Entry<K, V> entry) {
                    return new C16533a(entry);
                }
            }

            private a() {
            }

            @Override // p000.lr6, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new C16532a(C13227v.this.f85878f.iterator());
            }

            @Override // p000.jt6, p000.lr6, p000.zs6
            /* JADX INFO: renamed from: m */
            public Set<Map.Entry<K, V>> mo8967m() {
                return C13227v.this.f85878f;
            }

            public /* synthetic */ a(C13227v c13227v, C13196e c13196e) {
                this();
            }
        }

        /* JADX INFO: renamed from: tt9$v$b */
        public class b extends C13191b0<K, V> {
            public b() {
                super(C13227v.this);
            }

            @Override // p000.tt9.C13191b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@wx1 Object o) {
                if (!C13227v.this.containsKey(o)) {
                    return false;
                }
                C13227v.this.f85855d.remove(o);
                return true;
            }

            @Override // p000.t6f.AbstractC12934k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                C13227v c13227v = C13227v.this;
                return C13227v.m22821c(c13227v.f85855d, c13227v.f85856e, collection);
            }

            @Override // p000.t6f.AbstractC12934k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                C13227v c13227v = C13227v.this;
                return C13227v.m22822d(c13227v.f85855d, c13227v.f85856e, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return eb9.newArrayList(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) eb9.newArrayList(iterator()).toArray(tArr);
            }
        }

        public C13227v(Map<K, V> unfiltered, l8d<? super Map.Entry<K, V>> entryPredicate) {
            super(unfiltered, entryPredicate);
            this.f85878f = t6f.filter(unfiltered.entrySet(), this.f85856e);
        }

        /* JADX INFO: renamed from: c */
        public static <K, V> boolean m22821c(Map<K, V> map, l8d<? super Map.Entry<K, V>> entryPredicate, Collection<?> keyCollection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (entryPredicate.apply(next) && keyCollection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        /* JADX INFO: renamed from: d */
        public static <K, V> boolean m22822d(Map<K, V> map, l8d<? super Map.Entry<K, V>> entryPredicate, Collection<?> keyCollection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (entryPredicate.apply(next) && !keyCollection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<Map.Entry<K, V>> createEntrySet() {
            return new a(this, null);
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<K> createKeySet() {
            return new b();
        }
    }

    /* JADX INFO: renamed from: tt9$w */
    @jd7
    public static class C13228w<K, V> extends AbstractC7124i3<K, V> {

        /* JADX INFO: renamed from: a */
        public final NavigableMap<K, V> f85884a;

        /* JADX INFO: renamed from: b */
        public final l8d<? super Map.Entry<K, V>> f85885b;

        /* JADX INFO: renamed from: c */
        public final Map<K, V> f85886c;

        /* JADX INFO: renamed from: tt9$w$a */
        public class a extends C13197e0<K, V> {
            public a(NavigableMap map) {
                super(map);
            }

            @Override // p000.t6f.AbstractC12934k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return C13227v.m22821c(C13228w.this.f85884a, C13228w.this.f85885b, collection);
            }

            @Override // p000.t6f.AbstractC12934k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return C13227v.m22822d(C13228w.this.f85884a, C13228w.this.f85885b, collection);
            }
        }

        public C13228w(NavigableMap<K, V> unfiltered, l8d<? super Map.Entry<K, V>> entryPredicate) {
            this.f85884a = (NavigableMap) v7d.checkNotNull(unfiltered);
            this.f85885b = entryPredicate;
            this.f85886c = new C13227v(unfiltered, entryPredicate);
        }

        @Override // p000.tt9.AbstractC13189a0
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, V>> mo10935a() {
            return wg8.filter(this.f85884a.entrySet().iterator(), this.f85885b);
        }

        @Override // p000.AbstractC7124i3
        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<K, V>> mo11694b() {
            return wg8.filter(this.f85884a.descendingMap().entrySet().iterator(), this.f85885b);
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f85886c.clear();
        }

        @Override // java.util.SortedMap
        @wx1
        public Comparator<? super K> comparator() {
            return this.f85884a.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return this.f85886c.containsKey(key);
        }

        @Override // p000.AbstractC7124i3, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return tt9.filterEntries((NavigableMap) this.f85884a.descendingMap(), (l8d) this.f85885b);
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return this.f85886c.entrySet();
        }

        @Override // p000.AbstractC7124i3, java.util.AbstractMap, java.util.Map
        @wx1
        public V get(@wx1 Object key) {
            return this.f85886c.get(key);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@dgc K toKey, boolean inclusive) {
            return tt9.filterEntries((NavigableMap) this.f85884a.headMap(toKey, inclusive), (l8d) this.f85885b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !vg8.any(this.f85884a.entrySet(), this.f85885b);
        }

        @Override // p000.AbstractC7124i3, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new a(this);
        }

        @Override // p000.AbstractC7124i3, java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) vg8.m23935a(this.f85884a.entrySet(), this.f85885b);
        }

        @Override // p000.AbstractC7124i3, java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) vg8.m23935a(this.f85884a.descendingMap().entrySet(), this.f85885b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V put(@dgc K key, @dgc V value) {
            return this.f85886c.put(key, value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> m) {
            this.f85886c.putAll(m);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V remove(@wx1 Object key) {
            return this.f85886c.remove(key);
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f85886c.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@dgc K fromKey, boolean fromInclusive, @dgc K toKey, boolean toInclusive) {
            return tt9.filterEntries((NavigableMap) this.f85884a.subMap(fromKey, fromInclusive, toKey, toInclusive), (l8d) this.f85885b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@dgc K fromKey, boolean inclusive) {
            return tt9.filterEntries((NavigableMap) this.f85884a.tailMap(fromKey, inclusive), (l8d) this.f85885b);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new C13231z(this, this.f85884a, this.f85885b);
        }
    }

    /* JADX INFO: renamed from: tt9$x */
    public static class C13229x<K, V> extends C13227v<K, V> implements SortedMap<K, V> {

        /* JADX INFO: renamed from: tt9$x$a */
        public class a extends C13227v<K, V>.b implements SortedSet<K> {
            public a() {
                super();
            }

            @Override // java.util.SortedSet
            @wx1
            public Comparator<? super K> comparator() {
                return C13229x.this.m22827f().comparator();
            }

            @Override // java.util.SortedSet
            @dgc
            public K first() {
                return (K) C13229x.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(@dgc K toElement) {
                return (SortedSet) C13229x.this.headMap(toElement).keySet();
            }

            @Override // java.util.SortedSet
            @dgc
            public K last() {
                return (K) C13229x.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(@dgc K fromElement, @dgc K toElement) {
                return (SortedSet) C13229x.this.subMap(fromElement, toElement).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(@dgc K fromElement) {
                return (SortedSet) C13229x.this.tailMap(fromElement).keySet();
            }
        }

        public C13229x(SortedMap<K, V> unfiltered, l8d<? super Map.Entry<K, V>> entryPredicate) {
            super(unfiltered, entryPredicate);
        }

        @Override // java.util.SortedMap
        @wx1
        public Comparator<? super K> comparator() {
            return m22827f().comparator();
        }

        @Override // p000.tt9.C13227v, p000.tt9.AbstractC13223r0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> createKeySet() {
            return new a();
        }

        /* JADX INFO: renamed from: f */
        public SortedMap<K, V> m22827f() {
            return (SortedMap) this.f85855d;
        }

        @Override // java.util.SortedMap
        @dgc
        public K firstKey() {
            return keySet().iterator().next();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@dgc K toKey) {
            return new C13229x(m22827f().headMap(toKey), this.f85856e);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        @dgc
        public K lastKey() {
            SortedMap<K, V> sortedMapM22827f = m22827f();
            while (true) {
                K kLastKey = sortedMapM22827f.lastKey();
                if (m22816b(kLastKey, sib.m22018a(this.f85855d.get(kLastKey)))) {
                    return kLastKey;
                }
                sortedMapM22827f = m22827f().headMap(kLastKey);
            }
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@dgc K fromKey, @dgc K toKey) {
            return new C13229x(m22827f().subMap(fromKey, toKey), this.f85856e);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@dgc K fromKey) {
            return new C13229x(m22827f().tailMap(fromKey), this.f85856e);
        }

        @Override // p000.tt9.AbstractC13223r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public SortedSet<K> keySet() {
            return (SortedSet) super.keySet();
        }
    }

    /* JADX INFO: renamed from: tt9$y */
    public static class C13230y<K, V> extends AbstractC13214n<K, V> {

        /* JADX INFO: renamed from: f */
        public final l8d<? super K> f85889f;

        public C13230y(Map<K, V> unfiltered, l8d<? super K> keyPredicate, l8d<? super Map.Entry<K, V>> entryPredicate) {
            super(unfiltered, entryPredicate);
            this.f85889f = keyPredicate;
        }

        @Override // p000.tt9.AbstractC13214n, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return this.f85855d.containsKey(key) && this.f85889f.apply(key);
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<Map.Entry<K, V>> createEntrySet() {
            return t6f.filter(this.f85855d.entrySet(), this.f85856e);
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<K> createKeySet() {
            return t6f.filter(this.f85855d.keySet(), this.f85889f);
        }
    }

    /* JADX INFO: renamed from: tt9$z */
    public static final class C13231z<K, V> extends C13221q0<K, V> {

        /* JADX INFO: renamed from: b */
        public final Map<K, V> f85890b;

        /* JADX INFO: renamed from: c */
        public final l8d<? super Map.Entry<K, V>> f85891c;

        public C13231z(Map<K, V> filteredMap, Map<K, V> unfiltered, l8d<? super Map.Entry<K, V>> predicate) {
            super(filteredMap);
            this.f85890b = unfiltered;
            this.f85891c = predicate;
        }

        @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
        public boolean remove(@wx1 Object o) {
            Iterator<Map.Entry<K, V>> it = this.f85890b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f85891c.apply(next) && okb.equal(next.getValue(), o)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f85890b.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f85891c.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f85890b.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f85891c.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return eb9.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) eb9.newArrayList(iterator()).toArray(tArr);
        }
    }

    private tt9() {
    }

    /* JADX INFO: renamed from: A */
    public static String m22771A(Map<?, ?> map) {
        StringBuilder sbM12262c = h82.m12262c(map.size());
        sbM12262c.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                sbM12262c.append(", ");
            }
            sbM12262c.append(entry.getKey());
            sbM12262c.append('=');
            sbM12262c.append(entry.getValue());
            z = false;
        }
        sbM12262c.append('}');
        return sbM12262c.toString();
    }

    /* JADX INFO: renamed from: B */
    public static <V2, K, V1> Map.Entry<K, V2> m22772B(final InterfaceC13225t<? super K, ? super V1, V2> transformer, final Map.Entry<K, V1> entry) {
        v7d.checkNotNull(transformer);
        v7d.checkNotNull(entry);
        return new C13192c(entry, transformer);
    }

    /* JADX INFO: renamed from: C */
    public static <K, V> Map.Entry<K, V> m22773C(final Map.Entry<? extends K, ? extends V> entry) {
        v7d.checkNotNull(entry);
        return new C13208k(entry);
    }

    /* JADX INFO: renamed from: D */
    public static <K, V> quh<Map.Entry<K, V>> m22774D(final Iterator<Map.Entry<K, V>> entryIterator) {
        return new C13210l(entryIterator);
    }

    /* JADX INFO: renamed from: E */
    public static <K, V> Set<Map.Entry<K, V>> m22775E(Set<Map.Entry<K, V>> entrySet) {
        return new C13215n0(Collections.unmodifiableSet(entrySet));
    }

    /* JADX INFO: renamed from: F */
    public static <V> lz6<Map.Entry<?, V>, V> m22776F() {
        return EnumC13222r.f85871b;
    }

    /* JADX INFO: renamed from: G */
    public static <K, V> Iterator<V> m22777G(Iterator<Map.Entry<K, V>> entryIterator) {
        return new C13198f(entryIterator);
    }

    @wx1
    /* JADX INFO: renamed from: H */
    public static <V> V m22778H(@wx1 Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    /* JADX INFO: renamed from: I */
    public static <V> l8d<Map.Entry<?, V>> m22779I(l8d<? super V> valuePredicate) {
        return p8d.compose(valuePredicate, m22776F());
    }

    public static <A, B> wz2<A, B> asConverter(final k11<A, B> bimap) {
        return new C13218p(bimap);
    }

    public static <K, V> Map<K, V> asMap(Set<K> set, lz6<? super K, V> function) {
        return new C13216o(set, function);
    }

    public static <K, V> js9<K, V> difference(Map<? extends K, ? extends V> left, Map<? extends K, ? extends V> right) {
        return left instanceof SortedMap ? difference((SortedMap) left, (Map) right) : difference(left, right, r45.equals());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <K, V> void doDifference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, r45<? super V> r45Var, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, js9.InterfaceC8052a<V>> map6) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                InterfaceC0000a interfaceC0000a = (Object) sib.m22018a(map4.remove(key));
                if (r45Var.equivalent(value, interfaceC0000a)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, C13219p0.m22817a(value, interfaceC0000a));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static <K, V1, V2> lz6<Map.Entry<K, V1>, Map.Entry<K, V2>> m22785f(final InterfaceC13225t<? super K, ? super V1, V2> transformer) {
        v7d.checkNotNull(transformer);
        return new C13194d(transformer);
    }

    public static <K, V> Map<K, V> filterEntries(Map<K, V> unfiltered, l8d<? super Map.Entry<K, V>> entryPredicate) {
        v7d.checkNotNull(entryPredicate);
        return unfiltered instanceof AbstractC13214n ? filterFiltered((AbstractC13214n) unfiltered, entryPredicate) : new C13227v((Map) v7d.checkNotNull(unfiltered), entryPredicate);
    }

    private static <K, V> Map<K, V> filterFiltered(AbstractC13214n<K, V> map, l8d<? super Map.Entry<K, V>> entryPredicate) {
        return new C13227v(map.f85855d, p8d.and(map.f85856e, entryPredicate));
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> unfiltered, final l8d<? super K> keyPredicate) {
        v7d.checkNotNull(keyPredicate);
        l8d l8dVarM22799t = m22799t(keyPredicate);
        return unfiltered instanceof AbstractC13214n ? filterFiltered((AbstractC13214n) unfiltered, l8dVarM22799t) : new C13230y((Map) v7d.checkNotNull(unfiltered), keyPredicate, l8dVarM22799t);
    }

    public static <K, V> Map<K, V> filterValues(Map<K, V> unfiltered, final l8d<? super V> valuePredicate) {
        return filterEntries(unfiltered, m22779I(valuePredicate));
    }

    @jd7
    @yg8
    public static ox7<String, String> fromProperties(Properties properties) {
        ox7.C10705d c10705dBuilder = ox7.builder();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            Object objNextElement = enumerationPropertyNames.nextElement();
            Objects.requireNonNull(objNextElement);
            String str = (String) objNextElement;
            String property = properties.getProperty(str);
            Objects.requireNonNull(property);
            c10705dBuilder.put(str, property);
        }
        return c10705dBuilder.buildOrThrow();
    }

    /* JADX INFO: renamed from: g */
    public static <K, V1, V2> lz6<Map.Entry<K, V1>, V2> m22786g(final InterfaceC13225t<? super K, ? super V1, V2> transformer) {
        v7d.checkNotNull(transformer);
        return new C13190b(transformer);
    }

    /* JADX INFO: renamed from: h */
    public static <K, V1, V2> InterfaceC13225t<K, V1, V2> m22787h(final lz6<? super V1, V2> function) {
        v7d.checkNotNull(function);
        return new C13212m(function);
    }

    /* JADX INFO: renamed from: i */
    public static <K, V> Iterator<Map.Entry<K, V>> m22788i(Set<K> set, final lz6<? super K, V> function) {
        return new C13200g(set.iterator(), function);
    }

    @gd7(serializable = true)
    public static <K, V> Map.Entry<K, V> immutableEntry(@dgc K key, @dgc V value) {
        return new ex7(key, value);
    }

    @gd7(serializable = true)
    @yg8
    public static <K extends Enum<K>, V> ox7<K, V> immutableEnumMap(Map<K, ? extends V> map) {
        if (map instanceof fx7) {
            return (fx7) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ox7.m19076of();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        s72.m21764a(key, value);
        EnumMap enumMap = new EnumMap(Collections.singletonMap(key, value));
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            s72.m21764a(key2, value2);
            enumMap.put((Enum) key2, (Object) value2);
        }
        return fx7.m11217k(enumMap);
    }

    /* JADX INFO: renamed from: j */
    public static <K, V1, V2> lz6<V1, V2> m22789j(final InterfaceC13225t<? super K, V1, V2> transformer, @dgc final K key) {
        v7d.checkNotNull(transformer);
        return new C13188a(transformer, key);
    }

    /* JADX INFO: renamed from: k */
    public static int m22790k(int expectedSize) {
        if (expectedSize < 3) {
            s72.m21765b(expectedSize, "expectedSize");
            return expectedSize + 1;
        }
        if (expectedSize < 1073741824) {
            return (int) Math.ceil(((double) expectedSize) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: l */
    public static <K, V> boolean m22791l(Collection<Map.Entry<K, V>> c, @wx1 Object o) {
        if (o instanceof Map.Entry) {
            return c.contains(m22773C((Map.Entry) o));
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m22792m(Map<?, ?> map, @wx1 Object key) {
        return wg8.contains(m22797r(map.entrySet().iterator()), key);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m22793n(Map<?, ?> map, @wx1 Object value) {
        return wg8.contains(m22777G(map.entrySet().iterator()), value);
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> type) {
        return new EnumMap<>((Class) v7d.checkNotNull(type));
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int expectedSize) {
        return new HashMap<>(m22790k(expectedSize));
    }

    public static <K, V> IdentityHashMap<K, V> newIdentityHashMap() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int expectedSize) {
        return new LinkedHashMap<>(m22790k(expectedSize));
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<>();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m22794o(Map<?, ?> map, @wx1 Object object) {
        if (map == object) {
            return true;
        }
        if (object instanceof Map) {
            return map.entrySet().equals(((Map) object).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static <E> ox7<E, Integer> m22795p(Collection<E> list) {
        ox7.C10705d c10705d = new ox7.C10705d(list.size());
        Iterator<E> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            c10705d.put(it.next(), Integer.valueOf(i));
            i++;
        }
        return c10705d.buildOrThrow();
    }

    /* JADX INFO: renamed from: q */
    public static <K> lz6<Map.Entry<K, ?>, K> m22796q() {
        return EnumC13222r.f85870a;
    }

    /* JADX INFO: renamed from: r */
    public static <K, V> Iterator<K> m22797r(Iterator<Map.Entry<K, V>> entryIterator) {
        return new C13196e(entryIterator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @jd7
    public static <E> NavigableSet<E> removeOnlyNavigableSet(final NavigableSet<E> set) {
        return new C13206j(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Set<E> removeOnlySet(final Set<E> set) {
        return new C13202h(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> SortedSet<E> removeOnlySortedSet(final SortedSet<E> set) {
        return new C13204i(set);
    }

    @wx1
    /* JADX INFO: renamed from: s */
    public static <K> K m22798s(@wx1 Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jd7
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> subMap(NavigableMap<K, V> map, bpd<K> range) {
        if (map.comparator() != null && map.comparator() != s7c.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            v7d.checkArgument(map.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            Comparable comparableLowerEndpoint = range.lowerEndpoint();
            hc1 hc1VarLowerBoundType = range.lowerBoundType();
            hc1 hc1Var = hc1.CLOSED;
            return map.subMap(comparableLowerEndpoint, hc1VarLowerBoundType == hc1Var, range.upperEndpoint(), range.upperBoundType() == hc1Var);
        }
        if (range.hasLowerBound()) {
            return map.tailMap(range.lowerEndpoint(), range.lowerBoundType() == hc1.CLOSED);
        }
        if (range.hasUpperBound()) {
            return map.headMap(range.upperEndpoint(), range.upperBoundType() == hc1.CLOSED);
        }
        return (NavigableMap) v7d.checkNotNull(map);
    }

    public static <K, V> k11<K, V> synchronizedBiMap(k11<K, V> bimap) {
        return xhg.m25161g(bimap, null);
    }

    @jd7
    public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> navigableMap) {
        return xhg.m25167m(navigableMap);
    }

    /* JADX INFO: renamed from: t */
    public static <K> l8d<Map.Entry<K, ?>> m22799t(l8d<? super K> keyPredicate) {
        return p8d.compose(keyPredicate, m22796q());
    }

    public static <K, V> ox7<K, V> toMap(Iterable<K> keys, lz6<? super K, V> valueFunction) {
        return toMap(keys.iterator(), valueFunction);
    }

    public static <K, V1, V2> Map<K, V2> transformEntries(Map<K, V1> fromMap, InterfaceC13225t<? super K, ? super V1, V2> transformer) {
        return new C13205i0(fromMap, transformer);
    }

    public static <K, V1, V2> Map<K, V2> transformValues(Map<K, V1> fromMap, lz6<? super V1, V2> function) {
        return transformEntries(fromMap, m22787h(function));
    }

    /* JADX INFO: renamed from: u */
    public static <E> Comparator<? super E> m22800u(@wx1 Comparator<? super E> comparator) {
        return comparator != null ? comparator : s7c.natural();
    }

    @op1
    public static <K, V> ox7<K, V> uniqueIndex(Iterable<V> values, lz6<? super V, K> keyFunction) {
        return values instanceof Collection ? uniqueIndex(values.iterator(), keyFunction, ox7.builderWithExpectedSize(((Collection) values).size())) : uniqueIndex(values.iterator(), keyFunction);
    }

    public static <K, V> k11<K, V> unmodifiableBiMap(k11<? extends K, ? extends V> bimap) {
        return new C13211l0(bimap, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Map<K, V> unmodifiableMap(Map<K, ? extends V> map) {
        return map instanceof SortedMap ? Collections.unmodifiableSortedMap((SortedMap) map) : Collections.unmodifiableMap(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jd7
    public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> map) {
        v7d.checkNotNull(map);
        return map instanceof C13217o0 ? map : new C13217o0(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @wx1
    public static <K, V> Map.Entry<K, V> unmodifiableOrNull(@wx1 Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return m22773C(entry);
    }

    /* JADX INFO: renamed from: v */
    public static <K, V> void m22801v(Map<K, V> self, Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            self.put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: w */
    public static <K, V> boolean m22802w(Collection<Map.Entry<K, V>> c, @wx1 Object o) {
        if (o instanceof Map.Entry) {
            return c.remove(m22773C((Map.Entry) o));
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m22803x(Map<?, ?> map, @wx1 Object key) {
        v7d.checkNotNull(map);
        try {
            return map.containsKey(key);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @wx1
    /* JADX INFO: renamed from: y */
    public static <V> V m22804y(Map<?, V> map, @wx1 Object key) {
        v7d.checkNotNull(map);
        try {
            return map.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    @wx1
    /* JADX INFO: renamed from: z */
    public static <V> V m22805z(Map<?, V> map, @wx1 Object key) {
        v7d.checkNotNull(map);
        try {
            return map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <K, V> SortedMap<K, V> asMap(SortedSet<K> set, lz6<? super K, V> function) {
        return new C13199f0(set, function);
    }

    public static <K, V> SortedMap<K, V> filterValues(SortedMap<K, V> unfiltered, final l8d<? super V> valuePredicate) {
        return filterEntries((SortedMap) unfiltered, m22779I(valuePredicate));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> TreeMap<K, V> newTreeMap(SortedMap<K, ? extends V> map) {
        return new TreeMap<>((SortedMap) map);
    }

    public static <K, V> ox7<K, V> toMap(Iterator<K> keys, lz6<? super K, V> valueFunction) {
        v7d.checkNotNull(valueFunction);
        ox7.C10705d c10705dBuilder = ox7.builder();
        while (keys.hasNext()) {
            K next = keys.next();
            c10705dBuilder.put(next, valueFunction.apply(next));
        }
        return c10705dBuilder.buildKeepingLast();
    }

    public static <K, V1, V2> SortedMap<K, V2> transformEntries(SortedMap<K, V1> fromMap, InterfaceC13225t<? super K, ? super V1, V2> transformer) {
        return new C13209k0(fromMap, transformer);
    }

    public static <K, V1, V2> SortedMap<K, V2> transformValues(SortedMap<K, V1> fromMap, lz6<? super V1, V2> function) {
        return transformEntries((SortedMap) fromMap, m22787h(function));
    }

    @jd7
    public static <K, V> NavigableMap<K, V> asMap(NavigableSet<K> set, lz6<? super K, V> function) {
        return new C13195d0(set, function);
    }

    private static <K, V> SortedMap<K, V> filterFiltered(C13229x<K, V> map, l8d<? super Map.Entry<K, V>> entryPredicate) {
        return new C13229x(map.m22827f(), p8d.and(map.f85856e, entryPredicate));
    }

    @jd7
    public static <K, V> NavigableMap<K, V> filterValues(NavigableMap<K, V> unfiltered, final l8d<? super V> valuePredicate) {
        return filterEntries((NavigableMap) unfiltered, m22779I(valuePredicate));
    }

    public static <C, K extends C, V> TreeMap<K, V> newTreeMap(@wx1 Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    @jd7
    public static <K, V1, V2> NavigableMap<K, V2> transformEntries(NavigableMap<K, V1> fromMap, InterfaceC13225t<? super K, ? super V1, V2> transformer) {
        return new C13207j0(fromMap, transformer);
    }

    @jd7
    public static <K, V1, V2> NavigableMap<K, V2> transformValues(NavigableMap<K, V1> fromMap, lz6<? super V1, V2> function) {
        return transformEntries((NavigableMap) fromMap, m22787h(function));
    }

    public static <K, V> k11<K, V> filterValues(k11<K, V> unfiltered, final l8d<? super V> valuePredicate) {
        return filterEntries((k11) unfiltered, m22779I(valuePredicate));
    }

    public static <K, V> js9<K, V> difference(Map<? extends K, ? extends V> left, Map<? extends K, ? extends V> right, r45<? super V> valueEquivalence) {
        v7d.checkNotNull(valueEquivalence);
        LinkedHashMap linkedHashMapNewLinkedHashMap = newLinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(right);
        LinkedHashMap linkedHashMapNewLinkedHashMap2 = newLinkedHashMap();
        LinkedHashMap linkedHashMapNewLinkedHashMap3 = newLinkedHashMap();
        doDifference(left, right, valueEquivalence, linkedHashMapNewLinkedHashMap, linkedHashMap, linkedHashMapNewLinkedHashMap2, linkedHashMapNewLinkedHashMap3);
        return new C13193c0(linkedHashMapNewLinkedHashMap, linkedHashMap, linkedHashMapNewLinkedHashMap2, linkedHashMapNewLinkedHashMap3);
    }

    public static <K, V> SortedMap<K, V> filterEntries(SortedMap<K, V> unfiltered, l8d<? super Map.Entry<K, V>> entryPredicate) {
        v7d.checkNotNull(entryPredicate);
        if (unfiltered instanceof C13229x) {
            return filterFiltered((C13229x) unfiltered, (l8d) entryPredicate);
        }
        return new C13229x((SortedMap) v7d.checkNotNull(unfiltered), entryPredicate);
    }

    @jd7
    private static <K, V> NavigableMap<K, V> filterFiltered(C13228w<K, V> map, l8d<? super Map.Entry<K, V>> entryPredicate) {
        return new C13228w(map.f85884a, p8d.and(map.f85885b, entryPredicate));
    }

    public static <K, V> SortedMap<K, V> filterKeys(SortedMap<K, V> unfiltered, final l8d<? super K> keyPredicate) {
        return filterEntries((SortedMap) unfiltered, m22799t(keyPredicate));
    }

    @op1
    public static <K, V> ox7<K, V> uniqueIndex(Iterator<V> values, lz6<? super V, K> keyFunction) {
        return uniqueIndex(values, keyFunction, ox7.builder());
    }

    private static <K, V> k11<K, V> filterFiltered(C13226u<K, V> map, l8d<? super Map.Entry<K, V>> entryPredicate) {
        return new C13226u(map.m22820e(), p8d.and(map.f85856e, entryPredicate));
    }

    @jd7
    public static <K, V> NavigableMap<K, V> filterKeys(NavigableMap<K, V> unfiltered, final l8d<? super K> keyPredicate) {
        return filterEntries((NavigableMap) unfiltered, m22799t(keyPredicate));
    }

    private static <K, V> ox7<K, V> uniqueIndex(Iterator<V> values, lz6<? super V, K> keyFunction, ox7.C10705d<K, V> builder) {
        v7d.checkNotNull(keyFunction);
        while (values.hasNext()) {
            V next = values.next();
            builder.put(keyFunction.apply(next), next);
        }
        try {
            return builder.buildOrThrow();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }

    public static <K, V> k11<K, V> filterKeys(k11<K, V> unfiltered, final l8d<? super K> keyPredicate) {
        v7d.checkNotNull(keyPredicate);
        return filterEntries((k11) unfiltered, m22799t(keyPredicate));
    }

    @jd7
    public static <K, V> NavigableMap<K, V> filterEntries(NavigableMap<K, V> unfiltered, l8d<? super Map.Entry<K, V>> entryPredicate) {
        v7d.checkNotNull(entryPredicate);
        if (unfiltered instanceof C13228w) {
            return filterFiltered((C13228w) unfiltered, entryPredicate);
        }
        return new C13228w((NavigableMap) v7d.checkNotNull(unfiltered), entryPredicate);
    }

    public static <K, V> nvf<K, V> difference(SortedMap<K, ? extends V> left, Map<? extends K, ? extends V> right) {
        v7d.checkNotNull(left);
        v7d.checkNotNull(right);
        Comparator comparatorM22800u = m22800u(left.comparator());
        TreeMap treeMapNewTreeMap = newTreeMap(comparatorM22800u);
        TreeMap treeMapNewTreeMap2 = newTreeMap(comparatorM22800u);
        treeMapNewTreeMap2.putAll(right);
        TreeMap treeMapNewTreeMap3 = newTreeMap(comparatorM22800u);
        TreeMap treeMapNewTreeMap4 = newTreeMap(comparatorM22800u);
        doDifference(left, right, r45.equals(), treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
        return new C13203h0(treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
    }

    public static <K, V> k11<K, V> filterEntries(k11<K, V> unfiltered, l8d<? super Map.Entry<K, V>> entryPredicate) {
        v7d.checkNotNull(unfiltered);
        v7d.checkNotNull(entryPredicate);
        if (unfiltered instanceof C13226u) {
            return filterFiltered((C13226u) unfiltered, (l8d) entryPredicate);
        }
        return new C13226u(unfiltered, entryPredicate);
    }
}
