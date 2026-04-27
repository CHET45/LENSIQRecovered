package p000;

import java.util.Set;

/* JADX INFO: renamed from: p1 */
/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
public abstract class AbstractC10743p1<N> extends AbstractC0001a0<N> implements j97<N> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ int degree(Object node) {
        return super.degree(node);
    }

    @Override // p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ Set edges() {
        return super.edges();
    }

    @Override // p000.j97
    public final boolean equals(@wx1 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j97)) {
            return false;
        }
        j97 j97Var = (j97) obj;
        return isDirected() == j97Var.isDirected() && nodes().equals(j97Var.nodes()) && edges().equals(j97Var.edges());
    }

    @Override // p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(e25 endpoints) {
        return super.hasEdgeConnecting(endpoints);
    }

    @Override // p000.j97
    public final int hashCode() {
        return edges().hashCode();
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
        return "isDirected: " + isDirected() + ", allowsSelfLoops: " + allowsSelfLoops() + ", nodes: " + nodes() + ", edges: " + edges();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(Object nodeU, Object nodeV) {
        return super.hasEdgeConnecting(nodeU, nodeV);
    }
}
