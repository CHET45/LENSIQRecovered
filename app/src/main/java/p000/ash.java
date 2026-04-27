package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.mx4;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public final class ash<N, V> implements l97<N, V> {

    /* JADX INFO: renamed from: a */
    public final Map<N, V> f11809a;

    /* JADX INFO: renamed from: ash$a */
    public static /* synthetic */ class C1597a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11810a;

        static {
            int[] iArr = new int[mx4.EnumC9580b.values().length];
            f11810a = iArr;
            try {
                iArr[mx4.EnumC9580b.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11810a[mx4.EnumC9580b.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ash(Map<N, V> adjacentNodeValues) {
        this.f11809a = (Map) v7d.checkNotNull(adjacentNodeValues);
    }

    /* JADX INFO: renamed from: b */
    public static <N, V> ash<N, V> m2662b(mx4<N> incidentEdgeOrder) {
        int i = C1597a.f11810a[incidentEdgeOrder.type().ordinal()];
        if (i == 1) {
            return new ash<>(new HashMap(2, 1.0f));
        }
        if (i == 2) {
            return new ash<>(new LinkedHashMap(2, 1.0f));
        }
        throw new AssertionError(incidentEdgeOrder.type());
    }

    /* JADX INFO: renamed from: c */
    public static <N, V> ash<N, V> m2663c(Map<N, V> adjacentNodeValues) {
        return new ash<>(ox7.copyOf((Map) adjacentNodeValues));
    }

    @Override // p000.l97
    public void addPredecessor(N node, V value) {
        addSuccessor(node, value);
    }

    @Override // p000.l97
    @wx1
    public V addSuccessor(N node, V value) {
        return this.f11809a.put(node, value);
    }

    @Override // p000.l97
    public Set<N> adjacentNodes() {
        return Collections.unmodifiableSet(this.f11809a.keySet());
    }

    @Override // p000.l97
    public Iterator<e25<N>> incidentEdgeIterator(final N thisNode) {
        return wg8.transform(this.f11809a.keySet().iterator(), new lz6() { // from class: zrh
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return e25.unordered(thisNode, obj);
            }
        });
    }

    @Override // p000.l97
    public Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // p000.l97
    public void removePredecessor(N node) {
        removeSuccessor(node);
    }

    @Override // p000.l97
    @wx1
    public V removeSuccessor(N node) {
        return this.f11809a.remove(node);
    }

    @Override // p000.l97
    public Set<N> successors() {
        return adjacentNodes();
    }

    @Override // p000.l97
    @wx1
    public V value(N node) {
        return this.f11809a.get(node);
    }
}
