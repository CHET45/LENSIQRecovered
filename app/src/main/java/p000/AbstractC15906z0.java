package p000;

import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: z0 */
/* JADX INFO: loaded from: classes5.dex */
@wx4
public abstract class AbstractC15906z0<N, E> implements hbb<N, E> {

    /* JADX INFO: renamed from: a */
    public final Map<E, N> f103580a;

    /* JADX INFO: renamed from: b */
    public final Map<E, N> f103581b;

    /* JADX INFO: renamed from: c */
    public int f103582c;

    /* JADX INFO: renamed from: z0$a */
    public class a extends AbstractSet<E> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object obj) {
            return AbstractC15906z0.this.f103580a.containsKey(obj) || AbstractC15906z0.this.f103581b.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return w68.saturatedAdd(AbstractC15906z0.this.f103580a.size(), AbstractC15906z0.this.f103581b.size() - AbstractC15906z0.this.f103582c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public quh<E> iterator() {
            return wg8.unmodifiableIterator((AbstractC15906z0.this.f103582c == 0 ? vg8.concat(AbstractC15906z0.this.f103580a.keySet(), AbstractC15906z0.this.f103581b.keySet()) : t6f.union(AbstractC15906z0.this.f103580a.keySet(), AbstractC15906z0.this.f103581b.keySet())).iterator());
        }
    }

    public AbstractC15906z0(Map<E, N> inEdgeMap, Map<E, N> outEdgeMap, int selfLoopCount) {
        this.f103580a = (Map) v7d.checkNotNull(inEdgeMap);
        this.f103581b = (Map) v7d.checkNotNull(outEdgeMap);
        this.f103582c = ab7.m288a(selfLoopCount);
        v7d.checkState(selfLoopCount <= inEdgeMap.size() && selfLoopCount <= outEdgeMap.size());
    }

    @Override // p000.hbb
    public void addInEdge(E edge, N node, boolean isSelfLoop) {
        v7d.checkNotNull(edge);
        v7d.checkNotNull(node);
        if (isSelfLoop) {
            int i = this.f103582c + 1;
            this.f103582c = i;
            ab7.m290c(i);
        }
        v7d.checkState(this.f103580a.put(edge, node) == null);
    }

    @Override // p000.hbb
    public void addOutEdge(E edge, N node) {
        v7d.checkNotNull(edge);
        v7d.checkNotNull(node);
        v7d.checkState(this.f103581b.put(edge, node) == null);
    }

    @Override // p000.hbb
    public N adjacentNode(E edge) {
        N n = this.f103581b.get(edge);
        Objects.requireNonNull(n);
        return n;
    }

    @Override // p000.hbb
    public Set<N> adjacentNodes() {
        return t6f.union(predecessors(), successors());
    }

    @Override // p000.hbb
    public Set<E> inEdges() {
        return Collections.unmodifiableSet(this.f103580a.keySet());
    }

    @Override // p000.hbb
    public Set<E> incidentEdges() {
        return new a();
    }

    @Override // p000.hbb
    public Set<E> outEdges() {
        return Collections.unmodifiableSet(this.f103581b.keySet());
    }

    @Override // p000.hbb
    public N removeInEdge(E edge, boolean isSelfLoop) {
        if (isSelfLoop) {
            int i = this.f103582c - 1;
            this.f103582c = i;
            ab7.m288a(i);
        }
        N nRemove = this.f103580a.remove(edge);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    @Override // p000.hbb
    public N removeOutEdge(E edge) {
        N nRemove = this.f103581b.remove(edge);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }
}
