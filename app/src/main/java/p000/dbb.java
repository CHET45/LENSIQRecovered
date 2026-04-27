package p000;

import p000.ay7;

/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
public final class dbb<N, E> extends AbstractC11247q1<N> {

    /* JADX INFO: renamed from: f */
    public boolean f29201f;

    /* JADX INFO: renamed from: g */
    public mx4<? super E> f29202g;

    /* JADX INFO: renamed from: h */
    public z6c<Integer> f29203h;

    private dbb(boolean directed) {
        super(directed);
        this.f29201f = false;
        this.f29202g = mx4.insertion();
        this.f29203h = z6c.absent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N, E1 extends E> dbb<N1, E1> cast() {
        return this;
    }

    public static dbb<Object, Object> directed() {
        return new dbb<>(true);
    }

    public static <N, E> dbb<N, E> from(cbb<N, E> network) {
        return new dbb(network.isDirected()).allowsParallelEdges(network.allowsParallelEdges()).allowsSelfLoops(network.allowsSelfLoops()).nodeOrder(network.nodeOrder()).edgeOrder(network.edgeOrder());
    }

    public static dbb<Object, Object> undirected() {
        return new dbb<>(false);
    }

    @op1
    public dbb<N, E> allowsParallelEdges(boolean allowsParallelEdges) {
        this.f29201f = allowsParallelEdges;
        return this;
    }

    @op1
    public dbb<N, E> allowsSelfLoops(boolean allowsSelfLoops) {
        this.f72731b = allowsSelfLoops;
        return this;
    }

    public <N1 extends N, E1 extends E> c6b<N1, E1> build() {
        return new d1g(this);
    }

    public <E1 extends E> dbb<N, E1> edgeOrder(mx4<E1> mx4Var) {
        dbb<N, E1> dbbVar = (dbb<N, E1>) cast();
        dbbVar.f29202g = (mx4) v7d.checkNotNull(mx4Var);
        return dbbVar;
    }

    @op1
    public dbb<N, E> expectedEdgeCount(int expectedEdgeCount) {
        this.f29203h = z6c.m26593of(Integer.valueOf(ab7.m288a(expectedEdgeCount)));
        return this;
    }

    @op1
    public dbb<N, E> expectedNodeCount(int expectedNodeCount) {
        this.f72734e = z6c.m26593of(Integer.valueOf(ab7.m288a(expectedNodeCount)));
        return this;
    }

    public <N1 extends N, E1 extends E> ay7.C1662a<N1, E1> immutable() {
        return new ay7.C1662a<>(cast());
    }

    public <N1 extends N> dbb<N1, E> nodeOrder(mx4<N1> mx4Var) {
        dbb<N1, E> dbbVar = (dbb<N1, E>) cast();
        dbbVar.f72732c = (mx4) v7d.checkNotNull(mx4Var);
        return dbbVar;
    }
}
