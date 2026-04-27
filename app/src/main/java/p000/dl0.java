package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.j58;

/* JADX INFO: loaded from: classes5.dex */
public final class dl0 extends j58 {

    /* JADX INFO: renamed from: a */
    public final String f29925a;

    /* JADX INFO: renamed from: b */
    public final String f29926b;

    /* JADX INFO: renamed from: c */
    public final String f29927c;

    /* JADX INFO: renamed from: d */
    public final v3h f29928d;

    /* JADX INFO: renamed from: e */
    public final j58.EnumC7741b f29929e;

    /* JADX INFO: renamed from: dl0$b */
    public static final class C4841b extends j58.AbstractC7740a {

        /* JADX INFO: renamed from: a */
        public String f29930a;

        /* JADX INFO: renamed from: b */
        public String f29931b;

        /* JADX INFO: renamed from: c */
        public String f29932c;

        /* JADX INFO: renamed from: d */
        public v3h f29933d;

        /* JADX INFO: renamed from: e */
        public j58.EnumC7741b f29934e;

        @Override // p000.j58.AbstractC7740a
        public j58 build() {
            return new dl0(this.f29930a, this.f29931b, this.f29932c, this.f29933d, this.f29934e);
        }

        @Override // p000.j58.AbstractC7740a
        public j58.AbstractC7740a setAuthToken(v3h v3hVar) {
            this.f29933d = v3hVar;
            return this;
        }

        @Override // p000.j58.AbstractC7740a
        public j58.AbstractC7740a setFid(String str) {
            this.f29931b = str;
            return this;
        }

        @Override // p000.j58.AbstractC7740a
        public j58.AbstractC7740a setRefreshToken(String str) {
            this.f29932c = str;
            return this;
        }

        @Override // p000.j58.AbstractC7740a
        public j58.AbstractC7740a setResponseCode(j58.EnumC7741b enumC7741b) {
            this.f29934e = enumC7741b;
            return this;
        }

        @Override // p000.j58.AbstractC7740a
        public j58.AbstractC7740a setUri(String str) {
            this.f29930a = str;
            return this;
        }

        public C4841b() {
        }

        private C4841b(j58 j58Var) {
            this.f29930a = j58Var.getUri();
            this.f29931b = j58Var.getFid();
            this.f29932c = j58Var.getRefreshToken();
            this.f29933d = j58Var.getAuthToken();
            this.f29934e = j58Var.getResponseCode();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j58)) {
            return false;
        }
        j58 j58Var = (j58) obj;
        String str = this.f29925a;
        if (str != null ? str.equals(j58Var.getUri()) : j58Var.getUri() == null) {
            String str2 = this.f29926b;
            if (str2 != null ? str2.equals(j58Var.getFid()) : j58Var.getFid() == null) {
                String str3 = this.f29927c;
                if (str3 != null ? str3.equals(j58Var.getRefreshToken()) : j58Var.getRefreshToken() == null) {
                    v3h v3hVar = this.f29928d;
                    if (v3hVar != null ? v3hVar.equals(j58Var.getAuthToken()) : j58Var.getAuthToken() == null) {
                        j58.EnumC7741b enumC7741b = this.f29929e;
                        if (enumC7741b == null) {
                            if (j58Var.getResponseCode() == null) {
                                return true;
                            }
                        } else if (enumC7741b.equals(j58Var.getResponseCode())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.j58
    @hib
    public v3h getAuthToken() {
        return this.f29928d;
    }

    @Override // p000.j58
    @hib
    public String getFid() {
        return this.f29926b;
    }

    @Override // p000.j58
    @hib
    public String getRefreshToken() {
        return this.f29927c;
    }

    @Override // p000.j58
    @hib
    public j58.EnumC7741b getResponseCode() {
        return this.f29929e;
    }

    @Override // p000.j58
    @hib
    public String getUri() {
        return this.f29925a;
    }

    public int hashCode() {
        String str = this.f29925a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str2 = this.f29926b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str3 = this.f29927c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        v3h v3hVar = this.f29928d;
        int iHashCode4 = (iHashCode3 ^ (v3hVar == null ? 0 : v3hVar.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        j58.EnumC7741b enumC7741b = this.f29929e;
        return iHashCode4 ^ (enumC7741b != null ? enumC7741b.hashCode() : 0);
    }

    @Override // p000.j58
    public j58.AbstractC7740a toBuilder() {
        return new C4841b(this);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f29925a + ", fid=" + this.f29926b + ", refreshToken=" + this.f29927c + ", authToken=" + this.f29928d + ", responseCode=" + this.f29929e + "}";
    }

    private dl0(@hib String str, @hib String str2, @hib String str3, @hib v3h v3hVar, @hib j58.EnumC7741b enumC7741b) {
        this.f29925a = str;
        this.f29926b = str2;
        this.f29927c = str3;
        this.f29928d = v3hVar;
        this.f29929e = enumC7741b;
    }
}
