package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.v3h;

/* JADX INFO: loaded from: classes5.dex */
public final class cm0 extends v3h {

    /* JADX INFO: renamed from: a */
    public final String f16917a;

    /* JADX INFO: renamed from: b */
    public final long f16918b;

    /* JADX INFO: renamed from: c */
    public final v3h.EnumC13856b f16919c;

    /* JADX INFO: renamed from: cm0$b */
    public static final class C2385b extends v3h.AbstractC13855a {

        /* JADX INFO: renamed from: a */
        public String f16920a;

        /* JADX INFO: renamed from: b */
        public long f16921b;

        /* JADX INFO: renamed from: c */
        public v3h.EnumC13856b f16922c;

        /* JADX INFO: renamed from: d */
        public byte f16923d;

        @Override // p000.v3h.AbstractC13855a
        public v3h build() {
            if (this.f16923d == 1) {
                return new cm0(this.f16920a, this.f16921b, this.f16922c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // p000.v3h.AbstractC13855a
        public v3h.AbstractC13855a setResponseCode(v3h.EnumC13856b enumC13856b) {
            this.f16922c = enumC13856b;
            return this;
        }

        @Override // p000.v3h.AbstractC13855a
        public v3h.AbstractC13855a setToken(String str) {
            this.f16920a = str;
            return this;
        }

        @Override // p000.v3h.AbstractC13855a
        public v3h.AbstractC13855a setTokenExpirationTimestamp(long j) {
            this.f16921b = j;
            this.f16923d = (byte) (this.f16923d | 1);
            return this;
        }

        public C2385b() {
        }

        private C2385b(v3h v3hVar) {
            this.f16920a = v3hVar.getToken();
            this.f16921b = v3hVar.getTokenExpirationTimestamp();
            this.f16922c = v3hVar.getResponseCode();
            this.f16923d = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v3h)) {
            return false;
        }
        v3h v3hVar = (v3h) obj;
        String str = this.f16917a;
        if (str != null ? str.equals(v3hVar.getToken()) : v3hVar.getToken() == null) {
            if (this.f16918b == v3hVar.getTokenExpirationTimestamp()) {
                v3h.EnumC13856b enumC13856b = this.f16919c;
                if (enumC13856b == null) {
                    if (v3hVar.getResponseCode() == null) {
                        return true;
                    }
                } else if (enumC13856b.equals(v3hVar.getResponseCode())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.v3h
    @hib
    public v3h.EnumC13856b getResponseCode() {
        return this.f16919c;
    }

    @Override // p000.v3h
    @hib
    public String getToken() {
        return this.f16917a;
    }

    @Override // p000.v3h
    @efb
    public long getTokenExpirationTimestamp() {
        return this.f16918b;
    }

    public int hashCode() {
        String str = this.f16917a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f16918b;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        v3h.EnumC13856b enumC13856b = this.f16919c;
        return i ^ (enumC13856b != null ? enumC13856b.hashCode() : 0);
    }

    @Override // p000.v3h
    public v3h.AbstractC13855a toBuilder() {
        return new C2385b(this);
    }

    public String toString() {
        return "TokenResult{token=" + this.f16917a + ", tokenExpirationTimestamp=" + this.f16918b + ", responseCode=" + this.f16919c + "}";
    }

    private cm0(@hib String str, long j, @hib v3h.EnumC13856b enumC13856b) {
        this.f16917a = str;
        this.f16918b = j;
        this.f16919c = enumC13856b;
    }
}
