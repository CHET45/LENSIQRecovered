package p000;

import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public final class d1g<N, E> extends f1g<N, E> implements c6b<N, E> {
    public d1g(dbb<? super N, ? super E> builder) {
        super(builder);
    }

    @op1
    private hbb<N, E> addNodeInternal(N node) {
        hbb<N, E> hbbVarNewConnections = newConnections();
        v7d.checkState(this.f34721f.m3399i(node, hbbVarNewConnections) == null);
        return hbbVarNewConnections;
    }

    private hbb<N, E> newConnections() {
        return isDirected() ? allowsParallelEdges() ? nd4.m17853c() : od4.m18581b() : allowsParallelEdges() ? bsh.m3388b() : csh.m8672a();
    }

    @Override // p000.c6b
    @op1
    public boolean addEdge(N nodeU, N nodeV, E edge) {
        v7d.checkNotNull(nodeU, "nodeU");
        v7d.checkNotNull(nodeV, "nodeV");
        v7d.checkNotNull(edge, "edge");
        if (m10413e(edge)) {
            e25<N> e25VarIncidentNodes = incidentNodes(edge);
            e25 e25VarM9644b = e25.m9644b(this, nodeU, nodeV);
            v7d.checkArgument(e25VarIncidentNodes.equals(e25VarM9644b), m97.f60276h, edge, e25VarIncidentNodes, e25VarM9644b);
            return false;
        }
        hbb<N, E> hbbVarMo3396f = this.f34721f.mo3396f(nodeU);
        if (!allowsParallelEdges()) {
            v7d.checkArgument(hbbVarMo3396f == null || !hbbVarMo3396f.successors().contains(nodeV), m97.f60278j, nodeU, nodeV);
        }
        boolean zEquals = nodeU.equals(nodeV);
        if (!allowsSelfLoops()) {
            v7d.checkArgument(!zEquals, m97.f60279k, nodeU);
        }
        if (hbbVarMo3396f == null) {
            hbbVarMo3396f = addNodeInternal(nodeU);
        }
        hbbVarMo3396f.addOutEdge(edge, nodeV);
        hbb<N, E> hbbVarMo3396f2 = this.f34721f.mo3396f(nodeV);
        if (hbbVarMo3396f2 == null) {
            hbbVarMo3396f2 = addNodeInternal(nodeV);
        }
        hbbVarMo3396f2.addInEdge(edge, nodeU, zEquals);
        this.f34722g.m3399i(edge, nodeU);
        return true;
    }

    @Override // p000.c6b
    @op1
    public boolean addNode(N node) {
        v7d.checkNotNull(node, "node");
        if (m10414f(node)) {
            return false;
        }
        addNodeInternal(node);
        return true;
    }

    @Override // p000.c6b
    @op1
    public boolean removeEdge(E edge) {
        v7d.checkNotNull(edge, "edge");
        N nMo3396f = this.f34722g.mo3396f(edge);
        boolean z = false;
        if (nMo3396f == null) {
            return false;
        }
        hbb<N, E> hbbVarMo3396f = this.f34721f.mo3396f(nMo3396f);
        Objects.requireNonNull(hbbVarMo3396f);
        hbb<N, E> hbbVar = hbbVarMo3396f;
        N nAdjacentNode = hbbVar.adjacentNode(edge);
        hbb<N, E> hbbVarMo3396f2 = this.f34721f.mo3396f(nAdjacentNode);
        Objects.requireNonNull(hbbVarMo3396f2);
        hbb<N, E> hbbVar2 = hbbVarMo3396f2;
        hbbVar.removeOutEdge(edge);
        if (allowsSelfLoops() && nMo3396f.equals(nAdjacentNode)) {
            z = true;
        }
        hbbVar2.removeInEdge(edge, z);
        this.f34722g.m3400j(edge);
        return true;
    }

    @Override // p000.c6b
    @op1
    public boolean removeNode(N node) {
        v7d.checkNotNull(node, "node");
        hbb<N, E> hbbVarMo3396f = this.f34721f.mo3396f(node);
        if (hbbVarMo3396f == null) {
            return false;
        }
        quh<E> it = kx7.copyOf((Collection) hbbVarMo3396f.incidentEdges()).iterator();
        while (it.hasNext()) {
            removeEdge(it.next());
        }
        this.f34721f.m3400j(node);
        return true;
    }

    @Override // p000.c6b
    @op1
    public boolean addEdge(e25<N> endpoints, E edge) {
        m15289b(endpoints);
        return addEdge(endpoints.nodeU(), endpoints.nodeV(), edge);
    }
}
