package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.ft8;
import p000.ky7;

/* JADX INFO: loaded from: classes5.dex */
public class pod<K, V> extends ky7<K, V> {

    /* JADX INFO: renamed from: a */
    public ft8<K, V> f71551a;

    /* JADX INFO: renamed from: b */
    public Comparator<K> f71552b;

    /* JADX INFO: renamed from: pod$b */
    public static class C11057b<A, B, C> {

        /* JADX INFO: renamed from: a */
        public final List<A> f71553a;

        /* JADX INFO: renamed from: b */
        public final Map<B, C> f71554b;

        /* JADX INFO: renamed from: c */
        public final ky7.C8553a.a<A, B> f71555c;

        /* JADX INFO: renamed from: d */
        public ht8<A, C> f71556d;

        /* JADX INFO: renamed from: e */
        public ht8<A, C> f71557e;

        /* JADX INFO: renamed from: pod$b$a */
        public static class a implements Iterable<b> {

            /* JADX INFO: renamed from: a */
            public long f71558a;

            /* JADX INFO: renamed from: b */
            public final int f71559b;

            /* JADX INFO: renamed from: pod$b$a$a, reason: collision with other inner class name */
            public class C16501a implements Iterator<b> {

                /* JADX INFO: renamed from: a */
                public int f71560a;

                public C16501a() {
                    this.f71560a = a.this.f71559b - 1;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f71560a >= 0;
                }

                @Override // java.util.Iterator
                public void remove() {
                }

                @Override // java.util.Iterator
                public b next() {
                    long j = a.this.f71558a & ((long) (1 << this.f71560a));
                    b bVar = new b();
                    bVar.f71562a = j == 0;
                    bVar.f71563b = (int) Math.pow(2.0d, this.f71560a);
                    this.f71560a--;
                    return bVar;
                }
            }

            public a(int i) {
                int i2 = i + 1;
                int iFloor = (int) Math.floor(Math.log(i2) / Math.log(2.0d));
                this.f71559b = iFloor;
                this.f71558a = (((long) Math.pow(2.0d, iFloor)) - 1) & ((long) i2);
            }

            @Override // java.lang.Iterable
            public Iterator<b> iterator() {
                return new C16501a();
            }
        }

        /* JADX INFO: renamed from: pod$b$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public boolean f71562a;

            /* JADX INFO: renamed from: b */
            public int f71563b;
        }

        private C11057b(List<A> list, Map<B, C> map, ky7.C8553a.a<A, B> aVar) {
            this.f71553a = list;
            this.f71554b = map;
            this.f71555c = aVar;
        }

        private ft8<A, C> buildBalancedTree(int i, int i2) {
            if (i2 == 0) {
                return et8.getInstance();
            }
            if (i2 == 1) {
                A a2 = this.f71553a.get(i);
                return new dt8(a2, getValue(a2), null, null);
            }
            int i3 = i2 / 2;
            int i4 = i + i3;
            ft8<A, C> ft8VarBuildBalancedTree = buildBalancedTree(i, i3);
            ft8<A, C> ft8VarBuildBalancedTree2 = buildBalancedTree(i4 + 1, i3);
            A a3 = this.f71553a.get(i4);
            return new dt8(a3, getValue(a3), ft8VarBuildBalancedTree, ft8VarBuildBalancedTree2);
        }

        public static <A, B, C> pod<A, C> buildFrom(List<A> list, Map<B, C> map, ky7.C8553a.a<A, B> aVar, Comparator<A> comparator) {
            C11057b c11057b = new C11057b(list, map, aVar);
            Collections.sort(list, comparator);
            int size = list.size();
            for (b bVar : new a(list.size())) {
                int i = bVar.f71563b;
                size -= i;
                if (bVar.f71562a) {
                    c11057b.buildPennant(ft8.EnumC5959a.BLACK, i, size);
                } else {
                    c11057b.buildPennant(ft8.EnumC5959a.BLACK, i, size);
                    int i2 = bVar.f71563b;
                    size -= i2;
                    c11057b.buildPennant(ft8.EnumC5959a.RED, i2, size);
                }
            }
            ft8 et8Var = c11057b.f71556d;
            if (et8Var == null) {
                et8Var = et8.getInstance();
            }
            return new pod<>(et8Var, comparator);
        }

        private void buildPennant(ft8.EnumC5959a enumC5959a, int i, int i2) {
            ft8<A, C> ft8VarBuildBalancedTree = buildBalancedTree(i2 + 1, i - 1);
            A a2 = this.f71553a.get(i2);
            ht8<A, C> gt8Var = enumC5959a == ft8.EnumC5959a.RED ? new gt8<>(a2, getValue(a2), null, ft8VarBuildBalancedTree) : new dt8<>(a2, getValue(a2), null, ft8VarBuildBalancedTree);
            if (this.f71556d == null) {
                this.f71556d = gt8Var;
                this.f71557e = gt8Var;
            } else {
                this.f71557e.mo9357c(gt8Var);
                this.f71557e = gt8Var;
            }
        }

