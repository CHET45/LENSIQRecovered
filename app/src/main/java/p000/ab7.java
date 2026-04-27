package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
public final class ab7 {

    /* JADX INFO: renamed from: ab7$a */
    public enum EnumC0143a {
        PENDING,
        COMPLETE
    }

    /* JADX INFO: renamed from: ab7$b */
    public static class C0144b<N> extends zr6<N> {

        /* JADX INFO: renamed from: a */
        public final j97<N> f942a;

        /* JADX INFO: renamed from: ab7$b$a */
        public class a extends ez7<N> {
            public a(gr0 graph, Object node) {
                super(graph, node);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ e25 lambda$iterator$0(e25 e25Var) {
                return e25.m9643a(C0144b.this.mo294d(), e25Var.nodeV(), e25Var.nodeU());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<e25<N>> iterator() {
                return wg8.transform(C0144b.this.mo294d().incidentEdges(this.f34541a).iterator(), new lz6() { // from class: bb7
                    @Override // p000.lz6
                    public final Object apply(Object obj) {
                        return this.f13241a.lambda$iterator$0((e25) obj);
                    }
                });
            }
        }

        public C0144b(j97<N> graph) {
            this.f942a = graph;
        }

        @Override // p000.zr6
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public j97<N> mo294d() {
            return this.f942a;
        }

        @Override // p000.zr6, p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
        public boolean hasEdgeConnecting(N nodeU, N nodeV) {
            return mo294d().hasEdgeConnecting(nodeV, nodeU);
        }

        @Override // p000.zr6, p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
        public int inDegree(N node) {
            return mo294d().outDegree(node);
        }

        @Override // p000.zr6, p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
        public Set<e25<N>> incidentEdges(N node) {
            return new a(this, node);
        }

        @Override // p000.zr6, p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
        public int outDegree(N node) {
            return mo294d().inDegree(node);
        }

        @Override // p000.zr6, p000.AbstractC10743p1, p000.AbstractC0001a0, p000.gr0
        public boolean hasEdgeConnecting(e25<N> endpoints) {
            return mo294d().hasEdgeConnecting(ab7.m292e(endpoints));
        }

        @Override // p000.zr6, p000.gr0, p000.f8d, p000.j97
        public Set<N> predecessors(N node) {
            return mo294d().successors((Object) node);
        }

        @Override // p000.zr6, p000.gr0, p000.bfg, p000.j97
        public Set<N> successors(N node) {
            return mo294d().predecessors((Object) node);
        }
    }

    /* JADX INFO: renamed from: ab7$c */
    public static class C0145c<N, E> extends ys6<N, E> {

        /* JADX INFO: renamed from: a */
        public final cbb<N, E> f944a;

        public C0145c(cbb<N, E> network) {
            this.f944a = network;
        }

        @Override // p000.ys6
        /* JADX INFO: renamed from: c */
        public cbb<N, E> mo298c() {
            return this.f944a;
        }

        @Override // p000.ys6, p000.AbstractC8592l3, p000.cbb
        @wx1
        public E edgeConnectingOrNull(N nodeU, N nodeV) {
            return mo298c().edgeConnectingOrNull(nodeV, nodeU);
        }

        @Override // p000.ys6, p000.AbstractC8592l3, p000.cbb
        public Set<E> edgesConnecting(N nodeU, N nodeV) {
            return mo298c().edgesConnecting(nodeV, nodeU);
        }

        @Override // p000.ys6, p000.AbstractC8592l3, p000.cbb
        public boolean hasEdgeConnecting(N nodeU, N nodeV) {
            return mo298c().hasEdgeConnecting(nodeV, nodeU);
        }

        @Override // p000.ys6, p000.AbstractC8592l3, p000.cbb
        public int inDegree(N node) {
            return mo298c().outDegree(node);
        }

        @Override // p000.ys6, p000.cbb
        public Set<E> inEdges(N node) {
            return mo298c().outEdges(node);
        }

        @Override // p000.ys6, p000.cbb
        public e25<N> incidentNodes(E edge) {
            e25<N> e25VarIncidentNodes = mo298c().incidentNodes(edge);
            return e25.m9644b(this.f944a, e25VarIncidentNodes.nodeV(), e25VarIncidentNodes.nodeU());
        }

