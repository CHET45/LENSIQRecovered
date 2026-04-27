package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public interface gr0<N> extends bfg<N>, f8d<N> {
    Set<N> adjacentNodes(N node);

    boolean allowsSelfLoops();

    int degree(N node);

    Set<e25<N>> edges();

    boolean hasEdgeConnecting(e25<N> endpoints);

    boolean hasEdgeConnecting(N nodeU, N nodeV);

    int inDegree(N node);

    mx4<N> incidentEdgeOrder();

    Set<e25<N>> incidentEdges(N node);

    boolean isDirected();

    mx4<N> nodeOrder();

    Set<N> nodes();

    int outDegree(N node);

    @Override // p000.f8d, p000.j97
    Set<N> predecessors(N node);

    @Override // p000.bfg, p000.j97
    Set<N> successors(N node);
}
