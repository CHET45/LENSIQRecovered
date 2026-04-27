package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class vj0 extends z33.AbstractC15965f.a {

    /* JADX INFO: renamed from: a */
    public final String f91326a;

    /* JADX INFO: renamed from: b */
    public final String f91327b;

    /* JADX INFO: renamed from: c */
    public final String f91328c;

    /* JADX INFO: renamed from: d */
    public final z33.AbstractC15965f.a.b f91329d;

    /* JADX INFO: renamed from: e */
    public final String f91330e;

    /* JADX INFO: renamed from: f */
    public final String f91331f;

    /* JADX INFO: renamed from: g */
    public final String f91332g;

    /* JADX INFO: renamed from: vj0$b */
    public static final class C14102b extends z33.AbstractC15965f.a.AbstractC16566a {

        /* JADX INFO: renamed from: a */
        public String f91333a;

        /* JADX INFO: renamed from: b */
        public String f91334b;

        /* JADX INFO: renamed from: c */
        public String f91335c;

        /* JADX INFO: renamed from: d */
        public z33.AbstractC15965f.a.b f91336d;

        /* JADX INFO: renamed from: e */
        public String f91337e;

        /* JADX INFO: renamed from: f */
        public String f91338f;

        /* JADX INFO: renamed from: g */
        public String f91339g;

        @Override // p000.z33.AbstractC15965f.a.AbstractC16566a
        public z33.AbstractC15965f.a build() {
            String str;
            String str2 = this.f91333a;
            if (str2 != null && (str = this.f91334b) != null) {
                return new vj0(str2, str, this.f91335c, this.f91336d, this.f91337e, this.f91338f, this.f91339g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f91333a == null) {
                sb.append(" identifier");
            }
            if (this.f91334b == null) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.a.AbstractC16566a
        public z33.AbstractC15965f.a.AbstractC16566a setDevelopmentPlatform(@hib String str) {
            this.f91338f = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.a.AbstractC16566a
        public z33.AbstractC15965f.a.AbstractC16566a setDevelopmentPlatformVersion(@hib String str) {
            this.f91339g = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.a.AbstractC16566a
        public z33.AbstractC15965f.a.AbstractC16566a setDisplayVersion(String str) {
            this.f91335c = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.a.AbstractC16566a
        public z33.AbstractC15965f.a.AbstractC16566a setIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f91333a = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.a.AbstractC16566a
        public z33.AbstractC15965f.a.AbstractC16566a setInstallationUuid(String str) {
            this.f91337e = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.a.AbstractC16566a
        public z33.AbstractC15965f.a.AbstractC16566a setOrganization(z33.AbstractC15965f.a.b bVar) {
            this.f91336d = bVar;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.a.AbstractC16566a
        public z33.AbstractC15965f.a.AbstractC16566a setVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f91334b = str;
            return this;
        }

        public C14102b() {
        }

        private C14102b(z33.AbstractC15965f.a aVar) {
            this.f91333a = aVar.getIdentifier();
            this.f91334b = aVar.getVersion();
            this.f91335c = aVar.getDisplayVersion();
            this.f91336d = aVar.getOrganization();
            this.f91337e = aVar.getInstallationUuid();
            this.f91338f = aVar.getDevelopmentPlatform();
            this.f91339g = aVar.getDevelopmentPlatformVersion();
        }
    }

    @Override // p000.z33.AbstractC15965f.a
    /* JADX INFO: renamed from: a */
    public z33.AbstractC15965f.a.AbstractC16566a mo24012a() {
        return new C14102b(this);
    }

    public boolean equals(Object obj) {
        String str;
        z33.AbstractC15965f.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.a)) {
            return false;
        }
        z33.AbstractC15965f.a aVar = (z33.AbstractC15965f.a) obj;
        if (this.f91326a.equals(aVar.getIdentifier()) && this.f91327b.equals(aVar.getVersion()) && ((str = this.f91328c) != null ? str.equals(aVar.getDisplayVersion()) : aVar.getDisplayVersion() == null) && ((bVar = this.f91329d) != null ? bVar.equals(aVar.getOrganization()) : aVar.getOrganization() == null) && ((str2 = this.f91330e) != null ? str2.equals(aVar.getInstallationUuid()) : aVar.getInstallationUuid() == null) && ((str3 = this.f91331f) != null ? str3.equals(aVar.getDevelopmentPlatform()) : aVar.getDevelopmentPlatform() == null)) {
            String str4 = this.f91332g;
            if (str4 == null) {
                if (aVar.getDevelopmentPlatformVersion() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.getDevelopmentPlatformVersion())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.z33.AbstractC15965f.a
    @hib
    public String getDevelopmentPlatform() {
        return this.f91331f;
    }

    @Override // p000.z33.AbstractC15965f.a
    @hib
    public String getDevelopmentPlatformVersion() {
        return this.f91332g;
    }

    @Override // p000.z33.AbstractC15965f.a
    @hib
    public String getDisplayVersion() {
        return this.f91328c;
    }

    @Override // p000.z33.AbstractC15965f.a
    @efb
    public String getIdentifier() {
        return this.f91326a;
    }

    @Override // p000.z33.AbstractC15965f.a
    @hib
    public String getInstallationUuid() {
        return this.f91330e;
    }

    @Override // p000.z33.AbstractC15965f.a
    @hib
    public z33.AbstractC15965f.a.b getOrganization() {
        return this.f91329d;
    }

    @Override // p000.z33.AbstractC15965f.a
    @efb
    public String getVersion() {
        return this.f91327b;
    }

    public int hashCode() {
        int iHashCode = (((this.f91326a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f91327b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str = this.f91328c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        z33.AbstractC15965f.a.b bVar = this.f91329d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str2 = this.f91330e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str3 = this.f91331f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str4 = this.f91332g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f91326a + ", version=" + this.f91327b + ", displayVersion=" + this.f91328c + ", organization=" + this.f91329d + ", installationUuid=" + this.f91330e + ", developmentPlatform=" + this.f91331f + ", developmentPlatformVersion=" + this.f91332g + "}";
    }

    private vj0(String str, String str2, @hib String str3, @hib z33.AbstractC15965f.a.b bVar, @hib String str4, @hib String str5, @hib String str6) {
        this.f91326a = str;
        this.f91327b = str2;
        this.f91328c = str3;
        this.f91329d = bVar;
        this.f91330e = str4;
        this.f91331f = str5;
        this.f91332g = str6;
    }
}