        @Override // p000.ys6, p000.AbstractC8592l3, p000.cbb
        public int outDegree(N node) {
            return mo298c().inDegree(node);
        }

        @Override // p000.ys6, p000.cbb
        public Set<E> outEdges(N node) {
            return mo298c().inEdges(node);
        }

        @Override // p000.ys6, p000.AbstractC8592l3, p000.cbb
        @wx1
        public E edgeConnectingOrNull(e25<N> endpoints) {
            return mo298c().edgeConnectingOrNull(ab7.m292e(endpoints));
        }

        @Override // p000.ys6, p000.AbstractC8592l3, p000.cbb
        public Set<E> edgesConnecting(e25<N> endpoints) {
            return mo298c().edgesConnecting(ab7.m292e(endpoints));
        }

        @Override // p000.ys6, p000.AbstractC8592l3, p000.cbb
        public boolean hasEdgeConnecting(e25<N> endpoints) {
            return mo298c().hasEdgeConnecting(ab7.m292e(endpoints));
        }

        @Override // p000.ys6, p000.cbb, p000.f8d, p000.j97
        public Set<N> predecessors(N node) {
            return mo298c().successors((Object) node);
        }

        @Override // p000.ys6, p000.cbb, p000.bfg, p000.j97
        public Set<N> successors(N node) {
            return mo298c().predecessors((Object) node);
        }
    }

    /* JADX INFO: renamed from: ab7$d */
    public static class C0146d<N, V> extends bu6<N, V> {

        /* JADX INFO: renamed from: a */
        public final j2i<N, V> f945a;

        public C0146d(j2i<N, V> graph) {
            this.f945a = graph;
        }

        @Override // p000.bu6
        /* JADX INFO: renamed from: e */
        public j2i<N, V> mo300e() {
            return this.f945a;
        }

        @Override // p000.bu6, p000.j2i
        @wx1
        public V edgeValueOrDefault(N nodeU, N nodeV, @wx1 V defaultValue) {
            return mo300e().edgeValueOrDefault(nodeV, nodeU, defaultValue);
        }

        @Override // p000.bu6, p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
        public boolean hasEdgeConnecting(N nodeU, N nodeV) {
            return mo300e().hasEdgeConnecting(nodeV, nodeU);
        }

        @Override // p000.bu6, p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
        public int inDegree(N node) {
            return mo300e().outDegree(node);
        }

        @Override // p000.bu6, p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
        public int outDegree(N node) {
            return mo300e().inDegree(node);
        }

        @Override // p000.bu6, p000.j2i
        @wx1
        public V edgeValueOrDefault(e25<N> endpoints, @wx1 V defaultValue) {
            return mo300e().edgeValueOrDefault(ab7.m292e(endpoints), defaultValue);
        }

        @Override // p000.bu6, p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
        public boolean hasEdgeConnecting(e25<N> endpoints) {
            return mo300e().hasEdgeConnecting(ab7.m292e(endpoints));
        }

        @Override // p000.bu6, p000.gr0, p000.f8d, p000.j97
        public Set<N> predecessors(N node) {
            return mo300e().successors((Object) node);
        }

        @Override // p000.bu6, p000.gr0, p000.bfg, p000.j97
        public Set<N> successors(N node) {
            return mo300e().predecessors((Object) node);
        }
    }

    private ab7() {
    }

    @op1
    /* JADX INFO: renamed from: a */
    public static int m288a(int value) {
        v7d.checkArgument(value >= 0, "Not true that %s is non-negative.", value);
        return value;
    }

    @op1
    /* JADX INFO: renamed from: b */
    public static long m289b(long value) {
        v7d.checkArgument(value >= 0, "Not true that %s is non-negative.", value);
        return value;
    }

    @op1
    /* JADX INFO: renamed from: c */
    public static int m290c(int value) {
        v7d.checkArgument(value > 0, "Not true that %s is positive.", value);
        return value;
    }

    private static boolean canTraverseWithoutReusingEdge(j97<?> graph, Object nextNode, @wx1 Object previousNode) {
        return graph.isDirected() || !okb.equal(previousNode, nextNode);
    }

