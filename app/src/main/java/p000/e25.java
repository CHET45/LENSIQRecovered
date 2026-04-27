package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
@tw7(containerOf = {"N"})
public abstract class e25<N> implements Iterable<N> {

    /* JADX INFO: renamed from: a */
    public final N f31580a;

    /* JADX INFO: renamed from: b */
    public final N f31581b;

    /* JADX INFO: renamed from: e25$b */
    public static final class C5051b<N> extends e25<N> {
        @Override // p000.e25
        public boolean equals(@wx1 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e25)) {
                return false;
            }
            e25 e25Var = (e25) obj;
            if (isOrdered() != e25Var.isOrdered()) {
                return false;
            }
            return source().equals(e25Var.source()) && target().equals(e25Var.target());
        }

        @Override // p000.e25
        public int hashCode() {
            return okb.hashCode(source(), target());
        }

        @Override // p000.e25
        public boolean isOrdered() {
            return true;
        }

        @Override // p000.e25, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p000.e25
        public N source() {
            return nodeU();
        }

        @Override // p000.e25
        public N target() {
            return nodeV();
        }

        public String toString() {
            return "<" + source() + " -> " + target() + ">";
        }

        private C5051b(N source, N target) {
            super(source, target);
        }
    }

    /* JADX INFO: renamed from: e25$c */
    public static final class C5052c<N> extends e25<N> {
        @Override // p000.e25
        public boolean equals(@wx1 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e25)) {
                return false;
            }
            e25 e25Var = (e25) obj;
            if (isOrdered() != e25Var.isOrdered()) {
                return false;
            }
            return nodeU().equals(e25Var.nodeU()) ? nodeV().equals(e25Var.nodeV()) : nodeU().equals(e25Var.nodeV()) && nodeV().equals(e25Var.nodeU());
        }

        @Override // p000.e25
        public int hashCode() {
            return nodeU().hashCode() + nodeV().hashCode();
        }

        @Override // p000.e25
        public boolean isOrdered() {
            return false;
        }

        @Override // p000.e25, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p000.e25
        public N source() {
            throw new UnsupportedOperationException(m97.f60280l);
        }

        @Override // p000.e25
        public N target() {
            throw new UnsupportedOperationException(m97.f60280l);
        }

        public String toString() {
            return "[" + nodeU() + ", " + nodeV() + "]";
        }

        private C5052c(N nodeU, N nodeV) {
            super(nodeU, nodeV);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <N> e25<N> m9643a(j97<?> graph, N nodeU, N nodeV) {
        return graph.isDirected() ? ordered(nodeU, nodeV) : unordered(nodeU, nodeV);
    }

    /* JADX INFO: renamed from: b */
    public static <N> e25<N> m9644b(cbb<?, ?> network, N nodeU, N nodeV) {
        return network.isDirected() ? ordered(nodeU, nodeV) : unordered(nodeU, nodeV);
    }

    public static <N> e25<N> ordered(N source, N target) {
        return new C5051b(source, target);
    }

    public static <N> e25<N> unordered(N nodeU, N nodeV) {
        return new C5052c(nodeV, nodeU);
    }

    public final N adjacentNode(N node) {
        if (node.equals(this.f31580a)) {
            return this.f31581b;
        }
        if (node.equals(this.f31581b)) {
            return this.f31580a;
        }
        throw new IllegalArgumentException("EndpointPair " + this + " does not contain node " + node);
    }

    public abstract boolean equals(@wx1 Object obj);

    public abstract int hashCode();

    public abstract boolean isOrdered();

    public final N nodeU() {
        return this.f31580a;
    }

    public final N nodeV() {
        return this.f31581b;
    }

    public abstract N source();

    public abstract N target();

    private e25(N n, N n2) {
        this.f31580a = (N) v7d.checkNotNull(n);
        this.f31581b = (N) v7d.checkNotNull(n2);
    }

    @Override // java.lang.Iterable
    public final quh<N> iterator() {
        return wg8.forArray(this.f31580a, this.f31581b);
    }
}
