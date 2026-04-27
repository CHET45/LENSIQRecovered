package p000;

import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l3 */
/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
public abstract class AbstractC8592l3<N, E> implements cbb<N, E> {

    /* JADX INFO: renamed from: l3$a */
    public class a extends AbstractC10743p1<N> {

        /* JADX INFO: renamed from: l3$a$a, reason: collision with other inner class name */
        public class C16463a extends AbstractSet<e25<N>> {
            public C16463a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ e25 lambda$iterator$0(Object obj) {
                return AbstractC8592l3.this.incidentNodes(obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@wx1 Object obj) {
                if (!(obj instanceof e25)) {
                    return false;
                }
                e25<?> e25Var = (e25) obj;
                return a.this.m1b(e25Var) && a.this.nodes().contains(e25Var.nodeU()) && a.this.successors(e25Var.nodeU()).contains(e25Var.nodeV());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<e25<N>> iterator() {
                return wg8.transform(AbstractC8592l3.this.edges().iterator(), new lz6() { // from class: k3
                    @Override // p000.lz6
                    public final Object apply(Object obj) {
                        return this.f52489a.lambda$iterator$0(obj);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return AbstractC8592l3.this.edges().size();
            }
        }

        public a() {
        }

        @Override // p000.gr0, p000.j2i
        public Set<N> adjacentNodes(N node) {
            return AbstractC8592l3.this.adjacentNodes(node);
        }

        @Override // p000.gr0, p000.j2i
        public boolean allowsSelfLoops() {
            return AbstractC8592l3.this.allowsSelfLoops();
        }

        @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
        public Set<e25<N>> edges() {
            return AbstractC8592l3.this.allowsParallelEdges() ? super.edges() : new C16463a();
        }

        @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
        public mx4<N> incidentEdgeOrder() {
            return mx4.unordered();
        }

        @Override // p000.gr0, p000.j2i
        public boolean isDirected() {
            return AbstractC8592l3.this.isDirected();
        }

        @Override // p000.gr0, p000.j2i
        public mx4<N> nodeOrder() {
            return AbstractC8592l3.this.nodeOrder();
        }

        @Override // p000.gr0, p000.j2i
        public Set<N> nodes() {
            return AbstractC8592l3.this.nodes();
        }

        @Override // p000.gr0, p000.f8d, p000.j97
        public Set<N> predecessors(N node) {
            return AbstractC8592l3.this.predecessors((Object) node);
        }

        @Override // p000.gr0, p000.bfg, p000.j97
        public Set<N> successors(N node) {
            return AbstractC8592l3.this.successors((Object) node);
        }
    }

    /* JADX INFO: renamed from: l3$b */
    public class b implements l8d<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f56048a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f56049b;

        public b(final Object val$nodePresent, final Object val$nodeToCheck) {
            this.f56048a = val$nodePresent;
            this.f56049b = val$nodeToCheck;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.l8d
        public boolean apply(E e) {
            return AbstractC8592l3.this.incidentNodes(e).adjacentNode(this.f56048a).equals(this.f56049b);
        }
    }

    private l8d<E> connectedPredicate(final N nodePresent, final N nodeToCheck) {
        return new b(nodePresent, nodeToCheck);
    }

    private static <N, E> Map<E, e25<N>> edgeIncidentNodesMap(final cbb<N, E> network) {
        return tt9.asMap(network.edges(), new lz6() { // from class: j3
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return network.incidentNodes(obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15288a(e25<?> endpoints) {
        return endpoints.isOrdered() == isDirected();
    }

    @Override // p000.cbb
    public Set<E> adjacentEdges(E edge) {
        e25<N> e25VarIncidentNodes = incidentNodes(edge);
        return t6f.difference(t6f.union(incidentEdges(e25VarIncidentNodes.nodeU()), incidentEdges(e25VarIncidentNodes.nodeV())), dy7.m9576of((Object) edge));
    }

    @Override // p000.cbb
    public j97<N> asGraph() {
        return new a();
    }

    /* JADX INFO: renamed from: b */
    public final void m15289b(e25<?> endpoints) {
        v7d.checkNotNull(endpoints);
        v7d.checkArgument(m15288a(endpoints), m97.f60282n);
    }

    @Override // p000.cbb
    public int degree(N node) {
        return isDirected() ? w68.saturatedAdd(inEdges(node).size(), outEdges(node).size()) : w68.saturatedAdd(incidentEdges(node).size(), edgesConnecting(node, node).size());
    }

    @Override // p000.cbb
    @wx1
    public E edgeConnectingOrNull(N nodeU, N nodeV) {
        Set<E> setEdgesConnecting = edgesConnecting(nodeU, nodeV);
        int size = setEdgesConnecting.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return setEdgesConnecting.iterator().next();
        }
        throw new IllegalArgumentException(String.format(m97.f60277i, nodeU, nodeV));
    }

    @Override // p000.cbb
    public Set<E> edgesConnecting(N nodeU, N nodeV) {
        Set<E> setOutEdges = outEdges(nodeU);
        Set<E> setInEdges = inEdges(nodeV);
        return setOutEdges.size() <= setInEdges.size() ? Collections.unmodifiableSet(t6f.filter(setOutEdges, connectedPredicate(nodeU, nodeV))) : Collections.unmodifiableSet(t6f.filter(setInEdges, connectedPredicate(nodeV, nodeU)));
    }

    @Override // p000.cbb
    public final boolean equals(@wx1 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cbb)) {
            return false;
        }
        cbb cbbVar = (cbb) obj;
        return isDirected() == cbbVar.isDirected() && nodes().equals(cbbVar.nodes()) && edgeIncidentNodesMap(this).equals(edgeIncidentNodesMap(cbbVar));
    }

    @Override // p000.cbb
    public boolean hasEdgeConnecting(N nodeU, N nodeV) {
        v7d.checkNotNull(nodeU);
        v7d.checkNotNull(nodeV);
        return nodes().contains(nodeU) && successors((Object) nodeU).contains(nodeV);
    }

    @Override // p000.cbb
    public final int hashCode() {
        return edgeIncidentNodesMap(this).hashCode();
    }

    @Override // p000.cbb
    public int inDegree(N node) {
        return isDirected() ? inEdges(node).size() : degree(node);
    }

    @Override // p000.cbb
    public int outDegree(N node) {
        return isDirected() ? outEdges(node).size() : degree(node);
    }

    public String toString() {
        return "isDirected: " + isDirected() + ", allowsParallelEdges: " + allowsParallelEdges() + ", allowsSelfLoops: " + allowsSelfLoops() + ", nodes: " + nodes() + ", edges: " + edgeIncidentNodesMap(this);
    }

    @Override // p000.cbb
    public boolean hasEdgeConnecting(e25<N> endpoints) {
        v7d.checkNotNull(endpoints);
        if (m15288a(endpoints)) {
            return hasEdgeConnecting(endpoints.nodeU(), endpoints.nodeV());
        }
        return false;
    }

    @Override // p000.cbb
    @wx1
    public E edgeConnectingOrNull(e25<N> endpoints) {
        m15289b(endpoints);
        return edgeConnectingOrNull(endpoints.nodeU(), endpoints.nodeV());
    }

    @Override // p000.cbb
    public Set<E> edgesConnecting(e25<N> endpoints) {
        m15289b(endpoints);
        return edgesConnecting(endpoints.nodeU(), endpoints.nodeV());
    }
}
