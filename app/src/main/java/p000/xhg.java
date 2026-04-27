package p000;

import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p000.d4b;
import p000.kkg;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class xhg {

    /* JADX INFO: renamed from: xhg$b */
    public static class C15085b<K, V> extends C15094k<K, Collection<V>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: f */
        @wx1
        public transient Set<Map.Entry<K, Collection<V>>> f97857f;

        /* JADX INFO: renamed from: m */
        @wx1
        public transient Collection<Collection<V>> f97858m;

        public C15085b(Map<K, Collection<V>> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.xhg.C15094k, java.util.Map
        public boolean containsValue(@wx1 Object o) {
            return values().contains(o);
        }

        @Override // p000.xhg.C15094k, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.f97880b) {
                try {
                    if (this.f97857f == null) {
                        this.f97857f = new C15086c(mo25190c().entrySet(), this.f97880b);
                    }
                    set = this.f97857f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // p000.xhg.C15094k, java.util.Map
        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.f97880b) {
                try {
                    if (this.f97858m == null) {
                        this.f97858m = new C15087d(mo25190c().values(), this.f97880b);
                    }
                    collection = this.f97858m;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        @Override // p000.xhg.C15094k, java.util.Map
        @wx1
        public Collection<V> get(@wx1 Object key) {
            Collection<V> collectionTypePreservingCollection;
            synchronized (this.f97880b) {
                Collection collection = (Collection) super.get(key);
                collectionTypePreservingCollection = collection == null ? null : xhg.typePreservingCollection(collection, this.f97880b);
            }
            return collectionTypePreservingCollection;
        }
    }

    /* JADX INFO: renamed from: xhg$d */
    public static class C15087d<V> extends C15089f<Collection<V>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: xhg$d$a */
        public class a extends geh<Collection<V>, Collection<V>> {
            public a(Iterator backingIterator) {
                super(backingIterator);
            }

            @Override // p000.geh
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<V> mo2935a(Collection<V> from) {
                return xhg.typePreservingCollection(from, C15087d.this.f97880b);
            }
        }

        public C15087d(Collection<Collection<V>> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.xhg.C15089f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<V>> iterator() {
            return new a(super.iterator());
        }
    }

    /* JADX INFO: renamed from: xhg$e */
    @gdi
    public static class C15088e<K, V> extends C15094k<K, V> implements k11<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: f */
        @wx1
        public transient Set<V> f97863f;

        /* JADX INFO: renamed from: m */
        @RetainedWith
        @wx1
        public transient k11<V, K> f97864m;

        @Override // p000.xhg.C15094k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public k11<K, V> mo25190c() {
            return (k11) super.mo25190c();
        }

        @Override // p000.k11
        @wx1
        public V forcePut(@dgc K key, @dgc V value) {
            V vForcePut;
            synchronized (this.f97880b) {
                vForcePut = mo25179a().forcePut(key, value);
            }
            return vForcePut;
        }

        @Override // p000.k11
        public k11<V, K> inverse() {
            k11<V, K> k11Var;
            synchronized (this.f97880b) {
                try {
                    if (this.f97864m == null) {
                        this.f97864m = new C15088e(mo25179a().inverse(), this.f97880b, this);
                    }
                    k11Var = this.f97864m;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return k11Var;
        }

        private C15088e(k11<K, V> delegate, @wx1 Object mutex, @wx1 k11<V, K> inverse) {
            super(delegate, mutex);
            this.f97864m = inverse;
        }

        @Override // p000.xhg.C15094k, java.util.Map
        public Set<V> values() {
            Set<V> set;
            synchronized (this.f97880b) {
                try {
                    if (this.f97863f == null) {
                        this.f97863f = xhg.m25172r(mo25179a().values(), this.f97880b);
                    }
                    set = this.f97863f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }
    }

    /* JADX INFO: renamed from: xhg$f */
    @gdi
    public static class C15089f<E> extends C15099p implements Collection<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Collection
        public boolean add(E e) {
            boolean zAdd;
            synchronized (this.f97880b) {
                zAdd = mo25192c().add(e);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> c) {
            boolean zAddAll;
            synchronized (this.f97880b) {
                zAddAll = mo25192c().addAll(c);
            }
            return zAddAll;
        }

        @Override // p000.xhg.C15099p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Collection<E> mo25187b() {
            return (Collection) super.mo25187b();
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.f97880b) {
                mo25192c().clear();
            }
        }

        public boolean contains(@wx1 Object o) {
            boolean zContains;
            synchronized (this.f97880b) {
                zContains = mo25192c().contains(o);
            }
            return zContains;
        }

        public boolean containsAll(Collection<?> c) {
            boolean zContainsAll;
            synchronized (this.f97880b) {
                zContainsAll = mo25192c().containsAll(c);
            }
            return zContainsAll;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f97880b) {
                zIsEmpty = mo25192c().isEmpty();
            }
            return zIsEmpty;
        }

        public Iterator<E> iterator() {
            return mo25192c().iterator();
        }

        public boolean remove(@wx1 Object o) {
            boolean zRemove;
            synchronized (this.f97880b) {
                zRemove = mo25192c().remove(o);
            }
            return zRemove;
        }

        public boolean removeAll(Collection<?> c) {
            boolean zRemoveAll;
            synchronized (this.f97880b) {
                zRemoveAll = mo25192c().removeAll(c);
            }
            return zRemoveAll;
        }

        public boolean retainAll(Collection<?> c) {
            boolean zRetainAll;
            synchronized (this.f97880b) {
                zRetainAll = mo25192c().retainAll(c);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.f97880b) {
                size = mo25192c().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f97880b) {
                array = mo25192c().toArray();
            }
            return array;
        }

        private C15089f(Collection<E> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f97880b) {
                tArr2 = (T[]) mo25192c().toArray(tArr);
            }
            return tArr2;
        }
    }

    /* JADX INFO: renamed from: xhg$g */
    public static final class C15090g<E> extends C15100q<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        public C15090g(Deque<E> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.Deque
        public void addFirst(E e) {
            synchronized (this.f97880b) {
                mo25180b().addFirst(e);
            }
        }

        @Override // java.util.Deque
        public void addLast(E e) {
            synchronized (this.f97880b) {
                mo25180b().addLast(e);
            }
        }

        @Override // p000.xhg.C15100q
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Deque<E> mo25183c() {
            return (Deque) super.mo25183c();
        }

        @Override // java.util.Deque
        public Iterator<E> descendingIterator() {
            Iterator<E> itDescendingIterator;
            synchronized (this.f97880b) {
                itDescendingIterator = mo25180b().descendingIterator();
            }
            return itDescendingIterator;
        }

        @Override // java.util.Deque
        public E getFirst() {
            E first;
            synchronized (this.f97880b) {
                first = mo25180b().getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public E getLast() {
            E last;
            synchronized (this.f97880b) {
                last = mo25180b().getLast();
            }
            return last;
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e) {
            boolean zOfferFirst;
            synchronized (this.f97880b) {
                zOfferFirst = mo25180b().offerFirst(e);
            }
            return zOfferFirst;
        }

        @Override // java.util.Deque
        public boolean offerLast(E e) {
            boolean zOfferLast;
            synchronized (this.f97880b) {
                zOfferLast = mo25180b().offerLast(e);
            }
            return zOfferLast;
        }

        @Override // java.util.Deque
        @wx1
        public E peekFirst() {
            E ePeekFirst;
            synchronized (this.f97880b) {
                ePeekFirst = mo25180b().peekFirst();
            }
            return ePeekFirst;
        }

        @Override // java.util.Deque
        @wx1
        public E peekLast() {
            E ePeekLast;
            synchronized (this.f97880b) {
                ePeekLast = mo25180b().peekLast();
            }
            return ePeekLast;
        }

        @Override // java.util.Deque
        @wx1
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.f97880b) {
                ePollFirst = mo25180b().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.Deque
        @wx1
        public E pollLast() {
            E ePollLast;
            synchronized (this.f97880b) {
                ePollLast = mo25180b().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.Deque
        public E pop() {
            E ePop;
            synchronized (this.f97880b) {
                ePop = mo25180b().pop();
            }
            return ePop;
        }

        @Override // java.util.Deque
        public void push(E e) {
            synchronized (this.f97880b) {
                mo25180b().push(e);
            }
        }

        @Override // java.util.Deque
        public E removeFirst() {
            E eRemoveFirst;
            synchronized (this.f97880b) {
                eRemoveFirst = mo25180b().removeFirst();
            }
            return eRemoveFirst;
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(@wx1 Object o) {
            boolean zRemoveFirstOccurrence;
            synchronized (this.f97880b) {
                zRemoveFirstOccurrence = mo25180b().removeFirstOccurrence(o);
            }
            return zRemoveFirstOccurrence;
        }

        @Override // java.util.Deque
        public E removeLast() {
            E eRemoveLast;
            synchronized (this.f97880b) {
                eRemoveLast = mo25180b().removeLast();
            }
            return eRemoveLast;
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(@wx1 Object o) {
            boolean zRemoveLastOccurrence;
            synchronized (this.f97880b) {
                zRemoveLastOccurrence = mo25180b().removeLastOccurrence(o);
            }
            return zRemoveLastOccurrence;
        }
    }

    /* JADX INFO: renamed from: xhg$h */
    @jd7
    public static class C15091h<K, V> extends C15099p implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        public C15091h(Map.Entry<K, V> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.xhg.C15099p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo25187b() {
            return (Map.Entry) super.mo25187b();
        }

        @Override // java.util.Map.Entry
        public boolean equals(@wx1 Object obj) {
            boolean zEquals;
            synchronized (this.f97880b) {
                zEquals = mo25180b().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            K key;
            synchronized (this.f97880b) {
                key = mo25180b().getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V value;
            synchronized (this.f97880b) {
                value = mo25180b().getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            synchronized (this.f97880b) {
                iHashCode = mo25180b().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map.Entry
        public V setValue(V value) {
            V value2;
            synchronized (this.f97880b) {
                value2 = mo25180b().setValue(value);
            }
            return value2;
        }
    }

    /* JADX INFO: renamed from: xhg$i */
    public static class C15092i<E> extends C15089f<E> implements List<E> {
        private static final long serialVersionUID = 0;

        public C15092i(List<E> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.List
        public void add(int index, E element) {
            synchronized (this.f97880b) {
                mo25180b().add(index, element);
            }
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends E> c) {
            boolean zAddAll;
            synchronized (this.f97880b) {
                zAddAll = mo25180b().addAll(index, c);
            }
            return zAddAll;
        }

        @Override // p000.xhg.C15089f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public List<E> mo25192c() {
            return (List) super.mo25192c();
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(@wx1 Object o) {
            boolean zEquals;
            if (o == this) {
                return true;
            }
            synchronized (this.f97880b) {
                zEquals = mo25180b().equals(o);
            }
            return zEquals;
        }

        @Override // java.util.List
        public E get(int index) {
            E e;
            synchronized (this.f97880b) {
                e = mo25180b().get(index);
            }
            return e;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode;
            synchronized (this.f97880b) {
                iHashCode = mo25180b().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.List
        public int indexOf(@wx1 Object o) {
            int iIndexOf;
            synchronized (this.f97880b) {
                iIndexOf = mo25180b().indexOf(o);
            }
            return iIndexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(@wx1 Object o) {
            int iLastIndexOf;
            synchronized (this.f97880b) {
                iLastIndexOf = mo25180b().lastIndexOf(o);
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
            return mo25180b().listIterator();
        }

        @Override // java.util.List
        public E remove(int index) {
            E eRemove;
            synchronized (this.f97880b) {
                eRemove = mo25180b().remove(index);
            }
            return eRemove;
        }

        @Override // java.util.List
        public E set(int index, E element) {
            E e;
            synchronized (this.f97880b) {
                e = mo25180b().set(index, element);
            }
            return e;
        }

        @Override // java.util.List
        public List<E> subList(int fromIndex, int toIndex) {
            List<E> list;
            synchronized (this.f97880b) {
                list = xhg.list(mo25180b().subList(fromIndex, toIndex), this.f97880b);
            }
            return list;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int index) {
            return mo25180b().listIterator(index);
        }
    }

    /* JADX INFO: renamed from: xhg$j */
    public static class C15093j<K, V> extends C15095l<K, V> implements j99<K, V> {
        private static final long serialVersionUID = 0;

        public C15093j(j99<K, V> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.xhg.C15095l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public j99<K, V> mo25187b() {
            return (j99) super.mo25187b();
        }

        @Override // p000.xhg.C15095l, p000.u3b
        public List<V> get(K key) {
            List<V> list;
            synchronized (this.f97880b) {
                list = xhg.list(mo25183c().get((Object) key), this.f97880b);
            }
            return list;
        }

        @Override // p000.xhg.C15095l, p000.u3b
        public List<V> removeAll(@wx1 Object key) {
            List<V> listRemoveAll;
            synchronized (this.f97880b) {
                listRemoveAll = mo25183c().removeAll(key);
            }
            return listRemoveAll;
        }

        @Override // p000.xhg.C15095l, p000.u3b
        public List<V> replaceValues(K key, Iterable<? extends V> values) {
            List<V> listReplaceValues;
            synchronized (this.f97880b) {
                listReplaceValues = mo25183c().replaceValues((Object) key, (Iterable) values);
            }
            return listReplaceValues;
        }
    }

    /* JADX INFO: renamed from: xhg$k */
    public static class C15094k<K, V> extends C15099p implements Map<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c */
        @wx1
        public transient Set<K> f97865c;

        /* JADX INFO: renamed from: d */
        @wx1
        public transient Collection<V> f97866d;

        /* JADX INFO: renamed from: e */
        @wx1
        public transient Set<Map.Entry<K, V>> f97867e;

        public C15094k(Map<K, V> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.xhg.C15099p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<K, V> mo25187b() {
            return (Map) super.mo25187b();
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.f97880b) {
                mo25190c().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(@wx1 Object key) {
            boolean zContainsKey;
            synchronized (this.f97880b) {
                zContainsKey = mo25190c().containsKey(key);
            }
            return zContainsKey;
        }

        public boolean containsValue(@wx1 Object value) {
            boolean zContainsValue;
            synchronized (this.f97880b) {
                zContainsValue = mo25190c().containsValue(value);
            }
            return zContainsValue;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f97880b) {
                try {
                    if (this.f97867e == null) {
                        this.f97867e = xhg.m25172r(mo25190c().entrySet(), this.f97880b);
                    }
                    set = this.f97867e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(@wx1 Object o) {
            boolean zEquals;
            if (o == this) {
                return true;
            }
            synchronized (this.f97880b) {
                zEquals = mo25190c().equals(o);
            }
            return zEquals;
        }

        @wx1
        public V get(@wx1 Object key) {
            V v;
            synchronized (this.f97880b) {
                v = mo25190c().get(key);
            }
            return v;
        }

        @Override // java.util.Map
        public int hashCode() {
            int iHashCode;
            synchronized (this.f97880b) {
                iHashCode = mo25190c().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f97880b) {
                zIsEmpty = mo25190c().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f97880b) {
                try {
                    if (this.f97865c == null) {
                        this.f97865c = xhg.m25172r(mo25190c().keySet(), this.f97880b);
                    }
                    set = this.f97865c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Map
        @wx1
        public V put(K key, V value) {
            V vPut;
            synchronized (this.f97880b) {
                vPut = mo25190c().put(key, value);
            }
            return vPut;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.f97880b) {
                mo25190c().putAll(map);
            }
        }

        @Override // java.util.Map
        @wx1
        public V remove(@wx1 Object key) {
            V vRemove;
            synchronized (this.f97880b) {
                vRemove = mo25190c().remove(key);
            }
            return vRemove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.f97880b) {
                size = mo25190c().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f97880b) {
                try {
                    if (this.f97866d == null) {
                        this.f97866d = xhg.collection(mo25190c().values(), this.f97880b);
                    }
                    collection = this.f97866d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    /* JADX INFO: renamed from: xhg$p */
    public static class C15099p implements Serializable {

        @jd7
        @yg8
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Object f97879a;

        /* JADX INFO: renamed from: b */
        public final Object f97880b;

        public C15099p(Object delegate, @wx1 Object mutex) {
            this.f97879a = v7d.checkNotNull(delegate);
            this.f97880b = mutex == null ? this : mutex;
        }

        @jd7
        @yg8
        private void writeObject(ObjectOutputStream stream) throws IOException {
            synchronized (this.f97880b) {
                stream.defaultWriteObject();
            }
        }

        /* JADX INFO: renamed from: a */
        public Object mo25187b() {
            return this.f97879a;
        }

        public String toString() {
            String string;
            synchronized (this.f97880b) {
                string = this.f97879a.toString();
            }
            return string;
        }
    }

    /* JADX INFO: renamed from: xhg$q */
    public static class C15100q<E> extends C15089f<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        public C15100q(Queue<E> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.xhg.C15089f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Queue<E> mo25192c() {
            return (Queue) super.mo25192c();
        }

        @Override // java.util.Queue
        public E element() {
            E eElement;
            synchronized (this.f97880b) {
                eElement = mo25183c().element();
            }
            return eElement;
        }

        @Override // java.util.Queue
        public boolean offer(E e) {
            boolean zOffer;
            synchronized (this.f97880b) {
                zOffer = mo25183c().offer(e);
            }
            return zOffer;
        }

        @Override // java.util.Queue
        @wx1
        public E peek() {
            E ePeek;
            synchronized (this.f97880b) {
                ePeek = mo25183c().peek();
            }
            return ePeek;
        }

        @Override // java.util.Queue
        @wx1
        public E poll() {
            E ePoll;
            synchronized (this.f97880b) {
                ePoll = mo25183c().poll();
            }
            return ePoll;
        }

        @Override // java.util.Queue
        public E remove() {
            E eRemove;
            synchronized (this.f97880b) {
                eRemove = mo25183c().remove();
            }
            return eRemove;
        }
    }

    /* JADX INFO: renamed from: xhg$r */
    public static class C15101r<E> extends C15092i<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        public C15101r(List<E> list, @wx1 Object mutex) {
            super(list, mutex);
        }
    }

    /* JADX INFO: renamed from: xhg$s */
    public static class C15102s<E> extends C15089f<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        public C15102s(Set<E> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.xhg.C15089f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Set<E> mo25192c() {
            return (Set) super.mo25192c();
        }

        public boolean equals(@wx1 Object o) {
            boolean zEquals;
            if (o == this) {
                return true;
            }
            synchronized (this.f97880b) {
                zEquals = mo25192c().equals(o);
            }
            return zEquals;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int iHashCode;
            synchronized (this.f97880b) {
                iHashCode = mo25192c().hashCode();
            }
            return iHashCode;
        }
    }

    /* JADX INFO: renamed from: xhg$t */
    public static class C15103t<K, V> extends C15095l<K, V> implements p6f<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: C */
        @wx1
        public transient Set<Map.Entry<K, V>> f97881C;

        public C15103t(p6f<K, V> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.xhg.C15095l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public p6f<K, V> mo25187b() {
            return (p6f) super.mo25187b();
        }

        @Override // p000.xhg.C15095l, p000.u3b
        public Set<Map.Entry<K, V>> entries() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f97880b) {
                try {
                    if (this.f97881C == null) {
                        this.f97881C = xhg.m25172r(mo25192c().entries(), this.f97880b);
                    }
                    set = this.f97881C;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // p000.xhg.C15095l, p000.u3b
        public Set<V> get(K key) {
            Set<V> setM25172r;
            synchronized (this.f97880b) {
                setM25172r = xhg.m25172r(mo25192c().get((Object) key), this.f97880b);
            }
            return setM25172r;
        }

        @Override // p000.xhg.C15095l, p000.u3b
        public Set<V> removeAll(@wx1 Object key) {
            Set<V> setRemoveAll;
            synchronized (this.f97880b) {
                setRemoveAll = mo25192c().removeAll(key);
            }
            return setRemoveAll;
        }

        @Override // p000.xhg.C15095l, p000.u3b
        public Set<V> replaceValues(K key, Iterable<? extends V> values) {
            Set<V> setReplaceValues;
            synchronized (this.f97880b) {
                setReplaceValues = mo25192c().replaceValues((Object) key, (Iterable) values);
            }
            return setReplaceValues;
        }
    }

    /* JADX INFO: renamed from: xhg$u */
    public static class C15104u<K, V> extends C15094k<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        public C15104u(SortedMap<K, V> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.xhg.C15094k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedMap<K, V> mo25190c() {
            return (SortedMap) super.mo25190c();
        }

        @Override // java.util.SortedMap
        @wx1
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.f97880b) {
                comparator = mo25187b().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K kFirstKey;
            synchronized (this.f97880b) {
                kFirstKey = mo25187b().firstKey();
            }
            return kFirstKey;
        }

        public SortedMap<K, V> headMap(K toKey) {
            SortedMap<K, V> sortedMapM25174t;
            synchronized (this.f97880b) {
                sortedMapM25174t = xhg.m25174t(mo25187b().headMap(toKey), this.f97880b);
            }
            return sortedMapM25174t;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K kLastKey;
            synchronized (this.f97880b) {
                kLastKey = mo25187b().lastKey();
            }
            return kLastKey;
        }

        public SortedMap<K, V> subMap(K fromKey, K toKey) {
            SortedMap<K, V> sortedMapM25174t;
            synchronized (this.f97880b) {
                sortedMapM25174t = xhg.m25174t(mo25187b().subMap(fromKey, toKey), this.f97880b);
            }
            return sortedMapM25174t;
        }

        public SortedMap<K, V> tailMap(K fromKey) {
            SortedMap<K, V> sortedMapM25174t;
            synchronized (this.f97880b) {
                sortedMapM25174t = xhg.m25174t(mo25187b().tailMap(fromKey), this.f97880b);
            }
            return sortedMapM25174t;
        }
    }

    /* JADX INFO: renamed from: xhg$v */
    public static class C15105v<E> extends C15102s<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        public C15105v(SortedSet<E> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.SortedSet
        @wx1
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.f97880b) {
                comparator = mo25190c().comparator();
            }
            return comparator;
        }

        @Override // p000.xhg.C15102s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedSet<E> mo25192c() {
            return (SortedSet) super.mo25192c();
        }

        @Override // java.util.SortedSet
        public E first() {
            E eFirst;
            synchronized (this.f97880b) {
                eFirst = mo25190c().first();
            }
            return eFirst;
        }

        public SortedSet<E> headSet(E toElement) {
            SortedSet<E> sortedSet;
            synchronized (this.f97880b) {
                sortedSet = xhg.sortedSet(mo25190c().headSet(toElement), this.f97880b);
            }
            return sortedSet;
        }

        @Override // java.util.SortedSet
        public E last() {
            E eLast;
            synchronized (this.f97880b) {
                eLast = mo25190c().last();
            }
            return eLast;
        }

        public SortedSet<E> subSet(E fromElement, E toElement) {
            SortedSet<E> sortedSet;
            synchronized (this.f97880b) {
                sortedSet = xhg.sortedSet(mo25190c().subSet(fromElement, toElement), this.f97880b);
            }
            return sortedSet;
        }

        public SortedSet<E> tailSet(E fromElement) {
            SortedSet<E> sortedSet;
            synchronized (this.f97880b) {
                sortedSet = xhg.sortedSet(mo25190c().tailSet(fromElement), this.f97880b);
            }
            return sortedSet;
        }
    }

    /* JADX INFO: renamed from: xhg$x */
    public static final class C15107x<R, C, V> extends C15099p implements kkg<R, C, V> {

        /* JADX INFO: renamed from: xhg$x$a */
        public class a implements lz6<Map<C, V>, Map<C, V>> {
            public a() {
            }

            @Override // p000.lz6
            public Map<C, V> apply(Map<C, V> t) {
                return xhg.m25164j(t, C15107x.this.f97880b);
            }
        }

        /* JADX INFO: renamed from: xhg$x$b */
        public class b implements lz6<Map<R, V>, Map<R, V>> {
            public b() {
            }

            @Override // p000.lz6
            public Map<R, V> apply(Map<R, V> t) {
                return xhg.m25164j(t, C15107x.this.f97880b);
            }
        }

        public C15107x(kkg<R, C, V> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.xhg.C15099p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public kkg<R, C, V> mo25187b() {
            return (kkg) super.mo25187b();
        }

        @Override // p000.kkg
        public Set<kkg.InterfaceC8439a<R, C, V>> cellSet() {
            Set<kkg.InterfaceC8439a<R, C, V>> setM25172r;
            synchronized (this.f97880b) {
                setM25172r = xhg.m25172r(mo25187b().cellSet(), this.f97880b);
            }
            return setM25172r;
        }

        @Override // p000.kkg
        public void clear() {
            synchronized (this.f97880b) {
                mo25187b().clear();
            }
        }

        @Override // p000.kkg
        public Map<R, V> column(@dgc C columnKey) {
            Map<R, V> mapM25164j;
            synchronized (this.f97880b) {
                mapM25164j = xhg.m25164j(mo25187b().column(columnKey), this.f97880b);
            }
            return mapM25164j;
        }

        @Override // p000.kkg
        public Set<C> columnKeySet() {
            Set<C> setM25172r;
            synchronized (this.f97880b) {
                setM25172r = xhg.m25172r(mo25187b().columnKeySet(), this.f97880b);
            }
            return setM25172r;
        }

        @Override // p000.kkg
        public Map<C, Map<R, V>> columnMap() {
            Map<C, Map<R, V>> mapM25164j;
            synchronized (this.f97880b) {
                mapM25164j = xhg.m25164j(tt9.transformValues(mo25187b().columnMap(), new b()), this.f97880b);
            }
            return mapM25164j;
        }

        @Override // p000.kkg
        public boolean contains(@wx1 Object rowKey, @wx1 Object columnKey) {
            boolean zContains;
            synchronized (this.f97880b) {
                zContains = mo25187b().contains(rowKey, columnKey);
            }
            return zContains;
        }

        @Override // p000.kkg
        public boolean containsColumn(@wx1 Object columnKey) {
            boolean zContainsColumn;
            synchronized (this.f97880b) {
                zContainsColumn = mo25187b().containsColumn(columnKey);
            }
            return zContainsColumn;
        }

        @Override // p000.kkg
        public boolean containsRow(@wx1 Object rowKey) {
            boolean zContainsRow;
            synchronized (this.f97880b) {
                zContainsRow = mo25187b().containsRow(rowKey);
            }
            return zContainsRow;
        }

        @Override // p000.kkg
        public boolean containsValue(@wx1 Object value) {
            boolean zContainsValue;
            synchronized (this.f97880b) {
                zContainsValue = mo25187b().containsValue(value);
            }
            return zContainsValue;
        }

        @Override // p000.kkg
        public boolean equals(@wx1 Object obj) {
            boolean zEquals;
            if (this == obj) {
                return true;
            }
            synchronized (this.f97880b) {
                zEquals = mo25187b().equals(obj);
            }
            return zEquals;
        }

        @Override // p000.kkg
        @wx1
        public V get(@wx1 Object rowKey, @wx1 Object columnKey) {
            V v;
            synchronized (this.f97880b) {
                v = mo25187b().get(rowKey, columnKey);
            }
            return v;
        }

        @Override // p000.kkg
        public int hashCode() {
            int iHashCode;
            synchronized (this.f97880b) {
                iHashCode = mo25187b().hashCode();
            }
            return iHashCode;
        }

        @Override // p000.kkg
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f97880b) {
                zIsEmpty = mo25187b().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // p000.kkg
        @wx1
        public V put(@dgc R rowKey, @dgc C columnKey, @dgc V value) {
            V vPut;
            synchronized (this.f97880b) {
                vPut = mo25187b().put(rowKey, columnKey, value);
            }
            return vPut;
        }

        @Override // p000.kkg
        public void putAll(kkg<? extends R, ? extends C, ? extends V> table) {
            synchronized (this.f97880b) {
                mo25187b().putAll(table);
            }
        }

        @Override // p000.kkg
        @wx1
        public V remove(@wx1 Object rowKey, @wx1 Object columnKey) {
            V vRemove;
            synchronized (this.f97880b) {
                vRemove = mo25187b().remove(rowKey, columnKey);
            }
            return vRemove;
        }

        @Override // p000.kkg
        public Map<C, V> row(@dgc R rowKey) {
            Map<C, V> mapM25164j;
            synchronized (this.f97880b) {
                mapM25164j = xhg.m25164j(mo25187b().row(rowKey), this.f97880b);
            }
            return mapM25164j;
        }

        @Override // p000.kkg
        public Set<R> rowKeySet() {
            Set<R> setM25172r;
            synchronized (this.f97880b) {
                setM25172r = xhg.m25172r(mo25187b().rowKeySet(), this.f97880b);
            }
            return setM25172r;
        }

        @Override // p000.kkg
        public Map<R, Map<C, V>> rowMap() {
            Map<R, Map<C, V>> mapM25164j;
            synchronized (this.f97880b) {
                mapM25164j = xhg.m25164j(tt9.transformValues(mo25187b().rowMap(), new a()), this.f97880b);
            }
            return mapM25164j;
        }

        @Override // p000.kkg
        public int size() {
            int size;
            synchronized (this.f97880b) {
                size = mo25187b().size();
            }
            return size;
        }

        @Override // p000.kkg
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f97880b) {
                collection = xhg.collection(mo25187b().values(), this.f97880b);
            }
            return collection;
        }
    }

    private xhg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Collection<E> collection(Collection<E> collection, @wx1 Object mutex) {
        return new C15089f(collection, mutex);
    }

    /* JADX INFO: renamed from: g */
    public static <K, V> k11<K, V> m25161g(k11<K, V> k11Var, @wx1 Object obj) {
        return ((k11Var instanceof C15088e) || (k11Var instanceof xw7)) ? k11Var : new C15088e(k11Var, obj, null);
    }

    /* JADX INFO: renamed from: h */
    public static <E> Deque<E> m25162h(Deque<E> deque, @wx1 Object mutex) {
        return new C15090g(deque, mutex);
    }

    /* JADX INFO: renamed from: i */
    public static <K, V> j99<K, V> m25163i(j99<K, V> multimap, @wx1 Object mutex) {
        return ((multimap instanceof C15093j) || (multimap instanceof ir0)) ? multimap : new C15093j(multimap, mutex);
    }

    @gdi
    /* JADX INFO: renamed from: j */
    public static <K, V> Map<K, V> m25164j(Map<K, V> map, @wx1 Object mutex) {
        return new C15094k(map, mutex);
    }

    /* JADX INFO: renamed from: k */
    public static <K, V> u3b<K, V> m25165k(u3b<K, V> multimap, @wx1 Object mutex) {
        return ((multimap instanceof C15095l) || (multimap instanceof ir0)) ? multimap : new C15095l(multimap, mutex);
    }

    /* JADX INFO: renamed from: l */
    public static <E> d4b<E> m25166l(d4b<E> multiset, @wx1 Object mutex) {
        return ((multiset instanceof C15096m) || (multiset instanceof vx7)) ? multiset : new C15096m(multiset, mutex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> List<E> list(List<E> list, @wx1 Object mutex) {
        return list instanceof RandomAccess ? new C15101r(list, mutex) : new C15092i(list, mutex);
    }

    @jd7
    /* JADX INFO: renamed from: m */
    public static <K, V> NavigableMap<K, V> m25167m(NavigableMap<K, V> navigableMap) {
        return m25168n(navigableMap, null);
    }

    @jd7
    /* JADX INFO: renamed from: n */
    public static <K, V> NavigableMap<K, V> m25168n(NavigableMap<K, V> navigableMap, @wx1 Object mutex) {
        return new C15097n(navigableMap, mutex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @wx1
    @jd7
    public static <K, V> Map.Entry<K, V> nullableSynchronizedEntry(@wx1 Map.Entry<K, V> entry, @wx1 Object mutex) {
        if (entry == null) {
            return null;
        }
        return new C15091h(entry, mutex);
    }

    @jd7
    /* JADX INFO: renamed from: o */
    public static <E> NavigableSet<E> m25169o(NavigableSet<E> navigableSet) {
        return m25170p(navigableSet, null);
    }

    @jd7
    /* JADX INFO: renamed from: p */
    public static <E> NavigableSet<E> m25170p(NavigableSet<E> navigableSet, @wx1 Object mutex) {
        return new C15098o(navigableSet, mutex);
    }

    /* JADX INFO: renamed from: q */
    public static <E> Queue<E> m25171q(Queue<E> queue, @wx1 Object mutex) {
        return queue instanceof C15100q ? queue : new C15100q(queue, mutex);
    }

    @gdi
    /* JADX INFO: renamed from: r */
    public static <E> Set<E> m25172r(Set<E> set, @wx1 Object mutex) {
        return new C15102s(set, mutex);
    }

    /* JADX INFO: renamed from: s */
    public static <K, V> p6f<K, V> m25173s(p6f<K, V> multimap, @wx1 Object mutex) {
        return ((multimap instanceof C15103t) || (multimap instanceof ir0)) ? multimap : new C15103t(multimap, mutex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> SortedSet<E> sortedSet(SortedSet<E> set, @wx1 Object mutex) {
        return new C15105v(set, mutex);
    }

    /* JADX INFO: renamed from: t */
    public static <K, V> SortedMap<K, V> m25174t(SortedMap<K, V> sortedMap, @wx1 Object mutex) {
        return new C15104u(sortedMap, mutex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Collection<E> typePreservingCollection(Collection<E> collection, @wx1 Object mutex) {
        return collection instanceof SortedSet ? sortedSet((SortedSet) collection, mutex) : collection instanceof Set ? m25172r((Set) collection, mutex) : collection instanceof List ? list((List) collection, mutex) : collection(collection, mutex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Set<E> typePreservingSet(Set<E> set, @wx1 Object mutex) {
        return set instanceof SortedSet ? sortedSet((SortedSet) set, mutex) : m25172r(set, mutex);
    }

    /* JADX INFO: renamed from: u */
    public static <K, V> rvf<K, V> m25175u(rvf<K, V> multimap, @wx1 Object mutex) {
        return multimap instanceof C15106w ? multimap : new C15106w(multimap, mutex);
    }

    /* JADX INFO: renamed from: v */
    public static <R, C, V> kkg<R, C, V> m25176v(kkg<R, C, V> table, @wx1 Object mutex) {
        return new C15107x(table, mutex);
    }

    /* JADX INFO: renamed from: xhg$w */
    public static class C15106w<K, V> extends C15103t<K, V> implements rvf<K, V> {
        private static final long serialVersionUID = 0;

        public C15106w(rvf<K, V> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.xhg.C15103t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public rvf<K, V> mo25192c() {
            return (rvf) super.mo25192c();
        }

        @Override // p000.rvf
        @wx1
        public Comparator<? super V> valueComparator() {
            Comparator<? super V> comparatorValueComparator;
            synchronized (this.f97880b) {
                comparatorValueComparator = mo25192c().valueComparator();
            }
            return comparatorValueComparator;
        }

        @Override // p000.xhg.C15103t, p000.xhg.C15095l, p000.u3b
        public SortedSet<V> get(K key) {
            SortedSet<V> sortedSet;
            synchronized (this.f97880b) {
                sortedSet = xhg.sortedSet(mo25192c().get((Object) key), this.f97880b);
            }
            return sortedSet;
        }

        @Override // p000.xhg.C15103t, p000.xhg.C15095l, p000.u3b
        public SortedSet<V> removeAll(@wx1 Object key) {
            SortedSet<V> sortedSetRemoveAll;
            synchronized (this.f97880b) {
                sortedSetRemoveAll = mo25192c().removeAll(key);
            }
            return sortedSetRemoveAll;
        }

        @Override // p000.xhg.C15103t, p000.xhg.C15095l, p000.u3b
        public SortedSet<V> replaceValues(K key, Iterable<? extends V> values) {
            SortedSet<V> sortedSetReplaceValues;
            synchronized (this.f97880b) {
                sortedSetReplaceValues = mo25192c().replaceValues((Object) key, (Iterable) values);
            }
            return sortedSetReplaceValues;
        }
    }

    /* JADX INFO: renamed from: xhg$c */
    public static class C15086c<K, V> extends C15102s<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: xhg$c$a */
        public class a extends geh<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: xhg$c$a$a, reason: collision with other inner class name */
            public class C16559a extends rs6<K, Collection<V>> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Map.Entry f97860a;

                public C16559a(final Map.Entry val$entry) {
                    this.f97860a = val$entry;
                }

                @Override // p000.rs6, p000.zs6
                /* JADX INFO: renamed from: a */
                public Map.Entry<K, Collection<V>> mo8967m() {
                    return this.f97860a;
                }

                @Override // p000.rs6, java.util.Map.Entry
                public Collection<V> getValue() {
                    return xhg.typePreservingCollection((Collection) this.f97860a.getValue(), C15086c.this.f97880b);
                }
            }

            public a(Iterator backingIterator) {
                super(backingIterator);
            }

            @Override // p000.geh
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> mo2935a(final Map.Entry<K, Collection<V>> entry) {
                return new C16559a(entry);
            }
        }

        public C15086c(Set<Map.Entry<K, Collection<V>>> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.xhg.C15089f, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            boolean zM22791l;
            synchronized (this.f97880b) {
                zM22791l = tt9.m22791l(mo25192c(), o);
            }
            return zM22791l;
        }

        @Override // p000.xhg.C15089f, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> c) {
            boolean zM12261b;
            synchronized (this.f97880b) {
                zM12261b = h82.m12261b(mo25192c(), c);
            }
            return zM12261b;
        }

        @Override // p000.xhg.C15102s, java.util.Collection, java.util.Set
        public boolean equals(@wx1 Object o) {
            boolean zM22396a;
            if (o == this) {
                return true;
            }
            synchronized (this.f97880b) {
                zM22396a = t6f.m22396a(mo25192c(), o);
            }
            return zM22396a;
        }

        @Override // p000.xhg.C15089f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new a(super.iterator());
        }

        @Override // p000.xhg.C15089f, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object o) {
            boolean zM22802w;
            synchronized (this.f97880b) {
                zM22802w = tt9.m22802w(mo25192c(), o);
            }
            return zM22802w;
        }

        @Override // p000.xhg.C15089f, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c) {
            boolean zRemoveAll;
            synchronized (this.f97880b) {
                zRemoveAll = wg8.removeAll(mo25192c().iterator(), c);
            }
            return zRemoveAll;
        }

        @Override // p000.xhg.C15089f, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c) {
            boolean zRetainAll;
            synchronized (this.f97880b) {
                zRetainAll = wg8.retainAll(mo25192c().iterator(), c);
            }
            return zRetainAll;
        }

        @Override // p000.xhg.C15089f, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] objArrM19536f;
            synchronized (this.f97880b) {
                objArrM19536f = pjb.m19536f(mo25192c());
            }
            return objArrM19536f;
        }

        @Override // p000.xhg.C15089f, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f97880b) {
                tArr2 = (T[]) pjb.m19537g(mo25192c(), tArr);
            }
            return tArr2;
        }
    }

    /* JADX INFO: renamed from: xhg$l */
    public static class C15095l<K, V> extends C15099p implements u3b<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c */
        @wx1
        public transient Set<K> f97868c;

        /* JADX INFO: renamed from: d */
        @wx1
        public transient Collection<V> f97869d;

        /* JADX INFO: renamed from: e */
        @wx1
        public transient Collection<Map.Entry<K, V>> f97870e;

        /* JADX INFO: renamed from: f */
        @wx1
        public transient Map<K, Collection<V>> f97871f;

        /* JADX INFO: renamed from: m */
        @wx1
        public transient d4b<K> f97872m;

        public C15095l(u3b<K, V> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.u3b
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map;
            synchronized (this.f97880b) {
                try {
                    if (this.f97871f == null) {
                        this.f97871f = new C15085b(mo25187b().asMap(), this.f97880b);
                    }
                    map = this.f97871f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return map;
        }

        @Override // p000.xhg.C15099p
        /* JADX INFO: renamed from: b */
        public u3b<K, V> mo25187b() {
            return (u3b) super.mo25187b();
        }

        @Override // p000.u3b
        public void clear() {
            synchronized (this.f97880b) {
                mo25187b().clear();
            }
        }

        @Override // p000.u3b
        public boolean containsEntry(@wx1 Object key, @wx1 Object value) {
            boolean zContainsEntry;
            synchronized (this.f97880b) {
                zContainsEntry = mo25187b().containsEntry(key, value);
            }
            return zContainsEntry;
        }

        @Override // p000.u3b
        public boolean containsKey(@wx1 Object key) {
            boolean zContainsKey;
            synchronized (this.f97880b) {
                zContainsKey = mo25187b().containsKey(key);
            }
            return zContainsKey;
        }

        @Override // p000.u3b
        public boolean containsValue(@wx1 Object value) {
            boolean zContainsValue;
            synchronized (this.f97880b) {
                zContainsValue = mo25187b().containsValue(value);
            }
            return zContainsValue;
        }

        @Override // p000.u3b
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.f97880b) {
                try {
                    if (this.f97870e == null) {
                        this.f97870e = xhg.typePreservingCollection(mo25187b().entries(), this.f97880b);
                    }
                    collection = this.f97870e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        @Override // p000.u3b
        public boolean equals(@wx1 Object o) {
            boolean zEquals;
            if (o == this) {
                return true;
            }
            synchronized (this.f97880b) {
                zEquals = mo25187b().equals(o);
            }
            return zEquals;
        }

        public Collection<V> get(@dgc K key) {
            Collection<V> collectionTypePreservingCollection;
            synchronized (this.f97880b) {
                collectionTypePreservingCollection = xhg.typePreservingCollection(mo25187b().get(key), this.f97880b);
            }
            return collectionTypePreservingCollection;
        }

        @Override // p000.u3b
        public int hashCode() {
            int iHashCode;
            synchronized (this.f97880b) {
                iHashCode = mo25187b().hashCode();
            }
            return iHashCode;
        }

        @Override // p000.u3b
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f97880b) {
                zIsEmpty = mo25187b().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // p000.u3b
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f97880b) {
                try {
                    if (this.f97868c == null) {
                        this.f97868c = xhg.typePreservingSet(mo25187b().keySet(), this.f97880b);
                    }
                    set = this.f97868c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // p000.u3b
        public d4b<K> keys() {
            d4b<K> d4bVar;
            synchronized (this.f97880b) {
                try {
                    if (this.f97872m == null) {
                        this.f97872m = xhg.m25166l(mo25187b().keys(), this.f97880b);
                    }
                    d4bVar = this.f97872m;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return d4bVar;
        }

        @Override // p000.u3b
        public boolean put(@dgc K key, @dgc V value) {
            boolean zPut;
            synchronized (this.f97880b) {
                zPut = mo25187b().put(key, value);
            }
            return zPut;
        }

        @Override // p000.u3b
        public boolean putAll(@dgc K key, Iterable<? extends V> values) {
            boolean zPutAll;
            synchronized (this.f97880b) {
                zPutAll = mo25187b().putAll(key, values);
            }
            return zPutAll;
        }

        @Override // p000.u3b
        public boolean remove(@wx1 Object key, @wx1 Object value) {
            boolean zRemove;
            synchronized (this.f97880b) {
                zRemove = mo25187b().remove(key, value);
            }
            return zRemove;
        }

        public Collection<V> removeAll(@wx1 Object key) {
            Collection<V> collectionRemoveAll;
            synchronized (this.f97880b) {
                collectionRemoveAll = mo25187b().removeAll(key);
            }
            return collectionRemoveAll;
        }

        public Collection<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
            Collection<V> collectionReplaceValues;
            synchronized (this.f97880b) {
                collectionReplaceValues = mo25187b().replaceValues(key, values);
            }
            return collectionReplaceValues;
        }

        @Override // p000.u3b
        public int size() {
            int size;
            synchronized (this.f97880b) {
                size = mo25187b().size();
            }
            return size;
        }

        @Override // p000.u3b
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f97880b) {
                try {
                    if (this.f97869d == null) {
                        this.f97869d = xhg.collection(mo25187b().values(), this.f97880b);
                    }
                    collection = this.f97869d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        @Override // p000.u3b
        public boolean putAll(u3b<? extends K, ? extends V> multimap) {
            boolean zPutAll;
            synchronized (this.f97880b) {
                zPutAll = mo25187b().putAll(multimap);
            }
            return zPutAll;
        }
    }

    /* JADX INFO: renamed from: xhg$m */
    public static class C15096m<E> extends C15089f<E> implements d4b<E> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c */
        @wx1
        public transient Set<E> f97873c;

        /* JADX INFO: renamed from: d */
        @wx1
        public transient Set<d4b.InterfaceC4612a<E>> f97874d;

        public C15096m(d4b<E> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // p000.d4b
        public int add(@dgc E e, int n) {
            int iAdd;
            synchronized (this.f97880b) {
                iAdd = mo25187b().add(e, n);
            }
            return iAdd;
        }

        @Override // p000.xhg.C15089f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public d4b<E> mo25192c() {
            return (d4b) super.mo25192c();
        }

        @Override // p000.d4b
        public int count(@wx1 Object o) {
            int iCount;
            synchronized (this.f97880b) {
                iCount = mo25187b().count(o);
            }
            return iCount;
        }

        @Override // p000.d4b
        public Set<E> elementSet() {
            Set<E> set;
            synchronized (this.f97880b) {
                try {
                    if (this.f97873c == null) {
                        this.f97873c = xhg.typePreservingSet(mo25187b().elementSet(), this.f97880b);
                    }
                    set = this.f97873c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // p000.d4b
        public Set<d4b.InterfaceC4612a<E>> entrySet() {
            Set<d4b.InterfaceC4612a<E>> set;
            synchronized (this.f97880b) {
                try {
                    if (this.f97874d == null) {
                        this.f97874d = xhg.typePreservingSet(mo25187b().entrySet(), this.f97880b);
                    }
                    set = this.f97874d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Collection, p000.d4b
        public boolean equals(@wx1 Object o) {
            boolean zEquals;
            if (o == this) {
                return true;
            }
            synchronized (this.f97880b) {
                zEquals = mo25187b().equals(o);
            }
            return zEquals;
        }

        @Override // java.util.Collection, p000.d4b
        public int hashCode() {
            int iHashCode;
            synchronized (this.f97880b) {
                iHashCode = mo25187b().hashCode();
            }
            return iHashCode;
        }

        @Override // p000.d4b
        public int remove(@wx1 Object o, int n) {
            int iRemove;
            synchronized (this.f97880b) {
                iRemove = mo25187b().remove(o, n);
            }
            return iRemove;
        }

        @Override // p000.d4b
        public int setCount(@dgc E element, int count) {
            int count2;
            synchronized (this.f97880b) {
                count2 = mo25187b().setCount(element, count);
            }
            return count2;
        }

        @Override // p000.d4b
        public boolean setCount(@dgc E element, int oldCount, int newCount) {
            boolean count;
            synchronized (this.f97880b) {
                count = mo25187b().setCount(element, oldCount, newCount);
            }
            return count;
        }
    }

    /* JADX INFO: renamed from: xhg$n */
    @jd7
    @gdi
    public static class C15097n<K, V> extends C15104u<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: C */
        @wx1
        public transient NavigableSet<K> f97875C;

        /* JADX INFO: renamed from: f */
        @wx1
        public transient NavigableSet<K> f97876f;

        /* JADX INFO: renamed from: m */
        @wx1
        public transient NavigableMap<K, V> f97877m;

        public C15097n(NavigableMap<K, V> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> ceilingEntry(K key) {
            Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.f97880b) {
                entryNullableSynchronizedEntry = xhg.nullableSynchronizedEntry(mo25183c().ceilingEntry(key), this.f97880b);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @wx1
        public K ceilingKey(K key) {
            K kCeilingKey;
            synchronized (this.f97880b) {
                kCeilingKey = mo25183c().ceilingKey(key);
            }
            return kCeilingKey;
        }

        @Override // p000.xhg.C15104u
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> mo25187b() {
            return (NavigableMap) super.mo25187b();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            synchronized (this.f97880b) {
                try {
                    NavigableSet<K> navigableSet = this.f97876f;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> navigableSetM25170p = xhg.m25170p(mo25183c().descendingKeySet(), this.f97880b);
                    this.f97876f = navigableSetM25170p;
                    return navigableSetM25170p;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            synchronized (this.f97880b) {
                try {
                    NavigableMap<K, V> navigableMap = this.f97877m;
                    if (navigableMap != null) {
                        return navigableMap;
                    }
                    NavigableMap<K, V> navigableMapM25168n = xhg.m25168n(mo25183c().descendingMap(), this.f97880b);
                    this.f97877m = navigableMapM25168n;
                    return navigableMapM25168n;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.f97880b) {
                entryNullableSynchronizedEntry = xhg.nullableSynchronizedEntry(mo25183c().firstEntry(), this.f97880b);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> floorEntry(K key) {
            Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.f97880b) {
                entryNullableSynchronizedEntry = xhg.nullableSynchronizedEntry(mo25183c().floorEntry(key), this.f97880b);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @wx1
        public K floorKey(K key) {
            K kFloorKey;
            synchronized (this.f97880b) {
                kFloorKey = mo25183c().floorKey(key);
            }
            return kFloorKey;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K toKey, boolean inclusive) {
            NavigableMap<K, V> navigableMapM25168n;
            synchronized (this.f97880b) {
                navigableMapM25168n = xhg.m25168n(mo25183c().headMap(toKey, inclusive), this.f97880b);
            }
            return navigableMapM25168n;
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> higherEntry(K key) {
            Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.f97880b) {
                entryNullableSynchronizedEntry = xhg.nullableSynchronizedEntry(mo25183c().higherEntry(key), this.f97880b);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @wx1
        public K higherKey(K key) {
            K kHigherKey;
            synchronized (this.f97880b) {
                kHigherKey = mo25183c().higherKey(key);
            }
            return kHigherKey;
        }

        @Override // p000.xhg.C15094k, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.f97880b) {
                entryNullableSynchronizedEntry = xhg.nullableSynchronizedEntry(mo25183c().lastEntry(), this.f97880b);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> lowerEntry(K key) {
            Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.f97880b) {
                entryNullableSynchronizedEntry = xhg.nullableSynchronizedEntry(mo25183c().lowerEntry(key), this.f97880b);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @wx1
        public K lowerKey(K key) {
            K kLowerKey;
            synchronized (this.f97880b) {
                kLowerKey = mo25183c().lowerKey(key);
            }
            return kLowerKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            synchronized (this.f97880b) {
                try {
                    NavigableSet<K> navigableSet = this.f97875C;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> navigableSetM25170p = xhg.m25170p(mo25183c().navigableKeySet(), this.f97880b);
                    this.f97875C = navigableSetM25170p;
                    return navigableSetM25170p;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.f97880b) {
                entryNullableSynchronizedEntry = xhg.nullableSynchronizedEntry(mo25183c().pollFirstEntry(), this.f97880b);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.f97880b) {
                entryNullableSynchronizedEntry = xhg.nullableSynchronizedEntry(mo25183c().pollLastEntry(), this.f97880b);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
            NavigableMap<K, V> navigableMapM25168n;
            synchronized (this.f97880b) {
                navigableMapM25168n = xhg.m25168n(mo25183c().subMap(fromKey, fromInclusive, toKey, toInclusive), this.f97880b);
            }
            return navigableMapM25168n;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
            NavigableMap<K, V> navigableMapM25168n;
            synchronized (this.f97880b) {
                navigableMapM25168n = xhg.m25168n(mo25183c().tailMap(fromKey, inclusive), this.f97880b);
            }
            return navigableMapM25168n;
        }

        @Override // p000.xhg.C15104u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K toKey) {
            return headMap(toKey, false);
        }

        @Override // p000.xhg.C15104u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K fromKey, K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // p000.xhg.C15104u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K fromKey) {
            return tailMap(fromKey, true);
        }
    }

    /* JADX INFO: renamed from: xhg$o */
    @jd7
    @gdi
    public static class C15098o<E> extends C15105v<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c */
        @wx1
        public transient NavigableSet<E> f97878c;

        public C15098o(NavigableSet<E> delegate, @wx1 Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.NavigableSet
        @wx1
        public E ceiling(E e) {
            E eCeiling;
            synchronized (this.f97880b) {
                eCeiling = mo25187b().ceiling(e);
            }
            return eCeiling;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return mo25187b().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            synchronized (this.f97880b) {
                try {
                    NavigableSet<E> navigableSet = this.f97878c;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<E> navigableSetM25170p = xhg.m25170p(mo25187b().descendingSet(), this.f97880b);
                    this.f97878c = navigableSetM25170p;
                    return navigableSetM25170p;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.xhg.C15105v
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> mo25190c() {
            return (NavigableSet) super.mo25190c();
        }

        @Override // java.util.NavigableSet
        @wx1
        public E floor(E e) {
            E eFloor;
            synchronized (this.f97880b) {
                eFloor = mo25187b().floor(e);
            }
            return eFloor;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E toElement, boolean inclusive) {
            NavigableSet<E> navigableSetM25170p;
            synchronized (this.f97880b) {
                navigableSetM25170p = xhg.m25170p(mo25187b().headSet(toElement, inclusive), this.f97880b);
            }
            return navigableSetM25170p;
        }

        @Override // java.util.NavigableSet
        @wx1
        public E higher(E e) {
            E eHigher;
            synchronized (this.f97880b) {
                eHigher = mo25187b().higher(e);
            }
            return eHigher;
        }

        @Override // java.util.NavigableSet
        @wx1
        public E lower(E e) {
            E eLower;
            synchronized (this.f97880b) {
                eLower = mo25187b().lower(e);
            }
            return eLower;
        }

        @Override // java.util.NavigableSet
        @wx1
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.f97880b) {
                ePollFirst = mo25187b().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.NavigableSet
        @wx1
        public E pollLast() {
            E ePollLast;
            synchronized (this.f97880b) {
                ePollLast = mo25187b().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
            NavigableSet<E> navigableSetM25170p;
            synchronized (this.f97880b) {
                navigableSetM25170p = xhg.m25170p(mo25187b().subSet(fromElement, fromInclusive, toElement, toInclusive), this.f97880b);
            }
            return navigableSetM25170p;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
            NavigableSet<E> navigableSetM25170p;
            synchronized (this.f97880b) {
                navigableSetM25170p = xhg.m25170p(mo25187b().tailSet(fromElement, inclusive), this.f97880b);
            }
            return navigableSetM25170p;
        }

        @Override // p000.xhg.C15105v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E toElement) {
            return headSet(toElement, false);
        }

        @Override // p000.xhg.C15105v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E fromElement) {
            return tailSet(fromElement, true);
        }

        @Override // p000.xhg.C15105v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E fromElement, E toElement) {
            return subSet(fromElement, true, toElement, false);
        }
    }
}
