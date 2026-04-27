package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public abstract class f25<N> extends AbstractC0012a2<e25<N>> {

    /* JADX INFO: renamed from: c */
    public final gr0<N> f34863c;

    /* JADX INFO: renamed from: d */
    public final Iterator<N> f34864d;

    /* JADX INFO: renamed from: e */
    @wx1
    public N f34865e;

    /* JADX INFO: renamed from: f */
    public Iterator<N> f34866f;

    /* JADX INFO: renamed from: f25$b */
    public static final class C5557b<N> extends f25<N> {
        @Override // p000.AbstractC0012a2
        @wx1
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e25<N> computeNext() {
            while (!this.f34866f.hasNext()) {
                if (!m10482b()) {
                    return m25a();
                }
            }
            N n = this.f34865e;
            Objects.requireNonNull(n);
            return e25.ordered(n, this.f34866f.next());
        }

        private C5557b(gr0<N> graph) {
            super(graph);
        }
    }

    /* JADX INFO: renamed from: f25$c */
    public static final class C5558c<N> extends f25<N> {

        /* JADX INFO: renamed from: m */
        @wx1
        public Set<N> f34867m;

        @Override // p000.AbstractC0012a2
        @wx1
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e25<N> computeNext() {
            do {
                Objects.requireNonNull(this.f34867m);
                while (this.f34866f.hasNext()) {
                    N next = this.f34866f.next();
                    if (!this.f34867m.contains(next)) {
                        N n = this.f34865e;
                        Objects.requireNonNull(n);
                        return e25.unordered(n, next);
                    }
                }
                this.f34867m.add(this.f34865e);
            } while (m10482b());
            this.f34867m = null;
            return m25a();
        }

        private C5558c(gr0<N> graph) {
            super(graph);
            this.f34867m = t6f.newHashSetWithExpectedSize(graph.nodes().size() + 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static <N> f25<N> m10481c(gr0<N> graph) {
        return graph.isDirected() ? new C5557b(graph) : new C5558c(graph);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10482b() {
        v7d.checkState(!this.f34866f.hasNext());
        if (!this.f34864d.hasNext()) {
            return false;
        }
        N next = this.f34864d.next();
        this.f34865e = next;
        this.f34866f = this.f34863c.successors((Object) next).iterator();
        return true;
    }

    private f25(gr0<N> graph) {
        this.f34865e = null;
        this.f34866f = dy7.m9575of().iterator();
        this.f34863c = graph;
        this.f34864d = graph.nodes().iterator();
    }
}
