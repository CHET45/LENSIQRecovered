package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public abstract class bu6<N, V> extends AbstractC6710h5<N, V> {
    @Override // p000.AbstractC0001a0
    /* JADX INFO: renamed from: a */
    public long mo0a() {
        return mo300e().edges().size();
    }

    @Override // p000.gr0, p000.j2i
    public Set<N> adjacentNodes(N node) {
        return mo300e().adjacentNodes(node);
    }

    @Override // p000.gr0, p000.j2i
    public boolean allowsSelfLoops() {
        return mo300e().allowsSelfLoops();
    }

    @Override // p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public int degree(N node) {
        return mo300e().degree(node);
    }

    /* JADX INFO: renamed from: e */
    public abstract j2i<N, V> mo300e();

    @wx1
    public V edgeValueOrDefault(N nodeU, N nodeV, @wx1 V defaultValue) {
        return mo300e().edgeValueOrDefault(nodeU, nodeV, defaultValue);
    }

    @Override // p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public boolean hasEdgeConnecting(N nodeU, N nodeV) {
        return mo300e().hasEdgeConnecting(nodeU, nodeV);
    }

    @Override // p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public int inDegree(N node) {
        return mo300e().inDegree(node);
    }

    @Override // p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public mx4<N> incidentEdgeOrder() {
        return mo300e().incidentEdgeOrder();
    }

    @Override // p000.gr0, p000.j2i
    public boolean isDirected() {
        return mo300e().isDirected();
    }

    @Override // p000.gr0, p000.j2i
    public mx4<N> nodeOrder() {
        return mo300e().nodeOrder();
    }

    @Override // p000.gr0, p000.j2i
    public Set<N> nodes() {
        return mo300e().nodes();
    }

    @Override // p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public int outDegree(N node) {
        return mo300e().outDegree(node);
    }

    @wx1
    public V edgeValueOrDefault(e25<N> endpoints, @wx1 V defaultValue) {
        return mo300e().edgeValueOrDefault(endpoints, defaultValue);
    }

    @Override // p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public boolean hasEdgeConnecting(e25<N> endpoints) {
        return mo300e().hasEdgeConnecting(endpoints);
    }

    @Override // p000.gr0, p000.f8d, p000.j97
    public Set<N> predecessors(N node) {
        return mo300e().predecessors((Object) node);
    }

    @Override // p000.gr0, p000.bfg, p000.j97
    public Set<N> successors(N node) {
        return mo300e().successors((Object) node);
    }
}
