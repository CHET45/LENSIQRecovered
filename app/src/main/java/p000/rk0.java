package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.Arrays;
import java.util.Map;
import p000.a65;

/* JADX INFO: loaded from: classes4.dex */
public final class rk0 extends a65 {

    /* JADX INFO: renamed from: a */
    public final String f78514a;

    /* JADX INFO: renamed from: b */
    public final Integer f78515b;

    /* JADX INFO: renamed from: c */
    public final k15 f78516c;

    /* JADX INFO: renamed from: d */
    public final long f78517d;

    /* JADX INFO: renamed from: e */
    public final long f78518e;

    /* JADX INFO: renamed from: f */
    public final Map<String, String> f78519f;

    /* JADX INFO: renamed from: g */
    public final Integer f78520g;

    /* JADX INFO: renamed from: h */
    public final String f78521h;

    /* JADX INFO: renamed from: i */
    public final byte[] f78522i;

    /* JADX INFO: renamed from: j */
    public final byte[] f78523j;

    /* JADX INFO: renamed from: rk0$b */
    public static final class C12126b extends a65.AbstractC0073a {

        /* JADX INFO: renamed from: a */
        public String f78524a;

        /* JADX INFO: renamed from: b */
        public Integer f78525b;

        /* JADX INFO: renamed from: c */
        public k15 f78526c;

        /* JADX INFO: renamed from: d */
        public Long f78527d;

        /* JADX INFO: renamed from: e */
        public Long f78528e;

        /* JADX INFO: renamed from: f */
        public Map<String, String> f78529f;

        /* JADX INFO: renamed from: g */
        public Integer f78530g;

        /* JADX INFO: renamed from: h */
        public String f78531h;

        /* JADX INFO: renamed from: i */
        public byte[] f78532i;

        /* JADX INFO: renamed from: j */
        public byte[] f78533j;

        @Override // p000.a65.AbstractC0073a
        /* JADX INFO: renamed from: a */
        public Map<String, String> mo164a() {
            Map<String, String> map = this.f78529f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // p000.a65.AbstractC0073a
        /* JADX INFO: renamed from: b */
        public a65.AbstractC0073a mo165b(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f78529f = map;
            return this;
        }

        @Override // p000.a65.AbstractC0073a
        public a65 build() {
            String str = "";
            if (this.f78524a == null) {
                str = " transportName";
            }
            if (this.f78526c == null) {
                str = str + " encodedPayload";
            }
            if (this.f78527d == null) {
                str = str + " eventMillis";
            }
            if (this.f78528e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f78529f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new rk0(this.f78524a, this.f78525b, this.f78526c, this.f78527d.longValue(), this.f78528e.longValue(), this.f78529f, this.f78530g, this.f78531h, this.f78532i, this.f78533j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.a65.AbstractC0073a
        public a65.AbstractC0073a setCode(Integer num) {
            this.f78525b = num;
            return this;
        }

        @Override // p000.a65.AbstractC0073a
        public a65.AbstractC0073a setEncodedPayload(k15 k15Var) {
            if (k15Var == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f78526c = k15Var;
            return this;
        }

        @Override // p000.a65.AbstractC0073a
        public a65.AbstractC0073a setEventMillis(long j) {
            this.f78527d = Long.valueOf(j);
            return this;
        }

        @Override // p000.a65.AbstractC0073a
        public a65.AbstractC0073a setExperimentIdsClear(byte[] bArr) {
            this.f78532i = bArr;
            return this;
        }

        @Override // p000.a65.AbstractC0073a
        public a65.AbstractC0073a setExperimentIdsEncrypted(byte[] bArr) {
            this.f78533j = bArr;
            return this;
        }

        @Override // p000.a65.AbstractC0073a
        public a65.AbstractC0073a setProductId(Integer num) {
            this.f78530g = num;
            return this;
        }

        @Override // p000.a65.AbstractC0073a
        public a65.AbstractC0073a setPseudonymousId(String str) {
            this.f78531h = str;
            return this;
        }

        @Override // p000.a65.AbstractC0073a
        public a65.AbstractC0073a setTransportName(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f78524a = str;
            return this;
        }

        @Override // p000.a65.AbstractC0073a
        public a65.AbstractC0073a setUptimeMillis(long j) {
            this.f78528e = Long.valueOf(j);
            return this;
        }
    }

    @Override // p000.a65
    /* JADX INFO: renamed from: a */
    public Map<String, String> mo163a() {
        return this.f78519f;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a65)) {
            return false;
        }
        a65 a65Var = (a65) obj;
        if (this.f78514a.equals(a65Var.getTransportName()) && ((num = this.f78515b) != null ? num.equals(a65Var.getCode()) : a65Var.getCode() == null) && this.f78516c.equals(a65Var.getEncodedPayload()) && this.f78517d == a65Var.getEventMillis() && this.f78518e == a65Var.getUptimeMillis() && this.f78519f.equals(a65Var.mo163a()) && ((num2 = this.f78520g) != null ? num2.equals(a65Var.getProductId()) : a65Var.getProductId() == null) && ((str = this.f78521h) != null ? str.equals(a65Var.getPseudonymousId()) : a65Var.getPseudonymousId() == null)) {
            boolean z = a65Var instanceof rk0;
            if (Arrays.equals(this.f78522i, z ? ((rk0) a65Var).f78522i : a65Var.getExperimentIdsClear())) {
                if (Arrays.equals(this.f78523j, z ? ((rk0) a65Var).f78523j : a65Var.getExperimentIdsEncrypted())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.a65
    @hib
    public Integer getCode() {
        return this.f78515b;
    }

    @Override // p000.a65
    public k15 getEncodedPayload() {
        return this.f78516c;
    }

    @Override // p000.a65
    public long getEventMillis() {
        return this.f78517d;
    }

    @Override // p000.a65
    @hib
    public byte[] getExperimentIdsClear() {
        return this.f78522i;
    }

    @Override // p000.a65
    @hib
    public byte[] getExperimentIdsEncrypted() {
        return this.f78523j;
    }

    @Override // p000.a65
    @hib
    public Integer getProductId() {
        return this.f78520g;
    }

    @Override // p000.a65
    @hib
    public String getPseudonymousId() {
        return this.f78521h;
    }

    @Override // p000.a65
    public String getTransportName() {
        return this.f78514a;
    }

    @Override // p000.a65
    public long getUptimeMillis() {
        return this.f78518e;
    }

    public int hashCode() {
        int iHashCode = (this.f78514a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        Integer num = this.f78515b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f78516c.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f78517d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f78518e;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f78519f.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        Integer num2 = this.f78520g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str = this.f78521h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ Arrays.hashCode(this.f78522i)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ Arrays.hashCode(this.f78523j);
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f78514a + ", code=" + this.f78515b + ", encodedPayload=" + this.f78516c + ", eventMillis=" + this.f78517d + ", uptimeMillis=" + this.f78518e + ", autoMetadata=" + this.f78519f + ", productId=" + this.f78520g + ", pseudonymousId=" + this.f78521h + ", experimentIdsClear=" + Arrays.toString(this.f78522i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f78523j) + "}";
    }

    private rk0(String str, @hib Integer num, k15 k15Var, long j, long j2, Map<String, String> map, @hib Integer num2, @hib String str2, @hib byte[] bArr, @hib byte[] bArr2) {
        this.f78514a = str;
        this.f78515b = num;
        this.f78516c = k15Var;
        this.f78517d = j;
        this.f78518e = j2;
        this.f78519f = map;
        this.f78520g = num2;
        this.f78521h = str2;
        this.f78522i = bArr;
        this.f78523j = bArr2;
    }
}
