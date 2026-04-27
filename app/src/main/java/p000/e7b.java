package p000;

/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
public interface e7b<N, V> extends j2i<N, V> {
    @op1
    boolean addNode(N node);

    @op1
    @wx1
    V putEdgeValue(e25<N> endpoints, V value);

    @op1
    @wx1
    V putEdgeValue(N nodeU, N nodeV, V value);

    @op1
    @wx1
    V removeEdge(e25<N> endpoints);

    @op1
    @wx1
    V removeEdge(N nodeU, N nodeV);

    @op1
    boolean removeNode(N node);
}
