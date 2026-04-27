package p000;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public final class bsh<N, E> extends AbstractC5596f5<N, E> {

    /* JADX INFO: renamed from: b */
    @wx1
    @ez8
    public transient Reference<d4b<N>> f14704b;

    /* JADX INFO: renamed from: bsh$a */
    public class C2042a extends i2b<E> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f14705c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2042a(Map outEdgeToNode, Object targetNode, final Object val$node) {
            super(outEdgeToNode, targetNode);
            this.f14705c = val$node;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return bsh.this.adjacentNodesMultiset().count(this.f14705c);
        }
    }

    private bsh(Map<E, N> incidentEdges) {
        super(incidentEdges);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d4b<N> adjacentNodesMultiset() {
        d4b<N> d4bVar = (d4b) getReference(this.f14704b);
        if (d4bVar != null) {
            return d4bVar;
        }
        sh7 sh7VarCreate = sh7.create(this.f35334a.values());
        this.f14704b = new SoftReference(sh7VarCreate);
        return sh7VarCreate;
    }

    /* JADX INFO: renamed from: b */
    public static <N, E> bsh<N, E> m3388b() {
        return new bsh<>(new HashMap(2, 1.0f));
    }

    /* JADX INFO: renamed from: c */
    public static <N, E> bsh<N, E> m3389c(Map<E, N> incidentEdges) {
        return new bsh<>(ox7.copyOf((Map) incidentEdges));
    }

    @wx1
    private static <T> T getReference(@wx1 Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    @Override // p000.AbstractC5596f5, p000.hbb
    public void addInEdge(E edge, N node, boolean isSelfLoop) {
        if (isSelfLoop) {
            return;
        }
        addOutEdge(edge, node);
    }

    @Override // p000.AbstractC5596f5, p000.hbb
    public void addOutEdge(E edge, N node) {
        super.addOutEdge(edge, node);
        d4b d4bVar = (d4b) getReference(this.f14704b);
        if (d4bVar != null) {
            v7d.checkState(d4bVar.add(node));
        }
    }

    @Override // p000.hbb
    public Set<N> adjacentNodes() {
        return Collections.unmodifiableSet(adjacentNodesMultiset().elementSet());
    }

    @Override // p000.hbb
    public Set<E> edgesConnecting(N node) {
        return new C2042a(this.f35334a, node, node);
    }

    @Override // p000.AbstractC5596f5, p000.hbb
    @wx1
    public N removeInEdge(E edge, boolean isSelfLoop) {
        if (isSelfLoop) {
            return null;
        }
        return removeOutEdge(edge);
    }

    @Override // p000.AbstractC5596f5, p000.hbb
    public N removeOutEdge(E e) {
        N n = (N) super.removeOutEdge(e);
        d4b d4bVar = (d4b) getReference(this.f14704b);
        if (d4bVar != null) {
            v7d.checkState(d4bVar.remove(n));
        }
        return n;
    }
}
