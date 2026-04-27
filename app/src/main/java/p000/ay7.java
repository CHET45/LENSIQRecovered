package p000;

import java.util.Map;
import java.util.Set;
import p000.ox7;

/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
@tw7(containerOf = {"N", k95.f53029S4})
public final class ay7<N, E> extends f1g<N, E> {

    /* JADX INFO: renamed from: ay7$a */
    public static class C1662a<N, E> {

        /* JADX INFO: renamed from: a */
        public final c6b<N, E> f12204a;

        public C1662a(dbb<N, E> dbbVar) {
            this.f12204a = (c6b<N, E>) dbbVar.build();
        }

        @op1
        public C1662a<N, E> addEdge(N nodeU, N nodeV, E edge) {
            this.f12204a.addEdge(nodeU, nodeV, edge);
            return this;
        }

        @op1
        public C1662a<N, E> addNode(N node) {
            this.f12204a.addNode(node);
            return this;
        }

        public ay7<N, E> build() {
            return ay7.copyOf(this.f12204a);
        }

        @op1
        public C1662a<N, E> addEdge(e25<N> endpoints, E edge) {
            this.f12204a.addEdge(endpoints, edge);
            return this;
        }
    }

    private ay7(cbb<N, E> network) {
        super(dbb.from(network), getNodeConnections(network), getEdgeToReferenceNode(network));
    }

    private static <N, E> lz6<E, N> adjacentNodeFn(final cbb<N, E> network, final N node) {
        return new lz6() { // from class: yx7
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return ay7.lambda$adjacentNodeFn$2(network, node, obj);
            }
        };
    }

    private static <N, E> hbb<N, E> connectionsOf(cbb<N, E> network, N node) {
        if (!network.isDirected()) {
            Map mapAsMap = tt9.asMap(network.incidentEdges(node), adjacentNodeFn(network, node));
            return network.allowsParallelEdges() ? bsh.m3389c(mapAsMap) : csh.m8673b(mapAsMap);
        }
        Map mapAsMap2 = tt9.asMap(network.inEdges(node), sourceNodeFn(network));
        Map mapAsMap3 = tt9.asMap(network.outEdges(node), targetNodeFn(network));
        int size = network.edgesConnecting(node, node).size();
        return network.allowsParallelEdges() ? nd4.m17854d(mapAsMap2, mapAsMap3, size) : od4.m18582c(mapAsMap2, mapAsMap3, size);
    }

    public static <N, E> ay7<N, E> copyOf(cbb<N, E> network) {
        return network instanceof ay7 ? (ay7) network : new ay7<>(network);
    }

    private static <N, E> Map<E, N> getEdgeToReferenceNode(cbb<N, E> network) {
        ox7.C10705d c10705dBuilder = ox7.builder();
        for (E e : network.edges()) {
            c10705dBuilder.put(e, network.incidentNodes(e).nodeU());
        }
        return c10705dBuilder.buildOrThrow();
    }

    private static <N, E> Map<N, hbb<N, E>> getNodeConnections(cbb<N, E> network) {
        ox7.C10705d c10705dBuilder = ox7.builder();
        for (N n : network.nodes()) {
            c10705dBuilder.put(n, connectionsOf(network, n));
        }
        return c10705dBuilder.buildOrThrow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object lambda$adjacentNodeFn$2(cbb cbbVar, Object obj, Object obj2) {
        return cbbVar.incidentNodes(obj2).adjacentNode(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$sourceNodeFn$0(cbb cbbVar, Object obj) {
        return cbbVar.incidentNodes(obj).source();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$targetNodeFn$1(cbb cbbVar, Object obj) {
        return cbbVar.incidentNodes(obj).target();
    }

    private static <N, E> lz6<E, N> sourceNodeFn(final cbb<N, E> network) {
        return new lz6() { // from class: xx7
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return ay7.lambda$sourceNodeFn$0(network, obj);
            }
        };
    }

    private static <N, E> lz6<E, N> targetNodeFn(final cbb<N, E> network) {
        return new lz6() { // from class: zx7
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return ay7.lambda$targetNodeFn$1(network, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.f1g, p000.cbb
    public /* bridge */ /* synthetic */ Set adjacentNodes(Object node) {
        return super.adjacentNodes(node);
    }

    @Override // p000.f1g, p000.cbb
    public /* bridge */ /* synthetic */ boolean allowsParallelEdges() {
        return super.allowsParallelEdges();
    }

    @Override // p000.f1g, p000.cbb
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    @Override // p000.f1g, p000.cbb
    public /* bridge */ /* synthetic */ mx4 edgeOrder() {
        return super.edgeOrder();
    }

    @Override // p000.f1g, p000.cbb
    public /* bridge */ /* synthetic */ Set edges() {
        return super.edges();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.f1g, p000.AbstractC8592l3, p000.cbb
    public /* bridge */ /* synthetic */ Set edgesConnecting(Object nodeU, Object nodeV) {
        return super.edgesConnecting(nodeU, nodeV);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.f1g, p000.cbb
    public /* bridge */ /* synthetic */ Set inEdges(Object node) {
        return super.inEdges(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.f1g, p000.cbb
    public /* bridge */ /* synthetic */ Set incidentEdges(Object node) {
        return super.incidentEdges(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.f1g, p000.cbb
    public /* bridge */ /* synthetic */ e25 incidentNodes(Object edge) {
        return super.incidentNodes(edge);
    }

    @Override // p000.f1g, p000.cbb
    public /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // p000.f1g, p000.cbb
    public /* bridge */ /* synthetic */ mx4 nodeOrder() {
        return super.nodeOrder();
    }

    @Override // p000.f1g, p000.cbb
    public /* bridge */ /* synthetic */ Set nodes() {
        return super.nodes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.f1g, p000.cbb
    public /* bridge */ /* synthetic */ Set outEdges(Object node) {
        return super.outEdges(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.f1g, p000.cbb, p000.f8d, p000.j97
    public /* bridge */ /* synthetic */ Set predecessors(Object node) {
        return super.predecessors(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.f1g, p000.cbb, p000.bfg, p000.j97
    public /* bridge */ /* synthetic */ Set successors(Object node) {
        return super.successors(node);
    }

    @Override // p000.AbstractC8592l3, p000.cbb
    public hx7<N> asGraph() {
        return new hx7<>(super.asGraph());
    }

    @Deprecated
    public static <N, E> ay7<N, E> copyOf(ay7<N, E> network) {
        return (ay7) v7d.checkNotNull(network);
    }
}
