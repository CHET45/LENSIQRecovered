package p000;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public abstract class ez7<N> extends AbstractSet<e25<N>> {

    /* JADX INFO: renamed from: a */
    public final N f34541a;

    /* JADX INFO: renamed from: b */
    public final gr0<N> f34542b;

    public ez7(gr0<N> graph, N node) {
        this.f34542b = graph;
        this.f34541a = node;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@wx1 Object obj) {
        if (!(obj instanceof e25)) {
            return false;
        }
        e25 e25Var = (e25) obj;
        if (this.f34542b.isDirected()) {
            if (!e25Var.isOrdered()) {
                return false;
            }
            Object objSource = e25Var.source();
            Object objTarget = e25Var.target();
            return (this.f34541a.equals(objSource) && this.f34542b.successors((Object) this.f34541a).contains(objTarget)) || (this.f34541a.equals(objTarget) && this.f34542b.predecessors((Object) this.f34541a).contains(objSource));
        }
        if (e25Var.isOrdered()) {
            return false;
        }
        Set<N> setAdjacentNodes = this.f34542b.adjacentNodes(this.f34541a);
        Object objNodeU = e25Var.nodeU();
        Object objNodeV = e25Var.nodeV();
        return (this.f34541a.equals(objNodeV) && setAdjacentNodes.contains(objNodeU)) || (this.f34541a.equals(objNodeU) && setAdjacentNodes.contains(objNodeV));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@wx1 Object o) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f34542b.isDirected() ? (this.f34542b.inDegree(this.f34541a) + this.f34542b.outDegree(this.f34541a)) - (this.f34542b.successors((Object) this.f34541a).contains(this.f34541a) ? 1 : 0) : this.f34542b.adjacentNodes(this.f34541a).size();
    }
}
