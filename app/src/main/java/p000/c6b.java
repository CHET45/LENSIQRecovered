package p000;

/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
public interface c6b<N, E> extends cbb<N, E> {
    @op1
    boolean addEdge(e25<N> endpoints, E edge);

    @op1
    boolean addEdge(N nodeU, N nodeV, E edge);

    @op1
    boolean addNode(N node);

    @op1
    boolean removeEdge(E edge);

    @op1
    boolean removeNode(N node);
}
