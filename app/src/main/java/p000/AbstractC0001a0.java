package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: a0 */
/* JADX INFO: loaded from: classes5.dex */
@wx4
public abstract class AbstractC0001a0<N> implements gr0<N> {

    /* JADX INFO: renamed from: a0$a */
    public class a extends AbstractSet<e25<N>> {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object obj) {
            if (!(obj instanceof e25)) {
                return false;
            }
            e25<?> e25Var = (e25) obj;
            return AbstractC0001a0.this.m1b(e25Var) && AbstractC0001a0.this.nodes().contains(e25Var.nodeU()) && AbstractC0001a0.this.successors(e25Var.nodeU()).contains(e25Var.nodeV());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object o) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return rd8.saturatedCast(AbstractC0001a0.this.mo0a());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public quh<e25<N>> iterator() {
            return f25.m10481c(AbstractC0001a0.this);
        }
    }

    /* JADX INFO: renamed from: a0$b */
    public class b extends ez7<N> {
        public b(final AbstractC0001a0 this$0, gr0 graph, Object node) {
            super(graph, node);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ e25 lambda$iterator$0(Object obj) {
            return e25.ordered(obj, this.f34541a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ e25 lambda$iterator$1(Object obj) {
            return e25.ordered(this.f34541a, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ e25 lambda$iterator$2(Object obj) {
            return e25.unordered(this.f34541a, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public quh<e25<N>> iterator() {
            return this.f34542b.isDirected() ? wg8.unmodifiableIterator(wg8.concat(wg8.transform(this.f34542b.predecessors((Object) this.f34541a).iterator(), new lz6() { // from class: b0
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return this.f12316a.lambda$iterator$0(obj);
                }
            }), wg8.transform(t6f.difference(this.f34542b.successors((Object) this.f34541a), dy7.m9576of(this.f34541a)).iterator(), new lz6() { // from class: c0
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return this.f15398a.lambda$iterator$1(obj);
                }
            }))) : wg8.unmodifiableIterator(wg8.transform(this.f34542b.adjacentNodes(this.f34541a).iterator(), new lz6() { // from class: d0
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return this.f28126a.lambda$iterator$2(obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a */
    public long mo0a() {
        Iterator<N> it = nodes().iterator();
        long jDegree = 0;
        while (it.hasNext()) {
            jDegree += (long) degree(it.next());
        }
        v7d.checkState((1 & jDegree) == 0);
        return jDegree >>> 1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1b(e25<?> endpoints) {
        return endpoints.isOrdered() == isDirected();
    }

    /* JADX INFO: renamed from: c */
    public final void m2c(e25<?> endpoints) {
        v7d.checkNotNull(endpoints);
        v7d.checkArgument(m1b(endpoints), m97.f60282n);
    }

    @Override // p000.gr0
    public int degree(N node) {
        if (isDirected()) {
            return w68.saturatedAdd(predecessors((Object) node).size(), successors((Object) node).size());
        }
        Set<N> setAdjacentNodes = adjacentNodes(node);
        return w68.saturatedAdd(setAdjacentNodes.size(), (allowsSelfLoops() && setAdjacentNodes.contains(node)) ? 1 : 0);
    }

    @Override // p000.gr0
    public Set<e25<N>> edges() {
        return new a();
    }

    @Override // p000.gr0
    public boolean hasEdgeConnecting(N nodeU, N nodeV) {
        v7d.checkNotNull(nodeU);
        v7d.checkNotNull(nodeV);
        return nodes().contains(nodeU) && successors((Object) nodeU).contains(nodeV);
    }

    @Override // p000.gr0
    public int inDegree(N node) {
        return isDirected() ? predecessors((Object) node).size() : degree(node);
    }

    @Override // p000.gr0
    public mx4<N> incidentEdgeOrder() {
        return mx4.unordered();
    }

    @Override // p000.gr0
    public Set<e25<N>> incidentEdges(N node) {
        v7d.checkNotNull(node);
        v7d.checkArgument(nodes().contains(node), m97.f60274f, node);
        return new b(this, this, node);
    }

    @Override // p000.gr0
    public int outDegree(N node) {
        return isDirected() ? successors((Object) node).size() : degree(node);
    }

    @Override // p000.gr0
    public boolean hasEdgeConnecting(e25<N> endpoints) {
        v7d.checkNotNull(endpoints);
        if (!m1b(endpoints)) {
            return false;
        }
        N nNodeU = endpoints.nodeU();
        return nodes().contains(nNodeU) && successors((Object) nNodeU).contains(endpoints.nodeV());
    }
}
