package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
public interface j2i<N, V> extends gr0<N> {
    Set<N> adjacentNodes(N node);

    boolean allowsSelfLoops();

    j97<N> asGraph();

    @Override // p000.gr0
    int degree(N node);

    @wx1
    V edgeValueOrDefault(e25<N> endpoints, @wx1 V defaultValue);

    @wx1
    V edgeValueOrDefault(N nodeU, N nodeV, @wx1 V defaultValue);

    @Override // p000.gr0
    Set<e25<N>> edges();

    boolean equals(@wx1 Object object);

    @Override // p000.gr0
    boolean hasEdgeConnecting(e25<N> endpoints);

    @Override // p000.gr0
    boolean hasEdgeConnecting(N nodeU, N nodeV);

    int hashCode();

    @Override // p000.gr0
    int inDegree(N node);

    @Override // p000.gr0
    mx4<N> incidentEdgeOrder();

    @Override // p000.gr0
    Set<e25<N>> incidentEdges(N node);

    boolean isDirected();

    mx4<N> nodeOrder();

    Set<N> nodes();

    @Override // p000.gr0
    int outDegree(N node);

    @Override // p000.gr0, p000.f8d, p000.j97
    Set<N> predecessors(N node);

    @Override // p000.gr0, p000.bfg, p000.j97
    Set<N> successors(N node);
}
