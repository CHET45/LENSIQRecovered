package p000;

import p000.mx4;
import p000.wy7;

/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
public final class k2i<N, V> extends AbstractC11247q1<N> {
    private k2i(boolean directed) {
        super(directed);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N, V1 extends V> k2i<N1, V1> cast() {
        return this;
    }

    public static k2i<Object, Object> directed() {
        return new k2i<>(true);
    }

    public static <N, V> k2i<N, V> from(j2i<N, V> graph) {
        return new k2i(graph.isDirected()).allowsSelfLoops(graph.allowsSelfLoops()).nodeOrder(graph.nodeOrder()).incidentEdgeOrder(graph.incidentEdgeOrder());
    }

    public static k2i<Object, Object> undirected() {
        return new k2i<>(false);
    }

    /* JADX INFO: renamed from: a */
    public k2i<N, V> m14473a() {
        k2i<N, V> k2iVar = new k2i<>(this.f72730a);
        k2iVar.f72731b = this.f72731b;
        k2iVar.f72732c = this.f72732c;
        k2iVar.f72734e = this.f72734e;
        k2iVar.f72733d = this.f72733d;
        return k2iVar;
    }

    @op1
    public k2i<N, V> allowsSelfLoops(boolean allowsSelfLoops) {
        this.f72731b = allowsSelfLoops;
        return this;
    }

    public <N1 extends N, V1 extends V> e7b<N1, V1> build() {
        return new e1g(this);
    }

    @op1
    public k2i<N, V> expectedNodeCount(int expectedNodeCount) {
        this.f72734e = z6c.m26593of(Integer.valueOf(ab7.m288a(expectedNodeCount)));
        return this;
    }

    public <N1 extends N, V1 extends V> wy7.C14832a<N1, V1> immutable() {
        return new wy7.C14832a<>(cast());
    }

    public <N1 extends N> k2i<N1, V> incidentEdgeOrder(mx4<N1> mx4Var) {
        v7d.checkArgument(mx4Var.type() == mx4.EnumC9580b.UNORDERED || mx4Var.type() == mx4.EnumC9580b.STABLE, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", mx4Var);
        k2i<N1, V> k2iVar = (k2i<N1, V>) cast();
        k2iVar.f72733d = (mx4) v7d.checkNotNull(mx4Var);
        return k2iVar;
    }

    public <N1 extends N> k2i<N1, V> nodeOrder(mx4<N1> mx4Var) {
        k2i<N1, V> k2iVar = (k2i<N1, V>) cast();
        k2iVar.f72732c = (mx4) v7d.checkNotNull(mx4Var);
        return k2iVar;
    }
}
