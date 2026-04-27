package p000;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public class f1g<N, E> extends AbstractC8592l3<N, E> {

    /* JADX INFO: renamed from: a */
    public final boolean f34716a;

    /* JADX INFO: renamed from: b */
    public final boolean f34717b;

    /* JADX INFO: renamed from: c */
    public final boolean f34718c;

    /* JADX INFO: renamed from: d */
    public final mx4<N> f34719d;

    /* JADX INFO: renamed from: e */
    public final mx4<E> f34720e;

    /* JADX INFO: renamed from: f */
    public final bt9<N, hbb<N, E>> f34721f;

    /* JADX INFO: renamed from: g */
    public final bt9<E, N> f34722g;

    public f1g(dbb<? super N, ? super E> builder) {
        this(builder, builder.f72732c.m17652b(builder.f72734e.mo17830or(10).intValue()), builder.f29202g.m17652b(builder.f29203h.mo17830or(20).intValue()));
    }

    @Override // p000.cbb
    public Set<N> adjacentNodes(N node) {
        return m10411c(node).adjacentNodes();
    }

    @Override // p000.cbb
    public boolean allowsParallelEdges() {
        return this.f34717b;
    }

    @Override // p000.cbb
    public boolean allowsSelfLoops() {
        return this.f34718c;
    }

    /* JADX INFO: renamed from: c */
    public final hbb<N, E> m10411c(N node) {
        hbb<N, E> hbbVarMo3396f = this.f34721f.mo3396f(node);
        if (hbbVarMo3396f != null) {
            return hbbVarMo3396f;
        }
        v7d.checkNotNull(node);
        throw new IllegalArgumentException(String.format(m97.f60274f, node));
    }

    /* JADX INFO: renamed from: d */
    public final N m10412d(E edge) {
        N nMo3396f = this.f34722g.mo3396f(edge);
        if (nMo3396f != null) {
            return nMo3396f;
        }
        v7d.checkNotNull(edge);
        throw new IllegalArgumentException(String.format(m97.f60275g, edge));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10413e(E edge) {
        return this.f34722g.m3395e(edge);
    }

    @Override // p000.cbb
    public mx4<E> edgeOrder() {
        return this.f34720e;
    }

    @Override // p000.cbb
    public Set<E> edges() {
        return this.f34722g.m3401k();
    }

    @Override // p000.AbstractC8592l3, p000.cbb
    public Set<E> edgesConnecting(N nodeU, N nodeV) {
        hbb<N, E> hbbVarM10411c = m10411c(nodeU);
        if (!this.f34718c && nodeU == nodeV) {
            return dy7.m9575of();
        }
        v7d.checkArgument(m10414f(nodeV), m97.f60274f, nodeV);
        return hbbVarM10411c.edgesConnecting(nodeV);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10414f(N node) {
        return this.f34721f.m3395e(node);
    }

    @Override // p000.cbb
    public Set<E> inEdges(N node) {
        return m10411c(node).inEdges();
    }

    @Override // p000.cbb
    public Set<E> incidentEdges(N node) {
        return m10411c(node).incidentEdges();
    }

    @Override // p000.cbb
    public e25<N> incidentNodes(E edge) {
        N nM10412d = m10412d(edge);
        hbb<N, E> hbbVarMo3396f = this.f34721f.mo3396f(nM10412d);
        Objects.requireNonNull(hbbVarMo3396f);
        return e25.m9644b(this, nM10412d, hbbVarMo3396f.adjacentNode(edge));
    }

    @Override // p000.cbb
    public boolean isDirected() {
        return this.f34716a;
    }

    @Override // p000.cbb
    public mx4<N> nodeOrder() {
        return this.f34719d;
    }

    @Override // p000.cbb
    public Set<N> nodes() {
        return this.f34721f.m3401k();
    }

    @Override // p000.cbb
    public Set<E> outEdges(N node) {
        return m10411c(node).outEdges();
    }

    @Override // p000.cbb, p000.f8d, p000.j97
    public Set<N> predecessors(N node) {
        return m10411c(node).predecessors();
    }

    @Override // p000.cbb, p000.bfg, p000.j97
    public Set<N> successors(N node) {
        return m10411c(node).successors();
    }

    public f1g(dbb<? super N, ? super E> dbbVar, Map<N, hbb<N, E>> map, Map<E, N> map2) {
        bt9<N, hbb<N, E>> bt9Var;
        this.f34716a = dbbVar.f72730a;
        this.f34717b = dbbVar.f29201f;
        this.f34718c = dbbVar.f72731b;
        this.f34719d = (mx4<N>) dbbVar.f72732c.m17651a();
        this.f34720e = (mx4<E>) dbbVar.f29202g.m17651a();
        if (map instanceof TreeMap) {
            bt9Var = new it9<>(map);
        } else {
            bt9Var = new bt9<>(map);
        }
        this.f34721f = bt9Var;
        this.f34722g = new bt9<>(map2);
    }
}
