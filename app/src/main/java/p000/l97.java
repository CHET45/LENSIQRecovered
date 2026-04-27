package p000;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public interface l97<N, V> {
    void addPredecessor(N node, V value);

    @op1
    @wx1
    V addSuccessor(N node, V value);

    Set<N> adjacentNodes();

    Iterator<e25<N>> incidentEdgeIterator(N thisNode);

    Set<N> predecessors();

    void removePredecessor(N node);

    @op1
    @wx1
    V removeSuccessor(N node);

    Set<N> successors();

    @wx1
    V value(N node);
}
