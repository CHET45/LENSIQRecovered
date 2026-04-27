package p000;

/* JADX INFO: loaded from: classes5.dex */
@sx4
@gd7
public final class om1 {

    /* JADX INFO: renamed from: a */
    public final long f68111a;

    /* JADX INFO: renamed from: b */
    public final long f68112b;

    /* JADX INFO: renamed from: c */
    public final long f68113c;

    /* JADX INFO: renamed from: d */
    public final long f68114d;

    /* JADX INFO: renamed from: e */
    public final long f68115e;

    /* JADX INFO: renamed from: f */
    public final long f68116f;

    public om1(long hitCount, long missCount, long loadSuccessCount, long loadExceptionCount, long totalLoadTime, long evictionCount) {
        v7d.checkArgument(hitCount >= 0);
        v7d.checkArgument(missCount >= 0);
        v7d.checkArgument(loadSuccessCount >= 0);
        v7d.checkArgument(loadExceptionCount >= 0);
        v7d.checkArgument(totalLoadTime >= 0);
        v7d.checkArgument(evictionCount >= 0);
        this.f68111a = hitCount;
        this.f68112b = missCount;
        this.f68113c = loadSuccessCount;
        this.f68114d = loadExceptionCount;
        this.f68115e = totalLoadTime;
        this.f68116f = evictionCount;
    }

    public double averageLoadPenalty() {
        long jSaturatedAdd = nl9.saturatedAdd(this.f68113c, this.f68114d);
        if (jSaturatedAdd == 0) {
            return 0.0d;
        }
        return this.f68115e / jSaturatedAdd;
    }

    public boolean equals(@wx1 Object object) {
        if (!(object instanceof om1)) {
            return false;
        }
        om1 om1Var = (om1) object;
        return this.f68111a == om1Var.f68111a && this.f68112b == om1Var.f68112b && this.f68113c == om1Var.f68113c && this.f68114d == om1Var.f68114d && this.f68115e == om1Var.f68115e && this.f68116f == om1Var.f68116f;
    }

    public long evictionCount() {
        return this.f68116f;
    }

    public int hashCode() {
        return okb.hashCode(Long.valueOf(this.f68111a), Long.valueOf(this.f68112b), Long.valueOf(this.f68113c), Long.valueOf(this.f68114d), Long.valueOf(this.f68115e), Long.valueOf(this.f68116f));
    }

    public long hitCount() {
        return this.f68111a;
    }

    public double hitRate() {
        long jRequestCount = requestCount();
        if (jRequestCount == 0) {
            return 1.0d;
        }
        return this.f68111a / jRequestCount;
    }

    public long loadCount() {
        return nl9.saturatedAdd(this.f68113c, this.f68114d);
    }

    public long loadExceptionCount() {
        return this.f68114d;
    }

    public double loadExceptionRate() {
        long jSaturatedAdd = nl9.saturatedAdd(this.f68113c, this.f68114d);
        if (jSaturatedAdd == 0) {
            return 0.0d;
        }
        return this.f68114d / jSaturatedAdd;
    }

    public long loadSuccessCount() {
        return this.f68113c;
    }

    public om1 minus(om1 other) {
        return new om1(Math.max(0L, nl9.saturatedSubtract(this.f68111a, other.f68111a)), Math.max(0L, nl9.saturatedSubtract(this.f68112b, other.f68112b)), Math.max(0L, nl9.saturatedSubtract(this.f68113c, other.f68113c)), Math.max(0L, nl9.saturatedSubtract(this.f68114d, other.f68114d)), Math.max(0L, nl9.saturatedSubtract(this.f68115e, other.f68115e)), Math.max(0L, nl9.saturatedSubtract(this.f68116f, other.f68116f)));
    }

    public long missCount() {
        return this.f68112b;
    }

    public double missRate() {
        long jRequestCount = requestCount();
        if (jRequestCount == 0) {
            return 0.0d;
        }
        return this.f68112b / jRequestCount;
    }

    public om1 plus(om1 other) {
        return new om1(nl9.saturatedAdd(this.f68111a, other.f68111a), nl9.saturatedAdd(this.f68112b, other.f68112b), nl9.saturatedAdd(this.f68113c, other.f68113c), nl9.saturatedAdd(this.f68114d, other.f68114d), nl9.saturatedAdd(this.f68115e, other.f68115e), nl9.saturatedAdd(this.f68116f, other.f68116f));
    }

    public long requestCount() {
        return nl9.saturatedAdd(this.f68111a, this.f68112b);
    }

    public String toString() {
        return yya.toStringHelper(this).add("hitCount", this.f68111a).add("missCount", this.f68112b).add("loadSuccessCount", this.f68113c).add("loadExceptionCount", this.f68114d).add("totalLoadTime", this.f68115e).add("evictionCount", this.f68116f).toString();
    }

    public long totalLoadTime() {
        return this.f68115e;
    }
}
