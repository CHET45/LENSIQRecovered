package p000;

import java.util.Set;
import p000.m97;
import p000.ox7;

/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
@tw7(containerOf = {"N"})
public class hx7<N> extends zr6<N> {

    /* JADX INFO: renamed from: a */
    public final gr0<N> f45185a;

    /* JADX INFO: renamed from: hx7$a */
    public static class C7074a<N> {

        /* JADX INFO: renamed from: a */
        public final c5b<N> f45186a;

        public C7074a(k97<N> graphBuilder) {
            this.f45186a = graphBuilder.m14607a().incidentEdgeOrder(mx4.stable()).build();
        }

        @op1
        public C7074a<N> addNode(N node) {
            this.f45186a.addNode(node);
            return this;
        }

        public hx7<N> build() {
            return hx7.copyOf(this.f45186a);
        }

        @op1
        public C7074a<N> putEdge(N nodeU, N nodeV) {
            this.f45186a.putEdge(nodeU, nodeV);
            return this;
        }

        @op1
        public C7074a<N> putEdge(e25<N> endpoints) {
            this.f45186a.putEdge(endpoints);
            return this;
        }
    }

    public hx7(gr0<N> backingGraph) {
        this.f45185a = backingGraph;
    }

    private static <N> l97<N, m97.EnumC9224a> connectionsOf(j97<N> graph, N node) {
        lz6 lz6VarConstant = p07.constant(m97.EnumC9224a.EDGE_EXISTS);
        return graph.isDirected() ? md4.m17241k(node, graph.incidentEdges(node), lz6VarConstant) : ash.m2663c(tt9.asMap(graph.adjacentNodes(node), lz6VarConstant));
    }

    public static <N> hx7<N> copyOf(j97<N> graph) {
        return graph instanceof hx7 ? (hx7) graph : new hx7<>(new k1g(k97.from(graph), getNodeConnections(graph), graph.edges().size()));
    }

    private static <N> ox7<N, l97<N, m97.EnumC9224a>> getNodeConnections(j97<N> graph) {
        ox7.C10705d c10705dBuilder = ox7.builder();
        for (N n : graph.nodes()) {
            c10705dBuilder.put(n, connectionsOf(graph, n));
        }
        return c10705dBuilder.buildOrThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zr6, p000.gr0, p000.j2i
    public /* bridge */ /* synthetic */ Set adjacentNodes(Object node) {
        return super.adjacentNodes(node);
    }

    @Override // p000.zr6, p000.gr0, p000.j2i
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    @Override // p000.zr6
    /* JADX INFO: renamed from: d */
    public gr0<N> mo294d() {
        return this.f45185a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zr6, p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ int degree(Object node) {
        return super.degree(node);
    }

    @Override // p000.zr6, p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(e25 endpoints) {
        return super.hasEdgeConnecting(endpoints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zr6, p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ int inDegree(Object node) {
        return super.inDegree(node);
    }

    @Override // p000.zr6, p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public mx4<N> incidentEdgeOrder() {
        return mx4.stable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zr6, p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ Set incidentEdges(Object node) {
        return super.incidentEdges(node);
    }

    @Override // p000.zr6, p000.gr0, p000.j2i
    public /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // p000.zr6, p000.gr0, p000.j2i
    public /* bridge */ /* synthetic */ mx4 nodeOrder() {
        return super.nodeOrder();
    }

    @Override // p000.zr6, p000.gr0, p000.j2i
    public /* bridge */ /* synthetic */ Set nodes() {
        return super.nodes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zr6, p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ int outDegree(Object node) {
        return super.outDegree(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zr6, p000.gr0, p000.f8d, p000.j97
    public /* bridge */ /* synthetic */ Set predecessors(Object node) {
        return super.predecessors(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zr6, p000.gr0, p000.bfg, p000.j97
    public /* bridge */ /* synthetic */ Set successors(Object node) {
        return super.successors(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zr6, p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(Object nodeU, Object nodeV) {
        return super.hasEdgeConnecting(nodeU, nodeV);
    }

    @Deprecated
    public static <N> hx7<N> copyOf(hx7<N> graph) {
        return (hx7) v7d.checkNotNull(graph);
    }
}
