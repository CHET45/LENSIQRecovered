package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.Arrays;
import p000.di9;

/* JADX INFO: loaded from: classes4.dex */
public final class gl0 extends di9 {

    /* JADX INFO: renamed from: a */
    public final long f40076a;

    /* JADX INFO: renamed from: b */
    public final Integer f40077b;

    /* JADX INFO: renamed from: c */
    public final wi2 f40078c;

    /* JADX INFO: renamed from: d */
    public final long f40079d;

    /* JADX INFO: renamed from: e */
    public final byte[] f40080e;

    /* JADX INFO: renamed from: f */
    public final String f40081f;

    /* JADX INFO: renamed from: g */
    public final long f40082g;

    /* JADX INFO: renamed from: h */
    public final gbb f40083h;

    /* JADX INFO: renamed from: i */
    public final cg5 f40084i;

    /* JADX INFO: renamed from: gl0$b */
    public static final class C6367b extends di9.AbstractC4796a {

        /* JADX INFO: renamed from: a */
        public Long f40085a;

        /* JADX INFO: renamed from: b */
        public Integer f40086b;

        /* JADX INFO: renamed from: c */
        public wi2 f40087c;

        /* JADX INFO: renamed from: d */
        public Long f40088d;

        /* JADX INFO: renamed from: e */
        public byte[] f40089e;

        /* JADX INFO: renamed from: f */
        public String f40090f;

        /* JADX INFO: renamed from: g */
        public Long f40091g;

        /* JADX INFO: renamed from: h */
        public gbb f40092h;

        /* JADX INFO: renamed from: i */
        public cg5 f40093i;

        @Override // p000.di9.AbstractC4796a
        /* JADX INFO: renamed from: a */
        public di9.AbstractC4796a mo9177a(@hib byte[] bArr) {
            this.f40089e = bArr;
            return this;
        }

        @Override // p000.di9.AbstractC4796a
        /* JADX INFO: renamed from: b */
        public di9.AbstractC4796a mo9178b(@hib String str) {
            this.f40090f = str;
            return this;
        }

