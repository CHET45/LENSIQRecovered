package p000;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public final class od4<N, E> extends AbstractC15906z0<N, E> {
    public od4(Map<E, N> inEdgeMap, Map<E, N> outEdgeMap, int selfLoopCount) {
        super(inEdgeMap, outEdgeMap, selfLoopCount);
    }

    /* JADX INFO: renamed from: b */
    public static <N, E> od4<N, E> m18581b() {
        return new od4<>(ih7.create(2), ih7.create(2), 0);
    }

    /* JADX INFO: renamed from: c */
    public static <N, E> od4<N, E> m18582c(Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
        return new od4<>(xw7.copyOf((Map) inEdges), xw7.copyOf((Map) outEdges), selfLoopCount);
    }

    @Override // p000.hbb
    public Set<E> edgesConnecting(N node) {
        return new kw4(((k11) this.f103581b).inverse(), node);
    }

    @Override // p000.hbb
    public Set<N> predecessors() {
        return Collections.unmodifiableSet(((k11) this.f103580a).values());
    }

    @Override // p000.hbb
    public Set<N> successors() {
        return Collections.unmodifiableSet(((k11) this.f103581b).values());
    }
}
