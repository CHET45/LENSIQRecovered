package p000;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: h5 */
/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
public abstract class AbstractC6710h5<N, V> extends AbstractC0001a0<N> implements j2i<N, V> {

    /* JADX INFO: renamed from: h5$a */
    public class a extends AbstractC10743p1<N> {
        public a() {
        }

        @Override // p000.gr0, p000.j2i
        public Set<N> adjacentNodes(N node) {
            return AbstractC6710h5.this.adjacentNodes(node);
        }

        @Override // p000.gr0, p000.j2i
        public boolean allowsSelfLoops() {
            return AbstractC6710h5.this.allowsSelfLoops();
        }

        @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
        public int degree(N node) {
            return AbstractC6710h5.this.degree(node);
        }

        @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
        public Set<e25<N>> edges() {
            return AbstractC6710h5.this.edges();
        }

        @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
        public int inDegree(N node) {
            return AbstractC6710h5.this.inDegree(node);
        }

        @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
        public mx4<N> incidentEdgeOrder() {
            return AbstractC6710h5.this.incidentEdgeOrder();
        }

        @Override // p000.gr0, p000.j2i
        public boolean isDirected() {
            return AbstractC6710h5.this.isDirected();
        }

        @Override // p000.gr0, p000.j2i
        public mx4<N> nodeOrder() {
            return AbstractC6710h5.this.nodeOrder();
        }

        @Override // p000.gr0, p000.j2i
        public Set<N> nodes() {
            return AbstractC6710h5.this.nodes();
        }

        @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
        public int outDegree(N node) {
            return AbstractC6710h5.this.outDegree(node);
        }

        @Override // p000.gr0, p000.f8d, p000.j97
        public Set<N> predecessors(N node) {
            return AbstractC6710h5.this.predecessors((Object) node);
        }

        @Override // p000.gr0, p000.bfg, p000.j97
        public Set<N> successors(N node) {
            return AbstractC6710h5.this.successors((Object) node);
        }
    }

    private static <N, V> Map<e25<N>, V> edgeValueMap(final j2i<N, V> graph) {
        return tt9.asMap(graph.edges(), new lz6() { // from class: g5
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return AbstractC6710h5.lambda$edgeValueMap$0(graph, (e25) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object lambda$edgeValueMap$0(j2i j2iVar, e25 e25Var) {
        Object objEdgeValueOrDefault = j2iVar.edgeValueOrDefault(e25Var.nodeU(), e25Var.nodeV(), null);
        Objects.requireNonNull(objEdgeValueOrDefault);
        return objEdgeValueOrDefault;
    }

    @Override // p000.j2i
    public j97<N> asGraph() {
        return new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ int degree(Object node) {
        return super.degree(node);
    }

    @Override // p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ Set edges() {
        return super.edges();
    }

    @Override // p000.j2i
    public final boolean equals(@wx1 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j2i)) {
            return false;
        }
        j2i j2iVar = (j2i) obj;
        return isDirected() == j2iVar.isDirected() && nodes().equals(j2iVar.nodes()) && edgeValueMap(this).equals(edgeValueMap(j2iVar));
    }

    @Override // p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(e25 endpoints) {
        return super.hasEdgeConnecting(endpoints);
    }

    @Override // p000.j2i
    public final int hashCode() {
        return edgeValueMap(this).hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ int inDegree(Object node) {
        return super.inDegree(node);
    }

    @Override // p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ mx4 incidentEdgeOrder() {
        return super.incidentEdgeOrder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ Set incidentEdges(Object node) {
        return super.incidentEdges(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ int outDegree(Object node) {
        return super.outDegree(node);
    }

    public String toString() {
        return "isDirected: " + isDirected() + ", allowsSelfLoops: " + allowsSelfLoops() + ", nodes: " + nodes() + ", edges: " + edgeValueMap(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(Object nodeU, Object nodeV) {
        return super.hasEdgeConnecting(nodeU, nodeV);
    }
}
