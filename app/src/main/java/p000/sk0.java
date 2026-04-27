package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.u65;

/* JADX INFO: loaded from: classes4.dex */
public final class sk0 extends u65 {

    /* JADX INFO: renamed from: g */
    public final long f82082g;

    /* JADX INFO: renamed from: h */
    public final int f82083h;

    /* JADX INFO: renamed from: i */
    public final int f82084i;

    /* JADX INFO: renamed from: j */
    public final long f82085j;

    /* JADX INFO: renamed from: k */
    public final int f82086k;

    /* JADX INFO: renamed from: sk0$b */
    public static final class C12634b extends u65.AbstractC13375a {

        /* JADX INFO: renamed from: a */
        public Long f82087a;

        /* JADX INFO: renamed from: b */
        public Integer f82088b;

        /* JADX INFO: renamed from: c */
        public Integer f82089c;

        /* JADX INFO: renamed from: d */
        public Long f82090d;

        /* JADX INFO: renamed from: e */
        public Integer f82091e;

        @Override // p000.u65.AbstractC13375a
        /* JADX INFO: renamed from: a */
        public u65 mo22067a() {
            String str = "";
            if (this.f82087a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f82088b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f82089c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f82090d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f82091e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new sk0(this.f82087a.longValue(), this.f82088b.intValue(), this.f82089c.intValue(), this.f82090d.longValue(), this.f82091e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.u65.AbstractC13375a
        /* JADX INFO: renamed from: b */
        public u65.AbstractC13375a mo22068b(int i) {
            this.f82089c = Integer.valueOf(i);
            return this;
        }

        @Override // p000.u65.AbstractC13375a
        /* JADX INFO: renamed from: c */
        public u65.AbstractC13375a mo22069c(long j) {
            this.f82090d = Long.valueOf(j);
            return this;
        }

        @Override // p000.u65.AbstractC13375a
        /* JADX INFO: renamed from: d */
        public u65.AbstractC13375a mo22070d(int i) {
            this.f82088b = Integer.valueOf(i);
            return this;
        }

        @Override // p000.u65.AbstractC13375a
        /* JADX INFO: renamed from: e */
        public u65.AbstractC13375a mo22071e(int i) {
            this.f82091e = Integer.valueOf(i);
            return this;
        }

        @Override // p000.u65.AbstractC13375a
        /* JADX INFO: renamed from: f */
        public u65.AbstractC13375a mo22072f(long j) {
            this.f82087a = Long.valueOf(j);
            return this;
        }
    }

    @Override // p000.u65
    /* JADX INFO: renamed from: b */
    public int mo22062b() {
        return this.f82084i;
    }

    @Override // p000.u65
    /* JADX INFO: renamed from: c */
    public long mo22063c() {
        return this.f82085j;
    }

    @Override // p000.u65
    /* JADX INFO: renamed from: d */
    public int mo22064d() {
        return this.f82083h;
    }

    @Override // p000.u65
    /* JADX INFO: renamed from: e */
    public int mo22065e() {
        return this.f82086k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u65)) {
            return false;
        }
        u65 u65Var = (u65) obj;
        return this.f82082g == u65Var.mo22066f() && this.f82083h == u65Var.mo22064d() && this.f82084i == u65Var.mo22062b() && this.f82085j == u65Var.mo22063c() && this.f82086k == u65Var.mo22065e();
    }

    @Override // p000.u65
    /* JADX INFO: renamed from: f */
    public long mo22066f() {
        return this.f82082g;
    }

    public int hashCode() {
        long j = this.f82082g;
        int i = (((((((int) (j ^ (j >>> 32))) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f82083h) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f82084i) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f82085j;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f82086k;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f82082g + ", loadBatchSize=" + this.f82083h + ", criticalSectionEnterTimeoutMs=" + this.f82084i + ", eventCleanUpAge=" + this.f82085j + ", maxBlobByteSizePerRow=" + this.f82086k + "}";
    }

    private sk0(long j, int i, int i2, long j2, int i3) {
        this.f82082g = j;
        this.f82083h = i;
        this.f82084i = i2;
        this.f82085j = j2;
        this.f82086k = i3;
    }
}
