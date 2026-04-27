package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public abstract class ys6<N, E> extends AbstractC8592l3<N, E> {
    @Override // p000.AbstractC8592l3, p000.cbb
    public Set<E> adjacentEdges(E edge) {
        return mo298c().adjacentEdges(edge);
    }

    @Override // p000.cbb
    public Set<N> adjacentNodes(N node) {
        return mo298c().adjacentNodes(node);
    }

    @Override // p000.cbb
    public boolean allowsParallelEdges() {
        return mo298c().allowsParallelEdges();
    }

    @Override // p000.cbb
    public boolean allowsSelfLoops() {
        return mo298c().allowsSelfLoops();
    }

    /* JADX INFO: renamed from: c */
    public abstract cbb<N, E> mo298c();

    @Override // p000.AbstractC8592l3, p000.cbb
    public int degree(N node) {
        return mo298c().degree(node);
    }

    @Override // p000.AbstractC8592l3, p000.cbb
    @wx1
    public E edgeConnectingOrNull(N nodeU, N nodeV) {
        return mo298c().edgeConnectingOrNull(nodeU, nodeV);
    }

    @Override // p000.cbb
    public mx4<E> edgeOrder() {
        return mo298c().edgeOrder();
    }

    @Override // p000.cbb
    public Set<E> edges() {
        return mo298c().edges();
    }

    @Override // p000.AbstractC8592l3, p000.cbb
    public Set<E> edgesConnecting(N nodeU, N nodeV) {
        return mo298c().edgesConnecting(nodeU, nodeV);
    }

    @Override // p000.AbstractC8592l3, p000.cbb
    public boolean hasEdgeConnecting(N nodeU, N nodeV) {
        return mo298c().hasEdgeConnecting(nodeU, nodeV);
    }

    @Override // p000.AbstractC8592l3, p000.cbb
    public int inDegree(N node) {
        return mo298c().inDegree(node);
    }

    @Override // p000.cbb
    public Set<E> inEdges(N node) {
        return mo298c().inEdges(node);
    }

    @Override // p000.cbb
    public Set<E> incidentEdges(N node) {
        return mo298c().incidentEdges(node);
    }

    @Override // p000.cbb
    public e25<N> incidentNodes(E edge) {
        return mo298c().incidentNodes(edge);
    }

    @Override // p000.cbb
    public boolean isDirected() {
        return mo298c().isDirected();
    }

    @Override // p000.cbb
    public mx4<N> nodeOrder() {
        return mo298c().nodeOrder();
    }

    @Override // p000.cbb
    public Set<N> nodes() {
        return mo298c().nodes();
    }

    @Override // p000.AbstractC8592l3, p000.cbb
    public int outDegree(N node) {
        return mo298c().outDegree(node);
    }

    @Override // p000.cbb
    public Set<E> outEdges(N node) {
        return mo298c().outEdges(node);
    }

    @Override // p000.AbstractC8592l3, p000.cbb
    @wx1
    public E edgeConnectingOrNull(e25<N> endpoints) {
        return mo298c().edgeConnectingOrNull(endpoints);
    }

    @Override // p000.AbstractC8592l3, p000.cbb
    public Set<E> edgesConnecting(e25<N> endpoints) {
        return mo298c().edgesConnecting(endpoints);
    }

    @Override // p000.AbstractC8592l3, p000.cbb
    public boolean hasEdgeConnecting(e25<N> endpoints) {
        return mo298c().hasEdgeConnecting(endpoints);
    }

    @Override // p000.cbb, p000.f8d, p000.j97
    public Set<N> predecessors(N node) {
        return mo298c().predecessors((Object) node);
    }

    @Override // p000.cbb, p000.bfg, p000.j97
    public Set<N> successors(N node) {
        return mo298c().successors((Object) node);
    }
}
