package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class scc<A, B> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final A f81219a;

    /* JADX INFO: renamed from: b */
    public final B f81220b;

    public scc(A a, B b) {
        this.f81219a = a;
        this.f81220b = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ scc copy$default(scc sccVar, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = sccVar.f81219a;
        }
        if ((i & 2) != 0) {
            obj2 = sccVar.f81220b;
        }
        return sccVar.copy(obj, obj2);
    }

    public final A component1() {
        return this.f81219a;
    }

    public final B component2() {
        return this.f81220b;
    }

    @yfb
    public final scc<A, B> copy(A a, B b) {
        return new scc<>(a, b);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scc)) {
            return false;
        }
        scc sccVar = (scc) obj;
        return md8.areEqual(this.f81219a, sccVar.f81219a) && md8.areEqual(this.f81220b, sccVar.f81220b);
    }

    public final A getFirst() {
        return this.f81219a;
    }

    public final B getSecond() {
        return this.f81220b;
    }

    public int hashCode() {
        A a = this.f81219a;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f81220b;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return '(' + this.f81219a + ", " + this.f81220b + ')';
    }
}
