package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.List;
import p000.c15;
import p000.ni9;

/* JADX INFO: loaded from: classes4.dex */
public final class hl0 extends ni9 {

    /* JADX INFO: renamed from: a */
    public final long f44030a;

    /* JADX INFO: renamed from: b */
    public final long f44031b;

    /* JADX INFO: renamed from: c */
    public final c42 f44032c;

    /* JADX INFO: renamed from: d */
    public final Integer f44033d;

    /* JADX INFO: renamed from: e */
    public final String f44034e;

    /* JADX INFO: renamed from: f */
    public final List<di9> f44035f;

    /* JADX INFO: renamed from: g */
    public final lkd f44036g;

    /* JADX INFO: renamed from: hl0$b */
    public static final class C6888b extends ni9.AbstractC9892a {

        /* JADX INFO: renamed from: a */
        public Long f44037a;

        /* JADX INFO: renamed from: b */
        public Long f44038b;

        /* JADX INFO: renamed from: c */
        public c42 f44039c;

        /* JADX INFO: renamed from: d */
        public Integer f44040d;

        /* JADX INFO: renamed from: e */
        public String f44041e;

        /* JADX INFO: renamed from: f */
        public List<di9> f44042f;

        /* JADX INFO: renamed from: g */
        public lkd f44043g;

        @Override // p000.ni9.AbstractC9892a
        /* JADX INFO: renamed from: a */
        public ni9.AbstractC9892a mo12452a(@hib Integer num) {
            this.f44040d = num;
            return this;
        }

        @Override // p000.ni9.AbstractC9892a
        /* JADX INFO: renamed from: b */
        public ni9.AbstractC9892a mo12453b(@hib String str) {
            this.f44041e = str;
            return this;
        }

        @Override // p000.ni9.AbstractC9892a
        public ni9 build() {
            String str = "";
            if (this.f44037a == null) {
                str = " requestTimeMs";
            }
            if (this.f44038b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new hl0(this.f44037a.longValue(), this.f44038b.longValue(), this.f44039c, this.f44040d, this.f44041e, this.f44042f, this.f44043g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.ni9.AbstractC9892a
        public ni9.AbstractC9892a setClientInfo(@hib c42 c42Var) {
            this.f44039c = c42Var;
            return this;
        }

        @Override // p000.ni9.AbstractC9892a
        public ni9.AbstractC9892a setLogEvents(@hib List<di9> list) {
            this.f44042f = list;
            return this;
        }

        @Override // p000.ni9.AbstractC9892a
        public ni9.AbstractC9892a setQosTier(@hib lkd lkdVar) {
            this.f44043g = lkdVar;
            return this;
        }

        @Override // p000.ni9.AbstractC9892a
        public ni9.AbstractC9892a setRequestTimeMs(long j) {
            this.f44037a = Long.valueOf(j);
            return this;
        }

        @Override // p000.ni9.AbstractC9892a
        public ni9.AbstractC9892a setRequestUptimeMs(long j) {
            this.f44038b = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        c42 c42Var;
        Integer num;
        String str;
        List<di9> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ni9)) {
            return false;
        }
        ni9 ni9Var = (ni9) obj;
        if (this.f44030a == ni9Var.getRequestTimeMs() && this.f44031b == ni9Var.getRequestUptimeMs() && ((c42Var = this.f44032c) != null ? c42Var.equals(ni9Var.getClientInfo()) : ni9Var.getClientInfo() == null) && ((num = this.f44033d) != null ? num.equals(ni9Var.getLogSource()) : ni9Var.getLogSource() == null) && ((str = this.f44034e) != null ? str.equals(ni9Var.getLogSourceName()) : ni9Var.getLogSourceName() == null) && ((list = this.f44035f) != null ? list.equals(ni9Var.getLogEvents()) : ni9Var.getLogEvents() == null)) {
            lkd lkdVar = this.f44036g;
            if (lkdVar == null) {
                if (ni9Var.getQosTier() == null) {
                    return true;
                }
            } else if (lkdVar.equals(ni9Var.getQosTier())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.ni9
    @hib
    public c42 getClientInfo() {
        return this.f44032c;
    }

    @Override // p000.ni9
    @hib
    @c15.InterfaceC2147a(name = "logEvent")
    public List<di9> getLogEvents() {
        return this.f44035f;
    }

    @Override // p000.ni9
    @hib
    public Integer getLogSource() {
        return this.f44033d;
    }

    @Override // p000.ni9
    @hib
    public String getLogSourceName() {
        return this.f44034e;
    }

    @Override // p000.ni9
    @hib
    public lkd getQosTier() {
        return this.f44036g;
    }

    @Override // p000.ni9
    public long getRequestTimeMs() {
        return this.f44030a;
    }

    @Override // p000.ni9
    public long getRequestUptimeMs() {
        return this.f44031b;
    }

    public int hashCode() {
        long j = this.f44030a;
        int i = (((int) (j ^ (j >>> 32))) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f44031b;
        int i2 = (i ^ ((int) ((j2 >>> 32) ^ j2))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        c42 c42Var = this.f44032c;
        int iHashCode = (i2 ^ (c42Var == null ? 0 : c42Var.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        Integer num = this.f44033d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str = this.f44034e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        List<di9> list = this.f44035f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        lkd lkdVar = this.f44036g;
        return iHashCode4 ^ (lkdVar != null ? lkdVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f44030a + ", requestUptimeMs=" + this.f44031b + ", clientInfo=" + this.f44032c + ", logSource=" + this.f44033d + ", logSourceName=" + this.f44034e + ", logEvents=" + this.f44035f + ", qosTier=" + this.f44036g + "}";
    }

    private hl0(long j, long j2, @hib c42 c42Var, @hib Integer num, @hib String str, @hib List<di9> list, @hib lkd lkdVar) {
        this.f44030a = j;
        this.f44031b = j2;
        this.f44032c = c42Var;
        this.f44033d = num;
        this.f44034e = str;
        this.f44035f = list;
        this.f44036g = lkdVar;
    }
}
