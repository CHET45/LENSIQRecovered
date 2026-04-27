package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.ft8;
import p000.ky7;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ky7<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: ky7$a */
    public static class C8553a {

        /* JADX INFO: renamed from: a */
        public static final int f55632a = 25;

        /* JADX INFO: renamed from: b */
        public static final a f55633b = new a() { // from class: jy7
            @Override // p000.ky7.C8553a.a
            public final Object translate(Object obj) {
                return ky7.C8553a.lambda$static$0(obj);
            }
        };

        /* JADX INFO: renamed from: ky7$a$a */
        public interface a<C, D> {
            D translate(C c);
        }

        public static <A, B, C> ky7<A, C> buildFrom(List<A> list, Map<B, C> map, a<A, B> aVar, Comparator<A> comparator) {
            return list.size() < 25 ? k70.buildFrom(list, map, aVar, comparator) : pod.buildFrom(list, map, aVar, comparator);
        }

        public static <K, V> ky7<K, V> emptyMap(Comparator<K> comparator) {
            return new k70(comparator);
        }

        public static <A, B> ky7<A, B> fromMap(Map<A, B> map, Comparator<A> comparator) {
            return map.size() < 25 ? k70.fromMap(map, comparator) : pod.fromMap(map, comparator);
        }

        public static <A> a<A, A> identityTranslator() {
            return f55633b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$static$0(Object obj) {
            return obj;
        }
    }

    public abstract boolean containsKey(K k);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky7)) {
            return false;
        }
        ky7 ky7Var = (ky7) obj;
        if (!getComparator().equals(ky7Var.getComparator()) || size() != ky7Var.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = ky7Var.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract V get(K k);

    public abstract Comparator<K> getComparator();

    public abstract K getMaxKey();

    public abstract K getMinKey();

    public abstract K getPredecessorKey(K k);

    public abstract K getSuccessorKey(K k);

    public int hashCode() {
        int iHashCode = getComparator().hashCode();
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }

    public abstract void inOrderTraversal(ft8.AbstractC5960b<K, V> abstractC5960b);

    public abstract int indexOf(K k);

    public abstract ky7<K, V> insert(K k, V v);

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public abstract Iterator<Map.Entry<K, V>> iterator();

    public abstract Iterator<Map.Entry<K, V>> iteratorFrom(K k);

    public abstract ky7<K, V> remove(K k);

    public abstract Iterator<Map.Entry<K, V>> reverseIterator();

    public abstract Iterator<Map.Entry<K, V>> reverseIteratorFrom(K k);

    public abstract int size();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        boolean z = true;
        for (Map.Entry<K, V> entry : this) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c0b.f15433c);
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(c0b.f15434d);
        }
        sb.append("};");
        return sb.toString();
    }
}
