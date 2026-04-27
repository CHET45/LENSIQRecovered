package p000;

import p000.hx7;
import p000.mx4;

/* JADX INFO: loaded from: classes5.dex */
@jh4
@w01
@wx4
public final class k97<N> extends AbstractC11247q1<N> {
    private k97(boolean directed) {
        super(directed);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N> k97<N1> cast() {
        return this;
    }

    public static k97<Object> directed() {
        return new k97<>(true);
    }

    public static <N> k97<N> from(j97<N> graph) {
        return new k97(graph.isDirected()).allowsSelfLoops(graph.allowsSelfLoops()).nodeOrder(graph.nodeOrder()).incidentEdgeOrder(graph.incidentEdgeOrder());
    }

    public static k97<Object> undirected() {
        return new k97<>(false);
    }

    /* JADX INFO: renamed from: a */
    public k97<N> m14607a() {
        k97<N> k97Var = new k97<>(this.f72730a);
        k97Var.f72731b = this.f72731b;
        k97Var.f72732c = this.f72732c;
        k97Var.f72734e = this.f72734e;
        k97Var.f72733d = this.f72733d;
        return k97Var;
    }

    @op1
    public k97<N> allowsSelfLoops(boolean allowsSelfLoops) {
        this.f72731b = allowsSelfLoops;
        return this;
    }

    public <N1 extends N> c5b<N1> build() {
        return new c1g(this);
    }

    @op1
    public k97<N> expectedNodeCount(int expectedNodeCount) {
        this.f72734e = z6c.m26593of(Integer.valueOf(ab7.m288a(expectedNodeCount)));
        return this;
    }

    public <N1 extends N> hx7.C7074a<N1> immutable() {
        return new hx7.C7074a<>(cast());
    }

    public <N1 extends N> k97<N1> incidentEdgeOrder(mx4<N1> incidentEdgeOrder) {
        v7d.checkArgument(incidentEdgeOrder.type() == mx4.EnumC9580b.UNORDERED || incidentEdgeOrder.type() == mx4.EnumC9580b.STABLE, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", incidentEdgeOrder);
        k97<N1> k97VarCast = cast();
        k97VarCast.f72733d = (mx4) v7d.checkNotNull(incidentEdgeOrder);
        return k97VarCast;
    }

    public <N1 extends N> k97<N1> nodeOrder(mx4<N1> nodeOrder) {
        k97<N1> k97VarCast = cast();
        k97VarCast.f72732c = (mx4) v7d.checkNotNull(nodeOrder);
        return k97VarCast;
    }
}
