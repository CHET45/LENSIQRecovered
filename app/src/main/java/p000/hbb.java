package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public interface hbb<N, E> {
    void addInEdge(E edge, N node, boolean isSelfLoop);

    void addOutEdge(E edge, N node);

    N adjacentNode(E edge);

    Set<N> adjacentNodes();

    Set<E> edgesConnecting(N node);

    Set<E> inEdges();

    Set<E> incidentEdges();

    Set<E> outEdges();

    Set<N> predecessors();

    @op1
    @wx1
    N removeInEdge(E edge, boolean isSelfLoop);

    @op1
    N removeOutEdge(E edge);

    Set<N> successors();
}
