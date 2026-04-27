package p000;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public final class nd4<N, E> extends AbstractC15906z0<N, E> {

    /* JADX INFO: renamed from: d */
    @wx1
    @ez8
    public transient Reference<d4b<N>> f64024d;

    /* JADX INFO: renamed from: e */
    @wx1
    @ez8
    public transient Reference<d4b<N>> f64025e;

    /* JADX INFO: renamed from: nd4$a */
    public class C9791a extends i2b<E> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f64026c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9791a(Map outEdgeToNode, Object targetNode, final Object val$node) {
            super(outEdgeToNode, targetNode);
            this.f64026c = val$node;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return nd4.this.successorsMultiset().count(this.f64026c);
        }
    }

    private nd4(Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
        super(inEdges, outEdges, selfLoopCount);
    }

    /* JADX INFO: renamed from: c */
    public static <N, E> nd4<N, E> m17853c() {
        return new nd4<>(new HashMap(2, 1.0f), new HashMap(2, 1.0f), 0);
    }

    /* JADX INFO: renamed from: d */
    public static <N, E> nd4<N, E> m17854d(Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
        return new nd4<>(ox7.copyOf((Map) inEdges), ox7.copyOf((Map) outEdges), selfLoopCount);
    }

    @wx1
    private static <T> T getReference(@wx1 Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    private d4b<N> predecessorsMultiset() {
        d4b<N> d4bVar = (d4b) getReference(this.f64024d);
        if (d4bVar != null) {
            return d4bVar;
        }
        sh7 sh7VarCreate = sh7.create(this.f103580a.values());
        this.f64024d = new SoftReference(sh7VarCreate);
        return sh7VarCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d4b<N> successorsMultiset() {
        d4b<N> d4bVar = (d4b) getReference(this.f64025e);
        if (d4bVar != null) {
            return d4bVar;
        }
        sh7 sh7VarCreate = sh7.create(this.f103581b.values());
        this.f64025e = new SoftReference(sh7VarCreate);
        return sh7VarCreate;
    }

    @Override // p000.AbstractC15906z0, p000.hbb
    public void addInEdge(E edge, N node, boolean isSelfLoop) {
        super.addInEdge(edge, node, isSelfLoop);
        d4b d4bVar = (d4b) getReference(this.f64024d);
        if (d4bVar != null) {
            v7d.checkState(d4bVar.add(node));
        }
    }

    @Override // p000.AbstractC15906z0, p000.hbb
    public void addOutEdge(E edge, N node) {
        super.addOutEdge(edge, node);
        d4b d4bVar = (d4b) getReference(this.f64025e);
        if (d4bVar != null) {
            v7d.checkState(d4bVar.add(node));
        }
    }

    @Override // p000.hbb
    public Set<E> edgesConnecting(N node) {
        return new C9791a(this.f103581b, node, node);
    }

    @Override // p000.hbb
    public Set<N> predecessors() {
        return Collections.unmodifiableSet(predecessorsMultiset().elementSet());
    }

    @Override // p000.AbstractC15906z0, p000.hbb
    public N removeInEdge(E e, boolean z) {
        N n = (N) super.removeInEdge(e, z);
        d4b d4bVar = (d4b) getReference(this.f64024d);
        if (d4bVar != null) {
            v7d.checkState(d4bVar.remove(n));
        }
        return n;
    }

    @Override // p000.AbstractC15906z0, p000.hbb
    public N removeOutEdge(E e) {
        N n = (N) super.removeOutEdge(e);
        d4b d4bVar = (d4b) getReference(this.f64025e);
        if (d4bVar != null) {
            v7d.checkState(d4bVar.remove(n));
        }
        return n;
    }

    @Override // p000.hbb
    public Set<N> successors() {
        return Collections.unmodifiableSet(successorsMultiset().elementSet());
    }
}
