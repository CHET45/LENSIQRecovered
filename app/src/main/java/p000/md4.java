package p000;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.kx7;
import p000.md4;
import p000.mx4;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public final class md4<N, V> implements l97<N, V> {

    /* JADX INFO: renamed from: e */
    public static final Object f60645e = new Object();

    /* JADX INFO: renamed from: a */
    public final Map<N, Object> f60646a;

    /* JADX INFO: renamed from: b */
    @wx1
    public final List<AbstractC9311f<N>> f60647b;

    /* JADX INFO: renamed from: c */
    public int f60648c;

    /* JADX INFO: renamed from: d */
    public int f60649d;

    /* JADX INFO: renamed from: md4$a */
    public class C9306a extends AbstractSet<N> {

        /* JADX INFO: renamed from: md4$a$a */
        public class a extends AbstractC0012a2<N> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f60651c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Set f60652d;

            public a(final C9306a this$1, final Iterator val$nodeConnections, final Set val$seenNodes) {
                this.f60651c = val$nodeConnections;
                this.f60652d = val$seenNodes;
            }

            @Override // p000.AbstractC0012a2
            @wx1
            public N computeNext() {
                while (this.f60651c.hasNext()) {
                    AbstractC9311f abstractC9311f = (AbstractC9311f) this.f60651c.next();
                    if (this.f60652d.add(abstractC9311f.f60662a)) {
                        return abstractC9311f.f60662a;
                    }
                }
                return m25a();
            }
        }

        public C9306a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object obj) {
            return md4.this.f60646a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return md4.this.f60646a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public quh<N> iterator() {
            return new a(this, md4.this.f60647b.iterator(), new HashSet());
        }
    }

    /* JADX INFO: renamed from: md4$b */
    public class C9307b extends AbstractSet<N> {

        /* JADX INFO: renamed from: md4$b$a */
        public class a extends AbstractC0012a2<N> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f60654c;

            public a(final C9307b this$1, final Iterator val$entries) {
                this.f60654c = val$entries;
            }

            @Override // p000.AbstractC0012a2
            @wx1
            public N computeNext() {
                while (this.f60654c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f60654c.next();
                    if (md4.isPredecessor(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return m25a();
            }
        }

        /* JADX INFO: renamed from: md4$b$b */
        public class b extends AbstractC0012a2<N> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f60655c;

            public b(final C9307b this$1, final Iterator val$nodeConnections) {
                this.f60655c = val$nodeConnections;
            }

            @Override // p000.AbstractC0012a2
            @wx1
            public N computeNext() {
                while (this.f60655c.hasNext()) {
                    AbstractC9311f abstractC9311f = (AbstractC9311f) this.f60655c.next();
                    if (abstractC9311f instanceof AbstractC9311f.a) {
                        return abstractC9311f.f60662a;
                    }
                }
                return m25a();
            }
        }

        public C9307b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object obj) {
            return md4.isPredecessor(md4.this.f60646a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return md4.this.f60648c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public quh<N> iterator() {
            return md4.this.f60647b == null ? new a(this, md4.this.f60646a.entrySet().iterator()) : new b(this, md4.this.f60647b.iterator());
        }
    }

    /* JADX INFO: renamed from: md4$c */
    public class C9308c extends AbstractSet<N> {

        /* JADX INFO: renamed from: md4$c$a */
        public class a extends AbstractC0012a2<N> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f60657c;

            public a(final C9308c this$1, final Iterator val$entries) {
                this.f60657c = val$entries;
            }

            @Override // p000.AbstractC0012a2
            @wx1
            public N computeNext() {
                while (this.f60657c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f60657c.next();
                    if (md4.isSuccessor(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return m25a();
            }
        }

        /* JADX INFO: renamed from: md4$c$b */
        public class b extends AbstractC0012a2<N> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f60658c;

            public b(final C9308c this$1, final Iterator val$nodeConnections) {
                this.f60658c = val$nodeConnections;
            }

            @Override // p000.AbstractC0012a2
            @wx1
            public N computeNext() {
                while (this.f60658c.hasNext()) {
                    AbstractC9311f abstractC9311f = (AbstractC9311f) this.f60658c.next();
                    if (abstractC9311f instanceof AbstractC9311f.b) {
                        return abstractC9311f.f60662a;
                    }
                }
                return m25a();
            }
        }

        public C9308c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object obj) {
            return md4.isSuccessor(md4.this.f60646a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return md4.this.f60649d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public quh<N> iterator() {
            return md4.this.f60647b == null ? new a(this, md4.this.f60646a.entrySet().iterator()) : new b(this, md4.this.f60647b.iterator());
        }
    }

    /* JADX INFO: renamed from: md4$d */
    public class C9309d extends AbstractC0012a2<e25<N>> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Iterator f60659c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AtomicBoolean f60660d;

        public C9309d(final md4 this$0, final Iterator val$resultWithDoubleSelfLoop, final AtomicBoolean val$alreadySeenSelfLoop) {
            this.f60659c = val$resultWithDoubleSelfLoop;
            this.f60660d = val$alreadySeenSelfLoop;
        }

        @Override // p000.AbstractC0012a2
        @wx1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e25<N> computeNext() {
            while (this.f60659c.hasNext()) {
                e25<N> e25Var = (e25) this.f60659c.next();
                if (!e25Var.nodeU().equals(e25Var.nodeV()) || !this.f60660d.getAndSet(true)) {
                    return e25Var;
                }
            }
            return m25a();
        }
    }

    /* JADX INFO: renamed from: md4$e */
    public static /* synthetic */ class C9310e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60661a;

        static {
            int[] iArr = new int[mx4.EnumC9580b.values().length];
            f60661a = iArr;
            try {
                iArr[mx4.EnumC9580b.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60661a[mx4.EnumC9580b.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: md4$f */
    public static abstract class AbstractC9311f<N> {

        /* JADX INFO: renamed from: a */
        public final N f60662a;

        /* JADX INFO: renamed from: md4$f$a */
        public static final class a<N> extends AbstractC9311f<N> {
            public a(N node) {
                super(node);
            }

            public boolean equals(@wx1 Object that) {
                if (that instanceof a) {
                    return this.f60662a.equals(((a) that).f60662a);
                }
                return false;
            }

            public int hashCode() {
                return a.class.hashCode() + this.f60662a.hashCode();
            }
        }

        /* JADX INFO: renamed from: md4$f$b */
        public static final class b<N> extends AbstractC9311f<N> {
            public b(N node) {
                super(node);
            }

            public boolean equals(@wx1 Object that) {
                if (that instanceof b) {
                    return this.f60662a.equals(((b) that).f60662a);
                }
                return false;
            }

            public int hashCode() {
                return b.class.hashCode() + this.f60662a.hashCode();
            }
        }

        public AbstractC9311f(N n) {
            this.f60662a = (N) v7d.checkNotNull(n);
        }
    }

    /* JADX INFO: renamed from: md4$g */
    public static final class C9312g {

        /* JADX INFO: renamed from: a */
        public final Object f60663a;

        public C9312g(Object successorValue) {
            this.f60663a = successorValue;
        }
    }

    private md4(Map<N, Object> adjacentNodeValues, @wx1 List<AbstractC9311f<N>> orderedNodeConnections, int predecessorCount, int successorCount) {
        this.f60646a = (Map) v7d.checkNotNull(adjacentNodeValues);
        this.f60647b = orderedNodeConnections;
        this.f60648c = ab7.m288a(predecessorCount);
        this.f60649d = ab7.m288a(successorCount);
        v7d.checkState(predecessorCount <= adjacentNodeValues.size() && successorCount <= adjacentNodeValues.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPredecessor(@wx1 Object value) {
        return value == f60645e || (value instanceof C9312g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSuccessor(@wx1 Object value) {
        return (value == f60645e || value == null) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static <N, V> md4<N, V> m17240j(mx4<N> incidentEdgeOrder) {
        ArrayList arrayList;
        int i = C9310e.f60661a[incidentEdgeOrder.type().ordinal()];
        if (i == 1) {
            arrayList = null;
        } else {
            if (i != 2) {
                throw new AssertionError(incidentEdgeOrder.type());
            }
            arrayList = new ArrayList();
        }
        return new md4<>(new HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static <N, V> md4<N, V> m17241k(N thisNode, Iterable<e25<N>> incidentEdges, lz6<N, V> successorNodeToValueFn) {
        v7d.checkNotNull(thisNode);
        v7d.checkNotNull(successorNodeToValueFn);
        HashMap map = new HashMap();
        kx7.C8541a c8541aBuilder = kx7.builder();
        int i = 0;
        int i2 = 0;
        for (e25<N> e25Var : incidentEdges) {
            if (e25Var.nodeU().equals(thisNode) && e25Var.nodeV().equals(thisNode)) {
                map.put(thisNode, new C9312g(successorNodeToValueFn.apply(thisNode)));
                c8541aBuilder.add(new AbstractC9311f.a(thisNode));
                c8541aBuilder.add(new AbstractC9311f.b(thisNode));
                i++;
            } else if (e25Var.nodeV().equals(thisNode)) {
                N nNodeU = e25Var.nodeU();
                Object objPut = map.put(nNodeU, f60645e);
                if (objPut != null) {
                    map.put(nNodeU, new C9312g(objPut));
                }
                c8541aBuilder.add(new AbstractC9311f.a(nNodeU));
                i++;
            } else {
                v7d.checkArgument(e25Var.nodeU().equals(thisNode));
                N nNodeV = e25Var.nodeV();
                V vApply = successorNodeToValueFn.apply(nNodeV);
                Object objPut2 = map.put(nNodeV, vApply);
                if (objPut2 != null) {
                    v7d.checkArgument(objPut2 == f60645e);
                    map.put(nNodeV, new C9312g(vApply));
                }
                c8541aBuilder.add(new AbstractC9311f.b(nNodeV));
            }
            i2++;
        }
        return new md4<>(map, c8541aBuilder.build(), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e25 lambda$incidentEdgeIterator$0(Object obj, Object obj2) {
        return e25.ordered(obj2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e25 lambda$incidentEdgeIterator$2(Object obj, AbstractC9311f abstractC9311f) {
        return abstractC9311f instanceof AbstractC9311f.b ? e25.ordered(obj, abstractC9311f.f60662a) : e25.ordered(abstractC9311f.f60662a, obj);
    }

    @Override // p000.l97
    public void addPredecessor(N node, V unused) {
        Map<N, Object> map = this.f60646a;
        Object obj = f60645e;
        Object objPut = map.put(node, obj);
        if (objPut != null) {
            if (objPut instanceof C9312g) {
                this.f60646a.put(node, objPut);
                return;
            } else if (objPut == obj) {
                return;
            } else {
                this.f60646a.put(node, new C9312g(objPut));
            }
        }
        int i = this.f60648c + 1;
        this.f60648c = i;
        ab7.m290c(i);
        List<AbstractC9311f<N>> list = this.f60647b;
        if (list != null) {
            list.add(new AbstractC9311f.a(node));
        }
    }

    @Override // p000.l97
    @wx1
    public V addSuccessor(N n, V v) {
        Object objPut = this.f60646a.put(n, v);
        if (objPut == null) {
            objPut = null;
        } else if (objPut instanceof C9312g) {
            this.f60646a.put(n, new C9312g(v));
            objPut = ((C9312g) objPut).f60663a;
        } else if (objPut == f60645e) {
            this.f60646a.put(n, new C9312g(v));
            objPut = null;
        }
        if (objPut == null) {
            int i = this.f60649d + 1;
            this.f60649d = i;
            ab7.m290c(i);
            List<AbstractC9311f<N>> list = this.f60647b;
            if (list != null) {
                list.add(new AbstractC9311f.b(n));
            }
        }
        if (objPut == null) {
            return null;
        }
        return (V) objPut;
    }

    @Override // p000.l97
    public Set<N> adjacentNodes() {
        return this.f60647b == null ? Collections.unmodifiableSet(this.f60646a.keySet()) : new C9306a();
    }

    @Override // p000.l97
    public Iterator<e25<N>> incidentEdgeIterator(final N thisNode) {
        v7d.checkNotNull(thisNode);
        List<AbstractC9311f<N>> list = this.f60647b;
        return new C9309d(this, list == null ? wg8.concat(wg8.transform(predecessors().iterator(), new lz6() { // from class: jd4
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return md4.lambda$incidentEdgeIterator$0(thisNode, obj);
            }
        }), wg8.transform(successors().iterator(), new lz6() { // from class: kd4
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return e25.ordered(thisNode, obj);
            }
        })) : wg8.transform(list.iterator(), new lz6() { // from class: ld4
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return md4.lambda$incidentEdgeIterator$2(thisNode, (md4.AbstractC9311f) obj);
            }
        }), new AtomicBoolean(false));
    }

    @Override // p000.l97
    public Set<N> predecessors() {
        return new C9307b();
    }

    @Override // p000.l97
    public void removePredecessor(N node) {
        v7d.checkNotNull(node);
        Object obj = this.f60646a.get(node);
        if (obj == f60645e) {
            this.f60646a.remove(node);
        } else if (!(obj instanceof C9312g)) {
            return;
        } else {
            this.f60646a.put(node, ((C9312g) obj).f60663a);
        }
        int i = this.f60648c - 1;
        this.f60648c = i;
        ab7.m288a(i);
        List<AbstractC9311f<N>> list = this.f60647b;
        if (list != null) {
            list.remove(new AbstractC9311f.a(node));
        }
    }

    @Override // p000.l97
    @wx1
    public V removeSuccessor(Object obj) {
        Object obj2;
        v7d.checkNotNull(obj);
        Object obj3 = this.f60646a.get(obj);
        if (obj3 == null || obj3 == (obj2 = f60645e)) {
            obj3 = null;
        } else if (obj3 instanceof C9312g) {
            this.f60646a.put(obj, obj2);
            obj3 = ((C9312g) obj3).f60663a;
        } else {
            this.f60646a.remove(obj);
        }
        if (obj3 != null) {
            int i = this.f60649d - 1;
            this.f60649d = i;
            ab7.m288a(i);
            List<AbstractC9311f<N>> list = this.f60647b;
            if (list != null) {
                list.remove(new AbstractC9311f.b(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return (V) obj3;
    }

    @Override // p000.l97
    public Set<N> successors() {
        return new C9308c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.l97
    @wx1
    public V value(N n) {
        v7d.checkNotNull(n);
        V v = (V) this.f60646a.get(n);
        if (v == f60645e) {
            return null;
        }
        return v instanceof C9312g ? (V) ((C9312g) v).f60663a : v;
    }
}
