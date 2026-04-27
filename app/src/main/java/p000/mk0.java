package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class mk0 extends z33.AbstractC15965f.e {

    /* JADX INFO: renamed from: a */
    public final int f61221a;

    /* JADX INFO: renamed from: b */
    public final String f61222b;

    /* JADX INFO: renamed from: c */
    public final String f61223c;

    /* JADX INFO: renamed from: d */
    public final boolean f61224d;

    /* JADX INFO: renamed from: mk0$b */
    public static final class C9377b extends z33.AbstractC15965f.e.a {

        /* JADX INFO: renamed from: a */
        public int f61225a;

        /* JADX INFO: renamed from: b */
        public String f61226b;

        /* JADX INFO: renamed from: c */
        public String f61227c;

        /* JADX INFO: renamed from: d */
        public boolean f61228d;

        /* JADX INFO: renamed from: e */
        public byte f61229e;

        @Override // p000.z33.AbstractC15965f.e.a
        public z33.AbstractC15965f.e build() {
            String str;
            String str2;
            if (this.f61229e == 3 && (str = this.f61226b) != null && (str2 = this.f61227c) != null) {
                return new mk0(this.f61225a, str, str2, this.f61228d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f61229e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f61226b == null) {
                sb.append(" version");
            }
            if (this.f61227c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f61229e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.e.a
        public z33.AbstractC15965f.e.a setBuildVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f61227c = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.e.a
        public z33.AbstractC15965f.e.a setJailbroken(boolean z) {
            this.f61228d = z;
            this.f61229e = (byte) (this.f61229e | 2);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.e.a
        public z33.AbstractC15965f.e.a setPlatform(int i) {
            this.f61225a = i;
            this.f61229e = (byte) (this.f61229e | 1);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.e.a
        public z33.AbstractC15965f.e.a setVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f61226b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.e)) {
            return false;
        }
        z33.AbstractC15965f.e eVar = (z33.AbstractC15965f.e) obj;
        return this.f61221a == eVar.getPlatform() && this.f61222b.equals(eVar.getVersion()) && this.f61223c.equals(eVar.getBuildVersion()) && this.f61224d == eVar.isJailbroken();
    }

    @Override // p000.z33.AbstractC15965f.e
    @efb
    public String getBuildVersion() {
        return this.f61223c;
    }

    @Override // p000.z33.AbstractC15965f.e
    public int getPlatform() {
        return this.f61221a;
    }

    @Override // p000.z33.AbstractC15965f.e
    @efb
    public String getVersion() {
        return this.f61222b;
    }

    public int hashCode() {
        return ((((((this.f61221a ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f61222b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f61223c.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ (this.f61224d ? 1231 : 1237);
    }

    @Override // p000.z33.AbstractC15965f.e
    public boolean isJailbroken() {
        return this.f61224d;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f61221a + ", version=" + this.f61222b + ", buildVersion=" + this.f61223c + ", jailbroken=" + this.f61224d + "}";
    }

    private mk0(int i, String str, String str2, boolean z) {
        this.f61221a = i;
        this.f61222b = str;
        this.f61223c = str2;
        this.f61224d = z;
    }
}
