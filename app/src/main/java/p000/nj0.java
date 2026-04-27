package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class nj0 extends z33 {

    /* JADX INFO: renamed from: b */
    public final String f64700b;

    /* JADX INFO: renamed from: c */
    public final String f64701c;

    /* JADX INFO: renamed from: d */
    public final int f64702d;

    /* JADX INFO: renamed from: e */
    public final String f64703e;

    /* JADX INFO: renamed from: f */
    public final String f64704f;

    /* JADX INFO: renamed from: g */
    public final String f64705g;

    /* JADX INFO: renamed from: h */
    public final String f64706h;

    /* JADX INFO: renamed from: i */
    public final String f64707i;

    /* JADX INFO: renamed from: j */
    public final String f64708j;

    /* JADX INFO: renamed from: k */
    public final z33.AbstractC15965f f64709k;

    /* JADX INFO: renamed from: l */
    public final z33.AbstractC15964e f64710l;

    /* JADX INFO: renamed from: m */
    public final z33.AbstractC15960a f64711m;

    /* JADX INFO: renamed from: nj0$b */
    public static final class C9901b extends z33.AbstractC15962c {

        /* JADX INFO: renamed from: a */
        public String f64712a;

        /* JADX INFO: renamed from: b */
        public String f64713b;

        /* JADX INFO: renamed from: c */
        public int f64714c;

        /* JADX INFO: renamed from: d */
        public String f64715d;

        /* JADX INFO: renamed from: e */
        public String f64716e;

        /* JADX INFO: renamed from: f */
        public String f64717f;

        /* JADX INFO: renamed from: g */
        public String f64718g;

        /* JADX INFO: renamed from: h */
        public String f64719h;

        /* JADX INFO: renamed from: i */
        public String f64720i;

        /* JADX INFO: renamed from: j */
        public z33.AbstractC15965f f64721j;

        /* JADX INFO: renamed from: k */
        public z33.AbstractC15964e f64722k;

        /* JADX INFO: renamed from: l */
        public z33.AbstractC15960a f64723l;

        /* JADX INFO: renamed from: m */
        public byte f64724m;

        @Override // p000.z33.AbstractC15962c
        public z33 build() {
            if (this.f64724m == 1 && this.f64712a != null && this.f64713b != null && this.f64715d != null && this.f64719h != null && this.f64720i != null) {
                return new nj0(this.f64712a, this.f64713b, this.f64714c, this.f64715d, this.f64716e, this.f64717f, this.f64718g, this.f64719h, this.f64720i, this.f64721j, this.f64722k, this.f64723l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f64712a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f64713b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f64724m) == 0) {
                sb.append(" platform");
            }
            if (this.f64715d == null) {
                sb.append(" installationUuid");
            }
            if (this.f64719h == null) {
                sb.append(" buildVersion");
            }
            if (this.f64720i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15962c
        public z33.AbstractC15962c setAppExitInfo(z33.AbstractC15960a abstractC15960a) {
            this.f64723l = abstractC15960a;
            return this;
        }

        @Override // p000.z33.AbstractC15962c
        public z33.AbstractC15962c setAppQualitySessionId(@hib String str) {
            this.f64718g = str;
            return this;
        }

        @Override // p000.z33.AbstractC15962c
        public z33.AbstractC15962c setBuildVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f64719h = str;
            return this;
        }

        @Override // p000.z33.AbstractC15962c
        public z33.AbstractC15962c setDisplayVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f64720i = str;
            return this;
        }

        @Override // p000.z33.AbstractC15962c
        public z33.AbstractC15962c setFirebaseAuthenticationToken(@hib String str) {
            this.f64717f = str;
            return this;
        }

        @Override // p000.z33.AbstractC15962c
        public z33.AbstractC15962c setFirebaseInstallationId(@hib String str) {
            this.f64716e = str;
            return this;
        }

        @Override // p000.z33.AbstractC15962c
        public z33.AbstractC15962c setGmpAppId(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f64713b = str;
            return this;
        }

        @Override // p000.z33.AbstractC15962c
        public z33.AbstractC15962c setInstallationUuid(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f64715d = str;
            return this;
        }

        @Override // p000.z33.AbstractC15962c
        public z33.AbstractC15962c setNdkPayload(z33.AbstractC15964e abstractC15964e) {
            this.f64722k = abstractC15964e;
            return this;
        }

        @Override // p000.z33.AbstractC15962c
        public z33.AbstractC15962c setPlatform(int i) {
            this.f64714c = i;
            this.f64724m = (byte) (this.f64724m | 1);
            return this;
        }

        @Override // p000.z33.AbstractC15962c
        public z33.AbstractC15962c setSdkVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f64712a = str;
            return this;
        }

        @Override // p000.z33.AbstractC15962c
        public z33.AbstractC15962c setSession(z33.AbstractC15965f abstractC15965f) {
            this.f64721j = abstractC15965f;
            return this;
        }

        public C9901b() {
        }

        private C9901b(z33 z33Var) {
            this.f64712a = z33Var.getSdkVersion();
            this.f64713b = z33Var.getGmpAppId();
            this.f64714c = z33Var.getPlatform();
            this.f64715d = z33Var.getInstallationUuid();
            this.f64716e = z33Var.getFirebaseInstallationId();
            this.f64717f = z33Var.getFirebaseAuthenticationToken();
            this.f64718g = z33Var.getAppQualitySessionId();
            this.f64719h = z33Var.getBuildVersion();
            this.f64720i = z33Var.getDisplayVersion();
            this.f64721j = z33Var.getSession();
            this.f64722k = z33Var.getNdkPayload();
            this.f64723l = z33Var.getAppExitInfo();
            this.f64724m = (byte) 1;
        }
    }

    @Override // p000.z33
    /* JADX INFO: renamed from: b */
    public z33.AbstractC15962c mo17972b() {
        return new C9901b(this);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        z33.AbstractC15965f abstractC15965f;
        z33.AbstractC15964e abstractC15964e;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33)) {
            return false;
        }
        z33 z33Var = (z33) obj;
        if (this.f64700b.equals(z33Var.getSdkVersion()) && this.f64701c.equals(z33Var.getGmpAppId()) && this.f64702d == z33Var.getPlatform() && this.f64703e.equals(z33Var.getInstallationUuid()) && ((str = this.f64704f) != null ? str.equals(z33Var.getFirebaseInstallationId()) : z33Var.getFirebaseInstallationId() == null) && ((str2 = this.f64705g) != null ? str2.equals(z33Var.getFirebaseAuthenticationToken()) : z33Var.getFirebaseAuthenticationToken() == null) && ((str3 = this.f64706h) != null ? str3.equals(z33Var.getAppQualitySessionId()) : z33Var.getAppQualitySessionId() == null) && this.f64707i.equals(z33Var.getBuildVersion()) && this.f64708j.equals(z33Var.getDisplayVersion()) && ((abstractC15965f = this.f64709k) != null ? abstractC15965f.equals(z33Var.getSession()) : z33Var.getSession() == null) && ((abstractC15964e = this.f64710l) != null ? abstractC15964e.equals(z33Var.getNdkPayload()) : z33Var.getNdkPayload() == null)) {
            z33.AbstractC15960a abstractC15960a = this.f64711m;
            if (abstractC15960a == null) {
                if (z33Var.getAppExitInfo() == null) {
                    return true;
                }
            } else if (abstractC15960a.equals(z33Var.getAppExitInfo())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.z33
    @hib
    public z33.AbstractC15960a getAppExitInfo() {
        return this.f64711m;
    }

    @Override // p000.z33
    @hib
    public String getAppQualitySessionId() {
        return this.f64706h;
    }

    @Override // p000.z33
    @efb
    public String getBuildVersion() {
        return this.f64707i;
    }

    @Override // p000.z33
    @efb
    public String getDisplayVersion() {
        return this.f64708j;
    }

    @Override // p000.z33
    @hib
    public String getFirebaseAuthenticationToken() {
        return this.f64705g;
    }

    @Override // p000.z33
    @hib
    public String getFirebaseInstallationId() {
        return this.f64704f;
    }

    @Override // p000.z33
    @efb
    public String getGmpAppId() {
        return this.f64701c;
    }

    @Override // p000.z33
    @efb
    public String getInstallationUuid() {
        return this.f64703e;
    }

    @Override // p000.z33
    @hib
    public z33.AbstractC15964e getNdkPayload() {
        return this.f64710l;
    }

    @Override // p000.z33
    public int getPlatform() {
        return this.f64702d;
    }

    @Override // p000.z33
    @efb
    public String getSdkVersion() {
        return this.f64700b;
    }

    @Override // p000.z33
    @hib
    public z33.AbstractC15965f getSession() {
        return this.f64709k;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f64700b.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f64701c.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f64702d) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f64703e.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str = this.f64704f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str2 = this.f64705g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str3 = this.f64706h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f64707i.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f64708j.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        z33.AbstractC15965f abstractC15965f = this.f64709k;
        int iHashCode5 = (iHashCode4 ^ (abstractC15965f == null ? 0 : abstractC15965f.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        z33.AbstractC15964e abstractC15964e = this.f64710l;
        int iHashCode6 = (iHashCode5 ^ (abstractC15964e == null ? 0 : abstractC15964e.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        z33.AbstractC15960a abstractC15960a = this.f64711m;
        return iHashCode6 ^ (abstractC15960a != null ? abstractC15960a.hashCode() : 0);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f64700b + ", gmpAppId=" + this.f64701c + ", platform=" + this.f64702d + ", installationUuid=" + this.f64703e + ", firebaseInstallationId=" + this.f64704f + ", firebaseAuthenticationToken=" + this.f64705g + ", appQualitySessionId=" + this.f64706h + ", buildVersion=" + this.f64707i + ", displayVersion=" + this.f64708j + ", session=" + this.f64709k + ", ndkPayload=" + this.f64710l + ", appExitInfo=" + this.f64711m + "}";
    }

    private nj0(String str, String str2, int i, String str3, @hib String str4, @hib String str5, @hib String str6, String str7, String str8, @hib z33.AbstractC15965f abstractC15965f, @hib z33.AbstractC15964e abstractC15964e, @hib z33.AbstractC15960a abstractC15960a) {
        this.f64700b = str;
        this.f64701c = str2;
        this.f64702d = i;
        this.f64703e = str3;
        this.f64704f = str4;
        this.f64705g = str5;
        this.f64706h = str6;
        this.f64707i = str7;
        this.f64708j = str8;
        this.f64709k = abstractC15965f;
        this.f64710l = abstractC15964e;
        this.f64711m = abstractC15960a;
    }
}
