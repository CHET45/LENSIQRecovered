package p000;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1771")
public final class xs2 {

    /* JADX INFO: renamed from: a */
    public final ws2 f99135a;

    /* JADX INFO: renamed from: b */
    public final n4g f99136b;

    private xs2(ws2 ws2Var, n4g n4gVar) {
        this.f99135a = (ws2) v7d.checkNotNull(ws2Var, "state is null");
        this.f99136b = (n4g) v7d.checkNotNull(n4gVar, "status is null");
    }

    public static xs2 forNonError(ws2 ws2Var) {
        v7d.checkArgument(ws2Var != ws2.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new xs2(ws2Var, n4g.f63258e);
    }

    public static xs2 forTransientFailure(n4g n4gVar) {
        v7d.checkArgument(!n4gVar.isOk(), "The error status must not be OK");
        return new xs2(ws2.TRANSIENT_FAILURE, n4gVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof xs2)) {
            return false;
        }
        xs2 xs2Var = (xs2) obj;
        return this.f99135a.equals(xs2Var.f99135a) && this.f99136b.equals(xs2Var.f99136b);
    }

    public ws2 getState() {
        return this.f99135a;
    }

    public n4g getStatus() {
        return this.f99136b;
    }

    public int hashCode() {
        return this.f99135a.hashCode() ^ this.f99136b.hashCode();
    }

    public String toString() {
        if (this.f99136b.isOk()) {
            return this.f99135a.toString();
        }
        return this.f99135a + c0b.f15433c + this.f99136b + c0b.f15434d;
    }
}
