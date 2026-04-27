package p000;

import p000.m97;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public final class c1g<N> extends zr6<N> implements c5b<N> {

    /* JADX INFO: renamed from: a */
    public final e7b<N, m97.EnumC9224a> f15551a;

    public c1g(AbstractC11247q1<? super N> builder) {
        this.f15551a = new e1g(builder);
    }

    @Override // p000.c5b
    public boolean addNode(N node) {
        return this.f15551a.addNode(node);
    }

    @Override // p000.zr6
    /* JADX INFO: renamed from: d */
    public gr0<N> mo294d() {
        return this.f15551a;
    }

    @Override // p000.c5b
    public boolean putEdge(N nodeU, N nodeV) {
        return this.f15551a.putEdgeValue(nodeU, nodeV, m97.EnumC9224a.EDGE_EXISTS) == null;
    }

    @Override // p000.c5b
    public boolean removeEdge(N nodeU, N nodeV) {
        return this.f15551a.removeEdge(nodeU, nodeV) != null;
    }

    @Override // p000.c5b
    public boolean removeNode(N node) {
        return this.f15551a.removeNode(node);
    }

    @Override // p000.c5b
    public boolean putEdge(e25<N> endpoints) {
        m2c(endpoints);
        return putEdge(endpoints.nodeU(), endpoints.nodeV());
    }

    @Override // p000.c5b
    public boolean removeEdge(e25<N> endpoints) {
        m2c(endpoints);
        return removeEdge(endpoints.nodeU(), endpoints.nodeV());
    }
}
