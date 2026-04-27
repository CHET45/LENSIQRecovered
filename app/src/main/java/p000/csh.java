package p000;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public final class csh<N, E> extends AbstractC5596f5<N, E> {
    public csh(Map<E, N> incidentEdgeMap) {
        super(incidentEdgeMap);
    }

    /* JADX INFO: renamed from: a */
    public static <N, E> csh<N, E> m8672a() {
        return new csh<>(ih7.create(2));
    }

    /* JADX INFO: renamed from: b */
    public static <N, E> csh<N, E> m8673b(Map<E, N> incidentEdges) {
        return new csh<>(xw7.copyOf((Map) incidentEdges));
    }

    @Override // p000.hbb
    public Set<N> adjacentNodes() {
        return Collections.unmodifiableSet(((k11) this.f35334a).values());
    }

    @Override // p000.hbb
    public Set<E> edgesConnecting(N node) {
        return new kw4(((k11) this.f35334a).inverse(), node);
    }
}
