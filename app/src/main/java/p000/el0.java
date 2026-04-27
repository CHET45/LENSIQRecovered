package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.k58;

/* JADX INFO: loaded from: classes5.dex */
public final class el0 extends k58 {

    /* JADX INFO: renamed from: a */
    public final String f33306a;

    /* JADX INFO: renamed from: b */
    public final long f33307b;

    /* JADX INFO: renamed from: c */
    public final long f33308c;

    /* JADX INFO: renamed from: el0$b */
    public static final class C5364b extends k58.AbstractC8200a {

        /* JADX INFO: renamed from: a */
        public String f33309a;

        /* JADX INFO: renamed from: b */
        public Long f33310b;

        /* JADX INFO: renamed from: c */
        public Long f33311c;

        @Override // p000.k58.AbstractC8200a
        public k58 build() {
            String str = "";
            if (this.f33309a == null) {
                str = " token";
            }
            if (this.f33310b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f33311c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new el0(this.f33309a, this.f33310b.longValue(), this.f33311c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.k58.AbstractC8200a
        public k58.AbstractC8200a setToken(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f33309a = str;
            return this;
        }

        @Override // p000.k58.AbstractC8200a
        public k58.AbstractC8200a setTokenCreationTimestamp(long j) {
            this.f33311c = Long.valueOf(j);
            return this;
        }

        @Override // p000.k58.AbstractC8200a
        public k58.AbstractC8200a setTokenExpirationTimestamp(long j) {
            this.f33310b = Long.valueOf(j);
            return this;
        }

        public C5364b() {
        }

        private C5364b(k58 k58Var) {
            this.f33309a = k58Var.getToken();
            this.f33310b = Long.valueOf(k58Var.getTokenExpirationTimestamp());
            this.f33311c = Long.valueOf(k58Var.getTokenCreationTimestamp());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k58)) {
            return false;
        }
        k58 k58Var = (k58) obj;
        return this.f33306a.equals(k58Var.getToken()) && this.f33307b == k58Var.getTokenExpirationTimestamp() && this.f33308c == k58Var.getTokenCreationTimestamp();
    }

    @Override // p000.k58
    @efb
    public String getToken() {
        return this.f33306a;
    }

    @Override // p000.k58
    @efb
    public long getTokenCreationTimestamp() {
        return this.f33308c;
    }

    @Override // p000.k58
    @efb
    public long getTokenExpirationTimestamp() {
        return this.f33307b;
    }

    public int hashCode() {
        int iHashCode = (this.f33306a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f33307b;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f33308c;
        return i ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // p000.k58
    public k58.AbstractC8200a toBuilder() {
        return new C5364b(this);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f33306a + ", tokenExpirationTimestamp=" + this.f33307b + ", tokenCreationTimestamp=" + this.f33308c + "}";
    }

    private el0(String str, long j, long j2) {
        this.f33306a = str;
        this.f33307b = j;
        this.f33308c = j2;
    }
}
