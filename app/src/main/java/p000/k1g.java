package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public class k1g<N, V> extends AbstractC6710h5<N, V> {

    /* JADX INFO: renamed from: a */
    public final boolean f52388a;

    /* JADX INFO: renamed from: b */
    public final boolean f52389b;

    /* JADX INFO: renamed from: c */
    public final mx4<N> f52390c;

    /* JADX INFO: renamed from: d */
    public final bt9<N, l97<N, V>> f52391d;

    /* JADX INFO: renamed from: e */
    public long f52392e;

    /* JADX INFO: renamed from: k1g$a */
    public class C8166a extends ez7<N> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ l97 f52393c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8166a(final k1g this$0, gr0 graph, Object node, final l97 val$connections) {
            super(graph, node);
            this.f52393c = val$connections;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<e25<N>> iterator() {
            return this.f52393c.incidentEdgeIterator(this.f34541a);
        }
    }

    public k1g(AbstractC11247q1<? super N> builder) {
        this(builder, builder.f72732c.m17652b(builder.f72734e.mo17830or(10).intValue()), 0L);
    }

    private final l97<N, V> checkedConnections(N node) {
        l97<N, V> l97VarMo3396f = this.f52391d.mo3396f(node);
        if (l97VarMo3396f != null) {
            return l97VarMo3396f;
        }
        v7d.checkNotNull(node);
        throw new IllegalArgumentException("Node " + node + " is not an element of this graph.");
    }

    @wx1
    private final V edgeValueOrDefaultInternal(N nodeU, N nodeV, @wx1 V defaultValue) {
        l97<N, V> l97VarMo3396f = this.f52391d.mo3396f(nodeU);
        V vValue = l97VarMo3396f == null ? null : l97VarMo3396f.value(nodeV);
        return vValue == null ? defaultValue : vValue;
    }

    private final boolean hasEdgeConnectingInternal(N nodeU, N nodeV) {
        l97<N, V> l97VarMo3396f = this.f52391d.mo3396f(nodeU);
        return l97VarMo3396f != null && l97VarMo3396f.successors().contains(nodeV);
    }

    @Override // p000.AbstractC0001a0
    /* JADX INFO: renamed from: a */
    public long mo0a() {
        return this.f52392e;
    }

    @Override // p000.gr0, p000.j2i
    public Set<N> adjacentNodes(N node) {
        return checkedConnections(node).adjacentNodes();
    }

    @Override // p000.gr0, p000.j2i
    public boolean allowsSelfLoops() {
        return this.f52389b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m14449e(@wx1 N node) {
        return this.f52391d.m3395e(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.j2i
    @wx1
    public V edgeValueOrDefault(N n, N n2, @wx1 V v) {
        return (V) edgeValueOrDefaultInternal(v7d.checkNotNull(n), v7d.checkNotNull(n2), v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public boolean hasEdgeConnecting(N nodeU, N nodeV) {
        return hasEdgeConnectingInternal(v7d.checkNotNull(nodeU), v7d.checkNotNull(nodeV));
    }

    @Override // p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public Set<e25<N>> incidentEdges(N node) {
        return new C8166a(this, this, node, checkedConnections(node));
    }

    @Override // p000.gr0, p000.j2i
    public boolean isDirected() {
        return this.f52388a;
    }

    @Override // p000.gr0, p000.j2i
    public mx4<N> nodeOrder() {
        return this.f52390c;
    }

    @Override // p000.gr0, p000.j2i
    public Set<N> nodes() {
        return this.f52391d.m3401k();
    }

    @Override // p000.j2i
    @wx1
    public V edgeValueOrDefault(e25<N> endpoints, @wx1 V defaultValue) {
        m2c(endpoints);
        return edgeValueOrDefaultInternal(endpoints.nodeU(), endpoints.nodeV(), defaultValue);
    }

    @Override // p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public boolean hasEdgeConnecting(e25<N> endpoints) {
        v7d.checkNotNull(endpoints);
        return m1b(endpoints) && hasEdgeConnectingInternal(endpoints.nodeU(), endpoints.nodeV());
    }

    @Override // p000.gr0, p000.f8d, p000.j97
    public Set<N> predecessors(N node) {
        return checkedConnections(node).predecessors();
    }

    @Override // p000.gr0, p000.bfg, p000.j97
    public Set<N> successors(N node) {
        return checkedConnections(node).successors();
    }

    public k1g(AbstractC11247q1<? super N> abstractC11247q1, Map<N, l97<N, V>> map, long j) {
        bt9<N, l97<N, V>> bt9Var;
        this.f52388a = abstractC11247q1.f72730a;
        this.f52389b = abstractC11247q1.f72731b;
        this.f52390c = (mx4<N>) abstractC11247q1.f72732c.m17651a();
        if (map instanceof TreeMap) {
            bt9Var = new it9<>(map);
        } else {
            bt9Var = new bt9<>(map);
        }
        this.f52391d = bt9Var;
        this.f52392e = ab7.m289b(j);
    }
}
