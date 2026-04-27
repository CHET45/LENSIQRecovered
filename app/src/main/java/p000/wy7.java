package p000;

import java.util.Objects;
import java.util.Set;
import p000.ox7;

/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
@tw7(containerOf = {"N", k95.f53074X4})
public final class wy7<N, V> extends k1g<N, V> {

    /* JADX INFO: renamed from: wy7$a */
    public static class C14832a<N, V> {

        /* JADX INFO: renamed from: a */
        public final e7b<N, V> f95699a;

        public C14832a(k2i<N, V> graphBuilder) {
            this.f95699a = graphBuilder.m14473a().incidentEdgeOrder(mx4.stable()).build();
        }

        @op1
        public C14832a<N, V> addNode(N node) {
            this.f95699a.addNode(node);
            return this;
        }

        public wy7<N, V> build() {
            return wy7.copyOf(this.f95699a);
        }

        @op1
        public C14832a<N, V> putEdgeValue(N nodeU, N nodeV, V value) {
            this.f95699a.putEdgeValue(nodeU, nodeV, value);
            return this;
        }

        @op1
        public C14832a<N, V> putEdgeValue(e25<N> endpoints, V value) {
            this.f95699a.putEdgeValue(endpoints, value);
            return this;
        }
    }

    private wy7(j2i<N, V> graph) {
        super(k2i.from(graph), getNodeConnections(graph), graph.edges().size());
    }

    private static <N, V> l97<N, V> connectionsOf(final j2i<N, V> graph, final N node) {
        lz6 lz6Var = new lz6() { // from class: vy7
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return wy7.lambda$connectionsOf$0(graph, node, obj);
            }
        };
        return graph.isDirected() ? md4.m17241k(node, graph.incidentEdges(node), lz6Var) : ash.m2663c(tt9.asMap(graph.adjacentNodes(node), lz6Var));
    }

    public static <N, V> wy7<N, V> copyOf(j2i<N, V> graph) {
        return graph instanceof wy7 ? (wy7) graph : new wy7<>(graph);
    }

    private static <N, V> ox7<N, l97<N, V>> getNodeConnections(j2i<N, V> graph) {
        ox7.C10705d c10705dBuilder = ox7.builder();
        for (N n : graph.nodes()) {
            c10705dBuilder.put(n, connectionsOf(graph, n));
        }
        return c10705dBuilder.buildOrThrow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$connectionsOf$0(j2i j2iVar, Object obj, Object obj2) {
        Object objEdgeValueOrDefault = j2iVar.edgeValueOrDefault(obj, obj2, null);
        Objects.requireNonNull(objEdgeValueOrDefault);
        return objEdgeValueOrDefault;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.k1g, p000.gr0, p000.j2i
    public /* bridge */ /* synthetic */ Set adjacentNodes(Object node) {
        return super.adjacentNodes(node);
    }

    @Override // p000.k1g, p000.gr0, p000.j2i
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.k1g, p000.j2i
    @wx1
    public /* bridge */ /* synthetic */ Object edgeValueOrDefault(e25 endpoints, @wx1 Object defaultValue) {
        return super.edgeValueOrDefault(endpoints, defaultValue);
    }

    @Override // p000.k1g, p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(e25 endpoints) {
        return super.hasEdgeConnecting(endpoints);
    }

    @Override // p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public mx4<N> incidentEdgeOrder() {
        return mx4.stable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.k1g, p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ Set incidentEdges(Object node) {
        return super.incidentEdges(node);
    }

    @Override // p000.k1g, p000.gr0, p000.j2i
    public /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // p000.k1g, p000.gr0, p000.j2i
    public /* bridge */ /* synthetic */ mx4 nodeOrder() {
        return super.nodeOrder();
    }

    @Override // p000.k1g, p000.gr0, p000.j2i
    public /* bridge */ /* synthetic */ Set nodes() {
        return super.nodes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.k1g, p000.gr0, p000.f8d, p000.j97
    public /* bridge */ /* synthetic */ Set predecessors(Object node) {
        return super.predecessors(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.k1g, p000.gr0, p000.bfg, p000.j97
    public /* bridge */ /* synthetic */ Set successors(Object node) {
        return super.successors(node);
    }

    @Override // p000.AbstractC6710h5, p000.j2i
    public hx7<N> asGraph() {
        return new hx7<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.k1g, p000.j2i
    @wx1
    public /* bridge */ /* synthetic */ Object edgeValueOrDefault(Object nodeU, Object nodeV, @wx1 Object defaultValue) {
        return super.edgeValueOrDefault(nodeU, nodeV, defaultValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.k1g, p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(Object nodeU, Object nodeV) {
        return super.hasEdgeConnecting(nodeU, nodeV);
    }

    @Deprecated
    public static <N, V> wy7<N, V> copyOf(wy7<N, V> graph) {
        return (wy7) v7d.checkNotNull(graph);
    }
}
