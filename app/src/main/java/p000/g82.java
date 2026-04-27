package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class g82 {

    /* JADX INFO: renamed from: g82$a */
    public interface InterfaceC6160a<E> {
        void execute(int i, E e);
    }

    /* JADX INFO: renamed from: g82$b */
    public interface InterfaceC6161b<E> {
        boolean evaluate(E e);
    }

    /* JADX INFO: renamed from: g82$c */
    public interface InterfaceC6162c<E1, E2> {
        E2 transform(E1 e1);
    }

    private g82() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static <E> void addAll(Collection<E> collection, Iterator<E> it) {
        if (collection == null || it == null) {
            return;
        }
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static <E> boolean addIgnoreNull(Collection<E> collection, E e) {
        return (collection == null || e == null || !collection.add(e)) ? false : true;
    }

    public static <E> int cardinality(E e, Collection<E> collection) {
        int i = 0;
        if (collection == null) {
            return 0;
        }
        if (collection instanceof Set) {
            return collection.contains(e) ? 1 : 0;
        }
        if (e == null) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    i++;
                }
            }
        } else {
            Iterator<E> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (e.equals(it2.next())) {
                    i++;
                }
            }
        }
        return i;
    }

    public static <E1, E2> Collection<E2> collect(Collection<E1> collection, InterfaceC6162c<E1, E2> interfaceC6162c) {
        ArrayList arrayList = new ArrayList();
        if (collection != null && interfaceC6162c != null) {
            Iterator<E1> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(interfaceC6162c.transform(it.next()));
            }
        }
        return arrayList;
    }

    public static boolean containsAny(Collection collection, Collection collection2) {
        if (collection != null && collection2 != null) {
            if (collection.size() < collection2.size()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (collection2.contains(it.next())) {
                        return true;
                    }
                }
            } else {
                Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    if (collection.contains(it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static <E> int countMatches(Collection<E> collection, InterfaceC6161b<E> interfaceC6161b) {
        int i = 0;
        if (collection != null && interfaceC6161b != null) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                if (interfaceC6161b.evaluate(it.next())) {
                    i++;
                }
            }
        }
        return i;
    }

    public static Collection disjunction(Collection collection, Collection collection2) {
        if (collection == null && collection2 == null) {
            return new ArrayList();
        }
        if (collection == null) {
            return new ArrayList(collection2);
        }
        if (collection2 == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        Map<Object, Integer> cardinalityMap = getCardinalityMap(collection);
        Map<Object, Integer> cardinalityMap2 = getCardinalityMap(collection2);
        HashSet hashSet = new HashSet(collection);
        hashSet.addAll(collection2);
        for (Object obj : hashSet) {
            int iMax = Math.max(getFreq(obj, cardinalityMap), getFreq(obj, cardinalityMap2)) - Math.min(getFreq(obj, cardinalityMap), getFreq(obj, cardinalityMap2));
            for (int i = 0; i < iMax; i++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <E> boolean exists(Collection<E> collection, InterfaceC6161b<E> interfaceC6161b) {
        if (collection != null && interfaceC6161b != null) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                if (interfaceC6161b.evaluate(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <E> void filter(Collection<E> collection, InterfaceC6161b<E> interfaceC6161b) {
        if (collection == null || interfaceC6161b == null) {
            return;
        }
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            if (!interfaceC6161b.evaluate(it.next())) {
                it.remove();
            }
        }
    }

    public static <E> E find(Collection<E> collection, InterfaceC6161b<E> interfaceC6161b) {
        if (collection != null && interfaceC6161b != null) {
            for (E e : collection) {
                if (interfaceC6161b.evaluate(e)) {
                    return e;
                }
            }
        }
        return null;
    }

    public static <E> void forAllDo(Collection<E> collection, InterfaceC6160a<E> interfaceC6160a) {
        if (collection == null || interfaceC6160a == null) {
            return;
        }
        Iterator<E> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            interfaceC6160a.execute(i, it.next());
            i++;
        }
    }

    public static Object get(Object obj, int i) {
        if (obj == null) {
            return null;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative: " + i);
        }
        if (obj instanceof Map) {
            return get(((Map) obj).entrySet().iterator(), i);
        }
        if (obj instanceof List) {
            return ((List) obj).get(i);
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj)[i];
        }
        if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                i--;
                if (i == -1) {
                    return it.next();
                }
                it.next();
            }
            throw new IndexOutOfBoundsException("Entry does not exist: " + i);
        }
        if (obj instanceof Collection) {
            return get(((Collection) obj).iterator(), i);
        }
        if (!(obj instanceof Enumeration)) {
            try {
                return Array.get(obj, i);
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
            }
        }
        Enumeration enumeration = (Enumeration) obj;
        while (enumeration.hasMoreElements()) {
            i--;
            if (i == -1) {
                return enumeration.nextElement();
            }
            enumeration.nextElement();
        }
        throw new IndexOutOfBoundsException("Entry does not exist: " + i);
    }

    public static Map<Object, Integer> getCardinalityMap(Collection collection) {
        HashMap map = new HashMap();
        if (collection == null) {
            return map;
        }
        for (Object obj : collection) {
            Integer num = (Integer) map.get(obj);
            if (num == null) {
                map.put(obj, 1);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
        return map;
    }

    private static int getFreq(Object obj, Map map) {
        Integer num = (Integer) map.get(obj);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static Collection intersection(Collection collection, Collection collection2) {
        if (collection == null || collection2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Map<Object, Integer> cardinalityMap = getCardinalityMap(collection);
        Map<Object, Integer> cardinalityMap2 = getCardinalityMap(collection2);
        HashSet hashSet = new HashSet(collection);
        hashSet.addAll(collection2);
        for (Object obj : hashSet) {
            int iMin = Math.min(getFreq(obj, cardinalityMap), getFreq(obj, cardinalityMap2));
            for (int i = 0; i < iMin; i++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean isEqualCollection(Collection collection, Collection collection2) {
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        Map<Object, Integer> cardinalityMap = getCardinalityMap(collection);
        Map<Object, Integer> cardinalityMap2 = getCardinalityMap(collection2);
        if (cardinalityMap.size() != cardinalityMap2.size()) {
            return false;
        }
        for (Object obj : cardinalityMap.keySet()) {
            if (getFreq(obj, cardinalityMap) != getFreq(obj, cardinalityMap2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotEmpty(Collection collection) {
        return !isEmpty(collection);
    }

    public static boolean isProperSubCollection(Collection collection, Collection collection2) {
        return collection != null && collection2 != null && collection.size() < collection2.size() && isSubCollection(collection, collection2);
    }

    public static boolean isSubCollection(Collection collection, Collection collection2) {
        if (collection == null || collection2 == null) {
            return false;
        }
        Map<Object, Integer> cardinalityMap = getCardinalityMap(collection);
        Map<Object, Integer> cardinalityMap2 = getCardinalityMap(collection2);
        for (Object obj : collection) {
            if (getFreq(obj, cardinalityMap) > getFreq(obj, cardinalityMap2)) {
                return false;
            }
        }
        return true;
    }

    @SafeVarargs
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        ArrayList<E> arrayList = new ArrayList<>();
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    @SafeVarargs
    public static <E> ArrayList<E> newArrayListNotNull(E... eArr) {
        ArrayList<E> arrayList = new ArrayList<>();
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                if (e != null) {
                    arrayList.add(e);
                }
            }
        }
        return arrayList;
    }

    @SafeVarargs
    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> hashSet = new HashSet<>();
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                hashSet.add(e);
            }
        }
        return hashSet;
    }

    @SafeVarargs
    public static <E> HashSet<E> newHashSetNotNull(E... eArr) {
        HashSet<E> hashSet = new HashSet<>();
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                if (e != null) {
                    hashSet.add(e);
                }
            }
        }
        return hashSet;
    }

    @SafeVarargs
    public static <E> LinkedList<E> newLinkedList(E... eArr) {
        LinkedList<E> linkedList = new LinkedList<>();
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                linkedList.add(e);
            }
        }
        return linkedList;
    }

    @SafeVarargs
    public static <E> LinkedList<E> newLinkedListNotNull(E... eArr) {
        LinkedList<E> linkedList = new LinkedList<>();
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                if (e != null) {
                    linkedList.add(e);
                }
            }
        }
        return linkedList;
    }

    public static Collection newSynchronizedCollection(Collection collection) {
        return Collections.synchronizedCollection(collection);
    }

    @SafeVarargs
    public static <E> TreeSet<E> newTreeSet(Comparator<E> comparator, E... eArr) {
        TreeSet<E> treeSet = new TreeSet<>(comparator);
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                treeSet.add(e);
            }
        }
        return treeSet;
    }

    @SafeVarargs
    public static <E> TreeSet<E> newTreeSetNotNull(Comparator<E> comparator, E... eArr) {
        TreeSet<E> treeSet = new TreeSet<>(comparator);
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                if (e != null) {
                    treeSet.add(e);
                }
            }
        }
        return treeSet;
    }

    public static Collection newUnmodifiableCollection(Collection collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @SafeVarargs
    public static <E> List<E> newUnmodifiableList(E... eArr) {
        return Collections.unmodifiableList(newArrayList(eArr));
    }

    @SafeVarargs
    public static <E> List<E> newUnmodifiableListNotNull(E... eArr) {
        return Collections.unmodifiableList(newArrayListNotNull(eArr));
    }

    public static <E> Collection<E> removeAll(Collection<E> collection, Collection<E> collection2) {
        if (collection == null) {
            return new ArrayList();
        }
        if (collection2 == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        for (E e : collection) {
            if (!collection2.contains(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public static <E> Collection<E> retainAll(Collection<E> collection, Collection<E> collection2) {
        if (collection == null || collection2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (E e : collection) {
            if (collection2.contains(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public static <E> Collection<E> select(Collection<E> collection, InterfaceC6161b<E> interfaceC6161b) {
        if (collection == null || interfaceC6161b == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (E e : collection) {
            if (interfaceC6161b.evaluate(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public static <E> Collection<E> selectRejected(Collection<E> collection, InterfaceC6161b<E> interfaceC6161b) {
        if (collection == null || interfaceC6161b == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (E e : collection) {
            if (!interfaceC6161b.evaluate(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public static <T> void shuffle(List<T> list) {
        Collections.shuffle(list);
    }

    public static int size(Object obj) {
        int i = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj).length;
        }
        if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                i++;
                it.next();
            }
        } else {
            if (!(obj instanceof Enumeration)) {
                try {
                    return Array.getLength(obj);
                } catch (IllegalArgumentException unused) {
                    throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
                }
            }
            Enumeration enumeration = (Enumeration) obj;
            while (enumeration.hasMoreElements()) {
                i++;
                enumeration.nextElement();
            }
        }
        return i;
    }

    public static boolean sizeIsEmpty(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj).length == 0;
        }
        if (obj instanceof Iterator) {
            return !((Iterator) obj).hasNext();
        }
        if (obj instanceof Enumeration) {
            return !((Enumeration) obj).hasMoreElements();
        }
        try {
            return Array.getLength(obj) == 0;
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
        }
    }

    public static Collection subtract(Collection collection, Collection collection2) {
        if (collection == null) {
            return new ArrayList();
        }
        if (collection2 == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        return arrayList;
    }

    public static String toString(Collection collection) {
        return collection == null ? "null" : collection.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E1, E2> void transform(Collection<E1> collection, InterfaceC6162c<E1, E2> interfaceC6162c) {
        if (collection == null || interfaceC6162c == 0) {
            return;
        }
        if (collection instanceof List) {
            ListIterator listIterator = ((List) collection).listIterator();
            while (listIterator.hasNext()) {
                listIterator.set(interfaceC6162c.transform(listIterator.next()));
            }
        } else {
            Collection<? extends E1> collectionCollect = collect(collection, interfaceC6162c);
            collection.clear();
            collection.addAll(collectionCollect);
        }
    }

    public static Collection union(Collection collection, Collection collection2) {
        if (collection == null && collection2 == null) {
            return new ArrayList();
        }
        if (collection == null) {
            return new ArrayList(collection2);
        }
        if (collection2 == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        Map<Object, Integer> cardinalityMap = getCardinalityMap(collection);
        Map<Object, Integer> cardinalityMap2 = getCardinalityMap(collection2);
        HashSet hashSet = new HashSet(collection);
        hashSet.addAll(collection2);
        for (Object obj : hashSet) {
            int iMax = Math.max(getFreq(obj, cardinalityMap), getFreq(obj, cardinalityMap2));
            for (int i = 0; i < iMax; i++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <E> void addAll(Collection<E> collection, Enumeration<E> enumeration) {
        if (collection == null || enumeration == null) {
            return;
        }
        while (enumeration.hasMoreElements()) {
            collection.add(enumeration.nextElement());
        }
    }

    public static <E> void addAll(Collection<E> collection, E[] eArr) {
        if (collection == null || eArr == null || eArr.length == 0) {
            return;
        }
        collection.addAll(Arrays.asList(eArr));
    }
}
