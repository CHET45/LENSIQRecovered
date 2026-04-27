package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class n5f {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f63355a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f63356b;

    /* JADX INFO: renamed from: c */
    public final int f63357c;

    /* JADX INFO: renamed from: d */
    public final long f63358d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final xf3 f63359e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final String f63360f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final String f63361g;

    public n5f(@yfb String str, @yfb String str2, int i, long j, @yfb xf3 xf3Var, @yfb String str3, @yfb String str4) {
        md8.checkNotNullParameter(str, "sessionId");
        md8.checkNotNullParameter(str2, "firstSessionId");
        md8.checkNotNullParameter(xf3Var, "dataCollectionStatus");
        md8.checkNotNullParameter(str3, "firebaseInstallationId");
        md8.checkNotNullParameter(str4, "firebaseAuthenticationToken");
        this.f63355a = str;
        this.f63356b = str2;
        this.f63357c = i;
        this.f63358d = j;
        this.f63359e = xf3Var;
        this.f63360f = str3;
        this.f63361g = str4;
    }

    @yfb
    public final String component1() {
        return this.f63355a;
    }

    @yfb
    public final String component2() {
        return this.f63356b;
    }

    public final int component3() {
        return this.f63357c;
    }

    public final long component4() {
        return this.f63358d;
    }

    @yfb
    public final xf3 component5() {
        return this.f63359e;
    }

    @yfb
    public final String component6() {
        return this.f63360f;
    }

    @yfb
    public final String component7() {
        return this.f63361g;
    }

    @yfb
    public final n5f copy(@yfb String str, @yfb String str2, int i, long j, @yfb xf3 xf3Var, @yfb String str3, @yfb String str4) {
        md8.checkNotNullParameter(str, "sessionId");
        md8.checkNotNullParameter(str2, "firstSessionId");
        md8.checkNotNullParameter(xf3Var, "dataCollectionStatus");
        md8.checkNotNullParameter(str3, "firebaseInstallationId");
        md8.checkNotNullParameter(str4, "firebaseAuthenticationToken");
        return new n5f(str, str2, i, j, xf3Var, str3, str4);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5f)) {
            return false;
        }
        n5f n5fVar = (n5f) obj;
        return md8.areEqual(this.f63355a, n5fVar.f63355a) && md8.areEqual(this.f63356b, n5fVar.f63356b) && this.f63357c == n5fVar.f63357c && this.f63358d == n5fVar.f63358d && md8.areEqual(this.f63359e, n5fVar.f63359e) && md8.areEqual(this.f63360f, n5fVar.f63360f) && md8.areEqual(this.f63361g, n5fVar.f63361g);
    }

    @yfb
    public final xf3 getDataCollectionStatus() {
        return this.f63359e;
    }

    public final long getEventTimestampUs() {
        return this.f63358d;
    }

    @yfb
    public final String getFirebaseAuthenticationToken() {
        return this.f63361g;
    }

    @yfb
    public final String getFirebaseInstallationId() {
        return this.f63360f;
    }

    @yfb
    public final String getFirstSessionId() {
        return this.f63356b;
    }

    @yfb
    public final String getSessionId() {
        return this.f63355a;
    }

    public final int getSessionIndex() {
        return this.f63357c;
    }

    public int hashCode() {
        return (((((((((((this.f63355a.hashCode() * 31) + this.f63356b.hashCode()) * 31) + Integer.hashCode(this.f63357c)) * 31) + Long.hashCode(this.f63358d)) * 31) + this.f63359e.hashCode()) * 31) + this.f63360f.hashCode()) * 31) + this.f63361g.hashCode();
    }

    @yfb
    public String toString() {
        return "SessionInfo(sessionId=" + this.f63355a + ", firstSessionId=" + this.f63356b + ", sessionIndex=" + this.f63357c + ", eventTimestampUs=" + this.f63358d + ", dataCollectionStatus=" + this.f63359e + ", firebaseInstallationId=" + this.f63360f + ", firebaseAuthenticationToken=" + this.f63361g + ')';
    }
}
