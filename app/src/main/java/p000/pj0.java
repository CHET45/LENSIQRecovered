package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.List;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class pj0 extends z33.AbstractC15960a {

    /* JADX INFO: renamed from: a */
    public final int f71043a;

    /* JADX INFO: renamed from: b */
    public final String f71044b;

    /* JADX INFO: renamed from: c */
    public final int f71045c;

    /* JADX INFO: renamed from: d */
    public final int f71046d;

    /* JADX INFO: renamed from: e */
    public final long f71047e;

    /* JADX INFO: renamed from: f */
    public final long f71048f;

    /* JADX INFO: renamed from: g */
    public final long f71049g;

    /* JADX INFO: renamed from: h */
    public final String f71050h;

    /* JADX INFO: renamed from: i */
    public final List<z33.AbstractC15960a.a> f71051i;

    /* JADX INFO: renamed from: pj0$b */
    public static final class C10980b extends z33.AbstractC15960a.b {

        /* JADX INFO: renamed from: a */
        public int f71052a;

        /* JADX INFO: renamed from: b */
        public String f71053b;

        /* JADX INFO: renamed from: c */
        public int f71054c;

        /* JADX INFO: renamed from: d */
        public int f71055d;

        /* JADX INFO: renamed from: e */
        public long f71056e;

        /* JADX INFO: renamed from: f */
        public long f71057f;

        /* JADX INFO: renamed from: g */
        public long f71058g;

        /* JADX INFO: renamed from: h */
        public String f71059h;

        /* JADX INFO: renamed from: i */
        public List<z33.AbstractC15960a.a> f71060i;

        /* JADX INFO: renamed from: j */
        public byte f71061j;

        @Override // p000.z33.AbstractC15960a.b
        public z33.AbstractC15960a build() {
            String str;
            if (this.f71061j == 63 && (str = this.f71053b) != null) {
                return new pj0(this.f71052a, str, this.f71054c, this.f71055d, this.f71056e, this.f71057f, this.f71058g, this.f71059h, this.f71060i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f71061j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f71053b == null) {
                sb.append(" processName");
            }
            if ((this.f71061j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f71061j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f71061j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f71061j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.f71061j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15960a.b
        public z33.AbstractC15960a.b setBuildIdMappingForArch(@hib List<z33.AbstractC15960a.a> list) {
            this.f71060i = list;
            return this;
        }

        @Override // p000.z33.AbstractC15960a.b
        public z33.AbstractC15960a.b setImportance(int i) {
            this.f71055d = i;
            this.f71061j = (byte) (this.f71061j | 4);
            return this;
        }

        @Override // p000.z33.AbstractC15960a.b
        public z33.AbstractC15960a.b setPid(int i) {
            this.f71052a = i;
            this.f71061j = (byte) (this.f71061j | 1);
            return this;
        }

        @Override // p000.z33.AbstractC15960a.b
        public z33.AbstractC15960a.b setProcessName(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f71053b = str;
            return this;
        }

        @Override // p000.z33.AbstractC15960a.b
        public z33.AbstractC15960a.b setPss(long j) {
            this.f71056e = j;
            this.f71061j = (byte) (this.f71061j | 8);
            return this;
        }

        @Override // p000.z33.AbstractC15960a.b
        public z33.AbstractC15960a.b setReasonCode(int i) {
            this.f71054c = i;
            this.f71061j = (byte) (this.f71061j | 2);
            return this;
        }

        @Override // p000.z33.AbstractC15960a.b
        public z33.AbstractC15960a.b setRss(long j) {
            this.f71057f = j;
            this.f71061j = (byte) (this.f71061j | 16);
            return this;
        }

        @Override // p000.z33.AbstractC15960a.b
        public z33.AbstractC15960a.b setTimestamp(long j) {
            this.f71058g = j;
            this.f71061j = (byte) (this.f71061j | 32);
            return this;
        }

        @Override // p000.z33.AbstractC15960a.b
        public z33.AbstractC15960a.b setTraceFile(@hib String str) {
            this.f71059h = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15960a)) {
            return false;
        }
        z33.AbstractC15960a abstractC15960a = (z33.AbstractC15960a) obj;
        if (this.f71043a == abstractC15960a.getPid() && this.f71044b.equals(abstractC15960a.getProcessName()) && this.f71045c == abstractC15960a.getReasonCode() && this.f71046d == abstractC15960a.getImportance() && this.f71047e == abstractC15960a.getPss() && this.f71048f == abstractC15960a.getRss() && this.f71049g == abstractC15960a.getTimestamp() && ((str = this.f71050h) != null ? str.equals(abstractC15960a.getTraceFile()) : abstractC15960a.getTraceFile() == null)) {
            List<z33.AbstractC15960a.a> list = this.f71051i;
            if (list == null) {
                if (abstractC15960a.getBuildIdMappingForArch() == null) {
                    return true;
                }
            } else if (list.equals(abstractC15960a.getBuildIdMappingForArch())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.z33.AbstractC15960a
    @hib
    public List<z33.AbstractC15960a.a> getBuildIdMappingForArch() {
        return this.f71051i;
    }

    @Override // p000.z33.AbstractC15960a
    @efb
    public int getImportance() {
        return this.f71046d;
    }

    @Override // p000.z33.AbstractC15960a
    @efb
    public int getPid() {
        return this.f71043a;
    }

    @Override // p000.z33.AbstractC15960a
    @efb
    public String getProcessName() {
        return this.f71044b;
    }

    @Override // p000.z33.AbstractC15960a
    @efb
    public long getPss() {
        return this.f71047e;
    }

    @Override // p000.z33.AbstractC15960a
    @efb
    public int getReasonCode() {
        return this.f71045c;
    }

    @Override // p000.z33.AbstractC15960a
    @efb
    public long getRss() {
        return this.f71048f;
    }

    @Override // p000.z33.AbstractC15960a
    @efb
    public long getTimestamp() {
        return this.f71049g;
    }

    @Override // p000.z33.AbstractC15960a
    @hib
    public String getTraceFile() {
        return this.f71050h;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f71043a ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f71044b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f71045c) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f71046d) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f71047e;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f71048f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j3 = this.f71049g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str = this.f71050h;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        List<z33.AbstractC15960a.a> list = this.f71051i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f71043a + ", processName=" + this.f71044b + ", reasonCode=" + this.f71045c + ", importance=" + this.f71046d + ", pss=" + this.f71047e + ", rss=" + this.f71048f + ", timestamp=" + this.f71049g + ", traceFile=" + this.f71050h + ", buildIdMappingForArch=" + this.f71051i + "}";
    }

    private pj0(int i, String str, int i2, int i3, long j, long j2, long j3, @hib String str2, @hib List<z33.AbstractC15960a.a> list) {
        this.f71043a = i;
        this.f71044b = str;
        this.f71045c = i2;
        this.f71046d = i3;
        this.f71047e = j;
        this.f71048f = j2;
        this.f71049g = j3;
        this.f71050h = str2;
        this.f71051i = list;
    }
}
