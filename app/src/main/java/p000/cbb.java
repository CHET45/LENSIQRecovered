package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use NetworkBuilder to create a real instance")
@w01
@wx4
public interface cbb<N, E> extends bfg<N>, f8d<N> {
    Set<E> adjacentEdges(E edge);

    Set<N> adjacentNodes(N node);

    boolean allowsParallelEdges();

    boolean allowsSelfLoops();

    j97<N> asGraph();

    int degree(N node);

    @wx1
    E edgeConnectingOrNull(e25<N> endpoints);

    @wx1
    E edgeConnectingOrNull(N nodeU, N nodeV);

    mx4<E> edgeOrder();

    Set<E> edges();

    Set<E> edgesConnecting(e25<N> endpoints);

    Set<E> edgesConnecting(N nodeU, N nodeV);

    boolean equals(@wx1 Object object);

    boolean hasEdgeConnecting(e25<N> endpoints);

    boolean hasEdgeConnecting(N nodeU, N nodeV);

    int hashCode();

    int inDegree(N node);

    Set<E> inEdges(N node);

    Set<E> incidentEdges(N node);

    e25<N> incidentNodes(E edge);

    boolean isDirected();

    mx4<N> nodeOrder();

    Set<N> nodes();

    int outDegree(N node);

    Set<E> outEdges(N node);

    @Override // p000.f8d, p000.j97
    Set<N> predecessors(N node);

    @Override // p000.bfg, p000.j97
    Set<N> successors(N node);
}
