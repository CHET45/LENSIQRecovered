package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class p65 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f69838a;

    /* JADX INFO: renamed from: b */
    public final long f69839b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Map<String, String> f69840c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public p65(@yfb String str, long j) {
        this(str, j, null, 4, null);
        md8.checkNotNullParameter(str, "sessionId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p65 copy$default(p65 p65Var, String str, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = p65Var.f69838a;
        }
        if ((i & 2) != 0) {
            j = p65Var.f69839b;
        }
        if ((i & 4) != 0) {
            map = p65Var.f69840c;
        }
        return p65Var.copy(str, j, map);
    }

    @yfb
    public final String component1() {
        return this.f69838a;
    }

    public final long component2() {
        return this.f69839b;
    }

    @yfb
    public final Map<String, String> component3() {
        return this.f69840c;
    }

    @yfb
    public final p65 copy(@yfb String str, long j, @yfb Map<String, String> map) {
        md8.checkNotNullParameter(str, "sessionId");
        md8.checkNotNullParameter(map, "additionalCustomKeys");
        return new p65(str, j, map);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p65)) {
            return false;
        }
        p65 p65Var = (p65) obj;
        return md8.areEqual(this.f69838a, p65Var.f69838a) && this.f69839b == p65Var.f69839b && md8.areEqual(this.f69840c, p65Var.f69840c);
    }

    @yfb
    public final Map<String, String> getAdditionalCustomKeys() {
        return this.f69840c;
    }

    @yfb
    public final String getSessionId() {
        return this.f69838a;
    }

    public final long getTimestamp() {
        return this.f69839b;
    }

    public int hashCode() {
        return (((this.f69838a.hashCode() * 31) + Long.hashCode(this.f69839b)) * 31) + this.f69840c.hashCode();
    }

    @yfb
    public String toString() {
        return "EventMetadata(sessionId=" + this.f69838a + ", timestamp=" + this.f69839b + ", additionalCustomKeys=" + this.f69840c + ')';
    }

    @yn8
    public p65(@yfb String str, long j, @yfb Map<String, String> map) {
        md8.checkNotNullParameter(str, "sessionId");
        md8.checkNotNullParameter(map, "additionalCustomKeys");
        this.f69838a = str;
        this.f69839b = j;
        this.f69840c = map;
    }

    public /* synthetic */ p65(String str, long j, Map map, int i, jt3 jt3Var) {
        this(str, j, (i & 4) != 0 ? xt9.emptyMap() : map);
    }
}
