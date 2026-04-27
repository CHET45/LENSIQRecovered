package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class hk0 extends z33.AbstractC15965f.d.c {

    /* JADX INFO: renamed from: a */
    public final Double f43871a;

    /* JADX INFO: renamed from: b */
    public final int f43872b;

    /* JADX INFO: renamed from: c */
    public final boolean f43873c;

    /* JADX INFO: renamed from: d */
    public final int f43874d;

    /* JADX INFO: renamed from: e */
    public final long f43875e;

    /* JADX INFO: renamed from: f */
    public final long f43876f;

    /* JADX INFO: renamed from: hk0$b */
    public static final class C6877b extends z33.AbstractC15965f.d.c.a {

        /* JADX INFO: renamed from: a */
        public Double f43877a;

        /* JADX INFO: renamed from: b */
        public int f43878b;

        /* JADX INFO: renamed from: c */
        public boolean f43879c;

        /* JADX INFO: renamed from: d */
        public int f43880d;

        /* JADX INFO: renamed from: e */
        public long f43881e;

        /* JADX INFO: renamed from: f */
        public long f43882f;

        /* JADX INFO: renamed from: g */
        public byte f43883g;

        @Override // p000.z33.AbstractC15965f.d.c.a
        public z33.AbstractC15965f.d.c build() {
            if (this.f43883g == 31) {
                return new hk0(this.f43877a, this.f43878b, this.f43879c, this.f43880d, this.f43881e, this.f43882f);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f43883g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f43883g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f43883g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f43883g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f43883g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.d.c.a
        public z33.AbstractC15965f.d.c.a setBatteryLevel(Double d) {
            this.f43877a = d;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.c.a
        public z33.AbstractC15965f.d.c.a setBatteryVelocity(int i) {
            this.f43878b = i;
            this.f43883g = (byte) (this.f43883g | 1);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.c.a
        public z33.AbstractC15965f.d.c.a setDiskUsed(long j) {
            this.f43882f = j;
            this.f43883g = (byte) (this.f43883g | 16);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.c.a
        public z33.AbstractC15965f.d.c.a setOrientation(int i) {
            this.f43880d = i;
            this.f43883g = (byte) (this.f43883g | 4);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.c.a
        public z33.AbstractC15965f.d.c.a setProximityOn(boolean z) {
            this.f43879c = z;
            this.f43883g = (byte) (this.f43883g | 2);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.c.a
        public z33.AbstractC15965f.d.c.a setRamUsed(long j) {
            this.f43881e = j;
            this.f43883g = (byte) (this.f43883g | 8);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.d.c)) {
            return false;
        }
        z33.AbstractC15965f.d.c cVar = (z33.AbstractC15965f.d.c) obj;
        Double d = this.f43871a;
        if (d != null ? d.equals(cVar.getBatteryLevel()) : cVar.getBatteryLevel() == null) {
            if (this.f43872b == cVar.getBatteryVelocity() && this.f43873c == cVar.isProximityOn() && this.f43874d == cVar.getOrientation() && this.f43875e == cVar.getRamUsed() && this.f43876f == cVar.getDiskUsed()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.z33.AbstractC15965f.d.c
    @hib
    public Double getBatteryLevel() {
        return this.f43871a;
    }

    @Override // p000.z33.AbstractC15965f.d.c
    public int getBatteryVelocity() {
        return this.f43872b;
    }

    @Override // p000.z33.AbstractC15965f.d.c
    public long getDiskUsed() {
        return this.f43876f;
    }

    @Override // p000.z33.AbstractC15965f.d.c
    public int getOrientation() {
        return this.f43874d;
    }

    @Override // p000.z33.AbstractC15965f.d.c
    public long getRamUsed() {
        return this.f43875e;
    }

    public int hashCode() {
        Double d = this.f43871a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f43872b) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ (this.f43873c ? 1231 : 1237)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f43874d) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f43875e;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f43876f;
        return i ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // p000.z33.AbstractC15965f.d.c
    public boolean isProximityOn() {
        return this.f43873c;
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f43871a + ", batteryVelocity=" + this.f43872b + ", proximityOn=" + this.f43873c + ", orientation=" + this.f43874d + ", ramUsed=" + this.f43875e + ", diskUsed=" + this.f43876f + "}";
    }

    private hk0(@hib Double d, int i, boolean z, int i2, long j, long j2) {
        this.f43871a = d;
        this.f43872b = i;
        this.f43873c = z;
        this.f43874d = i2;
        this.f43875e = j;
        this.f43876f = j2;
    }
}