    public static <N> c5b<N> copyOf(j97<N> j97Var) {
        c5b<N> c5bVar = (c5b<N>) k97.from(j97Var).expectedNodeCount(j97Var.nodes().size()).build();
        Iterator<N> it = j97Var.nodes().iterator();
        while (it.hasNext()) {
            c5bVar.addNode(it.next());
        }
        for (e25<N> e25Var : j97Var.edges()) {
            c5bVar.putEdge(e25Var.nodeU(), e25Var.nodeV());
        }
        return c5bVar;
    }

    @op1
    /* JADX INFO: renamed from: d */
    public static long m291d(long value) {
        v7d.checkArgument(value > 0, "Not true that %s is positive.", value);
        return value;
    }

    /* JADX INFO: renamed from: e */
    public static <N> e25<N> m292e(e25<N> endpoints) {
        return endpoints.isOrdered() ? e25.ordered(endpoints.target(), endpoints.source()) : endpoints;
    }

    public static <N> boolean hasCycle(j97<N> graph) {
        int size = graph.edges().size();
        if (size == 0) {
            return false;
        }
        if (!graph.isDirected() && size >= graph.nodes().size()) {
            return true;
        }
        HashMap mapNewHashMapWithExpectedSize = tt9.newHashMapWithExpectedSize(graph.nodes().size());
        Iterator<N> it = graph.nodes().iterator();
        while (it.hasNext()) {
            if (subgraphHasCycle(graph, mapNewHashMapWithExpectedSize, it.next(), null)) {
                return true;
            }
        }
        return false;
    }

    public static <N> c5b<N> inducedSubgraph(j97<N> j97Var, Iterable<? extends N> iterable) {
        c1g c1gVar = iterable instanceof Collection ? (c5b<N>) k97.from(j97Var).expectedNodeCount(((Collection) iterable).size()).build() : (c5b<N>) k97.from(j97Var).build();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            c1gVar.addNode(it.next());
        }
        for (N n : c1gVar.nodes()) {
            for (N n2 : j97Var.successors((Object) n)) {
                if (c1gVar.nodes().contains(n2)) {
                    c1gVar.putEdge(n, n2);
                }
            }
        }
        return c1gVar;
    }

    public static <N> Set<N> reachableNodes(j97<N> graph, N node) {
        v7d.checkArgument(graph.nodes().contains(node), m97.f60274f, node);
        return dy7.copyOf(vhh.forGraph(graph).breadthFirst(node));
    }

