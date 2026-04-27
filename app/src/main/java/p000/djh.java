package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class djh<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final A f29842a;

    /* JADX INFO: renamed from: b */
    public final B f29843b;

    /* JADX INFO: renamed from: c */
    public final C f29844c;

    public djh(A a, B b, C c) {
        this.f29842a = a;
        this.f29843b = b;
        this.f29844c = c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ djh copy$default(djh djhVar, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = djhVar.f29842a;
        }
        if ((i & 2) != 0) {
            obj2 = djhVar.f29843b;
        }
        if ((i & 4) != 0) {
            obj3 = djhVar.f29844c;
        }
        return djhVar.copy(obj, obj2, obj3);
    }

    public final A component1() {
        return this.f29842a;
    }

    public final B component2() {
        return this.f29843b;
    }

    public final C component3() {
        return this.f29844c;
    }

    @yfb
    public final djh<A, B, C> copy(A a, B b, C c) {
        return new djh<>(a, b, c);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djh)) {
            return false;
        }
        djh djhVar = (djh) obj;
        return md8.areEqual(this.f29842a, djhVar.f29842a) && md8.areEqual(this.f29843b, djhVar.f29843b) && md8.areEqual(this.f29844c, djhVar.f29844c);
    }

    public final A getFirst() {
        return this.f29842a;
    }

    public final B getSecond() {
        return this.f29843b;
    }

    public final C getThird() {
        return this.f29844c;
    }

    public int hashCode() {
        A a = this.f29842a;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f29843b;
        int iHashCode2 = (iHashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.f29844c;
        return iHashCode2 + (c != null ? c.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return '(' + this.f29842a + ", " + this.f29843b + ", " + this.f29844c + ')';
    }
}
