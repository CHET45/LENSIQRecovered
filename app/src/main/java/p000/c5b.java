package p000;

/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
public interface c5b<N> extends j97<N> {
    @op1
    boolean addNode(N node);

    @op1
    boolean putEdge(e25<N> endpoints);

    @op1
    boolean putEdge(N nodeU, N nodeV);

    @op1
    boolean removeEdge(e25<N> endpoints);

    @op1
    boolean removeEdge(N nodeU, N nodeV);

    @op1
    boolean removeNode(N node);
}
