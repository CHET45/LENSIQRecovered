package p000;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: f5 */
/* JADX INFO: loaded from: classes5.dex */
@wx4
public abstract class AbstractC5596f5<N, E> implements hbb<N, E> {

    /* JADX INFO: renamed from: a */
    public final Map<E, N> f35334a;

    public AbstractC5596f5(Map<E, N> incidentEdgeMap) {
        this.f35334a = (Map) v7d.checkNotNull(incidentEdgeMap);
    }

    @Override // p000.hbb
    public void addInEdge(E edge, N node, boolean isSelfLoop) {
        if (isSelfLoop) {
            return;
        }
        addOutEdge(edge, node);
    }

    @Override // p000.hbb
    public void addOutEdge(E edge, N node) {
        v7d.checkState(this.f35334a.put(edge, node) == null);
    }

    @Override // p000.hbb
    public N adjacentNode(E edge) {
        N n = this.f35334a.get(edge);
        Objects.requireNonNull(n);
        return n;
    }

    @Override // p000.hbb
    public Set<E> inEdges() {
        return incidentEdges();
    }

    @Override // p000.hbb
    public Set<E> incidentEdges() {
        return Collections.unmodifiableSet(this.f35334a.keySet());
    }

    @Override // p000.hbb
    public Set<E> outEdges() {
        return incidentEdges();
    }

    @Override // p000.hbb
    public Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // p000.hbb
    @wx1
    public N removeInEdge(E edge, boolean isSelfLoop) {
        if (isSelfLoop) {
            return null;
        }
        return removeOutEdge(edge);
    }

    @Override // p000.hbb
    public N removeOutEdge(E edge) {
        N nRemove = this.f35334a.remove(edge);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    @Override // p000.hbb
    public Set<N> successors() {
        return adjacentNodes();
    }
}
