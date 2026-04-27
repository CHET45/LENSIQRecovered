package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use GraphBuilder to create a real instance")
@w01
@wx4
public interface j97<N> extends gr0<N> {
    @Override // p000.gr0, p000.j2i
    Set<N> adjacentNodes(N node);

    @Override // p000.gr0, p000.j2i
    boolean allowsSelfLoops();

    @Override // p000.gr0
    int degree(N node);

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

    @Override // p000.gr0, p000.j2i
    boolean isDirected();

    @Override // p000.gr0, p000.j2i
    mx4<N> nodeOrder();

    @Override // p000.gr0, p000.j2i
    Set<N> nodes();

    @Override // p000.gr0
    int outDegree(N node);

    @Override // 
    Set<N> predecessors(N node);

    @Override // 
    Set<N> successors(N node);
}