        private C getValue(A a2) {
            return this.f71554b.get(this.f71555c.translate(a2));
        }
    }

    public static <A, B, C> pod<A, C> buildFrom(List<A> list, Map<B, C> map, ky7.C8553a.a<A, B> aVar, Comparator<A> comparator) {
        return C11057b.buildFrom(list, map, aVar, comparator);
    }

    public static <A, B> pod<A, B> fromMap(Map<A, B> map, Comparator<A> comparator) {
        return C11057b.buildFrom(new ArrayList(map.keySet()), map, ky7.C8553a.identityTranslator(), comparator);
    }

    private ft8<K, V> getNode(K k) {
        ft8<K, V> left = this.f71551a;
        while (!left.isEmpty()) {
            int iCompare = this.f71552b.compare(k, left.getKey());
            if (iCompare < 0) {
                left = left.getLeft();
            } else {
                if (iCompare == 0) {
                    return left;
                }
                left = left.getRight();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public ft8<K, V> m19670a() {
        return this.f71551a;
    }

    @Override // p000.ky7
    public boolean containsKey(K k) {
        return getNode(k) != null;
    }

    @Override // p000.ky7
    public V get(K k) {
        ft8<K, V> node = getNode(k);
        if (node != null) {
            return node.getValue();
        }
        return null;
    }

    @Override // p000.ky7
    public Comparator<K> getComparator() {
        return this.f71552b;
    }

    @Override // p000.ky7
    public K getMaxKey() {
        return this.f71551a.getMax().getKey();
    }

    @Override // p000.ky7
    public K getMinKey() {
        return this.f71551a.getMin().getKey();
    }

    @Override // p000.ky7
    public K getPredecessorKey(K k) {
        ft8<K, V> left = this.f71551a;
        ft8<K, V> ft8Var = null;
        while (!left.isEmpty()) {
            int iCompare = this.f71552b.compare(k, left.getKey());
            if (iCompare == 0) {
                if (left.getLeft().isEmpty()) {
                    if (ft8Var != null) {
                        return ft8Var.getKey();
                    }
                    return null;
                }
                ft8<K, V> left2 = left.getLeft();
                while (!left2.getRight().isEmpty()) {
                    left2 = left2.getRight();
                }
                return left2.getKey();
            }
            if (iCompare < 0) {
                left = left.getLeft();
            } else {
                ft8Var = left;
                left = left.getRight();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + k);
    }

    @Override // p000.ky7
    public K getSuccessorKey(K k) {
        ft8<K, V> right = this.f71551a;
        ft8<K, V> ft8Var = null;
        while (!right.isEmpty()) {
            int iCompare = this.f71552b.compare(right.getKey(), k);
            if (iCompare == 0) {
                if (right.getRight().isEmpty()) {
                    if (ft8Var != null) {
                        return ft8Var.getKey();
                    }
                    return null;
                }
                ft8<K, V> right2 = right.getRight();
                while (!right2.getLeft().isEmpty()) {
                    right2 = right2.getLeft();
                }
                return right2.getKey();
            }
            if (iCompare < 0) {
                right = right.getRight();
            } else {
                ft8Var = right;
                right = right.getLeft();
            }
        }
        throw new IllegalArgumentException("Couldn't find successor key of non-present key: " + k);
    }

    @Override // p000.ky7
    public void inOrderTraversal(ft8.AbstractC5960b<K, V> abstractC5960b) {
        this.f71551a.inOrderTraversal(abstractC5960b);
    }

    @Override // p000.ky7
    public int indexOf(K k) {
        ft8<K, V> left = this.f71551a;
        int size = 0;
        while (!left.isEmpty()) {
            int iCompare = this.f71552b.compare(k, left.getKey());
            if (iCompare == 0) {
                return size + left.getLeft().size();
            }
            if (iCompare < 0) {
                left = left.getLeft();
            } else {
                size += left.getLeft().size() + 1;
                left = left.getRight();
            }
        }
        return -1;
    }

    @Override // p000.ky7
    public ky7<K, V> insert(K k, V v) {
        return new pod(this.f71551a.insert(k, v, this.f71552b).copy(null, null, ft8.EnumC5959a.BLACK, null, null), this.f71552b);
    }

    @Override // p000.ky7
    public boolean isEmpty() {
        return this.f71551a.isEmpty();
    }

    @Override // p000.ky7, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new my7(this.f71551a, null, this.f71552b, false);
    }

    @Override // p000.ky7
    public Iterator<Map.Entry<K, V>> iteratorFrom(K k) {
        return new my7(this.f71551a, k, this.f71552b, false);
    }

    @Override // p000.ky7
    public ky7<K, V> remove(K k) {
        return !containsKey(k) ? this : new pod(this.f71551a.remove(k, this.f71552b).copy(null, null, ft8.EnumC5959a.BLACK, null, null), this.f71552b);
    }

    @Override // p000.ky7
    public Iterator<Map.Entry<K, V>> reverseIterator() {
        return new my7(this.f71551a, null, this.f71552b, true);
    }

    @Override // p000.ky7
    public Iterator<Map.Entry<K, V>> reverseIteratorFrom(K k) {
        return new my7(this.f71551a, k, this.f71552b, true);
    }

    @Override // p000.ky7
    public int size() {
        return this.f71551a.size();
    }

    public pod(Comparator<K> comparator) {
        this.f71551a = et8.getInstance();
        this.f71552b = comparator;
    }

    private pod(ft8<K, V> ft8Var, Comparator<K> comparator) {
        this.f71551a = ft8Var;
        this.f71552b = comparator;
    }
}
