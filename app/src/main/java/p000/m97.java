package p000;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public final class m97 {

    /* JADX INFO: renamed from: a */
    public static final int f60269a = 2;

    /* JADX INFO: renamed from: b */
    public static final int f60270b = 10;

    /* JADX INFO: renamed from: c */
    public static final int f60271c = 20;

    /* JADX INFO: renamed from: d */
    public static final float f60272d = 1.0f;

    /* JADX INFO: renamed from: e */
    public static final int f60273e = 2;

    /* JADX INFO: renamed from: f */
    public static final String f60274f = "Node %s is not an element of this graph.";

    /* JADX INFO: renamed from: g */
    public static final String f60275g = "Edge %s is not an element of this graph.";

    /* JADX INFO: renamed from: h */
    public static final String f60276h = "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.";

    /* JADX INFO: renamed from: i */
    public static final String f60277i = "Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.";

    /* JADX INFO: renamed from: j */
    public static final String f60278j = "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.";

    /* JADX INFO: renamed from: k */
    public static final String f60279k = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.";

    /* JADX INFO: renamed from: l */
    public static final String f60280l = "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.";

    /* JADX INFO: renamed from: m */
    public static final String f60281m = "Edge %s already exists in the graph.";

    /* JADX INFO: renamed from: n */
    public static final String f60282n = "Mismatch: endpoints' ordering is not compatible with directionality of the graph";

    /* JADX INFO: renamed from: m97$a */
    public enum EnumC9224a {
        EDGE_EXISTS
    }

    private m97() {
    }
}