    private static <N> boolean subgraphHasCycle(j97<N> graph, Map<Object, EnumC0143a> visitedNodes, N node, @wx1 N previousNode) {
        EnumC0143a enumC0143a = visitedNodes.get(node);
        if (enumC0143a == EnumC0143a.COMPLETE) {
            return false;
        }
        EnumC0143a enumC0143a2 = EnumC0143a.PENDING;
        if (enumC0143a == enumC0143a2) {
            return true;
        }
        visitedNodes.put(node, enumC0143a2);
        for (N n : graph.successors((Object) node)) {
            if (canTraverseWithoutReusingEdge(graph, n, previousNode) && subgraphHasCycle(graph, visitedNodes, n, node)) {
                return true;
            }
        }
        visitedNodes.put(node, EnumC0143a.COMPLETE);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N> j97<N> transitiveClosure(j97<N> j97Var) {
        c1g c1gVarBuild = k97.from(j97Var).allowsSelfLoops(true).build();
        if (j97Var.isDirected()) {
            for (N n : j97Var.nodes()) {
                Iterator it = reachableNodes(j97Var, n).iterator();
                while (it.hasNext()) {
                    c1gVarBuild.putEdge(n, it.next());
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            for (N n2 : j97Var.nodes()) {
                if (!hashSet.contains(n2)) {
                    Set setReachableNodes = reachableNodes(j97Var, n2);
                    hashSet.addAll(setReachableNodes);
                    int i = 1;
                    for (Object obj : setReachableNodes) {
                        int i2 = i + 1;
                        Iterator it2 = vg8.limit(setReachableNodes, i).iterator();
                        while (it2.hasNext()) {
                            c1gVarBuild.putEdge(obj, it2.next());
                        }
                        i = i2;
                    }
                }
            }
        }
        return c1gVarBuild;
    }

    public static <N> j97<N> transpose(j97<N> graph) {
        return !graph.isDirected() ? graph : graph instanceof C0144b ? ((C0144b) graph).f942a : new C0144b(graph);
    }

    public static <N, V> j2i<N, V> transpose(j2i<N, V> graph) {
        if (!graph.isDirected()) {
            return graph;
        }
        if (graph instanceof C0146d) {
            return ((C0146d) graph).f945a;
        }
        return new C0146d(graph);
    }

    public static <N, V> e7b<N, V> copyOf(j2i<N, V> j2iVar) {
        e7b<N, V> e7bVar = (e7b<N, V>) k2i.from(j2iVar).expectedNodeCount(j2iVar.nodes().size()).build();
        Iterator<N> it = j2iVar.nodes().iterator();
        while (it.hasNext()) {
            e7bVar.addNode(it.next());
        }
        for (e25<N> e25Var : j2iVar.edges()) {
            N nNodeU = e25Var.nodeU();
            N nNodeV = e25Var.nodeV();
            V vEdgeValueOrDefault = j2iVar.edgeValueOrDefault(e25Var.nodeU(), e25Var.nodeV(), null);
            Objects.requireNonNull(vEdgeValueOrDefault);
            e7bVar.putEdgeValue(nNodeU, nNodeV, vEdgeValueOrDefault);
        }
        return e7bVar;
    }

    public static boolean hasCycle(cbb<?, ?> network) {
        if (network.isDirected() || !network.allowsParallelEdges() || network.edges().size() <= network.asGraph().edges().size()) {
            return hasCycle(network.asGraph());
        }
        return true;
    }

    public static <N, E> cbb<N, E> transpose(cbb<N, E> network) {
        if (!network.isDirected()) {
            return network;
        }
        if (network instanceof C0145c) {
            return ((C0145c) network).f944a;
        }
        return new C0145c(network);
    }

    public static <N, V> e7b<N, V> inducedSubgraph(j2i<N, V> j2iVar, Iterable<? extends N> iterable) {
        e1g e1gVar;
        if (iterable instanceof Collection) {
            e1gVar = (e7b<N, V>) k2i.from(j2iVar).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            e1gVar = (e7b<N, V>) k2i.from(j2iVar).build();
        }
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            e1gVar.addNode(it.next());
        }
        for (N n : e1gVar.nodes()) {
            for (N n2 : j2iVar.successors((Object) n)) {
                if (e1gVar.nodes().contains(n2)) {
                    V vEdgeValueOrDefault = j2iVar.edgeValueOrDefault(n, n2, null);
                    Objects.requireNonNull(vEdgeValueOrDefault);
                    e1gVar.putEdgeValue(n, n2, vEdgeValueOrDefault);
                }
            }
        }
        return e1gVar;
    }

    public static <N, E> c6b<N, E> copyOf(cbb<N, E> cbbVar) {
        c6b<N, E> c6bVar = (c6b<N, E>) dbb.from(cbbVar).expectedNodeCount(cbbVar.nodes().size()).expectedEdgeCount(cbbVar.edges().size()).build();
        Iterator<N> it = cbbVar.nodes().iterator();
        while (it.hasNext()) {
            c6bVar.addNode(it.next());
        }
        for (E e : cbbVar.edges()) {
            e25<N> e25VarIncidentNodes = cbbVar.incidentNodes(e);
            c6bVar.addEdge(e25VarIncidentNodes.nodeU(), e25VarIncidentNodes.nodeV(), e);
        }
        return c6bVar;
    }

    public static <N, E> c6b<N, E> inducedSubgraph(cbb<N, E> cbbVar, Iterable<? extends N> iterable) {
        d1g d1gVar;
        if (iterable instanceof Collection) {
            d1gVar = (c6b<N, E>) dbb.from(cbbVar).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            d1gVar = (c6b<N, E>) dbb.from(cbbVar).build();
        }
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            d1gVar.addNode(it.next());
        }
        for (E e : d1gVar.nodes()) {
            for (E e2 : cbbVar.outEdges(e)) {
                N nAdjacentNode = cbbVar.incidentNodes(e2).adjacentNode(e);
                if (d1gVar.nodes().contains(nAdjacentNode)) {
                    d1gVar.addEdge(e, nAdjacentNode, e2);
                }
            }
        }
        return d1gVar;
    }
}