        @Override // p000.di9.AbstractC4796a
        public di9 build() {
            String str = "";
            if (this.f40085a == null) {
                str = " eventTimeMs";
            }
            if (this.f40088d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f40091g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new gl0(this.f40085a.longValue(), this.f40086b, this.f40087c, this.f40088d.longValue(), this.f40089e, this.f40090f, this.f40091g.longValue(), this.f40092h, this.f40093i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.di9.AbstractC4796a
        public di9.AbstractC4796a setComplianceData(@hib wi2 wi2Var) {
            this.f40087c = wi2Var;
            return this;
        }

        @Override // p000.di9.AbstractC4796a
        public di9.AbstractC4796a setEventCode(@hib Integer num) {
            this.f40086b = num;
            return this;
        }

        @Override // p000.di9.AbstractC4796a
        public di9.AbstractC4796a setEventTimeMs(long j) {
            this.f40085a = Long.valueOf(j);
            return this;
        }

        @Override // p000.di9.AbstractC4796a
        public di9.AbstractC4796a setEventUptimeMs(long j) {
            this.f40088d = Long.valueOf(j);
            return this;
        }

        @Override // p000.di9.AbstractC4796a
        public di9.AbstractC4796a setExperimentIds(@hib cg5 cg5Var) {
            this.f40093i = cg5Var;
            return this;
        }

        @Override // p000.di9.AbstractC4796a
        public di9.AbstractC4796a setNetworkConnectionInfo(@hib gbb gbbVar) {
            this.f40092h = gbbVar;
            return this;
        }

        @Override // p000.di9.AbstractC4796a
        public di9.AbstractC4796a setTimezoneOffsetSeconds(long j) {
            this.f40091g = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Integer num;
        wi2 wi2Var;
        String str;
        gbb gbbVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof di9)) {
            return false;
        }
        di9 di9Var = (di9) obj;
        if (this.f40076a == di9Var.getEventTimeMs() && ((num = this.f40077b) != null ? num.equals(di9Var.getEventCode()) : di9Var.getEventCode() == null) && ((wi2Var = this.f40078c) != null ? wi2Var.equals(di9Var.getComplianceData()) : di9Var.getComplianceData() == null) && this.f40079d == di9Var.getEventUptimeMs()) {
            if (Arrays.equals(this.f40080e, di9Var instanceof gl0 ? ((gl0) di9Var).f40080e : di9Var.getSourceExtension()) && ((str = this.f40081f) != null ? str.equals(di9Var.getSourceExtensionJsonProto3()) : di9Var.getSourceExtensionJsonProto3() == null) && this.f40082g == di9Var.getTimezoneOffsetSeconds() && ((gbbVar = this.f40083h) != null ? gbbVar.equals(di9Var.getNetworkConnectionInfo()) : di9Var.getNetworkConnectionInfo() == null)) {
                cg5 cg5Var = this.f40084i;
                if (cg5Var == null) {
                    if (di9Var.getExperimentIds() == null) {
                        return true;
                    }
                } else if (cg5Var.equals(di9Var.getExperimentIds())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.di9
    @hib
    public wi2 getComplianceData() {
        return this.f40078c;
    }

    @Override // p000.di9
    @hib
    public Integer getEventCode() {
        return this.f40077b;
    }

    @Override // p000.di9
    public long getEventTimeMs() {
        return this.f40076a;
    }

    @Override // p000.di9
    public long getEventUptimeMs() {
        return this.f40079d;
    }

    @Override // p000.di9
    @hib
    public cg5 getExperimentIds() {
        return this.f40084i;
    }

    @Override // p000.di9
    @hib
    public gbb getNetworkConnectionInfo() {
        return this.f40083h;
    }

    @Override // p000.di9
    @hib
    public byte[] getSourceExtension() {
        return this.f40080e;
    }

    @Override // p000.di9
    @hib
    public String getSourceExtensionJsonProto3() {
        return this.f40081f;
    }

    @Override // p000.di9
    public long getTimezoneOffsetSeconds() {
        return this.f40082g;
    }

    public int hashCode() {
        long j = this.f40076a;
        int i = (((int) (j ^ (j >>> 32))) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        Integer num = this.f40077b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        wi2 wi2Var = this.f40078c;
        int iHashCode2 = (iHashCode ^ (wi2Var == null ? 0 : wi2Var.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f40079d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ Arrays.hashCode(this.f40080e)) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str = this.f40081f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j3 = this.f40082g;
        int i2 = (iHashCode4 ^ ((int) ((j3 >>> 32) ^ j3))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        gbb gbbVar = this.f40083h;
        int iHashCode5 = (i2 ^ (gbbVar == null ? 0 : gbbVar.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        cg5 cg5Var = this.f40084i;
        return iHashCode5 ^ (cg5Var != null ? cg5Var.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f40076a + ", eventCode=" + this.f40077b + ", complianceData=" + this.f40078c + ", eventUptimeMs=" + this.f40079d + ", sourceExtension=" + Arrays.toString(this.f40080e) + ", sourceExtensionJsonProto3=" + this.f40081f + ", timezoneOffsetSeconds=" + this.f40082g + ", networkConnectionInfo=" + this.f40083h + ", experimentIds=" + this.f40084i + "}";
    }

    private gl0(long j, @hib Integer num, @hib wi2 wi2Var, long j2, @hib byte[] bArr, @hib String str, long j3, @hib gbb gbbVar, @hib cg5 cg5Var) {
        this.f40076a = j;
        this.f40077b = num;
        this.f40078c = wi2Var;
        this.f40079d = j2;
        this.f40080e = bArr;
        this.f40081f = str;
        this.f40082g = j3;
        this.f40083h = gbbVar;
        this.f40084i = cg5Var;
    }
}
