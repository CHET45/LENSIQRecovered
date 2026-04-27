package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public abstract class zr6<N> extends AbstractC10743p1<N> {
    @Override // p000.AbstractC0001a0
    /* JADX INFO: renamed from: a */
    public long mo0a() {
        return mo294d().edges().size();
    }

    @Override // p000.gr0, p000.j2i
    public Set<N> adjacentNodes(N node) {
        return mo294d().adjacentNodes(node);
    }

    @Override // p000.gr0, p000.j2i
    public boolean allowsSelfLoops() {
        return mo294d().allowsSelfLoops();
    }

    /* JADX INFO: renamed from: d */
    public abstract gr0<N> mo294d();

    @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public int degree(N node) {
        return mo294d().degree(node);
    }

    @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public boolean hasEdgeConnecting(N nodeU, N nodeV) {
        return mo294d().hasEdgeConnecting(nodeU, nodeV);
    }

    @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public int inDegree(N node) {
        return mo294d().inDegree(node);
    }

    @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public mx4<N> incidentEdgeOrder() {
        return mo294d().incidentEdgeOrder();
    }

    @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public Set<e25<N>> incidentEdges(N node) {
        return mo294d().incidentEdges(node);
    }

    @Override // p000.gr0, p000.j2i
    public boolean isDirected() {
        return mo294d().isDirected();
    }

    @Override // p000.gr0, p000.j2i
    public mx4<N> nodeOrder() {
        return mo294d().nodeOrder();
    }

    @Override // p000.gr0, p000.j2i
    public Set<N> nodes() {
        return mo294d().nodes();
    }

    @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public int outDegree(N node) {
        return mo294d().outDegree(node);
    }

    @Override // p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public boolean hasEdgeConnecting(e25<N> endpoints) {
        return mo294d().hasEdgeConnecting(endpoints);
    }

    @Override // p000.gr0, p000.f8d, p000.j97
    public Set<N> predecessors(N node) {
        return mo294d().predecessors((Object) node);
    }

    @Override // p000.gr0, p000.bfg, p000.j97
    public Set<N> successors(N node) {
        return mo294d().successors((Object) node);
    }
}
