package p000;

import java.util.AbstractSet;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public final class kw4<E> extends AbstractSet<E> {

    /* JADX INFO: renamed from: a */
    public final Map<?, E> f55480a;

    /* JADX INFO: renamed from: b */
    public final Object f55481b;

    public kw4(Map<?, E> nodeToEdgeMap, Object targetNode) {
        this.f55480a = (Map) v7d.checkNotNull(nodeToEdgeMap);
        this.f55481b = v7d.checkNotNull(targetNode);
    }

    @wx1
    private E getConnectingEdge() {
        return this.f55480a.get(this.f55481b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@wx1 Object edge) {
        E connectingEdge = getConnectingEdge();
        return connectingEdge != null && connectingEdge.equals(edge);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return getConnectingEdge() == null ? 0 : 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public quh<E> iterator() {
        E connectingEdge = getConnectingEdge();
        return connectingEdge == null ? dy7.m9575of().iterator() : wg8.singletonIterator(connectingEdge);
    }
}
