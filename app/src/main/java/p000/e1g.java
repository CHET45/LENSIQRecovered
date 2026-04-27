package p000;

import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public final class e1g<N, V> extends k1g<N, V> implements e7b<N, V> {

    /* JADX INFO: renamed from: f */
    public final mx4<N> f31563f;

    public e1g(AbstractC11247q1<? super N> abstractC11247q1) {
        super(abstractC11247q1);
        this.f31563f = (mx4<N>) abstractC11247q1.f72733d.m17651a();
    }

    @op1
    private l97<N, V> addNodeInternal(N node) {
        l97<N, V> l97VarNewConnections = newConnections();
        v7d.checkState(this.f52391d.m3399i(node, l97VarNewConnections) == null);
        return l97VarNewConnections;
    }

    private l97<N, V> newConnections() {
        return isDirected() ? md4.m17240j(this.f31563f) : ash.m2662b(this.f31563f);
    }

    @Override // p000.e7b
    @op1
    public boolean addNode(N node) {
        v7d.checkNotNull(node, "node");
        if (m14449e(node)) {
            return false;
        }
        addNodeInternal(node);
        return true;
    }

    @Override // p000.AbstractC6710h5, p000.AbstractC0001a0, p000.gr0
    public mx4<N> incidentEdgeOrder() {
        return this.f31563f;
    }

    @Override // p000.e7b
    @op1
    @wx1
    public V putEdgeValue(N nodeU, N nodeV, V value) {
        v7d.checkNotNull(nodeU, "nodeU");
        v7d.checkNotNull(nodeV, "nodeV");
        v7d.checkNotNull(value, "value");
        if (!allowsSelfLoops()) {
            v7d.checkArgument(!nodeU.equals(nodeV), m97.f60279k, nodeU);
        }
        l97<N, V> l97VarMo3396f = this.f52391d.mo3396f(nodeU);
        if (l97VarMo3396f == null) {
            l97VarMo3396f = addNodeInternal(nodeU);
        }
        V vAddSuccessor = l97VarMo3396f.addSuccessor(nodeV, value);
        l97<N, V> l97VarMo3396f2 = this.f52391d.mo3396f(nodeV);
        if (l97VarMo3396f2 == null) {
            l97VarMo3396f2 = addNodeInternal(nodeV);
        }
        l97VarMo3396f2.addPredecessor(nodeU, value);
        if (vAddSuccessor == null) {
            long j = this.f52392e + 1;
            this.f52392e = j;
            ab7.m291d(j);
        }
        return vAddSuccessor;
    }

    @Override // p000.e7b
    @op1
    @wx1
    public V removeEdge(N nodeU, N nodeV) {
        v7d.checkNotNull(nodeU, "nodeU");
        v7d.checkNotNull(nodeV, "nodeV");
        l97<N, V> l97VarMo3396f = this.f52391d.mo3396f(nodeU);
        l97<N, V> l97VarMo3396f2 = this.f52391d.mo3396f(nodeV);
        if (l97VarMo3396f == null || l97VarMo3396f2 == null) {
            return null;
        }
        V vRemoveSuccessor = l97VarMo3396f.removeSuccessor(nodeV);
        if (vRemoveSuccessor != null) {
            l97VarMo3396f2.removePredecessor(nodeU);
            long j = this.f52392e - 1;
            this.f52392e = j;
            ab7.m289b(j);
        }
        return vRemoveSuccessor;
    }

    @Override // p000.e7b
    @op1
    public boolean removeNode(N n) {
        v7d.checkNotNull(n, "node");
        l97 l97Var = (l97<N, V>) this.f52391d.mo3396f(n);
        if (l97Var == null) {
            return false;
        }
        if (allowsSelfLoops() && l97Var.removeSuccessor(n) != null) {
            l97Var.removePredecessor(n);
            this.f52392e--;
        }
        quh it = kx7.copyOf((Collection) l97Var.successors()).iterator();
        while (it.hasNext()) {
            E next = it.next();
            l97<N, V> l97VarM3398h = this.f52391d.m3398h(next);
            Objects.requireNonNull(l97VarM3398h);
            l97VarM3398h.removePredecessor(n);
            Objects.requireNonNull(l97Var.removeSuccessor(next));
            this.f52392e--;
        }
        if (isDirected()) {
            quh it2 = kx7.copyOf((Collection) l97Var.predecessors()).iterator();
            while (it2.hasNext()) {
                E next2 = it2.next();
                l97<N, V> l97VarM3398h2 = this.f52391d.m3398h(next2);
                Objects.requireNonNull(l97VarM3398h2);
                v7d.checkState(l97VarM3398h2.removeSuccessor(n) != null);
                l97Var.removePredecessor(next2);
                this.f52392e--;
            }
        }
        this.f52391d.m3400j(n);
        ab7.m289b(this.f52392e);
        return true;
    }

    @Override // p000.e7b
    @op1
    @wx1
    public V removeEdge(e25<N> endpoints) {
        m2c(endpoints);
        return removeEdge(endpoints.nodeU(), endpoints.nodeV());
    }

    @Override // p000.e7b
    @op1
    @wx1
    public V putEdgeValue(e25<N> endpoints, V value) {
        m2c(endpoints);
        return putEdgeValue(endpoints.nodeU(), endpoints.nodeV(), value);
    }
}
