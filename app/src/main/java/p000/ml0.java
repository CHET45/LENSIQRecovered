package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.hqc;
import p000.iqc;

/* JADX INFO: loaded from: classes5.dex */
public final class ml0 extends iqc {

    /* JADX INFO: renamed from: b */
    public final String f61279b;

    /* JADX INFO: renamed from: c */
    public final hqc.EnumC6973a f61280c;

    /* JADX INFO: renamed from: d */
    public final String f61281d;

    /* JADX INFO: renamed from: e */
    public final String f61282e;

    /* JADX INFO: renamed from: f */
    public final long f61283f;

    /* JADX INFO: renamed from: g */
    public final long f61284g;

    /* JADX INFO: renamed from: h */
    public final String f61285h;

    /* JADX INFO: renamed from: ml0$b */
    public static final class C9391b extends iqc.AbstractC7565a {

        /* JADX INFO: renamed from: a */
        public String f61286a;

        /* JADX INFO: renamed from: b */
        public hqc.EnumC6973a f61287b;

        /* JADX INFO: renamed from: c */
        public String f61288c;

        /* JADX INFO: renamed from: d */
        public String f61289d;

        /* JADX INFO: renamed from: e */
        public long f61290e;

        /* JADX INFO: renamed from: f */
        public long f61291f;

        /* JADX INFO: renamed from: g */
        public String f61292g;

        /* JADX INFO: renamed from: h */
        public byte f61293h;

        @Override // p000.iqc.AbstractC7565a
        public iqc build() {
            if (this.f61293h == 3 && this.f61287b != null) {
                return new ml0(this.f61286a, this.f61287b, this.f61288c, this.f61289d, this.f61290e, this.f61291f, this.f61292g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f61287b == null) {
                sb.append(" registrationStatus");
            }
            if ((this.f61293h & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((this.f61293h & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.iqc.AbstractC7565a
        public iqc.AbstractC7565a setAuthToken(@hib String str) {
            this.f61288c = str;
            return this;
        }

        @Override // p000.iqc.AbstractC7565a
        public iqc.AbstractC7565a setExpiresInSecs(long j) {
            this.f61290e = j;
            this.f61293h = (byte) (this.f61293h | 1);
            return this;
        }

        @Override // p000.iqc.AbstractC7565a
        public iqc.AbstractC7565a setFirebaseInstallationId(String str) {
            this.f61286a = str;
            return this;
        }

        @Override // p000.iqc.AbstractC7565a
        public iqc.AbstractC7565a setFisError(@hib String str) {
            this.f61292g = str;
            return this;
        }

        @Override // p000.iqc.AbstractC7565a
        public iqc.AbstractC7565a setRefreshToken(@hib String str) {
            this.f61289d = str;
            return this;
        }

        @Override // p000.iqc.AbstractC7565a
        public iqc.AbstractC7565a setRegistrationStatus(hqc.EnumC6973a enumC6973a) {
            if (enumC6973a == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f61287b = enumC6973a;
            return this;
        }

        @Override // p000.iqc.AbstractC7565a
        public iqc.AbstractC7565a setTokenCreationEpochInSecs(long j) {
            this.f61291f = j;
            this.f61293h = (byte) (this.f61293h | 2);
            return this;
        }

        public C9391b() {
        }

        private C9391b(iqc iqcVar) {
            this.f61286a = iqcVar.getFirebaseInstallationId();
            this.f61287b = iqcVar.getRegistrationStatus();
            this.f61288c = iqcVar.getAuthToken();
            this.f61289d = iqcVar.getRefreshToken();
            this.f61290e = iqcVar.getExpiresInSecs();
            this.f61291f = iqcVar.getTokenCreationEpochInSecs();
            this.f61292g = iqcVar.getFisError();
            this.f61293h = (byte) 3;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iqc)) {
            return false;
        }
        iqc iqcVar = (iqc) obj;
        String str3 = this.f61279b;
        if (str3 != null ? str3.equals(iqcVar.getFirebaseInstallationId()) : iqcVar.getFirebaseInstallationId() == null) {
            if (this.f61280c.equals(iqcVar.getRegistrationStatus()) && ((str = this.f61281d) != null ? str.equals(iqcVar.getAuthToken()) : iqcVar.getAuthToken() == null) && ((str2 = this.f61282e) != null ? str2.equals(iqcVar.getRefreshToken()) : iqcVar.getRefreshToken() == null) && this.f61283f == iqcVar.getExpiresInSecs() && this.f61284g == iqcVar.getTokenCreationEpochInSecs()) {
                String str4 = this.f61285h;
                if (str4 == null) {
                    if (iqcVar.getFisError() == null) {
                        return true;
                    }
                } else if (str4.equals(iqcVar.getFisError())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.iqc
    @hib
    public String getAuthToken() {
        return this.f61281d;
    }

    @Override // p000.iqc
    public long getExpiresInSecs() {
        return this.f61283f;
    }

    @Override // p000.iqc
    @hib
    public String getFirebaseInstallationId() {
        return this.f61279b;
    }

    @Override // p000.iqc
    @hib
    public String getFisError() {
        return this.f61285h;
    }

    @Override // p000.iqc
    @hib
    public String getRefreshToken() {
        return this.f61282e;
    }

    @Override // p000.iqc
    @efb
    public hqc.EnumC6973a getRegistrationStatus() {
        return this.f61280c;
    }

    @Override // p000.iqc
    public long getTokenCreationEpochInSecs() {
        return this.f61284g;
    }

    public int hashCode() {
        String str = this.f61279b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f61280c.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str2 = this.f61281d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str3 = this.f61282e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f61283f;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f61284g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str4 = this.f61285h;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // p000.iqc
    public iqc.AbstractC7565a toBuilder() {
        return new C9391b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f61279b + ", registrationStatus=" + this.f61280c + ", authToken=" + this.f61281d + ", refreshToken=" + this.f61282e + ", expiresInSecs=" + this.f61283f + ", tokenCreationEpochInSecs=" + this.f61284g + ", fisError=" + this.f61285h + "}";
    }

    private ml0(@hib String str, hqc.EnumC6973a enumC6973a, @hib String str2, @hib String str3, long j, long j2, @hib String str4) {
        this.f61279b = str;
        this.f61280c = enumC6973a;
        this.f61281d = str2;
        this.f61282e = str3;
        this.f61283f = j;
        this.f61284g = j2;
        this.f61285h = str4;
    }
}
